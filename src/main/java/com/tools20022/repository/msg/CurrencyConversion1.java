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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.CurrencyConversionResponse1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.CurrencyExchange;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmCurrencyConversionIdentification
 * CurrencyConversion1.mmCurrencyConversionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResult
 * CurrencyConversion1.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResponseReason
 * CurrencyConversion1.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrency
 * CurrencyConversion1.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrencyNumeric
 * CurrencyConversion1.mmTargetCurrencyNumeric}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrencyDecimal
 * CurrencyConversion1.mmTargetCurrencyDecimal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrencyName
 * CurrencyConversion1.mmTargetCurrencyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResultingAmount
 * CurrencyConversion1.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmExchangeRate
 * CurrencyConversion1.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmInvertedExchangeRate
 * CurrencyConversion1.mmInvertedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmQuotationDate
 * CurrencyConversion1.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmValidUntil
 * CurrencyConversion1.mmValidUntil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrency
 * CurrencyConversion1.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrencyNumeric
 * CurrencyConversion1.mmSourceCurrencyNumeric}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrencyDecimal
 * CurrencyConversion1.mmSourceCurrencyDecimal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrencyName
 * CurrencyConversion1.mmSourceCurrencyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmOriginalAmount
 * CurrencyConversion1.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmCommissionDetails
 * CurrencyConversion1.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmMarkUpDetails
 * CurrencyConversion1.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmDeclarationDetails
 * CurrencyConversion1.mmDeclarationDetails}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyConversion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion2
 * CurrencyConversion2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5
 * CurrencyConversion5}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CurrencyConversion1 {

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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCurrencyConversionIdentification
	 * CurrencyConversion2.mmCurrencyConversionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyConversionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionIdentification";
			definition = "Identification of the currency conversion operation for the service provider.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmCurrencyConversionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyConversionResponse1Code result;
	/**
	 * Result of a requested currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a requested currency conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of a requested currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	protected Max35Text responseReason;
	/**
	 * Plain text explaining the result of the currency conversion request.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Plain text explaining the result of the  currency conversion request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponseReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Plain text explaining the result of the  currency conversion request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyCode targetCurrency;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmTargetCurrency
	 * CurrencyConversion2.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrency
	 * CurrencyConversion5.mmTargetCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmTargetCurrency, com.tools20022.repository.msg.CurrencyConversion5.mmTargetCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Exact3NumericText targetCurrencyNumeric;
	/**
	 * Currency into which the amount is converted (ISO 4217, 3 numeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcyNmrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrencyNumeric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the amount is converted (ISO 4217, 3 numeric characters)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrencyNumeric
	 * CurrencyConversion5.mmTargetCurrencyNumeric}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrencyNumeric = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcyNmrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrencyNumeric";
			definition = "Currency into which the amount is converted (ISO 4217, 3 numeric characters).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion5.mmTargetCurrencyNumeric);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected Number targetCurrencyDecimal;
	/**
	 * Maximal number of digits after the decimal separator for target currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcyDcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrencyDecimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximal number of digits after the decimal separator for target currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrencyDecimal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcyDcml";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrencyDecimal";
			definition = "Maximal number of digits after the decimal separator for target currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Text targetCurrencyName;
	/**
	 * Full name of the target currency.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrencyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full name of the target currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetCurrencyName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcyNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrencyName";
			definition = "Full name of the target currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmResultingAmount
	 * CurrencyConversion2.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmCalculatedAmount
	 * CurrencyConversion5.mmCalculatedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "RsltgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingAmount";
			definition = "Amount converted in the target currency, including additional charges.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion5.mmCalculatedAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRate
	 * CurrencyConversion2.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmRate
	 * CurrencyConversion5.mmRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the original amount into the resulting amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion5.mmRate);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmInvertedExchangeRate
	 * CurrencyConversion2.mmInvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvertedExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "NvrtdXchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvertedExchangeRate";
			definition = "Exchange rate, expressed as a percentage, applied to convert the resulting amount into the original amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmInvertedExchangeRate);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmQuotationDate
	 * CurrencyConversion2.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which the exchange rate has been quoted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmQuotationDate);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmValidUntil
	 * CurrencyConversion2.mmValidUntil}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntil = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "VldUntil";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntil";
			definition = "Validity limit of the exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmValidUntil);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CurrencyCode sourceCurrency;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 alphanumeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmSourceCurrency
	 * CurrencyConversion2.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrency
	 * CurrencyConversion5.mmSourceCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency from which the amount is converted (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion5.mmSourceCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode sourceCurrencyNumeric;
	/**
	 * Currency from which the amount is converted (ISO 4217, 3 numeric
	 * characters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcyNmrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrencyNumeric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency from which the amount is converted (ISO 4217, 3 numeric characters)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrencyNumeric
	 * CurrencyConversion5.mmSourceCurrencyNumeric}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrencyNumeric = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "SrcCcyNmrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrencyNumeric";
			definition = "Currency from which the amount is converted (ISO 4217, 3 numeric characters).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion5.mmSourceCurrencyNumeric);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Number sourceCurrencyDecimal;
	/**
	 * Maximal number of digits after the decimal separator for source currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcyDcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrencyDecimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximal number of digits after the decimal separator for source currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrencyDecimal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "SrcCcyDcml";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrencyDecimal";
			definition = "Maximal number of digits after the decimal separator for source currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Text sourceCurrencyName;
	/**
	 * Full name of the source currency.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrencyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full name of the source currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceCurrencyName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "SrcCcyNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrencyName";
			definition = "Full name of the source currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmOriginalAmount
	 * CurrencyConversion2.mmOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original amount in the source currency.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmOriginalAmount);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCommissionDetails
	 * CurrencyConversion2.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission or additional charges made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmCommissionDetails);
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmMarkUpDetails
	 * CurrencyConversion2.mmMarkUpDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarkUpDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "MrkUpDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUpDetails";
			definition = "Markup made as part of a currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmMarkUpDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission18.mmObject();
		}
	};
	protected Max2048Text declarationDetails;
	/**
	 * Card scheme declaration (disclaimer) to present to the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmDeclarationDetails
	 * CurrencyConversion2.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclarationDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion1.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Card scheme declaration (disclaimer) to present to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion2.mmDeclarationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion1.mmCurrencyConversionIdentification, com.tools20022.repository.msg.CurrencyConversion1.mmResult,
						com.tools20022.repository.msg.CurrencyConversion1.mmResponseReason, com.tools20022.repository.msg.CurrencyConversion1.mmTargetCurrency, com.tools20022.repository.msg.CurrencyConversion1.mmTargetCurrencyNumeric,
						com.tools20022.repository.msg.CurrencyConversion1.mmTargetCurrencyDecimal, com.tools20022.repository.msg.CurrencyConversion1.mmTargetCurrencyName, com.tools20022.repository.msg.CurrencyConversion1.mmResultingAmount,
						com.tools20022.repository.msg.CurrencyConversion1.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion1.mmInvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion1.mmQuotationDate,
						com.tools20022.repository.msg.CurrencyConversion1.mmValidUntil, com.tools20022.repository.msg.CurrencyConversion1.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion1.mmSourceCurrencyNumeric,
						com.tools20022.repository.msg.CurrencyConversion1.mmSourceCurrencyDecimal, com.tools20022.repository.msg.CurrencyConversion1.mmSourceCurrencyName, com.tools20022.repository.msg.CurrencyConversion1.mmOriginalAmount,
						com.tools20022.repository.msg.CurrencyConversion1.mmCommissionDetails, com.tools20022.repository.msg.CurrencyConversion1.mmMarkUpDetails, com.tools20022.repository.msg.CurrencyConversion1.mmDeclarationDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CurrencyConversion1";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversion2.mmObject(), CurrencyConversion5.mmObject());
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

	public CurrencyConversionResponse1Code getResult() {
		return result;
	}

	public void setResult(CurrencyConversionResponse1Code result) {
		this.result = result;
	}

	public Max35Text getResponseReason() {
		return responseReason;
	}

	public void setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
	}

	public CurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(CurrencyCode targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public Exact3NumericText getTargetCurrencyNumeric() {
		return targetCurrencyNumeric;
	}

	public void setTargetCurrencyNumeric(Exact3NumericText targetCurrencyNumeric) {
		this.targetCurrencyNumeric = targetCurrencyNumeric;
	}

	public Number getTargetCurrencyDecimal() {
		return targetCurrencyDecimal;
	}

	public void setTargetCurrencyDecimal(Number targetCurrencyDecimal) {
		this.targetCurrencyDecimal = targetCurrencyDecimal;
	}

	public Max35Text getTargetCurrencyName() {
		return targetCurrencyName;
	}

	public void setTargetCurrencyName(Max35Text targetCurrencyName) {
		this.targetCurrencyName = targetCurrencyName;
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

	public CurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(CurrencyCode sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public CurrencyCode getSourceCurrencyNumeric() {
		return sourceCurrencyNumeric;
	}

	public void setSourceCurrencyNumeric(CurrencyCode sourceCurrencyNumeric) {
		this.sourceCurrencyNumeric = sourceCurrencyNumeric;
	}

	public Number getSourceCurrencyDecimal() {
		return sourceCurrencyDecimal;
	}

	public void setSourceCurrencyDecimal(Number sourceCurrencyDecimal) {
		this.sourceCurrencyDecimal = sourceCurrencyDecimal;
	}

	public Max35Text getSourceCurrencyName() {
		return sourceCurrencyName;
	}

	public void setSourceCurrencyName(Max35Text sourceCurrencyName) {
		this.sourceCurrencyName = sourceCurrencyName;
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

	public Max2048Text getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(Max2048Text declarationDetails) {
		this.declarationDetails = declarationDetails;
	}
}