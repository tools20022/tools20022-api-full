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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unit of information showing the related provision of products and/or services
 * and monetary summations reported as a discrete line item.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LineItem" src="doc-files/LineItem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#FinancialAdjustment
 * LineItem.FinancialAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#LogisticsCharge
 * LineItem.LogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#GrossAmount
 * LineItem.GrossAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Identification
 * LineItem.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#InvoicedProduct
 * LineItem.InvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetWeight
 * LineItem.NetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#BilledQuantity
 * LineItem.BilledQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#ChargeFreeQuantity
 * LineItem.ChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityStartRelatedLineItem
 * LineItem.MeasureQuantityStartRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureQuantityEndRelatedLineItem
 * LineItem.MeasureQuantityEndRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#MeasureDateTimeStart
 * LineItem.MeasureDateTimeStart}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#MeasureDateTimeEnd
 * LineItem.MeasureDateTimeEnd}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Invoice
 * LineItem.Invoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetAmount
 * LineItem.NetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Packaging
 * LineItem.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#DeliveryDateTime
 * LineItem.DeliveryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Charges
 * LineItem.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetPriceCharge
 * LineItem.NetPriceCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#GrossPriceQuantity
 * LineItem.GrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetPriceQuantity
 * LineItem.NetPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#GrossWeight
 * LineItem.GrossWeight}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#LineItem
 * Product.LineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#RelatedLineItem
 * Adjustment.RelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#LogisticsChargeLineItem
 * Charges.LogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#LineItem
 * Charges.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#NetPriceChargeLineItem
 * Charges.NetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#LineItem
 * Invoice.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetWeightRelatedLineItem
 * ProductQuantity.NetWeightRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#BilledQuantityRelatedLineItem
 * ProductQuantity.BilledQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#ChargeFreeQuantityRelatedLineItem
 * ProductQuantity.ChargeFreeQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityStart
 * ProductQuantity.MeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityEnd
 * ProductQuantity.MeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossPriceQuantityRelatedLineItem
 * ProductQuantity.GrossPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetPriceQuantityRelatedLineItem
 * ProductQuantity.NetPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossWeightRelatedLineItem
 * ProductQuantity.GrossWeightRelatedLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#RelatedLineItem
 * Packaging.RelatedLineItem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
 * LineItemMonetarySummation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4
 * LineItemDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7
 * LineItemDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails5
 * LineItemDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails8
 * LineItemDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6
 * LineItemDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9
 * LineItemDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1
 * LineItemAndPOIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails10
 * LineItemDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails11
 * LineItemDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13
 * LineItemDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails12
 * LineItemDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails14
 * LineItemDetails14}</li>
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
 * "LineItem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item."
 * </li>
 * </ul>
 */
public class LineItem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Modification on the value of goods and / or services taking into account
	 * discounts, allowances and charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#RelatedLineItem
	 * Adjustment.RelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceTotals1#Adjustment
	 * InvoiceTotals1.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#AdjustmentAmountAndReason
	 * TradeSettlement1.AdjustmentAmountAndReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#AllowanceCharge
	 * LineItem10.AllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#FinancialAdjustment
	 * LineItem10.FinancialAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceTotals2#Adjustment
	 * InvoiceTotals2.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#AllowanceCharge
	 * LineItem16.AllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#FinancialAdjustment
	 * LineItem16.FinancialAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification on the value of goods and / or services taking into account discounts, allowances and charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialAdjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceTotals1.Adjustment, com.tools20022.repository.msg.TradeSettlement1.AdjustmentAmountAndReason, com.tools20022.repository.msg.LineItem10.AllowanceCharge,
					com.tools20022.repository.msg.LineItem10.FinancialAdjustment, com.tools20022.repository.msg.InvoiceTotals2.Adjustment, com.tools20022.repository.msg.LineItem16.AllowanceCharge,
					com.tools20022.repository.msg.LineItem16.FinancialAdjustment);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services taking into account discounts, allowances and charges.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.RelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Logistics service charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#LogisticsChargeLineItem
	 * Charges.LogisticsChargeLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#LogisticsCharge
	 * TradeSettlement1.LogisticsCharge}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#LogisticsCharge
	 * LineItem10.LogisticsCharge}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#LogisticsCharge
	 * LineItem16.LogisticsCharge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge for this line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LogisticsCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.LogisticsCharge, com.tools20022.repository.msg.LineItem10.LogisticsCharge, com.tools20022.repository.msg.LineItem16.LogisticsCharge);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.LogisticsChargeLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Monetary value of the line amount total being reported for this
	 * settlement.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#LineTotalAmount
	 * SettlementMonetarySummation1.LineTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the line amount total being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementMonetarySummation1.LineTotalAmount);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Uniquely identifies a line item.
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
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#Identification
	 * LineItem10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#LineItemIdentification
	 * LineItemDetails4.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#LineItemIdentification
	 * LineItemDetails7.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#LineItemIdentification
	 * RequiredSubmission4.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#LineItemIdentification
	 * LineItemDetails5.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#LineItemIdentification
	 * LineItemDetails8.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#LineItemIdentification
	 * LineItemDetails6.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#LineItemIdentification
	 * LineItemDetails9.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1#LineItemIdentification
	 * LineItemAndPOIdentification1.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#LineItemIdentification
	 * LineItemDetails10.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#LineItemIdentification
	 * LineItemDetails11.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#LineItemIdentification
	 * LineItemDetails13.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#LineItemIdentification
	 * LineItemDetails12.LineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#LineItemIdentification
	 * LineItemDetails14.LineItemIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#Identification
	 * LineItem16.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies a line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.Identification, com.tools20022.repository.msg.LineItemDetails4.LineItemIdentification,
					com.tools20022.repository.msg.LineItemDetails7.LineItemIdentification, com.tools20022.repository.msg.RequiredSubmission4.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails5.LineItemIdentification,
					com.tools20022.repository.msg.LineItemDetails8.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails6.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails9.LineItemIdentification,
					com.tools20022.repository.msg.LineItemAndPOIdentification1.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails10.LineItemIdentification,
					com.tools20022.repository.msg.LineItemDetails11.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails13.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails12.LineItemIdentification,
					com.tools20022.repository.msg.LineItemDetails14.LineItemIdentification, com.tools20022.repository.msg.LineItem16.Identification);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a line item.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the product and the quantity for which an invoice is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#LineItem
	 * Product.LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#TradeProduct
	 * LineItem10.TradeProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#ServiceItemTotals
	 * ServiceCategoryTotals1.ServiceItemTotals}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#TradeProduct
	 * LineItem16.TradeProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicedProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product and the quantity for which an invoice is generated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvoicedProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.TradeProduct, com.tools20022.repository.msg.ServiceCategoryTotals1.ServiceItemTotals, com.tools20022.repository.msg.LineItem16.TradeProduct);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoicedProduct";
			definition = "Specifies the product and the quantity for which an invoice is generated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net weight of the physical item which is invoiced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetWeightRelatedLineItem
	 * ProductQuantity.NetWeightRelatedLineItem}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#NetWeight
	 * LineItem10.NetWeight}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#NetWeight
	 * LineItem16.NetWeight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net weight of the physical item which is invoiced."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetWeight = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.NetWeight, com.tools20022.repository.msg.LineItem16.NetWeight);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the physical item which is invoiced.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity billed for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#BilledQuantityRelatedLineItem
	 * ProductQuantity.BilledQuantityRelatedLineItem}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#BasisQuantity
	 * LineItemAllowanceCharge1.BasisQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#BilledQuantity
	 * LineItem10.BilledQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#Quantity
	 * LineItemDetails4.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#BilledQuantity
	 * LineItem16.BilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#BasisQuantity
	 * LineItemAllowanceCharge2.BasisQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity billed for this line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BilledQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemAllowanceCharge1.BasisQuantity, com.tools20022.repository.msg.LineItem10.BilledQuantity, com.tools20022.repository.msg.LineItemDetails4.Quantity,
					com.tools20022.repository.msg.LineItem16.BilledQuantity, com.tools20022.repository.msg.LineItemAllowanceCharge2.BasisQuantity);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity that is free of charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#ChargeFreeQuantityRelatedLineItem
	 * ProductQuantity.ChargeFreeQuantityRelatedLineItem}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LineItem10#ChargeFreeQuantity
	 * LineItem10.ChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#ChargeFreeQuantity
	 * LineItem16.ChargeFreeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity that is free of charge for this line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChargeFreeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.ChargeFreeQuantity, com.tools20022.repository.msg.LineItem16.ChargeFreeQuantity);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which a measure quantity end is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityStart
	 * ProductQuantity.MeasureQuantityStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStartRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a measure quantity end is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityStartRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStartRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which a measure quantity end is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#MeasureQuantityEnd
	 * ProductQuantity.MeasureQuantityEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEndRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a measure quantity end is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityEndRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEndRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time on which the clock time measure started for a line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#MeasureDateTimeStart
	 * LineItem10.MeasureDateTimeStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#MeasureDateTimeStart
	 * LineItem16.MeasureDateTimeStart}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure started for a line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeasureDateTimeStart = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.MeasureDateTimeStart, com.tools20022.repository.msg.LineItem16.MeasureDateTimeStart);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeStart";
			definition = "Date/time on which the clock time measure started for a line item.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time on which the clock time measure ended for a line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#MeasureDateTimeEnd
	 * LineItem10.MeasureDateTimeEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#MeasureDateTimeEnd
	 * LineItem16.MeasureDateTimeEnd}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure ended for a line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeasureDateTimeEnd = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.MeasureDateTimeEnd, com.tools20022.repository.msg.LineItem16.MeasureDateTimeEnd);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeEnd";
			definition = "Date/time on which the clock time measure ended for a line item.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the invoice in which the line item is included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#LineItem
	 * Invoice.LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the invoice in which the line item is included."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies the invoice in which the line item is included.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount resulting from the gross amount plus freight charges, tax
	 * and plus/minus Adjustments.
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#TotalAmount
	 * LineItemDetails4.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#TotalAmount
	 * LineItemDetails7.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#TotalAmount
	 * LineItemDetails6.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#TotalAmount
	 * LineItemDetails9.TotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3#NetAmount
	 * ReportLine3.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2#NetAmount
	 * ReportLine2.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4#NetAmount
	 * ReportLine4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#TotalAmount
	 * LineItemDetails10.TotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7#NetAmount
	 * ReportLine7.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#TotalAmount
	 * LineItemDetails11.TotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#NetAmount
	 * ReportLine6.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5#NetAmount
	 * ReportLine5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#TotalAmount
	 * LineItemDetails13.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#TotalAmount
	 * LineItemDetails14.TotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails4.TotalAmount, com.tools20022.repository.msg.LineItemDetails7.TotalAmount, com.tools20022.repository.msg.LineItemDetails6.TotalAmount,
					com.tools20022.repository.msg.LineItemDetails9.TotalAmount, com.tools20022.repository.msg.ReportLine3.NetAmount, com.tools20022.repository.msg.ReportLine2.NetAmount, com.tools20022.repository.msg.ReportLine4.NetAmount,
					com.tools20022.repository.msg.LineItemDetails10.TotalAmount, com.tools20022.repository.msg.ReportLine7.NetAmount, com.tools20022.repository.msg.LineItemDetails11.TotalAmount,
					com.tools20022.repository.msg.ReportLine6.NetAmount, com.tools20022.repository.msg.ReportLine5.NetAmount, com.tools20022.repository.msg.LineItemDetails13.TotalAmount,
					com.tools20022.repository.msg.LineItemDetails14.TotalAmount);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Physical packaging of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#RelatedLineItem
	 * Packaging.RelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of the product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Packaging = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.RelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Actual delivery date/time of the products and/or services for this line
	 * item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual delivery date/time of the products and/or services for this line item."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services for this line item.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Charges specified for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#LineItem
	 * Charges.LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges specified for this line item."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Charges specified for this line item.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allowance or charge applied to the net price. When the charge amount is
	 * added (credit)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#NetPriceChargeLineItem
	 * Charges.NetPriceChargeLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allowance or charge applied to the net price. When the charge amount is added (credit)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetPriceCharge = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceCharge";
			definition = "Allowance or charge applied to the net price. When the charge amount is added (credit)";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.NetPriceChargeLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity and conversion factor on which the gross price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossPriceQuantityRelatedLineItem
	 * ProductQuantity.GrossPriceQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the gross price is based for this line item product and/or service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GrossPriceQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity and conversion factor on which the net price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#NetPriceQuantityRelatedLineItem
	 * ProductQuantity.NetPriceQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the net price is based for this line item product and/or service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetPriceQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Gross weight of the physical item which is invoiced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#GrossWeightRelatedLineItem
	 * ProductQuantity.GrossWeightRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross weight of the physical item which is invoiced."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GrossWeight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the physical item which is invoiced.";
			minOccurs = 0;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LineItem";
				definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.LineItem, com.tools20022.repository.entity.Adjustment.RelatedLineItem, com.tools20022.repository.entity.Charges.LogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.LineItem, com.tools20022.repository.entity.Charges.NetPriceChargeLineItem, com.tools20022.repository.entity.Invoice.LineItem,
						com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart,
						com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem,
						com.tools20022.repository.entity.Packaging.RelatedLineItem);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LineItem.FinancialAdjustment, com.tools20022.repository.entity.LineItem.LogisticsCharge, com.tools20022.repository.entity.LineItem.GrossAmount,
						com.tools20022.repository.entity.LineItem.Identification, com.tools20022.repository.entity.LineItem.InvoicedProduct, com.tools20022.repository.entity.LineItem.NetWeight,
						com.tools20022.repository.entity.LineItem.BilledQuantity, com.tools20022.repository.entity.LineItem.ChargeFreeQuantity, com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.MeasureDateTimeStart, com.tools20022.repository.entity.LineItem.MeasureDateTimeEnd,
						com.tools20022.repository.entity.LineItem.Invoice, com.tools20022.repository.entity.LineItem.NetAmount, com.tools20022.repository.entity.LineItem.Packaging,
						com.tools20022.repository.entity.LineItem.DeliveryDateTime, com.tools20022.repository.entity.LineItem.Charges, com.tools20022.repository.entity.LineItem.NetPriceCharge,
						com.tools20022.repository.entity.LineItem.GrossPriceQuantity, com.tools20022.repository.entity.LineItem.NetPriceQuantity, com.tools20022.repository.entity.LineItem.GrossWeight);
				derivationComponent_lazy = () -> Arrays.asList(LineItemMonetarySummation1.mmObject(), LineItemDetails4.mmObject(), LineItemDetails7.mmObject(), LineItemDetails5.mmObject(), LineItemDetails8.mmObject(),
						LineItemDetails6.mmObject(), LineItemDetails9.mmObject(), LineItemAndPOIdentification1.mmObject(), LineItemDetails10.mmObject(), LineItemDetails11.mmObject(), LineItemDetails13.mmObject(),
						LineItemDetails12.mmObject(), LineItemDetails14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}