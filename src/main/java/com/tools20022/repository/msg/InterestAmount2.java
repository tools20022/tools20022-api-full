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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.InterestPaymentResponseV03;
import com.tools20022.repository.area.colr.InterestPaymentResponseV04;
import com.tools20022.repository.choice.CollateralPurpose1Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.InterestRate1Choice;
import com.tools20022.repository.codeset.CalculationMethod1Code;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.codeset.InterestComputationMethod2Code;
import com.tools20022.repository.codeset.InterestMethod1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the elements related to the interest amount calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAccruedInterestAmount
 * InterestAmount2.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2#mmValueDate
 * InterestAmount2.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestMethod
 * InterestAmount2.mmInterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestPeriod
 * InterestAmount2.mmInterestPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestRate
 * InterestAmount2.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmDayCountBasis
 * InterestAmount2.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAppliedWithholdingTax
 * InterestAmount2.mmAppliedWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationMethod
 * InterestAmount2.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationFrequency
 * InterestAmount2.mmCalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCollateralPurpose
 * InterestAmount2.mmCollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmOpeningCollateralBalance
 * InterestAmount2.mmOpeningCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmClosingCollateralBalance
 * InterestAmount2.mmClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmStandardSettlementInstructions
 * InterestAmount2.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAdditionalInformation
 * InterestAmount2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestDueToA
 * InterestPaymentResponseV03.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestDueToB
 * InterestPaymentResponseV03.mmInterestDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestDueToA
 * InterestPaymentResponseV04.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestDueToB
 * InterestPaymentResponseV04.mmInterestDueToB}</li>
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
 * "InterestAmount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the elements related to the interest amount calculation."</li>
 * </ul>
 */
public class InterestAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * Amount of money representing an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing an interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of money representing an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DateAndDateTimeChoice valueDate;
	/**
	 * Agreed date for the interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
	 * Interest.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreed date for the interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmPaymentDate;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Agreed date for the interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected InterestMethod1Code interestMethod;
	/**
	 * Indicates whether the interest will be settled in cash or rolled in the
	 * existing collateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestMethod1Code
	 * InterestMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestMethod
	 * InterestCalculation.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestMethod;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "IntrstMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethod1Code.mmObject();
		}
	};
	protected DatePeriodDetails interestPeriod;
	/**
	 * Period for which the calculation has been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the calculation has been performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period for which the calculation has been performed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected InterestRate1Choice interestRate;
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice
	 * InterestRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestRate1Choice.mmObject();
		}
	};
	protected InterestComputationMethod2Code dayCountBasis;
	/**
	 * Specifies the computation method of (accrued) interest of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDayCountBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	protected YesNoIndicator appliedWithholdingTax;
	/**
	 * Amount or percentage of a cash distribution that will be withheld by a
	 * tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldWhldgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAppliedWithholdingTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestTax;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "ApldWhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedWithholdingTax";
			definition = "Amount or percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CalculationMethod1Code calculationMethod;
	/**
	 * Specifies whether the interest is simple or compounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethod1Code
	 * CalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
	 * InterestCalculation.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the interest is simple or compounded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CalculationMethod1Code.mmObject();
		}
	};
	protected Frequency1Code calculationFrequency;
	/**
	 * Specifies the periodicity of the calculation of the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationFrequency
	 * InterestCalculation.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity of the calculation of the interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationFrequency;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "ClctnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	protected CollateralPurpose1Choice collateralPurpose;
	/**
	 * Specifies whether the collateral has been posted against the variation
	 * margin, the segregated independent amount or to cover any other risk
	 * defined with a proprietary code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice
	 * CollateralPurpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPurpose
	 * Collateral.mmCollateralPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral has been posted against the variation margin, the segregated independent amount or to cover any other risk defined with a proprietary code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralPurpose;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "CollPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin, the segregated independent amount or to cover any other risk defined with a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CollateralPurpose1Choice.mmObject();
		}
	};
	protected CollateralBalance1 openingCollateralBalance;
	/**
	 * Provides details about the opening collateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralBalance1
	 * CollateralBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngCollBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the opening collateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningCollateralBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralBalance;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "OpngCollBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningCollateralBalance";
			definition = "Provides details about the opening collateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralBalance1.mmObject();
		}
	};
	protected CollateralBalance1 closingCollateralBalance;
	/**
	 * Provides details about the closing collateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralBalance1
	 * CollateralBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgCollBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the closing collateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingCollateralBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralBalance;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "ClsgCollBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingCollateralBalance";
			definition = "Provides details about the closing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralBalance1.mmObject();
		}
	};
	protected Max140Text standardSettlementInstructions;
	/**
	 * Identifies the standard settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardSettlementInstructions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "StdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max210Text additionalInformation;
	/**
	 * Additionnal information related to interest request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additionnal information related to interest request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestAmount2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additionnal information related to interest request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InterestAmount2.mmAccruedInterestAmount, InterestAmount2.mmValueDate, InterestAmount2.mmInterestMethod, InterestAmount2.mmInterestPeriod, InterestAmount2.mmInterestRate,
						InterestAmount2.mmDayCountBasis, InterestAmount2.mmAppliedWithholdingTax, InterestAmount2.mmCalculationMethod, InterestAmount2.mmCalculationFrequency, InterestAmount2.mmCollateralPurpose,
						InterestAmount2.mmOpeningCollateralBalance, InterestAmount2.mmClosingCollateralBalance, InterestAmount2.mmStandardSettlementInstructions, InterestAmount2.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InterestPaymentResponseV03.mmInterestDueToA, InterestPaymentResponseV03.mmInterestDueToB, InterestPaymentResponseV04.mmInterestDueToA,
						InterestPaymentResponseV04.mmInterestDueToB);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestAmount2";
				definition = "Provides the elements related to the interest amount calculation.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public DateAndDateTimeChoice getValueDate() {
		return valueDate;
	}

	public void setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
	}

	public InterestMethod1Code getInterestMethod() {
		return interestMethod;
	}

	public void setInterestMethod(InterestMethod1Code interestMethod) {
		this.interestMethod = interestMethod;
	}

	public DatePeriodDetails getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(com.tools20022.repository.msg.DatePeriodDetails interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public InterestRate1Choice getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(InterestRate1Choice interestRate) {
		this.interestRate = interestRate;
	}

	public InterestComputationMethod2Code getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethod2Code dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	public YesNoIndicator getAppliedWithholdingTax() {
		return appliedWithholdingTax;
	}

	public void setAppliedWithholdingTax(YesNoIndicator appliedWithholdingTax) {
		this.appliedWithholdingTax = appliedWithholdingTax;
	}

	public CalculationMethod1Code getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(CalculationMethod1Code calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public Frequency1Code getCalculationFrequency() {
		return calculationFrequency;
	}

	public void setCalculationFrequency(Frequency1Code calculationFrequency) {
		this.calculationFrequency = calculationFrequency;
	}

	public CollateralPurpose1Choice getCollateralPurpose() {
		return collateralPurpose;
	}

	public void setCollateralPurpose(CollateralPurpose1Choice collateralPurpose) {
		this.collateralPurpose = collateralPurpose;
	}

	public CollateralBalance1 getOpeningCollateralBalance() {
		return openingCollateralBalance;
	}

	public void setOpeningCollateralBalance(com.tools20022.repository.msg.CollateralBalance1 openingCollateralBalance) {
		this.openingCollateralBalance = openingCollateralBalance;
	}

	public CollateralBalance1 getClosingCollateralBalance() {
		return closingCollateralBalance;
	}

	public void setClosingCollateralBalance(com.tools20022.repository.msg.CollateralBalance1 closingCollateralBalance) {
		this.closingCollateralBalance = closingCollateralBalance;
	}

	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public void setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
	}

	public Max210Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max210Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}