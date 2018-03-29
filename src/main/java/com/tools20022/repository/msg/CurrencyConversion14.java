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
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmCurrencyConversionIdentification
 * CurrencyConversion14.mmCurrencyConversionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmTargetCurrency
 * CurrencyConversion14.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmResultingAmount
 * CurrencyConversion14.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmExchangeRate
 * CurrencyConversion14.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmInvertedExchangeRate
 * CurrencyConversion14.mmInvertedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmQuotationDate
 * CurrencyConversion14.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmValidUntil
 * CurrencyConversion14.mmValidUntil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmSourceCurrency
 * CurrencyConversion14.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmOriginalAmount
 * CurrencyConversion14.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmCommissionDetails
 * CurrencyConversion14.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmMarkUpDetails
 * CurrencyConversion14.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmDeclarationDetails
 * CurrencyConversion14.mmDeclarationDetails}</li>
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
 * "CurrencyConversion14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12
 * CurrencyConversion12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyConversion14", propOrder = {"currencyConversionIdentification", "targetCurrency", "resultingAmount", "exchangeRate", "invertedExchangeRate", "quotationDate", "validUntil", "sourceCurrency", "originalAmount",
		"commissionDetails", "markUpDetails", "declarationDetails"})
public class CurrencyConversion14 {

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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmCurrencyConversionIdentification
	 * CurrencyConversion12.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, Optional<Max35Text>> mmCurrencyConversionIdentification = new MMMessageAttribute<CurrencyConversion14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionIdentification";
			definition = "Identification of the currency conversion operation for the service provider.";
			previousVersion_lazy = () -> CurrencyConversion12.mmCurrencyConversionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyConversion14 obj) {
			return obj.getCurrencyConversionIdentification();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, Optional<Max35Text> value) {
			obj.setCurrencyConversionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TrgtCcy", required = true)
	protected CurrencyDetails3 targetCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDetails3
	 * CurrencyDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmTargetCurrency
	 * CurrencyConversion12.mmTargetCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, CurrencyDetails3> mmTargetCurrency = new MMMessageAssociationEnd<CurrencyConversion14, CurrencyDetails3>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			previousVersion_lazy = () -> CurrencyConversion12.mmTargetCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyDetails3.mmObject();
		}

		@Override
		public CurrencyDetails3 getValue(CurrencyConversion14 obj) {
			return obj.getTargetCurrency();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, CurrencyDetails3 value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmResultingAmount
	 * CurrencyConversion12.mmResultingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, ImpliedCurrencyAndAmount> mmResultingAmount = new MMMessageAttribute<CurrencyConversion14, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "RsltgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingAmount";
			definition = "Amount converted in the target currency, including additional charges.";
			previousVersion_lazy = () -> CurrencyConversion12.mmResultingAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CurrencyConversion14 obj) {
			return obj.getResultingAmount();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, ImpliedCurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmExchangeRate
	 * CurrencyConversion12.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, PercentageRate> mmExchangeRate = new MMMessageAttribute<CurrencyConversion14, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount.";
			previousVersion_lazy = () -> CurrencyConversion12.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(CurrencyConversion14 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, PercentageRate value) {
			obj.setExchangeRate(value);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmInvertedExchangeRate
	 * CurrencyConversion12.mmInvertedExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, Optional<PercentageRate>> mmInvertedExchangeRate = new MMMessageAttribute<CurrencyConversion14, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "NvrtdXchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvertedExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount.";
			previousVersion_lazy = () -> CurrencyConversion12.mmInvertedExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CurrencyConversion14 obj) {
			return obj.getInvertedExchangeRate();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmQuotationDate
	 * CurrencyConversion12.mmQuotationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, Optional<ISODateTime>> mmQuotationDate = new MMMessageAttribute<CurrencyConversion14, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which the exchange rate has been quoted.";
			previousVersion_lazy = () -> CurrencyConversion12.mmQuotationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyConversion14 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, Optional<ISODateTime> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmValidUntil
	 * CurrencyConversion12.mmValidUntil}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyConversion14, Optional<ISODateTime>> mmValidUntil = new MMMessageAttribute<CurrencyConversion14, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Validity limit of the exchange rate.";
			previousVersion_lazy = () -> CurrencyConversion12.mmValidUntil;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyConversion14 obj) {
			return obj.getValidUntil();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, Optional<ISODateTime> value) {
			obj.setValidUntil(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcCcy", required = true)
	protected CurrencyDetails2 sourceCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmSourceCurrency
	 * CurrencyConversion12.mmSourceCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, CurrencyDetails2> mmSourceCurrency = new MMMessageAssociationEnd<CurrencyConversion14, CurrencyDetails2>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			previousVersion_lazy = () -> CurrencyConversion12.mmSourceCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyDetails2.mmObject();
		}

		@Override
		public CurrencyDetails2 getValue(CurrencyConversion14 obj) {
			return obj.getSourceCurrency();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, CurrencyDetails2 value) {
			obj.setSourceCurrency(value);
		}
	};
	@XmlElement(name = "OrgnlAmt", required = true)
	protected OriginalAmountDetails1 originalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1
	 * OriginalAmountDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmOriginalAmount
	 * CurrencyConversion12.mmOriginalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, OriginalAmountDetails1> mmOriginalAmount = new MMMessageAssociationEnd<CurrencyConversion14, OriginalAmountDetails1>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original amount in the source currency.";
			previousVersion_lazy = () -> CurrencyConversion12.mmOriginalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalAmountDetails1.mmObject();
		}

		@Override
		public OriginalAmountDetails1 getValue(CurrencyConversion14 obj) {
			return obj.getOriginalAmount();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, OriginalAmountDetails1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmCommissionDetails
	 * CurrencyConversion12.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, List<Commission19>> mmCommissionDetails = new MMMessageAssociationEnd<CurrencyConversion14, List<Commission19>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission or additional charges made as part of a currency conversion.";
			previousVersion_lazy = () -> CurrencyConversion12.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission19.mmObject();
		}

		@Override
		public List<Commission19> getValue(CurrencyConversion14 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, List<Commission19> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmMarkUpDetails
	 * CurrencyConversion12.mmMarkUpDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, List<Commission18>> mmMarkUpDetails = new MMMessageAssociationEnd<CurrencyConversion14, List<Commission18>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "MrkUpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUpDetails";
			definition = "Markup made as part of a currency conversion.";
			previousVersion_lazy = () -> CurrencyConversion12.mmMarkUpDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission18.mmObject();
		}

		@Override
		public List<Commission18> getValue(CurrencyConversion14 obj) {
			return obj.getMarkUpDetails();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, List<Commission18> value) {
			obj.setMarkUpDetails(value);
		}
	};
	@XmlElement(name = "DclrtnDtls")
	protected ActionMessage5 declarationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ActionMessage5
	 * ActionMessage5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14
	 * CurrencyConversion14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmDeclarationDetails
	 * CurrencyConversion12.mmDeclarationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyConversion14, Optional<ActionMessage5>> mmDeclarationDetails = new MMMessageAssociationEnd<CurrencyConversion14, Optional<ActionMessage5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion14.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Card scheme declaration (disclaimer) to present to the cardholder.";
			previousVersion_lazy = () -> CurrencyConversion12.mmDeclarationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActionMessage5.mmObject();
		}

		@Override
		public Optional<ActionMessage5> getValue(CurrencyConversion14 obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(CurrencyConversion14 obj, Optional<ActionMessage5> value) {
			obj.setDeclarationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion14.mmCurrencyConversionIdentification, com.tools20022.repository.msg.CurrencyConversion14.mmTargetCurrency,
						com.tools20022.repository.msg.CurrencyConversion14.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion14.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion14.mmInvertedExchangeRate,
						com.tools20022.repository.msg.CurrencyConversion14.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion14.mmValidUntil, com.tools20022.repository.msg.CurrencyConversion14.mmSourceCurrency,
						com.tools20022.repository.msg.CurrencyConversion14.mmOriginalAmount, com.tools20022.repository.msg.CurrencyConversion14.mmCommissionDetails, com.tools20022.repository.msg.CurrencyConversion14.mmMarkUpDetails,
						com.tools20022.repository.msg.CurrencyConversion14.mmDeclarationDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion14";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.";
				previousVersion_lazy = () -> CurrencyConversion12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCurrencyConversionIdentification() {
		return currencyConversionIdentification == null ? Optional.empty() : Optional.of(currencyConversionIdentification);
	}

	public CurrencyConversion14 setCurrencyConversionIdentification(Max35Text currencyConversionIdentification) {
		this.currencyConversionIdentification = currencyConversionIdentification;
		return this;
	}

	public CurrencyDetails3 getTargetCurrency() {
		return targetCurrency;
	}

	public CurrencyConversion14 setTargetCurrency(CurrencyDetails3 targetCurrency) {
		this.targetCurrency = Objects.requireNonNull(targetCurrency);
		return this;
	}

	public ImpliedCurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public CurrencyConversion14 setResultingAmount(ImpliedCurrencyAndAmount resultingAmount) {
		this.resultingAmount = Objects.requireNonNull(resultingAmount);
		return this;
	}

	public PercentageRate getExchangeRate() {
		return exchangeRate;
	}

	public CurrencyConversion14 setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<PercentageRate> getInvertedExchangeRate() {
		return invertedExchangeRate == null ? Optional.empty() : Optional.of(invertedExchangeRate);
	}

	public CurrencyConversion14 setInvertedExchangeRate(PercentageRate invertedExchangeRate) {
		this.invertedExchangeRate = invertedExchangeRate;
		return this;
	}

	public Optional<ISODateTime> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public CurrencyConversion14 setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	public Optional<ISODateTime> getValidUntil() {
		return validUntil == null ? Optional.empty() : Optional.of(validUntil);
	}

	public CurrencyConversion14 setValidUntil(ISODateTime validUntil) {
		this.validUntil = validUntil;
		return this;
	}

	public CurrencyDetails2 getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyConversion14 setSourceCurrency(CurrencyDetails2 sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public OriginalAmountDetails1 getOriginalAmount() {
		return originalAmount;
	}

	public CurrencyConversion14 setOriginalAmount(OriginalAmountDetails1 originalAmount) {
		this.originalAmount = Objects.requireNonNull(originalAmount);
		return this;
	}

	public List<Commission19> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public CurrencyConversion14 setCommissionDetails(List<Commission19> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Commission18> getMarkUpDetails() {
		return markUpDetails == null ? markUpDetails = new ArrayList<>() : markUpDetails;
	}

	public CurrencyConversion14 setMarkUpDetails(List<Commission18> markUpDetails) {
		this.markUpDetails = Objects.requireNonNull(markUpDetails);
		return this;
	}

	public Optional<ActionMessage5> getDeclarationDetails() {
		return declarationDetails == null ? Optional.empty() : Optional.of(declarationDetails);
	}

	public CurrencyConversion14 setDeclarationDetails(ActionMessage5 declarationDetails) {
		this.declarationDetails = declarationDetails;
		return this;
	}
}