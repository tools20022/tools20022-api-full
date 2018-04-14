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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class LineItem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Adjustment financialAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
	 * Adjustment.mmRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmAllowanceCharge
	 * LineItem17.mmAllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmFinancialAdjustment
	 * LineItem17.mmFinancialAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification on the value of goods and / or services taking into account discounts, allowances and charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, Adjustment> mmFinancialAdjustment = new MMBusinessAssociationEnd<LineItem, Adjustment>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceTotals1.mmAdjustment, TradeSettlement1.mmAdjustmentAmountAndReason, LineItem10.mmAllowanceCharge, LineItem10.mmFinancialAdjustment, InvoiceTotals2.mmAdjustment,
					LineItem16.mmAllowanceCharge, LineItem16.mmFinancialAdjustment, LineItem17.mmAllowanceCharge, LineItem17.mmFinancialAdjustment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services taking into account discounts, allowances and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Adjustment.mmRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public Adjustment getValue(LineItem obj) {
			return obj.getFinancialAdjustment();
		}

		@Override
		public void setValue(LineItem obj, Adjustment value) {
			obj.setFinancialAdjustment(value);
		}
	};
	protected List<Charges> logisticsCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmLogisticsChargeLineItem
	 * Charges.mmLogisticsChargeLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmLogisticsCharge
	 * LineItem17.mmLogisticsCharge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<Charges>> mmLogisticsCharge = new MMBusinessAssociationEnd<LineItem, List<Charges>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmLogisticsCharge, LineItem10.mmLogisticsCharge, LineItem16.mmLogisticsCharge, LineItem17.mmLogisticsCharge);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmLogisticsChargeLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public List<Charges> getValue(LineItem obj) {
			return obj.getLogisticsCharge();
		}

		@Override
		public void setValue(LineItem obj, List<Charges> value) {
			obj.setLogisticsCharge(value);
		}
	};
	protected CurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmLineTotalAmount
	 * SettlementMonetarySummation1.mmLineTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the line amount total being reported for this settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, CurrencyAndAmount> mmGrossAmount = new MMBusinessAttribute<LineItem, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmLineTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(LineItem obj, CurrencyAndAmount value) {
			obj.setGrossAmount(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmIdentification
	 * LineItem17.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, Max35Text> mmIdentification = new MMBusinessAttribute<LineItem, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmIdentification, LineItemDetails4.mmLineItemIdentification, LineItemDetails7.mmLineItemIdentification, RequiredSubmission4.mmLineItemIdentification,
					LineItemDetails5.mmLineItemIdentification, LineItemDetails8.mmLineItemIdentification, LineItemDetails6.mmLineItemIdentification, LineItemDetails9.mmLineItemIdentification,
					LineItemAndPOIdentification1.mmLineItemIdentification, LineItemDetails10.mmLineItemIdentification, LineItemDetails11.mmLineItemIdentification, LineItemDetails13.mmLineItemIdentification,
					LineItemDetails12.mmLineItemIdentification, LineItemDetails14.mmLineItemIdentification, LineItem16.mmIdentification, LineItem17.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(LineItem obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(LineItem obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Product invoicedProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmLineItem
	 * Product.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals2#mmServiceItemTotals
	 * ServiceCategoryTotals2.mmServiceItemTotals}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmTradeProduct
	 * LineItem17.mmTradeProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicedProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product and the quantity for which an invoice is generated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, Product> mmInvoicedProduct = new MMBusinessAssociationEnd<LineItem, Product>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmTradeProduct, ServiceCategoryTotals1.mmServiceItemTotals, LineItem16.mmTradeProduct, ServiceCategoryTotals2.mmServiceItemTotals, LineItem17.mmTradeProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoicedProduct";
			definition = "Specifies the product and the quantity for which an invoice is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Product.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Product getValue(LineItem obj) {
			return obj.getInvoicedProduct();
		}

		@Override
		public void setValue(LineItem obj, Product value) {
			obj.setInvoicedProduct(value);
		}
	};
	protected ProductQuantity netWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetWeightRelatedLineItem
	 * ProductQuantity.mmNetWeightRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetWeight
	 * LineItem10.mmNetWeight}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetWeight
	 * LineItem16.mmNetWeight}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmNetWeight
	 * LineItem17.mmNetWeight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net weight of the physical item which is invoiced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, ProductQuantity> mmNetWeight = new MMBusinessAssociationEnd<LineItem, ProductQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmNetWeight, LineItem16.mmNetWeight, LineItem17.mmNetWeight);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the physical item which is invoiced.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmNetWeightRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(LineItem obj) {
			return obj.getNetWeight();
		}

		@Override
		public void setValue(LineItem obj, ProductQuantity value) {
			obj.setNetWeight(value);
		}
	};
	protected List<ProductQuantity> billedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmBilledQuantityRelatedLineItem
	 * ProductQuantity.mmBilledQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmBilledQuantity
	 * LineItem17.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmBasisQuantity
	 * LineItemAllowanceCharge3.mmBasisQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity billed for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<ProductQuantity>> mmBilledQuantity = new MMBusinessAssociationEnd<LineItem, List<ProductQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemAllowanceCharge1.mmBasisQuantity, LineItem10.mmBilledQuantity, LineItemDetails4.mmQuantity, LineItem16.mmBilledQuantity, LineItemAllowanceCharge2.mmBasisQuantity,
					LineItem17.mmBilledQuantity, LineItemAllowanceCharge3.mmBasisQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmBilledQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(LineItem obj) {
			return obj.getBilledQuantity();
		}

		@Override
		public void setValue(LineItem obj, List<ProductQuantity> value) {
			obj.setBilledQuantity(value);
		}
	};
	protected List<ProductQuantity> chargeFreeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmChargeFreeQuantityRelatedLineItem
	 * ProductQuantity.mmChargeFreeQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmChargeFreeQuantity
	 * LineItem10.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmChargeFreeQuantity
	 * LineItem16.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmChargeFreeQuantity
	 * LineItem17.mmChargeFreeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity that is free of charge for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<ProductQuantity>> mmChargeFreeQuantity = new MMBusinessAssociationEnd<LineItem, List<ProductQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmChargeFreeQuantity, LineItem16.mmChargeFreeQuantity, LineItem17.mmChargeFreeQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmChargeFreeQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(LineItem obj) {
			return obj.getChargeFreeQuantity();
		}

		@Override
		public void setValue(LineItem obj, List<ProductQuantity> value) {
			obj.setChargeFreeQuantity(value);
		}
	};
	protected ProductQuantity measureQuantityStartRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
	 * ProductQuantity.mmMeasureQuantityStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStartRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a measure quantity end is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, ProductQuantity> mmMeasureQuantityStartRelatedLineItem = new MMBusinessAssociationEnd<LineItem, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStartRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmMeasureQuantityStart;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(LineItem obj) {
			return obj.getMeasureQuantityStartRelatedLineItem();
		}

		@Override
		public void setValue(LineItem obj, ProductQuantity value) {
			obj.setMeasureQuantityStartRelatedLineItem(value);
		}
	};
	protected ProductQuantity measureQuantityEndRelatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
	 * ProductQuantity.mmMeasureQuantityEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEndRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a measure quantity end is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, ProductQuantity> mmMeasureQuantityEndRelatedLineItem = new MMBusinessAssociationEnd<LineItem, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEndRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmMeasureQuantityEnd;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(LineItem obj) {
			return obj.getMeasureQuantityEndRelatedLineItem();
		}

		@Override
		public void setValue(LineItem obj, ProductQuantity value) {
			obj.setMeasureQuantityEndRelatedLineItem(value);
		}
	};
	protected ISODateTime measureDateTimeStart;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeStart
	 * LineItem10.mmMeasureDateTimeStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeStart
	 * LineItem16.mmMeasureDateTimeStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmMeasureDateTimeStart
	 * LineItem17.mmMeasureDateTimeStart}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure started for a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, ISODateTime> mmMeasureDateTimeStart = new MMBusinessAttribute<LineItem, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmMeasureDateTimeStart, LineItem16.mmMeasureDateTimeStart, LineItem17.mmMeasureDateTimeStart);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeStart";
			definition = "Date/time on which the clock time measure started for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(LineItem obj) {
			return obj.getMeasureDateTimeStart();
		}

		@Override
		public void setValue(LineItem obj, ISODateTime value) {
			obj.setMeasureDateTimeStart(value);
		}
	};
	protected ISODateTime measureDateTimeEnd;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeEnd
	 * LineItem10.mmMeasureDateTimeEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeEnd
	 * LineItem16.mmMeasureDateTimeEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmMeasureDateTimeEnd
	 * LineItem17.mmMeasureDateTimeEnd}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure ended for a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, ISODateTime> mmMeasureDateTimeEnd = new MMBusinessAttribute<LineItem, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmMeasureDateTimeEnd, LineItem16.mmMeasureDateTimeEnd, LineItem17.mmMeasureDateTimeEnd);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeEnd";
			definition = "Date/time on which the clock time measure ended for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(LineItem obj) {
			return obj.getMeasureDateTimeEnd();
		}

		@Override
		public void setValue(LineItem obj, ISODateTime value) {
			obj.setMeasureDateTimeEnd(value);
		}
	};
	protected Invoice invoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the invoice in which the line item is included."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, Optional<Invoice>> mmInvoice = new MMBusinessAssociationEnd<LineItem, Optional<Invoice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies the invoice in which the line item is included.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Invoice.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public Optional<Invoice> getValue(LineItem obj) {
			return obj.getInvoice();
		}

		@Override
		public void setValue(LineItem obj, Optional<Invoice> value) {
			obj.setInvoice(value.orElse(null));
		}
	};
	protected CurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, CurrencyAndAmount> mmNetAmount = new MMBusinessAttribute<LineItem, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails4.mmTotalAmount, LineItemDetails7.mmTotalAmount, LineItemDetails6.mmTotalAmount, LineItemDetails9.mmTotalAmount, ReportLine3.mmNetAmount, ReportLine2.mmNetAmount,
					ReportLine4.mmNetAmount, LineItemDetails10.mmTotalAmount, ReportLine7.mmNetAmount, LineItemDetails11.mmTotalAmount, ReportLine6.mmNetAmount, ReportLine5.mmNetAmount, LineItemDetails13.mmTotalAmount,
					LineItemDetails14.mmTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(LineItem obj, CurrencyAndAmount value) {
			obj.setNetAmount(value);
		}
	};
	protected List<Packaging> packaging;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmRelatedLineItem
	 * Packaging.mmRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<Packaging>> mmPackaging = new MMBusinessAssociationEnd<LineItem, List<Packaging>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			minOccurs = 0;
			opposite_lazy = () -> Packaging.mmRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public List<Packaging> getValue(LineItem obj) {
			return obj.getPackaging();
		}

		@Override
		public void setValue(LineItem obj, List<Packaging> value) {
			obj.setPackaging(value);
		}
	};
	protected ISODateTime deliveryDateTime;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual delivery date/time of the products and/or services for this line item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LineItem, ISODateTime> mmDeliveryDateTime = new MMBusinessAttribute<LineItem, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services for this line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(LineItem obj) {
			return obj.getDeliveryDateTime();
		}

		@Override
		public void setValue(LineItem obj, ISODateTime value) {
			obj.setDeliveryDateTime(value);
		}
	};
	protected List<Charges> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmLineItem
	 * Charges.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges specified for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<Charges>> mmCharges = new MMBusinessAssociationEnd<LineItem, List<Charges>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Charges specified for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public List<Charges> getValue(LineItem obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(LineItem obj, List<Charges> value) {
			obj.setCharges(value);
		}
	};
	protected Charges netPriceCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmNetPriceChargeLineItem
	 * Charges.mmNetPriceChargeLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allowance or charge applied to the net price. When the charge amount is added (credit)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, Charges> mmNetPriceCharge = new MMBusinessAssociationEnd<LineItem, Charges>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceCharge";
			definition = "Allowance or charge applied to the net price. When the charge amount is added (credit)";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Charges.mmNetPriceChargeLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public Charges getValue(LineItem obj) {
			return obj.getNetPriceCharge();
		}

		@Override
		public void setValue(LineItem obj, Charges value) {
			obj.setNetPriceCharge(value);
		}
	};
	protected List<ProductQuantity> grossPriceQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossPriceQuantityRelatedLineItem
	 * ProductQuantity.mmGrossPriceQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the gross price is based for this line item product and/or service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<ProductQuantity>> mmGrossPriceQuantity = new MMBusinessAssociationEnd<LineItem, List<ProductQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmGrossPriceQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(LineItem obj) {
			return obj.getGrossPriceQuantity();
		}

		@Override
		public void setValue(LineItem obj, List<ProductQuantity> value) {
			obj.setGrossPriceQuantity(value);
		}
	};
	protected List<ProductQuantity> netPriceQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetPriceQuantityRelatedLineItem
	 * ProductQuantity.mmNetPriceQuantityRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the net price is based for this line item product and/or service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<ProductQuantity>> mmNetPriceQuantity = new MMBusinessAssociationEnd<LineItem, List<ProductQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmNetPriceQuantityRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(LineItem obj) {
			return obj.getNetPriceQuantity();
		}

		@Override
		public void setValue(LineItem obj, List<ProductQuantity> value) {
			obj.setNetPriceQuantity(value);
		}
	};
	protected List<ProductQuantity> grossWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossWeightRelatedLineItem
	 * ProductQuantity.mmGrossWeightRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LineItem
	 * LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross weight of the physical item which is invoiced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LineItem, List<ProductQuantity>> mmGrossWeight = new MMBusinessAssociationEnd<LineItem, List<ProductQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the physical item which is invoiced.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmGrossWeightRelatedLineItem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(LineItem obj) {
			return obj.getGrossWeight();
		}

		@Override
		public void setValue(LineItem obj, List<ProductQuantity> value) {
			obj.setGrossWeight(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem";
				definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
				associationDomain_lazy = () -> Arrays
						.asList(Product.mmLineItem, Adjustment.mmRelatedLineItem, Charges.mmLogisticsChargeLineItem, Charges.mmLineItem, Charges.mmNetPriceChargeLineItem, Invoice.mmLineItem, ProductQuantity.mmNetWeightRelatedLineItem,
								ProductQuantity.mmBilledQuantityRelatedLineItem, ProductQuantity.mmChargeFreeQuantityRelatedLineItem, ProductQuantity.mmMeasureQuantityStart, ProductQuantity.mmMeasureQuantityEnd,
								ProductQuantity.mmGrossPriceQuantityRelatedLineItem, ProductQuantity.mmNetPriceQuantityRelatedLineItem, ProductQuantity.mmGrossWeightRelatedLineItem, Packaging.mmRelatedLineItem);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LineItem.mmFinancialAdjustment, com.tools20022.repository.entity.LineItem.mmLogisticsCharge, com.tools20022.repository.entity.LineItem.mmGrossAmount,
						com.tools20022.repository.entity.LineItem.mmIdentification, com.tools20022.repository.entity.LineItem.mmInvoicedProduct, com.tools20022.repository.entity.LineItem.mmNetWeight,
						com.tools20022.repository.entity.LineItem.mmBilledQuantity, com.tools20022.repository.entity.LineItem.mmChargeFreeQuantity, com.tools20022.repository.entity.LineItem.mmMeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.mmMeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.mmMeasureDateTimeStart, com.tools20022.repository.entity.LineItem.mmMeasureDateTimeEnd,
						com.tools20022.repository.entity.LineItem.mmInvoice, com.tools20022.repository.entity.LineItem.mmNetAmount, com.tools20022.repository.entity.LineItem.mmPackaging,
						com.tools20022.repository.entity.LineItem.mmDeliveryDateTime, com.tools20022.repository.entity.LineItem.mmCharges, com.tools20022.repository.entity.LineItem.mmNetPriceCharge,
						com.tools20022.repository.entity.LineItem.mmGrossPriceQuantity, com.tools20022.repository.entity.LineItem.mmNetPriceQuantity, com.tools20022.repository.entity.LineItem.mmGrossWeight);
				derivationComponent_lazy = () -> Arrays.asList(LineItemMonetarySummation1.mmObject(), LineItemDetails4.mmObject(), LineItemDetails7.mmObject(), LineItemDetails5.mmObject(), LineItemDetails8.mmObject(),
						LineItemDetails6.mmObject(), LineItemDetails9.mmObject(), LineItemAndPOIdentification1.mmObject(), LineItemDetails10.mmObject(), LineItemDetails11.mmObject(), LineItemDetails13.mmObject(),
						LineItemDetails12.mmObject(), LineItemDetails14.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return LineItem.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Adjustment getFinancialAdjustment() {
		return financialAdjustment;
	}

	public LineItem setFinancialAdjustment(Adjustment financialAdjustment) {
		this.financialAdjustment = Objects.requireNonNull(financialAdjustment);
		return this;
	}

	public List<Charges> getLogisticsCharge() {
		return logisticsCharge == null ? logisticsCharge = new ArrayList<>() : logisticsCharge;
	}

	public LineItem setLogisticsCharge(List<Charges> logisticsCharge) {
		this.logisticsCharge = Objects.requireNonNull(logisticsCharge);
		return this;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public LineItem setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = Objects.requireNonNull(grossAmount);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public LineItem setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Product getInvoicedProduct() {
		return invoicedProduct;
	}

	public LineItem setInvoicedProduct(Product invoicedProduct) {
		this.invoicedProduct = Objects.requireNonNull(invoicedProduct);
		return this;
	}

	public ProductQuantity getNetWeight() {
		return netWeight;
	}

	public LineItem setNetWeight(ProductQuantity netWeight) {
		this.netWeight = Objects.requireNonNull(netWeight);
		return this;
	}

	public List<ProductQuantity> getBilledQuantity() {
		return billedQuantity == null ? billedQuantity = new ArrayList<>() : billedQuantity;
	}

	public LineItem setBilledQuantity(List<ProductQuantity> billedQuantity) {
		this.billedQuantity = Objects.requireNonNull(billedQuantity);
		return this;
	}

	public List<ProductQuantity> getChargeFreeQuantity() {
		return chargeFreeQuantity == null ? chargeFreeQuantity = new ArrayList<>() : chargeFreeQuantity;
	}

	public LineItem setChargeFreeQuantity(List<ProductQuantity> chargeFreeQuantity) {
		this.chargeFreeQuantity = Objects.requireNonNull(chargeFreeQuantity);
		return this;
	}

	public ProductQuantity getMeasureQuantityStartRelatedLineItem() {
		return measureQuantityStartRelatedLineItem;
	}

	public LineItem setMeasureQuantityStartRelatedLineItem(ProductQuantity measureQuantityStartRelatedLineItem) {
		this.measureQuantityStartRelatedLineItem = Objects.requireNonNull(measureQuantityStartRelatedLineItem);
		return this;
	}

	public ProductQuantity getMeasureQuantityEndRelatedLineItem() {
		return measureQuantityEndRelatedLineItem;
	}

	public LineItem setMeasureQuantityEndRelatedLineItem(ProductQuantity measureQuantityEndRelatedLineItem) {
		this.measureQuantityEndRelatedLineItem = Objects.requireNonNull(measureQuantityEndRelatedLineItem);
		return this;
	}

	public ISODateTime getMeasureDateTimeStart() {
		return measureDateTimeStart;
	}

	public LineItem setMeasureDateTimeStart(ISODateTime measureDateTimeStart) {
		this.measureDateTimeStart = Objects.requireNonNull(measureDateTimeStart);
		return this;
	}

	public ISODateTime getMeasureDateTimeEnd() {
		return measureDateTimeEnd;
	}

	public LineItem setMeasureDateTimeEnd(ISODateTime measureDateTimeEnd) {
		this.measureDateTimeEnd = Objects.requireNonNull(measureDateTimeEnd);
		return this;
	}

	public Optional<Invoice> getInvoice() {
		return invoice == null ? Optional.empty() : Optional.of(invoice);
	}

	public LineItem setInvoice(Invoice invoice) {
		this.invoice = invoice;
		return this;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public LineItem setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public List<Packaging> getPackaging() {
		return packaging == null ? packaging = new ArrayList<>() : packaging;
	}

	public LineItem setPackaging(List<Packaging> packaging) {
		this.packaging = Objects.requireNonNull(packaging);
		return this;
	}

	public ISODateTime getDeliveryDateTime() {
		return deliveryDateTime;
	}

	public LineItem setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = Objects.requireNonNull(deliveryDateTime);
		return this;
	}

	public List<Charges> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public LineItem setCharges(List<Charges> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public Charges getNetPriceCharge() {
		return netPriceCharge;
	}

	public LineItem setNetPriceCharge(Charges netPriceCharge) {
		this.netPriceCharge = Objects.requireNonNull(netPriceCharge);
		return this;
	}

	public List<ProductQuantity> getGrossPriceQuantity() {
		return grossPriceQuantity == null ? grossPriceQuantity = new ArrayList<>() : grossPriceQuantity;
	}

	public LineItem setGrossPriceQuantity(List<ProductQuantity> grossPriceQuantity) {
		this.grossPriceQuantity = Objects.requireNonNull(grossPriceQuantity);
		return this;
	}

	public List<ProductQuantity> getNetPriceQuantity() {
		return netPriceQuantity == null ? netPriceQuantity = new ArrayList<>() : netPriceQuantity;
	}

	public LineItem setNetPriceQuantity(List<ProductQuantity> netPriceQuantity) {
		this.netPriceQuantity = Objects.requireNonNull(netPriceQuantity);
		return this;
	}

	public List<ProductQuantity> getGrossWeight() {
		return grossWeight == null ? grossWeight = new ArrayList<>() : grossWeight;
	}

	public LineItem setGrossWeight(List<ProductQuantity> grossWeight) {
		this.grossWeight = Objects.requireNonNull(grossWeight);
		return this;
	}
}