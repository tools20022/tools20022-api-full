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
import com.tools20022.repository.codeset.AttendanceContext2Code;
import com.tools20022.repository.codeset.UnitOfMeasure6Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.ProductIdentification;
import com.tools20022.repository.entity.ProductQuantity;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Purchased item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmItemIdentification
 * Product3.mmItemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductCode
 * Product3.mmProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Product3#mmAdditionalProductCode
 * Product3.mmAdditionalProductCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitOfMeasure
 * Product3.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductQuantity
 * Product3.mmProductQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitPrice
 * Product3.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitPriceSign
 * Product3.mmUnitPriceSign}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductAmount
 * Product3.mmProductAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductAmountSign
 * Product3.mmProductAmountSign}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmValueAddedTax
 * Product3.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmTaxType
 * Product3.mmTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductDescription
 * Product3.mmProductDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmDeliveryLocation
 * Product3.mmDeliveryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmDeliveryService
 * Product3.mmDeliveryService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Product3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Purchased item."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product4 Product4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5 Product5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Product1
 * Product1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Product3", propOrder = {"itemIdentification", "productCode", "additionalProductCode", "unitOfMeasure", "productQuantity", "unitPrice", "unitPriceSign", "productAmount", "productAmountSign", "valueAddedTax", "taxType",
		"productDescription", "deliveryLocation", "deliveryService"})
public class Product3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmId")
	protected Max35Text itemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the item inside the purchase transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "ItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIdentification";
			definition = "Identification of the item inside the purchase transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PdctCd", required = true)
	protected Max70Text productCode;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product4#mmProductCode
	 * Product4.mmProductCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmProductCode
	 * Product5.mmProductCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmProductCode
	 * Product1.mmProductCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductIdentification.mmIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "PdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCode";
			definition = "Product code of the item.";
			nextVersions_lazy = () -> Arrays.asList(Product4.mmProductCode, Product5.mmProductCode);
			previousVersion_lazy = () -> Product1.mmProductCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "AddtlPdctCd")
	protected Max70Text additionalProductCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Product4#mmAdditionalProductCode
	 * Product4.mmAdditionalProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Product5#mmAdditionalProductCode
	 * Product5.mmAdditionalProductCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalProductCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "AddtlPdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProductCode";
			definition = "Additional product code related to the product.";
			nextVersions_lazy = () -> Arrays.asList(Product4.mmAdditionalProductCode, Product5.mmAdditionalProductCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "UnitOfMeasr")
	protected UnitOfMeasure6Code unitOfMeasure;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmUnitOfMeasure
	 * Product5.mmUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmUnitOfMeasure
	 * Product1.mmUnitOfMeasure}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitOfMeasure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Unit of measure of the item purchased.";
			nextVersions_lazy = () -> Arrays.asList(Product5.mmUnitOfMeasure);
			previousVersion_lazy = () -> Product1.mmUnitOfMeasure;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnitOfMeasure6Code.mmObject();
		}
	};
	@XmlElement(name = "PdctQty")
	protected DecimalNumber productQuantity;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product quantity."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmQuantityLimit
	 * Product5.mmQuantityLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmProductQuantity
	 * Product1.mmProductQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "PdctQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductQuantity";
			definition = "Product quantity.";
			nextVersions_lazy = () -> Arrays.asList(Product5.mmQuantityLimit);
			previousVersion_lazy = () -> Product1.mmProductQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "UnitPric")
	protected ImpliedCurrencyAndAmount unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
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
	 * definition} = "Price per unit of product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmUnitPrice
	 * Product1.mmUnitPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			previousVersion_lazy = () -> Product1.mmUnitPrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "UnitPricSgn")
	protected PlusOrMinusIndicator unitPriceSign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPricSgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriceSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the unit price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitPriceSign = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "UnitPricSgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriceSign";
			definition = "Sign of the unit price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	@XmlElement(name = "PdctAmt", required = true)
	protected ImpliedCurrencyAndAmount productAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monetary value of purchased product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmAmountLimit
	 * Product5.mmAmountLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmProductAmount
	 * Product1.mmProductAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "PdctAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductAmount";
			definition = "Monetary value of purchased product.";
			nextVersions_lazy = () -> Arrays.asList(Product5.mmAmountLimit);
			previousVersion_lazy = () -> Product1.mmProductAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PdctAmtSgn")
	protected PlusOrMinusIndicator productAmountSign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctAmtSgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductAmountSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the product amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductAmountSign = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "PdctAmtSgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductAmountSign";
			definition = "Sign of the product amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected ImpliedCurrencyAndAmount valueAddedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value added tax amount of the item included in the product amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTax = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Value added tax amount of the item included in the product amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TaxTp")
	protected Max35Text taxType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on tax paid on the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmTaxType
	 * Product1.mmTaxType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "TaxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxType";
			definition = "Information on tax paid on the product.";
			previousVersion_lazy = () -> Product1.mmTaxType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PdctDesc")
	protected Max140Text productDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the product or item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Product1#mmAdditionalProductInformation
	 * Product1.mmAdditionalProductInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "PdctDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductDescription";
			definition = "Description of the product or item.";
			previousVersion_lazy = () -> Product1.mmAdditionalProductInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "DlvryLctn")
	protected Max10Text deliveryLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location of the delivery of the item, for instance pump number or parking bay."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryLocation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "DlvryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryLocation";
			definition = "Location of the delivery of the item, for instance pump number or parking bay.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	@XmlElement(name = "DlvrySvc")
	protected AttendanceContext2Code deliveryService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext2Code
	 * AttendanceContext2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Product3
	 * Product3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrySvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the method of delivery or distribution of the item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
			isDerived = false;
			xmlTag = "DlvrySvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryService";
			definition = "Identify the method of delivery or distribution of the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext2Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product3.mmItemIdentification, com.tools20022.repository.msg.Product3.mmProductCode, com.tools20022.repository.msg.Product3.mmAdditionalProductCode,
						com.tools20022.repository.msg.Product3.mmUnitOfMeasure, com.tools20022.repository.msg.Product3.mmProductQuantity, com.tools20022.repository.msg.Product3.mmUnitPrice,
						com.tools20022.repository.msg.Product3.mmUnitPriceSign, com.tools20022.repository.msg.Product3.mmProductAmount, com.tools20022.repository.msg.Product3.mmProductAmountSign,
						com.tools20022.repository.msg.Product3.mmValueAddedTax, com.tools20022.repository.msg.Product3.mmTaxType, com.tools20022.repository.msg.Product3.mmProductDescription,
						com.tools20022.repository.msg.Product3.mmDeliveryLocation, com.tools20022.repository.msg.Product3.mmDeliveryService);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Product3";
				definition = "Purchased item.";
				nextVersions_lazy = () -> Arrays.asList(Product4.mmObject(), Product5.mmObject());
				previousVersion_lazy = () -> Product1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getItemIdentification() {
		return itemIdentification == null ? Optional.empty() : Optional.of(itemIdentification);
	}

	public Product3 setItemIdentification(Max35Text itemIdentification) {
		this.itemIdentification = itemIdentification;
		return this;
	}

	public Max70Text getProductCode() {
		return productCode;
	}

	public Product3 setProductCode(Max70Text productCode) {
		this.productCode = Objects.requireNonNull(productCode);
		return this;
	}

	public Optional<Max70Text> getAdditionalProductCode() {
		return additionalProductCode == null ? Optional.empty() : Optional.of(additionalProductCode);
	}

	public Product3 setAdditionalProductCode(Max70Text additionalProductCode) {
		this.additionalProductCode = additionalProductCode;
		return this;
	}

	public Optional<UnitOfMeasure6Code> getUnitOfMeasure() {
		return unitOfMeasure == null ? Optional.empty() : Optional.of(unitOfMeasure);
	}

	public Product3 setUnitOfMeasure(UnitOfMeasure6Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
		return this;
	}

	public Optional<DecimalNumber> getProductQuantity() {
		return productQuantity == null ? Optional.empty() : Optional.of(productQuantity);
	}

	public Product3 setProductQuantity(DecimalNumber productQuantity) {
		this.productQuantity = productQuantity;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getUnitPrice() {
		return unitPrice == null ? Optional.empty() : Optional.of(unitPrice);
	}

	public Product3 setUnitPrice(ImpliedCurrencyAndAmount unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public Optional<PlusOrMinusIndicator> getUnitPriceSign() {
		return unitPriceSign == null ? Optional.empty() : Optional.of(unitPriceSign);
	}

	public Product3 setUnitPriceSign(PlusOrMinusIndicator unitPriceSign) {
		this.unitPriceSign = unitPriceSign;
		return this;
	}

	public ImpliedCurrencyAndAmount getProductAmount() {
		return productAmount;
	}

	public Product3 setProductAmount(ImpliedCurrencyAndAmount productAmount) {
		this.productAmount = Objects.requireNonNull(productAmount);
		return this;
	}

	public Optional<PlusOrMinusIndicator> getProductAmountSign() {
		return productAmountSign == null ? Optional.empty() : Optional.of(productAmountSign);
	}

	public Product3 setProductAmountSign(PlusOrMinusIndicator productAmountSign) {
		this.productAmountSign = productAmountSign;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getValueAddedTax() {
		return valueAddedTax == null ? Optional.empty() : Optional.of(valueAddedTax);
	}

	public Product3 setValueAddedTax(ImpliedCurrencyAndAmount valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
		return this;
	}

	public Optional<Max35Text> getTaxType() {
		return taxType == null ? Optional.empty() : Optional.of(taxType);
	}

	public Product3 setTaxType(Max35Text taxType) {
		this.taxType = taxType;
		return this;
	}

	public Optional<Max140Text> getProductDescription() {
		return productDescription == null ? Optional.empty() : Optional.of(productDescription);
	}

	public Product3 setProductDescription(Max140Text productDescription) {
		this.productDescription = productDescription;
		return this;
	}

	public Optional<Max10Text> getDeliveryLocation() {
		return deliveryLocation == null ? Optional.empty() : Optional.of(deliveryLocation);
	}

	public Product3 setDeliveryLocation(Max10Text deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
		return this;
	}

	public Optional<AttendanceContext2Code> getDeliveryService() {
		return deliveryService == null ? Optional.empty() : Optional.of(deliveryService);
	}

	public Product3 setDeliveryService(AttendanceContext2Code deliveryService) {
		this.deliveryService = deliveryService;
		return this;
	}
}