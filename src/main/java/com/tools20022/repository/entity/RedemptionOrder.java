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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmIndividualOrderDetails
 * RedemptionBulkOrder2.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1#mmBulkOrderDetails
 * RedemptionBulkOrderInstruction1.mmBulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmStaffClientBreakdown
 * RedemptionOrder5.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmIndividualOrderDetails
 * RedemptionBulkOrder3.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2#mmBulkOrderDetails
 * RedemptionBulkOrderInstruction2.mmBulkOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmStaffClientBreakdown
 * RedemptionExecution5.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmStaffClientBreakdown
 * RedemptionOrder7.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmIndividualOrderDetails
 * RedemptionBulkOrder4.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmIndividualOrderDetails
 * RedemptionMultipleOrder2.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmMultipleOrderDetails
 * RedemptionMultipleOrderInstruction1.mmMultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmStaffClientBreakdown
 * RedemptionOrder6.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmIndividualOrderDetails
 * RedemptionMultipleOrder3.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#mmMultipleOrderDetails
 * RedemptionMultipleOrderInstruction2.mmMultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmStaffClientBreakdown
 * RedemptionExecution6.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmStaffClientBreakdown
 * RedemptionOrder8.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmIndividualOrderDetails
 * RedemptionMultipleOrder4.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#mmRedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmRedemptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#mmIndividualOrderDetails
 * RedemptionMultipleOrder5.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmIndividualOrderDetails
 * RedemptionMultipleOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmIndividualOrderDetails
 * RedemptionBulkOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmStaffClientBreakdown
 * RedemptionOrder14.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmStaffClientBreakdown
 * RedemptionOrder15.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmStaffClientBreakdown
 * RedemptionExecution16.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmStaffClientBreakdown
 * RedemptionExecution15.mmStaffClientBreakdown}</li>
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
	protected PercentageRate holdingsRedemptionRate;
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmHoldingsRedemptionRate
	 * FundOrderData1.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmHoldingsRedemptionRate
	 * RedemptionOrder3.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmHoldingsRedemptionRate
	 * RedemptionOrder5.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmHoldingsRedemptionRate
	 * RedemptionExecution3.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmHoldingsRedemptionRate
	 * RedemptionExecution5.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmHoldingsRedemptionRate
	 * RedemptionOrder7.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmHoldingsRedemptionRate
	 * RedemptionOrder4.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmHoldingsRedemptionRate
	 * RedemptionOrder6.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmHoldingsRedemptionRate
	 * RedemptionExecution4.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmHoldingsRedemptionRate
	 * RedemptionExecution6.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmHoldingsRedemptionRate
	 * RedemptionOrder8.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity3Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity5Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmHoldingsRedemptionRate
	 * SwitchRedemptionLegExecution2.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmHoldingsRedemptionRate
	 * SwitchRedemptionLegExecution3.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity3.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmHoldingsRedemptionRate
	 * FundOrderData5.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity29Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmHoldingsRedemptionRate
	 * FinancialInstrumentQuantity28Choice.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmHoldingsRedemptionRate
	 * RedemptionExecution16.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmHoldingsRedemptionRate
	 * RedemptionExecution15.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmHoldingsRedemptionRate
	 * SwitchRedemptionLegExecution4.mmHoldingsRedemptionRate}</li>
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
	public static final MMBusinessAttribute mmHoldingsRedemptionRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData1.mmHoldingsRedemptionRate, RedemptionOrder3.mmHoldingsRedemptionRate, RedemptionOrder5.mmHoldingsRedemptionRate, RedemptionExecution3.mmHoldingsRedemptionRate,
					RedemptionExecution5.mmHoldingsRedemptionRate, RedemptionOrder7.mmHoldingsRedemptionRate, RedemptionOrder4.mmHoldingsRedemptionRate, RedemptionOrder6.mmHoldingsRedemptionRate,
					RedemptionExecution4.mmHoldingsRedemptionRate, RedemptionExecution6.mmHoldingsRedemptionRate, RedemptionOrder8.mmHoldingsRedemptionRate, FinancialInstrumentQuantity3Choice.mmHoldingsRedemptionRate,
					FinancialInstrumentQuantity5Choice.mmHoldingsRedemptionRate, SwitchRedemptionLegExecution2.mmHoldingsRedemptionRate, SwitchRedemptionLegExecution3.mmHoldingsRedemptionRate,
					FinancialInstrumentQuantity3.mmHoldingsRedemptionRate, FundOrderData5.mmHoldingsRedemptionRate, FinancialInstrumentQuantity29Choice.mmHoldingsRedemptionRate, FinancialInstrumentQuantity28Choice.mmHoldingsRedemptionRate,
					RedemptionExecution16.mmHoldingsRedemptionRate, RedemptionExecution15.mmHoldingsRedemptionRate, SwitchRedemptionLegExecution4.mmHoldingsRedemptionRate);
			elementContext_lazy = () -> com.tools20022.repository.entity.RedemptionOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrder.class.getMethod("getHoldingsRedemptionRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrder";
				definition = "Instruction from an investor to sell investment fund units back to the fund.";
				derivationElement_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmIndividualOrderDetails, RedemptionBulkOrderInstruction1.mmBulkOrderDetails, RedemptionOrder5.mmStaffClientBreakdown,
						RedemptionBulkOrder3.mmIndividualOrderDetails, RedemptionBulkOrderInstruction2.mmBulkOrderDetails, RedemptionExecution5.mmStaffClientBreakdown, RedemptionOrder7.mmStaffClientBreakdown,
						RedemptionBulkOrder4.mmIndividualOrderDetails, RedemptionMultipleOrder2.mmIndividualOrderDetails, RedemptionMultipleOrderInstruction1.mmMultipleOrderDetails, RedemptionOrder6.mmStaffClientBreakdown,
						RedemptionMultipleOrder3.mmIndividualOrderDetails, RedemptionMultipleOrderInstruction2.mmMultipleOrderDetails, RedemptionExecution6.mmStaffClientBreakdown, RedemptionOrder8.mmStaffClientBreakdown,
						RedemptionMultipleOrder4.mmIndividualOrderDetails, SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmRedemptionDetails, RedemptionMultipleOrder5.mmIndividualOrderDetails,
						RedemptionMultipleOrder6.mmIndividualOrderDetails, RedemptionBulkOrder6.mmIndividualOrderDetails, RedemptionOrder14.mmStaffClientBreakdown, RedemptionOrder15.mmStaffClientBreakdown,
						RedemptionExecution16.mmStaffClientBreakdown, RedemptionExecution15.mmStaffClientBreakdown);
				subType_lazy = () -> Arrays.asList(SwitchRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionOrder.mmHoldingsRedemptionRate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionOrder3.mmObject(), RedemptionBulkOrder2.mmObject(), RedemptionBulkOrderInstruction1.mmObject(), RedemptionOrder5.mmObject(), RedemptionBulkOrder3.mmObject(),
						RedemptionBulkOrderInstruction2.mmObject(), RedemptionOrder7.mmObject(), RedemptionBulkOrder4.mmObject(), RedemptionOrder4.mmObject(), RedemptionMultipleOrder2.mmObject(),
						RedemptionMultipleOrderInstruction1.mmObject(), RedemptionOrder6.mmObject(), RedemptionMultipleOrder3.mmObject(), RedemptionMultipleOrderInstruction2.mmObject(), RedemptionOrder8.mmObject(),
						RedemptionMultipleOrder4.mmObject(), RedemptionOrder9.mmObject(), RedemptionOrder10.mmObject(), RedemptionOrder11.mmObject(), RedemptionMultipleOrder5.mmObject(), RedemptionMultipleOrder6.mmObject(),
						RedemptionBulkOrder6.mmObject(), RedemptionOrder14.mmObject(), RedemptionOrder15.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getHoldingsRedemptionRate() {
		return holdingsRedemptionRate;
	}

	public void setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = holdingsRedemptionRate;
	}
}