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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.SystemEventInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the participant and their operational status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#mmParticipantIdentification
 * ParticipantAndStatus1.mmParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#mmParticipantContactDetails
 * ParticipantAndStatus1.mmParticipantContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#mmServiceAvailability
 * ParticipantAndStatus1.mmServiceAvailability}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemEventInformation
 * SystemEventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ParticipantAndStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the participant and their operational status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ParticipantAndStatus1", propOrder = {"participantIdentification", "participantContactDetails", "serviceAvailability"})
public class ParticipantAndStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstitutionIdentification13 participantIdentification;
	/**
	 * Identification of participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification13
	 * FinancialInstitutionIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1
	 * ParticipantAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of participant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> ParticipantAndStatus1.mmObject();
			isDerived = false;
			xmlTag = "PtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantIdentification";
			definition = "Identification of participant.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification13.mmObject();
		}
	};
	protected ContactDetails2 participantContactDetails;
	/**
	 * Set of elements used to indicate how to contact the participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1
	 * ParticipantAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptCtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantContactDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate how to contact the participant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipantContactDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> ParticipantAndStatus1.mmObject();
			isDerived = false;
			xmlTag = "PtcptCtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantContactDetails";
			definition = "Set of elements used to indicate how to contact the participant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ServiceAvailability1> serviceAvailability;
	/**
	 * Provides details on operational availability of the participant business
	 * service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ServiceAvailability1
	 * ServiceAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAvailability
	 * System.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1
	 * ParticipantAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcAvlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on operational availability of the participant business service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceAvailability = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> System.mmAvailability;
			componentContext_lazy = () -> ParticipantAndStatus1.mmObject();
			isDerived = false;
			xmlTag = "SvcAvlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceAvailability";
			definition = "Provides details on operational availability of the participant business service.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ServiceAvailability1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ParticipantAndStatus1.mmParticipantIdentification, ParticipantAndStatus1.mmParticipantContactDetails, ParticipantAndStatus1.mmServiceAvailability);
				trace_lazy = () -> SystemEventInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ParticipantAndStatus1";
				definition = "Provides details on the participant and their operational status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtcptId", required = true)
	public FinancialInstitutionIdentification13 getParticipantIdentification() {
		return participantIdentification;
	}

	public void setParticipantIdentification(com.tools20022.repository.msg.FinancialInstitutionIdentification13 participantIdentification) {
		this.participantIdentification = participantIdentification;
	}

	@XmlElement(name = "PtcptCtctDtls")
	public ContactDetails2 getParticipantContactDetails() {
		return participantContactDetails;
	}

	public void setParticipantContactDetails(com.tools20022.repository.msg.ContactDetails2 participantContactDetails) {
		this.participantContactDetails = participantContactDetails;
	}

	@XmlElement(name = "SvcAvlbty", required = true)
	public List<ServiceAvailability1> getServiceAvailability() {
		return serviceAvailability;
	}

	public void setServiceAvailability(List<com.tools20022.repository.msg.ServiceAvailability1> serviceAvailability) {
		this.serviceAvailability = serviceAvailability;
	}
}