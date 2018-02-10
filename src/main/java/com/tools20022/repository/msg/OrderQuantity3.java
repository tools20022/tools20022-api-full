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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesOrderParameters;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The quantities, amount or price of a financial instrument to be ordered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderQuantity3#mmMinimumQuantity
 * OrderQuantity3.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity3#mmPrice
 * OrderQuantity3.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderQuantity3#mmMatchIncrement
 * OrderQuantity3.mmMatchIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderQuantity3#mmMaxPriceLevels
 * OrderQuantity3.mmMaxPriceLevels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderQuantity3#mmPreviousClosingPrice
 * OrderQuantity3.mmPreviousClosingPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderQuantity3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The quantities, amount or price of a financial instrument to be ordered."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderQuantity3", propOrder = {"minimumQuantity", "price", "matchIncrement", "maxPriceLevels", "previousClosingPrice"})
public class OrderQuantity3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MinQty")
	protected FinancialInstrumentQuantityChoice minimumQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
	 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 110</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument to be bought or sold if the \nentire order cannot be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderQuantity3.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "110"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Minimum quantity of financial instrument to be bought or sold if the \nentire order cannot be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "Pric")
	protected Price1 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderQuantity3.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	@XmlElement(name = "MtchIncrmt")
	protected FinancialInstrumentQuantityChoice matchIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
	 * SecuritiesOrderParameters.mmMatchIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1089</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmMatchIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderQuantity3.mmObject();
			isDerived = false;
			xmlTag = "MtchIncrmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1089"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIncrement";
			definition = "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "MxPricLvls")
	protected Number maxPriceLevels;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMaxPriceLevels
	 * SecuritiesOrderParameters.mmMaxPriceLevels}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MxPricLvls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1090</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxPriceLevels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows an order to specify a maximum number of price levels to trade through."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaxPriceLevels = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmMaxPriceLevels;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderQuantity3.mmObject();
			isDerived = false;
			xmlTag = "MxPricLvls";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1090"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxPriceLevels";
			definition = "Allows an order to specify a maximum number of price levels to trade through.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "PrvsClsgPric")
	protected Price1 previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
	 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsClsgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 140</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous closing price of security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousClosingPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPreviousClosingPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderQuantity3.mmObject();
			isDerived = false;
			xmlTag = "PrvsClsgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "140"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderQuantity3.mmMinimumQuantity, com.tools20022.repository.msg.OrderQuantity3.mmPrice, com.tools20022.repository.msg.OrderQuantity3.mmMatchIncrement,
						com.tools20022.repository.msg.OrderQuantity3.mmMaxPriceLevels, com.tools20022.repository.msg.OrderQuantity3.mmPreviousClosingPrice);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderQuantity3";
				definition = "The quantities, amount or price of a financial instrument to be ordered.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumQuantity() {
		return minimumQuantity == null ? Optional.empty() : Optional.of(minimumQuantity);
	}

	public OrderQuantity3 setMinimumQuantity(FinancialInstrumentQuantityChoice minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
		return this;
	}

	public Optional<Price1> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public OrderQuantity3 setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMatchIncrement() {
		return matchIncrement == null ? Optional.empty() : Optional.of(matchIncrement);
	}

	public OrderQuantity3 setMatchIncrement(FinancialInstrumentQuantityChoice matchIncrement) {
		this.matchIncrement = matchIncrement;
		return this;
	}

	public Optional<Number> getMaxPriceLevels() {
		return maxPriceLevels == null ? Optional.empty() : Optional.of(maxPriceLevels);
	}

	public OrderQuantity3 setMaxPriceLevels(Number maxPriceLevels) {
		this.maxPriceLevels = maxPriceLevels;
		return this;
	}

	public Optional<Price1> getPreviousClosingPrice() {
		return previousClosingPrice == null ? Optional.empty() : Optional.of(previousClosingPrice);
	}

	public OrderQuantity3 setPreviousClosingPrice(com.tools20022.repository.msg.Price1 previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		return this;
	}
}