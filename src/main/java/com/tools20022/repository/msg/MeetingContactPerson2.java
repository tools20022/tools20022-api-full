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
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmContactPerson
 * MeetingContactPerson2.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmEmployingParty
 * MeetingContactPerson2.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmPlaceOfListing
 * MeetingContactPerson2.mmPlaceOfListing}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingContactPerson2", propOrder = {"contactPerson", "employingParty", "placeOfListing"})
public class MeetingContactPerson2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification1 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#mmContactPerson
	 * MeetingContactPerson1.mmContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingContactPerson2, Optional<ContactIdentification1>> mmContactPerson = new MMMessageAssociationEnd<MeetingContactPerson2, Optional<ContactIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson2.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Identifies the contact person by its name, given name and address.";
			previousVersion_lazy = () -> MeetingContactPerson1.mmContactPerson;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public Optional<ContactIdentification1> getValue(MeetingContactPerson2 obj) {
			return obj.getContactPerson();
		}

		@Override
		public void setValue(MeetingContactPerson2 obj, Optional<ContactIdentification1> value) {
			obj.setContactPerson(value.orElse(null));
		}
	};
	@XmlElement(name = "EmplngPty")
	protected PartyIdentification40Choice employingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#mmEmployingParty
	 * MeetingContactPerson1.mmEmployingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingContactPerson2, Optional<PartyIdentification40Choice>> mmEmployingParty = new MMMessageAssociationEnd<MeetingContactPerson2, Optional<PartyIdentification40Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson2.mmObject();
			isDerived = false;
			xmlTag = "EmplngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingParty";
			definition = "Identifies the organisation which is represented by the person or for which the person works.";
			previousVersion_lazy = () -> MeetingContactPerson1.mmEmployingParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(MeetingContactPerson2 obj) {
			return obj.getEmployingParty();
		}

		@Override
		public void setValue(MeetingContactPerson2 obj, Optional<PartyIdentification40Choice> value) {
			obj.setEmployingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MICIdentifier placeOfListing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#mmPlaceOfListing
	 * MeetingContactPerson1.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingContactPerson2, Optional<MICIdentifier>> mmPlaceOfListing = new MMMessageAttribute<MeetingContactPerson2, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Identification of the financial market, as stipulated in the norm ISO 10383 'Codes for exchanges and market identifications'.";
			previousVersion_lazy = () -> MeetingContactPerson1.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public Optional<MICIdentifier> getValue(MeetingContactPerson2 obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(MeetingContactPerson2 obj, Optional<MICIdentifier> value) {
			obj.setPlaceOfListing(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingContactPerson2.mmContactPerson, com.tools20022.repository.msg.MeetingContactPerson2.mmEmployingParty,
						com.tools20022.repository.msg.MeetingContactPerson2.mmPlaceOfListing);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingContactPerson2";
				definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
				previousVersion_lazy = () -> MeetingContactPerson1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContactIdentification1> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public MeetingContactPerson2 setContactPerson(ContactIdentification1 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}

	public Optional<PartyIdentification40Choice> getEmployingParty() {
		return employingParty == null ? Optional.empty() : Optional.of(employingParty);
	}

	public MeetingContactPerson2 setEmployingParty(PartyIdentification40Choice employingParty) {
		this.employingParty = employingParty;
		return this;
	}

	public Optional<MICIdentifier> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public MeetingContactPerson2 setPlaceOfListing(MICIdentifier placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}
}