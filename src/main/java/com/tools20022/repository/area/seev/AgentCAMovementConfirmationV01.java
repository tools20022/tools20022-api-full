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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.CashMovement3;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.CorporateActionSecuritiesMovement1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to confirm the
 * settlement of resource movements.<br>
 * <b>Usage</b><br>
 * This message is used to confirm the settlement of the movements resulting
 * from an:<br>
 * - Agent Corporate Action Movement Instruction message. It confirms the
 * settlement of the exercised resources and/or proceeds movements in which case
 * the building block Agent Corporate Action Movement Instruction Identification
 * must be present. An Agent Corporate Action Movement Instruction message may
 * be responded to by more than one Agent Corporate Action Movement Confirmation
 * messages.<br>
 * - Agent Corporate Action Global Distribution Status Advice authorising the
 * global distribution. It confirms the settlement of the exercised resources
 * and/or proceeds movements. The building block Agent Corporate Action Global
 * Distribution Status Advice Identification must be present. An Agent Corporate
 * Action Global Distribution Status Advice message may be responded to by more
 * than one Agent Corporate Action Movement Confirmation messages.<br>
 * - Agent Corporate Action Election Status Advice that rejects an election
 * advice. It confirms the return of the exercised resources. The building block
 * Agent Corporate Action Election Status Advice Identification must be present.
 * An Agent Corporate Action Election Status Advice message may be responded to
 * by more than one Agent Corporate Action Movement Confirmation messages.<br>
 * - Agent Corporate Action Election Status Advice where an election
 * cancellation request has been accepted. It confirms the return of the
 * exercised resources. The building block Agent Corporate Action Election
 * Status Advice Identification must be present. An Agent Corporate Action
 * Election Status Advice message may be responded to by more than one Agent
 * Corporate Action Movement Confirmation messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.021.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule
 * AgentCAMovementConfirmationV01.
 * MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmIdentification
 * AgentCAMovementConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAMovementInstructionIdentification
 * AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAElectionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.mmAgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.
 * mmAgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmCorporateActionGeneralInformation
 * AgentCAMovementConfirmationV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmSecuritiesMovementDetails
 * AgentCAMovementConfirmationV01.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmCashMovementDetails
 * AgentCAMovementConfirmationV01.mmCashMovementDetails}</li>
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
 * xmlTag} = "AgtCAMvmntConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAMovementConfirmationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to confirm the settlement of resource movements.\r\nUsage\r\nThis message is used to confirm the settlement of the movements resulting from an:\r\n- Agent Corporate Action Movement Instruction message. It confirms the settlement of the exercised resources and/or proceeds movements in which case the building block Agent Corporate Action Movement Instruction Identification must be present. An Agent Corporate Action Movement Instruction message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Global Distribution Status Advice authorising the global distribution. It confirms the settlement of the exercised resources and/or proceeds movements. The building block Agent Corporate Action Global Distribution Status Advice Identification must be present. An Agent Corporate Action Global Distribution Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Election Status Advice that rejects an election advice. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Election Status Advice where an election cancellation request has been accepted. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAMovementConfirmationV01", propOrder = {"identification", "agentCAMovementInstructionIdentification", "agentCAElectionStatusAdviceIdentification", "agentCAGlobalDistributionStatusAdviceIdentification",
		"corporateActionGeneralInformation", "securitiesMovementDetails", "cashMovementDetails"})
public class AgentCAMovementConfirmationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCAMovementInstructionIdentification or
	 * AgentCAElectionStatusAdviceIdentification or
	 * AgentCAGlobalDistributionStatusAdviceIdentification must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01
	 * AgentCAMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAMovementInstructionIdentification
	 * AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAElectionStatusAdviceIdentification
	 * AgentCAMovementConfirmationV01.
	 * mmAgentCAElectionStatusAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAGlobalDistributionStatusAdviceIdentification
	 * AgentCAMovementConfirmationV01.
	 * mmAgentCAGlobalDistributionStatusAdviceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCAMovementInstructionIdentification or AgentCAElectionStatusAdviceIdentification or AgentCAGlobalDistributionStatusAdviceIdentification must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule";
			definition = "Either AgentCAMovementInstructionIdentification or AgentCAElectionStatusAdviceIdentification or AgentCAGlobalDistributionStatusAdviceIdentification must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAElectionStatusAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAGlobalDistributionStatusAdviceIdentification);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the confirmation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAMvmntInstrId", required = true)
	protected DocumentIdentification8 agentCAMovementInstructionIdentification;
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
	 * xmlTag} = "AgtCAMvmntInstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAMovementInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA Movement Instruction that triggered the movement(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8> mmAgentCAMovementInstructionIdentification = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAMvmntInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAMovementInstructionIdentification";
			definition = "Identification of the Agent CA Movement Instruction that triggered the movement(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getAgentCAMovementInstructionIdentification();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAMovementInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnStsAdvcId", required = true)
	protected DocumentIdentification8 agentCAElectionStatusAdviceIdentification;
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
	 * xmlTag} = "AgtCAElctnStsAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionStatusAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA Election Status Advice that triggered the movement(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8> mmAgentCAElectionStatusAdviceIdentification = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAElctnStsAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionStatusAdviceIdentification";
			definition = "Identification of the Agent CA Election Status Advice that triggered the movement(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getAgentCAElectionStatusAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAElectionStatusAdviceIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAGblDstrbtnStsAdvcId", required = true)
	protected DocumentIdentification8 agentCAGlobalDistributionStatusAdviceIdentification;
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
	 * xmlTag} = "AgtCAGblDstrbtnStsAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAGlobalDistributionStatusAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA Global Distribution Status Advice that triggered the movement(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8> mmAgentCAGlobalDistributionStatusAdviceIdentification = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAGblDstrbtnStsAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAGlobalDistributionStatusAdviceIdentification";
			definition = "Identification of the Agent CA Global Distribution Status Advice that triggered the movement(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getAgentCAGlobalDistributionStatusAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAGlobalDistributionStatusAdviceIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, CorporateActionInformation1>() {
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
		public CorporateActionInformation1 getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "SctiesMvmntDtls")
	protected List<CorporateActionSecuritiesMovement1> securitiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1
	 * CorporateActionSecuritiesMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the securities movements."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, List<CorporateActionSecuritiesMovement1>> mmSecuritiesMovementDetails = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, List<CorporateActionSecuritiesMovement1>>() {
		{
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Information about the securities movements.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionSecuritiesMovement1.mmObject();
		}

		@Override
		public List<CorporateActionSecuritiesMovement1> getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getSecuritiesMovementDetails();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, List<CorporateActionSecuritiesMovement1> value) {
			obj.setSecuritiesMovementDetails(value);
		}
	};
	@XmlElement(name = "CshMvmntDtls")
	protected List<CashMovement3> cashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashMovement3
	 * CashMovement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the cash movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementConfirmationV01, List<CashMovement3>> mmCashMovementDetails = new MMMessageBuildingBlock<AgentCAMovementConfirmationV01, List<CashMovement3>>() {
		{
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Information about the cash movement.";
			minOccurs = 0;
			complexType_lazy = () -> CashMovement3.mmObject();
		}

		@Override
		public List<CashMovement3> getValue(AgentCAMovementConfirmationV01 obj) {
			return obj.getCashMovementDetails();
		}

		@Override
		public void setValue(AgentCAMovementConfirmationV01 obj, List<CashMovement3> value) {
			obj.setCashMovementDetails(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAMovementConfirmationV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to confirm the settlement of resource movements.\r\nUsage\r\nThis message is used to confirm the settlement of the movements resulting from an:\r\n- Agent Corporate Action Movement Instruction message. It confirms the settlement of the exercised resources and/or proceeds movements in which case the building block Agent Corporate Action Movement Instruction Identification must be present. An Agent Corporate Action Movement Instruction message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Global Distribution Status Advice authorising the global distribution. It confirms the settlement of the exercised resources and/or proceeds movements. The building block Agent Corporate Action Global Distribution Status Advice Identification must be present. An Agent Corporate Action Global Distribution Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Election Status Advice that rejects an election advice. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.\r\n- Agent Corporate Action Election Status Advice where an election cancellation request has been accepted. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.MovementInstructionIDOrElectionStatusAdviceIDOrGlobalDistributionStatusAdviceIDRule);
				rootElement = "Document";
				xmlTag = "AgtCAMvmntConf";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAElectionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmAgentCAGlobalDistributionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmSecuritiesMovementDetails,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.mmCashMovementDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "021";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAMovementConfirmationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAMovementConfirmationV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAMovementInstructionIdentification() {
		return agentCAMovementInstructionIdentification;
	}

	public AgentCAMovementConfirmationV01 setAgentCAMovementInstructionIdentification(DocumentIdentification8 agentCAMovementInstructionIdentification) {
		this.agentCAMovementInstructionIdentification = Objects.requireNonNull(agentCAMovementInstructionIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionStatusAdviceIdentification() {
		return agentCAElectionStatusAdviceIdentification;
	}

	public AgentCAMovementConfirmationV01 setAgentCAElectionStatusAdviceIdentification(DocumentIdentification8 agentCAElectionStatusAdviceIdentification) {
		this.agentCAElectionStatusAdviceIdentification = Objects.requireNonNull(agentCAElectionStatusAdviceIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAGlobalDistributionStatusAdviceIdentification() {
		return agentCAGlobalDistributionStatusAdviceIdentification;
	}

	public AgentCAMovementConfirmationV01 setAgentCAGlobalDistributionStatusAdviceIdentification(DocumentIdentification8 agentCAGlobalDistributionStatusAdviceIdentification) {
		this.agentCAGlobalDistributionStatusAdviceIdentification = Objects.requireNonNull(agentCAGlobalDistributionStatusAdviceIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAMovementConfirmationV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public List<CorporateActionSecuritiesMovement1> getSecuritiesMovementDetails() {
		return securitiesMovementDetails == null ? securitiesMovementDetails = new ArrayList<>() : securitiesMovementDetails;
	}

	public AgentCAMovementConfirmationV01 setSecuritiesMovementDetails(List<CorporateActionSecuritiesMovement1> securitiesMovementDetails) {
		this.securitiesMovementDetails = Objects.requireNonNull(securitiesMovementDetails);
		return this;
	}

	public List<CashMovement3> getCashMovementDetails() {
		return cashMovementDetails == null ? cashMovementDetails = new ArrayList<>() : cashMovementDetails;
	}

	public AgentCAMovementConfirmationV01 setCashMovementDetails(List<CashMovement3> cashMovementDetails) {
		this.cashMovementDetails = Objects.requireNonNull(cashMovementDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.021.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAMvmntConf", required = true)
		public AgentCAMovementConfirmationV01 messageBody;
	}
}