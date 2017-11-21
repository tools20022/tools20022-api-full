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
import com.tools20022.repository.codeset.LegalFramework1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesFinancing10", propOrder = {"rateChangeDate", "rateType", "revaluation", "legalFramework", "interestComputationMethod", "variableRateSupport", "repurchaseRate", "stockLoanMargin", "securitiesHaircut",
		"pricingRate", "spreadRate", "callableTradeIndicator", "transactionCallDelay", "accruedInterestAmount", "accruedInterestPercentage", "forfeitAmount", "premiumAmount", "closingAmountPerPiecesOfCollateral",
		"totalNumberOfCollateralInstructions", "financingAgreement", "lendingTransactionMethod", "lendingWithCollateral", "borrowingReason", "collateralType", "contractTermsModificationChanged", "interestRate", "borrowingRate",
		"standardCollateralRatio", "dividendRatio", "numberOfDaysLendingBorrowing", "standardCollateralAmount", "accruedInterestTax", "endNumberOfDaysAccrued", "endFactor", "securitiesLendingType", "reversible", "minimumDateForCallBack",
		"rollOver", "periodicPayment", "exCoupon"})
public class SecuritiesFinancing10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime rateChangeDate;
	/**
	 * Date/Time at which rate change has taken place.
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
	public static final MMMessageAttribute mmRateChangeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected RateType19Choice rateType;
	/**
	 * Specifies whether the rate is fixed or variable.
	 * <p>
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
	public static final MMMessageAttribute mmRateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateType19Choice.mmObject();
		}
	};
	protected Revaluation2Choice revaluation;
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
	 * <p>
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
	public static final MMMessageAttribute mmRevaluation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRevaluationIndicator;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "Rvaltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Revaluation";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Revaluation2Choice.mmObject();
		}
	};
	protected LegalFramework1Code legalFramework;
	/**
	 * Legal framework of the transaction.
	 * <p>
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
	public static final MMMessageAttribute mmLegalFramework = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegalFramework1Code.mmObject();
		}
	};
	protected InterestComputationMethod2Choice interestComputationMethod;
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
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
	public static final MMMessageAttribute mmInterestComputationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "IntrstCmptnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestComputationMethod";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestComputationMethod2Choice.mmObject();
		}
	};
	protected RateName1 variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 * <p>
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
	public static final MMMessageAssociationEnd mmVariableRateSupport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateName1.mmObject();
		}
	};
	protected Rate2 repurchaseRate;
	/**
	 * Repurchase rate used to calculate the repurchase amount.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRepurchaseRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate used to calculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 stockLoanMargin;
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 * <p>
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
	public static final MMMessageAssociationEnd mmStockLoanMargin = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 securitiesHaircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSecuritiesHaircut = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected RateOrName1Choice pricingRate;
	/**
	 * Interest rate to be paid on the transaction amount, as agreed between the
	 * counterparties.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPricingRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
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
	};
	protected SpreadRate1 spreadRate;
	/**
	 * Margin over or under an index that determines the repurchase rate,
	 * expressed as a rate or an amount.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSpreadRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Spread.mmSpreadRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SprdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index that determines the repurchase rate, expressed as a rate or an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SpreadRate1.mmObject();
		}
	};
	protected YesNoIndicator callableTradeIndicator;
	/**
	 * Indicates whether or not the trade is callable.
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
	public static final MMMessageAttribute mmCallableTradeIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmCallableTradeIndicator;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CllblTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableTradeIndicator";
			definition = "Indicates whether or not the trade is callable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max3NumericText transactionCallDelay;
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionCallDelay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected AmountAndDirection5 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between two periods, for example, in
	 * between interest payment periods.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between two periods, for example, in between interest payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected PercentageRate accruedInterestPercentage;
	/**
	 * Interest rate that has been accrued in between coupon payment periods.
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
	public static final MMMessageAttribute mmAccruedInterestPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestPercentage";
			definition = "Interest rate that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected AmountAndDirection5 forfeitAmount;
	/**
	 * Fixed amount of money that has to be paid (instead of interest) in the
	 * case of a recall or at the closing date.
	 * <p>
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
	public static final MMMessageAssociationEnd mmForfeitAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmForfeitRepurchaseAmount;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "FrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected AmountAndDirection5 premiumAmount;
	/**
	 * Difference between the amount of money of the first leg and the amount of
	 * the second leg of the transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPremiumAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmPremiumAmount;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the amount of money of the first leg and the amount of the second leg of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected AmountAndDirection5 closingAmountPerPiecesOfCollateral;
	/**
	 * Amount of money to be settled per piece of collateral to close the
	 * transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmClosingAmountPerPiecesOfCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "ClsgAmtPerPcsOfColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingAmountPerPiecesOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to close the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected Max3NumericText totalNumberOfCollateralInstructions;
	/**
	 * Indicates the total Number of collateral instructions involved in the
	 * transaction.
	 * <p>
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
	public static final MMMessageAttribute mmTotalNumberOfCollateralInstructions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTotalNumberOfCollateralInstructions;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfCollInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Agreement3 financingAgreement;
	/**
	 * Provides details for the securities financing transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmFinancingAgreement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmFinancingAgreement;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "FincgAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides details for the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
		}
	};
	protected LendingTransactionMethod1Choice lendingTransactionMethod;
	/**
	 * Method applied to a lending transaction.
	 * <p>
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
	public static final MMMessageAttribute mmLendingTransactionMethod = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LndgTxMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Method applied to a lending transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LendingTransactionMethod1Choice.mmObject();
		}
	};
	protected YesNoIndicator lendingWithCollateral;
	/**
	 * Indicates if the contract is with or without an exchange of collateral.
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
	public static final MMMessageAttribute mmLendingWithCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmLendingWithCollateral;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "LndgWthColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingWithCollateral";
			definition = "Indicates if the contract is with or without an exchange of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BorrowingReason1Choice borrowingReason;
	/**
	 * Identifies the underlying reason for the borrowing, for instance, sale on
	 * my behalf or on behalf of a third party.
	 * <p>
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
	public static final MMMessageAttribute mmBorrowingReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "BrrwgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReason";
			definition = "Identifies the underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BorrowingReason1Choice.mmObject();
		}
	};
	protected CollateralType1Choice collateralType;
	/**
	 * Indicates the type of collateral, for insatnce, security, bond, etc.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Indicates the type of collateral, for insatnce, security, bond, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CollateralType1Choice.mmObject();
		}
	};
	protected YesNoIndicator contractTermsModificationChanged;
	/**
	 * Indicates whether or not the contract terms changed.
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
	public static final MMMessageAttribute mmContractTermsModificationChanged = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "CtrctTermsModChngd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractTermsModificationChanged";
			definition = "Indicates whether or not the contract terms changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Rate2 interestRate;
	/**
	 * Interest rate to be paid as agreed between the counterparties.
	 * <p>
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
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Interest rate to be paid as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 borrowingRate;
	/**
	 * Rate to be paid by the Borrower to the Lender for the securities
	 * borrowed.
	 * <p>
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
	public static final MMMessageAttribute mmBorrowingRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "BrrwgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingRate";
			definition = "Rate to be paid by the Borrower to the Lender for the securities borrowed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 standardCollateralRatio;
	/**
	 * Method used to calculate the standard collateral amount.
	 * <p>
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
	public static final MMMessageAttribute mmStandardCollateralRatio = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StdCollRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralRatio";
			definition = "Method used to calculate the standard collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 dividendRatio;
	/**
	 * Percentage of earnings paid to shareholders in dividends.
	 * <p>
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
	public static final MMMessageAttribute mmDividendRatio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmRate;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "DvddRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Number21Choice numberOfDaysLendingBorrowing;
	/**
	 * Number of days the securities are lent or borrowed where the contract has
	 * an agreed closing date.
	 * <p>
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
	public static final MMMessageAttribute mmNumberOfDaysLendingBorrowing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmNumberOfDaysLendingBorrowing;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysLndgBrrwg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysLendingBorrowing";
			definition = "Number of days the securities are lent or borrowed where the contract has an agreed closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number21Choice.mmObject();
		}
	};
	protected AmountAndDirection5 standardCollateralAmount;
	/**
	 * Specifies the standard collateral amount.
	 * <p>
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
	public static final MMMessageAttribute mmStandardCollateralAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "StdCollAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralAmount";
			definition = "Specifies the standard collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected YesNoIndicator accruedInterestTax;
	/**
	 * Interest rate tax that has been accrued in between coupon payment
	 * periods.
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
	public static final MMMessageAttribute mmAccruedInterestTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestTax;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax";
			definition = "Interest rate tax that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max3Number endNumberOfDaysAccrued;
	/**
	 * Number of days accrued at the instant of closing trade.
	 * <p>
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
	public static final MMMessageAttribute mmEndNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "EndNbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndNumberOfDaysAccrued";
			definition = "Number of days accrued at the instant of closing trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected BaseOneRate endFactor;
	/**
	 * End ratio of principal outstanding to the original balance.
	 * <p>
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
	public static final MMMessageAttribute mmEndFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "EndFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndFactor";
			definition = "End ratio of principal outstanding to the original balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected SecuritiesLendingType1Choice securitiesLendingType;
	/**
	 * Type of securities lending.
	 * <p>
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
	public static final MMMessageAttribute mmSecuritiesLendingType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "SctiesLndgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingType";
			definition = "Type of securities lending.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesLendingType1Choice.mmObject();
		}
	};
	protected Reversible1Choice reversible;
	/**
	 * Indicates the possibility to terminate the securitiesc lending contract
	 * either by the borrower or lender before the expiration date.
	 * <p>
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
	public static final MMMessageAttribute mmReversible = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesLending.mmObject();
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "Rvsbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversible";
			definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Reversible1Choice.mmObject();
		}
	};
	protected ISODate minimumDateForCallBack;
	/**
	 * This is the minimum date at which the Borrower is allowed to give back
	 * the securities.
	 * <p>
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
	public static final MMMessageAttribute mmMinimumDateForCallBack = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmMinimumDateForCallBack;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "MinDtForCallBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDateForCallBack";
			definition = "This is the minimum date at which the Borrower is allowed to give back the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator rollOver;
	/**
	 * Indicates that the contract can be rolled over.
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
	public static final MMMessageAttribute mmRollOver = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmRollover;
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "RollOver";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollOver";
			definition = "Indicates that the contract can be rolled over.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator periodicPayment;
	/**
	 * Indicates whether the securities lending fees can be paid periodically or
	 * at the end of the contract.
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
	public static final MMMessageAttribute mmPeriodicPayment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "PrdcPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodicPayment";
			definition = "Indicates whether the securities lending fees can be paid periodically or at the end of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator exCoupon;
	/**
	 * Indicates whether the trade is executed ex coupon.
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
	public static final MMMessageAttribute mmExCoupon = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancing10.mmObject();
			isDerived = false;
			xmlTag = "ExCpn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			definition = "Indicates whether the trade is executed ex coupon.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmRateChangeDate, SecuritiesFinancing10.mmRateType, SecuritiesFinancing10.mmRevaluation, SecuritiesFinancing10.mmLegalFramework,
						SecuritiesFinancing10.mmInterestComputationMethod, SecuritiesFinancing10.mmVariableRateSupport, SecuritiesFinancing10.mmRepurchaseRate, SecuritiesFinancing10.mmStockLoanMargin,
						SecuritiesFinancing10.mmSecuritiesHaircut, SecuritiesFinancing10.mmPricingRate, SecuritiesFinancing10.mmSpreadRate, SecuritiesFinancing10.mmCallableTradeIndicator, SecuritiesFinancing10.mmTransactionCallDelay,
						SecuritiesFinancing10.mmAccruedInterestAmount, SecuritiesFinancing10.mmAccruedInterestPercentage, SecuritiesFinancing10.mmForfeitAmount, SecuritiesFinancing10.mmPremiumAmount,
						SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral, SecuritiesFinancing10.mmTotalNumberOfCollateralInstructions, SecuritiesFinancing10.mmFinancingAgreement, SecuritiesFinancing10.mmLendingTransactionMethod,
						SecuritiesFinancing10.mmLendingWithCollateral, SecuritiesFinancing10.mmBorrowingReason, SecuritiesFinancing10.mmCollateralType, SecuritiesFinancing10.mmContractTermsModificationChanged,
						SecuritiesFinancing10.mmInterestRate, SecuritiesFinancing10.mmBorrowingRate, SecuritiesFinancing10.mmStandardCollateralRatio, SecuritiesFinancing10.mmDividendRatio,
						SecuritiesFinancing10.mmNumberOfDaysLendingBorrowing, SecuritiesFinancing10.mmStandardCollateralAmount, SecuritiesFinancing10.mmAccruedInterestTax, SecuritiesFinancing10.mmEndNumberOfDaysAccrued,
						SecuritiesFinancing10.mmEndFactor, SecuritiesFinancing10.mmSecuritiesLendingType, SecuritiesFinancing10.mmReversible, SecuritiesFinancing10.mmMinimumDateForCallBack, SecuritiesFinancing10.mmRollOver,
						SecuritiesFinancing10.mmPeriodicPayment, SecuritiesFinancing10.mmExCoupon);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancing10";
				definition = "Details of the closing of the securities financing transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RateChngDt")
	public ISODateTime getRateChangeDate() {
		return rateChangeDate;
	}

	public void setRateChangeDate(ISODateTime rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
	}

	@XmlElement(name = "RateTp")
	public RateType19Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType19Choice rateType) {
		this.rateType = rateType;
	}

	@XmlElement(name = "Rvaltn")
	public Revaluation2Choice getRevaluation() {
		return revaluation;
	}

	public void setRevaluation(Revaluation2Choice revaluation) {
		this.revaluation = revaluation;
	}

	@XmlElement(name = "LglFrmwk")
	public LegalFramework1Code getLegalFramework() {
		return legalFramework;
	}

	public void setLegalFramework(LegalFramework1Code legalFramework) {
		this.legalFramework = legalFramework;
	}

	@XmlElement(name = "IntrstCmptnMtd")
	public InterestComputationMethod2Choice getInterestComputationMethod() {
		return interestComputationMethod;
	}

	public void setInterestComputationMethod(InterestComputationMethod2Choice interestComputationMethod) {
		this.interestComputationMethod = interestComputationMethod;
	}

	@XmlElement(name = "VarblRateSpprt")
	public RateName1 getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(com.tools20022.repository.msg.RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	@XmlElement(name = "RpRate")
	public Rate2 getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(com.tools20022.repository.msg.Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	@XmlElement(name = "StockLnMrgn")
	public Rate2 getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(com.tools20022.repository.msg.Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	@XmlElement(name = "SctiesHrcut")
	public Rate2 getSecuritiesHaircut() {
		return securitiesHaircut;
	}

	public void setSecuritiesHaircut(com.tools20022.repository.msg.Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
	}

	@XmlElement(name = "PricgRate")
	public RateOrName1Choice getPricingRate() {
		return pricingRate;
	}

	public void setPricingRate(RateOrName1Choice pricingRate) {
		this.pricingRate = pricingRate;
	}

	@XmlElement(name = "SprdRate")
	public SpreadRate1 getSpreadRate() {
		return spreadRate;
	}

	public void setSpreadRate(com.tools20022.repository.msg.SpreadRate1 spreadRate) {
		this.spreadRate = spreadRate;
	}

	@XmlElement(name = "CllblTradInd")
	public YesNoIndicator getCallableTradeIndicator() {
		return callableTradeIndicator;
	}

	public void setCallableTradeIndicator(YesNoIndicator callableTradeIndicator) {
		this.callableTradeIndicator = callableTradeIndicator;
	}

	@XmlElement(name = "TxCallDely")
	public Max3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Max3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection5 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection5 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "AcrdIntrstPctg")
	public PercentageRate getAccruedInterestPercentage() {
		return accruedInterestPercentage;
	}

	public void setAccruedInterestPercentage(PercentageRate accruedInterestPercentage) {
		this.accruedInterestPercentage = accruedInterestPercentage;
	}

	@XmlElement(name = "FrftAmt")
	public AmountAndDirection5 getForfeitAmount() {
		return forfeitAmount;
	}

	public void setForfeitAmount(com.tools20022.repository.msg.AmountAndDirection5 forfeitAmount) {
		this.forfeitAmount = forfeitAmount;
	}

	@XmlElement(name = "PrmAmt")
	public AmountAndDirection5 getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(com.tools20022.repository.msg.AmountAndDirection5 premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	@XmlElement(name = "ClsgAmtPerPcsOfColl")
	public AmountAndDirection5 getClosingAmountPerPiecesOfCollateral() {
		return closingAmountPerPiecesOfCollateral;
	}

	public void setClosingAmountPerPiecesOfCollateral(com.tools20022.repository.msg.AmountAndDirection5 closingAmountPerPiecesOfCollateral) {
		this.closingAmountPerPiecesOfCollateral = closingAmountPerPiecesOfCollateral;
	}

	@XmlElement(name = "TtlNbOfCollInstrs")
	public Max3NumericText getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(Max3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
	}

	@XmlElement(name = "FincgAgrmt")
	public Agreement3 getFinancingAgreement() {
		return financingAgreement;
	}

	public void setFinancingAgreement(com.tools20022.repository.msg.Agreement3 financingAgreement) {
		this.financingAgreement = financingAgreement;
	}

	@XmlElement(name = "LndgTxMtd")
	public LendingTransactionMethod1Choice getLendingTransactionMethod() {
		return lendingTransactionMethod;
	}

	public void setLendingTransactionMethod(LendingTransactionMethod1Choice lendingTransactionMethod) {
		this.lendingTransactionMethod = lendingTransactionMethod;
	}

	@XmlElement(name = "LndgWthColl")
	public YesNoIndicator getLendingWithCollateral() {
		return lendingWithCollateral;
	}

	public void setLendingWithCollateral(YesNoIndicator lendingWithCollateral) {
		this.lendingWithCollateral = lendingWithCollateral;
	}

	@XmlElement(name = "BrrwgRsn")
	public BorrowingReason1Choice getBorrowingReason() {
		return borrowingReason;
	}

	public void setBorrowingReason(BorrowingReason1Choice borrowingReason) {
		this.borrowingReason = borrowingReason;
	}

	@XmlElement(name = "CollTp")
	public CollateralType1Choice getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralType1Choice collateralType) {
		this.collateralType = collateralType;
	}

	@XmlElement(name = "CtrctTermsModChngd")
	public YesNoIndicator getContractTermsModificationChanged() {
		return contractTermsModificationChanged;
	}

	public void setContractTermsModificationChanged(YesNoIndicator contractTermsModificationChanged) {
		this.contractTermsModificationChanged = contractTermsModificationChanged;
	}

	@XmlElement(name = "IntrstRate")
	public Rate2 getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(com.tools20022.repository.msg.Rate2 interestRate) {
		this.interestRate = interestRate;
	}

	@XmlElement(name = "BrrwgRate")
	public Rate2 getBorrowingRate() {
		return borrowingRate;
	}

	public void setBorrowingRate(com.tools20022.repository.msg.Rate2 borrowingRate) {
		this.borrowingRate = borrowingRate;
	}

	@XmlElement(name = "StdCollRatio")
	public Rate2 getStandardCollateralRatio() {
		return standardCollateralRatio;
	}

	public void setStandardCollateralRatio(com.tools20022.repository.msg.Rate2 standardCollateralRatio) {
		this.standardCollateralRatio = standardCollateralRatio;
	}

	@XmlElement(name = "DvddRatio")
	public Rate2 getDividendRatio() {
		return dividendRatio;
	}

	public void setDividendRatio(com.tools20022.repository.msg.Rate2 dividendRatio) {
		this.dividendRatio = dividendRatio;
	}

	@XmlElement(name = "NbOfDaysLndgBrrwg")
	public Number21Choice getNumberOfDaysLendingBorrowing() {
		return numberOfDaysLendingBorrowing;
	}

	public void setNumberOfDaysLendingBorrowing(Number21Choice numberOfDaysLendingBorrowing) {
		this.numberOfDaysLendingBorrowing = numberOfDaysLendingBorrowing;
	}

	@XmlElement(name = "StdCollAmt")
	public AmountAndDirection5 getStandardCollateralAmount() {
		return standardCollateralAmount;
	}

	public void setStandardCollateralAmount(com.tools20022.repository.msg.AmountAndDirection5 standardCollateralAmount) {
		this.standardCollateralAmount = standardCollateralAmount;
	}

	@XmlElement(name = "AcrdIntrstTax")
	public YesNoIndicator getAccruedInterestTax() {
		return accruedInterestTax;
	}

	public void setAccruedInterestTax(YesNoIndicator accruedInterestTax) {
		this.accruedInterestTax = accruedInterestTax;
	}

	@XmlElement(name = "EndNbOfDaysAcrd")
	public Max3Number getEndNumberOfDaysAccrued() {
		return endNumberOfDaysAccrued;
	}

	public void setEndNumberOfDaysAccrued(Max3Number endNumberOfDaysAccrued) {
		this.endNumberOfDaysAccrued = endNumberOfDaysAccrued;
	}

	@XmlElement(name = "EndFctr")
	public BaseOneRate getEndFactor() {
		return endFactor;
	}

	public void setEndFactor(BaseOneRate endFactor) {
		this.endFactor = endFactor;
	}

	@XmlElement(name = "SctiesLndgTp")
	public SecuritiesLendingType1Choice getSecuritiesLendingType() {
		return securitiesLendingType;
	}

	public void setSecuritiesLendingType(SecuritiesLendingType1Choice securitiesLendingType) {
		this.securitiesLendingType = securitiesLendingType;
	}

	@XmlElement(name = "Rvsbl")
	public Reversible1Choice getReversible() {
		return reversible;
	}

	public void setReversible(Reversible1Choice reversible) {
		this.reversible = reversible;
	}

	@XmlElement(name = "MinDtForCallBck")
	public ISODate getMinimumDateForCallBack() {
		return minimumDateForCallBack;
	}

	public void setMinimumDateForCallBack(ISODate minimumDateForCallBack) {
		this.minimumDateForCallBack = minimumDateForCallBack;
	}

	@XmlElement(name = "RollOver")
	public YesNoIndicator getRollOver() {
		return rollOver;
	}

	public void setRollOver(YesNoIndicator rollOver) {
		this.rollOver = rollOver;
	}

	@XmlElement(name = "PrdcPmt")
	public YesNoIndicator getPeriodicPayment() {
		return periodicPayment;
	}

	public void setPeriodicPayment(YesNoIndicator periodicPayment) {
		this.periodicPayment = periodicPayment;
	}

	@XmlElement(name = "ExCpn")
	public YesNoIndicator getExCoupon() {
		return exCoupon;
	}

	public void setExCoupon(YesNoIndicator exCoupon) {
		this.exCoupon = exCoupon;
	}
}