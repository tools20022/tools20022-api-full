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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on a payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3#mmPaymentToReturnCriteria
 * TransactionReturnCriteria3.mmPaymentToReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3#mmPaymentFromReturnCriteria
 * TransactionReturnCriteria3.mmPaymentFromReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3#mmAccountCashEntryReturnCriteria
 * TransactionReturnCriteria3.mmAccountCashEntryReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3#mmPaymentReturnCriteria
 * TransactionReturnCriteria3.mmPaymentReturnCriteria}</li>
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
 * "TransactionReturnCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on a payment transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionReturnCriteria3", propOrder = {"paymentToReturnCriteria", "paymentFromReturnCriteria", "accountCashEntryReturnCriteria", "paymentReturnCriteria"})
public class TransactionReturnCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemReturnCriteria2 paymentToReturnCriteria;
	/**
	 * Destination of the payment (be it a member or a system or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3
	 * TransactionReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtToRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Destination of the payment (be it a member or a system or both)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentToReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtToRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToReturnCriteria";
			definition = "Destination of the payment (be it a member or a system or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemReturnCriteria2.mmObject();
		}
	};
	protected SystemReturnCriteria2 paymentFromReturnCriteria;
	/**
	 * Origin of the payment (be it a member or a system or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3
	 * TransactionReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFromReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Origin of the payment (be it a member or a system or both)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentFromReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtFrRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFromReturnCriteria";
			definition = "Origin of the payment (be it a member or a system or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemReturnCriteria2.mmObject();
		}
	};
	protected AccountCashEntryReturnCriteria2 accountCashEntryReturnCriteria;
	/**
	 * Defines the criteria used to report on the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3
	 * TransactionReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctCshNtryRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountCashEntryReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the criteria used to report on the cash entry."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountCashEntryReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctCshNtryRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCashEntryReturnCriteria";
			definition = "Defines the criteria used to report on the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
		}
	};
	protected PaymentReturnCriteria3 paymentReturnCriteria;
	/**
	 * Defines the criteria used to report on the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria3
	 * TransactionReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the criteria used to report on the payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReturnCriteria";
			definition = "Defines the criteria used to report on the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionReturnCriteria3.mmPaymentToReturnCriteria, TransactionReturnCriteria3.mmPaymentFromReturnCriteria, TransactionReturnCriteria3.mmAccountCashEntryReturnCriteria,
						TransactionReturnCriteria3.mmPaymentReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReturnCriteria3";
				definition = "Defines the criteria used to report on a payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtToRtrCrit")
	public SystemReturnCriteria2 getPaymentToReturnCriteria() {
		return paymentToReturnCriteria;
	}

	public void setPaymentToReturnCriteria(com.tools20022.repository.msg.SystemReturnCriteria2 paymentToReturnCriteria) {
		this.paymentToReturnCriteria = paymentToReturnCriteria;
	}

	@XmlElement(name = "PmtFrRtrCrit")
	public SystemReturnCriteria2 getPaymentFromReturnCriteria() {
		return paymentFromReturnCriteria;
	}

	public void setPaymentFromReturnCriteria(com.tools20022.repository.msg.SystemReturnCriteria2 paymentFromReturnCriteria) {
		this.paymentFromReturnCriteria = paymentFromReturnCriteria;
	}

	@XmlElement(name = "AcctCshNtryRtrCrit")
	public AccountCashEntryReturnCriteria2 getAccountCashEntryReturnCriteria() {
		return accountCashEntryReturnCriteria;
	}

	public void setAccountCashEntryReturnCriteria(com.tools20022.repository.msg.AccountCashEntryReturnCriteria2 accountCashEntryReturnCriteria) {
		this.accountCashEntryReturnCriteria = accountCashEntryReturnCriteria;
	}

	@XmlElement(name = "PmtRtrCrit")
	public PaymentReturnCriteria3 getPaymentReturnCriteria() {
		return paymentReturnCriteria;
	}

	public void setPaymentReturnCriteria(com.tools20022.repository.msg.PaymentReturnCriteria3 paymentReturnCriteria) {
		this.paymentReturnCriteria = paymentReturnCriteria;
	}
}