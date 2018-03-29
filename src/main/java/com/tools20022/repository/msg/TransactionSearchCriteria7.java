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
import com.tools20022.repository.msg.CashAccountEntrySearch5;
import com.tools20022.repository.msg.PaymentSearch7;
import com.tools20022.repository.msg.SystemSearch3;
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
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentTo
 * TransactionSearchCriteria7.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentFrom
 * TransactionSearchCriteria7.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentSearch
 * TransactionSearchCriteria7.mmPaymentSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmAccountEntrySearch
 * TransactionSearchCriteria7.mmAccountEntrySearch}</li>
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
 * "TransactionSearchCriteria7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
 * TransactionSearchCriteria6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionSearchCriteria7", propOrder = {"paymentTo", "paymentFrom", "paymentSearch", "accountEntrySearch"})
public class TransactionSearchCriteria7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTo")
	protected List<SystemSearch3> paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch3
	 * SystemSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7
	 * TransactionSearchCriteria7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for the destination of the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentTo
	 * TransactionSearchCriteria6.mmPaymentTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria7, List<SystemSearch3>> mmPaymentTo = new MMMessageAssociationEnd<TransactionSearchCriteria7, List<SystemSearch3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria7.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Defines the criteria which are used to search for the destination of the payment.";
			previousVersion_lazy = () -> TransactionSearchCriteria6.mmPaymentTo;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch3.mmObject();
		}

		@Override
		public List<SystemSearch3> getValue(TransactionSearchCriteria7 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(TransactionSearchCriteria7 obj, List<SystemSearch3> value) {
			obj.setPaymentTo(value);
		}
	};
	@XmlElement(name = "PmtFr")
	protected List<SystemSearch3> paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch3
	 * SystemSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7
	 * TransactionSearchCriteria7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for the origin of the payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentFrom
	 * TransactionSearchCriteria6.mmPaymentFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria7, List<SystemSearch3>> mmPaymentFrom = new MMMessageAssociationEnd<TransactionSearchCriteria7, List<SystemSearch3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria7.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Defines the criteria which are used to search for the origin of the payment.";
			previousVersion_lazy = () -> TransactionSearchCriteria6.mmPaymentFrom;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch3.mmObject();
		}

		@Override
		public List<SystemSearch3> getValue(TransactionSearchCriteria7 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(TransactionSearchCriteria7 obj, List<SystemSearch3> value) {
			obj.setPaymentFrom(value);
		}
	};
	@XmlElement(name = "PmtSch")
	protected PaymentSearch7 paymentSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentSearch7
	 * PaymentSearch7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7
	 * TransactionSearchCriteria7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentSearch
	 * TransactionSearchCriteria6.mmPaymentSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria7, Optional<PaymentSearch7>> mmPaymentSearch = new MMMessageAssociationEnd<TransactionSearchCriteria7, Optional<PaymentSearch7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria7.mmObject();
			isDerived = false;
			xmlTag = "PmtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSearch";
			definition = "Defines the criteria which are used to search for a payment.";
			previousVersion_lazy = () -> TransactionSearchCriteria6.mmPaymentSearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSearch7.mmObject();
		}

		@Override
		public Optional<PaymentSearch7> getValue(TransactionSearchCriteria7 obj) {
			return obj.getPaymentSearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria7 obj, Optional<PaymentSearch7> value) {
			obj.setPaymentSearch(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNtrySch")
	protected CashAccountEntrySearch5 accountEntrySearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7
	 * TransactionSearchCriteria7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNtrySch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountEntrySearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria which are used to search for a cash entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmAccountEntrySearch
	 * TransactionSearchCriteria6.mmAccountEntrySearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria7, Optional<CashAccountEntrySearch5>> mmAccountEntrySearch = new MMMessageAssociationEnd<TransactionSearchCriteria7, Optional<CashAccountEntrySearch5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria7.mmObject();
			isDerived = false;
			xmlTag = "AcctNtrySch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntrySearch";
			definition = "Defines the criteria which are used to search for a cash entry.";
			previousVersion_lazy = () -> TransactionSearchCriteria6.mmAccountEntrySearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountEntrySearch5.mmObject();
		}

		@Override
		public Optional<CashAccountEntrySearch5> getValue(TransactionSearchCriteria7 obj) {
			return obj.getAccountEntrySearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria7 obj, Optional<CashAccountEntrySearch5> value) {
			obj.setAccountEntrySearch(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria7.mmPaymentTo, com.tools20022.repository.msg.TransactionSearchCriteria7.mmPaymentFrom,
						com.tools20022.repository.msg.TransactionSearchCriteria7.mmPaymentSearch, com.tools20022.repository.msg.TransactionSearchCriteria7.mmAccountEntrySearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionSearchCriteria7";
				definition = "Defines the criteria which are used to search for a payment transaction.";
				previousVersion_lazy = () -> TransactionSearchCriteria6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemSearch3> getPaymentTo() {
		return paymentTo == null ? paymentTo = new ArrayList<>() : paymentTo;
	}

	public TransactionSearchCriteria7 setPaymentTo(List<SystemSearch3> paymentTo) {
		this.paymentTo = Objects.requireNonNull(paymentTo);
		return this;
	}

	public List<SystemSearch3> getPaymentFrom() {
		return paymentFrom == null ? paymentFrom = new ArrayList<>() : paymentFrom;
	}

	public TransactionSearchCriteria7 setPaymentFrom(List<SystemSearch3> paymentFrom) {
		this.paymentFrom = Objects.requireNonNull(paymentFrom);
		return this;
	}

	public Optional<PaymentSearch7> getPaymentSearch() {
		return paymentSearch == null ? Optional.empty() : Optional.of(paymentSearch);
	}

	public TransactionSearchCriteria7 setPaymentSearch(PaymentSearch7 paymentSearch) {
		this.paymentSearch = paymentSearch;
		return this;
	}

	public Optional<CashAccountEntrySearch5> getAccountEntrySearch() {
		return accountEntrySearch == null ? Optional.empty() : Optional.of(accountEntrySearch);
	}

	public TransactionSearchCriteria7 setAccountEntrySearch(CashAccountEntrySearch5 accountEntrySearch) {
		this.accountEntrySearch = accountEntrySearch;
		return this;
	}
}