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
import com.tools20022.repository.area.seev.CorporateActionNotificationV04;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmDateDetails
 * CorporateAction10.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPeriodDetails
 * CorporateAction10.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRateAndAmountDetails
 * CorporateAction10.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPriceDetails
 * CorporateAction10.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmSecuritiesQuantity
 * CorporateAction10.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmInterestAccruedNumberOfDays
 * CorporateAction10.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCouponNumber
 * CorporateAction10.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCertificationBreakdownIndicator
 * CorporateAction10.mmCertificationBreakdownIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmChargesAppliedIndicator
 * CorporateAction10.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRestrictionIndicator
 * CorporateAction10.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmAccruedInterestIndicator
 * CorporateAction10.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmLetterOfGuaranteedDeliveryIndicator
 * CorporateAction10.mmLetterOfGuaranteedDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmDividendType
 * CorporateAction10.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmConversionType
 * CorporateAction10.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPaymentOccurrenceType
 * CorporateAction10.mmPaymentOccurrenceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction10#mmOfferType
 * CorporateAction10.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRenounceableEntitlementStatusType
 * CorporateAction10.mmRenounceableEntitlementStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction10#mmEventStage
 * CorporateAction10.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmAdditionalBusinessProcessIndicator
 * CorporateAction10.mmAdditionalBusinessProcessIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction10#mmChangeType
 * CorporateAction10.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmIntermediateSecuritiesDistributionType
 * CorporateAction10.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCapitalGainInOutIndicator
 * CorporateAction10.mmCapitalGainInOutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmTaxableIncomePerShareCalculated
 * CorporateAction10.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmElectionType
 * CorporateAction10.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmLotteryType
 * CorporateAction10.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCertificationType
 * CorporateAction10.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmNewPlaceOfIncorporation
 * CorporateAction10.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmAdditionalInformation
 * CorporateAction10.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmCorporateActionDetails
 * CorporateActionNotificationV04.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateAction10
 * ConstraintCoexistenceQuantityRule.forCorporateAction10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction12
 * CorporateAction12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateAction7 CorporateAction7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction10", propOrder = {"dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "interestAccruedNumberOfDays", "couponNumber", "certificationBreakdownIndicator",
		"chargesAppliedIndicator", "restrictionIndicator", "accruedInterestIndicator", "letterOfGuaranteedDeliveryIndicator", "dividendType", "conversionType", "paymentOccurrenceType", "offerType", "renounceableEntitlementStatusType",
		"eventStage", "additionalBusinessProcessIndicator", "changeType", "intermediateSecuritiesDistributionType", "capitalGainInOutIndicator", "taxableIncomePerShareCalculated", "electionType", "lotteryType", "certificationType",
		"newPlaceOfIncorporation", "additionalInformation"})
public class CorporateAction10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate27 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate27
	 * CorporateActionDate27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmDateDetails
	 * CorporateAction12.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmDateDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate27.mmObject();
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod8 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8
	 * CorporateActionPeriod8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmPeriodDetails
	 * CorporateAction12.mmPeriodDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmPeriodDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod8.mmObject();
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate35 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate35
	 * CorporateActionRate35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRateAndAmountDetails
	 * CorporateAction12.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmRateAndAmountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate35.mmObject();
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice17 priceDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmPriceDetails
	 * CorporateAction12.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmPriceDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice17.mmObject();
		}
	};
	@XmlElement(name = "SctiesQty")
	protected CorporateActionQuantity5 securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5
	 * CorporateActionQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmSecuritiesQuantity
	 * CorporateAction12.mmSecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmSecuritiesQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity5.mmObject();
		}
	};
	@XmlElement(name = "IntrstAcrdNbOfDays")
	protected Max3Number interestAccruedNumberOfDays;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrdNbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmInterestAccruedNumberOfDays
	 * CorporateAction12.mmInterestAccruedNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestAccruedNumberOfDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmInterestAccruedNumberOfDays);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	@XmlElement(name = "CpnNb")
	protected List<IdentificationFormat1Choice> couponNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::COUP</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCouponNumber
	 * CorporateAction12.mmCouponNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCouponNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmCouponNumber);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "CertfctnBrkdwnInd")
	protected YesNoIndicator certificationBreakdownIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CEFI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdownIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCertificationBreakdownIndicator
	 * CorporateAction12.mmCertificationBreakdownIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationBreakdownIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CEFI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownIndicator";
			definition = "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmCertificationBreakdownIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ChrgsApldInd")
	protected YesNoIndicator chargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::RCHG</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmChargesAppliedIndicator
	 * CorporateAction12.mmChargesAppliedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAppliedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::RCHG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmChargesAppliedIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COMP</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRestrictionIndicator
	 * CorporateAction12.mmRestrictionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmRestrictionIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "AcrdIntrstInd")
	protected YesNoIndicator accruedInterestIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
	 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmAccruedInterestIndicator
	 * CorporateAction12.mmAccruedInterestIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAccruedInterestIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the holder is entitled to accrued interest.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmAccruedInterestIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "LttrOfGrntedDlvryInd")
	protected YesNoIndicator letterOfGuaranteedDeliveryIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrntedDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteedDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmLetterOfGuaranteedDeliveryIndicator
	 * CorporateAction12.mmLetterOfGuaranteedDeliveryIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterOfGuaranteedDeliveryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrntedDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteedDeliveryIndicator";
			definition = "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmLetterOfGuaranteedDeliveryIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DvddTp")
	protected DividendTypeFormat3Choice dividendType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice
	 * DividendTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DIVI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions in which a dividend is paid."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmDividendType
	 * CorporateAction12.mmDividendType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDividendType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DIVI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmDividendType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DividendTypeFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "ConvsTp")
	protected ConversionTypeFormat1Choice conversionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CONV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmConversionType
	 * CorporateAction12.mmConversionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConversionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CONV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmConversionType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConversionTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "PmtOcrncTp")
	protected DistributionTypeFormat3Choice paymentOccurrenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice
	 * DistributionTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtOcrncTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DITY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOccurrenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions in which the payment of the proceeds occurs."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmOccurrenceType
	 * CorporateAction12.mmOccurrenceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentOccurrenceType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "PmtOcrncTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DITY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOccurrenceType";
			definition = "Specifies the conditions in which the payment of the proceeds occurs.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmOccurrenceType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DistributionTypeFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferTypeFormat3Choice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice
	 * OfferTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OFFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmOfferType
	 * CorporateAction12.mmOfferType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OFFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmOfferType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SELL</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRenounceableEntitlementStatusType
	 * CorporateAction12.mmRenounceableEntitlementStatusType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmRenounceableEntitlementStatusType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "EvtStag")
	protected List<CorporateActionEventStageFormat3Choice> eventStage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ESTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmEventStage
	 * CorporateAction12.mmEventStage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventStage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ESTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmEventStage);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlBizPrcInd")
	protected List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ADDB</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmAdditionalBusinessProcessIndicator
	 * CorporateAction12.mmAdditionalBusinessProcessIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ADDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmAdditionalBusinessProcessIndicator);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "ChngTp")
	protected List<CorporateActionChangeTypeFormat1Choice> changeType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change announced."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmChangeType
	 * CorporateAction12.mmChangeType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChangeType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CHAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmChangeType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionChangeTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecuritiesDistributionTypeFormat9Choice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat9Choice
	 * IntermediateSecuritiesDistributionTypeFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RHDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of intermediates securities distribution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmIntermediateSecuritiesDistributionType
	 * CorporateAction12.mmIntermediateSecuritiesDistributionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RHDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmIntermediateSecuritiesDistributionType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat9Choice.mmObject();
		}
	};
	@XmlElement(name = "CptlGnInOutInd")
	protected CapitalGainFormat1Choice capitalGainInOutIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnInOutInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ECIO</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCapitalGainInOutIndicator
	 * CorporateAction12.mmCapitalGainInOutIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCapitalGainInOutIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "CptlGnInOutInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ECIO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInOutIndicator";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (...) (Article 6(1d)).";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmCapitalGainInOutIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CapitalGainFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TDTA</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmTaxableIncomePerShareCalculated
	 * CorporateAction12.mmTaxableIncomePerShareCalculated}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxableIncomePerShareCalculated = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TDTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmTaxableIncomePerShareCalculated);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxableIncomePerShareCalculatedFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "ElctnTp")
	protected ElectionTypeFormat1Choice electionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ELCT</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmElectionType
	 * CorporateAction12.mmElectionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ELCT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmElectionType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElectionTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat1Choice lotteryType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmLotteryType
	 * CorporateAction12.mmLotteryType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotteryType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmLotteryType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected CertificationTypeFormat1Choice certificationType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCertificationType
	 * CorporateAction12.mmCertificationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Specifies the certification format required, this is, physical or electronic format.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmCertificationType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CertificationTypeFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "NewPlcOfIncorprtn")
	protected Max350Text newPlaceOfIncorporation;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlcOfIncorprtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94G::NPLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New company's place of incorporation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmNewPlaceOfIncorporation
	 * CorporateAction12.mmNewPlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewPlaceOfIncorporation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94G::NPLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New company's place of incorporation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmNewPlaceOfIncorporation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative24 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative24
	 * CorporateActionNarrative24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmAdditionalInformation
	 * CorporateAction12.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction10.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.CorporateAction10.mmDateDetails, com.tools20022.repository.msg.CorporateAction10.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction10.mmRateAndAmountDetails,
								com.tools20022.repository.msg.CorporateAction10.mmPriceDetails, com.tools20022.repository.msg.CorporateAction10.mmSecuritiesQuantity,
								com.tools20022.repository.msg.CorporateAction10.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction10.mmCouponNumber,
								com.tools20022.repository.msg.CorporateAction10.mmCertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateAction10.mmChargesAppliedIndicator,
								com.tools20022.repository.msg.CorporateAction10.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction10.mmAccruedInterestIndicator,
								com.tools20022.repository.msg.CorporateAction10.mmLetterOfGuaranteedDeliveryIndicator, com.tools20022.repository.msg.CorporateAction10.mmDividendType,
								com.tools20022.repository.msg.CorporateAction10.mmConversionType, com.tools20022.repository.msg.CorporateAction10.mmPaymentOccurrenceType, com.tools20022.repository.msg.CorporateAction10.mmOfferType,
								com.tools20022.repository.msg.CorporateAction10.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction10.mmEventStage,
								com.tools20022.repository.msg.CorporateAction10.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction10.mmChangeType,
								com.tools20022.repository.msg.CorporateAction10.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction10.mmCapitalGainInOutIndicator,
								com.tools20022.repository.msg.CorporateAction10.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction10.mmElectionType,
								com.tools20022.repository.msg.CorporateAction10.mmLotteryType, com.tools20022.repository.msg.CorporateAction10.mmCertificationType, com.tools20022.repository.msg.CorporateAction10.mmNewPlaceOfIncorporation,
								com.tools20022.repository.msg.CorporateAction10.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV04.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateAction10);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateAction10";
				definition = "Provides information about the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateAction12.mmObject());
				previousVersion_lazy = () -> CorporateAction7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate27> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction10 setDateDetails(com.tools20022.repository.msg.CorporateActionDate27 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod8> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateAction10 setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod8 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate35> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateAction10 setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate35 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice17> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateAction10 setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice17 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<CorporateActionQuantity5> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public CorporateAction10 setSecuritiesQuantity(com.tools20022.repository.msg.CorporateActionQuantity5 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public Optional<Max3Number> getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays == null ? Optional.empty() : Optional.of(interestAccruedNumberOfDays);
	}

	public CorporateAction10 setInterestAccruedNumberOfDays(Max3Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
		return this;
	}

	public List<IdentificationFormat1Choice> getCouponNumber() {
		return couponNumber == null ? couponNumber = new ArrayList<>() : couponNumber;
	}

	public CorporateAction10 setCouponNumber(List<IdentificationFormat1Choice> couponNumber) {
		this.couponNumber = Objects.requireNonNull(couponNumber);
		return this;
	}

	public Optional<YesNoIndicator> getCertificationBreakdownIndicator() {
		return certificationBreakdownIndicator == null ? Optional.empty() : Optional.of(certificationBreakdownIndicator);
	}

	public CorporateAction10 setCertificationBreakdownIndicator(YesNoIndicator certificationBreakdownIndicator) {
		this.certificationBreakdownIndicator = certificationBreakdownIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargesAppliedIndicator() {
		return chargesAppliedIndicator == null ? Optional.empty() : Optional.of(chargesAppliedIndicator);
	}

	public CorporateAction10 setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictionIndicator() {
		return restrictionIndicator == null ? Optional.empty() : Optional.of(restrictionIndicator);
	}

	public CorporateAction10 setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getAccruedInterestIndicator() {
		return accruedInterestIndicator == null ? Optional.empty() : Optional.of(accruedInterestIndicator);
	}

	public CorporateAction10 setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getLetterOfGuaranteedDeliveryIndicator() {
		return letterOfGuaranteedDeliveryIndicator == null ? Optional.empty() : Optional.of(letterOfGuaranteedDeliveryIndicator);
	}

	public CorporateAction10 setLetterOfGuaranteedDeliveryIndicator(YesNoIndicator letterOfGuaranteedDeliveryIndicator) {
		this.letterOfGuaranteedDeliveryIndicator = letterOfGuaranteedDeliveryIndicator;
		return this;
	}

	public Optional<DividendTypeFormat3Choice> getDividendType() {
		return dividendType == null ? Optional.empty() : Optional.of(dividendType);
	}

	public CorporateAction10 setDividendType(DividendTypeFormat3Choice dividendType) {
		this.dividendType = dividendType;
		return this;
	}

	public Optional<ConversionTypeFormat1Choice> getConversionType() {
		return conversionType == null ? Optional.empty() : Optional.of(conversionType);
	}

	public CorporateAction10 setConversionType(ConversionTypeFormat1Choice conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	public Optional<DistributionTypeFormat3Choice> getPaymentOccurrenceType() {
		return paymentOccurrenceType == null ? Optional.empty() : Optional.of(paymentOccurrenceType);
	}

	public CorporateAction10 setPaymentOccurrenceType(DistributionTypeFormat3Choice paymentOccurrenceType) {
		this.paymentOccurrenceType = paymentOccurrenceType;
		return this;
	}

	public List<OfferTypeFormat3Choice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateAction10 setOfferType(List<OfferTypeFormat3Choice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<RenounceableEntitlementStatusTypeFormat1Choice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public CorporateAction10 setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public List<CorporateActionEventStageFormat3Choice> getEventStage() {
		return eventStage == null ? eventStage = new ArrayList<>() : eventStage;
	}

	public CorporateAction10 setEventStage(List<CorporateActionEventStageFormat3Choice> eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<AdditionalBusinessProcessFormat1Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator == null ? additionalBusinessProcessIndicator = new ArrayList<>() : additionalBusinessProcessIndicator;
	}

	public CorporateAction10 setAdditionalBusinessProcessIndicator(List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = Objects.requireNonNull(additionalBusinessProcessIndicator);
		return this;
	}

	public List<CorporateActionChangeTypeFormat1Choice> getChangeType() {
		return changeType == null ? changeType = new ArrayList<>() : changeType;
	}

	public CorporateAction10 setChangeType(List<CorporateActionChangeTypeFormat1Choice> changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public Optional<IntermediateSecuritiesDistributionTypeFormat9Choice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateAction10 setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat9Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public Optional<CapitalGainFormat1Choice> getCapitalGainInOutIndicator() {
		return capitalGainInOutIndicator == null ? Optional.empty() : Optional.of(capitalGainInOutIndicator);
	}

	public CorporateAction10 setCapitalGainInOutIndicator(CapitalGainFormat1Choice capitalGainInOutIndicator) {
		this.capitalGainInOutIndicator = capitalGainInOutIndicator;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculatedFormat1Choice> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public CorporateAction10 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<ElectionTypeFormat1Choice> getElectionType() {
		return electionType == null ? Optional.empty() : Optional.of(electionType);
	}

	public CorporateAction10 setElectionType(ElectionTypeFormat1Choice electionType) {
		this.electionType = electionType;
		return this;
	}

	public Optional<LotteryTypeFormat1Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction10 setLotteryType(LotteryTypeFormat1Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}

	public Optional<CertificationTypeFormat1Choice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateAction10 setCertificationType(CertificationTypeFormat1Choice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<Max350Text> getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation == null ? Optional.empty() : Optional.of(newPlaceOfIncorporation);
	}

	public CorporateAction10 setNewPlaceOfIncorporation(Max350Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
		return this;
	}

	public Optional<CorporateActionNarrative24> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateAction10 setAdditionalInformation(com.tools20022.repository.msg.CorporateActionNarrative24 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}