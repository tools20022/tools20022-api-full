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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionNumber
 * CorporateActionOption108.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionType
 * CorporateActionOption108.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmFractionDisposition
 * CorporateActionOption108.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOfferType
 * CorporateActionOption108.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionFeatures
 * CorporateActionOption108.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmIntermediateSecuritiesDistributionType
 * CorporateActionOption108.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionAvailabilityStatus
 * CorporateActionOption108.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCertificationBreakdownType
 * CorporateActionOption108.mmCertificationBreakdownType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmNonDomicileCountry
 * CorporateActionOption108.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmValidDomicileCountry
 * CorporateActionOption108.mmValidDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCurrencyOption
 * CorporateActionOption108.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmDefaultProcessingOrStandingInstruction
 * CorporateActionOption108.mmDefaultProcessingOrStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmChargesAppliedIndicator
 * CorporateActionOption108.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCertificationBreakdownIndicator
 * CorporateActionOption108.mmCertificationBreakdownIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmWithdrawalAllowedIndicator
 * CorporateActionOption108.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmChangeAllowedIndicator
 * CorporateActionOption108.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmSecurityIdentification
 * CorporateActionOption108.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmDateDetails
 * CorporateActionOption108.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmPeriodDetails
 * CorporateActionOption108.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmRateAndAmountDetails
 * CorporateActionOption108.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmPriceDetails
 * CorporateActionOption108.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmSecuritiesQuantity
 * CorporateActionOption108.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmSecuritiesMovementDetails
 * CorporateActionOption108.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCashMovementDetails
 * CorporateActionOption108.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmAdditionalInformation
 * CorporateActionOption108.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
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
 * "CorporateActionOption108"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * </ul>
 */
public class CorporateActionOption108 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected CorporateActionOption17Choice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice
	 * CorporateActionOption17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption17Choice.mmObject();
		}
	};
	protected FractionDispositionType20Choice fractionDisposition;
	/**
	 * Specifies how fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice
	 * FractionDispositionType20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType20Choice.mmObject();
		}
	};
	protected List<OfferTypeFormat8Choice> offerType;
	/**
	 * Specifies the conditions that apply to the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice
	 * OfferTypeFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat8Choice.mmObject();
		}
	};
	protected List<OptionFeaturesFormat11Choice> optionFeatures;
	/**
	 * Specifies the features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice
	 * OptionFeaturesFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionFeatures = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat11Choice.mmObject();
		}
	};
	protected IntermediateSecuritiesDistributionTypeFormat10Choice intermediateSecuritiesDistributionType;
	/**
	 * Specifies the type of intermediates securities distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat10Choice
	 * IntermediateSecuritiesDistributionTypeFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * "Specifies the type of intermediates securities distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Specifies the type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat10Choice.mmObject();
		}
	};
	protected OptionAvailabilityStatus2Choice optionAvailabilityStatus;
	/**
	 * Specifies the status of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionAvailabilityStatus2Choice
	 * OptionAvailabilityStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
	 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionAvailabilityStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmOptionAvailabilityStatus;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "OptnAvlbtySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Specifies the status of the option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionAvailabilityStatus2Choice.mmObject();
		}
	};
	protected List<BeneficiaryCertificationType7Choice> certificationBreakdownType;
	/**
	 * Indicates the type of certification/breakdown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice
	 * BeneficiaryCertificationType7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationBreakdownType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownType";
			definition = "Indicates the type of certification/breakdown.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficiaryCertificationType7Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmNonDomicileCountry;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "Holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "VldDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidDomicileCountry";
			definition = "Country of domicile in which the Corporate Action option is valid. The holder of the security has to certify that it is domiciled in the country indicated.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultProcessingOrStandingInstruction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "DfltPrcgOrStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultProcessingOrStandingInstruction";
			definition = "Indicates whether the corporate action movement is a default processing or a standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * definition} = "Indicates whether redemption charges apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesAppliedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether redemption charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator certificationBreakdownIndicator;
	/**
	 * Indicates whether or not certification/breakdown is required from the
	 * account owner. <br>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * "Indicates whether or not certification/breakdown is required from the account owner. \r\nYes: certification required \r\nNo: no certification required"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationBreakdownIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownIndicator";
			definition = "Indicates whether or not certification/breakdown is required from the account owner. \r\nYes: certification required \r\nNo: no certification required";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithdrawalAllowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmWithdrawalAllowedIndicator;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "WdrwlAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmChangeAllowedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChangeAllowedIndicator;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "ChngAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecurityIdentification15 securityIdentification;
	/**
	 * Identifies the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};
	protected CorporateActionDate33 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate33
	 * CorporateActionDate33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate33.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod7.mmObject();
		}
	};
	protected CorporateActionRate60 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate60
	 * CorporateActionRate60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate60.mmObject();
		}
	};
	protected CorporateActionPrice34 priceDetails;
	/**
	 * Provides information about the prices related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice34
	 * CorporateActionPrice34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice34.mmObject();
		}
	};
	protected SecuritiesOption28 securitiesQuantity;
	/**
	 * Provides information about securities quantity related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * "Provides information about securities quantity related to a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption28.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesOption45> securitiesMovementDetails;
	/**
	 * Provides information about securities movement related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption45
	 * SecuritiesOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * "Provides information about securities movement related to a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about securities movement related to a corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption45.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOption36> cashMovementDetails;
	/**
	 * Provides information about the cash movement linked to the corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption36
	 * CashOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement linked to the corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOption36.mmObject();
		}
	};
	protected CorporateActionNarrative22 additionalInformation;
	/**
	 * Provides additional information about the corporate action movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22
	 * CorporateActionNarrative22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
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
	 * "Provides additional information about the corporate action movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption108.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information about the corporate action movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative22.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOption108.mmOptionNumber, CorporateActionOption108.mmOptionType, CorporateActionOption108.mmFractionDisposition, CorporateActionOption108.mmOfferType,
						CorporateActionOption108.mmOptionFeatures, CorporateActionOption108.mmIntermediateSecuritiesDistributionType, CorporateActionOption108.mmOptionAvailabilityStatus,
						CorporateActionOption108.mmCertificationBreakdownType, CorporateActionOption108.mmNonDomicileCountry, CorporateActionOption108.mmValidDomicileCountry, CorporateActionOption108.mmCurrencyOption,
						CorporateActionOption108.mmDefaultProcessingOrStandingInstruction, CorporateActionOption108.mmChargesAppliedIndicator, CorporateActionOption108.mmCertificationBreakdownIndicator,
						CorporateActionOption108.mmWithdrawalAllowedIndicator, CorporateActionOption108.mmChangeAllowedIndicator, CorporateActionOption108.mmSecurityIdentification, CorporateActionOption108.mmDateDetails,
						CorporateActionOption108.mmPeriodDetails, CorporateActionOption108.mmRateAndAmountDetails, CorporateActionOption108.mmPriceDetails, CorporateActionOption108.mmSecuritiesQuantity,
						CorporateActionOption108.mmSecuritiesMovementDetails, CorporateActionOption108.mmCashMovementDetails, CorporateActionOption108.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionOption108";
				definition = "Provides information about the corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	public CorporateActionOption17Choice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption17Choice optionType) {
		this.optionType = optionType;
	}

	public FractionDispositionType20Choice getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionType20Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
	}

	public List<OfferTypeFormat8Choice> getOfferType() {
		return offerType;
	}

	public void setOfferType(List<OfferTypeFormat8Choice> offerType) {
		this.offerType = offerType;
	}

	public List<OptionFeaturesFormat11Choice> getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(List<OptionFeaturesFormat11Choice> optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	public IntermediateSecuritiesDistributionTypeFormat10Choice getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType;
	}

	public void setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat10Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
	}

	public OptionAvailabilityStatus2Choice getOptionAvailabilityStatus() {
		return optionAvailabilityStatus;
	}

	public void setOptionAvailabilityStatus(OptionAvailabilityStatus2Choice optionAvailabilityStatus) {
		this.optionAvailabilityStatus = optionAvailabilityStatus;
	}

	public List<BeneficiaryCertificationType7Choice> getCertificationBreakdownType() {
		return certificationBreakdownType;
	}

	public void setCertificationBreakdownType(List<BeneficiaryCertificationType7Choice> certificationBreakdownType) {
		this.certificationBreakdownType = certificationBreakdownType;
	}

	public List<CountryCode> getNonDomicileCountry() {
		return nonDomicileCountry;
	}

	public void setNonDomicileCountry(List<CountryCode> nonDomicileCountry) {
		this.nonDomicileCountry = nonDomicileCountry;
	}

	public List<CountryCode> getValidDomicileCountry() {
		return validDomicileCountry;
	}

	public void setValidDomicileCountry(List<CountryCode> validDomicileCountry) {
		this.validDomicileCountry = validDomicileCountry;
	}

	public ActiveCurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	public DefaultProcessingOrStandingInstruction1Choice getDefaultProcessingOrStandingInstruction() {
		return defaultProcessingOrStandingInstruction;
	}

	public void setDefaultProcessingOrStandingInstruction(DefaultProcessingOrStandingInstruction1Choice defaultProcessingOrStandingInstruction) {
		this.defaultProcessingOrStandingInstruction = defaultProcessingOrStandingInstruction;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public void setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
	}

	public YesNoIndicator getCertificationBreakdownIndicator() {
		return certificationBreakdownIndicator;
	}

	public void setCertificationBreakdownIndicator(YesNoIndicator certificationBreakdownIndicator) {
		this.certificationBreakdownIndicator = certificationBreakdownIndicator;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public void setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = withdrawalAllowedIndicator;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public void setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = changeAllowedIndicator;
	}

	public SecurityIdentification15 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification15 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public CorporateActionDate33 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate33 dateDetails) {
		this.dateDetails = dateDetails;
	}

	public CorporateActionPeriod7 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod7 periodDetails) {
		this.periodDetails = periodDetails;
	}

	public CorporateActionRate60 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate60 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	public CorporateActionPrice34 getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice34 priceDetails) {
		this.priceDetails = priceDetails;
	}

	public SecuritiesOption28 getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.msg.SecuritiesOption28 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<SecuritiesOption45> getSecuritiesMovementDetails() {
		return securitiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(List<com.tools20022.repository.msg.SecuritiesOption45> securitiesMovementDetails) {
		this.securitiesMovementDetails = securitiesMovementDetails;
	}

	public List<CashOption36> getCashMovementDetails() {
		return cashMovementDetails;
	}

	public void setCashMovementDetails(List<com.tools20022.repository.msg.CashOption36> cashMovementDetails) {
		this.cashMovementDetails = cashMovementDetails;
	}

	public CorporateActionNarrative22 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.CorporateActionNarrative22 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}