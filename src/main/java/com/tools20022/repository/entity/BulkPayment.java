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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.msg.AggregationTransaction1;
import com.tools20022.repository.msg.AggregationTransaction2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment#Groups
 * BulkPayment.Groups}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IndividualPayment#BulkPayment
 * IndividualPayment.BulkPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#BulkCashSettlementDetails
 * RedemptionBulkOrder2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#BulkCashSettlementDetails
 * RedemptionBulkOrder3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#BulkCashSettlementDetails
 * RedemptionBulkExecution2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#BulkCashSettlementDetails
 * RedemptionBulkExecution3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#BulkCashSettlementDetails
 * RedemptionBulkOrder4.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#BulkCashSettlementDetails
 * RedemptionMultipleOrder2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#BulkCashSettlementDetails
 * RedemptionMultipleOrder3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#BulkCashSettlementDetails
 * RedemptionMultipleExecution2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#BulkCashSettlementDetails
 * RedemptionMultipleExecution3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#BulkCashSettlementDetails
 * RedemptionMultipleOrder4.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#BulkCashSettlementDetails
 * SubscriptionBulkOrder2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#BulkCashSettlementDetails
 * SubscriptionBulkOrder3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#BulkCashSettlementDetails
 * SubscriptionBulkExecution2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#BulkCashSettlementDetails
 * SubscriptionBulkExecution3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#BulkCashSettlementDetails
 * SubscriptionBulkOrder4.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#BulkCashSettlementDetails
 * SubscriptionMultipleOrder2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#BulkCashSettlementDetails
 * SubscriptionMultipleOrder3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#BulkCashSettlementDetails
 * SubscriptionMultipleExecution2.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#BulkCashSettlementDetails
 * SubscriptionMultipleExecution3.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#BulkCashSettlementDetails
 * SubscriptionMultipleOrder4.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#BulkCashSettlementDetails
 * SubscriptionBulkOrder5.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#BulkCashSettlementDetails
 * RedemptionBulkExecution5.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#BulkCashSettlementDetails
 * RedemptionMultipleExecution5.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#BulkCashSettlementDetails
 * RedemptionMultipleOrder6.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#BulkCashSettlementDetails
 * SubscriptionMultipleOrder6.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#BulkCashSettlementDetails
 * SubscriptionBulkExecution4.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#BulkCashSettlementDetails
 * RedemptionBulkOrder6.BulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#BulkCashSettlementDetails
 * SubscriptionMultipleExecution5.BulkCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
	/**
	 * Indicates that a bulk payment groups several individual payments of the
	 * same type (credit transfer or direct debit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IndividualPayment#BulkPayment
	 * IndividualPayment.BulkPayment}</li>
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
	public static final MMBusinessAssociationEnd Groups = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BulkPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Groups";
			definition = "Indicates that a bulk payment groups several individual payments of the same type (credit transfer or direct debit).";
			minOccurs = 0;
			type_lazy = () -> IndividualPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IndividualPayment.BulkPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BulkPayment";
				definition = "Payment which contains a series of other payments which have been grouped under specific criteria. A bulk payment can only contain individual payments of the same type (credit transfer or direct debit).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndividualPayment.BulkPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionBulkOrder3.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionBulkExecution2.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionBulkExecution3.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionBulkOrder4.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionMultipleOrder2.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder3.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionMultipleExecution2.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionMultipleOrder4.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrder2.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionBulkOrder3.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionBulkExecution2.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionBulkExecution3.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrder4.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder2.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder3.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution2.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionMultipleExecution3.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder4.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrder5.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionBulkExecution5.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.BulkCashSettlementDetails, com.tools20022.repository.msg.RedemptionMultipleOrder6.BulkCashSettlementDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder6.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionBulkExecution4.BulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionBulkOrder6.BulkCashSettlementDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution5.BulkCashSettlementDetails);
				superType_lazy = () -> Payment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BulkPayment.Groups);
				derivationComponent_lazy = () -> Arrays.asList(AggregationTransaction1.mmObject(), AggregationTransaction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}