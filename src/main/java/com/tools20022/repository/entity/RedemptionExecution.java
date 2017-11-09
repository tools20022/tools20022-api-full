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
import com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmIndividualExecutionDetails
 * RedemptionBulkExecution2.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmIndividualExecutionDetails
 * RedemptionBulkExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1#mmBulkExecutionDetails
 * OrderConfirmationDetails1.mmBulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmIndividualExecutionDetails
 * RedemptionMultipleExecution2.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmIndividualExecutionDetails
 * RedemptionMultipleExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmMultipleExecutionDetails
 * RedemptionOrderConfirmation1.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmRedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmRedemptionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#mmIndividualExecutionDetails
 * RedemptionMultipleExecution4.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmIndividualExecutionDetails
 * RedemptionBulkExecution5.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmIndividualExecutionDetails
 * RedemptionMultipleExecution5.mmIndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
 * SwitchExecutionRedemptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmRedeemedNetAmount
 * RedemptionExecution.mmRedeemedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmPartialRedemptionWithholdingAmount
 * RedemptionExecution.mmPartialRedemptionWithholdingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmSettlementDate
 * RedemptionExecution.mmSettlementDate}</li>
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
 * "RedemptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * </ul>
 */
public class RedemptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount redeemedNetAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmNetAmount
	 * RedemptionExecution3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmNetAmount
	 * RedemptionExecution5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmNetAmount
	 * RedemptionExecution4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNetAmount
	 * RedemptionExecution6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmNetAmount
	 * SwitchRedemptionLegExecution2.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmNetAmount
	 * SwitchRedemptionLegExecution3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmNetAmount
	 * RedemptionExecution12.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNetAmount
	 * RedemptionExecution16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNetAmount
	 * RedemptionExecution15.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmNetAmount
	 * SwitchRedemptionLegExecution4.mmNetAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRedeemedNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution3.mmNetAmount, RedemptionExecution5.mmNetAmount, RedemptionExecution4.mmNetAmount, RedemptionExecution6.mmNetAmount, SwitchRedemptionLegExecution2.mmNetAmount,
					SwitchRedemptionLegExecution3.mmNetAmount, RedemptionExecution12.mmNetAmount, RedemptionExecution16.mmNetAmount, RedemptionExecution15.mmNetAmount, SwitchRedemptionLegExecution4.mmNetAmount);
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedeemedNetAmount";
			definition = "Net amount of money paid to the investor as a result of the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount partialRedemptionWithholdingAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution5.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution6.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution12.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution16.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution15.mmPartialRedemptionWithholdingAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPartialRedemptionWithholdingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmPartialRedemptionWithholdingAmount, RedemptionExecution6.mmPartialRedemptionWithholdingAmount, RedemptionExecution12.mmPartialRedemptionWithholdingAmount,
					RedemptionExecution16.mmPartialRedemptionWithholdingAmount, RedemptionExecution15.mmPartialRedemptionWithholdingAmount);
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialRedemptionWithholdingAmount";
			definition = "Amount retained by the Fund and paid out later at a time decided by the Fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODate settlementDate;
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
	public static final MMBusinessAttribute mmSettlementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RedemptionExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money for the redemption is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionExecution";
				definition = "Execution of a redemption order.";
				derivationElement_lazy = () -> Arrays.asList(RedemptionBulkExecution2.mmIndividualExecutionDetails, RedemptionBulkExecution3.mmIndividualExecutionDetails, OrderConfirmationDetails1.mmBulkExecutionDetails,
						RedemptionMultipleExecution2.mmIndividualExecutionDetails, RedemptionMultipleExecution3.mmIndividualExecutionDetails, RedemptionOrderConfirmation1.mmMultipleExecutionDetails,
						SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmRedemptionDetails, RedemptionMultipleExecution4.mmIndividualExecutionDetails, RedemptionBulkExecution5.mmIndividualExecutionDetails,
						RedemptionMultipleExecution5.mmIndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionRedemptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(RedemptionExecution.mmRedeemedNetAmount, RedemptionExecution.mmPartialRedemptionWithholdingAmount, RedemptionExecution.mmSettlementDate);
				derivationComponent_lazy = () -> Arrays.asList(RedemptionExecution3.mmObject(), RedemptionBulkExecution2.mmObject(), RedemptionExecution5.mmObject(), RedemptionBulkExecution3.mmObject(), RedemptionExecution4.mmObject(),
						RedemptionMultipleExecution2.mmObject(), RedemptionExecution6.mmObject(), RedemptionMultipleExecution3.mmObject(), RedemptionOrderConfirmation1.mmObject(), RedemptionExecution10.mmObject(),
						RedemptionExecution11.mmObject(), RedemptionExecution12.mmObject(), RedemptionMultipleExecution4.mmObject(), RedemptionBulkExecution5.mmObject(), RedemptionMultipleExecution5.mmObject(),
						RedemptionExecution16.mmObject(), RedemptionExecution15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getRedeemedNetAmount() {
		return redeemedNetAmount;
	}

	public void setRedeemedNetAmount(CurrencyAndAmount redeemedNetAmount) {
		this.redeemedNetAmount = redeemedNetAmount;
	}

	public CurrencyAndAmount getPartialRedemptionWithholdingAmount() {
		return partialRedemptionWithholdingAmount;
	}

	public void setPartialRedemptionWithholdingAmount(CurrencyAndAmount partialRedemptionWithholdingAmount) {
		this.partialRedemptionWithholdingAmount = partialRedemptionWithholdingAmount;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
	}
}