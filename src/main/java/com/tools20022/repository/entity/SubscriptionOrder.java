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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Order to invest the investor's principal in an investment fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SubscriptionOrder" src="doc-files/SubscriptionOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#IndividualOrderDetails
 * SubscriptionBulkOrder2.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1#BulkOrderDetails
 * SubscriptionBulkOrderInstruction1.BulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#StaffClientBreakdown
 * SubscriptionOrder5.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#IndividualOrderDetails
 * SubscriptionBulkOrder3.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2#BulkOrderDetails
 * SubscriptionBulkOrderInstruction2.BulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#StaffClientBreakdown
 * SubscriptionExecution5.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#StaffClientBreakdown
 * SubscriptionOrder7.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#IndividualOrderDetails
 * SubscriptionBulkOrder4.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#IndividualOrderDetails
 * SubscriptionMultipleOrder2.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1#MultipleOrderDetails
 * SubscriptionMultipleOrderInstruction1.MultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#StaffClientBreakdown
 * SubscriptionOrder6.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#IndividualOrderDetails
 * SubscriptionMultipleOrder3.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2#MultipleOrderDetails
 * SubscriptionMultipleOrderInstruction2.MultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#StaffClientBreakdown
 * SubscriptionExecution6.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#StaffClientBreakdown
 * SubscriptionOrder8.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#IndividualOrderDetails
 * SubscriptionMultipleOrder4.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#SubscriptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.SubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#IndividualOrderDetails
 * SubscriptionMultipleOrder5.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#IndividualOrderDetails
 * SubscriptionBulkOrder5.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#IndividualOrderDetails
 * SubscriptionMultipleOrder6.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#StaffClientBreakdown
 * SubscriptionExecution13.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#StaffClientBreakdown
 * SubscriptionExecution12.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#StaffClientBreakdown
 * SubscriptionOrder15.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#StaffClientBreakdown
 * SubscriptionOrder14.StaffClientBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
 * SwitchSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder3
 * SubscriptionOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2
 * SubscriptionBulkOrder2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1
 * SubscriptionBulkOrderInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder5
 * SubscriptionOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3
 * SubscriptionBulkOrder3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2
 * SubscriptionBulkOrderInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder7
 * SubscriptionOrder7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4
 * SubscriptionBulkOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder4
 * SubscriptionOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2
 * SubscriptionMultipleOrder2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1
 * SubscriptionMultipleOrderInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder6
 * SubscriptionOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3
 * SubscriptionMultipleOrder3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2
 * SubscriptionMultipleOrderInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder8
 * SubscriptionOrder8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
 * SubscriptionMultipleOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder9
 * SubscriptionOrder9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder10
 * SubscriptionOrder10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder11
 * SubscriptionOrder11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5
 * SubscriptionMultipleOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
 * SubscriptionBulkOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
 * SubscriptionMultipleOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder15
 * SubscriptionOrder15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder14
 * SubscriptionOrder14}</li>
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
 * "SubscriptionOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * </ul>
 */
public class SubscriptionOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrder";
				definition = "Order to invest the investor's principal in an investment fund.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionBulkOrder2.IndividualOrderDetails, com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1.BulkOrderDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionBulkOrder3.IndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2.BulkOrderDetails, com.tools20022.repository.msg.SubscriptionExecution5.StaffClientBreakdown,
						com.tools20022.repository.msg.SubscriptionOrder7.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionBulkOrder4.IndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder2.IndividualOrderDetails, com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1.MultipleOrderDetails,
						com.tools20022.repository.msg.SubscriptionOrder6.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionMultipleOrder3.IndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2.MultipleOrderDetails, com.tools20022.repository.msg.SubscriptionExecution6.StaffClientBreakdown,
						com.tools20022.repository.msg.SubscriptionOrder8.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionMultipleOrder4.IndividualOrderDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice.SubscriptionDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder5.IndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrder5.IndividualOrderDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder6.IndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionExecution13.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionExecution12.StaffClientBreakdown,
						com.tools20022.repository.msg.SubscriptionOrder15.StaffClientBreakdown, com.tools20022.repository.msg.SubscriptionOrder14.StaffClientBreakdown);
				subType_lazy = () -> Arrays.asList(SwitchSubscriptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(SubscriptionOrder3.mmObject(), SubscriptionBulkOrder2.mmObject(), SubscriptionBulkOrderInstruction1.mmObject(), SubscriptionOrder5.mmObject(),
						SubscriptionBulkOrder3.mmObject(), SubscriptionBulkOrderInstruction2.mmObject(), SubscriptionOrder7.mmObject(), SubscriptionBulkOrder4.mmObject(), SubscriptionOrder4.mmObject(),
						SubscriptionMultipleOrder2.mmObject(), SubscriptionMultipleOrderInstruction1.mmObject(), SubscriptionOrder6.mmObject(), SubscriptionMultipleOrder3.mmObject(), SubscriptionMultipleOrderInstruction2.mmObject(),
						SubscriptionOrder8.mmObject(), SubscriptionMultipleOrder4.mmObject(), SubscriptionOrder9.mmObject(), SubscriptionOrder10.mmObject(), SubscriptionOrder11.mmObject(), SubscriptionMultipleOrder5.mmObject(),
						SubscriptionBulkOrder5.mmObject(), SubscriptionMultipleOrder6.mmObject(), SubscriptionOrder15.mmObject(), SubscriptionOrder14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}