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
import com.tools20022.repository.msg.CashAccountEntrySearch4;
import com.tools20022.repository.msg.PaymentSearch6;
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
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentTo
 * TransactionSearchCriteria6.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentFrom
 * TransactionSearchCriteria6.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentSearch
 * TransactionSearchCriteria6.mmPaymentSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmAccountEntrySearch
 * TransactionSearchCriteria6.mmAccountEntrySearch}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionSearchCriteria6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a payment transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7
 * TransactionSearchCriteria7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
 * TransactionSearchCriteria5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionSearchCriteria6", propOrder = {"paymentTo", "paymentFrom", "paymentSearch", "accountEntrySearch"})
public class TransactionSearchCriteria6 {

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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
	 * TransactionSearchCriteria6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentTo
	 * TransactionSearchCriteria7.mmPaymentTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentTo
	 * TransactionSearchCriteria5.mmPaymentTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria6, List<SystemSearch3>> mmPaymentTo = new MMMessageAssociationEnd<TransactionSearchCriteria6, List<SystemSearch3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Defines the criteria which are used to search for the destination of the payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria7.mmPaymentTo);
			previousVersion_lazy = () -> TransactionSearchCriteria5.mmPaymentTo;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch3.mmObject();
		}

		@Override
		public List<SystemSearch3> getValue(TransactionSearchCriteria6 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(TransactionSearchCriteria6 obj, List<SystemSearch3> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
	 * TransactionSearchCriteria6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentFrom
	 * TransactionSearchCriteria7.mmPaymentFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentFrom
	 * TransactionSearchCriteria5.mmPaymentFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria6, List<SystemSearch3>> mmPaymentFrom = new MMMessageAssociationEnd<TransactionSearchCriteria6, List<SystemSearch3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Defines the criteria which are used to search for the origin of the payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria7.mmPaymentFrom);
			previousVersion_lazy = () -> TransactionSearchCriteria5.mmPaymentFrom;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemSearch3.mmObject();
		}

		@Override
		public List<SystemSearch3> getValue(TransactionSearchCriteria6 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(TransactionSearchCriteria6 obj, List<SystemSearch3> value) {
			obj.setPaymentFrom(value);
		}
	};
	@XmlElement(name = "PmtSch")
	protected PaymentSearch6 paymentSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentSearch6
	 * PaymentSearch6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
	 * TransactionSearchCriteria6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmPaymentSearch
	 * TransactionSearchCriteria7.mmPaymentSearch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentSearch
	 * TransactionSearchCriteria5.mmPaymentSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria6, Optional<PaymentSearch6>> mmPaymentSearch = new MMMessageAssociationEnd<TransactionSearchCriteria6, Optional<PaymentSearch6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "PmtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSearch";
			definition = "Defines the criteria which are used to search for a payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria7.mmPaymentSearch);
			previousVersion_lazy = () -> TransactionSearchCriteria5.mmPaymentSearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSearch6.mmObject();
		}

		@Override
		public Optional<PaymentSearch6> getValue(TransactionSearchCriteria6 obj) {
			return obj.getPaymentSearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria6 obj, Optional<PaymentSearch6> value) {
			obj.setPaymentSearch(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNtrySch")
	protected CashAccountEntrySearch4 accountEntrySearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
	 * TransactionSearchCriteria6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria7#mmAccountEntrySearch
	 * TransactionSearchCriteria7.mmAccountEntrySearch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmAccountEntrySearch
	 * TransactionSearchCriteria5.mmAccountEntrySearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionSearchCriteria6, Optional<CashAccountEntrySearch4>> mmAccountEntrySearch = new MMMessageAssociationEnd<TransactionSearchCriteria6, Optional<CashAccountEntrySearch4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "AcctNtrySch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntrySearch";
			definition = "Defines the criteria which are used to search for a cash entry.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria7.mmAccountEntrySearch);
			previousVersion_lazy = () -> TransactionSearchCriteria5.mmAccountEntrySearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountEntrySearch4.mmObject();
		}

		@Override
		public Optional<CashAccountEntrySearch4> getValue(TransactionSearchCriteria6 obj) {
			return obj.getAccountEntrySearch();
		}

		@Override
		public void setValue(TransactionSearchCriteria6 obj, Optional<CashAccountEntrySearch4> value) {
			obj.setAccountEntrySearch(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria6.mmPaymentTo, com.tools20022.repository.msg.TransactionSearchCriteria6.mmPaymentFrom,
						com.tools20022.repository.msg.TransactionSearchCriteria6.mmPaymentSearch, com.tools20022.repository.msg.TransactionSearchCriteria6.mmAccountEntrySearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionSearchCriteria6";
				definition = "Defines the criteria which are used to search for a payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria7.mmObject());
				previousVersion_lazy = () -> TransactionSearchCriteria5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemSearch3> getPaymentTo() {
		return paymentTo == null ? paymentTo = new ArrayList<>() : paymentTo;
	}

	public TransactionSearchCriteria6 setPaymentTo(List<SystemSearch3> paymentTo) {
		this.paymentTo = Objects.requireNonNull(paymentTo);
		return this;
	}

	public List<SystemSearch3> getPaymentFrom() {
		return paymentFrom == null ? paymentFrom = new ArrayList<>() : paymentFrom;
	}

	public TransactionSearchCriteria6 setPaymentFrom(List<SystemSearch3> paymentFrom) {
		this.paymentFrom = Objects.requireNonNull(paymentFrom);
		return this;
	}

	public Optional<PaymentSearch6> getPaymentSearch() {
		return paymentSearch == null ? Optional.empty() : Optional.of(paymentSearch);
	}

	public TransactionSearchCriteria6 setPaymentSearch(PaymentSearch6 paymentSearch) {
		this.paymentSearch = paymentSearch;
		return this;
	}

	public Optional<CashAccountEntrySearch4> getAccountEntrySearch() {
		return accountEntrySearch == null ? Optional.empty() : Optional.of(accountEntrySearch);
	}

	public TransactionSearchCriteria6 setAccountEntrySearch(CashAccountEntrySearch4 accountEntrySearch) {
		this.accountEntrySearch = accountEntrySearch;
		return this;
	}
}