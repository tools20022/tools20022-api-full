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
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Execution of a subscription order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SubscriptionExecution"
 * src="doc-files/SubscriptionExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#EquityComponent
 * SubscriptionExecution.EquityComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#CashComponent
 * SubscriptionExecution.CashComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#InvestedNetAmount
 * SubscriptionExecution.InvestedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#Refund
 * SubscriptionExecution.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#SubscriptionInterest
 * SubscriptionExecution.SubscriptionInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#CurrentYearSubscriptionDetails
 * ISAYearsOfIssue1.CurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#CurrentYearSubscriptionDetails
 * ISAYearsOfIssue4.CurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#CurrentYearSubscriptionDetails
 * ISAYearsOfIssue3.CurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#CurrentYearSubscriptionDetails
 * ISAYearsOfIssue5.CurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#IndividualExecutionDetails
 * SubscriptionBulkExecution2.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#IndividualExecutionDetails
 * SubscriptionBulkExecution3.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1#BulkExecutionDetails
 * SubscriptionBulkOrderConfirmation1.BulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#IndividualExecutionDetails
 * SubscriptionMultipleExecution2.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#IndividualExecutionDetails
 * SubscriptionMultipleExecution3.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1#MultipleExecutionDetails
 * SubscriptionOrderConfirmation1.MultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#SubscriptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.SubscriptionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#IndividualExecutionDetails
 * SubscriptionMultipleExecution4.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#IndividualExecutionDetails
 * SubscriptionBulkExecution4.IndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#IndividualExecutionDetails
 * SubscriptionMultipleExecution5.IndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
 * SwitchExecutionSubscriptionLeg}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionInformation
 * SubscriptionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionInformation1
 * SubscriptionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution3
 * SubscriptionExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2
 * SubscriptionBulkExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution5
 * SubscriptionExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3
 * SubscriptionBulkExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1
 * SubscriptionBulkOrderConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution4
 * SubscriptionExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2
 * SubscriptionMultipleExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution6
 * SubscriptionExecution6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3
 * SubscriptionMultipleExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1
 * SubscriptionOrderConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution7
 * SubscriptionExecution7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution8
 * SubscriptionExecution8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution9
 * SubscriptionExecution9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4
 * SubscriptionMultipleExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4
 * SubscriptionBulkExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
 * SubscriptionMultipleExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution13
 * SubscriptionExecution13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionExecution12
 * SubscriptionExecution12}</li>
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
 * "SubscriptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
public class SubscriptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount subscribed into equity (not including dividends).
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#EquityComponent
	 * SubscriptionInformation.EquityComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#EquityComponent
	 * SubscriptionInformation1.EquityComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into equity (not including dividends)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EquityComponent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionInformation.EquityComponent, com.tools20022.repository.msg.SubscriptionInformation1.EquityComponent);
			elementContext_lazy = () -> SubscriptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EquityComponent";
			definition = "Amount subscribed into equity (not including dividends).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount subscribed into cash.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#CashComponent
	 * SubscriptionInformation.CashComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#CashComponent
	 * SubscriptionInformation1.CashComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into cash."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashComponent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionInformation.CashComponent, com.tools20022.repository.msg.SubscriptionInformation1.CashComponent);
			elementContext_lazy = () -> SubscriptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashComponent";
			definition = "Amount subscribed into cash.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Net amount of money invested in a specific financial instrument by an
	 * investor, expressed in the currency requested by the investor.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#NetAmount
	 * SubscriptionExecution3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#NetAmount
	 * SubscriptionExecution5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#NetAmount
	 * SubscriptionExecution4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#NetAmount
	 * SubscriptionExecution6.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#NetAmount
	 * SwitchSubscriptionLegExecution2.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#NetAmount
	 * SwitchSubscriptionLegExecution3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#NetAmount
	 * SubscriptionExecution9.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#NetAmount
	 * SubscriptionExecution13.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#NetAmount
	 * SubscriptionExecution12.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#NetAmount
	 * SwitchSubscriptionLegExecution4.NetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestedNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestedNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution3.NetAmount, com.tools20022.repository.msg.SubscriptionExecution5.NetAmount,
					com.tools20022.repository.msg.SubscriptionExecution4.NetAmount, com.tools20022.repository.msg.SubscriptionExecution6.NetAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.NetAmount,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.NetAmount, com.tools20022.repository.msg.SubscriptionExecution9.NetAmount, com.tools20022.repository.msg.SubscriptionExecution13.NetAmount,
					com.tools20022.repository.msg.SubscriptionExecution12.NetAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.NetAmount);
			elementContext_lazy = () -> SubscriptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestedNetAmount";
			definition = "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Return of cash that has been overpaid for a subscription.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#Refund
	 * SubscriptionExecution3.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#Refund
	 * SubscriptionExecution5.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#Refund
	 * SubscriptionExecution4.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#Refund
	 * SubscriptionExecution6.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#Refund
	 * SubscriptionExecution7.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#Refund
	 * SubscriptionExecution13.Refund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#Refund
	 * SubscriptionExecution12.Refund}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of cash that has been overpaid for a subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Refund = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution3.Refund, com.tools20022.repository.msg.SubscriptionExecution5.Refund, com.tools20022.repository.msg.SubscriptionExecution4.Refund,
					com.tools20022.repository.msg.SubscriptionExecution6.Refund, com.tools20022.repository.msg.SubscriptionExecution7.Refund, com.tools20022.repository.msg.SubscriptionExecution13.Refund,
					com.tools20022.repository.msg.SubscriptionExecution12.Refund);
			elementContext_lazy = () -> SubscriptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Return of cash that has been overpaid for a subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest received when a subscription amount is paid in advance and then
	 * invested by the fund.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#SubscriptionInterest
	 * SubscriptionExecution3.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#SubscriptionInterest
	 * SubscriptionExecution5.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#SubscriptionInterest
	 * SubscriptionExecution4.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#SubscriptionInterest
	 * SubscriptionExecution6.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#SubscriptionInterest
	 * SubscriptionExecution7.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SubscriptionInterest
	 * SubscriptionExecution13.SubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#SubscriptionInterest
	 * SubscriptionExecution12.SubscriptionInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest received when a subscription amount is paid in advance and then invested by the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubscriptionInterest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution3.SubscriptionInterest, com.tools20022.repository.msg.SubscriptionExecution5.SubscriptionInterest,
					com.tools20022.repository.msg.SubscriptionExecution4.SubscriptionInterest, com.tools20022.repository.msg.SubscriptionExecution6.SubscriptionInterest,
					com.tools20022.repository.msg.SubscriptionExecution7.SubscriptionInterest, com.tools20022.repository.msg.SubscriptionExecution13.SubscriptionInterest,
					com.tools20022.repository.msg.SubscriptionExecution12.SubscriptionInterest);
			elementContext_lazy = () -> SubscriptionExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionInterest";
			definition = "Interest received when a subscription amount is paid in advance and then invested by the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SubscriptionExecution";
				definition = "Execution of a subscription order.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue1.CurrentYearSubscriptionDetails, com.tools20022.repository.msg.ISAYearsOfIssue4.CurrentYearSubscriptionDetails,
						com.tools20022.repository.msg.ISAYearsOfIssue3.CurrentYearSubscriptionDetails, com.tools20022.repository.msg.ISAYearsOfIssue5.CurrentYearSubscriptionDetails,
						com.tools20022.repository.msg.SubscriptionBulkExecution2.IndividualExecutionDetails, com.tools20022.repository.msg.SubscriptionBulkExecution3.IndividualExecutionDetails,
						com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1.BulkExecutionDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution2.IndividualExecutionDetails,
						com.tools20022.repository.msg.SubscriptionMultipleExecution3.IndividualExecutionDetails, com.tools20022.repository.msg.SubscriptionOrderConfirmation1.MultipleExecutionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.SubscriptionDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution4.IndividualExecutionDetails,
						com.tools20022.repository.msg.SubscriptionBulkExecution4.IndividualExecutionDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution5.IndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionSubscriptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SubscriptionExecution.EquityComponent, com.tools20022.repository.entity.SubscriptionExecution.CashComponent,
						com.tools20022.repository.entity.SubscriptionExecution.InvestedNetAmount, com.tools20022.repository.entity.SubscriptionExecution.Refund, com.tools20022.repository.entity.SubscriptionExecution.SubscriptionInterest);
				derivationComponent_lazy = () -> Arrays.asList(SubscriptionInformation.mmObject(), SubscriptionInformation1.mmObject(), SubscriptionExecution3.mmObject(), SubscriptionBulkExecution2.mmObject(),
						SubscriptionExecution5.mmObject(), SubscriptionBulkExecution3.mmObject(), SubscriptionBulkOrderConfirmation1.mmObject(), SubscriptionExecution4.mmObject(), SubscriptionMultipleExecution2.mmObject(),
						SubscriptionExecution6.mmObject(), SubscriptionMultipleExecution3.mmObject(), SubscriptionOrderConfirmation1.mmObject(), SubscriptionExecution7.mmObject(), SubscriptionExecution8.mmObject(),
						SubscriptionExecution9.mmObject(), SubscriptionMultipleExecution4.mmObject(), SubscriptionBulkExecution4.mmObject(), SubscriptionMultipleExecution5.mmObject(), SubscriptionExecution13.mmObject(),
						SubscriptionExecution12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}