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
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends a SecuritiesSettlementTransactionInstruction to an
 * account servicer to instruct the receipt or delivery of financial instruments
 * with or without payment, physically or by book-entry.<br>
 * The account owner/servicer relationship may be:<br>
 * - a global custodian which has an account with a local custodian, or<br>
 * - an investment management institution which manages a fund account opened at
 * a custodian, or<br>
 * - a broker which has an account with a custodian, or<br>
 * - a central securities depository participant which has an account with a
 * central securities depository, or<br>
 * - a central securities depository which has an account with a custodian,
 * another central securities depository or another settlement market
 * infrastructure, or<br>
 * - a central counterparty or a stock exchange or a trade matching utility
 * which need to instruct the settlement of transactions to a central securities
 * depository or another settlement market infrastructure.<br>
 * <br>
 * <b>Usage</b><br>
 * The instruction may be linked to other settlement instructions, for example,
 * for a turnaround or back-to-back, or other transactions, for example, foreign
 * exchange deal, using the linkage functionality.<br>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmTransactionIdentification
 * SecuritiesSettlementTransactionInstruction002V06.mmTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmNumberCounts
 * SecuritiesSettlementTransactionInstruction002V06.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmLinkages
 * SecuritiesSettlementTransactionInstruction002V06.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmTradeDetails
 * SecuritiesSettlementTransactionInstruction002V06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionInstruction002V06.mmQuantityAndAccountDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmSettlementParameters
 * SecuritiesSettlementTransactionInstruction002V06.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstruction002V06.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmCashParties
 * SecuritiesSettlementTransactionInstruction002V06.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmSettlementAmount
 * SecuritiesSettlementTransactionInstruction002V06.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmOtherAmounts
 * SecuritiesSettlementTransactionInstruction002V06.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstruction002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmSupplementaryData
 * SecuritiesSettlementTransactionInstruction002V06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchivesubsetsvariants
 * SecuritiesSettlementArchivesubsetsvariants}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.023.002.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintCurrencyToBuyRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToSellRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintCurrencyToSellRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintSettlementAmountRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPairOffTurnRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintPairOffTurnRule.forSecuritiesSettlementTransactionInstruction002V06
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintReceivingDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintSellerSSIRule.forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintSecuritiesFinancingSettlementRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyToCoverRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintBuyToCoverRule.forSecuritiesSettlementTransactionInstruction002V06}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintRegistrationDetailsRule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintLinkageGuideline.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintTwoLegTransactionOpeningClosing2Rule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstruction002V06
 * ConstraintTwoLegTransactionOpeningClosing1Rule.
 * forSecuritiesSettlementTransactionInstruction002V06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionInstruction002V06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionInstruction to an account servicer to instruct the receipt or delivery of financial instruments with or without payment, physically or by book-entry.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manages a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe instruction may be linked to other settlement instructions, for example, for a turnaround or back-to-back, or other transactions, for example, foreign exchange deal, using the linkage functionality.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
 * SecuritiesSettlementTransactionInstruction002V07}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionInstruction002V06", propOrder = {"transactionIdentification", "settlementTypeAndAdditionalParameters", "numberCounts", "linkages", "tradeDetails", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settlementAmount",
		"otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionInstruction002V06 {

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
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmTpAndAddtlParams", required = true)
	protected SettlementTypeAndAdditionalParameters16 settlementTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16
	 * SettlementTypeAndAdditionalParameters16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTpAndAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides settlement type and identification information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementTypeAndAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTypeAndAdditionalParameters";
			definition = "Provides settlement type and identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndAdditionalParameters16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getSettlementTypeAndAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmNumberCounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "NbCounts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCounts";
			definition = "Count of the number of transactions linked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getNumberCounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmLinkages = new MMMessageBuildingBlock() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			minOccurs = 0;
			complexType_lazy = () -> Linkages43.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getLinkages", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails63 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	 * definition} = "Details of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification20.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount47.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails112 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
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
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails112.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties30.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection60 settlementAmount;
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
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection60.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters5 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5
	 * RegistrationParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getAdditionalPhysicalOrRegistrationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionInstruction002V06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintCurrencyToSellRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSettlementAmountRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintPairOffTurnRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSellerSSIRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintBuyToCoverRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstruction002V06,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstruction002V06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionInstruction002V06";
				definition = "Scope\r\nAn account owner sends a SecuritiesSettlementTransactionInstruction to an account servicer to instruct the receipt or delivery of financial instruments with or without payment, physically or by book-entry.\r\nThe account owner/servicer relationship may be:\r\n- a global custodian which has an account with a local custodian, or\r\n- an investment management institution which manages a fund account opened at a custodian, or\r\n- a broker which has an account with a custodian, or\r\n- a central securities depository participant which has an account with a central securities depository, or\r\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\r\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of transactions to a central securities depository or another settlement market infrastructure.\r\n\r\nUsage\r\nThe instruction may be linked to other settlement instructions, for example, for a turnaround or back-to-back, or other transactions, for example, foreign exchange deal, using the linkage functionality.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstruction002V07.mmObject());
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchivesubsetsvariants.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmNumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmLinkages,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmSettlementAmount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "023";
						version = "06";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionInstruction002V06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setTransactionIdentification(RestrictedFINXMax16Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public SettlementTypeAndAdditionalParameters16 getSettlementTypeAndAdditionalParameters() {
		return settlementTypeAndAdditionalParameters;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setSettlementTypeAndAdditionalParameters(SettlementTypeAndAdditionalParameters16 settlementTypeAndAdditionalParameters) {
		this.settlementTypeAndAdditionalParameters = Objects.requireNonNull(settlementTypeAndAdditionalParameters);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return numberCounts == null ? Optional.empty() : Optional.of(numberCounts);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setNumberCounts(NumberCount1Choice numberCounts) {
		this.numberCounts = numberCounts;
		return this;
	}

	public List<Linkages43> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setLinkages(List<Linkages43> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public SecuritiesTradeDetails63 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setTradeDetails(SecuritiesTradeDetails63 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setFinancialInstrumentIdentification(SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setFinancialInstrumentAttributes(FinancialInstrumentAttributes78 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount47 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setQuantityAndAccountDetails(QuantityAndAccount47 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SettlementDetails112 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setSettlementParameters(SettlementDetails112 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setStandingSettlementInstructionDetails(StandingSettlementInstruction12 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties44> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setDeliveringSettlementParties(SettlementParties44 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties44> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setReceivingSettlementParties(SettlementParties44 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties30> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setCashParties(CashParties30 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection60> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setSettlementAmount(AmountAndDirection60 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts35> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setOtherAmounts(OtherAmounts35 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setOtherBusinessParties(OtherParties29 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters5> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionInstruction002V06 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters5 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionInstruction002V06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.023.002.06")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxInstr", required = true)
		public SecuritiesSettlementTransactionInstruction002V06 messageBody;
	}
}