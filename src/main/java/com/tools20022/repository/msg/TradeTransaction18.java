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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice;
import com.tools20022.repository.choice.TradeConfirmation1Choice;
import com.tools20022.repository.codeset.PhysicalTransferType4Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details of trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmUniqueTradeIdentifier
 * TradeTransaction18.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmReportTrackingNumber
 * TradeTransaction18.mmReportTrackingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmComplexTradeIdentification
 * TradeTransaction18.mmComplexTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmTradingVenue
 * TradeTransaction18.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmCompression
 * TradeTransaction18.mmCompression}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmPrice
 * TradeTransaction18.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmNotionalAmount
 * TradeTransaction18.mmNotionalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmPriceMultiplier
 * TradeTransaction18.mmPriceMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmQuantity
 * TradeTransaction18.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmUpFrontPayment
 * TradeTransaction18.mmUpFrontPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmDeliveryType
 * TradeTransaction18.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmExecutionDateTime
 * TradeTransaction18.mmExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmEffectiveDate
 * TradeTransaction18.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmMaturityDate
 * TradeTransaction18.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmTerminationDate
 * TradeTransaction18.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmSettlementDate
 * TradeTransaction18.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmMasterAgreement
 * TradeTransaction18.mmMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmTradeConfirmation
 * TradeTransaction18.mmTradeConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmTradeClearing
 * TradeTransaction18.mmTradeClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmInterestRate
 * TradeTransaction18.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmCurrency
 * TradeTransaction18.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmCommodity
 * TradeTransaction18.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmOption
 * TradeTransaction18.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmCredit
 * TradeTransaction18.mmCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransaction18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details of trade transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeTransaction18", propOrder = {"uniqueTradeIdentifier", "reportTrackingNumber", "complexTradeIdentification", "tradingVenue", "compression", "price", "notionalAmount", "priceMultiplier", "quantity", "upFrontPayment",
		"deliveryType", "executionDateTime", "effectiveDate", "maturityDate", "terminationDate", "settlementDate", "masterAgreement", "tradeConfirmation", "tradeClearing", "interestRate", "currency", "commodity", "option", "credit"})
public class TradeTransaction18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnqTradIdr", required = true)
	protected Max52Text uniqueTradeIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqTradIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique trade Identifier (UTI) as agreed with the counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Max52Text> mmUniqueTradeIdentifier = new MMMessageAttribute<TradeTransaction18, Max52Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "UnqTradIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "Unique trade Identifier (UTI) as agreed with the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Max52Text getValue(TradeTransaction18 obj) {
			return obj.getUniqueTradeIdentifier();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Max52Text value) {
			obj.setUniqueTradeIdentifier(value);
		}
	};
	@XmlElement(name = "RptTrckgNb")
	protected Max52Text reportTrackingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTrckgNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTrackingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number to indicate a group of reports which relate to the same execution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Optional<Max52Text>> mmReportTrackingNumber = new MMMessageAttribute<TradeTransaction18, Optional<Max52Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "RptTrckgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTrackingNumber";
			definition = "Unique number to indicate a group of reports which relate to the same execution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Optional<Max52Text> getValue(TradeTransaction18 obj) {
			return obj.getReportTrackingNumber();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<Max52Text> value) {
			obj.setReportTrackingNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CmplxTradId")
	protected Max35Text complexTradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplxTradId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplexTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, internal to the reporting firm to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the firm for the group of reports for the execution.\r\n\r\nUsage: Field only applies when the instrument is complex.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Optional<Max35Text>> mmComplexTradeIdentification = new MMMessageAttribute<TradeTransaction18, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "CmplxTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplexTradeIdentification";
			definition = "Identification, internal to the reporting firm to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the firm for the group of reports for the execution.\r\n\r\nUsage: Field only applies when the instrument is complex.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeTransaction18 obj) {
			return obj.getComplexTradeIdentification();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<Max35Text> value) {
			obj.setComplexTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgVn", required = true)
	protected MICIdentifier tradingVenue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Venue of execution identified by a unique code for this venue. \r\nIn case of a contract concluded OTC, it has to be identified using specific MIC codes designating OTC transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, MICIdentifier> mmTradingVenue = new MMMessageAttribute<TradeTransaction18, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Venue of execution identified by a unique code for this venue. \r\nIn case of a contract concluded OTC, it has to be identified using specific MIC codes designating OTC transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(TradeTransaction18 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TradeTransaction18 obj, MICIdentifier value) {
			obj.setTradingVenue(value);
		}
	};
	@XmlElement(name = "Cmprssn")
	protected TrueFalseIndicator compression;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmprssn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compression"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the contract results from a compression operation or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Optional<TrueFalseIndicator>> mmCompression = new MMMessageAttribute<TradeTransaction18, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Cmprssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compression";
			definition = "Identifies whether the contract results from a compression operation or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TradeTransaction18 obj) {
			return obj.getCompression();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<TrueFalseIndicator> value) {
			obj.setCompression(value.orElse(null));
		}
	};
	@XmlElement(name = "Pric", required = true)
	protected SecuritiesTransactionPrice8Choice price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice
	 * SecuritiesTransactionPrice8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price per derivative excluding, where applicable, commission and accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, SecuritiesTransactionPrice8Choice> mmPrice = new MMMessageAssociationEnd<TradeTransaction18, SecuritiesTransactionPrice8Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price per derivative excluding, where applicable, commission and accrued interest.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionPrice8Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionPrice8Choice getValue(TradeTransaction18 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(TradeTransaction18 obj, SecuritiesTransactionPrice8Choice value) {
			obj.setPrice(value);
		}
	};
	@XmlElement(name = "NtnlAmt", required = true)
	protected AmountAndDirection56 notionalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection56
	 * AmountAndDirection56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
	 * Derivative.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference amount from which contractual payments are determined.\r\n\r\nUsage: In case of partial terminations, and amortisations and in case of contracts where the notional, due to the characteristics of the contract, varies over time, it shall reflect the remaining notional after the change took place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, AmountAndDirection56> mmNotionalAmount = new MMMessageAssociationEnd<TradeTransaction18, AmountAndDirection56>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "NtnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalAmount";
			definition = "Reference amount from which contractual payments are determined.\r\n\r\nUsage: In case of partial terminations, and amortisations and in case of contracts where the notional, due to the characteristics of the contract, varies over time, it shall reflect the remaining notional after the change took place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection56.mmObject();
		}

		@Override
		public AmountAndDirection56 getValue(TradeTransaction18 obj) {
			return obj.getNotionalAmount();
		}

		@Override
		public void setValue(TradeTransaction18 obj, AmountAndDirection56 value) {
			obj.setNotionalAmount(value);
		}
	};
	@XmlElement(name = "PricMltplr", required = true)
	protected LongDecimalNumberFraction21 priceMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LongDecimalNumberFraction21
	 * LongDecimalNumberFraction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
	 * Option.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMltplr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the underlying instrument represented by a single derivative contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, LongDecimalNumberFraction21> mmPriceMultiplier = new MMMessageAttribute<TradeTransaction18, LongDecimalNumberFraction21>() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "PricMltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMultiplier";
			definition = "Number of units of the underlying instrument represented by a single derivative contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LongDecimalNumberFraction21.mmObject();
		}

		@Override
		public LongDecimalNumberFraction21 getValue(TradeTransaction18 obj) {
			return obj.getPriceMultiplier();
		}

		@Override
		public void setValue(TradeTransaction18 obj, LongDecimalNumberFraction21 value) {
			obj.setPriceMultiplier(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected FinancialInstrumentQuantity30Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice
	 * FinancialInstrumentQuantity30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the financial instrument, that is, the nominal value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, FinancialInstrumentQuantity30Choice> mmQuantity = new MMMessageAssociationEnd<TradeTransaction18, FinancialInstrumentQuantity30Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Number of units of the financial instrument, that is, the nominal value.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity30Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity30Choice getValue(TradeTransaction18 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(TradeTransaction18 obj, FinancialInstrumentQuantity30Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "UpFrntPmt")
	protected AmountAndDirection56 upFrontPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection56
	 * AmountAndDirection56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpFrntPmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpFrontPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money of any up-front payment the reporting counterparty made or received.\r\n\r\nUsage: The negative symbol to be used to indicate that the payment was made, not received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<AmountAndDirection56>> mmUpFrontPayment = new MMMessageAssociationEnd<TradeTransaction18, Optional<AmountAndDirection56>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "UpFrntPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpFrontPayment";
			definition = "Amount of money of any up-front payment the reporting counterparty made or received.\r\n\r\nUsage: The negative symbol to be used to indicate that the payment was made, not received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection56.mmObject();
		}

		@Override
		public Optional<AmountAndDirection56> getValue(TradeTransaction18 obj) {
			return obj.getUpFrontPayment();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<AmountAndDirection56> value) {
			obj.setUpFrontPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryTp", required = true)
	protected PhysicalTransferType4Code deliveryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is settled physically or in cash or decided at expiration time by counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, PhysicalTransferType4Code> mmDeliveryType = new MMMessageAttribute<TradeTransaction18, PhysicalTransferType4Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Indicates whether the financial instrument is settled physically or in cash or decided at expiration time by counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferType4Code.mmObject();
		}

		@Override
		public PhysicalTransferType4Code getValue(TradeTransaction18 obj) {
			return obj.getDeliveryType();
		}

		@Override
		public void setValue(TradeTransaction18 obj, PhysicalTransferType4Code value) {
			obj.setDeliveryType(value);
		}
	};
	@XmlElement(name = "ExctnDtTm", required = true)
	protected ISODateTime executionDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time when the contract was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, ISODateTime> mmExecutionDateTime = new MMMessageAttribute<TradeTransaction18, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "ExctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionDateTime";
			definition = "Indicates the date and time when the contract was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradeTransaction18 obj) {
			return obj.getExecutionDateTime();
		}

		@Override
		public void setValue(TradeTransaction18 obj, ISODateTime value) {
			obj.setExecutionDateTime(value);
		}
	};
	@XmlElement(name = "FctvDt", required = true)
	protected ISODate effectiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmEffectiveDate
	 * Asset.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date when obligations under the contract come into effect."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, ISODate> mmEffectiveDate = new MMMessageAttribute<TradeTransaction18, ISODate>() {
		{
			businessElementTrace_lazy = () -> Asset.mmEffectiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Indicates the date when obligations under the contract come into effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TradeTransaction18 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(TradeTransaction18 obj, ISODate value) {
			obj.setEffectiveDate(value);
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the original date of expiry of the reported contract. \r\n\r\nUsage: \r\nAn early termination shall not be reported in this field.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<TradeTransaction18, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Indicates the original date of expiry of the reported contract. \r\n\r\nUsage: \r\nAn early termination shall not be reported in this field.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeTransaction18 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnDt")
	protected ISODate terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date in the case of an early termination of the reported contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, Optional<ISODate>> mmTerminationDate = new MMMessageAttribute<TradeTransaction18, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Indicates the date in the case of an early termination of the reported contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeTransaction18 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<ISODate> value) {
			obj.setTerminationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt")
	protected List<ISODate> settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the date of settlement of the underlying."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction18, List<ISODate>> mmSettlementDate = new MMMessageAttribute<TradeTransaction18, List<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Indicates the date of settlement of the underlying.";
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public List<ISODate> getValue(TradeTransaction18 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(TradeTransaction18 obj, List<ISODate> value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "MstrAgrmt")
	protected MasterAgreement2 masterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MasterAgreement2
	 * MasterAgreement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
	 * SecuritiesFinancing.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the master agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<MasterAgreement2>> mmMasterAgreement = new MMMessageAssociationEnd<TradeTransaction18, Optional<MasterAgreement2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmFinancingAgreement;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "MstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAgreement";
			definition = "Details related to the master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MasterAgreement2.mmObject();
		}

		@Override
		public Optional<MasterAgreement2> getValue(TradeTransaction18 obj) {
			return obj.getMasterAgreement();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<MasterAgreement2> value) {
			obj.setMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "TradConf", required = true)
	protected TradeConfirmation1Choice tradeConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice
	 * TradeConfirmation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, TradeConfirmation1Choice> mmTradeConfirmation = new MMMessageAssociationEnd<TradeTransaction18, TradeConfirmation1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TradConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeConfirmation";
			definition = "Provides information on whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeConfirmation1Choice.mmObject();
		}

		@Override
		public TradeConfirmation1Choice getValue(TradeTransaction18 obj) {
			return obj.getTradeConfirmation();
		}

		@Override
		public void setValue(TradeTransaction18 obj, TradeConfirmation1Choice value) {
			obj.setTradeConfirmation(value);
		}
	};
	@XmlElement(name = "TradClr", required = true)
	protected TradeClearing2 tradeClearing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeClearing2
	 * TradeClearing2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradClr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to clearing of the reported contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, TradeClearing2> mmTradeClearing = new MMMessageAssociationEnd<TradeTransaction18, TradeClearing2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TradClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeClearing";
			definition = "Information related to clearing of the reported contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeClearing2.mmObject();
		}

		@Override
		public TradeClearing2 getValue(TradeTransaction18 obj) {
			return obj.getTradeClearing();
		}

		@Override
		public void setValue(TradeTransaction18 obj, TradeClearing2 value) {
			obj.setTradeClearing(value);
		}
	};
	@XmlElement(name = "IntrstRate")
	protected InterestRateLegs5 interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InterestRateLegs5
	 * InterestRateLegs5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to interest rate asset class type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<InterestRateLegs5>> mmInterestRate = new MMMessageAssociationEnd<TradeTransaction18, Optional<InterestRateLegs5>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Information related to interest rate asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateLegs5.mmObject();
		}

		@Override
		public Optional<InterestRateLegs5> getValue(TradeTransaction18 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<InterestRateLegs5> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyExchange11 currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyExchange11
	 * CurrencyExchange11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to currency asset class type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<CurrencyExchange11>> mmCurrency = new MMMessageAssociationEnd<TradeTransaction18, Optional<CurrencyExchange11>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Information related to currency asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyExchange11.mmObject();
		}

		@Override
		public Optional<CurrencyExchange11> getValue(TradeTransaction18 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<CurrencyExchange11> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmmdty")
	protected AssetClassCommodity1 commodity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AssetClassCommodity1
	 * AssetClassCommodity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmmdty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to commodity asset class type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<AssetClassCommodity1>> mmCommodity = new MMMessageAssociationEnd<TradeTransaction18, Optional<AssetClassCommodity1>>() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Cmmdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Information related to commodity asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AssetClassCommodity1.mmObject();
		}

		@Override
		public Optional<AssetClassCommodity1> getValue(TradeTransaction18 obj) {
			return obj.getCommodity();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<AssetClassCommodity1> value) {
			obj.setCommodity(value.orElse(null));
		}
	};
	@XmlElement(name = "Optn")
	protected OptionOrSwaption6 option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to credit derivative asset class type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<OptionOrSwaption6>> mmOption = new MMMessageAssociationEnd<TradeTransaction18, Optional<OptionOrSwaption6>>() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Information related to credit derivative asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionOrSwaption6.mmObject();
		}

		@Override
		public Optional<OptionOrSwaption6> getValue(TradeTransaction18 obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<OptionOrSwaption6> value) {
			obj.setOption(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdt")
	protected CreditDerivative3 credit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to credit derivative asset class type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction18, Optional<CreditDerivative3>> mmCredit = new MMMessageAssociationEnd<TradeTransaction18, Optional<CreditDerivative3>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Information related to credit derivative asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditDerivative3.mmObject();
		}

		@Override
		public Optional<CreditDerivative3> getValue(TradeTransaction18 obj) {
			return obj.getCredit();
		}

		@Override
		public void setValue(TradeTransaction18 obj, Optional<CreditDerivative3> value) {
			obj.setCredit(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransaction18.mmUniqueTradeIdentifier, com.tools20022.repository.msg.TradeTransaction18.mmReportTrackingNumber,
						com.tools20022.repository.msg.TradeTransaction18.mmComplexTradeIdentification, com.tools20022.repository.msg.TradeTransaction18.mmTradingVenue, com.tools20022.repository.msg.TradeTransaction18.mmCompression,
						com.tools20022.repository.msg.TradeTransaction18.mmPrice, com.tools20022.repository.msg.TradeTransaction18.mmNotionalAmount, com.tools20022.repository.msg.TradeTransaction18.mmPriceMultiplier,
						com.tools20022.repository.msg.TradeTransaction18.mmQuantity, com.tools20022.repository.msg.TradeTransaction18.mmUpFrontPayment, com.tools20022.repository.msg.TradeTransaction18.mmDeliveryType,
						com.tools20022.repository.msg.TradeTransaction18.mmExecutionDateTime, com.tools20022.repository.msg.TradeTransaction18.mmEffectiveDate, com.tools20022.repository.msg.TradeTransaction18.mmMaturityDate,
						com.tools20022.repository.msg.TradeTransaction18.mmTerminationDate, com.tools20022.repository.msg.TradeTransaction18.mmSettlementDate, com.tools20022.repository.msg.TradeTransaction18.mmMasterAgreement,
						com.tools20022.repository.msg.TradeTransaction18.mmTradeConfirmation, com.tools20022.repository.msg.TradeTransaction18.mmTradeClearing, com.tools20022.repository.msg.TradeTransaction18.mmInterestRate,
						com.tools20022.repository.msg.TradeTransaction18.mmCurrency, com.tools20022.repository.msg.TradeTransaction18.mmCommodity, com.tools20022.repository.msg.TradeTransaction18.mmOption,
						com.tools20022.repository.msg.TradeTransaction18.mmCredit);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeTransaction18";
				definition = "Provides details of trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max52Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public TradeTransaction18 setUniqueTradeIdentifier(Max52Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = Objects.requireNonNull(uniqueTradeIdentifier);
		return this;
	}

	public Optional<Max52Text> getReportTrackingNumber() {
		return reportTrackingNumber == null ? Optional.empty() : Optional.of(reportTrackingNumber);
	}

	public TradeTransaction18 setReportTrackingNumber(Max52Text reportTrackingNumber) {
		this.reportTrackingNumber = reportTrackingNumber;
		return this;
	}

	public Optional<Max35Text> getComplexTradeIdentification() {
		return complexTradeIdentification == null ? Optional.empty() : Optional.of(complexTradeIdentification);
	}

	public TradeTransaction18 setComplexTradeIdentification(Max35Text complexTradeIdentification) {
		this.complexTradeIdentification = complexTradeIdentification;
		return this;
	}

	public MICIdentifier getTradingVenue() {
		return tradingVenue;
	}

	public TradeTransaction18 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = Objects.requireNonNull(tradingVenue);
		return this;
	}

	public Optional<TrueFalseIndicator> getCompression() {
		return compression == null ? Optional.empty() : Optional.of(compression);
	}

	public TradeTransaction18 setCompression(TrueFalseIndicator compression) {
		this.compression = compression;
		return this;
	}

	public SecuritiesTransactionPrice8Choice getPrice() {
		return price;
	}

	public TradeTransaction18 setPrice(SecuritiesTransactionPrice8Choice price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public AmountAndDirection56 getNotionalAmount() {
		return notionalAmount;
	}

	public TradeTransaction18 setNotionalAmount(AmountAndDirection56 notionalAmount) {
		this.notionalAmount = Objects.requireNonNull(notionalAmount);
		return this;
	}

	public LongDecimalNumberFraction21 getPriceMultiplier() {
		return priceMultiplier;
	}

	public TradeTransaction18 setPriceMultiplier(LongDecimalNumberFraction21 priceMultiplier) {
		this.priceMultiplier = Objects.requireNonNull(priceMultiplier);
		return this;
	}

	public FinancialInstrumentQuantity30Choice getQuantity() {
		return quantity;
	}

	public TradeTransaction18 setQuantity(FinancialInstrumentQuantity30Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<AmountAndDirection56> getUpFrontPayment() {
		return upFrontPayment == null ? Optional.empty() : Optional.of(upFrontPayment);
	}

	public TradeTransaction18 setUpFrontPayment(AmountAndDirection56 upFrontPayment) {
		this.upFrontPayment = upFrontPayment;
		return this;
	}

	public PhysicalTransferType4Code getDeliveryType() {
		return deliveryType;
	}

	public TradeTransaction18 setDeliveryType(PhysicalTransferType4Code deliveryType) {
		this.deliveryType = Objects.requireNonNull(deliveryType);
		return this;
	}

	public ISODateTime getExecutionDateTime() {
		return executionDateTime;
	}

	public TradeTransaction18 setExecutionDateTime(ISODateTime executionDateTime) {
		this.executionDateTime = Objects.requireNonNull(executionDateTime);
		return this;
	}

	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public TradeTransaction18 setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = Objects.requireNonNull(effectiveDate);
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public TradeTransaction18 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODate> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public TradeTransaction18 setTerminationDate(ISODate terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}

	public List<ISODate> getSettlementDate() {
		return settlementDate == null ? settlementDate = new ArrayList<>() : settlementDate;
	}

	public TradeTransaction18 setSettlementDate(List<ISODate> settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<MasterAgreement2> getMasterAgreement() {
		return masterAgreement == null ? Optional.empty() : Optional.of(masterAgreement);
	}

	public TradeTransaction18 setMasterAgreement(MasterAgreement2 masterAgreement) {
		this.masterAgreement = masterAgreement;
		return this;
	}

	public TradeConfirmation1Choice getTradeConfirmation() {
		return tradeConfirmation;
	}

	public TradeTransaction18 setTradeConfirmation(TradeConfirmation1Choice tradeConfirmation) {
		this.tradeConfirmation = Objects.requireNonNull(tradeConfirmation);
		return this;
	}

	public TradeClearing2 getTradeClearing() {
		return tradeClearing;
	}

	public TradeTransaction18 setTradeClearing(TradeClearing2 tradeClearing) {
		this.tradeClearing = Objects.requireNonNull(tradeClearing);
		return this;
	}

	public Optional<InterestRateLegs5> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public TradeTransaction18 setInterestRate(InterestRateLegs5 interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<CurrencyExchange11> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public TradeTransaction18 setCurrency(CurrencyExchange11 currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AssetClassCommodity1> getCommodity() {
		return commodity == null ? Optional.empty() : Optional.of(commodity);
	}

	public TradeTransaction18 setCommodity(AssetClassCommodity1 commodity) {
		this.commodity = commodity;
		return this;
	}

	public Optional<OptionOrSwaption6> getOption() {
		return option == null ? Optional.empty() : Optional.of(option);
	}

	public TradeTransaction18 setOption(OptionOrSwaption6 option) {
		this.option = option;
		return this;
	}

	public Optional<CreditDerivative3> getCredit() {
		return credit == null ? Optional.empty() : Optional.of(credit);
	}

	public TradeTransaction18 setCredit(CreditDerivative3 credit) {
		this.credit = credit;
		return this;
	}
}