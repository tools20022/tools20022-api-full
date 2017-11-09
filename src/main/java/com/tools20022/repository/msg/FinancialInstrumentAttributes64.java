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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Elements characterising a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPlaceOfListing
 * FinancialInstrumentAttributes64.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDayCountBasis
 * FinancialInstrumentAttributes64.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmRegistrationForm
 * FinancialInstrumentAttributes64.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPaymentFrequency
 * FinancialInstrumentAttributes64.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPaymentStatus
 * FinancialInstrumentAttributes64.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmVariableRateChangeFrequency
 * FinancialInstrumentAttributes64.mmVariableRateChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmClassificationType
 * FinancialInstrumentAttributes64.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmOptionStyle
 * FinancialInstrumentAttributes64.mmOptionStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmOptionType
 * FinancialInstrumentAttributes64.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDenominationCurrency
 * FinancialInstrumentAttributes64.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCouponDate
 * FinancialInstrumentAttributes64.mmCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExpiryDate
 * FinancialInstrumentAttributes64.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmFloatingRateFixingDate
 * FinancialInstrumentAttributes64.mmFloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMaturityDate
 * FinancialInstrumentAttributes64.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmIssueDate
 * FinancialInstrumentAttributes64.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextCallableDate
 * FinancialInstrumentAttributes64.mmNextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPutableDate
 * FinancialInstrumentAttributes64.mmPutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDatedDate
 * FinancialInstrumentAttributes64.mmDatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmFirstPaymentDate
 * FinancialInstrumentAttributes64.mmFirstPaymentDate}</li>
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmInterestRate
 * FinancialInstrumentAttributes64.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmYieldToMaturityRate
 * FinancialInstrumentAttributes64.mmYieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextInterestRate
 * FinancialInstrumentAttributes64.mmNextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmIndexRateBasis
 * FinancialInstrumentAttributes64.mmIndexRateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCouponAttachedNumber
 * FinancialInstrumentAttributes64.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPoolNumber
 * FinancialInstrumentAttributes64.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmVariableRateIndicator
 * FinancialInstrumentAttributes64.mmVariableRateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmCallableIndicator
 * FinancialInstrumentAttributes64.mmCallableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPutableIndicator
 * FinancialInstrumentAttributes64.mmPutableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMarketOrIndicativePrice
 * FinancialInstrumentAttributes64.mmMarketOrIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExercisePrice
 * FinancialInstrumentAttributes64.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmSubscriptionPrice
 * FinancialInstrumentAttributes64.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmConversionPrice
 * FinancialInstrumentAttributes64.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmStrikePrice
 * FinancialInstrumentAttributes64.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMinimumNominalQuantity
 * FinancialInstrumentAttributes64.mmMinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmContractSize
 * FinancialInstrumentAttributes64.mmContractSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmUnderlyingFinancialInstrumentIdentification
 * FinancialInstrumentAttributes64.mmUnderlyingFinancialInstrumentIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmFinancialInstrumentAttributeAdditionalDetails
 * FinancialInstrumentAttributes64.
 * mmFinancialInstrumentAttributeAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionInstructionV06.mmFinancialInstrumentAttributes
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionConfirmationV06.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmFinancialInstrumentAttributes
 * SecuritiesFinancingInstructionV06.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionReversalAdviceV05.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmationV06.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionAllegementNotificationV05.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmFinancialInstrumentAttributes
 * SecuritiesFinancingInstructionV07.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionAllegementNotificationV06.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionReversalAdviceV06.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmationV07.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionInstructionV07.mmFinancialInstrumentAttributes
 * }</li>
 * </ul>
 * </li>
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
 * "FinancialInstrumentAttributes64"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements characterising a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
 * FinancialInstrumentAttributes35}</li>
 * </ul>
 */
public class FinancialInstrumentAttributes64 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MarketIdentification3Choice placeOfListing;
	/**
	 * Market(s) on which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
	 * MarketIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPlaceOfListing
	 * FinancialInstrumentAttributes35.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
		}
	};
	protected InterestComputationMethodFormat4Choice dayCountBasis;
	/**
	 * Specifies the computation method of (accrued) interest of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice
	 * InterestComputationMethodFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDayCountBasis
	 * FinancialInstrumentAttributes35.mmDayCountBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDayCountBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmDayCountBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat4Choice.mmObject();
		}
	};
	protected FormOfSecurity6Choice registrationForm;
	/**
	 * Specifies the form, this is, ownership, of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity6Choice
	 * FormOfSecurity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, this is, ownership, of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmRegistrationForm
	 * FinancialInstrumentAttributes35.mmRegistrationForm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationForm = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "RegnForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, this is, ownership, of the security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmRegistrationForm;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FormOfSecurity6Choice.mmObject();
		}
	};
	protected Frequency23Choice paymentFrequency;
	/**
	 * Specifies the frequency of an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency23Choice
	 * Frequency23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
	 * InterestCalculation.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPaymentFrequency
	 * FinancialInstrumentAttributes35.mmPaymentFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentFrequency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmPaymentFrequency;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPaymentFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency23Choice.mmObject();
		}
	};
	protected SecuritiesPaymentStatus5Choice paymentStatus;
	/**
	 * Status of payment of a security at a particular time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus5Choice
	 * SecuritiesPaymentStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPaymentStatus
	 * FinancialInstrumentAttributes35.mmPaymentStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPaymentStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesPaymentStatus5Choice.mmObject();
		}
	};
	protected Frequency23Choice variableRateChangeFrequency;
	/**
	 * Specifies the frequency of change to the variable rate of an interest
	 * bearing instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency23Choice
	 * Frequency23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateChangeFrequency
	 * VariableInterest.mmVariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateChngFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmVariableRateChangeFrequency
	 * FinancialInstrumentAttributes35.mmVariableRateChangeFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariableRateChangeFrequency = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmVariableRateChangeFrequency;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "VarblRateChngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmVariableRateChangeFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency23Choice.mmObject();
		}
	};
	protected ClassificationType32Choice classificationType;
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification, for example,
	 * common share with voting rights, fully paid, or registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice
	 * ClassificationType32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmClassificationType
	 * FinancialInstrumentAttributes35.mmClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClassificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmClassificationType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType32Choice.mmObject();
		}
	};
	protected OptionStyle8Choice optionStyle;
	/**
	 * Specifies how an option can be exercised (American, European, Bermudan)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionStyle8Choice
	 * OptionStyle8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmOptionStyle
	 * FinancialInstrumentAttributes35.mmOptionStyle}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionStyle = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmOptionStyle;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle8Choice.mmObject();
		}
	};
	protected OptionType6Choice optionType;
	/**
	 * Specifies whether it is a Call option (right to purchase a specific
	 * underlying asset) or a Put option (right to sell a specific underlying
	 * asset).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionType6Choice
	 * OptionType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmOptionType
	 * FinancialInstrumentAttributes35.mmOptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmOptionType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionType6Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode denominationCurrency;
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDenominationCurrency
	 * FinancialInstrumentAttributes35.mmDenominationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmDenominationCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ISODate couponDate;
	/**
	 * Next payment date of an interest bearing financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmDate
	 * CouponAttached.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCouponDate
	 * FinancialInstrumentAttributes35.mmCouponDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "CpnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmCouponDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate expiryDate;
	/**
	 * Date on which a privilege expires.
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a privilege expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmExpiryDate
	 * FinancialInstrumentAttributes35.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate floatingRateFixingDate;
	/**
	 * Date at which the interest rate of an interest bearing security will be
	 * calculated and reset, according to the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes35.mmFloatingRateFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloatingRateFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmFloatingRateFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Planned final repayment date at the time of issuance.
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmMaturityDate
	 * FinancialInstrumentAttributes35.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * Date at which the security was made available.
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the security was made available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmIssueDate
	 * FinancialInstrumentAttributes35.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date at which the security was made available.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate nextCallableDate;
	/**
	 * Next date at which the issuer has the right to pay the security prior to
	 * maturity.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
	 * Debt.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Next date at which the issuer has the right to pay the security prior to maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextCallableDate
	 * FinancialInstrumentAttributes35.mmNextCallableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date at which the issuer has the right to pay the security prior to maturity.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmNextCallableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate putableDate;
	/**
	 * Date at which the holder has the right to ask for redemption of the
	 * security prior to final maturity.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
	 * Debt.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPutableDate
	 * FinancialInstrumentAttributes35.mmPutableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPutableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate datedDate;
	/**
	 * First date at which a security begins to accrue interest.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
	 * Debt.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * definition} = "First date at which a security begins to accrue interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDatedDate
	 * FinancialInstrumentAttributes35.mmDatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date at which a security begins to accrue interest.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmDatedDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate firstPaymentDate;
	/**
	 * Date at which the first interest payment is due to holders of the
	 * security.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFirstPaymentDate
	 * Debt.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Date at which the first interest payment is due to holders of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmFirstPaymentDate
	 * FinancialInstrumentAttributes35.mmFirstPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date at which the first interest payment is due to holders of the security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmFirstPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BaseOneRate previousFactor;
	/**
	 * Rate expressed as a decimal between 0 and 1 that was applicable before
	 * the current factor and defines the outstanding principal of the financial
	 * instrument (for factored securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Rate expressed as a decimal between 0 and 1 that was applicable before the current factor and defines the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPreviousFactor
	 * FinancialInstrumentAttributes35.mmPreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that was applicable before the current factor and defines the outstanding principal of the financial instrument (for factored securities).";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPreviousFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected BaseOneRate currentFactor;
	/**
	 * Rate expressed as a decimal between 0 and 1 defining the outstanding
	 * principal of the financial instrument (for factored securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Rate expressed as a decimal between 0 and 1 defining the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCurrentFactor
	 * FinancialInstrumentAttributes35.mmCurrentFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Rate expressed as a decimal between 0 and 1 defining the outstanding principal of the financial instrument (for factored securities).";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmCurrentFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected BaseOneRate nextFactor;
	/**
	 * Rate expressed as a decimal between 0 and 1 that will be applicable as of
	 * the next factor date and defines the outstanding principal of the
	 * financial instrument (for factored securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Rate expressed as a decimal between 0 and 1 that will be applicable as of the next factor date and defines the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextFactor
	 * FinancialInstrumentAttributes35.mmNextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that will be applicable as of the next factor date and defines the outstanding principal of the financial instrument (for factored securities).";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmNextFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmInterestRate
	 * FinancialInstrumentAttributes35.mmInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate yieldToMaturityRate;
	/**
	 * Rate of return anticipated on a bond when held until maturity date.
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmYieldToMaturityRate
	 * Debt.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldToMtrtyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of return anticipated on a bond when held until maturity date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes35.mmYieldToMaturityRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYieldToMaturityRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmYieldToMaturityRate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "YldToMtrtyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmYieldToMaturityRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate nextInterestRate;
	/**
	 * Interest rate applicable to the next interest payment period in relation
	 * to variable rate instruments.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * "Interest rate applicable to the next interest payment period in relation to variable rate instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextInterestRate
	 * FinancialInstrumentAttributes35.mmNextInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextInterestRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmNextInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate indexRateBasis;
	/**
	 * Specifies the reference rate for fixed income instruments where the price
	 * of the instrument is indexed to the price of an underlying benchmark.
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
	 * Index.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmIndexRateBasis
	 * FinancialInstrumentAttributes35.mmIndexRateBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexRateBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateBasis;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "IndxRateBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmIndexRateBasis;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Number22Choice couponAttachedNumber;
	/**
	 * Number of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Number22Choice
	 * Number22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnAttchdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttachedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes35.mmCouponAttachedNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCouponAttachedNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmCouponAttachedNumber;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Number22Choice.mmObject();
		}
	};
	protected GenericIdentification37 poolNumber;
	/**
	 * Number identifying a group of underlying assets assigned by the issuer of
	 * a factored security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
	 * Debt.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPoolNumber
	 * FinancialInstrumentAttributes35.mmPoolNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPoolNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolNumber;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPoolNumber;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification37.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmVariableRateIndicator
	 * FinancialInstrumentAttributes35.mmVariableRateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariableRateIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmVariableRateIndicator;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmCallableIndicator
	 * FinancialInstrumentAttributes35.mmCallableIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmCallableIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPutableIndicator
	 * FinancialInstrumentAttributes35.mmPutableIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmPutableIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriceType1Choice marketOrIndicativePrice;
	/**
	 * Value of the price, for example, as a currency and value per unit or as a
	 * percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceType1Choice
	 * PriceType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktOrIndctvPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketOrIndicativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the price, for example, as a currency and value per unit or as a percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmMarketOrIndicativePrice
	 * FinancialInstrumentAttributes35.mmMarketOrIndicativePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketOrIndicativePrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "MktOrIndctvPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOrIndicativePrice";
			definition = "Value of the price, for example, as a currency and value per unit or as a percentage.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmMarketOrIndicativePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceType1Choice.mmObject();
		}
	};
	protected Price2 exercisePrice;
	/**
	 * Predetermined price at which the holder of a derivative will buy or sell
	 * the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a derivative will buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmExercisePrice
	 * FinancialInstrumentAttributes35.mmExercisePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExercisePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will buy or sell the underlying instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmExercisePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected Price2 subscriptionPrice;
	/**
	 * Pre-determined price at which the holder of a right is entitled to buy
	 * the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a right is entitled to buy the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmSubscriptionPrice
	 * FinancialInstrumentAttributes35.mmSubscriptionPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Warrant.mmSubscriptionPrice;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "SbcptPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a right is entitled to buy the underlying instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmSubscriptionPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected Price2 conversionPrice;
	/**
	 * Price of one target security in the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
	 * SecuritiesConversion.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of one target security in the conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmConversionPrice
	 * FinancialInstrumentAttributes35.mmConversionPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConversionPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPrice;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "ConvsPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmConversionPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected Price2 strikePrice;
	/**
	 * Predetermined price at which the holder will have to buy or sell the
	 * underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmStrikePrice
	 * FinancialInstrumentAttributes35.mmStrikePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStrikePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Price.mmSecuritiesPricing;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmStrikePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumNominalQuantity;
	/**
	 * Minimum nominal quantity of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum nominal quantity of financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes35.mmMinimumNominalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumNominalQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "MinNmnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Minimum nominal quantity of financial instrument.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmMinimumNominalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice contractSize;
	/**
	 * Ratio or multiplying factor used to convert one contract into a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmContractSize
	 * FinancialInstrumentAttributes35.mmContractSize}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractSize = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmContractSize;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityIdentification19> underlyingFinancialInstrumentIdentification;
	/**
	 * Identification of the underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the underlying security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes35.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentIdentification";
			definition = "Identification of the underlying security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmUnderlyingFinancialInstrumentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected Max350Text financialInstrumentAttributeAdditionalDetails;
	/**
	 * Provides additional information about the financial instrument in
	 * narrative form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributeAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the financial instrument in narrative form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmFinancialInstrumentAttributeAdditionalDetails
	 * FinancialInstrumentAttributes35.
	 * mmFinancialInstrumentAttributeAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentAttributeAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes64.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributeAdditionalDetails";
			definition = "Provides additional information about the financial instrument in narrative form.";
			previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmFinancialInstrumentAttributeAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributes64.mmPlaceOfListing, FinancialInstrumentAttributes64.mmDayCountBasis, FinancialInstrumentAttributes64.mmRegistrationForm,
						FinancialInstrumentAttributes64.mmPaymentFrequency, FinancialInstrumentAttributes64.mmPaymentStatus, FinancialInstrumentAttributes64.mmVariableRateChangeFrequency,
						FinancialInstrumentAttributes64.mmClassificationType, FinancialInstrumentAttributes64.mmOptionStyle, FinancialInstrumentAttributes64.mmOptionType, FinancialInstrumentAttributes64.mmDenominationCurrency,
						FinancialInstrumentAttributes64.mmCouponDate, FinancialInstrumentAttributes64.mmExpiryDate, FinancialInstrumentAttributes64.mmFloatingRateFixingDate, FinancialInstrumentAttributes64.mmMaturityDate,
						FinancialInstrumentAttributes64.mmIssueDate, FinancialInstrumentAttributes64.mmNextCallableDate, FinancialInstrumentAttributes64.mmPutableDate, FinancialInstrumentAttributes64.mmDatedDate,
						FinancialInstrumentAttributes64.mmFirstPaymentDate, FinancialInstrumentAttributes64.mmPreviousFactor, FinancialInstrumentAttributes64.mmCurrentFactor, FinancialInstrumentAttributes64.mmNextFactor,
						FinancialInstrumentAttributes64.mmInterestRate, FinancialInstrumentAttributes64.mmYieldToMaturityRate, FinancialInstrumentAttributes64.mmNextInterestRate, FinancialInstrumentAttributes64.mmIndexRateBasis,
						FinancialInstrumentAttributes64.mmCouponAttachedNumber, FinancialInstrumentAttributes64.mmPoolNumber, FinancialInstrumentAttributes64.mmVariableRateIndicator, FinancialInstrumentAttributes64.mmCallableIndicator,
						FinancialInstrumentAttributes64.mmPutableIndicator, FinancialInstrumentAttributes64.mmMarketOrIndicativePrice, FinancialInstrumentAttributes64.mmExercisePrice, FinancialInstrumentAttributes64.mmSubscriptionPrice,
						FinancialInstrumentAttributes64.mmConversionPrice, FinancialInstrumentAttributes64.mmStrikePrice, FinancialInstrumentAttributes64.mmMinimumNominalQuantity, FinancialInstrumentAttributes64.mmContractSize,
						FinancialInstrumentAttributes64.mmUnderlyingFinancialInstrumentIdentification, FinancialInstrumentAttributes64.mmFinancialInstrumentAttributeAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionInstructionV06.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionConfirmationV06.mmFinancialInstrumentAttributes,
						SecuritiesFinancingInstructionV06.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionGenerationNotificationV06.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionReversalAdviceV05.mmFinancialInstrumentAttributes, SecuritiesFinancingConfirmationV06.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionAllegementNotificationV05.mmFinancialInstrumentAttributes, SecuritiesFinancingInstructionV07.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionAllegementNotificationV06.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionGenerationNotificationV07.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionConfirmationV07.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionReversalAdviceV06.mmFinancialInstrumentAttributes,
						SecuritiesFinancingConfirmationV07.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionInstructionV07.mmFinancialInstrumentAttributes);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes64";
				definition = "Elements characterising a financial instrument.";
				previousVersion_lazy = () -> FinancialInstrumentAttributes35.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public MarketIdentification3Choice getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(MarketIdentification3Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	public InterestComputationMethodFormat4Choice getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethodFormat4Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	public FormOfSecurity6Choice getRegistrationForm() {
		return registrationForm;
	}

	public void setRegistrationForm(FormOfSecurity6Choice registrationForm) {
		this.registrationForm = registrationForm;
	}

	public Frequency23Choice getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(Frequency23Choice paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public SecuritiesPaymentStatus5Choice getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatus5Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Frequency23Choice getVariableRateChangeFrequency() {
		return variableRateChangeFrequency;
	}

	public void setVariableRateChangeFrequency(Frequency23Choice variableRateChangeFrequency) {
		this.variableRateChangeFrequency = variableRateChangeFrequency;
	}

	public ClassificationType32Choice getClassificationType() {
		return classificationType;
	}

	public void setClassificationType(ClassificationType32Choice classificationType) {
		this.classificationType = classificationType;
	}

	public OptionStyle8Choice getOptionStyle() {
		return optionStyle;
	}

	public void setOptionStyle(OptionStyle8Choice optionStyle) {
		this.optionStyle = optionStyle;
	}

	public OptionType6Choice getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType6Choice optionType) {
		this.optionType = optionType;
	}

	public ActiveOrHistoricCurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(ActiveOrHistoricCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	public ISODate getCouponDate() {
		return couponDate;
	}

	public void setCouponDate(ISODate couponDate) {
		this.couponDate = couponDate;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ISODate getFloatingRateFixingDate() {
		return floatingRateFixingDate;
	}

	public void setFloatingRateFixingDate(ISODate floatingRateFixingDate) {
		this.floatingRateFixingDate = floatingRateFixingDate;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	public ISODate getNextCallableDate() {
		return nextCallableDate;
	}

	public void setNextCallableDate(ISODate nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
	}

	public ISODate getPutableDate() {
		return putableDate;
	}

	public void setPutableDate(ISODate putableDate) {
		this.putableDate = putableDate;
	}

	public ISODate getDatedDate() {
		return datedDate;
	}

	public void setDatedDate(ISODate datedDate) {
		this.datedDate = datedDate;
	}

	public ISODate getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(ISODate firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public BaseOneRate getPreviousFactor() {
		return previousFactor;
	}

	public void setPreviousFactor(BaseOneRate previousFactor) {
		this.previousFactor = previousFactor;
	}

	public BaseOneRate getCurrentFactor() {
		return currentFactor;
	}

	public void setCurrentFactor(BaseOneRate currentFactor) {
		this.currentFactor = currentFactor;
	}

	public BaseOneRate getNextFactor() {
		return nextFactor;
	}

	public void setNextFactor(BaseOneRate nextFactor) {
		this.nextFactor = nextFactor;
	}

	public PercentageRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
	}

	public PercentageRate getYieldToMaturityRate() {
		return yieldToMaturityRate;
	}

	public void setYieldToMaturityRate(PercentageRate yieldToMaturityRate) {
		this.yieldToMaturityRate = yieldToMaturityRate;
	}

	public PercentageRate getNextInterestRate() {
		return nextInterestRate;
	}

	public void setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public void setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
	}

	public Number22Choice getCouponAttachedNumber() {
		return couponAttachedNumber;
	}

	public void setCouponAttachedNumber(Number22Choice couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
	}

	public GenericIdentification37 getPoolNumber() {
		return poolNumber;
	}

	public void setPoolNumber(com.tools20022.repository.msg.GenericIdentification37 poolNumber) {
		this.poolNumber = poolNumber;
	}

	public YesNoIndicator getVariableRateIndicator() {
		return variableRateIndicator;
	}

	public void setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
	}

	public YesNoIndicator getCallableIndicator() {
		return callableIndicator;
	}

	public void setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
	}

	public YesNoIndicator getPutableIndicator() {
		return putableIndicator;
	}

	public void setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
	}

	public PriceType1Choice getMarketOrIndicativePrice() {
		return marketOrIndicativePrice;
	}

	public void setMarketOrIndicativePrice(PriceType1Choice marketOrIndicativePrice) {
		this.marketOrIndicativePrice = marketOrIndicativePrice;
	}

	public Price2 getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(com.tools20022.repository.msg.Price2 exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	public Price2 getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(com.tools20022.repository.msg.Price2 subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public Price2 getConversionPrice() {
		return conversionPrice;
	}

	public void setConversionPrice(com.tools20022.repository.msg.Price2 conversionPrice) {
		this.conversionPrice = conversionPrice;
	}

	public Price2 getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(com.tools20022.repository.msg.Price2 strikePrice) {
		this.strikePrice = strikePrice;
	}

	public FinancialInstrumentQuantity1Choice getMinimumNominalQuantity() {
		return minimumNominalQuantity;
	}

	public void setMinimumNominalQuantity(FinancialInstrumentQuantity1Choice minimumNominalQuantity) {
		this.minimumNominalQuantity = minimumNominalQuantity;
	}

	public FinancialInstrumentQuantity1Choice getContractSize() {
		return contractSize;
	}

	public void setContractSize(FinancialInstrumentQuantity1Choice contractSize) {
		this.contractSize = contractSize;
	}

	public List<SecurityIdentification19> getUnderlyingFinancialInstrumentIdentification() {
		return underlyingFinancialInstrumentIdentification;
	}

	public void setUnderlyingFinancialInstrumentIdentification(List<com.tools20022.repository.msg.SecurityIdentification19> underlyingFinancialInstrumentIdentification) {
		this.underlyingFinancialInstrumentIdentification = underlyingFinancialInstrumentIdentification;
	}

	public Max350Text getFinancialInstrumentAttributeAdditionalDetails() {
		return financialInstrumentAttributeAdditionalDetails;
	}

	public void setFinancialInstrumentAttributeAdditionalDetails(Max350Text financialInstrumentAttributeAdditionalDetails) {
		this.financialInstrumentAttributeAdditionalDetails = financialInstrumentAttributeAdditionalDetails;
	}
}