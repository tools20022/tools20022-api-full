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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2#mmPaymentToReturnCriteria
 * TransactionReturnCriteria2.mmPaymentToReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2#mmPaymentFromReturnCriteria
 * TransactionReturnCriteria2.mmPaymentFromReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2#mmAccountCashEntryReturnCriteria
 * TransactionReturnCriteria2.mmAccountCashEntryReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2#mmPaymentReturnCriteria
 * TransactionReturnCriteria2.mmPaymentReturnCriteria}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on a payment transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReturnCriteria2", propOrder = {"paymentToReturnCriteria", "paymentFromReturnCriteria", "accountCashEntryReturnCriteria", "paymentReturnCriteria"})
public class TransactionReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtToRtrCrit")
	protected SystemReturnCriteria2 paymentToReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2
	 * TransactionReturnCriteria2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria2.mmObject();
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
	@XmlElement(name = "PmtFrRtrCrit")
	protected SystemReturnCriteria2 paymentFromReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemReturnCriteria2
	 * SystemReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2
	 * TransactionReturnCriteria2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria2.mmObject();
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
	@XmlElement(name = "AcctCshNtryRtrCrit")
	protected AccountCashEntryReturnCriteria2 accountCashEntryReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2
	 * TransactionReturnCriteria2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria2.mmObject();
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
	@XmlElement(name = "PmtRtrCrit")
	protected PaymentReturnCriteria2 paymentReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria2
	 * TransactionReturnCriteria2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReturnCriteria";
			definition = "Defines the criteria used to report on the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReturnCriteria2.mmPaymentToReturnCriteria, com.tools20022.repository.msg.TransactionReturnCriteria2.mmPaymentFromReturnCriteria,
						com.tools20022.repository.msg.TransactionReturnCriteria2.mmAccountCashEntryReturnCriteria, com.tools20022.repository.msg.TransactionReturnCriteria2.mmPaymentReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionReturnCriteria2";
				definition = "Defines the criteria used to report on a payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemReturnCriteria2> getPaymentToReturnCriteria() {
		return paymentToReturnCriteria == null ? Optional.empty() : Optional.of(paymentToReturnCriteria);
	}

	public TransactionReturnCriteria2 setPaymentToReturnCriteria(com.tools20022.repository.msg.SystemReturnCriteria2 paymentToReturnCriteria) {
		this.paymentToReturnCriteria = paymentToReturnCriteria;
		return this;
	}

	public Optional<SystemReturnCriteria2> getPaymentFromReturnCriteria() {
		return paymentFromReturnCriteria == null ? Optional.empty() : Optional.of(paymentFromReturnCriteria);
	}

	public TransactionReturnCriteria2 setPaymentFromReturnCriteria(com.tools20022.repository.msg.SystemReturnCriteria2 paymentFromReturnCriteria) {
		this.paymentFromReturnCriteria = paymentFromReturnCriteria;
		return this;
	}

	public Optional<AccountCashEntryReturnCriteria2> getAccountCashEntryReturnCriteria() {
		return accountCashEntryReturnCriteria == null ? Optional.empty() : Optional.of(accountCashEntryReturnCriteria);
	}

	public TransactionReturnCriteria2 setAccountCashEntryReturnCriteria(com.tools20022.repository.msg.AccountCashEntryReturnCriteria2 accountCashEntryReturnCriteria) {
		this.accountCashEntryReturnCriteria = accountCashEntryReturnCriteria;
		return this;
	}

	public Optional<PaymentReturnCriteria2> getPaymentReturnCriteria() {
		return paymentReturnCriteria == null ? Optional.empty() : Optional.of(paymentReturnCriteria);
	}

	public TransactionReturnCriteria2 setPaymentReturnCriteria(com.tools20022.repository.msg.PaymentReturnCriteria2 paymentReturnCriteria) {
		this.paymentReturnCriteria = paymentReturnCriteria;
		return this;
	}
}