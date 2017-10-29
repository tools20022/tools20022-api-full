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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instruments evidencing moneys owed by the issuer to the holder on
 * terms as specified.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Debt" src="doc-files/Debt.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#PaymentDirectionIndicator
 * Debt.PaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextCallableDate
 * Debt.NextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PutableDate
 * Debt.PutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DatedDate
 * Debt.DatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#FirstPaymentDate
 * Debt.FirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Factor Debt.Factor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolNumber
 * Debt.PoolNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#VariableRateIndicator
 * Debt.VariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CallableIndicator
 * Debt.CallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PutableIndicator
 * Debt.PutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#YieldToMaturityRate
 * Debt.YieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#AccruedCapitalisationAmount
 * Debt.AccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextCouponDate
 * Debt.NextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextFactorDate
 * Debt.NextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OddCouponIndicator
 * Debt.OddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CPProgram
 * Debt.CPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CPRegistrationType
 * Debt.CPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ConvertibleIndicator
 * Debt.ConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PreFundedIndicator
 * Debt.PreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#EscrowedIndicator
 * Debt.EscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PerpetualIndicator
 * Debt.PerpetualIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubordinatedIndicator
 * Debt.SubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendibleIndicator
 * Debt.ExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendiblePeriod
 * Debt.ExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OverAllotmentAmount
 * Debt.OverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#OverAllotmentRate
 * Debt.OverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AmortisableIndicator
 * Debt.AmortisableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CapitalisedInterest
 * Debt.CapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ActualDenominationAmount
 * Debt.ActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Pieces Debt.Pieces}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsMaximum
 * Debt.PoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerMillion
 * Debt.PoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerLot
 * Debt.PoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PoolsPerTrade
 * Debt.PoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ConstantPrePaymentPenalty
 * Debt.ConstantPrePaymentPenalty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PrePaymentSpeed
 * Debt.PrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#ConstantPrePaymentYield
 * Debt.ConstantPrePaymentYield}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageCoupon
 * Debt.WeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageLife
 * Debt.WeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WeightedAverageLoan
 * Debt.WeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#WeightedAverageMaturity
 * Debt.WeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#InsuredIndicator
 * Debt.InsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#BankQualified
 * Debt.BankQualified}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AutoReinvestment
 * Debt.AutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#CustomDate
 * Debt.CustomDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#LookBack Debt.LookBack}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
 * Debt.MinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MaximumSubstitution
 * Debt.MaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
 * Debt.MinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Production
 * Debt.Production}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Restricted
 * Debt.Restricted}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PriceFrequency
 * Debt.PriceFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubstitutionFrequency
 * Debt.SubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SubstitutionLeft
 * Debt.SubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#WholePool
 * Debt.WholePool}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#AlternativeMinimumTax
 * Debt.AlternativeMinimumTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextInterest
 * Debt.NextInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#ExtendibleDate
 * Debt.ExtendibleDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#SinkableIndicator
 * Debt.SinkableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Insured Debt.Insured}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#Geographics
 * Debt.Geographics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#PaymentCurrency
 * Debt.PaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DirtyPrice
 * Debt.DirtyPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#DebtSeniority
 * Debt.DebtSeniority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExtendiblePeriodDebt
 * DateTimePeriod.ExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CustomDateDebt
 * DateTimePeriod.CustomDateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
 * SecuritiesQuantity.MinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
 * SecuritiesQuantity.MinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
 * InterestCalculation.DebtInstrument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Debt
 * FinancialInstrumentProperties1Choice.Debt}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28#Debt
 * FinancialInstrument28.Debt}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#Stipulations
 * SingleQuote1.Stipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#UnderlyingStipulations
 * SingleQuote1.UnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#Stipulations
 * QuoteCancellation1Choice.Stipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#UnderlyingStipulations
 * QuoteCancellation1Choice.UnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#Stipulations
 * QuoteRequest1.Stipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#UnderlyingStipulations
 * QuoteRequest1.UnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote#Stipulations
 * RequestForQuote.Stipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#UnderlyingStipulations
 * RequestForQuote.UnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#Stipulations
 * Quote1.Stipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#UnderlyingStipulations
 * Quote1.UnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#DebtInstrumentAttributes
 * SecuritiesReferenceDataReport5.DebtInstrumentAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransparencyDataReport10#Bond
 * TransparencyDataReport10.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#UnderlyingBond
 * InterestRateDerivative5.UnderlyingBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#DebtInstrumentAttributes
 * SecurityInstrumentDescription13.DebtInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Loan Loan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1 Debt1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt2 Debt2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument2
 * DebtInstrument2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument4
 * DebtInstrument4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument5
 * DebtInstrument5}</li>
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
 * "Debt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * </ul>
 */
public class Debt extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the direction of payment for asset or mortgage backed
	 * securities, ie, whether the repaid capital is distributed (payment
	 * direction is down) or capitalized (payment direction is up).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PaymentDirectionIndicator
	 * PaymentDirectionIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection1Choice#Indicator
	 * PaymentDirection1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection1Choice#Proprietary
	 * PaymentDirection1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#Indicator
	 * PaymentDirection2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#Proprietary
	 * PaymentDirection2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PaymentDirection
	 * FinancialInstrumentAttributes8.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PaymentDirection
	 * FinancialInstrumentAttributes20.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PaymentDirection
	 * FinancialInstrumentAttributes4.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection3Choice#Indicator
	 * PaymentDirection3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection3Choice#Proprietary
	 * PaymentDirection3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PaymentDirection
	 * FinancialInstrumentAttributes13.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PaymentDirection
	 * FinancialInstrumentAttributes21.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PaymentDirection
	 * FinancialInstrumentAttributes26.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PaymentDirection
	 * FinancialInstrumentAttributes27.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PaymentDirection
	 * FinancialInstrumentAttributes14.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PaymentDirection
	 * FinancialInstrumentAttributes30.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PaymentDirection
	 * FinancialInstrumentAttributes28.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#PaymentDirectionIndicator
	 * Debt1.PaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PaymentDirection
	 * FinancialInstrumentAttributes15.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PaymentDirection
	 * FinancialInstrumentAttributes29.PaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#PaymentDirectionIndicator
	 * Debt2.PaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PaymentDirection
	 * FinancialInstrumentAttributes2.PaymentDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDirectionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentDirection1Choice.Indicator, com.tools20022.repository.choice.PaymentDirection1Choice.Proprietary,
					com.tools20022.repository.choice.PaymentDirection2Choice.Indicator, com.tools20022.repository.choice.PaymentDirection2Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes8.PaymentDirection,
					com.tools20022.repository.msg.FinancialInstrumentAttributes20.PaymentDirection, com.tools20022.repository.msg.FinancialInstrumentAttributes4.PaymentDirection,
					com.tools20022.repository.choice.PaymentDirection3Choice.Indicator, com.tools20022.repository.choice.PaymentDirection3Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PaymentDirection,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PaymentDirection, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PaymentDirection,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PaymentDirection, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PaymentDirection,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PaymentDirection, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PaymentDirection,
					com.tools20022.repository.msg.Debt1.PaymentDirectionIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes15.PaymentDirection,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.PaymentDirection, com.tools20022.repository.msg.Debt2.PaymentDirectionIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PaymentDirection);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PaymentDirectionIndicator.mmObject();
		}
	};
	/**
	 * Next date/time at which the issuer has the right to pay the securitiy
	 * prior to maturity.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#NextCallableDate
	 * FinancialInstrumentAttributes8.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#NextCallableDate
	 * FinancialInstrumentAttributes20.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#NextCallableDate
	 * FinancialInstrumentAttributes35.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#NextCallableDate
	 * FinancialInstrumentAttributes41.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#NextCallableDate
	 * FinancialInstrumentAttributes6.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#NextCallableDate
	 * FinancialInstrumentAttributes9.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#NextCallableDate
	 * FinancialInstrumentAttributes18.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#NextCallableDate
	 * FinancialInstrumentAttributes22.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#NextCallableDate
	 * FinancialInstrumentAttributes32.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#NextCallableDate
	 * FinancialInstrumentAttributes38.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#NextCallableDate
	 * FinancialInstrumentAttributes7.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#NextCallableDate
	 * FinancialInstrumentAttributes5.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#NextCallableDate
	 * FinancialInstrumentAttributes11.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#NextCallableDate
	 * FinancialInstrumentAttributes10.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#NextCallableDate
	 * FinancialInstrumentAttributes19.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#NextCallableDate
	 * FinancialInstrumentAttributes16.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#NextCallableDate
	 * FinancialInstrumentAttributes23.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#NextCallableDate
	 * FinancialInstrumentAttributes24.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#NextCallableDate
	 * FinancialInstrumentAttributes33.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#NextCallableDate
	 * FinancialInstrumentAttributes34.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#NextCallableDate
	 * FinancialInstrumentAttributes39.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#NextCallableDate
	 * FinancialInstrumentAttributes40.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#NextCallableDate
	 * FinancialInstrumentAttributes43.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#NextCallableDate
	 * FinancialInstrumentAttributes45.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#NextCallableDate
	 * FinancialInstrumentAttributes4.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#NextCallableDate
	 * FinancialInstrumentAttributes13.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#NextCallableDate
	 * FinancialInstrumentAttributes21.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#NextCallableDate
	 * FinancialInstrumentAttributes26.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#NextCallableDate
	 * FinancialInstrumentAttributes36.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#NextCallableDate
	 * FinancialInstrumentAttributes42.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#NextCallableDate
	 * FinancialInstrumentAttributes27.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#NextCallableDate
	 * FinancialInstrumentAttributes14.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#NextCallableDate
	 * FinancialInstrumentAttributes30.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#NextCallableDate
	 * FinancialInstrumentAttributes28.NextCallableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#NextCallableDate
	 * Debt1.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#NextCallableDate
	 * FinancialInstrumentAttributes31.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#NextCallableDate
	 * FinancialInstrumentAttributes44.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#NextCallableDate
	 * FinancialInstrumentAttributes15.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#NextCallableDate
	 * FinancialInstrumentAttributes29.NextCallableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#NextCallableDate
	 * Debt2.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#NextCallableDate
	 * FinancialInstrumentAttributes2.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#NextCallableDate
	 * FinancialInstrumentAttributes48.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#NextCallableDate
	 * FinancialInstrumentAttributes50.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#NextCallableDate
	 * FinancialInstrumentAttributes49.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#NextCallableDate
	 * FinancialInstrumentAttributes55.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#NextCallableDate
	 * FinancialInstrumentAttributes57.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#NextCallableDate
	 * FinancialInstrumentAttributes56.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#NextCallableDate
	 * FinancialInstrumentAttributes63.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#NextCallableDate
	 * FinancialInstrumentAttributes64.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#NextCallableDate
	 * FinancialInstrumentAttributes66.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextCallableDate
	 * FinancialInstrumentAttributes65.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#NextCallableDate
	 * FinancialInstrumentAttributes67.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#NextCallableDate
	 * FinancialInstrumentAttributes70.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#NextCallableDate
	 * FinancialInstrumentAttributes69.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#NextCallableDate
	 * FinancialInstrumentAttributes71.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#NextCallableDate
	 * FinancialInstrumentAttributes75.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#NextCallableDate
	 * FinancialInstrumentAttributes78.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#NextCallableDate
	 * FinancialInstrumentAttributes79.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextCallableDate
	 * FinancialInstrumentAttributes81.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#NextCallableDate
	 * FinancialInstrumentAttributes80.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#NextCallableDate
	 * FinancialInstrumentAttributes85.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#NextCallableDate
	 * FinancialInstrumentAttributes84.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#NextCallableDate
	 * FinancialInstrumentAttributes83.NextCallableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next date/time at which the issuer has the right to pay the securitiy prior to maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NextCallableDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.NextCallableDate, com.tools20022.repository.msg.Debt1.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.NextCallableDate, com.tools20022.repository.msg.Debt2.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes67.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.NextCallableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.NextCallableDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the holder has the right to ask for redemption of the
	 * security prior to final maturity.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PutableDate
	 * FinancialInstrumentAttributes8.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PutableDate
	 * FinancialInstrumentAttributes20.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PutableDate
	 * FinancialInstrumentAttributes35.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PutableDate
	 * FinancialInstrumentAttributes41.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#PutableDate
	 * FinancialInstrumentAttributes6.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#PutableDate
	 * FinancialInstrumentAttributes9.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#PutableDate
	 * FinancialInstrumentAttributes18.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#PutableDate
	 * FinancialInstrumentAttributes22.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#PutableDate
	 * FinancialInstrumentAttributes32.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#PutableDate
	 * FinancialInstrumentAttributes38.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#PutableDate
	 * FinancialInstrumentAttributes7.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#PutableDate
	 * FinancialInstrumentAttributes5.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#PutableDate
	 * FinancialInstrumentAttributes11.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#PutableDate
	 * FinancialInstrumentAttributes10.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#PutableDate
	 * FinancialInstrumentAttributes19.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#PutableDate
	 * FinancialInstrumentAttributes16.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#PutableDate
	 * FinancialInstrumentAttributes23.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#PutableDate
	 * FinancialInstrumentAttributes24.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#PutableDate
	 * FinancialInstrumentAttributes33.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#PutableDate
	 * FinancialInstrumentAttributes34.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#PutableDate
	 * FinancialInstrumentAttributes39.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#PutableDate
	 * FinancialInstrumentAttributes40.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#PutableDate
	 * FinancialInstrumentAttributes43.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#PutableDate
	 * FinancialInstrumentAttributes45.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PutableDate
	 * FinancialInstrumentAttributes4.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PutableDate
	 * FinancialInstrumentAttributes13.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PutableDate
	 * FinancialInstrumentAttributes21.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PutableDate
	 * FinancialInstrumentAttributes26.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PutableDate
	 * FinancialInstrumentAttributes36.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PutableDate
	 * FinancialInstrumentAttributes42.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PutableDate
	 * FinancialInstrumentAttributes27.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PutableDate
	 * FinancialInstrumentAttributes14.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PutableDate
	 * FinancialInstrumentAttributes30.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PutableDate
	 * FinancialInstrumentAttributes28.PutableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PutableDate
	 * Debt1.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PutableDate
	 * FinancialInstrumentAttributes31.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PutableDate
	 * FinancialInstrumentAttributes44.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PutableDate
	 * FinancialInstrumentAttributes15.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PutableDate
	 * FinancialInstrumentAttributes29.PutableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PutableDate
	 * Debt2.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PutableDate
	 * FinancialInstrumentAttributes2.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#PutableDate
	 * FinancialInstrumentAttributes48.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#PutableDate
	 * FinancialInstrumentAttributes50.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#PutableDate
	 * FinancialInstrumentAttributes49.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#PutableDate
	 * FinancialInstrumentAttributes55.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#PutableDate
	 * FinancialInstrumentAttributes57.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#PutableDate
	 * FinancialInstrumentAttributes56.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PutableDate
	 * FinancialInstrumentAttributes63.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PutableDate
	 * FinancialInstrumentAttributes64.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#PutableDate
	 * FinancialInstrumentAttributes66.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PutableDate
	 * FinancialInstrumentAttributes65.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#PutableDate
	 * FinancialInstrumentAttributes67.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#PutableDate
	 * FinancialInstrumentAttributes70.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#PutableDate
	 * FinancialInstrumentAttributes69.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#PutableDate
	 * FinancialInstrumentAttributes71.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PutableDate
	 * FinancialInstrumentAttributes75.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PutableDate
	 * FinancialInstrumentAttributes78.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#PutableDate
	 * FinancialInstrumentAttributes79.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PutableDate
	 * FinancialInstrumentAttributes81.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#PutableDate
	 * FinancialInstrumentAttributes80.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#PutableDate
	 * FinancialInstrumentAttributes85.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#PutableDate
	 * FinancialInstrumentAttributes84.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#PutableDate
	 * FinancialInstrumentAttributes83.PutableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the holder has the right to ask for redemption of the security prior to final maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PutableDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PutableDate, com.tools20022.repository.msg.Debt1.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.PutableDate, com.tools20022.repository.msg.Debt2.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes67.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.PutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.PutableDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.PutableDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * First date/time at which a security begins to accrue interest.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#DatedDate
	 * FinancialInstrumentAttributes8.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#DatedDate
	 * FinancialInstrumentAttributes20.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#DatedDate
	 * FinancialInstrumentAttributes35.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#DatedDate
	 * FinancialInstrumentAttributes41.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#DatedDate
	 * FinancialInstrumentAttributes6.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#DatedDate
	 * FinancialInstrumentAttributes9.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#DatedDate
	 * FinancialInstrumentAttributes18.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#DatedDate
	 * FinancialInstrumentAttributes22.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#DatedDate
	 * FinancialInstrumentAttributes32.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#DatedDate
	 * FinancialInstrumentAttributes38.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#DatedDate
	 * FinancialInstrumentAttributes7.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#DatedDate
	 * FinancialInstrumentAttributes5.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#DatedDate
	 * FinancialInstrumentAttributes11.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#DatedDate
	 * FinancialInstrumentAttributes10.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#DatedDate
	 * FinancialInstrumentAttributes19.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#DatedDate
	 * FinancialInstrumentAttributes16.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#DatedDate
	 * FinancialInstrumentAttributes23.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#DatedDate
	 * FinancialInstrumentAttributes24.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#DatedDate
	 * FinancialInstrumentAttributes33.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#DatedDate
	 * FinancialInstrumentAttributes34.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#DatedDate
	 * FinancialInstrumentAttributes39.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#DatedDate
	 * FinancialInstrumentAttributes40.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#DatedDate
	 * FinancialInstrumentAttributes43.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#DatedDate
	 * FinancialInstrumentAttributes45.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#DatedDate
	 * FinancialInstrumentAttributes4.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#DatedDate
	 * FinancialInstrumentAttributes13.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#DatedDate
	 * FinancialInstrumentAttributes21.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#DatedDate
	 * FinancialInstrumentAttributes26.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#DatedDate
	 * FinancialInstrumentAttributes36.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#DatedDate
	 * FinancialInstrumentAttributes42.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#DatedDate
	 * FinancialInstrumentAttributes27.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#DatedDate
	 * FinancialInstrumentAttributes14.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#DatedDate
	 * FinancialInstrumentAttributes30.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#DatedDate
	 * FinancialInstrumentAttributes28.DatedDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#DatedDate
	 * Debt1.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#DatedDate
	 * FinancialInstrumentAttributes31.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#DatedDate
	 * FinancialInstrumentAttributes44.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#DatedDate
	 * FinancialInstrumentAttributes15.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#DatedDate
	 * FinancialInstrumentAttributes29.DatedDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#DatedDate
	 * Debt2.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#DatedDate
	 * FinancialInstrumentAttributes2.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#DatedDate
	 * FinancialInstrumentAttributes48.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#DatedDate
	 * FinancialInstrumentAttributes50.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#DatedDate
	 * FinancialInstrumentAttributes49.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#DatedDate
	 * FinancialInstrumentAttributes55.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#DatedDate
	 * FinancialInstrumentAttributes57.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#DatedDate
	 * FinancialInstrumentAttributes56.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#DatedDate
	 * FinancialInstrumentAttributes63.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#DatedDate
	 * FinancialInstrumentAttributes64.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#DatedDate
	 * FinancialInstrumentAttributes66.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DatedDate
	 * FinancialInstrumentAttributes65.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#DatedDate
	 * FinancialInstrumentAttributes67.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#DatedDate
	 * FinancialInstrumentAttributes70.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#DatedDate
	 * FinancialInstrumentAttributes69.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#DatedDate
	 * FinancialInstrumentAttributes71.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#DatedDate
	 * FinancialInstrumentAttributes75.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#DatedDate
	 * FinancialInstrumentAttributes78.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#DatedDate
	 * FinancialInstrumentAttributes79.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DatedDate
	 * FinancialInstrumentAttributes81.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#DatedDate
	 * FinancialInstrumentAttributes80.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#DatedDate
	 * FinancialInstrumentAttributes85.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#DatedDate
	 * FinancialInstrumentAttributes84.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#DatedDate
	 * FinancialInstrumentAttributes83.DatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which a security begins to accrue interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DatedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes6.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes9.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes18.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes7.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes11.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes23.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes33.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes43.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes4.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes27.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.DatedDate, com.tools20022.repository.msg.Debt1.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes15.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.DatedDate, com.tools20022.repository.msg.Debt2.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes2.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes56.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes64.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes67.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes71.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes85.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.DatedDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.DatedDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the first interest payment is due to holders of the
	 * security.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#FirstPaymentDate
	 * FinancialInstrumentAttributes8.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#FirstPaymentDate
	 * FinancialInstrumentAttributes20.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#FirstPaymentDate
	 * FinancialInstrumentAttributes35.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#FirstPaymentDate
	 * FinancialInstrumentAttributes41.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#FirstPaymentDate
	 * FinancialInstrumentAttributes4.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#FirstPaymentDate
	 * FinancialInstrumentAttributes13.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#FirstPaymentDate
	 * FinancialInstrumentAttributes21.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#FirstPaymentDate
	 * FinancialInstrumentAttributes26.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#FirstPaymentDate
	 * FinancialInstrumentAttributes36.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#FirstPaymentDate
	 * FinancialInstrumentAttributes42.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#FirstPaymentDate
	 * FinancialInstrumentAttributes27.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#FirstPaymentDate
	 * FinancialInstrumentAttributes14.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#FirstPaymentDate
	 * FinancialInstrumentAttributes30.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#FirstPaymentDate
	 * FinancialInstrumentAttributes28.FirstPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#FirstPaymentDate
	 * Debt1.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#FirstPaymentDate
	 * FinancialInstrumentAttributes31.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#FirstPaymentDate
	 * FinancialInstrumentAttributes44.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#FirstPaymentDate
	 * FinancialInstrumentAttributes15.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#FirstPaymentDate
	 * FinancialInstrumentAttributes29.FirstPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#FirstPaymentDate
	 * Debt2.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#FirstPaymentDate
	 * FinancialInstrumentAttributes2.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#FirstPaymentDate
	 * FinancialInstrumentAttributes63.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#FirstPaymentDate
	 * FinancialInstrumentAttributes64.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#FirstPaymentDate
	 * FinancialInstrumentAttributes75.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#FirstPaymentDate
	 * FinancialInstrumentAttributes78.FirstPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the first interest payment is due to holders of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.FirstPaymentDate, com.tools20022.repository.msg.Debt1.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.FirstPaymentDate, com.tools20022.repository.msg.Debt2.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.FirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.FirstPaymentDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.FirstPaymentDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate that defines the outstanding principal of the factored security.<br>
	 * Factored securities are debt instruments that have a factor that is used
	 * in the calculation of net money and market value. <br>
	 * Factors can be specified as current, next, previous or end factors.<br>
	 * End factor: portion of principal that is still due at the end of the
	 * financing period.<br>
	 * Previous factor: portion of principal that is still due before the
	 * current factor becomes applicable.<br>
	 * Next factor: rate that will be applicable as of the next factor date.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PreviousFactor
	 * FinancialInstrumentAttributes8.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#CurrentFactor
	 * FinancialInstrumentAttributes8.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#NextFactor
	 * FinancialInstrumentAttributes8.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PreviousFactor
	 * FinancialInstrumentAttributes20.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#CurrentFactor
	 * FinancialInstrumentAttributes20.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#NextFactor
	 * FinancialInstrumentAttributes20.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PreviousFactor
	 * FinancialInstrumentAttributes35.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#CurrentFactor
	 * FinancialInstrumentAttributes35.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#NextFactor
	 * FinancialInstrumentAttributes35.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PreviousFactor
	 * FinancialInstrumentAttributes41.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#CurrentFactor
	 * FinancialInstrumentAttributes41.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#NextFactor
	 * FinancialInstrumentAttributes41.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#PreviousFactor
	 * FinancialInstrumentAttributes6.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#NextFactor
	 * FinancialInstrumentAttributes6.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#PreviousFactor
	 * FinancialInstrumentAttributes9.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#NextFactor
	 * FinancialInstrumentAttributes9.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#PreviousFactor
	 * FinancialInstrumentAttributes18.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#NextFactor
	 * FinancialInstrumentAttributes18.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#PreviousFactor
	 * FinancialInstrumentAttributes22.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#NextFactor
	 * FinancialInstrumentAttributes22.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#PreviousFactor
	 * FinancialInstrumentAttributes32.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#NextFactor
	 * FinancialInstrumentAttributes32.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#PreviousFactor
	 * FinancialInstrumentAttributes38.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#NextFactor
	 * FinancialInstrumentAttributes38.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#PreviousFactor
	 * FinancialInstrumentAttributes7.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#NextFactor
	 * FinancialInstrumentAttributes7.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#PreviousFactor
	 * FinancialInstrumentAttributes5.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#NextFactor
	 * FinancialInstrumentAttributes5.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#PreviousFactor
	 * FinancialInstrumentAttributes11.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#NextFactor
	 * FinancialInstrumentAttributes11.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#PreviousFactor
	 * FinancialInstrumentAttributes10.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#NextFactor
	 * FinancialInstrumentAttributes10.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#PreviousFactor
	 * FinancialInstrumentAttributes19.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#NextFactor
	 * FinancialInstrumentAttributes19.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#PreviousFactor
	 * FinancialInstrumentAttributes16.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#NextFactor
	 * FinancialInstrumentAttributes16.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#PreviousFactor
	 * FinancialInstrumentAttributes23.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#NextFactor
	 * FinancialInstrumentAttributes23.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#PreviousFactor
	 * FinancialInstrumentAttributes24.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#NextFactor
	 * FinancialInstrumentAttributes24.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#PreviousFactor
	 * FinancialInstrumentAttributes33.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#NextFactor
	 * FinancialInstrumentAttributes33.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#PreviousFactor
	 * FinancialInstrumentAttributes34.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#NextFactor
	 * FinancialInstrumentAttributes34.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#PreviousFactor
	 * FinancialInstrumentAttributes39.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#NextFactor
	 * FinancialInstrumentAttributes39.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#PreviousFactor
	 * FinancialInstrumentAttributes40.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#NextFactor
	 * FinancialInstrumentAttributes40.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#PreviousFactor
	 * FinancialInstrumentAttributes43.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#NextFactor
	 * FinancialInstrumentAttributes43.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#PreviousFactor
	 * FinancialInstrumentAttributes45.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#NextFactor
	 * FinancialInstrumentAttributes45.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#PreviousFactor
	 * CorporateActionRate3.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#NextFactor
	 * CorporateActionRate3.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#PreviousFactor
	 * CorporateActionRate14.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#NextFactor
	 * CorporateActionRate14.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#PreviousFactor
	 * CorporateActionRate16.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#NextFactor
	 * CorporateActionRate16.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#PreviousFactor
	 * CorporateActionRate24.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#NextFactor
	 * CorporateActionRate24.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#PreviousFactor
	 * CorporateActionRate27.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#NextFactor
	 * CorporateActionRate27.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#PreviousFactor
	 * CorporateActionRate32.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#NextFactor
	 * CorporateActionRate32.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#PreviousFactor
	 * CorporateActionRate35.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#NextFactor
	 * CorporateActionRate35.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#PreviousFactor
	 * CorporateActionRate41.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#NextFactor
	 * CorporateActionRate41.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PreviousFactor
	 * FinancialInstrumentAttributes4.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#CurrentFactor
	 * FinancialInstrumentAttributes4.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#NextFactor
	 * FinancialInstrumentAttributes4.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PreviousFactor
	 * FinancialInstrumentAttributes13.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#CurrentFactor
	 * FinancialInstrumentAttributes13.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#NextFactor
	 * FinancialInstrumentAttributes13.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PreviousFactor
	 * FinancialInstrumentAttributes21.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#CurrentFactor
	 * FinancialInstrumentAttributes21.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#NextFactor
	 * FinancialInstrumentAttributes21.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PreviousFactor
	 * FinancialInstrumentAttributes26.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#CurrentFactor
	 * FinancialInstrumentAttributes26.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#NextFactor
	 * FinancialInstrumentAttributes26.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PreviousFactor
	 * FinancialInstrumentAttributes36.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#CurrentFactor
	 * FinancialInstrumentAttributes36.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#NextFactor
	 * FinancialInstrumentAttributes36.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PreviousFactor
	 * FinancialInstrumentAttributes42.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#CurrentFactor
	 * FinancialInstrumentAttributes42.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#NextFactor
	 * FinancialInstrumentAttributes42.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PreviousFactor
	 * FinancialInstrumentAttributes27.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#CurrentFactor
	 * FinancialInstrumentAttributes27.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#NextFactor
	 * FinancialInstrumentAttributes27.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PreviousFactor
	 * FinancialInstrumentAttributes14.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#CurrentFactor
	 * FinancialInstrumentAttributes14.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#NextFactor
	 * FinancialInstrumentAttributes14.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PreviousFactor
	 * FinancialInstrumentAttributes30.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#CurrentFactor
	 * FinancialInstrumentAttributes30.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#NextFactor
	 * FinancialInstrumentAttributes30.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PreviousFactor
	 * FinancialInstrumentAttributes28.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#CurrentFactor
	 * FinancialInstrumentAttributes28.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#NextFactor
	 * FinancialInstrumentAttributes28.NextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#CurrentFactor
	 * Debt1.CurrentFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#NextFactor
	 * Debt1.NextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PreviousFactor
	 * Debt1.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PreviousFactor
	 * FinancialInstrumentAttributes31.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CurrentFactor
	 * FinancialInstrumentAttributes31.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#NextFactor
	 * FinancialInstrumentAttributes31.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#EndFactor
	 * FinancialInstrumentAttributes31.EndFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PreviousFactor
	 * FinancialInstrumentAttributes44.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#CurrentFactor
	 * FinancialInstrumentAttributes44.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#NextFactor
	 * FinancialInstrumentAttributes44.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#EndFactor
	 * FinancialInstrumentAttributes44.EndFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PreviousFactor
	 * FinancialInstrumentAttributes15.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#CurrentFactor
	 * FinancialInstrumentAttributes15.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#NextFactor
	 * FinancialInstrumentAttributes15.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PreviousFactor
	 * FinancialInstrumentAttributes29.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#CurrentFactor
	 * FinancialInstrumentAttributes29.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#NextFactor
	 * FinancialInstrumentAttributes29.NextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CurrentFactor
	 * Debt2.CurrentFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#NextFactor
	 * Debt2.NextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PreviousFactor
	 * Debt2.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PreviousFactor
	 * FinancialInstrumentAttributes2.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#CurrentFactor
	 * FinancialInstrumentAttributes2.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#NextFactor
	 * FinancialInstrumentAttributes2.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#PreviousFactor
	 * FinancialInstrumentAttributes48.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#NextFactor
	 * FinancialInstrumentAttributes48.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#PreviousFactor
	 * CorporateActionRate43.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#NextFactor
	 * CorporateActionRate43.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#PreviousFactor
	 * FinancialInstrumentAttributes50.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#NextFactor
	 * FinancialInstrumentAttributes50.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#PreviousFactor
	 * FinancialInstrumentAttributes49.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#NextFactor
	 * FinancialInstrumentAttributes49.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#PreviousFactor
	 * CorporateActionRate56.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#NextFactor
	 * CorporateActionRate56.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#PreviousFactor
	 * FinancialInstrumentAttributes55.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#NextFactor
	 * FinancialInstrumentAttributes55.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#PreviousFactor
	 * FinancialInstrumentAttributes57.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#NextFactor
	 * FinancialInstrumentAttributes57.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#PreviousFactor
	 * FinancialInstrumentAttributes56.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#NextFactor
	 * FinancialInstrumentAttributes56.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PreviousFactor
	 * FinancialInstrumentAttributes63.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#CurrentFactor
	 * FinancialInstrumentAttributes63.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#NextFactor
	 * FinancialInstrumentAttributes63.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PreviousFactor
	 * FinancialInstrumentAttributes64.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#CurrentFactor
	 * FinancialInstrumentAttributes64.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#NextFactor
	 * FinancialInstrumentAttributes64.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#PreviousFactor
	 * FinancialInstrumentAttributes66.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#NextFactor
	 * FinancialInstrumentAttributes66.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PreviousFactor
	 * FinancialInstrumentAttributes65.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextFactor
	 * FinancialInstrumentAttributes65.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#PreviousFactor
	 * FinancialInstrumentAttributes67.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#NextFactor
	 * FinancialInstrumentAttributes67.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#PreviousFactor
	 * CorporateActionRate66.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#NextFactor
	 * CorporateActionRate66.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#PreviousFactor
	 * FinancialInstrumentAttributes70.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#NextFactor
	 * FinancialInstrumentAttributes70.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#PreviousFactor
	 * FinancialInstrumentAttributes69.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#NextFactor
	 * FinancialInstrumentAttributes69.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#PreviousFactor
	 * FinancialInstrumentAttributes71.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#NextFactor
	 * FinancialInstrumentAttributes71.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#PreviousFactor
	 * CorporateActionRate78.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#NextFactor
	 * CorporateActionRate78.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PreviousFactor
	 * FinancialInstrumentAttributes75.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#CurrentFactor
	 * FinancialInstrumentAttributes75.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#NextFactor
	 * FinancialInstrumentAttributes75.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PreviousFactor
	 * FinancialInstrumentAttributes78.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#CurrentFactor
	 * FinancialInstrumentAttributes78.CurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#NextFactor
	 * FinancialInstrumentAttributes78.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#PreviousFactor
	 * FinancialInstrumentAttributes79.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#NextFactor
	 * FinancialInstrumentAttributes79.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PreviousFactor
	 * FinancialInstrumentAttributes81.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextFactor
	 * FinancialInstrumentAttributes81.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#PreviousFactor
	 * FinancialInstrumentAttributes80.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#NextFactor
	 * FinancialInstrumentAttributes80.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#PreviousFactor
	 * FinancialInstrumentAttributes85.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#NextFactor
	 * FinancialInstrumentAttributes85.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#PreviousFactor
	 * FinancialInstrumentAttributes84.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#NextFactor
	 * FinancialInstrumentAttributes84.NextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#PreviousFactor
	 * FinancialInstrumentAttributes83.PreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#NextFactor
	 * FinancialInstrumentAttributes83.NextFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes8.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes20.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes20.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes35.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes41.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes6.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes9.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes9.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes18.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes22.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes22.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes32.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes38.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes38.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes7.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes5.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes11.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes10.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes19.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes16.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes16.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes23.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes24.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes33.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes34.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes34.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes39.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes40.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes43.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes45.NextFactor, com.tools20022.repository.msg.CorporateActionRate3.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate3.NextFactor, com.tools20022.repository.msg.CorporateActionRate14.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate14.NextFactor,
					com.tools20022.repository.msg.CorporateActionRate16.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate16.NextFactor, com.tools20022.repository.msg.CorporateActionRate24.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate24.NextFactor, com.tools20022.repository.msg.CorporateActionRate27.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate27.NextFactor,
					com.tools20022.repository.msg.CorporateActionRate32.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate32.NextFactor, com.tools20022.repository.msg.CorporateActionRate35.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate35.NextFactor, com.tools20022.repository.msg.CorporateActionRate41.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate41.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes4.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes13.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes21.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes26.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes36.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes42.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes27.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes14.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes30.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes28.NextFactor, com.tools20022.repository.msg.Debt1.CurrentFactor,
					com.tools20022.repository.msg.Debt1.NextFactor, com.tools20022.repository.msg.Debt1.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes31.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes31.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.EndFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes44.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.EndFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes15.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes15.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes29.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.NextFactor, com.tools20022.repository.msg.Debt2.CurrentFactor, com.tools20022.repository.msg.Debt2.NextFactor,
					com.tools20022.repository.msg.Debt2.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes2.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes2.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes48.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.NextFactor, com.tools20022.repository.msg.CorporateActionRate43.PreviousFactor, com.tools20022.repository.msg.CorporateActionRate43.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes50.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes49.NextFactor, com.tools20022.repository.msg.CorporateActionRate56.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate56.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes55.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes55.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes57.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes56.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes63.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes64.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes64.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes66.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes67.NextFactor, com.tools20022.repository.msg.CorporateActionRate66.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate66.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes70.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes70.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes69.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes71.NextFactor, com.tools20022.repository.msg.CorporateActionRate78.PreviousFactor,
					com.tools20022.repository.msg.CorporateActionRate78.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes75.CurrentFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.NextFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes78.PreviousFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.CurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes78.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes79.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes80.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes85.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes84.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes84.NextFactor,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes83.NextFactor);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Number identifying a group of underlying assets assigned by the issuer of
	 * a factored security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PoolNumber
	 * FinancialInstrumentAttributes8.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PoolNumber
	 * FinancialInstrumentAttributes20.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PoolNumber
	 * FinancialInstrumentAttributes35.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PoolNumber
	 * FinancialInstrumentAttributes41.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PoolNumber
	 * FinancialInstrumentAttributes4.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PoolNumber
	 * FinancialInstrumentAttributes13.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PoolNumber
	 * FinancialInstrumentAttributes21.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PoolNumber
	 * FinancialInstrumentAttributes26.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PoolNumber
	 * FinancialInstrumentAttributes36.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PoolNumber
	 * FinancialInstrumentAttributes42.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PoolNumber
	 * FinancialInstrumentAttributes27.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PoolNumber
	 * FinancialInstrumentAttributes14.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PoolNumber
	 * FinancialInstrumentAttributes30.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PoolNumber
	 * FinancialInstrumentAttributes28.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#PoolNumber
	 * FinancialInstrumentAttributes1.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PoolNumber
	 * FinancialInstrumentAttributes31.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PoolNumber
	 * FinancialInstrumentAttributes44.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PoolNumber
	 * FinancialInstrumentAttributes15.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PoolNumber
	 * FinancialInstrumentAttributes29.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#PoolNumber
	 * CommonFinancialInstrumentAttributes1.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PoolNumber
	 * FinancialInstrumentAttributes2.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PoolNumber
	 * FinancialInstrumentAttributes63.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PoolNumber
	 * FinancialInstrumentAttributes64.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PoolNumber
	 * FinancialInstrumentAttributes75.PoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PoolNumber
	 * FinancialInstrumentAttributes78.PoolNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes1.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes31.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes15.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.PoolNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes63.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.PoolNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PoolNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.PoolNumber);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Indicates whether the interest rate of an interest bearing instrument is
	 * reset periodically.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#VariableRateIndicator
	 * FinancialInstrumentAttributes8.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#VariableRateIndicator
	 * FinancialInstrumentAttributes20.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#VariableRateIndicator
	 * FinancialInstrumentAttributes35.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#VariableRateIndicator
	 * FinancialInstrumentAttributes41.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#VariableRateIndicator
	 * FinancialInstrumentAttributes4.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#VariableRateIndicator
	 * FinancialInstrumentAttributes13.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#VariableRateIndicator
	 * FinancialInstrumentAttributes21.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#VariableRateIndicator
	 * FinancialInstrumentAttributes26.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#VariableRateIndicator
	 * FinancialInstrumentAttributes36.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#VariableRateIndicator
	 * FinancialInstrumentAttributes42.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#VariableRateIndicator
	 * FinancialInstrumentAttributes27.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#VariableRateIndicator
	 * FinancialInstrumentAttributes14.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#VariableRateIndicator
	 * FinancialInstrumentAttributes30.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#VariableRateIndicator
	 * FinancialInstrumentAttributes28.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#VariableRateIndicator
	 * Debt1.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#VariableRateIndicator
	 * FinancialInstrumentAttributes31.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#VariableRateIndicator
	 * FinancialInstrumentAttributes44.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#VariableRateIndicator
	 * FinancialInstrumentAttributes15.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#VariableRateIndicator
	 * FinancialInstrumentAttributes29.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#VariableRateIndicator
	 * Debt2.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#VariableRateIndicator
	 * FinancialInstrumentAttributes2.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#VariableRateIndicator
	 * FinancialInstrumentAttributes63.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#VariableRateIndicator
	 * FinancialInstrumentAttributes64.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#VariableRateIndicator
	 * FinancialInstrumentAttributes75.VariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#VariableRateIndicator
	 * FinancialInstrumentAttributes78.VariableRateIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest rate of an interest bearing instrument is reset periodically."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes20.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes41.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes13.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes26.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes42.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes14.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes28.VariableRateIndicator,
					com.tools20022.repository.msg.Debt1.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes31.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes15.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.VariableRateIndicator, com.tools20022.repository.msg.Debt2.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes63.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.VariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes75.VariableRateIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.VariableRateIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the issuer has the right to pay the security prior to
	 * maturity. Also called RetractableIndicator.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#CallableIndicator
	 * FinancialInstrumentAttributes8.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#CallableIndicator
	 * FinancialInstrumentAttributes20.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#CallableIndicator
	 * FinancialInstrumentAttributes35.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#CallableIndicator
	 * FinancialInstrumentAttributes41.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#CallableIndicator
	 * FinancialInstrumentAttributes4.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#CallableIndicator
	 * FinancialInstrumentAttributes13.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#CallableIndicator
	 * FinancialInstrumentAttributes21.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#CallableIndicator
	 * FinancialInstrumentAttributes26.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#CallableIndicator
	 * FinancialInstrumentAttributes36.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#CallableIndicator
	 * FinancialInstrumentAttributes42.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#CallableIndicator
	 * FinancialInstrumentAttributes27.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#CallableIndicator
	 * FinancialInstrumentAttributes14.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#CallableIndicator
	 * FinancialInstrumentAttributes30.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#CallableIndicator
	 * FinancialInstrumentAttributes28.CallableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#CallableIndicator
	 * Debt1.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#CallableIndicator
	 * FinancialInstrumentStipulations.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CallableIndicator
	 * FinancialInstrumentAttributes31.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#CallableIndicator
	 * FinancialInstrumentStipulations2.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#CallableIndicator
	 * FinancialInstrumentAttributes44.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#CallableIndicator
	 * FinancialInstrumentAttributes15.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#CallableIndicator
	 * FinancialInstrumentAttributes29.CallableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CallableIndicator
	 * Debt2.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#CallableIndicator
	 * FinancialInstrumentAttributes2.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#CallableIndicator
	 * FinancialInstrumentAttributes63.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#CallableIndicator
	 * FinancialInstrumentAttributes64.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#CallableIndicator
	 * FinancialInstrumentAttributes75.CallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#CallableIndicator
	 * FinancialInstrumentAttributes78.CallableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CallableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes20.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes41.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes13.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes26.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes42.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes14.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes28.CallableIndicator, com.tools20022.repository.msg.Debt1.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes31.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes44.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes29.CallableIndicator, com.tools20022.repository.msg.Debt2.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes63.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.CallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes75.CallableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.CallableIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the holder has the right to ask for redemption of the
	 * security prior to final maturity. Also called RedeemableIndicator.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PutableIndicator
	 * FinancialInstrumentAttributes8.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PutableIndicator
	 * FinancialInstrumentAttributes20.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PutableIndicator
	 * FinancialInstrumentAttributes35.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PutableIndicator
	 * FinancialInstrumentAttributes41.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PutableIndicator
	 * FinancialInstrumentAttributes4.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PutableIndicator
	 * FinancialInstrumentAttributes13.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PutableIndicator
	 * FinancialInstrumentAttributes21.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PutableIndicator
	 * FinancialInstrumentAttributes26.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PutableIndicator
	 * FinancialInstrumentAttributes36.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PutableIndicator
	 * FinancialInstrumentAttributes42.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PutableIndicator
	 * FinancialInstrumentAttributes27.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PutableIndicator
	 * FinancialInstrumentAttributes14.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PutableIndicator
	 * FinancialInstrumentAttributes30.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PutableIndicator
	 * FinancialInstrumentAttributes28.PutableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PutableIndicator
	 * Debt1.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PutableIndicator
	 * FinancialInstrumentStipulations.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PutableIndicator
	 * FinancialInstrumentAttributes31.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PutableIndicator
	 * FinancialInstrumentStipulations2.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PutableIndicator
	 * FinancialInstrumentAttributes44.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PutableIndicator
	 * FinancialInstrumentAttributes15.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PutableIndicator
	 * FinancialInstrumentAttributes29.PutableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PutableIndicator
	 * Debt2.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PutableIndicator
	 * FinancialInstrumentAttributes2.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PutableIndicator
	 * FinancialInstrumentAttributes63.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PutableIndicator
	 * FinancialInstrumentAttributes64.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PutableIndicator
	 * FinancialInstrumentAttributes75.PutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PutableIndicator
	 * FinancialInstrumentAttributes78.PutableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PutableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PutableIndicator, com.tools20022.repository.msg.Debt1.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes31.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes29.PutableIndicator, com.tools20022.repository.msg.Debt2.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes63.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.PutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PutableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.PutableIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Rate of return anticipated on a bond when held until maturity date.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#YieldToMaturityRate
	 * FinancialInstrumentAttributes35.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#YieldToMaturityRate
	 * FinancialInstrumentAttributes41.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#YieldToMaturityRate
	 * FinancialInstrumentAttributes36.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#YieldToMaturityRate
	 * FinancialInstrumentAttributes42.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#YieldToMaturityRate
	 * FinancialInstrumentAttributes63.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#YieldToMaturityRate
	 * FinancialInstrumentAttributes64.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#YieldToMaturityRate
	 * FinancialInstrumentAttributes75.YieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#YieldToMaturityRate
	 * FinancialInstrumentAttributes78.YieldToMaturityRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of return anticipated on a bond when held until maturity date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute YieldToMaturityRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes35.YieldToMaturityRate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.YieldToMaturityRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.YieldToMaturityRate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.YieldToMaturityRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.YieldToMaturityRate, com.tools20022.repository.msg.FinancialInstrumentAttributes64.YieldToMaturityRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.YieldToMaturityRate, com.tools20022.repository.msg.FinancialInstrumentAttributes78.YieldToMaturityRate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of unpaid interest (on bonds which have defaulted and have
	 * subsequently restructured), which is capitalized and added to the
	 * original principal amount of the bond.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#AccruedCapitalisationAmount
	 * OtherAmounts12.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#AccruedCapitalisationAmount
	 * OtherAmounts14.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#AccruedCapitalisationAmount
	 * OtherAmounts20.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#AccruedCapitalisationAmount
	 * OtherAmounts4.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#AccruedCapitalisationAmount
	 * OtherAmounts5.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#AccruedCapitalisationAmount
	 * OtherAmounts17.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#AccruedCapitalisationAmount
	 * OtherAmounts23.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#AccruedCapitalisationAmount
	 * OtherAmounts3.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#AccruedCapitalisationAmount
	 * OtherAmounts7.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#AccruedCapitalisationAmount
	 * OtherAmounts9.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#AccruedCapitalisationAmount
	 * OtherAmounts10.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#AccruedCapitalisationAmount
	 * OtherAmounts18.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#AccruedCapitalisationAmount
	 * OtherAmounts24.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#AccruedCapitalisationAmount
	 * OtherAmounts13.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#AccruedCapitalisationAmount
	 * OtherAmounts1.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#AccruedCapitalisationAmount
	 * OtherAmounts16.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#AccruedCapitalisationAmount
	 * OtherAmounts2.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#AccruedCapitalisationAmount
	 * OtherAmounts6.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#AccruedCapitalisationAmount
	 * OtherAmounts15.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#AccruedCapitalisationAmount
	 * OtherAmounts22.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#AccruedCapitalisationAmount
	 * OtherAmounts28.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#AccruedCapitalisationAmount
	 * OtherAmounts30.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#AccruedCapitalisationAmount
	 * OtherAmounts31.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#AccruedCapitalisationAmount
	 * OtherAmounts29.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#AccruedCapitalisationAmount
	 * OtherAmounts35.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#AccruedCapitalisationAmount
	 * OtherAmounts34.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#AccruedCapitalisationAmount
	 * OtherAmounts38.AccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#AccruedCapitalisationAmount
	 * OtherAmounts33.AccruedCapitalisationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedCapitalisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccruedCapitalisationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts14.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts20.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts4.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts5.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts17.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts23.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts3.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts7.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts9.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts10.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts18.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts24.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts13.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts1.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts16.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts2.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts6.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts15.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts22.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts28.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts30.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts31.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts29.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts35.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts34.AccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts38.AccruedCapitalisationAmount,
					com.tools20022.repository.msg.OtherAmounts33.AccruedCapitalisationAmount);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Next payment date of an interest bearing financial instrument.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#NextCouponDate
	 * FinancialInstrumentAttributes6.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#NextCouponDate
	 * FinancialInstrumentAttributes9.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#NextCouponDate
	 * FinancialInstrumentAttributes18.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#NextCouponDate
	 * FinancialInstrumentAttributes22.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#NextCouponDate
	 * FinancialInstrumentAttributes32.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#NextCouponDate
	 * FinancialInstrumentAttributes38.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#NextCouponDate
	 * FinancialInstrumentAttributes7.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#NextCouponDate
	 * FinancialInstrumentAttributes5.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#NextCouponDate
	 * FinancialInstrumentAttributes11.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#NextCouponDate
	 * FinancialInstrumentAttributes10.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#NextCouponDate
	 * FinancialInstrumentAttributes19.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#NextCouponDate
	 * FinancialInstrumentAttributes16.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#NextCouponDate
	 * FinancialInstrumentAttributes23.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#NextCouponDate
	 * FinancialInstrumentAttributes24.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#NextCouponDate
	 * FinancialInstrumentAttributes33.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#NextCouponDate
	 * FinancialInstrumentAttributes34.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#NextCouponDate
	 * FinancialInstrumentAttributes39.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#NextCouponDate
	 * FinancialInstrumentAttributes40.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#NextCouponDate
	 * FinancialInstrumentAttributes43.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#NextCouponDate
	 * FinancialInstrumentAttributes45.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#NextCouponDate
	 * FinancialInstrumentAttributes48.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#NextCouponDate
	 * FinancialInstrumentAttributes50.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#NextCouponDate
	 * FinancialInstrumentAttributes49.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#NextCouponDate
	 * FinancialInstrumentAttributes55.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#NextCouponDate
	 * FinancialInstrumentAttributes57.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#NextCouponDate
	 * FinancialInstrumentAttributes56.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#NextCouponDate
	 * FinancialInstrumentAttributes66.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextCouponDate
	 * FinancialInstrumentAttributes65.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#NextCouponDate
	 * FinancialInstrumentAttributes67.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#NextCouponDate
	 * FinancialInstrumentAttributes70.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#NextCouponDate
	 * FinancialInstrumentAttributes69.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#NextCouponDate
	 * FinancialInstrumentAttributes71.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#NextCouponDate
	 * FinancialInstrumentAttributes79.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextCouponDate
	 * FinancialInstrumentAttributes81.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#NextCouponDate
	 * FinancialInstrumentAttributes80.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#NextCouponDate
	 * FinancialInstrumentAttributes85.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#NextCouponDate
	 * FinancialInstrumentAttributes84.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#NextCouponDate
	 * FinancialInstrumentAttributes83.NextCouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NextCouponDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes6.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes55.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes56.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes71.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes85.NextCouponDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes84.NextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes83.NextCouponDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * The date that the current factor will be changed to a new factor.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#NextFactorDate
	 * Debt1.NextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#NextFactorDate
	 * FinancialInstrumentAttributes31.NextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#NextFactorDate
	 * FinancialInstrumentAttributes44.NextFactorDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#NextFactorDate
	 * Debt2.NextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#NextFactorDate
	 * FinancialInstrumentAttributes2.NextFactorDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date that the current factor will be changed to a new factor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NextFactorDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.NextFactorDate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.NextFactorDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.NextFactorDate, com.tools20022.repository.msg.Debt2.NextFactorDate, com.tools20022.repository.msg.FinancialInstrumentAttributes2.NextFactorDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the payment of the coupon (interest) on a bond is off
	 * the normal schedule.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#OddCouponIndicator
	 * Debt1.OddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#OddCouponIndicator
	 * FinancialInstrumentAttributes31.OddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#OddCouponIndicator
	 * FinancialInstrumentAttributes44.OddCouponIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#OddCouponIndicator
	 * Debt2.OddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#OddCouponIndicator
	 * FinancialInstrumentAttributes2.OddCouponIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddCouponIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OddCouponIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.OddCouponIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes31.OddCouponIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.OddCouponIndicator, com.tools20022.repository.msg.Debt2.OddCouponIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes2.OddCouponIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * The program under which a commercial paper is issued. The values that are
	 * most used are: 0 = N/A 1 = 3(a)3 2 = 4(2) 3 = 3(a)4 4 = 3(c)7 5 = 144A 6
	 * = 3(a)2 99 = Other
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#CPProgram
	 * Debt1.CPProgram}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CPProgram
	 * Debt2.CPProgram}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CPProgram = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.CPProgram, com.tools20022.repository.msg.Debt2.CPProgram);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Registration type of a commercial paper issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#CPRegistrationType
	 * Debt1.CPRegistrationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CPRegistrationType
	 * Debt2.CPRegistrationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPRegistrationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration type of a commercial paper issuance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CPRegistrationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.CPRegistrationType, com.tools20022.repository.msg.Debt2.CPRegistrationType);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether the interest bearing security is convertible into
	 * another type of security.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#ConvertibleIndicator
	 * Debt1.ConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#ConvertibleIndicator
	 * FinancialInstrumentStipulations.ConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ConvertibleIndicator
	 * FinancialInstrumentAttributes31.ConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#ConvertibleIndicator
	 * FinancialInstrumentStipulations2.ConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ConvertibleIndicator
	 * FinancialInstrumentAttributes44.ConvertibleIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CouponRange
	 * Debt2.CouponRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ConvertibleIndicator
	 * FinancialInstrumentAttributes2.ConvertibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing security is convertible into another type of security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConvertibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConvertibleIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.ConvertibleIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.ConvertibleIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.ConvertibleIndicator,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.ConvertibleIndicator, com.tools20022.repository.msg.Debt2.CouponRange, com.tools20022.repository.msg.FinancialInstrumentAttributes2.ConvertibleIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PreFundedIndicator
	 * Debt1.PreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PreFundedIndicator
	 * FinancialInstrumentStipulations.PreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PreFundedIndicator
	 * FinancialInstrumentStipulations2.PreFundedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PreFundedIndicator
	 * Debt2.PreFundedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFundedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreFundedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PreFundedIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.PreFundedIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PreFundedIndicator, com.tools20022.repository.msg.Debt2.PreFundedIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#EscrowedIndicator
	 * Debt1.EscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#EscrowedIndicator
	 * FinancialInstrumentStipulations.EscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#EscrowedIndicator
	 * FinancialInstrumentStipulations2.EscrowedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#EscrowedIndicator
	 * Debt2.EscrowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EscrowedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.EscrowedIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.EscrowedIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.EscrowedIndicator, com.tools20022.repository.msg.Debt2.EscrowedIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security has no maturity date.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PerpetualIndicator
	 * Debt1.PerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PerpetualIndicator
	 * FinancialInstrumentStipulations.PerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PerpetualIndicator
	 * FinancialInstrumentStipulations2.PerpetualIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PerpetualIndicator
	 * Debt2.PerpetualIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerpetualIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the security has no maturity date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PerpetualIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PerpetualIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.PerpetualIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PerpetualIndicator, com.tools20022.repository.msg.Debt2.PerpetualIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a subordinated security.
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#SubordinatedIndicator
	 * Debt1.SubordinatedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#SubordinatedIndicator
	 * Debt2.SubordinatedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a subordinated security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubordinatedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.SubordinatedIndicator, com.tools20022.repository.msg.Debt2.SubordinatedIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is extendible,eg, repayment may be
	 * extended or maturity changed.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#ExtendibleIndicator
	 * Debt1.ExtendibleIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#ExtendibleIndicator
	 * Debt2.ExtendibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExtendibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ExtendibleIndicator, com.tools20022.repository.msg.Debt2.ExtendibleIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Period during which a date might be extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ExtendiblePeriodDebt
	 * DateTimePeriod.ExtendiblePeriodDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#ExtendiblePeriod
	 * Debt1.ExtendiblePeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#ExtendiblePeriod
	 * Debt2.ExtendiblePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a date might be extended."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExtendiblePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ExtendiblePeriod, com.tools20022.repository.msg.Debt2.ExtendiblePeriod);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount for which a security can be overalloted (as in greenshoe option).
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#OverAllotmentAmount
	 * Debt1.OverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#OverAllotmentAmount
	 * FinancialInstrumentStipulations.OverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#OverAllotmentAmount
	 * FinancialInstrumentStipulations2.OverAllotmentAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#OverAllotmentAmount
	 * Debt2.OverAllotmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OverAllotmentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.OverAllotmentAmount, com.tools20022.repository.msg.FinancialInstrumentStipulations.OverAllotmentAmount,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.OverAllotmentAmount, com.tools20022.repository.msg.Debt2.OverAllotmentAmount);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage for which a security can be overalloted (as in greenshoe
	 * option).
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#OverAllotmentRate
	 * Debt1.OverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#OverAllotmentRate
	 * FinancialInstrumentStipulations.OverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#OverAllotmentRate
	 * FinancialInstrumentStipulations2.OverAllotmentRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#OverAllotmentRate
	 * Debt2.OverAllotmentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OverAllotmentRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.OverAllotmentRate, com.tools20022.repository.msg.FinancialInstrumentStipulations.OverAllotmentRate,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.OverAllotmentRate, com.tools20022.repository.msg.Debt2.OverAllotmentRate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether repayment is made via regular principal and interest
	 * payments over time.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#AmortisableIndicator
	 * Debt1.AmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#AmortisableIndicator
	 * FinancialInstrumentStipulations.AmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#AlternativeMinimumTaxIndicator
	 * FinancialInstrumentStipulations.AlternativeMinimumTaxIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#AmortisableIndicator
	 * FinancialInstrumentStipulations2.AmortisableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#AmortisableIndicator
	 * Debt2.AmortisableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether repayment is made via regular principal and interest payments over time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmortisableIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.AmortisableIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.AmortisableIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.AlternativeMinimumTaxIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.AmortisableIndicator,
					com.tools20022.repository.msg.Debt2.AmortisableIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the interest amount is capitalised until maturity date
	 * or paid out at each interest payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
	 * DistributionPolicyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#CapitalisedInterest
	 * Debt1.CapitalisedInterest}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#CapitalisedInterest
	 * Debt2.CapitalisedInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalisedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CapitalisedInterest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.CapitalisedInterest, com.tools20022.repository.msg.Debt2.CapitalisedInterest);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Nominal value per security unit.
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#ActualDenominationAmount
	 * Debt1.ActualDenominationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#ActualDenominationAmount
	 * Debt2.ActualDenominationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDenominationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value per security unit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActualDenominationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ActualDenominationAmount, com.tools20022.repository.msg.Debt2.ActualDenominationAmount);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of pieces composing a pool of financial assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#Pieces Debt1.Pieces}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#Pieces Debt2.Pieces}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pieces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of pieces composing a pool of financial assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Pieces = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.Pieces, com.tools20022.repository.msg.Debt2.Pieces);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Collection of assets by which a security is backed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PoolsMaximum
	 * Debt1.PoolsMaximum}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PoolsMaximum
	 * Debt2.PoolsMaximum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsMaximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of assets by which a security is backed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolsMaximum = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PoolsMaximum, com.tools20022.repository.msg.Debt2.PoolsMaximum);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per million the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PoolsPerMillion
	 * Debt1.PoolsPerMillion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PoolsPerMillion
	 * Debt2.PoolsPerMillion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerMillion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolsPerMillion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PoolsPerMillion, com.tools20022.repository.msg.Debt2.PoolsPerMillion);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per lot the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PoolsPerLot
	 * Debt1.PoolsPerLot}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PoolsPerLot
	 * Debt2.PoolsPerLot}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolsPerLot = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PoolsPerLot, com.tools20022.repository.msg.Debt2.PoolsPerLot);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per trade the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PoolsPerTrade
	 * Debt1.PoolsPerTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PoolsPerTrade
	 * Debt2.PoolsPerTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolsPerTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PoolsPerTrade, com.tools20022.repository.msg.Debt2.PoolsPerTrade);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether a penalty might be imposed to the borrower of a
	 * mortgage in case of prepayments occurring during the lockout period.
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#ConstantPrePaymentPenaltyIndicator
	 * Debt1.ConstantPrePaymentPenaltyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#ConstantPrePaymentPenaltyIndicator
	 * Debt2.ConstantPrePaymentPenaltyIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentPenalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConstantPrePaymentPenalty = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConstantPrePaymentPenaltyIndicator, com.tools20022.repository.msg.Debt2.ConstantPrePaymentPenaltyIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentPenalty";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Speed of unscheduled partial or complete payment of the principal amount
	 * outstanding on a debt obligation before its due date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
	 * PrePaymentSpeedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PrePaymentSpeed
	 * Debt1.PrePaymentSpeed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaymentSpeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PrePaymentSpeed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PrePaymentSpeed);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}
	};
	/**
	 * Measure of prepayment as a yield of the current outstanding loan balance.
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#ConstantPrePaymentYield
	 * Debt1.ConstantPrePaymentYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#ConstantPrePaymentYield
	 * Debt2.ConstantPrePaymentYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a yield of the current outstanding loan balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConstantPrePaymentYield = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConstantPrePaymentYield, com.tools20022.repository.msg.Debt2.ConstantPrePaymentYield);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average coupon of the fixed income instrument
	 * (expressed as a percentage).
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#WeightedAverageCoupon
	 * Debt1.WeightedAverageCoupon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#WeightedAverageCoupon
	 * Debt2.WeightedAverageCoupon}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WeightedAverageCoupon = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.WeightedAverageCoupon, com.tools20022.repository.msg.Debt2.WeightedAverageCoupon);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average life of the fixed income instrument
	 * (expressed in months).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#WeightedAverageLife
	 * Debt1.WeightedAverageLife}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#WeightedAverageLife
	 * Debt2.WeightedAverageLife}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average life of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WeightedAverageLife = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.WeightedAverageLife, com.tools20022.repository.msg.Debt2.WeightedAverageLife);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average loan of the fixed income instrument
	 * (expressed in months).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#WeightedAverageLoan
	 * Debt1.WeightedAverageLoan}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#WeightedAverageLoan
	 * Debt2.WeightedAverageLoan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average loan of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WeightedAverageLoan = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.WeightedAverageLoan, com.tools20022.repository.msg.Debt2.WeightedAverageLoan);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average maturity of the fixed income instrument
	 * (expressed in months).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#WeightedAverageMaturity
	 * Debt1.WeightedAverageMaturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#WeightedAverageMaturity
	 * Debt2.WeightedAverageMaturity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average maturity of the fixed income instrument (expressed in months)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WeightedAverageMaturity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.WeightedAverageMaturity, com.tools20022.repository.msg.Debt2.WeightedAverageMaturity);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether the instruments is backed by any kind of asset or not.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#InsuredIndicator
	 * Debt1.InsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#InsuredIndicator
	 * FinancialInstrumentStipulations.InsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#InsuredIndicator
	 * FinancialInstrumentStipulations2.InsuredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#InsuredIndicator
	 * Debt2.InsuredIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruments is backed by any kind of asset or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InsuredIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.InsuredIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations.InsuredIndicator,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.InsuredIndicator, com.tools20022.repository.msg.Debt2.InsuredIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is bank qualified (usually applies to loan
	 * products).
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#BankQualifiedIndicator
	 * Debt1.BankQualifiedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#BankQualifiedIndicator
	 * Debt2.BankQualifiedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is bank qualified (usually applies to loan products)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BankQualified = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.BankQualifiedIndicator, com.tools20022.repository.msg.Debt2.BankQualifiedIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankQualified";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates an instruction to reinvest dividends in the underlying security
	 * (or proceeds at maturity in a similar instrument) if the current rate
	 * equals the rate specified or better.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#AutoReinvestment
	 * FinancialInstrumentStipulations.AutoReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#AutoReinvestment
	 * FinancialInstrumentStipulations2.AutoReinvestment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#AutoReinvestment
	 * Debt2.AutoReinvestment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AutoReinvestment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.AutoReinvestment, com.tools20022.repository.msg.FinancialInstrumentStipulations2.AutoReinvestment,
					com.tools20022.repository.msg.Debt2.AutoReinvestment);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates an instruction to override an investment's default start and/or
	 * end date with a custom date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CustomDateDebt
	 * DateTimePeriod.CustomDateDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#CustomDate
	 * FinancialInstrumentStipulations.CustomDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#CustomDate
	 * FinancialInstrumentStipulations2.CustomDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to override an investment's default start and/or end date with a custom date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CustomDate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.CustomDate, com.tools20022.repository.msg.FinancialInstrumentStipulations2.CustomDate);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates an instruction or attribute giving the number of days to be
	 * included in the look-back period for the investment. Some options allow
	 * exercise based on the underlying asset's optimal value over the look-back
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#LookBack
	 * FinancialInstrumentStipulations.LookBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#LookBack
	 * FinancialInstrumentStipulations2.LookBack}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#LookBack
	 * Debt2.LookBack}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LookBack = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.LookBack, com.tools20022.repository.msg.FinancialInstrumentStipulations2.LookBack, com.tools20022.repository.msg.Debt2.LookBack);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum denomination of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
	 * SecuritiesQuantity.MinimumDenominationDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#MinimumDenomination
	 * FinancialInstrumentStipulations.MinimumDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#MinimumDenomination
	 * FinancialInstrumentStipulations2.MinimumDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum denomination of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumDenomination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.MinimumDenomination, com.tools20022.repository.msg.FinancialInstrumentStipulations2.MinimumDenomination);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum number of time the collateral can be substitute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#MaximumSubstitution
	 * FinancialInstrumentStipulations.MaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#MaximumSubstitution
	 * FinancialInstrumentStipulations2.MaximumSubstitution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#MaximumSubstitution
	 * Debt2.MaximumSubstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of time the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumSubstitution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.MaximumSubstitution, com.tools20022.repository.msg.FinancialInstrumentStipulations2.MaximumSubstitution,
					com.tools20022.repository.msg.Debt2.MaximumSubstitution);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable increments of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
	 * SecuritiesQuantity.MinimumIncrementDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#MinimumIncrement
	 * FinancialInstrumentStipulations.MinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#MinimumIncrement
	 * FinancialInstrumentStipulations2.MinimumIncrement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#MinimumIncrement
	 * Debt2.MinimumIncrement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable increments of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumIncrement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.MinimumIncrement, com.tools20022.repository.msg.FinancialInstrumentStipulations2.MinimumIncrement,
					com.tools20022.repository.msg.Debt2.MinimumIncrement);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates a search criterion used when looking to buy a bond,
	 * particularly an mortgage back security (MBS), issued in a particular
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Production
	 * FinancialInstrumentStipulations.Production}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Production
	 * FinancialInstrumentStipulations2.Production}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Production"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Production = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.Production, com.tools20022.repository.msg.FinancialInstrumentStipulations2.Production);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144).
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#RestrictedIndicator
	 * FinancialInstrumentStipulations.RestrictedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#RestrictedIndicator
	 * FinancialInstrumentStipulations2.RestrictedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Restricted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.RestrictedIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.RestrictedIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the frequency at which the bond is re-rated and therefore
	 * re-priced (bond attribute, particularly of floating rate and index linked
	 * instruments).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PriceFrequency
	 * FinancialInstrumentStipulations.PriceFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PriceFrequency
	 * FinancialInstrumentStipulations2.PriceFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PriceFrequency
	 * Debt2.PriceFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.PriceFrequency, com.tools20022.repository.msg.FinancialInstrumentStipulations2.PriceFrequency,
					com.tools20022.repository.msg.Debt2.PriceFrequency);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of times collateral can be substituted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#SubstitutionFrequency
	 * FinancialInstrumentStipulations.SubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#SubstitutionFrequency
	 * FinancialInstrumentStipulations2.SubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#SubstitutionFrequency
	 * Debt2.SubstitutionFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of times collateral can be substituted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubstitutionFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.SubstitutionFrequency, com.tools20022.repository.msg.FinancialInstrumentStipulations2.SubstitutionFrequency,
					com.tools20022.repository.msg.Debt2.SubstitutionFrequency);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Number of remaining times the collateral can be substitute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#SubstitutionLeft
	 * FinancialInstrumentStipulations.SubstitutionLeft}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#SubstitutionLeft
	 * FinancialInstrumentStipulations2.SubstitutionLeft}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#SubstitutionLeft
	 * Debt2.SubstitutionLeft}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionLeft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of remaining times the collateral can be substitute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubstitutionLeft = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.SubstitutionLeft, com.tools20022.repository.msg.FinancialInstrumentStipulations2.SubstitutionLeft,
					com.tools20022.repository.msg.Debt2.SubstitutionLeft);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates a search criterion when looking to buy an mortgage back
	 * security (MBS) that either is [yes] or is not [no] an entire pool.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#WholePoolIndicator
	 * FinancialInstrumentStipulations.WholePoolIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#WholePoolIndicator
	 * FinancialInstrumentStipulations2.WholePoolIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholePool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WholePool = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.WholePoolIndicator, com.tools20022.repository.msg.FinancialInstrumentStipulations2.WholePoolIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WholePool";
			definition = "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the issue is subject to alternative minimum taxation
	 * (used for municipal bonds).
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#AlternativeMinimumTaxIndicator
	 * FinancialInstrumentStipulations2.AlternativeMinimumTaxIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#AlternativeMinimumTaxIndicator
	 * Debt2.AlternativeMinimumTaxIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AlternativeMinimumTax = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations2.AlternativeMinimumTaxIndicator, com.tools20022.repository.msg.Debt2.AlternativeMinimumTaxIndicator);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the interest applicable to the next interest payment period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
	 * InterestCalculation.DebtInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interest applicable to the next interest payment period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NextInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextInterest";
			definition = "Specifies the interest applicable to the next interest payment period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.DebtInstrument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time to which a date might be extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time to which a date might be extended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExtendibleDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleDate";
			definition = "Date/time to which a date might be extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a sinkung fund. A sinking fund is a
	 * bond in which part of the total principal amount is repaid according to
	 * agreed schedules of dates, amounts and prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinkableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SinkableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SinkableIndicator";
			definition = "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the lender is assured partial or full payment by a
	 * third party if the borrower defaults.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Insured = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insured";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of stipulation expressing geographical constraints on a fixed income
	 * instrument. It is expressed with a state or country abbreviation and a
	 * minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in
	 * Californian assets).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#Geographics
	 * Debt2.Geographics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Geographics = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt2.Geographics);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PaymentCurrency
	 * Debt2.PaymentCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt2.PaymentCurrency);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Price that includes interest that has accrued since issue of the most
	 * recent coupon payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#DirtyPrice
	 * UnderlyingAttributes.DirtyPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#DirtyPrice
	 * UnderlyingAttributes2.DirtyPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirtyPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price that includes interest that has accrued since issue of the most recent coupon payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DirtyPrice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.DirtyPrice, com.tools20022.repository.msg.UnderlyingAttributes2.DirtyPrice);
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "Price that includes interest that has accrued since issue of the most recent coupon payment.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Seniority of a specific debt instrument, that is the order of repayment
	 * in the event of a sale or bankruptcy of the issuer of the debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
	 * DebtInstrumentSeniorityTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtSeniority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebtSeniority = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Debt.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Debt";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt, com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt,
						com.tools20022.repository.entity.InterestCalculation.DebtInstrument);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Debt, com.tools20022.repository.msg.FinancialInstrument28.Debt,
						com.tools20022.repository.msg.SingleQuote1.Stipulations, com.tools20022.repository.msg.SingleQuote1.UnderlyingStipulations, com.tools20022.repository.choice.QuoteCancellation1Choice.Stipulations,
						com.tools20022.repository.choice.QuoteCancellation1Choice.UnderlyingStipulations, com.tools20022.repository.msg.QuoteRequest1.Stipulations, com.tools20022.repository.msg.QuoteRequest1.UnderlyingStipulations,
						com.tools20022.repository.msg.RequestForQuote.Stipulations, com.tools20022.repository.msg.RequestForQuote.UnderlyingStipulations, com.tools20022.repository.msg.Quote1.Stipulations,
						com.tools20022.repository.msg.Quote1.UnderlyingStipulations, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.DebtInstrumentAttributes, com.tools20022.repository.msg.TransparencyDataReport10.Bond,
						com.tools20022.repository.msg.InterestRateDerivative5.UnderlyingBond, com.tools20022.repository.msg.SecurityInstrumentDescription13.DebtInstrumentAttributes);
				subType_lazy = () -> Arrays.asList(Loan.mmObject());
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Debt.PaymentDirectionIndicator, com.tools20022.repository.entity.Debt.NextCallableDate, com.tools20022.repository.entity.Debt.PutableDate,
						com.tools20022.repository.entity.Debt.DatedDate, com.tools20022.repository.entity.Debt.FirstPaymentDate, com.tools20022.repository.entity.Debt.Factor, com.tools20022.repository.entity.Debt.PoolNumber,
						com.tools20022.repository.entity.Debt.VariableRateIndicator, com.tools20022.repository.entity.Debt.CallableIndicator, com.tools20022.repository.entity.Debt.PutableIndicator,
						com.tools20022.repository.entity.Debt.YieldToMaturityRate, com.tools20022.repository.entity.Debt.AccruedCapitalisationAmount, com.tools20022.repository.entity.Debt.NextCouponDate,
						com.tools20022.repository.entity.Debt.NextFactorDate, com.tools20022.repository.entity.Debt.OddCouponIndicator, com.tools20022.repository.entity.Debt.CPProgram,
						com.tools20022.repository.entity.Debt.CPRegistrationType, com.tools20022.repository.entity.Debt.ConvertibleIndicator, com.tools20022.repository.entity.Debt.PreFundedIndicator,
						com.tools20022.repository.entity.Debt.EscrowedIndicator, com.tools20022.repository.entity.Debt.PerpetualIndicator, com.tools20022.repository.entity.Debt.SubordinatedIndicator,
						com.tools20022.repository.entity.Debt.ExtendibleIndicator, com.tools20022.repository.entity.Debt.ExtendiblePeriod, com.tools20022.repository.entity.Debt.OverAllotmentAmount,
						com.tools20022.repository.entity.Debt.OverAllotmentRate, com.tools20022.repository.entity.Debt.AmortisableIndicator, com.tools20022.repository.entity.Debt.CapitalisedInterest,
						com.tools20022.repository.entity.Debt.ActualDenominationAmount, com.tools20022.repository.entity.Debt.Pieces, com.tools20022.repository.entity.Debt.PoolsMaximum,
						com.tools20022.repository.entity.Debt.PoolsPerMillion, com.tools20022.repository.entity.Debt.PoolsPerLot, com.tools20022.repository.entity.Debt.PoolsPerTrade,
						com.tools20022.repository.entity.Debt.ConstantPrePaymentPenalty, com.tools20022.repository.entity.Debt.PrePaymentSpeed, com.tools20022.repository.entity.Debt.ConstantPrePaymentYield,
						com.tools20022.repository.entity.Debt.WeightedAverageCoupon, com.tools20022.repository.entity.Debt.WeightedAverageLife, com.tools20022.repository.entity.Debt.WeightedAverageLoan,
						com.tools20022.repository.entity.Debt.WeightedAverageMaturity, com.tools20022.repository.entity.Debt.InsuredIndicator, com.tools20022.repository.entity.Debt.BankQualified,
						com.tools20022.repository.entity.Debt.AutoReinvestment, com.tools20022.repository.entity.Debt.CustomDate, com.tools20022.repository.entity.Debt.LookBack, com.tools20022.repository.entity.Debt.MinimumDenomination,
						com.tools20022.repository.entity.Debt.MaximumSubstitution, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Debt.Production, com.tools20022.repository.entity.Debt.Restricted,
						com.tools20022.repository.entity.Debt.PriceFrequency, com.tools20022.repository.entity.Debt.SubstitutionFrequency, com.tools20022.repository.entity.Debt.SubstitutionLeft,
						com.tools20022.repository.entity.Debt.WholePool, com.tools20022.repository.entity.Debt.AlternativeMinimumTax, com.tools20022.repository.entity.Debt.NextInterest, com.tools20022.repository.entity.Debt.ExtendibleDate,
						com.tools20022.repository.entity.Debt.SinkableIndicator, com.tools20022.repository.entity.Debt.Insured, com.tools20022.repository.entity.Debt.Geographics, com.tools20022.repository.entity.Debt.PaymentCurrency,
						com.tools20022.repository.entity.Debt.DirtyPrice, com.tools20022.repository.entity.Debt.DebtSeniority);
				derivationComponent_lazy = () -> Arrays.asList(Debt1.mmObject(), Debt2.mmObject(), DebtInstrument2.mmObject(), DebtInstrument4.mmObject(), DebtInstrument5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}