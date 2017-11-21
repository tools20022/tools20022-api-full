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
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SourceOfPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation9#mmValue
 * PriceInformation9.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmQuotationDate
 * PriceInformation9.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmPriceCalculationPeriod
 * PriceInformation9.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmSourceOfPrice
 * PriceInformation9.mmSourceOfPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "PriceInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11
 * PriceInformation11}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceInformation9", propOrder = {"value", "quotationDate", "priceCalculationPeriod", "sourceOfPrice"})
public class PriceInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Price4 value;
	/**
	 * Value of the price, for instance, as a currency and value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the price, for instance, as a currency and value."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11#mmValue
	 * PriceInformation11.mmValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> PriceInformation9.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, for instance, as a currency and value.";
			nextVersions_lazy = () -> Arrays.asList(PriceInformation11.mmValue);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected DateAndDateTime1Choice quotationDate;
	/**
	 * Date on which the price is obtained. With an investment fund, this is as
	 * stated in the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
	 * SecuritiesPricing.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmQuotationDate
	 * PriceInformation11.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> PriceInformation9.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(PriceInformation11.mmQuotationDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}
	};
	protected DateTimePeriodChoice priceCalculationPeriod;
	/**
	 * Period during which the price of a security is determined (For outturn
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For  outturn securities)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmPriceCalculationPeriod
	 * PriceInformation11.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceCalculationPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> PriceInformation9.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For  outturn securities).";
			nextVersions_lazy = () -> Arrays.asList(PriceInformation11.mmPriceCalculationPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	protected MarketIdentification77 sourceOfPrice;
	/**
	 * Place from which the price was obtained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77
	 * MarketIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9
	 * PriceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from which the price was obtained."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmSourceOfPrice
	 * PriceInformation11.mmSourceOfPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceOfPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SourceOfPrice.mmMarketIdentification;
			componentContext_lazy = () -> PriceInformation9.mmObject();
			isDerived = false;
			xmlTag = "SrcOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfPrice";
			definition = "Place from which the price was obtained.";
			nextVersions_lazy = () -> Arrays.asList(PriceInformation11.mmSourceOfPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MarketIdentification77.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceInformation9.mmValue, PriceInformation9.mmQuotationDate, PriceInformation9.mmPriceCalculationPeriod, PriceInformation9.mmSourceOfPrice);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation9";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				nextVersions_lazy = () -> Arrays.asList(PriceInformation11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Val", required = true)
	public Price4 getValue() {
		return value;
	}

	public void setValue(com.tools20022.repository.msg.Price4 value) {
		this.value = value;
	}

	@XmlElement(name = "QtnDt")
	public DateAndDateTime1Choice getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(DateAndDateTime1Choice quotationDate) {
		this.quotationDate = quotationDate;
	}

	@XmlElement(name = "PricClctnPrd")
	public DateTimePeriodChoice getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public void setPriceCalculationPeriod(DateTimePeriodChoice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
	}

	@XmlElement(name = "SrcOfPric")
	public MarketIdentification77 getSourceOfPrice() {
		return sourceOfPrice;
	}

	public void setSourceOfPrice(com.tools20022.repository.msg.MarketIdentification77 sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
	}
}