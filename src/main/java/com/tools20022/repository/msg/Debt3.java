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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.InterestType3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instruments evidencing moneys owed by the issuer to the holder on
 * terms as specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPaymentCurrency
 * Debt3.mmPaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmFaceAmount
 * Debt3.mmFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPaymentFrequency
 * Debt3.mmPaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInterestFixingDate
 * Debt3.mmInterestFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmDatedDate
 * Debt3.mmDatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmFirstPaymentDate
 * Debt3.mmFirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMaturityDate
 * Debt3.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextCouponDate
 * Debt3.mmNextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPutableDate
 * Debt3.mmPutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextCallableDate
 * Debt3.mmNextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextFactorDate
 * Debt3.mmNextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmExpirationDate
 * Debt3.mmExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmPaymentDirectionIndicator
 * Debt3.mmPaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInterestRate
 * Debt3.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextInterestRate
 * Debt3.mmNextInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmOddCouponIndicator
 * Debt3.mmOddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCallableIndicator
 * Debt3.mmCallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCPProgram
 * Debt3.mmCPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCPRegistrationType
 * Debt3.mmCPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInterestAccrualDate
 * Debt3.mmInterestAccrualDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPutableIndicator
 * Debt3.mmPutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPreFundedIndicator
 * Debt3.mmPreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmEscrowedIndicator
 * Debt3.mmEscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPerpetualIndicator
 * Debt3.mmPerpetualIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmSubordinatedIndicator
 * Debt3.mmSubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmExtendibleIndicator
 * Debt3.mmExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmExtendiblePeriod
 * Debt3.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmVariableRateIndicator
 * Debt3.mmVariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmOverAllotmentAmount
 * Debt3.mmOverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmOverAllotmentRate
 * Debt3.mmOverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmAmortisableIndicator
 * Debt3.mmAmortisableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmInterestCalculationMethod
 * Debt3.mmInterestCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCapitalisedInterest
 * Debt3.mmCapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmActualDenominationAmount
 * Debt3.mmActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCurrentFactor
 * Debt3.mmCurrentFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextFactor
 * Debt3.mmNextFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPreviousFactor
 * Debt3.mmPreviousFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPieces Debt3.mmPieces}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsMaximum
 * Debt3.mmPoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerMillion
 * Debt3.mmPoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerLot
 * Debt3.mmPoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerTrade
 * Debt3.mmPoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmConstantPrePaymentPenaltyIndicator
 * Debt3.mmConstantPrePaymentPenaltyIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmLotIdentification
 * Debt3.mmLotIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmConstantPrePaymentYield
 * Debt3.mmConstantPrePaymentYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageCoupon
 * Debt3.mmWeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageLife
 * Debt3.mmWeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageLoan
 * Debt3.mmWeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageMaturity
 * Debt3.mmWeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInsuredIndicator
 * Debt3.mmInsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmBankQualifiedIndicator
 * Debt3.mmBankQualifiedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmYieldCalculation
 * Debt3.mmYieldCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInterestType
 * Debt3.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmInstrumentStructureType
 * Debt3.mmInstrumentStructureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmGlobalType
 * Debt3.mmGlobalType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmPotentialEuroSystemEligibility
 * Debt3.mmPotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmGeographics
 * Debt3.mmGeographics}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmYieldRange
 * Debt3.mmYieldRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCouponRange
 * Debt3.mmCouponRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPurpose
 * Debt3.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt3#mmAlternativeMinimumTaxIndicator
 * Debt3.mmAlternativeMinimumTaxIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmAutoReinvestment
 * Debt3.mmAutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmHaircut
 * Debt3.mmHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmTransactionConditions
 * Debt3.mmTransactionConditions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmLookBack
 * Debt3.mmLookBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMaximumSubstitution
 * Debt3.mmMaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMinimumIncrement
 * Debt3.mmMinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMinimumQuantity
 * Debt3.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmProduction
 * Debt3.mmProduction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmRestrictedIndicator
 * Debt3.mmRestrictedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPriceFrequency
 * Debt3.mmPriceFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmSector Debt3.mmSector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmSubstitutionFrequency
 * Debt3.mmSubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmSubstitutionLeft
 * Debt3.mmSubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmWholePoolIndicator
 * Debt3.mmWholePoolIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPriceSource
 * Debt3.mmPriceSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPriceRange
 * Debt3.mmPriceRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule#forDebt3
 * ConstraintPutableDateAndPutableIndicatorRule.forDebt3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNextCallableDateAndCallableIndicatorRule#forDebt3
 * ConstraintNextCallableDateAndCallableIndicatorRule.forDebt3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Debt3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Debt2 Debt2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Debt3", propOrder = {"paymentCurrency", "faceAmount", "paymentFrequency", "interestFixingDate", "datedDate", "firstPaymentDate", "maturityDate", "nextCouponDate", "putableDate", "nextCallableDate", "nextFactorDate",
		"expirationDate", "paymentDirectionIndicator", "interestRate", "nextInterestRate", "oddCouponIndicator", "callableIndicator", "cPProgram", "cPRegistrationType", "interestAccrualDate", "putableIndicator", "preFundedIndicator",
		"escrowedIndicator", "perpetualIndicator", "subordinatedIndicator", "extendibleIndicator", "extendiblePeriod", "variableRateIndicator", "overAllotmentAmount", "overAllotmentRate", "amortisableIndicator",
		"interestCalculationMethod", "capitalisedInterest", "actualDenominationAmount", "currentFactor", "nextFactor", "previousFactor", "pieces", "poolsMaximum", "poolsPerMillion", "poolsPerLot", "poolsPerTrade",
		"constantPrePaymentPenaltyIndicator", "lotIdentification", "constantPrePaymentYield", "weightedAverageCoupon", "weightedAverageLife", "weightedAverageLoan", "weightedAverageMaturity", "insuredIndicator", "bankQualifiedIndicator",
		"yieldCalculation", "interestType", "instrumentStructureType", "globalType", "potentialEuroSystemEligibility", "geographics", "yieldRange", "couponRange", "purpose", "alternativeMinimumTaxIndicator", "autoReinvestment", "haircut",
		"transactionConditions", "lookBack", "maximumSubstitution", "minimumIncrement", "minimumQuantity", "production", "restrictedIndicator", "priceFrequency", "sector", "substitutionFrequency", "substitutionLeft", "wholePoolIndicator",
		"priceSource", "priceRange"})
public class Debt3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCcy")
	protected ActiveCurrencyCode paymentCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentCurrency
	 * Debt.mmPaymentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPaymentCurrency
	 * Debt2.mmPaymentCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			previousVersion_lazy = () -> Debt2.mmPaymentCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "FaceAmt")
	protected ActiveCurrencyAndAmount faceAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaceAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit value of a debt security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmFaceAmount
	 * Debt2.mmFaceAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaceAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Unit value of a debt security.";
			previousVersion_lazy = () -> Debt2.mmFaceAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency35Choice paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency35Choice
	 * Frequency35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmPaymentFrequency
	 * Dividend.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of an interest payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPaymentFrequency
	 * Debt2.mmPaymentFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			previousVersion_lazy = () -> Debt2.mmPaymentFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency35Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrstFxgDt")
	protected ISODateTime interestFixingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the rate determination is made, also called determination date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestFixingDate
	 * Debt2.mmInterestFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "IntrstFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestFixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date.";
			previousVersion_lazy = () -> Debt2.mmInterestFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "DtdDt")
	protected ISODateTime datedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
	 * Debt.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 873</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which a security begins to accrue interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmDatedDate
	 * Debt2.mmDatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "873"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			previousVersion_lazy = () -> Debt2.mmDatedDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "FrstPmtDt")
	protected ISODateTime firstPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFirstPaymentDate
	 * Debt.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the first interest payment is due to holders of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmFirstPaymentDate
	 * Debt2.mmFirstPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			previousVersion_lazy = () -> Debt2.mmFirstPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODateTime maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 200, FIXSynonym: 541, FIXSynonym: 1079</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmMaturityDate
	 * Debt2.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "200"), new FIXSynonym(this, "541"), new FIXSynonym(this, "1079"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			previousVersion_lazy = () -> Debt2.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "NxtCpnDt")
	protected ISODateTime nextCouponDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmDate
	 * CouponAttached.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 224</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmNextCouponDate
	 * Debt2.mmNextCouponDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCouponDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "NxtCpnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "224"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Date of the coupon attached to the physical security.";
			previousVersion_lazy = () -> Debt2.mmNextCouponDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PutblDt")
	protected ISODateTime putableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
	 * Debt.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the holder has the right to ask for redemption of the security prior to final maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPutableDate
	 * Debt2.mmPutableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			previousVersion_lazy = () -> Debt2.mmPutableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "NxtCllblDt")
	protected ISODateTime nextCallableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
	 * Debt.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCllblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next date/time at which the issuer has the right to pay the securitiy prior to maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmNextCallableDate
	 * Debt2.mmNextCallableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			previousVersion_lazy = () -> Debt2.mmNextCallableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "NxtFctrDt")
	protected ISODateTime nextFactorDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextFactorDate
	 * Debt.mmNextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date that the current factor will be changed to a new factor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmNextFactorDate
	 * Debt2.mmNextFactorDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactorDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextFactorDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "NxtFctrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			previousVersion_lazy = () -> Debt2.mmNextFactorDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "XprtnDt")
	protected ISODateTime expirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an interest bearing security becomes due and assets are to be repaid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmExpirationDate
	 * Debt2.mmExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpirationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "XprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpirationDate";
			definition = "Date/time at which an interest bearing security becomes due and assets are to be repaid.";
			previousVersion_lazy = () -> Debt2.mmExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PmtDrctnInd")
	protected PaymentDirectionIndicator paymentDirectionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PaymentDirectionIndicator
	 * PaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentDirectionIndicator
	 * Debt.mmPaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDrctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPaymentDirectionIndicator
	 * Debt2.mmPaymentDirectionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDirectionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PmtDrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			previousVersion_lazy = () -> Debt2.mmPaymentDirectionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentDirectionIndicator.mmObject();
		}
	};
	@XmlElement(name = "IntrstRate")
	protected PercentageRate interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 223</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestRate
	 * Debt2.mmInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "223"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			previousVersion_lazy = () -> Debt2.mmInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "NxtIntrstRate")
	protected PercentageRate nextInterestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interest rate applicable to the next interest payment period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmNextInterestRate
	 * Debt2.mmNextInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Specifies the interest rate applicable to the next interest payment period.";
			previousVersion_lazy = () -> Debt2.mmNextInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "OddCpnInd")
	protected YesNoIndicator oddCouponIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOddCouponIndicator
	 * Debt.mmOddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OddCpnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddCouponIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmOddCouponIndicator
	 * Debt2.mmOddCouponIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOddCouponIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOddCouponIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "OddCpnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			previousVersion_lazy = () -> Debt2.mmOddCouponIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CllblInd")
	protected YesNoIndicator callableIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCallableIndicator
	 * Debt.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CllblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCallableIndicator
	 * Debt2.mmCallableIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			previousVersion_lazy = () -> Debt2.mmCallableIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CPPrgm")
	protected Number cPProgram;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCPProgram
	 * Debt.mmCPProgram}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CPPrgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 875</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The program under which a commercial paper is issued. The values that are most used are:\r\n0 = N/A\r\n1 = 3(a)3\r\n2 = 4(2)\r\n3 = 3(a)4\r\n4 = 3(c)7\r\n5 = 144A\r\n6 = 3(a)2\r\n99 = Other."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCPProgram
	 * Debt2.mmCPProgram}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPProgram = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPProgram;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CPPrgm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "875"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\r\n0 = N/A\r\n1 = 3(a)3\r\n2 = 4(2)\r\n3 = 3(a)4\r\n4 = 3(c)7\r\n5 = 144A\r\n6 = 3(a)2\r\n99 = Other.";
			previousVersion_lazy = () -> Debt2.mmCPProgram;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "CPRegnTp")
	protected Max350Text cPRegistrationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCPRegistrationType
	 * Debt.mmCPRegistrationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CPRegnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 876</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPRegistrationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration type of a commercial paper issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCPRegistrationType
	 * Debt2.mmCPRegistrationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPRegistrationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPRegistrationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CPRegnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "876"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			previousVersion_lazy = () -> Debt2.mmCPRegistrationType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "IntrstAcrlDt")
	protected ISODateTime interestAccrualDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestAccrualDate
	 * InterestCalculation.mmInterestAccrualDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 874</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccrualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestAccrualDate
	 * Debt2.mmInterestAccrualDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAccrualDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestAccrualDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "874"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			previousVersion_lazy = () -> Debt2.mmInterestAccrualDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PutblInd")
	protected YesNoIndicator putableIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableIndicator
	 * Debt.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPutableIndicator
	 * Debt2.mmPutableIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			previousVersion_lazy = () -> Debt2.mmPutableIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PreFnddInd")
	protected YesNoIndicator preFundedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPreFundedIndicator
	 * Debt.mmPreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreFnddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFundedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPreFundedIndicator
	 * Debt2.mmPreFundedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreFundedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPreFundedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PreFnddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			previousVersion_lazy = () -> Debt2.mmPreFundedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "EscrwdInd")
	protected YesNoIndicator escrowedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmEscrowedIndicator
	 * Debt.mmEscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EscrwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmEscrowedIndicator
	 * Debt2.mmEscrowedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEscrowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmEscrowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "EscrwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			previousVersion_lazy = () -> Debt2.mmEscrowedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PerptlInd")
	protected YesNoIndicator perpetualIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPerpetualIndicator
	 * Debt.mmPerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerptlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerpetualIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the security has no maturity date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPerpetualIndicator
	 * Debt2.mmPerpetualIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPerpetualIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPerpetualIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PerptlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			previousVersion_lazy = () -> Debt2.mmPerpetualIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SubrdntdInd")
	protected YesNoIndicator subordinatedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubordinatedIndicator
	 * Debt.mmSubordinatedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubrdntdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a subordinated security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSubordinatedIndicator
	 * Debt2.mmSubordinatedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubordinatedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubordinatedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "SubrdntdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			previousVersion_lazy = () -> Debt2.mmSubordinatedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "XtndblInd")
	protected YesNoIndicator extendibleIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmExtendibleIndicator
	 * Debt.mmExtendibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmExtendibleIndicator
	 * Debt2.mmExtendibleIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "XtndblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			previousVersion_lazy = () -> Debt2.mmExtendibleIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "XtndblPrd")
	protected DateTimePeriodChoice extendiblePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
	 * Debt.mmExtendiblePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndblPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a date might be extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmExtendiblePeriod
	 * Debt2.mmExtendiblePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendiblePeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendiblePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "XtndblPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			previousVersion_lazy = () -> Debt2.mmExtendiblePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	@XmlElement(name = "VarblRateInd")
	protected YesNoIndicator variableRateIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmVariableRateIndicator
	 * Debt.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest rate of an interest bearing instrument is reset periodically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmVariableRateIndicator
	 * Debt2.mmVariableRateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariableRateIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			previousVersion_lazy = () -> Debt2.mmVariableRateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "OverAlltmtAmt")
	protected ActiveCurrencyAndAmount overAllotmentAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentAmount
	 * Debt.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverAlltmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentAmount
	 * Debt2.mmOverAllotmentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			previousVersion_lazy = () -> Debt2.mmOverAllotmentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OverAlltmtRate")
	protected PercentageRate overAllotmentRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentRate
	 * Debt.mmOverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverAlltmtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentRate
	 * Debt2.mmOverAllotmentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			previousVersion_lazy = () -> Debt2.mmOverAllotmentRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "AmtsblInd")
	protected YesNoIndicator amortisableIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAmortisableIndicator
	 * Debt.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether repayment is made via regular principal and interest payments over time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmAmortisableIndicator
	 * Debt2.mmAmortisableIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmortisableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "AmtsblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			previousVersion_lazy = () -> Debt2.mmAmortisableIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "IntrstClctnMtd")
	protected Max70Text interestCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
	 * InterestCalculation.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation method used to calculate interest and/or yield for a bond, for example, street convention."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestCalculationMethod
	 * Debt2.mmInterestCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestCalculationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "IntrstClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCalculationMethod";
			definition = "Calculation method used to calculate interest and/or yield for a bond, for example, street convention.";
			previousVersion_lazy = () -> Debt2.mmInterestCalculationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "CptlsdIntrst")
	protected DistributionPolicy2Choice capitalisedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DistributionPolicy2Choice
	 * DistributionPolicy2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCapitalisedInterest
	 * Debt.mmCapitalisedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlsdIntrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalisedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCapitalisedInterest
	 * Debt2.mmCapitalisedInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalisedInterest = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCapitalisedInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CptlsdIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			previousVersion_lazy = () -> Debt2.mmCapitalisedInterest;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DistributionPolicy2Choice.mmObject();
		}
	};
	@XmlElement(name = "ActlDnmtnAmt")
	protected List<ActiveCurrencyAndAmount> actualDenominationAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmActualDenominationAmount
	 * Debt.mmActualDenominationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlDnmtnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDenominationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value per security unit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmActualDenominationAmount
	 * Debt2.mmActualDenominationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualDenominationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmActualDenominationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "ActlDnmtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			previousVersion_lazy = () -> Debt2.mmActualDenominationAmount;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CurFctr")
	protected PercentageRate currentFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCurrentFactor
	 * Debt2.mmCurrentFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities).";
			previousVersion_lazy = () -> Debt2.mmCurrentFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "NxtFctr")
	protected PercentageRate nextFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmNextFactor
	 * Debt2.mmNextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities).";
			previousVersion_lazy = () -> Debt2.mmNextFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "PrvsFctr")
	protected PercentageRate previousFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the previous factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPreviousFactor
	 * Debt2.mmPreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Identifies the previous factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities).";
			previousVersion_lazy = () -> Debt2.mmPreviousFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "Pcs")
	protected DecimalNumber pieces;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPieces Debt.mmPieces}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pieces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of pieces composing a pool of financial assets."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPieces Debt2.mmPieces}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPieces = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPieces;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Pcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			previousVersion_lazy = () -> Debt2.mmPieces;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PlsMax")
	protected DecimalNumber poolsMaximum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolsMaximum
	 * Debt.mmPoolsMaximum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlsMax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsMaximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of assets by which a security is backed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPoolsMaximum
	 * Debt2.mmPoolsMaximum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsMaximum = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsMaximum;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PlsMax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			previousVersion_lazy = () -> Debt2.mmPoolsMaximum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PlsPerMln")
	protected DecimalNumber poolsPerMillion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerMillion
	 * Debt.mmPoolsPerMillion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlsPerMln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerMillion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerMillion
	 * Debt2.mmPoolsPerMillion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerMillion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerMillion;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PlsPerMln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			previousVersion_lazy = () -> Debt2.mmPoolsPerMillion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PlsPerLot")
	protected DecimalNumber poolsPerLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerLot
	 * Debt.mmPoolsPerLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlsPerLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerLot
	 * Debt2.mmPoolsPerLot}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerLot = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerLot;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PlsPerLot";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			previousVersion_lazy = () -> Debt2.mmPoolsPerLot;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PlsPerTrad")
	protected DecimalNumber poolsPerTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerTrade
	 * Debt.mmPoolsPerTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlsPerTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerTrade
	 * Debt2.mmPoolsPerTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PlsPerTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			previousVersion_lazy = () -> Debt2.mmPoolsPerTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "CstPrePmtPnltyInd")
	protected YesNoIndicator constantPrePaymentPenaltyIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentPenalty
	 * Debt.mmConstantPrePaymentPenalty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstPrePmtPnltyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentPenaltyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentPenaltyIndicator
	 * Debt2.mmConstantPrePaymentPenaltyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConstantPrePaymentPenaltyIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentPenalty;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtPnltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentPenaltyIndicator";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			previousVersion_lazy = () -> Debt2.mmConstantPrePaymentPenaltyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "LotId")
	protected Max35Text lotIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotIdentifier
	 * LotBreakdown.mmLotIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the lot constituting an asset backed or mortgage backed security issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmLotIdentification
	 * Debt2.mmLotIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "LotId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotIdentification";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			previousVersion_lazy = () -> Debt2.mmLotIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CstPrePmtYld")
	protected PercentageRate constantPrePaymentYield;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentYield
	 * Debt.mmConstantPrePaymentYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstPrePmtYld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a yield of the current outstanding loan balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentYield
	 * Debt2.mmConstantPrePaymentYield}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConstantPrePaymentYield = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentYield;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			previousVersion_lazy = () -> Debt2.mmConstantPrePaymentYield;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "WghtdAvrgCpn")
	protected PercentageRate weightedAverageCoupon;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageCoupon
	 * Debt.mmWeightedAverageCoupon}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WghtdAvrgCpn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageCoupon
	 * Debt2.mmWeightedAverageCoupon}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageCoupon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageCoupon;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgCpn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			previousVersion_lazy = () -> Debt2.mmWeightedAverageCoupon;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "WghtdAvrgLife")
	protected DecimalNumber weightedAverageLife;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLife
	 * Debt.mmWeightedAverageLife}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WghtdAvrgLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average life of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLife
	 * Debt2.mmWeightedAverageLife}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageLife = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLife;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLife";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			previousVersion_lazy = () -> Debt2.mmWeightedAverageLife;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "WghtdAvrgLn")
	protected DecimalNumber weightedAverageLoan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLoan
	 * Debt.mmWeightedAverageLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WghtdAvrgLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average loan of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLoan
	 * Debt2.mmWeightedAverageLoan}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageLoan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLoan;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			previousVersion_lazy = () -> Debt2.mmWeightedAverageLoan;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "WghtdAvrgMtrty")
	protected DecimalNumber weightedAverageMaturity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageMaturity
	 * Debt.mmWeightedAverageMaturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WghtdAvrgMtrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average maturity of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageMaturity
	 * Debt2.mmWeightedAverageMaturity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageMaturity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageMaturity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgMtrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			previousVersion_lazy = () -> Debt2.mmWeightedAverageMaturity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "InsrdInd")
	protected YesNoIndicator insuredIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmInsuredIndicator
	 * Debt.mmInsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruments is backed by any kind of asset or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInsuredIndicator
	 * Debt2.mmInsuredIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmInsuredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "InsrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			previousVersion_lazy = () -> Debt2.mmInsuredIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "BkQlfdInd")
	protected YesNoIndicator bankQualifiedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmBankQualified
	 * Debt.mmBankQualified}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkQlfdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankQualifiedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is bank qualified (usually applies to loan products)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmBankQualifiedIndicator
	 * Debt2.mmBankQualifiedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankQualifiedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmBankQualified;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "BkQlfdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankQualifiedIndicator";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			previousVersion_lazy = () -> Debt2.mmBankQualifiedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "YldClctn")
	protected List<com.tools20022.repository.msg.YieldCalculation5> yieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation5
	 * YieldCalculation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of return on an investment, based on the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmYieldCalculation
	 * Debt2.mmYieldCalculation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmYieldCalculation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "YldClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			previousVersion_lazy = () -> Debt2.mmYieldCalculation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation5.mmObject();
		}
	};
	@XmlElement(name = "IntrstTp")
	protected InterestType3Code interestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestType3Code
	 * InterestType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestType
	 * InterestCalculation.mmInterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether interest rate is fixed, variable or other."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestType
	 * Debt2.mmInterestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "IntrstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Indicates whether interest rate is fixed, variable or other.";
			previousVersion_lazy = () -> Debt2.mmInterestType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestType3Code.mmObject();
		}
	};
	@XmlElement(name = "InstrmStrTp")
	protected InstrumentSubStructureType2Choice instrumentStructureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType2Choice
	 * InstrumentSubStructureType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialInstrumentSubStructure
	 * Asset.mmFinancialInstrumentSubStructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmStrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentStructureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of deal for structured finance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInstrumentStructureType
	 * Debt2.mmInstrumentStructureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstrumentStructureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmFinancialInstrumentSubStructure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "InstrmStrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentStructureType";
			definition = "Indicates the type of deal for structured finance.";
			previousVersion_lazy = () -> Debt2.mmInstrumentStructureType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InstrumentSubStructureType2Choice.mmObject();
		}
	};
	@XmlElement(name = "GblTp")
	protected GlobalNote2Choice globalType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GlobalNote2Choice
	 * GlobalNote2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmIssuance
	 * Asset.mmIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmGlobalType
	 * Debt2.mmGlobalType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGlobalType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmIssuance;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "GblTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			previousVersion_lazy = () -> Debt2.mmGlobalType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GlobalNote2Choice.mmObject();
		}
	};
	@XmlElement(name = "PotntlEuroSysElgblty")
	protected YesNoIndicator potentialEuroSystemEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PotntlEuroSysElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentialEuroSystemEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to indicate the security is intended to be held in a manner that could allow the Eurosystem eligibility."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPotentialEuroSystemEligibility
	 * Debt2.mmPotentialEuroSystemEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPotentialEuroSystemEligibility = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PotntlEuroSysElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Flag to indicate the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			previousVersion_lazy = () -> Debt2.mmPotentialEuroSystemEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Geogcs")
	protected Max35Text geographics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmGeographics
	 * Debt.mmGeographics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Geogcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 233 value GEOG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmGeographics
	 * Debt2.mmGeographics}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGeographics = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmGeographics;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Geogcs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "233 value GEOG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			previousVersion_lazy = () -> Debt2.mmGeographics;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "YldRg")
	protected AmountOrPercentageRange yieldRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
	 * YieldCalculation.mmYieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of allowed yield."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmYieldRange
	 * Debt2.mmYieldRange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYieldRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmYieldRange;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "YldRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			previousVersion_lazy = () -> Debt2.mmYieldRange;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	@XmlElement(name = "CpnRg")
	protected AmountOrPercentageRange couponRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConvertibleIndicator
	 * Debt.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a range of coupon numbers attached to its related financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCouponRange
	 * Debt2.mmCouponRange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConvertibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "CpnRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponRange";
			definition = "Identification of a range of coupon numbers attached to its related financial instrument.";
			previousVersion_lazy = () -> Debt2.mmCouponRange;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
	 * Issuance.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPurpose
	 * Debt2.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			previousVersion_lazy = () -> Debt2.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "AltrntvMinTaxInd")
	protected YesNoIndicator alternativeMinimumTaxIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAlternativeMinimumTax
	 * Debt.mmAlternativeMinimumTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrntvMinTaxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTaxIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmAlternativeMinimumTaxIndicator
	 * Debt2.mmAlternativeMinimumTaxIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternativeMinimumTaxIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAlternativeMinimumTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "AltrntvMinTaxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeMinimumTaxIndicator";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			previousVersion_lazy = () -> Debt2.mmAlternativeMinimumTaxIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "AutoRinvstmt")
	protected PercentageRate autoReinvestment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAutoReinvestment
	 * Debt.mmAutoReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutoRinvstmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate is &lt;rate&gt; or better."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmAutoReinvestment
	 * Debt2.mmAutoReinvestment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAutoReinvestment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAutoReinvestment;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "AutoRinvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate is <rate> or better.";
			previousVersion_lazy = () -> Debt2.mmAutoReinvestment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "Hrcut")
	protected PercentageRate haircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmHaircut
	 * Debt2.mmHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			previousVersion_lazy = () -> Debt2.mmHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "TxConds")
	protected TradeTransactionCondition7Choice transactionConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition7Choice
	 * TradeTransactionCondition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmTransactionConditions
	 * Debt2.mmTransactionConditions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "TxConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditions";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			previousVersion_lazy = () -> Debt2.mmTransactionConditions;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition7Choice.mmObject();
		}
	};
	@XmlElement(name = "LookBck")
	protected Number lookBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmLookBack
	 * Debt.mmLookBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LookBck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TTCO//GTDL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. For example some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmLookBack
	 * Debt2.mmLookBack}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLookBack = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmLookBack;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "LookBck";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TTCO//GTDL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. For example some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			previousVersion_lazy = () -> Debt2.mmLookBack;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MaxSbstitn")
	protected Number maximumSubstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMaximumSubstitution
	 * Debt.mmMaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxSbstitn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of time the collateral can be substitute."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmMaximumSubstitution
	 * Debt2.mmMaximumSubstitution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSubstitution = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMaximumSubstitution;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "MaxSbstitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			previousVersion_lazy = () -> Debt2.mmMaximumSubstitution;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MinIncrmt")
	protected FinancialInstrumentQuantity1Choice minimumIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
	 * Debt.mmMinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable increments of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmMinimumIncrement
	 * Debt2.mmMinimumIncrement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMinimumIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "MinIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			previousVersion_lazy = () -> Debt2.mmMinimumIncrement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "MinQty")
	protected FinancialInstrumentQuantity1Choice minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
	 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmMinimumQuantity
	 * Debt2.mmMinimumQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmMinimumTradedNominalQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			previousVersion_lazy = () -> Debt2.mmMinimumQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "Pdctn")
	protected Max35Text production;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Production"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmProduction
	 * Debt2.mmProduction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProduction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Pdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			previousVersion_lazy = () -> Debt2.mmProduction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RstrctdInd")
	protected YesNoIndicator restrictedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestrictedIndicator
	 * Security.mmRestrictedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmRestrictedIndicator
	 * Debt2.mmRestrictedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRestrictedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "RstrctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			previousVersion_lazy = () -> Debt2.mmRestrictedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricFrqcy")
	protected Frequency35Choice priceFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency35Choice
	 * Frequency35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPriceFrequency
	 * Debt.mmPriceFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPriceFrequency
	 * Debt2.mmPriceFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPriceFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PricFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			previousVersion_lazy = () -> Debt2.mmPriceFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency35Choice.mmObject();
		}
	};
	@XmlElement(name = "Sctr")
	protected Max35Text sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSector
	 * Security.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the market sector the security is classified as for example pharmaceuticals, automobile, housing, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSector Debt2.mmSector}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSector;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as for example pharmaceuticals, automobile, housing, etc.";
			previousVersion_lazy = () -> Debt2.mmSector;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SbstitnFrqcy")
	protected Frequency35Choice substitutionFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency35Choice
	 * Frequency35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionFrequency
	 * Debt.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of times collateral can be substituted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionFrequency
	 * Debt2.mmSubstitutionFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "SbstitnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			previousVersion_lazy = () -> Debt2.mmSubstitutionFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency35Choice.mmObject();
		}
	};
	@XmlElement(name = "SbstitnLft")
	protected Number substitutionLeft;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionLeft
	 * Debt.mmSubstitutionLeft}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnLft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionLeft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of remaining times the collateral can be substitute."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionLeft
	 * Debt2.mmSubstitutionLeft}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionLeft = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionLeft;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "SbstitnLft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			previousVersion_lazy = () -> Debt2.mmSubstitutionLeft;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "WhlPoolInd")
	protected YesNoIndicator wholePoolIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlPoolInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholePoolIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion when looking to buy a mortgaged backed security that either is [yes] or is not [no] an entire pool."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWholePoolIndicator
	 * Debt2.mmWholePoolIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWholePoolIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "WhlPoolInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholePoolIndicator";
			definition = "Indicates a search criterion when looking to buy a mortgaged backed security that either is [yes] or is not [no] an entire pool.";
			previousVersion_lazy = () -> Debt2.mmWholePoolIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricSrc")
	protected Max35Text priceSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec.)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPriceSource
	 * Debt2.mmPriceSource}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PricSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceSource";
			definition = "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec.).";
			previousVersion_lazy = () -> Debt2.mmPriceSource;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PricRg")
	protected AmountOrPercentageRange priceRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt3
	 * Debt3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond within a particular price range."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPriceRange
	 * Debt2.mmPriceRange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceRange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt3.mmObject();
			isDerived = false;
			xmlTag = "PricRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceRange";
			definition = "Indicates a search criterion used when looking to buy a bond within a particular price range.";
			previousVersion_lazy = () -> Debt2.mmPriceRange;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt3.mmPaymentCurrency, com.tools20022.repository.msg.Debt3.mmFaceAmount, com.tools20022.repository.msg.Debt3.mmPaymentFrequency,
						com.tools20022.repository.msg.Debt3.mmInterestFixingDate, com.tools20022.repository.msg.Debt3.mmDatedDate, com.tools20022.repository.msg.Debt3.mmFirstPaymentDate, com.tools20022.repository.msg.Debt3.mmMaturityDate,
						com.tools20022.repository.msg.Debt3.mmNextCouponDate, com.tools20022.repository.msg.Debt3.mmPutableDate, com.tools20022.repository.msg.Debt3.mmNextCallableDate, com.tools20022.repository.msg.Debt3.mmNextFactorDate,
						com.tools20022.repository.msg.Debt3.mmExpirationDate, com.tools20022.repository.msg.Debt3.mmPaymentDirectionIndicator, com.tools20022.repository.msg.Debt3.mmInterestRate,
						com.tools20022.repository.msg.Debt3.mmNextInterestRate, com.tools20022.repository.msg.Debt3.mmOddCouponIndicator, com.tools20022.repository.msg.Debt3.mmCallableIndicator,
						com.tools20022.repository.msg.Debt3.mmCPProgram, com.tools20022.repository.msg.Debt3.mmCPRegistrationType, com.tools20022.repository.msg.Debt3.mmInterestAccrualDate,
						com.tools20022.repository.msg.Debt3.mmPutableIndicator, com.tools20022.repository.msg.Debt3.mmPreFundedIndicator, com.tools20022.repository.msg.Debt3.mmEscrowedIndicator,
						com.tools20022.repository.msg.Debt3.mmPerpetualIndicator, com.tools20022.repository.msg.Debt3.mmSubordinatedIndicator, com.tools20022.repository.msg.Debt3.mmExtendibleIndicator,
						com.tools20022.repository.msg.Debt3.mmExtendiblePeriod, com.tools20022.repository.msg.Debt3.mmVariableRateIndicator, com.tools20022.repository.msg.Debt3.mmOverAllotmentAmount,
						com.tools20022.repository.msg.Debt3.mmOverAllotmentRate, com.tools20022.repository.msg.Debt3.mmAmortisableIndicator, com.tools20022.repository.msg.Debt3.mmInterestCalculationMethod,
						com.tools20022.repository.msg.Debt3.mmCapitalisedInterest, com.tools20022.repository.msg.Debt3.mmActualDenominationAmount, com.tools20022.repository.msg.Debt3.mmCurrentFactor,
						com.tools20022.repository.msg.Debt3.mmNextFactor, com.tools20022.repository.msg.Debt3.mmPreviousFactor, com.tools20022.repository.msg.Debt3.mmPieces, com.tools20022.repository.msg.Debt3.mmPoolsMaximum,
						com.tools20022.repository.msg.Debt3.mmPoolsPerMillion, com.tools20022.repository.msg.Debt3.mmPoolsPerLot, com.tools20022.repository.msg.Debt3.mmPoolsPerTrade,
						com.tools20022.repository.msg.Debt3.mmConstantPrePaymentPenaltyIndicator, com.tools20022.repository.msg.Debt3.mmLotIdentification, com.tools20022.repository.msg.Debt3.mmConstantPrePaymentYield,
						com.tools20022.repository.msg.Debt3.mmWeightedAverageCoupon, com.tools20022.repository.msg.Debt3.mmWeightedAverageLife, com.tools20022.repository.msg.Debt3.mmWeightedAverageLoan,
						com.tools20022.repository.msg.Debt3.mmWeightedAverageMaturity, com.tools20022.repository.msg.Debt3.mmInsuredIndicator, com.tools20022.repository.msg.Debt3.mmBankQualifiedIndicator,
						com.tools20022.repository.msg.Debt3.mmYieldCalculation, com.tools20022.repository.msg.Debt3.mmInterestType, com.tools20022.repository.msg.Debt3.mmInstrumentStructureType,
						com.tools20022.repository.msg.Debt3.mmGlobalType, com.tools20022.repository.msg.Debt3.mmPotentialEuroSystemEligibility, com.tools20022.repository.msg.Debt3.mmGeographics,
						com.tools20022.repository.msg.Debt3.mmYieldRange, com.tools20022.repository.msg.Debt3.mmCouponRange, com.tools20022.repository.msg.Debt3.mmPurpose,
						com.tools20022.repository.msg.Debt3.mmAlternativeMinimumTaxIndicator, com.tools20022.repository.msg.Debt3.mmAutoReinvestment, com.tools20022.repository.msg.Debt3.mmHaircut,
						com.tools20022.repository.msg.Debt3.mmTransactionConditions, com.tools20022.repository.msg.Debt3.mmLookBack, com.tools20022.repository.msg.Debt3.mmMaximumSubstitution,
						com.tools20022.repository.msg.Debt3.mmMinimumIncrement, com.tools20022.repository.msg.Debt3.mmMinimumQuantity, com.tools20022.repository.msg.Debt3.mmProduction,
						com.tools20022.repository.msg.Debt3.mmRestrictedIndicator, com.tools20022.repository.msg.Debt3.mmPriceFrequency, com.tools20022.repository.msg.Debt3.mmSector,
						com.tools20022.repository.msg.Debt3.mmSubstitutionFrequency, com.tools20022.repository.msg.Debt3.mmSubstitutionLeft, com.tools20022.repository.msg.Debt3.mmWholePoolIndicator,
						com.tools20022.repository.msg.Debt3.mmPriceSource, com.tools20022.repository.msg.Debt3.mmPriceRange);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule.forDebt3,
						com.tools20022.repository.constraints.ConstraintNextCallableDateAndCallableIndicatorRule.forDebt3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Debt3";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				previousVersion_lazy = () -> Debt2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyCode> getPaymentCurrency() {
		return paymentCurrency == null ? Optional.empty() : Optional.of(paymentCurrency);
	}

	public Debt3 setPaymentCurrency(ActiveCurrencyCode paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFaceAmount() {
		return faceAmount == null ? Optional.empty() : Optional.of(faceAmount);
	}

	public Debt3 setFaceAmount(ActiveCurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
		return this;
	}

	public Optional<Frequency35Choice> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public Debt3 setPaymentFrequency(Frequency35Choice paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<ISODateTime> getInterestFixingDate() {
		return interestFixingDate == null ? Optional.empty() : Optional.of(interestFixingDate);
	}

	public Debt3 setInterestFixingDate(ISODateTime interestFixingDate) {
		this.interestFixingDate = interestFixingDate;
		return this;
	}

	public Optional<ISODateTime> getDatedDate() {
		return datedDate == null ? Optional.empty() : Optional.of(datedDate);
	}

	public Debt3 setDatedDate(ISODateTime datedDate) {
		this.datedDate = datedDate;
		return this;
	}

	public Optional<ISODateTime> getFirstPaymentDate() {
		return firstPaymentDate == null ? Optional.empty() : Optional.of(firstPaymentDate);
	}

	public Debt3 setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		return this;
	}

	public Optional<ISODateTime> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public Debt3 setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODateTime> getNextCouponDate() {
		return nextCouponDate == null ? Optional.empty() : Optional.of(nextCouponDate);
	}

	public Debt3 setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
		return this;
	}

	public Optional<ISODateTime> getPutableDate() {
		return putableDate == null ? Optional.empty() : Optional.of(putableDate);
	}

	public Debt3 setPutableDate(ISODateTime putableDate) {
		this.putableDate = putableDate;
		return this;
	}

	public Optional<ISODateTime> getNextCallableDate() {
		return nextCallableDate == null ? Optional.empty() : Optional.of(nextCallableDate);
	}

	public Debt3 setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
		return this;
	}

	public Optional<ISODateTime> getNextFactorDate() {
		return nextFactorDate == null ? Optional.empty() : Optional.of(nextFactorDate);
	}

	public Debt3 setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = nextFactorDate;
		return this;
	}

	public Optional<ISODateTime> getExpirationDate() {
		return expirationDate == null ? Optional.empty() : Optional.of(expirationDate);
	}

	public Debt3 setExpirationDate(ISODateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public Optional<PaymentDirectionIndicator> getPaymentDirectionIndicator() {
		return paymentDirectionIndicator == null ? Optional.empty() : Optional.of(paymentDirectionIndicator);
	}

	public Debt3 setPaymentDirectionIndicator(PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = paymentDirectionIndicator;
		return this;
	}

	public Optional<PercentageRate> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public Debt3 setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<PercentageRate> getNextInterestRate() {
		return nextInterestRate == null ? Optional.empty() : Optional.of(nextInterestRate);
	}

	public Debt3 setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
		return this;
	}

	public Optional<YesNoIndicator> getOddCouponIndicator() {
		return oddCouponIndicator == null ? Optional.empty() : Optional.of(oddCouponIndicator);
	}

	public Debt3 setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = oddCouponIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCallableIndicator() {
		return callableIndicator == null ? Optional.empty() : Optional.of(callableIndicator);
	}

	public Debt3 setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
		return this;
	}

	public Optional<Number> getCPProgram() {
		return cPProgram == null ? Optional.empty() : Optional.of(cPProgram);
	}

	public Debt3 setCPProgram(Number cPProgram) {
		this.cPProgram = cPProgram;
		return this;
	}

	public Optional<Max350Text> getCPRegistrationType() {
		return cPRegistrationType == null ? Optional.empty() : Optional.of(cPRegistrationType);
	}

	public Debt3 setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = cPRegistrationType;
		return this;
	}

	public Optional<ISODateTime> getInterestAccrualDate() {
		return interestAccrualDate == null ? Optional.empty() : Optional.of(interestAccrualDate);
	}

	public Debt3 setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = interestAccrualDate;
		return this;
	}

	public Optional<YesNoIndicator> getPutableIndicator() {
		return putableIndicator == null ? Optional.empty() : Optional.of(putableIndicator);
	}

	public Debt3 setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPreFundedIndicator() {
		return preFundedIndicator == null ? Optional.empty() : Optional.of(preFundedIndicator);
	}

	public Debt3 setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getEscrowedIndicator() {
		return escrowedIndicator == null ? Optional.empty() : Optional.of(escrowedIndicator);
	}

	public Debt3 setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPerpetualIndicator() {
		return perpetualIndicator == null ? Optional.empty() : Optional.of(perpetualIndicator);
	}

	public Debt3 setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getSubordinatedIndicator() {
		return subordinatedIndicator == null ? Optional.empty() : Optional.of(subordinatedIndicator);
	}

	public Debt3 setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = subordinatedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getExtendibleIndicator() {
		return extendibleIndicator == null ? Optional.empty() : Optional.of(extendibleIndicator);
	}

	public Debt3 setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = extendibleIndicator;
		return this;
	}

	public Optional<DateTimePeriodChoice> getExtendiblePeriod() {
		return extendiblePeriod == null ? Optional.empty() : Optional.of(extendiblePeriod);
	}

	public Debt3 setExtendiblePeriod(DateTimePeriodChoice extendiblePeriod) {
		this.extendiblePeriod = extendiblePeriod;
		return this;
	}

	public Optional<YesNoIndicator> getVariableRateIndicator() {
		return variableRateIndicator == null ? Optional.empty() : Optional.of(variableRateIndicator);
	}

	public Debt3 setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOverAllotmentAmount() {
		return overAllotmentAmount == null ? Optional.empty() : Optional.of(overAllotmentAmount);
	}

	public Debt3 setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
		return this;
	}

	public Optional<PercentageRate> getOverAllotmentRate() {
		return overAllotmentRate == null ? Optional.empty() : Optional.of(overAllotmentRate);
	}

	public Debt3 setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
		return this;
	}

	public Optional<YesNoIndicator> getAmortisableIndicator() {
		return amortisableIndicator == null ? Optional.empty() : Optional.of(amortisableIndicator);
	}

	public Debt3 setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
		return this;
	}

	public Optional<Max70Text> getInterestCalculationMethod() {
		return interestCalculationMethod == null ? Optional.empty() : Optional.of(interestCalculationMethod);
	}

	public Debt3 setInterestCalculationMethod(Max70Text interestCalculationMethod) {
		this.interestCalculationMethod = interestCalculationMethod;
		return this;
	}

	public Optional<DistributionPolicy2Choice> getCapitalisedInterest() {
		return capitalisedInterest == null ? Optional.empty() : Optional.of(capitalisedInterest);
	}

	public Debt3 setCapitalisedInterest(DistributionPolicy2Choice capitalisedInterest) {
		this.capitalisedInterest = capitalisedInterest;
		return this;
	}

	public List<ActiveCurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount == null ? actualDenominationAmount = new ArrayList<>() : actualDenominationAmount;
	}

	public Debt3 setActualDenominationAmount(List<ActiveCurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = Objects.requireNonNull(actualDenominationAmount);
		return this;
	}

	public Optional<PercentageRate> getCurrentFactor() {
		return currentFactor == null ? Optional.empty() : Optional.of(currentFactor);
	}

	public Debt3 setCurrentFactor(PercentageRate currentFactor) {
		this.currentFactor = currentFactor;
		return this;
	}

	public Optional<PercentageRate> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public Debt3 setNextFactor(PercentageRate nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<PercentageRate> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public Debt3 setPreviousFactor(PercentageRate previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<DecimalNumber> getPieces() {
		return pieces == null ? Optional.empty() : Optional.of(pieces);
	}

	public Debt3 setPieces(DecimalNumber pieces) {
		this.pieces = pieces;
		return this;
	}

	public Optional<DecimalNumber> getPoolsMaximum() {
		return poolsMaximum == null ? Optional.empty() : Optional.of(poolsMaximum);
	}

	public Debt3 setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = poolsMaximum;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerMillion() {
		return poolsPerMillion == null ? Optional.empty() : Optional.of(poolsPerMillion);
	}

	public Debt3 setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = poolsPerMillion;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerLot() {
		return poolsPerLot == null ? Optional.empty() : Optional.of(poolsPerLot);
	}

	public Debt3 setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = poolsPerLot;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerTrade() {
		return poolsPerTrade == null ? Optional.empty() : Optional.of(poolsPerTrade);
	}

	public Debt3 setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = poolsPerTrade;
		return this;
	}

	public Optional<YesNoIndicator> getConstantPrePaymentPenaltyIndicator() {
		return constantPrePaymentPenaltyIndicator == null ? Optional.empty() : Optional.of(constantPrePaymentPenaltyIndicator);
	}

	public Debt3 setConstantPrePaymentPenaltyIndicator(YesNoIndicator constantPrePaymentPenaltyIndicator) {
		this.constantPrePaymentPenaltyIndicator = constantPrePaymentPenaltyIndicator;
		return this;
	}

	public Optional<Max35Text> getLotIdentification() {
		return lotIdentification == null ? Optional.empty() : Optional.of(lotIdentification);
	}

	public Debt3 setLotIdentification(Max35Text lotIdentification) {
		this.lotIdentification = lotIdentification;
		return this;
	}

	public Optional<PercentageRate> getConstantPrePaymentYield() {
		return constantPrePaymentYield == null ? Optional.empty() : Optional.of(constantPrePaymentYield);
	}

	public Debt3 setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = constantPrePaymentYield;
		return this;
	}

	public Optional<PercentageRate> getWeightedAverageCoupon() {
		return weightedAverageCoupon == null ? Optional.empty() : Optional.of(weightedAverageCoupon);
	}

	public Debt3 setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = weightedAverageCoupon;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageLife() {
		return weightedAverageLife == null ? Optional.empty() : Optional.of(weightedAverageLife);
	}

	public Debt3 setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = weightedAverageLife;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageLoan() {
		return weightedAverageLoan == null ? Optional.empty() : Optional.of(weightedAverageLoan);
	}

	public Debt3 setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = weightedAverageLoan;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageMaturity() {
		return weightedAverageMaturity == null ? Optional.empty() : Optional.of(weightedAverageMaturity);
	}

	public Debt3 setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = weightedAverageMaturity;
		return this;
	}

	public Optional<YesNoIndicator> getInsuredIndicator() {
		return insuredIndicator == null ? Optional.empty() : Optional.of(insuredIndicator);
	}

	public Debt3 setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getBankQualifiedIndicator() {
		return bankQualifiedIndicator == null ? Optional.empty() : Optional.of(bankQualifiedIndicator);
	}

	public Debt3 setBankQualifiedIndicator(YesNoIndicator bankQualifiedIndicator) {
		this.bankQualifiedIndicator = bankQualifiedIndicator;
		return this;
	}

	public List<YieldCalculation5> getYieldCalculation() {
		return yieldCalculation == null ? yieldCalculation = new ArrayList<>() : yieldCalculation;
	}

	public Debt3 setYieldCalculation(List<com.tools20022.repository.msg.YieldCalculation5> yieldCalculation) {
		this.yieldCalculation = Objects.requireNonNull(yieldCalculation);
		return this;
	}

	public Optional<InterestType3Code> getInterestType() {
		return interestType == null ? Optional.empty() : Optional.of(interestType);
	}

	public Debt3 setInterestType(InterestType3Code interestType) {
		this.interestType = interestType;
		return this;
	}

	public Optional<InstrumentSubStructureType2Choice> getInstrumentStructureType() {
		return instrumentStructureType == null ? Optional.empty() : Optional.of(instrumentStructureType);
	}

	public Debt3 setInstrumentStructureType(InstrumentSubStructureType2Choice instrumentStructureType) {
		this.instrumentStructureType = instrumentStructureType;
		return this;
	}

	public Optional<GlobalNote2Choice> getGlobalType() {
		return globalType == null ? Optional.empty() : Optional.of(globalType);
	}

	public Debt3 setGlobalType(GlobalNote2Choice globalType) {
		this.globalType = globalType;
		return this;
	}

	public Optional<YesNoIndicator> getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility == null ? Optional.empty() : Optional.of(potentialEuroSystemEligibility);
	}

	public Debt3 setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = potentialEuroSystemEligibility;
		return this;
	}

	public Optional<Max35Text> getGeographics() {
		return geographics == null ? Optional.empty() : Optional.of(geographics);
	}

	public Debt3 setGeographics(Max35Text geographics) {
		this.geographics = geographics;
		return this;
	}

	public Optional<AmountOrPercentageRange> getYieldRange() {
		return yieldRange == null ? Optional.empty() : Optional.of(yieldRange);
	}

	public Debt3 setYieldRange(com.tools20022.repository.msg.AmountOrPercentageRange yieldRange) {
		this.yieldRange = yieldRange;
		return this;
	}

	public Optional<AmountOrPercentageRange> getCouponRange() {
		return couponRange == null ? Optional.empty() : Optional.of(couponRange);
	}

	public Debt3 setCouponRange(com.tools20022.repository.msg.AmountOrPercentageRange couponRange) {
		this.couponRange = couponRange;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public Debt3 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<YesNoIndicator> getAlternativeMinimumTaxIndicator() {
		return alternativeMinimumTaxIndicator == null ? Optional.empty() : Optional.of(alternativeMinimumTaxIndicator);
	}

	public Debt3 setAlternativeMinimumTaxIndicator(YesNoIndicator alternativeMinimumTaxIndicator) {
		this.alternativeMinimumTaxIndicator = alternativeMinimumTaxIndicator;
		return this;
	}

	public Optional<PercentageRate> getAutoReinvestment() {
		return autoReinvestment == null ? Optional.empty() : Optional.of(autoReinvestment);
	}

	public Debt3 setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = autoReinvestment;
		return this;
	}

	public Optional<PercentageRate> getHaircut() {
		return haircut == null ? Optional.empty() : Optional.of(haircut);
	}

	public Debt3 setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
		return this;
	}

	public Optional<TradeTransactionCondition7Choice> getTransactionConditions() {
		return transactionConditions == null ? Optional.empty() : Optional.of(transactionConditions);
	}

	public Debt3 setTransactionConditions(TradeTransactionCondition7Choice transactionConditions) {
		this.transactionConditions = transactionConditions;
		return this;
	}

	public Optional<Number> getLookBack() {
		return lookBack == null ? Optional.empty() : Optional.of(lookBack);
	}

	public Debt3 setLookBack(Number lookBack) {
		this.lookBack = lookBack;
		return this;
	}

	public Optional<Number> getMaximumSubstitution() {
		return maximumSubstitution == null ? Optional.empty() : Optional.of(maximumSubstitution);
	}

	public Debt3 setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = maximumSubstitution;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumIncrement() {
		return minimumIncrement == null ? Optional.empty() : Optional.of(minimumIncrement);
	}

	public Debt3 setMinimumIncrement(FinancialInstrumentQuantity1Choice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumQuantity() {
		return minimumQuantity == null ? Optional.empty() : Optional.of(minimumQuantity);
	}

	public Debt3 setMinimumQuantity(FinancialInstrumentQuantity1Choice minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
		return this;
	}

	public Optional<Max35Text> getProduction() {
		return production == null ? Optional.empty() : Optional.of(production);
	}

	public Debt3 setProduction(Max35Text production) {
		this.production = production;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictedIndicator() {
		return restrictedIndicator == null ? Optional.empty() : Optional.of(restrictedIndicator);
	}

	public Debt3 setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
		return this;
	}

	public Optional<Frequency35Choice> getPriceFrequency() {
		return priceFrequency == null ? Optional.empty() : Optional.of(priceFrequency);
	}

	public Debt3 setPriceFrequency(Frequency35Choice priceFrequency) {
		this.priceFrequency = priceFrequency;
		return this;
	}

	public Optional<Max35Text> getSector() {
		return sector == null ? Optional.empty() : Optional.of(sector);
	}

	public Debt3 setSector(Max35Text sector) {
		this.sector = sector;
		return this;
	}

	public Optional<Frequency35Choice> getSubstitutionFrequency() {
		return substitutionFrequency == null ? Optional.empty() : Optional.of(substitutionFrequency);
	}

	public Debt3 setSubstitutionFrequency(Frequency35Choice substitutionFrequency) {
		this.substitutionFrequency = substitutionFrequency;
		return this;
	}

	public Optional<Number> getSubstitutionLeft() {
		return substitutionLeft == null ? Optional.empty() : Optional.of(substitutionLeft);
	}

	public Debt3 setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = substitutionLeft;
		return this;
	}

	public Optional<YesNoIndicator> getWholePoolIndicator() {
		return wholePoolIndicator == null ? Optional.empty() : Optional.of(wholePoolIndicator);
	}

	public Debt3 setWholePoolIndicator(YesNoIndicator wholePoolIndicator) {
		this.wholePoolIndicator = wholePoolIndicator;
		return this;
	}

	public Optional<Max35Text> getPriceSource() {
		return priceSource == null ? Optional.empty() : Optional.of(priceSource);
	}

	public Debt3 setPriceSource(Max35Text priceSource) {
		this.priceSource = priceSource;
		return this;
	}

	public Optional<AmountOrPercentageRange> getPriceRange() {
		return priceRange == null ? Optional.empty() : Optional.of(priceRange);
	}

	public Debt3 setPriceRange(com.tools20022.repository.msg.AmountOrPercentageRange priceRange) {
		this.priceRange = priceRange;
		return this;
	}
}