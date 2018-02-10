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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to the issuer (or its agent) to request the
 * authorisation of an amendment of a previously sent Agent Corporate Action
 * Election Advice message.<br>
 * <b>Usage</b><br>
 * This message is used to request the amendment of a previously sent Agent
 * Corporate Action Election Advice message.<br>
 * Once the amendment request has been accepted by the issuer (or its agent),
 * the CSD will process any resource movement and send an Agent Corporate Action
 * Election Advice message with the function, option change, to confirm that the
 * amendment has been booked at the CSD.<br>
 * This message is used when the terms and conditions of the corporate action
 * event allow amendments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmIdentification
 * AgentCAElectionAmendmentRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmAgentCAElectionAdviceIdentification
 * AgentCAElectionAmendmentRequestV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmCorporateActionGeneralInformation
 * AgentCAElectionAmendmentRequestV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmAccountDetails
 * AgentCAElectionAmendmentRequestV01.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmOriginalElectionDetails
 * AgentCAElectionAmendmentRequestV01.mmOriginalElectionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmAmendedElectionDetails
 * AgentCAElectionAmendmentRequestV01.mmAmendedElectionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmContactDetails
 * AgentCAElectionAmendmentRequestV01.mmContactDetails}</li>
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
 * xmlTag} = "AgtCAElctnAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.013.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAElectionAmendmentRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to request the authorisation of an amendment of a previously sent Agent Corporate Action Election Advice message.\r\nUsage\r\nThis message is used to request the amendment of a previously sent Agent Corporate Action Election Advice message.\r\nOnce the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.\r\nThis message is used when the terms and conditions of the corporate action event allow amendments."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAElectionAmendmentRequestV01", propOrder = {"identification", "agentCAElectionAdviceIdentification", "corporateActionGeneralInformation", "accountDetails", "originalElectionDetails", "amendedElectionDetails",
		"contactDetails"})
public class AgentCAElectionAmendmentRequestV01 {

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
	 * "Identification assigned by the Sender to unambiguously identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgtCAElctnAdvcId", required = true)
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
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
	 * xmlTag} = "AgtCAElctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Election Advice for which an amendment is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the linked Agent CA Election Advice for which an amendment is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getAgentCAElectionAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected SecuritiesAccount7 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7
	 * SecuritiesAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlElctnDtls", required = true)
	protected CorporateActionElection1 originalElectionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1
	 * CorporateActionElection1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlElctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalElectionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the original election to be amended."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalElectionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlElctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalElectionDetails";
			definition = "Provides information about the original election to be amended.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionElection1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getOriginalElectionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AmddElctnDtls", required = true)
	protected CorporateActionElection2 amendedElectionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2
	 * CorporateActionElection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmddElctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendedElectionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the amendments to the election."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAmendedElectionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AmddElctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendedElectionDetails";
			definition = "Provides information about the amendments to the election.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionElection2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getAmendedElectionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmContactDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactDetails";
			definition = "Contact responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContactPerson1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionAmendmentRequestV01.class.getMethod("getContactDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionAmendmentRequestV01";
				definition = "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to request the authorisation of an amendment of a previously sent Agent Corporate Action Election Advice message.\r\nUsage\r\nThis message is used to request the amendment of a previously sent Agent Corporate Action Election Advice message.\r\nOnce the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.\r\nThis message is used when the terms and conditions of the corporate action event allow amendments.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAElctnAmdmntReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmAgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmAccountDetails,
						com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmOriginalElectionDetails, com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmAmendedElectionDetails,
						com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.mmContactDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "013";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAElectionAmendmentRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAElectionAmendmentRequestV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification;
	}

	public AgentCAElectionAmendmentRequestV01 setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = Objects.requireNonNull(agentCAElectionAdviceIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAElectionAmendmentRequestV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public SecuritiesAccount7 getAccountDetails() {
		return accountDetails;
	}

	public AgentCAElectionAmendmentRequestV01 setAccountDetails(SecuritiesAccount7 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public CorporateActionElection1 getOriginalElectionDetails() {
		return originalElectionDetails;
	}

	public AgentCAElectionAmendmentRequestV01 setOriginalElectionDetails(CorporateActionElection1 originalElectionDetails) {
		this.originalElectionDetails = Objects.requireNonNull(originalElectionDetails);
		return this;
	}

	public CorporateActionElection2 getAmendedElectionDetails() {
		return amendedElectionDetails;
	}

	public AgentCAElectionAmendmentRequestV01 setAmendedElectionDetails(CorporateActionElection2 amendedElectionDetails) {
		this.amendedElectionDetails = Objects.requireNonNull(amendedElectionDetails);
		return this;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return contactDetails == null ? Optional.empty() : Optional.of(contactDetails);
	}

	public AgentCAElectionAmendmentRequestV01 setContactDetails(ContactPerson1 contactDetails) {
		this.contactDetails = contactDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.013.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAElctnAmdmntReq", required = true)
		public AgentCAElectionAmendmentRequestV01 messageBody;
	}
}