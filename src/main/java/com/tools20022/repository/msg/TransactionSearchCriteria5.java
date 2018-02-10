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
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentTo
 * TransactionSearchCriteria5.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentFrom
 * TransactionSearchCriteria5.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmPaymentSearch
 * TransactionSearchCriteria5.mmPaymentSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5#mmAccountEntrySearch
 * TransactionSearchCriteria5.mmAccountEntrySearch}</li>
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
 * "TransactionSearchCriteria5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for a payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6
 * TransactionSearchCriteria6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4
 * TransactionSearchCriteria4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionSearchCriteria5", propOrder = {"paymentTo", "paymentFrom", "paymentSearch", "accountEntrySearch"})
public class TransactionSearchCriteria5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTo")
	protected List<com.tools20022.repository.msg.SystemSearch3> paymentTo;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
	 * TransactionSearchCriteria5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentTo
	 * TransactionSearchCriteria6.mmPaymentTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentTo
	 * TransactionSearchCriteria4.mmPaymentTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Defines the criteria which are used to search for the destination of the payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria6.mmPaymentTo);
			previousVersion_lazy = () -> TransactionSearchCriteria4.mmPaymentTo;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemSearch3.mmObject();
		}
	};
	@XmlElement(name = "PmtFr")
	protected List<com.tools20022.repository.msg.SystemSearch3> paymentFrom;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
	 * TransactionSearchCriteria5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentFrom
	 * TransactionSearchCriteria6.mmPaymentFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentFrom
	 * TransactionSearchCriteria4.mmPaymentFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Defines the criteria which are used to search for the origin of the payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria6.mmPaymentFrom);
			previousVersion_lazy = () -> TransactionSearchCriteria4.mmPaymentFrom;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemSearch3.mmObject();
		}
	};
	@XmlElement(name = "PmtSch")
	protected PaymentSearch5 paymentSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentSearch5
	 * PaymentSearch5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
	 * TransactionSearchCriteria5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmPaymentSearch
	 * TransactionSearchCriteria6.mmPaymentSearch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmPaymentSearch
	 * TransactionSearchCriteria4.mmPaymentSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentSearch = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "PmtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSearch";
			definition = "Defines the criteria which are used to search for a payment.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria6.mmPaymentSearch);
			previousVersion_lazy = () -> TransactionSearchCriteria4.mmPaymentSearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria5
	 * TransactionSearchCriteria5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria6#mmAccountEntrySearch
	 * TransactionSearchCriteria6.mmAccountEntrySearch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionSearchCriteria4#mmAccountEntrySearch
	 * TransactionSearchCriteria4.mmAccountEntrySearch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountEntrySearch = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionSearchCriteria5.mmObject();
			isDerived = false;
			xmlTag = "AcctNtrySch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntrySearch";
			definition = "Defines the criteria which are used to search for a cash entry.";
			nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria6.mmAccountEntrySearch);
			previousVersion_lazy = () -> TransactionSearchCriteria4.mmAccountEntrySearch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentTo, com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentFrom,
						com.tools20022.repository.msg.TransactionSearchCriteria5.mmPaymentSearch, com.tools20022.repository.msg.TransactionSearchCriteria5.mmAccountEntrySearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionSearchCriteria5";
				definition = "Defines the criteria which are used to search for a payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionSearchCriteria6.mmObject());
				previousVersion_lazy = () -> TransactionSearchCriteria4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemSearch3> getPaymentTo() {
		return paymentTo == null ? paymentTo = new ArrayList<>() : paymentTo;
	}

	public TransactionSearchCriteria5 setPaymentTo(List<com.tools20022.repository.msg.SystemSearch3> paymentTo) {
		this.paymentTo = Objects.requireNonNull(paymentTo);
		return this;
	}

	public List<SystemSearch3> getPaymentFrom() {
		return paymentFrom == null ? paymentFrom = new ArrayList<>() : paymentFrom;
	}

	public TransactionSearchCriteria5 setPaymentFrom(List<com.tools20022.repository.msg.SystemSearch3> paymentFrom) {
		this.paymentFrom = Objects.requireNonNull(paymentFrom);
		return this;
	}

	public Optional<PaymentSearch5> getPaymentSearch() {
		return paymentSearch == null ? Optional.empty() : Optional.of(paymentSearch);
	}

	public TransactionSearchCriteria5 setPaymentSearch(com.tools20022.repository.msg.PaymentSearch5 paymentSearch) {
		this.paymentSearch = paymentSearch;
		return this;
	}

	public Optional<CashAccountEntrySearch4> getAccountEntrySearch() {
		return accountEntrySearch == null ? Optional.empty() : Optional.of(accountEntrySearch);
	}

	public TransactionSearchCriteria5 setAccountEntrySearch(com.tools20022.repository.msg.CashAccountEntrySearch4 accountEntrySearch) {
		this.accountEntrySearch = accountEntrySearch;
		return this;
	}
}