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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateAction2", propOrder = {"eventStage", "defaultOptionType", "defaultOptionNumber", "calculationMethod", "backEndOddLotSecuritiesQuantity", "frontEndOddLotSecuritiesQuantity", "minimumExercisableSecuritiesQuantity",
		"minimumExercisableMultipleSecuritiesQuantity", "incrementalDenomination", "newDenominationSecuritiesQuantity", "newBoardLotSecuritiesQuantity", "securitiesQuantitySought", "baseDenomination", "changeType", "offerType",
		"restrictionIndicator", "partialElectionIndicator", "electionType", "lotteryType", "incomeType", "dividendType", "intermediateSecuritiesDistributionType", "couponNumber", "interestAccruedNumberOfDays", "newDenominationCurrency",
		"dateDetails", "priceDetails", "periodDetails", "rateAndAmountDetails", "corporateActionAdditionalInformation", "certificationRequiredIndicator", "certificationType", "capitalGain", "taxableIncomePerShareCalculated",
		"newPlaceOfIncorporation", "renounceableEntitlementStatusType", "conversionType", "redemptionChargesAppliedIndicator", "distributionType"})
public class CorporateAction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CorporateActionEventStage1FormatChoice> eventStage;
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
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
	public static final MMMessageAttribute mmEventStage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventStage1FormatChoice.mmObject();
		}
	};
	protected CorporateActionOption1FormatChoice defaultOptionType;
	/**
	 * Identifies the option that will be selected by default if no instruction
	 * is provided by account owner.
	 * <p>
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
	public static final MMMessageAttribute mmDefaultOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionType";
			definition = "Identifies the option that will be selected by default if no instruction is provided by account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}
	};
	protected Exact3NumericText defaultOptionNumber;
	/**
	 * Identifies the option number that will be selected by default if no
	 * instruction is provided by account owner.
	 * <p>
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
	public static final MMMessageAttribute mmDefaultOptionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionNumber";
			definition = "Identifies the option number that will be selected by default if no instruction is provided by account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected CorporateActionCalculationMethod1FormatChoice calculationMethod;
	/**
	 * The method of calculation of drawings and partial redemptions.
	 * <p>
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
	public static final MMMessageAttribute mmCalculationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmCalculationMethod;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionCalculationMethod1FormatChoice.mmObject();
		}
	};
	protected UnitOrFaceAmountOrCode1Choice backEndOddLotSecuritiesQuantity;
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
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
	public static final MMMessageAttribute mmBackEndOddLotSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBackEndOddLotQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "BckEndOddLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndOddLotSecuritiesQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmountOrCode1Choice frontEndOddLotSecuritiesQuantity;
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 * <p>
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
	public static final MMMessageAttribute mmFrontEndOddLotSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmFrontEndOddLotQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "FrntEndOddLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndOddLotSecuritiesQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity;
	/**
	 * Minimum quantity of financial instrument or lot of rights/warrants that
	 * must be exercised.
	 * <p>
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
	public static final MMMessageAttribute mmMinimumExercisableSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableSecuritiesQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity;
	/**
	 * Minimum multiple quantity of financial instrument or lot of
	 * rights/warrants that must be exercised.
	 * <p>
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
	public static final MMMessageAttribute mmMinimumExercisableMultipleSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleSecuritiesQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice incrementalDenomination;
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 * <p>
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
	public static final MMMessageAttribute mmIncrementalDenomination = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Lottery.mmIncrementalDenomination;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IncrmtlDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity;
	/**
	 * New Denomination of the equity following, eg, an increase or decrease in
	 * nominal value.
	 * <p>
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
	public static final MMMessageAttribute mmNewDenominationSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New Denomination of the equity following, eg, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity;
	/**
	 * Quantity of equity that makes up the new board lot.
	 * <p>
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
	public static final MMMessageAttribute mmNewBoardLotSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewBrdLotSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up the new board lot.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmountOrCode1Choice securitiesQuantitySought;
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
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
	public static final MMMessageAttribute mmSecuritiesQuantitySought = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantitySought;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtySght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountOrCode1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice baseDenomination;
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 * <p>
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
	public static final MMMessageAttribute mmBaseDenomination = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmBaseDenomination;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "BaseDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected List<CorporateActionChangeType1FormatChoice> changeType;
	/**
	 * Specifies the type of change announced.
	 * <p>
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
	public static final MMMessageAttribute mmChangeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionChangeType1FormatChoice.mmObject();
		}
	};
	protected List<OfferType1FormatChoice> offerType;
	/**
	 * Specifies the conditions that apply to the offer.
	 * <p>
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
	public static final MMMessageAttribute mmOfferType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			complexType_lazy = () -> OfferType1FormatChoice.mmObject();
		}
	};
	protected YesNoIndicator restrictionIndicator;
	/**
	 * Indicates whether there is restrictions apply to the CA event or not.
	 * 
	 * Yes = There is restrictions. No = There is no restrictions.
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
	public static final MMMessageAttribute mmRestrictionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the CA event or not.\n\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator partialElectionIndicator;
	/**
	 * Specifies if the issuer will allow the agent to accept partial elections.
	 * It is to allow split voting over options. It allows the client to elect
	 * more than one option to be selected per designated holding.
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
	public static final MMMessageAttribute mmPartialElectionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPartialElectionIndicator;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrtlElctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ElectionMovementType1FormatChoice electionType;
	/**
	 * Specifies the effect on the holdings of electing a Corporate Action
	 * option.
	 * <p>
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
	public static final MMMessageAttribute mmElectionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a Corporate Action option.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ElectionMovementType1FormatChoice.mmObject();
		}
	};
	protected LotteryType1FormatChoice lotteryType;
	/**
	 * Specifies the type of lottery announced.
	 * <p>
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
	public static final MMMessageAttribute mmLotteryType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LotteryType1FormatChoice.mmObject();
		}
	};
	protected GenericIdentification13 incomeType;
	/**
	 * Specifies the type of income. The lists of income type codes to be used,
	 * are available on the SMPG website at www.smpg.info.
	 * <p>
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
	public static final MMMessageAttribute mmIncomeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification13.mmObject();
		}
	};
	protected CorporateActionFrequencyType1FormatChoice dividendType;
	/**
	 * Specifies the conditions in which a dividend is paid.
	 * <p>
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
	public static final MMMessageAttribute mmDividendType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDividend;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionFrequencyType1FormatChoice.mmObject();
		}
	};
	protected IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType;
	/**
	 * Type of intermediates securities distribution, eg, stock dividend,
	 * reverse right.
	 * <p>
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
	public static final MMMessageAttribute mmIntermediateSecuritiesDistributionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution, eg, stock dividend, reverse right.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntermediateSecurityDistributionType1FormatChoice.mmObject();
		}
	};
	protected List<Max3NumericText> couponNumber;
	/**
	 * Number of the coupon attached/associated with a security.
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
	public static final MMMessageAttribute mmCouponNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Number interestAccruedNumberOfDays;
	/**
	 * Number of days used for calculating the accrued interest amount.
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
	public static final MMMessageAttribute mmInterestAccruedNumberOfDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ActiveCurrencyCode newDenominationCurrency;
	/**
	 * New denomination currency of the inancial instrument.
	 * <p>
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
	public static final MMMessageAttribute mmNewDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewDnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDenominationCurrency";
			definition = "New denomination currency of the inancial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected CorporateActionDate2 dateDetails;
	/**
	 * Provides information about the dates related to a CA event.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionPrice2> priceDetails;
	/**
	 * Provides information about the prices related to a CA event.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a CA event.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice2.mmObject();
		}
	};
	protected CorporateActionPeriod1 periodDetails;
	/**
	 * Provides information about the periods related to a CA event.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod1.mmObject();
		}
	};
	protected CorporateActionRate1 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a CA event.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a CA event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate1.mmObject();
		}
	};
	protected CorporateActionNarrative1 corporateActionAdditionalInformation;
	/**
	 * Provides additional information.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCorporateActionAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative1.mmObject();
		}
	};
	protected YesNoIndicator certificationRequiredIndicator;
	/**
	 * Indicates whether certification is required from the account owner.
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
	public static final MMMessageAttribute mmCertificationRequiredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnReqrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationRequiredIndicator";
			definition = "Indicates whether certification is required from the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BeneficiaryCertificationType1FormatChoice certificationType;
	/**
	 * Type of certification which is required.
	 * <p>
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
	public static final MMMessageAttribute mmCertificationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
		}
	};
	protected EUCapitalGain2Code capitalGain;
	/**
	 * Specifies whether the capital gain is in the scope of the EU Savings
	 * directive for the income realised upon the sale, refund or redemption of
	 * shares and units (...) (Article 6(1d)).
	 * <p>
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
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (...) (Article 6(1d))."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (...) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUCapitalGain2Code.mmObject();
		}
	};
	protected TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated;
	/**
	 * Specifies whether the financial instrument calculates the taxable income
	 * per dividend/taxable income per share.
	 * <p>
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
	public static final MMMessageAttribute mmTaxableIncomePerShareCalculated = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxableIncomePerShareCalculated2Code.mmObject();
		}
	};
	protected Max70Text newPlaceOfIncorporation;
	/**
	 * New companys place of incorporation.
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
	public static final MMMessageAttribute mmNewPlaceOfIncorporation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New companys place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected RenounceableStatus1FormatChoice renounceableEntitlementStatusType;
	/**
	 * Specifies whether terms of the event allow resale of the rights.
	 * <p>
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
	public static final MMMessageAttribute mmRenounceableEntitlementStatusType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RenounceableStatus1FormatChoice.mmObject();
		}
	};
	protected ConversionType1FormatChoice conversionType;
	/**
	 * Specifies the conversion type of an instrument.
	 * <p>
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
	public static final MMMessageAttribute mmConversionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConversionType1FormatChoice.mmObject();
		}
	};
	protected YesNoIndicator redemptionChargesAppliedIndicator;
	/**
	 * Indicates whether redemption charges apply.
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
	public static final MMMessageAttribute mmRedemptionChargesAppliedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "RedChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionChargesAppliedIndicator";
			definition = "Indicates whether redemption charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DistributionType1FormatChoice distributionType;
	/**
	 * Specifies whether the proceeds of the event will be distributed on a
	 * rolling basis rather than on a specific date.
	 * <p>
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
	public static final MMMessageAttribute mmDistributionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> CorporateAction2.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionType";
			definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DistributionType1FormatChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateAction2.mmEventStage, CorporateAction2.mmDefaultOptionType, CorporateAction2.mmDefaultOptionNumber, CorporateAction2.mmCalculationMethod,
						CorporateAction2.mmBackEndOddLotSecuritiesQuantity, CorporateAction2.mmFrontEndOddLotSecuritiesQuantity, CorporateAction2.mmMinimumExercisableSecuritiesQuantity,
						CorporateAction2.mmMinimumExercisableMultipleSecuritiesQuantity, CorporateAction2.mmIncrementalDenomination, CorporateAction2.mmNewDenominationSecuritiesQuantity, CorporateAction2.mmNewBoardLotSecuritiesQuantity,
						CorporateAction2.mmSecuritiesQuantitySought, CorporateAction2.mmBaseDenomination, CorporateAction2.mmChangeType, CorporateAction2.mmOfferType, CorporateAction2.mmRestrictionIndicator,
						CorporateAction2.mmPartialElectionIndicator, CorporateAction2.mmElectionType, CorporateAction2.mmLotteryType, CorporateAction2.mmIncomeType, CorporateAction2.mmDividendType,
						CorporateAction2.mmIntermediateSecuritiesDistributionType, CorporateAction2.mmCouponNumber, CorporateAction2.mmInterestAccruedNumberOfDays, CorporateAction2.mmNewDenominationCurrency, CorporateAction2.mmDateDetails,
						CorporateAction2.mmPriceDetails, CorporateAction2.mmPeriodDetails, CorporateAction2.mmRateAndAmountDetails, CorporateAction2.mmCorporateActionAdditionalInformation, CorporateAction2.mmCertificationRequiredIndicator,
						CorporateAction2.mmCertificationType, CorporateAction2.mmCapitalGain, CorporateAction2.mmTaxableIncomePerShareCalculated, CorporateAction2.mmNewPlaceOfIncorporation,
						CorporateAction2.mmRenounceableEntitlementStatusType, CorporateAction2.mmConversionType, CorporateAction2.mmRedemptionChargesAppliedIndicator, CorporateAction2.mmDistributionType);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction2";
				definition = "Provides information about the CA event.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EvtStag")
	public List<CorporateActionEventStage1FormatChoice> getEventStage() {
		return eventStage;
	}

	public void setEventStage(List<CorporateActionEventStage1FormatChoice> eventStage) {
		this.eventStage = eventStage;
	}

	@XmlElement(name = "DfltOptnTp")
	public CorporateActionOption1FormatChoice getDefaultOptionType() {
		return defaultOptionType;
	}

	public void setDefaultOptionType(CorporateActionOption1FormatChoice defaultOptionType) {
		this.defaultOptionType = defaultOptionType;
	}

	@XmlElement(name = "DfltOptnNb")
	public Exact3NumericText getDefaultOptionNumber() {
		return defaultOptionNumber;
	}

	public void setDefaultOptionNumber(Exact3NumericText defaultOptionNumber) {
		this.defaultOptionNumber = defaultOptionNumber;
	}

	@XmlElement(name = "ClctnMtd")
	public CorporateActionCalculationMethod1FormatChoice getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(CorporateActionCalculationMethod1FormatChoice calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	@XmlElement(name = "BckEndOddLotSctiesQty")
	public UnitOrFaceAmountOrCode1Choice getBackEndOddLotSecuritiesQuantity() {
		return backEndOddLotSecuritiesQuantity;
	}

	public void setBackEndOddLotSecuritiesQuantity(UnitOrFaceAmountOrCode1Choice backEndOddLotSecuritiesQuantity) {
		this.backEndOddLotSecuritiesQuantity = backEndOddLotSecuritiesQuantity;
	}

	@XmlElement(name = "FrntEndOddLotSctiesQty")
	public UnitOrFaceAmountOrCode1Choice getFrontEndOddLotSecuritiesQuantity() {
		return frontEndOddLotSecuritiesQuantity;
	}

	public void setFrontEndOddLotSecuritiesQuantity(UnitOrFaceAmountOrCode1Choice frontEndOddLotSecuritiesQuantity) {
		this.frontEndOddLotSecuritiesQuantity = frontEndOddLotSecuritiesQuantity;
	}

	@XmlElement(name = "MinExrcblSctiesQty")
	public UnitOrFaceAmount1Choice getMinimumExercisableSecuritiesQuantity() {
		return minimumExercisableSecuritiesQuantity;
	}

	public void setMinimumExercisableSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableSecuritiesQuantity) {
		this.minimumExercisableSecuritiesQuantity = minimumExercisableSecuritiesQuantity;
	}

	@XmlElement(name = "MinExrcblMltplSctiesQty")
	public UnitOrFaceAmount1Choice getMinimumExercisableMultipleSecuritiesQuantity() {
		return minimumExercisableMultipleSecuritiesQuantity;
	}

	public void setMinimumExercisableMultipleSecuritiesQuantity(UnitOrFaceAmount1Choice minimumExercisableMultipleSecuritiesQuantity) {
		this.minimumExercisableMultipleSecuritiesQuantity = minimumExercisableMultipleSecuritiesQuantity;
	}

	@XmlElement(name = "IncrmtlDnmtn")
	public UnitOrFaceAmount1Choice getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public void setIncrementalDenomination(UnitOrFaceAmount1Choice incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
	}

	@XmlElement(name = "NewDnmtnSctiesQty")
	public UnitOrFaceAmount1Choice getNewDenominationSecuritiesQuantity() {
		return newDenominationSecuritiesQuantity;
	}

	public void setNewDenominationSecuritiesQuantity(UnitOrFaceAmount1Choice newDenominationSecuritiesQuantity) {
		this.newDenominationSecuritiesQuantity = newDenominationSecuritiesQuantity;
	}

	@XmlElement(name = "NewBrdLotSctiesQty")
	public UnitOrFaceAmount1Choice getNewBoardLotSecuritiesQuantity() {
		return newBoardLotSecuritiesQuantity;
	}

	public void setNewBoardLotSecuritiesQuantity(UnitOrFaceAmount1Choice newBoardLotSecuritiesQuantity) {
		this.newBoardLotSecuritiesQuantity = newBoardLotSecuritiesQuantity;
	}

	@XmlElement(name = "SctiesQtySght")
	public UnitOrFaceAmountOrCode1Choice getSecuritiesQuantitySought() {
		return securitiesQuantitySought;
	}

	public void setSecuritiesQuantitySought(UnitOrFaceAmountOrCode1Choice securitiesQuantitySought) {
		this.securitiesQuantitySought = securitiesQuantitySought;
	}

	@XmlElement(name = "BaseDnmtn")
	public UnitOrFaceAmount1Choice getBaseDenomination() {
		return baseDenomination;
	}

	public void setBaseDenomination(UnitOrFaceAmount1Choice baseDenomination) {
		this.baseDenomination = baseDenomination;
	}

	@XmlElement(name = "ChngTp")
	public List<CorporateActionChangeType1FormatChoice> getChangeType() {
		return changeType;
	}

	public void setChangeType(List<CorporateActionChangeType1FormatChoice> changeType) {
		this.changeType = changeType;
	}

	@XmlElement(name = "OfferTp")
	public List<OfferType1FormatChoice> getOfferType() {
		return offerType;
	}

	public void setOfferType(List<OfferType1FormatChoice> offerType) {
		this.offerType = offerType;
	}

	@XmlElement(name = "RstrctnInd")
	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public void setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
	}

	@XmlElement(name = "PrtlElctnInd")
	public YesNoIndicator getPartialElectionIndicator() {
		return partialElectionIndicator;
	}

	public void setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = partialElectionIndicator;
	}

	@XmlElement(name = "ElctnTp")
	public ElectionMovementType1FormatChoice getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionMovementType1FormatChoice electionType) {
		this.electionType = electionType;
	}

	@XmlElement(name = "LtryTp")
	public LotteryType1FormatChoice getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryType1FormatChoice lotteryType) {
		this.lotteryType = lotteryType;
	}

	@XmlElement(name = "IncmTp")
	public GenericIdentification13 getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(com.tools20022.repository.msg.GenericIdentification13 incomeType) {
		this.incomeType = incomeType;
	}

	@XmlElement(name = "DvddTp")
	public CorporateActionFrequencyType1FormatChoice getDividendType() {
		return dividendType;
	}

	public void setDividendType(CorporateActionFrequencyType1FormatChoice dividendType) {
		this.dividendType = dividendType;
	}

	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	public IntermediateSecurityDistributionType1FormatChoice getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType;
	}

	public void setIntermediateSecuritiesDistributionType(IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
	}

	@XmlElement(name = "CpnNb")
	public List<Max3NumericText> getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(List<Max3NumericText> couponNumber) {
		this.couponNumber = couponNumber;
	}

	@XmlElement(name = "IntrstAcrdNbOfDays")
	public Number getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays;
	}

	public void setInterestAccruedNumberOfDays(Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
	}

	@XmlElement(name = "NewDnmtnCcy")
	public ActiveCurrencyCode getNewDenominationCurrency() {
		return newDenominationCurrency;
	}

	public void setNewDenominationCurrency(ActiveCurrencyCode newDenominationCurrency) {
		this.newDenominationCurrency = newDenominationCurrency;
	}

	@XmlElement(name = "DtDtls")
	public CorporateActionDate2 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate2 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "PricDtls")
	public List<CorporateActionPrice2> getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(List<com.tools20022.repository.msg.CorporateActionPrice2> priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "PrdDtls")
	public CorporateActionPeriod1 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod1 periodDetails) {
		this.periodDetails = periodDetails;
	}

	@XmlElement(name = "RateAndAmtDtls")
	public CorporateActionRate1 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate1 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	@XmlElement(name = "CorpActnAddtlInf")
	public CorporateActionNarrative1 getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation;
	}

	public void setCorporateActionAdditionalInformation(com.tools20022.repository.msg.CorporateActionNarrative1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
	}

	@XmlElement(name = "CertfctnReqrdInd")
	public YesNoIndicator getCertificationRequiredIndicator() {
		return certificationRequiredIndicator;
	}

	public void setCertificationRequiredIndicator(YesNoIndicator certificationRequiredIndicator) {
		this.certificationRequiredIndicator = certificationRequiredIndicator;
	}

	@XmlElement(name = "CertfctnTp")
	public BeneficiaryCertificationType1FormatChoice getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(BeneficiaryCertificationType1FormatChoice certificationType) {
		this.certificationType = certificationType;
	}

	@XmlElement(name = "CptlGn")
	public EUCapitalGain2Code getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(EUCapitalGain2Code capitalGain) {
		this.capitalGain = capitalGain;
	}

	@XmlElement(name = "TaxblIncmPerShrClctd")
	public TaxableIncomePerShareCalculated2Code getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated;
	}

	public void setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
	}

	@XmlElement(name = "NewPlcOfIncorprtn")
	public Max70Text getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation;
	}

	public void setNewPlaceOfIncorporation(Max70Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
	}

	@XmlElement(name = "RnncblEntitlmntStsTp")
	public RenounceableStatus1FormatChoice getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType;
	}

	public void setRenounceableEntitlementStatusType(RenounceableStatus1FormatChoice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
	}

	@XmlElement(name = "ConvsTp")
	public ConversionType1FormatChoice getConversionType() {
		return conversionType;
	}

	public void setConversionType(ConversionType1FormatChoice conversionType) {
		this.conversionType = conversionType;
	}

	@XmlElement(name = "RedChrgsApldInd")
	public YesNoIndicator getRedemptionChargesAppliedIndicator() {
		return redemptionChargesAppliedIndicator;
	}

	public void setRedemptionChargesAppliedIndicator(YesNoIndicator redemptionChargesAppliedIndicator) {
		this.redemptionChargesAppliedIndicator = redemptionChargesAppliedIndicator;
	}

	@XmlElement(name = "DstrbtnTp")
	public DistributionType1FormatChoice getDistributionType() {
		return distributionType;
	}

	public void setDistributionType(DistributionType1FormatChoice distributionType) {
		this.distributionType = distributionType;
	}
}