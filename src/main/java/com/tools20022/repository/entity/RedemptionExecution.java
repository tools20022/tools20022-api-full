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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Execution of a redemption order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RedemptionExecution" src="doc-files/RedemptionExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#RedeemedNetAmount
 * RedemptionExecution.RedeemedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#PartialRedemptionWithholdingAmount
 * RedemptionExecution.PartialRedemptionWithholdingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#SettlementDate
 * RedemptionExecution.SettlementDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#IndividualExecutionDetails
 * RedemptionBulkExecution2.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#IndividualExecutionDetails
 * RedemptionBulkExecution3.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1#BulkExecutionDetails
 * OrderConfirmationDetails1.BulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#IndividualExecutionDetails
 * RedemptionMultipleExecution2.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#IndividualExecutionDetails
 * RedemptionMultipleExecution3.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#MultipleExecutionDetails
 * RedemptionOrderConfirmation1.MultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#RedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.RedemptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#IndividualExecutionDetails
 * RedemptionMultipleExecution4.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#IndividualExecutionDetails
 * RedemptionBulkExecution5.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#IndividualExecutionDetails
 * RedemptionMultipleExecution5.IndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
 * SwitchExecutionRedemptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution3
 * RedemptionExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2
 * RedemptionBulkExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution5
 * RedemptionExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
 * RedemptionBulkExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution4
 * RedemptionExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2
 * RedemptionMultipleExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution6
 * RedemptionExecution6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
 * RedemptionMultipleExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
 * RedemptionOrderConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution10
 * RedemptionExecution10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution11
 * RedemptionExecution11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution12
 * RedemptionExecution12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4
 * RedemptionMultipleExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5
 * RedemptionBulkExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
 * RedemptionMultipleExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution16
 * RedemptionExecution16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution15
 * RedemptionExecution15}</li>
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
 * "RedemptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * </ul>
 */
public class RedemptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Net amount of money paid to the investor as a result of the redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#NetAmount
	 * RedemptionExecution3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#NetAmount
	 * RedemptionExecution5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#NetAmount
	 * RedemptionExecution4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#NetAmount
	 * RedemptionExecution6.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#NetAmount
	 * SwitchRedemptionLegExecution2.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#NetAmount
	 * SwitchRedemptionLegExecution3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#NetAmount
	 * RedemptionExecution12.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#NetAmount
	 * RedemptionExecution16.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#NetAmount
	 * RedemptionExecution15.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#NetAmount
	 * SwitchRedemptionLegExecution4.NetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedeemedNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of money paid to the investor as a result of the redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RedeemedNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution3.NetAmount, com.tools20022.repository.msg.RedemptionExecution5.NetAmount, com.tools20022.repository.msg.RedemptionExecution4.NetAmount,
					com.tools20022.repository.msg.RedemptionExecution6.NetAmount, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.NetAmount, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.NetAmount,
					com.tools20022.repository.msg.RedemptionExecution12.NetAmount, com.tools20022.repository.msg.RedemptionExecution16.NetAmount, com.tools20022.repository.msg.RedemptionExecution15.NetAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.NetAmount);
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedeemedNetAmount";
			definition = "Net amount of money paid to the investor as a result of the redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount retained by the Fund and paid out later at a time decided by the
	 * Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#PartialRedemptionWithholdingAmount
	 * RedemptionExecution5.PartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#PartialRedemptionWithholdingAmount
	 * RedemptionExecution6.PartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#PartialRedemptionWithholdingAmount
	 * RedemptionExecution12.PartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#PartialRedemptionWithholdingAmount
	 * RedemptionExecution16.PartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#PartialRedemptionWithholdingAmount
	 * RedemptionExecution15.PartialRedemptionWithholdingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithholdingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount retained by the Fund and paid out later at a time decided by the Fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialRedemptionWithholdingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.PartialRedemptionWithholdingAmount, com.tools20022.repository.msg.RedemptionExecution6.PartialRedemptionWithholdingAmount,
					com.tools20022.repository.msg.RedemptionExecution12.PartialRedemptionWithholdingAmount, com.tools20022.repository.msg.RedemptionExecution16.PartialRedemptionWithholdingAmount,
					com.tools20022.repository.msg.RedemptionExecution15.PartialRedemptionWithholdingAmount);
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialRedemptionWithholdingAmount";
			definition = "Amount retained by the Fund and paid out later at a time decided by the Fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which the amount of money for the redemption is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money for the redemption is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money for the redemption is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RedemptionExecution";
				definition = "Execution of a redemption order.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkExecution2.IndividualExecutionDetails, com.tools20022.repository.msg.RedemptionBulkExecution3.IndividualExecutionDetails,
						com.tools20022.repository.msg.OrderConfirmationDetails1.BulkExecutionDetails, com.tools20022.repository.msg.RedemptionMultipleExecution2.IndividualExecutionDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.IndividualExecutionDetails, com.tools20022.repository.msg.RedemptionOrderConfirmation1.MultipleExecutionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.RedemptionDetails, com.tools20022.repository.msg.RedemptionMultipleExecution4.IndividualExecutionDetails,
						com.tools20022.repository.msg.RedemptionBulkExecution5.IndividualExecutionDetails, com.tools20022.repository.msg.RedemptionMultipleExecution5.IndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionExecution.RedeemedNetAmount, com.tools20022.repository.entity.RedemptionExecution.PartialRedemptionWithholdingAmount,
						com.tools20022.repository.entity.RedemptionExecution.SettlementDate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionExecution3.mmObject(), RedemptionBulkExecution2.mmObject(), RedemptionExecution5.mmObject(), RedemptionBulkExecution3.mmObject(), RedemptionExecution4.mmObject(),
						RedemptionMultipleExecution2.mmObject(), RedemptionExecution6.mmObject(), RedemptionMultipleExecution3.mmObject(), RedemptionOrderConfirmation1.mmObject(), RedemptionExecution10.mmObject(),
						RedemptionExecution11.mmObject(), RedemptionExecution12.mmObject(), RedemptionMultipleExecution4.mmObject(), RedemptionBulkExecution5.mmObject(), RedemptionMultipleExecution5.mmObject(),
						RedemptionExecution16.mmObject(), RedemptionExecution15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}