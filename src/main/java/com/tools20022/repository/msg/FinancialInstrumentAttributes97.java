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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification39;
import com.tools20022.repository.msg.Price3;
import com.tools20022.repository.msg.SecurityIdentification20;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPlaceOfListing
 * FinancialInstrumentAttributes97.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmDayCountBasis
 * FinancialInstrumentAttributes97.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmRegistrationForm
 * FinancialInstrumentAttributes97.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPaymentFrequency
 * FinancialInstrumentAttributes97.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPaymentStatus
 * FinancialInstrumentAttributes97.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmVariableRateChangeFrequency
 * FinancialInstrumentAttributes97.mmVariableRateChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmClassificationType
 * FinancialInstrumentAttributes97.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmOptionStyle
 * FinancialInstrumentAttributes97.mmOptionStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmOptionType
 * FinancialInstrumentAttributes97.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmDenominationCurrency
 * FinancialInstrumentAttributes97.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCouponDate
 * FinancialInstrumentAttributes97.mmCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmExpiryDate
 * FinancialInstrumentAttributes97.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmFloatingRateFixingDate
 * FinancialInstrumentAttributes97.mmFloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmMaturityDate
 * FinancialInstrumentAttributes97.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmIssueDate
 * FinancialInstrumentAttributes97.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmNextCallableDate
 * FinancialInstrumentAttributes97.mmNextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPutableDate
 * FinancialInstrumentAttributes97.mmPutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmDatedDate
 * FinancialInstrumentAttributes97.mmDatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmFirstPaymentDate
 * FinancialInstrumentAttributes97.mmFirstPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPreviousFactor
 * FinancialInstrumentAttributes97.mmPreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCurrentFactor
 * FinancialInstrumentAttributes97.mmCurrentFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmNextFactor
 * FinancialInstrumentAttributes97.mmNextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmInterestRate
 * FinancialInstrumentAttributes97.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmYieldToMaturityRate
 * FinancialInstrumentAttributes97.mmYieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmNextInterestRate
 * FinancialInstrumentAttributes97.mmNextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmIndexRateBasis
 * FinancialInstrumentAttributes97.mmIndexRateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCouponAttachedNumber
 * FinancialInstrumentAttributes97.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPoolNumber
 * FinancialInstrumentAttributes97.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmVariableRateIndicator
 * FinancialInstrumentAttributes97.mmVariableRateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmCallableIndicator
 * FinancialInstrumentAttributes97.mmCallableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmPutableIndicator
 * FinancialInstrumentAttributes97.mmPutableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmMarketOrIndicativePrice
 * FinancialInstrumentAttributes97.mmMarketOrIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmExercisePrice
 * FinancialInstrumentAttributes97.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmSubscriptionPrice
 * FinancialInstrumentAttributes97.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmConversionPrice
 * FinancialInstrumentAttributes97.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmStrikePrice
 * FinancialInstrumentAttributes97.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmMinimumNominalQuantity
 * FinancialInstrumentAttributes97.mmMinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmContractSize
 * FinancialInstrumentAttributes97.mmContractSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmUnderlyingFinancialInstrumentIdentification
 * FinancialInstrumentAttributes97.mmUnderlyingFinancialInstrumentIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmFinancialInstrumentAttributeAdditionalDetails
 * FinancialInstrumentAttributes97.
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V08#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmation002V08.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V08#mmFinancialInstrumentAttributes
 * SecuritiesFinancingInstruction002V08.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionAllegementNotification002V07.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V08#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionConfirmation002V08.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V08#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionGenerationNotification002V08.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V08#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionInstruction002V08.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionReversalAdvice002V07.
 * mmFinancialInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes97"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements characterising a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes97
 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes97}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes97
 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes97}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes97", propOrder = {"placeOfListing", "dayCountBasis", "registrationForm", "paymentFrequency", "paymentStatus", "variableRateChangeFrequency", "classificationType", "optionStyle", "optionType",
		"denominationCurrency", "couponDate", "expiryDate", "floatingRateFixingDate", "maturityDate", "issueDate", "nextCallableDate", "putableDate", "datedDate", "firstPaymentDate", "previousFactor", "currentFactor", "nextFactor",
		"interestRate", "yieldToMaturityRate", "nextInterestRate", "indexRateBasis", "couponAttachedNumber", "poolNumber", "variableRateIndicator", "callableIndicator", "putableIndicator", "marketOrIndicativePrice", "exercisePrice",
		"subscriptionPrice", "conversionPrice", "strikePrice", "minimumNominalQuantity", "contractSize", "underlyingFinancialInstrumentIdentification", "financialInstrumentAttributeAdditionalDetails"})
public class FinancialInstrumentAttributes97 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification4Choice placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification4Choice
	 * MarketIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::PLIS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<MarketIdentification4Choice>> mmPlaceOfListing = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<MarketIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PLIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification4Choice.mmObject();
		}

		@Override
		public Optional<MarketIdentification4Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<MarketIdentification4Choice> value) {
			obj.setPlaceOfListing(value.orElse(null));
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethodFormat5Choice dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice
	 * InterestComputationMethodFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MICO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<InterestComputationMethodFormat5Choice>> mmDayCountBasis = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<InterestComputationMethodFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MICO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat5Choice.mmObject();
		}

		@Override
		public Optional<InterestComputationMethodFormat5Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<InterestComputationMethodFormat5Choice> value) {
			obj.setDayCountBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnForm")
	protected FormOfSecurity7Choice registrationForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity7Choice
	 * FormOfSecurity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnForm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, this is, ownership, of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FORM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FormOfSecurity7Choice>> mmRegistrationForm = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FormOfSecurity7Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "RegnForm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, this is, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FormOfSecurity7Choice.mmObject();
		}

		@Override
		public Optional<FormOfSecurity7Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getRegistrationForm();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<FormOfSecurity7Choice> value) {
			obj.setRegistrationForm(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency27Choice paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency27Choice
	 * Frequency27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
	 * InterestCalculation.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFrqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of an interest payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PFRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Frequency27Choice>> mmPaymentFrequency = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Frequency27Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency27Choice.mmObject();
		}

		@Override
		public Optional<Frequency27Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPaymentFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Frequency27Choice> value) {
			obj.setPaymentFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtSts")
	protected SecuritiesPaymentStatus6Choice paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus6Choice
	 * SecuritiesPaymentStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PAYS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<SecuritiesPaymentStatus6Choice>> mmPaymentStatus = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<SecuritiesPaymentStatus6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PAYS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesPaymentStatus6Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesPaymentStatus6Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<SecuritiesPaymentStatus6Choice> value) {
			obj.setPaymentStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateChngFrqcy")
	protected Frequency27Choice variableRateChangeFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency27Choice
	 * Frequency27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateChangeFrequency
	 * VariableInterest.mmVariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateChngFrqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CFRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Frequency27Choice>> mmVariableRateChangeFrequency = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Frequency27Choice>>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmVariableRateChangeFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "VarblRateChngFrqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency27Choice.mmObject();
		}

		@Override
		public Optional<Frequency27Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getVariableRateChangeFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Frequency27Choice> value) {
			obj.setVariableRateChangeFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType33Choice classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType33Choice
	 * ClassificationType33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :12a::CLAS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<ClassificationType33Choice>> mmClassificationType = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<ClassificationType33Choice>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12a::CLAS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType33Choice.mmObject();
		}

		@Override
		public Optional<ClassificationType33Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ClassificationType33Choice> value) {
			obj.setClassificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnStyle")
	protected OptionStyle9Choice optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionStyle9Choice
	 * OptionStyle9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :12B::OPST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<OptionStyle9Choice>> mmOptionStyle = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<OptionStyle9Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12B::OPST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle9Choice.mmObject();
		}

		@Override
		public Optional<OptionStyle9Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<OptionStyle9Choice> value) {
			obj.setOptionStyle(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnTp")
	protected OptionType7Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionType7Choice
	 * OptionType7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :12B::OPTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<OptionType7Choice>> mmOptionType = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<OptionType7Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12B::OPTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionType7Choice.mmObject();
		}

		@Override
		public Optional<OptionType7Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<OptionType7Choice> value) {
			obj.setOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "DnmtnCcy")
	protected ActiveOrHistoricCurrencyCode denominationCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::DENO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ActiveOrHistoricCurrencyCode>> mmDenominationCurrency = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::DENO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getDenominationCurrency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setDenominationCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnDt")
	protected ISODate couponDate;
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
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmDate
	 * CouponAttached.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmCouponDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "CpnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getCouponDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setCouponDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODate expiryDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a privilege expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::EXPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmExpiryDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FltgRateFxgDt")
	protected ISODate floatingRateFixingDate;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateFxgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::FRNR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmFloatingRateFixingDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::FRNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getFloatingRateFixingDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setFloatingRateFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::MATU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::MATU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the security was made available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::ISSU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::ISSU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setIssueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NxtCllblDt")
	protected ISODate nextCallableDate;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
	 * Debt.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCllblDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next date at which the issuer has the right to pay the security prior to maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::CALD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmNextCallableDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::CALD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date at which the issuer has the right to pay the security prior to maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getNextCallableDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setNextCallableDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PutblDt")
	protected ISODate putableDate;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
	 * Debt.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the holder has the right to ask for redemption of the security prior to final maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::PUTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmPutableDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::PUTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPutableDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setPutableDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DtdDt")
	protected ISODate datedDate;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
	 * Debt.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date at which a security begins to accrue interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::DDTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmDatedDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::DDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getDatedDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setDatedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstPmtDt")
	protected ISODate firstPaymentDate;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFirstPaymentDate
	 * Debt.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstPmtDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the first interest payment is due to holders of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::FCOU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>> mmFirstPaymentDate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::FCOU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getFirstPaymentDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<ISODate> value) {
			obj.setFirstPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsFctr")
	protected BaseOneRate previousFactor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate expressed as a decimal between 0 and 1 that was applicable before the current factor and defines the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::PRFC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>> mmPreviousFactor = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::PRFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that was applicable before the current factor and defines the outstanding principal of the financial instrument (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPreviousFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<BaseOneRate> value) {
			obj.setPreviousFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "CurFctr")
	protected BaseOneRate currentFactor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate expressed as a decimal between 0 and 1 defining the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::CUFC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>> mmCurrentFactor = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::CUFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Rate expressed as a decimal between 0 and 1 defining the outstanding principal of the financial instrument (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getCurrentFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<BaseOneRate> value) {
			obj.setCurrentFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "NxtFctr")
	protected BaseOneRate nextFactor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate expressed as a decimal between 0 and 1 that will be applicable as of the next factor date and defines the outstanding principal of the financial instrument (for factored securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NWFC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>> mmNextFactor = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NWFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that will be applicable as of the next factor date and defines the outstanding principal of the financial instrument (for factored securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getNextFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<BaseOneRate> value) {
			obj.setNextFactor(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::INTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>> mmInterestRate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<PercentageRate> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "YldToMtrtyRate")
	protected PercentageRate yieldToMaturityRate;
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
	 * {@linkplain com.tools20022.repository.entity.Debt#mmYieldToMaturityRate
	 * Debt.mmYieldToMaturityRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldToMtrtyRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of return anticipated on a bond when held until maturity date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>> mmYieldToMaturityRate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmYieldToMaturityRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "YldToMtrtyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getYieldToMaturityRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<PercentageRate> value) {
			obj.setYieldToMaturityRate(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtIntrstRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate applicable to the next interest payment period in relation to variable rate instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NXRT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>> mmNextInterestRate = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NXRT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getNextInterestRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<PercentageRate> value) {
			obj.setNextInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "IndxRateBsis")
	protected PercentageRate indexRateBasis;
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
	 * Index.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::INDX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>> mmIndexRateBasis = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "IndxRateBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getIndexRateBasis();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<PercentageRate> value) {
			obj.setIndexRateBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnAttchdNb")
	protected Number23Choice couponAttachedNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Number23Choice
	 * Number23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnAttchdNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttachedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Number23Choice>> mmCouponAttachedNumber = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Number23Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Number23Choice.mmObject();
		}

		@Override
		public Optional<Number23Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getCouponAttachedNumber();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Number23Choice> value) {
			obj.setCouponAttachedNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolNb")
	protected GenericIdentification39 poolNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39
	 * GenericIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
	 * Debt.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<GenericIdentification39>> mmPoolNumber = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<GenericIdentification39>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification39.mmObject();
		}

		@Override
		public Optional<GenericIdentification39> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPoolNumber();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<GenericIdentification39> value) {
			obj.setPoolNumber(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest rate of an interest bearing instrument is reset periodically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::FRNF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>> mmVariableRateIndicator = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::FRNF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getVariableRateIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<YesNoIndicator> value) {
			obj.setVariableRateIndicator(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CllblInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::CALL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>> mmCallableIndicator = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::CALL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getCallableIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<YesNoIndicator> value) {
			obj.setCallableIndicator(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::PUTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>> mmPutableIndicator = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::PUTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getPutableIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<YesNoIndicator> value) {
			obj.setPutableIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MktOrIndctvPric")
	protected PriceType5Choice marketOrIndicativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceType5Choice
	 * PriceType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktOrIndctvPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketOrIndicativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the price, for example, as a currency and value per unit or as a percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MRKT or INDC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<PriceType5Choice>> mmMarketOrIndicativePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<PriceType5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "MktOrIndctvPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MRKT or INDC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOrIndicativePrice";
			definition = "Value of the price, for example, as a currency and value per unit or as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceType5Choice.mmObject();
		}

		@Override
		public Optional<PriceType5Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getMarketOrIndicativePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<PriceType5Choice> value) {
			obj.setMarketOrIndicativePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ExrcPric")
	protected Price3 exercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a derivative will buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>> mmExercisePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price3.mmObject();
		}

		@Override
		public Optional<Price3> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Price3> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptPric")
	protected Price3 subscriptionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a right is entitled to buy the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>> mmSubscriptionPrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>>() {
		{
			businessElementTrace_lazy = () -> Warrant.mmSubscriptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "SbcptPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a right is entitled to buy the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price3.mmObject();
		}

		@Override
		public Optional<Price3> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getSubscriptionPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Price3> value) {
			obj.setSubscriptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsPric")
	protected Price3 conversionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
	 * SecuritiesConversion.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of one target security in the conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>> mmConversionPrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "ConvsPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price3.mmObject();
		}

		@Override
		public Optional<Price3> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getConversionPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Price3> value) {
			obj.setConversionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPric")
	protected Price3 strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::EXER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>> mmStrikePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<Price3>>() {
		{
			businessElementTrace_lazy = () -> Price.mmSecuritiesPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price3.mmObject();
		}

		@Override
		public Optional<Price3> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<Price3> value) {
			obj.setStrikePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "MinNmnlQty")
	protected FinancialInstrumentQuantity15Choice minimumNominalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum nominal quantity of financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MINO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FinancialInstrumentQuantity15Choice>> mmMinimumNominalQuantity = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "MinNmnlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MINO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Minimum nominal quantity of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getMinimumNominalQuantity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setMinimumNominalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctSz")
	protected FinancialInstrumentQuantity15Choice contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SIZE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FinancialInstrumentQuantity15Choice>> mmContractSize = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SIZE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setContractSize(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrmId")
	protected List<SecurityIdentification20> underlyingFinancialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the underlying security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes97, List<SecurityIdentification20>> mmUnderlyingFinancialInstrumentIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributes97, List<SecurityIdentification20>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentIdentification";
			definition = "Identification of the underlying security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public List<SecurityIdentification20> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getUnderlyingFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, List<SecurityIdentification20> value) {
			obj.setUnderlyingFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrAddtlDtls")
	protected RestrictedFINXMax350Text financialInstrumentAttributeAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributeAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the financial instrument in narrative form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes97, Optional<RestrictedFINXMax350Text>> mmFinancialInstrumentAttributeAdditionalDetails = new MMMessageAttribute<FinancialInstrumentAttributes97, Optional<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::FIAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributeAdditionalDetails";
			definition = "Provides additional information about the financial instrument in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(FinancialInstrumentAttributes97 obj) {
			return obj.getFinancialInstrumentAttributeAdditionalDetails();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes97 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setFinancialInstrumentAttributeAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmDayCountBasis,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmRegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPaymentFrequency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmVariableRateChangeFrequency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmOptionStyle,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmDenominationCurrency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmExpiryDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmFloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmMaturityDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmIssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmNextCallableDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmDatedDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmFirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPreviousFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmCurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmNextFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmYieldToMaturityRate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmNextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmIndexRateBasis,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmCouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPoolNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmVariableRateIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmCallableIndicator,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmPutableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmMarketOrIndicativePrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmSubscriptionPrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmStrikePrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmMinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmContractSize,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmUnderlyingFinancialInstrumentIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributes97.mmFinancialInstrumentAttributeAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmation002V08.mmFinancialInstrumentAttributes, SecuritiesFinancingInstruction002V08.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionAllegementNotification002V07.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionConfirmation002V08.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionGenerationNotification002V08.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionInstruction002V08.mmFinancialInstrumentAttributes,
						SecuritiesSettlementTransactionReversalAdvice002V07.mmFinancialInstrumentAttributes);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes97,
						com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes97);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes97";
				definition = "Elements characterising a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MarketIdentification4Choice> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public FinancialInstrumentAttributes97 setPlaceOfListing(MarketIdentification4Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Optional<InterestComputationMethodFormat5Choice> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public FinancialInstrumentAttributes97 setDayCountBasis(InterestComputationMethodFormat5Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<FormOfSecurity7Choice> getRegistrationForm() {
		return registrationForm == null ? Optional.empty() : Optional.of(registrationForm);
	}

	public FinancialInstrumentAttributes97 setRegistrationForm(FormOfSecurity7Choice registrationForm) {
		this.registrationForm = registrationForm;
		return this;
	}

	public Optional<Frequency27Choice> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public FinancialInstrumentAttributes97 setPaymentFrequency(Frequency27Choice paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<SecuritiesPaymentStatus6Choice> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public FinancialInstrumentAttributes97 setPaymentStatus(SecuritiesPaymentStatus6Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<Frequency27Choice> getVariableRateChangeFrequency() {
		return variableRateChangeFrequency == null ? Optional.empty() : Optional.of(variableRateChangeFrequency);
	}

	public FinancialInstrumentAttributes97 setVariableRateChangeFrequency(Frequency27Choice variableRateChangeFrequency) {
		this.variableRateChangeFrequency = variableRateChangeFrequency;
		return this;
	}

	public Optional<ClassificationType33Choice> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public FinancialInstrumentAttributes97 setClassificationType(ClassificationType33Choice classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<OptionStyle9Choice> getOptionStyle() {
		return optionStyle == null ? Optional.empty() : Optional.of(optionStyle);
	}

	public FinancialInstrumentAttributes97 setOptionStyle(OptionStyle9Choice optionStyle) {
		this.optionStyle = optionStyle;
		return this;
	}

	public Optional<OptionType7Choice> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public FinancialInstrumentAttributes97 setOptionType(OptionType7Choice optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public FinancialInstrumentAttributes97 setDenominationCurrency(ActiveOrHistoricCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<ISODate> getCouponDate() {
		return couponDate == null ? Optional.empty() : Optional.of(couponDate);
	}

	public FinancialInstrumentAttributes97 setCouponDate(ISODate couponDate) {
		this.couponDate = couponDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public FinancialInstrumentAttributes97 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<ISODate> getFloatingRateFixingDate() {
		return floatingRateFixingDate == null ? Optional.empty() : Optional.of(floatingRateFixingDate);
	}

	public FinancialInstrumentAttributes97 setFloatingRateFixingDate(ISODate floatingRateFixingDate) {
		this.floatingRateFixingDate = floatingRateFixingDate;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public FinancialInstrumentAttributes97 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public FinancialInstrumentAttributes97 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODate> getNextCallableDate() {
		return nextCallableDate == null ? Optional.empty() : Optional.of(nextCallableDate);
	}

	public FinancialInstrumentAttributes97 setNextCallableDate(ISODate nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
		return this;
	}

	public Optional<ISODate> getPutableDate() {
		return putableDate == null ? Optional.empty() : Optional.of(putableDate);
	}

	public FinancialInstrumentAttributes97 setPutableDate(ISODate putableDate) {
		this.putableDate = putableDate;
		return this;
	}

	public Optional<ISODate> getDatedDate() {
		return datedDate == null ? Optional.empty() : Optional.of(datedDate);
	}

	public FinancialInstrumentAttributes97 setDatedDate(ISODate datedDate) {
		this.datedDate = datedDate;
		return this;
	}

	public Optional<ISODate> getFirstPaymentDate() {
		return firstPaymentDate == null ? Optional.empty() : Optional.of(firstPaymentDate);
	}

	public FinancialInstrumentAttributes97 setFirstPaymentDate(ISODate firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		return this;
	}

	public Optional<BaseOneRate> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public FinancialInstrumentAttributes97 setPreviousFactor(BaseOneRate previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<BaseOneRate> getCurrentFactor() {
		return currentFactor == null ? Optional.empty() : Optional.of(currentFactor);
	}

	public FinancialInstrumentAttributes97 setCurrentFactor(BaseOneRate currentFactor) {
		this.currentFactor = currentFactor;
		return this;
	}

	public Optional<BaseOneRate> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public FinancialInstrumentAttributes97 setNextFactor(BaseOneRate nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<PercentageRate> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public FinancialInstrumentAttributes97 setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<PercentageRate> getYieldToMaturityRate() {
		return yieldToMaturityRate == null ? Optional.empty() : Optional.of(yieldToMaturityRate);
	}

	public FinancialInstrumentAttributes97 setYieldToMaturityRate(PercentageRate yieldToMaturityRate) {
		this.yieldToMaturityRate = yieldToMaturityRate;
		return this;
	}

	public Optional<PercentageRate> getNextInterestRate() {
		return nextInterestRate == null ? Optional.empty() : Optional.of(nextInterestRate);
	}

	public FinancialInstrumentAttributes97 setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
		return this;
	}

	public Optional<PercentageRate> getIndexRateBasis() {
		return indexRateBasis == null ? Optional.empty() : Optional.of(indexRateBasis);
	}

	public FinancialInstrumentAttributes97 setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
		return this;
	}

	public Optional<Number23Choice> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public FinancialInstrumentAttributes97 setCouponAttachedNumber(Number23Choice couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<GenericIdentification39> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public FinancialInstrumentAttributes97 setPoolNumber(GenericIdentification39 poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public Optional<YesNoIndicator> getVariableRateIndicator() {
		return variableRateIndicator == null ? Optional.empty() : Optional.of(variableRateIndicator);
	}

	public FinancialInstrumentAttributes97 setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCallableIndicator() {
		return callableIndicator == null ? Optional.empty() : Optional.of(callableIndicator);
	}

	public FinancialInstrumentAttributes97 setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPutableIndicator() {
		return putableIndicator == null ? Optional.empty() : Optional.of(putableIndicator);
	}

	public FinancialInstrumentAttributes97 setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
		return this;
	}

	public Optional<PriceType5Choice> getMarketOrIndicativePrice() {
		return marketOrIndicativePrice == null ? Optional.empty() : Optional.of(marketOrIndicativePrice);
	}

	public FinancialInstrumentAttributes97 setMarketOrIndicativePrice(PriceType5Choice marketOrIndicativePrice) {
		this.marketOrIndicativePrice = marketOrIndicativePrice;
		return this;
	}

	public Optional<Price3> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public FinancialInstrumentAttributes97 setExercisePrice(Price3 exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public Optional<Price3> getSubscriptionPrice() {
		return subscriptionPrice == null ? Optional.empty() : Optional.of(subscriptionPrice);
	}

	public FinancialInstrumentAttributes97 setSubscriptionPrice(Price3 subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
		return this;
	}

	public Optional<Price3> getConversionPrice() {
		return conversionPrice == null ? Optional.empty() : Optional.of(conversionPrice);
	}

	public FinancialInstrumentAttributes97 setConversionPrice(Price3 conversionPrice) {
		this.conversionPrice = conversionPrice;
		return this;
	}

	public Optional<Price3> getStrikePrice() {
		return strikePrice == null ? Optional.empty() : Optional.of(strikePrice);
	}

	public FinancialInstrumentAttributes97 setStrikePrice(Price3 strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getMinimumNominalQuantity() {
		return minimumNominalQuantity == null ? Optional.empty() : Optional.of(minimumNominalQuantity);
	}

	public FinancialInstrumentAttributes97 setMinimumNominalQuantity(FinancialInstrumentQuantity15Choice minimumNominalQuantity) {
		this.minimumNominalQuantity = minimumNominalQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getContractSize() {
		return contractSize == null ? Optional.empty() : Optional.of(contractSize);
	}

	public FinancialInstrumentAttributes97 setContractSize(FinancialInstrumentQuantity15Choice contractSize) {
		this.contractSize = contractSize;
		return this;
	}

	public List<SecurityIdentification20> getUnderlyingFinancialInstrumentIdentification() {
		return underlyingFinancialInstrumentIdentification == null ? underlyingFinancialInstrumentIdentification = new ArrayList<>() : underlyingFinancialInstrumentIdentification;
	}

	public FinancialInstrumentAttributes97 setUnderlyingFinancialInstrumentIdentification(List<SecurityIdentification20> underlyingFinancialInstrumentIdentification) {
		this.underlyingFinancialInstrumentIdentification = Objects.requireNonNull(underlyingFinancialInstrumentIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getFinancialInstrumentAttributeAdditionalDetails() {
		return financialInstrumentAttributeAdditionalDetails == null ? Optional.empty() : Optional.of(financialInstrumentAttributeAdditionalDetails);
	}

	public FinancialInstrumentAttributes97 setFinancialInstrumentAttributeAdditionalDetails(RestrictedFINXMax350Text financialInstrumentAttributeAdditionalDetails) {
		this.financialInstrumentAttributeAdditionalDetails = financialInstrumentAttributeAdditionalDetails;
		return this;
	}
}