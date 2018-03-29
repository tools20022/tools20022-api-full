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
import com.tools20022.repository.codeset.CardAccountType3Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.OnLineReason1Code;
import com.tools20022.repository.codeset.TypeOfAmount1Code;
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
 * Details of the transaction in the authorisation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmCurrency
 * CardPaymentTransactionDetails27.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmTotalAmount
 * CardPaymentTransactionDetails27.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmAmountQualifier
 * CardPaymentTransactionDetails27.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmDetailedAmount
 * CardPaymentTransactionDetails27.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmValidityDate
 * CardPaymentTransactionDetails27.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmOnLineReason
 * CardPaymentTransactionDetails27.mmOnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmUnattendedLevelCategory
 * CardPaymentTransactionDetails27.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmAccountType
 * CardPaymentTransactionDetails27.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmCurrencyConversionResult
 * CardPaymentTransactionDetails27.mmCurrencyConversionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmInstalment
 * CardPaymentTransactionDetails27.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmAggregationTransaction
 * CardPaymentTransactionDetails27.mmAggregationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmProductCodeSetIdentification
 * CardPaymentTransactionDetails27.mmProductCodeSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmSaleItem
 * CardPaymentTransactionDetails27.mmSaleItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmDeliveryLocation
 * CardPaymentTransactionDetails27.mmDeliveryLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmCardPaymentInvoice
 * CardPaymentTransactionDetails27.mmCardPaymentInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmICCRelatedData
 * CardPaymentTransactionDetails27.mmICCRelatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentTransactionDetails27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the transaction in the authorisation request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41
 * CardPaymentTransactionDetails41}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19
 * CardPaymentTransactionDetails19}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransactionDetails27", propOrder = {"currency", "totalAmount", "amountQualifier", "detailedAmount", "validityDate", "onLineReason", "unattendedLevelCategory", "accountType", "currencyConversionResult",
		"instalment", "aggregationTransaction", "productCodeSetIdentification", "saleItem", "deliveryLocation", "cardPaymentInvoice", "iCCRelatedData"})
public class CardPaymentTransactionDetails27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy", required = true)
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmCurrency
	 * CardPaymentTransactionDetails41.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmCurrency
	 * CardPaymentTransactionDetails19.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, CurrencyCode> mmCurrency = new MMMessageAttribute<CardPaymentTransactionDetails27, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmCurrency);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "TtlAmt", required = true)
	protected ImpliedCurrencyAndAmount totalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmTotalAmount
	 * CardPaymentTransactionDetails41.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmTotalAmount
	 * CardPaymentTransactionDetails19.mmTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, ImpliedCurrencyAndAmount> mmTotalAmount = new MMMessageAttribute<CardPaymentTransactionDetails27, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmTotalAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, ImpliedCurrencyAndAmount value) {
			obj.setTotalAmount(value);
		}
	};
	@XmlElement(name = "AmtQlfr")
	protected TypeOfAmount1Code amountQualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
	 * CardPayment.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtQlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the amount associated with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAmountQualifier
	 * CardPaymentTransactionDetails41.mmAmountQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmAmountQualifier
	 * CardPaymentTransactionDetails19.mmAmountQualifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<TypeOfAmount1Code>> mmAmountQualifier = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<TypeOfAmount1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "AmtQlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQualifier";
			definition = "Qualifies the amount associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmAmountQualifier);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmAmountQualifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount1Code.mmObject();
		}

		@Override
		public Optional<TypeOfAmount1Code> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getAmountQualifier();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<TypeOfAmount1Code> value) {
			obj.setAmountQualifier(value.orElse(null));
		}
	};
	@XmlElement(name = "DtldAmt")
	protected DetailedAmount15 detailedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed amounts associated with the total amount of transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmDetailedAmount
	 * CardPaymentTransactionDetails41.mmDetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmDetailedAmount
	 * CardPaymentTransactionDetails19.mmDetailedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<DetailedAmount15>> mmDetailedAmount = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<DetailedAmount15>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "DtldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amounts associated with the total amount of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmDetailedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmDetailedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount15.mmObject();
		}

		@Override
		public Optional<DetailedAmount15> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getDetailedAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<DetailedAmount15> value) {
			obj.setDetailedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtyDt")
	protected ISODate validityDate;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmValidityDate
	 * CardPaymentValidation.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmValidityDate
	 * CardPaymentTransactionDetails41.mmValidityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmValidityDate
	 * CardPaymentTransactionDetails19.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<ISODate>> mmValidityDate = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmValidityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmValidityDate);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getValidityDate();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<ISODate> value) {
			obj.setValidityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLineRsn")
	protected OnLineReason1Code onLineReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmOnLineReason
	 * CardPaymentValidation.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to process an online authorisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmOnLineReason
	 * CardPaymentTransactionDetails41.mmOnLineReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmOnLineReason
	 * CardPaymentTransactionDetails19.mmOnLineReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<OnLineReason1Code>> mmOnLineReason = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<OnLineReason1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmOnLineReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "OnLineRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmOnLineReason);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmOnLineReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OnLineReason1Code.mmObject();
		}

		@Override
		public Optional<OnLineReason1Code> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getOnLineReason();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<OnLineReason1Code> value) {
			obj.setOnLineReason(value.orElse(null));
		}
	};
	@XmlElement(name = "UattnddLvlCtgy")
	protected Max35NumericText unattendedLevelCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmUnattendedLevelCategory
	 * CardPaymentAcquiring.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UattnddLvlCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category level on an unattended POI (Point Of Interaction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails41.mmUnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails19.mmUnattendedLevelCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max35NumericText>> mmUnattendedLevelCategory = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max35NumericText>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmUnattendedLevelCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "UattnddLvlCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmUnattendedLevelCategory);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmUnattendedLevelCategory;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Optional<Max35NumericText> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getUnattendedLevelCategory();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<Max35NumericText> value) {
			obj.setUnattendedLevelCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTp")
	protected CardAccountType3Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
	 * PaymentCard.mmRelatedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAccountType
	 * CardPaymentTransactionDetails41.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmAccountType
	 * CardPaymentTransactionDetails19.mmAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<CardAccountType3Code>> mmAccountType = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<CardAccountType3Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmRelatedAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmAccountType);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType3Code.mmObject();
		}

		@Override
		public Optional<CardAccountType3Code> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<CardAccountType3Code> value) {
			obj.setAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyConvsRslt")
	protected CurrencyConversion8 currencyConversionResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion8
	 * CurrencyConversion8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the currency conversion proposed to the cardholder."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails41.mmCurrencyConversionResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmCurrencyConversion
	 * CardPaymentTransactionDetails19.mmCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<CurrencyConversion8>> mmCurrencyConversionResult = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<CurrencyConversion8>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResult";
			definition = "Result of the currency conversion proposed to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmCurrencyConversionResult);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmCurrencyConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion8.mmObject();
		}

		@Override
		public Optional<CurrencyConversion8> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getCurrencyConversionResult();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<CurrencyConversion8> value) {
			obj.setCurrencyConversionResult(value.orElse(null));
		}
	};
	@XmlElement(name = "Instlmt")
	protected RecurringTransaction2 instalment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instlmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a financial loan (instalment) or to a recurring transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmInstalment
	 * CardPaymentTransactionDetails41.mmInstalment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmInstalment
	 * CardPaymentTransactionDetails19.mmInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<RecurringTransaction2>> mmInstalment = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<RecurringTransaction2>>() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "Instlmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			definition = "Data related to a financial loan (instalment) or to a recurring transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmInstalment);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecurringTransaction2.mmObject();
		}

		@Override
		public Optional<RecurringTransaction2> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getInstalment();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<RecurringTransaction2> value) {
			obj.setInstalment(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtnTx")
	protected AggregationTransaction2 aggregationTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtnTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregationTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment transaction with an aggregated amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAggregationTransaction
	 * CardPaymentTransactionDetails41.mmAggregationTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmAggregationTransaction
	 * CardPaymentTransactionDetails19.mmAggregationTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<AggregationTransaction2>> mmAggregationTransaction = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<AggregationTransaction2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "AggtnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationTransaction";
			definition = "Payment transaction with an aggregated amount.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmAggregationTransaction);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmAggregationTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregationTransaction2.mmObject();
		}

		@Override
		public Optional<AggregationTransaction2> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getAggregationTransaction();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<AggregationTransaction2> value) {
			obj.setAggregationTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctCdSetId")
	protected Max10Text productCodeSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCdSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCodeSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification used to identify the products."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmProductCodeSetIdentification
	 * CardPaymentTransactionDetails41.mmProductCodeSetIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10Text>> mmProductCodeSetIdentification = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "PdctCdSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCodeSetIdentification";
			definition = "Codification used to identify the products.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmProductCodeSetIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getProductCodeSetIdentification();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<Max10Text> value) {
			obj.setProductCodeSetIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleItm")
	protected List<Product3> saleItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product3 Product3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Item purchased with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmSaleItem
	 * CardPaymentTransactionDetails41.mmSaleItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmProduct
	 * CardPaymentTransactionDetails19.mmProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, List<Product3>> mmSaleItem = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, List<Product3>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "SaleItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleItem";
			definition = "Item purchased with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmSaleItem);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmProduct;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product3.mmObject();
		}

		@Override
		public List<Product3> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getSaleItem();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, List<Product3> value) {
			obj.setSaleItem(value);
		}
	};
	@XmlElement(name = "DlvryLctn")
	protected Max10Text deliveryLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location of the delivery, for instance pump number or parking bay."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmDeliveryLocation
	 * CardPaymentTransactionDetails41.mmDeliveryLocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10Text>> mmDeliveryLocation = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "DlvryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryLocation";
			definition = "Location of the delivery, for instance pump number or parking bay.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmDeliveryLocation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getDeliveryLocation();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<Max10Text> value) {
			obj.setDeliveryLocation(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPmtInvc")
	protected CardPaymentInvoice2 cardPaymentInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPmtInvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed invoice data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails41.mmCardPaymentInvoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails19.mmCardPaymentInvoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<CardPaymentInvoice2>> mmCardPaymentInvoice = new MMMessageAssociationEnd<CardPaymentTransactionDetails27, Optional<CardPaymentInvoice2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "CardPmtInvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPaymentInvoice";
			definition = "Detailed invoice data.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmCardPaymentInvoice);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmCardPaymentInvoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentInvoice2.mmObject();
		}

		@Override
		public Optional<CardPaymentInvoice2> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getCardPaymentInvoice();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<CardPaymentInvoice2> value) {
			obj.setCardPaymentInvoice(value.orElse(null));
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmICCRelatedData
	 * CardPaymentAcquiring.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
	 * CardPaymentTransactionDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to an integrated circuit card application."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmICCRelatedData
	 * CardPaymentTransactionDetails41.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmICCRelatedData
	 * CardPaymentTransactionDetails19.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<CardPaymentTransactionDetails27, Optional<Max10000Binary>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmICCRelatedData;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmICCRelatedData);
			previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(CardPaymentTransactionDetails27 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails27 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmCurrency, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmTotalAmount,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmAmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmDetailedAmount,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmOnLineReason,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmUnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmAccountType,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmCurrencyConversionResult, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmInstalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmAggregationTransaction, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmProductCodeSetIdentification,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmSaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmDeliveryLocation,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmCardPaymentInvoice, com.tools20022.repository.msg.CardPaymentTransactionDetails27.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransactionDetails27";
				definition = "Details of the transaction in the authorisation request.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails41.mmObject());
				previousVersion_lazy = () -> CardPaymentTransactionDetails19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public CardPaymentTransactionDetails27 setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public ImpliedCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public CardPaymentTransactionDetails27 setTotalAmount(ImpliedCurrencyAndAmount totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public Optional<TypeOfAmount1Code> getAmountQualifier() {
		return amountQualifier == null ? Optional.empty() : Optional.of(amountQualifier);
	}

	public CardPaymentTransactionDetails27 setAmountQualifier(TypeOfAmount1Code amountQualifier) {
		this.amountQualifier = amountQualifier;
		return this;
	}

	public Optional<DetailedAmount15> getDetailedAmount() {
		return detailedAmount == null ? Optional.empty() : Optional.of(detailedAmount);
	}

	public CardPaymentTransactionDetails27 setDetailedAmount(DetailedAmount15 detailedAmount) {
		this.detailedAmount = detailedAmount;
		return this;
	}

	public Optional<ISODate> getValidityDate() {
		return validityDate == null ? Optional.empty() : Optional.of(validityDate);
	}

	public CardPaymentTransactionDetails27 setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
		return this;
	}

	public Optional<OnLineReason1Code> getOnLineReason() {
		return onLineReason == null ? Optional.empty() : Optional.of(onLineReason);
	}

	public CardPaymentTransactionDetails27 setOnLineReason(OnLineReason1Code onLineReason) {
		this.onLineReason = onLineReason;
		return this;
	}

	public Optional<Max35NumericText> getUnattendedLevelCategory() {
		return unattendedLevelCategory == null ? Optional.empty() : Optional.of(unattendedLevelCategory);
	}

	public CardPaymentTransactionDetails27 setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = unattendedLevelCategory;
		return this;
	}

	public Optional<CardAccountType3Code> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public CardPaymentTransactionDetails27 setAccountType(CardAccountType3Code accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<CurrencyConversion8> getCurrencyConversionResult() {
		return currencyConversionResult == null ? Optional.empty() : Optional.of(currencyConversionResult);
	}

	public CardPaymentTransactionDetails27 setCurrencyConversionResult(CurrencyConversion8 currencyConversionResult) {
		this.currencyConversionResult = currencyConversionResult;
		return this;
	}

	public Optional<RecurringTransaction2> getInstalment() {
		return instalment == null ? Optional.empty() : Optional.of(instalment);
	}

	public CardPaymentTransactionDetails27 setInstalment(RecurringTransaction2 instalment) {
		this.instalment = instalment;
		return this;
	}

	public Optional<AggregationTransaction2> getAggregationTransaction() {
		return aggregationTransaction == null ? Optional.empty() : Optional.of(aggregationTransaction);
	}

	public CardPaymentTransactionDetails27 setAggregationTransaction(AggregationTransaction2 aggregationTransaction) {
		this.aggregationTransaction = aggregationTransaction;
		return this;
	}

	public Optional<Max10Text> getProductCodeSetIdentification() {
		return productCodeSetIdentification == null ? Optional.empty() : Optional.of(productCodeSetIdentification);
	}

	public CardPaymentTransactionDetails27 setProductCodeSetIdentification(Max10Text productCodeSetIdentification) {
		this.productCodeSetIdentification = productCodeSetIdentification;
		return this;
	}

	public List<Product3> getSaleItem() {
		return saleItem == null ? saleItem = new ArrayList<>() : saleItem;
	}

	public CardPaymentTransactionDetails27 setSaleItem(List<Product3> saleItem) {
		this.saleItem = Objects.requireNonNull(saleItem);
		return this;
	}

	public Optional<Max10Text> getDeliveryLocation() {
		return deliveryLocation == null ? Optional.empty() : Optional.of(deliveryLocation);
	}

	public CardPaymentTransactionDetails27 setDeliveryLocation(Max10Text deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
		return this;
	}

	public Optional<CardPaymentInvoice2> getCardPaymentInvoice() {
		return cardPaymentInvoice == null ? Optional.empty() : Optional.of(cardPaymentInvoice);
	}

	public CardPaymentTransactionDetails27 setCardPaymentInvoice(CardPaymentInvoice2 cardPaymentInvoice) {
		this.cardPaymentInvoice = cardPaymentInvoice;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public CardPaymentTransactionDetails27 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}