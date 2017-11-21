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
import com.tools20022.repository.msg.CorporateActionElection3;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to the issuer (or its agent) to request the
 * cancellation of a previously sent Agent Corporate Action Election Advice
 * message.<br>
 * <b>Usage</b><br>
 * This message may only be used to cancel an entire Agent Corporate Action
 * Election Advice message that was previously sent by the CSD. No partial
 * cancellation is allowed.<br>
 * This message must contain the identification of the Agent Corporate Action
 * Election Advice to be cancelled, the agent identification and the corporate
 * action references. This message may also contain details of the election
 * advice to be cancelled, but this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAElctnCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmIdentification
 * AgentCAElectionCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmAgentCAElectionAdviceIdentification
 * AgentCAElectionCancellationRequestV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCAElectionCancellationRequestV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmElectionDetails
 * AgentCAElectionCancellationRequestV01.mmElectionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.014.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAElectionCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to request the cancellation of a previously sent Agent Corporate Action Election Advice message.\r\nUsage\r\nThis message may only be used to cancel an entire Agent Corporate Action Election Advice message that was previously sent by the CSD. No partial cancellation is allowed.\r\nThis message must contain the identification of the Agent Corporate Action Election Advice to be cancelled, the agent identification and the corporate action references. This message may also contain details of the election advice to be cancelled, but this is not recommended."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgentCAElectionCancellationRequestV01", propOrder = {"identification", "agentCAElectionAdviceIdentification", "corporateActionGeneralInformation", "electionDetails"})
public class AgentCAElectionCancellationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * cancellation request.
	 * <p>
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
	 * "Identification assigned by the Sender to unambiguously identify the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionCancellationRequestV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
	/**
	 * Identification of the Agent CA Election Advice to be cancelled.
	 * <p>
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
	 * "Identification of the Agent CA Election Advice to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the Agent CA Election Advice to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionCancellationRequestV01.class.getMethod("getAgentCAElectionAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
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
				return AgentCAElectionCancellationRequestV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionElection3 electionDetails;
	/**
	 * Provides information about the election advice to be cancelled.
	 * <p>
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
	 * definition} =
	 * "Provides information about the election advice to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmElectionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionDetails";
			definition = "Provides information about the election advice to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionElection3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAElectionCancellationRequestV01.class.getMethod("getElectionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionCancellationRequestV01";
				definition = "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to request the cancellation of a previously sent Agent Corporate Action Election Advice message.\r\nUsage\r\nThis message may only be used to cancel an entire Agent Corporate Action Election Advice message that was previously sent by the CSD. No partial cancellation is allowed.\r\nThis message must contain the identification of the Agent Corporate Action Election Advice to be cancelled, the agent identification and the corporate action references. This message may also contain details of the election advice to be cancelled, but this is not recommended.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAElctnCxlReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.mmAgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.mmElectionDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "014";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAElectionCancellationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AgtCAElctnAdvcId", required = true)
	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = agentCAElectionAdviceIdentification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "ElctnDtls")
	public CorporateActionElection3 getElectionDetails() {
		return electionDetails;
	}

	public void setElectionDetails(CorporateActionElection3 electionDetails) {
		this.electionDetails = electionDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.014.01.01")
	static public class Document {
		@XmlElement(name = "AgtCAElctnCxlReq", required = true)
		public AgentCAElectionCancellationRequestV01 messageBody;
	}
}