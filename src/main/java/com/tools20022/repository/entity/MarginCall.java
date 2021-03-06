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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MarginProductCode;
import com.tools20022.repository.codeset.MarginTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
 * MarginCall.mmMarginCallValuationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmAgreedAmount
 * MarginCall.mmAgreedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
 * MarginCall.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
 * MarginCall.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmDefaultFundContribution
 * MarginCall.mmDefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
 * MarginCall.mmExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarkToMarket
 * MarginCall.mmTotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketNetted
 * MarginCall.mmMarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketGross
 * MarginCall.mmMarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketFails
 * MarginCall.mmMarkToMarketFails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmFailsHaircut
 * MarginCall.mmFailsHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
 * MarginCall.mmInitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmIncreaseCoverage
 * MarginCall.mmIncreaseCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralisedMarginAccountIndicator
 * MarginCall.mmCollateralisedMarginAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
 * MarginCall.mmCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmRelatedManagementProcess
 * MarginCall.mmRelatedManagementProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
 * MarginCall.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmMarginProduct
 * MarginCall.mmMarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmMarginType
 * MarginCall.mmMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarginAmount
 * MarginCall.mmTotalMarginAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
 * Security.mmRelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmMarginCall
 * CollateralMovement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmMarginCall
 * CollateralManagement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmRelatedMarginCall
 * DefaultFundContribution.mmRelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#mmMarginCallResultDetails
 * MarginCallResult1Choice.mmMarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult1#mmMarginCallResult
 * MarginCallResult1.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmMarginCallResultDetails
 * MarginCallResult2Choice.mmMarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult3#mmMarginCallResult
 * MarginCallResult3.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmCollateralRequired
 * SummaryAmounts1.mmCollateralRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#mmMarginProduct
 * MarginReport1.mmMarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#mmMarginDetails
 * MarginReport1.mmMarginDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmOtherMargin
 * Margin3.mmOtherMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMarginTypeAmount
 * MarginCalculation2.mmMarginTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginCalculationSummary
 * MarginReport2.mmMarginCalculationSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginCalculation
 * MarginReport2.mmMarginCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginCallResult
 * MarginCall2.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginDetailDueToA
 * MarginCall2.mmMarginDetailDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmMarginDetailDueToB
 * MarginCall2.mmMarginDetailDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1#mmInitialMarginExposure
 * InitialMarginRequirement1.mmInitialMarginExposure}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.EndOfDayRequirement2
 * EndOfDayRequirement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EndOfDayRequirement1
 * EndOfDayRequirement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InitialMarginExposure1
 * InitialMarginExposure1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InitialMarginRequirement1
 * InitialMarginRequirement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
 * AvailableFinancialResourcesAmount1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCall"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class MarginCall {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime marginCallValuationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation1#mmValuationDate
	 * Obligation1.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmValuationDate
	 * Obligation2.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Summary1#mmValuationDateTime
	 * Summary1.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation3#mmValuationDate
	 * Obligation3.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmValuationDate
	 * Obligation4.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmValuationDate
	 * Obligation5.mmValuationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Close of business date that initiating party is valuing the margin call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, ISODateTime> mmMarginCallValuationDate = new MMBusinessAttribute<MarginCall, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Obligation1.mmValuationDate, Obligation2.mmValuationDate, Summary1.mmValuationDateTime, Obligation3.mmValuationDate, Obligation4.mmValuationDate, Obligation5.mmValuationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginCallValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(MarginCall obj) {
			return obj.getMarginCallValuationDate();
		}

		@Override
		public void setValue(MarginCall obj, ISODateTime value) {
			obj.setMarginCallValuationDate(value);
		}
	};
	protected CurrencyAndAmount agreedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement1#mmAgreedAmount
	 * CollateralMovement1.mmAgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement4#mmAgreedAmount
	 * CollateralMovement4.mmAgreedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amount1#mmAgreedAmount
	 * Amount1.mmAgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice#mmAgreedAmountDetails
	 * AgreedAmount1Choice.mmAgreedAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement5#mmAgreedAmount
	 * CollateralMovement5.mmAgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement7#mmAgreedAmount
	 * CollateralMovement7.mmAgreedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement10#mmAgreedAmount
	 * CollateralMovement10.mmAgreedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the amount which is undisputed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmAgreedAmount = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralMovement1.mmAgreedAmount, CollateralMovement4.mmAgreedAmount, Amount1.mmAgreedAmount, AgreedAmount1Choice.mmAgreedAmountDetails, CollateralMovement5.mmAgreedAmount,
					CollateralMovement7.mmAgreedAmount, CollateralMovement10.mmAgreedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgreedAmount";
			definition = "Specifies the amount which is undisputed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getAgreedAmount();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setAgreedAmount(value);
		}
	};
	protected CurrencyAndAmount variationMargin;
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
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#mmVariationMarginDispute
	 * DisputeNotification1.mmVariationMarginDispute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult2#mmVariationMarginResult
	 * MarginCallResult2.mmVariationMarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmMarginCallAmount
	 * MarginCallResult2Choice.mmMarginCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#mmVariationMarginAmount
	 * AgreedAmount1.mmVariationMarginAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmVariationMargin
	 * Margin2.mmVariationMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmVariationMargin
	 * Margin3.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2#mmVariationMarginRequirements
	 * EndOfDayRequirement2.mmVariationMarginRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1#mmVariationMarginRequirement
	 * EndOfDayRequirement1.mmVariationMarginRequirement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmVariationMargin = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(DisputeNotification1.mmVariationMarginDispute, MarginCallResult2.mmVariationMarginResult, MarginCallResult2Choice.mmMarginCallAmount, AgreedAmount1.mmVariationMarginAmount,
					Margin2.mmVariationMargin, Margin3.mmVariationMargin, EndOfDayRequirement2.mmVariationMarginRequirements, EndOfDayRequirement1.mmVariationMarginRequirement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationMargin";
			definition = "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getVariationMargin();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setVariationMargin(value);
		}
	};
	protected CurrencyAndAmount segregatedIndependentAmount;
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
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#mmSegregatedIndependentAmountDispute
	 * DisputeNotification1.mmSegregatedIndependentAmountDispute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice#mmSegregatedIndependentAmountDisputeDetails
	 * DisputeNotification1Choice.mmSegregatedIndependentAmountDisputeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult2#mmSegregatedIndependentAmount
	 * MarginCallResult2.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#mmSegregatedIndependentAmount
	 * MarginCallResult1Choice.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmSegregatedIndependentAmount
	 * MarginCallResult2Choice.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#mmSegregatedIndependentAmount
	 * AgreedAmount1.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice#mmSegregatedIndependentAmount
	 * AgreedAmount1Choice.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the segregated independent amount only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmSegregatedIndependentAmount = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(DisputeNotification1.mmSegregatedIndependentAmountDispute, DisputeNotification1Choice.mmSegregatedIndependentAmountDisputeDetails, MarginCallResult2.mmSegregatedIndependentAmount,
					MarginCallResult1Choice.mmSegregatedIndependentAmount, MarginCallResult2Choice.mmSegregatedIndependentAmount, AgreedAmount1.mmSegregatedIndependentAmount, AgreedAmount1Choice.mmSegregatedIndependentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getSegregatedIndependentAmount();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setSegregatedIndependentAmount(value);
		}
	};
	protected DefaultFundContribution defaultFundContribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmRelatedMarginCall
	 * DefaultFundContribution.mmRelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, DefaultFundContribution> mmDefaultFundContribution = new MMBusinessAssociationEnd<MarginCall, DefaultFundContribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DefaultFundContribution.mmRelatedMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DefaultFundContribution.mmObject();
		}

		@Override
		public DefaultFundContribution getValue(MarginCall obj) {
			return obj.getDefaultFundContribution();
		}

		@Override
		public void setValue(MarginCall obj, DefaultFundContribution value) {
			obj.setDefaultFundContribution(value);
		}
	};
	protected ExpectedCollateralType expectedVariationMarginType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
	 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedVariationMarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, ExpectedCollateralType> mmExpectedVariationMarginType = new MMBusinessAssociationEnd<MarginCall, ExpectedCollateralType>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedVariationMarginType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ExpectedCollateralType.mmVariationMarginRelatedCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExpectedCollateralType.mmObject();
		}

		@Override
		public ExpectedCollateralType getValue(MarginCall obj) {
			return obj.getExpectedVariationMarginType();
		}

		@Override
		public void setValue(MarginCall obj, ExpectedCollateralType value) {
			obj.setExpectedVariationMarginType(value);
		}
	};
	protected ExpectedCollateralType expectedSegregatedIndependentAmountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
	 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedSegregatedIndependentAmountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, ExpectedCollateralType> mmExpectedSegregatedIndependentAmountType = new MMBusinessAssociationEnd<MarginCall, ExpectedCollateralType>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSegregatedIndependentAmountType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExpectedCollateralType.mmObject();
		}

		@Override
		public ExpectedCollateralType getValue(MarginCall obj) {
			return obj.getExpectedSegregatedIndependentAmountType();
		}

		@Override
		public void setValue(MarginCall obj, ExpectedCollateralType value) {
			obj.setExpectedSegregatedIndependentAmountType(value);
		}
	};
	protected CurrencyAndAmount totalMarkToMarket;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmTotalMarkToMarket
	 * VariationMargin2.mmTotalMarkToMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmTotalMarkToMarket
	 * VariationMargin3.mmTotalMarkToMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net unrealised profit or loss on the value of the netted, gross and failing positions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmTotalMarkToMarket = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin2.mmTotalMarkToMarket, VariationMargin3.mmTotalMarkToMarket);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getTotalMarkToMarket();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setTotalMarkToMarket(value);
		}
	};
	protected CurrencyAndAmount markToMarketNetted;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketNetted
	 * VariationMargin2.mmMarkToMarketNetted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketNetted
	 * VariationMargin3.mmMarkToMarketNetted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketNetted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrealised net loss calculated at the participant portfolio level."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmMarkToMarketNetted = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin2.mmMarkToMarketNetted, VariationMargin3.mmMarkToMarketNetted);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getMarkToMarketNetted();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setMarkToMarketNetted(value);
		}
	};
	protected CurrencyAndAmount markToMarketGross;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketGross
	 * VariationMargin2.mmMarkToMarketGross}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketGross
	 * VariationMargin3.mmMarkToMarketGross}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrealised net loss calculated in that market/boundary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmMarkToMarketGross = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin2.mmMarkToMarketGross, VariationMargin3.mmMarkToMarketGross);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getMarkToMarketGross();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setMarkToMarketGross(value);
		}
	};
	protected CurrencyAndAmount markToMarketFails;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmMarkToMarketFails
	 * VariationMargin2.mmMarkToMarketFails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmMarkToMarketFails
	 * VariationMargin3.mmMarkToMarketFails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketFails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the unrealised loss without taking profit into consideration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmMarkToMarketFails = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin2.mmMarkToMarketFails, VariationMargin3.mmMarkToMarketFails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getMarkToMarketFails();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setMarkToMarketFails(value);
		}
	};
	protected CurrencyAndAmount failsHaircut;
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin2#mmFailsHaircut
	 * VariationMargin2.mmFailsHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin3#mmFailsHaircut
	 * VariationMargin3.mmFailsHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailsHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmFailsHaircut = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin2.mmFailsHaircut, VariationMargin3.mmFailsHaircut);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getFailsHaircut();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setFailsHaircut(value);
		}
	};
	protected CurrencyAndAmount initialMargin;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmInitialMargin
	 * Margin2.mmInitialMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmInitialMargin
	 * Margin3.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement2#mmInitialMarginRequirements
	 * EndOfDayRequirement2.mmInitialMarginRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1#mmInitialMarginRequirement
	 * EndOfDayRequirement1.mmInitialMarginRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1#mmAmount
	 * InitialMarginExposure1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmTotalInitialMargin
	 * AvailableFinancialResourcesAmount1.mmTotalInitialMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmInitialMargin = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Margin2.mmInitialMargin, Margin3.mmInitialMargin, EndOfDayRequirement2.mmInitialMarginRequirements, EndOfDayRequirement1.mmInitialMarginRequirement, InitialMarginExposure1.mmAmount,
					AvailableFinancialResourcesAmount1.mmTotalInitialMargin);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getInitialMargin();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setInitialMargin(value);
		}
	};
	protected CurrencyAndAmount increaseCoverage;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmIncreaseCoverage
	 * Margin2.mmIncreaseCoverage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmIncreaseCoverage = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Margin2.mmIncreaseCoverage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncreaseCoverage";
			definition = "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getIncreaseCoverage();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setIncreaseCoverage(value);
		}
	};
	protected YesNoIndicator collateralisedMarginAccountIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmCollateralisedMarginAccountIndicator
	 * MarginReport2.mmCollateralisedMarginAccountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMarginAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, YesNoIndicator> mmCollateralisedMarginAccountIndicator = new MMBusinessAttribute<MarginCall, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(MarginReport2.mmCollateralisedMarginAccountIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(MarginCall obj) {
			return obj.getCollateralisedMarginAccountIndicator();
		}

		@Override
		public void setValue(MarginCall obj, YesNoIndicator value) {
			obj.setCollateralisedMarginAccountIndicator(value);
		}
	};
	protected List<CollateralMovement> collateralMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmMarginCall
	 * CollateralMovement.mmMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmMarginResult
	 * Margin2.mmMarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmMarginResult
	 * MarginCalculation1.mmMarginResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMarginResult
	 * MarginCalculation2.mmMarginResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movements resulting from the margin call calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, List<CollateralMovement>> mmCollateralMovement = new MMBusinessAssociationEnd<MarginCall, List<CollateralMovement>>() {
		{
			derivation_lazy = () -> Arrays.asList(Margin2.mmMarginResult, MarginCalculation1.mmMarginResult, MarginCalculation2.mmMarginResult);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Movements resulting from the margin call calculation.";
			minOccurs = 0;
			opposite_lazy = () -> CollateralMovement.mmMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralMovement.mmObject();
		}

		@Override
		public List<CollateralMovement> getValue(MarginCall obj) {
			return obj.getCollateralMovement();
		}

		@Override
		public void setValue(MarginCall obj, List<CollateralMovement> value) {
			obj.setCollateralMovement(value);
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmMarginCall
	 * CollateralManagement.mmMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, CollateralManagement> mmRelatedManagementProcess = new MMBusinessAssociationEnd<MarginCall, CollateralManagement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralManagement.mmMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public CollateralManagement getValue(MarginCall obj) {
			return obj.getRelatedManagementProcess();
		}

		@Override
		public void setValue(MarginCall obj, CollateralManagement value) {
			obj.setRelatedManagementProcess(value);
		}
	};
	protected List<Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
	 * Security.mmRelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the securities related to the margin call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MarginCall, List<Security>> mmSecurity = new MMBusinessAssociationEnd<MarginCall, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Description of the securities related to the margin call.";
			minOccurs = 0;
			opposite_lazy = () -> Security.mmRelatedMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(MarginCall obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MarginCall obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected MarginProductCode marginProduct;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.MarginProductType1Choice#mmCode
	 * MarginProductType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginProductType1Choice#mmProprietary
	 * MarginProductType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginProduct
	 * MarginReport2.mmMarginProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product of the margin."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, MarginProductCode> mmMarginProduct = new MMBusinessAttribute<MarginCall, MarginProductCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MarginProductType1Choice.mmCode, MarginProductType1Choice.mmProprietary, MarginReport2.mmMarginProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginProduct";
			definition = "Specifies the underlying product of the margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginProductCode.mmObject();
		}

		@Override
		public MarginProductCode getValue(MarginCall obj) {
			return obj.getMarginProduct();
		}

		@Override
		public void setValue(MarginCall obj, MarginProductCode value) {
			obj.setMarginProduct(value);
		}
	};
	protected MarginTypeCode marginType;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginType1Choice#mmCode
	 * MarginType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarginType1Choice#mmProprietary
	 * MarginType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin4#mmType
	 * Margin4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1#mmType
	 * InitialMarginExposure1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, MarginTypeCode> mmMarginType = new MMBusinessAttribute<MarginCall, MarginTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MarginType1Choice.mmCode, MarginType1Choice.mmProprietary, Margin4.mmType, InitialMarginExposure1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginTypeCode.mmObject();
		}

		@Override
		public MarginTypeCode getValue(MarginCall obj) {
			return obj.getMarginType();
		}

		@Override
		public void setValue(MarginCall obj, MarginTypeCode value) {
			obj.setMarginType(value);
		}
	};
	protected CurrencyAndAmount totalMarginAmount;
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
	 * {@linkplain com.tools20022.repository.msg.Margin2#mmTotalMarginAmount
	 * Margin2.mmTotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmTotalMarginAmount
	 * MarginCalculation1.mmTotalMarginAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Margin4#mmAmount
	 * Margin4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmTotalMarginAmount
	 * MarginCalculation2.mmTotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InitialMarginRequirement1#mmCredit
	 * InitialMarginRequirement1.mmCredit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MarginCall, CurrencyAndAmount> mmTotalMarginAmount = new MMBusinessAttribute<MarginCall, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Margin2.mmTotalMarginAmount, MarginCalculation1.mmTotalMarginAmount, Margin4.mmAmount, MarginCalculation2.mmTotalMarginAmount, InitialMarginRequirement1.mmCredit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(MarginCall obj) {
			return obj.getTotalMarginAmount();
		}

		@Override
		public void setValue(MarginCall obj, CurrencyAndAmount value) {
			obj.setTotalMarginAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCall";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmRelatedMarginCall, CollateralMovement.mmMarginCall, CollateralManagement.mmMarginCall, DefaultFundContribution.mmRelatedMarginCall,
						ExpectedCollateralType.mmVariationMarginRelatedCall, ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall);
				derivationElement_lazy = () -> Arrays.asList(MarginCallResult1Choice.mmMarginCallResultDetails, MarginCallResult1.mmMarginCallResult, MarginCallResult2Choice.mmMarginCallResultDetails, MarginCallResult3.mmMarginCallResult,
						SummaryAmounts1.mmCollateralRequired, MarginReport1.mmMarginProduct, MarginReport1.mmMarginDetails, Margin3.mmOtherMargin, MarginCalculation2.mmMarginTypeAmount, MarginReport2.mmMarginCalculationSummary,
						MarginReport2.mmMarginCalculation, MarginCall2.mmMarginCallResult, MarginCall2.mmMarginDetailDueToA, MarginCall2.mmMarginDetailDueToB, InitialMarginRequirement1.mmInitialMarginExposure);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.mmMarginCallValuationDate, com.tools20022.repository.entity.MarginCall.mmAgreedAmount,
						com.tools20022.repository.entity.MarginCall.mmVariationMargin, com.tools20022.repository.entity.MarginCall.mmSegregatedIndependentAmount, com.tools20022.repository.entity.MarginCall.mmDefaultFundContribution,
						com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType,
						com.tools20022.repository.entity.MarginCall.mmTotalMarkToMarket, com.tools20022.repository.entity.MarginCall.mmMarkToMarketNetted, com.tools20022.repository.entity.MarginCall.mmMarkToMarketGross,
						com.tools20022.repository.entity.MarginCall.mmMarkToMarketFails, com.tools20022.repository.entity.MarginCall.mmFailsHaircut, com.tools20022.repository.entity.MarginCall.mmInitialMargin,
						com.tools20022.repository.entity.MarginCall.mmIncreaseCoverage, com.tools20022.repository.entity.MarginCall.mmCollateralisedMarginAccountIndicator, com.tools20022.repository.entity.MarginCall.mmCollateralMovement,
						com.tools20022.repository.entity.MarginCall.mmRelatedManagementProcess, com.tools20022.repository.entity.MarginCall.mmSecurity, com.tools20022.repository.entity.MarginCall.mmMarginProduct,
						com.tools20022.repository.entity.MarginCall.mmMarginType, com.tools20022.repository.entity.MarginCall.mmTotalMarginAmount);
				derivationComponent_lazy = () -> Arrays.asList(MarginCall1.mmObject(), MarginCallResult2.mmObject(), MarginCallResult1Choice.mmObject(), MarginCallResult1.mmObject(), MarginCallResult2Choice.mmObject(),
						MarginCallResult3.mmObject(), Amount1.mmObject(), AgreedAmount1.mmObject(), AgreedAmount1Choice.mmObject(), MarginProductType1Choice.mmObject(), VariationMargin2.mmObject(), Margin2.mmObject(),
						MarginReport1.mmObject(), MarginCalculation1.mmObject(), VariationMargin3.mmObject(), MarginType1Choice.mmObject(), Margin4.mmObject(), Margin3.mmObject(), MarginCalculation2.mmObject(), MarginReport2.mmObject(),
						MarginCall2.mmObject(), EndOfDayRequirement2.mmObject(), EndOfDayRequirement1.mmObject(), InitialMarginExposure1.mmObject(), InitialMarginRequirement1.mmObject(), AvailableFinancialResourcesAmount1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCall.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getMarginCallValuationDate() {
		return marginCallValuationDate;
	}

	public MarginCall setMarginCallValuationDate(ISODateTime marginCallValuationDate) {
		this.marginCallValuationDate = Objects.requireNonNull(marginCallValuationDate);
		return this;
	}

	public CurrencyAndAmount getAgreedAmount() {
		return agreedAmount;
	}

	public MarginCall setAgreedAmount(CurrencyAndAmount agreedAmount) {
		this.agreedAmount = Objects.requireNonNull(agreedAmount);
		return this;
	}

	public CurrencyAndAmount getVariationMargin() {
		return variationMargin;
	}

	public MarginCall setVariationMargin(CurrencyAndAmount variationMargin) {
		this.variationMargin = Objects.requireNonNull(variationMargin);
		return this;
	}

	public CurrencyAndAmount getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public MarginCall setSegregatedIndependentAmount(CurrencyAndAmount segregatedIndependentAmount) {
		this.segregatedIndependentAmount = Objects.requireNonNull(segregatedIndependentAmount);
		return this;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return defaultFundContribution;
	}

	public MarginCall setDefaultFundContribution(DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = Objects.requireNonNull(defaultFundContribution);
		return this;
	}

	public ExpectedCollateralType getExpectedVariationMarginType() {
		return expectedVariationMarginType;
	}

	public MarginCall setExpectedVariationMarginType(ExpectedCollateralType expectedVariationMarginType) {
		this.expectedVariationMarginType = Objects.requireNonNull(expectedVariationMarginType);
		return this;
	}

	public ExpectedCollateralType getExpectedSegregatedIndependentAmountType() {
		return expectedSegregatedIndependentAmountType;
	}

	public MarginCall setExpectedSegregatedIndependentAmountType(ExpectedCollateralType expectedSegregatedIndependentAmountType) {
		this.expectedSegregatedIndependentAmountType = Objects.requireNonNull(expectedSegregatedIndependentAmountType);
		return this;
	}

	public CurrencyAndAmount getTotalMarkToMarket() {
		return totalMarkToMarket;
	}

	public MarginCall setTotalMarkToMarket(CurrencyAndAmount totalMarkToMarket) {
		this.totalMarkToMarket = Objects.requireNonNull(totalMarkToMarket);
		return this;
	}

	public CurrencyAndAmount getMarkToMarketNetted() {
		return markToMarketNetted;
	}

	public MarginCall setMarkToMarketNetted(CurrencyAndAmount markToMarketNetted) {
		this.markToMarketNetted = Objects.requireNonNull(markToMarketNetted);
		return this;
	}

	public CurrencyAndAmount getMarkToMarketGross() {
		return markToMarketGross;
	}

	public MarginCall setMarkToMarketGross(CurrencyAndAmount markToMarketGross) {
		this.markToMarketGross = Objects.requireNonNull(markToMarketGross);
		return this;
	}

	public CurrencyAndAmount getMarkToMarketFails() {
		return markToMarketFails;
	}

	public MarginCall setMarkToMarketFails(CurrencyAndAmount markToMarketFails) {
		this.markToMarketFails = Objects.requireNonNull(markToMarketFails);
		return this;
	}

	public CurrencyAndAmount getFailsHaircut() {
		return failsHaircut;
	}

	public MarginCall setFailsHaircut(CurrencyAndAmount failsHaircut) {
		this.failsHaircut = Objects.requireNonNull(failsHaircut);
		return this;
	}

	public CurrencyAndAmount getInitialMargin() {
		return initialMargin;
	}

	public MarginCall setInitialMargin(CurrencyAndAmount initialMargin) {
		this.initialMargin = Objects.requireNonNull(initialMargin);
		return this;
	}

	public CurrencyAndAmount getIncreaseCoverage() {
		return increaseCoverage;
	}

	public MarginCall setIncreaseCoverage(CurrencyAndAmount increaseCoverage) {
		this.increaseCoverage = Objects.requireNonNull(increaseCoverage);
		return this;
	}

	public YesNoIndicator getCollateralisedMarginAccountIndicator() {
		return collateralisedMarginAccountIndicator;
	}

	public MarginCall setCollateralisedMarginAccountIndicator(YesNoIndicator collateralisedMarginAccountIndicator) {
		this.collateralisedMarginAccountIndicator = Objects.requireNonNull(collateralisedMarginAccountIndicator);
		return this;
	}

	public List<CollateralMovement> getCollateralMovement() {
		return collateralMovement == null ? collateralMovement = new ArrayList<>() : collateralMovement;
	}

	public MarginCall setCollateralMovement(List<CollateralMovement> collateralMovement) {
		this.collateralMovement = Objects.requireNonNull(collateralMovement);
		return this;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public MarginCall setRelatedManagementProcess(CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = Objects.requireNonNull(relatedManagementProcess);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MarginCall setSecurity(List<Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public MarginProductCode getMarginProduct() {
		return marginProduct;
	}

	public MarginCall setMarginProduct(MarginProductCode marginProduct) {
		this.marginProduct = Objects.requireNonNull(marginProduct);
		return this;
	}

	public MarginTypeCode getMarginType() {
		return marginType;
	}

	public MarginCall setMarginType(MarginTypeCode marginType) {
		this.marginType = Objects.requireNonNull(marginType);
		return this;
	}

	public CurrencyAndAmount getTotalMarginAmount() {
		return totalMarginAmount;
	}

	public MarginCall setTotalMarginAmount(CurrencyAndAmount totalMarginAmount) {
		this.totalMarginAmount = Objects.requireNonNull(totalMarginAmount);
		return this;
	}
}