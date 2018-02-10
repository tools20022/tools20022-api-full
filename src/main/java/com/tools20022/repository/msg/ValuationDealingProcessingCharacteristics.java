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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EventFrequency2Code;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.SecuritiesPricing;
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
 * Valuation dealing processing characteristics linked to the instrument, ie,
 * not to the market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmValuationFrequency
 * ValuationDealingProcessingCharacteristics.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmValuationFrequencyDescription
 * ValuationDealingProcessingCharacteristics.mmValuationFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmSubscriptionDealingFrequency
 * ValuationDealingProcessingCharacteristics.mmSubscriptionDealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmSubscriptionDealFrequencyDescription
 * ValuationDealingProcessingCharacteristics.
 * mmSubscriptionDealFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmLimitedSubscriptionPeriod
 * ValuationDealingProcessingCharacteristics.mmLimitedSubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmRedemptionDealingFrequency
 * ValuationDealingProcessingCharacteristics.mmRedemptionDealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmRedemptionDealFrequencyDescription
 * ValuationDealingProcessingCharacteristics.
 * mmRedemptionDealFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmLimitedRedemptionPeriod
 * ValuationDealingProcessingCharacteristics.mmLimitedRedemptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmDecimalisationPrice
 * ValuationDealingProcessingCharacteristics.mmDecimalisationPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmDecimalisationUnits
 * ValuationDealingProcessingCharacteristics.mmDecimalisationUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmDualFundIndicator
 * ValuationDealingProcessingCharacteristics.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmPriceMethod
 * ValuationDealingProcessingCharacteristics.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmPriceCurrency
 * ValuationDealingProcessingCharacteristics.mmPriceCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
 * InvestmentFundClassProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2017</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValuationDealingProcessingCharacteristics"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Valuation dealing processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ValuationDealingProcessingCharacteristics", propOrder = {"valuationFrequency", "valuationFrequencyDescription", "subscriptionDealingFrequency", "subscriptionDealFrequencyDescription", "limitedSubscriptionPeriod",
		"redemptionDealingFrequency", "redemptionDealFrequencyDescription", "limitedRedemptionPeriod", "decimalisationPrice", "decimalisationUnits", "dualFundIndicator", "priceMethod", "priceCurrency"})
public class ValuationDealingProcessingCharacteristics {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ValtnFrqcy", required = true)
	protected EventFrequency2Code valuationFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency2Code
	 * EventFrequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationFrequency
	 * NetAssetValueCalculation.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	@XmlElement(name = "ValtnFrqcyDesc")
	protected Max350Text valuationFrequencyDescription;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnFrqcyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationFrequencyDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further details regarding the dealing frequency, eg, Tuesday (for weekly dealing) or last business day of the month."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationFrequencyDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequencyDescription";
			definition = "Further details regarding the dealing frequency, eg, Tuesday (for weekly dealing) or last business day of the month.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "SbcptDealgFrqcy", required = true)
	protected EventFrequency2Code subscriptionDealingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency2Code
	 * EventFrequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptDealgFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionDealingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the subscriptions are done."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionDealingFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "SbcptDealgFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDealingFrequency";
			definition = "Frequency at which the subscriptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	@XmlElement(name = "SbcptDealFrqcyDesc")
	protected Max350Text subscriptionDealFrequencyDescription;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptDealFrqcyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionDealFrequencyDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of frequency at which the subscription is done."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionDealFrequencyDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "SbcptDealFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDealFrequencyDescription";
			definition = "Description of frequency at which the subscription is done.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "LtdSbcptPrd")
	protected Max350Text limitedSubscriptionPeriod;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedSubscriptionPeriod
	 * InvestmentFundClassProcessingCharacteristics.mmLimitedSubscriptionPeriod}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdSbcptPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedSubscriptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitedSubscriptionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmLimitedSubscriptionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "LtdSbcptPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedSubscriptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "RedDealgFrqcy", required = true)
	protected EventFrequency2Code redemptionDealingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency2Code
	 * EventFrequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedDealgFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDealingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the redemptions are done."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionDealingFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "RedDealgFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDealingFrequency";
			definition = "Frequency at which the redemptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	@XmlElement(name = "RedDealFrqcyDesc")
	protected Max350Text redemptionDealFrequencyDescription;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedDealFrqcyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDealFrequencyDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of frequency at which the redemption is done."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionDealFrequencyDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "RedDealFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDealFrequencyDescription";
			definition = "Description of frequency at which the redemption is done.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "LtdRedPrd")
	protected Max350Text limitedRedemptionPeriod;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedRedemptionPeriod
	 * InvestmentFundClassProcessingCharacteristics.mmLimitedRedemptionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdRedPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedRedemptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitedRedemptionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmLimitedRedemptionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "LtdRedPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedRedemptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "DcmlstnPric", required = true)
	protected Number decimalisationPrice;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDecimalisation
	 * InvestmentFundClassProcessingCharacteristics.mmDecimalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmlstnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecimalisationPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDecimalisationPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDecimalisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DcmlstnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalisationPrice";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "DcmlstnUnits", required = true)
	protected Number decimalisationUnits;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDecimalisation
	 * InvestmentFundClassProcessingCharacteristics.mmDecimalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmlstnUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecimalisationUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDecimalisationUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDecimalisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DcmlstnUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalisationUnits";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "DualFndInd", required = true)
	protected YesNoIndicator dualFundIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDualFundIndicator
	 * InvestmentFundClass.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DualFndInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the fund has two prices."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDualFundIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDualFundIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DualFndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricMtd", required = true)
	protected PriceMethod1Code priceMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethod1Code
	 * PriceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
	 * SecuritiesPricing.mmPriceMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "PricCcy", required = true)
	protected List<ActiveCurrencyCode> priceCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics
	 * ValuationDealingProcessingCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currencies in which the prices for the investment fund class are published by the fund management company."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "PricCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCurrency";
			definition = "Currencies in which the prices for the investment fund class are published by the fund management company.";
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmValuationFrequency,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmValuationFrequencyDescription, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmSubscriptionDealingFrequency,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmSubscriptionDealFrequencyDescription, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmLimitedSubscriptionPeriod,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmRedemptionDealingFrequency, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmRedemptionDealFrequencyDescription,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmLimitedRedemptionPeriod, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmDecimalisationPrice,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmDecimalisationUnits, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmDualFundIndicator,
						com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmPriceMethod, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.mmPriceCurrency);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2017");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ValuationDealingProcessingCharacteristics";
				definition = "Valuation dealing processing characteristics linked to the instrument, ie, not to  the market.";
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequency2Code getValuationFrequency() {
		return valuationFrequency;
	}

	public ValuationDealingProcessingCharacteristics setValuationFrequency(EventFrequency2Code valuationFrequency) {
		this.valuationFrequency = Objects.requireNonNull(valuationFrequency);
		return this;
	}

	public Optional<Max350Text> getValuationFrequencyDescription() {
		return valuationFrequencyDescription == null ? Optional.empty() : Optional.of(valuationFrequencyDescription);
	}

	public ValuationDealingProcessingCharacteristics setValuationFrequencyDescription(Max350Text valuationFrequencyDescription) {
		this.valuationFrequencyDescription = valuationFrequencyDescription;
		return this;
	}

	public EventFrequency2Code getSubscriptionDealingFrequency() {
		return subscriptionDealingFrequency;
	}

	public ValuationDealingProcessingCharacteristics setSubscriptionDealingFrequency(EventFrequency2Code subscriptionDealingFrequency) {
		this.subscriptionDealingFrequency = Objects.requireNonNull(subscriptionDealingFrequency);
		return this;
	}

	public Optional<Max350Text> getSubscriptionDealFrequencyDescription() {
		return subscriptionDealFrequencyDescription == null ? Optional.empty() : Optional.of(subscriptionDealFrequencyDescription);
	}

	public ValuationDealingProcessingCharacteristics setSubscriptionDealFrequencyDescription(Max350Text subscriptionDealFrequencyDescription) {
		this.subscriptionDealFrequencyDescription = subscriptionDealFrequencyDescription;
		return this;
	}

	public Optional<Max350Text> getLimitedSubscriptionPeriod() {
		return limitedSubscriptionPeriod == null ? Optional.empty() : Optional.of(limitedSubscriptionPeriod);
	}

	public ValuationDealingProcessingCharacteristics setLimitedSubscriptionPeriod(Max350Text limitedSubscriptionPeriod) {
		this.limitedSubscriptionPeriod = limitedSubscriptionPeriod;
		return this;
	}

	public EventFrequency2Code getRedemptionDealingFrequency() {
		return redemptionDealingFrequency;
	}

	public ValuationDealingProcessingCharacteristics setRedemptionDealingFrequency(EventFrequency2Code redemptionDealingFrequency) {
		this.redemptionDealingFrequency = Objects.requireNonNull(redemptionDealingFrequency);
		return this;
	}

	public Optional<Max350Text> getRedemptionDealFrequencyDescription() {
		return redemptionDealFrequencyDescription == null ? Optional.empty() : Optional.of(redemptionDealFrequencyDescription);
	}

	public ValuationDealingProcessingCharacteristics setRedemptionDealFrequencyDescription(Max350Text redemptionDealFrequencyDescription) {
		this.redemptionDealFrequencyDescription = redemptionDealFrequencyDescription;
		return this;
	}

	public Optional<Max350Text> getLimitedRedemptionPeriod() {
		return limitedRedemptionPeriod == null ? Optional.empty() : Optional.of(limitedRedemptionPeriod);
	}

	public ValuationDealingProcessingCharacteristics setLimitedRedemptionPeriod(Max350Text limitedRedemptionPeriod) {
		this.limitedRedemptionPeriod = limitedRedemptionPeriod;
		return this;
	}

	public Number getDecimalisationPrice() {
		return decimalisationPrice;
	}

	public ValuationDealingProcessingCharacteristics setDecimalisationPrice(Number decimalisationPrice) {
		this.decimalisationPrice = Objects.requireNonNull(decimalisationPrice);
		return this;
	}

	public Number getDecimalisationUnits() {
		return decimalisationUnits;
	}

	public ValuationDealingProcessingCharacteristics setDecimalisationUnits(Number decimalisationUnits) {
		this.decimalisationUnits = Objects.requireNonNull(decimalisationUnits);
		return this;
	}

	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public ValuationDealingProcessingCharacteristics setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = Objects.requireNonNull(dualFundIndicator);
		return this;
	}

	public PriceMethod1Code getPriceMethod() {
		return priceMethod;
	}

	public ValuationDealingProcessingCharacteristics setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = Objects.requireNonNull(priceMethod);
		return this;
	}

	public List<ActiveCurrencyCode> getPriceCurrency() {
		return priceCurrency == null ? priceCurrency = new ArrayList<>() : priceCurrency;
	}

	public ValuationDealingProcessingCharacteristics setPriceCurrency(List<ActiveCurrencyCode> priceCurrency) {
		this.priceCurrency = Objects.requireNonNull(priceCurrency);
		return this;
	}
}