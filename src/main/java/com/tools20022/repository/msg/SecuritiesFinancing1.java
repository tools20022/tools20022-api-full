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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LegalFramework1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.SecuritiesFinancing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An agreement between two parties, a seller and a buyer, by which the seller
 * agrees at the time of the agreement to re-purchase the sold securities at an
 * agreed price. The two parts of the agreement are called the two "legs".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRateType
 * SecuritiesFinancing1.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmInterestComputationMethod
 * SecuritiesFinancing1.mmInterestComputationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRevaluationIndicator
 * SecuritiesFinancing1.mmRevaluationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSecondLegIdentification
 * SecuritiesFinancing1.mmSecondLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmIdentification
 * SecuritiesFinancing1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmVariableRateSupport
 * SecuritiesFinancing1.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTransactionCallDelay
 * SecuritiesFinancing1.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancing1.mmTotalNumberOfCollateralInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSecondLegNarrative
 * SecuritiesFinancing1.mmSecondLegNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRateChangeDateTime
 * SecuritiesFinancing1.mmRateChangeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationDateTime
 * SecuritiesFinancing1.mmTerminationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSecuritiesHaircut
 * SecuritiesFinancing1.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmStockLoanMargin
 * SecuritiesFinancing1.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRepurchase
 * SecuritiesFinancing1.mmRepurchase}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmPricing
 * SecuritiesFinancing1.mmPricing}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSpread
 * SecuritiesFinancing1.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmForfeitAmount
 * SecuritiesFinancing1.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmDealAmount
 * SecuritiesFinancing1.mmDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmAccruedInterestAmount
 * SecuritiesFinancing1.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationAmountPerPiecesOfCollateral
 * SecuritiesFinancing1.mmTerminationAmountPerPiecesOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmPremiumAmount
 * SecuritiesFinancing1.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmFinancingAgreement
 * SecuritiesFinancing1.mmFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmLegalFramework
 * SecuritiesFinancing1.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationTransactionAmount
 * SecuritiesFinancing1.mmTerminationTransactionAmount}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancing1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An agreement between two parties, a seller and a buyer, by which the seller agrees at the time of the agreement to re-purchase the sold securities at an agreed price. The two parts of the agreement are called the two \"legs\"."
 * </li>
 * </ul>
 */
public class SecuritiesFinancing1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateType3Choice rateType;
	/**
	 * Specifies whether the rate is fixed or variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateType3Choice
	 * RateType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmRateType;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateType3Choice.mmObject();
		}
	};
	protected InterestComputationMethod1Choice interestComputationMethod;
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice
	 * InterestComputationMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "IntrstCmptnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestComputationMethod";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestComputationMethod1Choice.mmObject();
		}
	};
	protected Revaluation1Choice revaluationIndicator;
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Revaluation1Choice
	 * Revaluation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
	 * SecuritiesFinancing.mmRevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvaltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevaluationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevaluationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmRevaluationIndicator;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "RvaltnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevaluationIndicator";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Revaluation1Choice.mmObject();
		}
	};
	protected Max35Text secondLegIdentification;
	/**
	 * Unique identification of the second part of the repurchase agreement.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the second part of the repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "ScndLegId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegIdentification";
			definition = "Unique identification of the second part of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique identification of the repurchase agreement.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmIdentification
	 * SecuritiesFinancing.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmIdentification;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateName1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmTotalNumberOfCollateralInstructions;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfCollInstrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Max140Text secondLegNarrative;
	/**
	 * Provides additional information about the second leg in narrative form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ISODateTime rateChangeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateChngDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateChangeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "RateChngDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDateTime";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TerminationDate1Choice terminationDateTime;
	/**
	 * Termination date/time or maturity date/time of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate1Choice
	 * TerminationDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Termination date/time or maturity date/time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationDateTime = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "TermntnDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDateTime";
			definition = "Termination date/time or maturity date/time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmHaircut;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 repurchase;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate used to calculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchase = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "Rp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repurchase";
			definition = "Repurchase rate used to calculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected RateOrName1Choice pricing;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pricg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate to be paid on the transaction amount, as agreed between the counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPricing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "Pricg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pricing";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateOrName1Choice.mmObject();
		}
	};
	protected SpreadRate1 spread;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	 * "Margin over or under an index that determines the repurchase rate, expressed as a rate or an amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpread = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Spread.mmSpreadRate;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Margin over or under an index that determines the repurchase rate, expressed as a rate or an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SpreadRate1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmForfeitRepurchaseAmount;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "FrftAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected AmountAndDirection5 dealAmount;
	/**
	 * Principal amount of a trade (for second leg).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmDealAmount
	 * SecuritiesFinancing.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	public static final MMMessageAssociationEnd mmDealAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmDealAmount;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "DealAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount";
			definition = "Principal amount of a trade (for second leg).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected AmountAndDirection5 accruedInterestAmount;
	/**
	 * Amount of interest that has been accrued in between two periods (for
	 * second leg).
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	 * "Amount of interest that has been accrued in between two periods (for second leg)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between two periods (for second leg).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected AmountAndDirection5 terminationAmountPerPiecesOfCollateral;
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnAmtPerPcsOfColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPiecesOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationAmountPerPiecesOfCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "TermntnAmtPerPcsOfColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationAmountPerPiecesOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmPremiumAmount;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the amount of money of the first leg and the amount of the second leg of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected Agreement1 financingAgreement;
	/**
	 * Provides contractual details of the two leg transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Agreement1 Agreement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
	 * SecuritiesFinancing.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	 * definition} = "Provides contractual details of the two leg transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancingAgreement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmFinancingAgreement;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "FincgAgrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides contractual details of the two leg transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Agreement1.mmObject();
		}
	};
	protected LegalFramework1Code legalFramework;
	/**
	 * Determines the legal framework of the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	 * definition} = "Determines the legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalFramework = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Determines the legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegalFramework1Code.mmObject();
		}
	};
	protected AmountAndDirection5 terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
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
	public static final MMMessageAssociationEnd mmTerminationTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> SecuritiesFinancing1.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing1.mmRateType, com.tools20022.repository.msg.SecuritiesFinancing1.mmInterestComputationMethod,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmRevaluationIndicator, com.tools20022.repository.msg.SecuritiesFinancing1.mmSecondLegIdentification,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmIdentification, com.tools20022.repository.msg.SecuritiesFinancing1.mmVariableRateSupport,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancing1.mmTotalNumberOfCollateralInstructions,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmSecondLegNarrative, com.tools20022.repository.msg.SecuritiesFinancing1.mmRateChangeDateTime,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationDateTime, com.tools20022.repository.msg.SecuritiesFinancing1.mmSecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancing1.mmStockLoanMargin,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmRepurchase, com.tools20022.repository.msg.SecuritiesFinancing1.mmPricing, com.tools20022.repository.msg.SecuritiesFinancing1.mmSpread,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancing1.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancing1.mmAccruedInterestAmount,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationAmountPerPiecesOfCollateral, com.tools20022.repository.msg.SecuritiesFinancing1.mmPremiumAmount,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmFinancingAgreement, com.tools20022.repository.msg.SecuritiesFinancing1.mmLegalFramework,
						com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationTransactionAmount);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesFinancing1";
				definition = "An agreement between two parties, a seller and a buyer, by which the seller agrees at the time of the agreement to re-purchase the sold securities at an agreed price. The two parts of the agreement are called the two \"legs\".";
			}
		});
		return mmObject_lazy.get();
	}

	public RateType3Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType3Choice rateType) {
		this.rateType = rateType;
	}

	public InterestComputationMethod1Choice getInterestComputationMethod() {
		return interestComputationMethod;
	}

	public void setInterestComputationMethod(InterestComputationMethod1Choice interestComputationMethod) {
		this.interestComputationMethod = interestComputationMethod;
	}

	public Revaluation1Choice getRevaluationIndicator() {
		return revaluationIndicator;
	}

	public void setRevaluationIndicator(Revaluation1Choice revaluationIndicator) {
		this.revaluationIndicator = revaluationIndicator;
	}

	public Max35Text getSecondLegIdentification() {
		return secondLegIdentification;
	}

	public void setSecondLegIdentification(Max35Text secondLegIdentification) {
		this.secondLegIdentification = secondLegIdentification;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public RateName1 getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(com.tools20022.repository.msg.RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	public Max3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Max3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	public Max3NumericText getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(Max3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
	}

	public Max140Text getSecondLegNarrative() {
		return secondLegNarrative;
	}

	public void setSecondLegNarrative(Max140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
	}

	public ISODateTime getRateChangeDateTime() {
		return rateChangeDateTime;
	}

	public void setRateChangeDateTime(ISODateTime rateChangeDateTime) {
		this.rateChangeDateTime = rateChangeDateTime;
	}

	public TerminationDate1Choice getTerminationDateTime() {
		return terminationDateTime;
	}

	public void setTerminationDateTime(TerminationDate1Choice terminationDateTime) {
		this.terminationDateTime = terminationDateTime;
	}

	public Rate2 getSecuritiesHaircut() {
		return securitiesHaircut;
	}

	public void setSecuritiesHaircut(com.tools20022.repository.msg.Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
	}

	public Rate2 getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(com.tools20022.repository.msg.Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	public Rate2 getRepurchase() {
		return repurchase;
	}

	public void setRepurchase(com.tools20022.repository.msg.Rate2 repurchase) {
		this.repurchase = repurchase;
	}

	public RateOrName1Choice getPricing() {
		return pricing;
	}

	public void setPricing(RateOrName1Choice pricing) {
		this.pricing = pricing;
	}

	public SpreadRate1 getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.msg.SpreadRate1 spread) {
		this.spread = spread;
	}

	public AmountAndDirection5 getForfeitAmount() {
		return forfeitAmount;
	}

	public void setForfeitAmount(com.tools20022.repository.msg.AmountAndDirection5 forfeitAmount) {
		this.forfeitAmount = forfeitAmount;
	}

	public AmountAndDirection5 getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(com.tools20022.repository.msg.AmountAndDirection5 dealAmount) {
		this.dealAmount = dealAmount;
	}

	public AmountAndDirection5 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection5 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public AmountAndDirection5 getTerminationAmountPerPiecesOfCollateral() {
		return terminationAmountPerPiecesOfCollateral;
	}

	public void setTerminationAmountPerPiecesOfCollateral(com.tools20022.repository.msg.AmountAndDirection5 terminationAmountPerPiecesOfCollateral) {
		this.terminationAmountPerPiecesOfCollateral = terminationAmountPerPiecesOfCollateral;
	}

	public AmountAndDirection5 getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(com.tools20022.repository.msg.AmountAndDirection5 premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Agreement1 getFinancingAgreement() {
		return financingAgreement;
	}

	public void setFinancingAgreement(com.tools20022.repository.msg.Agreement1 financingAgreement) {
		this.financingAgreement = financingAgreement;
	}

	public LegalFramework1Code getLegalFramework() {
		return legalFramework;
	}

	public void setLegalFramework(LegalFramework1Code legalFramework) {
		this.legalFramework = legalFramework;
	}

	public AmountAndDirection5 getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(com.tools20022.repository.msg.AmountAndDirection5 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}
}