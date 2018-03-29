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
import com.tools20022.repository.area.seev.AgentCANotificationAdviceV01;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EUCapitalGain2Code;
import com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmEventStage
 * CorporateAction2.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDefaultOptionType
 * CorporateAction2.mmDefaultOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDefaultOptionNumber
 * CorporateAction2.mmDefaultOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCalculationMethod
 * CorporateAction2.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmBackEndOddLotSecuritiesQuantity
 * CorporateAction2.mmBackEndOddLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmFrontEndOddLotSecuritiesQuantity
 * CorporateAction2.mmFrontEndOddLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmMinimumExercisableSecuritiesQuantity
 * CorporateAction2.mmMinimumExercisableSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmMinimumExercisableMultipleSecuritiesQuantity
 * CorporateAction2.mmMinimumExercisableMultipleSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncrementalDenomination
 * CorporateAction2.mmIncrementalDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewDenominationSecuritiesQuantity
 * CorporateAction2.mmNewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewBoardLotSecuritiesQuantity
 * CorporateAction2.mmNewBoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmSecuritiesQuantitySought
 * CorporateAction2.mmSecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmBaseDenomination
 * CorporateAction2.mmBaseDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmChangeType
 * CorporateAction2.mmChangeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmOfferType
 * CorporateAction2.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRestrictionIndicator
 * CorporateAction2.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPartialElectionIndicator
 * CorporateAction2.mmPartialElectionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmElectionType
 * CorporateAction2.mmElectionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmLotteryType
 * CorporateAction2.mmLotteryType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncomeType
 * CorporateAction2.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDividendType
 * CorporateAction2.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIntermediateSecuritiesDistributionType
 * CorporateAction2.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCouponNumber
 * CorporateAction2.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmInterestAccruedNumberOfDays
 * CorporateAction2.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewDenominationCurrency
 * CorporateAction2.mmNewDenominationCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmDateDetails
 * CorporateAction2.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPriceDetails
 * CorporateAction2.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPeriodDetails
 * CorporateAction2.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRateAndAmountDetails
 * CorporateAction2.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCorporateActionAdditionalInformation
 * CorporateAction2.mmCorporateActionAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationRequiredIndicator
 * CorporateAction2.mmCertificationRequiredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationType
 * CorporateAction2.mmCertificationType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmCapitalGain
 * CorporateAction2.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmTaxableIncomePerShareCalculated
 * CorporateAction2.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewPlaceOfIncorporation
 * CorporateAction2.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRenounceableEntitlementStatusType
 * CorporateAction2.mmRenounceableEntitlementStatusType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmConversionType
 * CorporateAction2.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRedemptionChargesAppliedIndicator
 * CorporateAction2.mmRedemptionChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDistributionType
 * CorporateAction2.mmDistributionType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmCorporateActionDetails
 * AgentCANotificationAdviceV01.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the CA event."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction2", propOrder = {"eventStage", "defaultOptionType", "defaultOptionNumber", "calculationMethod", "backEndOddLotSecuritiesQuantity", "frontEndOddLotSecuritiesQuantity", "minimumExercisableSecuritiesQuantity",
		"minimumExercisableMultipleSecuritiesQuantity", "incrementalDenomination", "newDenominationSecuritiesQuantity", "newBoardLotSecuritiesQuantity", "securitiesQuantitySought", "baseDenomination", "changeType", "offerType",
		"restrictionIndicator", "partialElectionIndicator", "electionType", "lotteryType", "incomeType", "dividendType", "intermediateSecuritiesDistributionType", "couponNumber", "interestAccruedNumberOfDays", "newDenominationCurrency",
		"dateDetails", "priceDetails", "periodDetails", "rateAndAmountDetails", "corporateActionAdditionalInformation", "certificationRequiredIndicator", "certificationType", "capitalGain", "taxableIncomePerShareCalculated",
		"newPlaceOfIncorporation", "renounceableEntitlementStatusType", "conversionType", "redemptionChargesAppliedIndicator", "distributionType"})
public class CorporateAction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EvtStag")
	protected List<CorporateActionEventStage1FormatChoice> eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice
	 * CorporateActionEventStage1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, List<CorporateActionEventStage1FormatChoice>> mmEventStage = new MMMessageAttribute<CorporateAction2, List<CorporateActionEventStage1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventStage1FormatChoice.mmObject();
		}

		@Override
		public List<CorporateActionEventStage1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction2 obj, List<CorporateActionEventStage1FormatChoice> value) {
			obj.setEventStage(value);
		}
	};
	@XmlElement(name = "DfltOptnTp")
	protected CorporateActionOption1FormatChoice defaultOptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltOptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the option that will be selected by default if no instruction is provided by account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<CorporateActionOption1FormatChoice>> mmDefaultOptionType = new MMMessageAttribute<CorporateAction2, Optional<CorporateActionOption1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionType";
			definition = "Identifies the option that will be selected by default if no instruction is provided by account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}

		@Override
		public Optional<CorporateActionOption1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getDefaultOptionType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionOption1FormatChoice> value) {
			obj.setDefaultOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "DfltOptnNb")
	protected Exact3NumericText defaultOptionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltOptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultOptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the option number that will be selected by default if no instruction is provided by account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<Exact3NumericText>> mmDefaultOptionNumber = new MMMessageAttribute<CorporateAction2, Optional<Exact3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionNumber";
			definition = "Identifies the option number that will be selected by default if no instruction is provided by account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(CorporateAction2 obj) {
			return obj.getDefaultOptionNumber();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<Exact3NumericText> value) {
			obj.setDefaultOptionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnMtd")
	protected CorporateActionCalculationMethod1FormatChoice calculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionCalculationMethod1FormatChoice
	 * CorporateActionCalculationMethod1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCalculationMethod
	 * BiddingConditions.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The method of calculation of drawings and partial redemptions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<CorporateActionCalculationMethod1FormatChoice>> mmCalculationMethod = new MMMessageAttribute<CorporateAction2, Optional<CorporateActionCalculationMethod1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionCalculationMethod1FormatChoice.mmObject();
		}

		@Override
		public Optional<CorporateActionCalculationMethod1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getCalculationMethod();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionCalculationMethod1FormatChoice> value) {
			obj.setCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "BckEndOddLotSctiesQty")
	protected UnitOrFaceAmountOrCode1Choice backEndOddLotSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice
	 * UnitOrFaceAmountOrCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
	 * BiddingConditions.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckEndOddLotSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>> mmBackEndOddLotSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBackEndOddLotQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "BckEndOddLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndOddLotSecuritiesQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmountOrCode1Choice> getValue(CorporateAction2 obj) {
			return obj.getBackEndOddLotSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmountOrCode1Choice> value) {
			obj.setBackEndOddLotSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "FrntEndOddLotSctiesQty")
	protected UnitOrFaceAmountOrCode1Choice frontEndOddLotSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice
	 * UnitOrFaceAmountOrCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
	 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrntEndOddLotSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>> mmFrontEndOddLotSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmFrontEndOddLotQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "FrntEndOddLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndOddLotSecuritiesQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmountOrCode1Choice> getValue(CorporateAction2 obj) {
			return obj.getFrontEndOddLotSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmountOrCode1Choice> value) {
			obj.setFrontEndOddLotSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinExrcblSctiesQty")
	protected UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmMinimumExercisableSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableSecuritiesQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getMinimumExercisableSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setMinimumExercisableSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinExrcblMltplSctiesQty")
	protected UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblMltplSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmMinimumExercisableMultipleSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleSecuritiesQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getMinimumExercisableMultipleSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setMinimumExercisableMultipleSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IncrmtlDnmtn")
	protected UnitOrFaceAmount1Choice incrementalDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
	 * Lottery.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrmtlDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmIncrementalDenomination = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmIncrementalDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IncrmtlDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getIncrementalDenomination();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setIncrementalDenomination(value.orElse(null));
		}
	};
	@XmlElement(name = "NewDnmtnSctiesQty")
	protected UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDnmtnSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Denomination of the equity following, eg, an increase or decrease in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmNewDenominationSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New Denomination of the equity following, eg, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getNewDenominationSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setNewDenominationSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBrdLotSctiesQty")
	protected UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBrdLotSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBoardLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up the new board lot."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmNewBoardLotSecuritiesQuantity = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getNewBoardLotSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setNewBoardLotSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesQtySght")
	protected UnitOrFaceAmountOrCode1Choice securitiesQuantitySought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice
	 * UnitOrFaceAmountOrCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
	 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtySght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>> mmSecuritiesQuantitySought = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmountOrCode1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantitySought;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtySght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmountOrCode1Choice> getValue(CorporateAction2 obj) {
			return obj.getSecuritiesQuantitySought();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmountOrCode1Choice> value) {
			obj.setSecuritiesQuantitySought(value.orElse(null));
		}
	};
	@XmlElement(name = "BaseDnmtn")
	protected UnitOrFaceAmount1Choice baseDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
	 * BiddingConditions.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>> mmBaseDenomination = new MMMessageAttribute<CorporateAction2, Optional<UnitOrFaceAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBaseDenomination;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "BaseDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmount1Choice> getValue(CorporateAction2 obj) {
			return obj.getBaseDenomination();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<UnitOrFaceAmount1Choice> value) {
			obj.setBaseDenomination(value.orElse(null));
		}
	};
	@XmlElement(name = "ChngTp")
	protected List<CorporateActionChangeType1FormatChoice> changeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice
	 * CorporateActionChangeType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
	 * SecuritiesModification.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change announced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, List<CorporateActionChangeType1FormatChoice>> mmChangeType = new MMMessageAttribute<CorporateAction2, List<CorporateActionChangeType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionChangeType1FormatChoice.mmObject();
		}

		@Override
		public List<CorporateActionChangeType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(CorporateAction2 obj, List<CorporateActionChangeType1FormatChoice> value) {
			obj.setChangeType(value);
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferType1FormatChoice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice
	 * OfferType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, List<OfferType1FormatChoice>> mmOfferType = new MMMessageAttribute<CorporateAction2, List<OfferType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			complexType_lazy = () -> OfferType1FormatChoice.mmObject();
		}

		@Override
		public List<OfferType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateAction2 obj, List<OfferType1FormatChoice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "RstrctnInd")
	protected YesNoIndicator restrictionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
	 * CorporateActionEvent.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is restrictions apply to the CA event or not.\n\nYes = There is restrictions.\nNo = There is no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>> mmRestrictionIndicator = new MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the CA event or not.\n\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction2 obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<YesNoIndicator> value) {
			obj.setRestrictionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlElctnInd")
	protected YesNoIndicator partialElectionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPartialElectionIndicator
	 * CorporateActionEvent.mmPartialElectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlElctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialElectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>> mmPartialElectionIndicator = new MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPartialElectionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrtlElctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction2 obj) {
			return obj.getPartialElectionIndicator();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<YesNoIndicator> value) {
			obj.setPartialElectionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnTp")
	protected ElectionMovementType1FormatChoice electionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ElectionMovementType1FormatChoice
	 * ElectionMovementType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
	 * CorporateActionElection.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the effect on the holdings of electing a Corporate Action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<ElectionMovementType1FormatChoice>> mmElectionType = new MMMessageAttribute<CorporateAction2, Optional<ElectionMovementType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a Corporate Action option.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ElectionMovementType1FormatChoice.mmObject();
		}

		@Override
		public Optional<ElectionMovementType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getElectionType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<ElectionMovementType1FormatChoice> value) {
			obj.setElectionType(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryType1FormatChoice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice
	 * LotteryType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<LotteryType1FormatChoice>> mmLotteryType = new MMMessageAttribute<CorporateAction2, Optional<LotteryType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LotteryType1FormatChoice.mmObject();
		}

		@Override
		public Optional<LotteryType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<LotteryType1FormatChoice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmTp")
	protected GenericIdentification13 incomeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13
	 * GenericIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<GenericIdentification13>> mmIncomeType = new MMMessageAttribute<CorporateAction2, Optional<GenericIdentification13>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification13.mmObject();
		}

		@Override
		public Optional<GenericIdentification13> getValue(CorporateAction2 obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<GenericIdentification13> value) {
			obj.setIncomeType(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddTp")
	protected CorporateActionFrequencyType1FormatChoice dividendType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice
	 * CorporateActionFrequencyType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions in which a dividend is paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<CorporateActionFrequencyType1FormatChoice>> mmDividendType = new MMMessageAttribute<CorporateAction2, Optional<CorporateActionFrequencyType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionFrequencyType1FormatChoice.mmObject();
		}

		@Override
		public Optional<CorporateActionFrequencyType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getDividendType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionFrequencyType1FormatChoice> value) {
			obj.setDividendType(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice
	 * IntermediateSecurityDistributionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of intermediates securities distribution, eg, stock dividend, reverse right."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<IntermediateSecurityDistributionType1FormatChoice>> mmIntermediateSecuritiesDistributionType = new MMMessageAttribute<CorporateAction2, Optional<IntermediateSecurityDistributionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution, eg, stock dividend, reverse right.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntermediateSecurityDistributionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<IntermediateSecurityDistributionType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getIntermediateSecuritiesDistributionType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<IntermediateSecurityDistributionType1FormatChoice> value) {
			obj.setIntermediateSecuritiesDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnNb")
	protected List<Max3NumericText> couponNumber;
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
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached/associated with a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, List<Max3NumericText>> mmCouponNumber = new MMMessageAttribute<CorporateAction2, List<Max3NumericText>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public List<Max3NumericText> getValue(CorporateAction2 obj) {
			return obj.getCouponNumber();
		}

		@Override
		public void setValue(CorporateAction2 obj, List<Max3NumericText> value) {
			obj.setCouponNumber(value);
		}
	};
	@XmlElement(name = "IntrstAcrdNbOfDays")
	protected Number interestAccruedNumberOfDays;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrdNbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccruedNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days used for calculating the accrued interest amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<Number>> mmInterestAccruedNumberOfDays = new MMMessageAttribute<CorporateAction2, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CorporateAction2 obj) {
			return obj.getInterestAccruedNumberOfDays();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<Number> value) {
			obj.setInterestAccruedNumberOfDays(value.orElse(null));
		}
	};
	@XmlElement(name = "NewDnmtnCcy")
	protected ActiveCurrencyCode newDenominationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New denomination currency of the inancial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<ActiveCurrencyCode>> mmNewDenominationCurrency = new MMMessageAttribute<CorporateAction2, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationCurrency";
			definition = "New denomination currency of the inancial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CorporateAction2 obj) {
			return obj.getNewDenominationCurrency();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setNewDenominationCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate2 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate2
	 * CorporateActionDate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionDate2>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionDate2>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate2.mmObject();
		}

		@Override
		public Optional<CorporateActionDate2> getValue(CorporateAction2 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionDate2> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<CorporateActionPrice2> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice2
	 * CorporateActionPrice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction2, List<CorporateActionPrice2>> mmPriceDetails = new MMMessageAssociationEnd<CorporateAction2, List<CorporateActionPrice2>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a CA event.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice2.mmObject();
		}

		@Override
		public List<CorporateActionPrice2> getValue(CorporateAction2 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateAction2 obj, List<CorporateActionPrice2> value) {
			obj.setPriceDetails(value);
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod1 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1
	 * CorporateActionPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionPeriod1>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionPeriod1>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod1.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod1> getValue(CorporateAction2 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionPeriod1> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate1 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate1
	 * CorporateActionRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionRate1>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionRate1>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate1.mmObject();
		}

		@Override
		public Optional<CorporateActionRate1> getValue(CorporateAction2 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionRate1> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnAddtlInf")
	protected CorporateActionNarrative1 corporateActionAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1
	 * CorporateActionNarrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionNarrative1>> mmCorporateActionAdditionalInformation = new MMMessageAssociationEnd<CorporateAction2, Optional<CorporateActionNarrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative1.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative1> getValue(CorporateAction2 obj) {
			return obj.getCorporateActionAdditionalInformation();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<CorporateActionNarrative1> value) {
			obj.setCorporateActionAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnReqrdInd")
	protected YesNoIndicator certificationRequiredIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnReqrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationRequiredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification is required from the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>> mmCertificationRequiredIndicator = new MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnReqrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationRequiredIndicator";
			definition = "Indicates whether certification is required from the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction2 obj) {
			return obj.getCertificationRequiredIndicator();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationRequiredIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected BeneficiaryCertificationType1FormatChoice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<BeneficiaryCertificationType1FormatChoice>> mmCertificationType = new MMMessageAttribute<CorporateAction2, Optional<BeneficiaryCertificationType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
		}

		@Override
		public Optional<BeneficiaryCertificationType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<BeneficiaryCertificationType1FormatChoice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGn")
	protected EUCapitalGain2Code capitalGain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d))."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<EUCapitalGain2Code>> mmCapitalGain = new MMMessageAttribute<CorporateAction2, Optional<EUCapitalGain2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUCapitalGain2Code.mmObject();
		}

		@Override
		public Optional<EUCapitalGain2Code> getValue(CorporateAction2 obj) {
			return obj.getCapitalGain();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<EUCapitalGain2Code> value) {
			obj.setCapitalGain(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code
	 * TaxableIncomePerShareCalculated2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<TaxableIncomePerShareCalculated2Code>> mmTaxableIncomePerShareCalculated = new MMMessageAttribute<CorporateAction2, Optional<TaxableIncomePerShareCalculated2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxableIncomePerShareCalculated2Code.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculated2Code> getValue(CorporateAction2 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<TaxableIncomePerShareCalculated2Code> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPlcOfIncorprtn")
	protected Max70Text newPlaceOfIncorporation;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlcOfIncorprtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New companys place of incorporation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<Max70Text>> mmNewPlaceOfIncorporation = new MMMessageAttribute<CorporateAction2, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New companys place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CorporateAction2 obj) {
			return obj.getNewPlaceOfIncorporation();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<Max70Text> value) {
			obj.setNewPlaceOfIncorporation(value.orElse(null));
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableStatus1FormatChoice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableStatus1FormatChoice
	 * RenounceableStatus1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<RenounceableStatus1FormatChoice>> mmRenounceableEntitlementStatusType = new MMMessageAttribute<CorporateAction2, Optional<RenounceableStatus1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RenounceableStatus1FormatChoice.mmObject();
		}

		@Override
		public Optional<RenounceableStatus1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getRenounceableEntitlementStatusType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<RenounceableStatus1FormatChoice> value) {
			obj.setRenounceableEntitlementStatusType(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsTp")
	protected ConversionType1FormatChoice conversionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice
	 * ConversionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
	 * SecuritiesConversion.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<ConversionType1FormatChoice>> mmConversionType = new MMMessageAttribute<CorporateAction2, Optional<ConversionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConversionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<ConversionType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getConversionType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<ConversionType1FormatChoice> value) {
			obj.setConversionType(value.orElse(null));
		}
	};
	@XmlElement(name = "RedChrgsApldInd")
	protected YesNoIndicator redemptionChargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedChrgsApldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether redemption charges apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>> mmRedemptionChargesAppliedIndicator = new MMMessageAttribute<CorporateAction2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RedChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionChargesAppliedIndicator";
			definition = "Indicates whether redemption charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction2 obj) {
			return obj.getRedemptionChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<YesNoIndicator> value) {
			obj.setRedemptionChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DstrbtnTp")
	protected DistributionType1FormatChoice distributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice
	 * DistributionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction2, Optional<DistributionType1FormatChoice>> mmDistributionType = new MMMessageAttribute<CorporateAction2, Optional<DistributionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionType";
			definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DistributionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<DistributionType1FormatChoice> getValue(CorporateAction2 obj) {
			return obj.getDistributionType();
		}

		@Override
		public void setValue(CorporateAction2 obj, Optional<DistributionType1FormatChoice> value) {
			obj.setDistributionType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.mmEventStage, com.tools20022.repository.msg.CorporateAction2.mmDefaultOptionType,
						com.tools20022.repository.msg.CorporateAction2.mmDefaultOptionNumber, com.tools20022.repository.msg.CorporateAction2.mmCalculationMethod,
						com.tools20022.repository.msg.CorporateAction2.mmBackEndOddLotSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction2.mmFrontEndOddLotSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction2.mmMinimumExercisableSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction2.mmMinimumExercisableMultipleSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction2.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateAction2.mmNewDenominationSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction2.mmNewBoardLotSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction2.mmSecuritiesQuantitySought,
						com.tools20022.repository.msg.CorporateAction2.mmBaseDenomination, com.tools20022.repository.msg.CorporateAction2.mmChangeType, com.tools20022.repository.msg.CorporateAction2.mmOfferType,
						com.tools20022.repository.msg.CorporateAction2.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction2.mmPartialElectionIndicator, com.tools20022.repository.msg.CorporateAction2.mmElectionType,
						com.tools20022.repository.msg.CorporateAction2.mmLotteryType, com.tools20022.repository.msg.CorporateAction2.mmIncomeType, com.tools20022.repository.msg.CorporateAction2.mmDividendType,
						com.tools20022.repository.msg.CorporateAction2.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction2.mmCouponNumber,
						com.tools20022.repository.msg.CorporateAction2.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction2.mmNewDenominationCurrency, com.tools20022.repository.msg.CorporateAction2.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction2.mmPriceDetails, com.tools20022.repository.msg.CorporateAction2.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction2.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction2.mmCorporateActionAdditionalInformation, com.tools20022.repository.msg.CorporateAction2.mmCertificationRequiredIndicator,
						com.tools20022.repository.msg.CorporateAction2.mmCertificationType, com.tools20022.repository.msg.CorporateAction2.mmCapitalGain, com.tools20022.repository.msg.CorporateAction2.mmTaxableIncomePerShareCalculated,
						com.tools20022.repository.msg.CorporateAction2.mmNewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction2.mmRenounceableEntitlementStatusType,
						com.tools20022.repository.msg.CorporateAction2.mmConversionType, com.tools20022.repository.msg.CorporateAction2.mmRedemptionChargesAppliedIndicator, com.tools20022.repository.msg.CorporateAction2.mmDistributionType);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction2";
				definition = "Provides information about the CA event.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CorporateActionEventStage1FormatChoice> getEventStage() {
		return eventStage == null ? eventStage = new ArrayList<>() : eventStage;
	}

	public CorporateAction2 setEventStage(List<CorporateActionEventStage1FormatChoice> eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public Optional<CorporateActionOption1FormatChoice> getDefaultOptionType() {
		return defaultOptionType == null ? Optional.empty() : Optional.of(defaultOptionType);
	}

	public CorporateAction2 setDefaultOptionType(CorporateActionOption1FormatChoice defaultOptionType) {
		this.defaultOptionType = defaultOptionType;
		return this;
	}

	public Optional<Exact3NumericText> getDefaultOptionNumber() {
		return defaultOptionNumber == null ? Optional.empty() : Optional.of(defaultOptionNumber);
	}

	public CorporateAction2 setDefaultOptionNumber(Exact3NumericText defaultOptionNumber) {
		this.defaultOptionNumber = defaultOptionNumber;
		return this;
	}

	public Optional<CorporateActionCalculationMethod1FormatChoice> getCalculationMethod() {
		return calculationMethod == null ? Optional.empty() : Optional.of(calculationMethod);
	}

	public CorporateAction2 setCalculationMethod(CorporateActionCalculationMethod1FormatChoice calculationMethod) {
		this.calculationMethod = calculationMethod;
		return this;
	}

	public Optional<UnitOrFaceAmountOrCode1Choice> getBackEndOddLotSecuritiesQuantity() {
		return backEndOddLotSecuritiesQuantity == null ? Optional.empty() : Optional.of(backEndOddLotSecuritiesQuantity);
	}

	public CorporateAction2 setBackEndOddLotSecuritiesQuantity(UnitOrFaceAmountOrCode1Choice backEndOddLotSecuritiesQuantity) {
		this.backEndOddLotSecuritiesQuantity = backEndOddLotSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmountOrCode1Choice> getFrontEndOddLotSecuritiesQuantity() {
		return frontEndOddLotSecuritiesQuantity == null ? Optional.empty() : Optional.of(frontEndOddLotSecuritiesQuantity);
	}

	public CorporateAction2 setFrontEndOddLotSecuritiesQuantity(UnitOrFaceAmountOrCode1Choice frontEndOddLotSecuritiesQuantity) {
		this.frontEndOddLotSecuritiesQuantity = frontEndOddLotSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getMinimumExercisableSecuritiesQuantity() {
		return minimumExercisableSecuritiesQuantity == null ? Optional.empty() : Optional.of(minimumExercisableSecuritiesQuantity);
	}

	public CorporateAction2 setMinimumExercisableSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity) {
		this.minimumExercisableSecuritiesQuantity = minimumExercisableSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getMinimumExercisableMultipleSecuritiesQuantity() {
		return minimumExercisableMultipleSecuritiesQuantity == null ? Optional.empty() : Optional.of(minimumExercisableMultipleSecuritiesQuantity);
	}

	public CorporateAction2 setMinimumExercisableMultipleSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity) {
		this.minimumExercisableMultipleSecuritiesQuantity = minimumExercisableMultipleSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getIncrementalDenomination() {
		return incrementalDenomination == null ? Optional.empty() : Optional.of(incrementalDenomination);
	}

	public CorporateAction2 setIncrementalDenomination(UnitOrFaceAmount1Choice incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getNewDenominationSecuritiesQuantity() {
		return newDenominationSecuritiesQuantity == null ? Optional.empty() : Optional.of(newDenominationSecuritiesQuantity);
	}

	public CorporateAction2 setNewDenominationSecuritiesQuantity(UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity) {
		this.newDenominationSecuritiesQuantity = newDenominationSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getNewBoardLotSecuritiesQuantity() {
		return newBoardLotSecuritiesQuantity == null ? Optional.empty() : Optional.of(newBoardLotSecuritiesQuantity);
	}

	public CorporateAction2 setNewBoardLotSecuritiesQuantity(UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity) {
		this.newBoardLotSecuritiesQuantity = newBoardLotSecuritiesQuantity;
		return this;
	}

	public Optional<UnitOrFaceAmountOrCode1Choice> getSecuritiesQuantitySought() {
		return securitiesQuantitySought == null ? Optional.empty() : Optional.of(securitiesQuantitySought);
	}

	public CorporateAction2 setSecuritiesQuantitySought(UnitOrFaceAmountOrCode1Choice securitiesQuantitySought) {
		this.securitiesQuantitySought = securitiesQuantitySought;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getBaseDenomination() {
		return baseDenomination == null ? Optional.empty() : Optional.of(baseDenomination);
	}

	public CorporateAction2 setBaseDenomination(UnitOrFaceAmount1Choice baseDenomination) {
		this.baseDenomination = baseDenomination;
		return this;
	}

	public List<CorporateActionChangeType1FormatChoice> getChangeType() {
		return changeType == null ? changeType = new ArrayList<>() : changeType;
	}

	public CorporateAction2 setChangeType(List<CorporateActionChangeType1FormatChoice> changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public List<OfferType1FormatChoice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateAction2 setOfferType(List<OfferType1FormatChoice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<YesNoIndicator> getRestrictionIndicator() {
		return restrictionIndicator == null ? Optional.empty() : Optional.of(restrictionIndicator);
	}

	public CorporateAction2 setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPartialElectionIndicator() {
		return partialElectionIndicator == null ? Optional.empty() : Optional.of(partialElectionIndicator);
	}

	public CorporateAction2 setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = partialElectionIndicator;
		return this;
	}

	public Optional<ElectionMovementType1FormatChoice> getElectionType() {
		return electionType == null ? Optional.empty() : Optional.of(electionType);
	}

	public CorporateAction2 setElectionType(ElectionMovementType1FormatChoice electionType) {
		this.electionType = electionType;
		return this;
	}

	public Optional<LotteryType1FormatChoice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction2 setLotteryType(LotteryType1FormatChoice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}

	public Optional<GenericIdentification13> getIncomeType() {
		return incomeType == null ? Optional.empty() : Optional.of(incomeType);
	}

	public CorporateAction2 setIncomeType(GenericIdentification13 incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	public Optional<CorporateActionFrequencyType1FormatChoice> getDividendType() {
		return dividendType == null ? Optional.empty() : Optional.of(dividendType);
	}

	public CorporateAction2 setDividendType(CorporateActionFrequencyType1FormatChoice dividendType) {
		this.dividendType = dividendType;
		return this;
	}

	public Optional<IntermediateSecurityDistributionType1FormatChoice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateAction2 setIntermediateSecuritiesDistributionType(IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public List<Max3NumericText> getCouponNumber() {
		return couponNumber == null ? couponNumber = new ArrayList<>() : couponNumber;
	}

	public CorporateAction2 setCouponNumber(List<Max3NumericText> couponNumber) {
		this.couponNumber = Objects.requireNonNull(couponNumber);
		return this;
	}

	public Optional<Number> getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays == null ? Optional.empty() : Optional.of(interestAccruedNumberOfDays);
	}

	public CorporateAction2 setInterestAccruedNumberOfDays(Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
		return this;
	}

	public Optional<ActiveCurrencyCode> getNewDenominationCurrency() {
		return newDenominationCurrency == null ? Optional.empty() : Optional.of(newDenominationCurrency);
	}

	public CorporateAction2 setNewDenominationCurrency(ActiveCurrencyCode newDenominationCurrency) {
		this.newDenominationCurrency = newDenominationCurrency;
		return this;
	}

	public Optional<CorporateActionDate2> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction2 setDateDetails(CorporateActionDate2 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public List<CorporateActionPrice2> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public CorporateAction2 setPriceDetails(List<CorporateActionPrice2> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public Optional<CorporateActionPeriod1> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateAction2 setPeriodDetails(CorporateActionPeriod1 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate1> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateAction2 setRateAndAmountDetails(CorporateActionRate1 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionNarrative1> getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation == null ? Optional.empty() : Optional.of(corporateActionAdditionalInformation);
	}

	public CorporateAction2 setCorporateActionAdditionalInformation(CorporateActionNarrative1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
		return this;
	}

	public Optional<YesNoIndicator> getCertificationRequiredIndicator() {
		return certificationRequiredIndicator == null ? Optional.empty() : Optional.of(certificationRequiredIndicator);
	}

	public CorporateAction2 setCertificationRequiredIndicator(YesNoIndicator certificationRequiredIndicator) {
		this.certificationRequiredIndicator = certificationRequiredIndicator;
		return this;
	}

	public Optional<BeneficiaryCertificationType1FormatChoice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateAction2 setCertificationType(BeneficiaryCertificationType1FormatChoice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<EUCapitalGain2Code> getCapitalGain() {
		return capitalGain == null ? Optional.empty() : Optional.of(capitalGain);
	}

	public CorporateAction2 setCapitalGain(EUCapitalGain2Code capitalGain) {
		this.capitalGain = capitalGain;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculated2Code> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public CorporateAction2 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<Max70Text> getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation == null ? Optional.empty() : Optional.of(newPlaceOfIncorporation);
	}

	public CorporateAction2 setNewPlaceOfIncorporation(Max70Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
		return this;
	}

	public Optional<RenounceableStatus1FormatChoice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public CorporateAction2 setRenounceableEntitlementStatusType(RenounceableStatus1FormatChoice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public Optional<ConversionType1FormatChoice> getConversionType() {
		return conversionType == null ? Optional.empty() : Optional.of(conversionType);
	}

	public CorporateAction2 setConversionType(ConversionType1FormatChoice conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	public Optional<YesNoIndicator> getRedemptionChargesAppliedIndicator() {
		return redemptionChargesAppliedIndicator == null ? Optional.empty() : Optional.of(redemptionChargesAppliedIndicator);
	}

	public CorporateAction2 setRedemptionChargesAppliedIndicator(YesNoIndicator redemptionChargesAppliedIndicator) {
		this.redemptionChargesAppliedIndicator = redemptionChargesAppliedIndicator;
		return this;
	}

	public Optional<DistributionType1FormatChoice> getDistributionType() {
		return distributionType == null ? Optional.empty() : Optional.of(distributionType);
	}

	public CorporateAction2 setDistributionType(DistributionType1FormatChoice distributionType) {
		this.distributionType = distributionType;
		return this;
	}
}