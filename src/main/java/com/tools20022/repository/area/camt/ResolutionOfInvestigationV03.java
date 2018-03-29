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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.choice.CorrectiveTransaction1Choice;
import com.tools20022.repository.choice.InvestigationStatus2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Resolution Of Investigation message is sent by a case assignee to a case
 * creator/case assigner.<br>
 * This message is used to inform of the resolution of a case, and optionally
 * provides details about.<br>
 * - the corrective action undertaken by the case assignee<br>
 * - information on the return where applicable<br>
 * <b>Usage</b><br>
 * The Resolution Of Investigation message is used by the case assignee to
 * inform a case creator or case assigner about the resolution of a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Resolution Of Investigation message covers one and only one case at a
 * time. If the case assignee needs to communicate about several cases, then
 * several Resolution Of Investigation messages must be sent.<br>
 * The Resolution Of Investigation message provides:<br>
 * - the final outcome of the case, whether positive or negative<br>
 * - optionally, the details of the corrective action undertaken by the case
 * assignee and the information of the return<br>
 * Whenever a payment instruction has been generated to solve the case under
 * investigation following a claim non receipt or an unable to apply, the
 * optional CorrectionTransaction component present in the message must be
 * completed.<br>
 * Whenever the action of modifying or cancelling a payment results in funds
 * being returned or reversed, an investigating agent may provide the details in
 * the resolution related investigation component, to identify the return or
 * reversal transaction. These details will facilitate the account
 * reconciliations at the initiating bank and the intermediaries. It must be
 * stressed that the return or reversal of funds is outside the scope of this
 * Exceptions and Investigation service. The features given here is only meant
 * to transmit the information of return or reversal when it is available
 * through the resolution of the case.<br>
 * The Resolution Of Investigation message must:<br>
 * - be forwarded by all subsequent case assignee(s) until it reaches the case
 * creator<br>
 * - not be used in place of a Reject Case Assignment or Case Status Report or
 * Notification Of Case Assignment message<br>
 * Take note of an exceptional rule that allows the use of Resolution Of
 * Investigation in lieu of a Case Status Report. Case Status Report is a
 * response-message to a Case Status Report Request. The latter which is sent
 * when the assigner has reached its own time-out threshold to receive a
 * response. However it may happen that when the Request arrives, the
 * investigating agent has just obtained a resolution. In such a situation, it
 * would be redundant to send a Case Status Report when then followed
 * immediately by a Resolution Of Investigation. It is therefore quite
 * acceptable for the investigating agent, the assignee, to skip the Case Status
 * Report and send the Resolution Of Investigation message directly.<br>
 * The Resolution Of Investigation message should be the sole message to respond
 * to a cancellation request. Details of the underlying transactions and the
 * related statuses for which the cancellation request has been issued may be
 * provided in the Cancellation Details component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmAssignment
 * ResolutionOfInvestigationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmResolvedCase
 * ResolutionOfInvestigationV03.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmStatus
 * ResolutionOfInvestigationV03.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmCancellationDetails
 * ResolutionOfInvestigationV03.mmCancellationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmStatementDetails
 * ResolutionOfInvestigationV03.mmStatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmCorrectionTransaction
 * ResolutionOfInvestigationV03.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmResolutionRelatedInformation
 * ResolutionOfInvestigationV03.mmResolutionRelatedInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RsltnOfInvstgtn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.029.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule#forResolutionOfInvestigationV03
 * ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule#forResolutionOfInvestigationV03
 * ConstraintMessageOrGroupResolvedCaseRule.forResolutionOfInvestigationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV03
 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
 * forResolutionOfInvestigationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule#forResolutionOfInvestigationV03
 * ConstraintMessageOrInitiationTransactionResolvedCaseRule.
 * forResolutionOfInvestigationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule#forResolutionOfInvestigationV03
 * ConstraintMessageOrInterbankTransactionResolvedCaseRule.
 * forResolutionOfInvestigationV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResolutionOfInvestigationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about.\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe Resolution Of Investigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Resolution Of Investigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe Resolution Of Investigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe Resolution Of Investigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message\r\nTake note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly.\r\nThe Resolution Of Investigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the Cancellation Details component."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04
 * ResolutionOfInvestigationV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResolutionOfInvestigationV03", propOrder = {"assignment", "resolvedCase", "status", "cancellationDetails", "statementDetails", "correctionTransaction", "resolutionRelatedInformation"})
public class ResolutionOfInvestigationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment2 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, CaseAssignment2> mmAssignment = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, CaseAssignment2>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		@Override
		public CaseAssignment2 getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, CaseAssignment2 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "RslvdCase")
	protected Case2 resolvedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a resolved case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<Case2>> mmResolvedCase = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<Case2>>() {
		{
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies a resolved case.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Case2.mmObject();
		}

		@Override
		public Optional<Case2> getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getResolvedCase();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, Optional<Case2> value) {
			obj.setResolvedCase(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected InvestigationStatus2Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationStatus2Choice
	 * InvestigationStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, InvestigationStatus2Choice> mmStatus = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, InvestigationStatus2Choice>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationStatus2Choice.mmObject();
		}

		@Override
		public InvestigationStatus2Choice getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, InvestigationStatus2Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "CxlDtls")
	protected List<UnderlyingTransaction3> cancellationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3
	 * UnderlyingTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details of the underlying transactions being cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, List<UnderlyingTransaction3>> mmCancellationDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, List<UnderlyingTransaction3>>() {
		{
			xmlTag = "CxlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDetails";
			definition = "Specifies the details of the underlying transactions being cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingTransaction3.mmObject();
		}

		@Override
		public List<UnderlyingTransaction3> getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getCancellationDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, List<UnderlyingTransaction3> value) {
			obj.setCancellationDetails(value);
		}
	};
	@XmlElement(name = "StmtDtls")
	protected StatementResolutionEntry1 statementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1
	 * StatementResolutionEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details on the underlying statement entry."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<StatementResolutionEntry1>> mmStatementDetails = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<StatementResolutionEntry1>>() {
		{
			xmlTag = "StmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDetails";
			definition = "Details on the underlying statement entry.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementResolutionEntry1.mmObject();
		}

		@Override
		public Optional<StatementResolutionEntry1> getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getStatementDetails();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, Optional<StatementResolutionEntry1> value) {
			obj.setStatementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CrrctnTx")
	protected CorrectiveTransaction1Choice correctionTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrctnTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectionTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References a transaction initiated to fix the case under investigation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<CorrectiveTransaction1Choice>> mmCorrectionTransaction = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<CorrectiveTransaction1Choice>>() {
		{
			xmlTag = "CrrctnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectionTransaction";
			definition = "References a transaction initiated to fix the case under investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorrectiveTransaction1Choice.mmObject();
		}

		@Override
		public Optional<CorrectiveTransaction1Choice> getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getCorrectionTransaction();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, Optional<CorrectiveTransaction1Choice> value) {
			obj.setCorrectionTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnRltdInf")
	protected ResolutionInformation1 resolutionRelatedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1
	 * ResolutionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnRltdInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionRelatedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<ResolutionInformation1>> mmResolutionRelatedInformation = new MMMessageBuildingBlock<ResolutionOfInvestigationV03, Optional<ResolutionInformation1>>() {
		{
			xmlTag = "RsltnRltdInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionRelatedInformation";
			definition = "Reference of a return or a reversal initiated to fix the case under investigation as part of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ResolutionInformation1.mmObject();
		}

		@Override
		public Optional<ResolutionInformation1> getValue(ResolutionOfInvestigationV03 obj) {
			return obj.getResolutionRelatedInformation();
		}

		@Override
		public void setValue(ResolutionOfInvestigationV03 obj, Optional<ResolutionInformation1> value) {
			obj.setResolutionRelatedInformation(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialOrRejectedCancellationRule.forResolutionOfInvestigationV03,
						com.tools20022.repository.constraints.ConstraintMessageOrGroupResolvedCaseRule.forResolutionOfInvestigationV03,
						com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV03,
						com.tools20022.repository.constraints.ConstraintMessageOrInitiationTransactionResolvedCaseRule.forResolutionOfInvestigationV03,
						com.tools20022.repository.constraints.ConstraintMessageOrInterbankTransactionResolvedCaseRule.forResolutionOfInvestigationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionOfInvestigationV03";
				definition = "Scope\r\nThe Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform of the resolution of a case, and optionally provides details about.\r\n- the corrective action undertaken by the case assignee\r\n- information on the return where applicable\r\nUsage\r\nThe Resolution Of Investigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Resolution Of Investigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.\r\nThe Resolution Of Investigation message provides:\r\n- the final outcome of the case, whether positive or negative\r\n- optionally, the details of the corrective action undertaken by the case assignee and the information of the return\r\nWhenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.\r\nWhenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.\r\nThe Resolution Of Investigation message must:\r\n- be forwarded by all subsequent case assignee(s) until it reaches the case creator\r\n- not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message\r\nTake note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly.\r\nThe Resolution Of Investigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the Cancellation Details component.";
				nextVersions_lazy = () -> Arrays.asList(ResolutionOfInvestigationV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "RsltnOfInvstgtn";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmResolvedCase,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmStatus, com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmCancellationDetails,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmStatementDetails, com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmCorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmResolutionRelatedInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "029";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ResolutionOfInvestigationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public ResolutionOfInvestigationV03 setAssignment(CaseAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<Case2> getResolvedCase() {
		return resolvedCase == null ? Optional.empty() : Optional.of(resolvedCase);
	}

	public ResolutionOfInvestigationV03 setResolvedCase(Case2 resolvedCase) {
		this.resolvedCase = resolvedCase;
		return this;
	}

	public InvestigationStatus2Choice getStatus() {
		return status;
	}

	public ResolutionOfInvestigationV03 setStatus(InvestigationStatus2Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<UnderlyingTransaction3> getCancellationDetails() {
		return cancellationDetails == null ? cancellationDetails = new ArrayList<>() : cancellationDetails;
	}

	public ResolutionOfInvestigationV03 setCancellationDetails(List<UnderlyingTransaction3> cancellationDetails) {
		this.cancellationDetails = Objects.requireNonNull(cancellationDetails);
		return this;
	}

	public Optional<StatementResolutionEntry1> getStatementDetails() {
		return statementDetails == null ? Optional.empty() : Optional.of(statementDetails);
	}

	public ResolutionOfInvestigationV03 setStatementDetails(StatementResolutionEntry1 statementDetails) {
		this.statementDetails = statementDetails;
		return this;
	}

	public Optional<CorrectiveTransaction1Choice> getCorrectionTransaction() {
		return correctionTransaction == null ? Optional.empty() : Optional.of(correctionTransaction);
	}

	public ResolutionOfInvestigationV03 setCorrectionTransaction(CorrectiveTransaction1Choice correctionTransaction) {
		this.correctionTransaction = correctionTransaction;
		return this;
	}

	public Optional<ResolutionInformation1> getResolutionRelatedInformation() {
		return resolutionRelatedInformation == null ? Optional.empty() : Optional.of(resolutionRelatedInformation);
	}

	public ResolutionOfInvestigationV03 setResolutionRelatedInformation(ResolutionInformation1 resolutionRelatedInformation) {
		this.resolutionRelatedInformation = resolutionRelatedInformation;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
	static public class Document {
		@XmlElement(name = "RsltnOfInvstgtn", required = true)
		public ResolutionOfInvestigationV03 messageBody;
	}
}