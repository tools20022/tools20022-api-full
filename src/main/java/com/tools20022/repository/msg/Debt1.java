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
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.InterestComputationMethod1Choice;
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Debt1", propOrder = {"faceAmount", "paymentFrequency", "datedDate", "firstPaymentDate", "maturityDate", "nextCouponDate", "putableDate", "nextCallableDate", "nextFactorDate", "dayCountBasis", "paymentDirectionIndicator",
		"interestRate", "nextInterestRate", "oddCouponIndicator", "callableIndicator", "CPProgram", "CPRegistrationType", "interestAccrualDate", "putableIndicator", "convertibleIndicator", "preFundedIndicator", "escrowedIndicator",
		"perpetualIndicator", "subordinatedIndicator", "extendibleIndicator", "extendiblePeriod", "variableRateIndicator", "overAllotmentAmount", "overAllotmentRate", "amortisableIndicator", "interestCalculationMethod",
		"capitalisedInterest", "actualDenominationAmount", "currentFactor", "nextFactor", "previousFactor", "conversionPeriod", "conversionRatioDenominator", "conversionRatioNumerator", "pieces", "poolsMaximum", "poolsPerMillion",
		"poolsPerLot", "poolsPerTrade", "constantPrePaymentPenaltyIndicator", "lotIdentification", "prePaymentSpeed", "constantPrePaymentYield", "weightedAverageCoupon", "weightedAverageLife", "weightedAverageLoan",
		"weightedAverageMaturity", "insuredIndicator", "bankQualifiedIndicator", "variableInterestDetails", "yieldDetails"})
public class Debt1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute mmFaceAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> Debt1.mmObject();
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
	protected Frequency1Code paymentFrequency;
	/**
	 * Specifies the frequency of an interest payment.
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
	public static final MMMessageAttribute mmPaymentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmPaymentFrequency;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmFirstPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
			componentContext_lazy = () -> Debt1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmNextFactorDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextFactorDate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	protected InterestComputationMethod1Choice dayCountBasis;
	/**
	 * Specifies the computation method of (accrued) interest of the security.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDayCountBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPaymentDirectionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmNextInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmOddCouponIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOddCouponIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmCallableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	 * most used are: 0 = N/A 1 = 3(a)3 2 = 4(2) 3 = 3(a)4 4 = 3(c)7 5 = 144A 6
	 * = 3(a)2 99 = Other
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPProgram = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPProgram;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "CPPrgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max350Text cPRegistrationType;
	/**
	 * The registration type of a commercial paper issuance.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * definition} = "The registration type of a commercial paper issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCPRegistrationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCPRegistrationType;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "CPRegnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPRegistrationType";
			definition = "The registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime interestAccrualDate;
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the Issue Date and the Dated Date.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Debt1
	 * Debt1}</li>
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
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the Issue Date and the Dated Date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAccrualDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestAccrualDate;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the Issue Date and the Dated Date.";
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
	public static final MMMessageAttribute mmPutableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	protected YesNoIndicator convertibleIndicator;
	/**
	 * Indicates whether the interest bearing security is convertible into
	 * another type of security.
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
	public static final MMMessageAttribute mmConvertibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConvertibleIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
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
	public static final MMMessageAttribute mmPreFundedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPreFundedIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmEscrowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmEscrowedIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPerpetualIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPerpetualIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmSubordinatedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmSubordinatedIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmExtendibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendibleIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmExtendiblePeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmExtendiblePeriod;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmVariableRateIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmOverAllotmentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentAmount;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmOverAllotmentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmOverAllotmentRate;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmAmortisableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAmortisableIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmInterestCalculationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> Debt1.mmObject();
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
	protected DistributionPolicy1Code capitalisedInterest;
	/**
	 * Specifies whether the interest amount is capitalised until maturity date
	 * or paid out at each interest payment date.
	 * <p>
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
	public static final MMMessageAttribute mmCapitalisedInterest = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCapitalisedInterest;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "CptlsdIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
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
	public static final MMMessageAttribute mmActualDenominationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmActualDenominationAmount;
			componentContext_lazy = () -> Debt1.mmObject();
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
	 * defining the outstanding principal of the bond (for asset or mortgage
	 * backed securities).
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
	 * "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for asset or mortgage backed securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Identifies the current factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate nextFactor;
	/**
	 * Identifies the new factor expressed as a decimal between 0 and 1 defining
	 * the outstanding principal of the bond (for asset or mortgage backed
	 * securities).
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
	 * "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for asset or mortgage backed securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Identifies the new factor expressed as a decimal between 0 and 1 defining the outstanding principal of  the bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate previousFactor;
	/**
	 * Identifies the previous factor expressed as a decimal between 0 and 1
	 * defining the outstanding principal of the bond (for asset or mortgage
	 * backed securities).
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
	public static final MMMessageAttribute mmPreviousFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Identifies the previous factor expressed as a decimal \nbetween 0 and 1 defining the outstanding principal of \nthe bond (for asset or mortgage backed securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected DateTimePeriodDetails conversionPeriod;
	/**
	 * Period during which a convertible security may be converted according to
	 * the terms of the issue.
	 * <p>
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
	public static final MMMessageAttribute mmConversionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPeriod;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice conversionRatioDenominator;
	/**
	 * Number of held securities for the conversion.
	 * <p>
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
	public static final MMMessageAttribute mmConversionRatioDenominator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionRatioDenominator;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioDnmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice conversionRatioNumerator;
	/**
	 * Number of target securities for the conversion.
	 * <p>
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
	public static final MMMessageAttribute mmConversionRatioNumerator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionRatioNumerator;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioNmrtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
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
	public static final MMMessageAttribute mmPieces = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPieces;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPoolsMaximum = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsMaximum;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPoolsPerMillion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerMillion;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPoolsPerLot = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerLot;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmPoolsPerTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolsPerTrade;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmConstantPrePaymentPenaltyIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentPenalty;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "CstPrePmtPnltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentPenaltyIndicator";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text lotIdentification;
	/**
	 * Identifies the lot constituting the asset backed or mortgage backed
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
	public static final MMMessageAttribute mmLotIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotIdentifier;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "LotId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotIdentification";
			definition = "Identifies the lot constituting the asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PrePaymentSpeed1 prePaymentSpeed;
	/**
	 * Speed of unscheduled partial or complete payment of the principal amount
	 * outstanding on a debt obligation before its due date.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPrePaymentSpeed = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmPrePaymentSpeed;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "PrePmtSpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PrePaymentSpeed1.mmObject();
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
	public static final MMMessageAttribute mmConstantPrePaymentYield = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmConstantPrePaymentYield;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmWeightedAverageCoupon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageCoupon;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmWeightedAverageLife = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLife;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmWeightedAverageLoan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageLoan;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmWeightedAverageMaturity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmWeightedAverageMaturity;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmInsuredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmInsuredIndicator;
			componentContext_lazy = () -> Debt1.mmObject();
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
	public static final MMMessageAttribute mmBankQualifiedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmBankQualified;
			componentContext_lazy = () -> Debt1.mmObject();
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
	protected InterestChange1 variableInterestDetails;
	/**
	 * Information linked to the variable interest rate of the security.
	 * <p>
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
	public static final MMMessageAssociationEnd mmVariableInterestDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmVariableInterest;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "VarblIntrstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableInterestDetails";
			definition = "Information linked to the variable interest rate of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
		}
	};
	protected YieldCalculation1 yieldDetails;
	/**
	 * Calculated yield based on the price.
	 * <p>
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
	public static final MMMessageAssociationEnd mmYieldDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> Debt1.mmObject();
			isDerived = false;
			xmlTag = "YldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldDetails";
			definition = "Calculated yield based on the price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Debt1.mmFaceAmount, Debt1.mmPaymentFrequency, Debt1.mmDatedDate, Debt1.mmFirstPaymentDate, Debt1.mmMaturityDate, Debt1.mmNextCouponDate, Debt1.mmPutableDate,
						Debt1.mmNextCallableDate, Debt1.mmNextFactorDate, Debt1.mmDayCountBasis, Debt1.mmPaymentDirectionIndicator, Debt1.mmInterestRate, Debt1.mmNextInterestRate, Debt1.mmOddCouponIndicator, Debt1.mmCallableIndicator,
						Debt1.mmCPProgram, Debt1.mmCPRegistrationType, Debt1.mmInterestAccrualDate, Debt1.mmPutableIndicator, Debt1.mmConvertibleIndicator, Debt1.mmPreFundedIndicator, Debt1.mmEscrowedIndicator, Debt1.mmPerpetualIndicator,
						Debt1.mmSubordinatedIndicator, Debt1.mmExtendibleIndicator, Debt1.mmExtendiblePeriod, Debt1.mmVariableRateIndicator, Debt1.mmOverAllotmentAmount, Debt1.mmOverAllotmentRate, Debt1.mmAmortisableIndicator,
						Debt1.mmInterestCalculationMethod, Debt1.mmCapitalisedInterest, Debt1.mmActualDenominationAmount, Debt1.mmCurrentFactor, Debt1.mmNextFactor, Debt1.mmPreviousFactor, Debt1.mmConversionPeriod,
						Debt1.mmConversionRatioDenominator, Debt1.mmConversionRatioNumerator, Debt1.mmPieces, Debt1.mmPoolsMaximum, Debt1.mmPoolsPerMillion, Debt1.mmPoolsPerLot, Debt1.mmPoolsPerTrade,
						Debt1.mmConstantPrePaymentPenaltyIndicator, Debt1.mmLotIdentification, Debt1.mmPrePaymentSpeed, Debt1.mmConstantPrePaymentYield, Debt1.mmWeightedAverageCoupon, Debt1.mmWeightedAverageLife,
						Debt1.mmWeightedAverageLoan, Debt1.mmWeightedAverageMaturity, Debt1.mmInsuredIndicator, Debt1.mmBankQualifiedIndicator, Debt1.mmVariableInterestDetails, Debt1.mmYieldDetails);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Debt1";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FaceAmt")
	public ActiveCurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(ActiveCurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
	}

	@XmlElement(name = "PmtFrqcy")
	public Frequency1Code getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(Frequency1Code paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	@XmlElement(name = "DtdDt")
	public ISODateTime getDatedDate() {
		return datedDate;
	}

	public void setDatedDate(ISODateTime datedDate) {
		this.datedDate = datedDate;
	}

	@XmlElement(name = "FrstPmtDt")
	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	@XmlElement(name = "MtrtyDt")
	public ISODateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "NxtCpnDt")
	public ISODateTime getNextCouponDate() {
		return nextCouponDate;
	}

	public void setNextCouponDate(ISODateTime nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
	}

	@XmlElement(name = "PutblDt")
	public ISODateTime getPutableDate() {
		return putableDate;
	}

	public void setPutableDate(ISODateTime putableDate) {
		this.putableDate = putableDate;
	}

	@XmlElement(name = "NxtCllblDt")
	public ISODateTime getNextCallableDate() {
		return nextCallableDate;
	}

	public void setNextCallableDate(ISODateTime nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
	}

	@XmlElement(name = "NxtFctrDt")
	public ISODateTime getNextFactorDate() {
		return nextFactorDate;
	}

	public void setNextFactorDate(ISODateTime nextFactorDate) {
		this.nextFactorDate = nextFactorDate;
	}

	@XmlElement(name = "DayCntBsis")
	public InterestComputationMethod1Choice getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethod1Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	@XmlElement(name = "PmtDrctnInd")
	public PaymentDirectionIndicator getPaymentDirectionIndicator() {
		return paymentDirectionIndicator;
	}

	public void setPaymentDirectionIndicator(PaymentDirectionIndicator paymentDirectionIndicator) {
		this.paymentDirectionIndicator = paymentDirectionIndicator;
	}

	@XmlElement(name = "IntrstRate")
	public PercentageRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
	}

	@XmlElement(name = "NxtIntrstRate")
	public PercentageRate getNextInterestRate() {
		return nextInterestRate;
	}

	public void setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
	}

	@XmlElement(name = "OddCpnInd")
	public YesNoIndicator getOddCouponIndicator() {
		return oddCouponIndicator;
	}

	public void setOddCouponIndicator(YesNoIndicator oddCouponIndicator) {
		this.oddCouponIndicator = oddCouponIndicator;
	}

	@XmlElement(name = "CllblInd")
	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public void setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
	}

	@XmlElement(name = "CPPrgm")
	public Number getCPProgram() {
		return cPProgram;
	}

	public void setCPProgram(Number cPProgram) {
		this.cPProgram = cPProgram;
	}

	@XmlElement(name = "CPRegnTp")
	public Max350Text getCPRegistrationType() {
		return cPRegistrationType;
	}

	public void setCPRegistrationType(Max350Text cPRegistrationType) {
		this.cPRegistrationType = cPRegistrationType;
	}

	@XmlElement(name = "IntrstAcrlDt")
	public ISODateTime getInterestAccrualDate() {
		return interestAccrualDate;
	}

	public void setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = interestAccrualDate;
	}

	@XmlElement(name = "PutblInd")
	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public void setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
	}

	@XmlElement(name = "ConvtblInd")
	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
	}

	@XmlElement(name = "PreFnddInd")
	public YesNoIndicator getPreFundedIndicator() {
		return preFundedIndicator;
	}

	public void setPreFundedIndicator(YesNoIndicator preFundedIndicator) {
		this.preFundedIndicator = preFundedIndicator;
	}

	@XmlElement(name = "EscrwdInd")
	public YesNoIndicator getEscrowedIndicator() {
		return escrowedIndicator;
	}

	public void setEscrowedIndicator(YesNoIndicator escrowedIndicator) {
		this.escrowedIndicator = escrowedIndicator;
	}

	@XmlElement(name = "PerptlInd")
	public YesNoIndicator getPerpetualIndicator() {
		return perpetualIndicator;
	}

	public void setPerpetualIndicator(YesNoIndicator perpetualIndicator) {
		this.perpetualIndicator = perpetualIndicator;
	}

	@XmlElement(name = "SubrdntdInd")
	public YesNoIndicator getSubordinatedIndicator() {
		return subordinatedIndicator;
	}

	public void setSubordinatedIndicator(YesNoIndicator subordinatedIndicator) {
		this.subordinatedIndicator = subordinatedIndicator;
	}

	@XmlElement(name = "XtndblInd")
	public YesNoIndicator getExtendibleIndicator() {
		return extendibleIndicator;
	}

	public void setExtendibleIndicator(YesNoIndicator extendibleIndicator) {
		this.extendibleIndicator = extendibleIndicator;
	}

	@XmlElement(name = "XtndblPrd")
	public DateTimePeriodChoice getExtendiblePeriod() {
		return extendiblePeriod;
	}

	public void setExtendiblePeriod(DateTimePeriodChoice extendiblePeriod) {
		this.extendiblePeriod = extendiblePeriod;
	}

	@XmlElement(name = "VarblRateInd")
	public YesNoIndicator getVariableRateIndicator() {
		return variableRateIndicator;
	}

	public void setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
	}

	@XmlElement(name = "OverAlltmtAmt")
	public ActiveCurrencyAndAmount getOverAllotmentAmount() {
		return overAllotmentAmount;
	}

	public void setOverAllotmentAmount(ActiveCurrencyAndAmount overAllotmentAmount) {
		this.overAllotmentAmount = overAllotmentAmount;
	}

	@XmlElement(name = "OverAlltmtRate")
	public PercentageRate getOverAllotmentRate() {
		return overAllotmentRate;
	}

	public void setOverAllotmentRate(PercentageRate overAllotmentRate) {
		this.overAllotmentRate = overAllotmentRate;
	}

	@XmlElement(name = "AmtsblInd")
	public YesNoIndicator getAmortisableIndicator() {
		return amortisableIndicator;
	}

	public void setAmortisableIndicator(YesNoIndicator amortisableIndicator) {
		this.amortisableIndicator = amortisableIndicator;
	}

	@XmlElement(name = "IntrstClctnMtd")
	public Max70Text getInterestCalculationMethod() {
		return interestCalculationMethod;
	}

	public void setInterestCalculationMethod(Max70Text interestCalculationMethod) {
		this.interestCalculationMethod = interestCalculationMethod;
	}

	@XmlElement(name = "CptlsdIntrst")
	public DistributionPolicy1Code getCapitalisedInterest() {
		return capitalisedInterest;
	}

	public void setCapitalisedInterest(DistributionPolicy1Code capitalisedInterest) {
		this.capitalisedInterest = capitalisedInterest;
	}

	@XmlElement(name = "ActlDnmtnAmt")
	public List<ActiveCurrencyAndAmount> getActualDenominationAmount() {
		return actualDenominationAmount;
	}

	public void setActualDenominationAmount(List<ActiveCurrencyAndAmount> actualDenominationAmount) {
		this.actualDenominationAmount = actualDenominationAmount;
	}

	@XmlElement(name = "CurFctr")
	public PercentageRate getCurrentFactor() {
		return currentFactor;
	}

	public void setCurrentFactor(PercentageRate currentFactor) {
		this.currentFactor = currentFactor;
	}

	@XmlElement(name = "NxtFctr")
	public PercentageRate getNextFactor() {
		return nextFactor;
	}

	public void setNextFactor(PercentageRate nextFactor) {
		this.nextFactor = nextFactor;
	}

	@XmlElement(name = "PrvsFctr")
	public PercentageRate getPreviousFactor() {
		return previousFactor;
	}

	public void setPreviousFactor(PercentageRate previousFactor) {
		this.previousFactor = previousFactor;
	}

	@XmlElement(name = "ConvsPrd")
	public DateTimePeriodDetails getConversionPeriod() {
		return conversionPeriod;
	}

	public void setConversionPeriod(com.tools20022.repository.msg.DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
	}

	@XmlElement(name = "ConvsRatioDnmtr")
	public FinancialInstrumentQuantityChoice getConversionRatioDenominator() {
		return conversionRatioDenominator;
	}

	public void setConversionRatioDenominator(FinancialInstrumentQuantityChoice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
	}

	@XmlElement(name = "ConvsRatioNmrtr")
	public FinancialInstrumentQuantityChoice getConversionRatioNumerator() {
		return conversionRatioNumerator;
	}

	public void setConversionRatioNumerator(FinancialInstrumentQuantityChoice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
	}

	@XmlElement(name = "Pcs")
	public DecimalNumber getPieces() {
		return pieces;
	}

	public void setPieces(DecimalNumber pieces) {
		this.pieces = pieces;
	}

	@XmlElement(name = "PlsMax")
	public DecimalNumber getPoolsMaximum() {
		return poolsMaximum;
	}

	public void setPoolsMaximum(DecimalNumber poolsMaximum) {
		this.poolsMaximum = poolsMaximum;
	}

	@XmlElement(name = "PlsPerMln")
	public DecimalNumber getPoolsPerMillion() {
		return poolsPerMillion;
	}

	public void setPoolsPerMillion(DecimalNumber poolsPerMillion) {
		this.poolsPerMillion = poolsPerMillion;
	}

	@XmlElement(name = "PlsPerLot")
	public DecimalNumber getPoolsPerLot() {
		return poolsPerLot;
	}

	public void setPoolsPerLot(DecimalNumber poolsPerLot) {
		this.poolsPerLot = poolsPerLot;
	}

	@XmlElement(name = "PlsPerTrad")
	public DecimalNumber getPoolsPerTrade() {
		return poolsPerTrade;
	}

	public void setPoolsPerTrade(DecimalNumber poolsPerTrade) {
		this.poolsPerTrade = poolsPerTrade;
	}

	@XmlElement(name = "CstPrePmtPnltyInd", required = true)
	public YesNoIndicator getConstantPrePaymentPenaltyIndicator() {
		return constantPrePaymentPenaltyIndicator;
	}

	public void setConstantPrePaymentPenaltyIndicator(YesNoIndicator constantPrePaymentPenaltyIndicator) {
		this.constantPrePaymentPenaltyIndicator = constantPrePaymentPenaltyIndicator;
	}

	@XmlElement(name = "LotId")
	public Max35Text getLotIdentification() {
		return lotIdentification;
	}

	public void setLotIdentification(Max35Text lotIdentification) {
		this.lotIdentification = lotIdentification;
	}

	@XmlElement(name = "PrePmtSpd")
	public PrePaymentSpeed1 getPrePaymentSpeed() {
		return prePaymentSpeed;
	}

	public void setPrePaymentSpeed(com.tools20022.repository.msg.PrePaymentSpeed1 prePaymentSpeed) {
		this.prePaymentSpeed = prePaymentSpeed;
	}

	@XmlElement(name = "CstPrePmtYld")
	public PercentageRate getConstantPrePaymentYield() {
		return constantPrePaymentYield;
	}

	public void setConstantPrePaymentYield(PercentageRate constantPrePaymentYield) {
		this.constantPrePaymentYield = constantPrePaymentYield;
	}

	@XmlElement(name = "WghtdAvrgCpn")
	public PercentageRate getWeightedAverageCoupon() {
		return weightedAverageCoupon;
	}

	public void setWeightedAverageCoupon(PercentageRate weightedAverageCoupon) {
		this.weightedAverageCoupon = weightedAverageCoupon;
	}

	@XmlElement(name = "WghtdAvrgLife")
	public DecimalNumber getWeightedAverageLife() {
		return weightedAverageLife;
	}

	public void setWeightedAverageLife(DecimalNumber weightedAverageLife) {
		this.weightedAverageLife = weightedAverageLife;
	}

	@XmlElement(name = "WghtdAvrgLn")
	public DecimalNumber getWeightedAverageLoan() {
		return weightedAverageLoan;
	}

	public void setWeightedAverageLoan(DecimalNumber weightedAverageLoan) {
		this.weightedAverageLoan = weightedAverageLoan;
	}

	@XmlElement(name = "WghtdAvrgMtrty")
	public DecimalNumber getWeightedAverageMaturity() {
		return weightedAverageMaturity;
	}

	public void setWeightedAverageMaturity(DecimalNumber weightedAverageMaturity) {
		this.weightedAverageMaturity = weightedAverageMaturity;
	}

	@XmlElement(name = "InsrdInd")
	public YesNoIndicator getInsuredIndicator() {
		return insuredIndicator;
	}

	public void setInsuredIndicator(YesNoIndicator insuredIndicator) {
		this.insuredIndicator = insuredIndicator;
	}

	@XmlElement(name = "BkQlfdInd")
	public YesNoIndicator getBankQualifiedIndicator() {
		return bankQualifiedIndicator;
	}

	public void setBankQualifiedIndicator(YesNoIndicator bankQualifiedIndicator) {
		this.bankQualifiedIndicator = bankQualifiedIndicator;
	}

	@XmlElement(name = "VarblIntrstDtls")
	public InterestChange1 getVariableInterestDetails() {
		return variableInterestDetails;
	}

	public void setVariableInterestDetails(com.tools20022.repository.msg.InterestChange1 variableInterestDetails) {
		this.variableInterestDetails = variableInterestDetails;
	}

	@XmlElement(name = "YldDtls")
	public YieldCalculation1 getYieldDetails() {
		return yieldDetails;
	}

	public void setYieldDetails(com.tools20022.repository.msg.YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
	}
}