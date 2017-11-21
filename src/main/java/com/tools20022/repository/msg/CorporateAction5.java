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
import com.tools20022.repository.area.seev.CorporateActionNotificationV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmDateDetails
 * CorporateAction5.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPeriodDetails
 * CorporateAction5.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRateAndAmountDetails
 * CorporateAction5.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPriceDetails
 * CorporateAction5.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmSecuritiesQuantity
 * CorporateAction5.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmInterestAccruedNumberOfDays
 * CorporateAction5.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCouponNumber
 * CorporateAction5.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationRequiredIndicator
 * CorporateAction5.mmCertificationRequiredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmChargesAppliedIndicator
 * CorporateAction5.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRestrictionIndicator
 * CorporateAction5.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAccruedInterestIndicator
 * CorporateAction5.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDividendType
 * CorporateAction5.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmConversionType
 * CorporateAction5.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDistributionType
 * CorporateAction5.mmDistributionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmOfferType
 * CorporateAction5.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRenounceableEntitlementStatusType
 * CorporateAction5.mmRenounceableEntitlementStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmEventStage
 * CorporateAction5.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAdditionalBusinessProcessIndicator
 * CorporateAction5.mmAdditionalBusinessProcessIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmChangeType
 * CorporateAction5.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmIntermediateSecuritiesDistributionType
 * CorporateAction5.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCapitalGainInOutIndicator
 * CorporateAction5.mmCapitalGainInOutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmTaxableIncomePerShareCalculated
 * CorporateAction5.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmElectionType
 * CorporateAction5.mmElectionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmLotteryType
 * CorporateAction5.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationType
 * CorporateAction5.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmNewPlaceOfIncorporation
 * CorporateAction5.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAdditionalInformation
 * CorporateAction5.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmCorporateActionDetails
 * CorporateActionNotificationV02.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
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
 * "CorporateAction5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7
 * CorporateAction7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateAction5", propOrder = {"dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "interestAccruedNumberOfDays", "couponNumber", "certificationRequiredIndicator",
		"chargesAppliedIndicator", "restrictionIndicator", "accruedInterestIndicator", "dividendType", "conversionType", "distributionType", "offerType", "renounceableEntitlementStatusType", "eventStage",
		"additionalBusinessProcessIndicator", "changeType", "intermediateSecuritiesDistributionType", "capitalGainInOutIndicator", "taxableIncomePerShareCalculated", "electionType", "lotteryType", "certificationType",
		"newPlaceOfIncorporation", "additionalInformation"})
public class CorporateAction5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionDate14 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate14
	 * CorporateActionDate14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate14.mmObject();
		}
	};
	protected CorporateActionPeriod6 periodDetails;
	/**
	 * Provides information about the periods related to a corporate action
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Provides information about the periods related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod6.mmObject();
		}
	};
	protected CorporateActionRate16 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate16
	 * CorporateActionRate16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Provides information about rates and amounts related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate16.mmObject();
		}
	};
	protected CorporateActionPrice17 priceDetails;
	/**
	 * Provides information about the prices related to a corporate action
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice17
	 * CorporateActionPrice17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Provides information about the prices related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice17.mmObject();
		}
	};
	protected CorporateActionQuantity3 securitiesQuantity;
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3
	 * CorporateActionQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity3.mmObject();
		}
	};
	protected Max3Number interestAccruedNumberOfDays;
	/**
	 * Number of days used for calculating the accrued interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected List<IdentificationFormat1Choice> couponNumber;
	/**
	 * Number of the coupon attached/associated with a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice
	 * IdentificationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmCouponNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationFormat1Choice.mmObject();
		}
	};
	protected YesNoIndicator certificationRequiredIndicator;
	/**
	 * Indicates whether certification is required from the account owner. Yes =
	 * certification required. No = no certification required.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Indicates whether certification is required from the account owner. \nYes = certification required.\nNo = no certification required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationRequiredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CertfctnReqrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationRequiredIndicator";
			definition = "Indicates whether certification is required from the account owner. \nYes = certification required.\nNo = no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * Indicates whether charges apply to the holder, for instance redemption
	 * charges.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAppliedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator restrictionIndicator;
	/**
	 * Indicates whether there is restrictions apply to the corporate action
	 * event or not. Yes = There is restrictions. No = There is no restrictions.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
	/**
	 * Indicates whether the holder is entitled to accrued interest.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
	 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder is entitled to accrued interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAccruedInterestIndicator;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the holder is entitled to accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DividendTypeFormat3Choice dividendType;
	/**
	 * Specifies the conditions in which a dividend is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice
	 * DividendTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmType
	 * Dividend.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmDividendType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DividendTypeFormat3Choice.mmObject();
		}
	};
	protected ConversionTypeFormat1Choice conversionType;
	/**
	 * Specifies the conversion type of an instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice
	 * ConversionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
	 * SecuritiesConversion.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmConversionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConversionTypeFormat1Choice.mmObject();
		}
	};
	protected DistributionTypeFormat1Choice distributionType;
	/**
	 * Specifies whether the proceeds of the event will be distributed on a
	 * rolling basis rather than on a specific date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice
	 * DistributionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmDistributionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionType";
			definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DistributionTypeFormat1Choice.mmObject();
		}
	};
	protected List<OfferTypeFormat1Choice> offerType;
	/**
	 * Specifies the conditions that apply to the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice
	 * OfferTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmOfferType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat1Choice.mmObject();
		}
	};
	protected RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType;
	/**
	 * Specifies whether terms of the event allow resale of the rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice
	 * RenounceableEntitlementStatusTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat1Choice.mmObject();
		}
	};
	protected List<CorporateActionEventStageFormat3Choice> eventStage;
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice
	 * CorporateActionEventStageFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmEventStage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat3Choice.mmObject();
		}
	};
	protected List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator;
	/**
	 * Specifies the type of the additional business process linked to a
	 * corporate action event such as a claim compensation or tax refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice
	 * AdditionalBusinessProcessFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat1Choice.mmObject();
		}
	};
	protected List<CorporateActionChangeTypeFormat1Choice> changeType;
	/**
	 * Specifies the type of change announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice
	 * CorporateActionChangeTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
	 * SecuritiesModification.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmChangeType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionChangeTypeFormat1Choice.mmObject();
		}
	};
	protected IntermediateSecuritiesDistributionTypeFormat5Choice intermediateSecuritiesDistributionType;
	/**
	 * Type of intermediates securities distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice
	 * IntermediateSecuritiesDistributionTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * definition} = "Type of intermediates securities distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat5Choice.mmObject();
		}
	};
	protected CapitalGainFormat1Choice capitalGainInOutIndicator;
	/**
	 * Specifies whether the capital gain is in the scope of the EU Savings
	 * directive for the income realised upon the sale, refund or redemption of
	 * shares and units (...) (Article 6(1d)).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice
	 * CapitalGainFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnInOutInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInOutIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (...) (Article 6(1d))."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCapitalGainInOutIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CptlGnInOutInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInOutIndicator";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (...) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CapitalGainFormat1Choice.mmObject();
		}
	};
	protected TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated;
	/**
	 * Specifies whether the financial instrument calculates the taxable income
	 * per dividend/taxable income per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice
	 * TaxableIncomePerShareCalculatedFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmTaxableIncomePerShareCalculated = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxableIncomePerShareCalculatedFormat1Choice.mmObject();
		}
	};
	protected ElectionTypeFormat1Choice electionType;
	/**
	 * Specifies the effect on the holdings of electing a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice
	 * ElectionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
	 * CorporateActionElection.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * "Specifies the effect on the holdings of electing a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElectionTypeFormat1Choice.mmObject();
		}
	};
	protected LotteryTypeFormat1Choice lotteryType;
	/**
	 * Specifies the type of lottery announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice
	 * LotteryTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	public static final MMMessageAssociationEnd mmLotteryType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat1Choice.mmObject();
		}
	};
	protected CertificationTypeFormat1Choice certificationType;
	/**
	 * Specifies the certification format required, this is, physical or
	 * electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice
	 * CertificationTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * definition} =
	 * "Specifies the certification format required, this is, physical or electronic format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Specifies the certification format required, this is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CertificationTypeFormat1Choice.mmObject();
		}
	};
	protected Max70Text newPlaceOfIncorporation;
	/**
	 * New company's place of incorporation.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
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
	 * definition} = "New company's place of incorporation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewPlaceOfIncorporation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New company's place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CorporateActionNarrative3 additionalInformation;
	/**
	 * Provides additional information. This field may only be used when the
	 * information to be transmitted, cannot be coded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateAction5.mmDateDetails, CorporateAction5.mmPeriodDetails, CorporateAction5.mmRateAndAmountDetails, CorporateAction5.mmPriceDetails, CorporateAction5.mmSecuritiesQuantity,
						CorporateAction5.mmInterestAccruedNumberOfDays, CorporateAction5.mmCouponNumber, CorporateAction5.mmCertificationRequiredIndicator, CorporateAction5.mmChargesAppliedIndicator,
						CorporateAction5.mmRestrictionIndicator, CorporateAction5.mmAccruedInterestIndicator, CorporateAction5.mmDividendType, CorporateAction5.mmConversionType, CorporateAction5.mmDistributionType,
						CorporateAction5.mmOfferType, CorporateAction5.mmRenounceableEntitlementStatusType, CorporateAction5.mmEventStage, CorporateAction5.mmAdditionalBusinessProcessIndicator, CorporateAction5.mmChangeType,
						CorporateAction5.mmIntermediateSecuritiesDistributionType, CorporateAction5.mmCapitalGainInOutIndicator, CorporateAction5.mmTaxableIncomePerShareCalculated, CorporateAction5.mmElectionType,
						CorporateAction5.mmLotteryType, CorporateAction5.mmCertificationType, CorporateAction5.mmNewPlaceOfIncorporation, CorporateAction5.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV02.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateAction5";
				definition = "Provides information about the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateAction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtDtls")
	public CorporateActionDate14 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate14 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "PrdDtls")
	public CorporateActionPeriod6 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod6 periodDetails) {
		this.periodDetails = periodDetails;
	}

	@XmlElement(name = "RateAndAmtDtls")
	public CorporateActionRate16 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate16 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	@XmlElement(name = "PricDtls")
	public CorporateActionPrice17 getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice17 priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "SctiesQty")
	public CorporateActionQuantity3 getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.msg.CorporateActionQuantity3 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	@XmlElement(name = "IntrstAcrdNbOfDays")
	public Max3Number getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays;
	}

	public void setInterestAccruedNumberOfDays(Max3Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
	}

	@XmlElement(name = "CpnNb")
	public List<IdentificationFormat1Choice> getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(List<IdentificationFormat1Choice> couponNumber) {
		this.couponNumber = couponNumber;
	}

	@XmlElement(name = "CertfctnReqrdInd")
	public YesNoIndicator getCertificationRequiredIndicator() {
		return certificationRequiredIndicator;
	}

	public void setCertificationRequiredIndicator(YesNoIndicator certificationRequiredIndicator) {
		this.certificationRequiredIndicator = certificationRequiredIndicator;
	}

	@XmlElement(name = "ChrgsApldInd")
	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
	}

	@XmlElement(name = "RstrctnInd")
	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public void setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
	}

	@XmlElement(name = "AcrdIntrstInd")
	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public void setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
	}

	@XmlElement(name = "DvddTp")
	public DividendTypeFormat3Choice getDividendType() {
		return dividendType;
	}

	public void setDividendType(DividendTypeFormat3Choice dividendType) {
		this.dividendType = dividendType;
	}

	@XmlElement(name = "ConvsTp")
	public ConversionTypeFormat1Choice getConversionType() {
		return conversionType;
	}

	public void setConversionType(ConversionTypeFormat1Choice conversionType) {
		this.conversionType = conversionType;
	}

	@XmlElement(name = "DstrbtnTp")
	public DistributionTypeFormat1Choice getDistributionType() {
		return distributionType;
	}

	public void setDistributionType(DistributionTypeFormat1Choice distributionType) {
		this.distributionType = distributionType;
	}

	@XmlElement(name = "OfferTp")
	public List<OfferTypeFormat1Choice> getOfferType() {
		return offerType;
	}

	public void setOfferType(List<OfferTypeFormat1Choice> offerType) {
		this.offerType = offerType;
	}

	@XmlElement(name = "RnncblEntitlmntStsTp")
	public RenounceableEntitlementStatusTypeFormat1Choice getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType;
	}

	public void setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
	}

	@XmlElement(name = "EvtStag")
	public List<CorporateActionEventStageFormat3Choice> getEventStage() {
		return eventStage;
	}

	public void setEventStage(List<CorporateActionEventStageFormat3Choice> eventStage) {
		this.eventStage = eventStage;
	}

	@XmlElement(name = "AddtlBizPrcInd")
	public List<AdditionalBusinessProcessFormat1Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator;
	}

	public void setAdditionalBusinessProcessIndicator(List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = additionalBusinessProcessIndicator;
	}

	@XmlElement(name = "ChngTp")
	public List<CorporateActionChangeTypeFormat1Choice> getChangeType() {
		return changeType;
	}

	public void setChangeType(List<CorporateActionChangeTypeFormat1Choice> changeType) {
		this.changeType = changeType;
	}

	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	public IntermediateSecuritiesDistributionTypeFormat5Choice getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType;
	}

	public void setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat5Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
	}

	@XmlElement(name = "CptlGnInOutInd")
	public CapitalGainFormat1Choice getCapitalGainInOutIndicator() {
		return capitalGainInOutIndicator;
	}

	public void setCapitalGainInOutIndicator(CapitalGainFormat1Choice capitalGainInOutIndicator) {
		this.capitalGainInOutIndicator = capitalGainInOutIndicator;
	}

	@XmlElement(name = "TaxblIncmPerShrClctd")
	public TaxableIncomePerShareCalculatedFormat1Choice getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated;
	}

	public void setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
	}

	@XmlElement(name = "ElctnTp")
	public ElectionTypeFormat1Choice getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionTypeFormat1Choice electionType) {
		this.electionType = electionType;
	}

	@XmlElement(name = "LtryTp")
	public LotteryTypeFormat1Choice getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryTypeFormat1Choice lotteryType) {
		this.lotteryType = lotteryType;
	}

	@XmlElement(name = "CertfctnTp")
	public CertificationTypeFormat1Choice getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(CertificationTypeFormat1Choice certificationType) {
		this.certificationType = certificationType;
	}

	@XmlElement(name = "NewPlcOfIncorprtn")
	public Max70Text getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation;
	}

	public void setNewPlaceOfIncorporation(Max70Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
	}

	@XmlElement(name = "AddtlInf")
	public CorporateActionNarrative3 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.CorporateActionNarrative3 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}