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
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.Meeting;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contact person at the party organising the meeting, at the issuer or at an
 * intermediary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#ContactPerson
 * MeetingContactPerson2.ContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#EmployingParty
 * MeetingContactPerson2.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#PlaceOfListing
 * MeetingContactPerson2.PlaceOfListing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
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
 * "MeetingContactPerson2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contact person at the party organising the meeting, at the issuer or at an intermediary."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1
 * MeetingContactPerson1}</li>
 * </ul>
 */
public class MeetingContactPerson2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the contact person by its name, given name and address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#ContactPersonRole
	 * Role.ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2
	 * MeetingContactPerson2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the contact person by its name, given name and address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#ContactPerson
	 * MeetingContactPerson1.ContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContactPerson = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingContactPerson2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Role.ContactPersonRole;
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Identifies the contact person by its name, given name and address.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson1.ContactPerson;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ContactIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identifies the organisation which is represented by the person or for
	 * which the person works.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2
	 * MeetingContactPerson2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmplngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the organisation which is represented by the person or for which the person works."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#EmployingParty
	 * MeetingContactPerson1.EmployingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EmployingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingContactPerson2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "EmplngPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingParty";
			definition = "Identifies the organisation which is represented by the person or for which the person works.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson1.EmployingParty;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the financial market, as stipulated in the norm ISO
	 * 10383 'Codes for exchanges and market identifications'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#MIC
	 * OrganisationIdentification.MIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2
	 * MeetingContactPerson2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the financial market, as stipulated in the norm ISO 10383 'Codes for exchanges and market identifications'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#PlaceOfListing
	 * MeetingContactPerson1.PlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceOfListing = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MeetingContactPerson2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.MIC;
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Identification of the financial market, as stipulated in the norm ISO 10383 'Codes for exchanges and market identifications'.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson1.PlaceOfListing;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingContactPerson2.ContactPerson, com.tools20022.repository.msg.MeetingContactPerson2.EmployingParty,
						com.tools20022.repository.msg.MeetingContactPerson2.PlaceOfListing);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingContactPerson2";
				definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
				previousVersion_lazy = () -> MeetingContactPerson1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}