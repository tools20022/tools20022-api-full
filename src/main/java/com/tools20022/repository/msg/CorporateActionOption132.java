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
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08;
import com.tools20022.repository.choice.CorporateActionOption19Choice;
import com.tools20022.repository.choice.FractionDispositionType27Choice;
import com.tools20022.repository.choice.OptionFeaturesFormat18Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionNumber
 * CorporateActionOption132.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionType
 * CorporateActionOption132.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionFeatures
 * CorporateActionOption132.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmFractionDisposition
 * CorporateActionOption132.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCurrencyOption
 * CorporateActionOption132.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmDateDetails
 * CorporateActionOption132.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPeriodDetails
 * CorporateActionOption132.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmRateAndAmountDetails
 * CorporateActionOption132.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPriceDetails
 * CorporateActionOption132.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPlaceOfTrade
 * CorporateActionOption132.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmSecuritiesMovementDetails
 * CorporateActionOption132.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCashMovementDetails
 * CorporateActionOption132.mmCashMovementDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmCorporateActionConfirmationDetails
 * CorporateActionMovementConfirmationV08.mmCorporateActionConfirmationDetails}</li>
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
 * "CorporateActionOption132"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117
 * CorporateActionOption117}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionOption132", propOrder = {"optionNumber", "optionType", "optionFeatures", "fractionDisposition", "currencyOption", "dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "placeOfTrade",
		"securitiesMovementDetails", "cashMovementDetails"})
public class CorporateActionOption132 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OptionNumber1Choice optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionNumber
	 * CorporateActionOption117.mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			previousVersion_lazy = () -> CorporateActionOption117.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	protected CorporateActionOption19Choice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionType
	 * CorporateActionOption117.mmOptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			previousVersion_lazy = () -> CorporateActionOption117.mmOptionType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption19Choice.mmObject();
		}
	};
	protected List<OptionFeaturesFormat18Choice> optionFeatures;
	/**
	 * Specifies the features that may apply to a corporate action option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionFeatures
	 * CorporateActionOption117.mmOptionFeatures}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionFeatures = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmOptionFeatures;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat18Choice.mmObject();
		}
	};
	protected FractionDispositionType27Choice fractionDisposition;
	/**
	 * Specifies how fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmFractionDisposition
	 * CorporateActionOption117.mmFractionDisposition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			previousVersion_lazy = () -> CorporateActionOption117.mmFractionDisposition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType27Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCurrencyOption
	 * CorporateActionOption117.mmCurrencyOption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			previousVersion_lazy = () -> CorporateActionOption117.mmCurrencyOption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected CorporateActionDate46 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action
	 * option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmDateDetails
	 * CorporateActionOption117.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate46.mmObject();
		}
	};
	protected CorporateActionPeriod11 periodDetails;
	/**
	 * Provides information about the periods related to a corporate action
	 * option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPeriodDetails
	 * CorporateActionOption117.mmPeriodDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmPeriodDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod11.mmObject();
		}
	};
	protected CorporateActionRate82 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate82
	 * CorporateActionRate82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmRateAndAmountDetails
	 * CorporateActionOption117.mmRateAndAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmRateAndAmountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate82.mmObject();
		}
	};
	protected CorporateActionPrice61 priceDetails;
	/**
	 * Provides information about the prices related to a corporate action
	 * option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPriceDetails
	 * CorporateActionOption117.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice61.mmObject();
		}
	};
	protected MarketIdentification84 placeOfTrade;
	/**
	 * Place where the trade was executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPlaceOfTrade
	 * CorporateActionOption117.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place where the trade was executed.";
			previousVersion_lazy = () -> CorporateActionOption117.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification84.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesOption60> securitiesMovementDetails;
	/**
	 * Provides information about the securities movement linked to the
	 * corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption60
	 * SecuritiesOption60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmSecuritiesMovementDetails
	 * CorporateActionOption117.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmSecuritiesMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption60.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOption52> cashMovementDetails;
	/**
	 * Provides information about the cash movement related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption52
	 * CashOption52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132
	 * CorporateActionOption132}</li>
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
	 * "Provides information about the cash movement related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCashMovementDetails
	 * CorporateActionOption117.mmCashMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> CorporateActionOption132.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement related to a corporate action option.";
			previousVersion_lazy = () -> CorporateActionOption117.mmCashMovementDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOption132.mmOptionNumber, CorporateActionOption132.mmOptionType, CorporateActionOption132.mmOptionFeatures, CorporateActionOption132.mmFractionDisposition,
						CorporateActionOption132.mmCurrencyOption, CorporateActionOption132.mmDateDetails, CorporateActionOption132.mmPeriodDetails, CorporateActionOption132.mmRateAndAmountDetails, CorporateActionOption132.mmPriceDetails,
						CorporateActionOption132.mmPlaceOfTrade, CorporateActionOption132.mmSecuritiesMovementDetails, CorporateActionOption132.mmCashMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementConfirmationV08.mmCorporateActionConfirmationDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption132";
				definition = "Provides information about the corporate action option.";
				previousVersion_lazy = () -> CorporateActionOption117.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OptnNb", required = true)
	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "OptnTp", required = true)
	public CorporateActionOption19Choice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption19Choice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "OptnFeatrs")
	public List<OptionFeaturesFormat18Choice> getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(List<OptionFeaturesFormat18Choice> optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	@XmlElement(name = "FrctnDspstn")
	public FractionDispositionType27Choice getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionType27Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
	}

	@XmlElement(name = "CcyOptn")
	public ActiveCurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
	}

	@XmlElement(name = "DtDtls")
	public CorporateActionDate46 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate46 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "PrdDtls")
	public CorporateActionPeriod11 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod11 periodDetails) {
		this.periodDetails = periodDetails;
	}

	@XmlElement(name = "RateAndAmtDtls")
	public CorporateActionRate82 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate82 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	@XmlElement(name = "PricDtls")
	public CorporateActionPrice61 getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice61 priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "PlcOfTrad")
	public MarketIdentification84 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification84 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "SctiesMvmntDtls")
	public List<SecuritiesOption60> getSecuritiesMovementDetails() {
		return securitiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(List<com.tools20022.repository.msg.SecuritiesOption60> securitiesMovementDetails) {
		this.securitiesMovementDetails = securitiesMovementDetails;
	}

	@XmlElement(name = "CshMvmntDtls")
	public List<CashOption52> getCashMovementDetails() {
		return cashMovementDetails;
	}

	public void setCashMovementDetails(List<com.tools20022.repository.msg.CashOption52> cashMovementDetails) {
		this.cashMovementDetails = cashMovementDetails;
	}
}