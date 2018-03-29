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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Commission2;
import com.tools20022.repository.msg.Price1;
import com.tools20022.repository.msg.SecuritiesSettlement2;
import com.tools20022.repository.msg.TradingSession1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates the price of the bid response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmPrice
 * BidResponsePrice1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmCommission
 * BidResponsePrice1.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmGrossIndicator
 * BidResponsePrice1.mmGrossIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmSide
 * BidResponsePrice1.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmFairValue
 * BidResponsePrice1.mmFairValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmCountry
 * BidResponsePrice1.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmTradingSession
 * BidResponsePrice1.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmSettlementDetails
 * BidResponsePrice1.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BidResponsePrice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the price of the bid response."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BidResponsePrice1", propOrder = {"price", "commission", "grossIndicator", "side", "fairValue", "country", "tradingSession", "settlementDetails"})
public class BidResponsePrice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pric")
	protected Price1 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 44, FIXSynonym: 423</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of the instrument, applicable to the bid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, Optional<Price1>> mmPrice = new MMMessageAttribute<BidResponsePrice1, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "44"), new FIXSynonym(this, "423"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price of the instrument, applicable to the bid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(BidResponsePrice1 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Optional<Price1> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Comssn", required = true)
	protected Commission2 commission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Commission2
	 * Commission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
	 * SecuritiesQuoteVariable.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Comssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 12, FIXSynonym: 13</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, Commission2> mmCommission = new MMMessageAttribute<BidResponsePrice1, Commission2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "12"), new FIXSynonym(this, "13"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Commission2.mmObject();
		}

		@Override
		public Commission2 getValue(BidResponsePrice1 obj) {
			return obj.getCommission();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Commission2 value) {
			obj.setCommission(value);
		}
	};
	@XmlElement(name = "GrssInd", required = true)
	protected TrueFalseIndicator grossIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmGrossAmountIndicator
	 * ListTrading.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 430</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the bid response price is gross."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, TrueFalseIndicator> mmGrossIndicator = new MMMessageAttribute<BidResponsePrice1, TrueFalseIndicator>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "GrssInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "430"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossIndicator";
			definition = "Indicates whether the bid response price is gross.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(BidResponsePrice1 obj) {
			return obj.getGrossIndicator();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, TrueFalseIndicator value) {
			obj.setGrossIndicator(value);
		}
	};
	@XmlElement(name = "Sd", required = true)
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that bid is required on assumption that SideValue1 is Buy or Sell. SideValue2 can be derived by inference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, Side1Code> mmSide = new MMMessageAttribute<BidResponsePrice1, Side1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Indicates that bid is required on assumption that SideValue1 is Buy or Sell. SideValue2 can be derived by inference.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Side1Code getValue(BidResponsePrice1 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Side1Code value) {
			obj.setSide(value);
		}
	};
	@XmlElement(name = "FairVal")
	protected ActiveCurrencyAndAmount fairValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmFairValue
	 * ExchangeForPhysicalTrade.mmFairValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FairVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 406</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FairValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, Optional<ActiveCurrencyAndAmount>> mmFairValue = new MMMessageAttribute<BidResponsePrice1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmFairValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "FairVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "406"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FairValue";
			definition = "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(BidResponsePrice1 obj) {
			return obj.getFairValue();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFairValue(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 421</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country to which the residential status is applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BidResponsePrice1, Optional<CountryCode>> mmCountry = new MMMessageAttribute<BidResponsePrice1, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "421"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country to which the residential status is applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(BidResponsePrice1 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSsn")
	protected TradingSession1 tradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
	 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Established constraints under which a market operates."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BidResponsePrice1, Optional<TradingSession1>> mmTradingSession = new MMMessageAssociationEnd<BidResponsePrice1, Optional<TradingSession1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmQuoteTradingSession;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSession";
			definition = "Established constraints under which a market operates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingSession1.mmObject();
		}

		@Override
		public Optional<TradingSession1> getValue(BidResponsePrice1 obj) {
			return obj.getTradingSession();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Optional<TradingSession1> value) {
			obj.setTradingSession(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDtls")
	protected SecuritiesSettlement2 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesSettlement2
	 * SecuritiesSettlement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1
	 * BidResponsePrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BidResponsePrice1, Optional<SecuritiesSettlement2>> mmSettlementDetails = new MMMessageAssociationEnd<BidResponsePrice1, Optional<SecuritiesSettlement2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.BidResponsePrice1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlement2.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement2> getValue(BidResponsePrice1 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(BidResponsePrice1 obj, Optional<SecuritiesSettlement2> value) {
			obj.setSettlementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BidResponsePrice1.mmPrice, com.tools20022.repository.msg.BidResponsePrice1.mmCommission,
						com.tools20022.repository.msg.BidResponsePrice1.mmGrossIndicator, com.tools20022.repository.msg.BidResponsePrice1.mmSide, com.tools20022.repository.msg.BidResponsePrice1.mmFairValue,
						com.tools20022.repository.msg.BidResponsePrice1.mmCountry, com.tools20022.repository.msg.BidResponsePrice1.mmTradingSession, com.tools20022.repository.msg.BidResponsePrice1.mmSettlementDetails);
				trace_lazy = () -> Quote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BidResponsePrice1";
				definition = "Indicates the price of the bid response.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Price1> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public BidResponsePrice1 setPrice(Price1 price) {
		this.price = price;
		return this;
	}

	public Commission2 getCommission() {
		return commission;
	}

	public BidResponsePrice1 setCommission(Commission2 commission) {
		this.commission = Objects.requireNonNull(commission);
		return this;
	}

	public TrueFalseIndicator getGrossIndicator() {
		return grossIndicator;
	}

	public BidResponsePrice1 setGrossIndicator(TrueFalseIndicator grossIndicator) {
		this.grossIndicator = Objects.requireNonNull(grossIndicator);
		return this;
	}

	public Side1Code getSide() {
		return side;
	}

	public BidResponsePrice1 setSide(Side1Code side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFairValue() {
		return fairValue == null ? Optional.empty() : Optional.of(fairValue);
	}

	public BidResponsePrice1 setFairValue(ActiveCurrencyAndAmount fairValue) {
		this.fairValue = fairValue;
		return this;
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public BidResponsePrice1 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public Optional<TradingSession1> getTradingSession() {
		return tradingSession == null ? Optional.empty() : Optional.of(tradingSession);
	}

	public BidResponsePrice1 setTradingSession(TradingSession1 tradingSession) {
		this.tradingSession = tradingSession;
		return this;
	}

	public Optional<SecuritiesSettlement2> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public BidResponsePrice1 setSettlementDetails(SecuritiesSettlement2 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}
}