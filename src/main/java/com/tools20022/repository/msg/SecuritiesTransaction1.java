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
import com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code;
import com.tools20022.repository.codeset.VariationType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTransaction;
import com.tools20022.repository.entity.TradingMarket;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradeDate
 * SecuritiesTransaction1.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradingCapacity
 * SecuritiesTransaction1.TradingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#Quantity
 * SecuritiesTransaction1.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#DerivativeNotionalChange
 * SecuritiesTransaction1.DerivativeNotionalChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#Price
 * SecuritiesTransaction1.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#NetAmount
 * SecuritiesTransaction1.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradeVenue
 * SecuritiesTransaction1.TradeVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#CountryOfBranch
 * SecuritiesTransaction1.CountryOfBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#UpFrontPayment
 * SecuritiesTransaction1.UpFrontPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradePlaceMatchingIdentification
 * SecuritiesTransaction1.TradePlaceMatchingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#ComplexTradeComponentIdentification
 * SecuritiesTransaction1.ComplexTradeComponentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class SecuritiesTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Trade#TradeDateTime
	 * Trade.TradeDateTime}</li>
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
	public static final MMMessageAttribute TradeDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.TradeDateTime;
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#TradingPartyCapacity
	 * TradePartyRole.TradingPartyCapacity}</li>
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
	public static final MMMessageAttribute TradingCapacity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradePartyRole.TradingPartyCapacity;
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Indication of whether the transaction results from the reporting firm carrying out matched principal trading or dealing on own account under the local regulation, or where the transaction does not result from the reporting firm carrying out matched principal trading or dealing on own account, the field shall indicate that the transaction was carried out under any other capacity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RegulatoryTradingCapacity1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
	 * Security.SecuritiesQuantity}</li>
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
	public static final MMMessageAssociationEnd Quantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesQuantity;
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Number of units of the financial instrument, or the number of derivative contracts in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentQuantity25Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TransactionType
	 * SecuritiesTrade.TransactionType}</li>
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
	public static final MMMessageAttribute DerivativeNotionalChange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TransactionType;
			isDerived = false;
			xmlTag = "DerivNtnlChng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeNotionalChange";
			definition = "Indicates as to whether an increase or a decrease of notional of derivative contracts has taken place.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> VariationType1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
	 * SecuritiesTrade.TradePrice}</li>
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
	public static final MMMessageAssociationEnd Price = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradePrice;
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Traded price of the transaction excluding, where applicable, commission and accrued interest.\r\nIn the case of option contracts, it is the premium of the derivative contract per underlying security or index point.\r\nIn the case of spread bets it should be the reference price of the direct underlying instrument.\r\nWhere price is currently not available but pending, the value should be ’PNDG’.\r\nFor CDS it should be the coupon in basis points. \r\nWhere price reported in monetary terms, it shall be provided in the major currency unit.\r\nWhere price is not applicable the field should be left blank.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransactionPrice4Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAmount
	 * SecuritiesTrade.TradeAmount}</li>
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
	public static final MMMessageAttribute NetAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeAmount;
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Net amount of the transaction means the cash amount which is paid by the buyer of the debt instrument upon the settlement of the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMMessageAttribute TradeVenue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			xmlTag = "TradVn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeVenue";
			definition = "Identification of the venue where the transaction was executed.\r\n\r\nUsage: \r\nUse the ISO 10383 segment MIC (4 characters) for financial instruments executed on a MiFID trading venue, System Internaliser (SI) or non-EU organised trading platform. Where the segment MIC does not exist, use the operating MIC. \r\n\r\nUse MIC code ‘XOFF’ for financial instruments admitted to trading or traded on a trading venue, where the transaction on that financial instrument is not executed on a MiFID trading venue, SI or non-EU organised trading platform, or where an investment firm does not know it is trading with another investment firm acting as an SI.\r\n\r\nUse MIC code ‘XXXX’ for financial instruments that are not admitted to trading or traded on a trading venue or for which no request for admission has been made and that are not traded on an non-EU organised trading platform but where the underlying is admitted to trading or traded on a trading venue.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#Country
	 * PostalAddress.Country}</li>
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
	public static final MMMessageAttribute CountryOfBranch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.Country;
			isDerived = false;
			xmlTag = "CtryOfBrnch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBranch";
			definition = "Country of the branch of the investment firm whose market membership was used to execute the transaction.\r\n\r\nTBC with item 46.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementAmount
	 * CashSettlement.InterbankSettlementAmount}</li>
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
	public static final MMMessageAssociationEnd UpFrontPayment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.InterbankSettlementAmount;
			isDerived = false;
			xmlTag = "UpFrntPmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpFrontPayment";
			definition = "Monetary value of any up-front payment in basis points of notional received or paid by the seller.\r\nWhere the seller receives the up-front payment, the value populated is positive. Where the seller pays the up-front payment, the value populated is negative.\r\nFor increase or decrease in notional derivative contracts, the number shall reflect the absolute value of the change and shall be expressed as a positive number.\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection53.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CommonIdentification
	 * TradeIdentification.CommonIdentification}</li>
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
	public static final MMMessageAttribute TradePlaceMatchingIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.CommonIdentification;
			isDerived = false;
			xmlTag = "TradPlcMtchgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePlaceMatchingIdentification";
			definition = "Common matching identification when executed on a trade place.\r\n\r\nUsage: Must be present when a trade venue has been provided.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#CommonIdentification
	 * TradeIdentification.CommonIdentification}</li>
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
	public static final MMMessageAttribute ComplexTradeComponentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransaction1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.CommonIdentification;
			isDerived = false;
			xmlTag = "CmplxTradCmpntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplexTradeComponentIdentification";
			definition = "Identification, internal to the reporting party to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the reporting party for the group of reports for the execution.\r\n\r\nUsage:\r\nField only applies when the instrument is complex.\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTransaction1.TradeDate, com.tools20022.repository.msg.SecuritiesTransaction1.TradingCapacity,
						com.tools20022.repository.msg.SecuritiesTransaction1.Quantity, com.tools20022.repository.msg.SecuritiesTransaction1.DerivativeNotionalChange, com.tools20022.repository.msg.SecuritiesTransaction1.Price,
						com.tools20022.repository.msg.SecuritiesTransaction1.NetAmount, com.tools20022.repository.msg.SecuritiesTransaction1.TradeVenue, com.tools20022.repository.msg.SecuritiesTransaction1.CountryOfBranch,
						com.tools20022.repository.msg.SecuritiesTransaction1.UpFrontPayment, com.tools20022.repository.msg.SecuritiesTransaction1.TradePlaceMatchingIdentification,
						com.tools20022.repository.msg.SecuritiesTransaction1.ComplexTradeComponentIdentification);
				trace_lazy = () -> SecuritiesTransaction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransaction1";
				definition = "Provides the details of the reported transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}