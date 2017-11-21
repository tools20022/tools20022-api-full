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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains information about the contact responsible for the transaction
 * identified in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactPerson1#mmContactPerson
 * ContactPerson1.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactPerson1#mmInstitutionIdentification
 * ContactPerson1.mmInstitutionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmContactDetails
 * AgentCANotificationAdviceV01.mmContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmContactDetails
 * AgentCAElectionAdviceV01.mmContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmContactDetails
 * AgentCAElectionAmendmentRequestV01.mmContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmContactDetails
 * AgentCAInformationAdviceV01.mmContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmContactDetails
 * AgentCAStandingInstructionRequestV01.mmContactDetails}</li>
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
 * "ContactPerson1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains information about the contact responsible for the transaction identified in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContactPerson1", propOrder = {"contactPerson", "institutionIdentification"})
public class ContactPerson1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContactIdentification4 contactPerson;
	/**
	 * Provides additional information regarding the party, eg, the contact unit
	 * or person responsible for the transaction identified in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactPerson1 ContactPerson1}</li>
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
	 * "Provides additional information regarding the party, eg, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ContactPersonRole.mmObject();
			componentContext_lazy = () -> ContactPerson1.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Provides additional information regarding the party, eg, the contact unit or person responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactIdentification4.mmObject();
		}
	};
	protected PartyIdentification2Choice institutionIdentification;
	/**
	 * Identification of the institution that the contact person represents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactPerson1 ContactPerson1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the institution that the contact person represents."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstitutionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ContactPerson1.mmObject();
			isDerived = false;
			xmlTag = "InstnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionIdentification";
			definition = "Identification of the institution that the contact person represents.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContactPerson1.mmContactPerson, ContactPerson1.mmInstitutionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmContactDetails, AgentCAElectionAdviceV01.mmContactDetails, AgentCAElectionAmendmentRequestV01.mmContactDetails,
						AgentCAInformationAdviceV01.mmContactDetails, AgentCAStandingInstructionRequestV01.mmContactDetails);
				trace_lazy = () -> ContactPersonRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactPerson1";
				definition = "Contains information about the contact responsible for the transaction identified in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CtctPrsn", required = true)
	public ContactIdentification4 getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(com.tools20022.repository.msg.ContactIdentification4 contactPerson) {
		this.contactPerson = contactPerson;
	}

	@XmlElement(name = "InstnId")
	public PartyIdentification2Choice getInstitutionIdentification() {
		return institutionIdentification;
	}

	public void setInstitutionIdentification(PartyIdentification2Choice institutionIdentification) {
		this.institutionIdentification = institutionIdentification;
	}
}