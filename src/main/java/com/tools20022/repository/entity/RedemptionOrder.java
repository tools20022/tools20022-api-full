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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RedemptionOrder" src="doc-files/RedemptionOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#HoldingsRedemptionRate
 * RedemptionOrder.HoldingsRedemptionRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#IndividualOrderDetails
 * RedemptionBulkOrder2.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1#BulkOrderDetails
 * RedemptionBulkOrderInstruction1.BulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#StaffClientBreakdown
 * RedemptionOrder5.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#IndividualOrderDetails
 * RedemptionBulkOrder3.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2#BulkOrderDetails
 * RedemptionBulkOrderInstruction2.BulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#StaffClientBreakdown
 * RedemptionExecution5.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#StaffClientBreakdown
 * RedemptionOrder7.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#IndividualOrderDetails
 * RedemptionBulkOrder4.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#IndividualOrderDetails
 * RedemptionMultipleOrder2.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#MultipleOrderDetails
 * RedemptionMultipleOrderInstruction1.MultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#StaffClientBreakdown
 * RedemptionOrder6.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#IndividualOrderDetails
 * RedemptionMultipleOrder3.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#MultipleOrderDetails
 * RedemptionMultipleOrderInstruction2.MultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#StaffClientBreakdown
 * RedemptionExecution6.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#StaffClientBreakdown
 * RedemptionOrder8.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#IndividualOrderDetails
 * RedemptionMultipleOrder4.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#RedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.RedemptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#IndividualOrderDetails
 * RedemptionMultipleOrder5.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#IndividualOrderDetails
 * RedemptionMultipleOrder6.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#IndividualOrderDetails
 * RedemptionBulkOrder6.IndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#StaffClientBreakdown
 * RedemptionOrder14.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#StaffClientBreakdown
 * RedemptionOrder15.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#StaffClientBreakdown
 * RedemptionExecution16.StaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#StaffClientBreakdown
 * RedemptionExecution15.StaffClientBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
 * SwitchRedemptionLeg}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder3
 * RedemptionOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2
 * RedemptionBulkOrder2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1
 * RedemptionBulkOrderInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder5
 * RedemptionOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3
 * RedemptionBulkOrder3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2
 * RedemptionBulkOrderInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder7
 * RedemptionOrder7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4
 * RedemptionBulkOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder4
 * RedemptionOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2
 * RedemptionMultipleOrder2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1
 * RedemptionMultipleOrderInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder6
 * RedemptionOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3
 * RedemptionMultipleOrder3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2
 * RedemptionMultipleOrderInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder8
 * RedemptionOrder8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4
 * RedemptionMultipleOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder9
 * RedemptionOrder9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder10
 * RedemptionOrder10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder11
 * RedemptionOrder11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5
 * RedemptionMultipleOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
 * RedemptionMultipleOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6
 * RedemptionBulkOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder14
 * RedemptionOrder14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder15
 * RedemptionOrder15}</li>
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
 * "RedemptionOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction from an investor to sell investment fund units back to the fund."
 * </li>
 * </ul>
 */
public class RedemptionOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Portion of the investor's holdings, in a specific investment fund/ fund
	 * class, that is redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#HoldingsRedemptionRate
	 * FundOrderData1.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#HoldingsRedemptionRate
	 * RedemptionOrder3.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#HoldingsRedemptionRate
	 * RedemptionOrder5.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#HoldingsRedemptionRate
	 * RedemptionExecution3.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#HoldingsRedemptionRate
	 * RedemptionExecution5.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#HoldingsRedemptionRate
	 * RedemptionOrder7.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#HoldingsRedemptionRate
	 * RedemptionOrder4.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#HoldingsRedemptionRate
	 * RedemptionOrder6.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#HoldingsRedemptionRate
	 * RedemptionExecution4.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#HoldingsRedemptionRate
	 * RedemptionExecution6.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#HoldingsRedemptionRate
	 * RedemptionOrder8.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#HoldingsRedemptionRate
	 * FinancialInstrumentQuantity3Choice.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#HoldingsRedemptionRate
	 * FinancialInstrumentQuantity5Choice.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#HoldingsRedemptionRate
	 * SwitchRedemptionLegExecution2.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#HoldingsRedemptionRate
	 * SwitchRedemptionLegExecution3.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#HoldingsRedemptionRate
	 * FinancialInstrumentQuantity3.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#HoldingsRedemptionRate
	 * FundOrderData5.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#HoldingsRedemptionRate
	 * FinancialInstrumentQuantity29Choice.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#HoldingsRedemptionRate
	 * FinancialInstrumentQuantity28Choice.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#HoldingsRedemptionRate
	 * RedemptionExecution16.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#HoldingsRedemptionRate
	 * RedemptionExecution15.HoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#HoldingsRedemptionRate
	 * SwitchRedemptionLegExecution4.HoldingsRedemptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingsRedemptionRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData1.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionOrder3.HoldingsRedemptionRate,
					com.tools20022.repository.msg.RedemptionOrder5.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionExecution3.HoldingsRedemptionRate,
					com.tools20022.repository.msg.RedemptionExecution5.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionOrder7.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionOrder4.HoldingsRedemptionRate,
					com.tools20022.repository.msg.RedemptionOrder6.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionExecution4.HoldingsRedemptionRate,
					com.tools20022.repository.msg.RedemptionExecution6.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionOrder8.HoldingsRedemptionRate,
					com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice.HoldingsRedemptionRate, com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice.HoldingsRedemptionRate,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.HoldingsRedemptionRate, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.HoldingsRedemptionRate,
					com.tools20022.repository.msg.FinancialInstrumentQuantity3.HoldingsRedemptionRate, com.tools20022.repository.msg.FundOrderData5.HoldingsRedemptionRate,
					com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice.HoldingsRedemptionRate, com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice.HoldingsRedemptionRate,
					com.tools20022.repository.msg.RedemptionExecution16.HoldingsRedemptionRate, com.tools20022.repository.msg.RedemptionExecution15.HoldingsRedemptionRate,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.HoldingsRedemptionRate);
			elementContext_lazy = () -> RedemptionOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrder";
				definition = "Instruction from an investor to sell investment fund units back to the fund.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.IndividualOrderDetails, com.tools20022.repository.msg.RedemptionBulkOrderInstruction1.BulkOrderDetails,
						com.tools20022.repository.msg.RedemptionOrder5.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionBulkOrder3.IndividualOrderDetails,
						com.tools20022.repository.msg.RedemptionBulkOrderInstruction2.BulkOrderDetails, com.tools20022.repository.msg.RedemptionExecution5.StaffClientBreakdown,
						com.tools20022.repository.msg.RedemptionOrder7.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionBulkOrder4.IndividualOrderDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder2.IndividualOrderDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.MultipleOrderDetails,
						com.tools20022.repository.msg.RedemptionOrder6.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionMultipleOrder3.IndividualOrderDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.MultipleOrderDetails, com.tools20022.repository.msg.RedemptionExecution6.StaffClientBreakdown,
						com.tools20022.repository.msg.RedemptionOrder8.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionMultipleOrder4.IndividualOrderDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice.RedemptionDetails, com.tools20022.repository.msg.RedemptionMultipleOrder5.IndividualOrderDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.IndividualOrderDetails, com.tools20022.repository.msg.RedemptionBulkOrder6.IndividualOrderDetails,
						com.tools20022.repository.msg.RedemptionOrder14.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionOrder15.StaffClientBreakdown, com.tools20022.repository.msg.RedemptionExecution16.StaffClientBreakdown,
						com.tools20022.repository.msg.RedemptionExecution15.StaffClientBreakdown);
				subType_lazy = () -> Arrays.asList(SwitchRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionOrder.HoldingsRedemptionRate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionOrder3.mmObject(), RedemptionBulkOrder2.mmObject(), RedemptionBulkOrderInstruction1.mmObject(), RedemptionOrder5.mmObject(), RedemptionBulkOrder3.mmObject(),
						RedemptionBulkOrderInstruction2.mmObject(), RedemptionOrder7.mmObject(), RedemptionBulkOrder4.mmObject(), RedemptionOrder4.mmObject(), RedemptionMultipleOrder2.mmObject(),
						RedemptionMultipleOrderInstruction1.mmObject(), RedemptionOrder6.mmObject(), RedemptionMultipleOrder3.mmObject(), RedemptionMultipleOrderInstruction2.mmObject(), RedemptionOrder8.mmObject(),
						RedemptionMultipleOrder4.mmObject(), RedemptionOrder9.mmObject(), RedemptionOrder10.mmObject(), RedemptionOrder11.mmObject(), RedemptionMultipleOrder5.mmObject(), RedemptionMultipleOrder6.mmObject(),
						RedemptionBulkOrder6.mmObject(), RedemptionOrder14.mmObject(), RedemptionOrder15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}