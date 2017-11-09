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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmLineItem
 * Product.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
 * Adjustment.mmRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmLogisticsChargeLineItem
 * Charges.mmLogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmLineItem
 * Charges.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmNetPriceChargeLineItem
 * Charges.mmNetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
 * Invoice.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetWeightRelatedLineItem
 * ProductQuantity.mmNetWeightRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmBilledQuantityRelatedLineItem
 * ProductQuantity.mmBilledQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmChargeFreeQuantityRelatedLineItem
 * ProductQuantity.mmChargeFreeQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
 * ProductQuantity.mmMeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
 * ProductQuantity.mmMeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossPriceQuantityRelatedLineItem
 * ProductQuantity.mmGrossPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetPriceQuantityRelatedLineItem
 * ProductQuantity.mmNetPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossWeightRelatedLineItem
 * ProductQuantity.mmGrossWeightRelatedLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmRelatedLineItem
 * Packaging.mmRelatedLineItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
 * LineItem.mmFinancialAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
 * LineItem.mmLogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmGrossAmount
 * LineItem.mmGrossAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
 * LineItem.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
 * LineItem.mmInvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
 * LineItem.mmNetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
 * LineItem.mmBilledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
 * LineItem.mmChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityStartRelatedLineItem
 * LineItem.mmMeasureQuantityStartRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityEndRelatedLineItem
 * LineItem.mmMeasureQuantityEndRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureDateTimeStart
 * LineItem.mmMeasureDateTimeStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureDateTimeEnd
 * LineItem.mmMeasureDateTimeEnd}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoice
 * LineItem.mmInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetAmount
 * LineItem.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmPackaging
 * LineItem.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmDeliveryDateTime
 * LineItem.mmDeliveryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmCharges
 * LineItem.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceCharge
 * LineItem.mmNetPriceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossPriceQuantity
 * LineItem.mmGrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceQuantity
 * LineItem.mmNetPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmGrossWeight
 * LineItem.mmGrossWeight}</li>
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
 * "LineItem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item."
 * </li>
 * </ul>
 */
public class LineItem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Adjustment financialAdjustment;
	/**
	 * Modification on the value of goods and / or services taking into account
	 * discounts, allowances and charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
	 * Adjustment.mmRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmAdjustment
	 * InvoiceTotals1.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAdjustmentAmountAndReason
	 * TradeSettlement1.mmAdjustmentAmountAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmAllowanceCharge
	 * LineItem10.mmAllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmFinancialAdjustment
	 * LineItem10.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmAdjustment
	 * InvoiceTotals2.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmAllowanceCharge
	 * LineItem16.mmAllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmFinancialAdjustment
	 * LineItem16.mmFinancialAdjustment}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmFinancialAdjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceTotals1.mmAdjustment, TradeSettlement1.mmAdjustmentAmountAndReason, LineItem10.mmAllowanceCharge, LineItem10.mmFinancialAdjustment, InvoiceTotals2.mmAdjustment,
					LineItem16.mmAllowanceCharge, LineItem16.mmFinancialAdjustment);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services taking into account discounts, allowances and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> logisticsCharge;
	/**
	 * Logistics service charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmLogisticsChargeLineItem
	 * Charges.mmLogisticsChargeLineItem}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLogisticsCharge
	 * TradeSettlement1.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmLogisticsCharge
	 * LineItem10.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmLogisticsCharge
	 * LineItem16.mmLogisticsCharge}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmLogisticsCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmLogisticsCharge, LineItem10.mmLogisticsCharge, LineItem16.mmLogisticsCharge);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmLogisticsChargeLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected CurrencyAndAmount grossAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmLineTotalAmount
	 * SettlementMonetarySummation1.mmLineTotalAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmGrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmLineTotalAmount);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Uniquely identifies a line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmIdentification
	 * LineItem10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmLineItemIdentification
	 * LineItemDetails4.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmLineItemIdentification
	 * LineItemDetails7.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmLineItemIdentification
	 * RequiredSubmission4.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmLineItemIdentification
	 * LineItemDetails5.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmLineItemIdentification
	 * LineItemDetails8.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmLineItemIdentification
	 * LineItemDetails6.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmLineItemIdentification
	 * LineItemDetails9.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1#mmLineItemIdentification
	 * LineItemAndPOIdentification1.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmLineItemIdentification
	 * LineItemDetails10.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmLineItemIdentification
	 * LineItemDetails11.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmLineItemIdentification
	 * LineItemDetails13.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmLineItemIdentification
	 * LineItemDetails12.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmLineItemIdentification
	 * LineItemDetails14.mmLineItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmIdentification
	 * LineItem16.mmIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmIdentification, LineItemDetails4.mmLineItemIdentification, LineItemDetails7.mmLineItemIdentification, RequiredSubmission4.mmLineItemIdentification,
					LineItemDetails5.mmLineItemIdentification, LineItemDetails8.mmLineItemIdentification, LineItemDetails6.mmLineItemIdentification, LineItemDetails9.mmLineItemIdentification,
					LineItemAndPOIdentification1.mmLineItemIdentification, LineItemDetails10.mmLineItemIdentification, LineItemDetails11.mmLineItemIdentification, LineItemDetails13.mmLineItemIdentification,
					LineItemDetails12.mmLineItemIdentification, LineItemDetails14.mmLineItemIdentification, LineItem16.mmIdentification);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Product invoicedProduct;
	/**
	 * Specifies the product and the quantity for which an invoice is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmLineItem
	 * Product.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmTradeProduct
	 * LineItem10.mmTradeProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmServiceItemTotals
	 * ServiceCategoryTotals1.mmServiceItemTotals}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTradeProduct
	 * LineItem16.mmTradeProduct}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvoicedProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmTradeProduct, ServiceCategoryTotals1.mmServiceItemTotals, LineItem16.mmTradeProduct);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoicedProduct";
			definition = "Specifies the product and the quantity for which an invoice is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected ProductQuantity netWeight;
	/**
	 * Net weight of the physical item which is invoiced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetWeightRelatedLineItem
	 * ProductQuantity.mmNetWeightRelatedLineItem}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetWeight
	 * LineItem10.mmNetWeight}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetWeight
	 * LineItem16.mmNetWeight}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmNetWeight = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmNetWeight, LineItem16.mmNetWeight);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the physical item which is invoiced.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmNetWeightRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> billedQuantity;
	/**
	 * Quantity billed for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmBilledQuantityRelatedLineItem
	 * ProductQuantity.mmBilledQuantityRelatedLineItem}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#mmBasisQuantity
	 * LineItemAllowanceCharge1.mmBasisQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmBilledQuantity
	 * LineItem10.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmQuantity
	 * LineItemDetails4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmBilledQuantity
	 * LineItem16.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmBasisQuantity
	 * LineItemAllowanceCharge2.mmBasisQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmBilledQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemAllowanceCharge1.mmBasisQuantity, LineItem10.mmBilledQuantity, LineItemDetails4.mmQuantity, LineItem16.mmBilledQuantity, LineItemAllowanceCharge2.mmBasisQuantity);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmBilledQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> chargeFreeQuantity;
	/**
	 * Quantity that is free of charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmChargeFreeQuantityRelatedLineItem
	 * ProductQuantity.mmChargeFreeQuantityRelatedLineItem}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmChargeFreeQuantity
	 * LineItem10.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmChargeFreeQuantity
	 * LineItem16.mmChargeFreeQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmChargeFreeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmChargeFreeQuantity, LineItem16.mmChargeFreeQuantity);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmChargeFreeQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected ProductQuantity measureQuantityStartRelatedLineItem;
	/**
	 * Line item for which a measure quantity end is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
	 * ProductQuantity.mmMeasureQuantityStart}</li>
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
	public static final MMBusinessAssociationEnd mmMeasureQuantityStartRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStartRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityStart;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected ProductQuantity measureQuantityEndRelatedLineItem;
	/**
	 * Line item for which a measure quantity end is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
	 * ProductQuantity.mmMeasureQuantityEnd}</li>
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
	public static final MMBusinessAssociationEnd mmMeasureQuantityEndRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEndRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityEnd;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected ISODateTime measureDateTimeStart;
	/**
	 * Date/time on which the clock time measure started for a line item.
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeStart
	 * LineItem10.mmMeasureDateTimeStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeStart
	 * LineItem16.mmMeasureDateTimeStart}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMeasureDateTimeStart = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmMeasureDateTimeStart, LineItem16.mmMeasureDateTimeStart);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeStart";
			definition = "Date/time on which the clock time measure started for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime measureDateTimeEnd;
	/**
	 * Date/time on which the clock time measure ended for a line item.
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeEnd
	 * LineItem10.mmMeasureDateTimeEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeEnd
	 * LineItem16.mmMeasureDateTimeEnd}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMeasureDateTimeEnd = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmMeasureDateTimeEnd, LineItem16.mmMeasureDateTimeEnd);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeEnd";
			definition = "Date/time on which the clock time measure ended for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Invoice invoice;
	/**
	 * Specifies the invoice in which the line item is included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies the invoice in which the line item is included.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected CurrencyAndAmount netAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmTotalAmount
	 * LineItemDetails4.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmTotalAmount
	 * LineItemDetails7.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmTotalAmount
	 * LineItemDetails6.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmTotalAmount
	 * LineItemDetails9.mmTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3#mmNetAmount
	 * ReportLine3.mmNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2#mmNetAmount
	 * ReportLine2.mmNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4#mmNetAmount
	 * ReportLine4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmTotalAmount
	 * LineItemDetails10.mmTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7#mmNetAmount
	 * ReportLine7.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmTotalAmount
	 * LineItemDetails11.mmTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#mmNetAmount
	 * ReportLine6.mmNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5#mmNetAmount
	 * ReportLine5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmTotalAmount
	 * LineItemDetails13.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmTotalAmount
	 * LineItemDetails14.mmTotalAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails4.mmTotalAmount, LineItemDetails7.mmTotalAmount, LineItemDetails6.mmTotalAmount, LineItemDetails9.mmTotalAmount, ReportLine3.mmNetAmount, ReportLine2.mmNetAmount,
					ReportLine4.mmNetAmount, LineItemDetails10.mmTotalAmount, ReportLine7.mmNetAmount, LineItemDetails11.mmTotalAmount, ReportLine6.mmNetAmount, ReportLine5.mmNetAmount, LineItemDetails13.mmTotalAmount,
					LineItemDetails14.mmTotalAmount);
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Packaging> packaging;
	/**
	 * Physical packaging of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmRelatedLineItem
	 * Packaging.mmRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmPackaging = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected ISODateTime deliveryDateTime;
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
	public static final MMBusinessAttribute mmDeliveryDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services for this line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * Charges specified for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmLineItem
	 * Charges.mmLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Charges specified for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected Charges netPriceCharge;
	/**
	 * Allowance or charge applied to the net price. When the charge amount is
	 * added (credit)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmNetPriceChargeLineItem
	 * Charges.mmNetPriceChargeLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmNetPriceCharge = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceCharge";
			definition = "Allowance or charge applied to the net price. When the charge amount is added (credit)";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmNetPriceChargeLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> grossPriceQuantity;
	/**
	 * Quantity and conversion factor on which the gross price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossPriceQuantityRelatedLineItem
	 * ProductQuantity.mmGrossPriceQuantityRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmGrossPriceQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmGrossPriceQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> netPriceQuantity;
	/**
	 * Quantity and conversion factor on which the net price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetPriceQuantityRelatedLineItem
	 * ProductQuantity.mmNetPriceQuantityRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmNetPriceQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmNetPriceQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductQuantity> grossWeight;
	/**
	 * Gross weight of the physical item which is invoiced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossWeightRelatedLineItem
	 * ProductQuantity.mmGrossWeightRelatedLineItem}</li>
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
	public static final MMBusinessAssociationEnd mmGrossWeight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LineItem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the physical item which is invoiced.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmGrossWeightRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem";
				definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmLineItem, com.tools20022.repository.entity.Adjustment.mmRelatedLineItem,
						com.tools20022.repository.entity.Charges.mmLogisticsChargeLineItem, com.tools20022.repository.entity.Charges.mmLineItem, com.tools20022.repository.entity.Charges.mmNetPriceChargeLineItem,
						com.tools20022.repository.entity.Invoice.mmLineItem, com.tools20022.repository.entity.ProductQuantity.mmNetWeightRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmBilledQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmChargeFreeQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityStart,
						com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.mmGrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmNetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmGrossWeightRelatedLineItem,
						com.tools20022.repository.entity.Packaging.mmRelatedLineItem);
				element_lazy = () -> Arrays.asList(LineItem.mmFinancialAdjustment, LineItem.mmLogisticsCharge, LineItem.mmGrossAmount, LineItem.mmIdentification, LineItem.mmInvoicedProduct, LineItem.mmNetWeight, LineItem.mmBilledQuantity,
						LineItem.mmChargeFreeQuantity, LineItem.mmMeasureQuantityStartRelatedLineItem, LineItem.mmMeasureQuantityEndRelatedLineItem, LineItem.mmMeasureDateTimeStart, LineItem.mmMeasureDateTimeEnd, LineItem.mmInvoice,
						LineItem.mmNetAmount, LineItem.mmPackaging, LineItem.mmDeliveryDateTime, LineItem.mmCharges, LineItem.mmNetPriceCharge, LineItem.mmGrossPriceQuantity, LineItem.mmNetPriceQuantity, LineItem.mmGrossWeight);
				derivationComponent_lazy = () -> Arrays.asList(LineItemMonetarySummation1.mmObject(), LineItemDetails4.mmObject(), LineItemDetails7.mmObject(), LineItemDetails5.mmObject(), LineItemDetails8.mmObject(),
						LineItemDetails6.mmObject(), LineItemDetails9.mmObject(), LineItemAndPOIdentification1.mmObject(), LineItemDetails10.mmObject(), LineItemDetails11.mmObject(), LineItemDetails13.mmObject(),
						LineItemDetails12.mmObject(), LineItemDetails14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Adjustment getFinancialAdjustment() {
		return financialAdjustment;
	}

	public void setFinancialAdjustment(com.tools20022.repository.entity.Adjustment financialAdjustment) {
		this.financialAdjustment = financialAdjustment;
	}

	public List<Charges> getLogisticsCharge() {
		return logisticsCharge;
	}

	public void setLogisticsCharge(List<com.tools20022.repository.entity.Charges> logisticsCharge) {
		this.logisticsCharge = logisticsCharge;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Product getInvoicedProduct() {
		return invoicedProduct;
	}

	public void setInvoicedProduct(com.tools20022.repository.entity.Product invoicedProduct) {
		this.invoicedProduct = invoicedProduct;
	}

	public ProductQuantity getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(com.tools20022.repository.entity.ProductQuantity netWeight) {
		this.netWeight = netWeight;
	}

	public List<ProductQuantity> getBilledQuantity() {
		return billedQuantity;
	}

	public void setBilledQuantity(List<com.tools20022.repository.entity.ProductQuantity> billedQuantity) {
		this.billedQuantity = billedQuantity;
	}

	public List<ProductQuantity> getChargeFreeQuantity() {
		return chargeFreeQuantity;
	}

	public void setChargeFreeQuantity(List<com.tools20022.repository.entity.ProductQuantity> chargeFreeQuantity) {
		this.chargeFreeQuantity = chargeFreeQuantity;
	}

	public ProductQuantity getMeasureQuantityStartRelatedLineItem() {
		return measureQuantityStartRelatedLineItem;
	}

	public void setMeasureQuantityStartRelatedLineItem(com.tools20022.repository.entity.ProductQuantity measureQuantityStartRelatedLineItem) {
		this.measureQuantityStartRelatedLineItem = measureQuantityStartRelatedLineItem;
	}

	public ProductQuantity getMeasureQuantityEndRelatedLineItem() {
		return measureQuantityEndRelatedLineItem;
	}

	public void setMeasureQuantityEndRelatedLineItem(com.tools20022.repository.entity.ProductQuantity measureQuantityEndRelatedLineItem) {
		this.measureQuantityEndRelatedLineItem = measureQuantityEndRelatedLineItem;
	}

	public ISODateTime getMeasureDateTimeStart() {
		return measureDateTimeStart;
	}

	public void setMeasureDateTimeStart(ISODateTime measureDateTimeStart) {
		this.measureDateTimeStart = measureDateTimeStart;
	}

	public ISODateTime getMeasureDateTimeEnd() {
		return measureDateTimeEnd;
	}

	public void setMeasureDateTimeEnd(ISODateTime measureDateTimeEnd) {
		this.measureDateTimeEnd = measureDateTimeEnd;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(com.tools20022.repository.entity.Invoice invoice) {
		this.invoice = invoice;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public List<Packaging> getPackaging() {
		return packaging;
	}

	public void setPackaging(List<com.tools20022.repository.entity.Packaging> packaging) {
		this.packaging = packaging;
	}

	public ISODateTime getDeliveryDateTime() {
		return deliveryDateTime;
	}

	public void setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = charges;
	}

	public Charges getNetPriceCharge() {
		return netPriceCharge;
	}

	public void setNetPriceCharge(com.tools20022.repository.entity.Charges netPriceCharge) {
		this.netPriceCharge = netPriceCharge;
	}

	public List<ProductQuantity> getGrossPriceQuantity() {
		return grossPriceQuantity;
	}

	public void setGrossPriceQuantity(List<com.tools20022.repository.entity.ProductQuantity> grossPriceQuantity) {
		this.grossPriceQuantity = grossPriceQuantity;
	}

	public List<ProductQuantity> getNetPriceQuantity() {
		return netPriceQuantity;
	}

	public void setNetPriceQuantity(List<com.tools20022.repository.entity.ProductQuantity> netPriceQuantity) {
		this.netPriceQuantity = netPriceQuantity;
	}

	public List<ProductQuantity> getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(List<com.tools20022.repository.entity.ProductQuantity> grossWeight) {
		this.grossWeight = grossWeight;
	}
}