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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionTotals6", propOrder = {"authorisation", "authorisationReversal", "inquiry", "inquiryReversal", "payments", "paymentReversal", "transfer", "transferReversal", "feeCollection"})
public class TransactionTotals6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number authorisation;
	/**
	 * Sum number of all authorisation transactions.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number authorisationReversal;
	/**
	 * Sum number of all reversed authorisation transactions.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number inquiry;
	/**
	 * Sum number of all inquiry transactions.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number inquiryReversal;
	/**
	 * Sum number of all reversed inquiry transactions.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number payments;
	/**
	 * Sum number of all financial presentment payment transactions processed.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number paymentReversal;
	/**
	 * Sum number of all financial presentment payment transactions which have
	 * been reversed.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number transfer;
	/**
	 * Sum number of all financial presentment transactions processed.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number transferReversal;
	/**
	 * Sum number of all reversal transactions processed.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
	protected Number feeCollection;
	/**
	 * Sum number of all fee collection transactions.
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
			componentContext_lazy = () -> TransactionTotals6.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(TransactionTotals6.mmAuthorisation, TransactionTotals6.mmAuthorisationReversal, TransactionTotals6.mmInquiry, TransactionTotals6.mmInquiryReversal, TransactionTotals6.mmPayments,
						TransactionTotals6.mmPaymentReversal, TransactionTotals6.mmTransfer, TransactionTotals6.mmTransferReversal, TransactionTotals6.mmFeeCollection);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionTotals6";
				definition = "Additional count which may be utilised for reconciliation.";
				previousVersion_lazy = () -> TransactionTotals4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Authstn")
	public Number getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(Number authorisation) {
		this.authorisation = authorisation;
	}

	@XmlElement(name = "AuthstnRvsl")
	public Number getAuthorisationReversal() {
		return authorisationReversal;
	}

	public void setAuthorisationReversal(Number authorisationReversal) {
		this.authorisationReversal = authorisationReversal;
	}

	@XmlElement(name = "Nqry")
	public Number getInquiry() {
		return inquiry;
	}

	public void setInquiry(Number inquiry) {
		this.inquiry = inquiry;
	}

	@XmlElement(name = "NqryRvsl")
	public Number getInquiryReversal() {
		return inquiryReversal;
	}

	public void setInquiryReversal(Number inquiryReversal) {
		this.inquiryReversal = inquiryReversal;
	}

	@XmlElement(name = "Pmts")
	public Number getPayments() {
		return payments;
	}

	public void setPayments(Number payments) {
		this.payments = payments;
	}

	@XmlElement(name = "PmtRvsl")
	public Number getPaymentReversal() {
		return paymentReversal;
	}

	public void setPaymentReversal(Number paymentReversal) {
		this.paymentReversal = paymentReversal;
	}

	@XmlElement(name = "Trf")
	public Number getTransfer() {
		return transfer;
	}

	public void setTransfer(Number transfer) {
		this.transfer = transfer;
	}

	@XmlElement(name = "TrfRvsl")
	public Number getTransferReversal() {
		return transferReversal;
	}

	public void setTransferReversal(Number transferReversal) {
		this.transferReversal = transferReversal;
	}

	@XmlElement(name = "FeeColltn")
	public Number getFeeCollection() {
		return feeCollection;
	}

	public void setFeeCollection(Number feeCollection) {
		this.feeCollection = feeCollection;
	}
}