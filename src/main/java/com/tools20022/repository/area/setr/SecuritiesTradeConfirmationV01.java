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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeArchive;
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * Sent by an executing party to an instructing party directly or through
 * Central Matching Utility (CMU) to provide trade confirmation on a per-account
 * basis based on instructions provided by the instructing party in the
 * SecuritiesAllocationInstruction message.<br>
 * It may also be used to provide trade confirmation on the trade level from an
 * executing party or an instructing party to the custodian or an affirming
 * party directly or through CMU.<br>
 * The instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager or of other
 * categories of investors.<br>
 * The executing party is typically the broker/dealer or an intermediary
 * system/vendor communicating on behalf of the broker/dealer.<br>
 * The custodian or the affirming party is typically the custodian, trustee,
 * financial institution, intermediary system/vendor communicating on behalf of
 * them, or their agent.<br>
 * The ISO 20022 Business Application Header must be used<br>
 * <b>Usage</b><br>
 * Initiator: In local matching, the initiator of this message is always the
 * executing party. In central matching the initiator may be either the
 * executing party or instructing party.<br>
 * Respondent: instructing party, a custodian or an affirming party responds
 * with SecuritiesTradeConfirmationResponse (accept or reject) message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.027.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmIdentification
 * SecuritiesTradeConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmNumberCount
 * SecuritiesTradeConfirmationV01.mmNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmReferences
 * SecuritiesTradeConfirmationV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmTradeDetails
 * SecuritiesTradeConfirmationV01.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesTradeConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmFinancialInstrumentAttributes
 * SecuritiesTradeConfirmationV01.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmUnderlyingFinancialInstrument
 * SecuritiesTradeConfirmationV01.mmUnderlyingFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmStipulations
 * SecuritiesTradeConfirmationV01.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmConfirmationParties
 * SecuritiesTradeConfirmationV01.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmSettlementParameters
 * SecuritiesTradeConfirmationV01.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmStandingSettlementInstruction
 * SecuritiesTradeConfirmationV01.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationV01.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmCashParties
 * SecuritiesTradeConfirmationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmClearingDetails
 * SecuritiesTradeConfirmationV01.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmSettlementAmount
 * SecuritiesTradeConfirmationV01.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherAmounts
 * SecuritiesTradeConfirmationV01.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherPrices
 * SecuritiesTradeConfirmationV01.mmOtherPrices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherBusinessParties
 * SecuritiesTradeConfirmationV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmTwoLegTransactionDetails
 * SecuritiesTradeConfirmationV01.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmRegulatoryStipulations
 * SecuritiesTradeConfirmationV01.mmRegulatoryStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmSupplementaryData
 * SecuritiesTradeConfirmationV01.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesTradConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeConfirmationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nSent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to provide trade confirmation on a per-account basis based on instructions provided by the instructing party in the SecuritiesAllocationInstruction message.\r\nIt may also be used to provide trade confirmation on the trade level from an executing party or an instructing party to the custodian or an affirming party directly or through CMU.\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or the affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: In local matching, the initiator of this message is always the executing party. In central matching the initiator may be either the executing party or instructing party.\r\nRespondent: instructing party, a custodian or an affirming party responds with SecuritiesTradeConfirmationResponse (accept or reject) message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02
 * SecuritiesTradeConfirmationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeConfirmationV01", propOrder = {"identification", "numberCount", "references", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes", "underlyingFinancialInstrument",
		"stipulations", "confirmationParties", "settlementParameters", "standingSettlementInstruction", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "clearingDetails", "settlementAmount", "otherAmounts",
		"otherPrices", "otherBusinessParties", "twoLegTransactionDetails", "regulatoryStipulations", "supplementaryData"})
public class SecuritiesTradeConfirmationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected TransactiontIdentification4 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactiontIdentification4
	 * TransactiontIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an SecuritiesTradeConfirmation message as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, TransactiontIdentification4> mmIdentification = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, TransactiontIdentification4>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an SecuritiesTradeConfirmation message as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactiontIdentification4.mmObject();
		}

		@Override
		public TransactiontIdentification4 getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, TransactiontIdentification4 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "NbCnt")
	protected NumberCount1Choice numberCount;
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
	 * xmlTag} = "NbCnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<NumberCount1Choice>> mmNumberCount = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<NumberCount1Choice>>() {
		{
			xmlTag = "NbCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCount";
			definition = "Count of the number of transactions linked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public Optional<NumberCount1Choice> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getNumberCount();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<NumberCount1Choice> value) {
			obj.setNumberCount(value.orElse(null));
		}
	};
	@XmlElement(name = "Refs")
	protected List<Linkages15> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages15
	 * Linkages15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by a business party and/or market infrastructure. It may also be used to reference a previous transaction, for example, a block/allocation instruction, or tie a set of messages together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<Linkages15>> mmReferences = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<Linkages15>>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by a business party and/or market infrastructure. It may also be used to reference a previous transaction, for example, a block/allocation instruction, or tie a set of messages together.";
			minOccurs = 0;
			complexType_lazy = () -> Linkages15.mmObject();
		}

		@Override
		public List<Linkages15> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<Linkages15> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected Order14 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Order14 Order14}
	 * </li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Order14> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Order14>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Order14.mmObject();
		}

		@Override
		public Order14 getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Order14 value) {
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
	 * "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, SecurityIdentification14>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes31 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31
	 * FinancialInstrumentAttributes31}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<FinancialInstrumentAttributes31>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<FinancialInstrumentAttributes31>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes31.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes31> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<FinancialInstrumentAttributes31> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrm")
	protected List<UnderlyingFinancialInstrument1> underlyingFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument1
	 * UnderlyingFinancialInstrument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying financial instrument to which an trade confirmation is related."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<UnderlyingFinancialInstrument1>> mmUnderlyingFinancialInstrument = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<UnderlyingFinancialInstrument1>>() {
		{
			xmlTag = "UndrlygFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrument";
			definition = "Underlying financial instrument to which an trade confirmation is related.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingFinancialInstrument1.mmObject();
		}

		@Override
		public List<UnderlyingFinancialInstrument1> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getUnderlyingFinancialInstrument();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<UnderlyingFinancialInstrument1> value) {
			obj.setUnderlyingFinancialInstrument(value);
		}
	};
	@XmlElement(name = "Stiptns")
	protected FinancialInstrumentStipulations2 stipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional restrictions on the financial instrument, related to the stipulation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<FinancialInstrumentStipulations2>> mmStipulations = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<FinancialInstrumentStipulations2>>() {
		{
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Additional restrictions on the financial instrument, related to the stipulation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentStipulations2.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentStipulations2> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getStipulations();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<FinancialInstrumentStipulations2> value) {
			obj.setStipulations(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfPties", required = true)
	protected List<ConfirmationParties2> confirmationParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties involved in the confirmation of the details of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<ConfirmationParties2>> mmConfirmationParties = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<ConfirmationParties2>>() {
		{
			xmlTag = "ConfPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationParties";
			definition = "Parties involved in the confirmation of the details of a trade.";
			minOccurs = 1;
			complexType_lazy = () -> ConfirmationParties2.mmObject();
		}

		@Override
		public List<ConfirmationParties2> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getConfirmationParties();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<ConfirmationParties2> value) {
			obj.setConfirmationParties(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails43 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementDetails43>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementDetails43>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails43.mmObject();
		}

		@Override
		public Optional<SettlementDetails43> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<SettlementDetails43> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstr")
	protected StandingSettlementInstruction9 standingSettlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9
	 * StandingSettlementInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<StandingSettlementInstruction9>> mmStandingSettlementInstruction = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<StandingSettlementInstruction9>>() {
		{
			xmlTag = "StgSttlmInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction9.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction9> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getStandingSettlementInstruction();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<StandingSettlementInstruction9> value) {
			obj.setStandingSettlementInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties23 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementParties23>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementParties23>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		@Override
		public Optional<SettlementParties23> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<SettlementParties23> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties23 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementParties23>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<SettlementParties23>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		@Override
		public Optional<SettlementParties23> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<SettlementParties23> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties6 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties6
	 * CashParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash parties involved in the specific transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<CashParties6>> mmCashParties = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<CashParties6>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the specific transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties6.mmObject();
		}

		@Override
		public Optional<CashParties6> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<CashParties6> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrDtls")
	protected Clearing3 clearingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Clearing3
	 * Clearing3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides clearing member information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<Clearing3>> mmClearingDetails = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<Clearing3>>() {
		{
			xmlTag = "ClrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingDetails";
			definition = "Provides clearing member information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Clearing3.mmObject();
		}

		@Override
		public Optional<Clearing3> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getClearingDetails();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<Clearing3> value) {
			obj.setClearingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection28 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28
	 * AmountAndDirection28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities. The amount includes the principal with any commissions and fees or accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<AmountAndDirection28>> mmSettlementAmount = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<AmountAndDirection28>>() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities. The amount includes the principal with any commissions and fees or accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection28.mmObject();
		}

		@Override
		public Optional<AmountAndDirection28> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<AmountAndDirection28> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected List<OtherAmounts16> otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts16
	 * OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<OtherAmounts16>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<OtherAmounts16>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts16.mmObject();
		}

		@Override
		public List<OtherAmounts16> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<OtherAmounts16> value) {
			obj.setOtherAmounts(value);
		}
	};
	@XmlElement(name = "OthrPrics")
	protected List<OtherPrices1> otherPrices;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherPrices1
	 * OtherPrices1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrics"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPrices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other prices than the deal price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<OtherPrices1>> mmOtherPrices = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<OtherPrices1>>() {
		{
			xmlTag = "OthrPrics";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrices";
			definition = "Other prices than the deal price.";
			minOccurs = 0;
			complexType_lazy = () -> OtherPrices1.mmObject();
		}

		@Override
		public List<OtherPrices1> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getOtherPrices();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<OtherPrices1> value) {
			obj.setOtherPrices(value);
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties18 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties18
	 * OtherParties18}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<OtherParties18>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<OtherParties18>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties18.mmObject();
		}

		@Override
		public Optional<OtherParties18> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<OtherParties18> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "TwoLegTxDtls")
	protected TwoLegTransactionDetails1 twoLegTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoLegTxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a transaction that the trading parties are agreeing to repurchase, sell back or return the same or similar securities at a later time. \r\nThe two leg transaction details defines the closing leg conditions of a two leg transaction. It is also used to define the anticipated closing leg conditions at the time of opening the closed-end transaction. \r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<TwoLegTransactionDetails1>> mmTwoLegTransactionDetails = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<TwoLegTransactionDetails1>>() {
		{
			xmlTag = "TwoLegTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionDetails";
			definition = "Identifies a transaction that the trading parties are agreeing to repurchase, sell back or return the same or similar securities at a later time. \r\nThe two leg transaction details defines the closing leg conditions of a two leg transaction. It is also used to define the anticipated closing leg conditions at the time of opening the closed-end transaction. \r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TwoLegTransactionDetails1.mmObject();
		}

		@Override
		public Optional<TwoLegTransactionDetails1> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getTwoLegTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<TwoLegTransactionDetails1> value) {
			obj.setTwoLegTransactionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryStiptns")
	protected RegulatoryStipulations1 regulatoryStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryStipulations1
	 * RegulatoryStipulations1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryStiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies regulatory stipulations that financial institutions must be compliant with in the country, region, and/or area they conduct business."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<RegulatoryStipulations1>> mmRegulatoryStipulations = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, Optional<RegulatoryStipulations1>>() {
		{
			xmlTag = "RgltryStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryStipulations";
			definition = "Specifies regulatory stipulations that financial institutions must be compliant with in the country, region, and/or area they conduct business.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryStipulations1.mmObject();
		}

		@Override
		public Optional<RegulatoryStipulations1> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getRegulatoryStipulations();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, Optional<RegulatoryStipulations1> value) {
			obj.setRegulatoryStipulations(value.orElse(null));
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesTradeConfirmationV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesTradeConfirmationV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesTradeConfirmationV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeConfirmationV01";
				definition = "Scope\r\nSent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to provide trade confirmation on a per-account basis based on instructions provided by the instructing party in the SecuritiesAllocationInstruction message.\r\nIt may also be used to provide trade confirmation on the trade level from an executing party or an instructing party to the custodian or an affirming party directly or through CMU.\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or the affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: In local matching, the initiator of this message is always the executing party. In central matching the initiator may be either the executing party or instructing party.\r\nRespondent: instructing party, a custodian or an affirming party responds with SecuritiesTradeConfirmationResponse (accept or reject) message.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTradConf";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmIdentification, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmNumberCount,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmReferences, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmTradeDetails,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmFinancialInstrumentIdentification, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmUnderlyingFinancialInstrument, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmStipulations,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmConfirmationParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmSettlementParameters,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmStandingSettlementInstruction, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmDeliveringSettlementParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmReceivingSettlementParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmCashParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmClearingDetails, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmSettlementAmount,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmOtherAmounts, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmOtherPrices,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmOtherBusinessParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmTwoLegTransactionDetails,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmRegulatoryStipulations, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "027";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeConfirmationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactiontIdentification4 getIdentification() {
		return identification;
	}

	public SecuritiesTradeConfirmationV01 setIdentification(TransactiontIdentification4 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCount() {
		return numberCount == null ? Optional.empty() : Optional.of(numberCount);
	}

	public SecuritiesTradeConfirmationV01 setNumberCount(NumberCount1Choice numberCount) {
		this.numberCount = numberCount;
		return this;
	}

	public List<Linkages15> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public SecuritiesTradeConfirmationV01 setReferences(List<Linkages15> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Order14 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesTradeConfirmationV01 setTradeDetails(Order14 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesTradeConfirmationV01 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes31> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesTradeConfirmationV01 setFinancialInstrumentAttributes(FinancialInstrumentAttributes31 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public List<UnderlyingFinancialInstrument1> getUnderlyingFinancialInstrument() {
		return underlyingFinancialInstrument == null ? underlyingFinancialInstrument = new ArrayList<>() : underlyingFinancialInstrument;
	}

	public SecuritiesTradeConfirmationV01 setUnderlyingFinancialInstrument(List<UnderlyingFinancialInstrument1> underlyingFinancialInstrument) {
		this.underlyingFinancialInstrument = Objects.requireNonNull(underlyingFinancialInstrument);
		return this;
	}

	public Optional<FinancialInstrumentStipulations2> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public SecuritiesTradeConfirmationV01 setStipulations(FinancialInstrumentStipulations2 stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<ConfirmationParties2> getConfirmationParties() {
		return confirmationParties == null ? confirmationParties = new ArrayList<>() : confirmationParties;
	}

	public SecuritiesTradeConfirmationV01 setConfirmationParties(List<ConfirmationParties2> confirmationParties) {
		this.confirmationParties = Objects.requireNonNull(confirmationParties);
		return this;
	}

	public Optional<SettlementDetails43> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesTradeConfirmationV01 setSettlementParameters(SettlementDetails43 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<StandingSettlementInstruction9> getStandingSettlementInstruction() {
		return standingSettlementInstruction == null ? Optional.empty() : Optional.of(standingSettlementInstruction);
	}

	public SecuritiesTradeConfirmationV01 setStandingSettlementInstruction(StandingSettlementInstruction9 standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
		return this;
	}

	public Optional<SettlementParties23> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesTradeConfirmationV01 setDeliveringSettlementParties(SettlementParties23 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties23> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesTradeConfirmationV01 setReceivingSettlementParties(SettlementParties23 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties6> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesTradeConfirmationV01 setCashParties(CashParties6 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<Clearing3> getClearingDetails() {
		return clearingDetails == null ? Optional.empty() : Optional.of(clearingDetails);
	}

	public SecuritiesTradeConfirmationV01 setClearingDetails(Clearing3 clearingDetails) {
		this.clearingDetails = clearingDetails;
		return this;
	}

	public Optional<AmountAndDirection28> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesTradeConfirmationV01 setSettlementAmount(AmountAndDirection28 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public List<OtherAmounts16> getOtherAmounts() {
		return otherAmounts == null ? otherAmounts = new ArrayList<>() : otherAmounts;
	}

	public SecuritiesTradeConfirmationV01 setOtherAmounts(List<OtherAmounts16> otherAmounts) {
		this.otherAmounts = Objects.requireNonNull(otherAmounts);
		return this;
	}

	public List<OtherPrices1> getOtherPrices() {
		return otherPrices == null ? otherPrices = new ArrayList<>() : otherPrices;
	}

	public SecuritiesTradeConfirmationV01 setOtherPrices(List<OtherPrices1> otherPrices) {
		this.otherPrices = Objects.requireNonNull(otherPrices);
		return this;
	}

	public Optional<OtherParties18> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesTradeConfirmationV01 setOtherBusinessParties(OtherParties18 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<TwoLegTransactionDetails1> getTwoLegTransactionDetails() {
		return twoLegTransactionDetails == null ? Optional.empty() : Optional.of(twoLegTransactionDetails);
	}

	public SecuritiesTradeConfirmationV01 setTwoLegTransactionDetails(TwoLegTransactionDetails1 twoLegTransactionDetails) {
		this.twoLegTransactionDetails = twoLegTransactionDetails;
		return this;
	}

	public Optional<RegulatoryStipulations1> getRegulatoryStipulations() {
		return regulatoryStipulations == null ? Optional.empty() : Optional.of(regulatoryStipulations);
	}

	public SecuritiesTradeConfirmationV01 setRegulatoryStipulations(RegulatoryStipulations1 regulatoryStipulations) {
		this.regulatoryStipulations = regulatoryStipulations;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTradeConfirmationV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.027.001.01")
	static public class Document {
		@XmlElement(name = "SctiesTradConf", required = true)
		public SecuritiesTradeConfirmationV01 messageBody;
	}
}