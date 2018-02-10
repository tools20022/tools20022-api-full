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
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07;
import com.tools20022.repository.choice.CorporateActionOption19Choice;
import com.tools20022.repository.choice.FractionDispositionType27Choice;
import com.tools20022.repository.choice.OptionFeaturesFormat18Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionNumber
 * CorporateActionOption117.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionType
 * CorporateActionOption117.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionFeatures
 * CorporateActionOption117.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmFractionDisposition
 * CorporateActionOption117.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCurrencyOption
 * CorporateActionOption117.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmDateDetails
 * CorporateActionOption117.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPeriodDetails
 * CorporateActionOption117.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmRateAndAmountDetails
 * CorporateActionOption117.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPriceDetails
 * CorporateActionOption117.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPlaceOfTrade
 * CorporateActionOption117.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmSecuritiesMovementDetails
 * CorporateActionOption117.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCashMovementDetails
 * CorporateActionOption117.mmCashMovementDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmCorporateActionConfirmationDetails
 * CorporateActionMovementConfirmationV07.mmCorporateActionConfirmationDetails}</li>
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
 * "CorporateActionOption117"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption132
 * CorporateActionOption132}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111
 * CorporateActionOption111}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOption117", propOrder = {"optionNumber", "optionType", "optionFeatures", "fractionDisposition", "currencyOption", "dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "placeOfTrade",
		"securitiesMovementDetails", "cashMovementDetails"})
public class CorporateActionOption117 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb", required = true)
	protected OptionNumber1Choice optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionNumber1Choice
	 * OptionNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionNumber
	 * CorporateActionOption132.mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionNumber
	 * CorporateActionOption111.mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmOptionNumber);
			previousVersion_lazy = () -> CorporateActionOption111.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption19Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice
	 * CorporateActionOption19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionType
	 * CorporateActionOption132.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionType
	 * CorporateActionOption111.mmOptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmOptionType);
			previousVersion_lazy = () -> CorporateActionOption111.mmOptionType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption19Choice.mmObject();
		}
	};
	@XmlElement(name = "OptnFeatrs")
	protected List<OptionFeaturesFormat18Choice> optionFeatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice
	 * OptionFeaturesFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnFeatrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OPTF</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionFeatures
	 * CorporateActionOption132.mmOptionFeatures}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionFeatures
	 * CorporateActionOption111.mmOptionFeatures}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionFeatures = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OPTF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmOptionFeatures);
			previousVersion_lazy = () -> CorporateActionOption111.mmOptionFeatures;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat18Choice.mmObject();
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType27Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice
	 * FractionDispositionType27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DISF</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmFractionDisposition
	 * CorporateActionOption132.mmFractionDisposition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmFractionDisposition
	 * CorporateActionOption111.mmFractionDisposition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmFractionDisposition);
			previousVersion_lazy = () -> CorporateActionOption111.mmFractionDisposition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType27Choice.mmObject();
		}
	};
	@XmlElement(name = "CcyOptn")
	protected ActiveCurrencyCode currencyOption;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
	 * CorporateActionOption.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::OPTN</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCurrencyOption
	 * CorporateActionOption132.mmCurrencyOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmCurrencyOption
	 * CorporateActionOption111.mmCurrencyOption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::OPTN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmCurrencyOption);
			previousVersion_lazy = () -> CorporateActionOption111.mmCurrencyOption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate46 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate46
	 * CorporateActionDate46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
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
	 * "Provides information about the dates related to a corporate action option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmDateDetails
	 * CorporateActionOption132.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmDateDetails
	 * CorporateActionOption111.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmDateDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate46.mmObject();
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod11 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11
	 * CorporateActionPeriod11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
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
	 * "Provides information about the periods related to a corporate action option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPeriodDetails
	 * CorporateActionOption132.mmPeriodDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPeriodDetails
	 * CorporateActionOption111.mmPeriodDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmPeriodDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmPeriodDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod11.mmObject();
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate70 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate70
	 * CorporateActionRate70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
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
	 * "Provides information about rates and amounts related to a corporate action option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmRateAndAmountDetails
	 * CorporateActionOption132.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmRateAndAmountDetails
	 * CorporateActionOption111.mmRateAndAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmRateAndAmountDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmRateAndAmountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate70.mmObject();
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice61 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice61
	 * CorporateActionPrice61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
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
	 * "Provides information about the prices related to a corporate action option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPriceDetails
	 * CorporateActionOption132.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPriceDetails
	 * CorporateActionOption111.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmPriceDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice61.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected MarketIdentification84 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification84
	 * MarketIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the trade was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPlaceOfTrade
	 * CorporateActionOption132.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPlaceOfTrade
	 * CorporateActionOption111.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place where the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmPlaceOfTrade);
			previousVersion_lazy = () -> CorporateActionOption111.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification84.mmObject();
		}
	};
	@XmlElement(name = "SctiesMvmntDtls")
	protected List<com.tools20022.repository.msg.SecuritiesOption50> securitiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption50
	 * SecuritiesOption50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::SECMOVE</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmSecuritiesMovementDetails
	 * CorporateActionOption132.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmSecuritiesMovementDetails
	 * CorporateActionOption111.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::SECMOVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmSecuritiesMovementDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmSecuritiesMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption50.mmObject();
		}
	};
	@XmlElement(name = "CshMvmntDtls")
	protected List<com.tools20022.repository.msg.CashOption44> cashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption44
	 * CashOption44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
	 * CorporateActionOption117}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:CASHMOVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement related to a corporate action option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCashMovementDetails
	 * CorporateActionOption132.mmCashMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmCashMovementDetails
	 * CorporateActionOption111.mmCashMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption117.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:CASHMOVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmCashMovementDetails);
			previousVersion_lazy = () -> CorporateActionOption111.mmCashMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOption44.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption117.mmOptionNumber, com.tools20022.repository.msg.CorporateActionOption117.mmOptionType,
						com.tools20022.repository.msg.CorporateActionOption117.mmOptionFeatures, com.tools20022.repository.msg.CorporateActionOption117.mmFractionDisposition,
						com.tools20022.repository.msg.CorporateActionOption117.mmCurrencyOption, com.tools20022.repository.msg.CorporateActionOption117.mmDateDetails, com.tools20022.repository.msg.CorporateActionOption117.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateActionOption117.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption117.mmPriceDetails,
						com.tools20022.repository.msg.CorporateActionOption117.mmPlaceOfTrade, com.tools20022.repository.msg.CorporateActionOption117.mmSecuritiesMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption117.mmCashMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementConfirmationV07.mmCorporateActionConfirmationDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption117";
				definition = "Provides information about the corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionOption132.mmObject());
				previousVersion_lazy = () -> CorporateActionOption111.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionOption117 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOption19Choice getOptionType() {
		return optionType;
	}

	public CorporateActionOption117 setOptionType(CorporateActionOption19Choice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public List<OptionFeaturesFormat18Choice> getOptionFeatures() {
		return optionFeatures == null ? optionFeatures = new ArrayList<>() : optionFeatures;
	}

	public CorporateActionOption117 setOptionFeatures(List<OptionFeaturesFormat18Choice> optionFeatures) {
		this.optionFeatures = Objects.requireNonNull(optionFeatures);
		return this;
	}

	public Optional<FractionDispositionType27Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public CorporateActionOption117 setFractionDisposition(FractionDispositionType27Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrencyOption() {
		return currencyOption == null ? Optional.empty() : Optional.of(currencyOption);
	}

	public CorporateActionOption117 setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
		return this;
	}

	public Optional<CorporateActionDate46> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateActionOption117 setDateDetails(com.tools20022.repository.msg.CorporateActionDate46 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod11> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateActionOption117 setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod11 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate70> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateActionOption117 setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate70 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice61> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateActionOption117 setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice61 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<MarketIdentification84> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public CorporateActionOption117 setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification84 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public List<SecuritiesOption50> getSecuritiesMovementDetails() {
		return securitiesMovementDetails == null ? securitiesMovementDetails = new ArrayList<>() : securitiesMovementDetails;
	}

	public CorporateActionOption117 setSecuritiesMovementDetails(List<com.tools20022.repository.msg.SecuritiesOption50> securitiesMovementDetails) {
		this.securitiesMovementDetails = Objects.requireNonNull(securitiesMovementDetails);
		return this;
	}

	public List<CashOption44> getCashMovementDetails() {
		return cashMovementDetails == null ? cashMovementDetails = new ArrayList<>() : cashMovementDetails;
	}

	public CorporateActionOption117 setCashMovementDetails(List<com.tools20022.repository.msg.CashOption44> cashMovementDetails) {
		this.cashMovementDetails = Objects.requireNonNull(cashMovementDetails);
		return this;
	}
}