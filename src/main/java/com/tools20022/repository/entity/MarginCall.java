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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MarginProductCode;
import com.tools20022.repository.codeset.MarginTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the calculation and the resulting margin and independent amount
 * needed to cover the risk exposure of one party versus another.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarginCall" src="doc-files/MarginCall.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarginCallValuationDate
 * MarginCall.MarginCallValuationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#AgreedAmount
 * MarginCall.AgreedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#VariationMargin
 * MarginCall.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#SegregatedIndependentAmount
 * MarginCall.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#DefaultFundContribution
 * MarginCall.DefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedVariationMarginType
 * MarginCall.ExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedSegregatedIndependentAmountType
 * MarginCall.ExpectedSegregatedIndependentAmountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#TotalMarkToMarket
 * MarginCall.TotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketNetted
 * MarginCall.MarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketGross
 * MarginCall.MarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketFails
 * MarginCall.MarkToMarketFails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#FailsHaircut
 * MarginCall.FailsHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#InitialMargin
 * MarginCall.InitialMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#IncreaseCoverage
 * MarginCall.IncreaseCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralisedMarginAccountIndicator
 * MarginCall.CollateralisedMarginAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralMovement
 * MarginCall.CollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#RelatedManagementProcess
 * MarginCall.RelatedManagementProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#Security
 * MarginCall.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#MarginProduct
 * MarginCall.MarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#MarginType
 * MarginCall.MarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#TotalMarginAmount
 * MarginCall.TotalMarginAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
 * Security.RelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#MarginCall
 * CollateralMovement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#MarginCall
 * CollateralManagement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#RelatedMarginCall
 * DefaultFundContribution.RelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#VariationMarginRelatedCall
 * ExpectedCollateralType.VariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#SegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.SegregatedIndependentAmountRelatedCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#MarginCallResultDetails
 * MarginCallResult1Choice.MarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult1#MarginCallResult
 * MarginCallResult1.MarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#MarginCallResultDetails
 * MarginCallResult2Choice.MarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult3#MarginCallResult
 * MarginCallResult3.MarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#CollateralRequired
 * SummaryAmounts1.CollateralRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#MarginProduct
 * MarginReport1.MarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#MarginDetails
 * MarginReport1.MarginDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3#OtherMargin
 * Margin3.OtherMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#MarginTypeAmount
 * MarginCalculation2.MarginTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#MarginCalculationSummary
 * MarginReport2.MarginCalculationSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#MarginCalculation
 * MarginReport2.MarginCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2#MarginCallResult
 * MarginCall2.MarginCallResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2#MarginDetailDueToA
 * MarginCall2.MarginDetailDueToA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2#MarginDetailDueToB
 * MarginCall2.MarginDetailDueToB}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCallResult2
 * MarginCallResult2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginCallResult1Choice
 * MarginCallResult1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCallResult1
 * MarginCallResult1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginCallResult2Choice
 * MarginCallResult2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCallResult3
 * MarginCallResult3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amount1 Amount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedAmount1 AgreedAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AgreedAmount1Choice
 * AgreedAmount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginProductType1Choice
 * MarginProductType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VariationMargin2
 * VariationMargin2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2 Margin2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1 MarginReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCalculation1
 * MarginCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VariationMargin3
 * VariationMargin3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginType1Choice
 * MarginType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin4 Margin4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3 Margin3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCalculation2
 * MarginCalculation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2 MarginReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2 MarginCall2}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCall"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another."
 * </li>
 * </ul>
 */
public class MarginCall {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Close of business date that initiating party is valuing the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#ValuationDate
	 * Obligation1.ValuationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation2#ValuationDate
	 * Obligation2.ValuationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Summary1#ValuationDateTime
	 * Summary1.ValuationDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#ValuationDate
	 * Obligation3.ValuationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ValuationDate
	 * Obligation4.ValuationDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#ValuationDate
	 * Obligation5.ValuationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Close of business date that initiating party is valuing the margin call."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginCallValuationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation1.ValuationDate, com.tools20022.repository.msg.Obligation2.ValuationDate, com.tools20022.repository.msg.Summary1.ValuationDateTime,
					com.tools20022.repository.msg.Obligation3.ValuationDate, com.tools20022.repository.msg.Obligation4.ValuationDate, com.tools20022.repository.msg.Obligation5.ValuationDate);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the amount which is undisputed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement1#AgreedAmount
	 * CollateralMovement1.AgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement4#AgreedAmount
	 * CollateralMovement4.AgreedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amount1#AgreedAmount
	 * Amount1.AgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice#AgreedAmountDetails
	 * AgreedAmount1Choice.AgreedAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement5#AgreedAmount
	 * CollateralMovement5.AgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement7#AgreedAmount
	 * CollateralMovement7.AgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement10#AgreedAmount
	 * CollateralMovement10.AgreedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the amount which is undisputed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AgreedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralMovement1.AgreedAmount, com.tools20022.repository.msg.CollateralMovement4.AgreedAmount, com.tools20022.repository.msg.Amount1.AgreedAmount,
					com.tools20022.repository.choice.AgreedAmount1Choice.AgreedAmountDetails, com.tools20022.repository.msg.CollateralMovement5.AgreedAmount, com.tools20022.repository.msg.CollateralMovement7.AgreedAmount,
					com.tools20022.repository.msg.CollateralMovement10.AgreedAmount);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmount";
			definition = "Specifies the amount which is undisputed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the variation margin and
	 * optionally the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#VariationMarginDispute
	 * DisputeNotification1.VariationMarginDispute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult2#VariationMarginResult
	 * MarginCallResult2.VariationMarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#MarginCallAmount
	 * MarginCallResult2Choice.MarginCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#VariationMarginAmount
	 * AgreedAmount1.VariationMarginAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#VariationMargin
	 * Margin2.VariationMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin3#VariationMargin
	 * Margin3.VariationMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariationMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisputeNotification1.VariationMarginDispute, com.tools20022.repository.msg.MarginCallResult2.VariationMarginResult,
					com.tools20022.repository.choice.MarginCallResult2Choice.MarginCallAmount, com.tools20022.repository.msg.AgreedAmount1.VariationMarginAmount, com.tools20022.repository.msg.Margin2.VariationMargin,
					com.tools20022.repository.msg.Margin3.VariationMargin);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#SegregatedIndependentAmountDispute
	 * DisputeNotification1.SegregatedIndependentAmountDispute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice#SegregatedIndependentAmountDisputeDetails
	 * DisputeNotification1Choice.SegregatedIndependentAmountDisputeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult2#SegregatedIndependentAmount
	 * MarginCallResult2.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#SegregatedIndependentAmount
	 * MarginCallResult1Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#SegregatedIndependentAmount
	 * MarginCallResult2Choice.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#SegregatedIndependentAmount
	 * AgreedAmount1.SegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice#SegregatedIndependentAmount
	 * AgreedAmount1Choice.SegregatedIndependentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisputeNotification1.SegregatedIndependentAmountDispute, com.tools20022.repository.choice.DisputeNotification1Choice.SegregatedIndependentAmountDisputeDetails,
					com.tools20022.repository.msg.MarginCallResult2.SegregatedIndependentAmount, com.tools20022.repository.choice.MarginCallResult1Choice.SegregatedIndependentAmount,
					com.tools20022.repository.choice.MarginCallResult2Choice.SegregatedIndependentAmount, com.tools20022.repository.msg.AgreedAmount1.SegregatedIndependentAmount,
					com.tools20022.repository.choice.AgreedAmount1Choice.SegregatedIndependentAmount);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Portion of the participation to the default fund that clearing member
	 * must provide. It is the sum of the individual contributions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#RelatedMarginCall
	 * DefaultFundContribution.RelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#VariationMarginRelatedCall
	 * ExpectedCollateralType.VariationMarginRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedVariationMarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedVariationMarginType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedVariationMarginType";
			definition = "Specifies the expected collateral type and direction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ExpectedCollateralType.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#SegregatedIndependentAmountRelatedCall
	 * ExpectedCollateralType.SegregatedIndependentAmountRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedSegregatedIndependentAmountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedSegregatedIndependentAmountType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSegregatedIndependentAmountType";
			definition = "Specifies the expected collateral type and direction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ExpectedCollateralType.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net unrealised profit or loss on the value of the netted, gross and
	 * failing positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#TotalMarkToMarket
	 * VariationMargin2.TotalMarkToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#TotalMarkToMarket
	 * VariationMargin3.TotalMarkToMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net unrealised profit or loss on the value of the netted, gross and failing positions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalMarkToMarket = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.TotalMarkToMarket, com.tools20022.repository.msg.VariationMargin3.TotalMarkToMarket);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated at the participant portfolio level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#MarkToMarketNetted
	 * VariationMargin2.MarkToMarketNetted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#MarkToMarketNetted
	 * VariationMargin3.MarkToMarketNetted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketNetted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrealised net loss calculated at the participant portfolio level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketNetted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.MarkToMarketNetted, com.tools20022.repository.msg.VariationMargin3.MarkToMarketNetted);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated in that market/boundary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#MarkToMarketGross
	 * VariationMargin2.MarkToMarketGross}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#MarkToMarketGross
	 * VariationMargin3.MarkToMarketGross}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrealised net loss calculated in that market/boundary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketGross = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.MarkToMarketGross, com.tools20022.repository.msg.VariationMargin3.MarkToMarketGross);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of the unrealised loss without taking profit into consideration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#MarkToMarketFails
	 * VariationMargin2.MarkToMarketFails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#MarkToMarketFails
	 * VariationMargin3.MarkToMarketFails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketFails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the unrealised loss without taking profit into consideration."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketFails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.MarkToMarketFails, com.tools20022.repository.msg.VariationMargin3.MarkToMarketFails);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Haircut applied to the absolute value of the participants net positions.
	 * Calculation depends on a participants credit rating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#FailsHaircut
	 * VariationMargin2.FailsHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#FailsHaircut
	 * VariationMargin3.FailsHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailsHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FailsHaircut = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin2.FailsHaircut, com.tools20022.repository.msg.VariationMargin3.FailsHaircut);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#InitialMargin
	 * Margin2.InitialMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin3#InitialMargin
	 * Margin3.InitialMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitialMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.InitialMargin, com.tools20022.repository.msg.Margin3.InitialMargin);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount added to the requirement amount. Its value is at the discretion of
	 * the central clearing counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#IncreaseCoverage
	 * Margin2.IncreaseCoverage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncreaseCoverage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.IncreaseCoverage);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverage";
			definition = "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Used to indicate whether the reported margin account is collateralised or
	 * not. If not collateralised, the account is configured for informational
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginReport2#CollateralisedMarginAccountIndicator
	 * MarginReport2.CollateralisedMarginAccountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMarginAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralisedMarginAccountIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginReport2.CollateralisedMarginAccountIndicator);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Movements resulting from the margin call calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#MarginCall
	 * CollateralMovement.MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#MarginResult
	 * Margin2.MarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#MarginResult
	 * MarginCalculation1.MarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#MarginResult
	 * MarginCalculation2.MarginResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movements resulting from the margin call calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.MarginResult, com.tools20022.repository.msg.MarginCalculation1.MarginResult, com.tools20022.repository.msg.MarginCalculation2.MarginResult);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Movements resulting from the margin call calculation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#MarginCall
	 * CollateralManagement.MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of the securities related to the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
	 * Security.RelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the securities related to the margin call."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Description of the securities related to the margin call.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the underlying product of the margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarginProductCode
	 * MarginProductCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginProductType1Choice#Code
	 * MarginProductType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginProductType1Choice#Proprietary
	 * MarginProductType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginReport2#MarginProduct
	 * MarginReport2.MarginProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product of the margin."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginProductType1Choice.Code, com.tools20022.repository.choice.MarginProductType1Choice.Proprietary,
					com.tools20022.repository.msg.MarginReport2.MarginProduct);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies the underlying product of the margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarginProductCode.mmObject();
		}
	};
	/**
	 * Specifies the type of margin, for example, initial margin, variation
	 * margin, initial deposit or coupon margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.MarginType1Choice#Code
	 * MarginType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginType1Choice#Proprietary
	 * MarginType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin4#Type Margin4.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginType1Choice.Code, com.tools20022.repository.choice.MarginType1Choice.Proprietary, com.tools20022.repository.msg.Margin4.Type);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginType";
			definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarginTypeCode.mmObject();
		}
	};
	/**
	 * Total margin requirement (expressed in the reporting currency) that must
	 * be provided. This is the total requirement calculated to cover the
	 * initial margin and the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#TotalMarginAmount
	 * Margin2.TotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#TotalMarginAmount
	 * MarginCalculation1.TotalMarginAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin4#Amount
	 * Margin4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#TotalMarginAmount
	 * MarginCalculation2.TotalMarginAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalMarginAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.TotalMarginAmount, com.tools20022.repository.msg.MarginCalculation1.TotalMarginAmount, com.tools20022.repository.msg.Margin4.Amount,
					com.tools20022.repository.msg.MarginCalculation2.TotalMarginAmount);
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginCall";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.CollateralMovement.MarginCall,
						com.tools20022.repository.entity.CollateralManagement.MarginCall, com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall,
						com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginCallResult1Choice.MarginCallResultDetails, com.tools20022.repository.msg.MarginCallResult1.MarginCallResult,
						com.tools20022.repository.choice.MarginCallResult2Choice.MarginCallResultDetails, com.tools20022.repository.msg.MarginCallResult3.MarginCallResult, com.tools20022.repository.msg.SummaryAmounts1.CollateralRequired,
						com.tools20022.repository.msg.MarginReport1.MarginProduct, com.tools20022.repository.msg.MarginReport1.MarginDetails, com.tools20022.repository.msg.Margin3.OtherMargin,
						com.tools20022.repository.msg.MarginCalculation2.MarginTypeAmount, com.tools20022.repository.msg.MarginReport2.MarginCalculationSummary, com.tools20022.repository.msg.MarginReport2.MarginCalculation,
						com.tools20022.repository.msg.MarginCall2.MarginCallResult, com.tools20022.repository.msg.MarginCall2.MarginDetailDueToA, com.tools20022.repository.msg.MarginCall2.MarginDetailDueToB);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.MarginCallValuationDate, com.tools20022.repository.entity.MarginCall.AgreedAmount, com.tools20022.repository.entity.MarginCall.VariationMargin,
						com.tools20022.repository.entity.MarginCall.SegregatedIndependentAmount, com.tools20022.repository.entity.MarginCall.DefaultFundContribution, com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType,
						com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType, com.tools20022.repository.entity.MarginCall.TotalMarkToMarket, com.tools20022.repository.entity.MarginCall.MarkToMarketNetted,
						com.tools20022.repository.entity.MarginCall.MarkToMarketGross, com.tools20022.repository.entity.MarginCall.MarkToMarketFails, com.tools20022.repository.entity.MarginCall.FailsHaircut,
						com.tools20022.repository.entity.MarginCall.InitialMargin, com.tools20022.repository.entity.MarginCall.IncreaseCoverage, com.tools20022.repository.entity.MarginCall.CollateralisedMarginAccountIndicator,
						com.tools20022.repository.entity.MarginCall.CollateralMovement, com.tools20022.repository.entity.MarginCall.RelatedManagementProcess, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.MarginCall.MarginProduct, com.tools20022.repository.entity.MarginCall.MarginType, com.tools20022.repository.entity.MarginCall.TotalMarginAmount);
				derivationComponent_lazy = () -> Arrays.asList(MarginCall1.mmObject(), MarginCallResult2.mmObject(), MarginCallResult1Choice.mmObject(), MarginCallResult1.mmObject(), MarginCallResult2Choice.mmObject(),
						MarginCallResult3.mmObject(), Amount1.mmObject(), AgreedAmount1.mmObject(), AgreedAmount1Choice.mmObject(), MarginProductType1Choice.mmObject(), VariationMargin2.mmObject(), Margin2.mmObject(),
						MarginReport1.mmObject(), MarginCalculation1.mmObject(), VariationMargin3.mmObject(), MarginType1Choice.mmObject(), Margin4.mmObject(), Margin3.mmObject(), MarginCalculation2.mmObject(), MarginReport2.mmObject(),
						MarginCall2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}