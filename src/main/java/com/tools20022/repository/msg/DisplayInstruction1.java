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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.DisplayMethod1Code;
import com.tools20022.repository.codeset.RefreshTime1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about strategy order/Iceberg orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmQuantity
 * DisplayInstruction1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmSecondaryQuantity
 * DisplayInstruction1.mmSecondaryQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmMethod
 * DisplayInstruction1.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmLowQuantity
 * DisplayInstruction1.mmLowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmHighQuantity
 * DisplayInstruction1.mmHighQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmMinimumIncrement
 * DisplayInstruction1.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmRefreshQuantity
 * DisplayInstruction1.mmRefreshQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmRefreshTime
 * DisplayInstruction1.mmRefreshTime}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisplayInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about strategy order/Iceberg orders."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DisplayInstruction1", propOrder = {"quantity", "secondaryQuantity", "method", "lowQuantity", "highQuantity", "minimumIncrement", "refreshQuantity", "refreshTime"})
public class DisplayInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * Indicates the quantity to be displayed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the quantity to be displayed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Indicates the quantity to be displayed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice secondaryQuantity;
	/**
	 * Used for reserve orders when Quantity applies to the primary execution
	 * market (e.g.an Electronic Communication Network) and another quantity is
	 * to be shown at other markets (e.g. the exchange).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for reserve orders when Quantity applies to the primary execution market (e.g.an Electronic Communication Network) and another quantity is to be shown at other markets (e.g. the exchange)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "ScndryQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryQuantity";
			definition = "Used for reserve orders when Quantity applies to the primary execution market (e.g.an Electronic Communication Network) and another quantity is to be shown at other markets (e.g. the exchange).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected DisplayMethod1Code method;
	/**
	 * Instructions for the use of Quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisplayMethod1Code
	 * DisplayMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for the use of Quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Instructions for the use of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DisplayMethod1Code.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice lowQuantity;
	/**
	 * Defines the lower quantity limit to a randomized refresh of Quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LwQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the lower quantity limit to a randomized refresh of Quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLowQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "LwQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowQuantity";
			definition = "Defines the lower quantity limit to a randomized refresh of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice highQuantity;
	/**
	 * Defines the upper quantity limit to a randomized refresh of Quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the upper quantity limit to a randomized refresh of Quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHighQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "HghQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighQuantity";
			definition = "Defines the upper quantity limit to a randomized refresh of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice minimumIncrement;
	/**
	 * Defines the minimum increment to be used when calculating a random
	 * refresh of Quantity. A user specifies this when he wants a larger
	 * increment than the standard provided by the market (e.g. the round lot
	 * size).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the minimum increment to be used when calculating a random refresh of Quantity. A user specifies this when he wants a larger increment than the standard provided by the market (e.g. the round lot size)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumIncrement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "MinIncrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumIncrement";
			definition = "Defines the minimum increment to be used when calculating a random refresh of Quantity. A user specifies this when he wants a larger increment than the standard provided by the market (e.g. the round lot size).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice refreshQuantity;
	/**
	 * Defines the quantity used to refresh Quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrshQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefreshQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the quantity used to refresh Quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRefreshQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "RfrshQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefreshQuantity";
			definition = "Defines the quantity used to refresh Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected RefreshTime1Code refreshTime;
	/**
	 * Defines when to refresh quantity (Immediate or Exhaust).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RefreshTime1Code
	 * RefreshTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrshTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefreshTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines when to refresh quantity (Immediate or Exhaust)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRefreshTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "RfrshTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefreshTime";
			definition = "Defines when to refresh quantity (Immediate or Exhaust).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RefreshTime1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DisplayInstruction1.mmQuantity, DisplayInstruction1.mmSecondaryQuantity, DisplayInstruction1.mmMethod, DisplayInstruction1.mmLowQuantity, DisplayInstruction1.mmHighQuantity,
						DisplayInstruction1.mmMinimumIncrement, DisplayInstruction1.mmRefreshQuantity, DisplayInstruction1.mmRefreshTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisplayInstruction1";
				definition = "Provides details about strategy order/Iceberg orders.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Qty")
	public FinancialInstrumentQuantityChoice getQuantity() {
		return quantity;
	}

	public void setQuantity(FinancialInstrumentQuantityChoice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "ScndryQty")
	public FinancialInstrumentQuantityChoice getSecondaryQuantity() {
		return secondaryQuantity;
	}

	public void setSecondaryQuantity(FinancialInstrumentQuantityChoice secondaryQuantity) {
		this.secondaryQuantity = secondaryQuantity;
	}

	@XmlElement(name = "Mtd")
	public DisplayMethod1Code getMethod() {
		return method;
	}

	public void setMethod(DisplayMethod1Code method) {
		this.method = method;
	}

	@XmlElement(name = "LwQty")
	public FinancialInstrumentQuantityChoice getLowQuantity() {
		return lowQuantity;
	}

	public void setLowQuantity(FinancialInstrumentQuantityChoice lowQuantity) {
		this.lowQuantity = lowQuantity;
	}

	@XmlElement(name = "HghQty")
	public FinancialInstrumentQuantityChoice getHighQuantity() {
		return highQuantity;
	}

	public void setHighQuantity(FinancialInstrumentQuantityChoice highQuantity) {
		this.highQuantity = highQuantity;
	}

	@XmlElement(name = "MinIncrmt")
	public FinancialInstrumentQuantityChoice getMinimumIncrement() {
		return minimumIncrement;
	}

	public void setMinimumIncrement(FinancialInstrumentQuantityChoice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
	}

	@XmlElement(name = "RfrshQty")
	public FinancialInstrumentQuantityChoice getRefreshQuantity() {
		return refreshQuantity;
	}

	public void setRefreshQuantity(FinancialInstrumentQuantityChoice refreshQuantity) {
		this.refreshQuantity = refreshQuantity;
	}

	@XmlElement(name = "RfrshTm")
	public RefreshTime1Code getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(RefreshTime1Code refreshTime) {
		this.refreshTime = refreshTime;
	}
}