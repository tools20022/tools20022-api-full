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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.PaymentComplementaryInformation6;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AdditionalPaymentInformation message is sent by an account servicing
 * institution to an account owner.<br>
 * This message is used to provide additional or corrected information on a
 * payment instruction or statement entry, in order to allow reconciliation.<br>
 * <b>Usage</b><br>
 * The AdditionalPaymentInformation message provides elements which are usually
 * not reported in a statement or advice (for example full remittance
 * information or identification of parties other than the account servicing
 * institution and the account owner). It complements information about a
 * payment instruction that has already been received, in the form of one or
 * several entries of the original payment instruction.<br>
 * The AdditionalPaymentInformation message covers one and only one original
 * payment instruction. If several payment instructions need further details,
 * multiple AdditionalPaymentInformation messages must be used, one for each of
 * the payment instructions.<br>
 * The AdditionalPaymentInformation message may be used as a result of two
 * investigation processes and in a way outlined below.<br>
 * - A ClaimNonReceipt workflow raised by the creditor or recipient of the
 * payment: This means that the payment instruction has reached the creditor or
 * beneficiary. The account owner needs further details or correct information
 * for its reconciliation processes. The AdditionalPaymentInformation can be
 * used to provide the missing information.<br>
 * - A RequestToModifyPayment workflow raised by the debtor or one of the
 * intermediate agents upstream: When the payment instruction has reached its
 * intended recipient and the modification does not affect the accounting at the
 * account servicing institution, this AdditionalPaymentInformation message
 * allows the account owner to receive further particulars or correct
 * information about a payment instruction or an entry passed to its account.<br>
 * The AdditionalPayment Information message cannot be used to trigger a request
 * for modification of a payment instruction activity. A RequestToModifyPayment
 * message must be used. In other words, if a debtor or one of intermediate
 * agent (excluding the account servicing institution of the creditor) realises
 * the some information was missing in the original payment instruction, he
 * should not use an AdditionalPaymentInformation but instead a
 * RequestToModifyPayment message.<br>
 * It is assumed that when an account servicing institution sends out an
 * AdditionalPaymentInformation message, the institution is fairly confident
 * that this will resolve the case. Therefore it does not need to wait for a
 * Resolution Of Investigation message. Neither does the account owner, or
 * whoever receives the additional information, need to send back a
 * ResolutionOfInvestigation message. Positive resolution in this case is
 * implicit. Both parties are expected to close the case. In the event that the
 * problem does not go away, a party can re-open the case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.028.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmAssignment
 * AdditionalPaymentInformationV07.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmCase
 * AdditionalPaymentInformationV07.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmUnderlying
 * AdditionalPaymentInformationV07.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmInformation
 * AdditionalPaymentInformationV07.mmInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmSupplementaryData
 * AdditionalPaymentInformationV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion
 * ExceptionsandInvestigationsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017
 * ExceptionsandInvestigationsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AddtlPmtInf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalPaymentInformationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AdditionalPaymentInformation message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe AdditionalPaymentInformation message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe AdditionalPaymentInformation message covers one and only one original payment instruction. If several payment instructions need further details, multiple AdditionalPaymentInformation messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A ClaimNonReceipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The AdditionalPaymentInformation can be used to provide the missing information.\r\n- A RequestToModifyPayment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this AdditionalPaymentInformation message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe AdditionalPayment Information message cannot be used to trigger a request for modification of a payment instruction activity. A RequestToModifyPayment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an AdditionalPaymentInformation but instead a RequestToModifyPayment message.\r\nIt is assumed that when an account servicing institution sends out an AdditionalPaymentInformation message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a ResolutionOfInvestigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08
 * AdditionalPaymentInformationV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06
 * AdditionalPaymentInformationV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalPaymentInformationV07", propOrder = {"assignment", "case_", "underlying", "information", "supplementaryData"})
public class AdditionalPaymentInformationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08#mmAssignment
	 * AdditionalPaymentInformationV08.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmAssignment
	 * AdditionalPaymentInformationV06.mmAssignment}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformationV07, CaseAssignment3> mmAssignment = new MMMessageBuildingBlock<AdditionalPaymentInformationV07, CaseAssignment3>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmAssignment);
			previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmAssignment;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		@Override
		public CaseAssignment3 getValue(AdditionalPaymentInformationV07 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(AdditionalPaymentInformationV07 obj, CaseAssignment3 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08#mmCase
	 * AdditionalPaymentInformationV08.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmCase
	 * AdditionalPaymentInformationV06.mmCase}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformationV07, Case3> mmCase = new MMMessageBuildingBlock<AdditionalPaymentInformationV07, Case3>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmCase);
			previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmCase;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}

		@Override
		public Case3 getValue(AdditionalPaymentInformationV07 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(AdditionalPaymentInformationV07 obj, Case3 value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction3Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the underlying payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08#mmUnderlying
	 * AdditionalPaymentInformationV08.mmUnderlying}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmUnderlying
	 * AdditionalPaymentInformationV06.mmUnderlying}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformationV07, UnderlyingTransaction3Choice> mmUnderlying = new MMMessageBuildingBlock<AdditionalPaymentInformationV07, UnderlyingTransaction3Choice>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the underlying payment instruction.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmUnderlying);
			previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmUnderlying;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction3Choice.mmObject();
		}

		@Override
		public UnderlyingTransaction3Choice getValue(AdditionalPaymentInformationV07 obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(AdditionalPaymentInformationV07 obj, UnderlyingTransaction3Choice value) {
			obj.setUnderlying(value);
		}
	};
	@XmlElement(name = "Inf", required = true)
	protected PaymentComplementaryInformation6 information;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6
	 * PaymentComplementaryInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Inf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information to the underlying payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08#mmInformation
	 * AdditionalPaymentInformationV08.mmInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmInformation
	 * AdditionalPaymentInformationV06.mmInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformationV07, PaymentComplementaryInformation6> mmInformation = new MMMessageBuildingBlock<AdditionalPaymentInformationV07, PaymentComplementaryInformation6>() {
		{
			xmlTag = "Inf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Additional information to the underlying payment instruction.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmInformation);
			previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentComplementaryInformation6.mmObject();
		}

		@Override
		public PaymentComplementaryInformation6 getValue(AdditionalPaymentInformationV07 obj) {
			return obj.getInformation();
		}

		@Override
		public void setValue(AdditionalPaymentInformationV07 obj, PaymentComplementaryInformation6 value) {
			obj.setInformation(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08#mmSupplementaryData
	 * AdditionalPaymentInformationV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmSupplementaryData
	 * AdditionalPaymentInformationV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformationV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AdditionalPaymentInformationV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmSupplementaryData);
			previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AdditionalPaymentInformationV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AdditionalPaymentInformationV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalPaymentInformationV07";
				definition = "Scope\r\nThe AdditionalPaymentInformation message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe AdditionalPaymentInformation message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe AdditionalPaymentInformation message covers one and only one original payment instruction. If several payment instructions need further details, multiple AdditionalPaymentInformation messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A ClaimNonReceipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The AdditionalPaymentInformation can be used to provide the missing information.\r\n- A RequestToModifyPayment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this AdditionalPaymentInformation message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe AdditionalPayment Information message cannot be used to trigger a request for modification of a payment instruction activity. A RequestToModifyPayment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an AdditionalPaymentInformation but instead a RequestToModifyPayment message.\r\nIt is assumed that when an account servicing institution sends out an AdditionalPaymentInformation message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a ResolutionOfInvestigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV08.mmObject());
				previousVersion_lazy = () -> AdditionalPaymentInformationV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(ExceptionsandInvestigationsISOPreviousversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), ExceptionsandInvestigationsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "AddtlPmtInf";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmAssignment, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmCase,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmUnderlying, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmInformation,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "028";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AdditionalPaymentInformationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public AdditionalPaymentInformationV07 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case3 getCase() {
		return case_;
	}

	public AdditionalPaymentInformationV07 setCase(Case3 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction3Choice getUnderlying() {
		return underlying;
	}

	public AdditionalPaymentInformationV07 setUnderlying(UnderlyingTransaction3Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public PaymentComplementaryInformation6 getInformation() {
		return information;
	}

	public AdditionalPaymentInformationV07 setInformation(PaymentComplementaryInformation6 information) {
		this.information = Objects.requireNonNull(information);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AdditionalPaymentInformationV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.028.001.07")
	static public class Document {
		@XmlElement(name = "AddtlPmtInf", required = true)
		public AdditionalPaymentInformationV07 messageBody;
	}
}