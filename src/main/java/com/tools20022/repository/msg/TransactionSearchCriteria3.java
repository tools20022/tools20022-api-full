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
import com.tools20022.repository.msg.AccountCashEntrySearch2;
import com.tools20022.repository.msg.PaymentSearch3;
import com.tools20022.repository.msg.SystemSearch2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria which are used to search for a payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3#mmPaymentTo
 * TransactionSearchCriteria3.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3#mmPaymentFrom
 * TransactionSearchCriteria3.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3#mmPaymentSearch
 * TransactionSearchCriteria3.mmPaymentSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3#mmAccountEntrySearch
 * TransactionSearchCriteria3.mmAccountEntrySearch}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionSearchCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a payment transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionSearchCriteria3", propOrder = {"paymentTo", "paymentFrom", "paymentSearch", "accountEntrySearch"})
public class TransactionSearchCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTo")
	protected List<SystemSearch2> paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch2
	 * SystemSearch2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3
	 * TransactionSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for the destination of the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria3, List<SystemSearch2>> mmPaymentTo = new MMMessageAssociationEnd<TransactionSearchCriteria3, List<SystemSearch2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Defines the criteria which are used to search for the destination of the payment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch2.mmObject();
		}

		@Override
		public List<SystemSearch2> getValue(TransactionSearchCriteria3 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(TransactionSearchCriteria3 obj, List<SystemSearch2> value) {
			obj.setPaymentTo(value);
		}
	};
	@XmlElement(name = "PmtFr")
	protected List<SystemSearch2> paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch2
	 * SystemSearch2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3
	 * TransactionSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for the origin of the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria3, List<SystemSearch2>> mmPaymentFrom = new MMMessageAssociationEnd<TransactionSearchCriteria3, List<SystemSearch2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Defines the criteria which are used to search for the origin of the payment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch2.mmObject();
		}

		@Override
		public List<SystemSearch2> getValue(TransactionSearchCriteria3 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(TransactionSearchCriteria3 obj, List<SystemSearch2> value) {
			obj.setPaymentFrom(value);
		}
	};
	@XmlElement(name = "PmtSch")
	protected PaymentSearch3 paymentSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentSearch3
	 * PaymentSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3
	 * TransactionSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria3, Optional<PaymentSearch3>> mmPaymentSearch = new MMMessageAssociationEnd<TransactionSearchCriteria3, Optional<PaymentSearch3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSearch";
			definition = "Defines the criteria which are used to search for a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSearch3.mmObject();
		}

		@Override
		public Optional<PaymentSearch3> getValue(TransactionSearchCriteria3 obj) {
			return obj.getPaymentSearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria3 obj, Optional<PaymentSearch3> value) {
			obj.setPaymentSearch(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNtrySch")
	protected AccountCashEntrySearch2 accountEntrySearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria3
	 * TransactionSearchCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNtrySch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountEntrySearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for a cash entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria3, Optional<AccountCashEntrySearch2>> mmAccountEntrySearch = new MMMessageAssociationEnd<TransactionSearchCriteria3, Optional<AccountCashEntrySearch2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctNtrySch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntrySearch";
			definition = "Defines the criteria which are used to search for a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountCashEntrySearch2.mmObject();
		}

		@Override
		public Optional<AccountCashEntrySearch2> getValue(TransactionSearchCriteria3 obj) {
			return obj.getAccountEntrySearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria3 obj, Optional<AccountCashEntrySearch2> value) {
			obj.setAccountEntrySearch(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria3.mmPaymentTo, com.tools20022.repository.msg.TransactionSearchCriteria3.mmPaymentFrom,
						com.tools20022.repository.msg.TransactionSearchCriteria3.mmPaymentSearch, com.tools20022.repository.msg.TransactionSearchCriteria3.mmAccountEntrySearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionSearchCriteria3";
				definition = "Defines the criteria which are used to search for a payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemSearch2> getPaymentTo() {
		return paymentTo == null ? paymentTo = new ArrayList<>() : paymentTo;
	}

	public TransactionSearchCriteria3 setPaymentTo(List<SystemSearch2> paymentTo) {
		this.paymentTo = Objects.requireNonNull(paymentTo);
		return this;
	}

	public List<SystemSearch2> getPaymentFrom() {
		return paymentFrom == null ? paymentFrom = new ArrayList<>() : paymentFrom;
	}

	public TransactionSearchCriteria3 setPaymentFrom(List<SystemSearch2> paymentFrom) {
		this.paymentFrom = Objects.requireNonNull(paymentFrom);
		return this;
	}

	public Optional<PaymentSearch3> getPaymentSearch() {
		return paymentSearch == null ? Optional.empty() : Optional.of(paymentSearch);
	}

	public TransactionSearchCriteria3 setPaymentSearch(PaymentSearch3 paymentSearch) {
		this.paymentSearch = paymentSearch;
		return this;
	}

	public Optional<AccountCashEntrySearch2> getAccountEntrySearch() {
		return accountEntrySearch == null ? Optional.empty() : Optional.of(accountEntrySearch);
	}

	public TransactionSearchCriteria3 setAccountEntrySearch(AccountCashEntrySearch2 accountEntrySearch) {
		this.accountEntrySearch = accountEntrySearch;
		return this;
	}
}