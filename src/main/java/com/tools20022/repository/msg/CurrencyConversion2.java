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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Commission18;
import com.tools20022.repository.msg.Commission19;
import com.tools20022.repository.msg.CurrencyDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider. The currency conversion has
 * to be accepted by the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCurrencyConversionIdentification
 * CurrencyConversion2.mmCurrencyConversionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmTargetCurrency
 * CurrencyConversion2.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmResultingAmount
 * CurrencyConversion2.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRate
 * CurrencyConversion2.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRateDecimal
 * CurrencyConversion2.mmExchangeRateDecimal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmInvertedExchangeRate
 * CurrencyConversion2.mmInvertedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmQuotationDate
 * CurrencyConversion2.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmValidUntil
 * CurrencyConversion2.mmValidUntil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmSourceCurrency
 * CurrencyConversion2.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmOriginalAmount
 * CurrencyConversion2.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCommissionDetails
 * CurrencyConversion2.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmMarkUpDetails
 * CurrencyConversion2.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmDeclarationDetails
 * CurrencyConversion2.mmDeclarationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyConversion2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion3
 * CurrencyConversion3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion4
 * CurrencyConversion4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion6
 * CurrencyConversion6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
 * CurrencyConversion1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyConversion2", propOrder = {"currencyConversionIdentification", "targetCurrency", "resultingAmount", "exchangeRate", "exchangeRateDecimal", "invertedExchangeRate", "quotationDate", "validUntil", "sourceCurrency",
		"originalAmount", "commissionDetails", "markUpDetails", "declarationDetails"})
public class CurrencyConversion2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyConvsId")
	protected Max35Text currencyConversionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * definition} =
	 * "Identification of the currency conversion operation for the service provider."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmCurrencyConversionIdentification
	 * CurrencyConversion4.mmCurrencyConversionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmCurrencyConversionIdentification
	 * CurrencyConversion6.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmCurrencyConversionIdentification
	 * CurrencyConversion1.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<Max35Text>> mmCurrencyConversionIdentification = new MMMessageAttribute<CurrencyConversion2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionIdentification";
			definition = "Identification of the currency conversion operation for the service provider.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmCurrencyConversionIdentification, CurrencyConversion6.mmCurrencyConversionIdentification);
			previousVersion_lazy = () -> CurrencyConversion1.mmCurrencyConversionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyConversion2 obj) {
			return obj.getCurrencyConversionIdentification();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<Max35Text> value) {
			obj.setCurrencyConversionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TrgtCcy", required = true)
	protected CurrencyDetails1 targetCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmTargetCurrency
	 * CurrencyConversion4.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmTargetCurrency
	 * CurrencyConversion6.mmTargetCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrency
	 * CurrencyConversion1.mmTargetCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion2, CurrencyDetails1> mmTargetCurrency = new MMMessageAssociationEnd<CurrencyConversion2, CurrencyDetails1>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmTargetCurrency, CurrencyConversion6.mmTargetCurrency);
			previousVersion_lazy = () -> CurrencyConversion1.mmTargetCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyDetails1.mmObject();
		}

		@Override
		public CurrencyDetails1 getValue(CurrencyConversion2 obj) {
			return obj.getTargetCurrency();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, CurrencyDetails1 value) {
			obj.setTargetCurrency(value);
		}
	};
	@XmlElement(name = "RsltgAmt", required = true)
	protected ImpliedCurrencyAndAmount resultingAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * "Amount converted in the target currency, including additional charges."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmResultingAmount
	 * CurrencyConversion4.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmResultingAmount
	 * CurrencyConversion6.mmResultingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResultingAmount
	 * CurrencyConversion1.mmResultingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, ImpliedCurrencyAndAmount> mmResultingAmount = new MMMessageAttribute<CurrencyConversion2, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "RsltgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingAmount";
			definition = "Amount converted in the target currency, including additional charges.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmResultingAmount, CurrencyConversion6.mmResultingAmount);
			previousVersion_lazy = () -> CurrencyConversion1.mmResultingAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CurrencyConversion2 obj) {
			return obj.getResultingAmount();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, ImpliedCurrencyAndAmount value) {
			obj.setResultingAmount(value);
		}
	};
	@XmlElement(name = "XchgRate", required = true)
	protected PercentageRate exchangeRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmExchangeRate
	 * CurrencyConversion4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmExchangeRate
	 * CurrencyConversion6.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmExchangeRate
	 * CurrencyConversion1.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, PercentageRate> mmExchangeRate = new MMMessageAttribute<CurrencyConversion2, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmExchangeRate, CurrencyConversion6.mmExchangeRate);
			previousVersion_lazy = () -> CurrencyConversion1.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(CurrencyConversion2 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, PercentageRate value) {
			obj.setExchangeRate(value);
		}
	};
	@XmlElement(name = "XchgRateDcml")
	protected BaseOneRate exchangeRateDecimal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRateDcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateDecimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate expressed as a decimal, for example 0.7 is 7/10 and 70%."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmExchangeRateDecimal
	 * CurrencyConversion4.mmExchangeRateDecimal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<BaseOneRate>> mmExchangeRateDecimal = new MMMessageAttribute<CurrencyConversion2, Optional<BaseOneRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "XchgRateDcml";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateDecimal";
			definition = "Exchange rate expressed as a decimal, for example 0.7 is 7/10 and 70%.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmExchangeRateDecimal);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CurrencyConversion2 obj) {
			return obj.getExchangeRateDecimal();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<BaseOneRate> value) {
			obj.setExchangeRateDecimal(value.orElse(null));
		}
	};
	@XmlElement(name = "NvrtdXchgRate")
	protected PercentageRate invertedExchangeRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmInvertedExchangeRate
	 * CurrencyConversion4.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmInvertedExchangeRate
	 * CurrencyConversion6.mmInvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmInvertedExchangeRate
	 * CurrencyConversion1.mmInvertedExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<PercentageRate>> mmInvertedExchangeRate = new MMMessageAttribute<CurrencyConversion2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "NvrtdXchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvertedExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmInvertedExchangeRate, CurrencyConversion6.mmInvertedExchangeRate);
			previousVersion_lazy = () -> CurrencyConversion1.mmInvertedExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CurrencyConversion2 obj) {
			return obj.getInvertedExchangeRate();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<PercentageRate> value) {
			obj.setInvertedExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "QtnDt")
	protected ISODateTime quotationDate;
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
	 * CurrencyExchange.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmQuotationDate
	 * CurrencyConversion4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmQuotationDate
	 * CurrencyConversion6.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmQuotationDate
	 * CurrencyConversion1.mmQuotationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<ISODateTime>> mmQuotationDate = new MMMessageAttribute<CurrencyConversion2, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which the exchange rate has been quoted.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmQuotationDate, CurrencyConversion6.mmQuotationDate);
			previousVersion_lazy = () -> CurrencyConversion1.mmQuotationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyConversion2 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<ISODateTime> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "VldUntil")
	protected ISODateTime validUntil;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmValidUntil
	 * CurrencyConversion4.mmValidUntil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmValidUntil
	 * CurrencyConversion6.mmValidUntil}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmValidUntil
	 * CurrencyConversion1.mmValidUntil}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<ISODateTime>> mmValidUntil = new MMMessageAttribute<CurrencyConversion2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Validity limit of the exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmValidUntil, CurrencyConversion6.mmValidUntil);
			previousVersion_lazy = () -> CurrencyConversion1.mmValidUntil;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyConversion2 obj) {
			return obj.getValidUntil();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<ISODateTime> value) {
			obj.setValidUntil(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcCcy", required = true)
	protected CurrencyDetails1 sourceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmSourceCurrency
	 * CurrencyConversion4.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmSourceCurrency
	 * CurrencyConversion6.mmSourceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrency
	 * CurrencyConversion1.mmSourceCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion2, CurrencyDetails1> mmSourceCurrency = new MMMessageAssociationEnd<CurrencyConversion2, CurrencyDetails1>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmSourceCurrency, CurrencyConversion6.mmSourceCurrency);
			previousVersion_lazy = () -> CurrencyConversion1.mmSourceCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyDetails1.mmObject();
		}

		@Override
		public CurrencyDetails1 getValue(CurrencyConversion2 obj) {
			return obj.getSourceCurrency();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, CurrencyDetails1 value) {
			obj.setSourceCurrency(value);
		}
	};
	@XmlElement(name = "OrgnlAmt", required = true)
	protected ImpliedCurrencyAndAmount originalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmOriginalAmount
	 * CurrencyConversion4.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmOriginalAmount
	 * CurrencyConversion6.mmOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmOriginalAmount
	 * CurrencyConversion1.mmOriginalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, ImpliedCurrencyAndAmount> mmOriginalAmount = new MMMessageAttribute<CurrencyConversion2, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original amount in the source currency.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmOriginalAmount, CurrencyConversion6.mmOriginalAmount);
			previousVersion_lazy = () -> CurrencyConversion1.mmOriginalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CurrencyConversion2 obj) {
			return obj.getOriginalAmount();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, ImpliedCurrencyAndAmount value) {
			obj.setOriginalAmount(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission19> commissionDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmCommissionDetails
	 * CurrencyConversion4.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmCommissionDetails
	 * CurrencyConversion6.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmCommissionDetails
	 * CurrencyConversion1.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion2, List<Commission19>> mmCommissionDetails = new MMMessageAssociationEnd<CurrencyConversion2, List<Commission19>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission or additional charges made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmCommissionDetails, CurrencyConversion6.mmCommissionDetails);
			previousVersion_lazy = () -> CurrencyConversion1.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission19.mmObject();
		}

		@Override
		public List<Commission19> getValue(CurrencyConversion2 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, List<Commission19> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "MrkUpDtls")
	protected List<Commission18> markUpDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * definition} = "Markup made as part of a currency conversion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmMarkUpDetails
	 * CurrencyConversion4.mmMarkUpDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmMarkUpDetails
	 * CurrencyConversion6.mmMarkUpDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmMarkUpDetails
	 * CurrencyConversion1.mmMarkUpDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion2, List<Commission18>> mmMarkUpDetails = new MMMessageAssociationEnd<CurrencyConversion2, List<Commission18>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "MrkUpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUpDetails";
			definition = "Markup made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmMarkUpDetails, CurrencyConversion6.mmMarkUpDetails);
			previousVersion_lazy = () -> CurrencyConversion1.mmMarkUpDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission18.mmObject();
		}

		@Override
		public List<Commission18> getValue(CurrencyConversion2 obj) {
			return obj.getMarkUpDetails();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, List<Commission18> value) {
			obj.setMarkUpDetails(value);
		}
	};
	@XmlElement(name = "DclrtnDtls")
	protected Max2048Text declarationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
	 * CurrencyConversion2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmDeclarationDetails
	 * CurrencyConversion4.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmDeclarationDetails
	 * CurrencyConversion6.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmDeclarationDetails
	 * CurrencyConversion1.mmDeclarationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion2, Optional<Max2048Text>> mmDeclarationDetails = new MMMessageAttribute<CurrencyConversion2, Optional<Max2048Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion2.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Card scheme declaration (disclaimer) to present to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion4.mmDeclarationDetails, CurrencyConversion6.mmDeclarationDetails);
			previousVersion_lazy = () -> CurrencyConversion1.mmDeclarationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}

		@Override
		public Optional<Max2048Text> getValue(CurrencyConversion2 obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(CurrencyConversion2 obj, Optional<Max2048Text> value) {
			obj.setDeclarationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmCurrencyConversionIdentification, com.tools20022.repository.msg.CurrencyConversion2.mmTargetCurrency,
						com.tools20022.repository.msg.CurrencyConversion2.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion2.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion2.mmExchangeRateDecimal,
						com.tools20022.repository.msg.CurrencyConversion2.mmInvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion2.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion2.mmValidUntil,
						com.tools20022.repository.msg.CurrencyConversion2.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion2.mmOriginalAmount, com.tools20022.repository.msg.CurrencyConversion2.mmCommissionDetails,
						com.tools20022.repository.msg.CurrencyConversion2.mmMarkUpDetails, com.tools20022.repository.msg.CurrencyConversion2.mmDeclarationDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion2";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversion3.mmObject(), CurrencyConversion4.mmObject(), CurrencyConversion6.mmObject());
				previousVersion_lazy = () -> CurrencyConversion1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCurrencyConversionIdentification() {
		return currencyConversionIdentification == null ? Optional.empty() : Optional.of(currencyConversionIdentification);
	}

	public CurrencyConversion2 setCurrencyConversionIdentification(Max35Text currencyConversionIdentification) {
		this.currencyConversionIdentification = currencyConversionIdentification;
		return this;
	}

	public CurrencyDetails1 getTargetCurrency() {
		return targetCurrency;
	}

	public CurrencyConversion2 setTargetCurrency(CurrencyDetails1 targetCurrency) {
		this.targetCurrency = Objects.requireNonNull(targetCurrency);
		return this;
	}

	public ImpliedCurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public CurrencyConversion2 setResultingAmount(ImpliedCurrencyAndAmount resultingAmount) {
		this.resultingAmount = Objects.requireNonNull(resultingAmount);
		return this;
	}

	public PercentageRate getExchangeRate() {
		return exchangeRate;
	}

	public CurrencyConversion2 setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<BaseOneRate> getExchangeRateDecimal() {
		return exchangeRateDecimal == null ? Optional.empty() : Optional.of(exchangeRateDecimal);
	}

	public CurrencyConversion2 setExchangeRateDecimal(BaseOneRate exchangeRateDecimal) {
		this.exchangeRateDecimal = exchangeRateDecimal;
		return this;
	}

	public Optional<PercentageRate> getInvertedExchangeRate() {
		return invertedExchangeRate == null ? Optional.empty() : Optional.of(invertedExchangeRate);
	}

	public CurrencyConversion2 setInvertedExchangeRate(PercentageRate invertedExchangeRate) {
		this.invertedExchangeRate = invertedExchangeRate;
		return this;
	}

	public Optional<ISODateTime> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public CurrencyConversion2 setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	public Optional<ISODateTime> getValidUntil() {
		return validUntil == null ? Optional.empty() : Optional.of(validUntil);
	}

	public CurrencyConversion2 setValidUntil(ISODateTime validUntil) {
		this.validUntil = validUntil;
		return this;
	}

	public CurrencyDetails1 getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyConversion2 setSourceCurrency(CurrencyDetails1 sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public ImpliedCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public CurrencyConversion2 setOriginalAmount(ImpliedCurrencyAndAmount originalAmount) {
		this.originalAmount = Objects.requireNonNull(originalAmount);
		return this;
	}

	public List<Commission19> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public CurrencyConversion2 setCommissionDetails(List<Commission19> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Commission18> getMarkUpDetails() {
		return markUpDetails == null ? markUpDetails = new ArrayList<>() : markUpDetails;
	}

	public CurrencyConversion2 setMarkUpDetails(List<Commission18> markUpDetails) {
		this.markUpDetails = Objects.requireNonNull(markUpDetails);
		return this;
	}

	public Optional<Max2048Text> getDeclarationDetails() {
		return declarationDetails == null ? Optional.empty() : Optional.of(declarationDetails);
	}

	public CurrencyConversion2 setDeclarationDetails(Max2048Text declarationDetails) {
		this.declarationDetails = declarationDetails;
		return this;
	}
}