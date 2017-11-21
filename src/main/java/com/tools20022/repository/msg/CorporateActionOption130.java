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
import com.tools20022.repository.area.seev.CorporateActionNotificationV07;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Provides information about the corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionNumber
 * CorporateActionOption130.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionType
 * CorporateActionOption130.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmFractionDisposition
 * CorporateActionOption130.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOfferType
 * CorporateActionOption130.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionFeatures
 * CorporateActionOption130.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionAvailabilityStatus
 * CorporateActionOption130.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCertificationBreakdownType
 * CorporateActionOption130.mmCertificationBreakdownType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmNonDomicileCountry
 * CorporateActionOption130.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmValidDomicileCountry
 * CorporateActionOption130.mmValidDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCurrencyOption
 * CorporateActionOption130.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmDefaultProcessingOrStandingInstruction
 * CorporateActionOption130.mmDefaultProcessingOrStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChargesAppliedIndicator
 * CorporateActionOption130.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCertificationBreakdownIndicator
 * CorporateActionOption130.mmCertificationBreakdownIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmWithdrawalAllowedIndicator
 * CorporateActionOption130.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChangeAllowedIndicator
 * CorporateActionOption130.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmAppliedOptionIndicator
 * CorporateActionOption130.mmAppliedOptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmFinancialInstrumentIdentification
 * CorporateActionOption130.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmDateDetails
 * CorporateActionOption130.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPeriodDetails
 * CorporateActionOption130.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmRateAndAmountDetails
 * CorporateActionOption130.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPriceDetails
 * CorporateActionOption130.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmSecuritiesQuantity
 * CorporateActionOption130.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmSecuritiesMovementDetails
 * CorporateActionOption130.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCashMovementDetails
 * CorporateActionOption130.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmAdditionalInformation
 * CorporateActionOption130.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmCorporateActionOptionDetails
 * CorporateActionNotificationV07.mmCorporateActionOptionDetails}</li>
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
 * "CorporateActionOption130"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
 * CorporateActionOption114}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionOption130", propOrder = {"optionNumber", "optionType", "fractionDisposition", "offerType", "optionFeatures", "optionAvailabilityStatus", "certificationBreakdownType", "nonDomicileCountry",
		"validDomicileCountry", "currencyOption", "defaultProcessingOrStandingInstruction", "chargesAppliedIndicator", "certificationBreakdownIndicator", "withdrawalAllowedIndicator", "changeAllowedIndicator", "appliedOptionIndicator",
		"financialInstrumentIdentification", "dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "securitiesMovementDetails", "cashMovementDetails", "additionalInformation"})
public class CorporateActionOption130 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionNumber
	 * CorporateActionOption114.mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			previousVersion_lazy = () -> CorporateActionOption114.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected CorporateActionOption18Choice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice
	 * CorporateActionOption18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Specifies the corporate action options available to the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionType
	 * CorporateActionOption114.mmOptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			previousVersion_lazy = () -> CorporateActionOption114.mmOptionType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption18Choice.mmObject();
		}
	};
	protected FractionDispositionType26Choice fractionDisposition;
	/**
	 * Specifies how fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice
	 * FractionDispositionType26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmFractionDisposition
	 * CorporateActionOption114.mmFractionDisposition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			previousVersion_lazy = () -> CorporateActionOption114.mmFractionDisposition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType26Choice.mmObject();
		}
	};
	protected List<OfferTypeFormat10Choice> offerType;
	/**
	 * Specifies the conditions that apply to the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice
	 * OfferTypeFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOfferType
	 * CorporateActionOption114.mmOfferType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			previousVersion_lazy = () -> CorporateActionOption114.mmOfferType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat10Choice.mmObject();
		}
	};
	protected List<OptionFeaturesFormat22Choice> optionFeatures;
	/**
	 * Specifies the features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice
	 * OptionFeaturesFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnFeatrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the features that may apply to a corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionFeatures
	 * CorporateActionOption114.mmOptionFeatures}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionFeatures = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmOptionFeatures;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat22Choice.mmObject();
		}
	};
	protected OptionAvailabilityStatus3Choice optionAvailabilityStatus;
	/**
	 * Specifies the status of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionAvailabilityStatus3Choice
	 * OptionAvailabilityStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
	 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAvlbtySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAvailabilityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionAvailabilityStatus
	 * CorporateActionOption114.mmOptionAvailabilityStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionAvailabilityStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmOptionAvailabilityStatus;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "OptnAvlbtySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Specifies the status of the option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmOptionAvailabilityStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionAvailabilityStatus3Choice.mmObject();
		}
	};
	protected List<BeneficiaryCertificationType9Choice> certificationBreakdownType;
	/**
	 * Indicates the type of certification/breakdown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice
	 * BeneficiaryCertificationType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdownType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of certification/breakdown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCertificationBreakdownType
	 * CorporateActionOption114.mmCertificationBreakdownType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationBreakdownType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownType";
			definition = "Indicates the type of certification/breakdown.";
			previousVersion_lazy = () -> CorporateActionOption114.mmCertificationBreakdownType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficiaryCertificationType9Choice.mmObject();
		}
	};
	protected List<CountryCode> nonDomicileCountry;
	/**
	 * Holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
	 * BeneficialOwner.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDmclCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmNonDomicileCountry
	 * CorporateActionOption114.mmNonDomicileCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmNonDomicileCountry;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "Holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			previousVersion_lazy = () -> CorporateActionOption114.mmNonDomicileCountry;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected List<CountryCode> validDomicileCountry;
	/**
	 * Country of domicile in which the Corporate Action option is valid. The
	 * holder of the security has to certify that it is domiciled in the country
	 * indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldDmclCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of domicile in which the Corporate Action option is valid. The holder of the security has to certify that it is domiciled in the country indicated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmValidDomicileCountry
	 * CorporateActionOption114.mmValidDomicileCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "VldDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidDomicileCountry";
			definition = "Country of domicile in which the Corporate Action option is valid. The holder of the security has to certify that it is domiciled in the country indicated.";
			previousVersion_lazy = () -> CorporateActionOption114.mmValidDomicileCountry;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ActiveCurrencyCode currencyOption;
	/**
	 * Currency in which the cash disbursed from an interest or dividend payment
	 * is offered.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
	 * CorporateActionOption.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the cash disbursed from an interest or dividend payment is offered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCurrencyOption
	 * CorporateActionOption114.mmCurrencyOption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			previousVersion_lazy = () -> CorporateActionOption114.mmCurrencyOption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected DefaultProcessingOrStandingInstruction1Choice defaultProcessingOrStandingInstruction;
	/**
	 * Indicates whether the corporate action movement is a default processing
	 * or a standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltPrcgOrStgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultProcessingOrStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the corporate action movement is a default processing or a standing instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmDefaultProcessingOrStandingInstruction
	 * CorporateActionOption114.mmDefaultProcessingOrStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultProcessingOrStandingInstruction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "DfltPrcgOrStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultProcessingOrStandingInstruction";
			definition = "Indicates whether the corporate action movement is a default processing or a standing instruction.";
			previousVersion_lazy = () -> CorporateActionOption114.mmDefaultProcessingOrStandingInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmChargesAppliedIndicator
	 * CorporateActionOption114.mmChargesAppliedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAppliedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			previousVersion_lazy = () -> CorporateActionOption114.mmChargesAppliedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator certificationBreakdownIndicator;
	/**
	 * Whether or not certification/breakdown is required from the account
	 * owner. <br>
	 * Yes: certification required <br>
	 * No: no certification required
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdownIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Whether or not certification/breakdown is required from the account owner. \r\nYes: certification required \r\nNo: no certification required"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCertificationBreakdownIndicator
	 * CorporateActionOption114.mmCertificationBreakdownIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationBreakdownIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownIndicator";
			definition = "Whether or not certification/breakdown is required from the account owner. \r\nYes: certification required \r\nNo: no certification required";
			previousVersion_lazy = () -> CorporateActionOption114.mmCertificationBreakdownIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator withdrawalAllowedIndicator;
	/**
	 * Indicates whether withdrawal of instruction is allowed.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
	 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmWithdrawalAllowedIndicator
	 * CorporateActionOption114.mmWithdrawalAllowedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithdrawalAllowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmWithdrawalAllowedIndicator;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "WdrwlAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			previousVersion_lazy = () -> CorporateActionOption114.mmWithdrawalAllowedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator changeAllowedIndicator;
	/**
	 * Indicates whether change of instruction is allowed.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
	 * CorporateActionOption.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmChangeAllowedIndicator
	 * CorporateActionOption114.mmChangeAllowedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChangeAllowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChangeAllowedIndicator;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "ChngAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			previousVersion_lazy = () -> CorporateActionOption114.mmChangeAllowedIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator appliedOptionIndicator;
	/**
	 * Indicates whether the option, different from the default one, shall be
	 * applied by the account owner.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldOptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the option, different from the default one, shall be applied by the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmAppliedOptionIndicator
	 * CorporateActionOption114.mmAppliedOptionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAppliedOptionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "ApldOptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionIndicator";
			definition = "Indicates whether the option, different from the default one, shall be applied by the account owner.";
			previousVersion_lazy = () -> CorporateActionOption114.mmAppliedOptionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Identifies the financial instrument.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmFinancialInstrumentIdentification
	 * CorporateActionOption114.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identifies the financial instrument.";
			previousVersion_lazy = () -> CorporateActionOption114.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected CorporateActionDate48 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate48
	 * CorporateActionDate48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Provides information about the dates related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmDateDetails
	 * CorporateActionOption114.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate48.mmObject();
		}
	};
	protected CorporateActionPeriod7 periodDetails;
	/**
	 * Provides information about the periods related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Provides information about the periods related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmPeriodDetails
	 * CorporateActionOption114.mmPeriodDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmPeriodDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod7.mmObject();
		}
	};
	protected CorporateActionRate80 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate80
	 * CorporateActionRate80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Provides information about rates and amounts related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmRateAndAmountDetails
	 * CorporateActionOption114.mmRateAndAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmRateAndAmountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate80.mmObject();
		}
	};
	protected CorporateActionPrice58 priceDetails;
	/**
	 * Provides information about the prices related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice58
	 * CorporateActionPrice58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Provides information about the prices related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmPriceDetails
	 * CorporateActionOption114.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice58.mmObject();
		}
	};
	protected SecuritiesOption51 securitiesQuantity;
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption51
	 * SecuritiesOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * "Provides information about securities quantity linked to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmSecuritiesQuantity
	 * CorporateActionOption114.mmSecuritiesQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmSecuritiesQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption51.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesOption59> securitiesMovementDetails;
	/**
	 * Provides information about the securities movement linked to the
	 * corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities movement linked to the corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmSecuritiesMovementDetails
	 * CorporateActionOption114.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmSecuritiesMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOption50> cashMovementDetails;
	/**
	 * Provides information about the cash movement linked to the corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption50
	 * CashOption50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement linked to the corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCashMovementDetails
	 * CorporateActionOption114.mmCashMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement linked to the corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption114.mmCashMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOption50.mmObject();
		}
	};
	protected CorporateActionNarrative29 additionalInformation;
	/**
	 * Provides additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29
	 * CorporateActionNarrative29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmAdditionalInformation
	 * CorporateActionOption114.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption130.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			previousVersion_lazy = () -> CorporateActionOption114.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative29.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOption130.mmOptionNumber, CorporateActionOption130.mmOptionType, CorporateActionOption130.mmFractionDisposition, CorporateActionOption130.mmOfferType,
						CorporateActionOption130.mmOptionFeatures, CorporateActionOption130.mmOptionAvailabilityStatus, CorporateActionOption130.mmCertificationBreakdownType, CorporateActionOption130.mmNonDomicileCountry,
						CorporateActionOption130.mmValidDomicileCountry, CorporateActionOption130.mmCurrencyOption, CorporateActionOption130.mmDefaultProcessingOrStandingInstruction, CorporateActionOption130.mmChargesAppliedIndicator,
						CorporateActionOption130.mmCertificationBreakdownIndicator, CorporateActionOption130.mmWithdrawalAllowedIndicator, CorporateActionOption130.mmChangeAllowedIndicator,
						CorporateActionOption130.mmAppliedOptionIndicator, CorporateActionOption130.mmFinancialInstrumentIdentification, CorporateActionOption130.mmDateDetails, CorporateActionOption130.mmPeriodDetails,
						CorporateActionOption130.mmRateAndAmountDetails, CorporateActionOption130.mmPriceDetails, CorporateActionOption130.mmSecuritiesQuantity, CorporateActionOption130.mmSecuritiesMovementDetails,
						CorporateActionOption130.mmCashMovementDetails, CorporateActionOption130.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV07.mmCorporateActionOptionDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption130";
				definition = "Provides information about the corporate action option.";
				previousVersion_lazy = () -> CorporateActionOption114.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OptnNb", required = true)
	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "OptnTp", required = true)
	public CorporateActionOption18Choice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption18Choice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "FrctnDspstn")
	public FractionDispositionType26Choice getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionType26Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
	}

	@XmlElement(name = "OfferTp")
	public List<OfferTypeFormat10Choice> getOfferType() {
		return offerType;
	}

	public void setOfferType(List<OfferTypeFormat10Choice> offerType) {
		this.offerType = offerType;
	}

	@XmlElement(name = "OptnFeatrs")
	public List<OptionFeaturesFormat22Choice> getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(List<OptionFeaturesFormat22Choice> optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	@XmlElement(name = "OptnAvlbtySts")
	public OptionAvailabilityStatus3Choice getOptionAvailabilityStatus() {
		return optionAvailabilityStatus;
	}

	public void setOptionAvailabilityStatus(OptionAvailabilityStatus3Choice optionAvailabilityStatus) {
		this.optionAvailabilityStatus = optionAvailabilityStatus;
	}

	@XmlElement(name = "CertfctnBrkdwnTp")
	public List<BeneficiaryCertificationType9Choice> getCertificationBreakdownType() {
		return certificationBreakdownType;
	}

	public void setCertificationBreakdownType(List<BeneficiaryCertificationType9Choice> certificationBreakdownType) {
		this.certificationBreakdownType = certificationBreakdownType;
	}

	@XmlElement(name = "NonDmclCtry")
	public List<CountryCode> getNonDomicileCountry() {
		return nonDomicileCountry;
	}

	public void setNonDomicileCountry(List<CountryCode> nonDomicileCountry) {
		this.nonDomicileCountry = nonDomicileCountry;
	}

	@XmlElement(name = "VldDmclCtry")
	public List<CountryCode> getValidDomicileCountry() {
		return validDomicileCountry;
	}

	public void setValidDomicileCountry(List<CountryCode> validDomicileCountry) {
		this.validDomicileCountry = validDomicileCountry;
	}

	@XmlElement(name = "CcyOptn")
	public ActiveCurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	@XmlElement(name = "DfltPrcgOrStgInstr", required = true)
	public DefaultProcessingOrStandingInstruction1Choice getDefaultProcessingOrStandingInstruction() {
		return defaultProcessingOrStandingInstruction;
	}

	public void setDefaultProcessingOrStandingInstruction(DefaultProcessingOrStandingInstruction1Choice defaultProcessingOrStandingInstruction) {
		this.defaultProcessingOrStandingInstruction = defaultProcessingOrStandingInstruction;
	}

	@XmlElement(name = "ChrgsApldInd")
	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
	}

	@XmlElement(name = "CertfctnBrkdwnInd")
	public YesNoIndicator getCertificationBreakdownIndicator() {
		return certificationBreakdownIndicator;
	}

	public void setCertificationBreakdownIndicator(YesNoIndicator certificationBreakdownIndicator) {
		this.certificationBreakdownIndicator = certificationBreakdownIndicator;
	}

	@XmlElement(name = "WdrwlAllwdInd")
	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public void setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = withdrawalAllowedIndicator;
	}

	@XmlElement(name = "ChngAllwdInd")
	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public void setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = changeAllowedIndicator;
	}

	@XmlElement(name = "ApldOptnInd")
	public YesNoIndicator getAppliedOptionIndicator() {
		return appliedOptionIndicator;
	}

	public void setAppliedOptionIndicator(YesNoIndicator appliedOptionIndicator) {
		this.appliedOptionIndicator = appliedOptionIndicator;
	}

	@XmlElement(name = "FinInstrmId")
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "DtDtls")
	public CorporateActionDate48 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate48 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "PrdDtls")
	public CorporateActionPeriod7 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod7 periodDetails) {
		this.periodDetails = periodDetails;
	}

	@XmlElement(name = "RateAndAmtDtls")
	public CorporateActionRate80 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate80 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	@XmlElement(name = "PricDtls")
	public CorporateActionPrice58 getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice58 priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "SctiesQty")
	public SecuritiesOption51 getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.msg.SecuritiesOption51 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	@XmlElement(name = "SctiesMvmntDtls")
	public List<SecuritiesOption59> getSecuritiesMovementDetails() {
		return securitiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(List<com.tools20022.repository.msg.SecuritiesOption59> securitiesMovementDetails) {
		this.securitiesMovementDetails = securitiesMovementDetails;
	}

	@XmlElement(name = "CshMvmntDtls")
	public List<CashOption50> getCashMovementDetails() {
		return cashMovementDetails;
	}

	public void setCashMovementDetails(List<com.tools20022.repository.msg.CashOption50> cashMovementDetails) {
		this.cashMovementDetails = cashMovementDetails;
	}

	@XmlElement(name = "AddtlInf")
	public CorporateActionNarrative29 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.CorporateActionNarrative29 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}