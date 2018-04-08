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
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account owner sends a SecuritiesFinancingModificationInstruction to
 * a securities financing transaction account servicer to notify the securities
 * financing transaction account servicer of an update in the details of a
 * repurchase agreement, reverse repurchase agreement, securities lending or
 * securities borrowing transaction that does not impact the original
 * transaction securities quantity. Such a change may be: - the providing of
 * closing details not available at the time of the sending of the Securities
 * Financing Instruction, for example, termination date for an open repo, - the
 * providing of a new rate, for example, a repo rate, - the rollover of a
 * position extending the closing or maturity date. The account owner/servicer
 * relationship may be: - a global custodian which has an account with a local
 * custodian, or - an investment management institution which manage a fund
 * account opened at a custodian, or - a broker which has an account with a
 * custodian, or - a central securities depository participant which has an
 * account with a central securities depository, or - a central securities
 * depository which has an account with a custodian, another central securities
 * depository or another settlement market infrastructure, or - a central
 * counterparty or a stock exchange or a trade matching utility which need to
 * instruct the settlement of securities financing transactions to a central
 * securities depository or another settlement market infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmTransactionTypeAndModificationAdditionalParameters
 * SecuritiesFinancingModificationInstructionV04.
 * mmTransactionTypeAndModificationAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmTradeDetails
 * SecuritiesFinancingModificationInstructionV04.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmQuantityAndAccountDetails
 * SecuritiesFinancingModificationInstructionV04.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSecuritiesFinancingAdditionalDetails
 * SecuritiesFinancingModificationInstructionV04.
 * mmSecuritiesFinancingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSettlementParameters
 * SecuritiesFinancingModificationInstructionV04.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstructionV04.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstructionV04.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmOpeningSettlementAmount
 * SecuritiesFinancingModificationInstructionV04.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSupplementaryData
 * SecuritiesFinancingModificationInstructionV04.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesFincgModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.036.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#for_sese_SecuritiesFinancingModificationInstructionV04
 * ConstraintCoexistenceAmountRule.
 * for_sese_SecuritiesFinancingModificationInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingModificationInstructionV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesFinancingModificationInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesFinancingModificationInstructionV04
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesFinancingModificationInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesFinancingModificationInstructionV04
 * ConstraintSettlementAmountRule.
 * for_sese_SecuritiesFinancingModificationInstructionV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingModificationInstructionV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\nSuch a change may be:\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\n- the providing of a new rate, for example, a repo rate,\n- the rollover of a position extending the closing or maturity date.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05
 * SecuritiesFinancingModificationInstructionV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03
 * SecuritiesFinancingModificationInstructionV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingModificationInstructionV04", propOrder = {"transactionTypeAndModificationAdditionalParameters", "tradeDetails", "financialInstrumentIdentification", "quantityAndAccountDetails",
		"securitiesFinancingAdditionalDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "openingSettlementAmount", "supplementaryData"})
public class SecuritiesFinancingModificationInstructionV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTpAndModAddtlParams", required = true)
	protected TransactionTypeAndAdditionalParameters7 transactionTypeAndModificationAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7
	 * TransactionTypeAndAdditionalParameters7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmTransactionTypeAndModificationAdditionalParameters
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmTransactionTypeAndModificationAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmTransactionTypeAndModificationAdditionalParameters
	 * SecuritiesFinancingModificationInstructionV03.
	 * mmTransactionTypeAndModificationAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, TransactionTypeAndAdditionalParameters7> mmTransactionTypeAndModificationAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, TransactionTypeAndAdditionalParameters7>() {
		{
			xmlTag = "TxTpAndModAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndModificationAdditionalParameters";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing), modification information and other parameters.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmTransactionTypeAndModificationAdditionalParameters);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmTransactionTypeAndModificationAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters7.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters7 getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getTransactionTypeAndModificationAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, TransactionTypeAndAdditionalParameters7 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmTradeDetails
	 * SecuritiesFinancingModificationInstructionV05.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmTradeDetails
	 * SecuritiesFinancingModificationInstructionV03.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecuritiesTradeDetails5> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecuritiesTradeDetails5>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmTradeDetails);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}

		@Override
		public SecuritiesTradeDetails5 getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, SecuritiesTradeDetails5 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingModificationInstructionV03.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecurityIdentification14>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount16 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16
	 * QuantityAndAccount16}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmQuantityAndAccountDetails
	 * SecuritiesFinancingModificationInstructionV05.mmQuantityAndAccountDetails
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmQuantityAndAccountDetails
	 * SecuritiesFinancingModificationInstructionV03.mmQuantityAndAccountDetails
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, QuantityAndAccount16> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, QuantityAndAccount16>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmQuantityAndAccountDetails);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount16.mmObject();
		}

		@Override
		public QuantityAndAccount16 getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, QuantityAndAccount16 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgAddtlDtls", required = true)
	protected SecuritiesFinancingTransactionDetails19 securitiesFinancingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSecuritiesFinancingAdditionalDetails
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmSecuritiesFinancingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSecuritiesFinancingAdditionalDetails
	 * SecuritiesFinancingModificationInstructionV03.
	 * mmSecuritiesFinancingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecuritiesFinancingTransactionDetails19> mmSecuritiesFinancingAdditionalDetails = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, SecuritiesFinancingTransactionDetails19>() {
		{
			xmlTag = "SctiesFincgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingAdditionalDetails";
			definition = "Details of the closing of the securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmSecuritiesFinancingAdditionalDetails);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmSecuritiesFinancingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails19.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionDetails19 getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getSecuritiesFinancingAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, SecuritiesFinancingTransactionDetails19 value) {
			obj.setSecuritiesFinancingAdditionalDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails72 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSettlementParameters
	 * SecuritiesFinancingModificationInstructionV05.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSettlementParameters
	 * SecuritiesFinancingModificationInstructionV03.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementDetails72>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementDetails72>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails72.mmObject();
		}

		@Override
		public Optional<SettlementDetails72> getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, Optional<SettlementDetails72> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties10 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmDeliveringSettlementParties
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmDeliveringSettlementParties
	 * SecuritiesFinancingModificationInstructionV03.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementParties10>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementParties10>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmDeliveringSettlementParties);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		@Override
		public Optional<SettlementParties10> getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, Optional<SettlementParties10> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties10 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmReceivingSettlementParties
	 * SecuritiesFinancingModificationInstructionV05.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmReceivingSettlementParties
	 * SecuritiesFinancingModificationInstructionV03.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementParties10>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<SettlementParties10>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmReceivingSettlementParties);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		@Override
		public Optional<SettlementParties10> getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, Optional<SettlementParties10> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngSttlmAmt")
	protected AmountAndDirection10 openingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10
	 * AmountAndDirection10}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmOpeningSettlementAmount
	 * SecuritiesFinancingModificationInstructionV05.mmOpeningSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmOpeningSettlementAmount
	 * SecuritiesFinancingModificationInstructionV03.mmOpeningSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<AmountAndDirection10>> mmOpeningSettlementAmount = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, Optional<AmountAndDirection10>>() {
		{
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmOpeningSettlementAmount);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmOpeningSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection10.mmObject();
		}

		@Override
		public Optional<AmountAndDirection10> getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getOpeningSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, Optional<AmountAndDirection10> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05#mmSupplementaryData
	 * SecuritiesFinancingModificationInstructionV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSupplementaryData
	 * SecuritiesFinancingModificationInstructionV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingModificationInstructionV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingModificationInstructionV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingModificationInstructionV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.for_sese_SecuritiesFinancingModificationInstructionV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingModificationInstructionV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesFinancingModificationInstructionV04,
						com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingModificationInstructionV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingModificationInstructionV04";
				definition = "Scope\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\nSuch a change may be:\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\n- the providing of a new rate, for example, a repo rate,\n- the rollover of a position extending the closing or maturity date.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV05.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgModInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmTransactionTypeAndModificationAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmSecuritiesFinancingAdditionalDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmOpeningSettlementAmount, com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "036";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingModificationInstructionV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTypeAndAdditionalParameters7 getTransactionTypeAndModificationAdditionalParameters() {
		return transactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesFinancingModificationInstructionV04 setTransactionTypeAndModificationAdditionalParameters(TransactionTypeAndAdditionalParameters7 transactionTypeAndModificationAdditionalParameters) {
		this.transactionTypeAndModificationAdditionalParameters = Objects.requireNonNull(transactionTypeAndModificationAdditionalParameters);
		return this;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingModificationInstructionV04 setTradeDetails(SecuritiesTradeDetails5 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingModificationInstructionV04 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public QuantityAndAccount16 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingModificationInstructionV04 setQuantityAndAccountDetails(QuantityAndAccount16 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SecuritiesFinancingTransactionDetails19 getSecuritiesFinancingAdditionalDetails() {
		return securitiesFinancingAdditionalDetails;
	}

	public SecuritiesFinancingModificationInstructionV04 setSecuritiesFinancingAdditionalDetails(SecuritiesFinancingTransactionDetails19 securitiesFinancingAdditionalDetails) {
		this.securitiesFinancingAdditionalDetails = Objects.requireNonNull(securitiesFinancingAdditionalDetails);
		return this;
	}

	public Optional<SettlementDetails72> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingModificationInstructionV04 setSettlementParameters(SettlementDetails72 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties10> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingModificationInstructionV04 setDeliveringSettlementParties(SettlementParties10 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties10> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingModificationInstructionV04 setReceivingSettlementParties(SettlementParties10 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<AmountAndDirection10> getOpeningSettlementAmount() {
		return openingSettlementAmount == null ? Optional.empty() : Optional.of(openingSettlementAmount);
	}

	public SecuritiesFinancingModificationInstructionV04 setOpeningSettlementAmount(AmountAndDirection10 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingModificationInstructionV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.04")
	static public class Document {
		@XmlElement(name = "SctiesFincgModInstr", required = true)
		public SecuritiesFinancingModificationInstructionV04 messageBody;
	}
}