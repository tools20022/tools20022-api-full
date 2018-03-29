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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.IdentificationType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of an entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification78#mmPartySource
 * PartyIdentification78.mmPartySource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification78#mmTradePartyIdentification
 * PartyIdentification78.mmTradePartyIdentification}</li>
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
 * "PartyIdentification78"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of an entity involved in an activity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification78", propOrder = {"partySource", "tradePartyIdentification"})
public class PartyIdentification78 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtySrc")
	protected IdentificationType1Code partySource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType1Code
	 * IdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification78
	 * PartyIdentification78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtySrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartySource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicate the source of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification78, Optional<IdentificationType1Code>> mmPartySource = new MMMessageAttribute<PartyIdentification78, Optional<IdentificationType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification78.mmObject();
			isDerived = false;
			xmlTag = "PtySrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartySource";
			definition = "Indicate the source of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IdentificationType1Code.mmObject();
		}

		@Override
		public Optional<IdentificationType1Code> getValue(PartyIdentification78 obj) {
			return obj.getPartySource();
		}

		@Override
		public void setValue(PartyIdentification78 obj, Optional<IdentificationType1Code> value) {
			obj.setPartySource(value.orElse(null));
		}
	};
	@XmlElement(name = "TradPtyId", required = true)
	protected Max35Text tradePartyIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification78
	 * PartyIdentification78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification78, Max35Text> mmTradePartyIdentification = new MMMessageAttribute<PartyIdentification78, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification78.mmObject();
			isDerived = false;
			xmlTag = "TradPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePartyIdentification";
			definition = "Identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PartyIdentification78 obj) {
			return obj.getTradePartyIdentification();
		}

		@Override
		public void setValue(PartyIdentification78 obj, Max35Text value) {
			obj.setTradePartyIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification78.mmPartySource, com.tools20022.repository.msg.PartyIdentification78.mmTradePartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification78";
				definition = "Identification of an entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IdentificationType1Code> getPartySource() {
		return partySource == null ? Optional.empty() : Optional.of(partySource);
	}

	public PartyIdentification78 setPartySource(IdentificationType1Code partySource) {
		this.partySource = partySource;
		return this;
	}

	public Max35Text getTradePartyIdentification() {
		return tradePartyIdentification;
	}

	public PartyIdentification78 setTradePartyIdentification(Max35Text tradePartyIdentification) {
		this.tradePartyIdentification = Objects.requireNonNull(tradePartyIdentification);
		return this;
	}
}