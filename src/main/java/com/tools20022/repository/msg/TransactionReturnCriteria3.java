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
import com.tools20022.repository.msg.AccountCashEntryReturnCriteria2;
import com.tools20022.repository.msg.PaymentReturnCriteria3;
import com.tools20022.repository.msg.SystemReturnCriteria2;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReturnCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on a payment transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReturnCriteria4
 * TransactionReturnCriteria4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReturnCriteria3", propOrder = {"paymentToReturnCriteria", "paymentFromReturnCriteria", "accountCashEntryReturnCriteria", "paymentReturnCriteria"})
public class TransactionReturnCriteria3 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria4#mmPaymentToReturnCriteria
	 * TransactionReturnCriteria4.mmPaymentToReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<SystemReturnCriteria2>> mmPaymentToReturnCriteria = new MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<SystemReturnCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtToRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToReturnCriteria";
			definition = "Destination of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(TransactionReturnCriteria4.mmPaymentToReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemReturnCriteria2.mmObject();
		}

		@Override
		public Optional<SystemReturnCriteria2> getValue(TransactionReturnCriteria3 obj) {
			return obj.getPaymentToReturnCriteria();
		}

		@Override
		public void setValue(TransactionReturnCriteria3 obj, Optional<SystemReturnCriteria2> value) {
			obj.setPaymentToReturnCriteria(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria4#mmPaymentFromReturnCriteria
	 * TransactionReturnCriteria4.mmPaymentFromReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<SystemReturnCriteria2>> mmPaymentFromReturnCriteria = new MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<SystemReturnCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtFrRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFromReturnCriteria";
			definition = "Origin of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(TransactionReturnCriteria4.mmPaymentFromReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemReturnCriteria2.mmObject();
		}

		@Override
		public Optional<SystemReturnCriteria2> getValue(TransactionReturnCriteria3 obj) {
			return obj.getPaymentFromReturnCriteria();
		}

		@Override
		public void setValue(TransactionReturnCriteria3 obj, Optional<SystemReturnCriteria2> value) {
			obj.setPaymentFromReturnCriteria(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria4#mmAccountCashEntryReturnCriteria
	 * TransactionReturnCriteria4.mmAccountCashEntryReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<AccountCashEntryReturnCriteria2>> mmAccountCashEntryReturnCriteria = new MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<AccountCashEntryReturnCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctCshNtryRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCashEntryReturnCriteria";
			definition = "Defines the criteria used to report on the cash entry.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReturnCriteria4.mmAccountCashEntryReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
		}

		@Override
		public Optional<AccountCashEntryReturnCriteria2> getValue(TransactionReturnCriteria3 obj) {
			return obj.getAccountCashEntryReturnCriteria();
		}

		@Override
		public void setValue(TransactionReturnCriteria3 obj, Optional<AccountCashEntryReturnCriteria2> value) {
			obj.setAccountCashEntryReturnCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtRtrCrit")
	protected PaymentReturnCriteria3 paymentReturnCriteria;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReturnCriteria4#mmPaymentReturnCriteria
	 * TransactionReturnCriteria4.mmPaymentReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<PaymentReturnCriteria3>> mmPaymentReturnCriteria = new MMMessageAssociationEnd<TransactionReturnCriteria3, Optional<PaymentReturnCriteria3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReturnCriteria";
			definition = "Defines the criteria used to report on the payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReturnCriteria4.mmPaymentReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentReturnCriteria3.mmObject();
		}

		@Override
		public Optional<PaymentReturnCriteria3> getValue(TransactionReturnCriteria3 obj) {
			return obj.getPaymentReturnCriteria();
		}

		@Override
		public void setValue(TransactionReturnCriteria3 obj, Optional<PaymentReturnCriteria3> value) {
			obj.setPaymentReturnCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReturnCriteria3.mmPaymentToReturnCriteria, com.tools20022.repository.msg.TransactionReturnCriteria3.mmPaymentFromReturnCriteria,
						com.tools20022.repository.msg.TransactionReturnCriteria3.mmAccountCashEntryReturnCriteria, com.tools20022.repository.msg.TransactionReturnCriteria3.mmPaymentReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReturnCriteria3";
				definition = "Defines the criteria used to report on a payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionReturnCriteria4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemReturnCriteria2> getPaymentToReturnCriteria() {
		return paymentToReturnCriteria == null ? Optional.empty() : Optional.of(paymentToReturnCriteria);
	}

	public TransactionReturnCriteria3 setPaymentToReturnCriteria(SystemReturnCriteria2 paymentToReturnCriteria) {
		this.paymentToReturnCriteria = paymentToReturnCriteria;
		return this;
	}

	public Optional<SystemReturnCriteria2> getPaymentFromReturnCriteria() {
		return paymentFromReturnCriteria == null ? Optional.empty() : Optional.of(paymentFromReturnCriteria);
	}

	public TransactionReturnCriteria3 setPaymentFromReturnCriteria(SystemReturnCriteria2 paymentFromReturnCriteria) {
		this.paymentFromReturnCriteria = paymentFromReturnCriteria;
		return this;
	}

	public Optional<AccountCashEntryReturnCriteria2> getAccountCashEntryReturnCriteria() {
		return accountCashEntryReturnCriteria == null ? Optional.empty() : Optional.of(accountCashEntryReturnCriteria);
	}

	public TransactionReturnCriteria3 setAccountCashEntryReturnCriteria(AccountCashEntryReturnCriteria2 accountCashEntryReturnCriteria) {
		this.accountCashEntryReturnCriteria = accountCashEntryReturnCriteria;
		return this;
	}

	public Optional<PaymentReturnCriteria3> getPaymentReturnCriteria() {
		return paymentReturnCriteria == null ? Optional.empty() : Optional.of(paymentReturnCriteria);
	}

	public TransactionReturnCriteria3 setPaymentReturnCriteria(PaymentReturnCriteria3 paymentReturnCriteria) {
		this.paymentReturnCriteria = paymentReturnCriteria;
		return this;
	}
}