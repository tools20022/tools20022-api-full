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
import com.tools20022.repository.codeset.UnitOfMeasure6Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.ProductIdentification;
import com.tools20022.repository.entity.ProductQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Product to purchase.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmProductCode
 * Product5.mmProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Product5#mmAdditionalProductCode
 * Product5.mmAdditionalProductCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmAmountLimit
 * Product5.mmAmountLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmQuantityLimit
 * Product5.mmQuantityLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmUnitOfMeasure
 * Product5.mmUnitOfMeasure}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "Product5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Product to purchase."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Product3
 * Product3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Product5", propOrder = {"productCode", "additionalProductCode", "amountLimit", "quantityLimit", "unitOfMeasure"})
public class Product5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max70Text productCode;
	/**
	 * Product code of the item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmIdentifier
	 * ProductIdentification.mmIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product5
	 * Product5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product code of the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product3#mmProductCode
	 * Product3.mmProductCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductIdentification.mmIdentifier;
			componentContext_lazy = () -> Product5.mmObject();
			isDerived = false;
			xmlTag = "PdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCode";
			definition = "Product code of the item.";
			previousVersion_lazy = () -> Product3.mmProductCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text additionalProductCode;
	/**
	 * Additional product code related to the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product5
	 * Product5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPdctCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional product code related to the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product3#mmAdditionalProductCode
	 * Product3.mmAdditionalProductCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalProductCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Product5.mmObject();
			isDerived = false;
			xmlTag = "AddtlPdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProductCode";
			definition = "Additional product code related to the product.";
			previousVersion_lazy = () -> Product3.mmAdditionalProductCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount amountLimit;
	/**
	 * Amount limit for the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product5
	 * Product5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount limit for the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product3#mmProductAmount
	 * Product3.mmProductAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountLimit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Product5.mmObject();
			isDerived = false;
			xmlTag = "AmtLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountLimit";
			definition = "Amount limit for the product.";
			previousVersion_lazy = () -> Product3.mmProductAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber quantityLimit;
	/**
	 * Quantity limit for the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product5
	 * Product5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity limit for the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product3#mmProductQuantity
	 * Product3.mmProductQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> Product5.mmObject();
			isDerived = false;
			xmlTag = "QtyLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityLimit";
			definition = "Quantity limit for the product.";
			previousVersion_lazy = () -> Product3.mmProductQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected UnitOfMeasure6Code unitOfMeasure;
	/**
	 * Unit of measure of the item purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
	 * ProductQuantity.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product5
	 * Product5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit of measure of the item purchased."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product3#mmUnitOfMeasure
	 * Product3.mmUnitOfMeasure}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitOfMeasure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> Product5.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Unit of measure of the item purchased.";
			previousVersion_lazy = () -> Product3.mmUnitOfMeasure;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnitOfMeasure6Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Product5.mmProductCode, Product5.mmAdditionalProductCode, Product5.mmAmountLimit, Product5.mmQuantityLimit, Product5.mmUnitOfMeasure);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Product5";
				definition = "Product to purchase.";
				previousVersion_lazy = () -> Product3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PdctCd", required = true)
	public Max70Text getProductCode() {
		return productCode;
	}

	public void setProductCode(Max70Text productCode) {
		this.productCode = productCode;
	}

	@XmlElement(name = "AddtlPdctCd")
	public Max70Text getAdditionalProductCode() {
		return additionalProductCode;
	}

	public void setAdditionalProductCode(Max70Text additionalProductCode) {
		this.additionalProductCode = additionalProductCode;
	}

	@XmlElement(name = "AmtLmt")
	public ImpliedCurrencyAndAmount getAmountLimit() {
		return amountLimit;
	}

	public void setAmountLimit(ImpliedCurrencyAndAmount amountLimit) {
		this.amountLimit = amountLimit;
	}

	@XmlElement(name = "QtyLmt")
	public DecimalNumber getQuantityLimit() {
		return quantityLimit;
	}

	public void setQuantityLimit(DecimalNumber quantityLimit) {
		this.quantityLimit = quantityLimit;
	}

	@XmlElement(name = "UnitOfMeasr")
	public UnitOfMeasure6Code getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasure6Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
}