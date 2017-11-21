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
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04;
import com.tools20022.repository.choice.CorporateActionOption11Choice;
import com.tools20022.repository.choice.FractionDispositionType23Choice;
import com.tools20022.repository.choice.OptionFeaturesFormat1Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
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
 * Provides information about the corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionNumber
 * CorporateActionOption53.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionType
 * CorporateActionOption53.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionFeatures
 * CorporateActionOption53.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmFractionDisposition
 * CorporateActionOption53.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmCurrencyOption
 * CorporateActionOption53.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmDateDetails
 * CorporateActionOption53.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPeriodDetails
 * CorporateActionOption53.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmRateAndAmountDetails
 * CorporateActionOption53.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPriceDetails
 * CorporateActionOption53.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPlaceOfTrade
 * CorporateActionOption53.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmSecuritiesMovementDetails
 * CorporateActionOption53.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmCashMovementDetails
 * CorporateActionOption53.mmCashMovementDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmCorporateActionConfirmationDetails
 * CorporateActionMovementConfirmationV04.mmCorporateActionConfirmationDetails}</li>
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
 * "CorporateActionOption53"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption102
 * CorporateActionOption102}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37
 * CorporateActionOption37}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionOption53", propOrder = {"optionNumber", "optionType", "optionFeatures", "fractionDisposition", "currencyOption", "dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "placeOfTrade",
		"securitiesMovementDetails", "cashMovementDetails"})
public class CorporateActionOption53 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionNumber
	 * CorporateActionOption102.mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmOptionNumber);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}
	};
	protected CorporateActionOption11Choice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice
	 * CorporateActionOption11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionType
	 * CorporateActionOption102.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmOptionType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption11Choice.mmObject();
		}
	};
	protected List<OptionFeaturesFormat1Choice> optionFeatures;
	/**
	 * Specifies the features that may apply to a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice
	 * OptionFeaturesFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionFeatures
	 * CorporateActionOption102.mmOptionFeatures}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionFeatures = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmOptionFeatures);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat1Choice.mmObject();
		}
	};
	protected FractionDispositionType23Choice fractionDisposition;
	/**
	 * Specifies how fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice
	 * FractionDispositionType23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmFractionDisposition
	 * CorporateActionOption102.mmFractionDisposition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFractionDisposition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmFractionDisposition);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType23Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmCurrencyOption
	 * CorporateActionOption102.mmCurrencyOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmCurrencyOption);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected CorporateActionDate18 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate18
	 * CorporateActionDate18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmDateDetails
	 * CorporateActionOption102.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmDateDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate18.mmObject();
		}
	};
	protected CorporateActionPeriod9 periodDetails;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPeriodDetails
	 * CorporateActionOption102.mmPeriodDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriodDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmPeriodDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod9.mmObject();
		}
	};
	protected CorporateActionRate38 rateAndAmountDetails;
	/**
	 * Provides information about rates and amounts related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate38
	 * CorporateActionRate38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmRateAndAmountDetails
	 * CorporateActionOption102.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateAndAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmRateAndAmountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionRate38.mmObject();
		}
	};
	protected CorporateActionPrice30 priceDetails;
	/**
	 * Provides information about the prices related to a corporate action
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice30
	 * CorporateActionPrice30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPriceDetails
	 * CorporateActionOption102.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmPriceDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice30.mmObject();
		}
	};
	protected MarketIdentification4 placeOfTrade;
	/**
	 * Place where the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification4
	 * MarketIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPlaceOfTrade
	 * CorporateActionOption102.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place where the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesOption35> securitiesMovementDetails;
	/**
	 * Provides information about the securities movement linked to the
	 * corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption35
	 * SecuritiesOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmSecuritiesMovementDetails
	 * CorporateActionOption102.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmSecuritiesMovementDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesOption35.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOption26> cashMovementDetails;
	/**
	 * Provides information about the cash movement related to a corporate
	 * action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption26
	 * CashOption26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53
	 * CorporateActionOption53}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmCashMovementDetails
	 * CorporateActionOption102.mmCashMovementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> CorporateActionOption53.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmCashMovementDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOption26.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOption53.mmOptionNumber, CorporateActionOption53.mmOptionType, CorporateActionOption53.mmOptionFeatures, CorporateActionOption53.mmFractionDisposition,
						CorporateActionOption53.mmCurrencyOption, CorporateActionOption53.mmDateDetails, CorporateActionOption53.mmPeriodDetails, CorporateActionOption53.mmRateAndAmountDetails, CorporateActionOption53.mmPriceDetails,
						CorporateActionOption53.mmPlaceOfTrade, CorporateActionOption53.mmSecuritiesMovementDetails, CorporateActionOption53.mmCashMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementConfirmationV04.mmCorporateActionConfirmationDetails);
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
				name = "CorporateActionOption53";
				definition = "Provides information about the corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionOption102.mmObject());
				previousVersion_lazy = () -> CorporateActionOption37.mmObject();
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
	public CorporateActionOption11Choice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption11Choice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "OptnFeatrs")
	public List<OptionFeaturesFormat1Choice> getOptionFeatures() {
		return optionFeatures;
	}

	public void setOptionFeatures(List<OptionFeaturesFormat1Choice> optionFeatures) {
		this.optionFeatures = optionFeatures;
	}

	@XmlElement(name = "FrctnDspstn")
	public FractionDispositionType23Choice getFractionDisposition() {
		return fractionDisposition;
	}

	public void setFractionDisposition(FractionDispositionType23Choice fractionDisposition) {
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
	public CorporateActionDate18 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate18 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "PrdDtls")
	public CorporateActionPeriod9 getPeriodDetails() {
		return periodDetails;
	}

	public void setPeriodDetails(com.tools20022.repository.msg.CorporateActionPeriod9 periodDetails) {
		this.periodDetails = periodDetails;
	}

	@XmlElement(name = "RateAndAmtDtls")
	public CorporateActionRate38 getRateAndAmountDetails() {
		return rateAndAmountDetails;
	}

	public void setRateAndAmountDetails(com.tools20022.repository.msg.CorporateActionRate38 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
	}

	@XmlElement(name = "PricDtls")
	public CorporateActionPrice30 getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(com.tools20022.repository.msg.CorporateActionPrice30 priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "PlcOfTrad")
	public MarketIdentification4 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification4 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "SctiesMvmntDtls")
	public List<SecuritiesOption35> getSecuritiesMovementDetails() {
		return securitiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(List<com.tools20022.repository.msg.SecuritiesOption35> securitiesMovementDetails) {
		this.securitiesMovementDetails = securitiesMovementDetails;
	}

	@XmlElement(name = "CshMvmntDtls")
	public List<CashOption26> getCashMovementDetails() {
		return cashMovementDetails;
	}

	public void setCashMovementDetails(List<com.tools20022.repository.msg.CashOption26> cashMovementDetails) {
		this.cashMovementDetails = cashMovementDetails;
	}
}