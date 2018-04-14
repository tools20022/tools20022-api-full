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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentDirectionIndicator
 * Debt.mmPaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
 * Debt.mmNextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
 * Debt.mmPutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
 * Debt.mmDatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmFirstPaymentDate
 * Debt.mmFirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
 * Debt.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmVariableRateIndicator
 * Debt.mmVariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCallableIndicator
 * Debt.mmCallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPutableIndicator
 * Debt.mmPutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmYieldToMaturityRate
 * Debt.mmYieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
 * Debt.mmAccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextCouponDate
 * Debt.mmNextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextFactorDate
 * Debt.mmNextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOddCouponIndicator
 * Debt.mmOddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCPProgram
 * Debt.mmCPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCPRegistrationType
 * Debt.mmCPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmConvertibleIndicator
 * Debt.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPreFundedIndicator
 * Debt.mmPreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmEscrowedIndicator
 * Debt.mmEscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPerpetualIndicator
 * Debt.mmPerpetualIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmSubordinatedIndicator
 * Debt.mmSubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendibleIndicator
 * Debt.mmExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
 * Debt.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentAmount
 * Debt.mmOverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmOverAllotmentRate
 * Debt.mmOverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmAmortisableIndicator
 * Debt.mmAmortisableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCapitalisedInterest
 * Debt.mmCapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmActualDenominationAmount
 * Debt.mmActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPieces Debt.mmPieces}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsMaximum
 * Debt.mmPoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerMillion
 * Debt.mmPoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerLot
 * Debt.mmPoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPoolsPerTrade
 * Debt.mmPoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentPenalty
 * Debt.mmConstantPrePaymentPenalty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPrePaymentSpeed
 * Debt.mmPrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmConstantPrePaymentYield
 * Debt.mmConstantPrePaymentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageCoupon
 * Debt.mmWeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLife
 * Debt.mmWeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageLoan
 * Debt.mmWeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmWeightedAverageMaturity
 * Debt.mmWeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmInsuredIndicator
 * Debt.mmInsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmBankQualified
 * Debt.mmBankQualified}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmAutoReinvestment
 * Debt.mmAutoReinvestment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
 * Debt.mmCustomDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmLookBack
 * Debt.mmLookBack}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
 * Debt.mmMinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMaximumSubstitution
 * Debt.mmMaximumSubstitution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
 * Debt.mmMinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmProduction
 * Debt.mmProduction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmRestricted
 * Debt.mmRestricted}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPriceFrequency
 * Debt.mmPriceFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionFrequency
 * Debt.mmSubstitutionFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmSubstitutionLeft
 * Debt.mmSubstitutionLeft}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmWholePool
 * Debt.mmWholePool}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Debt#mmAlternativeMinimumTax
 * Debt.mmAlternativeMinimumTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
 * Debt.mmNextInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendibleDate
 * Debt.mmExtendibleDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmSinkableIndicator
 * Debt.mmSinkableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmInsured
 * Debt.mmInsured}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmGeographics
 * Debt.mmGeographics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmPaymentCurrency
 * Debt.mmPaymentCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDirtyPrice
 * Debt.mmDirtyPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmDebtSeniority
 * Debt.mmDebtSeniority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
 * DateTimePeriod.mmCustomDateDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
 * InterestCalculation.mmDebtInstrument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#mmDebt
 * FinancialInstrumentProperties1Choice.mmDebt}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28#mmDebt
 * FinancialInstrument28.mmDebt}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmStipulations
 * SingleQuote1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmUnderlyingStipulations
 * SingleQuote1.mmUnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmStipulations
 * QuoteCancellation1Choice.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingStipulations
 * QuoteCancellation1Choice.mmUnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmStipulations
 * QuoteRequest1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingStipulations
 * QuoteRequest1.mmUnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestForQuote#mmStipulations
 * RequestForQuote.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmUnderlyingStipulations
 * RequestForQuote.mmUnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmStipulations
 * Quote1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingStipulations
 * Quote1.mmUnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument54#mmDebt
 * FinancialInstrument54.mmDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmDebtInstrumentAttributes
 * SecuritiesReferenceDataReport5.mmDebtInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmBond
 * TransparencyDataReport10.mmBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingBond
 * InterestRateDerivative5.mmUnderlyingBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmDebtInstrumentAttributes
 * SecurityInstrumentDescription13.mmDebtInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Loan Loan}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Debt3 Debt3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument5
 * DebtInstrument5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDerivative3
 * CreditDerivative3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Debt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Debt extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentDirectionIndicator paymentDirectionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection1Choice#mmIndicator
	 * PaymentDirection1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection1Choice#mmProprietary
	 * PaymentDirection1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#mmIndicator
	 * PaymentDirection2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#mmProprietary
	 * PaymentDirection2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPaymentDirection
	 * FinancialInstrumentAttributes8.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPaymentDirection
	 * FinancialInstrumentAttributes20.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPaymentDirection
	 * FinancialInstrumentAttributes4.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection3Choice#mmIndicator
	 * PaymentDirection3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection3Choice#mmProprietary
	 * PaymentDirection3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPaymentDirection
	 * FinancialInstrumentAttributes13.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPaymentDirection
	 * FinancialInstrumentAttributes21.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPaymentDirection
	 * FinancialInstrumentAttributes26.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPaymentDirection
	 * FinancialInstrumentAttributes27.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPaymentDirection
	 * FinancialInstrumentAttributes14.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPaymentDirection
	 * FinancialInstrumentAttributes30.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPaymentDirection
	 * FinancialInstrumentAttributes28.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmPaymentDirectionIndicator
	 * Debt1.mmPaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPaymentDirection
	 * FinancialInstrumentAttributes15.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPaymentDirection
	 * FinancialInstrumentAttributes29.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmPaymentDirectionIndicator
	 * Debt2.mmPaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPaymentDirection
	 * FinancialInstrumentAttributes2.mmPaymentDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmPaymentDirectionIndicator
	 * Debt3.mmPaymentDirectionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, com.tools20022.repository.datatype.PaymentDirectionIndicator> mmPaymentDirectionIndicator = new MMBusinessAttribute<Debt, com.tools20022.repository.datatype.PaymentDirectionIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentDirection1Choice.mmIndicator, PaymentDirection1Choice.mmProprietary, PaymentDirection2Choice.mmIndicator, PaymentDirection2Choice.mmProprietary,
					FinancialInstrumentAttributes8.mmPaymentDirection, FinancialInstrumentAttributes20.mmPaymentDirection, FinancialInstrumentAttributes4.mmPaymentDirection, PaymentDirection3Choice.mmIndicator,
					PaymentDirection3Choice.mmProprietary, FinancialInstrumentAttributes13.mmPaymentDirection, FinancialInstrumentAttributes21.mmPaymentDirection, FinancialInstrumentAttributes26.mmPaymentDirection,
					FinancialInstrumentAttributes27.mmPaymentDirection, FinancialInstrumentAttributes14.mmPaymentDirection, FinancialInstrumentAttributes30.mmPaymentDirection, FinancialInstrumentAttributes28.mmPaymentDirection,
					Debt1.mmPaymentDirectionIndicator, FinancialInstrumentAttributes15.mmPaymentDirection, FinancialInstrumentAttributes29.mmPaymentDirection, Debt2.mmPaymentDirectionIndicator,
					FinancialInstrumentAttributes2.mmPaymentDirection, Debt3.mmPaymentDirectionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PaymentDirectionIndicator.mmObject();
		}

		@Override
		public com.tools20022.repository.datatype.PaymentDirectionIndicator getValue(Debt obj) {
			return obj.getPaymentDirectionIndicator();
		}

		@Override
		public void setValue(Debt obj, com.tools20022.repository.datatype.PaymentDirectionIndicator value) {
			obj.setPaymentDirectionIndicator(value);
		}
	};
	protected ISODateTime nextCallableDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmNextCallableDate
	 * FinancialInstrumentAttributes8.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmNextCallableDate
	 * FinancialInstrumentAttributes20.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextCallableDate
	 * FinancialInstrumentAttributes35.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmNextCallableDate
	 * FinancialInstrumentAttributes41.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmNextCallableDate
	 * FinancialInstrumentAttributes6.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmNextCallableDate
	 * FinancialInstrumentAttributes9.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmNextCallableDate
	 * FinancialInstrumentAttributes18.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmNextCallableDate
	 * FinancialInstrumentAttributes22.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmNextCallableDate
	 * FinancialInstrumentAttributes32.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmNextCallableDate
	 * FinancialInstrumentAttributes38.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmNextCallableDate
	 * FinancialInstrumentAttributes7.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmNextCallableDate
	 * FinancialInstrumentAttributes5.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmNextCallableDate
	 * FinancialInstrumentAttributes11.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmNextCallableDate
	 * FinancialInstrumentAttributes10.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmNextCallableDate
	 * FinancialInstrumentAttributes19.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmNextCallableDate
	 * FinancialInstrumentAttributes16.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmNextCallableDate
	 * FinancialInstrumentAttributes23.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmNextCallableDate
	 * FinancialInstrumentAttributes24.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmNextCallableDate
	 * FinancialInstrumentAttributes33.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmNextCallableDate
	 * FinancialInstrumentAttributes34.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmNextCallableDate
	 * FinancialInstrumentAttributes39.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmNextCallableDate
	 * FinancialInstrumentAttributes40.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmNextCallableDate
	 * FinancialInstrumentAttributes43.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmNextCallableDate
	 * FinancialInstrumentAttributes45.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmNextCallableDate
	 * FinancialInstrumentAttributes4.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmNextCallableDate
	 * FinancialInstrumentAttributes13.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmNextCallableDate
	 * FinancialInstrumentAttributes21.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmNextCallableDate
	 * FinancialInstrumentAttributes26.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmNextCallableDate
	 * FinancialInstrumentAttributes36.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmNextCallableDate
	 * FinancialInstrumentAttributes42.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmNextCallableDate
	 * FinancialInstrumentAttributes27.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmNextCallableDate
	 * FinancialInstrumentAttributes14.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmNextCallableDate
	 * FinancialInstrumentAttributes30.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmNextCallableDate
	 * FinancialInstrumentAttributes28.mmNextCallableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextCallableDate
	 * Debt1.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmNextCallableDate
	 * FinancialInstrumentAttributes31.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmNextCallableDate
	 * FinancialInstrumentAttributes44.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmNextCallableDate
	 * FinancialInstrumentAttributes15.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmNextCallableDate
	 * FinancialInstrumentAttributes29.mmNextCallableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextCallableDate
	 * Debt2.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmNextCallableDate
	 * FinancialInstrumentAttributes2.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextCallableDate
	 * FinancialInstrumentAttributes48.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmNextCallableDate
	 * FinancialInstrumentAttributes50.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextCallableDate
	 * FinancialInstrumentAttributes49.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmNextCallableDate
	 * FinancialInstrumentAttributes55.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmNextCallableDate
	 * FinancialInstrumentAttributes57.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmNextCallableDate
	 * FinancialInstrumentAttributes56.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextCallableDate
	 * FinancialInstrumentAttributes63.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextCallableDate
	 * FinancialInstrumentAttributes64.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextCallableDate
	 * FinancialInstrumentAttributes66.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmNextCallableDate
	 * FinancialInstrumentAttributes65.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextCallableDate
	 * FinancialInstrumentAttributes67.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmNextCallableDate
	 * FinancialInstrumentAttributes70.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmNextCallableDate
	 * FinancialInstrumentAttributes69.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmNextCallableDate
	 * FinancialInstrumentAttributes71.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmNextCallableDate
	 * FinancialInstrumentAttributes75.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmNextCallableDate
	 * FinancialInstrumentAttributes78.mmNextCallableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextCallableDate
	 * Debt3.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextCallableDate
	 * FinancialInstrumentAttributes79.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmNextCallableDate
	 * FinancialInstrumentAttributes81.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextCallableDate
	 * FinancialInstrumentAttributes80.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmNextCallableDate
	 * FinancialInstrumentAttributes85.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmNextCallableDate
	 * FinancialInstrumentAttributes84.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmNextCallableDate
	 * FinancialInstrumentAttributes83.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmNextCallableDate
	 * FinancialInstrumentAttributes91.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmNextCallableDate
	 * FinancialInstrumentAttributes92.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmNextCallableDate
	 * FinancialInstrumentAttributes95.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmNextCallableDate
	 * FinancialInstrumentAttributes97.mmNextCallableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next date/time at which the issuer has the right to pay the securitiy prior to maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmNextCallableDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmNextCallableDate, FinancialInstrumentAttributes20.mmNextCallableDate, FinancialInstrumentAttributes35.mmNextCallableDate,
					FinancialInstrumentAttributes41.mmNextCallableDate, FinancialInstrumentAttributes6.mmNextCallableDate, FinancialInstrumentAttributes9.mmNextCallableDate, FinancialInstrumentAttributes18.mmNextCallableDate,
					FinancialInstrumentAttributes22.mmNextCallableDate, FinancialInstrumentAttributes32.mmNextCallableDate, FinancialInstrumentAttributes38.mmNextCallableDate, FinancialInstrumentAttributes7.mmNextCallableDate,
					FinancialInstrumentAttributes5.mmNextCallableDate, FinancialInstrumentAttributes11.mmNextCallableDate, FinancialInstrumentAttributes10.mmNextCallableDate, FinancialInstrumentAttributes19.mmNextCallableDate,
					FinancialInstrumentAttributes16.mmNextCallableDate, FinancialInstrumentAttributes23.mmNextCallableDate, FinancialInstrumentAttributes24.mmNextCallableDate, FinancialInstrumentAttributes33.mmNextCallableDate,
					FinancialInstrumentAttributes34.mmNextCallableDate, FinancialInstrumentAttributes39.mmNextCallableDate, FinancialInstrumentAttributes40.mmNextCallableDate, FinancialInstrumentAttributes43.mmNextCallableDate,
					FinancialInstrumentAttributes45.mmNextCallableDate, FinancialInstrumentAttributes4.mmNextCallableDate, FinancialInstrumentAttributes13.mmNextCallableDate, FinancialInstrumentAttributes21.mmNextCallableDate,
					FinancialInstrumentAttributes26.mmNextCallableDate, FinancialInstrumentAttributes36.mmNextCallableDate, FinancialInstrumentAttributes42.mmNextCallableDate, FinancialInstrumentAttributes27.mmNextCallableDate,
					FinancialInstrumentAttributes14.mmNextCallableDate, FinancialInstrumentAttributes30.mmNextCallableDate, FinancialInstrumentAttributes28.mmNextCallableDate, Debt1.mmNextCallableDate,
					FinancialInstrumentAttributes31.mmNextCallableDate, FinancialInstrumentAttributes44.mmNextCallableDate, FinancialInstrumentAttributes15.mmNextCallableDate, FinancialInstrumentAttributes29.mmNextCallableDate,
					Debt2.mmNextCallableDate, FinancialInstrumentAttributes2.mmNextCallableDate, FinancialInstrumentAttributes48.mmNextCallableDate, FinancialInstrumentAttributes50.mmNextCallableDate,
					FinancialInstrumentAttributes49.mmNextCallableDate, FinancialInstrumentAttributes55.mmNextCallableDate, FinancialInstrumentAttributes57.mmNextCallableDate, FinancialInstrumentAttributes56.mmNextCallableDate,
					FinancialInstrumentAttributes63.mmNextCallableDate, FinancialInstrumentAttributes64.mmNextCallableDate, FinancialInstrumentAttributes66.mmNextCallableDate, FinancialInstrumentAttributes65.mmNextCallableDate,
					FinancialInstrumentAttributes67.mmNextCallableDate, FinancialInstrumentAttributes70.mmNextCallableDate, FinancialInstrumentAttributes69.mmNextCallableDate, FinancialInstrumentAttributes71.mmNextCallableDate,
					FinancialInstrumentAttributes75.mmNextCallableDate, FinancialInstrumentAttributes78.mmNextCallableDate, Debt3.mmNextCallableDate, FinancialInstrumentAttributes79.mmNextCallableDate,
					FinancialInstrumentAttributes81.mmNextCallableDate, FinancialInstrumentAttributes80.mmNextCallableDate, FinancialInstrumentAttributes85.mmNextCallableDate, FinancialInstrumentAttributes84.mmNextCallableDate,
					FinancialInstrumentAttributes83.mmNextCallableDate, FinancialInstrumentAttributes91.mmNextCallableDate, FinancialInstrumentAttributes92.mmNextCallableDate, FinancialInstrumentAttributes95.mmNextCallableDate,
					FinancialInstrumentAttributes97.mmNextCallableDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getNextCallableDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setNextCallableDate(value);
		}
	};
	protected ISODateTime putableDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPutableDate
	 * FinancialInstrumentAttributes8.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPutableDate
	 * FinancialInstrumentAttributes20.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPutableDate
	 * FinancialInstrumentAttributes35.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPutableDate
	 * FinancialInstrumentAttributes41.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmPutableDate
	 * FinancialInstrumentAttributes6.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmPutableDate
	 * FinancialInstrumentAttributes9.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmPutableDate
	 * FinancialInstrumentAttributes18.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmPutableDate
	 * FinancialInstrumentAttributes22.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmPutableDate
	 * FinancialInstrumentAttributes32.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmPutableDate
	 * FinancialInstrumentAttributes38.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmPutableDate
	 * FinancialInstrumentAttributes7.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmPutableDate
	 * FinancialInstrumentAttributes5.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmPutableDate
	 * FinancialInstrumentAttributes11.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmPutableDate
	 * FinancialInstrumentAttributes10.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmPutableDate
	 * FinancialInstrumentAttributes19.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmPutableDate
	 * FinancialInstrumentAttributes16.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmPutableDate
	 * FinancialInstrumentAttributes23.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmPutableDate
	 * FinancialInstrumentAttributes24.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmPutableDate
	 * FinancialInstrumentAttributes33.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmPutableDate
	 * FinancialInstrumentAttributes34.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmPutableDate
	 * FinancialInstrumentAttributes39.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmPutableDate
	 * FinancialInstrumentAttributes40.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmPutableDate
	 * FinancialInstrumentAttributes43.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmPutableDate
	 * FinancialInstrumentAttributes45.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPutableDate
	 * FinancialInstrumentAttributes4.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPutableDate
	 * FinancialInstrumentAttributes13.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPutableDate
	 * FinancialInstrumentAttributes21.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPutableDate
	 * FinancialInstrumentAttributes26.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPutableDate
	 * FinancialInstrumentAttributes36.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPutableDate
	 * FinancialInstrumentAttributes42.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPutableDate
	 * FinancialInstrumentAttributes27.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPutableDate
	 * FinancialInstrumentAttributes14.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPutableDate
	 * FinancialInstrumentAttributes30.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPutableDate
	 * FinancialInstrumentAttributes28.mmPutableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPutableDate
	 * Debt1.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPutableDate
	 * FinancialInstrumentAttributes31.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPutableDate
	 * FinancialInstrumentAttributes44.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPutableDate
	 * FinancialInstrumentAttributes15.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPutableDate
	 * FinancialInstrumentAttributes29.mmPutableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPutableDate
	 * Debt2.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPutableDate
	 * FinancialInstrumentAttributes2.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPutableDate
	 * FinancialInstrumentAttributes48.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmPutableDate
	 * FinancialInstrumentAttributes50.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPutableDate
	 * FinancialInstrumentAttributes49.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmPutableDate
	 * FinancialInstrumentAttributes55.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmPutableDate
	 * FinancialInstrumentAttributes57.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmPutableDate
	 * FinancialInstrumentAttributes56.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPutableDate
	 * FinancialInstrumentAttributes63.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPutableDate
	 * FinancialInstrumentAttributes64.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPutableDate
	 * FinancialInstrumentAttributes66.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmPutableDate
	 * FinancialInstrumentAttributes65.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPutableDate
	 * FinancialInstrumentAttributes67.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmPutableDate
	 * FinancialInstrumentAttributes70.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmPutableDate
	 * FinancialInstrumentAttributes69.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmPutableDate
	 * FinancialInstrumentAttributes71.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPutableDate
	 * FinancialInstrumentAttributes75.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPutableDate
	 * FinancialInstrumentAttributes78.mmPutableDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPutableDate
	 * Debt3.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPutableDate
	 * FinancialInstrumentAttributes79.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmPutableDate
	 * FinancialInstrumentAttributes81.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPutableDate
	 * FinancialInstrumentAttributes80.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmPutableDate
	 * FinancialInstrumentAttributes85.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmPutableDate
	 * FinancialInstrumentAttributes84.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmPutableDate
	 * FinancialInstrumentAttributes83.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPutableDate
	 * FinancialInstrumentAttributes91.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPutableDate
	 * FinancialInstrumentAttributes92.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmPutableDate
	 * FinancialInstrumentAttributes95.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPutableDate
	 * FinancialInstrumentAttributes97.mmPutableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the holder has the right to ask for redemption of the security prior to final maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmPutableDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPutableDate, FinancialInstrumentAttributes20.mmPutableDate, FinancialInstrumentAttributes35.mmPutableDate, FinancialInstrumentAttributes41.mmPutableDate,
					FinancialInstrumentAttributes6.mmPutableDate, FinancialInstrumentAttributes9.mmPutableDate, FinancialInstrumentAttributes18.mmPutableDate, FinancialInstrumentAttributes22.mmPutableDate,
					FinancialInstrumentAttributes32.mmPutableDate, FinancialInstrumentAttributes38.mmPutableDate, FinancialInstrumentAttributes7.mmPutableDate, FinancialInstrumentAttributes5.mmPutableDate,
					FinancialInstrumentAttributes11.mmPutableDate, FinancialInstrumentAttributes10.mmPutableDate, FinancialInstrumentAttributes19.mmPutableDate, FinancialInstrumentAttributes16.mmPutableDate,
					FinancialInstrumentAttributes23.mmPutableDate, FinancialInstrumentAttributes24.mmPutableDate, FinancialInstrumentAttributes33.mmPutableDate, FinancialInstrumentAttributes34.mmPutableDate,
					FinancialInstrumentAttributes39.mmPutableDate, FinancialInstrumentAttributes40.mmPutableDate, FinancialInstrumentAttributes43.mmPutableDate, FinancialInstrumentAttributes45.mmPutableDate,
					FinancialInstrumentAttributes4.mmPutableDate, FinancialInstrumentAttributes13.mmPutableDate, FinancialInstrumentAttributes21.mmPutableDate, FinancialInstrumentAttributes26.mmPutableDate,
					FinancialInstrumentAttributes36.mmPutableDate, FinancialInstrumentAttributes42.mmPutableDate, FinancialInstrumentAttributes27.mmPutableDate, FinancialInstrumentAttributes14.mmPutableDate,
					FinancialInstrumentAttributes30.mmPutableDate, FinancialInstrumentAttributes28.mmPutableDate, Debt1.mmPutableDate, FinancialInstrumentAttributes31.mmPutableDate, FinancialInstrumentAttributes44.mmPutableDate,
					FinancialInstrumentAttributes15.mmPutableDate, FinancialInstrumentAttributes29.mmPutableDate, Debt2.mmPutableDate, FinancialInstrumentAttributes2.mmPutableDate, FinancialInstrumentAttributes48.mmPutableDate,
					FinancialInstrumentAttributes50.mmPutableDate, FinancialInstrumentAttributes49.mmPutableDate, FinancialInstrumentAttributes55.mmPutableDate, FinancialInstrumentAttributes57.mmPutableDate,
					FinancialInstrumentAttributes56.mmPutableDate, FinancialInstrumentAttributes63.mmPutableDate, FinancialInstrumentAttributes64.mmPutableDate, FinancialInstrumentAttributes66.mmPutableDate,
					FinancialInstrumentAttributes65.mmPutableDate, FinancialInstrumentAttributes67.mmPutableDate, FinancialInstrumentAttributes70.mmPutableDate, FinancialInstrumentAttributes69.mmPutableDate,
					FinancialInstrumentAttributes71.mmPutableDate, FinancialInstrumentAttributes75.mmPutableDate, FinancialInstrumentAttributes78.mmPutableDate, Debt3.mmPutableDate, FinancialInstrumentAttributes79.mmPutableDate,
					FinancialInstrumentAttributes81.mmPutableDate, FinancialInstrumentAttributes80.mmPutableDate, FinancialInstrumentAttributes85.mmPutableDate, FinancialInstrumentAttributes84.mmPutableDate,
					FinancialInstrumentAttributes83.mmPutableDate, FinancialInstrumentAttributes91.mmPutableDate, FinancialInstrumentAttributes92.mmPutableDate, FinancialInstrumentAttributes95.mmPutableDate,
					FinancialInstrumentAttributes97.mmPutableDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getPutableDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setPutableDate(value);
		}
	};
	protected ISODateTime datedDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmDatedDate
	 * FinancialInstrumentAttributes8.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmDatedDate
	 * FinancialInstrumentAttributes20.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDatedDate
	 * FinancialInstrumentAttributes35.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmDatedDate
	 * FinancialInstrumentAttributes41.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmDatedDate
	 * FinancialInstrumentAttributes6.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmDatedDate
	 * FinancialInstrumentAttributes9.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmDatedDate
	 * FinancialInstrumentAttributes18.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmDatedDate
	 * FinancialInstrumentAttributes22.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmDatedDate
	 * FinancialInstrumentAttributes32.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmDatedDate
	 * FinancialInstrumentAttributes38.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmDatedDate
	 * FinancialInstrumentAttributes7.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmDatedDate
	 * FinancialInstrumentAttributes5.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmDatedDate
	 * FinancialInstrumentAttributes11.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmDatedDate
	 * FinancialInstrumentAttributes10.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmDatedDate
	 * FinancialInstrumentAttributes19.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmDatedDate
	 * FinancialInstrumentAttributes16.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmDatedDate
	 * FinancialInstrumentAttributes23.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmDatedDate
	 * FinancialInstrumentAttributes24.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmDatedDate
	 * FinancialInstrumentAttributes33.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmDatedDate
	 * FinancialInstrumentAttributes34.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmDatedDate
	 * FinancialInstrumentAttributes39.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmDatedDate
	 * FinancialInstrumentAttributes40.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmDatedDate
	 * FinancialInstrumentAttributes43.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmDatedDate
	 * FinancialInstrumentAttributes45.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmDatedDate
	 * FinancialInstrumentAttributes4.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmDatedDate
	 * FinancialInstrumentAttributes13.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmDatedDate
	 * FinancialInstrumentAttributes21.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmDatedDate
	 * FinancialInstrumentAttributes26.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDatedDate
	 * FinancialInstrumentAttributes36.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmDatedDate
	 * FinancialInstrumentAttributes42.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmDatedDate
	 * FinancialInstrumentAttributes27.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmDatedDate
	 * FinancialInstrumentAttributes14.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmDatedDate
	 * FinancialInstrumentAttributes30.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmDatedDate
	 * FinancialInstrumentAttributes28.mmDatedDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmDatedDate
	 * Debt1.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmDatedDate
	 * FinancialInstrumentAttributes31.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmDatedDate
	 * FinancialInstrumentAttributes44.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmDatedDate
	 * FinancialInstrumentAttributes15.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmDatedDate
	 * FinancialInstrumentAttributes29.mmDatedDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmDatedDate
	 * Debt2.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmDatedDate
	 * FinancialInstrumentAttributes2.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDatedDate
	 * FinancialInstrumentAttributes48.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmDatedDate
	 * FinancialInstrumentAttributes50.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDatedDate
	 * FinancialInstrumentAttributes49.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmDatedDate
	 * FinancialInstrumentAttributes55.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmDatedDate
	 * FinancialInstrumentAttributes57.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmDatedDate
	 * FinancialInstrumentAttributes56.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDatedDate
	 * FinancialInstrumentAttributes63.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDatedDate
	 * FinancialInstrumentAttributes64.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDatedDate
	 * FinancialInstrumentAttributes66.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmDatedDate
	 * FinancialInstrumentAttributes65.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDatedDate
	 * FinancialInstrumentAttributes67.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmDatedDate
	 * FinancialInstrumentAttributes70.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmDatedDate
	 * FinancialInstrumentAttributes69.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmDatedDate
	 * FinancialInstrumentAttributes71.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmDatedDate
	 * FinancialInstrumentAttributes75.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmDatedDate
	 * FinancialInstrumentAttributes78.mmDatedDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmDatedDate
	 * Debt3.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDatedDate
	 * FinancialInstrumentAttributes79.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmDatedDate
	 * FinancialInstrumentAttributes81.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDatedDate
	 * FinancialInstrumentAttributes80.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmDatedDate
	 * FinancialInstrumentAttributes85.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmDatedDate
	 * FinancialInstrumentAttributes84.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmDatedDate
	 * FinancialInstrumentAttributes83.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmDatedDate
	 * FinancialInstrumentAttributes91.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmDatedDate
	 * FinancialInstrumentAttributes92.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmDatedDate
	 * FinancialInstrumentAttributes95.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmDatedDate
	 * FinancialInstrumentAttributes97.mmDatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which a security begins to accrue interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmDatedDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmDatedDate, FinancialInstrumentAttributes20.mmDatedDate, FinancialInstrumentAttributes35.mmDatedDate, FinancialInstrumentAttributes41.mmDatedDate,
					FinancialInstrumentAttributes6.mmDatedDate, FinancialInstrumentAttributes9.mmDatedDate, FinancialInstrumentAttributes18.mmDatedDate, FinancialInstrumentAttributes22.mmDatedDate,
					FinancialInstrumentAttributes32.mmDatedDate, FinancialInstrumentAttributes38.mmDatedDate, FinancialInstrumentAttributes7.mmDatedDate, FinancialInstrumentAttributes5.mmDatedDate,
					FinancialInstrumentAttributes11.mmDatedDate, FinancialInstrumentAttributes10.mmDatedDate, FinancialInstrumentAttributes19.mmDatedDate, FinancialInstrumentAttributes16.mmDatedDate,
					FinancialInstrumentAttributes23.mmDatedDate, FinancialInstrumentAttributes24.mmDatedDate, FinancialInstrumentAttributes33.mmDatedDate, FinancialInstrumentAttributes34.mmDatedDate,
					FinancialInstrumentAttributes39.mmDatedDate, FinancialInstrumentAttributes40.mmDatedDate, FinancialInstrumentAttributes43.mmDatedDate, FinancialInstrumentAttributes45.mmDatedDate,
					FinancialInstrumentAttributes4.mmDatedDate, FinancialInstrumentAttributes13.mmDatedDate, FinancialInstrumentAttributes21.mmDatedDate, FinancialInstrumentAttributes26.mmDatedDate,
					FinancialInstrumentAttributes36.mmDatedDate, FinancialInstrumentAttributes42.mmDatedDate, FinancialInstrumentAttributes27.mmDatedDate, FinancialInstrumentAttributes14.mmDatedDate,
					FinancialInstrumentAttributes30.mmDatedDate, FinancialInstrumentAttributes28.mmDatedDate, Debt1.mmDatedDate, FinancialInstrumentAttributes31.mmDatedDate, FinancialInstrumentAttributes44.mmDatedDate,
					FinancialInstrumentAttributes15.mmDatedDate, FinancialInstrumentAttributes29.mmDatedDate, Debt2.mmDatedDate, FinancialInstrumentAttributes2.mmDatedDate, FinancialInstrumentAttributes48.mmDatedDate,
					FinancialInstrumentAttributes50.mmDatedDate, FinancialInstrumentAttributes49.mmDatedDate, FinancialInstrumentAttributes55.mmDatedDate, FinancialInstrumentAttributes57.mmDatedDate,
					FinancialInstrumentAttributes56.mmDatedDate, FinancialInstrumentAttributes63.mmDatedDate, FinancialInstrumentAttributes64.mmDatedDate, FinancialInstrumentAttributes66.mmDatedDate,
					FinancialInstrumentAttributes65.mmDatedDate, FinancialInstrumentAttributes67.mmDatedDate, FinancialInstrumentAttributes70.mmDatedDate, FinancialInstrumentAttributes69.mmDatedDate,
					FinancialInstrumentAttributes71.mmDatedDate, FinancialInstrumentAttributes75.mmDatedDate, FinancialInstrumentAttributes78.mmDatedDate, Debt3.mmDatedDate, FinancialInstrumentAttributes79.mmDatedDate,
					FinancialInstrumentAttributes81.mmDatedDate, FinancialInstrumentAttributes80.mmDatedDate, FinancialInstrumentAttributes85.mmDatedDate, FinancialInstrumentAttributes84.mmDatedDate,
					FinancialInstrumentAttributes83.mmDatedDate, FinancialInstrumentAttributes91.mmDatedDate, FinancialInstrumentAttributes92.mmDatedDate, FinancialInstrumentAttributes95.mmDatedDate,
					FinancialInstrumentAttributes97.mmDatedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getDatedDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setDatedDate(value);
		}
	};
	protected ISODateTime firstPaymentDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmFirstPaymentDate
	 * FinancialInstrumentAttributes8.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmFirstPaymentDate
	 * FinancialInstrumentAttributes20.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmFirstPaymentDate
	 * FinancialInstrumentAttributes35.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmFirstPaymentDate
	 * FinancialInstrumentAttributes41.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmFirstPaymentDate
	 * FinancialInstrumentAttributes4.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmFirstPaymentDate
	 * FinancialInstrumentAttributes13.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmFirstPaymentDate
	 * FinancialInstrumentAttributes21.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmFirstPaymentDate
	 * FinancialInstrumentAttributes26.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmFirstPaymentDate
	 * FinancialInstrumentAttributes36.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmFirstPaymentDate
	 * FinancialInstrumentAttributes42.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmFirstPaymentDate
	 * FinancialInstrumentAttributes27.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmFirstPaymentDate
	 * FinancialInstrumentAttributes14.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmFirstPaymentDate
	 * FinancialInstrumentAttributes30.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmFirstPaymentDate
	 * FinancialInstrumentAttributes28.mmFirstPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmFirstPaymentDate
	 * Debt1.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmFirstPaymentDate
	 * FinancialInstrumentAttributes31.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmFirstPaymentDate
	 * FinancialInstrumentAttributes44.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmFirstPaymentDate
	 * FinancialInstrumentAttributes15.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmFirstPaymentDate
	 * FinancialInstrumentAttributes29.mmFirstPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmFirstPaymentDate
	 * Debt2.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmFirstPaymentDate
	 * FinancialInstrumentAttributes2.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmFirstPaymentDate
	 * FinancialInstrumentAttributes63.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmFirstPaymentDate
	 * FinancialInstrumentAttributes64.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmFirstPaymentDate
	 * FinancialInstrumentAttributes75.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmFirstPaymentDate
	 * FinancialInstrumentAttributes78.mmFirstPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmFirstPaymentDate
	 * Debt3.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmFirstPaymentDate
	 * FinancialInstrumentAttributes91.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmFirstPaymentDate
	 * FinancialInstrumentAttributes92.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmFirstPaymentDate
	 * FinancialInstrumentAttributes95.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmFirstPaymentDate
	 * FinancialInstrumentAttributes97.mmFirstPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the first interest payment is due to holders of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmFirstPaymentDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmFirstPaymentDate, FinancialInstrumentAttributes20.mmFirstPaymentDate, FinancialInstrumentAttributes35.mmFirstPaymentDate,
					FinancialInstrumentAttributes41.mmFirstPaymentDate, FinancialInstrumentAttributes4.mmFirstPaymentDate, FinancialInstrumentAttributes13.mmFirstPaymentDate, FinancialInstrumentAttributes21.mmFirstPaymentDate,
					FinancialInstrumentAttributes26.mmFirstPaymentDate, FinancialInstrumentAttributes36.mmFirstPaymentDate, FinancialInstrumentAttributes42.mmFirstPaymentDate, FinancialInstrumentAttributes27.mmFirstPaymentDate,
					FinancialInstrumentAttributes14.mmFirstPaymentDate, FinancialInstrumentAttributes30.mmFirstPaymentDate, FinancialInstrumentAttributes28.mmFirstPaymentDate, Debt1.mmFirstPaymentDate,
					FinancialInstrumentAttributes31.mmFirstPaymentDate, FinancialInstrumentAttributes44.mmFirstPaymentDate, FinancialInstrumentAttributes15.mmFirstPaymentDate, FinancialInstrumentAttributes29.mmFirstPaymentDate,
					Debt2.mmFirstPaymentDate, FinancialInstrumentAttributes2.mmFirstPaymentDate, FinancialInstrumentAttributes63.mmFirstPaymentDate, FinancialInstrumentAttributes64.mmFirstPaymentDate,
					FinancialInstrumentAttributes75.mmFirstPaymentDate, FinancialInstrumentAttributes78.mmFirstPaymentDate, Debt3.mmFirstPaymentDate, FinancialInstrumentAttributes91.mmFirstPaymentDate,
					FinancialInstrumentAttributes92.mmFirstPaymentDate, FinancialInstrumentAttributes95.mmFirstPaymentDate, FinancialInstrumentAttributes97.mmFirstPaymentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getFirstPaymentDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setFirstPaymentDate(value);
		}
	};
	protected PercentageRate factor;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPreviousFactor
	 * FinancialInstrumentAttributes8.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmCurrentFactor
	 * FinancialInstrumentAttributes8.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmNextFactor
	 * FinancialInstrumentAttributes8.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPreviousFactor
	 * FinancialInstrumentAttributes20.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmCurrentFactor
	 * FinancialInstrumentAttributes20.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmNextFactor
	 * FinancialInstrumentAttributes20.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPreviousFactor
	 * FinancialInstrumentAttributes35.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCurrentFactor
	 * FinancialInstrumentAttributes35.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextFactor
	 * FinancialInstrumentAttributes35.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPreviousFactor
	 * FinancialInstrumentAttributes41.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmCurrentFactor
	 * FinancialInstrumentAttributes41.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmNextFactor
	 * FinancialInstrumentAttributes41.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmPreviousFactor
	 * FinancialInstrumentAttributes6.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmNextFactor
	 * FinancialInstrumentAttributes6.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmPreviousFactor
	 * FinancialInstrumentAttributes9.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmNextFactor
	 * FinancialInstrumentAttributes9.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmPreviousFactor
	 * FinancialInstrumentAttributes18.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmNextFactor
	 * FinancialInstrumentAttributes18.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmPreviousFactor
	 * FinancialInstrumentAttributes22.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmNextFactor
	 * FinancialInstrumentAttributes22.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmPreviousFactor
	 * FinancialInstrumentAttributes32.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmNextFactor
	 * FinancialInstrumentAttributes32.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmPreviousFactor
	 * FinancialInstrumentAttributes38.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmNextFactor
	 * FinancialInstrumentAttributes38.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmPreviousFactor
	 * FinancialInstrumentAttributes7.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmNextFactor
	 * FinancialInstrumentAttributes7.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmPreviousFactor
	 * FinancialInstrumentAttributes5.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmNextFactor
	 * FinancialInstrumentAttributes5.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmPreviousFactor
	 * FinancialInstrumentAttributes11.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmNextFactor
	 * FinancialInstrumentAttributes11.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmPreviousFactor
	 * FinancialInstrumentAttributes10.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmNextFactor
	 * FinancialInstrumentAttributes10.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmPreviousFactor
	 * FinancialInstrumentAttributes19.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmNextFactor
	 * FinancialInstrumentAttributes19.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmPreviousFactor
	 * FinancialInstrumentAttributes16.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmNextFactor
	 * FinancialInstrumentAttributes16.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmPreviousFactor
	 * FinancialInstrumentAttributes23.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmNextFactor
	 * FinancialInstrumentAttributes23.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmPreviousFactor
	 * FinancialInstrumentAttributes24.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmNextFactor
	 * FinancialInstrumentAttributes24.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmPreviousFactor
	 * FinancialInstrumentAttributes33.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmNextFactor
	 * FinancialInstrumentAttributes33.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmPreviousFactor
	 * FinancialInstrumentAttributes34.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmNextFactor
	 * FinancialInstrumentAttributes34.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmPreviousFactor
	 * FinancialInstrumentAttributes39.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmNextFactor
	 * FinancialInstrumentAttributes39.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmPreviousFactor
	 * FinancialInstrumentAttributes40.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmNextFactor
	 * FinancialInstrumentAttributes40.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmPreviousFactor
	 * FinancialInstrumentAttributes43.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmNextFactor
	 * FinancialInstrumentAttributes43.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmPreviousFactor
	 * FinancialInstrumentAttributes45.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmNextFactor
	 * FinancialInstrumentAttributes45.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmPreviousFactor
	 * CorporateActionRate3.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmNextFactor
	 * CorporateActionRate3.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmPreviousFactor
	 * CorporateActionRate14.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmNextFactor
	 * CorporateActionRate14.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmPreviousFactor
	 * CorporateActionRate16.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmNextFactor
	 * CorporateActionRate16.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmPreviousFactor
	 * CorporateActionRate24.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmNextFactor
	 * CorporateActionRate24.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmPreviousFactor
	 * CorporateActionRate27.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmNextFactor
	 * CorporateActionRate27.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmPreviousFactor
	 * CorporateActionRate32.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmNextFactor
	 * CorporateActionRate32.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmPreviousFactor
	 * CorporateActionRate35.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmNextFactor
	 * CorporateActionRate35.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmPreviousFactor
	 * CorporateActionRate41.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmNextFactor
	 * CorporateActionRate41.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPreviousFactor
	 * FinancialInstrumentAttributes4.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmCurrentFactor
	 * FinancialInstrumentAttributes4.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmNextFactor
	 * FinancialInstrumentAttributes4.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPreviousFactor
	 * FinancialInstrumentAttributes13.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmCurrentFactor
	 * FinancialInstrumentAttributes13.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmNextFactor
	 * FinancialInstrumentAttributes13.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPreviousFactor
	 * FinancialInstrumentAttributes21.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmCurrentFactor
	 * FinancialInstrumentAttributes21.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmNextFactor
	 * FinancialInstrumentAttributes21.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPreviousFactor
	 * FinancialInstrumentAttributes26.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmCurrentFactor
	 * FinancialInstrumentAttributes26.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmNextFactor
	 * FinancialInstrumentAttributes26.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPreviousFactor
	 * FinancialInstrumentAttributes36.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCurrentFactor
	 * FinancialInstrumentAttributes36.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmNextFactor
	 * FinancialInstrumentAttributes36.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPreviousFactor
	 * FinancialInstrumentAttributes42.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmCurrentFactor
	 * FinancialInstrumentAttributes42.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmNextFactor
	 * FinancialInstrumentAttributes42.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPreviousFactor
	 * FinancialInstrumentAttributes27.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmCurrentFactor
	 * FinancialInstrumentAttributes27.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmNextFactor
	 * FinancialInstrumentAttributes27.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPreviousFactor
	 * FinancialInstrumentAttributes14.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmCurrentFactor
	 * FinancialInstrumentAttributes14.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmNextFactor
	 * FinancialInstrumentAttributes14.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPreviousFactor
	 * FinancialInstrumentAttributes30.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmCurrentFactor
	 * FinancialInstrumentAttributes30.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmNextFactor
	 * FinancialInstrumentAttributes30.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPreviousFactor
	 * FinancialInstrumentAttributes28.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmCurrentFactor
	 * FinancialInstrumentAttributes28.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmNextFactor
	 * FinancialInstrumentAttributes28.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCurrentFactor
	 * Debt1.mmCurrentFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextFactor
	 * Debt1.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPreviousFactor
	 * Debt1.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPreviousFactor
	 * FinancialInstrumentAttributes31.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCurrentFactor
	 * FinancialInstrumentAttributes31.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmNextFactor
	 * FinancialInstrumentAttributes31.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmEndFactor
	 * FinancialInstrumentAttributes31.mmEndFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPreviousFactor
	 * FinancialInstrumentAttributes44.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCurrentFactor
	 * FinancialInstrumentAttributes44.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmNextFactor
	 * FinancialInstrumentAttributes44.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmEndFactor
	 * FinancialInstrumentAttributes44.mmEndFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPreviousFactor
	 * FinancialInstrumentAttributes15.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmCurrentFactor
	 * FinancialInstrumentAttributes15.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmNextFactor
	 * FinancialInstrumentAttributes15.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPreviousFactor
	 * FinancialInstrumentAttributes29.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmCurrentFactor
	 * FinancialInstrumentAttributes29.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmNextFactor
	 * FinancialInstrumentAttributes29.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCurrentFactor
	 * Debt2.mmCurrentFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextFactor
	 * Debt2.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPreviousFactor
	 * Debt2.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPreviousFactor
	 * FinancialInstrumentAttributes2.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmCurrentFactor
	 * FinancialInstrumentAttributes2.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmNextFactor
	 * FinancialInstrumentAttributes2.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPreviousFactor
	 * FinancialInstrumentAttributes48.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextFactor
	 * FinancialInstrumentAttributes48.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmPreviousFactor
	 * CorporateActionRate43.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmNextFactor
	 * CorporateActionRate43.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmPreviousFactor
	 * FinancialInstrumentAttributes50.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmNextFactor
	 * FinancialInstrumentAttributes50.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPreviousFactor
	 * FinancialInstrumentAttributes49.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextFactor
	 * FinancialInstrumentAttributes49.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmPreviousFactor
	 * CorporateActionRate56.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmNextFactor
	 * CorporateActionRate56.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmPreviousFactor
	 * FinancialInstrumentAttributes55.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmNextFactor
	 * FinancialInstrumentAttributes55.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmPreviousFactor
	 * FinancialInstrumentAttributes57.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmNextFactor
	 * FinancialInstrumentAttributes57.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmPreviousFactor
	 * FinancialInstrumentAttributes56.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmNextFactor
	 * FinancialInstrumentAttributes56.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPreviousFactor
	 * FinancialInstrumentAttributes63.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCurrentFactor
	 * FinancialInstrumentAttributes63.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextFactor
	 * FinancialInstrumentAttributes63.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPreviousFactor
	 * FinancialInstrumentAttributes64.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCurrentFactor
	 * FinancialInstrumentAttributes64.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextFactor
	 * FinancialInstrumentAttributes64.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPreviousFactor
	 * FinancialInstrumentAttributes66.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextFactor
	 * FinancialInstrumentAttributes66.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmPreviousFactor
	 * FinancialInstrumentAttributes65.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmNextFactor
	 * FinancialInstrumentAttributes65.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPreviousFactor
	 * FinancialInstrumentAttributes67.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextFactor
	 * FinancialInstrumentAttributes67.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmPreviousFactor
	 * CorporateActionRate66.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmNextFactor
	 * CorporateActionRate66.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmPreviousFactor
	 * FinancialInstrumentAttributes70.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmNextFactor
	 * FinancialInstrumentAttributes70.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmPreviousFactor
	 * FinancialInstrumentAttributes69.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmNextFactor
	 * FinancialInstrumentAttributes69.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmPreviousFactor
	 * FinancialInstrumentAttributes71.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmNextFactor
	 * FinancialInstrumentAttributes71.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmPreviousFactor
	 * CorporateActionRate78.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmNextFactor
	 * CorporateActionRate78.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPreviousFactor
	 * FinancialInstrumentAttributes75.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmCurrentFactor
	 * FinancialInstrumentAttributes75.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmNextFactor
	 * FinancialInstrumentAttributes75.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPreviousFactor
	 * FinancialInstrumentAttributes78.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmCurrentFactor
	 * FinancialInstrumentAttributes78.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmNextFactor
	 * FinancialInstrumentAttributes78.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCurrentFactor
	 * Debt3.mmCurrentFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextFactor
	 * Debt3.mmNextFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPreviousFactor
	 * Debt3.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPreviousFactor
	 * FinancialInstrumentAttributes79.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextFactor
	 * FinancialInstrumentAttributes79.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmPreviousFactor
	 * FinancialInstrumentAttributes81.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmNextFactor
	 * FinancialInstrumentAttributes81.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPreviousFactor
	 * FinancialInstrumentAttributes80.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextFactor
	 * FinancialInstrumentAttributes80.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmPreviousFactor
	 * FinancialInstrumentAttributes85.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmNextFactor
	 * FinancialInstrumentAttributes85.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmPreviousFactor
	 * FinancialInstrumentAttributes84.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmNextFactor
	 * FinancialInstrumentAttributes84.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmPreviousFactor
	 * FinancialInstrumentAttributes83.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmNextFactor
	 * FinancialInstrumentAttributes83.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPreviousFactor
	 * FinancialInstrumentAttributes91.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmCurrentFactor
	 * FinancialInstrumentAttributes91.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmNextFactor
	 * FinancialInstrumentAttributes91.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPreviousFactor
	 * FinancialInstrumentAttributes92.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmCurrentFactor
	 * FinancialInstrumentAttributes92.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmNextFactor
	 * FinancialInstrumentAttributes92.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmPreviousFactor
	 * CorporateActionRate91.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmNextFactor
	 * CorporateActionRate91.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96#mmPreviousFactor
	 * CorporateActionRate96.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96#mmNextFactor
	 * CorporateActionRate96.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmPreviousFactor
	 * FinancialInstrumentAttributes95.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmCurrentFactor
	 * FinancialInstrumentAttributes95.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmNextFactor
	 * FinancialInstrumentAttributes95.mmNextFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPreviousFactor
	 * FinancialInstrumentAttributes97.mmPreviousFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCurrentFactor
	 * FinancialInstrumentAttributes97.mmCurrentFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmNextFactor
	 * FinancialInstrumentAttributes97.mmNextFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmFactor = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPreviousFactor, FinancialInstrumentAttributes8.mmCurrentFactor, FinancialInstrumentAttributes8.mmNextFactor,
					FinancialInstrumentAttributes20.mmPreviousFactor, FinancialInstrumentAttributes20.mmCurrentFactor, FinancialInstrumentAttributes20.mmNextFactor, FinancialInstrumentAttributes35.mmPreviousFactor,
					FinancialInstrumentAttributes35.mmCurrentFactor, FinancialInstrumentAttributes35.mmNextFactor, FinancialInstrumentAttributes41.mmPreviousFactor, FinancialInstrumentAttributes41.mmCurrentFactor,
					FinancialInstrumentAttributes41.mmNextFactor, FinancialInstrumentAttributes6.mmPreviousFactor, FinancialInstrumentAttributes6.mmNextFactor, FinancialInstrumentAttributes9.mmPreviousFactor,
					FinancialInstrumentAttributes9.mmNextFactor, FinancialInstrumentAttributes18.mmPreviousFactor, FinancialInstrumentAttributes18.mmNextFactor, FinancialInstrumentAttributes22.mmPreviousFactor,
					FinancialInstrumentAttributes22.mmNextFactor, FinancialInstrumentAttributes32.mmPreviousFactor, FinancialInstrumentAttributes32.mmNextFactor, FinancialInstrumentAttributes38.mmPreviousFactor,
					FinancialInstrumentAttributes38.mmNextFactor, FinancialInstrumentAttributes7.mmPreviousFactor, FinancialInstrumentAttributes7.mmNextFactor, FinancialInstrumentAttributes5.mmPreviousFactor,
					FinancialInstrumentAttributes5.mmNextFactor, FinancialInstrumentAttributes11.mmPreviousFactor, FinancialInstrumentAttributes11.mmNextFactor, FinancialInstrumentAttributes10.mmPreviousFactor,
					FinancialInstrumentAttributes10.mmNextFactor, FinancialInstrumentAttributes19.mmPreviousFactor, FinancialInstrumentAttributes19.mmNextFactor, FinancialInstrumentAttributes16.mmPreviousFactor,
					FinancialInstrumentAttributes16.mmNextFactor, FinancialInstrumentAttributes23.mmPreviousFactor, FinancialInstrumentAttributes23.mmNextFactor, FinancialInstrumentAttributes24.mmPreviousFactor,
					FinancialInstrumentAttributes24.mmNextFactor, FinancialInstrumentAttributes33.mmPreviousFactor, FinancialInstrumentAttributes33.mmNextFactor, FinancialInstrumentAttributes34.mmPreviousFactor,
					FinancialInstrumentAttributes34.mmNextFactor, FinancialInstrumentAttributes39.mmPreviousFactor, FinancialInstrumentAttributes39.mmNextFactor, FinancialInstrumentAttributes40.mmPreviousFactor,
					FinancialInstrumentAttributes40.mmNextFactor, FinancialInstrumentAttributes43.mmPreviousFactor, FinancialInstrumentAttributes43.mmNextFactor, FinancialInstrumentAttributes45.mmPreviousFactor,
					FinancialInstrumentAttributes45.mmNextFactor, CorporateActionRate3.mmPreviousFactor, CorporateActionRate3.mmNextFactor, CorporateActionRate14.mmPreviousFactor, CorporateActionRate14.mmNextFactor,
					CorporateActionRate16.mmPreviousFactor, CorporateActionRate16.mmNextFactor, CorporateActionRate24.mmPreviousFactor, CorporateActionRate24.mmNextFactor, CorporateActionRate27.mmPreviousFactor,
					CorporateActionRate27.mmNextFactor, CorporateActionRate32.mmPreviousFactor, CorporateActionRate32.mmNextFactor, CorporateActionRate35.mmPreviousFactor, CorporateActionRate35.mmNextFactor,
					CorporateActionRate41.mmPreviousFactor, CorporateActionRate41.mmNextFactor, FinancialInstrumentAttributes4.mmPreviousFactor, FinancialInstrumentAttributes4.mmCurrentFactor, FinancialInstrumentAttributes4.mmNextFactor,
					FinancialInstrumentAttributes13.mmPreviousFactor, FinancialInstrumentAttributes13.mmCurrentFactor, FinancialInstrumentAttributes13.mmNextFactor, FinancialInstrumentAttributes21.mmPreviousFactor,
					FinancialInstrumentAttributes21.mmCurrentFactor, FinancialInstrumentAttributes21.mmNextFactor, FinancialInstrumentAttributes26.mmPreviousFactor, FinancialInstrumentAttributes26.mmCurrentFactor,
					FinancialInstrumentAttributes26.mmNextFactor, FinancialInstrumentAttributes36.mmPreviousFactor, FinancialInstrumentAttributes36.mmCurrentFactor, FinancialInstrumentAttributes36.mmNextFactor,
					FinancialInstrumentAttributes42.mmPreviousFactor, FinancialInstrumentAttributes42.mmCurrentFactor, FinancialInstrumentAttributes42.mmNextFactor, FinancialInstrumentAttributes27.mmPreviousFactor,
					FinancialInstrumentAttributes27.mmCurrentFactor, FinancialInstrumentAttributes27.mmNextFactor, FinancialInstrumentAttributes14.mmPreviousFactor, FinancialInstrumentAttributes14.mmCurrentFactor,
					FinancialInstrumentAttributes14.mmNextFactor, FinancialInstrumentAttributes30.mmPreviousFactor, FinancialInstrumentAttributes30.mmCurrentFactor, FinancialInstrumentAttributes30.mmNextFactor,
					FinancialInstrumentAttributes28.mmPreviousFactor, FinancialInstrumentAttributes28.mmCurrentFactor, FinancialInstrumentAttributes28.mmNextFactor, Debt1.mmCurrentFactor, Debt1.mmNextFactor, Debt1.mmPreviousFactor,
					FinancialInstrumentAttributes31.mmPreviousFactor, FinancialInstrumentAttributes31.mmCurrentFactor, FinancialInstrumentAttributes31.mmNextFactor, FinancialInstrumentAttributes31.mmEndFactor,
					FinancialInstrumentAttributes44.mmPreviousFactor, FinancialInstrumentAttributes44.mmCurrentFactor, FinancialInstrumentAttributes44.mmNextFactor, FinancialInstrumentAttributes44.mmEndFactor,
					FinancialInstrumentAttributes15.mmPreviousFactor, FinancialInstrumentAttributes15.mmCurrentFactor, FinancialInstrumentAttributes15.mmNextFactor, FinancialInstrumentAttributes29.mmPreviousFactor,
					FinancialInstrumentAttributes29.mmCurrentFactor, FinancialInstrumentAttributes29.mmNextFactor, Debt2.mmCurrentFactor, Debt2.mmNextFactor, Debt2.mmPreviousFactor, FinancialInstrumentAttributes2.mmPreviousFactor,
					FinancialInstrumentAttributes2.mmCurrentFactor, FinancialInstrumentAttributes2.mmNextFactor, FinancialInstrumentAttributes48.mmPreviousFactor, FinancialInstrumentAttributes48.mmNextFactor,
					CorporateActionRate43.mmPreviousFactor, CorporateActionRate43.mmNextFactor, FinancialInstrumentAttributes50.mmPreviousFactor, FinancialInstrumentAttributes50.mmNextFactor,
					FinancialInstrumentAttributes49.mmPreviousFactor, FinancialInstrumentAttributes49.mmNextFactor, CorporateActionRate56.mmPreviousFactor, CorporateActionRate56.mmNextFactor,
					FinancialInstrumentAttributes55.mmPreviousFactor, FinancialInstrumentAttributes55.mmNextFactor, FinancialInstrumentAttributes57.mmPreviousFactor, FinancialInstrumentAttributes57.mmNextFactor,
					FinancialInstrumentAttributes56.mmPreviousFactor, FinancialInstrumentAttributes56.mmNextFactor, FinancialInstrumentAttributes63.mmPreviousFactor, FinancialInstrumentAttributes63.mmCurrentFactor,
					FinancialInstrumentAttributes63.mmNextFactor, FinancialInstrumentAttributes64.mmPreviousFactor, FinancialInstrumentAttributes64.mmCurrentFactor, FinancialInstrumentAttributes64.mmNextFactor,
					FinancialInstrumentAttributes66.mmPreviousFactor, FinancialInstrumentAttributes66.mmNextFactor, FinancialInstrumentAttributes65.mmPreviousFactor, FinancialInstrumentAttributes65.mmNextFactor,
					FinancialInstrumentAttributes67.mmPreviousFactor, FinancialInstrumentAttributes67.mmNextFactor, CorporateActionRate66.mmPreviousFactor, CorporateActionRate66.mmNextFactor,
					FinancialInstrumentAttributes70.mmPreviousFactor, FinancialInstrumentAttributes70.mmNextFactor, FinancialInstrumentAttributes69.mmPreviousFactor, FinancialInstrumentAttributes69.mmNextFactor,
					FinancialInstrumentAttributes71.mmPreviousFactor, FinancialInstrumentAttributes71.mmNextFactor, CorporateActionRate78.mmPreviousFactor, CorporateActionRate78.mmNextFactor,
					FinancialInstrumentAttributes75.mmPreviousFactor, FinancialInstrumentAttributes75.mmCurrentFactor, FinancialInstrumentAttributes75.mmNextFactor, FinancialInstrumentAttributes78.mmPreviousFactor,
					FinancialInstrumentAttributes78.mmCurrentFactor, FinancialInstrumentAttributes78.mmNextFactor, Debt3.mmCurrentFactor, Debt3.mmNextFactor, Debt3.mmPreviousFactor, FinancialInstrumentAttributes79.mmPreviousFactor,
					FinancialInstrumentAttributes79.mmNextFactor, FinancialInstrumentAttributes81.mmPreviousFactor, FinancialInstrumentAttributes81.mmNextFactor, FinancialInstrumentAttributes80.mmPreviousFactor,
					FinancialInstrumentAttributes80.mmNextFactor, FinancialInstrumentAttributes85.mmPreviousFactor, FinancialInstrumentAttributes85.mmNextFactor, FinancialInstrumentAttributes84.mmPreviousFactor,
					FinancialInstrumentAttributes84.mmNextFactor, FinancialInstrumentAttributes83.mmPreviousFactor, FinancialInstrumentAttributes83.mmNextFactor, FinancialInstrumentAttributes91.mmPreviousFactor,
					FinancialInstrumentAttributes91.mmCurrentFactor, FinancialInstrumentAttributes91.mmNextFactor, FinancialInstrumentAttributes92.mmPreviousFactor, FinancialInstrumentAttributes92.mmCurrentFactor,
					FinancialInstrumentAttributes92.mmNextFactor, CorporateActionRate91.mmPreviousFactor, CorporateActionRate91.mmNextFactor, CorporateActionRate96.mmPreviousFactor, CorporateActionRate96.mmNextFactor,
					FinancialInstrumentAttributes95.mmPreviousFactor, FinancialInstrumentAttributes95.mmCurrentFactor, FinancialInstrumentAttributes95.mmNextFactor, FinancialInstrumentAttributes97.mmPreviousFactor,
					FinancialInstrumentAttributes97.mmCurrentFactor, FinancialInstrumentAttributes97.mmNextFactor);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getFactor();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setFactor(value);
		}
	};
	protected Max15NumericText poolNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPoolNumber
	 * FinancialInstrumentAttributes8.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPoolNumber
	 * FinancialInstrumentAttributes20.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPoolNumber
	 * FinancialInstrumentAttributes35.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPoolNumber
	 * FinancialInstrumentAttributes41.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPoolNumber
	 * FinancialInstrumentAttributes4.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPoolNumber
	 * FinancialInstrumentAttributes13.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPoolNumber
	 * FinancialInstrumentAttributes21.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPoolNumber
	 * FinancialInstrumentAttributes26.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPoolNumber
	 * FinancialInstrumentAttributes36.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPoolNumber
	 * FinancialInstrumentAttributes42.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPoolNumber
	 * FinancialInstrumentAttributes27.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPoolNumber
	 * FinancialInstrumentAttributes14.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPoolNumber
	 * FinancialInstrumentAttributes30.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPoolNumber
	 * FinancialInstrumentAttributes28.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPoolNumber
	 * FinancialInstrumentAttributes1.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPoolNumber
	 * FinancialInstrumentAttributes31.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPoolNumber
	 * FinancialInstrumentAttributes44.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPoolNumber
	 * FinancialInstrumentAttributes15.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPoolNumber
	 * FinancialInstrumentAttributes29.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmPoolNumber
	 * CommonFinancialInstrumentAttributes1.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPoolNumber
	 * FinancialInstrumentAttributes2.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPoolNumber
	 * FinancialInstrumentAttributes63.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPoolNumber
	 * FinancialInstrumentAttributes64.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPoolNumber
	 * FinancialInstrumentAttributes75.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPoolNumber
	 * FinancialInstrumentAttributes78.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPoolNumber
	 * CommonFinancialInstrumentAttributes4.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPoolNumber
	 * FinancialInstrumentAttributes91.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPoolNumber
	 * FinancialInstrumentAttributes92.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmPoolNumber
	 * FinancialInstrumentAttributes95.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPoolNumber
	 * FinancialInstrumentAttributes97.mmPoolNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Max15NumericText> mmPoolNumber = new MMBusinessAttribute<Debt, Max15NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPoolNumber, FinancialInstrumentAttributes20.mmPoolNumber, FinancialInstrumentAttributes35.mmPoolNumber, FinancialInstrumentAttributes41.mmPoolNumber,
					FinancialInstrumentAttributes4.mmPoolNumber, FinancialInstrumentAttributes13.mmPoolNumber, FinancialInstrumentAttributes21.mmPoolNumber, FinancialInstrumentAttributes26.mmPoolNumber,
					FinancialInstrumentAttributes36.mmPoolNumber, FinancialInstrumentAttributes42.mmPoolNumber, FinancialInstrumentAttributes27.mmPoolNumber, FinancialInstrumentAttributes14.mmPoolNumber,
					FinancialInstrumentAttributes30.mmPoolNumber, FinancialInstrumentAttributes28.mmPoolNumber, FinancialInstrumentAttributes1.mmPoolNumber, FinancialInstrumentAttributes31.mmPoolNumber,
					FinancialInstrumentAttributes44.mmPoolNumber, FinancialInstrumentAttributes15.mmPoolNumber, FinancialInstrumentAttributes29.mmPoolNumber, CommonFinancialInstrumentAttributes1.mmPoolNumber,
					FinancialInstrumentAttributes2.mmPoolNumber, FinancialInstrumentAttributes63.mmPoolNumber, FinancialInstrumentAttributes64.mmPoolNumber, FinancialInstrumentAttributes75.mmPoolNumber,
					FinancialInstrumentAttributes78.mmPoolNumber, CommonFinancialInstrumentAttributes4.mmPoolNumber, FinancialInstrumentAttributes91.mmPoolNumber, FinancialInstrumentAttributes92.mmPoolNumber,
					FinancialInstrumentAttributes95.mmPoolNumber, FinancialInstrumentAttributes97.mmPoolNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(Debt obj) {
			return obj.getPoolNumber();
		}

		@Override
		public void setValue(Debt obj, Max15NumericText value) {
			obj.setPoolNumber(value);
		}
	};
	protected YesNoIndicator variableRateIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmVariableRateIndicator
	 * FinancialInstrumentAttributes8.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmVariableRateIndicator
	 * FinancialInstrumentAttributes20.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmVariableRateIndicator
	 * FinancialInstrumentAttributes35.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmVariableRateIndicator
	 * FinancialInstrumentAttributes41.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmVariableRateIndicator
	 * FinancialInstrumentAttributes4.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmVariableRateIndicator
	 * FinancialInstrumentAttributes13.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmVariableRateIndicator
	 * FinancialInstrumentAttributes21.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmVariableRateIndicator
	 * FinancialInstrumentAttributes26.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmVariableRateIndicator
	 * FinancialInstrumentAttributes36.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmVariableRateIndicator
	 * FinancialInstrumentAttributes42.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmVariableRateIndicator
	 * FinancialInstrumentAttributes27.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmVariableRateIndicator
	 * FinancialInstrumentAttributes14.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmVariableRateIndicator
	 * FinancialInstrumentAttributes30.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmVariableRateIndicator
	 * FinancialInstrumentAttributes28.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmVariableRateIndicator
	 * Debt1.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmVariableRateIndicator
	 * FinancialInstrumentAttributes31.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmVariableRateIndicator
	 * FinancialInstrumentAttributes44.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmVariableRateIndicator
	 * FinancialInstrumentAttributes15.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmVariableRateIndicator
	 * FinancialInstrumentAttributes29.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmVariableRateIndicator
	 * Debt2.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmVariableRateIndicator
	 * FinancialInstrumentAttributes2.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmVariableRateIndicator
	 * FinancialInstrumentAttributes63.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmVariableRateIndicator
	 * FinancialInstrumentAttributes64.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmVariableRateIndicator
	 * FinancialInstrumentAttributes75.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmVariableRateIndicator
	 * FinancialInstrumentAttributes78.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmVariableRateIndicator
	 * Debt3.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmVariableRateIndicator
	 * FinancialInstrumentAttributes91.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmVariableRateIndicator
	 * FinancialInstrumentAttributes92.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmVariableRateIndicator
	 * FinancialInstrumentAttributes95.mmVariableRateIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmVariableRateIndicator
	 * FinancialInstrumentAttributes97.mmVariableRateIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest rate of an interest bearing instrument is reset periodically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmVariableRateIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmVariableRateIndicator, FinancialInstrumentAttributes20.mmVariableRateIndicator, FinancialInstrumentAttributes35.mmVariableRateIndicator,
					FinancialInstrumentAttributes41.mmVariableRateIndicator, FinancialInstrumentAttributes4.mmVariableRateIndicator, FinancialInstrumentAttributes13.mmVariableRateIndicator,
					FinancialInstrumentAttributes21.mmVariableRateIndicator, FinancialInstrumentAttributes26.mmVariableRateIndicator, FinancialInstrumentAttributes36.mmVariableRateIndicator,
					FinancialInstrumentAttributes42.mmVariableRateIndicator, FinancialInstrumentAttributes27.mmVariableRateIndicator, FinancialInstrumentAttributes14.mmVariableRateIndicator,
					FinancialInstrumentAttributes30.mmVariableRateIndicator, FinancialInstrumentAttributes28.mmVariableRateIndicator, Debt1.mmVariableRateIndicator, FinancialInstrumentAttributes31.mmVariableRateIndicator,
					FinancialInstrumentAttributes44.mmVariableRateIndicator, FinancialInstrumentAttributes15.mmVariableRateIndicator, FinancialInstrumentAttributes29.mmVariableRateIndicator, Debt2.mmVariableRateIndicator,
					FinancialInstrumentAttributes2.mmVariableRateIndicator, FinancialInstrumentAttributes63.mmVariableRateIndicator, FinancialInstrumentAttributes64.mmVariableRateIndicator,
					FinancialInstrumentAttributes75.mmVariableRateIndicator, FinancialInstrumentAttributes78.mmVariableRateIndicator, Debt3.mmVariableRateIndicator, FinancialInstrumentAttributes91.mmVariableRateIndicator,
					FinancialInstrumentAttributes92.mmVariableRateIndicator, FinancialInstrumentAttributes95.mmVariableRateIndicator, FinancialInstrumentAttributes97.mmVariableRateIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getVariableRateIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setVariableRateIndicator(value);
		}
	};
	protected YesNoIndicator callableIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmCallableIndicator
	 * FinancialInstrumentAttributes8.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmCallableIndicator
	 * FinancialInstrumentAttributes20.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCallableIndicator
	 * FinancialInstrumentAttributes35.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmCallableIndicator
	 * FinancialInstrumentAttributes41.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmCallableIndicator
	 * FinancialInstrumentAttributes4.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmCallableIndicator
	 * FinancialInstrumentAttributes13.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmCallableIndicator
	 * FinancialInstrumentAttributes21.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmCallableIndicator
	 * FinancialInstrumentAttributes26.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCallableIndicator
	 * FinancialInstrumentAttributes36.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmCallableIndicator
	 * FinancialInstrumentAttributes42.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmCallableIndicator
	 * FinancialInstrumentAttributes27.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmCallableIndicator
	 * FinancialInstrumentAttributes14.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmCallableIndicator
	 * FinancialInstrumentAttributes30.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmCallableIndicator
	 * FinancialInstrumentAttributes28.mmCallableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCallableIndicator
	 * Debt1.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCallableIndicator
	 * FinancialInstrumentStipulations.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCallableIndicator
	 * FinancialInstrumentAttributes31.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCallableIndicator
	 * FinancialInstrumentStipulations2.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCallableIndicator
	 * FinancialInstrumentAttributes44.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmCallableIndicator
	 * FinancialInstrumentAttributes15.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmCallableIndicator
	 * FinancialInstrumentAttributes29.mmCallableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCallableIndicator
	 * Debt2.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmCallableIndicator
	 * FinancialInstrumentAttributes2.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCallableIndicator
	 * FinancialInstrumentAttributes63.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCallableIndicator
	 * FinancialInstrumentAttributes64.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmCallableIndicator
	 * FinancialInstrumentAttributes75.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmCallableIndicator
	 * FinancialInstrumentAttributes78.mmCallableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCallableIndicator
	 * Debt3.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmCallableIndicator
	 * FinancialInstrumentAttributes91.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmCallableIndicator
	 * FinancialInstrumentAttributes92.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmCallableIndicator
	 * FinancialInstrumentAttributes95.mmCallableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCallableIndicator
	 * FinancialInstrumentAttributes97.mmCallableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmCallableIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmCallableIndicator, FinancialInstrumentAttributes20.mmCallableIndicator, FinancialInstrumentAttributes35.mmCallableIndicator,
					FinancialInstrumentAttributes41.mmCallableIndicator, FinancialInstrumentAttributes4.mmCallableIndicator, FinancialInstrumentAttributes13.mmCallableIndicator, FinancialInstrumentAttributes21.mmCallableIndicator,
					FinancialInstrumentAttributes26.mmCallableIndicator, FinancialInstrumentAttributes36.mmCallableIndicator, FinancialInstrumentAttributes42.mmCallableIndicator, FinancialInstrumentAttributes27.mmCallableIndicator,
					FinancialInstrumentAttributes14.mmCallableIndicator, FinancialInstrumentAttributes30.mmCallableIndicator, FinancialInstrumentAttributes28.mmCallableIndicator, Debt1.mmCallableIndicator,
					FinancialInstrumentStipulations.mmCallableIndicator, FinancialInstrumentAttributes31.mmCallableIndicator, FinancialInstrumentStipulations2.mmCallableIndicator, FinancialInstrumentAttributes44.mmCallableIndicator,
					FinancialInstrumentAttributes15.mmCallableIndicator, FinancialInstrumentAttributes29.mmCallableIndicator, Debt2.mmCallableIndicator, FinancialInstrumentAttributes2.mmCallableIndicator,
					FinancialInstrumentAttributes63.mmCallableIndicator, FinancialInstrumentAttributes64.mmCallableIndicator, FinancialInstrumentAttributes75.mmCallableIndicator, FinancialInstrumentAttributes78.mmCallableIndicator,
					Debt3.mmCallableIndicator, FinancialInstrumentAttributes91.mmCallableIndicator, FinancialInstrumentAttributes92.mmCallableIndicator, FinancialInstrumentAttributes95.mmCallableIndicator,
					FinancialInstrumentAttributes97.mmCallableIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getCallableIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setCallableIndicator(value);
		}
	};
	protected YesNoIndicator putableIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPutableIndicator
	 * FinancialInstrumentAttributes8.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPutableIndicator
	 * FinancialInstrumentAttributes20.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPutableIndicator
	 * FinancialInstrumentAttributes35.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPutableIndicator
	 * FinancialInstrumentAttributes41.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPutableIndicator
	 * FinancialInstrumentAttributes4.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPutableIndicator
	 * FinancialInstrumentAttributes13.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPutableIndicator
	 * FinancialInstrumentAttributes21.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPutableIndicator
	 * FinancialInstrumentAttributes26.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPutableIndicator
	 * FinancialInstrumentAttributes36.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPutableIndicator
	 * FinancialInstrumentAttributes42.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPutableIndicator
	 * FinancialInstrumentAttributes27.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPutableIndicator
	 * FinancialInstrumentAttributes14.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPutableIndicator
	 * FinancialInstrumentAttributes30.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPutableIndicator
	 * FinancialInstrumentAttributes28.mmPutableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPutableIndicator
	 * Debt1.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPutableIndicator
	 * FinancialInstrumentStipulations.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPutableIndicator
	 * FinancialInstrumentAttributes31.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPutableIndicator
	 * FinancialInstrumentStipulations2.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPutableIndicator
	 * FinancialInstrumentAttributes44.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPutableIndicator
	 * FinancialInstrumentAttributes15.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPutableIndicator
	 * FinancialInstrumentAttributes29.mmPutableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPutableIndicator
	 * Debt2.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPutableIndicator
	 * FinancialInstrumentAttributes2.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPutableIndicator
	 * FinancialInstrumentAttributes63.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPutableIndicator
	 * FinancialInstrumentAttributes64.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPutableIndicator
	 * FinancialInstrumentAttributes75.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPutableIndicator
	 * FinancialInstrumentAttributes78.mmPutableIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPutableIndicator
	 * Debt3.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmPutableIndicator
	 * FinancialInstrumentAttributes91.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmPutableIndicator
	 * FinancialInstrumentAttributes92.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmPutableIndicator
	 * FinancialInstrumentAttributes95.mmPutableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPutableIndicator
	 * FinancialInstrumentAttributes97.mmPutableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmPutableIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPutableIndicator, FinancialInstrumentAttributes20.mmPutableIndicator, FinancialInstrumentAttributes35.mmPutableIndicator,
					FinancialInstrumentAttributes41.mmPutableIndicator, FinancialInstrumentAttributes4.mmPutableIndicator, FinancialInstrumentAttributes13.mmPutableIndicator, FinancialInstrumentAttributes21.mmPutableIndicator,
					FinancialInstrumentAttributes26.mmPutableIndicator, FinancialInstrumentAttributes36.mmPutableIndicator, FinancialInstrumentAttributes42.mmPutableIndicator, FinancialInstrumentAttributes27.mmPutableIndicator,
					FinancialInstrumentAttributes14.mmPutableIndicator, FinancialInstrumentAttributes30.mmPutableIndicator, FinancialInstrumentAttributes28.mmPutableIndicator, Debt1.mmPutableIndicator,
					FinancialInstrumentStipulations.mmPutableIndicator, FinancialInstrumentAttributes31.mmPutableIndicator, FinancialInstrumentStipulations2.mmPutableIndicator, FinancialInstrumentAttributes44.mmPutableIndicator,
					FinancialInstrumentAttributes15.mmPutableIndicator, FinancialInstrumentAttributes29.mmPutableIndicator, Debt2.mmPutableIndicator, FinancialInstrumentAttributes2.mmPutableIndicator,
					FinancialInstrumentAttributes63.mmPutableIndicator, FinancialInstrumentAttributes64.mmPutableIndicator, FinancialInstrumentAttributes75.mmPutableIndicator, FinancialInstrumentAttributes78.mmPutableIndicator,
					Debt3.mmPutableIndicator, FinancialInstrumentAttributes91.mmPutableIndicator, FinancialInstrumentAttributes92.mmPutableIndicator, FinancialInstrumentAttributes95.mmPutableIndicator,
					FinancialInstrumentAttributes97.mmPutableIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getPutableIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setPutableIndicator(value);
		}
	};
	protected PercentageRate yieldToMaturityRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes35.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes41.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes36.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes42.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes63.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes64.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes75.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes78.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes91.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes92.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes95.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes97.mmYieldToMaturityRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of return anticipated on a bond when held until maturity date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmYieldToMaturityRate = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes35.mmYieldToMaturityRate, FinancialInstrumentAttributes41.mmYieldToMaturityRate, FinancialInstrumentAttributes36.mmYieldToMaturityRate,
					FinancialInstrumentAttributes42.mmYieldToMaturityRate, FinancialInstrumentAttributes63.mmYieldToMaturityRate, FinancialInstrumentAttributes64.mmYieldToMaturityRate, FinancialInstrumentAttributes75.mmYieldToMaturityRate,
					FinancialInstrumentAttributes78.mmYieldToMaturityRate, FinancialInstrumentAttributes91.mmYieldToMaturityRate, FinancialInstrumentAttributes92.mmYieldToMaturityRate, FinancialInstrumentAttributes95.mmYieldToMaturityRate,
					FinancialInstrumentAttributes97.mmYieldToMaturityRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getYieldToMaturityRate();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setYieldToMaturityRate(value);
		}
	};
	protected CurrencyAndAmount accruedCapitalisationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmAccruedCapitalisationAmount
	 * OtherAmounts12.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmAccruedCapitalisationAmount
	 * OtherAmounts14.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmAccruedCapitalisationAmount
	 * OtherAmounts20.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmAccruedCapitalisationAmount
	 * OtherAmounts4.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmAccruedCapitalisationAmount
	 * OtherAmounts5.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmAccruedCapitalisationAmount
	 * OtherAmounts17.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmAccruedCapitalisationAmount
	 * OtherAmounts23.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmAccruedCapitalisationAmount
	 * OtherAmounts3.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmAccruedCapitalisationAmount
	 * OtherAmounts7.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmAccruedCapitalisationAmount
	 * OtherAmounts9.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmAccruedCapitalisationAmount
	 * OtherAmounts10.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmAccruedCapitalisationAmount
	 * OtherAmounts18.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmAccruedCapitalisationAmount
	 * OtherAmounts24.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmAccruedCapitalisationAmount
	 * OtherAmounts13.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmAccruedCapitalisationAmount
	 * OtherAmounts1.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmAccruedCapitalisationAmount
	 * OtherAmounts16.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmAccruedCapitalisationAmount
	 * OtherAmounts2.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmAccruedCapitalisationAmount
	 * OtherAmounts6.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmAccruedCapitalisationAmount
	 * OtherAmounts15.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmAccruedCapitalisationAmount
	 * OtherAmounts22.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmAccruedCapitalisationAmount
	 * OtherAmounts28.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmAccruedCapitalisationAmount
	 * OtherAmounts30.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmAccruedCapitalisationAmount
	 * OtherAmounts31.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedCapitalisationAmount
	 * OtherAmounts29.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmAccruedCapitalisationAmount
	 * OtherAmounts35.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmAccruedCapitalisationAmount
	 * OtherAmounts34.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmAccruedCapitalisationAmount
	 * OtherAmounts38.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmAccruedCapitalisationAmount
	 * OtherAmounts33.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmAccruedCapitalisationAmount
	 * OtherAmounts41.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmAccruedCapitalisationAmount
	 * OtherAmounts39.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmAccruedCapitalisationAmount
	 * OtherAmounts40.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts42#mmAccruedCapitalisationAmount
	 * OtherAmounts42.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts43#mmAccruedCapitalisationAmount
	 * OtherAmounts43.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts44#mmAccruedCapitalisationAmount
	 * OtherAmounts44.mmAccruedCapitalisationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedCapitalisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, CurrencyAndAmount> mmAccruedCapitalisationAmount = new MMBusinessAttribute<Debt, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmAccruedCapitalisationAmount, OtherAmounts14.mmAccruedCapitalisationAmount, OtherAmounts20.mmAccruedCapitalisationAmount, OtherAmounts4.mmAccruedCapitalisationAmount,
					OtherAmounts5.mmAccruedCapitalisationAmount, OtherAmounts17.mmAccruedCapitalisationAmount, OtherAmounts23.mmAccruedCapitalisationAmount, OtherAmounts3.mmAccruedCapitalisationAmount,
					OtherAmounts7.mmAccruedCapitalisationAmount, OtherAmounts9.mmAccruedCapitalisationAmount, OtherAmounts10.mmAccruedCapitalisationAmount, OtherAmounts18.mmAccruedCapitalisationAmount,
					OtherAmounts24.mmAccruedCapitalisationAmount, OtherAmounts13.mmAccruedCapitalisationAmount, OtherAmounts1.mmAccruedCapitalisationAmount, OtherAmounts16.mmAccruedCapitalisationAmount,
					OtherAmounts2.mmAccruedCapitalisationAmount, OtherAmounts6.mmAccruedCapitalisationAmount, OtherAmounts15.mmAccruedCapitalisationAmount, OtherAmounts22.mmAccruedCapitalisationAmount,
					OtherAmounts28.mmAccruedCapitalisationAmount, OtherAmounts30.mmAccruedCapitalisationAmount, OtherAmounts31.mmAccruedCapitalisationAmount, OtherAmounts29.mmAccruedCapitalisationAmount,
					OtherAmounts35.mmAccruedCapitalisationAmount, OtherAmounts34.mmAccruedCapitalisationAmount, OtherAmounts38.mmAccruedCapitalisationAmount, OtherAmounts33.mmAccruedCapitalisationAmount,
					OtherAmounts41.mmAccruedCapitalisationAmount, OtherAmounts39.mmAccruedCapitalisationAmount, OtherAmounts40.mmAccruedCapitalisationAmount, OtherAmounts42.mmAccruedCapitalisationAmount,
					OtherAmounts43.mmAccruedCapitalisationAmount, OtherAmounts44.mmAccruedCapitalisationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Debt obj) {
			return obj.getAccruedCapitalisationAmount();
		}

		@Override
		public void setValue(Debt obj, CurrencyAndAmount value) {
			obj.setAccruedCapitalisationAmount(value);
		}
	};
	protected ISODateTime nextCouponDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmNextCouponDate
	 * FinancialInstrumentAttributes6.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmNextCouponDate
	 * FinancialInstrumentAttributes9.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmNextCouponDate
	 * FinancialInstrumentAttributes18.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmNextCouponDate
	 * FinancialInstrumentAttributes22.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmNextCouponDate
	 * FinancialInstrumentAttributes32.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmNextCouponDate
	 * FinancialInstrumentAttributes38.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmNextCouponDate
	 * FinancialInstrumentAttributes7.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmNextCouponDate
	 * FinancialInstrumentAttributes5.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmNextCouponDate
	 * FinancialInstrumentAttributes11.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmNextCouponDate
	 * FinancialInstrumentAttributes10.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmNextCouponDate
	 * FinancialInstrumentAttributes19.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmNextCouponDate
	 * FinancialInstrumentAttributes16.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmNextCouponDate
	 * FinancialInstrumentAttributes23.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmNextCouponDate
	 * FinancialInstrumentAttributes24.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmNextCouponDate
	 * FinancialInstrumentAttributes33.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmNextCouponDate
	 * FinancialInstrumentAttributes34.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmNextCouponDate
	 * FinancialInstrumentAttributes39.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmNextCouponDate
	 * FinancialInstrumentAttributes40.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmNextCouponDate
	 * FinancialInstrumentAttributes43.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmNextCouponDate
	 * FinancialInstrumentAttributes45.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextCouponDate
	 * FinancialInstrumentAttributes48.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmNextCouponDate
	 * FinancialInstrumentAttributes50.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextCouponDate
	 * FinancialInstrumentAttributes49.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmNextCouponDate
	 * FinancialInstrumentAttributes55.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmNextCouponDate
	 * FinancialInstrumentAttributes57.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmNextCouponDate
	 * FinancialInstrumentAttributes56.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextCouponDate
	 * FinancialInstrumentAttributes66.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmNextCouponDate
	 * FinancialInstrumentAttributes65.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextCouponDate
	 * FinancialInstrumentAttributes67.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmNextCouponDate
	 * FinancialInstrumentAttributes70.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmNextCouponDate
	 * FinancialInstrumentAttributes69.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmNextCouponDate
	 * FinancialInstrumentAttributes71.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextCouponDate
	 * FinancialInstrumentAttributes79.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmNextCouponDate
	 * FinancialInstrumentAttributes81.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextCouponDate
	 * FinancialInstrumentAttributes80.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmNextCouponDate
	 * FinancialInstrumentAttributes85.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmNextCouponDate
	 * FinancialInstrumentAttributes84.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmNextCouponDate
	 * FinancialInstrumentAttributes83.mmNextCouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmNextCouponDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes6.mmNextCouponDate, FinancialInstrumentAttributes9.mmNextCouponDate, FinancialInstrumentAttributes18.mmNextCouponDate,
					FinancialInstrumentAttributes22.mmNextCouponDate, FinancialInstrumentAttributes32.mmNextCouponDate, FinancialInstrumentAttributes38.mmNextCouponDate, FinancialInstrumentAttributes7.mmNextCouponDate,
					FinancialInstrumentAttributes5.mmNextCouponDate, FinancialInstrumentAttributes11.mmNextCouponDate, FinancialInstrumentAttributes10.mmNextCouponDate, FinancialInstrumentAttributes19.mmNextCouponDate,
					FinancialInstrumentAttributes16.mmNextCouponDate, FinancialInstrumentAttributes23.mmNextCouponDate, FinancialInstrumentAttributes24.mmNextCouponDate, FinancialInstrumentAttributes33.mmNextCouponDate,
					FinancialInstrumentAttributes34.mmNextCouponDate, FinancialInstrumentAttributes39.mmNextCouponDate, FinancialInstrumentAttributes40.mmNextCouponDate, FinancialInstrumentAttributes43.mmNextCouponDate,
					FinancialInstrumentAttributes45.mmNextCouponDate, FinancialInstrumentAttributes48.mmNextCouponDate, FinancialInstrumentAttributes50.mmNextCouponDate, FinancialInstrumentAttributes49.mmNextCouponDate,
					FinancialInstrumentAttributes55.mmNextCouponDate, FinancialInstrumentAttributes57.mmNextCouponDate, FinancialInstrumentAttributes56.mmNextCouponDate, FinancialInstrumentAttributes66.mmNextCouponDate,
					FinancialInstrumentAttributes65.mmNextCouponDate, FinancialInstrumentAttributes67.mmNextCouponDate, FinancialInstrumentAttributes70.mmNextCouponDate, FinancialInstrumentAttributes69.mmNextCouponDate,
					FinancialInstrumentAttributes71.mmNextCouponDate, FinancialInstrumentAttributes79.mmNextCouponDate, FinancialInstrumentAttributes81.mmNextCouponDate, FinancialInstrumentAttributes80.mmNextCouponDate,
					FinancialInstrumentAttributes85.mmNextCouponDate, FinancialInstrumentAttributes84.mmNextCouponDate, FinancialInstrumentAttributes83.mmNextCouponDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::COUP"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getNextCouponDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setNextCouponDate(value);
		}
	};
	protected ISODateTime nextFactorDate;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextFactorDate
	 * Debt1.mmNextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmNextFactorDate
	 * FinancialInstrumentAttributes31.mmNextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmNextFactorDate
	 * FinancialInstrumentAttributes44.mmNextFactorDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextFactorDate
	 * Debt2.mmNextFactorDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmNextFactorDate
	 * FinancialInstrumentAttributes2.mmNextFactorDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmNextFactorDate
	 * Debt3.mmNextFactorDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date that the current factor will be changed to a new factor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmNextFactorDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmNextFactorDate, FinancialInstrumentAttributes31.mmNextFactorDate, FinancialInstrumentAttributes44.mmNextFactorDate, Debt2.mmNextFactorDate,
					FinancialInstrumentAttributes2.mmNextFactorDate, Debt3.mmNextFactorDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getNextFactorDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setNextFactorDate(value);
		}
	};
	protected YesNoIndicator oddCouponIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmOddCouponIndicator
	 * Debt1.mmOddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmOddCouponIndicator
	 * FinancialInstrumentAttributes31.mmOddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmOddCouponIndicator
	 * FinancialInstrumentAttributes44.mmOddCouponIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmOddCouponIndicator
	 * Debt2.mmOddCouponIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmOddCouponIndicator
	 * FinancialInstrumentAttributes2.mmOddCouponIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmOddCouponIndicator
	 * Debt3.mmOddCouponIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddCouponIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmOddCouponIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmOddCouponIndicator, FinancialInstrumentAttributes31.mmOddCouponIndicator, FinancialInstrumentAttributes44.mmOddCouponIndicator, Debt2.mmOddCouponIndicator,
					FinancialInstrumentAttributes2.mmOddCouponIndicator, Debt3.mmOddCouponIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getOddCouponIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setOddCouponIndicator(value);
		}
	};
	protected Number cPProgram;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCPProgram
	 * Debt1.mmCPProgram}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCPProgram
	 * Debt2.mmCPProgram}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCPProgram
	 * Debt3.mmCPProgram}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Number> mmCPProgram = new MMBusinessAttribute<Debt, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmCPProgram, Debt2.mmCPProgram, Debt3.mmCPProgram);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Debt obj) {
			return obj.getCPProgram();
		}

		@Override
		public void setValue(Debt obj, Number value) {
			obj.setCPProgram(value);
		}
	};
	protected Max350Text cPRegistrationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCPRegistrationType
	 * Debt1.mmCPRegistrationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCPRegistrationType
	 * Debt2.mmCPRegistrationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCPRegistrationType
	 * Debt3.mmCPRegistrationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPRegistrationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration type of a commercial paper issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Max350Text> mmCPRegistrationType = new MMBusinessAttribute<Debt, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmCPRegistrationType, Debt2.mmCPRegistrationType, Debt3.mmCPRegistrationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Debt obj) {
			return obj.getCPRegistrationType();
		}

		@Override
		public void setValue(Debt obj, Max350Text value) {
			obj.setCPRegistrationType(value);
		}
	};
	protected YesNoIndicator convertibleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmConvertibleIndicator
	 * Debt1.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmConvertibleIndicator
	 * FinancialInstrumentStipulations.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmConvertibleIndicator
	 * FinancialInstrumentAttributes31.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmConvertibleIndicator
	 * FinancialInstrumentStipulations2.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmConvertibleIndicator
	 * FinancialInstrumentAttributes44.mmConvertibleIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmCouponRange
	 * Debt2.mmCouponRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmConvertibleIndicator
	 * FinancialInstrumentAttributes2.mmConvertibleIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmCouponRange
	 * Debt3.mmCouponRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing security is convertible into another type of security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmConvertibleIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConvertibleIndicator, FinancialInstrumentStipulations.mmConvertibleIndicator, FinancialInstrumentAttributes31.mmConvertibleIndicator,
					FinancialInstrumentStipulations2.mmConvertibleIndicator, FinancialInstrumentAttributes44.mmConvertibleIndicator, Debt2.mmCouponRange, FinancialInstrumentAttributes2.mmConvertibleIndicator, Debt3.mmCouponRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getConvertibleIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setConvertibleIndicator(value);
		}
	};
	protected YesNoIndicator preFundedIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPreFundedIndicator
	 * Debt1.mmPreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPreFundedIndicator
	 * FinancialInstrumentStipulations.mmPreFundedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPreFundedIndicator
	 * FinancialInstrumentStipulations2.mmPreFundedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPreFundedIndicator
	 * Debt2.mmPreFundedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPreFundedIndicator
	 * Debt3.mmPreFundedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFundedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmPreFundedIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPreFundedIndicator, FinancialInstrumentStipulations.mmPreFundedIndicator, FinancialInstrumentStipulations2.mmPreFundedIndicator, Debt2.mmPreFundedIndicator,
					Debt3.mmPreFundedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getPreFundedIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setPreFundedIndicator(value);
		}
	};
	protected YesNoIndicator escrowedIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmEscrowedIndicator
	 * Debt1.mmEscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmEscrowedIndicator
	 * FinancialInstrumentStipulations.mmEscrowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmEscrowedIndicator
	 * FinancialInstrumentStipulations2.mmEscrowedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmEscrowedIndicator
	 * Debt2.mmEscrowedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmEscrowedIndicator
	 * Debt3.mmEscrowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EscrowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmEscrowedIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmEscrowedIndicator, FinancialInstrumentStipulations.mmEscrowedIndicator, FinancialInstrumentStipulations2.mmEscrowedIndicator, Debt2.mmEscrowedIndicator, Debt3.mmEscrowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getEscrowedIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setEscrowedIndicator(value);
		}
	};
	protected YesNoIndicator perpetualIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPerpetualIndicator
	 * Debt1.mmPerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPerpetualIndicator
	 * FinancialInstrumentStipulations.mmPerpetualIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPerpetualIndicator
	 * FinancialInstrumentStipulations2.mmPerpetualIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPerpetualIndicator
	 * Debt2.mmPerpetualIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPerpetualIndicator
	 * Debt3.mmPerpetualIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerpetualIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the security has no maturity date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmPerpetualIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPerpetualIndicator, FinancialInstrumentStipulations.mmPerpetualIndicator, FinancialInstrumentStipulations2.mmPerpetualIndicator, Debt2.mmPerpetualIndicator,
					Debt3.mmPerpetualIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getPerpetualIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setPerpetualIndicator(value);
		}
	};
	protected YesNoIndicator subordinatedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmSubordinatedIndicator
	 * Debt1.mmSubordinatedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSubordinatedIndicator
	 * Debt2.mmSubordinatedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmSubordinatedIndicator
	 * Debt3.mmSubordinatedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a subordinated security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmSubordinatedIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmSubordinatedIndicator, Debt2.mmSubordinatedIndicator, Debt3.mmSubordinatedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getSubordinatedIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setSubordinatedIndicator(value);
		}
	};
	protected YesNoIndicator extendibleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmExtendibleIndicator
	 * Debt1.mmExtendibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmExtendibleIndicator
	 * Debt2.mmExtendibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmExtendibleIndicator
	 * Debt3.mmExtendibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmExtendibleIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmExtendibleIndicator, Debt2.mmExtendibleIndicator, Debt3.mmExtendibleIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getExtendibleIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setExtendibleIndicator(value);
		}
	};
	protected DateTimePeriod extendiblePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
	 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmExtendiblePeriod
	 * Debt1.mmExtendiblePeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmExtendiblePeriod
	 * Debt2.mmExtendiblePeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmExtendiblePeriod
	 * Debt3.mmExtendiblePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a date might be extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Debt, DateTimePeriod> mmExtendiblePeriod = new MMBusinessAssociationEnd<Debt, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmExtendiblePeriod, Debt2.mmExtendiblePeriod, Debt3.mmExtendiblePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmExtendiblePeriodDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Debt obj) {
			return obj.getExtendiblePeriod();
		}

		@Override
		public void setValue(Debt obj, DateTimePeriod value) {
			obj.setExtendiblePeriod(value);
		}
	};
	protected CurrencyAndAmount overAllotmentAmount;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmOverAllotmentAmount
	 * Debt1.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmOverAllotmentAmount
	 * FinancialInstrumentStipulations.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmOverAllotmentAmount
	 * FinancialInstrumentStipulations2.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentAmount
	 * Debt2.mmOverAllotmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmOverAllotmentAmount
	 * Debt3.mmOverAllotmentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, CurrencyAndAmount> mmOverAllotmentAmount = new MMBusinessAttribute<Debt, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmOverAllotmentAmount, FinancialInstrumentStipulations.mmOverAllotmentAmount, FinancialInstrumentStipulations2.mmOverAllotmentAmount, Debt2.mmOverAllotmentAmount,
					Debt3.mmOverAllotmentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Debt obj) {
			return obj.getOverAllotmentAmount();
		}

		@Override
		public void setValue(Debt obj, CurrencyAndAmount value) {
			obj.setOverAllotmentAmount(value);
		}
	};
	protected PercentageRate overAllotmentRate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmOverAllotmentRate
	 * Debt1.mmOverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmOverAllotmentRate
	 * FinancialInstrumentStipulations.mmOverAllotmentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmOverAllotmentRate
	 * FinancialInstrumentStipulations2.mmOverAllotmentRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmOverAllotmentRate
	 * Debt2.mmOverAllotmentRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmOverAllotmentRate
	 * Debt3.mmOverAllotmentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllotmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage for which a security can be overalloted (as in greenshoe option)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmOverAllotmentRate = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmOverAllotmentRate, FinancialInstrumentStipulations.mmOverAllotmentRate, FinancialInstrumentStipulations2.mmOverAllotmentRate, Debt2.mmOverAllotmentRate, Debt3.mmOverAllotmentRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getOverAllotmentRate();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setOverAllotmentRate(value);
		}
	};
	protected YesNoIndicator amortisableIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmAmortisableIndicator
	 * Debt1.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAmortisableIndicator
	 * FinancialInstrumentStipulations.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAlternativeMinimumTaxIndicator
	 * FinancialInstrumentStipulations.mmAlternativeMinimumTaxIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAmortisableIndicator
	 * FinancialInstrumentStipulations2.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmAmortisableIndicator
	 * Debt2.mmAmortisableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmAmortisableIndicator
	 * Debt3.mmAmortisableIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether repayment is made via regular principal and interest payments over time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmAmortisableIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmAmortisableIndicator, FinancialInstrumentStipulations.mmAmortisableIndicator, FinancialInstrumentStipulations.mmAlternativeMinimumTaxIndicator,
					FinancialInstrumentStipulations2.mmAmortisableIndicator, Debt2.mmAmortisableIndicator, Debt3.mmAmortisableIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getAmortisableIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setAmortisableIndicator(value);
		}
	};
	protected DistributionPolicyCode capitalisedInterest;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmCapitalisedInterest
	 * Debt1.mmCapitalisedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmCapitalisedInterest
	 * Debt2.mmCapitalisedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmCapitalisedInterest
	 * Debt3.mmCapitalisedInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalisedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DistributionPolicyCode> mmCapitalisedInterest = new MMBusinessAttribute<Debt, DistributionPolicyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmCapitalisedInterest, Debt2.mmCapitalisedInterest, Debt3.mmCapitalisedInterest);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}

		@Override
		public DistributionPolicyCode getValue(Debt obj) {
			return obj.getCapitalisedInterest();
		}

		@Override
		public void setValue(Debt obj, DistributionPolicyCode value) {
			obj.setCapitalisedInterest(value);
		}
	};
	protected List<CurrencyAndAmount> actualDenominationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmActualDenominationAmount
	 * Debt1.mmActualDenominationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmActualDenominationAmount
	 * Debt2.mmActualDenominationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmActualDenominationAmount
	 * Debt3.mmActualDenominationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDenominationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value per security unit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, List<CurrencyAndAmount>> mmActualDenominationAmount = new MMBusinessAttribute<Debt, List<CurrencyAndAmount>>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmActualDenominationAmount, Debt2.mmActualDenominationAmount, Debt3.mmActualDenominationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(Debt obj) {
			return obj.getActualDenominationAmount();
		}

		@Override
		public void setValue(Debt obj, List<CurrencyAndAmount> value) {
			obj.setActualDenominationAmount(value);
		}
	};
	protected DecimalNumber pieces;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPieces
	 * Debt1.mmPieces}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPieces
	 * Debt2.mmPieces}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPieces
	 * Debt3.mmPieces}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pieces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of pieces composing a pool of financial assets."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmPieces = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPieces, Debt2.mmPieces, Debt3.mmPieces);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getPieces();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setPieces(value);
		}
	};
	protected DecimalNumber poolsMaximum;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsMaximum
	 * Debt1.mmPoolsMaximum}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsMaximum
	 * Debt2.mmPoolsMaximum}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsMaximum
	 * Debt3.mmPoolsMaximum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsMaximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of assets by which a security is backed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmPoolsMaximum = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPoolsMaximum, Debt2.mmPoolsMaximum, Debt3.mmPoolsMaximum);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getPoolsMaximum();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setPoolsMaximum(value);
		}
	};
	protected DecimalNumber poolsPerMillion;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerMillion
	 * Debt1.mmPoolsPerMillion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerMillion
	 * Debt2.mmPoolsPerMillion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerMillion
	 * Debt3.mmPoolsPerMillion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerMillion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmPoolsPerMillion = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPoolsPerMillion, Debt2.mmPoolsPerMillion, Debt3.mmPoolsPerMillion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getPoolsPerMillion();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setPoolsPerMillion(value);
		}
	};
	protected DecimalNumber poolsPerLot;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerLot
	 * Debt1.mmPoolsPerLot}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerLot
	 * Debt2.mmPoolsPerLot}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerLot
	 * Debt3.mmPoolsPerLot}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmPoolsPerLot = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPoolsPerLot, Debt2.mmPoolsPerLot, Debt3.mmPoolsPerLot);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getPoolsPerLot();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setPoolsPerLot(value);
		}
	};
	protected DecimalNumber poolsPerTrade;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerTrade
	 * Debt1.mmPoolsPerTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPoolsPerTrade
	 * Debt2.mmPoolsPerTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPoolsPerTrade
	 * Debt3.mmPoolsPerTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolsPerTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmPoolsPerTrade = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPoolsPerTrade, Debt2.mmPoolsPerTrade, Debt3.mmPoolsPerTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getPoolsPerTrade();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setPoolsPerTrade(value);
		}
	};
	protected YesNoIndicator constantPrePaymentPenalty;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmConstantPrePaymentPenaltyIndicator
	 * Debt1.mmConstantPrePaymentPenaltyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentPenaltyIndicator
	 * Debt2.mmConstantPrePaymentPenaltyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmConstantPrePaymentPenaltyIndicator
	 * Debt3.mmConstantPrePaymentPenaltyIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentPenalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmConstantPrePaymentPenalty = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConstantPrePaymentPenaltyIndicator, Debt2.mmConstantPrePaymentPenaltyIndicator, Debt3.mmConstantPrePaymentPenaltyIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentPenalty";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getConstantPrePaymentPenalty();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setConstantPrePaymentPenalty(value);
		}
	};
	protected PrePaymentSpeedCode prePaymentSpeed;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPrePaymentSpeed
	 * Debt1.mmPrePaymentSpeed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaymentSpeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PrePaymentSpeedCode> mmPrePaymentSpeed = new MMBusinessAttribute<Debt, PrePaymentSpeedCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPrePaymentSpeed);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}

		@Override
		public PrePaymentSpeedCode getValue(Debt obj) {
			return obj.getPrePaymentSpeed();
		}

		@Override
		public void setValue(Debt obj, PrePaymentSpeedCode value) {
			obj.setPrePaymentSpeed(value);
		}
	};
	protected PercentageRate constantPrePaymentYield;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmConstantPrePaymentYield
	 * Debt1.mmConstantPrePaymentYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmConstantPrePaymentYield
	 * Debt2.mmConstantPrePaymentYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmConstantPrePaymentYield
	 * Debt3.mmConstantPrePaymentYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measure of prepayment as a yield of the current outstanding loan balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmConstantPrePaymentYield = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConstantPrePaymentYield, Debt2.mmConstantPrePaymentYield, Debt3.mmConstantPrePaymentYield);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getConstantPrePaymentYield();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setConstantPrePaymentYield(value);
		}
	};
	protected PercentageRate weightedAverageCoupon;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageCoupon
	 * Debt1.mmWeightedAverageCoupon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageCoupon
	 * Debt2.mmWeightedAverageCoupon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageCoupon
	 * Debt3.mmWeightedAverageCoupon}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmWeightedAverageCoupon = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmWeightedAverageCoupon, Debt2.mmWeightedAverageCoupon, Debt3.mmWeightedAverageCoupon);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getWeightedAverageCoupon();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setWeightedAverageCoupon(value);
		}
	};
	protected DecimalNumber weightedAverageLife;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageLife
	 * Debt1.mmWeightedAverageLife}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLife
	 * Debt2.mmWeightedAverageLife}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageLife
	 * Debt3.mmWeightedAverageLife}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average life of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmWeightedAverageLife = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmWeightedAverageLife, Debt2.mmWeightedAverageLife, Debt3.mmWeightedAverageLife);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getWeightedAverageLife();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setWeightedAverageLife(value);
		}
	};
	protected DecimalNumber weightedAverageLoan;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageLoan
	 * Debt1.mmWeightedAverageLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageLoan
	 * Debt2.mmWeightedAverageLoan}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageLoan
	 * Debt3.mmWeightedAverageLoan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average loan of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmWeightedAverageLoan = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmWeightedAverageLoan, Debt2.mmWeightedAverageLoan, Debt3.mmWeightedAverageLoan);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getWeightedAverageLoan();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setWeightedAverageLoan(value);
		}
	};
	protected DecimalNumber weightedAverageMaturity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageMaturity
	 * Debt1.mmWeightedAverageMaturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmWeightedAverageMaturity
	 * Debt2.mmWeightedAverageMaturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmWeightedAverageMaturity
	 * Debt3.mmWeightedAverageMaturity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the weighted average maturity of the fixed income instrument (expressed in months)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DecimalNumber> mmWeightedAverageMaturity = new MMBusinessAttribute<Debt, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmWeightedAverageMaturity, Debt2.mmWeightedAverageMaturity, Debt3.mmWeightedAverageMaturity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Debt obj) {
			return obj.getWeightedAverageMaturity();
		}

		@Override
		public void setValue(Debt obj, DecimalNumber value) {
			obj.setWeightedAverageMaturity(value);
		}
	};
	protected YesNoIndicator insuredIndicator;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmInsuredIndicator
	 * Debt1.mmInsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmInsuredIndicator
	 * FinancialInstrumentStipulations.mmInsuredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmInsuredIndicator
	 * FinancialInstrumentStipulations2.mmInsuredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInsuredIndicator
	 * Debt2.mmInsuredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmInsuredIndicator
	 * Debt3.mmInsuredIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruments is backed by any kind of asset or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmInsuredIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmInsuredIndicator, FinancialInstrumentStipulations.mmInsuredIndicator, FinancialInstrumentStipulations2.mmInsuredIndicator, Debt2.mmInsuredIndicator, Debt3.mmInsuredIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getInsuredIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setInsuredIndicator(value);
		}
	};
	protected YesNoIndicator bankQualified;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmBankQualifiedIndicator
	 * Debt1.mmBankQualifiedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmBankQualifiedIndicator
	 * Debt2.mmBankQualifiedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmBankQualifiedIndicator
	 * Debt3.mmBankQualifiedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankQualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is bank qualified (usually applies to loan products)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmBankQualified = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmBankQualifiedIndicator, Debt2.mmBankQualifiedIndicator, Debt3.mmBankQualifiedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankQualified";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getBankQualified();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setBankQualified(value);
		}
	};
	protected PercentageRate autoReinvestment;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmAutoReinvestment
	 * FinancialInstrumentStipulations.mmAutoReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAutoReinvestment
	 * FinancialInstrumentStipulations2.mmAutoReinvestment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmAutoReinvestment
	 * Debt2.mmAutoReinvestment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmAutoReinvestment
	 * Debt3.mmAutoReinvestment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, PercentageRate> mmAutoReinvestment = new MMBusinessAttribute<Debt, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmAutoReinvestment, FinancialInstrumentStipulations2.mmAutoReinvestment, Debt2.mmAutoReinvestment, Debt3.mmAutoReinvestment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Debt obj) {
			return obj.getAutoReinvestment();
		}

		@Override
		public void setValue(Debt obj, PercentageRate value) {
			obj.setAutoReinvestment(value);
		}
	};
	protected DateTimePeriod customDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
	 * DateTimePeriod.mmCustomDateDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmCustomDate
	 * FinancialInstrumentStipulations.mmCustomDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmCustomDate
	 * FinancialInstrumentStipulations2.mmCustomDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction to override an investment's default start and/or end date with a custom date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Debt, DateTimePeriod> mmCustomDate = new MMBusinessAssociationEnd<Debt, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmCustomDate, FinancialInstrumentStipulations2.mmCustomDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmCustomDateDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Debt obj) {
			return obj.getCustomDate();
		}

		@Override
		public void setValue(Debt obj, DateTimePeriod value) {
			obj.setCustomDate(value);
		}
	};
	protected Number lookBack;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmLookBack
	 * FinancialInstrumentStipulations.mmLookBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmLookBack
	 * FinancialInstrumentStipulations2.mmLookBack}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmLookBack
	 * Debt2.mmLookBack}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmLookBack
	 * Debt3.mmLookBack}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LookBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TTCO//GTDL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Number> mmLookBack = new MMBusinessAttribute<Debt, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmLookBack, FinancialInstrumentStipulations2.mmLookBack, Debt2.mmLookBack, Debt3.mmLookBack);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TTCO//GTDL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Debt obj) {
			return obj.getLookBack();
		}

		@Override
		public void setValue(Debt obj, Number value) {
			obj.setLookBack(value);
		}
	};
	protected SecuritiesQuantity minimumDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
	 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumDenomination
	 * FinancialInstrumentStipulations.mmMinimumDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumDenomination
	 * FinancialInstrumentStipulations2.mmMinimumDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum denomination of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Debt, com.tools20022.repository.entity.SecuritiesQuantity> mmMinimumDenomination = new MMBusinessAssociationEnd<Debt, com.tools20022.repository.entity.SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmMinimumDenomination, FinancialInstrumentStipulations2.mmMinimumDenomination);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumDenominationDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesQuantity getValue(Debt obj) {
			return obj.getMinimumDenomination();
		}

		@Override
		public void setValue(Debt obj, com.tools20022.repository.entity.SecuritiesQuantity value) {
			obj.setMinimumDenomination(value);
		}
	};
	protected Number maximumSubstitution;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMaximumSubstitution
	 * FinancialInstrumentStipulations.mmMaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMaximumSubstitution
	 * FinancialInstrumentStipulations2.mmMaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmMaximumSubstitution
	 * Debt2.mmMaximumSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmMaximumSubstitution
	 * Debt3.mmMaximumSubstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of time the collateral can be substitute."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Number> mmMaximumSubstitution = new MMBusinessAttribute<Debt, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmMaximumSubstitution, FinancialInstrumentStipulations2.mmMaximumSubstitution, Debt2.mmMaximumSubstitution, Debt3.mmMaximumSubstitution);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Debt obj) {
			return obj.getMaximumSubstitution();
		}

		@Override
		public void setValue(Debt obj, Number value) {
			obj.setMaximumSubstitution(value);
		}
	};
	protected SecuritiesQuantity minimumIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
	 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMinimumIncrement
	 * FinancialInstrumentStipulations.mmMinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMinimumIncrement
	 * FinancialInstrumentStipulations2.mmMinimumIncrement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMinimumIncrement
	 * Debt2.mmMinimumIncrement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMinimumIncrement
	 * Debt3.mmMinimumIncrement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable increments of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Debt, com.tools20022.repository.entity.SecuritiesQuantity> mmMinimumIncrement = new MMBusinessAssociationEnd<Debt, com.tools20022.repository.entity.SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmMinimumIncrement, FinancialInstrumentStipulations2.mmMinimumIncrement, Debt2.mmMinimumIncrement, Debt3.mmMinimumIncrement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumIncrementDebt;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesQuantity getValue(Debt obj) {
			return obj.getMinimumIncrement();
		}

		@Override
		public void setValue(Debt obj, com.tools20022.repository.entity.SecuritiesQuantity value) {
			obj.setMinimumIncrement(value);
		}
	};
	protected Max350Text production;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmProduction
	 * FinancialInstrumentStipulations.mmProduction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmProduction
	 * FinancialInstrumentStipulations2.mmProduction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Production"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Max350Text> mmProduction = new MMBusinessAttribute<Debt, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmProduction, FinancialInstrumentStipulations2.mmProduction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Debt obj) {
			return obj.getProduction();
		}

		@Override
		public void setValue(Debt obj, Max350Text value) {
			obj.setProduction(value);
		}
	};
	protected YesNoIndicator restricted;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmRestrictedIndicator
	 * FinancialInstrumentStipulations.mmRestrictedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmRestrictedIndicator
	 * FinancialInstrumentStipulations2.mmRestrictedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the securities is restricted or not (as per Rule 144)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmRestricted = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmRestrictedIndicator, FinancialInstrumentStipulations2.mmRestrictedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getRestricted();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setRestricted(value);
		}
	};
	protected FrequencyCode priceFrequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPriceFrequency
	 * FinancialInstrumentStipulations.mmPriceFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPriceFrequency
	 * FinancialInstrumentStipulations2.mmPriceFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPriceFrequency
	 * Debt2.mmPriceFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPriceFrequency
	 * Debt3.mmPriceFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, FrequencyCode> mmPriceFrequency = new MMBusinessAttribute<Debt, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmPriceFrequency, FinancialInstrumentStipulations2.mmPriceFrequency, Debt2.mmPriceFrequency, Debt3.mmPriceFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(Debt obj) {
			return obj.getPriceFrequency();
		}

		@Override
		public void setValue(Debt obj, FrequencyCode value) {
			obj.setPriceFrequency(value);
		}
	};
	protected FrequencyCode substitutionFrequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSubstitutionFrequency
	 * FinancialInstrumentStipulations.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSubstitutionFrequency
	 * FinancialInstrumentStipulations2.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionFrequency
	 * Debt2.mmSubstitutionFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmSubstitutionFrequency
	 * Debt3.mmSubstitutionFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of times collateral can be substituted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, FrequencyCode> mmSubstitutionFrequency = new MMBusinessAttribute<Debt, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmSubstitutionFrequency, FinancialInstrumentStipulations2.mmSubstitutionFrequency, Debt2.mmSubstitutionFrequency, Debt3.mmSubstitutionFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(Debt obj) {
			return obj.getSubstitutionFrequency();
		}

		@Override
		public void setValue(Debt obj, FrequencyCode value) {
			obj.setSubstitutionFrequency(value);
		}
	};
	protected Number substitutionLeft;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmSubstitutionLeft
	 * FinancialInstrumentStipulations.mmSubstitutionLeft}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmSubstitutionLeft
	 * FinancialInstrumentStipulations2.mmSubstitutionLeft}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmSubstitutionLeft
	 * Debt2.mmSubstitutionLeft}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmSubstitutionLeft
	 * Debt3.mmSubstitutionLeft}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionLeft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of remaining times the collateral can be substitute."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Number> mmSubstitutionLeft = new MMBusinessAttribute<Debt, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmSubstitutionLeft, FinancialInstrumentStipulations2.mmSubstitutionLeft, Debt2.mmSubstitutionLeft, Debt3.mmSubstitutionLeft);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Debt obj) {
			return obj.getSubstitutionLeft();
		}

		@Override
		public void setValue(Debt obj, Number value) {
			obj.setSubstitutionLeft(value);
		}
	};
	protected YesNoIndicator wholePool;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmWholePoolIndicator
	 * FinancialInstrumentStipulations.mmWholePoolIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmWholePoolIndicator
	 * FinancialInstrumentStipulations2.mmWholePoolIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholePool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmWholePool = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmWholePoolIndicator, FinancialInstrumentStipulations2.mmWholePoolIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WholePool";
			definition = "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getWholePool();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setWholePool(value);
		}
	};
	protected YesNoIndicator alternativeMinimumTax;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmAlternativeMinimumTaxIndicator
	 * FinancialInstrumentStipulations2.mmAlternativeMinimumTaxIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmAlternativeMinimumTaxIndicator
	 * Debt2.mmAlternativeMinimumTaxIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmAlternativeMinimumTaxIndicator
	 * Debt3.mmAlternativeMinimumTaxIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmAlternativeMinimumTax = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmAlternativeMinimumTaxIndicator, Debt2.mmAlternativeMinimumTaxIndicator, Debt3.mmAlternativeMinimumTaxIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getAlternativeMinimumTax();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setAlternativeMinimumTax(value);
		}
	};
	protected InterestCalculation nextInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
	 * InterestCalculation.mmDebtInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interest applicable to the next interest payment period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NXRT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Debt, InterestCalculation> mmNextInterest = new MMBusinessAssociationEnd<Debt, InterestCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NXRT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextInterest";
			definition = "Specifies the interest applicable to the next interest payment period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestCalculation.mmDebtInstrument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public InterestCalculation getValue(Debt obj) {
			return obj.getNextInterest();
		}

		@Override
		public void setValue(Debt obj, InterestCalculation value) {
			obj.setNextInterest(value);
		}
	};
	protected ISODateTime extendibleDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendibleDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time to which a date might be extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, ISODateTime> mmExtendibleDate = new MMBusinessAttribute<Debt, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendibleDate";
			definition = "Date/time to which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Debt obj) {
			return obj.getExtendibleDate();
		}

		@Override
		public void setValue(Debt obj, ISODateTime value) {
			obj.setExtendibleDate(value);
		}
	};
	protected YesNoIndicator sinkableIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinkableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmSinkableIndicator = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SinkableIndicator";
			definition = "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getSinkableIndicator();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setSinkableIndicator(value);
		}
	};
	protected YesNoIndicator insured;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, YesNoIndicator> mmInsured = new MMBusinessAttribute<Debt, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Insured";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt obj) {
			return obj.getInsured();
		}

		@Override
		public void setValue(Debt obj, YesNoIndicator value) {
			obj.setInsured(value);
		}
	};
	protected Max35Text geographics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmGeographics
	 * Debt2.mmGeographics}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmGeographics
	 * Debt3.mmGeographics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, Max35Text> mmGeographics = new MMBusinessAttribute<Debt, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmGeographics, Debt3.mmGeographics);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Debt obj) {
			return obj.getGeographics();
		}

		@Override
		public void setValue(Debt obj, Max35Text value) {
			obj.setGeographics(value);
		}
	};
	protected CurrencyCode paymentCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPaymentCurrency
	 * Debt2.mmPaymentCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPaymentCurrency
	 * Debt3.mmPaymentCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, CurrencyCode> mmPaymentCurrency = new MMBusinessAttribute<Debt, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmPaymentCurrency, Debt3.mmPaymentCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Debt obj) {
			return obj.getPaymentCurrency();
		}

		@Override
		public void setValue(Debt obj, CurrencyCode value) {
			obj.setPaymentCurrency(value);
		}
	};
	protected SecuritiesPricing dirtyPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmDirtyPrice
	 * UnderlyingAttributes.mmDirtyPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmDirtyPrice
	 * UnderlyingAttributes2.mmDirtyPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3#mmDirtyPrice
	 * UnderlyingAttributes3.mmDirtyPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Debt Debt}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirtyPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price that includes interest that has accrued since issue of the most recent coupon payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, SecuritiesPricing> mmDirtyPrice = new MMBusinessAttribute<Debt, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(UnderlyingAttributes.mmDirtyPrice, UnderlyingAttributes2.mmDirtyPrice, UnderlyingAttributes3.mmDirtyPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "Price that includes interest that has accrued since issue of the most recent coupon payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Debt obj) {
			return obj.getDirtyPrice();
		}

		@Override
		public void setValue(Debt obj, SecuritiesPricing value) {
			obj.setDirtyPrice(value);
		}
	};
	protected DebtInstrumentSeniorityTypeCode debtSeniority;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtSeniority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Debt, DebtInstrumentSeniorityTypeCode> mmDebtSeniority = new MMBusinessAttribute<Debt, DebtInstrumentSeniorityTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
		}

		@Override
		public DebtInstrumentSeniorityTypeCode getValue(Debt obj) {
			return obj.getDebtSeniority();
		}

		@Override
		public void setValue(Debt obj, DebtInstrumentSeniorityTypeCode value) {
			obj.setDebtSeniority(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Debt";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmExtendiblePeriodDebt, DateTimePeriod.mmCustomDateDebt, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumDenominationDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumIncrementDebt, InterestCalculation.mmDebtInstrument);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentProperties1Choice.mmDebt, FinancialInstrument28.mmDebt, SingleQuote1.mmStipulations, SingleQuote1.mmUnderlyingStipulations,
						QuoteCancellation1Choice.mmStipulations, QuoteCancellation1Choice.mmUnderlyingStipulations, QuoteRequest1.mmStipulations, QuoteRequest1.mmUnderlyingStipulations, RequestForQuote.mmStipulations,
						RequestForQuote.mmUnderlyingStipulations, Quote1.mmStipulations, Quote1.mmUnderlyingStipulations, FinancialInstrument54.mmDebt, SecuritiesReferenceDataReport5.mmDebtInstrumentAttributes,
						TransparencyDataReport10.mmBond, InterestRateDerivative5.mmUnderlyingBond, SecurityInstrumentDescription13.mmDebtInstrumentAttributes);
				subType_lazy = () -> Arrays.asList(Loan.mmObject());
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Debt.mmPaymentDirectionIndicator, com.tools20022.repository.entity.Debt.mmNextCallableDate, com.tools20022.repository.entity.Debt.mmPutableDate,
						com.tools20022.repository.entity.Debt.mmDatedDate, com.tools20022.repository.entity.Debt.mmFirstPaymentDate, com.tools20022.repository.entity.Debt.mmFactor, com.tools20022.repository.entity.Debt.mmPoolNumber,
						com.tools20022.repository.entity.Debt.mmVariableRateIndicator, com.tools20022.repository.entity.Debt.mmCallableIndicator, com.tools20022.repository.entity.Debt.mmPutableIndicator,
						com.tools20022.repository.entity.Debt.mmYieldToMaturityRate, com.tools20022.repository.entity.Debt.mmAccruedCapitalisationAmount, com.tools20022.repository.entity.Debt.mmNextCouponDate,
						com.tools20022.repository.entity.Debt.mmNextFactorDate, com.tools20022.repository.entity.Debt.mmOddCouponIndicator, com.tools20022.repository.entity.Debt.mmCPProgram,
						com.tools20022.repository.entity.Debt.mmCPRegistrationType, com.tools20022.repository.entity.Debt.mmConvertibleIndicator, com.tools20022.repository.entity.Debt.mmPreFundedIndicator,
						com.tools20022.repository.entity.Debt.mmEscrowedIndicator, com.tools20022.repository.entity.Debt.mmPerpetualIndicator, com.tools20022.repository.entity.Debt.mmSubordinatedIndicator,
						com.tools20022.repository.entity.Debt.mmExtendibleIndicator, com.tools20022.repository.entity.Debt.mmExtendiblePeriod, com.tools20022.repository.entity.Debt.mmOverAllotmentAmount,
						com.tools20022.repository.entity.Debt.mmOverAllotmentRate, com.tools20022.repository.entity.Debt.mmAmortisableIndicator, com.tools20022.repository.entity.Debt.mmCapitalisedInterest,
						com.tools20022.repository.entity.Debt.mmActualDenominationAmount, com.tools20022.repository.entity.Debt.mmPieces, com.tools20022.repository.entity.Debt.mmPoolsMaximum,
						com.tools20022.repository.entity.Debt.mmPoolsPerMillion, com.tools20022.repository.entity.Debt.mmPoolsPerLot, com.tools20022.repository.entity.Debt.mmPoolsPerTrade,
						com.tools20022.repository.entity.Debt.mmConstantPrePaymentPenalty, com.tools20022.repository.entity.Debt.mmPrePaymentSpeed, com.tools20022.repository.entity.Debt.mmConstantPrePaymentYield,
						com.tools20022.repository.entity.Debt.mmWeightedAverageCoupon, com.tools20022.repository.entity.Debt.mmWeightedAverageLife, com.tools20022.repository.entity.Debt.mmWeightedAverageLoan,
						com.tools20022.repository.entity.Debt.mmWeightedAverageMaturity, com.tools20022.repository.entity.Debt.mmInsuredIndicator, com.tools20022.repository.entity.Debt.mmBankQualified,
						com.tools20022.repository.entity.Debt.mmAutoReinvestment, com.tools20022.repository.entity.Debt.mmCustomDate, com.tools20022.repository.entity.Debt.mmLookBack,
						com.tools20022.repository.entity.Debt.mmMinimumDenomination, com.tools20022.repository.entity.Debt.mmMaximumSubstitution, com.tools20022.repository.entity.Debt.mmMinimumIncrement,
						com.tools20022.repository.entity.Debt.mmProduction, com.tools20022.repository.entity.Debt.mmRestricted, com.tools20022.repository.entity.Debt.mmPriceFrequency,
						com.tools20022.repository.entity.Debt.mmSubstitutionFrequency, com.tools20022.repository.entity.Debt.mmSubstitutionLeft, com.tools20022.repository.entity.Debt.mmWholePool,
						com.tools20022.repository.entity.Debt.mmAlternativeMinimumTax, com.tools20022.repository.entity.Debt.mmNextInterest, com.tools20022.repository.entity.Debt.mmExtendibleDate,
						com.tools20022.repository.entity.Debt.mmSinkableIndicator, com.tools20022.repository.entity.Debt.mmInsured, com.tools20022.repository.entity.Debt.mmGeographics,
						com.tools20022.repository.entity.Debt.mmPaymentCurrency, com.tools20022.repository.entity.Debt.mmDirtyPrice, com.tools20022.repository.entity.Debt.mmDebtSeniority);
				derivationComponent_lazy = () -> Arrays.asList(Debt1.mmObject(), Debt2.mmObject(), DebtInstrument2.mmObject(), DebtInstrument4.mmObject(), Debt3.mmObject(), DebtInstrument5.mmObject(), CreditDerivative3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Debt.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentDirectionIndicator getPaymentDirectionIndicator() {
		return paymentDirectionIndicator;
	}

	public Debt setPaymentDirectionIndicator(com.tools20022.repository.datatype.PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = Objects.requireNonNull(paymentDirectionIndicator);
		return this;
	}

	public ISODateTime getNextCallableDate() {
		return nextCallableDate;
	}

	public Debt setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = Objects.requireNonNull(nextCallableDate);
		return this;
	}

	public ISODateTime getPutableDate() {
		return putableDate;
	}

	public Debt setPutableDate(ISODateTime putableDate) {
		this.putableDate = Objects.requireNonNull(putableDate);
		return this;
	}

	public ISODateTime getDatedDate() {
		return datedDate;
	}

	public Debt setDatedDate(ISODateTime datedDate) {
		this.datedDate = Objects.requireNonNull(datedDate);
		return this;
	}

	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public Debt setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = Objects.requireNonNull(firstPaymentDate);
		return this;
	}

	public PercentageRate getFactor() {
		return factor;
	}

	public Debt setFactor(PercentageRate factor) {
		this.factor = Objects.requireNonNull(factor);
		return this;
	}

	public Max15NumericText getPoolNumber() {
		return poolNumber;
	}

	public Debt setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = Objects.requireNonNull(poolNumber);
		return this;
	}

	public YesNoIndicator getVariableRateIndicator() {
		return variableRateIndicator;
	}

	public Debt setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = Objects.requireNonNull(variableRateIndicator);
		return this;
	}

	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public Debt setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = Objects.requireNonNull(callableIndicator);
		return this;
	}

	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public Debt setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = Objects.requireNonNull(putableIndicator);
		return this;
	}

	public PercentageRate getYieldToMaturityRate() {
		return yieldToMaturityRate;
	}

	public Debt setYieldToMaturityRate(PercentageRate yieldToMaturityRate) {
		this.yieldToMaturityRate = Objects.requireNonNull(yieldToMaturityRate);
		return this;
	}

	public CurrencyAndAmount getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount;
	}

	public Debt setAccruedCapitalisationAmount(CurrencyAndAmount accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = Objects.requireNonNull(accruedCapitalisationAmount);
		return this;
	}

	public ISODateTime getNextCouponDate() {
		return nextCouponDate;
	}

	public Debt setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = Objects.requireNonNull(nextCouponDate);
		return this;
	}

	public ISODateTime getNextFactorDate() {
		return nextFactorDate;
	}

	public Debt setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = Objects.requireNonNull(nextFactorDate);
		return this;
	}

	public YesNoIndicator getOddCouponIndicator() {
		return oddCouponIndicator;
	}

	public Debt setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = Objects.requireNonNull(oddCouponIndicator);
		return this;
	}

	public Number getCPProgram() {
		return cPProgram;
	}

	public Debt setCPProgram(Number cPProgram) {
		this.cPProgram = Objects.requireNonNull(cPProgram);
		return this;
	}

	public Max350Text getCPRegistrationType() {
		return cPRegistrationType;
	}

	public Debt setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = Objects.requireNonNull(cPRegistrationType);
		return this;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public Debt setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = Objects.requireNonNull(convertibleIndicator);
		return this;
	}

	public YesNoIndicator getPreFundedIndicator() {
		return preFundedIndicator;
	}

	public Debt setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = Objects.requireNonNull(preFundedIndicator);
		return this;
	}

	public YesNoIndicator getEscrowedIndicator() {
		return escrowedIndicator;
	}

	public Debt setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = Objects.requireNonNull(escrowedIndicator);
		return this;
	}

	public YesNoIndicator getPerpetualIndicator() {
		return perpetualIndicator;
	}

	public Debt setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = Objects.requireNonNull(perpetualIndicator);
		return this;
	}

	public YesNoIndicator getSubordinatedIndicator() {
		return subordinatedIndicator;
	}

	public Debt setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = Objects.requireNonNull(subordinatedIndicator);
		return this;
	}

	public YesNoIndicator getExtendibleIndicator() {
		return extendibleIndicator;
	}

	public Debt setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = Objects.requireNonNull(extendibleIndicator);
		return this;
	}

	public DateTimePeriod getExtendiblePeriod() {
		return extendiblePeriod;
	}

	public Debt setExtendiblePeriod(DateTimePeriod extendiblePeriod) {
		this.extendiblePeriod = Objects.requireNonNull(extendiblePeriod);
		return this;
	}

	public CurrencyAndAmount getOverAllotmentAmount() {
		return overAllotmentAmount;
	}

	public Debt setOverAllotmentAmount(CurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = Objects.requireNonNull(overAllotmentAmount);
		return this;
	}

	public PercentageRate getOverAllotmentRate() {
		return overAllotmentRate;
	}

	public Debt setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = Objects.requireNonNull(overAllotmentRate);
		return this;
	}

	public YesNoIndicator getAmortisableIndicator() {
		return amortisableIndicator;
	}

	public Debt setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = Objects.requireNonNull(amortisableIndicator);
		return this;
	}

	public DistributionPolicyCode getCapitalisedInterest() {
		return capitalisedInterest;
	}

	public Debt setCapitalisedInterest(DistributionPolicyCode capitalisedInterest) {
		this.capitalisedInterest = Objects.requireNonNull(capitalisedInterest);
		return this;
	}

	public List<CurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount == null ? actualDenominationAmount = new ArrayList<>() : actualDenominationAmount;
	}

	public Debt setActualDenominationAmount(List<CurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = Objects.requireNonNull(actualDenominationAmount);
		return this;
	}

	public DecimalNumber getPieces() {
		return pieces;
	}

	public Debt setPieces(DecimalNumber pieces) {
		this.pieces = Objects.requireNonNull(pieces);
		return this;
	}

	public DecimalNumber getPoolsMaximum() {
		return poolsMaximum;
	}

	public Debt setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = Objects.requireNonNull(poolsMaximum);
		return this;
	}

	public DecimalNumber getPoolsPerMillion() {
		return poolsPerMillion;
	}

	public Debt setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = Objects.requireNonNull(poolsPerMillion);
		return this;
	}

	public DecimalNumber getPoolsPerLot() {
		return poolsPerLot;
	}

	public Debt setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = Objects.requireNonNull(poolsPerLot);
		return this;
	}

	public DecimalNumber getPoolsPerTrade() {
		return poolsPerTrade;
	}

	public Debt setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = Objects.requireNonNull(poolsPerTrade);
		return this;
	}

	public YesNoIndicator getConstantPrePaymentPenalty() {
		return constantPrePaymentPenalty;
	}

	public Debt setConstantPrePaymentPenalty(YesNoIndicator constantPrePaymentPenalty) {
		this.constantPrePaymentPenalty = Objects.requireNonNull(constantPrePaymentPenalty);
		return this;
	}

	public PrePaymentSpeedCode getPrePaymentSpeed() {
		return prePaymentSpeed;
	}

	public Debt setPrePaymentSpeed(PrePaymentSpeedCode prePaymentSpeed) {
		this.prePaymentSpeed = Objects.requireNonNull(prePaymentSpeed);
		return this;
	}

	public PercentageRate getConstantPrePaymentYield() {
		return constantPrePaymentYield;
	}

	public Debt setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = Objects.requireNonNull(constantPrePaymentYield);
		return this;
	}

	public PercentageRate getWeightedAverageCoupon() {
		return weightedAverageCoupon;
	}

	public Debt setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = Objects.requireNonNull(weightedAverageCoupon);
		return this;
	}

	public DecimalNumber getWeightedAverageLife() {
		return weightedAverageLife;
	}

	public Debt setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = Objects.requireNonNull(weightedAverageLife);
		return this;
	}

	public DecimalNumber getWeightedAverageLoan() {
		return weightedAverageLoan;
	}

	public Debt setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = Objects.requireNonNull(weightedAverageLoan);
		return this;
	}

	public DecimalNumber getWeightedAverageMaturity() {
		return weightedAverageMaturity;
	}

	public Debt setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = Objects.requireNonNull(weightedAverageMaturity);
		return this;
	}

	public YesNoIndicator getInsuredIndicator() {
		return insuredIndicator;
	}

	public Debt setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = Objects.requireNonNull(insuredIndicator);
		return this;
	}

	public YesNoIndicator getBankQualified() {
		return bankQualified;
	}

	public Debt setBankQualified(YesNoIndicator bankQualified) {
		this.bankQualified = Objects.requireNonNull(bankQualified);
		return this;
	}

	public PercentageRate getAutoReinvestment() {
		return autoReinvestment;
	}

	public Debt setAutoReinvestment(PercentageRate autoReinvestment) {
		this.autoReinvestment = Objects.requireNonNull(autoReinvestment);
		return this;
	}

	public DateTimePeriod getCustomDate() {
		return customDate;
	}

	public Debt setCustomDate(DateTimePeriod customDate) {
		this.customDate = Objects.requireNonNull(customDate);
		return this;
	}

	public Number getLookBack() {
		return lookBack;
	}

	public Debt setLookBack(Number lookBack) {
		this.lookBack = Objects.requireNonNull(lookBack);
		return this;
	}

	public SecuritiesQuantity getMinimumDenomination() {
		return minimumDenomination;
	}

	public Debt setMinimumDenomination(com.tools20022.repository.entity.SecuritiesQuantity minimumDenomination) {
		this.minimumDenomination = Objects.requireNonNull(minimumDenomination);
		return this;
	}

	public Number getMaximumSubstitution() {
		return maximumSubstitution;
	}

	public Debt setMaximumSubstitution(Number maximumSubstitution) {
		this.maximumSubstitution = Objects.requireNonNull(maximumSubstitution);
		return this;
	}

	public SecuritiesQuantity getMinimumIncrement() {
		return minimumIncrement;
	}

	public Debt setMinimumIncrement(com.tools20022.repository.entity.SecuritiesQuantity minimumIncrement) {
		this.minimumIncrement = Objects.requireNonNull(minimumIncrement);
		return this;
	}

	public Max350Text getProduction() {
		return production;
	}

	public Debt setProduction(Max350Text production) {
		this.production = Objects.requireNonNull(production);
		return this;
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public Debt setRestricted(YesNoIndicator restricted) {
		this.restricted = Objects.requireNonNull(restricted);
		return this;
	}

	public FrequencyCode getPriceFrequency() {
		return priceFrequency;
	}

	public Debt setPriceFrequency(FrequencyCode priceFrequency) {
		this.priceFrequency = Objects.requireNonNull(priceFrequency);
		return this;
	}

	public FrequencyCode getSubstitutionFrequency() {
		return substitutionFrequency;
	}

	public Debt setSubstitutionFrequency(FrequencyCode substitutionFrequency) {
		this.substitutionFrequency = Objects.requireNonNull(substitutionFrequency);
		return this;
	}

	public Number getSubstitutionLeft() {
		return substitutionLeft;
	}

	public Debt setSubstitutionLeft(Number substitutionLeft) {
		this.substitutionLeft = Objects.requireNonNull(substitutionLeft);
		return this;
	}

	public YesNoIndicator getWholePool() {
		return wholePool;
	}

	public Debt setWholePool(YesNoIndicator wholePool) {
		this.wholePool = Objects.requireNonNull(wholePool);
		return this;
	}

	public YesNoIndicator getAlternativeMinimumTax() {
		return alternativeMinimumTax;
	}

	public Debt setAlternativeMinimumTax(YesNoIndicator alternativeMinimumTax) {
		this.alternativeMinimumTax = Objects.requireNonNull(alternativeMinimumTax);
		return this;
	}

	public InterestCalculation getNextInterest() {
		return nextInterest;
	}

	public Debt setNextInterest(InterestCalculation nextInterest) {
		this.nextInterest = Objects.requireNonNull(nextInterest);
		return this;
	}

	public ISODateTime getExtendibleDate() {
		return extendibleDate;
	}

	public Debt setExtendibleDate(ISODateTime extendibleDate) {
		this.extendibleDate = Objects.requireNonNull(extendibleDate);
		return this;
	}

	public YesNoIndicator getSinkableIndicator() {
		return sinkableIndicator;
	}

	public Debt setSinkableIndicator(YesNoIndicator sinkableIndicator) {
		this.sinkableIndicator = Objects.requireNonNull(sinkableIndicator);
		return this;
	}

	public YesNoIndicator getInsured() {
		return insured;
	}

	public Debt setInsured(YesNoIndicator insured) {
		this.insured = Objects.requireNonNull(insured);
		return this;
	}

	public Max35Text getGeographics() {
		return geographics;
	}

	public Debt setGeographics(Max35Text geographics) {
		this.geographics = Objects.requireNonNull(geographics);
		return this;
	}

	public CurrencyCode getPaymentCurrency() {
		return paymentCurrency;
	}

	public Debt setPaymentCurrency(CurrencyCode paymentCurrency) {
		this.paymentCurrency = Objects.requireNonNull(paymentCurrency);
		return this;
	}

	public SecuritiesPricing getDirtyPrice() {
		return dirtyPrice;
	}

	public Debt setDirtyPrice(SecuritiesPricing dirtyPrice) {
		this.dirtyPrice = Objects.requireNonNull(dirtyPrice);
		return this;
	}

	public DebtInstrumentSeniorityTypeCode getDebtSeniority() {
		return debtSeniority;
	}

	public Debt setDebtSeniority(DebtInstrumentSeniorityTypeCode debtSeniority) {
		this.debtSeniority = Objects.requireNonNull(debtSeniority);
		return this;
	}
}