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
import com.tools20022.repository.choice.CorporateActionOption14Choice;
import com.tools20022.repository.choice.FractionDispositionType24Choice;
import com.tools20022.repository.choice.OptionFeaturesFormat3Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.CashProceedsDefinition;
import com.tools20022.repository.entity.CorporateActionOption;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionNumber
 * CorporateActionOption54.OptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionType
 * CorporateActionOption54.OptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionFeatures
 * CorporateActionOption54.OptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#FractionDisposition
 * CorporateActionOption54.FractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#CurrencyOption
 * CorporateActionOption54.CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#DateDetails
 * CorporateActionOption54.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PeriodDetails
 * CorporateActionOption54.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#RateAndAmountDetails
 * CorporateActionOption54.RateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PriceDetails
 * CorporateActionOption54.PriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PlaceOfTrade
 * CorporateActionOption54.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#SecuritiesMovementDetails
 * CorporateActionOption54.SecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#CashMovementDetails
 * CorporateActionOption54.CashMovementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOption54"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * </ul>
 */
public class CorporateActionOption54 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionNumber
	 * CorporateActionOption.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd OptionNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.OptionNumber;
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> OptionNumber1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice
	 * CorporateActionOption14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionType
	 * CorporateActionOption.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd OptionType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.OptionType;
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionOption14Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice
	 * OptionFeaturesFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionFeatures
	 * CorporateActionOption.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd OptionFeatures = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.OptionFeatures;
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			minOccurs = 0;
			type_lazy = () -> OptionFeaturesFormat3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies how fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice
	 * FractionDispositionType24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#FractionDisposition
	 * CorporateActionOption.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd FractionDisposition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.FractionDisposition;
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FractionDispositionType24Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CurrencyOption
	 * CorporateActionOption.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAttribute CurrencyOption = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.CurrencyOption;
			isDerived = false;
			xmlTag = "CcyOptn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	/**
	 * Provides information about the dates related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate19
	 * CorporateActionDate19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#RelatedChoiceCorporateAction
	 * CorporateActionOption.RelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd DateDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction;
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionDate19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information about the periods related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9
	 * CorporateActionPeriod9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#RelatedChoiceCorporateAction
	 * CorporateActionOption.RelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd PeriodDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction;
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPeriod9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate39
	 * CorporateActionRate39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#RelatedChoiceCorporateAction
	 * CorporateActionOption.RelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd RateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction;
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionRate39.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information about the prices related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice36
	 * CorporateActionPrice36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
	 * CorporateActionEvent.CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	public static final MMMessageAssociationEnd PriceDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice;
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice36.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Place where the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification8
	 * MarketIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#TradingMarket
	 * Security.TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PlaceOfTrade = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.TradingMarket;
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place where the trade was executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarketIdentification8.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information about the securities movement linked to the
	 * corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption36
	 * SecuritiesOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement;
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOption36.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information about the cash movement related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption27
	 * CashOption27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54
	 * CorporateActionOption54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CashMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionOption54.mmObject();
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement related to a corporate action option.";
			minOccurs = 0;
			type_lazy = () -> CashOption27.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption54.OptionNumber, com.tools20022.repository.msg.CorporateActionOption54.OptionType,
						com.tools20022.repository.msg.CorporateActionOption54.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption54.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption54.CurrencyOption,
						com.tools20022.repository.msg.CorporateActionOption54.DateDetails, com.tools20022.repository.msg.CorporateActionOption54.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption54.RateAndAmountDetails,
						com.tools20022.repository.msg.CorporateActionOption54.PriceDetails, com.tools20022.repository.msg.CorporateActionOption54.PlaceOfTrade,
						com.tools20022.repository.msg.CorporateActionOption54.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption54.CashMovementDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionOption54";
				definition = "Provides information about the corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}
}