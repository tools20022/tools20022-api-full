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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmGoodsAndOrServicesDescription
 * LineItem13.mmGoodsAndOrServicesDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmPartialShipment
 * LineItem13.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTransShipment
 * LineItem13.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmShipmentDateRange
 * LineItem13.mmShipmentDateRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemDetails
 * LineItem13.mmLineItemDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemsTotalAmount
 * LineItem13.mmLineItemsTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmRoutingSummary
 * LineItem13.mmRoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmIncoterms
 * LineItem13.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmAdjustment
 * LineItem13.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmFreightCharges
 * LineItem13.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTax
 * LineItem13.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTotalNetAmount
 * LineItem13.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmBuyerDefinedInformation
 * LineItem13.mmBuyerDefinedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmSellerDefinedInformation
 * LineItem13.mmSellerDefinedInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule#forLineItem13
 * ConstraintLatestShipmentDateRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRoutingSummaryRule#forLineItem13
 * ConstraintRoutingSummaryRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem13
 * ConstraintIncotermsRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem13
 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.LineItem11
 * LineItem11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem13", propOrder = {"goodsAndOrServicesDescription", "partialShipment", "transShipment", "shipmentDateRange", "lineItemDetails", "lineItemsTotalAmount", "routingSummary", "incoterms", "adjustment", "freightCharges",
		"tax", "totalNetAmount", "buyerDefinedInformation", "sellerDefinedInformation"})
public class LineItem13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GoodsAndOrSvcsDesc")
	protected Max70Text goodsAndOrServicesDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoodsAndOrSvcsDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodsAndOrServicesDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmGoodsDescription
	 * LineItem11.mmGoodsDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGoodsAndOrServicesDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "GoodsAndOrSvcsDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodsAndOrServicesDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			previousVersion_lazy = () -> LineItem11.mmGoodsDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "PrtlShipmnt", required = true)
	protected YesNoIndicator partialShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
	 * Transport.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlShipmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmPartialShipment
	 * LineItem11.mmPartialShipment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialShipment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPartialShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "PrtlShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			previousVersion_lazy = () -> LineItem11.mmPartialShipment;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "TrnsShipmnt")
	protected YesNoIndicator transShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
	 * Transport.mmTransShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsShipmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmTransShipment
	 * LineItem11.mmTransShipment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransShipment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "TrnsShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			previousVersion_lazy = () -> LineItem11.mmTransShipment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ShipmntDtRg")
	protected ShipmentDateRange1 shipmentDateRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentDateRange1
	 * ShipmentDateRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntDtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an earliest shipment date and a latest shipment date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmShipmentDateRange
	 * LineItem11.mmShipmentDateRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipmentDateRange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "ShipmntDtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentDateRange";
			definition = "Specifies an earliest shipment date and a latest shipment date.";
			previousVersion_lazy = () -> LineItem11.mmShipmentDateRange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ShipmentDateRange1.mmObject();
		}
	};
	@XmlElement(name = "LineItmDtls", required = true)
	protected List<com.tools20022.repository.msg.LineItemDetails13> lineItemDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods or services that are purchased."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmLineItemDetails
	 * LineItem11.mmLineItemDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLineItemDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "LineItmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemDetails";
			definition = "Goods or services that are purchased.";
			previousVersion_lazy = () -> LineItem11.mmLineItemDetails;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
		}
	};
	@XmlElement(name = "LineItmsTtlAmt", required = true)
	protected CurrencyAndAmount lineItemsTotalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmLineItemsTotalAmount
	 * LineItem11.mmLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "LineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemsTotalAmount";
			definition = "Specifies the total amount of all line items (incl. their adjustments).";
			previousVersion_lazy = () -> LineItem11.mmLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RtgSummry")
	protected TransportMeans5 routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans5
	 * TransportMeans5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmRoutingSummary
	 * LineItem11.mmRoutingSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoutingSummary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			previousVersion_lazy = () -> LineItem11.mmRoutingSummary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportMeans5.mmObject();
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms4 incoterms;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * "Specifies the applicable Incoterms and associated location. Latest version of Incoterms in effect at the date of message creation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmIncoterms
	 * LineItem11.mmIncoterms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncoterms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterms and associated location. Latest version of Incoterms in effect at the date of message creation.";
			previousVersion_lazy = () -> LineItem11.mmIncoterms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Incoterms4.mmObject();
		}
	};
	@XmlElement(name = "Adjstmnt")
	protected List<com.tools20022.repository.msg.Adjustment7> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Adjustment7
	 * Adjustment7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmAdjustment
	 * LineItem11.mmAdjustment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Variance on price for the goods.";
			previousVersion_lazy = () -> LineItem11.mmAdjustment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Adjustment7.mmObject();
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge24 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge24 Charge24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * definition} = "Maximum charges related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmFreightCharges
	 * LineItem11.mmFreightCharges}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFreightCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Maximum charges related to the conveyance of goods.";
			previousVersion_lazy = () -> LineItem11.mmFreightCharges;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge24.mmObject();
		}
	};
	@XmlElement(name = "Tax")
	protected List<com.tools20022.repository.msg.Tax23> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax23 Tax23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmTax
	 * LineItem11.mmTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction.";
			previousVersion_lazy = () -> LineItem11.mmTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax23.mmObject();
		}
	};
	@XmlElement(name = "TtlNetAmt", required = true)
	protected CurrencyAndAmount totalNetAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmTotalNetAmount
	 * LineItem11.mmTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "TtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetAmount";
			definition = "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			previousVersion_lazy = () -> LineItem11.mmTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "BuyrDfndInf")
	protected List<com.tools20022.repository.msg.UserDefinedInformation1> buyerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmBuyerDefinedInformation
	 * LineItem11.mmBuyerDefinedInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerDefinedInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "BuyrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			previousVersion_lazy = () -> LineItem11.mmBuyerDefinedInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UserDefinedInformation1.mmObject();
		}
	};
	@XmlElement(name = "SellrDfndInf")
	protected List<com.tools20022.repository.msg.UserDefinedInformation1> sellerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmSellerDefinedInformation
	 * LineItem11.mmSellerDefinedInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerDefinedInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "SellrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			previousVersion_lazy = () -> LineItem11.mmSellerDefinedInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UserDefinedInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem13.mmGoodsAndOrServicesDescription, com.tools20022.repository.msg.LineItem13.mmPartialShipment,
						com.tools20022.repository.msg.LineItem13.mmTransShipment, com.tools20022.repository.msg.LineItem13.mmShipmentDateRange, com.tools20022.repository.msg.LineItem13.mmLineItemDetails,
						com.tools20022.repository.msg.LineItem13.mmLineItemsTotalAmount, com.tools20022.repository.msg.LineItem13.mmRoutingSummary, com.tools20022.repository.msg.LineItem13.mmIncoterms,
						com.tools20022.repository.msg.LineItem13.mmAdjustment, com.tools20022.repository.msg.LineItem13.mmFreightCharges, com.tools20022.repository.msg.LineItem13.mmTax,
						com.tools20022.repository.msg.LineItem13.mmTotalNetAmount, com.tools20022.repository.msg.LineItem13.mmBuyerDefinedInformation, com.tools20022.repository.msg.LineItem13.mmSellerDefinedInformation);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule.forLineItem13, com.tools20022.repository.constraints.ConstraintRoutingSummaryRule.forLineItem13,
						com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem13, com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem13";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				previousVersion_lazy = () -> LineItem11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max70Text> getGoodsAndOrServicesDescription() {
		return goodsAndOrServicesDescription == null ? Optional.empty() : Optional.of(goodsAndOrServicesDescription);
	}

	public LineItem13 setGoodsAndOrServicesDescription(Max70Text goodsAndOrServicesDescription) {
		this.goodsAndOrServicesDescription = goodsAndOrServicesDescription;
		return this;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public LineItem13 setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = Objects.requireNonNull(partialShipment);
		return this;
	}

	public Optional<YesNoIndicator> getTransShipment() {
		return transShipment == null ? Optional.empty() : Optional.of(transShipment);
	}

	public LineItem13 setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = transShipment;
		return this;
	}

	public Optional<ShipmentDateRange1> getShipmentDateRange() {
		return shipmentDateRange == null ? Optional.empty() : Optional.of(shipmentDateRange);
	}

	public LineItem13 setShipmentDateRange(com.tools20022.repository.msg.ShipmentDateRange1 shipmentDateRange) {
		this.shipmentDateRange = shipmentDateRange;
		return this;
	}

	public List<LineItemDetails13> getLineItemDetails() {
		return lineItemDetails == null ? lineItemDetails = new ArrayList<>() : lineItemDetails;
	}

	public LineItem13 setLineItemDetails(List<com.tools20022.repository.msg.LineItemDetails13> lineItemDetails) {
		this.lineItemDetails = Objects.requireNonNull(lineItemDetails);
		return this;
	}

	public CurrencyAndAmount getLineItemsTotalAmount() {
		return lineItemsTotalAmount;
	}

	public LineItem13 setLineItemsTotalAmount(CurrencyAndAmount lineItemsTotalAmount) {
		this.lineItemsTotalAmount = Objects.requireNonNull(lineItemsTotalAmount);
		return this;
	}

	public Optional<TransportMeans5> getRoutingSummary() {
		return routingSummary == null ? Optional.empty() : Optional.of(routingSummary);
	}

	public LineItem13 setRoutingSummary(com.tools20022.repository.msg.TransportMeans5 routingSummary) {
		this.routingSummary = routingSummary;
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public LineItem13 setIncoterms(com.tools20022.repository.msg.Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}

	public List<Adjustment7> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public LineItem13 setAdjustment(List<com.tools20022.repository.msg.Adjustment7> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Charge24> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public LineItem13 setFreightCharges(com.tools20022.repository.msg.Charge24 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public List<Tax23> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItem13 setTax(List<com.tools20022.repository.msg.Tax23> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public LineItem13 setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<UserDefinedInformation1> getBuyerDefinedInformation() {
		return buyerDefinedInformation == null ? buyerDefinedInformation = new ArrayList<>() : buyerDefinedInformation;
	}

	public LineItem13 setBuyerDefinedInformation(List<com.tools20022.repository.msg.UserDefinedInformation1> buyerDefinedInformation) {
		this.buyerDefinedInformation = Objects.requireNonNull(buyerDefinedInformation);
		return this;
	}

	public List<UserDefinedInformation1> getSellerDefinedInformation() {
		return sellerDefinedInformation == null ? sellerDefinedInformation = new ArrayList<>() : sellerDefinedInformation;
	}

	public LineItem13 setSellerDefinedInformation(List<com.tools20022.repository.msg.UserDefinedInformation1> sellerDefinedInformation) {
		this.sellerDefinedInformation = Objects.requireNonNull(sellerDefinedInformation);
		return this;
	}
}