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
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmCurrencyConversionIdentification
 * CurrencyConversion6.mmCurrencyConversionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmTargetCurrency
 * CurrencyConversion6.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmResultingAmount
 * CurrencyConversion6.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmExchangeRate
 * CurrencyConversion6.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmInvertedExchangeRate
 * CurrencyConversion6.mmInvertedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmQuotationDate
 * CurrencyConversion6.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmValidUntil
 * CurrencyConversion6.mmValidUntil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmSourceCurrency
 * CurrencyConversion6.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmOriginalAmount
 * CurrencyConversion6.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmCommissionDetails
 * CurrencyConversion6.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmMarkUpDetails
 * CurrencyConversion6.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmDeclarationDetails
 * CurrencyConversion6.mmDeclarationDetails}</li>
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
 * "CurrencyConversion6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion12
 * CurrencyConversion12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2
 * CurrencyConversion2}</li>
 * </ul>
 */
public class CurrencyConversion6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text currencyConversionIdentification;
	/**
	 * Identification of the currency conversion operation for the service
	 * provider.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmCurrencyConversionIdentification
	 * CurrencyConversion12.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCurrencyConversionIdentification
	 * CurrencyConversion2.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyConversionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionIdentification";
			definition = "Identification of the currency conversion operation for the service provider.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmCurrencyConversionIdentification);
			previousVersion_lazy = () -> CurrencyConversion2.mmCurrencyConversionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyDetails1 targetCurrency;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmTargetCurrency
	 * CurrencyConversion12.mmTargetCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmTargetCurrency
	 * CurrencyConversion2.mmTargetCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTargetCurrency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmTargetCurrency);
			previousVersion_lazy = () -> CurrencyConversion2.mmTargetCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount resultingAmount;
	/**
	 * Amount converted in the target currency, including additional charges.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmResultingAmount
	 * CurrencyConversion12.mmResultingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmResultingAmount
	 * CurrencyConversion2.mmResultingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "RsltgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingAmount";
			definition = "Amount converted in the target currency, including additional charges.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmResultingAmount);
			previousVersion_lazy = () -> CurrencyConversion2.mmResultingAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmExchangeRate
	 * CurrencyConversion12.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRate
	 * CurrencyConversion2.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmExchangeRate);
			previousVersion_lazy = () -> CurrencyConversion2.mmExchangeRate;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmInvertedExchangeRate
	 * CurrencyConversion12.mmInvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmInvertedExchangeRate
	 * CurrencyConversion2.mmInvertedExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvertedExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "NvrtdXchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvertedExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmInvertedExchangeRate);
			previousVersion_lazy = () -> CurrencyConversion2.mmInvertedExchangeRate;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmQuotationDate
	 * CurrencyConversion12.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmQuotationDate
	 * CurrencyConversion2.mmQuotationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which the exchange rate has been quoted.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmQuotationDate);
			previousVersion_lazy = () -> CurrencyConversion2.mmQuotationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmValidUntil
	 * CurrencyConversion12.mmValidUntil}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmValidUntil
	 * CurrencyConversion2.mmValidUntil}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntil = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Validity limit of the exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmValidUntil);
			previousVersion_lazy = () -> CurrencyConversion2.mmValidUntil;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CurrencyDetails1 sourceCurrency;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmSourceCurrency
	 * CurrencyConversion12.mmSourceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmSourceCurrency
	 * CurrencyConversion2.mmSourceCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSourceCurrency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmSourceCurrency);
			previousVersion_lazy = () -> CurrencyConversion2.mmSourceCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmOriginalAmount
	 * CurrencyConversion12.mmOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmOriginalAmount
	 * CurrencyConversion2.mmOriginalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original amount in the source currency.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmOriginalAmount);
			previousVersion_lazy = () -> CurrencyConversion2.mmOriginalAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmCommissionDetails
	 * CurrencyConversion12.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCommissionDetails
	 * CurrencyConversion2.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission or additional charges made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmCommissionDetails);
			previousVersion_lazy = () -> CurrencyConversion2.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission19.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission18> markUpDetails;
	/**
	 * Markup made as part of a currency conversion.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmMarkUpDetails
	 * CurrencyConversion12.mmMarkUpDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmMarkUpDetails
	 * CurrencyConversion2.mmMarkUpDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkUpDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "MrkUpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUpDetails";
			definition = "Markup made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmMarkUpDetails);
			previousVersion_lazy = () -> CurrencyConversion2.mmMarkUpDetails;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmDeclarationDetails
	 * CurrencyConversion12.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmDeclarationDetails
	 * CurrencyConversion2.mmDeclarationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeclarationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyConversion6.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Card scheme declaration (disclaimer) to present to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmDeclarationDetails);
			previousVersion_lazy = () -> CurrencyConversion2.mmDeclarationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ActionMessage5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrencyConversion6.mmCurrencyConversionIdentification, CurrencyConversion6.mmTargetCurrency, CurrencyConversion6.mmResultingAmount, CurrencyConversion6.mmExchangeRate,
						CurrencyConversion6.mmInvertedExchangeRate, CurrencyConversion6.mmQuotationDate, CurrencyConversion6.mmValidUntil, CurrencyConversion6.mmSourceCurrency, CurrencyConversion6.mmOriginalAmount,
						CurrencyConversion6.mmCommissionDetails, CurrencyConversion6.mmMarkUpDetails, CurrencyConversion6.mmDeclarationDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion6";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversion12.mmObject());
				previousVersion_lazy = () -> CurrencyConversion2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCurrencyConversionIdentification() {
		return currencyConversionIdentification;
	}

	public void setCurrencyConversionIdentification(Max35Text currencyConversionIdentification) {
		this.currencyConversionIdentification = currencyConversionIdentification;
	}

	public CurrencyDetails1 getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(com.tools20022.repository.msg.CurrencyDetails1 targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public ImpliedCurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public void setResultingAmount(ImpliedCurrencyAndAmount resultingAmount) {
		this.resultingAmount = resultingAmount;
	}

	public PercentageRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public PercentageRate getInvertedExchangeRate() {
		return invertedExchangeRate;
	}

	public void setInvertedExchangeRate(PercentageRate invertedExchangeRate) {
		this.invertedExchangeRate = invertedExchangeRate;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
	}

	public ISODateTime getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(ISODateTime validUntil) {
		this.validUntil = validUntil;
	}

	public CurrencyDetails1 getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(com.tools20022.repository.msg.CurrencyDetails1 sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public ImpliedCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(ImpliedCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	public List<Commission19> getCommissionDetails() {
		return commissionDetails;
	}

	public void setCommissionDetails(List<com.tools20022.repository.msg.Commission19> commissionDetails) {
		this.commissionDetails = commissionDetails;
	}

	public List<Commission18> getMarkUpDetails() {
		return markUpDetails;
	}

	public void setMarkUpDetails(List<com.tools20022.repository.msg.Commission18> markUpDetails) {
		this.markUpDetails = markUpDetails;
	}

	public ActionMessage5 getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(com.tools20022.repository.msg.ActionMessage5 declarationDetails) {
		this.declarationDetails = declarationDetails;
	}
}