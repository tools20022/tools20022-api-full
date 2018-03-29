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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.InvoiceFinancingPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount7;
import com.tools20022.repository.msg.FinancingDateDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Summary information about amount financed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmFinancedItemNumber
 * FinancingAllowedSummary1.mmFinancedItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmTotalAcceptedItemsAmount
 * FinancingAllowedSummary1.mmTotalAcceptedItemsAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmAppliedPercentage
 * FinancingAllowedSummary1.mmAppliedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmTotalFinancedAmount
 * FinancingAllowedSummary1.mmTotalFinancedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmFinancingDateDetails
 * FinancingAllowedSummary1.mmFinancingDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmCreditAccount
 * FinancingAllowedSummary1.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmFinancingAccount
 * FinancingAllowedSummary1.mmFinancingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
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
 * "FinancingAllowedSummary1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Summary information about amount financed."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingAllowedSummary1", propOrder = {"financedItemNumber", "totalAcceptedItemsAmount", "appliedPercentage", "totalFinancedAmount", "financingDateDetails", "creditAccount", "financingAccount"})
public class FinancingAllowedSummary1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FincdItmNb", required = true)
	protected Number financedItemNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincdItmNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancedItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of invoices/instalments financed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAllowedSummary1, Number> mmFinancedItemNumber = new MMMessageAttribute<FinancingAllowedSummary1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "FincdItmNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancedItemNumber";
			definition = "Number of invoices/instalments financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(FinancingAllowedSummary1 obj) {
			return obj.getFinancedItemNumber();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, Number value) {
			obj.setFinancedItemNumber(value);
		}
	};
	@XmlElement(name = "TtlAccptdItmsAmt", required = true)
	protected ActiveCurrencyAndAmount totalAcceptedItemsAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAccptdItmsAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAcceptedItemsAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the original total amounts of the invoices accepted for financing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAllowedSummary1, ActiveCurrencyAndAmount> mmTotalAcceptedItemsAmount = new MMMessageAttribute<FinancingAllowedSummary1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "TtlAccptdItmsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAcceptedItemsAmount";
			definition = "Sum of the original total amounts of the invoices accepted for financing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(FinancingAllowedSummary1 obj) {
			return obj.getTotalAcceptedItemsAmount();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalAcceptedItemsAmount(value);
		}
	};
	@XmlElement(name = "ApldPctg")
	protected PercentageRate appliedPercentage;
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmAppliedPercentage
	 * InvoiceFinancingAgreement.mmAppliedPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage rate applied to calculate the total amount financed related to the total amounts of the invoices accepted for financing. It represents the average percentage rate applied to all single invoice requests financed. It can be calculated as result of \"TotalFinancedAmount\" divided by \"TotalAcceptedItemsAmount\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAllowedSummary1, Optional<PercentageRate>> mmAppliedPercentage = new MMMessageAttribute<FinancingAllowedSummary1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmAppliedPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "ApldPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedPercentage";
			definition = "Percentage rate applied to calculate the total amount financed related to the total amounts of the invoices accepted for financing. It represents the average percentage rate applied to all single invoice requests financed. It can be calculated as result of \"TotalFinancedAmount\" divided by \"TotalAcceptedItemsAmount\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancingAllowedSummary1 obj) {
			return obj.getAppliedPercentage();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, Optional<PercentageRate> value) {
			obj.setAppliedPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlFincdAmt", required = true)
	protected ActiveCurrencyAndAmount totalFinancedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmFinancedAmount
	 * InvoiceFinancingAgreement.mmFinancedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlFincdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFinancedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount financed, defined as the entire financed amount of the requests."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAllowedSummary1, ActiveCurrencyAndAmount> mmTotalFinancedAmount = new MMMessageAttribute<FinancingAllowedSummary1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmFinancedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "TtlFincdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFinancedAmount";
			definition = "Total amount financed, defined as the entire financed amount of the requests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(FinancingAllowedSummary1 obj) {
			return obj.getTotalFinancedAmount();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalFinancedAmount(value);
		}
	};
	@XmlElement(name = "FincgDtDtls")
	protected FinancingDateDetails1 financingDateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancingDateDetails1
	 * FinancingDateDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgDtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingDateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of dates (eg book date, credit date) related to the crediting of the financed amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<FinancingDateDetails1>> mmFinancingDateDetails = new MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<FinancingDateDetails1>>() {
		{
			businessComponentTrace_lazy = () -> BookEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "FincgDtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingDateDetails";
			definition = "Set of dates (eg book date, credit date) related to the crediting of the financed amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingDateDetails1.mmObject();
		}

		@Override
		public Optional<FinancingDateDetails1> getValue(FinancingAllowedSummary1 obj) {
			return obj.getFinancingDateDetails();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, Optional<FinancingDateDetails1> value) {
			obj.setFinancingDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtAcct")
	protected CashAccount7 creditAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmCashAccount
	 * InvoiceFinancingPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account, held by Financing Requestor, actually used for crediting the amount financed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<CashAccount7>> mmCreditAccount = new MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "CdtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Unambiguous identification of the account, held by Financing Requestor, actually used for crediting the amount financed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(FinancingAllowedSummary1 obj) {
			return obj.getCreditAccount();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, Optional<CashAccount7> value) {
			obj.setCreditAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "FincgAcct")
	protected CashAccount7 financingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmCashAccount
	 * InvoiceFinancingPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the internal bank account actually used by First Agent to manage the line of credit granted to Financing Requestor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<CashAccount7>> mmFinancingAccount = new MMMessageAssociationEnd<FinancingAllowedSummary1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
			isDerived = false;
			xmlTag = "FincgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAccount";
			definition = "Unambiguous identification of the internal bank account actually used by First Agent to manage the line of credit granted to Financing Requestor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(FinancingAllowedSummary1 obj) {
			return obj.getFinancingAccount();
		}

		@Override
		public void setValue(FinancingAllowedSummary1 obj, Optional<CashAccount7> value) {
			obj.setFinancingAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAllowedSummary1.mmFinancedItemNumber, com.tools20022.repository.msg.FinancingAllowedSummary1.mmTotalAcceptedItemsAmount,
						com.tools20022.repository.msg.FinancingAllowedSummary1.mmAppliedPercentage, com.tools20022.repository.msg.FinancingAllowedSummary1.mmTotalFinancedAmount,
						com.tools20022.repository.msg.FinancingAllowedSummary1.mmFinancingDateDetails, com.tools20022.repository.msg.FinancingAllowedSummary1.mmCreditAccount,
						com.tools20022.repository.msg.FinancingAllowedSummary1.mmFinancingAccount);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingAllowedSummary1";
				definition = "Summary information about amount financed.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getFinancedItemNumber() {
		return financedItemNumber;
	}

	public FinancingAllowedSummary1 setFinancedItemNumber(Number financedItemNumber) {
		this.financedItemNumber = Objects.requireNonNull(financedItemNumber);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalAcceptedItemsAmount() {
		return totalAcceptedItemsAmount;
	}

	public FinancingAllowedSummary1 setTotalAcceptedItemsAmount(ActiveCurrencyAndAmount totalAcceptedItemsAmount) {
		this.totalAcceptedItemsAmount = Objects.requireNonNull(totalAcceptedItemsAmount);
		return this;
	}

	public Optional<PercentageRate> getAppliedPercentage() {
		return appliedPercentage == null ? Optional.empty() : Optional.of(appliedPercentage);
	}

	public FinancingAllowedSummary1 setAppliedPercentage(PercentageRate appliedPercentage) {
		this.appliedPercentage = appliedPercentage;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalFinancedAmount() {
		return totalFinancedAmount;
	}

	public FinancingAllowedSummary1 setTotalFinancedAmount(ActiveCurrencyAndAmount totalFinancedAmount) {
		this.totalFinancedAmount = Objects.requireNonNull(totalFinancedAmount);
		return this;
	}

	public Optional<FinancingDateDetails1> getFinancingDateDetails() {
		return financingDateDetails == null ? Optional.empty() : Optional.of(financingDateDetails);
	}

	public FinancingAllowedSummary1 setFinancingDateDetails(FinancingDateDetails1 financingDateDetails) {
		this.financingDateDetails = financingDateDetails;
		return this;
	}

	public Optional<CashAccount7> getCreditAccount() {
		return creditAccount == null ? Optional.empty() : Optional.of(creditAccount);
	}

	public FinancingAllowedSummary1 setCreditAccount(CashAccount7 creditAccount) {
		this.creditAccount = creditAccount;
		return this;
	}

	public Optional<CashAccount7> getFinancingAccount() {
		return financingAccount == null ? Optional.empty() : Optional.of(financingAccount);
	}

	public FinancingAllowedSummary1 setFinancingAccount(CashAccount7 financingAccount) {
		this.financingAccount = financingAccount;
		return this;
	}
}