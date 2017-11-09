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
import com.tools20022.repository.area.tsin.FinancialInvoiceV01;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Unit of information showing the related provision of products and/or services
 * and monetary summations reported as a discrete line items.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmIdentification
 * LineItem10.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmTradeProduct
 * LineItem10.mmTradeProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmBuyerOrderIdentification
 * LineItem10.mmBuyerOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmContractIdentification
 * LineItem10.mmContractIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmPurchaseAccountingAccount
 * LineItem10.mmPurchaseAccountingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetPrice
 * LineItem10.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetPriceQuantity
 * LineItem10.mmNetPriceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmNetPriceAllowanceCharge
 * LineItem10.mmNetPriceAllowanceCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetWeight
 * LineItem10.mmNetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPrice
 * LineItem10.mmGrossPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPriceQuantity
 * LineItem10.mmGrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossWeight
 * LineItem10.mmGrossWeight}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmLogisticsCharge
 * LineItem10.mmLogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmTax
 * LineItem10.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmAllowanceCharge
 * LineItem10.mmAllowanceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmFinancialAdjustment
 * LineItem10.mmFinancialAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmBilledQuantity
 * LineItem10.mmBilledQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmPackageQuantity
 * LineItem10.mmPackageQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmPerPackageUnitQuantity
 * LineItem10.mmPerPackageUnitQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmPackaging
 * LineItem10.mmPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmChargeFreeQuantity
 * LineItem10.mmChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureQuantityStart
 * LineItem10.mmMeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureQuantityEnd
 * LineItem10.mmMeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeStart
 * LineItem10.mmMeasureDateTimeStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureDateTimeEnd
 * LineItem10.mmMeasureDateTimeEnd}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmShipTo
 * LineItem10.mmShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmIncoterms
 * LineItem10.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmDeliveryDateTime
 * LineItem10.mmDeliveryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem10#mmDeliveryNoteIdentification
 * LineItem10.mmDeliveryNoteIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmMonetarySummation
 * LineItem10.mmMonetarySummation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmIncludedNote
 * LineItem10.mmIncludedNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmLineItem
 * FinancialInvoiceV01.mmLineItem}</li>
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
 * "LineItem10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line items."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem16 LineItem16}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class LineItem10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * The unique identification of this invoice line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The unique identification of this invoice line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmIdentification
	 * LineItem16.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmIdentification;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "The unique identification of this invoice line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TradeProduct1 tradeProduct;
	/**
	 * Something that is produced and sold as the result of an industrial
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeProduct1
	 * TradeProduct1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
	 * LineItem.mmInvoicedProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Something that is produced and sold as the result of an industrial process."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTradeProduct
	 * LineItem16.mmTradeProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LineItem.mmInvoicedProduct;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "TradPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeProduct";
			definition = "Something that is produced and sold as the result of an industrial process.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmTradeProduct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
		}
	};
	protected DocumentIdentification23 buyerOrderIdentification;
	/**
	 * Purchase order reference assigned by the buyer related to the provision
	 * of products and/or services for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23
	 * DocumentIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase order reference assigned by the buyer related to the provision of products and/or services for this line item."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmBuyerOrderIdentification
	 * LineItem16.mmBuyerOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyerOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "BuyrOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerOrderIdentification";
			definition = "Purchase order reference assigned by the buyer related to the provision of products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmBuyerOrderIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification23.mmObject();
		}
	};
	protected DocumentIdentification22 contractIdentification;
	/**
	 * Contract reference related to the provision of products and/or services
	 * for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract reference related to the provision of products and/or services for this line item."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmContractIdentification
	 * LineItem16.mmContractIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Contract reference related to the provision of products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmContractIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountingAccount1> purchaseAccountingAccount;
	/**
	 * Specific purchase account for recording debits and credits for accounting
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountingAccount1
	 * AccountingAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
	 * CommercialTrade.mmPurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsAcctgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccountingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmPurchaseAccountingAccount
	 * LineItem16.mmPurchaseAccountingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseAccountingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPurchaseAccount;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "PurchsAcctgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseAccountingAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPurchaseAccountingAccount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountingAccount1.mmObject();
		}
	};
	protected List<CurrencyAndAmount> netPrice;
	/**
	 * Value of the price, eg, as a currency and value.
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
	 * {@linkplain com.tools20022.repository.entity.Product#mmNetPrice
	 * Product.mmNetPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetPrice
	 * LineItem16.mmNetPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmNetPrice;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPrice";
			definition = "Value of the price, eg, as a currency and value.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPrice);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Quantity4 netPriceQuantity;
	/**
	 * Quantity and conversion factor on which the net price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity4
	 * Quantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPricQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the net price is based for this line item product and/or service."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmNetPriceQuantity
	 * LineItem16.mmNetPriceQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetPriceQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPricQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPriceQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItemAllowanceCharge1> netPriceAllowanceCharge;
	/**
	 * Allowance or charge applied to the net price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1
	 * LineItemAllowanceCharge1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPricAllwncChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceAllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge applied to the net price."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmNetPriceAllowanceCharge
	 * LineItem16.mmNetPriceAllowanceCharge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetPriceAllowanceCharge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPricAllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPriceAllowanceCharge";
			definition = "Allowance or charge applied to the net price.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPriceAllowanceCharge);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge1.mmObject();
		}
	};
	protected Quantity3 netWeight;
	/**
	 * Net weight of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
	 * LineItem.mmNetWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetWght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net weight of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetWeight
	 * LineItem16.mmNetWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetWeight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmNetWeight;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetWeight);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected List<CurrencyAndAmount> grossPrice;
	/**
	 * Gross price of the product and/or service.
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
	 * {@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
	 * Product.mmGrossPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross price of the product and/or service."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPrice
	 * LineItem16.mmGrossPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmGrossPrice;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossPrice);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Quantity4 grossPriceQuantity;
	/**
	 * Quantity and conversion factor on which the gross price is based for this
	 * line item product and/or service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity4
	 * Quantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssPricQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity and conversion factor on which the gross price is based for this line item product and/or service."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPriceQuantity
	 * LineItem16.mmGrossPriceQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossPriceQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssPricQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossPriceQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity4.mmObject();
		}
	};
	protected Quantity3 grossWeight;
	/**
	 * Gross weight of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssWght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross weight of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossWeight
	 * LineItem16.mmGrossWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossWeight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossWeight);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ChargesDetails2> logisticsCharge;
	/**
	 * Logistics service charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ChargesDetails2
	 * ChargesDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
	 * LineItem.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LogstcsChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge for this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmLogisticsCharge
	 * LineItem16.mmLogisticsCharge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLogisticsCharge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmLogisticsCharge;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "LogstcsChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmLogisticsCharge);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ChargesDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItemTax1> tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters such as thresholds or income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemTax1
	 * LineItemTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTax
	 * LineItem16.mmTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmTax);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItemAllowanceCharge1> allowanceCharge;
	/**
	 * Allowance or charge specified for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1
	 * LineItemAllowanceCharge1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge specified for this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmAllowanceCharge
	 * LineItem16.mmAllowanceCharge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllowanceCharge = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "AllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceCharge";
			definition = "Allowance or charge specified for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmAllowanceCharge);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Adjustment4> financialAdjustment;
	/**
	 * Modification on the value of goods and / or services. For example:
	 * rebate, discount, surcharge
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Adjustment4
	 * Adjustment4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification on the value of goods and / or services. For example: rebate, discount, surcharge"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmFinancialAdjustment
	 * LineItem16.mmFinancialAdjustment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialAdjustment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "FinAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services. For example: rebate, discount, surcharge";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmFinancialAdjustment);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Adjustment4.mmObject();
		}
	};
	protected Quantity3 billedQuantity;
	/**
	 * Quantity billed for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
	 * LineItem.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity billed for this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmBilledQuantity
	 * LineItem16.mmBilledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilledQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmBilledQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "BlldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmBilledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected DecimalNumber packageQuantity;
	/**
	 * Number of product packages delivered.
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
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
	 * Packaging.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PackgQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of product packages delivered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmPackageQuantity
	 * LineItem16.mmPackageQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPackageQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Packaging.mmQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "PackgQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PackageQuantity";
			definition = "Number of product packages delivered.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPackageQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Quantity3 perPackageUnitQuantity;
	/**
	 * Number of units per package in this line item for a supply chain trade
	 * delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
	 * Packaging.mmPerPackageUnitQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerPackgUnitQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerPackageUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units per package in this line item for a supply chain trade delivery."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmPerPackageUnitQuantity
	 * LineItem16.mmPerPackageUnitQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPerPackageUnitQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Packaging.mmPerPackageUnitQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "PerPackgUnitQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerPackageUnitQuantity";
			definition = "Number of units per package in this line item for a supply chain trade delivery.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPerPackageUnitQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Packaging1> packaging;
	/**
	 * Physical packaging of the product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Packaging1 Packaging1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPackaging
	 * Transport.mmPackaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Packgng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmPackaging
	 * LineItem16.mmPackaging}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPackaging = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPackaging;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Packgng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPackaging);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Packaging1.mmObject();
		}
	};
	protected Quantity3 chargeFreeQuantity;
	/**
	 * Quantity that is free of charge for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
	 * LineItem.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgFreeQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity that is free of charge for this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmChargeFreeQuantity
	 * LineItem16.mmChargeFreeQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeFreeQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmChargeFreeQuantity;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "ChrgFreeQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmChargeFreeQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected Quantity3 measureQuantityStart;
	/**
	 * Quantity value on which the quantity measurement started for a line item.
	 * For instance the start amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
	 * ProductQuantity.mmMeasureQuantityStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MeasrQtyStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureQuantityStart
	 * LineItem16.mmMeasureQuantityStart}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeasureQuantityStart = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmMeasureQuantityStart;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrQtyStart";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureQuantityStart);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected Quantity3 measureQuantityEnd;
	/**
	 * Quantity value on which the quantity measurement ended for a line item.
	 * For instance the end amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
	 * ProductQuantity.mmMeasureQuantityEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MeasrQtyEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureQuantityEnd
	 * LineItem16.mmMeasureQuantityEnd}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeasureQuantityEnd = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmMeasureQuantityEnd;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrQtyEnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureQuantityEnd);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
		}
	};
	protected ISODateTime measureDateTimeStart;
	/**
	 * Date/time on which the clock time measure started for a line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureDateTimeStart
	 * LineItem.mmMeasureDateTimeStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MeasrDtTmStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure started for a line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeStart
	 * LineItem16.mmMeasureDateTimeStart}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeasureDateTimeStart = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmMeasureDateTimeStart;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrDtTmStart";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureDateTimeStart";
			definition = "Date/time on which the clock time measure started for a line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureDateTimeStart);
			maxOccurs = 1;
			minOccurs = 0;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureDateTimeEnd
	 * LineItem.mmMeasureDateTimeEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MeasrDtTmEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure ended for a line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureDateTimeEnd
	 * LineItem16.mmMeasureDateTimeEnd}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeasureDateTimeEnd = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmMeasureDateTimeEnd;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrDtTmEnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureDateTimeEnd";
			definition = "Date/time on which the clock time measure ended for a line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureDateTimeEnd);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TradeParty1 shipTo;
	/**
	 * Party to whom the goods must be delivered in the end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipTo ShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered in the end."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmShipTo
	 * LineItem16.mmShipTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipTo = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmShipTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmObject();
		}
	};
	protected Incoterms3 incoterms;
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Incoterms3
	 * Incoterms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmIncoterms
	 * LineItem16.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncoterms = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmIncoterms);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Incoterms3.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmArrivalDateTime
	 * Transport.mmArrivalDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual delivery date/time of the products and/or services for this line item."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmDeliveryDateTime
	 * LineItem16.mmDeliveryDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmArrivalDateTime;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmDeliveryDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DocumentIdentification22 deliveryNoteIdentification;
	/**
	 * Delivery note related to the delivery of the products and/or services for
	 * this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryNoteId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryNoteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery note related to the delivery of the products and/or services for this line item."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmDeliveryNoteIdentification
	 * LineItem16.mmDeliveryNoteIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryNoteIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "DlvryNoteId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryNoteIdentification";
			definition = "Delivery note related to the delivery of the products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmDeliveryNoteIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	protected LineItemMonetarySummation1 monetarySummation;
	/**
	 * Monetary totals for this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntrySummtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetarySummation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monetary totals for this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMonetarySummation
	 * LineItem16.mmMonetarySummation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetarySummation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MntrySummtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetarySummation";
			definition = "Monetary totals for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMonetarySummation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AdditionalInformation1> includedNote;
	/**
	 * Note included in this line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation1
	 * AdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InclNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Note included in this line item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmIncludedNote
	 * LineItem16.mmIncludedNote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncludedNote = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem10.mmObject();
			isDerived = false;
			xmlTag = "InclNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedNote";
			definition = "Note included in this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmIncludedNote);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LineItem10.mmIdentification, LineItem10.mmTradeProduct, LineItem10.mmBuyerOrderIdentification, LineItem10.mmContractIdentification, LineItem10.mmPurchaseAccountingAccount,
						LineItem10.mmNetPrice, LineItem10.mmNetPriceQuantity, LineItem10.mmNetPriceAllowanceCharge, LineItem10.mmNetWeight, LineItem10.mmGrossPrice, LineItem10.mmGrossPriceQuantity, LineItem10.mmGrossWeight,
						LineItem10.mmLogisticsCharge, LineItem10.mmTax, LineItem10.mmAllowanceCharge, LineItem10.mmFinancialAdjustment, LineItem10.mmBilledQuantity, LineItem10.mmPackageQuantity, LineItem10.mmPerPackageUnitQuantity,
						LineItem10.mmPackaging, LineItem10.mmChargeFreeQuantity, LineItem10.mmMeasureQuantityStart, LineItem10.mmMeasureQuantityEnd, LineItem10.mmMeasureDateTimeStart, LineItem10.mmMeasureDateTimeEnd, LineItem10.mmShipTo,
						LineItem10.mmIncoterms, LineItem10.mmDeliveryDateTime, LineItem10.mmDeliveryNoteIdentification, LineItem10.mmMonetarySummation, LineItem10.mmIncludedNote);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmLineItem);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem10";
				definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line items.";
				nextVersions_lazy = () -> Arrays.asList(LineItem16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public TradeProduct1 getTradeProduct() {
		return tradeProduct;
	}

	public void setTradeProduct(com.tools20022.repository.msg.TradeProduct1 tradeProduct) {
		this.tradeProduct = tradeProduct;
	}

	public DocumentIdentification23 getBuyerOrderIdentification() {
		return buyerOrderIdentification;
	}

	public void setBuyerOrderIdentification(com.tools20022.repository.msg.DocumentIdentification23 buyerOrderIdentification) {
		this.buyerOrderIdentification = buyerOrderIdentification;
	}

	public DocumentIdentification22 getContractIdentification() {
		return contractIdentification;
	}

	public void setContractIdentification(com.tools20022.repository.msg.DocumentIdentification22 contractIdentification) {
		this.contractIdentification = contractIdentification;
	}

	public List<AccountingAccount1> getPurchaseAccountingAccount() {
		return purchaseAccountingAccount;
	}

	public void setPurchaseAccountingAccount(List<com.tools20022.repository.msg.AccountingAccount1> purchaseAccountingAccount) {
		this.purchaseAccountingAccount = purchaseAccountingAccount;
	}

	public List<CurrencyAndAmount> getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(List<CurrencyAndAmount> netPrice) {
		this.netPrice = netPrice;
	}

	public Quantity4 getNetPriceQuantity() {
		return netPriceQuantity;
	}

	public void setNetPriceQuantity(com.tools20022.repository.msg.Quantity4 netPriceQuantity) {
		this.netPriceQuantity = netPriceQuantity;
	}

	public List<LineItemAllowanceCharge1> getNetPriceAllowanceCharge() {
		return netPriceAllowanceCharge;
	}

	public void setNetPriceAllowanceCharge(List<com.tools20022.repository.msg.LineItemAllowanceCharge1> netPriceAllowanceCharge) {
		this.netPriceAllowanceCharge = netPriceAllowanceCharge;
	}

	public Quantity3 getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(com.tools20022.repository.msg.Quantity3 netWeight) {
		this.netWeight = netWeight;
	}

	public List<CurrencyAndAmount> getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(List<CurrencyAndAmount> grossPrice) {
		this.grossPrice = grossPrice;
	}

	public Quantity4 getGrossPriceQuantity() {
		return grossPriceQuantity;
	}

	public void setGrossPriceQuantity(com.tools20022.repository.msg.Quantity4 grossPriceQuantity) {
		this.grossPriceQuantity = grossPriceQuantity;
	}

	public Quantity3 getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(com.tools20022.repository.msg.Quantity3 grossWeight) {
		this.grossWeight = grossWeight;
	}

	public List<ChargesDetails2> getLogisticsCharge() {
		return logisticsCharge;
	}

	public void setLogisticsCharge(List<com.tools20022.repository.msg.ChargesDetails2> logisticsCharge) {
		this.logisticsCharge = logisticsCharge;
	}

	public List<LineItemTax1> getTax() {
		return tax;
	}

	public void setTax(List<com.tools20022.repository.msg.LineItemTax1> tax) {
		this.tax = tax;
	}

	public List<LineItemAllowanceCharge1> getAllowanceCharge() {
		return allowanceCharge;
	}

	public void setAllowanceCharge(List<com.tools20022.repository.msg.LineItemAllowanceCharge1> allowanceCharge) {
		this.allowanceCharge = allowanceCharge;
	}

	public List<Adjustment4> getFinancialAdjustment() {
		return financialAdjustment;
	}

	public void setFinancialAdjustment(List<com.tools20022.repository.msg.Adjustment4> financialAdjustment) {
		this.financialAdjustment = financialAdjustment;
	}

	public Quantity3 getBilledQuantity() {
		return billedQuantity;
	}

	public void setBilledQuantity(com.tools20022.repository.msg.Quantity3 billedQuantity) {
		this.billedQuantity = billedQuantity;
	}

	public DecimalNumber getPackageQuantity() {
		return packageQuantity;
	}

	public void setPackageQuantity(DecimalNumber packageQuantity) {
		this.packageQuantity = packageQuantity;
	}

	public Quantity3 getPerPackageUnitQuantity() {
		return perPackageUnitQuantity;
	}

	public void setPerPackageUnitQuantity(com.tools20022.repository.msg.Quantity3 perPackageUnitQuantity) {
		this.perPackageUnitQuantity = perPackageUnitQuantity;
	}

	public List<Packaging1> getPackaging() {
		return packaging;
	}

	public void setPackaging(List<com.tools20022.repository.msg.Packaging1> packaging) {
		this.packaging = packaging;
	}

	public Quantity3 getChargeFreeQuantity() {
		return chargeFreeQuantity;
	}

	public void setChargeFreeQuantity(com.tools20022.repository.msg.Quantity3 chargeFreeQuantity) {
		this.chargeFreeQuantity = chargeFreeQuantity;
	}

	public Quantity3 getMeasureQuantityStart() {
		return measureQuantityStart;
	}

	public void setMeasureQuantityStart(com.tools20022.repository.msg.Quantity3 measureQuantityStart) {
		this.measureQuantityStart = measureQuantityStart;
	}

	public Quantity3 getMeasureQuantityEnd() {
		return measureQuantityEnd;
	}

	public void setMeasureQuantityEnd(com.tools20022.repository.msg.Quantity3 measureQuantityEnd) {
		this.measureQuantityEnd = measureQuantityEnd;
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

	public TradeParty1 getShipTo() {
		return shipTo;
	}

	public void setShipTo(com.tools20022.repository.msg.TradeParty1 shipTo) {
		this.shipTo = shipTo;
	}

	public Incoterms3 getIncoterms() {
		return incoterms;
	}

	public void setIncoterms(com.tools20022.repository.msg.Incoterms3 incoterms) {
		this.incoterms = incoterms;
	}

	public ISODateTime getDeliveryDateTime() {
		return deliveryDateTime;
	}

	public void setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}

	public DocumentIdentification22 getDeliveryNoteIdentification() {
		return deliveryNoteIdentification;
	}

	public void setDeliveryNoteIdentification(com.tools20022.repository.msg.DocumentIdentification22 deliveryNoteIdentification) {
		this.deliveryNoteIdentification = deliveryNoteIdentification;
	}

	public LineItemMonetarySummation1 getMonetarySummation() {
		return monetarySummation;
	}

	public void setMonetarySummation(com.tools20022.repository.msg.LineItemMonetarySummation1 monetarySummation) {
		this.monetarySummation = monetarySummation;
	}

	public List<AdditionalInformation1> getIncludedNote() {
		return includedNote;
	}

	public void setIncludedNote(List<com.tools20022.repository.msg.AdditionalInformation1> includedNote) {
		this.includedNote = includedNote;
	}
}