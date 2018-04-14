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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem16 LineItem16}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem10", propOrder = {"identification", "tradeProduct", "buyerOrderIdentification", "contractIdentification", "purchaseAccountingAccount", "netPrice", "netPriceQuantity", "netPriceAllowanceCharge", "netWeight",
		"grossPrice", "grossPriceQuantity", "grossWeight", "logisticsCharge", "tax", "allowanceCharge", "financialAdjustment", "billedQuantity", "packageQuantity", "perPackageUnitQuantity", "packaging", "chargeFreeQuantity",
		"measureQuantityStart", "measureQuantityEnd", "measureDateTimeStart", "measureDateTimeEnd", "shipTo", "incoterms", "deliveryDateTime", "deliveryNoteIdentification", "monetarySummation", "includedNote"})
public class LineItem10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The unique identification of this invoice line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<LineItem10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
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

		@Override
		public Optional<Max35Text> getValue(LineItem10 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradPdct")
	protected TradeProduct1 tradeProduct;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Something that is produced and sold as the result of an industrial process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTradeProduct
	 * LineItem16.mmTradeProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem10, Optional<TradeProduct1>> mmTradeProduct = new MMMessageAssociationEnd<LineItem10, Optional<TradeProduct1>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmInvoicedProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "TradPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeProduct";
			definition = "Something that is produced and sold as the result of an industrial process.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmTradeProduct);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeProduct1.mmObject();
		}

		@Override
		public Optional<TradeProduct1> getValue(LineItem10 obj) {
			return obj.getTradeProduct();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<TradeProduct1> value) {
			obj.setTradeProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyrOrdrId")
	protected DocumentIdentification23 buyerOrderIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase order reference assigned by the buyer related to the provision of products and/or services for this line item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<DocumentIdentification23>> mmBuyerOrderIdentification = new MMMessageAttribute<LineItem10, Optional<DocumentIdentification23>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "BuyrOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerOrderIdentification";
			definition = "Purchase order reference assigned by the buyer related to the provision of products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmBuyerOrderIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification23.mmObject();
		}

		@Override
		public Optional<DocumentIdentification23> getValue(LineItem10 obj) {
			return obj.getBuyerOrderIdentification();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<DocumentIdentification23> value) {
			obj.setBuyerOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctId")
	protected DocumentIdentification22 contractIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract reference related to the provision of products and/or services for this line item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<DocumentIdentification22>> mmContractIdentification = new MMMessageAttribute<LineItem10, Optional<DocumentIdentification22>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Contract reference related to the provision of products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmContractIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(LineItem10 obj) {
			return obj.getContractIdentification();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<DocumentIdentification22> value) {
			obj.setContractIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PurchsAcctgAcct")
	protected List<AccountingAccount1> purchaseAccountingAccount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccountingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAssociationEnd<LineItem10, List<AccountingAccount1>> mmPurchaseAccountingAccount = new MMMessageAssociationEnd<LineItem10, List<AccountingAccount1>>() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPurchaseAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "PurchsAcctgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseAccountingAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPurchaseAccountingAccount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingAccount1.mmObject();
		}

		@Override
		public List<AccountingAccount1> getValue(LineItem10 obj) {
			return obj.getPurchaseAccountingAccount();
		}

		@Override
		public void setValue(LineItem10 obj, List<AccountingAccount1> value) {
			obj.setPurchaseAccountingAccount(value);
		}
	};
	@XmlElement(name = "NetPric")
	protected List<CurrencyAndAmount> netPrice;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetPrice
	 * LineItem16.mmNetPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, List<CurrencyAndAmount>> mmNetPrice = new MMMessageAttribute<LineItem10, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Product.mmNetPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPrice";
			definition = "Value of the price, eg, as a currency and value.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPrice);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItem10 obj) {
			return obj.getNetPrice();
		}

		@Override
		public void setValue(LineItem10 obj, List<CurrencyAndAmount> value) {
			obj.setNetPrice(value);
		}
	};
	@XmlElement(name = "NetPricQty")
	protected Quantity4 netPriceQuantity;
	/**
	 * 
	 <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity4>> mmNetPriceQuantity = new MMMessageAttribute<LineItem10, Optional<Quantity4>>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPricQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPriceQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity4.mmObject();
		}

		@Override
		public Optional<Quantity4> getValue(LineItem10 obj) {
			return obj.getNetPriceQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity4> value) {
			obj.setNetPriceQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NetPricAllwncChrg")
	protected List<LineItemAllowanceCharge1> netPriceAllowanceCharge;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceAllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge applied to the net price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, List<LineItemAllowanceCharge1>> mmNetPriceAllowanceCharge = new MMMessageAttribute<LineItem10, List<LineItemAllowanceCharge1>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetPricAllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPriceAllowanceCharge";
			definition = "Allowance or charge applied to the net price.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetPriceAllowanceCharge);
			minOccurs = 0;
			complexType_lazy = () -> LineItemAllowanceCharge1.mmObject();
		}

		@Override
		public List<LineItemAllowanceCharge1> getValue(LineItem10 obj) {
			return obj.getNetPriceAllowanceCharge();
		}

		@Override
		public void setValue(LineItem10 obj, List<LineItemAllowanceCharge1> value) {
			obj.setNetPriceAllowanceCharge(value);
		}
	};
	@XmlElement(name = "NetWght")
	protected Quantity3 netWeight;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net weight of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetWeight
	 * LineItem16.mmNetWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmNetWeight = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmNetWeight;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "NetWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmNetWeight);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getNetWeight();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setNetWeight(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssPric")
	protected List<CurrencyAndAmount> grossPrice;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross price of the product and/or service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPrice
	 * LineItem16.mmGrossPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, List<CurrencyAndAmount>> mmGrossPrice = new MMMessageAttribute<LineItem10, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Product.mmGrossPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossPrice);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItem10 obj) {
			return obj.getGrossPrice();
		}

		@Override
		public void setValue(LineItem10 obj, List<CurrencyAndAmount> value) {
			obj.setGrossPrice(value);
		}
	};
	@XmlElement(name = "GrssPricQty")
	protected Quantity4 grossPriceQuantity;
	/**
	 * 
	 <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity4>> mmGrossPriceQuantity = new MMMessageAttribute<LineItem10, Optional<Quantity4>>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssPricQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossPriceQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity4.mmObject();
		}

		@Override
		public Optional<Quantity4> getValue(LineItem10 obj) {
			return obj.getGrossPriceQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity4> value) {
			obj.setGrossPriceQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssWght")
	protected Quantity3 grossWeight;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross weight of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossWeight
	 * LineItem16.mmGrossWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmGrossWeight = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "GrssWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmGrossWeight);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getGrossWeight();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setGrossWeight(value.orElse(null));
		}
	};
	@XmlElement(name = "LogstcsChrg")
	protected List<ChargesDetails2> logisticsCharge;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, List<ChargesDetails2>> mmLogisticsCharge = new MMMessageAttribute<LineItem10, List<ChargesDetails2>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmLogisticsCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "LogstcsChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmLogisticsCharge);
			minOccurs = 0;
			complexType_lazy = () -> ChargesDetails2.mmObject();
		}

		@Override
		public List<ChargesDetails2> getValue(LineItem10 obj) {
			return obj.getLogisticsCharge();
		}

		@Override
		public void setValue(LineItem10 obj, List<ChargesDetails2> value) {
			obj.setLogisticsCharge(value);
		}
	};
	@XmlElement(name = "Tax")
	protected List<LineItemTax1> tax;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTax
	 * LineItem16.mmTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem10, List<LineItemTax1>> mmTax = new MMMessageAssociationEnd<LineItem10, List<LineItemTax1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmTax);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LineItemTax1.mmObject();
		}

		@Override
		public List<LineItemTax1> getValue(LineItem10 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(LineItem10 obj, List<LineItemTax1> value) {
			obj.setTax(value);
		}
	};
	@XmlElement(name = "AllwncChrg")
	protected List<LineItemAllowanceCharge1> allowanceCharge;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge specified for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAssociationEnd<LineItem10, List<LineItemAllowanceCharge1>> mmAllowanceCharge = new MMMessageAssociationEnd<LineItem10, List<LineItemAllowanceCharge1>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "AllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceCharge";
			definition = "Allowance or charge specified for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmAllowanceCharge);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LineItemAllowanceCharge1.mmObject();
		}

		@Override
		public List<LineItemAllowanceCharge1> getValue(LineItem10 obj) {
			return obj.getAllowanceCharge();
		}

		@Override
		public void setValue(LineItem10 obj, List<LineItemAllowanceCharge1> value) {
			obj.setAllowanceCharge(value);
		}
	};
	@XmlElement(name = "FinAdjstmnt")
	protected List<Adjustment4> financialAdjustment;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification on the value of goods and / or services. For example: rebate, discount, surcharge."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, List<Adjustment4>> mmFinancialAdjustment = new MMMessageAttribute<LineItem10, List<Adjustment4>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "FinAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services. For example: rebate, discount, surcharge.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmFinancialAdjustment);
			minOccurs = 0;
			complexType_lazy = () -> Adjustment4.mmObject();
		}

		@Override
		public List<Adjustment4> getValue(LineItem10 obj) {
			return obj.getFinancialAdjustment();
		}

		@Override
		public void setValue(LineItem10 obj, List<Adjustment4> value) {
			obj.setFinancialAdjustment(value);
		}
	};
	@XmlElement(name = "BlldQty")
	protected Quantity3 billedQuantity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity billed for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmBilledQuantity = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmBilledQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "BlldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmBilledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getBilledQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setBilledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "PackgQty")
	protected DecimalNumber packageQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
	 * Packaging.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PackgQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of product packages delivered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<DecimalNumber>> mmPackageQuantity = new MMMessageAttribute<LineItem10, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
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

		@Override
		public Optional<DecimalNumber> getValue(LineItem10 obj) {
			return obj.getPackageQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<DecimalNumber> value) {
			obj.setPackageQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "PerPackgUnitQty")
	protected Quantity3 perPackageUnitQuantity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerPackageUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units per package in this line item for a supply chain trade delivery."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmPerPackageUnitQuantity = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmPerPackageUnitQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "PerPackgUnitQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerPackageUnitQuantity";
			definition = "Number of units per package in this line item for a supply chain trade delivery.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPerPackageUnitQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getPerPackageUnitQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setPerPackageUnitQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "Packgng")
	protected List<Packaging1> packaging;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmPackaging
	 * LineItem16.mmPackaging}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem10, List<Packaging1>> mmPackaging = new MMMessageAssociationEnd<LineItem10, List<Packaging1>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPackaging;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Packgng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmPackaging);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Packaging1.mmObject();
		}

		@Override
		public List<Packaging1> getValue(LineItem10 obj) {
			return obj.getPackaging();
		}

		@Override
		public void setValue(LineItem10 obj, List<Packaging1> value) {
			obj.setPackaging(value);
		}
	};
	@XmlElement(name = "ChrgFreeQty")
	protected Quantity3 chargeFreeQuantity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity that is free of charge for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmChargeFreeQuantity = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmChargeFreeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "ChrgFreeQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmChargeFreeQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getChargeFreeQuantity();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setChargeFreeQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MeasrQtyStart")
	protected Quantity3 measureQuantityStart;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmMeasureQuantityStart = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmMeasureQuantityStart;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrQtyStart";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureQuantityStart);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getMeasureQuantityStart();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setMeasureQuantityStart(value.orElse(null));
		}
	};
	@XmlElement(name = "MeasrQtyEnd")
	protected Quantity3 measureQuantityEnd;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<Quantity3>> mmMeasureQuantityEnd = new MMMessageAttribute<LineItem10, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmMeasureQuantityEnd;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MeasrQtyEnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMeasureQuantityEnd);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(LineItem10 obj) {
			return obj.getMeasureQuantityEnd();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Quantity3> value) {
			obj.setMeasureQuantityEnd(value.orElse(null));
		}
	};
	@XmlElement(name = "MeasrDtTmStart")
	protected ISODateTime measureDateTimeStart;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure started for a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<ISODateTime>> mmMeasureDateTimeStart = new MMMessageAttribute<LineItem10, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmMeasureDateTimeStart;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
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

		@Override
		public Optional<ISODateTime> getValue(LineItem10 obj) {
			return obj.getMeasureDateTimeStart();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<ISODateTime> value) {
			obj.setMeasureDateTimeStart(value.orElse(null));
		}
	};
	@XmlElement(name = "MeasrDtTmEnd")
	protected ISODateTime measureDateTimeEnd;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureDateTimeEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the clock time measure ended for a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<ISODateTime>> mmMeasureDateTimeEnd = new MMMessageAttribute<LineItem10, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmMeasureDateTimeEnd;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
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

		@Override
		public Optional<ISODateTime> getValue(LineItem10 obj) {
			return obj.getMeasureDateTimeEnd();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<ISODateTime> value) {
			obj.setMeasureDateTimeEnd(value.orElse(null));
		}
	};
	@XmlElement(name = "ShipTo")
	protected TradeParty1 shipTo;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered in the end."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmShipTo
	 * LineItem16.mmShipTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem10, Optional<TradeParty1>> mmShipTo = new MMMessageAssociationEnd<LineItem10, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmShipTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(LineItem10 obj) {
			return obj.getShipTo();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<TradeParty1> value) {
			obj.setShipTo(value.orElse(null));
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms3 incoterms;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmIncoterms
	 * LineItem16.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, Optional<Incoterms3>> mmIncoterms = new MMMessageAttribute<LineItem10, Optional<Incoterms3>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmIncoterms);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Incoterms3.mmObject();
		}

		@Override
		public Optional<Incoterms3> getValue(LineItem10 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<Incoterms3> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryDtTm")
	protected ISODateTime deliveryDateTime;
	/**
	 * 
	 <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<ISODateTime>> mmDeliveryDateTime = new MMMessageAttribute<LineItem10, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmArrivalDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
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

		@Override
		public Optional<ISODateTime> getValue(LineItem10 obj) {
			return obj.getDeliveryDateTime();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<ISODateTime> value) {
			obj.setDeliveryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryNoteId")
	protected DocumentIdentification22 deliveryNoteIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryNoteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery note related to the delivery of the products and/or services for this line item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<LineItem10, Optional<DocumentIdentification22>> mmDeliveryNoteIdentification = new MMMessageAttribute<LineItem10, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "DlvryNoteId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryNoteIdentification";
			definition = "Delivery note related to the delivery of the products and/or services for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmDeliveryNoteIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(LineItem10 obj) {
			return obj.getDeliveryNoteIdentification();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<DocumentIdentification22> value) {
			obj.setDeliveryNoteIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MntrySummtn")
	protected LineItemMonetarySummation1 monetarySummation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetarySummation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monetary totals for this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAssociationEnd<LineItem10, Optional<LineItemMonetarySummation1>> mmMonetarySummation = new MMMessageAssociationEnd<LineItem10, Optional<LineItemMonetarySummation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "MntrySummtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetarySummation";
			definition = "Monetary totals for this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmMonetarySummation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LineItemMonetarySummation1.mmObject();
		}

		@Override
		public Optional<LineItemMonetarySummation1> getValue(LineItem10 obj) {
			return obj.getMonetarySummation();
		}

		@Override
		public void setValue(LineItem10 obj, Optional<LineItemMonetarySummation1> value) {
			obj.setMonetarySummation(value.orElse(null));
		}
	};
	@XmlElement(name = "InclNote")
	protected List<AdditionalInformation1> includedNote;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Note included in this line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmIncludedNote
	 * LineItem16.mmIncludedNote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem10, List<AdditionalInformation1>> mmIncludedNote = new MMMessageAttribute<LineItem10, List<AdditionalInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
			isDerived = false;
			xmlTag = "InclNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedNote";
			definition = "Note included in this line item.";
			nextVersions_lazy = () -> Arrays.asList(LineItem16.mmIncludedNote);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation1.mmObject();
		}

		@Override
		public List<AdditionalInformation1> getValue(LineItem10 obj) {
			return obj.getIncludedNote();
		}

		@Override
		public void setValue(LineItem10 obj, List<AdditionalInformation1> value) {
			obj.setIncludedNote(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmIdentification, com.tools20022.repository.msg.LineItem10.mmTradeProduct,
						com.tools20022.repository.msg.LineItem10.mmBuyerOrderIdentification, com.tools20022.repository.msg.LineItem10.mmContractIdentification, com.tools20022.repository.msg.LineItem10.mmPurchaseAccountingAccount,
						com.tools20022.repository.msg.LineItem10.mmNetPrice, com.tools20022.repository.msg.LineItem10.mmNetPriceQuantity, com.tools20022.repository.msg.LineItem10.mmNetPriceAllowanceCharge,
						com.tools20022.repository.msg.LineItem10.mmNetWeight, com.tools20022.repository.msg.LineItem10.mmGrossPrice, com.tools20022.repository.msg.LineItem10.mmGrossPriceQuantity,
						com.tools20022.repository.msg.LineItem10.mmGrossWeight, com.tools20022.repository.msg.LineItem10.mmLogisticsCharge, com.tools20022.repository.msg.LineItem10.mmTax,
						com.tools20022.repository.msg.LineItem10.mmAllowanceCharge, com.tools20022.repository.msg.LineItem10.mmFinancialAdjustment, com.tools20022.repository.msg.LineItem10.mmBilledQuantity,
						com.tools20022.repository.msg.LineItem10.mmPackageQuantity, com.tools20022.repository.msg.LineItem10.mmPerPackageUnitQuantity, com.tools20022.repository.msg.LineItem10.mmPackaging,
						com.tools20022.repository.msg.LineItem10.mmChargeFreeQuantity, com.tools20022.repository.msg.LineItem10.mmMeasureQuantityStart, com.tools20022.repository.msg.LineItem10.mmMeasureQuantityEnd,
						com.tools20022.repository.msg.LineItem10.mmMeasureDateTimeStart, com.tools20022.repository.msg.LineItem10.mmMeasureDateTimeEnd, com.tools20022.repository.msg.LineItem10.mmShipTo,
						com.tools20022.repository.msg.LineItem10.mmIncoterms, com.tools20022.repository.msg.LineItem10.mmDeliveryDateTime, com.tools20022.repository.msg.LineItem10.mmDeliveryNoteIdentification,
						com.tools20022.repository.msg.LineItem10.mmMonetarySummation, com.tools20022.repository.msg.LineItem10.mmIncludedNote);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmLineItem);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem10";
				definition = "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items.";
				nextVersions_lazy = () -> Arrays.asList(LineItem16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public LineItem10 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Optional<TradeProduct1> getTradeProduct() {
		return tradeProduct == null ? Optional.empty() : Optional.of(tradeProduct);
	}

	public LineItem10 setTradeProduct(TradeProduct1 tradeProduct) {
		this.tradeProduct = tradeProduct;
		return this;
	}

	public Optional<DocumentIdentification23> getBuyerOrderIdentification() {
		return buyerOrderIdentification == null ? Optional.empty() : Optional.of(buyerOrderIdentification);
	}

	public LineItem10 setBuyerOrderIdentification(DocumentIdentification23 buyerOrderIdentification) {
		this.buyerOrderIdentification = buyerOrderIdentification;
		return this;
	}

	public Optional<DocumentIdentification22> getContractIdentification() {
		return contractIdentification == null ? Optional.empty() : Optional.of(contractIdentification);
	}

	public LineItem10 setContractIdentification(DocumentIdentification22 contractIdentification) {
		this.contractIdentification = contractIdentification;
		return this;
	}

	public List<AccountingAccount1> getPurchaseAccountingAccount() {
		return purchaseAccountingAccount == null ? purchaseAccountingAccount = new ArrayList<>() : purchaseAccountingAccount;
	}

	public LineItem10 setPurchaseAccountingAccount(List<AccountingAccount1> purchaseAccountingAccount) {
		this.purchaseAccountingAccount = Objects.requireNonNull(purchaseAccountingAccount);
		return this;
	}

	public List<CurrencyAndAmount> getNetPrice() {
		return netPrice == null ? netPrice = new ArrayList<>() : netPrice;
	}

	public LineItem10 setNetPrice(List<CurrencyAndAmount> netPrice) {
		this.netPrice = Objects.requireNonNull(netPrice);
		return this;
	}

	public Optional<Quantity4> getNetPriceQuantity() {
		return netPriceQuantity == null ? Optional.empty() : Optional.of(netPriceQuantity);
	}

	public LineItem10 setNetPriceQuantity(Quantity4 netPriceQuantity) {
		this.netPriceQuantity = netPriceQuantity;
		return this;
	}

	public List<LineItemAllowanceCharge1> getNetPriceAllowanceCharge() {
		return netPriceAllowanceCharge == null ? netPriceAllowanceCharge = new ArrayList<>() : netPriceAllowanceCharge;
	}

	public LineItem10 setNetPriceAllowanceCharge(List<LineItemAllowanceCharge1> netPriceAllowanceCharge) {
		this.netPriceAllowanceCharge = Objects.requireNonNull(netPriceAllowanceCharge);
		return this;
	}

	public Optional<Quantity3> getNetWeight() {
		return netWeight == null ? Optional.empty() : Optional.of(netWeight);
	}

	public LineItem10 setNetWeight(Quantity3 netWeight) {
		this.netWeight = netWeight;
		return this;
	}

	public List<CurrencyAndAmount> getGrossPrice() {
		return grossPrice == null ? grossPrice = new ArrayList<>() : grossPrice;
	}

	public LineItem10 setGrossPrice(List<CurrencyAndAmount> grossPrice) {
		this.grossPrice = Objects.requireNonNull(grossPrice);
		return this;
	}

	public Optional<Quantity4> getGrossPriceQuantity() {
		return grossPriceQuantity == null ? Optional.empty() : Optional.of(grossPriceQuantity);
	}

	public LineItem10 setGrossPriceQuantity(Quantity4 grossPriceQuantity) {
		this.grossPriceQuantity = grossPriceQuantity;
		return this;
	}

	public Optional<Quantity3> getGrossWeight() {
		return grossWeight == null ? Optional.empty() : Optional.of(grossWeight);
	}

	public LineItem10 setGrossWeight(Quantity3 grossWeight) {
		this.grossWeight = grossWeight;
		return this;
	}

	public List<ChargesDetails2> getLogisticsCharge() {
		return logisticsCharge == null ? logisticsCharge = new ArrayList<>() : logisticsCharge;
	}

	public LineItem10 setLogisticsCharge(List<ChargesDetails2> logisticsCharge) {
		this.logisticsCharge = Objects.requireNonNull(logisticsCharge);
		return this;
	}

	public List<LineItemTax1> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItem10 setTax(List<LineItemTax1> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public List<LineItemAllowanceCharge1> getAllowanceCharge() {
		return allowanceCharge == null ? allowanceCharge = new ArrayList<>() : allowanceCharge;
	}

	public LineItem10 setAllowanceCharge(List<LineItemAllowanceCharge1> allowanceCharge) {
		this.allowanceCharge = Objects.requireNonNull(allowanceCharge);
		return this;
	}

	public List<Adjustment4> getFinancialAdjustment() {
		return financialAdjustment == null ? financialAdjustment = new ArrayList<>() : financialAdjustment;
	}

	public LineItem10 setFinancialAdjustment(List<Adjustment4> financialAdjustment) {
		this.financialAdjustment = Objects.requireNonNull(financialAdjustment);
		return this;
	}

	public Optional<Quantity3> getBilledQuantity() {
		return billedQuantity == null ? Optional.empty() : Optional.of(billedQuantity);
	}

	public LineItem10 setBilledQuantity(Quantity3 billedQuantity) {
		this.billedQuantity = billedQuantity;
		return this;
	}

	public Optional<DecimalNumber> getPackageQuantity() {
		return packageQuantity == null ? Optional.empty() : Optional.of(packageQuantity);
	}

	public LineItem10 setPackageQuantity(DecimalNumber packageQuantity) {
		this.packageQuantity = packageQuantity;
		return this;
	}

	public Optional<Quantity3> getPerPackageUnitQuantity() {
		return perPackageUnitQuantity == null ? Optional.empty() : Optional.of(perPackageUnitQuantity);
	}

	public LineItem10 setPerPackageUnitQuantity(Quantity3 perPackageUnitQuantity) {
		this.perPackageUnitQuantity = perPackageUnitQuantity;
		return this;
	}

	public List<Packaging1> getPackaging() {
		return packaging == null ? packaging = new ArrayList<>() : packaging;
	}

	public LineItem10 setPackaging(List<Packaging1> packaging) {
		this.packaging = Objects.requireNonNull(packaging);
		return this;
	}

	public Optional<Quantity3> getChargeFreeQuantity() {
		return chargeFreeQuantity == null ? Optional.empty() : Optional.of(chargeFreeQuantity);
	}

	public LineItem10 setChargeFreeQuantity(Quantity3 chargeFreeQuantity) {
		this.chargeFreeQuantity = chargeFreeQuantity;
		return this;
	}

	public Optional<Quantity3> getMeasureQuantityStart() {
		return measureQuantityStart == null ? Optional.empty() : Optional.of(measureQuantityStart);
	}

	public LineItem10 setMeasureQuantityStart(Quantity3 measureQuantityStart) {
		this.measureQuantityStart = measureQuantityStart;
		return this;
	}

	public Optional<Quantity3> getMeasureQuantityEnd() {
		return measureQuantityEnd == null ? Optional.empty() : Optional.of(measureQuantityEnd);
	}

	public LineItem10 setMeasureQuantityEnd(Quantity3 measureQuantityEnd) {
		this.measureQuantityEnd = measureQuantityEnd;
		return this;
	}

	public Optional<ISODateTime> getMeasureDateTimeStart() {
		return measureDateTimeStart == null ? Optional.empty() : Optional.of(measureDateTimeStart);
	}

	public LineItem10 setMeasureDateTimeStart(ISODateTime measureDateTimeStart) {
		this.measureDateTimeStart = measureDateTimeStart;
		return this;
	}

	public Optional<ISODateTime> getMeasureDateTimeEnd() {
		return measureDateTimeEnd == null ? Optional.empty() : Optional.of(measureDateTimeEnd);
	}

	public LineItem10 setMeasureDateTimeEnd(ISODateTime measureDateTimeEnd) {
		this.measureDateTimeEnd = measureDateTimeEnd;
		return this;
	}

	public Optional<TradeParty1> getShipTo() {
		return shipTo == null ? Optional.empty() : Optional.of(shipTo);
	}

	public LineItem10 setShipTo(TradeParty1 shipTo) {
		this.shipTo = shipTo;
		return this;
	}

	public Optional<Incoterms3> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public LineItem10 setIncoterms(Incoterms3 incoterms) {
		this.incoterms = incoterms;
		return this;
	}

	public Optional<ISODateTime> getDeliveryDateTime() {
		return deliveryDateTime == null ? Optional.empty() : Optional.of(deliveryDateTime);
	}

	public LineItem10 setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
		return this;
	}

	public Optional<DocumentIdentification22> getDeliveryNoteIdentification() {
		return deliveryNoteIdentification == null ? Optional.empty() : Optional.of(deliveryNoteIdentification);
	}

	public LineItem10 setDeliveryNoteIdentification(DocumentIdentification22 deliveryNoteIdentification) {
		this.deliveryNoteIdentification = deliveryNoteIdentification;
		return this;
	}

	public Optional<LineItemMonetarySummation1> getMonetarySummation() {
		return monetarySummation == null ? Optional.empty() : Optional.of(monetarySummation);
	}

	public LineItem10 setMonetarySummation(LineItemMonetarySummation1 monetarySummation) {
		this.monetarySummation = monetarySummation;
		return this;
	}

	public List<AdditionalInformation1> getIncludedNote() {
		return includedNote == null ? includedNote = new ArrayList<>() : includedNote;
	}

	public LineItem10 setIncludedNote(List<AdditionalInformation1> includedNote) {
		this.includedNote = Objects.requireNonNull(includedNote);
		return this;
	}
}