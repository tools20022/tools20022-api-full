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
import com.tools20022.repository.choice.UnitOfMeasure3Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.ProductQuantity;
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
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmUnitPrice
 * UnitPrice18.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmAmount
 * UnitPrice18.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmFactor
 * UnitPrice18.mmFactor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
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
 * "UnitPrice18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.UnitPrice9
 * UnitPrice9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnitPrice18", propOrder = {"unitPrice", "amount", "factor"})
public class UnitPrice18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitOfMeasure3Choice unitPrice;
	/**
	 * Specifies the unit price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure3Choice
	 * UnitOfMeasure3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmUnitOfMeasure
	 * Price.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice18 UnitPrice18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the unit price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnitPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Price.mmUnitOfMeasure;
			componentContext_lazy = () -> UnitPrice18.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Specifies the unit price.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnitOfMeasure3Choice.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Price expressed as a currency and value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice18 UnitPrice18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#mmAmount
	 * UnitPrice9.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> UnitPrice18.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			previousVersion_lazy = () -> UnitPrice9.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max15NumericText factor;
	/**
	 * Multiplication factor of measurement values. For example: goods that can
	 * be ordered by 36 pieces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmFactor
	 * ProductQuantity.mmFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice18 UnitPrice18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#mmFactor
	 * UnitPrice9.mmFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmFactor;
			componentContext_lazy = () -> UnitPrice18.mmObject();
			isDerived = false;
			xmlTag = "Fctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			previousVersion_lazy = () -> UnitPrice9.mmFactor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnitPrice18.mmUnitPrice, UnitPrice18.mmAmount, UnitPrice18.mmFactor);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitPrice18";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				previousVersion_lazy = () -> UnitPrice9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UnitPric", required = true)
	public UnitOfMeasure3Choice getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(UnitOfMeasure3Choice unitPrice) {
		this.unitPrice = unitPrice;
	}

	@XmlElement(name = "Amt", required = true)
	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "Fctr")
	public Max15NumericText getFactor() {
		return factor;
	}

	public void setFactor(Max15NumericText factor) {
		this.factor = factor;
	}
}