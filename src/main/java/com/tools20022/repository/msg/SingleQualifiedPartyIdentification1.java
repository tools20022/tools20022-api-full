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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeParty1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines an identifier for a party relative to another party using an
 * identifier of another party followed by a local identifier issued by the
 * other party.<br>
 * It is assumed that customers of an identifiable party can be referenced by an
 * identifier relative to that party. The identification of the party together
 * with the relative identifier identifies the customer.<br>
 * Such references can occur in sequence. The last occurrence of
 * RelativeIdentifier is the local identifier at the party recursively defined
 * by the PrefixParty and all preceding occurrences of RelativeIdentifier.<br>
 * Technical note: The sequence of relative identifiers is used to avoid a
 * recursive definition in the catalogue.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1#mmBaseParty
 * SingleQualifiedPartyIdentification1.mmBaseParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1#mmRelativeIdentifier
 * SingleQualifiedPartyIdentification1.mmRelativeIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SingleQualifiedPartyIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines an identifier for a party relative to another party using an identifier of another party followed by a local identifier issued by the other party.\r\nIt is assumed that customers of an identifiable party can be referenced by an identifier relative to that party. The identification of the party together with the relative identifier identifies the customer.\r\nSuch references can occur in sequence. The last occurrence of RelativeIdentifier is the local identifier at the party recursively defined by the PrefixParty and all preceding occurrences of RelativeIdentifier.\r\nTechnical note: The sequence of relative identifiers is used to avoid a recursive definition in the catalogue."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleQualifiedPartyIdentification1", propOrder = {"baseParty", "relativeIdentifier"})
public class SingleQualifiedPartyIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BasePty", required = true)
	protected TradeParty1 baseParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
	 * SingleQualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BasePty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identification recognisable by parties in the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleQualifiedPartyIdentification1, TradeParty1> mmBaseParty = new MMMessageAssociationEnd<SingleQualifiedPartyIdentification1, TradeParty1>() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "BasePty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseParty";
			definition = "Party identification recognisable by parties in the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public TradeParty1 getValue(SingleQualifiedPartyIdentification1 obj) {
			return obj.getBaseParty();
		}

		@Override
		public void setValue(SingleQualifiedPartyIdentification1 obj, TradeParty1 value) {
			obj.setBaseParty(value);
		}
	};
	@XmlElement(name = "RltvIdr")
	protected List<Max35Text> relativeIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
	 * SingleQualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltvIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelativeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a party, each identifier is recursively defined relative to the party identified by the base party and the preceding part of the list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SingleQualifiedPartyIdentification1, List<Max35Text>> mmRelativeIdentifier = new MMMessageAttribute<SingleQualifiedPartyIdentification1, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "RltvIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelativeIdentifier";
			definition = "Identifies a party, each identifier is recursively defined relative to the party identified by the base party and the preceding part of the list.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(SingleQualifiedPartyIdentification1 obj) {
			return obj.getRelativeIdentifier();
		}

		@Override
		public void setValue(SingleQualifiedPartyIdentification1 obj, List<Max35Text> value) {
			obj.setRelativeIdentifier(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.mmBaseParty, com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.mmRelativeIdentifier);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SingleQualifiedPartyIdentification1";
				definition = "Defines an identifier for a party relative to another party using an identifier of another party followed by a local identifier issued by the other party.\r\nIt is assumed that customers of an identifiable party can be referenced by an identifier relative to that party. The identification of the party together with the relative identifier identifies the customer.\r\nSuch references can occur in sequence. The last occurrence of RelativeIdentifier is the local identifier at the party recursively defined by the PrefixParty and all preceding occurrences of RelativeIdentifier.\r\nTechnical note: The sequence of relative identifiers is used to avoid a recursive definition in the catalogue.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeParty1 getBaseParty() {
		return baseParty;
	}

	public SingleQualifiedPartyIdentification1 setBaseParty(TradeParty1 baseParty) {
		this.baseParty = Objects.requireNonNull(baseParty);
		return this;
	}

	public List<Max35Text> getRelativeIdentifier() {
		return relativeIdentifier == null ? relativeIdentifier = new ArrayList<>() : relativeIdentifier;
	}

	public SingleQualifiedPartyIdentification1 setRelativeIdentifier(List<Max35Text> relativeIdentifier) {
		this.relativeIdentifier = Objects.requireNonNull(relativeIdentifier);
		return this;
	}
}