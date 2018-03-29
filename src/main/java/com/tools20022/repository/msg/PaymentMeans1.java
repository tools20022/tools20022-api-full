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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PaymentMethod4Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.msg.CashAccount16;
import com.tools20022.repository.msg.PaymentTypeInformation19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Means by which a payment will be or has been made for settlement purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPaymentType
 * PaymentMeans1.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPaymentMethodCode
 * PaymentMeans1.mmPaymentMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPayeeCreditorAccount
 * PaymentMeans1.mmPayeeCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPayeeFinancialInstitution
 * PaymentMeans1.mmPayeeFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPayerDebtorAccount
 * PaymentMeans1.mmPayerDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPayerFinancialInstitution
 * PaymentMeans1.mmPayerFinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentMeans1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Means by which a payment will be or has been made for settlement purposes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentMeans1", propOrder = {"paymentType", "paymentMethodCode", "payeeCreditorAccount", "payeeFinancialInstitution", "payerDebtorAccount", "payerFinancialInstitution"})
public class PaymentMeans1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTp", required = true)
	protected PaymentTypeInformation19 paymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, PaymentTypeInformation19> mmPaymentType = new MMMessageAttribute<PaymentMeans1, PaymentTypeInformation19>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentTypeInformation19.mmObject();
		}

		@Override
		public PaymentTypeInformation19 getValue(PaymentMeans1 obj) {
			return obj.getPaymentType();
		}

		@Override
		public void setValue(PaymentMeans1 obj, PaymentTypeInformation19 value) {
			obj.setPaymentType(value);
		}
	};
	@XmlElement(name = "PmtMtdCd", required = true)
	protected PaymentMethod4Code paymentMethodCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod4Code
	 * PaymentMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
	 * CreditInstrument.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtdCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethodCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer method to be used for the transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, PaymentMethod4Code> mmPaymentMethodCode = new MMMessageAttribute<PaymentMeans1, PaymentMethod4Code>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PmtMtdCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethodCode";
			definition = "Transfer method to be used for the transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod4Code.mmObject();
		}

		@Override
		public PaymentMethod4Code getValue(PaymentMeans1 obj) {
			return obj.getPaymentMethodCode();
		}

		@Override
		public void setValue(PaymentMeans1 obj, PaymentMethod4Code value) {
			obj.setPaymentMethodCode(value);
		}
	};
	@XmlElement(name = "PyeeCdtrAcct", required = true)
	protected CashAccount16 payeeCreditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyeeCdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayeeCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor financial account of the payee party for this payment means."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, CashAccount16> mmPayeeCreditorAccount = new MMMessageAttribute<PaymentMeans1, CashAccount16>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PyeeCdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayeeCreditorAccount";
			definition = "Creditor financial account of the payee party for this payment means.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public CashAccount16 getValue(PaymentMeans1 obj) {
			return obj.getPayeeCreditorAccount();
		}

		@Override
		public void setValue(PaymentMeans1 obj, CashAccount16 value) {
			obj.setPayeeCreditorAccount(value);
		}
	};
	@XmlElement(name = "PyeeFI", required = true)
	protected BranchAndFinancialInstitutionIdentification4 payeeFinancialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyeeFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayeeFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor financial institution of the payee party specified for this payment means."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, BranchAndFinancialInstitutionIdentification4> mmPayeeFinancialInstitution = new MMMessageAttribute<PaymentMeans1, BranchAndFinancialInstitutionIdentification4>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PyeeFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayeeFinancialInstitution";
			definition = "Creditor financial institution of the payee party specified for this payment means.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification4 getValue(PaymentMeans1 obj) {
			return obj.getPayeeFinancialInstitution();
		}

		@Override
		public void setValue(PaymentMeans1 obj, BranchAndFinancialInstitutionIdentification4 value) {
			obj.setPayeeFinancialInstitution(value);
		}
	};
	@XmlElement(name = "PyerDbtrAcct")
	protected CashAccount16 payerDebtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyerDbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayerDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debtor financial account of the payer party for this payment means."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, Optional<CashAccount16>> mmPayerDebtorAccount = new MMMessageAttribute<PaymentMeans1, Optional<CashAccount16>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PyerDbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayerDebtorAccount";
			definition = "Debtor financial account of the payer party for this payment means.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(PaymentMeans1 obj) {
			return obj.getPayerDebtorAccount();
		}

		@Override
		public void setValue(PaymentMeans1 obj, Optional<CashAccount16> value) {
			obj.setPayerDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PyerFI")
	protected BranchAndFinancialInstitutionIdentification4 payerFinancialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyerFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayerFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debtor financial institution of the payer party specified for this payment means."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentMeans1, Optional<BranchAndFinancialInstitutionIdentification4>> mmPayerFinancialInstitution = new MMMessageAttribute<PaymentMeans1, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
			isDerived = false;
			xmlTag = "PyerFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayerFinancialInstitution";
			definition = "Debtor financial institution of the payer party specified for this payment means.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(PaymentMeans1 obj) {
			return obj.getPayerFinancialInstitution();
		}

		@Override
		public void setValue(PaymentMeans1 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setPayerFinancialInstitution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentMeans1.mmPaymentType, com.tools20022.repository.msg.PaymentMeans1.mmPaymentMethodCode,
						com.tools20022.repository.msg.PaymentMeans1.mmPayeeCreditorAccount, com.tools20022.repository.msg.PaymentMeans1.mmPayeeFinancialInstitution, com.tools20022.repository.msg.PaymentMeans1.mmPayerDebtorAccount,
						com.tools20022.repository.msg.PaymentMeans1.mmPayerFinancialInstitution);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentMeans1";
				definition = "Means by which a payment will be or has been made for settlement purposes.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentTypeInformation19 getPaymentType() {
		return paymentType;
	}

	public PaymentMeans1 setPaymentType(PaymentTypeInformation19 paymentType) {
		this.paymentType = Objects.requireNonNull(paymentType);
		return this;
	}

	public PaymentMethod4Code getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public PaymentMeans1 setPaymentMethodCode(PaymentMethod4Code paymentMethodCode) {
		this.paymentMethodCode = Objects.requireNonNull(paymentMethodCode);
		return this;
	}

	public CashAccount16 getPayeeCreditorAccount() {
		return payeeCreditorAccount;
	}

	public PaymentMeans1 setPayeeCreditorAccount(CashAccount16 payeeCreditorAccount) {
		this.payeeCreditorAccount = Objects.requireNonNull(payeeCreditorAccount);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getPayeeFinancialInstitution() {
		return payeeFinancialInstitution;
	}

	public PaymentMeans1 setPayeeFinancialInstitution(BranchAndFinancialInstitutionIdentification4 payeeFinancialInstitution) {
		this.payeeFinancialInstitution = Objects.requireNonNull(payeeFinancialInstitution);
		return this;
	}

	public Optional<CashAccount16> getPayerDebtorAccount() {
		return payerDebtorAccount == null ? Optional.empty() : Optional.of(payerDebtorAccount);
	}

	public PaymentMeans1 setPayerDebtorAccount(CashAccount16 payerDebtorAccount) {
		this.payerDebtorAccount = payerDebtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getPayerFinancialInstitution() {
		return payerFinancialInstitution == null ? Optional.empty() : Optional.of(payerFinancialInstitution);
	}

	public PaymentMeans1 setPayerFinancialInstitution(BranchAndFinancialInstitutionIdentification4 payerFinancialInstitution) {
		this.payerFinancialInstitution = payerFinancialInstitution;
		return this;
	}
}