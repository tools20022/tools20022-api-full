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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesFinancingModificationInstruction to a
 * securities financing transaction account servicer to notify the securities
 * financing transaction account servicer of an update in the details of a
 * repurchase agreement, reverse repurchase agreement, securities lending or
 * securities borrowing transaction that does not impact the original
 * transaction securities quantity.<br>
 * Such a change may be:<br>
 * - the providing of closing details not available at the time of the sending
 * of the Securities Financing Instruction, for example, termination date for an
 * open repo,<br>
 * - the providing of a new rate, for example, a repo rate,<br>
 * - the rollover of a position extending the closing or maturity date.<br>
 * The account owner/servicer relationship may be:<br>
 * - a global custodian which has an account with a local custodian, or<br>
 * - an investment management institution which manage a fund account opened at
 * a custodian, or<br>
 * - a broker which has an account with a custodian, or<br>
 * - a central securities depository participant which has an account with a
 * central securities depository, or<br>
 * - a central securities depository which has an account with a custodian,
 * another central securities depository or another settlement market
 * infrastructure, or<br>
 * - a central counterparty or a stock exchange or a trade matching utility
 * which need to instruct the settlement of securities financing transactions to
 * a central securities depository or another settlement market infrastructure.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmTransactionTypeAndModificationAdditionalParameters
 * SecuritiesFinancingModificationInstructionV06.
 * mmTransactionTypeAndModificationAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmTradeDetails
 * SecuritiesFinancingModificationInstructionV06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmQuantityAndAccountDetails
 * SecuritiesFinancingModificationInstructionV06.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmSecuritiesFinancingAdditionalDetails
 * SecuritiesFinancingModificationInstructionV06.
 * mmSecuritiesFinancingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmSettlementParameters
 * SecuritiesFinancingModificationInstructionV06.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstructionV06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstructionV06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmOpeningSettlementAmount
 * SecuritiesFinancingModificationInstructionV06.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06#mmSupplementaryData
 * SecuritiesFinancingModificationInstructionV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
 * SettlementandReconciliationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.036.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesFinancingModificationInstructionV06
 * ConstraintSettlementAmountRule.
 * for_sese_SecuritiesFinancingModificationInstructionV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingModificationInstructionV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\r\nSuch a change may be:\r\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\r\n- the providing of a new rate, for example, a repo rate,\r\n- the rollover of a position extending the closing or maturity date.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05
 * SecuritiesFinancingModificationInstructionV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingModificationInstructionV06", propOrder = {"transactionTypeAndModificationAdditionalParameters", "tradeDetails", "financialInstrumentIdentification", "quantityAndAccountDetails",
		"securitiesFinancingAdditionalDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "openingSettlementAmount", "supplementaryData"})
public class SecuritiesFinancingModificationInstructionV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTpAndModAddtlParams", required = true)
	protected TransactionTypeAndAdditionalParameters17 transactionTypeAndModificationAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17
	 * TransactionTypeAndAdditionalParameters17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTpAndModAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeAndModificationAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing), modification information and other parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmTransactionTypeAndModificationAdditionalParameters
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmTransactionTypeAndModificationAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, TransactionTypeAndAdditionalParameters17> mmTransactionTypeAndModificationAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, TransactionTypeAndAdditionalParameters17>() {
		{
			xmlTag = "TxTpAndModAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndModificationAdditionalParameters";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing), modification information and other parameters.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmTransactionTypeAndModificationAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters17.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters17 getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getTransactionTypeAndModificationAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, TransactionTypeAndAdditionalParameters17 value) {
			obj.setTransactionTypeAndModificationAdditionalParameters(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails5 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
	 * SecuritiesTradeDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the securities financing deal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmTradeDetails
	 * SecuritiesFinancingModificationInstructionV05.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecuritiesTradeDetails5> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecuritiesTradeDetails5>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}

		@Override
		public SecuritiesTradeDetails5 getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, SecuritiesTradeDetails5 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecurityIdentification19>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, SecurityIdentification19 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount38 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38
	 * QuantityAndAccount38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmQuantityAndAccountDetails
	 * SecuritiesFinancingModificationInstructionV05.mmQuantityAndAccountDetails
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, QuantityAndAccount38> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, QuantityAndAccount38>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount38.mmObject();
		}

		@Override
		public QuantityAndAccount38 getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, QuantityAndAccount38 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgAddtlDtls", required = true)
	protected SecuritiesFinancingTransactionDetails27 securitiesFinancingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27
	 * SecuritiesFinancingTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the closing of the securities financing transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSecuritiesFinancingAdditionalDetails
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmSecuritiesFinancingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecuritiesFinancingTransactionDetails27> mmSecuritiesFinancingAdditionalDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, SecuritiesFinancingTransactionDetails27>() {
		{
			xmlTag = "SctiesFincgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingAdditionalDetails";
			definition = "Details of the closing of the securities financing transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmSecuritiesFinancingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails27.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionDetails27 getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getSecuritiesFinancingAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, SecuritiesFinancingTransactionDetails27 value) {
			obj.setSecuritiesFinancingAdditionalDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails97 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97
	 * SettlementDetails97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSettlementParameters
	 * SecuritiesFinancingModificationInstructionV05.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementDetails97>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementDetails97>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails97.mmObject();
		}

		@Override
		public Optional<SettlementDetails97> getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, Optional<SettlementDetails97> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties36 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmDeliveringSettlementParties
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementParties36>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementParties36>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public Optional<SettlementParties36> getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, Optional<SettlementParties36> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties36 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmReceivingSettlementParties
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementParties36>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<SettlementParties36>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public Optional<SettlementParties36> getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, Optional<SettlementParties36> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngSttlmAmt")
	protected AmountAndDirection49 openingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49
	 * AmountAndDirection49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmOpeningSettlementAmount
	 * SecuritiesFinancingModificationInstructionV05.mmOpeningSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<AmountAndDirection49>> mmOpeningSettlementAmount = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, Optional<AmountAndDirection49>>() {
		{
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmOpeningSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection49.mmObject();
		}

		@Override
		public Optional<AmountAndDirection49> getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getOpeningSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, Optional<AmountAndDirection49> value) {
			obj.setOpeningSettlementAmount(value.orElse(null));
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSupplementaryData
	 * SecuritiesFinancingModificationInstructionV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingModificationInstructionV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingModificationInstructionV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingModificationInstructionV06";
				definition = "Scope\r\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\r\nSuch a change may be:\r\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\r\n- the providing of a new rate, for example, a repo rate,\r\n- the rollover of a position extending the closing or maturity date.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgModInstr";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmTransactionTypeAndModificationAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmSecuritiesFinancingAdditionalDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmOpeningSettlementAmount, com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "036";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingModificationInstructionV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTypeAndAdditionalParameters17 getTransactionTypeAndModificationAdditionalParameters() {
		return transactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesFinancingModificationInstructionV06 setTransactionTypeAndModificationAdditionalParameters(TransactionTypeAndAdditionalParameters17 transactionTypeAndModificationAdditionalParameters) {
		this.transactionTypeAndModificationAdditionalParameters = Objects.requireNonNull(transactionTypeAndModificationAdditionalParameters);
		return this;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingModificationInstructionV06 setTradeDetails(SecuritiesTradeDetails5 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingModificationInstructionV06 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public QuantityAndAccount38 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingModificationInstructionV06 setQuantityAndAccountDetails(QuantityAndAccount38 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SecuritiesFinancingTransactionDetails27 getSecuritiesFinancingAdditionalDetails() {
		return securitiesFinancingAdditionalDetails;
	}

	public SecuritiesFinancingModificationInstructionV06 setSecuritiesFinancingAdditionalDetails(SecuritiesFinancingTransactionDetails27 securitiesFinancingAdditionalDetails) {
		this.securitiesFinancingAdditionalDetails = Objects.requireNonNull(securitiesFinancingAdditionalDetails);
		return this;
	}

	public Optional<SettlementDetails97> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingModificationInstructionV06 setSettlementParameters(SettlementDetails97 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties36> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingModificationInstructionV06 setDeliveringSettlementParties(SettlementParties36 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties36> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingModificationInstructionV06 setReceivingSettlementParties(SettlementParties36 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<AmountAndDirection49> getOpeningSettlementAmount() {
		return openingSettlementAmount == null ? Optional.empty() : Optional.of(openingSettlementAmount);
	}

	public SecuritiesFinancingModificationInstructionV06 setOpeningSettlementAmount(AmountAndDirection49 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingModificationInstructionV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.06")
	static public class Document {
		@XmlElement(name = "SctiesFincgModInstr", required = true)
		public SecuritiesFinancingModificationInstructionV06 messageBody;
	}
}