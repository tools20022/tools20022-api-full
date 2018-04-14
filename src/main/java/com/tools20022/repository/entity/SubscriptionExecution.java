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
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmEquityComponent
 * SubscriptionExecution.mmEquityComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmCashComponent
 * SubscriptionExecution.mmCashComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmInvestedNetAmount
 * SubscriptionExecution.mmInvestedNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmRefund
 * SubscriptionExecution.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmSubscriptionInterest
 * SubscriptionExecution.mmSubscriptionInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue1.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue4.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue3.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYearSubscriptionDetails
 * ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmIndividualExecutionDetails
 * SubscriptionBulkExecution2.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmIndividualExecutionDetails
 * SubscriptionBulkExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1#mmBulkExecutionDetails
 * SubscriptionBulkOrderConfirmation1.mmBulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution2.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1#mmMultipleExecutionDetails
 * SubscriptionOrderConfirmation1.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmSubscriptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.
 * mmSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution4.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmIndividualExecutionDetails
 * SubscriptionBulkExecution4.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution5.mmIndividualExecutionDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SubscriptionExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount equityComponent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmEquityComponent
	 * SubscriptionInformation.mmEquityComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmEquityComponent
	 * SubscriptionInformation1.mmEquityComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into equity (not including dividends)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmEquityComponent = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation.mmEquityComponent, SubscriptionInformation1.mmEquityComponent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquityComponent";
			definition = "Amount subscribed into equity (not including dividends).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getEquityComponent();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setEquityComponent(value);
		}
	};
	protected CurrencyAndAmount cashComponent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmCashComponent
	 * SubscriptionInformation.mmCashComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmCashComponent
	 * SubscriptionInformation1.mmCashComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed into cash."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmCashComponent = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation.mmCashComponent, SubscriptionInformation1.mmCashComponent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashComponent";
			definition = "Amount subscribed into cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getCashComponent();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setCashComponent(value);
		}
	};
	protected CurrencyAndAmount investedNetAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmNetAmount
	 * SubscriptionExecution3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmNetAmount
	 * SubscriptionExecution5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmNetAmount
	 * SubscriptionExecution4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNetAmount
	 * SubscriptionExecution6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmNetAmount
	 * SwitchSubscriptionLegExecution2.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmNetAmount
	 * SwitchSubscriptionLegExecution3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmNetAmount
	 * SubscriptionExecution9.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNetAmount
	 * SubscriptionExecution13.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNetAmount
	 * SubscriptionExecution12.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmNetAmount
	 * SwitchSubscriptionLegExecution4.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestedNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmInvestedNetAmount = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution3.mmNetAmount, SubscriptionExecution5.mmNetAmount, SubscriptionExecution4.mmNetAmount, SubscriptionExecution6.mmNetAmount, SwitchSubscriptionLegExecution2.mmNetAmount,
					SwitchSubscriptionLegExecution3.mmNetAmount, SubscriptionExecution9.mmNetAmount, SubscriptionExecution13.mmNetAmount, SubscriptionExecution12.mmNetAmount, SwitchSubscriptionLegExecution4.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestedNetAmount";
			definition = "Net amount of money invested in a specific financial instrument by an investor, expressed in the currency requested by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getInvestedNetAmount();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setInvestedNetAmount(value);
		}
	};
	protected CurrencyAndAmount refund;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmRefund
	 * SubscriptionExecution3.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmRefund
	 * SubscriptionExecution5.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmRefund
	 * SubscriptionExecution4.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRefund
	 * SubscriptionExecution6.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRefund
	 * SubscriptionExecution7.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRefund
	 * SubscriptionExecution13.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmRefund
	 * SubscriptionExecution12.mmRefund}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of cash that has been overpaid for a subscription."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmRefund = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution3.mmRefund, SubscriptionExecution5.mmRefund, SubscriptionExecution4.mmRefund, SubscriptionExecution6.mmRefund, SubscriptionExecution7.mmRefund,
					SubscriptionExecution13.mmRefund, SubscriptionExecution12.mmRefund);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Return of cash that has been overpaid for a subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getRefund();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setRefund(value);
		}
	};
	protected CurrencyAndAmount subscriptionInterest;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmSubscriptionInterest
	 * SubscriptionExecution3.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmSubscriptionInterest
	 * SubscriptionExecution5.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmSubscriptionInterest
	 * SubscriptionExecution4.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSubscriptionInterest
	 * SubscriptionExecution6.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmSubscriptionInterest
	 * SubscriptionExecution7.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubscriptionInterest
	 * SubscriptionExecution13.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSubscriptionInterest
	 * SubscriptionExecution12.mmSubscriptionInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest received when a subscription amount is paid in advance and then invested by the fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount> mmSubscriptionInterest = new MMBusinessAttribute<SubscriptionExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution3.mmSubscriptionInterest, SubscriptionExecution5.mmSubscriptionInterest, SubscriptionExecution4.mmSubscriptionInterest, SubscriptionExecution6.mmSubscriptionInterest,
					SubscriptionExecution7.mmSubscriptionInterest, SubscriptionExecution13.mmSubscriptionInterest, SubscriptionExecution12.mmSubscriptionInterest);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SubscriptionExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionInterest";
			definition = "Interest received when a subscription amount is paid in advance and then invested by the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SubscriptionExecution obj) {
			return obj.getSubscriptionInterest();
		}

		@Override
		public void setValue(SubscriptionExecution obj, CurrencyAndAmount value) {
			obj.setSubscriptionInterest(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionExecution";
				definition = "Execution of a subscription order.";
				derivationElement_lazy = () -> Arrays.asList(ISAYearsOfIssue1.mmCurrentYearSubscriptionDetails, ISAYearsOfIssue4.mmCurrentYearSubscriptionDetails, ISAYearsOfIssue3.mmCurrentYearSubscriptionDetails,
						ISAYearsOfIssue5.mmCurrentYearSubscriptionDetails, SubscriptionBulkExecution2.mmIndividualExecutionDetails, SubscriptionBulkExecution3.mmIndividualExecutionDetails,
						SubscriptionBulkOrderConfirmation1.mmBulkExecutionDetails, SubscriptionMultipleExecution2.mmIndividualExecutionDetails, SubscriptionMultipleExecution3.mmIndividualExecutionDetails,
						SubscriptionOrderConfirmation1.mmMultipleExecutionDetails, SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSubscriptionDetails, SubscriptionMultipleExecution4.mmIndividualExecutionDetails,
						SubscriptionBulkExecution4.mmIndividualExecutionDetails, SubscriptionMultipleExecution5.mmIndividualExecutionDetails);
				subType_lazy = () -> Arrays.asList(SwitchExecutionSubscriptionLeg.mmObject());
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SubscriptionExecution.mmEquityComponent, com.tools20022.repository.entity.SubscriptionExecution.mmCashComponent,
						com.tools20022.repository.entity.SubscriptionExecution.mmInvestedNetAmount, com.tools20022.repository.entity.SubscriptionExecution.mmRefund,
						com.tools20022.repository.entity.SubscriptionExecution.mmSubscriptionInterest);
				derivationComponent_lazy = () -> Arrays.asList(SubscriptionInformation.mmObject(), SubscriptionInformation1.mmObject(), SubscriptionExecution3.mmObject(), SubscriptionBulkExecution2.mmObject(),
						SubscriptionExecution5.mmObject(), SubscriptionBulkExecution3.mmObject(), SubscriptionBulkOrderConfirmation1.mmObject(), SubscriptionExecution4.mmObject(), SubscriptionMultipleExecution2.mmObject(),
						SubscriptionExecution6.mmObject(), SubscriptionMultipleExecution3.mmObject(), SubscriptionOrderConfirmation1.mmObject(), SubscriptionExecution7.mmObject(), SubscriptionExecution8.mmObject(),
						SubscriptionExecution9.mmObject(), SubscriptionMultipleExecution4.mmObject(), SubscriptionBulkExecution4.mmObject(), SubscriptionMultipleExecution5.mmObject(), SubscriptionExecution13.mmObject(),
						SubscriptionExecution12.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getEquityComponent() {
		return equityComponent;
	}

	public SubscriptionExecution setEquityComponent(CurrencyAndAmount equityComponent) {
		this.equityComponent = Objects.requireNonNull(equityComponent);
		return this;
	}

	public CurrencyAndAmount getCashComponent() {
		return cashComponent;
	}

	public SubscriptionExecution setCashComponent(CurrencyAndAmount cashComponent) {
		this.cashComponent = Objects.requireNonNull(cashComponent);
		return this;
	}

	public CurrencyAndAmount getInvestedNetAmount() {
		return investedNetAmount;
	}

	public SubscriptionExecution setInvestedNetAmount(CurrencyAndAmount investedNetAmount) {
		this.investedNetAmount = Objects.requireNonNull(investedNetAmount);
		return this;
	}

	public CurrencyAndAmount getRefund() {
		return refund;
	}

	public SubscriptionExecution setRefund(CurrencyAndAmount refund) {
		this.refund = Objects.requireNonNull(refund);
		return this;
	}

	public CurrencyAndAmount getSubscriptionInterest() {
		return subscriptionInterest;
	}

	public SubscriptionExecution setSubscriptionInterest(CurrencyAndAmount subscriptionInterest) {
		this.subscriptionInterest = Objects.requireNonNull(subscriptionInterest);
		return this;
	}
}