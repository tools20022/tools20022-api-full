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
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account owner sends a SecuritiesSettlementTransactionInstruction to
 * an account servicer to instruct the receipt or delivery of financial
 * instruments with or without payment, physically or by book-entry. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with a local custodian, or - an investment management institution which
 * manages a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct the settlement of transactions to a central securities
 * depository or another settlement market infrastructure.
 * 
 * Usage The instruction may be linked to other settlement instructions, for
 * example, for a turnaround or back-to-back, or other transactions, for
 * example, foreign exchange deal, using the linkage functionality. The message
 * may also be used to: - re-send a message previously sent, - provide a third
 * party with a copy of a message for information, - re-send to a third party a
 * copy of a message for information using the relevant elements in the Business
 * Application Header.
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
 * messageDefinitionIdentifier} = {@code sese.023.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmTransactionIdentification
 * SecuritiesSettlementTransactionInstructionV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionInstructionV04.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmNumberCounts
 * SecuritiesSettlementTransactionInstructionV04.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmLinkages
 * SecuritiesSettlementTransactionInstructionV04.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmTradeDetails
 * SecuritiesSettlementTransactionInstructionV04.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionInstructionV04.mmFinancialInstrumentAttributes
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionInstructionV04.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmSettlementParameters
 * SecuritiesSettlementTransactionInstructionV04.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstructionV04.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionInstructionV04.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionInstructionV04.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmCashParties
 * SecuritiesSettlementTransactionInstructionV04.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmSettlementAmount
 * SecuritiesSettlementTransactionInstructionV04.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmOtherAmounts
 * SecuritiesSettlementTransactionInstructionV04.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstructionV04.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionInstructionV04.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmSupplementaryData
 * SecuritiesSettlementTransactionInstructionV04.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesSttlmTxInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionInstructionV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account owner sends a SecuritiesSettlementTransactionInstruction to an account servicer to instruct the receipt or delivery of financial instruments with or without payment, physically or by book-entry.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manages a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe instruction may be linked to other settlement instructions, for example, for a turnaround or back-to-back, or other transactions, for example, foreign exchange deal, using the linkage functionality.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintCurrencyToBuyRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToSellRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintCurrencyToSellRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintSettlementAmountRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPairOffTurnRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintPairOffTurnRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintReceivingDepositoryAndParty1Rule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintSellerSSIRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintBuyerSSIRule.for_sese_SecuritiesSettlementTransactionInstructionV04
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintSecuritiesFinancingSettlementRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintCoexistenceAmountRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyToCoverRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintBuyToCoverRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintRegistrationDetailsRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintLinkageGuideline.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintTwoLegTransactionOpeningClosing2Rule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV04
 * ConstraintTwoLegTransactionOpeningClosing1Rule.
 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
 * SecuritiesSettlementTransactionInstructionV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
 * SecuritiesSettlementTransactionInstructionV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionInstructionV04", propOrder = {"transactionIdentification", "settlementTypeAndAdditionalParameters", "numberCounts", "linkages", "tradeDetails", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settlementAmount",
		"otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionInstructionV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmTransactionIdentification
	 * SecuritiesSettlementTransactionInstructionV05.mmTransactionIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SttlmTpAndAddtlParams", required = true)
	protected SettlementTypeAndAdditionalParameters9 settlementTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9
	 * SettlementTypeAndAdditionalParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTpAndAddtlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides settlement type and identification information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmSettlementTypeAndAdditionalParameters
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmSettlementTypeAndAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SettlementTypeAndAdditionalParameters9> mmSettlementTypeAndAdditionalParameters = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SettlementTypeAndAdditionalParameters9>() {
		{
			xmlTag = "SttlmTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTypeAndAdditionalParameters";
			definition = "Provides settlement type and identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmSettlementTypeAndAdditionalParameters);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndAdditionalParameters9.mmObject();
		}

		@Override
		public SettlementTypeAndAdditionalParameters9 getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getSettlementTypeAndAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, SettlementTypeAndAdditionalParameters9 value) {
			obj.setSettlementTypeAndAdditionalParameters(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmNumberCounts
	 * SecuritiesSettlementTransactionInstructionV05.mmNumberCounts}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<NumberCount1Choice>> mmNumberCounts = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<NumberCount1Choice>>() {
		{
			xmlTag = "NbCounts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCounts";
			definition = "Count of the number of transactions linked.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmNumberCounts);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public Optional<NumberCount1Choice> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getNumberCounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<NumberCount1Choice> value) {
			obj.setNumberCounts(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages17> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages17
	 * Linkages17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmLinkages
	 * SecuritiesSettlementTransactionInstructionV05.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, List<Linkages17>> mmLinkages = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, List<Linkages17>>() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmLinkages);
			minOccurs = 0;
			complexType_lazy = () -> Linkages17.mmObject();
		}

		@Override
		public List<Linkages17> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, List<Linkages17> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails1 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
	 * SecuritiesTradeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmTradeDetails
	 * SecuritiesSettlementTransactionInstructionV05.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SecuritiesTradeDetails1> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SecuritiesTradeDetails1>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmTradeDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails1.mmObject();
		}

		@Override
		public SecuritiesTradeDetails1 getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, SecuritiesTradeDetails1 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SecurityIdentification14>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes35 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<FinancialInstrumentAttributes35>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<FinancialInstrumentAttributes35>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmFinancialInstrumentAttributes);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes35> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<FinancialInstrumentAttributes35> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount25 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionInstructionV05.mmQuantityAndAccountDetails
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, QuantityAndAccount25> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, QuantityAndAccount25>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmQuantityAndAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public QuantityAndAccount25 getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, QuantityAndAccount25 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails42 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmSettlementParameters
	 * SecuritiesSettlementTransactionInstructionV05.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SettlementDetails42> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, SettlementDetails42>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmSettlementParameters);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails42.mmObject();
		}

		@Override
		public SettlementDetails42 getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, SettlementDetails42 value) {
			obj.setSettlementParameters(value);
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction4 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<StandingSettlementInstruction4>> mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<StandingSettlementInstruction4>>() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmStandingSettlementInstructionDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction4.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction4> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<StandingSettlementInstruction4> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties11 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<SettlementParties11>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<SettlementParties11>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmDeliveringSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties11.mmObject();
		}

		@Override
		public Optional<SettlementParties11> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<SettlementParties11> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties11 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<SettlementParties11>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<SettlementParties11>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmReceivingSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties11.mmObject();
		}

		@Override
		public Optional<SettlementParties11> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<SettlementParties11> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties17 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties17
	 * CashParties17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmCashParties
	 * SecuritiesSettlementTransactionInstructionV05.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<CashParties17>> mmCashParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<CashParties17>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmCashParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties17.mmObject();
		}

		@Override
		public Optional<CashParties17> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<CashParties17> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection2 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmSettlementAmount
	 * SecuritiesSettlementTransactionInstructionV05.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<AmountAndDirection2>> mmSettlementAmount = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<AmountAndDirection2>>() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection2.mmObject();
		}

		@Override
		public Optional<AmountAndDirection2> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<AmountAndDirection2> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts14 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts14
	 * OtherAmounts14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmOtherAmounts
	 * SecuritiesSettlementTransactionInstructionV05.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<OtherAmounts14>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<OtherAmounts14>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmOtherAmounts);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts14.mmObject();
		}

		@Override
		public Optional<OtherAmounts14> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<OtherAmounts14> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties19 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties19
	 * OtherParties19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionInstructionV05.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<OtherParties19>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<OtherParties19>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmOtherBusinessParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties19.mmObject();
		}

		@Override
		public Optional<OtherParties19> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<OtherParties19> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters1 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1
	 * RegistrationParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionInstructionV05.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<RegistrationParameters1>> mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, Optional<RegistrationParameters1>>() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmAdditionalPhysicalOrRegistrationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters1.mmObject();
		}

		@Override
		public Optional<RegistrationParameters1> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getAdditionalPhysicalOrRegistrationDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, Optional<RegistrationParameters1> value) {
			obj.setAdditionalPhysicalOrRegistrationDetails(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmSupplementaryData
	 * SecuritiesSettlementTransactionInstructionV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementTransactionInstructionV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionInstructionV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionInstructionV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintCurrencyToSellRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintPairOffTurnRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintSellerSSIRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintBuyToCoverRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintLinkageGuideline.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.for_sese_SecuritiesSettlementTransactionInstructionV04,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionInstructionV04";
				definition = "Scope\nAn account owner sends a SecuritiesSettlementTransactionInstruction to an account servicer to instruct the receipt or delivery of financial instruments with or without payment, physically or by book-entry.\nThe account owner/servicer relationship may be:\n- a global custodian which has an account with a local custodian, or\n- an investment management institution which manages a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository participant which has an account with a central securities depository, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or\n- a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of transactions to a central securities depository or another settlement market infrastructure.\n\nUsage\nThe instruction may be linked to other settlement instructions, for example, for a turnaround or back-to-back, or other transactions, for example, foreign exchange deal, using the linkage functionality.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV05.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmNumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmLinkages,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmSettlementAmount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "023";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionInstructionV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionInstructionV04 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public SettlementTypeAndAdditionalParameters9 getSettlementTypeAndAdditionalParameters() {
		return settlementTypeAndAdditionalParameters;
	}

	public SecuritiesSettlementTransactionInstructionV04 setSettlementTypeAndAdditionalParameters(SettlementTypeAndAdditionalParameters9 settlementTypeAndAdditionalParameters) {
		this.settlementTypeAndAdditionalParameters = Objects.requireNonNull(settlementTypeAndAdditionalParameters);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return numberCounts == null ? Optional.empty() : Optional.of(numberCounts);
	}

	public SecuritiesSettlementTransactionInstructionV04 setNumberCounts(NumberCount1Choice numberCounts) {
		this.numberCounts = numberCounts;
		return this;
	}

	public List<Linkages17> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesSettlementTransactionInstructionV04 setLinkages(List<Linkages17> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public SecuritiesTradeDetails1 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionInstructionV04 setTradeDetails(SecuritiesTradeDetails1 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionInstructionV04 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes35> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionInstructionV04 setFinancialInstrumentAttributes(FinancialInstrumentAttributes35 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount25 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionInstructionV04 setQuantityAndAccountDetails(QuantityAndAccount25 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SettlementDetails42 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionInstructionV04 setSettlementParameters(SettlementDetails42 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<StandingSettlementInstruction4> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesSettlementTransactionInstructionV04 setStandingSettlementInstructionDetails(StandingSettlementInstruction4 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties11> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionInstructionV04 setDeliveringSettlementParties(SettlementParties11 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties11> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionInstructionV04 setReceivingSettlementParties(SettlementParties11 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties17> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionInstructionV04 setCashParties(CashParties17 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection2> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesSettlementTransactionInstructionV04 setSettlementAmount(AmountAndDirection2 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts14> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionInstructionV04 setOtherAmounts(OtherAmounts14 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties19> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionInstructionV04 setOtherBusinessParties(OtherParties19 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionInstructionV04 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters1 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionInstructionV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.023.001.04")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxInstr", required = true)
		public SecuritiesSettlementTransactionInstructionV04 messageBody;
	}
}