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
import com.tools20022.repository.codeset.CardAccountType2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeOfAmount1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the transaction in the completion advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmCurrency
 * CardPaymentTransactionDetails21.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmTotalAmount
 * CardPaymentTransactionDetails21.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAmountQualifier
 * CardPaymentTransactionDetails21.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmDetailedAmount
 * CardPaymentTransactionDetails21.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmRequestedAmount
 * CardPaymentTransactionDetails21.mmRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAuthorisedAmount
 * CardPaymentTransactionDetails21.mmAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmValidityDate
 * CardPaymentTransactionDetails21.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmUnattendedLevelCategory
 * CardPaymentTransactionDetails21.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAccountType
 * CardPaymentTransactionDetails21.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmCurrencyConversion
 * CardPaymentTransactionDetails21.mmCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmInstalment
 * CardPaymentTransactionDetails21.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAggregationTransaction
 * CardPaymentTransactionDetails21.mmAggregationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmProduct
 * CardPaymentTransactionDetails21.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmCardPaymentInvoice
 * CardPaymentTransactionDetails21.mmCardPaymentInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmICCRelatedData
 * CardPaymentTransactionDetails21.mmICCRelatedData}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransactionDetails21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the transaction in the completion advice."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29
 * CardPaymentTransactionDetails29}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14
 * CardPaymentTransactionDetails14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransactionDetails21", propOrder = {"currency", "totalAmount", "amountQualifier", "detailedAmount", "requestedAmount", "authorisedAmount", "validityDate", "unattendedLevelCategory", "accountType",
		"currencyConversion", "instalment", "aggregationTransaction", "product", "cardPaymentInvoice", "iCCRelatedData"})
public class CardPaymentTransactionDetails21 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmCurrency
	 * CardPaymentTransactionDetails29.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmCurrency
	 * CardPaymentTransactionDetails14.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, CurrencyCode> mmCurrency = new MMMessageAttribute<CardPaymentTransactionDetails21, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmCurrency);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, CurrencyCode value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmTotalAmount
	 * CardPaymentTransactionDetails29.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmTotalAmount
	 * CardPaymentTransactionDetails14.mmTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, ImpliedCurrencyAndAmount> mmTotalAmount = new MMMessageAttribute<CardPaymentTransactionDetails21, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmTotalAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, ImpliedCurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAmountQualifier
	 * CardPaymentTransactionDetails29.mmAmountQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmAmountQualifier
	 * CardPaymentTransactionDetails14.mmAmountQualifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<TypeOfAmount1Code>> mmAmountQualifier = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<TypeOfAmount1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "AmtQlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQualifier";
			definition = "Qualifies the amount associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmAmountQualifier);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmAmountQualifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount1Code.mmObject();
		}

		@Override
		public Optional<TypeOfAmount1Code> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getAmountQualifier();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<TypeOfAmount1Code> value) {
			obj.setAmountQualifier(value.orElse(null));
		}
	};
	@XmlElement(name = "DtldAmt")
	protected DetailedAmount7 detailedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmDetailedAmount
	 * CardPaymentTransactionDetails29.mmDetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmDetailedAmount
	 * CardPaymentTransactionDetails14.mmDetailedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<DetailedAmount7>> mmDetailedAmount = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<DetailedAmount7>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "DtldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amounts associated with the total amount of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmDetailedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmDetailedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount7.mmObject();
		}

		@Override
		public Optional<DetailedAmount7> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getDetailedAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<DetailedAmount7> value) {
			obj.setDetailedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdAmt")
	protected ImpliedCurrencyAndAmount requestedAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount requested to be authorised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmRequestedAmount
	 * CardPaymentTransactionDetails29.mmRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmRequestedAmount
	 * CardPaymentTransactionDetails14.mmRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ImpliedCurrencyAndAmount>> mmRequestedAmount = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "ReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedAmount";
			definition = "Amount requested to be authorised.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmRequestedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getRequestedAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthrsdAmt")
	protected ImpliedCurrencyAndAmount authorisedAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount authorised for the payment transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAuthorisedAmount
	 * CardPaymentTransactionDetails29.mmAuthorisedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmAuthorisedAmount
	 * CardPaymentTransactionDetails14.mmAuthorisedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ImpliedCurrencyAndAmount>> mmAuthorisedAmount = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAmount";
			definition = "Amount authorised for the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmAuthorisedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmAuthorisedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getAuthorisedAmount();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setAuthorisedAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmValidityDate
	 * CardPaymentTransactionDetails29.mmValidityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmValidityDate
	 * CardPaymentTransactionDetails14.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ISODate>> mmValidityDate = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmValidityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmValidityDate);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getValidityDate();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<ISODate> value) {
			obj.setValidityDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails29.mmUnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails14.mmUnattendedLevelCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<Max35NumericText>> mmUnattendedLevelCategory = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<Max35NumericText>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmUnattendedLevelCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "UattnddLvlCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmUnattendedLevelCategory);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmUnattendedLevelCategory;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Optional<Max35NumericText> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getUnattendedLevelCategory();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<Max35NumericText> value) {
			obj.setUnattendedLevelCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTp")
	protected CardAccountType2Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
	 * PaymentCard.mmRelatedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAccountType
	 * CardPaymentTransactionDetails29.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmAccountType
	 * CardPaymentTransactionDetails14.mmAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<CardAccountType2Code>> mmAccountType = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<CardAccountType2Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmRelatedAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmAccountType);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType2Code.mmObject();
		}

		@Override
		public Optional<CardAccountType2Code> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<CardAccountType2Code> value) {
			obj.setAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyConvs")
	protected CurrencyConversion3 currencyConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion3
	 * CurrencyConversion3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency conversion proposed to the cardholder."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails29.mmCurrencyConversionResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmCurrencyConversion
	 * CardPaymentTransactionDetails14.mmCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<CurrencyConversion3>> mmCurrencyConversion = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<CurrencyConversion3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Currency conversion proposed to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmCurrencyConversionResult);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmCurrencyConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion3.mmObject();
		}

		@Override
		public Optional<CurrencyConversion3> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getCurrencyConversion();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<CurrencyConversion3> value) {
			obj.setCurrencyConversion(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmInstalment
	 * CardPaymentTransactionDetails29.mmInstalment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmInstalment
	 * CardPaymentTransactionDetails14.mmInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<RecurringTransaction2>> mmInstalment = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<RecurringTransaction2>>() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "Instlmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			definition = "Data related to a financial loan (instalment) or to a recurring transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmInstalment);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecurringTransaction2.mmObject();
		}

		@Override
		public Optional<RecurringTransaction2> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getInstalment();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<RecurringTransaction2> value) {
			obj.setInstalment(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtnTx")
	protected AggregationTransaction1 aggregationTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
	 * AggregationTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAggregationTransaction
	 * CardPaymentTransactionDetails29.mmAggregationTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<AggregationTransaction1>> mmAggregationTransaction = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<AggregationTransaction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "AggtnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationTransaction";
			definition = "Payment transaction with an aggregated amount.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmAggregationTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregationTransaction1.mmObject();
		}

		@Override
		public Optional<AggregationTransaction1> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getAggregationTransaction();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<AggregationTransaction1> value) {
			obj.setAggregationTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "Pdct")
	protected List<Product1> product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product1 Product1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmSaleItem
	 * CardPaymentTransactionDetails29.mmSaleItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmProduct
	 * CardPaymentTransactionDetails14.mmProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, List<Product1>> mmProduct = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, List<Product1>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmSaleItem);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmProduct;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product1.mmObject();
		}

		@Override
		public List<Product1> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, List<Product1> value) {
			obj.setProduct(value);
		}
	};
	@XmlElement(name = "CardPmtInvc")
	protected CardPaymentInvoice1 cardPaymentInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
	 * CardPaymentInvoice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails29.mmCardPaymentInvoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails14.mmCardPaymentInvoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<CardPaymentInvoice1>> mmCardPaymentInvoice = new MMMessageAssociationEnd<CardPaymentTransactionDetails21, Optional<CardPaymentInvoice1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "CardPmtInvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPaymentInvoice";
			definition = "Detailed invoice data.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmCardPaymentInvoice);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmCardPaymentInvoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentInvoice1.mmObject();
		}

		@Override
		public Optional<CardPaymentInvoice1> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getCardPaymentInvoice();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<CardPaymentInvoice1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
	 * CardPaymentTransactionDetails21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmICCRelatedData
	 * CardPaymentTransactionDetails29.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmICCRelatedData
	 * CardPaymentTransactionDetails14.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionDetails21, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<CardPaymentTransactionDetails21, Optional<Max10000Binary>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmICCRelatedData;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmICCRelatedData);
			previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(CardPaymentTransactionDetails21 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(CardPaymentTransactionDetails21 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmCurrency, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmTotalAmount,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmAmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmDetailedAmount,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmRequestedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmAuthorisedAmount,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmUnattendedLevelCategory,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmAccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmCurrencyConversion,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmInstalment, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmAggregationTransaction,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmProduct, com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmCardPaymentInvoice,
						com.tools20022.repository.msg.CardPaymentTransactionDetails21.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CardPaymentTransactionDetails21";
				definition = "Details of the transaction in the completion advice.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails29.mmObject());
				previousVersion_lazy = () -> CardPaymentTransactionDetails14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public CardPaymentTransactionDetails21 setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public ImpliedCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public CardPaymentTransactionDetails21 setTotalAmount(ImpliedCurrencyAndAmount totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public Optional<TypeOfAmount1Code> getAmountQualifier() {
		return amountQualifier == null ? Optional.empty() : Optional.of(amountQualifier);
	}

	public CardPaymentTransactionDetails21 setAmountQualifier(TypeOfAmount1Code amountQualifier) {
		this.amountQualifier = amountQualifier;
		return this;
	}

	public Optional<DetailedAmount7> getDetailedAmount() {
		return detailedAmount == null ? Optional.empty() : Optional.of(detailedAmount);
	}

	public CardPaymentTransactionDetails21 setDetailedAmount(DetailedAmount7 detailedAmount) {
		this.detailedAmount = detailedAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getRequestedAmount() {
		return requestedAmount == null ? Optional.empty() : Optional.of(requestedAmount);
	}

	public CardPaymentTransactionDetails21 setRequestedAmount(ImpliedCurrencyAndAmount requestedAmount) {
		this.requestedAmount = requestedAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getAuthorisedAmount() {
		return authorisedAmount == null ? Optional.empty() : Optional.of(authorisedAmount);
	}

	public CardPaymentTransactionDetails21 setAuthorisedAmount(ImpliedCurrencyAndAmount authorisedAmount) {
		this.authorisedAmount = authorisedAmount;
		return this;
	}

	public Optional<ISODate> getValidityDate() {
		return validityDate == null ? Optional.empty() : Optional.of(validityDate);
	}

	public CardPaymentTransactionDetails21 setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
		return this;
	}

	public Optional<Max35NumericText> getUnattendedLevelCategory() {
		return unattendedLevelCategory == null ? Optional.empty() : Optional.of(unattendedLevelCategory);
	}

	public CardPaymentTransactionDetails21 setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = unattendedLevelCategory;
		return this;
	}

	public Optional<CardAccountType2Code> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public CardPaymentTransactionDetails21 setAccountType(CardAccountType2Code accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<CurrencyConversion3> getCurrencyConversion() {
		return currencyConversion == null ? Optional.empty() : Optional.of(currencyConversion);
	}

	public CardPaymentTransactionDetails21 setCurrencyConversion(CurrencyConversion3 currencyConversion) {
		this.currencyConversion = currencyConversion;
		return this;
	}

	public Optional<RecurringTransaction2> getInstalment() {
		return instalment == null ? Optional.empty() : Optional.of(instalment);
	}

	public CardPaymentTransactionDetails21 setInstalment(RecurringTransaction2 instalment) {
		this.instalment = instalment;
		return this;
	}

	public Optional<AggregationTransaction1> getAggregationTransaction() {
		return aggregationTransaction == null ? Optional.empty() : Optional.of(aggregationTransaction);
	}

	public CardPaymentTransactionDetails21 setAggregationTransaction(AggregationTransaction1 aggregationTransaction) {
		this.aggregationTransaction = aggregationTransaction;
		return this;
	}

	public List<Product1> getProduct() {
		return product == null ? product = new ArrayList<>() : product;
	}

	public CardPaymentTransactionDetails21 setProduct(List<Product1> product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public Optional<CardPaymentInvoice1> getCardPaymentInvoice() {
		return cardPaymentInvoice == null ? Optional.empty() : Optional.of(cardPaymentInvoice);
	}

	public CardPaymentTransactionDetails21 setCardPaymentInvoice(CardPaymentInvoice1 cardPaymentInvoice) {
		this.cardPaymentInvoice = cardPaymentInvoice;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public CardPaymentTransactionDetails21 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}