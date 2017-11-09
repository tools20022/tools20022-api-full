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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.InterestType3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPaymentCurrency
 * Debt2.mmPaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmFaceAmount
 * Debt2.mmFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPaymentFrequency
 * Debt2.mmPaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestFixingDate
 * Debt2.mmInterestFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmDatedDate
 * Debt2.mmDatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmFirstPaymentDate
 * Debt2.mmFirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMaturityDate
 * Debt2.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextCouponDate
 * Debt2.mmNextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPutableDate
 * Debt2.mmPutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextCallableDate
 * Debt2.mmNextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextFactorDate
 * Debt2.mmNextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmExpirationDate
 * Debt2.mmExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmPaymentDirectionIndicator
 * Debt2.mmPaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestRate
 * Debt2.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextInterestRate
 * Debt2.mmNextInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmOddCouponIndicator
 * Debt2.mmOddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCallableIndicator
 * Debt2.mmCallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCPProgram
 * Debt2.mmCPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCPRegistrationType
 * Debt2.mmCPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestAccrualDate
 * Debt2.mmInterestAccrualDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPutableIndicator
 * Debt2.mmPutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPreFundedIndicator
 * Debt2.mmPreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmEscrowedIndicator
 * Debt2.mmEscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPerpetualIndicator
 * Debt2.mmPerpetualIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSubordinatedIndicator
 * Debt2.mmSubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmExtendibleIndicator
 * Debt2.mmExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmExtendiblePeriod
 * Debt2.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmVariableRateIndicator
 * Debt2.mmVariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentAmount
 * Debt2.mmOverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentRate
 * Debt2.mmOverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmAmortisableIndicator
 * Debt2.mmAmortisableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestCalculationMethod
 * Debt2.mmInterestCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCapitalisedInterest
 * Debt2.mmCapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmActualDenominationAmount
 * Debt2.mmActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCurrentFactor
 * Debt2.mmCurrentFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextFactor
 * Debt2.mmNextFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPreviousFactor
 * Debt2.mmPreviousFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPieces Debt2.mmPieces}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsMaximum
 * Debt2.mmPoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerMillion
 * Debt2.mmPoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerLot
 * Debt2.mmPoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerTrade
 * Debt2.mmPoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentPenaltyIndicator
 * Debt2.mmConstantPrePaymentPenaltyIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmLotIdentification
 * Debt2.mmLotIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentYield
 * Debt2.mmConstantPrePaymentYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageCoupon
 * Debt2.mmWeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLife
 * Debt2.mmWeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLoan
 * Debt2.mmWeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageMaturity
 * Debt2.mmWeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInsuredIndicator
 * Debt2.mmInsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmBankQualifiedIndicator
 * Debt2.mmBankQualifiedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmYieldCalculation
 * Debt2.mmYieldCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestType
 * Debt2.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmInstrumentStructureType
 * Debt2.mmInstrumentStructureType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmGlobalType
 * Debt2.mmGlobalType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmPotentialEuroSystemEligibility
 * Debt2.mmPotentialEuroSystemEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmGeographics
 * Debt2.mmGeographics}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmYieldRange
 * Debt2.mmYieldRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCouponRange
 * Debt2.mmCouponRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPurpose
 * Debt2.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt2#mmAlternativeMinimumTaxIndicator
 * Debt2.mmAlternativeMinimumTaxIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmAutoReinvestment
 * Debt2.mmAutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmHaircut
 * Debt2.mmHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmTransactionConditions
 * Debt2.mmTransactionConditions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmLookBack
 * Debt2.mmLookBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMaximumSubstitution
 * Debt2.mmMaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMinimumIncrement
 * Debt2.mmMinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMinimumQuantity
 * Debt2.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmProduction
 * Debt2.mmProduction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmRestrictedIndicator
 * Debt2.mmRestrictedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPriceFrequency
 * Debt2.mmPriceFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSector Debt2.mmSector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionFrequency
 * Debt2.mmSubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionLeft
 * Debt2.mmSubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmWholePoolIndicator
 * Debt2.mmWholePoolIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPriceSource
 * Debt2.mmPriceSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPriceRange
 * Debt2.mmPriceRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Debt2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * </ul>
 */
public class Debt2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode paymentCurrency;
	/**
	 * Currency of the payment.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentCurrency;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount faceAmount;
	/**
	 * Unit value of a debt security.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaceAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Unit value of a debt security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Frequency11Choice paymentFrequency;
	/**
	 * Specifies the frequency of an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency11Choice
	 * Frequency11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmPaymentFrequency
	 * Dividend.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmPaymentFrequency;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency11Choice.mmObject();
		}
	};
	protected ISODateTime interestFixingDate;
	/**
	 * Date/time at which the rate determination is made, also called
	 * determination date.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "IntrstFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestFixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime datedDate;
	/**
	 * First date/time at which a security begins to accrue interest.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime firstPaymentDate;
	/**
	 * Date/time at which the first interest payment is due to holders of the
	 * security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime maturityDate;
	/**
	 * Planned final repayment date at the time of issuance.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime nextCouponDate;
	/**
	 * Date of the coupon attached to the physical security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCouponDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "NxtCpnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime putableDate;
	/**
	 * Date at which the holder has the right to ask for redemption of the
	 * security prior to final maturity.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime nextCallableDate;
	/**
	 * Next date/time at which the issuer has the right to pay the securitiy
	 * prior to maturity.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime nextFactorDate;
	/**
	 * The date that the current factor will be changed to a new factor.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactorDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextFactorDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "NxtFctrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime expirationDate;
	/**
	 * Date/time at which an interest bearing security becomes due and assets
	 * are to be repaid.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpirationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "XprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpirationDate";
			definition = "Date/time at which an interest bearing security becomes due and assets are to be repaid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PaymentDirectionIndicator paymentDirectionIndicator;
	/**
	 * Indicates the direction of payment for asset or mortgage backed
	 * securities, ie, whether the repaid capital is distributed (payment
	 * direction is down) or capitalized (payment direction is up).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDirectionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PmtDrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentDirectionIndicator.mmObject();
		}
	};
	protected PercentageRate interestRate;
	/**
	 * Per annum ratio of interest paid to the principal amount of the financial
	 * instrument for a specific period of time.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate nextInterestRate;
	/**
	 * Specifies the interest rate applicable to the next interest payment
	 * period.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Specifies the interest rate applicable to the next interest payment period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected YesNoIndicator oddCouponIndicator;
	/**
	 * Specifies whether the payment of the coupon (interest) on a bond is off
	 * the normal schedule.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOddCouponIndicator
	 * Debt.mmOddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOddCouponIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOddCouponIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "OddCpnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator callableIndicator;
	/**
	 * Indicates whether the issuer has the right to pay the security prior to
	 * maturity. Also called RetractableIndicator.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCallableIndicator
	 * Debt.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Number cPProgram;
	/**
	 * The program under which a commercial paper is issued. The values that are
	 * most used are:<br>
	 * 0 = N/A<br>
	 * 1 = 3(a)3<br>
	 * 2 = 4(2)<br>
	 * 3 = 3(a)4<br>
	 * 4 = 3(c)7<br>
	 * 5 = 144A<br>
	 * 6 = 3(a)2<br>
	 * 99 = Other
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CPPrgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The program under which a commercial paper is issued. The values that are most used are:\r\n0 = N/A\r\n1 = 3(a)3\r\n2 = 4(2)\r\n3 = 3(a)4\r\n4 = 3(c)7\r\n5 = 144A\r\n6 = 3(a)2\r\n99 = Other"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPProgram = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPProgram;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CPPrgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\r\n0 = N/A\r\n1 = 3(a)3\r\n2 = 4(2)\r\n3 = 3(a)4\r\n4 = 3(c)7\r\n5 = 144A\r\n6 = 3(a)2\r\n99 = Other";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max350Text cPRegistrationType;
	/**
	 * Registration type of a commercial paper issuance.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CPRegnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPRegistrationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration type of a commercial paper issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPRegistrationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPRegistrationType;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CPRegnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime interestAccrualDate;
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the issue date and the dated date.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrlDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAccrualDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestAccrualDate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator putableIndicator;
	/**
	 * Indicates whether the holder has the right to ask for redemption of the
	 * security prior to final maturity. Also called RedeemableIndicator.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableIndicator
	 * Debt.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator preFundedIndicator;
	/**
	 * Indicates whether an interest bearing instrument is being escrowed or
	 * collateralized either by direct obligations guaranteed by the US
	 * government, or by other types of securities. The maturity schedules of
	 * the securities in the escrow fund are determined in such a way to pay the
	 * maturity value, coupon, and premium payments (if any) of the refunded
	 * bonds.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPreFundedIndicator
	 * Debt.mmPreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreFundedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPreFundedIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PreFnddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator escrowedIndicator;
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmEscrowedIndicator
	 * Debt.mmEscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmEscrowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmEscrowedIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "EscrwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator perpetualIndicator;
	/**
	 * Indicates whether the security has no maturity date.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPerpetualIndicator
	 * Debt.mmPerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPerpetualIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPerpetualIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PerptlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator subordinatedIndicator;
	/**
	 * Indicates whether the security is a subordinated security.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubordinatedIndicator
	 * Debt.mmSubordinatedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubordinatedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubordinatedIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "SubrdntdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator extendibleIndicator;
	/**
	 * Indicates whether the security is extendible,eg, repayment may be
	 * extended or maturity changed.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmExtendibleIndicator
	 * Debt.mmExtendibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendibleIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "XtndblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DateTimePeriodChoice extendiblePeriod;
	/**
	 * Period during which a date might be extended.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendiblePeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendiblePeriod;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "XtndblPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	protected YesNoIndicator variableRateIndicator;
	/**
	 * Indicates whether the interest rate of an interest bearing instrument is
	 * reset periodically.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmVariableRateIndicator
	 * Debt.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariableRateIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount overAllotmentAmount;
	/**
	 * Amount for which a security can be overalloted (as in greenshoe option).
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentAmount
	 * Debt.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentAmount;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate overAllotmentRate;
	/**
	 * Percentage for which a security can be overalloted (as in greenshoe
	 * option).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverAllotmentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentRate;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected YesNoIndicator amortisableIndicator;
	/**
	 * Indicates whether repayment is made via regular principal and interest
	 * payments over time.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAmortisableIndicator
	 * Debt.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmortisableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "AmtsblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max70Text interestCalculationMethod;
	/**
	 * Calculation method used to calculate interest and/or yield for a bond,
	 * for example, street convention.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestCalculationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "IntrstClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCalculationMethod";
			definition = "Calculation method used to calculate interest and/or yield for a bond, for example, street convention.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected DistributionPolicy1Choice capitalisedInterest;
	/**
	 * Specifies whether the interest amount is capitalised until maturity date
	 * or paid out at each interest payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DistributionPolicy1Choice
	 * DistributionPolicy1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCapitalisedInterest
	 * Debt.mmCapitalisedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalisedInterest = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCapitalisedInterest;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CptlsdIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DistributionPolicy1Choice.mmObject();
		}
	};
	protected List<ActiveCurrencyAndAmount> actualDenominationAmount;
	/**
	 * Nominal value per security unit.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmActualDenominationAmount
	 * Debt.mmActualDenominationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualDenominationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmActualDenominationAmount;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "ActlDnmtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate currentFactor;
	/**
	 * Identifies the current factor expressed as a decimal between 0 and 1
	 * defining the outstanding principal of the bond (for factored securities).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for factored securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate nextFactor;
	/**
	 * Identifies the new factor expressed as a decimal between 0 and 1 defining
	 * the outstanding principal of the bond (for factored securities).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for factored securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate previousFactor;
	/**
	 * Identifies the previous factor expressed as a decimal between 0 and 1
	 * defining the outstanding principal of the bond (for factored securities).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Identifies the previous factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected DecimalNumber pieces;
	/**
	 * Number of pieces composing a pool of financial assets.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPieces = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPieces;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Pcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber poolsMaximum;
	/**
	 * Collection of assets by which a security is backed.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsMaximum = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsMaximum;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PlsMax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber poolsPerMillion;
	/**
	 * Indicates per million the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerMillion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerMillion;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PlsPerMln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber poolsPerLot;
	/**
	 * Indicates per lot the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerLot = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerLot;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PlsPerLot";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber poolsPerTrade;
	/**
	 * Indicates per trade the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolsPerTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerTrade;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PlsPerTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected YesNoIndicator constantPrePaymentPenaltyIndicator;
	/**
	 * Indicates whether a penalty might be imposed to the borrower of a
	 * mortgage in case of prepayments occurring during the lockout period.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentPenalty
	 * Debt.mmConstantPrePaymentPenalty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmConstantPrePaymentPenaltyIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentPenalty;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtPnltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentPenaltyIndicator";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text lotIdentification;
	/**
	 * Identifies the lot constituting an asset backed or mortgage backed
	 * security issue.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotIdentifier;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "LotId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotIdentification";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PercentageRate constantPrePaymentYield;
	/**
	 * Measure of prepayment as a yield of the current outstanding loan balance.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmConstantPrePaymentYield = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentYield;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate weightedAverageCoupon;
	/**
	 * Contains the weighted average coupon of the fixed income instrument
	 * (expressed as a percentage).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageCoupon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageCoupon;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgCpn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected DecimalNumber weightedAverageLife;
	/**
	 * Contains the weighted average life of the fixed income instrument
	 * (expressed in months).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageLife = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLife;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLife";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber weightedAverageLoan;
	/**
	 * Contains the weighted average loan of the fixed income instrument
	 * (expressed in months).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageLoan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLoan;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber weightedAverageMaturity;
	/**
	 * Contains the weighted average maturity of the fixed income instrument
	 * (expressed in months).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeightedAverageMaturity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageMaturity;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgMtrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected YesNoIndicator insuredIndicator;
	/**
	 * Indicates whether the instruments is backed by any kind of asset or not.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmInsuredIndicator
	 * Debt.mmInsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmInsuredIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "InsrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator bankQualifiedIndicator;
	/**
	 * Indicates whether the security is bank qualified (usually applies to loan
	 * products).
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmBankQualified
	 * Debt.mmBankQualified}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankQualifiedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmBankQualified;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "BkQlfdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankQualifiedIndicator";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.YieldCalculation3> yieldCalculation;
	/**
	 * Rate of return on an investment, based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmYieldCalculation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "YldClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
		}
	};
	protected InterestType3Code interestType;
	/**
	 * Indicates whether interest rate is fixed, variable or other.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestType;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "IntrstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Indicates whether interest rate is fixed, variable or other.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestType3Code.mmObject();
		}
	};
	protected InstrumentSubStructureType1Choice instrumentStructureType;
	/**
	 * Indicates the type of deal for structured finance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice
	 * InstrumentSubStructureType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialInstrumentSubStructure
	 * Asset.mmFinancialInstrumentSubStructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstrumentStructureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmFinancialInstrumentSubStructure;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "InstrmStrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentStructureType";
			definition = "Indicates the type of deal for structured finance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InstrumentSubStructureType1Choice.mmObject();
		}
	};
	protected GlobalNote1Choice globalType;
	/**
	 * Identifies if the security will be issued in New Global Note (NGN) or
	 * Classical Global Note (CGN).<br>
	 * New Global Note (NGN): Form of global certificate which refers to the
	 * books and records of the ICSDs to determine the issue outstanding amount
	 * (IOA). <br>
	 * Classical Global Note (CGN): Form of global certificate which requires
	 * physical annotation on the attached schedule to reflect changes in the
	 * issue outstanding amount (IOA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GlobalNote1Choice
	 * GlobalNote1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmIssuance
	 * Asset.mmIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmGlobalType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmIssuance;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "GblTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GlobalNote1Choice.mmObject();
		}
	};
	protected YesNoIndicator potentialEuroSystemEligibility;
	/**
	 * Flag to indicate the security is intended to be held in a manner that
	 * could allow the Eurosystem eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPotentialEuroSystemEligibility = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PotntlEuroSysElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Flag to indicate the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text geographics;
	/**
	 * Type of stipulation expressing geographical constraints on a fixed income
	 * instrument. It is expressed with a state or country abbreviation and a
	 * minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in
	 * Californian assets).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Geogcs"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmGeographics = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmGeographics;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Geogcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AmountOrPercentageRange yieldRange;
	/**
	 * Range of allowed yield.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmYieldRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmYieldRange;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "YldRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	protected AmountOrPercentageRange couponRange;
	/**
	 * Identification of a range of coupon numbers attached to its related
	 * financial instrument.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConvertibleIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "CpnRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponRange";
			definition = "Identification of a range of coupon numbers attached to its related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};
	protected Max256Text purpose;
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected YesNoIndicator alternativeMinimumTaxIndicator;
	/**
	 * Identifies whether the issue is subject to alternative minimum taxation
	 * (used for municipal bonds).
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAlternativeMinimumTax
	 * Debt.mmAlternativeMinimumTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternativeMinimumTaxIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAlternativeMinimumTax;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "AltrntvMinTaxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeMinimumTaxIndicator";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PercentageRate autoReinvestment;
	/**
	 * Indicates an instruction to reinvest dividends in the underlying security
	 * (or proceeds at maturity in a similar instrument) if the current rate is
	 * &lt;rate&gt; or better.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAutoReinvestment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAutoReinvestment;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "AutoRinvstmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate is <rate> or better.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate haircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected TradeTransactionCondition3Choice transactionConditions;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice
	 * TradeTransactionCondition3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "TxConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionConditions";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition3Choice.mmObject();
		}
	};
	protected Number lookBack;
	/**
	 * Indicates an instruction or attribute giving the number of days to be
	 * included in the look-back period for the investment. For example some
	 * options allow exercise based on the underlying asset's optimal value over
	 * the look-back period.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LookBck"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmLookBack = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmLookBack;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "LookBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. For example some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maximumSubstitution;
	/**
	 * Maximum number of time the collateral can be substitute.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSubstitution = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMaximumSubstitution;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "MaxSbstitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumIncrement;
	/**
	 * Indicates the minimum tradable increments of a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmMinimumIncrement;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "MinIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumQuantity;
	/**
	 * Indicates the minimum tradable quantity of a security.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmMinimumTradedNominalQuantity;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected Max35Text production;
	/**
	 * Indicates a search criterion used when looking to buy a bond,
	 * particularly an mortgage back security (MBS), issued in a particular
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmProduction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Pdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator restrictedIndicator;
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144).
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestrictedIndicator
	 * Security.mmRestrictedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRestrictedIndicator;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "RstrctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Frequency11Choice priceFrequency;
	/**
	 * Indicates the frequency at which the bond is re-rated and therefore
	 * re-priced (bond attribute, particularly of floating rate and index linked
	 * instruments).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency11Choice
	 * Frequency11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPriceFrequency
	 * Debt.mmPriceFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPriceFrequency;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PricFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency11Choice.mmObject();
		}
	};
	protected Max35Text sector;
	/**
	 * Indicates the market sector the security is classified as for example
	 * pharmaceuticals, automobile, housing, etc.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSector;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as for example pharmaceuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Frequency11Choice substitutionFrequency;
	/**
	 * Indicates the maximum number of times collateral can be substituted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency11Choice
	 * Frequency11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionFrequency
	 * Debt.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionFrequency;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "SbstitnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency11Choice.mmObject();
		}
	};
	protected Number substitutionLeft;
	/**
	 * Number of remaining times the collateral can be substitute.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionLeft = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubstitutionLeft;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "SbstitnLft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator wholePoolIndicator;
	/**
	 * Indicates a search criterion when looking to buy a mortgaged backed
	 * security that either is [yes] or is not [no] an entire pool.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWholePoolIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "WhlPoolInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholePoolIndicator";
			definition = "Indicates a search criterion when looking to buy a mortgaged backed security that either is [yes] or is not [no] an entire pool.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text priceSource;
	/**
	 * Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue,
	 * Brokertec..).
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec..)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PricSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceSource";
			definition = "Identifies the Benchmark source price (eg. BB Generic, BB Fairvalue, Brokertec..).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AmountOrPercentageRange priceRange;
	/**
	 * Indicates a search criterion used when looking to buy a bond within a
	 * particular price range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt2
	 * Debt2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceRange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Debt2.mmObject();
			isDerived = false;
			xmlTag = "PricRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceRange";
			definition = "Indicates a search criterion used when looking to buy a bond within a particular price range.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Debt2.mmPaymentCurrency, Debt2.mmFaceAmount, Debt2.mmPaymentFrequency, Debt2.mmInterestFixingDate, Debt2.mmDatedDate, Debt2.mmFirstPaymentDate, Debt2.mmMaturityDate,
						Debt2.mmNextCouponDate, Debt2.mmPutableDate, Debt2.mmNextCallableDate, Debt2.mmNextFactorDate, Debt2.mmExpirationDate, Debt2.mmPaymentDirectionIndicator, Debt2.mmInterestRate, Debt2.mmNextInterestRate,
						Debt2.mmOddCouponIndicator, Debt2.mmCallableIndicator, Debt2.mmCPProgram, Debt2.mmCPRegistrationType, Debt2.mmInterestAccrualDate, Debt2.mmPutableIndicator, Debt2.mmPreFundedIndicator, Debt2.mmEscrowedIndicator,
						Debt2.mmPerpetualIndicator, Debt2.mmSubordinatedIndicator, Debt2.mmExtendibleIndicator, Debt2.mmExtendiblePeriod, Debt2.mmVariableRateIndicator, Debt2.mmOverAllotmentAmount, Debt2.mmOverAllotmentRate,
						Debt2.mmAmortisableIndicator, Debt2.mmInterestCalculationMethod, Debt2.mmCapitalisedInterest, Debt2.mmActualDenominationAmount, Debt2.mmCurrentFactor, Debt2.mmNextFactor, Debt2.mmPreviousFactor, Debt2.mmPieces,
						Debt2.mmPoolsMaximum, Debt2.mmPoolsPerMillion, Debt2.mmPoolsPerLot, Debt2.mmPoolsPerTrade, Debt2.mmConstantPrePaymentPenaltyIndicator, Debt2.mmLotIdentification, Debt2.mmConstantPrePaymentYield,
						Debt2.mmWeightedAverageCoupon, Debt2.mmWeightedAverageLife, Debt2.mmWeightedAverageLoan, Debt2.mmWeightedAverageMaturity, Debt2.mmInsuredIndicator, Debt2.mmBankQualifiedIndicator, Debt2.mmYieldCalculation,
						Debt2.mmInterestType, Debt2.mmInstrumentStructureType, Debt2.mmGlobalType, Debt2.mmPotentialEuroSystemEligibility, Debt2.mmGeographics, Debt2.mmYieldRange, Debt2.mmCouponRange, Debt2.mmPurpose,
						Debt2.mmAlternativeMinimumTaxIndicator, Debt2.mmAutoReinvestment, Debt2.mmHaircut, Debt2.mmTransactionConditions, Debt2.mmLookBack, Debt2.mmMaximumSubstitution, Debt2.mmMinimumIncrement, Debt2.mmMinimumQuantity,
						Debt2.mmProduction, Debt2.mmRestrictedIndicator, Debt2.mmPriceFrequency, Debt2.mmSector, Debt2.mmSubstitutionFrequency, Debt2.mmSubstitutionLeft, Debt2.mmWholePoolIndicator, Debt2.mmPriceSource, Debt2.mmPriceRange);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Debt2";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(ActiveCurrencyCode paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public ActiveCurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(ActiveCurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
	}

	public Frequency11Choice getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(Frequency11Choice paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public ISODateTime getInterestFixingDate() {
		return interestFixingDate;
	}

	public void setInterestFixingDate(ISODateTime interestFixingDate) {
		this.interestFixingDate = interestFixingDate;
	}

	public ISODateTime getDatedDate() {
		return datedDate;
	}

	public void setDatedDate(ISODateTime datedDate) {
		this.datedDate = datedDate;
	}

	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public ISODateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	public ISODateTime getNextCouponDate() {
		return nextCouponDate;
	}

	public void setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
	}

	public ISODateTime getPutableDate() {
		return putableDate;
	}

	public void setPutableDate(ISODateTime putableDate) {
		this.putableDate = putableDate;
	}

	public ISODateTime getNextCallableDate() {
		return nextCallableDate;
	}

	public void setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
	}

	public ISODateTime getNextFactorDate() {
		return nextFactorDate;
	}

	public void setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = nextFactorDate;
	}

	public ISODateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(ISODateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public PaymentDirectionIndicator getPaymentDirectionIndicator() {
		return paymentDirectionIndicator;
	}

	public void setPaymentDirectionIndicator(PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = paymentDirectionIndicator;
	}

	public PercentageRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
	}

	public PercentageRate getNextInterestRate() {
		return nextInterestRate;
	}

	public void setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
	}

	public YesNoIndicator getOddCouponIndicator() {
		return oddCouponIndicator;
	}

	public void setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = oddCouponIndicator;
	}

	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public void setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
	}

	public Number getCPProgram() {
		return cPProgram;
	}

	public void setCPProgram(Number cPProgram) {
		this.cPProgram = cPProgram;
	}

	public Max350Text getCPRegistrationType() {
		return cPRegistrationType;
	}

	public void setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = cPRegistrationType;
	}

	public ISODateTime getInterestAccrualDate() {
		return interestAccrualDate;
	}

	public void setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = interestAccrualDate;
	}

	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public void setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
	}

	public YesNoIndicator getPreFundedIndicator() {
		return preFundedIndicator;
	}

	public void setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
	}

	public YesNoIndicator getEscrowedIndicator() {
		return escrowedIndicator;
	}

	public void setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
	}

	public YesNoIndicator getPerpetualIndicator() {
		return perpetualIndicator;
	}

	public void setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
	}

	public YesNoIndicator getSubordinatedIndicator() {
		return subordinatedIndicator;
	}

	public void setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = subordinatedIndicator;
	}

	public YesNoIndicator getExtendibleIndicator() {
		return extendibleIndicator;
	}

	public void setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = extendibleIndicator;
	}

	public DateTimePeriodChoice getExtendiblePeriod() {
		return extendiblePeriod;
	}

	public void setExtendiblePeriod(DateTimePeriodChoice extendiblePeriod) {
		this.extendiblePeriod = extendiblePeriod;
	}

	public YesNoIndicator getVariableRateIndicator() {
		return variableRateIndicator;
	}

	public void setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
	}

	public ActiveCurrencyAndAmount getOverAllotmentAmount() {
		return overAllotmentAmount;
	}

	public void setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
	}

	public PercentageRate getOverAllotmentRate() {
		return overAllotmentRate;
	}

	public void setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
	}

	public YesNoIndicator getAmortisableIndicator() {
		return amortisableIndicator;
	}

	public void setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
	}

	public Max70Text getInterestCalculationMethod() {
		return interestCalculationMethod;
	}

	public void setInterestCalculationMethod(Max70Text interestCalculationMethod) {
		this.interestCalculationMethod = interestCalculationMethod;
	}

	public DistributionPolicy1Choice getCapitalisedInterest() {
		return capitalisedInterest;
	}

	public void setCapitalisedInterest(DistributionPolicy1Choice capitalisedInterest) {
		this.capitalisedInterest = capitalisedInterest;
	}

	public List<ActiveCurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount;
	}

	public void setActualDenominationAmount(List<ActiveCurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = actualDenominationAmount;
	}

	public PercentageRate getCurrentFactor() {
		return currentFactor;
	}

	public void setCurrentFactor(PercentageRate currentFactor) {
		this.currentFactor = currentFactor;
	}

	public PercentageRate getNextFactor() {
		return nextFactor;
	}

	public void setNextFactor(PercentageRate nextFactor) {
		this.nextFactor = nextFactor;
	}

	public PercentageRate getPreviousFactor() {
		return previousFactor;
	}

	public void setPreviousFactor(PercentageRate previousFactor) {
		this.previousFactor = previousFactor;
	}

	public DecimalNumber getPieces() {
		return pieces;
	}

	public void setPieces(DecimalNumber pieces) {
		this.pieces = pieces;
	}

	public DecimalNumber getPoolsMaximum() {
		return poolsMaximum;
	}

	public void setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = poolsMaximum;
	}

	public DecimalNumber getPoolsPerMillion() {
		return poolsPerMillion;
	}

	public void setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = poolsPerMillion;
	}

	public DecimalNumber getPoolsPerLot() {
		return poolsPerLot;
	}

	public void setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = poolsPerLot;
	}

	public DecimalNumber getPoolsPerTrade() {
		return poolsPerTrade;
	}

	public void setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = poolsPerTrade;
	}

	public YesNoIndicator getConstantPrePaymentPenaltyIndicator() {
		return constantPrePaymentPenaltyIndicator;
	}

	public void setConstantPrePaymentPenaltyIndicator(YesNoIndicator constantPrePaymentPenaltyIndicator) {
		this.constantPrePaymentPenaltyIndicator = constantPrePaymentPenaltyIndicator;
	}

	public Max35Text getLotIdentification() {
		return lotIdentification;
	}

	public void setLotIdentification(Max35Text lotIdentification) {
		this.lotIdentification = lotIdentification;
	}

	public PercentageRate getConstantPrePaymentYield() {
		return constantPrePaymentYield;
	}

	public void setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = constantPrePaymentYield;
	}

	public PercentageRate getWeightedAverageCoupon() {
		return weightedAverageCoupon;
	}

	public void setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = weightedAverageCoupon;
	}

	public DecimalNumber getWeightedAverageLife() {
		return weightedAverageLife;
	}

	public void setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = weightedAverageLife;
	}

	public DecimalNumber getWeightedAverageLoan() {
		return weightedAverageLoan;
	}

	public void setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = weightedAverageLoan;
	}

	public DecimalNumber getWeightedAverageMaturity() {
		return weightedAverageMaturity;
	}

	public void setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = weightedAverageMaturity;
	}

	public YesNoIndicator getInsuredIndicator() {
		return insuredIndicator;
	}

	public void setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
	}

	public YesNoIndicator getBankQualifiedIndicator() {
		return bankQualifiedIndicator;
	}

	public void setBankQualifiedIndicator(YesNoIndicator bankQualifiedIndicator) {
		this.bankQualifiedIndicator = bankQualifiedIndicator;
	}

	public List<YieldCalculation3> getYieldCalculation() {
		return yieldCalculation;
	}

	public void setYieldCalculation(List<com.tools20022.repository.msg.YieldCalculation3> yieldCalculation) {
		this.yieldCalculation = yieldCalculation;
	}

	public InterestType3Code getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestType3Code interestType) {
		this.interestType = interestType;
	}

	public InstrumentSubStructureType1Choice getInstrumentStructureType() {
		return instrumentStructureType;
	}

	public void setInstrumentStructureType(InstrumentSubStructureType1Choice instrumentStructureType) {
		this.instrumentStructureType = instrumentStructureType;
	}

	public GlobalNote1Choice getGlobalType() {
		return globalType;
	}

	public void setGlobalType(GlobalNote1Choice globalType) {
		this.globalType = globalType;
	}

	public YesNoIndicator getPotentialEuroSystemEligibility() {
		return potentialEuroSystemEligibility;
	}

	public void setPotentialEuroSystemEligibility(YesNoIndicator potentialEuroSystemEligibility) {
		this.potentialEuroSystemEligibility = potentialEuroSystemEligibility;
	}

	public Max35Text getGeographics() {
		return geographics;
	}

	public void setGeographics(Max35Text geographics) {
		this.geographics = geographics;
	}

	public AmountOrPercentageRange getYieldRange() {
		return yieldRange;
	}

	public void setYieldRange(com.tools20022.repository.msg.AmountOrPercentageRange yieldRange) {
		this.yieldRange = yieldRange;
	}

	public AmountOrPercentageRange getCouponRange() {
		return couponRange;
	}

	public void setCouponRange(com.tools20022.repository.msg.AmountOrPercentageRange couponRange) {
		this.couponRange = couponRange;
	}

	public Max256Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max256Text purpose) {
		this.purpose = purpose;
	}

	public YesNoIndicator getAlternativeMinimumTaxIndicator() {
		return alternativeMinimumTaxIndicator;
	}

	public void setAlternativeMinimumTaxIndicator(YesNoIndicator alternativeMinimumTaxIndicator) {
		this.alternativeMinimumTaxIndicator = alternativeMinimumTaxIndicator;
	}

	public PercentageRate getAutoReinvestment() {
		return autoReinvestment;
	}

	public void setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = autoReinvestment;
	}

	public PercentageRate getHaircut() {
		return haircut;
	}

	public void setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
	}

	public TradeTransactionCondition3Choice getTransactionConditions() {
		return transactionConditions;
	}

	public void setTransactionConditions(TradeTransactionCondition3Choice transactionConditions) {
		this.transactionConditions = transactionConditions;
	}

	public Number getLookBack() {
		return lookBack;
	}

	public void setLookBack(Number lookBack) {
		this.lookBack = lookBack;
	}

	public Number getMaximumSubstitution() {
		return maximumSubstitution;
	}

	public void setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = maximumSubstitution;
	}

	public FinancialInstrumentQuantity1Choice getMinimumIncrement() {
		return minimumIncrement;
	}

	public void setMinimumIncrement(FinancialInstrumentQuantity1Choice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
	}

	public FinancialInstrumentQuantity1Choice getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(FinancialInstrumentQuantity1Choice minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public Max35Text getProduction() {
		return production;
	}

	public void setProduction(Max35Text production) {
		this.production = production;
	}

	public YesNoIndicator getRestrictedIndicator() {
		return restrictedIndicator;
	}

	public void setRestrictedIndicator(YesNoIndicator restrictedIndicator) {
		this.restrictedIndicator = restrictedIndicator;
	}

	public Frequency11Choice getPriceFrequency() {
		return priceFrequency;
	}

	public void setPriceFrequency(Frequency11Choice priceFrequency) {
		this.priceFrequency = priceFrequency;
	}

	public Max35Text getSector() {
		return sector;
	}

	public void setSector(Max35Text sector) {
		this.sector = sector;
	}

	public Frequency11Choice getSubstitutionFrequency() {
		return substitutionFrequency;
	}

	public void setSubstitutionFrequency(Frequency11Choice substitutionFrequency) {
		this.substitutionFrequency = substitutionFrequency;
	}

	public Number getSubstitutionLeft() {
		return substitutionLeft;
	}

	public void setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = substitutionLeft;
	}

	public YesNoIndicator getWholePoolIndicator() {
		return wholePoolIndicator;
	}

	public void setWholePoolIndicator(YesNoIndicator wholePoolIndicator) {
		this.wholePoolIndicator = wholePoolIndicator;
	}

	public Max35Text getPriceSource() {
		return priceSource;
	}

	public void setPriceSource(Max35Text priceSource) {
		this.priceSource = priceSource;
	}

	public AmountOrPercentageRange getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(com.tools20022.repository.msg.AmountOrPercentageRange priceRange) {
		this.priceRange = priceRange;
	}
}