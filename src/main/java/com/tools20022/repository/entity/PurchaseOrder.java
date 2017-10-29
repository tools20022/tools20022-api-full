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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document issued by a buyer and containing the details of a purchase,
 * including description of goods, transport information, payment terms, etc.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PurchaseOrder" src="doc-files/PurchaseOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#TotalAmount
 * PurchaseOrder.TotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#ResultingCommercialTrade
 * PurchaseOrder.ResultingCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#Product
 * PurchaseOrder.Product}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#Identification
 * PurchaseOrder.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPurchaseOrder
 * GenericIdentification.RelatedPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#PurchaseOrder
 * Product.PurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseOrder
 * CommercialTrade.PurchaseOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3 ReportLine3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2 ReportLine2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4 ReportLine4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine1 ReportLine1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7 ReportLine7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5 ReportLine5}</li>
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
 * "PurchaseOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document issued by a buyer and containing the details of a purchase, including description of goods, transport information, payment terms, etc."
 * </li>
 * </ul>
 */
public class PurchaseOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Line items total amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#OrderedAmount
	 * LineItemDetails5.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#OrderedLineItemsTotalAmount
	 * LineItem6.OrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OrderedAmount
	 * LineItemDetails8.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#OrderedLineItemsTotalAmount
	 * LineItem8.OrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine1#PurchaseOrderTotalNetAmount
	 * ReportLine1.PurchaseOrderTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#OrderedLineItemsTotalAmount
	 * LineItem14.OrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OrderedAmount
	 * LineItemDetails12.OrderedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line items total amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails5.OrderedAmount, com.tools20022.repository.msg.LineItem6.OrderedLineItemsTotalAmount,
					com.tools20022.repository.msg.LineItemDetails8.OrderedAmount, com.tools20022.repository.msg.LineItem8.OrderedLineItemsTotalAmount, com.tools20022.repository.msg.ReportLine1.PurchaseOrderTotalNetAmount,
					com.tools20022.repository.msg.LineItem14.OrderedLineItemsTotalAmount, com.tools20022.repository.msg.LineItemDetails12.OrderedAmount);
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Line items total amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Execution of the purchase order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseOrder
	 * CommercialTrade.PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of the purchase order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ResultingCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingCommercialTrade";
			definition = "Execution of the purchase order.";
			minOccurs = 0;
			type_lazy = () -> CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the items which are sold by the seller to the buyer in a
	 * commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#PurchaseOrder
	 * Product.PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the items which are sold by the seller to the buyer in a commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the items which are sold by the seller to the buyer in a commercial trade.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.PurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the purchase order that can be used for reconciliation
	 * or to link tasks relating to the commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedPurchaseOrder
	 * GenericIdentification.RelatedPurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline2#PurchaseOrderReference
	 * Baseline2.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#PurchaseOrderReference
	 * Baseline3.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#PurchaseOrderReference
	 * LineItem4.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportedGoods1#PurchaseOrderReference
	 * TransportedGoods1.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#PurchaseOrderReference
	 * LineItem9.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine3#PurchaseOrderReference
	 * ReportLine3.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine2#PurchaseOrderReference
	 * ReportLine2.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine1#PurchaseOrderReference
	 * ReportLine1.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#PurchaseOrderReference
	 * Baseline4.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine7#PurchaseOrderReference
	 * ReportLine7.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#PurchaseOrderReference
	 * LineItem12.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine5#PurchaseOrderReference
	 * ReportLine5.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#PurchaseOrderReference
	 * Baseline5.PurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#PurchaseOrderReference
	 * LineItem15.PurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the purchase order that can be used for reconciliation or to link tasks relating to the commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline2.PurchaseOrderReference, com.tools20022.repository.msg.Baseline3.PurchaseOrderReference,
					com.tools20022.repository.msg.LineItem4.PurchaseOrderReference, com.tools20022.repository.msg.TransportedGoods1.PurchaseOrderReference, com.tools20022.repository.msg.LineItem9.PurchaseOrderReference,
					com.tools20022.repository.msg.ReportLine3.PurchaseOrderReference, com.tools20022.repository.msg.ReportLine2.PurchaseOrderReference, com.tools20022.repository.msg.ReportLine1.PurchaseOrderReference,
					com.tools20022.repository.msg.Baseline4.PurchaseOrderReference, com.tools20022.repository.msg.ReportLine7.PurchaseOrderReference, com.tools20022.repository.msg.LineItem12.PurchaseOrderReference,
					com.tools20022.repository.msg.ReportLine5.PurchaseOrderReference, com.tools20022.repository.msg.Baseline5.PurchaseOrderReference, com.tools20022.repository.msg.LineItem15.PurchaseOrderReference);
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the purchase order that can be used for reconciliation or to link tasks relating to the commercial trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PurchaseOrder";
				definition = "Document issued by a buyer and containing the details of a purchase, including description of goods, transport information, payment terms, etc.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder, com.tools20022.repository.entity.Product.PurchaseOrder,
						com.tools20022.repository.entity.CommercialTrade.PurchaseOrder);
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PurchaseOrder.TotalAmount, com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade, com.tools20022.repository.entity.PurchaseOrder.Product,
						com.tools20022.repository.entity.PurchaseOrder.Identification);
				derivationComponent_lazy = () -> Arrays.asList(ReportLine3.mmObject(), ReportLine2.mmObject(), ReportLine4.mmObject(), ReportLine1.mmObject(), ReportLine7.mmObject(), ReportLine6.mmObject(), ReportLine5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}