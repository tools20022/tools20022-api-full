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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BankContactPerson1Choice;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Person to be contacted in a given organisation. In the corporate action
 * domain (including meeting notifications) , it is the contact person at the
 * party organising the meeting, at the issuer or at an intermediary.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ContactPersonRole" src="doc-files/ContactPersonRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification2
 * ContactIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification1
 * ContactIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification4
 * ContactIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactPerson1 ContactPerson1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3
 * ContactIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BankContactPerson1Choice
 * BankContactPerson1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
 * Role.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
 * Person.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPerson
 * Meeting.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmContactPerson
 * PartyIdentificationAndAccount4.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmContactPerson
 * PartyIdentification21.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmContactPerson
 * DeliveryParameters4.mmContactPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactPerson1#mmContactPerson
 * ContactPerson1.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmContactPerson
 * PartyIdentificationAndAccount32.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice#mmBuyerBankContactPerson
 * BankContactPerson1Choice.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice#mmSellerBankContactPerson
 * BankContactPerson1Choice.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmContactPerson
 * PartyIdentificationAndAccount102.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmContactPerson
 * PartyIdentification97.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmContactPerson
 * PartyIdentificationAndAccount123.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmContactPerson
 * PartyIdentificationAndAccount126.mmContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
 * ContactPersonRole.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
 * ContactPersonRole.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
 * ContactPersonRole.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContactPersonRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Person to be contacted in a given organisation. In the corporate action domain (including meeting notifications) , it is the contact person at the party organising the meeting, at the issuer or at an intermediary."
 * </li>
 * </ul>
 */
public class ContactPersonRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Role> role;
	/**
	 * Role for which a contact person is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmRole
	 * ContactIdentification1.mmRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role for which a contact person is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ContactIdentification1.mmRole);
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role for which a contact person is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.mmContactPersonRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> meeting;
	/**
	 * Meeting for which a person is the contact.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmPerson
	 * Meeting.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which a person is the contact."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a person is the contact.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected Person person;
	/**
	 * Identifies the person which plays the role of contact.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
	 * Person.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the person which plays the role of contact."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identifies the person which plays the role of contact.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmContactPersonRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactPersonRole";
				definition = "Person to be contacted in a given organisation. In the corporate action domain (including meeting notifications) , it is the contact person at the party organising the meeting, at the issuer or at an intermediary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmContactPersonRole, com.tools20022.repository.entity.Person.mmContactPersonRole, com.tools20022.repository.entity.Meeting.mmPerson);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentificationAndAccount4.mmContactPerson, PartyIdentification21.mmContactPerson, DeliveryParameters4.mmContactPerson, ContactPerson1.mmContactPerson,
						PartyIdentificationAndAccount32.mmContactPerson, BankContactPerson1Choice.mmBuyerBankContactPerson, BankContactPerson1Choice.mmSellerBankContactPerson, PartyIdentificationAndAccount102.mmContactPerson,
						PartyIdentification97.mmContactPerson, PartyIdentificationAndAccount123.mmContactPerson, PartyIdentificationAndAccount126.mmContactPerson);
				superType_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPersonRole.mmRole, com.tools20022.repository.entity.ContactPersonRole.mmMeeting, com.tools20022.repository.entity.ContactPersonRole.mmPerson);
				derivationComponent_lazy = () -> Arrays.asList(ContactIdentification2.mmObject(), ContactIdentification1.mmObject(), ContactIdentification4.mmObject(), ContactPerson1.mmObject(), ContactIdentification3.mmObject(),
						BankContactPerson1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<com.tools20022.repository.entity.Role> role) {
		this.role = role;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<com.tools20022.repository.entity.Meeting> meeting) {
		this.meeting = meeting;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(com.tools20022.repository.entity.Person person) {
		this.person = person;
	}
}