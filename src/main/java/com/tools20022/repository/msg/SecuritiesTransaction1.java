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
import com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code;
import com.tools20022.repository.codeset.VariationType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of the reported transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradeDate
 * SecuritiesTransaction1.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradingCapacity
 * SecuritiesTransaction1.mmTradingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmQuantity
 * SecuritiesTransaction1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmDerivativeNotionalChange
 * SecuritiesTransaction1.mmDerivativeNotionalChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmPrice
 * SecuritiesTransaction1.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmNetAmount
 * SecuritiesTransaction1.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradeVenue
 * SecuritiesTransaction1.mmTradeVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmCountryOfBranch
 * SecuritiesTransaction1.mmCountryOfBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmUpFrontPayment
 * SecuritiesTransaction1.mmUpFrontPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradePlaceMatchingIdentification
 * SecuritiesTransaction1.mmTradePlaceMatchingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmComplexTradeComponentIdentification
 * SecuritiesTransaction1.mmComplexTradeComponentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the reported transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTransaction1", propOrder = {"tradeDate", "tradingCapacity", "quantity", "derivativeNotionalChange", "price", "netAmount", "tradeVenue", "countryOfBranch", "upFrontPayment", "tradePlaceMatchingIdentification",
		"complexTradeComponentIdentification"})
public class SecuritiesTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected RegulatoryTradingCapacity1Code tradingCapacity;
	/**
	 * Indication of whether the transaction results from the reporting firm
	 * carrying out matched principal trading or dealing on own account under
	 * the local regulation, or where the transaction does not result from the
	 * reporting firm carrying out matched principal trading or dealing on own
	 * account, the field shall indicate that the transaction was carried out
	 * under any other capacity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code
	 * RegulatoryTradingCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether the transaction results from the reporting firm carrying out matched principal trading or dealing on own account under the local regulation, or where the transaction does not result from the reporting firm carrying out matched principal trading or dealing on own account, the field shall indicate that the transaction was carried out under any other capacity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Indication of whether the transaction results from the reporting firm carrying out matched principal trading or dealing on own account under the local regulation, or where the transaction does not result from the reporting firm carrying out matched principal trading or dealing on own account, the field shall indicate that the transaction was carried out under any other capacity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegulatoryTradingCapacity1Code.mmObject();
		}
	};
	protected FinancialInstrumentQuantity25Choice quantity;
	/**
	 * Number of units of the financial instrument, or the number of derivative
	 * contracts in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice
	 * FinancialInstrumentQuantity25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the financial instrument, or the number of derivative contracts in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Number of units of the financial instrument, or the number of derivative contracts in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity25Choice.mmObject();
		}
	};
	protected VariationType1Code derivativeNotionalChange;
	/**
	 * Indicates as to whether an increase or a decrease of notional of
	 * derivative contracts has taken place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VariationType1Code
	 * VariationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivNtnlChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeNotionalChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates as to whether an increase or a decrease of notional of derivative contracts has taken place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeNotionalChange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "DerivNtnlChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeNotionalChange";
			definition = "Indicates as to whether an increase or a decrease of notional of derivative contracts has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VariationType1Code.mmObject();
		}
	};
	protected SecuritiesTransactionPrice4Choice price;
	/**
	 * Traded price of the transaction excluding, where applicable, commission
	 * and accrued interest.<br>
	 * In the case of option contracts, it is the premium of the derivative
	 * contract per underlying security or index point.<br>
	 * In the case of spread bets it should be the reference price of the direct
	 * underlying instrument.<br>
	 * Where price is currently not available but pending, the value should be
	 * ’PNDG’.<br>
	 * For CDS it should be the coupon in basis points. <br>
	 * Where price reported in monetary terms, it shall be provided in the major
	 * currency unit.<br>
	 * Where price is not applicable the field should be left blank.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice
	 * SecuritiesTransactionPrice4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Traded price of the transaction excluding, where applicable, commission and accrued interest.\r\nIn the case of option contracts, it is the premium of the derivative contract per underlying security or index point.\r\nIn the case of spread bets it should be the reference price of the direct underlying instrument.\r\nWhere price is currently not available but pending, the value should be ’PNDG’.\r\nFor CDS it should be the coupon in basis points. \r\nWhere price reported in monetary terms, it shall be provided in the major currency unit.\r\nWhere price is not applicable the field should be left blank.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradePrice;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Traded price of the transaction excluding, where applicable, commission and accrued interest.\r\nIn the case of option contracts, it is the premium of the derivative contract per underlying security or index point.\r\nIn the case of spread bets it should be the reference price of the direct underlying instrument.\r\nWhere price is currently not available but pending, the value should be ’PNDG’.\r\nFor CDS it should be the coupon in basis points. \r\nWhere price reported in monetary terms, it shall be provided in the major currency unit.\r\nWhere price is not applicable the field should be left blank.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionPrice4Choice.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount netAmount;
	/**
	 * Net amount of the transaction means the cash amount which is paid by the
	 * buyer of the debt instrument upon the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of the transaction means the cash amount which is paid by the buyer of the debt instrument upon the settlement of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Net amount of the transaction means the cash amount which is paid by the buyer of the debt instrument upon the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected MICIdentifier tradeVenue;
	/**
	 * Identification of the venue where the transaction was executed.<br>
	 * <br>
	 * Usage: <br>
	 * Use the ISO 10383 segment MIC (4 characters) for financial instruments
	 * executed on a MiFID trading venue, System Internaliser (SI) or non-EU
	 * organised trading platform. Where the segment MIC does not exist, use the
	 * operating MIC. <br>
	 * <br>
	 * Use MIC code ‘XOFF’ for financial instruments admitted to trading or
	 * traded on a trading venue, where the transaction on that financial
	 * instrument is not executed on a MiFID trading venue, SI or non-EU
	 * organised trading platform, or where an investment firm does not know it
	 * is trading with another investment firm acting as an SI.<br>
	 * <br>
	 * Use MIC code ‘XXXX’ for financial instruments that are not admitted to
	 * trading or traded on a trading venue or for which no request for
	 * admission has been made and that are not traded on an non-EU organised
	 * trading platform but where the underlying is admitted to trading or
	 * traded on a trading venue.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the venue where the transaction was executed.\r\n\r\nUsage: \r\nUse the ISO 10383 segment MIC (4 characters) for financial instruments executed on a MiFID trading venue, System Internaliser (SI) or non-EU organised trading platform. Where the segment MIC does not exist, use the operating MIC. \r\n\r\nUse MIC code ‘XOFF’ for financial instruments admitted to trading or traded on a trading venue, where the transaction on that financial instrument is not executed on a MiFID trading venue, SI or non-EU organised trading platform, or where an investment firm does not know it is trading with another investment firm acting as an SI.\r\n\r\nUse MIC code ‘XXXX’ for financial instruments that are not admitted to trading or traded on a trading venue or for which no request for admission has been made and that are not traded on an non-EU organised trading platform but where the underlying is admitted to trading or traded on a trading venue.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeVenue = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TradVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeVenue";
			definition = "Identification of the venue where the transaction was executed.\r\n\r\nUsage: \r\nUse the ISO 10383 segment MIC (4 characters) for financial instruments executed on a MiFID trading venue, System Internaliser (SI) or non-EU organised trading platform. Where the segment MIC does not exist, use the operating MIC. \r\n\r\nUse MIC code ‘XOFF’ for financial instruments admitted to trading or traded on a trading venue, where the transaction on that financial instrument is not executed on a MiFID trading venue, SI or non-EU organised trading platform, or where an investment firm does not know it is trading with another investment firm acting as an SI.\r\n\r\nUse MIC code ‘XXXX’ for financial instruments that are not admitted to trading or traded on a trading venue or for which no request for admission has been made and that are not traded on an non-EU organised trading platform but where the underlying is admitted to trading or traded on a trading venue.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected CountryCode countryOfBranch;
	/**
	 * Country of the branch of the investment firm whose market membership was
	 * used to execute the transaction.<br>
	 * <br>
	 * TBC with item 46.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of the branch of the investment firm whose market membership was used to execute the transaction.\r\n\r\nTBC with item 46."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfBranch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBranch";
			definition = "Country of the branch of the investment firm whose market membership was used to execute the transaction.\r\n\r\nTBC with item 46.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected AmountAndDirection53 upFrontPayment;
	/**
	 * Monetary value of any up-front payment in basis points of notional
	 * received or paid by the seller.<br>
	 * Where the seller receives the up-front payment, the value populated is
	 * positive. Where the seller pays the up-front payment, the value populated
	 * is negative.<br>
	 * For increase or decrease in notional derivative contracts, the number
	 * shall reflect the absolute value of the change and shall be expressed as
	 * a positive number.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection53
	 * AmountAndDirection53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpFrntPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpFrontPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of any up-front payment in basis points of notional received or paid by the seller.\r\nWhere the seller receives the up-front payment, the value populated is positive. Where the seller pays the up-front payment, the value populated is negative.\r\nFor increase or decrease in notional derivative contracts, the number shall reflect the absolute value of the change and shall be expressed as a positive number.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpFrontPayment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "UpFrntPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpFrontPayment";
			definition = "Monetary value of any up-front payment in basis points of notional received or paid by the seller.\r\nWhere the seller receives the up-front payment, the value populated is positive. Where the seller pays the up-front payment, the value populated is negative.\r\nFor increase or decrease in notional derivative contracts, the number shall reflect the absolute value of the change and shall be expressed as a positive number.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection53.mmObject();
		}
	};
	protected Max52Text tradePlaceMatchingIdentification;
	/**
	 * Common matching identification when executed on a trade place.<br>
	 * <br>
	 * Usage: Must be present when a trade venue has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPlcMtchgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePlaceMatchingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common matching identification when executed on a trade place.\r\n\r\nUsage: Must be present when a trade venue has been provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradePlaceMatchingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TradPlcMtchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePlaceMatchingIdentification";
			definition = "Common matching identification when executed on a trade place.\r\n\r\nUsage: Must be present when a trade venue has been provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	protected Max35Text complexTradeComponentIdentification;
	/**
	 * Identification, internal to the reporting party to identify all the
	 * reports related to the same execution of a combination of financial
	 * instruments. The code must be unique for the reporting party for the
	 * group of reports for the execution.<br>
	 * <br>
	 * Usage:<br>
	 * Field only applies when the instrument is complex.<br>
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplxTradCmpntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplexTradeComponentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, internal to the reporting party to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the reporting party for the group of reports for the execution.\r\n\r\nUsage:\r\nField only applies when the instrument is complex.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmComplexTradeComponentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CmplxTradCmpntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplexTradeComponentIdentification";
			definition = "Identification, internal to the reporting party to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the reporting party for the group of reports for the execution.\r\n\r\nUsage:\r\nField only applies when the instrument is complex.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTransaction1.mmTradeDate, SecuritiesTransaction1.mmTradingCapacity, SecuritiesTransaction1.mmQuantity, SecuritiesTransaction1.mmDerivativeNotionalChange,
						SecuritiesTransaction1.mmPrice, SecuritiesTransaction1.mmNetAmount, SecuritiesTransaction1.mmTradeVenue, SecuritiesTransaction1.mmCountryOfBranch, SecuritiesTransaction1.mmUpFrontPayment,
						SecuritiesTransaction1.mmTradePlaceMatchingIdentification, SecuritiesTransaction1.mmComplexTradeComponentIdentification);
				trace_lazy = () -> SecuritiesTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransaction1";
				definition = "Provides the details of the reported transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradDt", required = true)
	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "TradgCpcty", required = true)
	public RegulatoryTradingCapacity1Code getTradingCapacity() {
		return tradingCapacity;
	}

	public void setTradingCapacity(RegulatoryTradingCapacity1Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
	}

	@XmlElement(name = "Qty", required = true)
	public FinancialInstrumentQuantity25Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(FinancialInstrumentQuantity25Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "DerivNtnlChng")
	public VariationType1Code getDerivativeNotionalChange() {
		return derivativeNotionalChange;
	}

	public void setDerivativeNotionalChange(VariationType1Code derivativeNotionalChange) {
		this.derivativeNotionalChange = derivativeNotionalChange;
	}

	@XmlElement(name = "Pric", required = true)
	public SecuritiesTransactionPrice4Choice getPrice() {
		return price;
	}

	public void setPrice(SecuritiesTransactionPrice4Choice price) {
		this.price = price;
	}

	@XmlElement(name = "NetAmt")
	public ImpliedCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ImpliedCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	@XmlElement(name = "TradVn", required = true)
	public MICIdentifier getTradeVenue() {
		return tradeVenue;
	}

	public void setTradeVenue(MICIdentifier tradeVenue) {
		this.tradeVenue = tradeVenue;
	}

	@XmlElement(name = "CtryOfBrnch")
	public CountryCode getCountryOfBranch() {
		return countryOfBranch;
	}

	public void setCountryOfBranch(CountryCode countryOfBranch) {
		this.countryOfBranch = countryOfBranch;
	}

	@XmlElement(name = "UpFrntPmt")
	public AmountAndDirection53 getUpFrontPayment() {
		return upFrontPayment;
	}

	public void setUpFrontPayment(com.tools20022.repository.msg.AmountAndDirection53 upFrontPayment) {
		this.upFrontPayment = upFrontPayment;
	}

	@XmlElement(name = "TradPlcMtchgId")
	public Max52Text getTradePlaceMatchingIdentification() {
		return tradePlaceMatchingIdentification;
	}

	public void setTradePlaceMatchingIdentification(Max52Text tradePlaceMatchingIdentification) {
		this.tradePlaceMatchingIdentification = tradePlaceMatchingIdentification;
	}

	@XmlElement(name = "CmplxTradCmpntId")
	public Max35Text getComplexTradeComponentIdentification() {
		return complexTradeComponentIdentification;
	}

	public void setComplexTradeComponentIdentification(Max35Text complexTradeComponentIdentification) {
		this.complexTradeComponentIdentification = complexTradeComponentIdentification;
	}
}