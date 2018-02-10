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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Payment which contains a series of other payments which have been grouped
 * under specific criteria. A bulk payment can only contain individual payments
 * of the same type (credit transfer or direct debit).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BulkPayment" src="doc-files/BulkPayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment#mmGroups
 * BulkPayment.mmGroups}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndividualPayment#mmBulkPayment
 * IndividualPayment.mmBulkPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmBulkCashSettlementDetails
 * RedemptionBulkOrder2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmBulkCashSettlementDetails
 * RedemptionBulkOrder3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmBulkCashSettlementDetails
 * RedemptionBulkExecution2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmBulkCashSettlementDetails
 * RedemptionBulkExecution3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmBulkCashSettlementDetails
 * RedemptionBulkOrder4.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmBulkCashSettlementDetails
 * RedemptionMultipleOrder2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmBulkCashSettlementDetails
 * RedemptionMultipleOrder3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmBulkCashSettlementDetails
 * RedemptionMultipleExecution2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmBulkCashSettlementDetails
 * RedemptionMultipleExecution3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmBulkCashSettlementDetails
 * RedemptionMultipleOrder4.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmBulkCashSettlementDetails
 * SubscriptionBulkOrder2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmBulkCashSettlementDetails
 * SubscriptionBulkOrder3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmBulkCashSettlementDetails
 * SubscriptionBulkExecution2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmBulkCashSettlementDetails
 * SubscriptionBulkExecution3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmBulkCashSettlementDetails
 * SubscriptionBulkOrder4.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmBulkCashSettlementDetails
 * SubscriptionMultipleOrder2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmBulkCashSettlementDetails
 * SubscriptionMultipleOrder3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmBulkCashSettlementDetails
 * SubscriptionMultipleExecution2.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmBulkCashSettlementDetails
 * SubscriptionMultipleExecution3.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmBulkCashSettlementDetails
 * SubscriptionMultipleOrder4.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmBulkCashSettlementDetails
 * SubscriptionBulkOrder5.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmBulkCashSettlementDetails
 * RedemptionBulkExecution5.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBulkCashSettlementDetails
 * RedemptionMultipleExecution5.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmBulkCashSettlementDetails
 * RedemptionMultipleOrder6.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmBulkCashSettlementDetails
 * SubscriptionMultipleOrder6.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmBulkCashSettlementDetails
 * SubscriptionBulkExecution4.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmBulkCashSettlementDetails
 * RedemptionBulkOrder6.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmBulkCashSettlementDetails
 * SubscriptionMultipleExecution5.mmBulkCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AggregationTransaction1
 * AggregationTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregationTransaction2
 * AggregationTransaction2}</li>
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
 * "BulkPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment which contains a series of other payments which have been grouped under specific criteria. A bulk payment can only contain individual payments of the same type (credit transfer or direct debit)."
 * </li>
 * </ul>
 */
public class BulkPayment extends Payment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.IndividualPayment> groups;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IndividualPayment#mmBulkPayment
	 * IndividualPayment.mmBulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.IndividualPayment
	 * IndividualPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Groups"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a bulk payment groups several individual payments of the same type (credit transfer or direct debit)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGroups = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BulkPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Groups";
			definition = "Indicates that a bulk payment groups several individual payments of the same type (credit transfer or direct debit).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IndividualPayment.mmBulkPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IndividualPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BulkPayment";
				definition = "Payment which contains a series of other payments which have been grouped under specific criteria. A bulk payment can only contain individual payments of the same type (credit transfer or direct debit).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndividualPayment.mmBulkPayment);
				derivationElement_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmBulkCashSettlementDetails, RedemptionBulkOrder3.mmBulkCashSettlementDetails, RedemptionBulkExecution2.mmBulkCashSettlementDetails,
						RedemptionBulkExecution3.mmBulkCashSettlementDetails, RedemptionBulkOrder4.mmBulkCashSettlementDetails, RedemptionMultipleOrder2.mmBulkCashSettlementDetails, RedemptionMultipleOrder3.mmBulkCashSettlementDetails,
						RedemptionMultipleExecution2.mmBulkCashSettlementDetails, RedemptionMultipleExecution3.mmBulkCashSettlementDetails, RedemptionMultipleOrder4.mmBulkCashSettlementDetails,
						SubscriptionBulkOrder2.mmBulkCashSettlementDetails, SubscriptionBulkOrder3.mmBulkCashSettlementDetails, SubscriptionBulkExecution2.mmBulkCashSettlementDetails, SubscriptionBulkExecution3.mmBulkCashSettlementDetails,
						SubscriptionBulkOrder4.mmBulkCashSettlementDetails, SubscriptionMultipleOrder2.mmBulkCashSettlementDetails, SubscriptionMultipleOrder3.mmBulkCashSettlementDetails,
						SubscriptionMultipleExecution2.mmBulkCashSettlementDetails, SubscriptionMultipleExecution3.mmBulkCashSettlementDetails, SubscriptionMultipleOrder4.mmBulkCashSettlementDetails,
						SubscriptionBulkOrder5.mmBulkCashSettlementDetails, RedemptionBulkExecution5.mmBulkCashSettlementDetails, RedemptionMultipleExecution5.mmBulkCashSettlementDetails,
						RedemptionMultipleOrder6.mmBulkCashSettlementDetails, SubscriptionMultipleOrder6.mmBulkCashSettlementDetails, SubscriptionBulkExecution4.mmBulkCashSettlementDetails, RedemptionBulkOrder6.mmBulkCashSettlementDetails,
						SubscriptionMultipleExecution5.mmBulkCashSettlementDetails);
				superType_lazy = () -> Payment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BulkPayment.mmGroups);
				derivationComponent_lazy = () -> Arrays.asList(AggregationTransaction1.mmObject(), AggregationTransaction2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BulkPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<IndividualPayment> getGroups() {
		return groups == null ? groups = new ArrayList<>() : groups;
	}

	public BulkPayment setGroups(List<com.tools20022.repository.entity.IndividualPayment> groups) {
		this.groups = Objects.requireNonNull(groups);
		return this;
	}
}