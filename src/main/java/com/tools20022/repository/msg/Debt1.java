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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.InterestComputationMethod1Choice;
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import com.tools20022.repository.msg.InterestChange1;
import com.tools20022.repository.msg.PrePaymentSpeed1;
import com.tools20022.repository.msg.YieldCalculation1;
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
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmFaceAmount
 * Debt1.mmFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPaymentFrequency
 * Debt1.mmPaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmDatedDate
 * Debt1.mmDatedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmFirstPaymentDate
 * Debt1.mmFirstPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmMaturityDate
 * Debt1.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextCouponDate
 * Debt1.mmNextCouponDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPutableDate
 * Debt1.mmPutableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextCallableDate
 * Debt1.mmNextCallableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextFactorDate
 * Debt1.mmNextFactorDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmDayCountBasis
 * Debt1.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmPaymentDirectionIndicator
 * Debt1.mmPaymentDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmInterestRate
 * Debt1.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextInterestRate
 * Debt1.mmNextInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmOddCouponIndicator
 * Debt1.mmOddCouponIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCallableIndicator
 * Debt1.mmCallableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCPProgram
 * Debt1.mmCPProgram}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCPRegistrationType
 * Debt1.mmCPRegistrationType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmInterestAccrualDate
 * Debt1.mmInterestAccrualDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPutableIndicator
 * Debt1.mmPutableIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmConvertibleIndicator
 * Debt1.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPreFundedIndicator
 * Debt1.mmPreFundedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmEscrowedIndicator
 * Debt1.mmEscrowedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPerpetualIndicator
 * Debt1.mmPerpetualIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmSubordinatedIndicator
 * Debt1.mmSubordinatedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmExtendibleIndicator
 * Debt1.mmExtendibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmExtendiblePeriod
 * Debt1.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmVariableRateIndicator
 * Debt1.mmVariableRateIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmOverAllotmentAmount
 * Debt1.mmOverAllotmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmOverAllotmentRate
 * Debt1.mmOverAllotmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmAmortisableIndicator
 * Debt1.mmAmortisableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmInterestCalculationMethod
 * Debt1.mmInterestCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCapitalisedInterest
 * Debt1.mmCapitalisedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmActualDenominationAmount
 * Debt1.mmActualDenominationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmCurrentFactor
 * Debt1.mmCurrentFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextFactor
 * Debt1.mmNextFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPreviousFactor
 * Debt1.mmPreviousFactor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmConversionPeriod
 * Debt1.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmConversionRatioDenominator
 * Debt1.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmConversionRatioNumerator
 * Debt1.mmConversionRatioNumerator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPieces Debt1.mmPieces}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsMaximum
 * Debt1.mmPoolsMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerMillion
 * Debt1.mmPoolsPerMillion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerLot
 * Debt1.mmPoolsPerLot}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPoolsPerTrade
 * Debt1.mmPoolsPerTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmConstantPrePaymentPenaltyIndicator
 * Debt1.mmConstantPrePaymentPenaltyIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmLotIdentification
 * Debt1.mmLotIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPrePaymentSpeed
 * Debt1.mmPrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmConstantPrePaymentYield
 * Debt1.mmConstantPrePaymentYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageCoupon
 * Debt1.mmWeightedAverageCoupon}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageLife
 * Debt1.mmWeightedAverageLife}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageLoan
 * Debt1.mmWeightedAverageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmWeightedAverageMaturity
 * Debt1.mmWeightedAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmInsuredIndicator
 * Debt1.mmInsuredIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmBankQualifiedIndicator
 * Debt1.mmBankQualifiedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Debt1#mmVariableInterestDetails
 * Debt1.mmVariableInterestDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmYieldDetails
 * Debt1.mmYieldDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule#forDebt1
 * ConstraintPutableDateAndPutableIndicatorRule.forDebt1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNextCallableDateAndCallableIndicatorRule#forDebt1
 * ConstraintNextCallableDateAndCallableIndicatorRule.forDebt1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Debt1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Debt1", propOrder = {"faceAmount", "paymentFrequency", "datedDate", "firstPaymentDate", "maturityDate", "nextCouponDate", "putableDate", "nextCallableDate", "nextFactorDate", "dayCountBasis", "paymentDirectionIndicator",
		"interestRate", "nextInterestRate", "oddCouponIndicator", "callableIndicator", "cPProgram", "cPRegistrationType", "interestAccrualDate", "putableIndicator", "convertibleIndicator", "preFundedIndicator", "escrowedIndicator",
		"perpetualIndicator", "subordinatedIndicator", "extendibleIndicator", "extendiblePeriod", "variableRateIndicator", "overAllotmentAmount", "overAllotmentRate", "amortisableIndicator", "interestCalculationMethod",
		"capitalisedInterest", "actualDenominationAmount", "currentFactor", "nextFactor", "previousFactor", "conversionPeriod", "conversionRatioDenominator", "conversionRatioNumerator", "pieces", "poolsMaximum", "poolsPerMillion",
		"poolsPerLot", "poolsPerTrade", "constantPrePaymentPenaltyIndicator", "lotIdentification", "prePaymentSpeed", "constantPrePaymentYield", "weightedAverageCoupon", "weightedAverageLife", "weightedAverageLoan",
		"weightedAverageMaturity", "insuredIndicator", "bankQualifiedIndicator", "variableInterestDetails", "yieldDetails"})
public class Debt1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ActiveCurrencyAndAmount>> mmFaceAmount = new MMMessageAttribute<Debt1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Unit value of a debt security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Debt1 obj) {
			return obj.getFaceAmount();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFaceAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency1Code paymentFrequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmPaymentFrequency
	 * Dividend.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<Frequency1Code>> mmPaymentFrequency = new MMMessageAttribute<Debt1, Optional<Frequency1Code>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}

		@Override
		public Optional<Frequency1Code> getValue(Debt1 obj) {
			return obj.getPaymentFrequency();
		}

		@Override
		public void setValue(Debt1 obj, Optional<Frequency1Code> value) {
			obj.setPaymentFrequency(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmDatedDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "873"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getDatedDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setDatedDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmFirstPaymentDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getFirstPaymentDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setFirstPaymentDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmMaturityDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "200"), new FIXSynonym(this, "541"), new FIXSynonym(this, "1079"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setMaturityDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmNextCouponDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtCpnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "224"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getNextCouponDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setNextCouponDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmPutableDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getPutableDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setPutableDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmNextCallableDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getNextCallableDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setNextCallableDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmNextFactorDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextFactorDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtFctrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getNextFactorDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setNextFactorDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethod1Choice dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice
	 * InterestComputationMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAssociationEnd<Debt1, Optional<InterestComputationMethod1Choice>> mmDayCountBasis = new MMMessageAssociationEnd<Debt1, Optional<InterestComputationMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethod1Choice.mmObject();
		}

		@Override
		public Optional<InterestComputationMethod1Choice> getValue(Debt1 obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(Debt1 obj, Optional<InterestComputationMethod1Choice> value) {
			obj.setDayCountBasis(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<PaymentDirectionIndicator>> mmPaymentDirectionIndicator = new MMMessageAttribute<Debt1, Optional<PaymentDirectionIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PmtDrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentDirectionIndicator.mmObject();
		}

		@Override
		public Optional<PaymentDirectionIndicator> getValue(Debt1 obj) {
			return obj.getPaymentDirectionIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PaymentDirectionIndicator> value) {
			obj.setPaymentDirectionIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmInterestRate = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "223"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setInterestRate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmNextInterestRate = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Specifies the interest rate applicable to the next interest payment period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getNextInterestRate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setNextInterestRate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmOddCouponIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmOddCouponIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "OddCpnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getOddCouponIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setOddCouponIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmCallableIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getCallableIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setCallableIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "The program under which a commercial paper is issued. The values that are most used are: \n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<Number>> mmCPProgram = new MMMessageAttribute<Debt1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPProgram;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CPPrgm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "875"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are: \n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Debt1 obj) {
			return obj.getCPProgram();
		}

		@Override
		public void setValue(Debt1 obj, Optional<Number> value) {
			obj.setCPProgram(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * definition} = "The registration type of a commercial paper issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<Max350Text>> mmCPRegistrationType = new MMMessageAttribute<Debt1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPRegistrationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CPRegnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "876"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPRegistrationType";
			definition = "The registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Debt1 obj) {
			return obj.getCPRegistrationType();
		}

		@Override
		public void setValue(Debt1 obj, Optional<Max350Text> value) {
			obj.setCPRegistrationType(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the Issue Date and the Dated Date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<ISODateTime>> mmInterestAccrualDate = new MMMessageAttribute<Debt1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestAccrualDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "874"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the Issue Date and the Dated Date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Debt1 obj) {
			return obj.getInterestAccrualDate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ISODateTime> value) {
			obj.setInterestAccrualDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmPutableIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getPutableIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setPutableIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvtblInd")
	protected YesNoIndicator convertibleIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmConvertibleIndicator
	 * Debt.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing security is convertible into another type of security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmConvertibleIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmConvertibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getConvertibleIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setConvertibleIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmPreFundedIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPreFundedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PreFnddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getPreFundedIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setPreFundedIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmEscrowedIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmEscrowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "EscrwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getEscrowedIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setEscrowedIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmPerpetualIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPerpetualIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PerptlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getPerpetualIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setPerpetualIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmSubordinatedIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubordinatedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "SubrdntdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getSubordinatedIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setSubordinatedIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmExtendibleIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "XtndblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getExtendibleIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setExtendibleIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DateTimePeriodChoice>> mmExtendiblePeriod = new MMMessageAttribute<Debt1, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendiblePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "XtndblPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(Debt1 obj) {
			return obj.getExtendiblePeriod();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DateTimePeriodChoice> value) {
			obj.setExtendiblePeriod(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmVariableRateIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getVariableRateIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setVariableRateIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<ActiveCurrencyAndAmount>> mmOverAllotmentAmount = new MMMessageAttribute<Debt1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Debt1 obj) {
			return obj.getOverAllotmentAmount();
		}

		@Override
		public void setValue(Debt1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setOverAllotmentAmount(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmOverAllotmentRate = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "OverAlltmtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getOverAllotmentRate();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setOverAllotmentRate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmAmortisableIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "AmtsblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getAmortisableIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setAmortisableIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<Max70Text>> mmInterestCalculationMethod = new MMMessageAttribute<Debt1, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "IntrstClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCalculationMethod";
			definition = "Calculation method used to calculate interest and/or yield for a bond, for example, street convention.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Debt1 obj) {
			return obj.getInterestCalculationMethod();
		}

		@Override
		public void setValue(Debt1 obj, Optional<Max70Text> value) {
			obj.setInterestCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlsdIntrst")
	protected DistributionPolicy1Code capitalisedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCapitalisedInterest
	 * Debt.mmCapitalisedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DistributionPolicy1Code>> mmCapitalisedInterest = new MMMessageAttribute<Debt1, Optional<DistributionPolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCapitalisedInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CptlsdIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}

		@Override
		public Optional<DistributionPolicy1Code> getValue(Debt1 obj) {
			return obj.getCapitalisedInterest();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DistributionPolicy1Code> value) {
			obj.setCapitalisedInterest(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, List<ActiveCurrencyAndAmount>> mmActualDenominationAmount = new MMMessageAttribute<Debt1, List<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmActualDenominationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "ActlDnmtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveCurrencyAndAmount> getValue(Debt1 obj) {
			return obj.getActualDenominationAmount();
		}

		@Override
		public void setValue(Debt1 obj, List<ActiveCurrencyAndAmount> value) {
			obj.setActualDenominationAmount(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for asset or mortgage backed securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmCurrentFactor = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getCurrentFactor();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setCurrentFactor(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for asset or mortgage backed securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmNextFactor = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of the bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getNextFactor();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setNextFactor(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Identifies the previous factor expressed as a decimal \nbetween 0 and 1 defining the outstanding principal of \nthe bond (for asset or mortgage backed securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmPreviousFactor = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Identifies the previous factor expressed as a decimal \nbetween 0 and 1 defining the outstanding principal of \nthe bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getPreviousFactor();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setPreviousFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsPrd")
	protected DateTimePeriodDetails conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
	 * SecuritiesConversion.mmConversionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<DateTimePeriodDetails>> mmConversionPeriod = new MMMessageAttribute<Debt1, Optional<DateTimePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(Debt1 obj) {
			return obj.getConversionPeriod();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DateTimePeriodDetails> value) {
			obj.setConversionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsRatioDnmtr")
	protected FinancialInstrumentQuantityChoice conversionRatioDenominator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
	 * SecuritiesConversion.mmConversionRatioDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioDnmtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<FinancialInstrumentQuantityChoice>> mmConversionRatioDenominator = new MMMessageAttribute<Debt1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionRatioDenominator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioDnmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(Debt1 obj) {
			return obj.getConversionRatioDenominator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setConversionRatioDenominator(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsRatioNmrtr")
	protected FinancialInstrumentQuantityChoice conversionRatioNumerator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
	 * SecuritiesConversion.mmConversionRatioNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioNmrtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<FinancialInstrumentQuantityChoice>> mmConversionRatioNumerator = new MMMessageAttribute<Debt1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionRatioNumerator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioNmrtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(Debt1 obj) {
			return obj.getConversionRatioNumerator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setConversionRatioNumerator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmPieces = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPieces;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "Pcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getPieces();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setPieces(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmPoolsMaximum = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsMaximum;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PlsMax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getPoolsMaximum();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setPoolsMaximum(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmPoolsPerMillion = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerMillion;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PlsPerMln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getPoolsPerMillion();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setPoolsPerMillion(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmPoolsPerLot = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerLot;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PlsPerLot";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getPoolsPerLot();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setPoolsPerLot(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmPoolsPerTrade = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PlsPerTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getPoolsPerTrade();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setPoolsPerTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "CstPrePmtPnltyInd", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, YesNoIndicator> mmConstantPrePaymentPenaltyIndicator = new MMMessageAttribute<Debt1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentPenalty;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtPnltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentPenaltyIndicator";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Debt1 obj) {
			return obj.getConstantPrePaymentPenaltyIndicator();
		}

		@Override
		public void setValue(Debt1 obj, YesNoIndicator value) {
			obj.setConstantPrePaymentPenaltyIndicator(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Identifies the lot constituting the asset backed or mortgage backed security issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Debt1, Optional<Max35Text>> mmLotIdentification = new MMMessageAttribute<Debt1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "LotId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotIdentification";
			definition = "Identifies the lot constituting the asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Debt1 obj) {
			return obj.getLotIdentification();
		}

		@Override
		public void setValue(Debt1 obj, Optional<Max35Text> value) {
			obj.setLotIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrePmtSpd")
	protected PrePaymentSpeed1 prePaymentSpeed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PrePaymentSpeed1
	 * PrePaymentSpeed1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPrePaymentSpeed
	 * Debt.mmPrePaymentSpeed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrePmtSpd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaymentSpeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Debt1, Optional<PrePaymentSpeed1>> mmPrePaymentSpeed = new MMMessageAssociationEnd<Debt1, Optional<PrePaymentSpeed1>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPrePaymentSpeed;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "PrePmtSpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PrePaymentSpeed1.mmObject();
		}

		@Override
		public Optional<PrePaymentSpeed1> getValue(Debt1 obj) {
			return obj.getPrePaymentSpeed();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PrePaymentSpeed1> value) {
			obj.setPrePaymentSpeed(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmConstantPrePaymentYield = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentYield;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getConstantPrePaymentYield();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setConstantPrePaymentYield(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<PercentageRate>> mmWeightedAverageCoupon = new MMMessageAttribute<Debt1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageCoupon;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgCpn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Debt1 obj) {
			return obj.getWeightedAverageCoupon();
		}

		@Override
		public void setValue(Debt1 obj, Optional<PercentageRate> value) {
			obj.setWeightedAverageCoupon(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmWeightedAverageLife = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLife;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLife";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getWeightedAverageLife();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setWeightedAverageLife(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmWeightedAverageLoan = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLoan;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getWeightedAverageLoan();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setWeightedAverageLoan(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<DecimalNumber>> mmWeightedAverageMaturity = new MMMessageAttribute<Debt1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageMaturity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgMtrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Debt1 obj) {
			return obj.getWeightedAverageMaturity();
		}

		@Override
		public void setValue(Debt1 obj, Optional<DecimalNumber> value) {
			obj.setWeightedAverageMaturity(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmInsuredIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmInsuredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "InsrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getInsuredIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setInsuredIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	public static final MMMessageAttribute<Debt1, Optional<YesNoIndicator>> mmBankQualifiedIndicator = new MMMessageAttribute<Debt1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmBankQualified;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "BkQlfdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankQualifiedIndicator";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Debt1 obj) {
			return obj.getBankQualifiedIndicator();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YesNoIndicator> value) {
			obj.setBankQualifiedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblIntrstDtls")
	protected InterestChange1 variableInterestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
	 * InterestCalculation.mmVariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblIntrstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information linked to the variable interest rate of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Debt1, Optional<InterestChange1>> mmVariableInterestDetails = new MMMessageAssociationEnd<Debt1, Optional<InterestChange1>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmVariableInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "VarblIntrstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableInterestDetails";
			definition = "Information linked to the variable interest rate of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestChange1.mmObject();
		}

		@Override
		public Optional<InterestChange1> getValue(Debt1 obj) {
			return obj.getVariableInterestDetails();
		}

		@Override
		public void setValue(Debt1 obj, Optional<InterestChange1> value) {
			obj.setVariableInterestDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "YldDtls")
	protected YieldCalculation1 yieldDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated yield based on the price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Debt1, Optional<YieldCalculation1>> mmYieldDetails = new MMMessageAssociationEnd<Debt1, Optional<YieldCalculation1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Debt1.mmObject();
			isDerived = false;
			xmlTag = "YldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldDetails";
			definition = "Calculated yield based on the price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> YieldCalculation1.mmObject();
		}

		@Override
		public Optional<YieldCalculation1> getValue(Debt1 obj) {
			return obj.getYieldDetails();
		}

		@Override
		public void setValue(Debt1 obj, Optional<YieldCalculation1> value) {
			obj.setYieldDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.mmFaceAmount, com.tools20022.repository.msg.Debt1.mmPaymentFrequency, com.tools20022.repository.msg.Debt1.mmDatedDate,
						com.tools20022.repository.msg.Debt1.mmFirstPaymentDate, com.tools20022.repository.msg.Debt1.mmMaturityDate, com.tools20022.repository.msg.Debt1.mmNextCouponDate, com.tools20022.repository.msg.Debt1.mmPutableDate,
						com.tools20022.repository.msg.Debt1.mmNextCallableDate, com.tools20022.repository.msg.Debt1.mmNextFactorDate, com.tools20022.repository.msg.Debt1.mmDayCountBasis,
						com.tools20022.repository.msg.Debt1.mmPaymentDirectionIndicator, com.tools20022.repository.msg.Debt1.mmInterestRate, com.tools20022.repository.msg.Debt1.mmNextInterestRate,
						com.tools20022.repository.msg.Debt1.mmOddCouponIndicator, com.tools20022.repository.msg.Debt1.mmCallableIndicator, com.tools20022.repository.msg.Debt1.mmCPProgram,
						com.tools20022.repository.msg.Debt1.mmCPRegistrationType, com.tools20022.repository.msg.Debt1.mmInterestAccrualDate, com.tools20022.repository.msg.Debt1.mmPutableIndicator,
						com.tools20022.repository.msg.Debt1.mmConvertibleIndicator, com.tools20022.repository.msg.Debt1.mmPreFundedIndicator, com.tools20022.repository.msg.Debt1.mmEscrowedIndicator,
						com.tools20022.repository.msg.Debt1.mmPerpetualIndicator, com.tools20022.repository.msg.Debt1.mmSubordinatedIndicator, com.tools20022.repository.msg.Debt1.mmExtendibleIndicator,
						com.tools20022.repository.msg.Debt1.mmExtendiblePeriod, com.tools20022.repository.msg.Debt1.mmVariableRateIndicator, com.tools20022.repository.msg.Debt1.mmOverAllotmentAmount,
						com.tools20022.repository.msg.Debt1.mmOverAllotmentRate, com.tools20022.repository.msg.Debt1.mmAmortisableIndicator, com.tools20022.repository.msg.Debt1.mmInterestCalculationMethod,
						com.tools20022.repository.msg.Debt1.mmCapitalisedInterest, com.tools20022.repository.msg.Debt1.mmActualDenominationAmount, com.tools20022.repository.msg.Debt1.mmCurrentFactor,
						com.tools20022.repository.msg.Debt1.mmNextFactor, com.tools20022.repository.msg.Debt1.mmPreviousFactor, com.tools20022.repository.msg.Debt1.mmConversionPeriod,
						com.tools20022.repository.msg.Debt1.mmConversionRatioDenominator, com.tools20022.repository.msg.Debt1.mmConversionRatioNumerator, com.tools20022.repository.msg.Debt1.mmPieces,
						com.tools20022.repository.msg.Debt1.mmPoolsMaximum, com.tools20022.repository.msg.Debt1.mmPoolsPerMillion, com.tools20022.repository.msg.Debt1.mmPoolsPerLot, com.tools20022.repository.msg.Debt1.mmPoolsPerTrade,
						com.tools20022.repository.msg.Debt1.mmConstantPrePaymentPenaltyIndicator, com.tools20022.repository.msg.Debt1.mmLotIdentification, com.tools20022.repository.msg.Debt1.mmPrePaymentSpeed,
						com.tools20022.repository.msg.Debt1.mmConstantPrePaymentYield, com.tools20022.repository.msg.Debt1.mmWeightedAverageCoupon, com.tools20022.repository.msg.Debt1.mmWeightedAverageLife,
						com.tools20022.repository.msg.Debt1.mmWeightedAverageLoan, com.tools20022.repository.msg.Debt1.mmWeightedAverageMaturity, com.tools20022.repository.msg.Debt1.mmInsuredIndicator,
						com.tools20022.repository.msg.Debt1.mmBankQualifiedIndicator, com.tools20022.repository.msg.Debt1.mmVariableInterestDetails, com.tools20022.repository.msg.Debt1.mmYieldDetails);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPutableDateAndPutableIndicatorRule.forDebt1,
						com.tools20022.repository.constraints.ConstraintNextCallableDateAndCallableIndicatorRule.forDebt1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Debt1";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getFaceAmount() {
		return faceAmount == null ? Optional.empty() : Optional.of(faceAmount);
	}

	public Debt1 setFaceAmount(ActiveCurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
		return this;
	}

	public Optional<Frequency1Code> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public Debt1 setPaymentFrequency(Frequency1Code paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<ISODateTime> getDatedDate() {
		return datedDate == null ? Optional.empty() : Optional.of(datedDate);
	}

	public Debt1 setDatedDate(ISODateTime datedDate) {
		this.datedDate = datedDate;
		return this;
	}

	public Optional<ISODateTime> getFirstPaymentDate() {
		return firstPaymentDate == null ? Optional.empty() : Optional.of(firstPaymentDate);
	}

	public Debt1 setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		return this;
	}

	public Optional<ISODateTime> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public Debt1 setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODateTime> getNextCouponDate() {
		return nextCouponDate == null ? Optional.empty() : Optional.of(nextCouponDate);
	}

	public Debt1 setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
		return this;
	}

	public Optional<ISODateTime> getPutableDate() {
		return putableDate == null ? Optional.empty() : Optional.of(putableDate);
	}

	public Debt1 setPutableDate(ISODateTime putableDate) {
		this.putableDate = putableDate;
		return this;
	}

	public Optional<ISODateTime> getNextCallableDate() {
		return nextCallableDate == null ? Optional.empty() : Optional.of(nextCallableDate);
	}

	public Debt1 setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
		return this;
	}

	public Optional<ISODateTime> getNextFactorDate() {
		return nextFactorDate == null ? Optional.empty() : Optional.of(nextFactorDate);
	}

	public Debt1 setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = nextFactorDate;
		return this;
	}

	public Optional<InterestComputationMethod1Choice> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public Debt1 setDayCountBasis(InterestComputationMethod1Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<PaymentDirectionIndicator> getPaymentDirectionIndicator() {
		return paymentDirectionIndicator == null ? Optional.empty() : Optional.of(paymentDirectionIndicator);
	}

	public Debt1 setPaymentDirectionIndicator(PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = paymentDirectionIndicator;
		return this;
	}

	public Optional<PercentageRate> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public Debt1 setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<PercentageRate> getNextInterestRate() {
		return nextInterestRate == null ? Optional.empty() : Optional.of(nextInterestRate);
	}

	public Debt1 setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
		return this;
	}

	public Optional<YesNoIndicator> getOddCouponIndicator() {
		return oddCouponIndicator == null ? Optional.empty() : Optional.of(oddCouponIndicator);
	}

	public Debt1 setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = oddCouponIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCallableIndicator() {
		return callableIndicator == null ? Optional.empty() : Optional.of(callableIndicator);
	}

	public Debt1 setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
		return this;
	}

	public Optional<Number> getCPProgram() {
		return cPProgram == null ? Optional.empty() : Optional.of(cPProgram);
	}

	public Debt1 setCPProgram(Number cPProgram) {
		this.cPProgram = cPProgram;
		return this;
	}

	public Optional<Max350Text> getCPRegistrationType() {
		return cPRegistrationType == null ? Optional.empty() : Optional.of(cPRegistrationType);
	}

	public Debt1 setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = cPRegistrationType;
		return this;
	}

	public Optional<ISODateTime> getInterestAccrualDate() {
		return interestAccrualDate == null ? Optional.empty() : Optional.of(interestAccrualDate);
	}

	public Debt1 setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = interestAccrualDate;
		return this;
	}

	public Optional<YesNoIndicator> getPutableIndicator() {
		return putableIndicator == null ? Optional.empty() : Optional.of(putableIndicator);
	}

	public Debt1 setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public Debt1 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPreFundedIndicator() {
		return preFundedIndicator == null ? Optional.empty() : Optional.of(preFundedIndicator);
	}

	public Debt1 setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getEscrowedIndicator() {
		return escrowedIndicator == null ? Optional.empty() : Optional.of(escrowedIndicator);
	}

	public Debt1 setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPerpetualIndicator() {
		return perpetualIndicator == null ? Optional.empty() : Optional.of(perpetualIndicator);
	}

	public Debt1 setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getSubordinatedIndicator() {
		return subordinatedIndicator == null ? Optional.empty() : Optional.of(subordinatedIndicator);
	}

	public Debt1 setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = subordinatedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getExtendibleIndicator() {
		return extendibleIndicator == null ? Optional.empty() : Optional.of(extendibleIndicator);
	}

	public Debt1 setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = extendibleIndicator;
		return this;
	}

	public Optional<DateTimePeriodChoice> getExtendiblePeriod() {
		return extendiblePeriod == null ? Optional.empty() : Optional.of(extendiblePeriod);
	}

	public Debt1 setExtendiblePeriod(DateTimePeriodChoice extendiblePeriod) {
		this.extendiblePeriod = extendiblePeriod;
		return this;
	}

	public Optional<YesNoIndicator> getVariableRateIndicator() {
		return variableRateIndicator == null ? Optional.empty() : Optional.of(variableRateIndicator);
	}

	public Debt1 setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOverAllotmentAmount() {
		return overAllotmentAmount == null ? Optional.empty() : Optional.of(overAllotmentAmount);
	}

	public Debt1 setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
		return this;
	}

	public Optional<PercentageRate> getOverAllotmentRate() {
		return overAllotmentRate == null ? Optional.empty() : Optional.of(overAllotmentRate);
	}

	public Debt1 setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
		return this;
	}

	public Optional<YesNoIndicator> getAmortisableIndicator() {
		return amortisableIndicator == null ? Optional.empty() : Optional.of(amortisableIndicator);
	}

	public Debt1 setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
		return this;
	}

	public Optional<Max70Text> getInterestCalculationMethod() {
		return interestCalculationMethod == null ? Optional.empty() : Optional.of(interestCalculationMethod);
	}

	public Debt1 setInterestCalculationMethod(Max70Text interestCalculationMethod) {
		this.interestCalculationMethod = interestCalculationMethod;
		return this;
	}

	public Optional<DistributionPolicy1Code> getCapitalisedInterest() {
		return capitalisedInterest == null ? Optional.empty() : Optional.of(capitalisedInterest);
	}

	public Debt1 setCapitalisedInterest(DistributionPolicy1Code capitalisedInterest) {
		this.capitalisedInterest = capitalisedInterest;
		return this;
	}

	public List<ActiveCurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount == null ? actualDenominationAmount = new ArrayList<>() : actualDenominationAmount;
	}

	public Debt1 setActualDenominationAmount(List<ActiveCurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = Objects.requireNonNull(actualDenominationAmount);
		return this;
	}

	public Optional<PercentageRate> getCurrentFactor() {
		return currentFactor == null ? Optional.empty() : Optional.of(currentFactor);
	}

	public Debt1 setCurrentFactor(PercentageRate currentFactor) {
		this.currentFactor = currentFactor;
		return this;
	}

	public Optional<PercentageRate> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public Debt1 setNextFactor(PercentageRate nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<PercentageRate> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public Debt1 setPreviousFactor(PercentageRate previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<DateTimePeriodDetails> getConversionPeriod() {
		return conversionPeriod == null ? Optional.empty() : Optional.of(conversionPeriod);
	}

	public Debt1 setConversionPeriod(DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getConversionRatioDenominator() {
		return conversionRatioDenominator == null ? Optional.empty() : Optional.of(conversionRatioDenominator);
	}

	public Debt1 setConversionRatioDenominator(FinancialInstrumentQuantityChoice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getConversionRatioNumerator() {
		return conversionRatioNumerator == null ? Optional.empty() : Optional.of(conversionRatioNumerator);
	}

	public Debt1 setConversionRatioNumerator(FinancialInstrumentQuantityChoice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
		return this;
	}

	public Optional<DecimalNumber> getPieces() {
		return pieces == null ? Optional.empty() : Optional.of(pieces);
	}

	public Debt1 setPieces(DecimalNumber pieces) {
		this.pieces = pieces;
		return this;
	}

	public Optional<DecimalNumber> getPoolsMaximum() {
		return poolsMaximum == null ? Optional.empty() : Optional.of(poolsMaximum);
	}

	public Debt1 setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = poolsMaximum;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerMillion() {
		return poolsPerMillion == null ? Optional.empty() : Optional.of(poolsPerMillion);
	}

	public Debt1 setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = poolsPerMillion;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerLot() {
		return poolsPerLot == null ? Optional.empty() : Optional.of(poolsPerLot);
	}

	public Debt1 setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = poolsPerLot;
		return this;
	}

	public Optional<DecimalNumber> getPoolsPerTrade() {
		return poolsPerTrade == null ? Optional.empty() : Optional.of(poolsPerTrade);
	}

	public Debt1 setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = poolsPerTrade;
		return this;
	}

	public YesNoIndicator getConstantPrePaymentPenaltyIndicator() {
		return constantPrePaymentPenaltyIndicator;
	}

	public Debt1 setConstantPrePaymentPenaltyIndicator(YesNoIndicator constantPrePaymentPenaltyIndicator) {
		this.constantPrePaymentPenaltyIndicator = Objects.requireNonNull(constantPrePaymentPenaltyIndicator);
		return this;
	}

	public Optional<Max35Text> getLotIdentification() {
		return lotIdentification == null ? Optional.empty() : Optional.of(lotIdentification);
	}

	public Debt1 setLotIdentification(Max35Text lotIdentification) {
		this.lotIdentification = lotIdentification;
		return this;
	}

	public Optional<PrePaymentSpeed1> getPrePaymentSpeed() {
		return prePaymentSpeed == null ? Optional.empty() : Optional.of(prePaymentSpeed);
	}

	public Debt1 setPrePaymentSpeed(PrePaymentSpeed1 prePaymentSpeed) {
		this.prePaymentSpeed = prePaymentSpeed;
		return this;
	}

	public Optional<PercentageRate> getConstantPrePaymentYield() {
		return constantPrePaymentYield == null ? Optional.empty() : Optional.of(constantPrePaymentYield);
	}

	public Debt1 setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = constantPrePaymentYield;
		return this;
	}

	public Optional<PercentageRate> getWeightedAverageCoupon() {
		return weightedAverageCoupon == null ? Optional.empty() : Optional.of(weightedAverageCoupon);
	}

	public Debt1 setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = weightedAverageCoupon;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageLife() {
		return weightedAverageLife == null ? Optional.empty() : Optional.of(weightedAverageLife);
	}

	public Debt1 setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = weightedAverageLife;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageLoan() {
		return weightedAverageLoan == null ? Optional.empty() : Optional.of(weightedAverageLoan);
	}

	public Debt1 setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = weightedAverageLoan;
		return this;
	}

	public Optional<DecimalNumber> getWeightedAverageMaturity() {
		return weightedAverageMaturity == null ? Optional.empty() : Optional.of(weightedAverageMaturity);
	}

	public Debt1 setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = weightedAverageMaturity;
		return this;
	}

	public Optional<YesNoIndicator> getInsuredIndicator() {
		return insuredIndicator == null ? Optional.empty() : Optional.of(insuredIndicator);
	}

	public Debt1 setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getBankQualifiedIndicator() {
		return bankQualifiedIndicator == null ? Optional.empty() : Optional.of(bankQualifiedIndicator);
	}

	public Debt1 setBankQualifiedIndicator(YesNoIndicator bankQualifiedIndicator) {
		this.bankQualifiedIndicator = bankQualifiedIndicator;
		return this;
	}

	public Optional<InterestChange1> getVariableInterestDetails() {
		return variableInterestDetails == null ? Optional.empty() : Optional.of(variableInterestDetails);
	}

	public Debt1 setVariableInterestDetails(InterestChange1 variableInterestDetails) {
		this.variableInterestDetails = variableInterestDetails;
		return this;
	}

	public Optional<YieldCalculation1> getYieldDetails() {
		return yieldDetails == null ? Optional.empty() : Optional.of(yieldDetails);
	}

	public Debt1 setYieldDetails(YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
		return this;
	}
}