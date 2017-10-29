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
 * <li>{@linkplain com.tools20022.repository.entity.Product#CardPayment
 * Product.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#UnitPrice
 * Product.UnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#ProductCategory
 * Product.ProductCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#LineItem
 * Product.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#ProductIdentification
 * Product.ProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Name Product.Name}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Description
 * Product.Description}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Origin
 * Product.Origin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Characteristics
 * Product.Characteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#NetPrice
 * Product.NetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Quantity
 * Product.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#GrossPrice
 * Product.GrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Quality
 * Product.Quality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Delivery
 * Product.Delivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#PurchaseOrder
 * Product.PurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Tax Product.Tax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#ProducedProducts
 * Country.ProducedProducts}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Product Tax.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Product
 * CardPayment.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#UnitPriceProduct
 * Price.UnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#NetPriceProduct
 * Price.NetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#GrossPriceProduct
 * Price.GrossPriceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#Product
 * ProductIdentification.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#Product
 * ProductQuantity.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#Product
 * ProductCategory.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#InvoicedProduct
 * LineItem.InvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Product
 * ProductDelivery.Product}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#Product
 * ProductCharacteristics.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#Product
 * PurchaseOrder.Product}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Card payment for which a product was specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#Product
	 * CardPayment.Product}</li>
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
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price per unit of product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#UnitPriceProduct
	 * Price.UnitPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#UnitPrice
	 * Product2.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#UnitPrice
	 * Product1.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#UnitPrice
	 * LineItemDetails4.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#UnitPrice
	 * LineItemDetails7.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6#UnitPrice
	 * LineItemDetails6.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9#UnitPrice
	 * LineItemDetails9.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#PricingAmount
	 * BillingServicesAmount1.PricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#PricingAmount
	 * BillingServicesAmount2.PricingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService1#Price
	 * BillingService1.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#OriginalChargePrice
	 * BillingService1.OriginalChargePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#UnitPrice
	 * BillingServiceParameters2.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#PriceChange
	 * BillingServiceAdjustment1.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalPrice
	 * BillingServiceAdjustment1.OriginalPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewPrice
	 * BillingServiceAdjustment1.NewPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#UnitPrice
	 * LineItemDetails10.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#UnitPrice
	 * LineItemDetails11.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#UnitPrice
	 * LineItemDetails13.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#UnitPrice
	 * LineItemDetails14.UnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#Price
	 * BillingService2.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#OriginalChargePrice
	 * BillingService2.OriginalChargePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#UnitPrice
	 * Product3.UnitPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd UnitPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.UnitPrice, com.tools20022.repository.msg.Product1.UnitPrice, com.tools20022.repository.msg.LineItemDetails4.UnitPrice,
					com.tools20022.repository.msg.LineItemDetails7.UnitPrice, com.tools20022.repository.msg.LineItemDetails6.UnitPrice, com.tools20022.repository.msg.LineItemDetails9.UnitPrice,
					com.tools20022.repository.msg.BillingServicesAmount1.PricingAmount, com.tools20022.repository.msg.BillingServicesAmount2.PricingAmount, com.tools20022.repository.msg.BillingService1.Price,
					com.tools20022.repository.msg.BillingService1.OriginalChargePrice, com.tools20022.repository.msg.BillingServiceParameters2.UnitPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.PriceChange,
					com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.NewPrice, com.tools20022.repository.msg.LineItemDetails10.UnitPrice,
					com.tools20022.repository.msg.LineItemDetails11.UnitPrice, com.tools20022.repository.msg.LineItemDetails13.UnitPrice, com.tools20022.repository.msg.LineItemDetails14.UnitPrice,
					com.tools20022.repository.msg.BillingService2.Price, com.tools20022.repository.msg.BillingService2.OriginalChargePrice, com.tools20022.repository.msg.Product3.UnitPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.UnitPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Category of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#Product
	 * ProductCategory.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData4#ProductType
	 * TradeData4.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData5#ProductType
	 * TradeData5.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#ProductType
	 * TradeData6.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#ProductCategory
	 * TradeProduct1.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#ProductCategory
	 * LineItemDetails4.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ProductCategory
	 * LineItemDetails7.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#ProductCategory
	 * LineItemDetails5.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductCategory
	 * LineItemDetails8.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#ProductCategory
	 * LineItemDetails6.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#ProductCategory
	 * LineItemDetails9.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ProductCategory
	 * LineItemDetails10.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#ProductCategory
	 * LineItemDetails11.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ProductCategory
	 * LineItemDetails13.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductCategory
	 * LineItemDetails12.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#ProductCategory
	 * LineItemDetails14.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#ProductCategory
	 * TradeProduct2.ProductCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd ProductCategory = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData4.ProductType, com.tools20022.repository.msg.TradeData5.ProductType, com.tools20022.repository.msg.TradeData6.ProductType,
					com.tools20022.repository.msg.TradeProduct1.ProductCategory, com.tools20022.repository.msg.LineItemDetails4.ProductCategory, com.tools20022.repository.msg.LineItemDetails7.ProductCategory,
					com.tools20022.repository.msg.LineItemDetails5.ProductCategory, com.tools20022.repository.msg.LineItemDetails8.ProductCategory, com.tools20022.repository.msg.LineItemDetails6.ProductCategory,
					com.tools20022.repository.msg.LineItemDetails9.ProductCategory, com.tools20022.repository.msg.LineItemDetails10.ProductCategory, com.tools20022.repository.msg.LineItemDetails11.ProductCategory,
					com.tools20022.repository.msg.LineItemDetails13.ProductCategory, com.tools20022.repository.msg.LineItemDetails12.ProductCategory, com.tools20022.repository.msg.LineItemDetails14.ProductCategory,
					com.tools20022.repository.msg.TradeProduct2.ProductCategory);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item in which the product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#InvoicedProduct
	 * LineItem.InvoicedProduct}</li>
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
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.InvoicedProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#Product
	 * ProductIdentification.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#Identification
	 * TradeProduct1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#ProductIdentifier
	 * LineItemDetails4.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ProductIdentifier
	 * LineItemDetails7.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#ProductIdentifier
	 * LineItemDetails5.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductIdentifier
	 * LineItemDetails8.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#ProductIdentifier
	 * LineItemDetails6.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#ProductIdentifier
	 * LineItemDetails9.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ProductIdentifier
	 * LineItemDetails10.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#ProductIdentifier
	 * LineItemDetails11.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ProductIdentifier
	 * LineItemDetails13.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductIdentifier
	 * LineItemDetails12.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#ProductIdentifier
	 * LineItemDetails14.ProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#Identification
	 * TradeProduct2.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd ProductIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.Identification, com.tools20022.repository.msg.LineItemDetails4.ProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails7.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails5.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails8.ProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails6.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails9.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails10.ProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails11.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails13.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails12.ProductIdentifier,
					com.tools20022.repository.msg.LineItemDetails14.ProductIdentifier, com.tools20022.repository.msg.TradeProduct2.Identification);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductIdentification.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#Name
	 * TradeProduct1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#ProductName
	 * LineItemDetails4.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ProductName
	 * LineItemDetails7.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#ProductName
	 * LineItemDetails5.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductName
	 * LineItemDetails8.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#ProductName
	 * LineItemDetails6.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#ProductName
	 * LineItemDetails9.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification1#Identification
	 * BillingServiceIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ProductName
	 * LineItemDetails10.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#ProductName
	 * LineItemDetails11.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ProductName
	 * LineItemDetails13.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductName
	 * LineItemDetails12.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#ProductName
	 * LineItemDetails14.ProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#Identification
	 * BillingServiceIdentification3.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#Name
	 * TradeProduct2.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.Name, com.tools20022.repository.msg.LineItemDetails4.ProductName, com.tools20022.repository.msg.LineItemDetails7.ProductName,
					com.tools20022.repository.msg.LineItemDetails5.ProductName, com.tools20022.repository.msg.LineItemDetails8.ProductName, com.tools20022.repository.msg.LineItemDetails6.ProductName,
					com.tools20022.repository.msg.LineItemDetails9.ProductName, com.tools20022.repository.msg.BillingServiceIdentification1.Identification, com.tools20022.repository.msg.LineItemDetails10.ProductName,
					com.tools20022.repository.msg.LineItemDetails11.ProductName, com.tools20022.repository.msg.LineItemDetails13.ProductName, com.tools20022.repository.msg.LineItemDetails12.ProductName,
					com.tools20022.repository.msg.LineItemDetails14.ProductName, com.tools20022.repository.msg.BillingServiceIdentification3.Identification, com.tools20022.repository.msg.TradeProduct2.Name);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information about the goods and/or services of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#Description
	 * TradeProduct1.Description}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#GoodsDescription
	 * LineItem5.GoodsDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#GoodsDescription
	 * LineItem7.GoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportedGoods1#GoodsDescription
	 * TransportedGoods1.GoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#InsuredGoodsDescription
	 * InsuranceDataSet1.InsuredGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#GoodsDescription
	 * CertificateDataSet1.GoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#GoodsDescription
	 * LineItem11.GoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#GoodsDescription
	 * CertificateDataSet2.GoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#GoodsAndOrServicesDescription
	 * LineItem13.GoodsAndOrServicesDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#Description
	 * TradeProduct2.Description}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.Description, com.tools20022.repository.msg.LineItem5.GoodsDescription, com.tools20022.repository.msg.LineItem7.GoodsDescription,
					com.tools20022.repository.msg.TransportedGoods1.GoodsDescription, com.tools20022.repository.msg.InsuranceDataSet1.InsuredGoodsDescription, com.tools20022.repository.msg.CertificateDataSet1.GoodsDescription,
					com.tools20022.repository.msg.LineItem11.GoodsDescription, com.tools20022.repository.msg.CertificateDataSet2.GoodsDescription, com.tools20022.repository.msg.LineItem13.GoodsAndOrServicesDescription,
					com.tools20022.repository.msg.TradeProduct2.Description);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Country from which the product originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#ProducedProducts
	 * Country.ProducedProducts}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#CountryOfOrigin
	 * TradeProduct1.CountryOfOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#Origin
	 * CertifiedCharacteristics1Choice.Origin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#Origin
	 * CertifiedCharacteristics2Choice.Origin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#CountryOfOrigin
	 * TradeProduct2.CountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd Origin = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.CountryOfOrigin, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.Origin,
					com.tools20022.repository.choice.CertifiedCharacteristics2Choice.Origin, com.tools20022.repository.msg.TradeProduct2.CountryOfOrigin);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.ProducedProducts;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Characteristics of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#Product
	 * ProductCharacteristics.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#ProductCharacteristics
	 * TradeProduct1.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#ProductCharacteristics
	 * LineItemDetails4.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ProductCharacteristics
	 * LineItemDetails7.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#ProductCharacteristics
	 * LineItemDetails5.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductCharacteristics
	 * LineItemDetails8.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#ProductCharacteristics
	 * LineItemDetails6.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#ProductCharacteristics
	 * LineItemDetails9.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ProductCharacteristics
	 * LineItemDetails10.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#ProductCharacteristics
	 * LineItemDetails11.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ProductCharacteristics
	 * LineItemDetails13.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductCharacteristics
	 * LineItemDetails12.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#ProductCharacteristics
	 * LineItemDetails14.ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#ProductCharacteristics
	 * TradeProduct2.ProductCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd Characteristics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails4.ProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails7.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails5.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails8.ProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails6.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails9.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails10.ProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails11.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails13.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails12.ProductCharacteristics,
					com.tools20022.repository.msg.LineItemDetails14.ProductCharacteristics, com.tools20022.repository.msg.TradeProduct2.ProductCharacteristics);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			type_lazy = () -> ProductCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#NetPriceProduct
	 * Price.NetPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#NetPrice
	 * LineItem10.NetPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#NetPrice
	 * LineItem16.NetPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd NetPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.NetPrice, com.tools20022.repository.msg.LineItem16.NetPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.NetPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the quantity of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#Product
	 * ProductQuantity.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#NetPriceQuantity
	 * LineItem10.NetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#GrossPriceQuantity
	 * LineItem10.GrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#GrossWeight
	 * LineItem10.GrossWeight}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#Quantity
	 * LineItemDetails7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#OrderedQuantity
	 * LineItemDetails5.OrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OrderedQuantity
	 * LineItemDetails8.OrderedQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6#Quantity
	 * LineItemDetails6.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9#Quantity
	 * LineItemDetails9.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#Weight
	 * CertifiedCharacteristics1Choice.Weight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#Quantity
	 * CertifiedCharacteristics1Choice.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails10#Quantity
	 * LineItemDetails10.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails11#Quantity
	 * LineItemDetails11.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#Weight
	 * CertifiedCharacteristics2Choice.Weight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#Quantity
	 * CertifiedCharacteristics2Choice.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#Quantity
	 * LineItemDetails13.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OrderedQuantity
	 * LineItemDetails12.OrderedQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails14#Quantity
	 * LineItemDetails14.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#NetPriceQuantity
	 * LineItem16.NetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#GrossPriceQuantity
	 * LineItem16.GrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#GrossWeight
	 * LineItem16.GrossWeight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.NetPriceQuantity, com.tools20022.repository.msg.LineItem10.GrossPriceQuantity, com.tools20022.repository.msg.LineItem10.GrossWeight,
					com.tools20022.repository.msg.LineItemDetails7.Quantity, com.tools20022.repository.msg.LineItemDetails5.OrderedQuantity, com.tools20022.repository.msg.LineItemDetails8.OrderedQuantity,
					com.tools20022.repository.msg.LineItemDetails6.Quantity, com.tools20022.repository.msg.LineItemDetails9.Quantity, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.Weight,
					com.tools20022.repository.choice.CertifiedCharacteristics1Choice.Quantity, com.tools20022.repository.msg.LineItemDetails10.Quantity, com.tools20022.repository.msg.LineItemDetails11.Quantity,
					com.tools20022.repository.choice.CertifiedCharacteristics2Choice.Weight, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.Quantity, com.tools20022.repository.msg.LineItemDetails13.Quantity,
					com.tools20022.repository.msg.LineItemDetails12.OrderedQuantity, com.tools20022.repository.msg.LineItemDetails14.Quantity, com.tools20022.repository.msg.LineItem16.NetPriceQuantity,
					com.tools20022.repository.msg.LineItem16.GrossPriceQuantity, com.tools20022.repository.msg.LineItem16.GrossWeight);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Gross price of the goods and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#GrossPriceProduct
	 * Price.GrossPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#GrossPrice
	 * LineItem10.GrossPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#GrossPrice
	 * LineItem16.GrossPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd GrossPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.GrossPrice, com.tools20022.repository.msg.LineItem16.GrossPrice);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.GrossPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quality of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#Quality
	 * CertifiedCharacteristics1Choice.Quality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#Quality
	 * CertifiedCharacteristics2Choice.Quality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAttribute Quality = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CertifiedCharacteristics1Choice.Quality, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.Quality);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Delivery process of a product
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#Product
	 * ProductDelivery.Product}</li>
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
	public static final MMBusinessAssociationEnd Delivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the purchase order in which a specific product is ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Product
	 * PurchaseOrder.Product}</li>
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
	public static final MMBusinessAssociationEnd PurchaseOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods and
	 * services in a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Product
	 * Tax.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#Tax
	 * TradeSettlement1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#SubTotalCalculatedTax
	 * TradeSettlement1.SubTotalCalculatedTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#Tax
	 * LineItem10.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#Tax
	 * LineItemDetails4.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#Tax
	 * LineItem5.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#Tax
	 * LineItemDetails7.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#Tax
	 * LineItem7.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6#Tax
	 * LineItemDetails6.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#Tax
	 * LineItem4.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9#Tax
	 * LineItemDetails9.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#Tax
	 * LineItem9.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#TaxCalculation
	 * BillingService1.TaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#Tax
	 * LineItem11.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails10#Tax
	 * LineItemDetails10.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#Tax
	 * LineItem12.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails11#Tax
	 * LineItemDetails11.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#Tax
	 * LineItemDetails13.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#Tax
	 * LineItem13.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#Tax
	 * LineItem15.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails14#Tax
	 * LineItemDetails14.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#TaxCalculation
	 * BillingService2.TaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#Tax
	 * LineItem16.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
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
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.Tax, com.tools20022.repository.msg.TradeSettlement1.SubTotalCalculatedTax, com.tools20022.repository.msg.LineItem10.Tax,
					com.tools20022.repository.msg.LineItemDetails4.Tax, com.tools20022.repository.msg.LineItem5.Tax, com.tools20022.repository.msg.LineItemDetails7.Tax, com.tools20022.repository.msg.LineItem7.Tax,
					com.tools20022.repository.msg.LineItemDetails6.Tax, com.tools20022.repository.msg.LineItem4.Tax, com.tools20022.repository.msg.LineItemDetails9.Tax, com.tools20022.repository.msg.LineItem9.Tax,
					com.tools20022.repository.msg.BillingService1.TaxCalculation, com.tools20022.repository.msg.LineItem11.Tax, com.tools20022.repository.msg.LineItemDetails10.Tax, com.tools20022.repository.msg.LineItem12.Tax,
					com.tools20022.repository.msg.LineItemDetails11.Tax, com.tools20022.repository.msg.LineItemDetails13.Tax, com.tools20022.repository.msg.LineItem13.Tax, com.tools20022.repository.msg.LineItem15.Tax,
					com.tools20022.repository.msg.LineItemDetails14.Tax, com.tools20022.repository.msg.BillingService2.TaxCalculation, com.tools20022.repository.msg.LineItem16.Tax);
			elementContext_lazy = () -> Product.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.CardPayment.Product,
						com.tools20022.repository.entity.Price.UnitPriceProduct, com.tools20022.repository.entity.Price.NetPriceProduct, com.tools20022.repository.entity.Price.GrossPriceProduct,
						com.tools20022.repository.entity.ProductIdentification.Product, com.tools20022.repository.entity.ProductQuantity.Product, com.tools20022.repository.entity.ProductCategory.Product,
						com.tools20022.repository.entity.LineItem.InvoicedProduct, com.tools20022.repository.entity.ProductDelivery.Product, com.tools20022.repository.entity.ProductCharacteristics.Product,
						com.tools20022.repository.entity.PurchaseOrder.Product);
				subType_lazy = () -> Arrays.asList(Service.mmObject(), Goods.mmObject(), FinancialProduct.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.Product.UnitPrice, com.tools20022.repository.entity.Product.ProductCategory,
						com.tools20022.repository.entity.Product.LineItem, com.tools20022.repository.entity.Product.ProductIdentification, com.tools20022.repository.entity.Product.Name, com.tools20022.repository.entity.Product.Description,
						com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Product.Characteristics, com.tools20022.repository.entity.Product.NetPrice, com.tools20022.repository.entity.Product.Quantity,
						com.tools20022.repository.entity.Product.GrossPrice, com.tools20022.repository.entity.Product.Quality, com.tools20022.repository.entity.Product.Delivery, com.tools20022.repository.entity.Product.PurchaseOrder,
						com.tools20022.repository.entity.Product.Tax);
				derivationComponent_lazy = () -> Arrays.asList(Product2.mmObject(), Product1.mmObject(), TradeProduct1.mmObject(), CertifiedCharacteristics1Choice.mmObject(), ServiceItemTotals1.mmObject(),
						CertifiedCharacteristics2Choice.mmObject(), Product3.mmObject(), Product4.mmObject(), Product5.mmObject(), TradeProduct2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}