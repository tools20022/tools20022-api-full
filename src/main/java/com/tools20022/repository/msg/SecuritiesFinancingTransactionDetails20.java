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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails20.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails20.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationDate
 * SecuritiesFinancingTransactionDetails20.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRateChangeDate
 * SecuritiesFinancingTransactionDetails20.mmRateChangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmEarliestCallBackDate
 * SecuritiesFinancingTransactionDetails20.mmEarliestCallBackDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmCommissionCalculationDate
 * SecuritiesFinancingTransactionDetails20.mmCommissionCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRateType
 * SecuritiesFinancingTransactionDetails20.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRevaluation
 * SecuritiesFinancingTransactionDetails20.mmRevaluation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmLegalFramework
 * SecuritiesFinancingTransactionDetails20.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmInterestComputationMethod
 * SecuritiesFinancingTransactionDetails20.mmInterestComputationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmMaturityDateModification
 * SecuritiesFinancingTransactionDetails20.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmInterestPayment
 * SecuritiesFinancingTransactionDetails20.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails20.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails20.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmStockLoanMargin
 * SecuritiesFinancingTransactionDetails20.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSecuritiesHaircut
 * SecuritiesFinancingTransactionDetails20.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmChargesRate
 * SecuritiesFinancingTransactionDetails20.mmChargesRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmPricingRate
 * SecuritiesFinancingTransactionDetails20.mmPricingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSpread
 * SecuritiesFinancingTransactionDetails20.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTransactionCallDelay
 * SecuritiesFinancingTransactionDetails20.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancingTransactionDetails20.mmTotalNumberOfCollateralInstructions
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmLocalBrokerCommission
 * SecuritiesFinancingTransactionDetails20.mmLocalBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmDealAmount
 * SecuritiesFinancingTransactionDetails20.mmDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmAccruedInterestAmount
 * SecuritiesFinancingTransactionDetails20.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmForfeitAmount
 * SecuritiesFinancingTransactionDetails20.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmPremiumAmount
 * SecuritiesFinancingTransactionDetails20.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationAmountPerPieceOfCollateral
 * SecuritiesFinancingTransactionDetails20.
 * mmTerminationAmountPerPieceOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails20.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSecondLegNarrative
 * SecuritiesFinancingTransactionDetails20.mmSecondLegNarrative}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionDetails20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * </ul>
 */
public class SecuritiesFinancingTransactionDetails20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text securitiesFinancingTradeIdentification;
	/**
	 * Unambiguous identification of the underlying securities financing trade
	 * as assigned by the instructing party. The identification is common to all
	 * collateral pieces (one or many).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text closingLegIdentification;
	/**
	 * Unambiguous identification of the second leg of the transaction as known
	 * by the account owner (or the instructing party acting on its behalf).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected TerminationDate3Choice terminationDate;
	/**
	 * Closing date/time or maturity date/time of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate3Choice
	 * TerminationDate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate3Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice rateChangeDate;
	/**
	 * Date/Time at which rate change has taken place.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
	 * SecuritiesFinancing.mmRateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice earliestCallBackDate;
	/**
	 * Earliest date/time at which the call back can take place.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEarliestCallBackDate
	 * SecuritiesFinancing.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstCallBckDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestCallBackDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date/time at which the call back can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestCallBackDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmEarliestCallBackDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "EarlstCallBckDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice commissionCalculationDate;
	/**
	 * Date/time at which the commission is calculated.
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCalculationDate
	 * Commission.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the commission is calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommissionCalculationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Commission.mmCalculationDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "ComssnClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionCalculationDate";
			definition = "Date/time at which the commission is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected RateType8Choice rateType;
	/**
	 * Specifies whether the rate is fixed or variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateType8Choice
	 * RateType8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateType8Choice.mmObject();
		}
	};
	protected RevaluationIndicator2Choice revaluation;
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice
	 * RevaluationIndicator2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
	 * SecuritiesFinancing.mmRevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "Rvaltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Revaluation";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RevaluationIndicator2Choice.mmObject();
		}
	};
	protected LegalFramework2Choice legalFramework;
	/**
	 * Legal framework of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice
	 * LegalFramework2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalFramework2Choice.mmObject();
		}
	};
	protected InterestComputationMethodFormat2Choice interestComputationMethod;
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice
	 * InterestComputationMethodFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "IntrstCmptnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestComputationMethod";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestComputationMethodFormat2Choice.mmObject();
		}
	};
	protected YesNoIndicator maturityDateModification;
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
	 * SecuritiesFinancing.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtMod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDateModification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmMaturityDateModification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator interestPayment;
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
	 * SecuritiesFinancing.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterestPayment;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected RateName2 variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.RateName2
	 * RateName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	 * "Index or support rate used together with the spread to calculate the\nrepurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariableRateSupport = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RateName2.mmObject();
		}
	};
	protected Rate2 repurchaseRate;
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRepurchaseRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 stockLoanMargin;
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
	 * SecuritiesFinancing.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	public static final MMMessageAttribute mmStockLoanMargin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 securitiesHaircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	public static final MMMessageAttribute mmSecuritiesHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 chargesRate;
	/**
	 * Interest rate paid in the context of a securities financing transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate paid in the context of a securities financing transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "ChrgsRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesRate";
			definition = "Interest rate paid in the context of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected RateOrName2Choice pricingRate;
	/**
	 * Interest rate to be paid on the transaction amount, as agreed between the
	 * counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateOrName2Choice
	 * RateOrName2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	public static final MMMessageAttribute mmPricingRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "PricgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingRate";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateOrName2Choice.mmObject();
		}
	};
	protected Rate2 spread;
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
	 * SecuritiesFinancing.mmRepurchaseSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseSpread;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Exact3NumericText transactionCallDelay;
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
	 * SecuritiesFinancing.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected Exact3NumericText totalNumberOfCollateralInstructions;
	/**
	 * Total number of collateral instructions involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancing.mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	 * "Total number of collateral instructions involved in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfCollateralInstructions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTotalNumberOfCollateralInstructions;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfCollInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Total number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected AmountAndDirection13 localBrokerCommission;
	/**
	 * Amount of commission paid to a local broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker#mmCommission
	 * Broker.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a local broker."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Broker.mmCommission;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 dealAmount;
	/**
	 * Principal amount of a trade (for second leg).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmDealAmount
	 * SecuritiesFinancing.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Principal amount of a trade (for second leg)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmDealAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "DealAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount";
			definition = "Principal amount of a trade (for second leg).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 forfeitAmount;
	/**
	 * Fixed amount of money that has to be paid (instead of interest) in the
	 * case of a recall or at the closing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmForfeitRepurchaseAmount
	 * SecuritiesFinancing.mmForfeitRepurchaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	public static final MMMessageAttribute mmForfeitAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmForfeitRepurchaseAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "FrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 premiumAmount;
	/**
	 * Difference between the amount of money of the first leg and the amount of
	 * the second leg of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmPremiumAmount
	 * SecuritiesFinancing.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
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
	public static final MMMessageAttribute mmPremiumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmPremiumAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the amount of money of the first leg and the amount of the second leg of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 terminationAmountPerPieceOfCollateral;
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnAmtPerPcOfColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPieceOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminationAmountPerPieceOfCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "TermntnAmtPerPcOfColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected AmountAndDirection13 terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminationTransactionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	protected RestrictedFINXMax140Text secondLegNarrative;
	/**
	 * Provides additional information about the second leg in narrative form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
	 * SecuritiesFinancingTransactionDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the second leg in narrative form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails20.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails20.mmSecuritiesFinancingTradeIdentification, SecuritiesFinancingTransactionDetails20.mmClosingLegIdentification,
						SecuritiesFinancingTransactionDetails20.mmTerminationDate, SecuritiesFinancingTransactionDetails20.mmRateChangeDate, SecuritiesFinancingTransactionDetails20.mmEarliestCallBackDate,
						SecuritiesFinancingTransactionDetails20.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails20.mmRateType, SecuritiesFinancingTransactionDetails20.mmRevaluation,
						SecuritiesFinancingTransactionDetails20.mmLegalFramework, SecuritiesFinancingTransactionDetails20.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails20.mmMaturityDateModification,
						SecuritiesFinancingTransactionDetails20.mmInterestPayment, SecuritiesFinancingTransactionDetails20.mmVariableRateSupport, SecuritiesFinancingTransactionDetails20.mmRepurchaseRate,
						SecuritiesFinancingTransactionDetails20.mmStockLoanMargin, SecuritiesFinancingTransactionDetails20.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails20.mmChargesRate,
						SecuritiesFinancingTransactionDetails20.mmPricingRate, SecuritiesFinancingTransactionDetails20.mmSpread, SecuritiesFinancingTransactionDetails20.mmTransactionCallDelay,
						SecuritiesFinancingTransactionDetails20.mmTotalNumberOfCollateralInstructions, SecuritiesFinancingTransactionDetails20.mmLocalBrokerCommission, SecuritiesFinancingTransactionDetails20.mmDealAmount,
						SecuritiesFinancingTransactionDetails20.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails20.mmForfeitAmount, SecuritiesFinancingTransactionDetails20.mmPremiumAmount,
						SecuritiesFinancingTransactionDetails20.mmTerminationAmountPerPieceOfCollateral, SecuritiesFinancingTransactionDetails20.mmTerminationTransactionAmount, SecuritiesFinancingTransactionDetails20.mmSecondLegNarrative);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesFinancingTransactionDetails20";
				definition = "Details of the closing of the securities financing transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification;
	}

	public void setSecuritiesFinancingTradeIdentification(RestrictedFINXMax16Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
	}

	public RestrictedFINXMax16Text getClosingLegIdentification() {
		return closingLegIdentification;
	}

	public void setClosingLegIdentification(RestrictedFINXMax16Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
	}

	public TerminationDate3Choice getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(TerminationDate3Choice terminationDate) {
		this.terminationDate = terminationDate;
	}

	public DateAndDateTimeChoice getRateChangeDate() {
		return rateChangeDate;
	}

	public void setRateChangeDate(DateAndDateTimeChoice rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
	}

	public DateAndDateTimeChoice getEarliestCallBackDate() {
		return earliestCallBackDate;
	}

	public void setEarliestCallBackDate(DateAndDateTimeChoice earliestCallBackDate) {
		this.earliestCallBackDate = earliestCallBackDate;
	}

	public DateAndDateTimeChoice getCommissionCalculationDate() {
		return commissionCalculationDate;
	}

	public void setCommissionCalculationDate(DateAndDateTimeChoice commissionCalculationDate) {
		this.commissionCalculationDate = commissionCalculationDate;
	}

	public RateType8Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType8Choice rateType) {
		this.rateType = rateType;
	}

	public RevaluationIndicator2Choice getRevaluation() {
		return revaluation;
	}

	public void setRevaluation(RevaluationIndicator2Choice revaluation) {
		this.revaluation = revaluation;
	}

	public LegalFramework2Choice getLegalFramework() {
		return legalFramework;
	}

	public void setLegalFramework(LegalFramework2Choice legalFramework) {
		this.legalFramework = legalFramework;
	}

	public InterestComputationMethodFormat2Choice getInterestComputationMethod() {
		return interestComputationMethod;
	}

	public void setInterestComputationMethod(InterestComputationMethodFormat2Choice interestComputationMethod) {
		this.interestComputationMethod = interestComputationMethod;
	}

	public YesNoIndicator getMaturityDateModification() {
		return maturityDateModification;
	}

	public void setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
	}

	public YesNoIndicator getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
	}

	public RateName2 getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(com.tools20022.repository.msg.RateName2 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	public Rate2 getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(com.tools20022.repository.msg.Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	public Rate2 getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(com.tools20022.repository.msg.Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	public Rate2 getSecuritiesHaircut() {
		return securitiesHaircut;
	}

	public void setSecuritiesHaircut(com.tools20022.repository.msg.Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
	}

	public Rate2 getChargesRate() {
		return chargesRate;
	}

	public void setChargesRate(com.tools20022.repository.msg.Rate2 chargesRate) {
		this.chargesRate = chargesRate;
	}

	public RateOrName2Choice getPricingRate() {
		return pricingRate;
	}

	public void setPricingRate(RateOrName2Choice pricingRate) {
		this.pricingRate = pricingRate;
	}

	public Rate2 getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.msg.Rate2 spread) {
		this.spread = spread;
	}

	public Exact3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Exact3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	public Exact3NumericText getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(Exact3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
	}

	public AmountAndDirection13 getLocalBrokerCommission() {
		return localBrokerCommission;
	}

	public void setLocalBrokerCommission(com.tools20022.repository.msg.AmountAndDirection13 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
	}

	public AmountAndDirection13 getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(com.tools20022.repository.msg.AmountAndDirection13 dealAmount) {
		this.dealAmount = dealAmount;
	}

	public AmountAndDirection13 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection13 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public AmountAndDirection13 getForfeitAmount() {
		return forfeitAmount;
	}

	public void setForfeitAmount(com.tools20022.repository.msg.AmountAndDirection13 forfeitAmount) {
		this.forfeitAmount = forfeitAmount;
	}

	public AmountAndDirection13 getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(com.tools20022.repository.msg.AmountAndDirection13 premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public AmountAndDirection13 getTerminationAmountPerPieceOfCollateral() {
		return terminationAmountPerPieceOfCollateral;
	}

	public void setTerminationAmountPerPieceOfCollateral(com.tools20022.repository.msg.AmountAndDirection13 terminationAmountPerPieceOfCollateral) {
		this.terminationAmountPerPieceOfCollateral = terminationAmountPerPieceOfCollateral;
	}

	public AmountAndDirection13 getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(com.tools20022.repository.msg.AmountAndDirection13 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}

	public RestrictedFINXMax140Text getSecondLegNarrative() {
		return secondLegNarrative;
	}

	public void setSecondLegNarrative(RestrictedFINXMax140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
	}
}