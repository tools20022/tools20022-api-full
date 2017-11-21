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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Currency conversion accepted by the customer, either to convert the amount to
 * dispense in the base currency of the ATM, or to convert the total requested
 * amount in the currency of the customer (so called dynamic currency
 * conversion).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmCurrencyConversionIdentification
 * CurrencyConversion9.mmCurrencyConversionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmTargetCurrency
 * CurrencyConversion9.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmResultingAmount
 * CurrencyConversion9.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmExchangeRate
 * CurrencyConversion9.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmInvertedExchangeRate
 * CurrencyConversion9.mmInvertedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmQuotationDate
 * CurrencyConversion9.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmValidUntil
 * CurrencyConversion9.mmValidUntil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmSourceCurrency
 * CurrencyConversion9.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmOriginalAmount
 * CurrencyConversion9.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmCommissionDetails
 * CurrencyConversion9.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmMarkUpDetails
 * CurrencyConversion9.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmDeclarationDetails
 * CurrencyConversion9.mmDeclarationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyConversion9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CurrencyConversion9", propOrder = {"currencyConversionIdentification", "targetCurrency", "resultingAmount", "exchangeRate", "invertedExchangeRate", "quotationDate", "validUntil", "sourceCurrency", "originalAmount",
		"commissionDetails", "markUpDetails", "declarationDetails"})
public class CurrencyConversion9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text currencyConversionIdentification;
	/**
	 * Identification of the currency conversion operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the currency conversion operation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyConversionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionIdentification";
			definition = "Identification of the currency conversion operation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyDetails2 targetCurrency;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTargetCurrency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount resultingAmount;
	/**
	 * Amount converted in the target currency, including commission and
	 * mark-up.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
	 * CurrencyExchange.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount converted in the target currency, including commission and mark-up."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "RsltgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingAmount";
			definition = "Amount converted in the target currency, including commission and mark-up.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate exchangeRate;
	/**
	 * Exchange rate, expressed as a percentage, applied to convert the original
	 * amount into the resulting amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate invertedExchangeRate;
	/**
	 * Exchange rate, expressed as a percentage, applied to convert the
	 * resulting amount into the original amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NvrtdXchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvertedExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvertedExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "NvrtdXchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvertedExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ISODateTime quotationDate;
	/**
	 * Date and time at which the exchange rate has been quoted.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
	 * CurrencyExchange.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the exchange rate has been quoted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which the exchange rate has been quoted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime validUntil;
	/**
	 * Validity limit of the exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldUntil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidUntil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validity limit of the exchange rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntil = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Validity limit of the exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CurrencyDetails2 sourceCurrency;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSourceCurrency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount originalAmount;
	/**
	 * Original amount in the source currency.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original amount in the source currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original amount in the source currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission19> commissionDetails;
	/**
	 * Commission or additional charges made as part of a currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission19
	 * Commission19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission or additional charges made as part of a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission or additional charges made as part of a currency conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission19.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission18> markUpDetails;
	/**
	 * Mark-up made as part of a currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission18
	 * Commission18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrkUpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUpDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mark-up made as part of a currency conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkUpDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "MrkUpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUpDetails";
			definition = "Mark-up made as part of a currency conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission18.mmObject();
		}
	};
	protected ActionMessage5 declarationDetails;
	/**
	 * Card scheme declaration (disclaimer) to present to the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ActionMessage5
	 * ActionMessage5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9
	 * CurrencyConversion9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card scheme declaration (disclaimer) to present to the cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeclarationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyConversion9.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Card scheme declaration (disclaimer) to present to the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ActionMessage5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrencyConversion9.mmCurrencyConversionIdentification, CurrencyConversion9.mmTargetCurrency, CurrencyConversion9.mmResultingAmount, CurrencyConversion9.mmExchangeRate,
						CurrencyConversion9.mmInvertedExchangeRate, CurrencyConversion9.mmQuotationDate, CurrencyConversion9.mmValidUntil, CurrencyConversion9.mmSourceCurrency, CurrencyConversion9.mmOriginalAmount,
						CurrencyConversion9.mmCommissionDetails, CurrencyConversion9.mmMarkUpDetails, CurrencyConversion9.mmDeclarationDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion9";
				definition = "Currency conversion accepted by the customer, either to convert the amount to dispense in the base currency of the ATM, or to convert the total requested amount in the currency of the customer (so called dynamic currency conversion).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CcyConvsId")
	public Max35Text getCurrencyConversionIdentification() {
		return currencyConversionIdentification;
	}

	public void setCurrencyConversionIdentification(Max35Text currencyConversionIdentification) {
		this.currencyConversionIdentification = currencyConversionIdentification;
	}

	@XmlElement(name = "TrgtCcy", required = true)
	public CurrencyDetails2 getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(com.tools20022.repository.msg.CurrencyDetails2 targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	@XmlElement(name = "RsltgAmt", required = true)
	public ImpliedCurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public void setResultingAmount(ImpliedCurrencyAndAmount resultingAmount) {
		this.resultingAmount = resultingAmount;
	}

	@XmlElement(name = "XchgRate", required = true)
	public PercentageRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@XmlElement(name = "NvrtdXchgRate")
	public PercentageRate getInvertedExchangeRate() {
		return invertedExchangeRate;
	}

	public void setInvertedExchangeRate(PercentageRate invertedExchangeRate) {
		this.invertedExchangeRate = invertedExchangeRate;
	}

	@XmlElement(name = "QtnDt")
	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
	}

	@XmlElement(name = "VldUntil")
	public ISODateTime getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(ISODateTime validUntil) {
		this.validUntil = validUntil;
	}

	@XmlElement(name = "SrcCcy", required = true)
	public CurrencyDetails2 getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(com.tools20022.repository.msg.CurrencyDetails2 sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	@XmlElement(name = "OrgnlAmt", required = true)
	public ImpliedCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(ImpliedCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	@XmlElement(name = "ComssnDtls")
	public List<Commission19> getCommissionDetails() {
		return commissionDetails;
	}

	public void setCommissionDetails(List<com.tools20022.repository.msg.Commission19> commissionDetails) {
		this.commissionDetails = commissionDetails;
	}

	@XmlElement(name = "MrkUpDtls")
	public List<Commission18> getMarkUpDetails() {
		return markUpDetails;
	}

	public void setMarkUpDetails(List<com.tools20022.repository.msg.Commission18> markUpDetails) {
		this.markUpDetails = markUpDetails;
	}

	@XmlElement(name = "DclrtnDtls")
	public ActionMessage5 getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(com.tools20022.repository.msg.ActionMessage5 declarationDetails) {
		this.declarationDetails = declarationDetails;
	}
}