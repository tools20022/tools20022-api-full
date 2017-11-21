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
import com.tools20022.repository.codeset.EventFrequency5Code;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmValuationFrequency
 * ValuationDealingProcessingCharacteristics2.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmValuationFrequencyDescription
 * ValuationDealingProcessingCharacteristics2.mmValuationFrequencyDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmDecimalisationUnits
 * ValuationDealingProcessingCharacteristics2.mmDecimalisationUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmDecimalisationPrice
 * ValuationDealingProcessingCharacteristics2.mmDecimalisationPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmDualFundIndicator
 * ValuationDealingProcessingCharacteristics2.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceMethod
 * ValuationDealingProcessingCharacteristics2.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceCurrency
 * ValuationDealingProcessingCharacteristics2.mmPriceCurrency}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValuationDealingProcessingCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Valuation dealing processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ValuationDealingProcessingCharacteristics2", propOrder = {"valuationFrequency", "valuationFrequencyDescription", "decimalisationUnits", "decimalisationPrice", "dualFundIndicator", "priceMethod", "priceCurrency"})
public class ValuationDealingProcessingCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequency5Code valuationFrequency;
	/**
	 * Frequency of the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationFrequency
	 * NetAssetValueCalculation.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequency5Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequencyDescription";
			definition = "Further details regarding the dealing frequency, eg, Tuesday (for weekly dealing) or last business day of the month.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2
	 * ValuationDealingProcessingCharacteristics2}</li>
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
			componentContext_lazy = () -> ValuationDealingProcessingCharacteristics2.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(ValuationDealingProcessingCharacteristics2.mmValuationFrequency, ValuationDealingProcessingCharacteristics2.mmValuationFrequencyDescription,
						ValuationDealingProcessingCharacteristics2.mmDecimalisationUnits, ValuationDealingProcessingCharacteristics2.mmDecimalisationPrice, ValuationDealingProcessingCharacteristics2.mmDualFundIndicator,
						ValuationDealingProcessingCharacteristics2.mmPriceMethod, ValuationDealingProcessingCharacteristics2.mmPriceCurrency);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationDealingProcessingCharacteristics2";
				definition = "Valuation dealing processing characteristics linked to the instrument, ie, not to  the market.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ValtnFrqcy", required = true)
	public EventFrequency5Code getValuationFrequency() {
		return valuationFrequency;
	}

	public void setValuationFrequency(EventFrequency5Code valuationFrequency) {
		this.valuationFrequency = valuationFrequency;
	}

	@XmlElement(name = "ValtnFrqcyDesc", required = true)
	public Max350Text getValuationFrequencyDescription() {
		return valuationFrequencyDescription;
	}

	public void setValuationFrequencyDescription(Max350Text valuationFrequencyDescription) {
		this.valuationFrequencyDescription = valuationFrequencyDescription;
	}

	@XmlElement(name = "DcmlstnUnits", required = true)
	public Number getDecimalisationUnits() {
		return decimalisationUnits;
	}

	public void setDecimalisationUnits(Number decimalisationUnits) {
		this.decimalisationUnits = decimalisationUnits;
	}

	@XmlElement(name = "DcmlstnPric", required = true)
	public Number getDecimalisationPrice() {
		return decimalisationPrice;
	}

	public void setDecimalisationPrice(Number decimalisationPrice) {
		this.decimalisationPrice = decimalisationPrice;
	}

	@XmlElement(name = "DualFndInd", required = true)
	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	@XmlElement(name = "PricMtd", required = true)
	public PriceMethod1Code getPriceMethod() {
		return priceMethod;
	}

	public void setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
	}

	@XmlElement(name = "PricCcy", required = true)
	public List<ActiveCurrencyCode> getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(List<ActiveCurrencyCode> priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
}