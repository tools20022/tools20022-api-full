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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.036.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmTransactionTypeAndModificationAdditionalParameters
 * SecuritiesFinancingModificationInstructionV03.
 * mmTransactionTypeAndModificationAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmTradeDetails
 * SecuritiesFinancingModificationInstructionV03.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmQuantityAndAccountDetails
 * SecuritiesFinancingModificationInstructionV03.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSecuritiesFinancingAdditionalDetails
 * SecuritiesFinancingModificationInstructionV03.
 * mmSecuritiesFinancingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSettlementParameters
 * SecuritiesFinancingModificationInstructionV03.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmDeliveringSettlementParties
 * SecuritiesFinancingModificationInstructionV03.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmReceivingSettlementParties
 * SecuritiesFinancingModificationInstructionV03.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmOpeningSettlementAmount
 * SecuritiesFinancingModificationInstructionV03.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSupplementaryData
 * SecuritiesFinancingModificationInstructionV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingModificationInstructionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\nSuch a change may be:\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\n- the providing of a new rate, for example, a repo rate,\n- the rollover of a position extending the closing or maturity date.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04
 * SecuritiesFinancingModificationInstructionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV02
 * SecuritiesFinancingModificationInstructionV02}</li>
 * </ul>
 */
public class SecuritiesFinancingModificationInstructionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactionTypeAndAdditionalParameters7 transactionTypeAndModificationAdditionalParameters;
	/**
	 * Securities financing transaction identification information, type
	 * (repurchase agreement, reverse repurchase agreement, securities lending
	 * or securities borrowing), modification information and other parameters.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmTransactionTypeAndModificationAdditionalParameters
	 * SecuritiesFinancingModificationInstructionV04.
	 * mmTransactionTypeAndModificationAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionTypeAndModificationAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxTpAndModAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndModificationAdditionalParameters";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing), modification information and other parameters.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmTransactionTypeAndModificationAdditionalParameters);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters7.mmObject();
		}
	};
	protected SecuritiesTradeDetails5 tradeDetails;
	/**
	 * Details of the securities financing deal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmTradeDetails
	 * SecuritiesFinancingModificationInstructionV04.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmTradeDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails5.mmObject();
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Financial instrument representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingModificationInstructionV04.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}
	};
	protected QuantityAndAccount16 quantityAndAccountDetails;
	/**
	 * Details related to the account and quantity involved in the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmQuantityAndAccountDetails
	 * SecuritiesFinancingModificationInstructionV04.mmQuantityAndAccountDetails
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmQuantityAndAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount16.mmObject();
		}
	};
	protected SecuritiesFinancingTransactionDetails19 securitiesFinancingAdditionalDetails;
	/**
	 * Details of the closing of the securities financing transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSecuritiesFinancingAdditionalDetails
	 * SecuritiesFinancingModificationInstructionV04.
	 * mmSecuritiesFinancingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecuritiesFinancingAdditionalDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctiesFincgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingAdditionalDetails";
			definition = "Details of the closing of the securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmSecuritiesFinancingAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails19.mmObject();
		}
	};
	protected SettlementDetails62 settlementParameters;
	/**
	 * Parameters which explicitly state the conditions that must be fulfilled
	 * before a particular transaction of a financial instrument can be settled.
	 * These parameters are defined by the instructing party in compliance with
	 * settlement rules in the market the transaction will settle in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
	 * SettlementDetails62}</li>
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
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSettlementParameters
	 * SecuritiesFinancingModificationInstructionV04.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmSettlementParameters);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails62.mmObject();
		}
	};
	protected SettlementParties10 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmDeliveringSettlementParties
	 * SecuritiesFinancingModificationInstructionV04.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmDeliveringSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}
	};
	protected SettlementParties10 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmReceivingSettlementParties
	 * SecuritiesFinancingModificationInstructionV04.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmReceivingSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}
	};
	protected AmountAndDirection10 openingSettlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmOpeningSettlementAmount
	 * SecuritiesFinancingModificationInstructionV04.mmOpeningSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOpeningSettlementAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmOpeningSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection10.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSupplementaryData
	 * SecuritiesFinancingModificationInstructionV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingModificationInstructionV03";
				definition = "Scope\nAn account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.\nSuch a change may be:\n- the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,\n- the providing of a new rate, for example, a repo rate,\n- the rollover of a position extending the closing or maturity date.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV04.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingModificationInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgModInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV03.mmTransactionTypeAndModificationAdditionalParameters, SecuritiesFinancingModificationInstructionV03.mmTradeDetails,
						SecuritiesFinancingModificationInstructionV03.mmFinancialInstrumentIdentification, SecuritiesFinancingModificationInstructionV03.mmQuantityAndAccountDetails,
						SecuritiesFinancingModificationInstructionV03.mmSecuritiesFinancingAdditionalDetails, SecuritiesFinancingModificationInstructionV03.mmSettlementParameters,
						SecuritiesFinancingModificationInstructionV03.mmDeliveringSettlementParties, SecuritiesFinancingModificationInstructionV03.mmReceivingSettlementParties,
						SecuritiesFinancingModificationInstructionV03.mmOpeningSettlementAmount, SecuritiesFinancingModificationInstructionV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "036";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTypeAndAdditionalParameters7 getTransactionTypeAndModificationAdditionalParameters() {
		return transactionTypeAndModificationAdditionalParameters;
	}

	public void setTransactionTypeAndModificationAdditionalParameters(TransactionTypeAndAdditionalParameters7 transactionTypeAndModificationAdditionalParameters) {
		this.transactionTypeAndModificationAdditionalParameters = transactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails5 tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	public QuantityAndAccount16 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(QuantityAndAccount16 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = quantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails19 getSecuritiesFinancingAdditionalDetails() {
		return securitiesFinancingAdditionalDetails;
	}

	public void setSecuritiesFinancingAdditionalDetails(SecuritiesFinancingTransactionDetails19 securitiesFinancingAdditionalDetails) {
		this.securitiesFinancingAdditionalDetails = securitiesFinancingAdditionalDetails;
	}

	public SettlementDetails62 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(SettlementDetails62 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	public SettlementParties10 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(SettlementParties10 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	public SettlementParties10 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(SettlementParties10 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	public AmountAndDirection10 getOpeningSettlementAmount() {
		return openingSettlementAmount;
	}

	public void setOpeningSettlementAmount(AmountAndDirection10 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}