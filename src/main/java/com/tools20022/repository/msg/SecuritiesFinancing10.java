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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LegalFramework1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the closing of the securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRateChangeDate
 * SecuritiesFinancing10.mmRateChangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRateType
 * SecuritiesFinancing10.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRevaluation
 * SecuritiesFinancing10.mmRevaluation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLegalFramework
 * SecuritiesFinancing10.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestComputationMethod
 * SecuritiesFinancing10.mmInterestComputationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmVariableRateSupport
 * SecuritiesFinancing10.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRepurchaseRate
 * SecuritiesFinancing10.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmStockLoanMargin
 * SecuritiesFinancing10.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmSecuritiesHaircut
 * SecuritiesFinancing10.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmPricingRate
 * SecuritiesFinancing10.mmPricingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmSpreadRate
 * SecuritiesFinancing10.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmCallableTradeIndicator
 * SecuritiesFinancing10.mmCallableTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmTransactionCallDelay
 * SecuritiesFinancing10.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestAmount
 * SecuritiesFinancing10.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestPercentage
 * SecuritiesFinancing10.mmAccruedInterestPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmForfeitAmount
 * SecuritiesFinancing10.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmPremiumAmount
 * SecuritiesFinancing10.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmClosingAmountPerPiecesOfCollateral
 * SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancing10.mmTotalNumberOfCollateralInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmFinancingAgreement
 * SecuritiesFinancing10.mmFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLendingTransactionMethod
 * SecuritiesFinancing10.mmLendingTransactionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLendingWithCollateral
 * SecuritiesFinancing10.mmLendingWithCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmBorrowingReason
 * SecuritiesFinancing10.mmBorrowingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmCollateralType
 * SecuritiesFinancing10.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmContractTermsModificationChanged
 * SecuritiesFinancing10.mmContractTermsModificationChanged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestRate
 * SecuritiesFinancing10.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmBorrowingRate
 * SecuritiesFinancing10.mmBorrowingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmStandardCollateralRatio
 * SecuritiesFinancing10.mmStandardCollateralRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmDividendRatio
 * SecuritiesFinancing10.mmDividendRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmNumberOfDaysLendingBorrowing
 * SecuritiesFinancing10.mmNumberOfDaysLendingBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmStandardCollateralAmount
 * SecuritiesFinancing10.mmStandardCollateralAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestTax
 * SecuritiesFinancing10.mmAccruedInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmEndNumberOfDaysAccrued
 * SecuritiesFinancing10.mmEndNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmEndFactor
 * SecuritiesFinancing10.mmEndFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmSecuritiesLendingType
 * SecuritiesFinancing10.mmSecuritiesLendingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmReversible
 * SecuritiesFinancing10.mmReversible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmMinimumDateForCallBack
 * SecuritiesFinancing10.mmMinimumDateForCallBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRollOver
 * SecuritiesFinancing10.mmRollOver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmPeriodicPayment
 * SecuritiesFinancing10.mmPeriodicPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmExCoupon
 * SecuritiesFinancing10.mmExCoupon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: Sequence E</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancing10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancing10", propOrder = {"rateChangeDate", "rateType", "revaluation", "legalFramework", "interestComputationMethod", "variableRateSupport", "repurchaseRate", "stockLoanMargin", "securitiesHaircut",
		"pricingRate", "spreadRate", "callableTradeIndicator", "transactionCallDelay", "accruedInterestAmount", "accruedInterestPercentage", "forfeitAmount", "premiumAmount", "closingAmountPerPiecesOfCollateral",
		"totalNumberOfCollateralInstructions", "financingAgreement", "lendingTransactionMethod", "lendingWithCollateral", "borrowingReason", "collateralType", "contractTermsModificationChanged", "interestRate", "borrowingRate",
		"standardCollateralRatio", "dividendRatio", "numberOfDaysLendingBorrowing", "standardCollateralAmount", "accruedInterestTax", "endNumberOfDaysAccrued", "endFactor", "securitiesLendingType", "reversible", "minimumDateForCallBack",
		"rollOver", "periodicPayment", "exCoupon"})
public class SecuritiesFinancing10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RateChngDt")
	protected ISODateTime rateChangeDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
	 * SecuritiesFinancing.mmRateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateChngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<ISODateTime>> mmRateChangeDate = new MMMessageAttribute<SecuritiesFinancing10, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SecuritiesFinancing10 obj) {
			return obj.getRateChangeDate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<ISODateTime> value) {
			obj.setRateChangeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RateTp")
	protected RateType19Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateType19Choice
	 * RateType19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<RateType19Choice>> mmRateType = new MMMessageAttribute<SecuritiesFinancing10, Optional<RateType19Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateType19Choice.mmObject();
		}

		@Override
		public Optional<RateType19Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<RateType19Choice> value) {
			obj.setRateType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rvaltn")
	protected Revaluation2Choice revaluation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Revaluation2Choice
	 * Revaluation2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
	 * SecuritiesFinancing.mmRevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvaltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Revaluation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Revaluation2Choice>> mmRevaluation = new MMMessageAttribute<SecuritiesFinancing10, Optional<Revaluation2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRevaluationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "Rvaltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Revaluation";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Revaluation2Choice.mmObject();
		}

		@Override
		public Optional<Revaluation2Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getRevaluation();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Revaluation2Choice> value) {
			obj.setRevaluation(value.orElse(null));
		}
	};
	@XmlElement(name = "LglFrmwk")
	protected LegalFramework1Code legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFramework1Code
	 * LegalFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<LegalFramework1Code>> mmLegalFramework = new MMMessageAttribute<SecuritiesFinancing10, Optional<LegalFramework1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegalFramework1Code.mmObject();
		}

		@Override
		public Optional<LegalFramework1Code> getValue(SecuritiesFinancing10 obj) {
			return obj.getLegalFramework();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<LegalFramework1Code> value) {
			obj.setLegalFramework(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstCmptnMtd")
	protected InterestComputationMethod2Choice interestComputationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice
	 * InterestComputationMethod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstCmptnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestComputationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the computation method of accrued interest of the related financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<InterestComputationMethod2Choice>> mmInterestComputationMethod = new MMMessageAttribute<SecuritiesFinancing10, Optional<InterestComputationMethod2Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "IntrstCmptnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestComputationMethod";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestComputationMethod2Choice.mmObject();
		}

		@Override
		public Optional<InterestComputationMethod2Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getInterestComputationMethod();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<InterestComputationMethod2Choice> value) {
			obj.setInterestComputationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateSpprt")
	protected RateName1 variableRateSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateName1 RateName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<RateName1>> mmVariableRateSupport = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<RateName1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateName1.mmObject();
		}

		@Override
		public Optional<RateName1> getValue(SecuritiesFinancing10 obj) {
			return obj.getVariableRateSupport();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<RateName1> value) {
			obj.setVariableRateSupport(value.orElse(null));
		}
	};
	@XmlElement(name = "RpRate")
	protected Rate2 repurchaseRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate used to calculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>> mmRepurchaseRate = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate used to calculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getRepurchaseRate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setRepurchaseRate(value.orElse(null));
		}
	};
	@XmlElement(name = "StockLnMrgn")
	protected Rate2 stockLoanMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
	 * SecuritiesFinancing.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLnMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>> mmStockLoanMargin = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getStockLoanMargin();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setStockLoanMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesHrcut")
	protected Rate2 securitiesHaircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>> mmSecuritiesHaircut = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getSecuritiesHaircut();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setSecuritiesHaircut(value.orElse(null));
		}
	};
	@XmlElement(name = "PricgRate")
	protected RateOrName1Choice pricingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateOrName1Choice
	 * RateOrName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate to be paid on the transaction amount, as agreed between the counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<RateOrName1Choice>> mmPricingRate = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<RateOrName1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "PricgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingRate";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateOrName1Choice.mmObject();
		}

		@Override
		public Optional<RateOrName1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getPricingRate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<RateOrName1Choice> value) {
			obj.setPricingRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SprdRate")
	protected SpreadRate1 spreadRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SpreadRate1
	 * SpreadRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
	 * Spread.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin over or under an index that determines the repurchase rate, expressed as a rate or an amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<SpreadRate1>> mmSpreadRate = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<SpreadRate1>>() {
		{
			businessElementTrace_lazy = () -> Spread.mmSpreadRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SprdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index that determines the repurchase rate, expressed as a rate or an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SpreadRate1.mmObject();
		}

		@Override
		public Optional<SpreadRate1> getValue(SecuritiesFinancing10 obj) {
			return obj.getSpreadRate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<SpreadRate1> value) {
			obj.setSpreadRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CllblTradInd")
	protected YesNoIndicator callableTradeIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmCallableTradeIndicator
	 * SecuritiesLending.mmCallableTradeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CllblTradInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not the trade is callable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmCallableTradeIndicator = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmCallableTradeIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CllblTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableTradeIndicator";
			definition = "Indicates whether or not the trade is callable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getCallableTradeIndicator();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setCallableTradeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCallDely")
	protected Max3NumericText transactionCallDelay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
	 * SecuritiesFinancing.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCallDely"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Max3NumericText>> mmTransactionCallDelay = new MMMessageAttribute<SecuritiesFinancing10, Optional<Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(SecuritiesFinancing10 obj) {
			return obj.getTransactionCallDelay();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Max3NumericText> value) {
			obj.setTransactionCallDelay(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection5 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
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
	 * definition} =
	 * "Interest amount that has accrued in between two periods, for example, in between interest payment periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>> mmAccruedInterestAmount = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between two periods, for example, in between interest payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection5.mmObject();
		}

		@Override
		public Optional<AmountAndDirection5> getValue(SecuritiesFinancing10 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<AmountAndDirection5> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstPctg")
	protected PercentageRate accruedInterestPercentage;
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate that has been accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<PercentageRate>> mmAccruedInterestPercentage = new MMMessageAttribute<SecuritiesFinancing10, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestPercentage";
			definition = "Interest rate that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SecuritiesFinancing10 obj) {
			return obj.getAccruedInterestPercentage();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<PercentageRate> value) {
			obj.setAccruedInterestPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "FrftAmt")
	protected AmountAndDirection5 forfeitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmForfeitRepurchaseAmount
	 * SecuritiesFinancing.mmForfeitRepurchaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrftAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>> mmForfeitAmount = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmForfeitRepurchaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "FrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection5.mmObject();
		}

		@Override
		public Optional<AmountAndDirection5> getValue(SecuritiesFinancing10 obj) {
			return obj.getForfeitAmount();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<AmountAndDirection5> value) {
			obj.setForfeitAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrmAmt")
	protected AmountAndDirection5 premiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmPremiumAmount
	 * SecuritiesFinancing.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the amount of money of the first leg and the amount of the second leg of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>> mmPremiumAmount = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the amount of money of the first leg and the amount of the second leg of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection5.mmObject();
		}

		@Override
		public Optional<AmountAndDirection5> getValue(SecuritiesFinancing10 obj) {
			return obj.getPremiumAmount();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<AmountAndDirection5> value) {
			obj.setPremiumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgAmtPerPcsOfColl")
	protected AmountAndDirection5 closingAmountPerPiecesOfCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgAmtPerPcsOfColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAmountPerPiecesOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to close the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>> mmClosingAmountPerPiecesOfCollateral = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<AmountAndDirection5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "ClsgAmtPerPcsOfColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingAmountPerPiecesOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to close the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection5.mmObject();
		}

		@Override
		public Optional<AmountAndDirection5> getValue(SecuritiesFinancing10 obj) {
			return obj.getClosingAmountPerPiecesOfCollateral();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<AmountAndDirection5> value) {
			obj.setClosingAmountPerPiecesOfCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfCollInstrs")
	protected Max3NumericText totalNumberOfCollateralInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancing.mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfCollInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfCollateralInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total Number of collateral instructions involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Max3NumericText>> mmTotalNumberOfCollateralInstructions = new MMMessageAttribute<SecuritiesFinancing10, Optional<Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTotalNumberOfCollateralInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfCollInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(SecuritiesFinancing10 obj) {
			return obj.getTotalNumberOfCollateralInstructions();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Max3NumericText> value) {
			obj.setTotalNumberOfCollateralInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "FincgAgrmt")
	protected Agreement3 financingAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Agreement3 Agreement3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
	 * SecuritiesFinancing.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details for the securities financing transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Agreement3>> mmFinancingAgreement = new MMMessageAssociationEnd<SecuritiesFinancing10, Optional<Agreement3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmFinancingAgreement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "FincgAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides details for the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Agreement3.mmObject();
		}

		@Override
		public Optional<Agreement3> getValue(SecuritiesFinancing10 obj) {
			return obj.getFinancingAgreement();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Agreement3> value) {
			obj.setFinancingAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "LndgTxMtd")
	protected LendingTransactionMethod1Choice lendingTransactionMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LendingTransactionMethod1Choice
	 * LendingTransactionMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LndgTxMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingTransactionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method applied to a lending transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<LendingTransactionMethod1Choice>> mmLendingTransactionMethod = new MMMessageAttribute<SecuritiesFinancing10, Optional<LendingTransactionMethod1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LndgTxMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Method applied to a lending transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LendingTransactionMethod1Choice.mmObject();
		}

		@Override
		public Optional<LendingTransactionMethod1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getLendingTransactionMethod();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<LendingTransactionMethod1Choice> value) {
			obj.setLendingTransactionMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "LndgWthColl")
	protected YesNoIndicator lendingWithCollateral;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmLendingWithCollateral
	 * SecuritiesLending.mmLendingWithCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LndgWthColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingWithCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the contract is with or without an exchange of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmLendingWithCollateral = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmLendingWithCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LndgWthColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingWithCollateral";
			definition = "Indicates if the contract is with or without an exchange of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getLendingWithCollateral();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setLendingWithCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwgRsn")
	protected BorrowingReason1Choice borrowingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BorrowingReason1Choice
	 * BorrowingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<BorrowingReason1Choice>> mmBorrowingReason = new MMMessageAttribute<SecuritiesFinancing10, Optional<BorrowingReason1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "BrrwgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReason";
			definition = "Identifies the underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BorrowingReason1Choice.mmObject();
		}

		@Override
		public Optional<BorrowingReason1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getBorrowingReason();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<BorrowingReason1Choice> value) {
			obj.setBorrowingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CollTp")
	protected CollateralType1Choice collateralType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CollateralType1Choice
	 * CollateralType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
	 * Collateral.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of collateral, for insatnce, security, bond, etc."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<CollateralType1Choice>> mmCollateralType = new MMMessageAttribute<SecuritiesFinancing10, Optional<CollateralType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Indicates the type of collateral, for insatnce, security, bond, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CollateralType1Choice.mmObject();
		}

		@Override
		public Optional<CollateralType1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getCollateralType();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<CollateralType1Choice> value) {
			obj.setCollateralType(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctTermsModChngd")
	protected YesNoIndicator contractTermsModificationChanged;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctTermsModChngd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractTermsModificationChanged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not the contract terms changed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmContractTermsModificationChanged = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CtrctTermsModChngd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractTermsModificationChanged";
			definition = "Indicates whether or not the contract terms changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getContractTermsModificationChanged();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setContractTermsModificationChanged(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstRate")
	protected Rate2 interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
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
	 * "Interest rate to be paid as agreed between the counterparties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>> mmInterestRate = new MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Interest rate to be paid as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwgRate")
	protected Rate2 borrowingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate to be paid by the Borrower to the Lender for the securities borrowed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>> mmBorrowingRate = new MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "BrrwgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingRate";
			definition = "Rate to be paid by the Borrower to the Lender for the securities borrowed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getBorrowingRate();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setBorrowingRate(value.orElse(null));
		}
	};
	@XmlElement(name = "StdCollRatio")
	protected Rate2 standardCollateralRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdCollRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCollateralRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to calculate the standard collateral amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>> mmStandardCollateralRatio = new MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StdCollRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralRatio";
			definition = "Method used to calculate the standard collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getStandardCollateralRatio();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setStandardCollateralRatio(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddRatio")
	protected Rate2 dividendRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmRate
	 * Dividend.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of earnings paid to shareholders in dividends."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>> mmDividendRatio = new MMMessageAttribute<SecuritiesFinancing10, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "DvddRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancing10 obj) {
			return obj.getDividendRatio();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Rate2> value) {
			obj.setDividendRatio(value.orElse(null));
		}
	};
	@XmlElement(name = "NbOfDaysLndgBrrwg")
	protected Number21Choice numberOfDaysLendingBorrowing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Number21Choice
	 * Number21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmNumberOfDaysLendingBorrowing
	 * SecuritiesLending.mmNumberOfDaysLendingBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysLndgBrrwg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysLendingBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days the securities are lent or borrowed where the contract has an agreed closing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Number21Choice>> mmNumberOfDaysLendingBorrowing = new MMMessageAttribute<SecuritiesFinancing10, Optional<Number21Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmNumberOfDaysLendingBorrowing;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysLndgBrrwg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysLendingBorrowing";
			definition = "Number of days the securities are lent or borrowed where the contract has an agreed closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number21Choice.mmObject();
		}

		@Override
		public Optional<Number21Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getNumberOfDaysLendingBorrowing();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Number21Choice> value) {
			obj.setNumberOfDaysLendingBorrowing(value.orElse(null));
		}
	};
	@XmlElement(name = "StdCollAmt")
	protected AmountAndDirection5 standardCollateralAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdCollAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the standard collateral amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<AmountAndDirection5>> mmStandardCollateralAmount = new MMMessageAttribute<SecuritiesFinancing10, Optional<AmountAndDirection5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StdCollAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralAmount";
			definition = "Specifies the standard collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection5.mmObject();
		}

		@Override
		public Optional<AmountAndDirection5> getValue(SecuritiesFinancing10 obj) {
			return obj.getStandardCollateralAmount();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<AmountAndDirection5> value) {
			obj.setStandardCollateralAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstTax")
	protected YesNoIndicator accruedInterestTax;
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate tax that has been accrued in between coupon payment periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmAccruedInterestTax = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax";
			definition = "Interest rate tax that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getAccruedInterestTax();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setAccruedInterestTax(value.orElse(null));
		}
	};
	@XmlElement(name = "EndNbOfDaysAcrd")
	protected Max3Number endNumberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndNbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndNumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of days accrued at the instant of closing trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Max3Number>> mmEndNumberOfDaysAccrued = new MMMessageAttribute<SecuritiesFinancing10, Optional<Max3Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "EndNbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndNumberOfDaysAccrued";
			definition = "Number of days accrued at the instant of closing trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(SecuritiesFinancing10 obj) {
			return obj.getEndNumberOfDaysAccrued();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Max3Number> value) {
			obj.setEndNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "EndFctr")
	protected BaseOneRate endFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "End ratio of principal outstanding to the original balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<BaseOneRate>> mmEndFactor = new MMMessageAttribute<SecuritiesFinancing10, Optional<BaseOneRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "EndFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndFactor";
			definition = "End ratio of principal outstanding to the original balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(SecuritiesFinancing10 obj) {
			return obj.getEndFactor();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<BaseOneRate> value) {
			obj.setEndFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesLndgTp")
	protected SecuritiesLendingType1Choice securitiesLendingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesLendingType1Choice
	 * SecuritiesLendingType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesLndgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of securities lending."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<SecuritiesLendingType1Choice>> mmSecuritiesLendingType = new MMMessageAttribute<SecuritiesFinancing10, Optional<SecuritiesLendingType1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SctiesLndgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingType";
			definition = "Type of securities lending.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesLendingType1Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesLendingType1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getSecuritiesLendingType();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<SecuritiesLendingType1Choice> value) {
			obj.setSecuritiesLendingType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rvsbl")
	protected Reversible1Choice reversible;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reversible1Choice
	 * Reversible1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<Reversible1Choice>> mmReversible = new MMMessageAttribute<SecuritiesFinancing10, Optional<Reversible1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "Rvsbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversible";
			definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Reversible1Choice.mmObject();
		}

		@Override
		public Optional<Reversible1Choice> getValue(SecuritiesFinancing10 obj) {
			return obj.getReversible();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<Reversible1Choice> value) {
			obj.setReversible(value.orElse(null));
		}
	};
	@XmlElement(name = "MinDtForCallBck")
	protected ISODate minimumDateForCallBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmMinimumDateForCallBack
	 * SecuritiesLending.mmMinimumDateForCallBack}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinDtForCallBck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDateForCallBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This is the minimum date at which the Borrower is allowed to give back the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<ISODate>> mmMinimumDateForCallBack = new MMMessageAttribute<SecuritiesFinancing10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmMinimumDateForCallBack;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "MinDtForCallBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDateForCallBack";
			definition = "This is the minimum date at which the Borrower is allowed to give back the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SecuritiesFinancing10 obj) {
			return obj.getMinimumDateForCallBack();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<ISODate> value) {
			obj.setMinimumDateForCallBack(value.orElse(null));
		}
	};
	@XmlElement(name = "RollOver")
	protected YesNoIndicator rollOver;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmRollover
	 * SecuritiesLending.mmRollover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RollOver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollOver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the contract can be rolled over."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmRollOver = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmRollover;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RollOver";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollOver";
			definition = "Indicates that the contract can be rolled over.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getRollOver();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setRollOver(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdcPmt")
	protected YesNoIndicator periodicPayment;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdcPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the securities lending fees can be paid periodically or at the end of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmPeriodicPayment = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "PrdcPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPayment";
			definition = "Indicates whether the securities lending fees can be paid periodically or at the end of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getPeriodicPayment();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setPeriodicPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "ExCpn")
	protected YesNoIndicator exCoupon;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExCpn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is executed ex coupon."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>> mmExCoupon = new MMMessageAttribute<SecuritiesFinancing10, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "ExCpn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			definition = "Indicates whether the trade is executed ex coupon.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancing10 obj) {
			return obj.getExCoupon();
		}

		@Override
		public void setValue(SecuritiesFinancing10 obj, Optional<YesNoIndicator> value) {
			obj.setExCoupon(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing10.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancing10.mmRateType,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancing10.mmLegalFramework,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmInterestComputationMethod, com.tools20022.repository.msg.SecuritiesFinancing10.mmVariableRateSupport,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancing10.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancing10.mmSecuritiesHaircut,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancing10.mmSpreadRate, com.tools20022.repository.msg.SecuritiesFinancing10.mmCallableTradeIndicator,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancing10.mmAccruedInterestAmount,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmAccruedInterestPercentage, com.tools20022.repository.msg.SecuritiesFinancing10.mmForfeitAmount,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancing10.mmFinancingAgreement,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmLendingTransactionMethod, com.tools20022.repository.msg.SecuritiesFinancing10.mmLendingWithCollateral,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmBorrowingReason, com.tools20022.repository.msg.SecuritiesFinancing10.mmCollateralType,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmContractTermsModificationChanged, com.tools20022.repository.msg.SecuritiesFinancing10.mmInterestRate,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmBorrowingRate, com.tools20022.repository.msg.SecuritiesFinancing10.mmStandardCollateralRatio,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmDividendRatio, com.tools20022.repository.msg.SecuritiesFinancing10.mmNumberOfDaysLendingBorrowing,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmStandardCollateralAmount, com.tools20022.repository.msg.SecuritiesFinancing10.mmAccruedInterestTax,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmEndNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesFinancing10.mmEndFactor,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmSecuritiesLendingType, com.tools20022.repository.msg.SecuritiesFinancing10.mmReversible,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmMinimumDateForCallBack, com.tools20022.repository.msg.SecuritiesFinancing10.mmRollOver, com.tools20022.repository.msg.SecuritiesFinancing10.mmPeriodicPayment,
						com.tools20022.repository.msg.SecuritiesFinancing10.mmExCoupon);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "Sequence E"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancing10";
				definition = "Details of the closing of the securities financing transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getRateChangeDate() {
		return rateChangeDate == null ? Optional.empty() : Optional.of(rateChangeDate);
	}

	public SecuritiesFinancing10 setRateChangeDate(ISODateTime rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
		return this;
	}

	public Optional<RateType19Choice> getRateType() {
		return rateType == null ? Optional.empty() : Optional.of(rateType);
	}

	public SecuritiesFinancing10 setRateType(RateType19Choice rateType) {
		this.rateType = rateType;
		return this;
	}

	public Optional<Revaluation2Choice> getRevaluation() {
		return revaluation == null ? Optional.empty() : Optional.of(revaluation);
	}

	public SecuritiesFinancing10 setRevaluation(Revaluation2Choice revaluation) {
		this.revaluation = revaluation;
		return this;
	}

	public Optional<LegalFramework1Code> getLegalFramework() {
		return legalFramework == null ? Optional.empty() : Optional.of(legalFramework);
	}

	public SecuritiesFinancing10 setLegalFramework(LegalFramework1Code legalFramework) {
		this.legalFramework = legalFramework;
		return this;
	}

	public Optional<InterestComputationMethod2Choice> getInterestComputationMethod() {
		return interestComputationMethod == null ? Optional.empty() : Optional.of(interestComputationMethod);
	}

	public SecuritiesFinancing10 setInterestComputationMethod(InterestComputationMethod2Choice interestComputationMethod) {
		this.interestComputationMethod = interestComputationMethod;
		return this;
	}

	public Optional<RateName1> getVariableRateSupport() {
		return variableRateSupport == null ? Optional.empty() : Optional.of(variableRateSupport);
	}

	public SecuritiesFinancing10 setVariableRateSupport(RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
		return this;
	}

	public Optional<Rate2> getRepurchaseRate() {
		return repurchaseRate == null ? Optional.empty() : Optional.of(repurchaseRate);
	}

	public SecuritiesFinancing10 setRepurchaseRate(Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
		return this;
	}

	public Optional<Rate2> getStockLoanMargin() {
		return stockLoanMargin == null ? Optional.empty() : Optional.of(stockLoanMargin);
	}

	public SecuritiesFinancing10 setStockLoanMargin(Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
		return this;
	}

	public Optional<Rate2> getSecuritiesHaircut() {
		return securitiesHaircut == null ? Optional.empty() : Optional.of(securitiesHaircut);
	}

	public SecuritiesFinancing10 setSecuritiesHaircut(Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
		return this;
	}

	public Optional<RateOrName1Choice> getPricingRate() {
		return pricingRate == null ? Optional.empty() : Optional.of(pricingRate);
	}

	public SecuritiesFinancing10 setPricingRate(RateOrName1Choice pricingRate) {
		this.pricingRate = pricingRate;
		return this;
	}

	public Optional<SpreadRate1> getSpreadRate() {
		return spreadRate == null ? Optional.empty() : Optional.of(spreadRate);
	}

	public SecuritiesFinancing10 setSpreadRate(SpreadRate1 spreadRate) {
		this.spreadRate = spreadRate;
		return this;
	}

	public Optional<YesNoIndicator> getCallableTradeIndicator() {
		return callableTradeIndicator == null ? Optional.empty() : Optional.of(callableTradeIndicator);
	}

	public SecuritiesFinancing10 setCallableTradeIndicator(YesNoIndicator callableTradeIndicator) {
		this.callableTradeIndicator = callableTradeIndicator;
		return this;
	}

	public Optional<Max3NumericText> getTransactionCallDelay() {
		return transactionCallDelay == null ? Optional.empty() : Optional.of(transactionCallDelay);
	}

	public SecuritiesFinancing10 setTransactionCallDelay(Max3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
		return this;
	}

	public Optional<AmountAndDirection5> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public SecuritiesFinancing10 setAccruedInterestAmount(AmountAndDirection5 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<PercentageRate> getAccruedInterestPercentage() {
		return accruedInterestPercentage == null ? Optional.empty() : Optional.of(accruedInterestPercentage);
	}

	public SecuritiesFinancing10 setAccruedInterestPercentage(PercentageRate accruedInterestPercentage) {
		this.accruedInterestPercentage = accruedInterestPercentage;
		return this;
	}

	public Optional<AmountAndDirection5> getForfeitAmount() {
		return forfeitAmount == null ? Optional.empty() : Optional.of(forfeitAmount);
	}

	public SecuritiesFinancing10 setForfeitAmount(AmountAndDirection5 forfeitAmount) {
		this.forfeitAmount = forfeitAmount;
		return this;
	}

	public Optional<AmountAndDirection5> getPremiumAmount() {
		return premiumAmount == null ? Optional.empty() : Optional.of(premiumAmount);
	}

	public SecuritiesFinancing10 setPremiumAmount(AmountAndDirection5 premiumAmount) {
		this.premiumAmount = premiumAmount;
		return this;
	}

	public Optional<AmountAndDirection5> getClosingAmountPerPiecesOfCollateral() {
		return closingAmountPerPiecesOfCollateral == null ? Optional.empty() : Optional.of(closingAmountPerPiecesOfCollateral);
	}

	public SecuritiesFinancing10 setClosingAmountPerPiecesOfCollateral(AmountAndDirection5 closingAmountPerPiecesOfCollateral) {
		this.closingAmountPerPiecesOfCollateral = closingAmountPerPiecesOfCollateral;
		return this;
	}

	public Optional<Max3NumericText> getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions == null ? Optional.empty() : Optional.of(totalNumberOfCollateralInstructions);
	}

	public SecuritiesFinancing10 setTotalNumberOfCollateralInstructions(Max3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
		return this;
	}

	public Optional<Agreement3> getFinancingAgreement() {
		return financingAgreement == null ? Optional.empty() : Optional.of(financingAgreement);
	}

	public SecuritiesFinancing10 setFinancingAgreement(Agreement3 financingAgreement) {
		this.financingAgreement = financingAgreement;
		return this;
	}

	public Optional<LendingTransactionMethod1Choice> getLendingTransactionMethod() {
		return lendingTransactionMethod == null ? Optional.empty() : Optional.of(lendingTransactionMethod);
	}

	public SecuritiesFinancing10 setLendingTransactionMethod(LendingTransactionMethod1Choice lendingTransactionMethod) {
		this.lendingTransactionMethod = lendingTransactionMethod;
		return this;
	}

	public Optional<YesNoIndicator> getLendingWithCollateral() {
		return lendingWithCollateral == null ? Optional.empty() : Optional.of(lendingWithCollateral);
	}

	public SecuritiesFinancing10 setLendingWithCollateral(YesNoIndicator lendingWithCollateral) {
		this.lendingWithCollateral = lendingWithCollateral;
		return this;
	}

	public Optional<BorrowingReason1Choice> getBorrowingReason() {
		return borrowingReason == null ? Optional.empty() : Optional.of(borrowingReason);
	}

	public SecuritiesFinancing10 setBorrowingReason(BorrowingReason1Choice borrowingReason) {
		this.borrowingReason = borrowingReason;
		return this;
	}

	public Optional<CollateralType1Choice> getCollateralType() {
		return collateralType == null ? Optional.empty() : Optional.of(collateralType);
	}

	public SecuritiesFinancing10 setCollateralType(CollateralType1Choice collateralType) {
		this.collateralType = collateralType;
		return this;
	}

	public Optional<YesNoIndicator> getContractTermsModificationChanged() {
		return contractTermsModificationChanged == null ? Optional.empty() : Optional.of(contractTermsModificationChanged);
	}

	public SecuritiesFinancing10 setContractTermsModificationChanged(YesNoIndicator contractTermsModificationChanged) {
		this.contractTermsModificationChanged = contractTermsModificationChanged;
		return this;
	}

	public Optional<Rate2> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public SecuritiesFinancing10 setInterestRate(Rate2 interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<Rate2> getBorrowingRate() {
		return borrowingRate == null ? Optional.empty() : Optional.of(borrowingRate);
	}

	public SecuritiesFinancing10 setBorrowingRate(Rate2 borrowingRate) {
		this.borrowingRate = borrowingRate;
		return this;
	}

	public Optional<Rate2> getStandardCollateralRatio() {
		return standardCollateralRatio == null ? Optional.empty() : Optional.of(standardCollateralRatio);
	}

	public SecuritiesFinancing10 setStandardCollateralRatio(Rate2 standardCollateralRatio) {
		this.standardCollateralRatio = standardCollateralRatio;
		return this;
	}

	public Optional<Rate2> getDividendRatio() {
		return dividendRatio == null ? Optional.empty() : Optional.of(dividendRatio);
	}

	public SecuritiesFinancing10 setDividendRatio(Rate2 dividendRatio) {
		this.dividendRatio = dividendRatio;
		return this;
	}

	public Optional<Number21Choice> getNumberOfDaysLendingBorrowing() {
		return numberOfDaysLendingBorrowing == null ? Optional.empty() : Optional.of(numberOfDaysLendingBorrowing);
	}

	public SecuritiesFinancing10 setNumberOfDaysLendingBorrowing(Number21Choice numberOfDaysLendingBorrowing) {
		this.numberOfDaysLendingBorrowing = numberOfDaysLendingBorrowing;
		return this;
	}

	public Optional<AmountAndDirection5> getStandardCollateralAmount() {
		return standardCollateralAmount == null ? Optional.empty() : Optional.of(standardCollateralAmount);
	}

	public SecuritiesFinancing10 setStandardCollateralAmount(AmountAndDirection5 standardCollateralAmount) {
		this.standardCollateralAmount = standardCollateralAmount;
		return this;
	}

	public Optional<YesNoIndicator> getAccruedInterestTax() {
		return accruedInterestTax == null ? Optional.empty() : Optional.of(accruedInterestTax);
	}

	public SecuritiesFinancing10 setAccruedInterestTax(YesNoIndicator accruedInterestTax) {
		this.accruedInterestTax = accruedInterestTax;
		return this;
	}

	public Optional<Max3Number> getEndNumberOfDaysAccrued() {
		return endNumberOfDaysAccrued == null ? Optional.empty() : Optional.of(endNumberOfDaysAccrued);
	}

	public SecuritiesFinancing10 setEndNumberOfDaysAccrued(Max3Number endNumberOfDaysAccrued) {
		this.endNumberOfDaysAccrued = endNumberOfDaysAccrued;
		return this;
	}

	public Optional<BaseOneRate> getEndFactor() {
		return endFactor == null ? Optional.empty() : Optional.of(endFactor);
	}

	public SecuritiesFinancing10 setEndFactor(BaseOneRate endFactor) {
		this.endFactor = endFactor;
		return this;
	}

	public Optional<SecuritiesLendingType1Choice> getSecuritiesLendingType() {
		return securitiesLendingType == null ? Optional.empty() : Optional.of(securitiesLendingType);
	}

	public SecuritiesFinancing10 setSecuritiesLendingType(SecuritiesLendingType1Choice securitiesLendingType) {
		this.securitiesLendingType = securitiesLendingType;
		return this;
	}

	public Optional<Reversible1Choice> getReversible() {
		return reversible == null ? Optional.empty() : Optional.of(reversible);
	}

	public SecuritiesFinancing10 setReversible(Reversible1Choice reversible) {
		this.reversible = reversible;
		return this;
	}

	public Optional<ISODate> getMinimumDateForCallBack() {
		return minimumDateForCallBack == null ? Optional.empty() : Optional.of(minimumDateForCallBack);
	}

	public SecuritiesFinancing10 setMinimumDateForCallBack(ISODate minimumDateForCallBack) {
		this.minimumDateForCallBack = minimumDateForCallBack;
		return this;
	}

	public Optional<YesNoIndicator> getRollOver() {
		return rollOver == null ? Optional.empty() : Optional.of(rollOver);
	}

	public SecuritiesFinancing10 setRollOver(YesNoIndicator rollOver) {
		this.rollOver = rollOver;
		return this;
	}

	public Optional<YesNoIndicator> getPeriodicPayment() {
		return periodicPayment == null ? Optional.empty() : Optional.of(periodicPayment);
	}

	public SecuritiesFinancing10 setPeriodicPayment(YesNoIndicator periodicPayment) {
		this.periodicPayment = periodicPayment;
		return this;
	}

	public Optional<YesNoIndicator> getExCoupon() {
		return exCoupon == null ? Optional.empty() : Optional.of(exCoupon);
	}

	public SecuritiesFinancing10 setExCoupon(YesNoIndicator exCoupon) {
		this.exCoupon = exCoupon;
		return this;
	}
}