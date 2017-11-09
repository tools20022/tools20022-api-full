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
import com.tools20022.repository.msg.CorporateActionStandingInstruction1;
import com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to the issuer agent to request the cancellation
 * of a previously sent Agent Corporate Action Standing Instruction.<br>
 * <b>Usage</b><br>
 * This message is used to request the cancellation of a standing instruction.<br>
 * This message must contain the identification of the standing instruction to
 * be cancelled. It may also contain details of the standing instruction to be
 * cancelled, but this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.026.001.01}</li>
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
 * xmlTag} = "AgtCAStgInstrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmIdentification
 * AgentCAStandingInstructionCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmAgentCAStandingInstructionRequestIdentification
 * AgentCAStandingInstructionCancellationRequestV01.
 * mmAgentCAStandingInstructionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionCancellationRequestV01.
 * mmStandingInstructionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmStandingInstructionDetails
 * AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionDetails
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAStandingInstructionCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to the issuer agent to request the cancellation of a previously sent Agent Corporate Action Standing Instruction.\r\nUsage\r\nThis message is used to request the cancellation of a standing instruction.\r\nThis message must contain the identification of the standing instruction to be cancelled. It may also contain details of the standing instruction to be cancelled, but this is not recommended."
 * </li>
 * </ul>
 */
public class AgentCAStandingInstructionCancellationRequestV01 {

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
	};
	protected DocumentIdentification8 agentCAStandingInstructionRequestIdentification;
	/**
	 * Identification of the Agent CA Standing Instruction Request to be
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAStgInstrReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAStandingInstructionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA Standing Instruction Request to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAStandingInstructionRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAStgInstrReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAStandingInstructionRequestIdentification";
			definition = "Identification of the Agent CA Standing Instruction Request to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation;
	/**
	 * General information about the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionGeneralInformation";
			definition = "General information about the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionStandingInstructionGeneralInformation1.mmObject();
		}
	};
	protected CorporateActionStandingInstruction1 standingInstructionDetails;
	/**
	 * Information related to the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionDetails";
			definition = "Information related to the standing instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionStandingInstruction1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAStandingInstructionCancellationRequestV01";
				definition = "Scope\r\nThis message is sent by a CSD to the issuer agent to request the cancellation of a previously sent Agent Corporate Action Standing Instruction.\r\nUsage\r\nThis message is used to request the cancellation of a standing instruction.\r\nThis message must contain the identification of the standing instruction to be cancelled. It may also contain details of the standing instruction to be cancelled, but this is not recommended.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAStgInstrCxlReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAStandingInstructionCancellationRequestV01.mmIdentification, AgentCAStandingInstructionCancellationRequestV01.mmAgentCAStandingInstructionRequestIdentification,
						AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionGeneralInformation, AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "026";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	public DocumentIdentification8 getAgentCAStandingInstructionRequestIdentification() {
		return agentCAStandingInstructionRequestIdentification;
	}

	public void setAgentCAStandingInstructionRequestIdentification(DocumentIdentification8 agentCAStandingInstructionRequestIdentification) {
		this.agentCAStandingInstructionRequestIdentification = agentCAStandingInstructionRequestIdentification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return standingInstructionGeneralInformation;
	}

	public void setStandingInstructionGeneralInformation(CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation) {
		this.standingInstructionGeneralInformation = standingInstructionGeneralInformation;
	}

	public CorporateActionStandingInstruction1 getStandingInstructionDetails() {
		return standingInstructionDetails;
	}

	public void setStandingInstructionDetails(CorporateActionStandingInstruction1 standingInstructionDetails) {
		this.standingInstructionDetails = standingInstructionDetails;
	}
}