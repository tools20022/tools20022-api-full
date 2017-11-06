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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CertifiedCharacteristics1Choice;
import com.tools20022.repository.choice.CertifiedCharacteristics2Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Item that is offered for sale. Products can be services or goods.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Product" src="doc-files/Product.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
 * Product.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmProductCategory
 * Product.mmProductCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmLineItem
 * Product.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
 * Product.mmProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmName
 * Product.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDescription
 * Product.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmOrigin
 * Product.mmOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
 * Product.mmCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmNetPrice
 * Product.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuantity
 * Product.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
 * Product.mmGrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuality
 * Product.mmQuality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDelivery
 * Product.mmDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmPurchaseOrder
 * Product.mmPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Service Service}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods Goods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialProduct
 * FinancialProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
 * Country.mmProducedProducts}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
 * Price.mmUnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
 * Price.mmNetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
 * Price.mmGrossPriceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
 * ProductIdentification.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
 * ProductQuantity.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
 * ProductCategory.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
 * LineItem.mmInvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
 * ProductDelivery.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
 * ProductCharacteristics.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
 * PurchaseOrder.mmProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product1 Product1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
 * CertifiedCharacteristics1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceItemTotals1
 * ServiceItemTotals1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
 * CertifiedCharacteristics2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3 Product3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product4 Product4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5 Product5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Product"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Item that is offered for sale. Products can be services or goods."</li>
 * </ul>
 */
public class Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPayment cardPayment;
	/**
	 * Card payment for which a product was specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a product was specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Price> unitPrice;
	/**
	 * Price per unit of product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
	 * Price.mmUnitPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmUnitPrice
	 * Product2.mmUnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmUnitPrice
	 * Product1.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmUnitPrice
	 * LineItemDetails4.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmUnitPrice
	 * LineItemDetails7.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmUnitPrice
	 * LineItemDetails6.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmUnitPrice
	 * LineItemDetails9.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#mmPricingAmount
	 * BillingServicesAmount1.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#mmPricingAmount
	 * BillingServicesAmount2.mmPricingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService1#mmPrice
	 * BillingService1.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargePrice
	 * BillingService1.mmOriginalChargePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmUnitPrice
	 * BillingServiceParameters2.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmPriceChange
	 * BillingServiceAdjustment1.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalPrice
	 * BillingServiceAdjustment1.mmOriginalPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewPrice
	 * BillingServiceAdjustment1.mmNewPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmUnitPrice
	 * LineItemDetails10.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmUnitPrice
	 * LineItemDetails11.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmUnitPrice
	 * LineItemDetails13.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmUnitPrice
	 * LineItemDetails14.mmUnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#mmPrice
	 * BillingService2.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargePrice
	 * BillingService2.mmOriginalChargePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitPrice
	 * Product3.mmUnitPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnitPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.mmUnitPrice, com.tools20022.repository.msg.Product1.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails4.mmUnitPrice,
					com.tools20022.repository.msg.LineItemDetails7.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails6.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails9.mmUnitPrice,
					com.tools20022.repository.msg.BillingServicesAmount1.mmPricingAmount, com.tools20022.repository.msg.BillingServicesAmount2.mmPricingAmount, com.tools20022.repository.msg.BillingService1.mmPrice,
					com.tools20022.repository.msg.BillingService1.mmOriginalChargePrice, com.tools20022.repository.msg.BillingServiceParameters2.mmUnitPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.mmPriceChange,
					com.tools20022.repository.msg.BillingServiceAdjustment1.mmOriginalPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.mmNewPrice, com.tools20022.repository.msg.LineItemDetails10.mmUnitPrice,
					com.tools20022.repository.msg.LineItemDetails11.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails13.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails14.mmUnitPrice,
					com.tools20022.repository.msg.BillingService2.mmPrice, com.tools20022.repository.msg.BillingService2.mmOriginalChargePrice, com.tools20022.repository.msg.Product3.mmUnitPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmUnitPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductCategory> productCategory;
	/**
	 * Category of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
	 * ProductCategory.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData4#mmProductType
	 * TradeData4.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData5#mmProductType
	 * TradeData5.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmProductType
	 * TradeData6.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCategory
	 * TradeProduct1.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductCategory
	 * LineItemDetails4.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductCategory
	 * LineItemDetails7.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCategory
	 * LineItemDetails5.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductCategory
	 * LineItemDetails8.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductCategory
	 * LineItemDetails6.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductCategory
	 * LineItemDetails9.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductCategory
	 * LineItemDetails10.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductCategory
	 * LineItemDetails11.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCategory
	 * LineItemDetails13.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductCategory
	 * LineItemDetails12.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductCategory
	 * LineItemDetails14.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCategory
	 * TradeProduct2.mmProductCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductCategory = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData4.mmProductType, com.tools20022.repository.msg.TradeData5.mmProductType, com.tools20022.repository.msg.TradeData6.mmProductType,
					com.tools20022.repository.msg.TradeProduct1.mmProductCategory, com.tools20022.repository.msg.LineItemDetails4.mmProductCategory, com.tools20022.repository.msg.LineItemDetails7.mmProductCategory,
					com.tools20022.repository.msg.LineItemDetails5.mmProductCategory, com.tools20022.repository.msg.LineItemDetails8.mmProductCategory, com.tools20022.repository.msg.LineItemDetails6.mmProductCategory,
					com.tools20022.repository.msg.LineItemDetails9.mmProductCategory, com.tools20022.repository.msg.LineItemDetails10.mmProductCategory, com.tools20022.repository.msg.LineItemDetails11.mmProductCategory,
					com.tools20022.repository.msg.LineItemDetails13.mmProductCategory, com.tools20022.repository.msg.LineItemDetails12.mmProductCategory, com.tools20022.repository.msg.LineItemDetails14.mmProductCategory,
					com.tools20022.repository.msg.TradeProduct2.mmProductCategory);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
		}
	};
	protected LineItem lineItem;
	/**
	 * Specifies the line item in which the product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
	 * LineItem.mmInvoicedProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item in which the product is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmInvoicedProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductIdentification> productIdentification;
	/**
	 * Identification of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
	 * ProductIdentification.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmIdentification
	 * TradeProduct1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductIdentifier
	 * LineItemDetails4.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductIdentifier
	 * LineItemDetails7.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductIdentifier
	 * LineItemDetails5.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductIdentifier
	 * LineItemDetails8.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductIdentifier
	 * LineItemDetails6.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductIdentifier
	 * LineItemDetails9.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductIdentifier
	 * LineItemDetails10.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductIdentifier
	 * LineItemDetails11.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductIdentifier
	 * LineItemDetails13.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductIdentifier
	 * LineItemDetails12.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductIdentifier
	 * LineItemDetails14.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmIdentification
	 * TradeProduct2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmIdentification, com.tools20022.repository.msg.LineItemDetails4.mmProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails7.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails5.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails8.mmProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails6.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails9.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails10.mmProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails11.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails13.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails12.mmProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails14.mmProductIdentifier, com.tools20022.repository.msg.TradeProduct2.mmIdentification);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
		}
	};
	protected Max35Text name;
	/**
	 * Name of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#mmName
	 * TradeProduct1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductName
	 * LineItemDetails4.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductName
	 * LineItemDetails7.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductName
	 * LineItemDetails5.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductName
	 * LineItemDetails8.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductName
	 * LineItemDetails6.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductName
	 * LineItemDetails9.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification1#mmIdentification
	 * BillingServiceIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductName
	 * LineItemDetails10.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductName
	 * LineItemDetails11.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductName
	 * LineItemDetails13.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductName
	 * LineItemDetails12.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductName
	 * LineItemDetails14.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmIdentification
	 * BillingServiceIdentification3.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmName
	 * TradeProduct2.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmName, com.tools20022.repository.msg.LineItemDetails4.mmProductName, com.tools20022.repository.msg.LineItemDetails7.mmProductName,
					com.tools20022.repository.msg.LineItemDetails5.mmProductName, com.tools20022.repository.msg.LineItemDetails8.mmProductName, com.tools20022.repository.msg.LineItemDetails6.mmProductName,
					com.tools20022.repository.msg.LineItemDetails9.mmProductName, com.tools20022.repository.msg.BillingServiceIdentification1.mmIdentification, com.tools20022.repository.msg.LineItemDetails10.mmProductName,
					com.tools20022.repository.msg.LineItemDetails11.mmProductName, com.tools20022.repository.msg.LineItemDetails13.mmProductName, com.tools20022.repository.msg.LineItemDetails12.mmProductName,
					com.tools20022.repository.msg.LineItemDetails14.mmProductName, com.tools20022.repository.msg.BillingServiceIdentification3.mmIdentification, com.tools20022.repository.msg.TradeProduct2.mmName);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max140Text description;
	/**
	 * Information about the goods and/or services of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmDescription
	 * TradeProduct1.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#mmGoodsDescription
	 * LineItem5.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmGoodsDescription
	 * LineItem7.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportedGoods1#mmGoodsDescription
	 * TransportedGoods1.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuredGoodsDescription
	 * InsuranceDataSet1.mmInsuredGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmGoodsDescription
	 * CertificateDataSet1.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmGoodsDescription
	 * LineItem11.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmGoodsDescription
	 * CertificateDataSet2.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmGoodsAndOrServicesDescription
	 * LineItem13.mmGoodsAndOrServicesDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmDescription
	 * TradeProduct2.mmDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmDescription, com.tools20022.repository.msg.LineItem5.mmGoodsDescription, com.tools20022.repository.msg.LineItem7.mmGoodsDescription,
					com.tools20022.repository.msg.TransportedGoods1.mmGoodsDescription, com.tools20022.repository.msg.InsuranceDataSet1.mmInsuredGoodsDescription, com.tools20022.repository.msg.CertificateDataSet1.mmGoodsDescription,
					com.tools20022.repository.msg.LineItem11.mmGoodsDescription, com.tools20022.repository.msg.CertificateDataSet2.mmGoodsDescription, com.tools20022.repository.msg.LineItem13.mmGoodsAndOrServicesDescription,
					com.tools20022.repository.msg.TradeProduct2.mmDescription);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Country origin;
	/**
	 * Country from which the product originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
	 * Country.mmProducedProducts}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmCountryOfOrigin
	 * TradeProduct1.mmCountryOfOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmOrigin
	 * CertifiedCharacteristics1Choice.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmOrigin
	 * CertifiedCharacteristics2Choice.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmCountryOfOrigin
	 * TradeProduct2.mmCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country from which the product originates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrigin = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmCountryOfOrigin, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmOrigin,
					com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmOrigin, com.tools20022.repository.msg.TradeProduct2.mmCountryOfOrigin);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmProducedProducts;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductCharacteristics> characteristics;
	/**
	 * Characteristics of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
	 * ProductCharacteristics.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCharacteristics
	 * TradeProduct1.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductCharacteristics
	 * LineItemDetails4.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductCharacteristics
	 * LineItemDetails7.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCharacteristics
	 * LineItemDetails5.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductCharacteristics
	 * LineItemDetails8.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductCharacteristics
	 * LineItemDetails6.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductCharacteristics
	 * LineItemDetails9.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductCharacteristics
	 * LineItemDetails10.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductCharacteristics
	 * LineItemDetails11.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCharacteristics
	 * LineItemDetails13.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductCharacteristics
	 * LineItemDetails12.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductCharacteristics
	 * LineItemDetails14.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCharacteristics
	 * TradeProduct2.mmProductCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCharacteristics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails4.mmProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails7.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails5.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails8.mmProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails6.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails9.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails10.mmProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails11.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails13.mmProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails12.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails14.mmProductCharacteristics, com.tools20022.repository.msg.TradeProduct2.mmProductCharacteristics);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.mmObject();
		}
	};
	protected Price netPrice;
	/**
	 * Net price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
	 * Price.mmNetPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetPrice
	 * LineItem10.mmNetPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetPrice
	 * LineItem16.mmNetPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net price of the goods and/or service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmNetPrice, com.tools20022.repository.msg.LineItem16.mmNetPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmNetPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> quantity;
	/**
	 * Specifies the quantity of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
	 * ProductQuantity.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmNetPriceQuantity
	 * LineItem10.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPriceQuantity
	 * LineItem10.mmGrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossWeight
	 * LineItem10.mmGrossWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmQuantity
	 * LineItemDetails7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOrderedQuantity
	 * LineItemDetails5.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmOrderedQuantity
	 * LineItemDetails8.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmQuantity
	 * LineItemDetails6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmQuantity
	 * LineItemDetails9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmWeight
	 * CertifiedCharacteristics1Choice.mmWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuantity
	 * CertifiedCharacteristics1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmQuantity
	 * LineItemDetails10.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmQuantity
	 * LineItemDetails11.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmWeight
	 * CertifiedCharacteristics2Choice.mmWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuantity
	 * CertifiedCharacteristics2Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmQuantity
	 * LineItemDetails13.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmOrderedQuantity
	 * LineItemDetails12.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmQuantity
	 * LineItemDetails14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmNetPriceQuantity
	 * LineItem16.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPriceQuantity
	 * LineItem16.mmGrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossWeight
	 * LineItem16.mmGrossWeight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmNetPriceQuantity, com.tools20022.repository.msg.LineItem10.mmGrossPriceQuantity, com.tools20022.repository.msg.LineItem10.mmGrossWeight,
					com.tools20022.repository.msg.LineItemDetails7.mmQuantity, com.tools20022.repository.msg.LineItemDetails5.mmOrderedQuantity, com.tools20022.repository.msg.LineItemDetails8.mmOrderedQuantity,
					com.tools20022.repository.msg.LineItemDetails6.mmQuantity, com.tools20022.repository.msg.LineItemDetails9.mmQuantity, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmWeight,
					com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuantity, com.tools20022.repository.msg.LineItemDetails10.mmQuantity, com.tools20022.repository.msg.LineItemDetails11.mmQuantity,
					com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmWeight, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmQuantity, com.tools20022.repository.msg.LineItemDetails13.mmQuantity,
					com.tools20022.repository.msg.LineItemDetails12.mmOrderedQuantity, com.tools20022.repository.msg.LineItemDetails14.mmQuantity, com.tools20022.repository.msg.LineItem16.mmNetPriceQuantity,
					com.tools20022.repository.msg.LineItem16.mmGrossPriceQuantity, com.tools20022.repository.msg.LineItem16.mmGrossWeight);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected Price grossPrice;
	/**
	 * Gross price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
	 * Price.mmGrossPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPrice
	 * LineItem10.mmGrossPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPrice
	 * LineItem16.mmGrossPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross price of the goods and/or service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmGrossPrice, com.tools20022.repository.msg.LineItem16.mmGrossPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmGrossPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected Max70Text quality;
	/**
	 * Quality of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuality
	 * CertifiedCharacteristics1Choice.mmQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuality
	 * CertifiedCharacteristics2Choice.mmQuality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuality = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuality, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmQuality);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ProductDelivery delivery;
	/**
	 * Delivery process of a product
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
	 * ProductDelivery.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery process of a product"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PurchaseOrder> purchaseOrder;
	/**
	 * Specifies the purchase order in which a specific product is ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
	 * PurchaseOrder.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order in which a specific product is ordered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Tax> tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods and
	 * services in a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmProduct
	 * Tax.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTax
	 * TradeSettlement1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmSubTotalCalculatedTax
	 * TradeSettlement1.mmSubTotalCalculatedTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmTax
	 * LineItem10.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#mmTax
	 * LineItemDetails4.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTax
	 * LineItem5.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#mmTax
	 * LineItemDetails7.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmTax
	 * LineItem7.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6#mmTax
	 * LineItemDetails6.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmTax
	 * LineItem4.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9#mmTax
	 * LineItemDetails9.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmTax
	 * LineItem9.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxCalculation
	 * BillingService1.mmTaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#mmTax
	 * LineItem11.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails10#mmTax
	 * LineItemDetails10.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmTax
	 * LineItem12.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails11#mmTax
	 * LineItemDetails11.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmTax
	 * LineItemDetails13.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTax
	 * LineItem13.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmTax
	 * LineItem15.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails14#mmTax
	 * LineItemDetails14.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxCalculation
	 * BillingService2.mmTaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTax
	 * LineItem16.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.mmTax, com.tools20022.repository.msg.TradeSettlement1.mmSubTotalCalculatedTax, com.tools20022.repository.msg.LineItem10.mmTax,
					com.tools20022.repository.msg.LineItemDetails4.mmTax, com.tools20022.repository.msg.LineItem5.mmTax, com.tools20022.repository.msg.LineItemDetails7.mmTax, com.tools20022.repository.msg.LineItem7.mmTax,
					com.tools20022.repository.msg.LineItemDetails6.mmTax, com.tools20022.repository.msg.LineItem4.mmTax, com.tools20022.repository.msg.LineItemDetails9.mmTax, com.tools20022.repository.msg.LineItem9.mmTax,
					com.tools20022.repository.msg.BillingService1.mmTaxCalculation, com.tools20022.repository.msg.LineItem11.mmTax, com.tools20022.repository.msg.LineItemDetails10.mmTax, com.tools20022.repository.msg.LineItem12.mmTax,
					com.tools20022.repository.msg.LineItemDetails11.mmTax, com.tools20022.repository.msg.LineItemDetails13.mmTax, com.tools20022.repository.msg.LineItem13.mmTax, com.tools20022.repository.msg.LineItem15.mmTax,
					com.tools20022.repository.msg.LineItemDetails14.mmTax, com.tools20022.repository.msg.BillingService2.mmTaxCalculation, com.tools20022.repository.msg.LineItem16.mmTax);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmProducedProducts, com.tools20022.repository.entity.Tax.mmProduct, com.tools20022.repository.entity.CardPayment.mmProduct,
						com.tools20022.repository.entity.Price.mmUnitPriceProduct, com.tools20022.repository.entity.Price.mmNetPriceProduct, com.tools20022.repository.entity.Price.mmGrossPriceProduct,
						com.tools20022.repository.entity.ProductIdentification.mmProduct, com.tools20022.repository.entity.ProductQuantity.mmProduct, com.tools20022.repository.entity.ProductCategory.mmProduct,
						com.tools20022.repository.entity.LineItem.mmInvoicedProduct, com.tools20022.repository.entity.ProductDelivery.mmProduct, com.tools20022.repository.entity.ProductCharacteristics.mmProduct,
						com.tools20022.repository.entity.PurchaseOrder.mmProduct);
				subType_lazy = () -> Arrays.asList(Service.mmObject(), Goods.mmObject(), FinancialProduct.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.Product.mmUnitPrice, com.tools20022.repository.entity.Product.mmProductCategory,
						com.tools20022.repository.entity.Product.mmLineItem, com.tools20022.repository.entity.Product.mmProductIdentification, com.tools20022.repository.entity.Product.mmName,
						com.tools20022.repository.entity.Product.mmDescription, com.tools20022.repository.entity.Product.mmOrigin, com.tools20022.repository.entity.Product.mmCharacteristics,
						com.tools20022.repository.entity.Product.mmNetPrice, com.tools20022.repository.entity.Product.mmQuantity, com.tools20022.repository.entity.Product.mmGrossPrice, com.tools20022.repository.entity.Product.mmQuality,
						com.tools20022.repository.entity.Product.mmDelivery, com.tools20022.repository.entity.Product.mmPurchaseOrder, com.tools20022.repository.entity.Product.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(Product2.mmObject(), Product1.mmObject(), TradeProduct1.mmObject(), CertifiedCharacteristics1Choice.mmObject(), ServiceItemTotals1.mmObject(),
						CertifiedCharacteristics2Choice.mmObject(), Product3.mmObject(), Product4.mmObject(), Product5.mmObject(), TradeProduct2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardPayment getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(com.tools20022.repository.entity.CardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public List<Price> getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(List<com.tools20022.repository.entity.Price> unitPrice) {
		this.unitPrice = unitPrice;
	}

	public List<ProductCategory> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<com.tools20022.repository.entity.ProductCategory> productCategory) {
		this.productCategory = productCategory;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(com.tools20022.repository.entity.LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public List<ProductIdentification> getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(List<com.tools20022.repository.entity.ProductIdentification> productIdentification) {
		this.productIdentification = productIdentification;
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public Max140Text getDescription() {
		return description;
	}

	public void setDescription(Max140Text description) {
		this.description = description;
	}

	public Country getOrigin() {
		return origin;
	}

	public void setOrigin(com.tools20022.repository.entity.Country origin) {
		this.origin = origin;
	}

	public List<ProductCharacteristics> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<com.tools20022.repository.entity.ProductCharacteristics> characteristics) {
		this.characteristics = characteristics;
	}

	public Price getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(com.tools20022.repository.entity.Price netPrice) {
		this.netPrice = netPrice;
	}

	public List<ProductQuantity> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<com.tools20022.repository.entity.ProductQuantity> quantity) {
		this.quantity = quantity;
	}

	public Price getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(com.tools20022.repository.entity.Price grossPrice) {
		this.grossPrice = grossPrice;
	}

	public Max70Text getQuality() {
		return quality;
	}

	public void setQuality(Max70Text quality) {
		this.quality = quality;
	}

	public ProductDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(com.tools20022.repository.entity.ProductDelivery delivery) {
		this.delivery = delivery;
	}

	public List<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(List<com.tools20022.repository.entity.PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public List<Tax> getTax() {
		return tax;
	}

	public void setTax(List<com.tools20022.repository.entity.Tax> tax) {
		this.tax = tax;
	}
}