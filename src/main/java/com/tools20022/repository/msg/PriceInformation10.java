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
import com.tools20022.repository.choice.TypeOfPrice27Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmCurrentPrice
 * PriceInformation10.mmCurrentPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10#mmType
 * PriceInformation10.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmPreviousPrice
 * PriceInformation10.mmPreviousPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmAmountOfChange
 * PriceInformation10.mmAmountOfChange}</li>
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
 * "PriceInformation10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceInformation10", propOrder = {"currentPrice", "type", "previousPrice", "amountOfChange"})
public class PriceInformation10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount currentPrice;
	/**
	 * Current value of the price, eg, as a currency and value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "CurPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentPrice";
			definition = "Current value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected TypeOfPrice27Choice type;
	/**
	 * Specifies the type of price and information about the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice
	 * TypeOfPrice27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TypeOfPrice27Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount previousPrice;
	/**
	 * Previous value of the price, eg, as a currency and value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous value of the price, eg, as a currency and value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "PrvsPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousPrice";
			definition = "Previous value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected PriceValueAndRate4 amountOfChange;
	/**
	 * Difference or change between the previous price value and the current
	 * price value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceValueAndRate4
	 * PriceValueAndRate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10
	 * PriceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtOfChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOfChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference or change between the previous price value and the current price value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountOfChange = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> PriceInformation10.mmObject();
			isDerived = false;
			xmlTag = "AmtOfChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOfChange";
			definition = "Difference or change between the previous price value and the current price value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValueAndRate4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceInformation10.mmCurrentPrice, PriceInformation10.mmType, PriceInformation10.mmPreviousPrice, PriceInformation10.mmAmountOfChange);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation10";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CurPric", required = true)
	public ActiveOrHistoricCurrencyAnd13DecimalAmount getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(ActiveOrHistoricCurrencyAnd13DecimalAmount currentPrice) {
		this.currentPrice = currentPrice;
	}

	@XmlElement(name = "Tp", required = true)
	public TypeOfPrice27Choice getType() {
		return type;
	}

	public void setType(TypeOfPrice27Choice type) {
		this.type = type;
	}

	@XmlElement(name = "PrvsPric")
	public ActiveOrHistoricCurrencyAnd13DecimalAmount getPreviousPrice() {
		return previousPrice;
	}

	public void setPreviousPrice(ActiveOrHistoricCurrencyAnd13DecimalAmount previousPrice) {
		this.previousPrice = previousPrice;
	}

	@XmlElement(name = "AmtOfChng")
	public PriceValueAndRate4 getAmountOfChange() {
		return amountOfChange;
	}

	public void setAmountOfChange(com.tools20022.repository.msg.PriceValueAndRate4 amountOfChange) {
		this.amountOfChange = amountOfChange;
	}
}