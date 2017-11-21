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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem12#mmPurchaseOrderReference
 * LineItem12.mmPurchaseOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmFinalSubmission
 * LineItem12.mmFinalSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem12#mmCommercialLineItems
 * LineItem12.mmCommercialLineItems}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem12#mmLineItemsTotalAmount
 * LineItem12.mmLineItemsTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmAdjustment
 * LineItem12.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmFreightCharges
 * LineItem12.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmTax
 * LineItem12.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmTotalNetAmount
 * LineItem12.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem12#mmBuyerDefinedInformation
 * LineItem12.mmBuyerDefinedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem12#mmSellerDefinedInformation
 * LineItem12.mmSellerDefinedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmIncoterms
 * LineItem12.mmIncoterms}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.LineItem9
 * LineItem9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LineItem12", propOrder = {"purchaseOrderReference", "finalSubmission", "commercialLineItems", "lineItemsTotalAmount", "adjustment", "freightCharges", "tax", "totalNetAmount", "buyerDefinedInformation",
		"sellerDefinedInformation", "incoterms"})
public class LineItem12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmPurchaseOrderReference
	 * LineItem15.mmPurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmPurchaseOrderReference
	 * LineItem9.mmPurchaseOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseOrderReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmIdentification;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmPurchaseOrderReference);
			previousVersion_lazy = () -> LineItem9.mmPurchaseOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected YesNoIndicator finalSubmission;
	/**
	 * Specifies whether this current invoice is the last submission against the
	 * purchase order referenced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSubmissn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether this current invoice is the last submission against the purchase order referenced."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmFinalSubmission
	 * LineItem15.mmFinalSubmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmFinalSubmission
	 * LineItem9.mmFinalSubmission}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalSubmission = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "FnlSubmissn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSubmission";
			definition = "Specifies whether this current invoice is the last submission against the purchase order referenced.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmFinalSubmission);
			previousVersion_lazy = () -> LineItem9.mmFinalSubmission;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItemDetails11> commercialLineItems;
	/**
	 * Goods which are the subject of the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails11
	 * LineItemDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclLineItms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialLineItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods which are the subject of the invoice."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmCommercialLineItems
	 * LineItem15.mmCommercialLineItems}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmCommercialLineItems
	 * LineItem9.mmCommercialLineItems}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommercialLineItems = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "ComrclLineItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialLineItems";
			definition = "Goods which are the subject of the invoice.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmCommercialLineItems);
			previousVersion_lazy = () -> LineItem9.mmCommercialLineItems;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemDetails11.mmObject();
		}
	};
	protected CurrencyAndAmount lineItemsTotalAmount;
	/**
	 * Specifies the total amount of all line items (incl. their adjustments).
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of all line items (incl. their adjustments)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmLineItemsTotalAmount
	 * LineItem15.mmLineItemsTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmLineItemsTotalAmount
	 * LineItem9.mmLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "LineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemsTotalAmount";
			definition = "Specifies the total amount of all line items (incl. their adjustments).";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmLineItemsTotalAmount);
			previousVersion_lazy = () -> LineItem9.mmLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Adjustment6> adjustment;
	/**
	 * Variance on price for the goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Adjustment6
	 * Adjustment6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmAdjustment
	 * LineItem15.mmAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmAdjustment
	 * LineItem9.mmAdjustment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Variance on price for the goods.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmAdjustment);
			previousVersion_lazy = () -> LineItem9.mmAdjustment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Adjustment6.mmObject();
		}
	};
	protected Charge25 freightCharges;
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge25 Charge25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrghtChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmFreightCharges
	 * LineItem15.mmFreightCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmFreightCharges
	 * LineItem9.mmFreightCharges}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFreightCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmFreightCharges);
			previousVersion_lazy = () -> LineItem9.mmFreightCharges;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge25.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Tax22> tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods in a
	 * trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax22 Tax22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
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
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmTax
	 * LineItem15.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmTax
	 * LineItem9.mmTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmTax);
			previousVersion_lazy = () -> LineItem9.mmTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax22.mmObject();
		}
	};
	protected CurrencyAndAmount totalNetAmount;
	/**
	 * Total net amount of a trade transaction. Total amount resulting from the
	 * gross amount plus freight charges, tax and plus/minus Adjustments.
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmTotalNetAmount
	 * LineItem15.mmTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmTotalNetAmount
	 * LineItem9.mmTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "TtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetAmount";
			definition = "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmTotalNetAmount);
			previousVersion_lazy = () -> LineItem9.mmTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UserDefinedInformation1> buyerDefinedInformation;
	/**
	 * Information important for the users of the message/service, which cannot
	 * be captured in any other message component/element. For example:
	 * Warehouse number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrDfndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmBuyerDefinedInformation
	 * LineItem15.mmBuyerDefinedInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmBuyerDefinedInformation
	 * LineItem9.mmBuyerDefinedInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerDefinedInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "BuyrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmBuyerDefinedInformation);
			previousVersion_lazy = () -> LineItem9.mmBuyerDefinedInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UserDefinedInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UserDefinedInformation1> sellerDefinedInformation;
	/**
	 * Information important for the users of the message/service, which cannot
	 * be captured in any other message component/element. For example:
	 * Warehouse number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrDfndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmSellerDefinedInformation
	 * LineItem15.mmSellerDefinedInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmSellerDefinedInformation
	 * LineItem9.mmSellerDefinedInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerDefinedInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "SellrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmSellerDefinedInformation);
			previousVersion_lazy = () -> LineItem9.mmSellerDefinedInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UserDefinedInformation1.mmObject();
		}
	};
	protected Incoterms4 incoterms;
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms4 Incoterms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem12
	 * LineItem12}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmIncoterms
	 * LineItem15.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmIncoterms
	 * LineItem9.mmIncoterms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncoterms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> LineItem12.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(LineItem15.mmIncoterms);
			previousVersion_lazy = () -> LineItem9.mmIncoterms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Incoterms4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LineItem12.mmPurchaseOrderReference, LineItem12.mmFinalSubmission, LineItem12.mmCommercialLineItems, LineItem12.mmLineItemsTotalAmount, LineItem12.mmAdjustment,
						LineItem12.mmFreightCharges, LineItem12.mmTax, LineItem12.mmTotalNetAmount, LineItem12.mmBuyerDefinedInformation, LineItem12.mmSellerDefinedInformation, LineItem12.mmIncoterms);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem12";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				nextVersions_lazy = () -> Arrays.asList(LineItem15.mmObject());
				previousVersion_lazy = () -> LineItem9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PurchsOrdrRef", required = true)
	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	@XmlElement(name = "FnlSubmissn", required = true)
	public YesNoIndicator getFinalSubmission() {
		return finalSubmission;
	}

	public void setFinalSubmission(YesNoIndicator finalSubmission) {
		this.finalSubmission = finalSubmission;
	}

	@XmlElement(name = "ComrclLineItms", required = true)
	public List<LineItemDetails11> getCommercialLineItems() {
		return commercialLineItems;
	}

	public void setCommercialLineItems(List<com.tools20022.repository.msg.LineItemDetails11> commercialLineItems) {
		this.commercialLineItems = commercialLineItems;
	}

	@XmlElement(name = "LineItmsTtlAmt", required = true)
	public CurrencyAndAmount getLineItemsTotalAmount() {
		return lineItemsTotalAmount;
	}

	public void setLineItemsTotalAmount(CurrencyAndAmount lineItemsTotalAmount) {
		this.lineItemsTotalAmount = lineItemsTotalAmount;
	}

	@XmlElement(name = "Adjstmnt")
	public List<Adjustment6> getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(List<com.tools20022.repository.msg.Adjustment6> adjustment) {
		this.adjustment = adjustment;
	}

	@XmlElement(name = "FrghtChrgs")
	public Charge25 getFreightCharges() {
		return freightCharges;
	}

	public void setFreightCharges(com.tools20022.repository.msg.Charge25 freightCharges) {
		this.freightCharges = freightCharges;
	}

	@XmlElement(name = "Tax")
	public List<Tax22> getTax() {
		return tax;
	}

	public void setTax(List<com.tools20022.repository.msg.Tax22> tax) {
		this.tax = tax;
	}

	@XmlElement(name = "TtlNetAmt", required = true)
	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public void setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = totalNetAmount;
	}

	@XmlElement(name = "BuyrDfndInf")
	public List<UserDefinedInformation1> getBuyerDefinedInformation() {
		return buyerDefinedInformation;
	}

	public void setBuyerDefinedInformation(List<com.tools20022.repository.msg.UserDefinedInformation1> buyerDefinedInformation) {
		this.buyerDefinedInformation = buyerDefinedInformation;
	}

	@XmlElement(name = "SellrDfndInf")
	public List<UserDefinedInformation1> getSellerDefinedInformation() {
		return sellerDefinedInformation;
	}

	public void setSellerDefinedInformation(List<com.tools20022.repository.msg.UserDefinedInformation1> sellerDefinedInformation) {
		this.sellerDefinedInformation = sellerDefinedInformation;
	}

	@XmlElement(name = "Incotrms")
	public Incoterms4 getIncoterms() {
		return incoterms;
	}

	public void setIncoterms(com.tools20022.repository.msg.Incoterms4 incoterms) {
		this.incoterms = incoterms;
	}
}