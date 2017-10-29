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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1#BaseParty
 * SingleQualifiedPartyIdentification1.BaseParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1#RelativeIdentifier
 * SingleQualifiedPartyIdentification1.RelativeIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "SingleQualifiedPartyIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines an identifier for a party relative to another party using an identifier of another party followed by a local identifier issued by the other party.\r\nIt is assumed that customers of an identifiable party can be referenced by an identifier relative to that party. The identification of the party together with the relative identifier identifies the customer.\r\nSuch references can occur in sequence. The last occurrence of RelativeIdentifier is the local identifier at the party recursively defined by the PrefixParty and all preceding occurrences of RelativeIdentifier.\r\nTechnical note: The sequence of relative identifiers is used to avoid a recursive definition in the catalogue."
 * </li>
 * </ul>
 */
public class SingleQualifiedPartyIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party identification recognisable by parties in the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#Role
	 * RolePlayer.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
	 * SingleQualifiedPartyIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BasePty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identification recognisable by parties in the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BaseParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SingleQualifiedPartyIdentification1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RolePlayer.Role;
			isDerived = false;
			xmlTag = "BasePty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseParty";
			definition = "Party identification recognisable by parties in the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradeParty1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies a party, each identifier is recursively defined relative to
	 * the party identified by the base party and the preceding part of the
	 * list.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelativeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a party, each identifier is recursively defined relative to the party identified by the base party and the preceding part of the list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RelativeIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SingleQualifiedPartyIdentification1.mmObject();
			isDerived = false;
			xmlTag = "RltvIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelativeIdentifier";
			definition = "Identifies a party, each identifier is recursively defined relative to the party identified by the base party and the preceding part of the list.";
			minOccurs = 0;
			maxOccurs = 5;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.BaseParty, com.tools20022.repository.msg.SingleQualifiedPartyIdentification1.RelativeIdentifier);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SingleQualifiedPartyIdentification1";
				definition = "Defines an identifier for a party relative to another party using an identifier of another party followed by a local identifier issued by the other party.\r\nIt is assumed that customers of an identifiable party can be referenced by an identifier relative to that party. The identification of the party together with the relative identifier identifies the customer.\r\nSuch references can occur in sequence. The last occurrence of RelativeIdentifier is the local identifier at the party recursively defined by the PrefixParty and all preceding occurrences of RelativeIdentifier.\r\nTechnical note: The sequence of relative identifiers is used to avoid a recursive definition in the catalogue.";
			}
		});
		return mmObject_lazy.get();
	}
}