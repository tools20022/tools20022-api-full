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
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification37;
import com.tools20022.repository.msg.Price2;
import com.tools20022.repository.msg.QuantityBreakdown15;
import com.tools20022.repository.msg.SecurityIdentification14;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPlaceOfListing
 * FinancialInstrumentAttributes36.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDayCountBasis
 * FinancialInstrumentAttributes36.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmRegistrationForm
 * FinancialInstrumentAttributes36.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPaymentFrequency
 * FinancialInstrumentAttributes36.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPaymentStatus
 * FinancialInstrumentAttributes36.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmVariableRateChangeFrequency
 * FinancialInstrumentAttributes36.mmVariableRateChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmClassificationType
 * FinancialInstrumentAttributes36.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmOptionStyle
 * FinancialInstrumentAttributes36.mmOptionStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmOptionType
 * FinancialInstrumentAttributes36.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDenominationCurrency
 * FinancialInstrumentAttributes36.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCouponDate
 * FinancialInstrumentAttributes36.mmCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmExpiryDate
 * FinancialInstrumentAttributes36.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmFloatingRateFixingDate
 * FinancialInstrumentAttributes36.mmFloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmMaturityDate
 * FinancialInstrumentAttributes36.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmIssueDate
 * FinancialInstrumentAttributes36.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmNextCallableDate
 * FinancialInstrumentAttributes36.mmNextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPutableDate
 * FinancialInstrumentAttributes36.mmPutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDatedDate
 * FinancialInstrumentAttributes36.mmDatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmFirstPaymentDate
 * FinancialInstrumentAttributes36.mmFirstPaymentDate}</li>
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmInterestRate
 * FinancialInstrumentAttributes36.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmYieldToMaturityRate
 * FinancialInstrumentAttributes36.mmYieldToMaturityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmNextInterestRate
 * FinancialInstrumentAttributes36.mmNextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmIndexRateBasis
 * FinancialInstrumentAttributes36.mmIndexRateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCouponAttachedNumber
 * FinancialInstrumentAttributes36.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPoolNumber
 * FinancialInstrumentAttributes36.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmQuantityBreakdown
 * FinancialInstrumentAttributes36.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmVariableRateIndicator
 * FinancialInstrumentAttributes36.mmVariableRateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmCallableIndicator
 * FinancialInstrumentAttributes36.mmCallableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPutableIndicator
 * FinancialInstrumentAttributes36.mmPutableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmMarketOrIndicativePrice
 * FinancialInstrumentAttributes36.mmMarketOrIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmExercisePrice
 * FinancialInstrumentAttributes36.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmSubscriptionPrice
 * FinancialInstrumentAttributes36.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmConversionPrice
 * FinancialInstrumentAttributes36.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmStrikePrice
 * FinancialInstrumentAttributes36.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmMinimumNominalQuantity
 * FinancialInstrumentAttributes36.mmMinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmContractSize
 * FinancialInstrumentAttributes36.mmContractSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmUnderlyingFinancialInstrumentIdentification
 * FinancialInstrumentAttributes36.mmUnderlyingFinancialInstrumentIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmFinancialInstrumentAttributeAdditionalDetails
 * FinancialInstrumentAttributes36.
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
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#mmFinancialInstrumentAttributes
 * IntraPositionMovementConfirmationV03.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#mmFinancialInstrumentAttributes
 * IntraPositionMovementConfirmationV04.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmFinancialInstrumentAttributes
 * IntraPositionMovementInstructionV03.mmFinancialInstrumentAttributes}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes36"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements characterising a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes36
 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forFinancialInstrumentAttributes36
 * ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes36
 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes36}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
 * FinancialInstrumentAttributes63}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21
 * FinancialInstrumentAttributes21}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes36", propOrder = {"placeOfListing", "dayCountBasis", "registrationForm", "paymentFrequency", "paymentStatus", "variableRateChangeFrequency", "classificationType", "optionStyle", "optionType",
		"denominationCurrency", "couponDate", "expiryDate", "floatingRateFixingDate", "maturityDate", "issueDate", "nextCallableDate", "putableDate", "datedDate", "firstPaymentDate", "previousFactor", "currentFactor", "nextFactor",
		"interestRate", "yieldToMaturityRate", "nextInterestRate", "indexRateBasis", "couponAttachedNumber", "poolNumber", "quantityBreakdown", "variableRateIndicator", "callableIndicator", "putableIndicator", "marketOrIndicativePrice",
		"exercisePrice", "subscriptionPrice", "conversionPrice", "strikePrice", "minimumNominalQuantity", "contractSize", "underlyingFinancialInstrumentIdentification", "financialInstrumentAttributeAdditionalDetails"})
public class FinancialInstrumentAttributes36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification3Choice placeOfListing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPlaceOfListing
	 * FinancialInstrumentAttributes63.mmPlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<MarketIdentification3Choice>> mmPlaceOfListing = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<MarketIdentification3Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PLIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPlaceOfListing);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
		}

		@Override
		public Optional<MarketIdentification3Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<MarketIdentification3Choice> value) {
			obj.setPlaceOfListing(value.orElse(null));
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethodFormat1Choice dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice
	 * InterestComputationMethodFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDayCountBasis
	 * FinancialInstrumentAttributes63.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<InterestComputationMethodFormat1Choice>> mmDayCountBasis = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<InterestComputationMethodFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MICO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmDayCountBasis);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat1Choice.mmObject();
		}

		@Override
		public Optional<InterestComputationMethodFormat1Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<InterestComputationMethodFormat1Choice> value) {
			obj.setDayCountBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnForm")
	protected FormOfSecurity2Choice registrationForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity2Choice
	 * FormOfSecurity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmRegistrationForm
	 * FinancialInstrumentAttributes63.mmRegistrationForm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FormOfSecurity2Choice>> mmRegistrationForm = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FormOfSecurity2Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "RegnForm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, this is, ownership, of the security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmRegistrationForm);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FormOfSecurity2Choice.mmObject();
		}

		@Override
		public Optional<FormOfSecurity2Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getRegistrationForm();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<FormOfSecurity2Choice> value) {
			obj.setRegistrationForm(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFrqcy")
	protected Frequency3Choice paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency3Choice
	 * Frequency3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
	 * InterestCalculation.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPaymentFrequency
	 * FinancialInstrumentAttributes63.mmPaymentFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Frequency3Choice>> mmPaymentFrequency = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Frequency3Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmPaymentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PmtFrqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPaymentFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency3Choice.mmObject();
		}

		@Override
		public Optional<Frequency3Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPaymentFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Frequency3Choice> value) {
			obj.setPaymentFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtSts")
	protected SecuritiesPaymentStatus2Choice paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus2Choice
	 * SecuritiesPaymentStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPaymentStatus
	 * FinancialInstrumentAttributes63.mmPaymentStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<SecuritiesPaymentStatus2Choice>> mmPaymentStatus = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<SecuritiesPaymentStatus2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PAYS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPaymentStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesPaymentStatus2Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesPaymentStatus2Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<SecuritiesPaymentStatus2Choice> value) {
			obj.setPaymentStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateChngFrqcy")
	protected Frequency3Choice variableRateChangeFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency3Choice
	 * Frequency3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateChangeFrequency
	 * VariableInterest.mmVariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmVariableRateChangeFrequency
	 * FinancialInstrumentAttributes63.mmVariableRateChangeFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Frequency3Choice>> mmVariableRateChangeFrequency = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Frequency3Choice>>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmVariableRateChangeFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "VarblRateChngFrqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmVariableRateChangeFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency3Choice.mmObject();
		}

		@Override
		public Optional<Frequency3Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getVariableRateChangeFrequency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Frequency3Choice> value) {
			obj.setVariableRateChangeFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType2Choice classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice
	 * ClassificationType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmClassificationType
	 * FinancialInstrumentAttributes63.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<ClassificationType2Choice>> mmClassificationType = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<ClassificationType2Choice>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12a::CLAS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmClassificationType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType2Choice.mmObject();
		}

		@Override
		public Optional<ClassificationType2Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getClassificationType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ClassificationType2Choice> value) {
			obj.setClassificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnStyle")
	protected OptionStyle4Choice optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionStyle4Choice
	 * OptionStyle4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmOptionStyle
	 * FinancialInstrumentAttributes63.mmOptionStyle}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<OptionStyle4Choice>> mmOptionStyle = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<OptionStyle4Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12B::OPST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmOptionStyle);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle4Choice.mmObject();
		}

		@Override
		public Optional<OptionStyle4Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<OptionStyle4Choice> value) {
			obj.setOptionStyle(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnTp")
	protected OptionType2Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionType2Choice
	 * OptionType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmOptionType
	 * FinancialInstrumentAttributes63.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<OptionType2Choice>> mmOptionType = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<OptionType2Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12B::OPTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmOptionType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionType2Choice.mmObject();
		}

		@Override
		public Optional<OptionType2Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<OptionType2Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDenominationCurrency
	 * FinancialInstrumentAttributes63.mmDenominationCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ActiveOrHistoricCurrencyCode>> mmDenominationCurrency = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::DENO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmDenominationCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getDenominationCurrency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCouponDate
	 * FinancialInstrumentAttributes63.mmCouponDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmCouponDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "CpnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmCouponDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getCouponDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExpiryDate
	 * FinancialInstrumentAttributes63.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmExpiryDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmExpiryDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes63.mmFloatingRateFixingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmFloatingRateFixingDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::FRNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmFloatingRateFixingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getFloatingRateFixingDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMaturityDate
	 * FinancialInstrumentAttributes63.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::MATU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmMaturityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmIssueDate
	 * FinancialInstrumentAttributes63.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::ISSU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date at which the security was made available.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmIssueDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextCallableDate
	 * FinancialInstrumentAttributes63.mmNextCallableDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmNextCallableDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::CALD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Next date at which the issuer has the right to pay the security prior to maturity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmNextCallableDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getNextCallableDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPutableDate
	 * FinancialInstrumentAttributes63.mmPutableDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmPutableDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::PUTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPutableDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPutableDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDatedDate
	 * FinancialInstrumentAttributes63.mmDatedDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmDatedDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::DDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "First date at which a security begins to accrue interest.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmDatedDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getDatedDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmFirstPaymentDate
	 * FinancialInstrumentAttributes63.mmFirstPaymentDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>> mmFirstPaymentDate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::FCOU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date at which the first interest payment is due to holders of the security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmFirstPaymentDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getFirstPaymentDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPreviousFactor
	 * FinancialInstrumentAttributes63.mmPreviousFactor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>> mmPreviousFactor = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::PRFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that was applicable before the current factor and defines the outstanding principal of the financial instrument (for factored securities).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPreviousFactor);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPreviousFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<BaseOneRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCurrentFactor
	 * FinancialInstrumentAttributes63.mmCurrentFactor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>> mmCurrentFactor = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "CurFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::CUFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Rate expressed as a decimal between 0 and 1 defining the outstanding principal of the financial instrument (for factored securities).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmCurrentFactor);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getCurrentFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<BaseOneRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextFactor
	 * FinancialInstrumentAttributes63.mmNextFactor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>> mmNextFactor = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NWFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Rate expressed as a decimal between 0 and 1 that will be applicable as of the next factor date and defines the outstanding principal of the financial instrument (for factored securities).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmNextFactor);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getNextFactor();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<BaseOneRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmInterestRate
	 * FinancialInstrumentAttributes63.mmInterestRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>> mmInterestRate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmInterestRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmYieldToMaturityRate
	 * FinancialInstrumentAttributes63.mmYieldToMaturityRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>> mmYieldToMaturityRate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmYieldToMaturityRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "YldToMtrtyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmYieldToMaturityRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getYieldToMaturityRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextInterestRate
	 * FinancialInstrumentAttributes63.mmNextInterestRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>> mmNextInterestRate = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NXRT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmNextInterestRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getNextInterestRate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmIndexRateBasis
	 * FinancialInstrumentAttributes63.mmIndexRateBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>> mmIndexRateBasis = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "IndxRateBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmIndexRateBasis);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getIndexRateBasis();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<PercentageRate> value) {
			obj.setIndexRateBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnAttchdNb")
	protected Number2Choice couponAttachedNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Number2Choice
	 * Number2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCouponAttachedNumber
	 * FinancialInstrumentAttributes63.mmCouponAttachedNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Number2Choice>> mmCouponAttachedNumber = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Number2Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmCouponAttachedNumber);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Number2Choice.mmObject();
		}

		@Override
		public Optional<Number2Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getCouponAttachedNumber();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Number2Choice> value) {
			obj.setCouponAttachedNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolNb")
	protected GenericIdentification37 poolNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPoolNumber
	 * FinancialInstrumentAttributes63.mmPoolNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<GenericIdentification37>> mmPoolNumber = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<GenericIdentification37>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPoolNumber);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPoolNumber();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<GenericIdentification37> value) {
			obj.setPoolNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown15> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown15
	 * QuantityBreakdown15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of a quantity into lots such as tax lots, instrument series, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmQuantityBreakdown
	 * FinancialInstrumentAttributes63.mmQuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, List<QuantityBreakdown15>> mmQuantityBreakdown = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, List<QuantityBreakdown15>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series, etc.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmQuantityBreakdown);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown15.mmObject();
		}

		@Override
		public List<QuantityBreakdown15> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, List<QuantityBreakdown15> value) {
			obj.setQuantityBreakdown(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmVariableRateIndicator
	 * FinancialInstrumentAttributes63.mmVariableRateIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>> mmVariableRateIndicator = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmVariableRateIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "VarblRateInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::FRNF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmVariableRateIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getVariableRateIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmCallableIndicator
	 * FinancialInstrumentAttributes63.mmCallableIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>> mmCallableIndicator = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmCallableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "CllblInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::CALL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmCallableIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getCallableIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPutableIndicator
	 * FinancialInstrumentAttributes63.mmPutableIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>> mmPutableIndicator = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "PutblInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::PUTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmPutableIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getPutableIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<YesNoIndicator> value) {
			obj.setPutableIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MktOrIndctvPric")
	protected PriceType1Choice marketOrIndicativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceType1Choice
	 * PriceType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMarketOrIndicativePrice
	 * FinancialInstrumentAttributes63.mmMarketOrIndicativePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<PriceType1Choice>> mmMarketOrIndicativePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<PriceType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "MktOrIndctvPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MRKT or INDC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOrIndicativePrice";
			definition = "Value of the price, for example, as a currency and value per unit or as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmMarketOrIndicativePrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceType1Choice.mmObject();
		}

		@Override
		public Optional<PriceType1Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getMarketOrIndicativePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<PriceType1Choice> value) {
			obj.setMarketOrIndicativePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ExrcPric")
	protected Price2 exercisePrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExercisePrice
	 * FinancialInstrumentAttributes63.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>> mmExercisePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will buy or sell the underlying instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmExercisePrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Price2> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptPric")
	protected Price2 subscriptionPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmSubscriptionPrice
	 * FinancialInstrumentAttributes63.mmSubscriptionPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>> mmSubscriptionPrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> Warrant.mmSubscriptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "SbcptPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a right is entitled to buy the underlying instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmSubscriptionPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getSubscriptionPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Price2> value) {
			obj.setSubscriptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsPric")
	protected Price2 conversionPrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmConversionPrice
	 * FinancialInstrumentAttributes63.mmConversionPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>> mmConversionPrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "ConvsPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmConversionPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getConversionPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Price2> value) {
			obj.setConversionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPric")
	protected Price2 strikePrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmStrikePrice
	 * FinancialInstrumentAttributes63.mmStrikePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>> mmStrikePrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> Price.mmSecuritiesPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::EXER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmStrikePrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Price2> value) {
			obj.setStrikePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "MinNmnlQty")
	protected FinancialInstrumentQuantity1Choice minimumNominalQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the minimum tradable quantity of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MINO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes63.mmMinimumNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FinancialInstrumentQuantity1Choice>> mmMinimumNominalQuantity = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "MinNmnlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MINO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmMinimumNominalQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getMinimumNominalQuantity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setMinimumNominalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctSz")
	protected FinancialInstrumentQuantity1Choice contractSize;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmContractSize
	 * FinancialInstrumentAttributes63.mmContractSize}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FinancialInstrumentQuantity1Choice>> mmContractSize = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SIZE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmContractSize);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setContractSize(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrmId")
	protected List<SecurityIdentification14> underlyingFinancialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the underlying security by an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmUnderlyingFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes63.
	 * mmUnderlyingFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes36, List<SecurityIdentification14>> mmUnderlyingFinancialInstrumentIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributes36, List<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentIdentification";
			definition = "Identification of the underlying security by an ISIN.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmUnderlyingFinancialInstrumentIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public List<SecurityIdentification14> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getUnderlyingFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, List<SecurityIdentification14> value) {
			obj.setUnderlyingFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrAddtlDtls")
	protected Max350Text financialInstrumentAttributeAdditionalDetails;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmFinancialInstrumentAttributeAdditionalDetails
	 * FinancialInstrumentAttributes63.
	 * mmFinancialInstrumentAttributeAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes36, Optional<Max350Text>> mmFinancialInstrumentAttributeAdditionalDetails = new MMMessageAttribute<FinancialInstrumentAttributes36, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::FIAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributeAdditionalDetails";
			definition = "Provides additional information about the financial instrument in narrative form.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmFinancialInstrumentAttributeAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FinancialInstrumentAttributes36 obj) {
			return obj.getFinancialInstrumentAttributeAdditionalDetails();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes36 obj, Optional<Max350Text> value) {
			obj.setFinancialInstrumentAttributeAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmDayCountBasis,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmRegistrationForm, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPaymentFrequency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPaymentStatus, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmVariableRateChangeFrequency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmOptionStyle,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmDenominationCurrency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmExpiryDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmFloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmMaturityDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmIssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmNextCallableDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmDatedDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmFirstPaymentDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPreviousFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmCurrentFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmNextFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmYieldToMaturityRate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmNextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmIndexRateBasis,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmCouponAttachedNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPoolNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmQuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmVariableRateIndicator,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmCallableIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmPutableIndicator,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmMarketOrIndicativePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmExercisePrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmSubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmConversionPrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmStrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmMinimumNominalQuantity,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmUnderlyingFinancialInstrumentIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmFinancialInstrumentAttributeAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV03.mmFinancialInstrumentAttributes, IntraPositionMovementConfirmationV04.mmFinancialInstrumentAttributes,
						IntraPositionMovementInstructionV03.mmFinancialInstrumentAttributes);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes36,
						com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forFinancialInstrumentAttributes36, com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes36);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrumentAttributes36";
				definition = "Elements characterising a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes63.mmObject());
				previousVersion_lazy = () -> FinancialInstrumentAttributes21.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MarketIdentification3Choice> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public FinancialInstrumentAttributes36 setPlaceOfListing(MarketIdentification3Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Optional<InterestComputationMethodFormat1Choice> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public FinancialInstrumentAttributes36 setDayCountBasis(InterestComputationMethodFormat1Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<FormOfSecurity2Choice> getRegistrationForm() {
		return registrationForm == null ? Optional.empty() : Optional.of(registrationForm);
	}

	public FinancialInstrumentAttributes36 setRegistrationForm(FormOfSecurity2Choice registrationForm) {
		this.registrationForm = registrationForm;
		return this;
	}

	public Optional<Frequency3Choice> getPaymentFrequency() {
		return paymentFrequency == null ? Optional.empty() : Optional.of(paymentFrequency);
	}

	public FinancialInstrumentAttributes36 setPaymentFrequency(Frequency3Choice paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
		return this;
	}

	public Optional<SecuritiesPaymentStatus2Choice> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public FinancialInstrumentAttributes36 setPaymentStatus(SecuritiesPaymentStatus2Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<Frequency3Choice> getVariableRateChangeFrequency() {
		return variableRateChangeFrequency == null ? Optional.empty() : Optional.of(variableRateChangeFrequency);
	}

	public FinancialInstrumentAttributes36 setVariableRateChangeFrequency(Frequency3Choice variableRateChangeFrequency) {
		this.variableRateChangeFrequency = variableRateChangeFrequency;
		return this;
	}

	public Optional<ClassificationType2Choice> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public FinancialInstrumentAttributes36 setClassificationType(ClassificationType2Choice classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<OptionStyle4Choice> getOptionStyle() {
		return optionStyle == null ? Optional.empty() : Optional.of(optionStyle);
	}

	public FinancialInstrumentAttributes36 setOptionStyle(OptionStyle4Choice optionStyle) {
		this.optionStyle = optionStyle;
		return this;
	}

	public Optional<OptionType2Choice> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public FinancialInstrumentAttributes36 setOptionType(OptionType2Choice optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public FinancialInstrumentAttributes36 setDenominationCurrency(ActiveOrHistoricCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<ISODate> getCouponDate() {
		return couponDate == null ? Optional.empty() : Optional.of(couponDate);
	}

	public FinancialInstrumentAttributes36 setCouponDate(ISODate couponDate) {
		this.couponDate = couponDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public FinancialInstrumentAttributes36 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<ISODate> getFloatingRateFixingDate() {
		return floatingRateFixingDate == null ? Optional.empty() : Optional.of(floatingRateFixingDate);
	}

	public FinancialInstrumentAttributes36 setFloatingRateFixingDate(ISODate floatingRateFixingDate) {
		this.floatingRateFixingDate = floatingRateFixingDate;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public FinancialInstrumentAttributes36 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public FinancialInstrumentAttributes36 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODate> getNextCallableDate() {
		return nextCallableDate == null ? Optional.empty() : Optional.of(nextCallableDate);
	}

	public FinancialInstrumentAttributes36 setNextCallableDate(ISODate nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
		return this;
	}

	public Optional<ISODate> getPutableDate() {
		return putableDate == null ? Optional.empty() : Optional.of(putableDate);
	}

	public FinancialInstrumentAttributes36 setPutableDate(ISODate putableDate) {
		this.putableDate = putableDate;
		return this;
	}

	public Optional<ISODate> getDatedDate() {
		return datedDate == null ? Optional.empty() : Optional.of(datedDate);
	}

	public FinancialInstrumentAttributes36 setDatedDate(ISODate datedDate) {
		this.datedDate = datedDate;
		return this;
	}

	public Optional<ISODate> getFirstPaymentDate() {
		return firstPaymentDate == null ? Optional.empty() : Optional.of(firstPaymentDate);
	}

	public FinancialInstrumentAttributes36 setFirstPaymentDate(ISODate firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		return this;
	}

	public Optional<BaseOneRate> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public FinancialInstrumentAttributes36 setPreviousFactor(BaseOneRate previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<BaseOneRate> getCurrentFactor() {
		return currentFactor == null ? Optional.empty() : Optional.of(currentFactor);
	}

	public FinancialInstrumentAttributes36 setCurrentFactor(BaseOneRate currentFactor) {
		this.currentFactor = currentFactor;
		return this;
	}

	public Optional<BaseOneRate> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public FinancialInstrumentAttributes36 setNextFactor(BaseOneRate nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<PercentageRate> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public FinancialInstrumentAttributes36 setInterestRate(PercentageRate interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<PercentageRate> getYieldToMaturityRate() {
		return yieldToMaturityRate == null ? Optional.empty() : Optional.of(yieldToMaturityRate);
	}

	public FinancialInstrumentAttributes36 setYieldToMaturityRate(PercentageRate yieldToMaturityRate) {
		this.yieldToMaturityRate = yieldToMaturityRate;
		return this;
	}

	public Optional<PercentageRate> getNextInterestRate() {
		return nextInterestRate == null ? Optional.empty() : Optional.of(nextInterestRate);
	}

	public FinancialInstrumentAttributes36 setNextInterestRate(PercentageRate nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
		return this;
	}

	public Optional<PercentageRate> getIndexRateBasis() {
		return indexRateBasis == null ? Optional.empty() : Optional.of(indexRateBasis);
	}

	public FinancialInstrumentAttributes36 setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
		return this;
	}

	public Optional<Number2Choice> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public FinancialInstrumentAttributes36 setCouponAttachedNumber(Number2Choice couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<GenericIdentification37> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public FinancialInstrumentAttributes36 setPoolNumber(GenericIdentification37 poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public List<QuantityBreakdown15> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public FinancialInstrumentAttributes36 setQuantityBreakdown(List<QuantityBreakdown15> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public Optional<YesNoIndicator> getVariableRateIndicator() {
		return variableRateIndicator == null ? Optional.empty() : Optional.of(variableRateIndicator);
	}

	public FinancialInstrumentAttributes36 setVariableRateIndicator(YesNoIndicator variableRateIndicator) {
		this.variableRateIndicator = variableRateIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCallableIndicator() {
		return callableIndicator == null ? Optional.empty() : Optional.of(callableIndicator);
	}

	public FinancialInstrumentAttributes36 setCallableIndicator(YesNoIndicator callableIndicator) {
		this.callableIndicator = callableIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPutableIndicator() {
		return putableIndicator == null ? Optional.empty() : Optional.of(putableIndicator);
	}

	public FinancialInstrumentAttributes36 setPutableIndicator(YesNoIndicator putableIndicator) {
		this.putableIndicator = putableIndicator;
		return this;
	}

	public Optional<PriceType1Choice> getMarketOrIndicativePrice() {
		return marketOrIndicativePrice == null ? Optional.empty() : Optional.of(marketOrIndicativePrice);
	}

	public FinancialInstrumentAttributes36 setMarketOrIndicativePrice(PriceType1Choice marketOrIndicativePrice) {
		this.marketOrIndicativePrice = marketOrIndicativePrice;
		return this;
	}

	public Optional<Price2> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public FinancialInstrumentAttributes36 setExercisePrice(Price2 exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public Optional<Price2> getSubscriptionPrice() {
		return subscriptionPrice == null ? Optional.empty() : Optional.of(subscriptionPrice);
	}

	public FinancialInstrumentAttributes36 setSubscriptionPrice(Price2 subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
		return this;
	}

	public Optional<Price2> getConversionPrice() {
		return conversionPrice == null ? Optional.empty() : Optional.of(conversionPrice);
	}

	public FinancialInstrumentAttributes36 setConversionPrice(Price2 conversionPrice) {
		this.conversionPrice = conversionPrice;
		return this;
	}

	public Optional<Price2> getStrikePrice() {
		return strikePrice == null ? Optional.empty() : Optional.of(strikePrice);
	}

	public FinancialInstrumentAttributes36 setStrikePrice(Price2 strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumNominalQuantity() {
		return minimumNominalQuantity == null ? Optional.empty() : Optional.of(minimumNominalQuantity);
	}

	public FinancialInstrumentAttributes36 setMinimumNominalQuantity(FinancialInstrumentQuantity1Choice minimumNominalQuantity) {
		this.minimumNominalQuantity = minimumNominalQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getContractSize() {
		return contractSize == null ? Optional.empty() : Optional.of(contractSize);
	}

	public FinancialInstrumentAttributes36 setContractSize(FinancialInstrumentQuantity1Choice contractSize) {
		this.contractSize = contractSize;
		return this;
	}

	public List<SecurityIdentification14> getUnderlyingFinancialInstrumentIdentification() {
		return underlyingFinancialInstrumentIdentification == null ? underlyingFinancialInstrumentIdentification = new ArrayList<>() : underlyingFinancialInstrumentIdentification;
	}

	public FinancialInstrumentAttributes36 setUnderlyingFinancialInstrumentIdentification(List<SecurityIdentification14> underlyingFinancialInstrumentIdentification) {
		this.underlyingFinancialInstrumentIdentification = Objects.requireNonNull(underlyingFinancialInstrumentIdentification);
		return this;
	}

	public Optional<Max350Text> getFinancialInstrumentAttributeAdditionalDetails() {
		return financialInstrumentAttributeAdditionalDetails == null ? Optional.empty() : Optional.of(financialInstrumentAttributeAdditionalDetails);
	}

	public FinancialInstrumentAttributes36 setFinancialInstrumentAttributeAdditionalDetails(Max350Text financialInstrumentAttributeAdditionalDetails) {
		this.financialInstrumentAttributeAdditionalDetails = financialInstrumentAttributeAdditionalDetails;
		return this;
	}
}