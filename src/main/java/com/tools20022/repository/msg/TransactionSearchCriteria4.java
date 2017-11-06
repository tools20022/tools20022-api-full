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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentTo
 * TransactionSearchCriteria4.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentFrom
 * TransactionSearchCriteria4.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentSearch
 * TransactionSearchCriteria4.mmPaymentSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmAccountEntrySearch
 * TransactionSearchCriteria4.mmAccountEntrySearch}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionSearchCriteria4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
 * TransactionSearchCriteria5}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TransactionSearchCriteria4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.SystemSearch3> paymentTo;
	/**
	 * Defines the criteria which are used to search for the destination of the
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch3
	 * SystemSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4
	 * TransactionSearchCriteria4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentTo
	 * TransactionSearchCriteria5.mmPaymentTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionSearchCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Defines the criteria which are used to search for the destination of the payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentTo);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemSearch3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemSearch3> paymentFrom;
	/**
	 * Defines the criteria which are used to search for the origin of the
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemSearch3
	 * SystemSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4
	 * TransactionSearchCriteria4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentFrom
	 * TransactionSearchCriteria5.mmPaymentFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionSearchCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Defines the criteria which are used to search for the origin of the payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentFrom);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemSearch3.mmObject();
		}
	};
	protected PaymentSearch4 paymentSearch;
	/**
	 * Defines the criteria which are used to search for a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentSearch4
	 * PaymentSearch4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4
	 * TransactionSearchCriteria4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentSearch
	 * TransactionSearchCriteria5.mmPaymentSearch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentSearch = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionSearchCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtSch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSearch";
			definition = "Defines the criteria which are used to search for a payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentSearch);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentSearch4.mmObject();
		}
	};
	protected CashAccountEntrySearch3 accountEntrySearch;
	/**
	 * Defines the criteria which are used to search for a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3
	 * CashAccountEntrySearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4
	 * TransactionSearchCriteria4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmAccountEntrySearch
	 * TransactionSearchCriteria5.mmAccountEntrySearch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountEntrySearch = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionSearchCriteria4.mmObject();
			isDerived = false;
			xmlTag = "AcctNtrySch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntrySearch";
			definition = "Defines the criteria which are used to search for a cash entry.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria5.mmAccountEntrySearch);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria4.mmPaymentTo, com.tools20022.repository.msg.TransactionSearchCriteria4.mmPaymentFrom,
						com.tools20022.repository.msg.TransactionSearchCriteria4.mmPaymentSearch, com.tools20022.repository.msg.TransactionSearchCriteria4.mmAccountEntrySearch);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionSearchCriteria4";
				definition = "Defines the criteria which are used to search for a payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemSearch3> getPaymentTo() {
		return paymentTo;
	}

	public void setPaymentTo(List<com.tools20022.repository.msg.SystemSearch3> paymentTo) {
		this.paymentTo = paymentTo;
	}

	public List<SystemSearch3> getPaymentFrom() {
		return paymentFrom;
	}

	public void setPaymentFrom(List<com.tools20022.repository.msg.SystemSearch3> paymentFrom) {
		this.paymentFrom = paymentFrom;
	}

	public PaymentSearch4 getPaymentSearch() {
		return paymentSearch;
	}

	public void setPaymentSearch(com.tools20022.repository.msg.PaymentSearch4 paymentSearch) {
		this.paymentSearch = paymentSearch;
	}

	public CashAccountEntrySearch3 getAccountEntrySearch() {
		return accountEntrySearch;
	}

	public void setAccountEntrySearch(com.tools20022.repository.msg.CashAccountEntrySearch3 accountEntrySearch) {
		this.accountEntrySearch = accountEntrySearch;
	}
}