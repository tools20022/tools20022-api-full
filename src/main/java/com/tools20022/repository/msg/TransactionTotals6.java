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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional count which may be utilised for reconciliation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmAuthorisation
 * TransactionTotals6.mmAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmAuthorisationReversal
 * TransactionTotals6.mmAuthorisationReversal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals6#mmInquiry
 * TransactionTotals6.mmInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmInquiryReversal
 * TransactionTotals6.mmInquiryReversal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals6#mmPayments
 * TransactionTotals6.mmPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmPaymentReversal
 * TransactionTotals6.mmPaymentReversal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals6#mmTransfer
 * TransactionTotals6.mmTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmTransferReversal
 * TransactionTotals6.mmTransferReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals6#mmFeeCollection
 * TransactionTotals6.mmFeeCollection}</li>
 * </ul>
 * </li>
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
 * "TransactionTotals6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional count which may be utilised for reconciliation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionTotals4
 * TransactionTotals4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionTotals6", propOrder = {"authorisation", "authorisationReversal", "inquiry", "inquiryReversal", "payments", "paymentReversal", "transfer", "transferReversal", "feeCollection"})
public class TransactionTotals6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Authstn")
	protected Number authorisation;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all authorisation transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Sum number of all authorisation transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "AuthstnRvsl")
	protected Number authorisationReversal;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all reversed authorisation transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisationReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationReversal";
			definition = "Sum number of all reversed authorisation transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Nqry")
	protected Number inquiry;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nqry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all inquiry transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInquiry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "Nqry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inquiry";
			definition = "Sum number of all inquiry transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "NqryRvsl")
	protected Number inquiryReversal;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NqryRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InquiryReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all reversed inquiry transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInquiryReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "NqryRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InquiryReversal";
			definition = "Sum number of all reversed inquiry transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Pmts")
	protected Number payments;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum number of all financial presentment payment transactions processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "Pmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payments";
			definition = "Sum number of all financial presentment payment transactions processed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "PmtRvsl")
	protected Number paymentReversal;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum number of all financial presentment payment transactions which have been reversed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "PmtRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReversal";
			definition = "Sum number of all financial presentment payment transactions which have been reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Trf")
	protected Number transfer;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum number of all financial presentment transactions processed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransfer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "Trf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Sum number of all financial presentment transactions processed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TrfRvsl")
	protected Number transferReversal;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all reversal transactions processed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "TrfRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReversal";
			definition = "Sum number of all reversal transactions processed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "FeeColltn")
	protected Number feeCollection;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FeeColltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCollection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum number of all fee collection transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFeeCollection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
			isDerived = false;
			xmlTag = "FeeColltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCollection";
			definition = "Sum number of all fee collection transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals6.mmAuthorisation, com.tools20022.repository.msg.TransactionTotals6.mmAuthorisationReversal,
						com.tools20022.repository.msg.TransactionTotals6.mmInquiry, com.tools20022.repository.msg.TransactionTotals6.mmInquiryReversal, com.tools20022.repository.msg.TransactionTotals6.mmPayments,
						com.tools20022.repository.msg.TransactionTotals6.mmPaymentReversal, com.tools20022.repository.msg.TransactionTotals6.mmTransfer, com.tools20022.repository.msg.TransactionTotals6.mmTransferReversal,
						com.tools20022.repository.msg.TransactionTotals6.mmFeeCollection);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionTotals6";
				definition = "Additional count which may be utilised for reconciliation.";
				previousVersion_lazy = () -> TransactionTotals4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getAuthorisation() {
		return authorisation == null ? Optional.empty() : Optional.of(authorisation);
	}

	public TransactionTotals6 setAuthorisation(Number authorisation) {
		this.authorisation = authorisation;
		return this;
	}

	public Optional<Number> getAuthorisationReversal() {
		return authorisationReversal == null ? Optional.empty() : Optional.of(authorisationReversal);
	}

	public TransactionTotals6 setAuthorisationReversal(Number authorisationReversal) {
		this.authorisationReversal = authorisationReversal;
		return this;
	}

	public Optional<Number> getInquiry() {
		return inquiry == null ? Optional.empty() : Optional.of(inquiry);
	}

	public TransactionTotals6 setInquiry(Number inquiry) {
		this.inquiry = inquiry;
		return this;
	}

	public Optional<Number> getInquiryReversal() {
		return inquiryReversal == null ? Optional.empty() : Optional.of(inquiryReversal);
	}

	public TransactionTotals6 setInquiryReversal(Number inquiryReversal) {
		this.inquiryReversal = inquiryReversal;
		return this;
	}

	public Optional<Number> getPayments() {
		return payments == null ? Optional.empty() : Optional.of(payments);
	}

	public TransactionTotals6 setPayments(Number payments) {
		this.payments = payments;
		return this;
	}

	public Optional<Number> getPaymentReversal() {
		return paymentReversal == null ? Optional.empty() : Optional.of(paymentReversal);
	}

	public TransactionTotals6 setPaymentReversal(Number paymentReversal) {
		this.paymentReversal = paymentReversal;
		return this;
	}

	public Optional<Number> getTransfer() {
		return transfer == null ? Optional.empty() : Optional.of(transfer);
	}

	public TransactionTotals6 setTransfer(Number transfer) {
		this.transfer = transfer;
		return this;
	}

	public Optional<Number> getTransferReversal() {
		return transferReversal == null ? Optional.empty() : Optional.of(transferReversal);
	}

	public TransactionTotals6 setTransferReversal(Number transferReversal) {
		this.transferReversal = transferReversal;
		return this;
	}

	public Optional<Number> getFeeCollection() {
		return feeCollection == null ? Optional.empty() : Optional.of(feeCollection);
	}

	public TransactionTotals6 setFeeCollection(Number feeCollection) {
		this.feeCollection = feeCollection;
		return this;
	}
}