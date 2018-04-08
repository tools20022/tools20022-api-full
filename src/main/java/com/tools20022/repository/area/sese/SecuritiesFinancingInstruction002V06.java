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
import com.tools20022.repository.area.SecuritiesSettlementArchivesubsetsvariants;
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesFinancingInstruction to a securities
 * financing transaction account servicer to notify the securities financing
 * transaction account servicer of the details of a repurchase agreement,
 * reverse repurchase agreement, securities lending or securities borrowing
 * transaction to allow the account servicer to manage the settlement and
 * follow-up of the opening and closing leg of the transaction.<br>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmTransactionIdentification
 * SecuritiesFinancingInstruction002V06.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmTransactionTypeAndAdditionalParameters
 * SecuritiesFinancingInstruction002V06.mmTransactionTypeAndAdditionalParameters
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmNumberCounts
 * SecuritiesFinancingInstruction002V06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmLinkages
 * SecuritiesFinancingInstruction002V06.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmTradeDetails
 * SecuritiesFinancingInstruction002V06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstruction002V06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmFinancialInstrumentAttributes
 * SecuritiesFinancingInstruction002V06.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmQuantityAndAccountDetails
 * SecuritiesFinancingInstruction002V06.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmSecuritiesFinancingDetails
 * SecuritiesFinancingInstruction002V06.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmSettlementParameters
 * SecuritiesFinancingInstruction002V06.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingInstruction002V06.mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmDeliveringSettlementParties
 * SecuritiesFinancingInstruction002V06.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmReceivingSettlementParties
 * SecuritiesFinancingInstruction002V06.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmCashParties
 * SecuritiesFinancingInstruction002V06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmOpeningSettlementAmount
 * SecuritiesFinancingInstruction002V06.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmOtherAmounts
 * SecuritiesFinancingInstruction002V06.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmOtherBusinessParties
 * SecuritiesFinancingInstruction002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmSupplementaryData
 * SecuritiesFinancingInstruction002V06.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesFincgInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchivesubsetsvariants
 * SecuritiesSettlementArchivesubsetsvariants}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.033.002.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingInstruction002V06}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI2Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintSellerSSI2Rule.for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSI2Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintBuyerSSI2Rule.for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part1Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintDeliveringDepositoryAndParty1Part1Rule.
 * for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part1Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintReceivingDepositoryAndParty1Part1Rule.
 * for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part2Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintDeliveringDepositoryAndParty1Part2Rule.
 * for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part2Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintReceivingDepositoryAndParty1Part2Rule.
 * for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSI1Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSI1Rule#for_sese_SecuritiesFinancingInstruction002V06
 * ConstraintBuyerSSI1Rule.for_sese_SecuritiesFinancingInstruction002V06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingInstruction002V06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesFinancingInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction to allow the account servicer to manage the settlement and follow-up of the opening and closing leg of the transaction.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
 * SecuritiesFinancingInstruction002V07}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingInstruction002V06", propOrder = {"transactionIdentification", "transactionTypeAndAdditionalParameters", "numberCounts", "linkages", "tradeDetails", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "quantityAndAccountDetails", "securitiesFinancingDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties",
		"openingSettlementAmount", "otherAmounts", "otherBusinessParties", "supplementaryData"})
public class SecuritiesFinancingInstruction002V06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected RestrictedFINXMax16Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, RestrictedFINXMax16Text> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, RestrictedFINXMax16Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, RestrictedFINXMax16Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "TxTpAndAddtlParams", required = true)
	protected TransactionTypeAndAdditionalParameters13 transactionTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13
	 * TransactionTypeAndAdditionalParameters13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTpAndAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, TransactionTypeAndAdditionalParameters13> mmTransactionTypeAndAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, TransactionTypeAndAdditionalParameters13>() {
		{
			xmlTag = "TxTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndAdditionalParameters";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters13.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters13 getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getTransactionTypeAndAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, TransactionTypeAndAdditionalParameters13 value) {
			obj.setTransactionTypeAndAdditionalParameters(value);
		}
	};
	@XmlElement(name = "NbCounts")
	protected NumberCount1Choice numberCounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbCounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<NumberCount1Choice>> mmNumberCounts = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<NumberCount1Choice>>() {
		{
			xmlTag = "NbCounts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCounts";
			definition = "Count of the number of transactions linked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public Optional<NumberCount1Choice> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getNumberCounts();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<NumberCount1Choice> value) {
			obj.setNumberCounts(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages43> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages43
	 * Linkages43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, List<Linkages43>> mmLinkages = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, List<Linkages43>>() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			minOccurs = 0;
			complexType_lazy = () -> Linkages43.mmObject();
		}

		@Override
		public List<Linkages43> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, List<Linkages43> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails59 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
	 * SecuritiesTradeDetails59}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecuritiesTradeDetails59> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecuritiesTradeDetails59>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails59.mmObject();
		}

		@Override
		public SecuritiesTradeDetails59 getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, SecuritiesTradeDetails59 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification20 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecurityIdentification20> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecurityIdentification20>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public SecurityIdentification20 getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, SecurityIdentification20 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes78 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
	 * FinancialInstrumentAttributes78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<FinancialInstrumentAttributes78>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<FinancialInstrumentAttributes78>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes78> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<FinancialInstrumentAttributes78> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount47 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47
	 * QuantityAndAccount47}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, QuantityAndAccount47> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, QuantityAndAccount47>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount47.mmObject();
		}

		@Override
		public QuantityAndAccount47 getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, QuantityAndAccount47 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgDtls", required = true)
	protected SecuritiesFinancingTransactionDetails30 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30
	 * SecuritiesFinancingTransactionDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details for the closing of the securities financing transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecuritiesFinancingTransactionDetails30> mmSecuritiesFinancingDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, SecuritiesFinancingTransactionDetails30>() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details for the closing of the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails30.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionDetails30 getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getSecuritiesFinancingDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, SecuritiesFinancingTransactionDetails30 value) {
			obj.setSecuritiesFinancingDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails105 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105
	 * SettlementDetails105}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementDetails105>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementDetails105>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails105.mmObject();
		}

		@Override
		public Optional<SettlementDetails105> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<SettlementDetails105> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction12 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12
	 * StandingSettlementInstruction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<StandingSettlementInstruction12>> mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<StandingSettlementInstruction12>>() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction12.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction12> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<StandingSettlementInstruction12> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties44 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementParties44>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementParties44>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<SettlementParties44> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties44 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementParties44>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<SettlementParties44>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<SettlementParties44> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties30 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties30
	 * CashParties30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<CashParties30>> mmCashParties = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<CashParties30>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties30.mmObject();
		}

		@Override
		public Optional<CashParties30> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<CashParties30> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngSttlmAmt")
	protected AmountAndDirection60 openingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60
	 * AmountAndDirection60}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<AmountAndDirection60>> mmOpeningSettlementAmount = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<AmountAndDirection60>>() {
		{
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection60.mmObject();
		}

		@Override
		public Optional<AmountAndDirection60> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getOpeningSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<AmountAndDirection60> value) {
			obj.setOpeningSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts35 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts35
	 * OtherAmounts35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<OtherAmounts35>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<OtherAmounts35>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts35.mmObject();
		}

		@Override
		public Optional<OtherAmounts35> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<OtherAmounts35> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties29 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties29
	 * OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<OtherParties29>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, Optional<OtherParties29>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties29.mmObject();
		}

		@Override
		public Optional<OtherParties29> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, Optional<OtherParties29> value) {
			obj.setOtherBusinessParties(value.orElse(null));
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingInstruction002V06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingInstruction002V06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingInstruction002V06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSellerSSI2Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintBuyerSSI2Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part1Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part1Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Part2Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Part2Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSellerSSI1Rule.for_sese_SecuritiesFinancingInstruction002V06,
						com.tools20022.repository.constraints.ConstraintBuyerSSI1Rule.for_sese_SecuritiesFinancingInstruction002V06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingInstruction002V06";
				definition = "Scope\r\nAn account owner sends a SecuritiesFinancingInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction to allow the account servicer to manage the settlement and follow-up of the opening and closing leg of the transaction.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manage a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingInstruction002V07.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchivesubsetsvariants.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmTransactionTypeAndAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmNumberCounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmLinkages, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmFinancialInstrumentIdentification, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmQuantityAndAccountDetails, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmSettlementParameters, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmDeliveringSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmCashParties, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmOpeningSettlementAmount,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmOtherAmounts, com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "033";
						version = "06";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingInstruction002V06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesFinancingInstruction002V06 setTransactionIdentification(RestrictedFINXMax16Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public TransactionTypeAndAdditionalParameters13 getTransactionTypeAndAdditionalParameters() {
		return transactionTypeAndAdditionalParameters;
	}

	public SecuritiesFinancingInstruction002V06 setTransactionTypeAndAdditionalParameters(TransactionTypeAndAdditionalParameters13 transactionTypeAndAdditionalParameters) {
		this.transactionTypeAndAdditionalParameters = Objects.requireNonNull(transactionTypeAndAdditionalParameters);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return numberCounts == null ? Optional.empty() : Optional.of(numberCounts);
	}

	public SecuritiesFinancingInstruction002V06 setNumberCounts(NumberCount1Choice numberCounts) {
		this.numberCounts = numberCounts;
		return this;
	}

	public List<Linkages43> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesFinancingInstruction002V06 setLinkages(List<Linkages43> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public SecuritiesTradeDetails59 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingInstruction002V06 setTradeDetails(SecuritiesTradeDetails59 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingInstruction002V06 setFinancialInstrumentIdentification(SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesFinancingInstruction002V06 setFinancialInstrumentAttributes(FinancialInstrumentAttributes78 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount47 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingInstruction002V06 setQuantityAndAccountDetails(QuantityAndAccount47 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SecuritiesFinancingTransactionDetails30 getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails;
	}

	public SecuritiesFinancingInstruction002V06 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails30 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = Objects.requireNonNull(securitiesFinancingDetails);
		return this;
	}

	public Optional<SettlementDetails105> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingInstruction002V06 setSettlementParameters(SettlementDetails105 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesFinancingInstruction002V06 setStandingSettlementInstructionDetails(StandingSettlementInstruction12 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties44> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingInstruction002V06 setDeliveringSettlementParties(SettlementParties44 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties44> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingInstruction002V06 setReceivingSettlementParties(SettlementParties44 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties30> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesFinancingInstruction002V06 setCashParties(CashParties30 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection60> getOpeningSettlementAmount() {
		return openingSettlementAmount == null ? Optional.empty() : Optional.of(openingSettlementAmount);
	}

	public SecuritiesFinancingInstruction002V06 setOpeningSettlementAmount(AmountAndDirection60 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
		return this;
	}

	public Optional<OtherAmounts35> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesFinancingInstruction002V06 setOtherAmounts(OtherAmounts35 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesFinancingInstruction002V06 setOtherBusinessParties(OtherParties29 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingInstruction002V06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.002.06")
	static public class Document {
		@XmlElement(name = "SctiesFincgInstr", required = true)
		public SecuritiesFinancingInstruction002V06 messageBody;
	}
}