/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between netting group identification of an individual trading party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice#mmTradeParty
 * NettingIdentification1Choice.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice#mmNettingGroupIdentification
 * NettingIdentification1Choice.mmNettingGroupIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NettingIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between netting group identification of an individual trading party."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NettingIdentification1Choice", propOrder = {"tradeParty", "nettingGroupIdentification"})
public class NettingIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradPty", required = true)
	protected PartyIdentification73Choice tradeParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice
	 * NettingIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the individual trading party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NettingIdentification1Choice, PartyIdentification73Choice> mmTradeParty = new MMMessageAssociationEnd<NettingIdentification1Choice, PartyIdentification73Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NettingIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "TradPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeParty";
			definition = "Describes the individual trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public PartyIdentification73Choice getValue(NettingIdentification1Choice obj) {
			return obj.getTradeParty();
		}

		@Override
		public void setValue(NettingIdentification1Choice obj, PartyIdentification73Choice value) {
			obj.setTradeParty(value);
		}
	};
	@XmlElement(name = "NetgGrpId", required = true)
	protected Max35Text nettingGroupIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice
	 * NettingIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgGrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingGroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the netting group."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingIdentification1Choice, Max35Text> mmNettingGroupIdentification = new MMMessageAttribute<NettingIdentification1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NettingIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "NetgGrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingGroupIdentification";
			definition = "Describes the netting group.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(NettingIdentification1Choice obj) {
			return obj.getNettingGroupIdentification();
		}

		@Override
		public void setValue(NettingIdentification1Choice obj, Max35Text value) {
			obj.setNettingGroupIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NettingIdentification1Choice.mmTradeParty, com.tools20022.repository.choice.NettingIdentification1Choice.mmNettingGroupIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingIdentification1Choice";
				definition = "Choice between netting group identification of an individual trading party.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification73Choice getTradeParty() {
		return tradeParty;
	}

	public NettingIdentification1Choice setTradeParty(PartyIdentification73Choice tradeParty) {
		this.tradeParty = Objects.requireNonNull(tradeParty);
		return this;
	}

	public Max35Text getNettingGroupIdentification() {
		return nettingGroupIdentification;
	}

	public NettingIdentification1Choice setNettingGroupIdentification(Max35Text nettingGroupIdentification) {
		this.nettingGroupIdentification = Objects.requireNonNull(nettingGroupIdentification);
		return this;
	}
}