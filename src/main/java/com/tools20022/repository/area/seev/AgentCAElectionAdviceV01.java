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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to the issuer (or its agent) to provide
 * information about the clients' election instruction, the registration
 * details, the delivery details, etc. In case of an election with underlying
 * resource movements, it also confirms that these have been completed. This
 * message may also be sent in case of an amendment of an election, once the CSD
 * has completed the required resource movements.<br>
 * <b>Usage</b><br>
 * This message can be used for a new election advice or an amended election
 * advice.<br>
 * If this message is used for a new election advice, the function of the
 * message must be 'new election'.<br>
 * If this message is used for an amended election advice, the function of the
 * message must be 'option change' and the identification of the previously sent
 * election advice must be present.<br>
 * This message can include the cash movements and/or securities movements in
 * the case of an election with underlying resource movements. Additionally,
 * this message can include delivery, certification and beneficial owner
 * details.<br>
 * Note: this information can be also sent separately in the Agent Corporate
 * Action Information advice message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmIdentification
 * AgentCAElectionAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmElectionAdviceTypeAndLinkage
 * AgentCAElectionAdviceV01.mmElectionAdviceTypeAndLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAElectionAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmElectionDetails
 * AgentCAElectionAdviceV01.mmElectionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmAdditionalInformation
 * AgentCAElectionAdviceV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmContactDetails
 * AgentCAElectionAdviceV01.mmContactDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAElctnAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.012.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#for_seev_AgentCAElectionAdviceV01
 * ConstraintOptionTypeRule.for_seev_AgentCAElectionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_AgentCAElectionAdviceV01
 * ConstraintOptionNumberRule.for_seev_AgentCAElectionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintElectionType2Rule#for_seev_AgentCAElectionAdviceV01
 * ConstraintElectionType2Rule.for_seev_AgentCAElectionAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAElectionAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to provide information about the clients' election instruction, the registration details, the delivery details, etc. In case of an election with underlying resource movements, it also confirms that these have been completed. This message may also be sent in case of an amendment of an election, once the CSD has completed the required resource movements.\r\nUsage\r\nThis message can be used for a new election advice or an amended election advice.\r\nIf this message is used for a new election advice, the function of the message must be 'new election'.\r\nIf this message is used for an amended election advice, the function of the message must be 'option change' and the identification of the previously sent election advice must be present.\r\nThis message can include the cash movements and/or securities movements in the case of an election with underlying resource movements. Additionally, this message can include delivery, certification and beneficial owner details.\r\nNote: this information can be also sent separately in the Agent Corporate Action Information advice message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAElectionAdviceV01", propOrder = {"identification", "electionAdviceTypeAndLinkage", "corporateActionGeneralInformation", "electionDetails", "additionalInformation", "contactDetails"})
public class AgentCAElectionAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "ElctnAdvcTpAndLkg", required = true)
	protected ElectionAdviceFunction1 electionAdviceTypeAndLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1
	 * ElectionAdviceFunction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnAdvcTpAndLkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAdviceTypeAndLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the type of election advice and linked messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, ElectionAdviceFunction1> mmElectionAdviceTypeAndLinkage = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, ElectionAdviceFunction1>() {
		{
			xmlTag = "ElctnAdvcTpAndLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceTypeAndLinkage";
			definition = "Provides information about the type of election advice and linked messages.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionAdviceFunction1.mmObject();
		}

		@Override
		public ElectionAdviceFunction1 getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getElectionAdviceTypeAndLinkage();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, ElectionAdviceFunction1 value) {
			obj.setElectionAdviceTypeAndLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, CorporateActionInformation1>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}

		@Override
		public CorporateActionInformation1 getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "ElctnDtls", required = true)
	protected CorporateActionElection3 electionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the election(s)."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, CorporateActionElection3> mmElectionDetails = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, CorporateActionElection3>() {
		{
			xmlTag = "ElctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionDetails";
			definition = "Provides information about the election(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionElection3.mmObject();
		}

		@Override
		public CorporateActionElection3 getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getElectionDetails();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, CorporateActionElection3 value) {
			obj.setElectionDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionAdditionalInformation1 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the delivery details, beneficial owner details, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, Optional<CorporateActionAdditionalInformation1>> mmAdditionalInformation = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, Optional<CorporateActionAdditionalInformation1>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information about the delivery details, beneficial owner details, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
		}

		@Override
		public Optional<CorporateActionAdditionalInformation1> getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, Optional<CorporateActionAdditionalInformation1> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctDtls")
	protected ContactPerson1 contactDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactPerson1
	 * ContactPerson1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact responsible for the transaction identified in the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAElectionAdviceV01, Optional<ContactPerson1>> mmContactDetails = new MMMessageBuildingBlock<AgentCAElectionAdviceV01, Optional<ContactPerson1>>() {
		{
			xmlTag = "CtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactDetails";
			definition = "Contact responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContactPerson1.mmObject();
		}

		@Override
		public Optional<ContactPerson1> getValue(AgentCAElectionAdviceV01 obj) {
			return obj.getContactDetails();
		}

		@Override
		public void setValue(AgentCAElectionAdviceV01 obj, Optional<ContactPerson1> value) {
			obj.setContactDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeRule.for_seev_AgentCAElectionAdviceV01,
						com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_AgentCAElectionAdviceV01, com.tools20022.repository.constraints.ConstraintElectionType2Rule.for_seev_AgentCAElectionAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to provide information about the clients' election instruction, the registration details, the delivery details, etc. In case of an election with underlying resource movements, it also confirms that these have been completed. This message may also be sent in case of an amendment of an election, once the CSD has completed the required resource movements.\r\nUsage\r\nThis message can be used for a new election advice or an amended election advice.\r\nIf this message is used for a new election advice, the function of the message must be 'new election'.\r\nIf this message is used for an amended election advice, the function of the message must be 'option change' and the identification of the previously sent election advice must be present.\r\nThis message can include the cash movements and/or securities movements in the case of an election with underlying resource movements. Additionally, this message can include delivery, certification and beneficial owner details.\r\nNote: this information can be also sent separately in the Agent Corporate Action Information advice message.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAElctnAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmIdentification, com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmElectionAdviceTypeAndLinkage,
						com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmElectionDetails,
						com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmAdditionalInformation, com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.mmContactDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "012";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAElectionAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAElectionAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ElectionAdviceFunction1 getElectionAdviceTypeAndLinkage() {
		return electionAdviceTypeAndLinkage;
	}

	public AgentCAElectionAdviceV01 setElectionAdviceTypeAndLinkage(ElectionAdviceFunction1 electionAdviceTypeAndLinkage) {
		this.electionAdviceTypeAndLinkage = Objects.requireNonNull(electionAdviceTypeAndLinkage);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAElectionAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public CorporateActionElection3 getElectionDetails() {
		return electionDetails;
	}

	public AgentCAElectionAdviceV01 setElectionDetails(CorporateActionElection3 electionDetails) {
		this.electionDetails = Objects.requireNonNull(electionDetails);
		return this;
	}

	public Optional<CorporateActionAdditionalInformation1> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public AgentCAElectionAdviceV01 setAdditionalInformation(CorporateActionAdditionalInformation1 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return contactDetails == null ? Optional.empty() : Optional.of(contactDetails);
	}

	public AgentCAElectionAdviceV01 setContactDetails(ContactPerson1 contactDetails) {
		this.contactDetails = contactDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.012.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAElctnAdvc", required = true)
		public AgentCAElectionAdviceV01 messageBody;
	}
}