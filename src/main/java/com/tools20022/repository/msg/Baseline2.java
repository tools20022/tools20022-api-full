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
import com.tools20022.repository.codeset.TradeFinanceService2Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the commercial details of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline2#mmSubmitterBaselineIdentification
 * Baseline2.mmSubmitterBaselineIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmServiceCode
 * Baseline2.mmServiceCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Baseline2#mmPurchaseOrderReference
 * Baseline2.mmPurchaseOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmBuyer
 * Baseline2.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmSeller
 * Baseline2.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmBuyerBank
 * Baseline2.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmSellerBank
 * Baseline2.mmSellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmBillTo
 * Baseline2.mmBillTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmShipTo
 * Baseline2.mmShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmConsignee
 * Baseline2.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmGoods
 * Baseline2.mmGoods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmPaymentTerms
 * Baseline2.mmPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmSettlementTerms
 * Baseline2.mmSettlementTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmDataSetRequired
 * Baseline2.mmDataSetRequired}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Baseline2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the commercial details of the underlying transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Baseline2", propOrder = {"submitterBaselineIdentification", "serviceCode", "purchaseOrderReference", "buyer", "seller", "buyerBank", "sellerBank", "billTo", "shipTo", "consignee", "goods", "paymentTerms",
		"settlementTerms", "dataSetRequired"})
public class Baseline2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification1 submitterBaselineIdentification;
	/**
	 * Identifies the baseline provided by the submitter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the baseline provided by the submitter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitterBaselineIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "SubmitrBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterBaselineIdentification";
			definition = "Identifies the baseline provided by the submitter.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification1.mmObject();
		}
	};
	protected TradeFinanceService2Code serviceCode;
	/**
	 * Identifies the service requested by the submitter by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceService2Code
	 * TradeFinanceService2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the service requested by the submitter by means of a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "SvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCode";
			definition = "Identifies the service requested by the submitter by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeFinanceService2Code.mmObject();
		}
	};
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * Reference to the purchase order of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the purchase order of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseOrderReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected PartyIdentification9 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	protected PartyIdentification9 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	protected BICIdentification1 buyerBank;
	/**
	 * Financial institution of the buyer, uniquely identified by its BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of the buyer, uniquely identified by its BIC."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "Financial institution of the buyer, uniquely identified by its BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected BICIdentification1 sellerBank;
	/**
	 * Financial institution of the seller, uniquely identified by its BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of the seller, uniquely identified by its BIC."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerBank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "Financial institution of the seller, uniquely identified by its BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected PartyIdentification9 billTo;
	/**
	 * Party to be invoiced for the purchase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to be invoiced for the purchase."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "BllTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillTo";
			definition = "Party to be invoiced for the purchase.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	protected PartyIdentification9 shipTo;
	/**
	 * Party to whom the goods must be delivered in the end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	protected PartyIdentification9 consignee;
	/**
	 * Party to whom the goods must be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods must be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	protected LineItem5 goods;
	/**
	 * Goods or services that are part of a commercial trade agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem5 LineItem5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Goods or services that are part of a commercial trade agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGoods = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CommercialTrade.mmObject();
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "Goods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Goods";
			definition = "Goods or services that are part of a commercial trade agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTerms1> paymentTerms;
	/**
	 * Specifies the payment terms by means of a code and a limit in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms1
	 * PaymentTerms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment terms by means of a code and a limit in time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms by means of a code and a limit in time.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms1.mmObject();
		}
	};
	protected SettlementTerms1 settlementTerms;
	/**
	 * Specifies how the underlying transaction should be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms1
	 * SettlementTerms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the underlying transaction should be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies how the underlying transaction should be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms1.mmObject();
		}
	};
	protected RequiredSubmission1 dataSetRequired;
	/**
	 * Specifies the type of data set required in order to complete the
	 * transaction, as per the underlying commercial agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequiredSubmission1
	 * RequiredSubmission1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Baseline2
	 * Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of data set required in order to complete the transaction, as per the underlying commercial agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetRequired = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Baseline2.mmObject();
			isDerived = false;
			xmlTag = "DataSetReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetRequired";
			definition = "Specifies the type of data set required in order to complete the transaction, as per the underlying commercial agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequiredSubmission1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Baseline2.mmSubmitterBaselineIdentification, Baseline2.mmServiceCode, Baseline2.mmPurchaseOrderReference, Baseline2.mmBuyer, Baseline2.mmSeller, Baseline2.mmBuyerBank,
						Baseline2.mmSellerBank, Baseline2.mmBillTo, Baseline2.mmShipTo, Baseline2.mmConsignee, Baseline2.mmGoods, Baseline2.mmPaymentTerms, Baseline2.mmSettlementTerms, Baseline2.mmDataSetRequired);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Baseline2";
				definition = "Specifies the commercial details of the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SubmitrBaselnId", required = true)
	public DocumentIdentification1 getSubmitterBaselineIdentification() {
		return submitterBaselineIdentification;
	}

	public void setSubmitterBaselineIdentification(com.tools20022.repository.msg.DocumentIdentification1 submitterBaselineIdentification) {
		this.submitterBaselineIdentification = submitterBaselineIdentification;
	}

	@XmlElement(name = "SvcCd", required = true)
	public TradeFinanceService2Code getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(TradeFinanceService2Code serviceCode) {
		this.serviceCode = serviceCode;
	}

	@XmlElement(name = "PurchsOrdrRef", required = true)
	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	@XmlElement(name = "Buyr", required = true)
	public PartyIdentification9 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.PartyIdentification9 buyer) {
		this.buyer = buyer;
	}

	@XmlElement(name = "Sellr", required = true)
	public PartyIdentification9 getSeller() {
		return seller;
	}

	public void setSeller(com.tools20022.repository.msg.PartyIdentification9 seller) {
		this.seller = seller;
	}

	@XmlElement(name = "BuyrBk", required = true)
	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public void setBuyerBank(com.tools20022.repository.msg.BICIdentification1 buyerBank) {
		this.buyerBank = buyerBank;
	}

	@XmlElement(name = "SellrBk", required = true)
	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public void setSellerBank(com.tools20022.repository.msg.BICIdentification1 sellerBank) {
		this.sellerBank = sellerBank;
	}

	@XmlElement(name = "BllTo")
	public PartyIdentification9 getBillTo() {
		return billTo;
	}

	public void setBillTo(com.tools20022.repository.msg.PartyIdentification9 billTo) {
		this.billTo = billTo;
	}

	@XmlElement(name = "ShipTo")
	public PartyIdentification9 getShipTo() {
		return shipTo;
	}

	public void setShipTo(com.tools20022.repository.msg.PartyIdentification9 shipTo) {
		this.shipTo = shipTo;
	}

	@XmlElement(name = "Consgn")
	public PartyIdentification9 getConsignee() {
		return consignee;
	}

	public void setConsignee(com.tools20022.repository.msg.PartyIdentification9 consignee) {
		this.consignee = consignee;
	}

	@XmlElement(name = "Goods", required = true)
	public LineItem5 getGoods() {
		return goods;
	}

	public void setGoods(com.tools20022.repository.msg.LineItem5 goods) {
		this.goods = goods;
	}

	@XmlElement(name = "PmtTerms", required = true)
	public List<PaymentTerms1> getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(List<com.tools20022.repository.msg.PaymentTerms1> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	@XmlElement(name = "SttlmTerms")
	public SettlementTerms1 getSettlementTerms() {
		return settlementTerms;
	}

	public void setSettlementTerms(com.tools20022.repository.msg.SettlementTerms1 settlementTerms) {
		this.settlementTerms = settlementTerms;
	}

	@XmlElement(name = "DataSetReqrd")
	public RequiredSubmission1 getDataSetRequired() {
		return dataSetRequired;
	}

	public void setDataSetRequired(com.tools20022.repository.msg.RequiredSubmission1 dataSetRequired) {
		this.dataSetRequired = dataSetRequired;
	}
}