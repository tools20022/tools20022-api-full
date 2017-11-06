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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.EventFrequency2Code;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ValuationDealingProcessingCharacteristics {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequency2Code valuationFrequency;
	/**
	 * Frequency of the valuation.
	 * <p>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationFrequency;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	protected Max350Text valuationFrequencyDescription;
	/**
	 * Further details regarding the dealing frequency, eg, Tuesday (for weekly
	 * dealing) or last business day of the month.
	 * <p>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcyDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequencyDescription";
			definition = "Further details regarding the dealing frequency, eg, Tuesday (for weekly dealing) or last business day of the month.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventFrequency2Code subscriptionDealingFrequency;
	/**
	 * Frequency at which the subscriptions are done.
	 * <p>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "SbcptDealgFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDealingFrequency";
			definition = "Frequency at which the subscriptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	protected Max350Text subscriptionDealFrequencyDescription;
	/**
	 * Description of frequency at which the subscription is done.
	 * <p>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "SbcptDealFrqcyDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDealFrequencyDescription";
			definition = "Description of frequency at which the subscription is done.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text limitedSubscriptionPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be subscribed to.
	 * <p>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLimitedSubscriptionPeriod;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "LtdSbcptPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedSubscriptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventFrequency2Code redemptionDealingFrequency;
	/**
	 * Frequency at which the redemptions are done.
	 * <p>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "RedDealgFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDealingFrequency";
			definition = "Frequency at which the redemptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	protected Max350Text redemptionDealFrequencyDescription;
	/**
	 * Description of frequency at which the redemption is done.
	 * <p>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "RedDealFrqcyDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDealFrequencyDescription";
			definition = "Description of frequency at which the redemption is done.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text limitedRedemptionPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLimitedRedemptionPeriod;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "LtdRedPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedRedemptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Number decimalisationPrice;
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDecimalisation;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DcmlstnPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalisationPrice";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number decimalisationUnits;
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDecimalisation;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DcmlstnUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalisationUnits";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator dualFundIndicator;
	/**
	 * Indicates whether the fund has two prices.
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmDualFundIndicator;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "DualFndInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriceMethod1Code priceMethod;
	/**
	 * Type of pricing calculation method.
	 * <p>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}
	};
	protected List<ActiveCurrencyCode> priceCurrency;
	/**
	 * Currencies in which the prices for the investment fund class are
	 * published by the fund management company.
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics.mmObject();
			isDerived = false;
			xmlTag = "PricCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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

	public void setValuationFrequency(EventFrequency2Code valuationFrequency) {
		this.valuationFrequency = valuationFrequency;
	}

	public Max350Text getValuationFrequencyDescription() {
		return valuationFrequencyDescription;
	}

	public void setValuationFrequencyDescription(Max350Text valuationFrequencyDescription) {
		this.valuationFrequencyDescription = valuationFrequencyDescription;
	}

	public EventFrequency2Code getSubscriptionDealingFrequency() {
		return subscriptionDealingFrequency;
	}

	public void setSubscriptionDealingFrequency(EventFrequency2Code subscriptionDealingFrequency) {
		this.subscriptionDealingFrequency = subscriptionDealingFrequency;
	}

	public Max350Text getSubscriptionDealFrequencyDescription() {
		return subscriptionDealFrequencyDescription;
	}

	public void setSubscriptionDealFrequencyDescription(Max350Text subscriptionDealFrequencyDescription) {
		this.subscriptionDealFrequencyDescription = subscriptionDealFrequencyDescription;
	}

	public Max350Text getLimitedSubscriptionPeriod() {
		return limitedSubscriptionPeriod;
	}

	public void setLimitedSubscriptionPeriod(Max350Text limitedSubscriptionPeriod) {
		this.limitedSubscriptionPeriod = limitedSubscriptionPeriod;
	}

	public EventFrequency2Code getRedemptionDealingFrequency() {
		return redemptionDealingFrequency;
	}

	public void setRedemptionDealingFrequency(EventFrequency2Code redemptionDealingFrequency) {
		this.redemptionDealingFrequency = redemptionDealingFrequency;
	}

	public Max350Text getRedemptionDealFrequencyDescription() {
		return redemptionDealFrequencyDescription;
	}

	public void setRedemptionDealFrequencyDescription(Max350Text redemptionDealFrequencyDescription) {
		this.redemptionDealFrequencyDescription = redemptionDealFrequencyDescription;
	}

	public Max350Text getLimitedRedemptionPeriod() {
		return limitedRedemptionPeriod;
	}

	public void setLimitedRedemptionPeriod(Max350Text limitedRedemptionPeriod) {
		this.limitedRedemptionPeriod = limitedRedemptionPeriod;
	}

	public Number getDecimalisationPrice() {
		return decimalisationPrice;
	}

	public void setDecimalisationPrice(Number decimalisationPrice) {
		this.decimalisationPrice = decimalisationPrice;
	}

	public Number getDecimalisationUnits() {
		return decimalisationUnits;
	}

	public void setDecimalisationUnits(Number decimalisationUnits) {
		this.decimalisationUnits = decimalisationUnits;
	}

	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	public PriceMethod1Code getPriceMethod() {
		return priceMethod;
	}

	public void setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
	}

	public List<ActiveCurrencyCode> getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(List<ActiveCurrencyCode> priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
}