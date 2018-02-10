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
import com.tools20022.repository.area.tsmt.BaselineReportV04;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.PurchaseOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Calculation of the current situation of a baseline as a result of the
 * submission of a commercial data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem14#mmLineItemDetails
 * LineItem14.mmLineItemDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedLineItemsTotalAmount
 * LineItem14.mmOrderedLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedLineItemsTotalAmount
 * LineItem14.mmAcceptedLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOutstandingLineItemsTotalAmount
 * LineItem14.mmOutstandingLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmPendingLineItemsTotalAmount
 * LineItem14.mmPendingLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedTotalNetAmount
 * LineItem14.mmOrderedTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedTotalNetAmount
 * LineItem14.mmAcceptedTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOutstandingTotalNetAmount
 * LineItem14.mmOutstandingTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem14#mmPendingTotalNetAmount
 * LineItem14.mmPendingTotalNetAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportedLineItem
 * BaselineReportV04.mmReportedLineItem}</li>
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
 * "LineItem14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the current situation of a baseline as a result of the submission of a commercial data set."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.LineItem8
 * LineItem8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem14", propOrder = {"lineItemDetails", "orderedLineItemsTotalAmount", "acceptedLineItemsTotalAmount", "outstandingLineItemsTotalAmount", "pendingLineItemsTotalAmount", "orderedTotalNetAmount",
		"acceptedTotalNetAmount", "outstandingTotalNetAmount", "pendingTotalNetAmount"})
public class LineItem14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LineItmDtls", required = true)
	protected List<com.tools20022.repository.msg.LineItemDetails12> lineItemDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
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
	 * definition} =
	 * "Calculated information about the goods of the underlying transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmLineItemDetails
	 * LineItem8.mmLineItemDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLineItemDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "LineItmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemDetails";
			definition = "Calculated information about the goods of the underlying transaction.";
			previousVersion_lazy = () -> LineItem8.mmLineItemDetails;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemDetails12.mmObject();
		}
	};
	@XmlElement(name = "OrdrdLineItmsTtlAmt", required = true)
	protected CurrencyAndAmount orderedLineItemsTotalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmTotalAmount
	 * PurchaseOrder.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrdLineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedLineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line items total amount as indicated in the baseline."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedLineItemsTotalAmount
	 * LineItem8.mmOrderedLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderedLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "OrdrdLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedLineItemsTotalAmount";
			definition = "Line items total amount as indicated in the baseline.";
			previousVersion_lazy = () -> LineItem8.mmOrderedLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "AccptdLineItmsTtlAmt", required = true)
	protected CurrencyAndAmount acceptedLineItemsTotalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
	 * CommercialTrade.mmTotalAcceptedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdLineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedLineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line items total amount accepted by a data set submission(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedLineItemsTotalAmount
	 * LineItem8.mmAcceptedLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptedLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmTotalAcceptedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "AccptdLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedLineItemsTotalAmount";
			definition = "Line items total amount accepted by a data set submission(s).";
			previousVersion_lazy = () -> LineItem8.mmAcceptedLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OutsdngLineItmsTtlAmt", required = true)
	protected CurrencyAndAmount outstandingLineItemsTotalAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngLineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingLineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the ordered and the accepted line items total amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOutstandingLineItemsTotalAmount
	 * LineItem8.mmOutstandingLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingLineItemsTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "OutsdngLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingLineItemsTotalAmount";
			definition = "Difference between the ordered and the accepted line items total amount.";
			previousVersion_lazy = () -> LineItem8.mmOutstandingLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PdgLineItmsTtlAmt", required = true)
	protected CurrencyAndAmount pendingLineItemsTotalAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgLineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item total amount for which a mismatched data set has been submitted and has not yet been accepted or rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmPendingLineItemsTotalAmount
	 * LineItem8.mmPendingLineItemsTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingLineItemsTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "PdgLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLineItemsTotalAmount";
			definition = "Line item total amount for which a mismatched data set has been submitted and has not yet been accepted or rejected.";
			previousVersion_lazy = () -> LineItem8.mmPendingLineItemsTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OrdrdTtlNetAmt", required = true)
	protected CurrencyAndAmount orderedTotalNetAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalNetAmount
	 * Invoice.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrdTtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedTotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total net amount as indicated in the baseline."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedTotalNetAmount
	 * LineItem8.mmOrderedTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderedTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "OrdrdTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedTotalNetAmount";
			definition = "Total net amount as indicated in the baseline.";
			previousVersion_lazy = () -> LineItem8.mmOrderedTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "AccptdTtlNetAmt", required = true)
	protected CurrencyAndAmount acceptedTotalNetAmount;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdTtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total net amount accepted by a data set submission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedTotalNetAmount
	 * LineItem8.mmAcceptedTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptedTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "AccptdTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTotalNetAmount";
			definition = "Total net amount accepted by a data set submission.";
			previousVersion_lazy = () -> LineItem8.mmAcceptedTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OutsdngTtlNetAmt", required = true)
	protected CurrencyAndAmount outstandingTotalNetAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngTtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingTotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total net amount for which a mismatched data set has been submitted and has not yet been accepted or rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOutstandingTotalNetAmount
	 * LineItem8.mmOutstandingTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingTotalNetAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "OutsdngTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingTotalNetAmount";
			definition = "Total net amount for which a mismatched data set has been submitted and has not yet been accepted or rejected.";
			previousVersion_lazy = () -> LineItem8.mmOutstandingTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PdgTtlNetAmt", required = true)
	protected CurrencyAndAmount pendingTotalNetAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgTtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingTotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the ordered and the accepted total net amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmPendingTotalNetAmount
	 * LineItem8.mmPendingTotalNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingTotalNetAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem14.mmObject();
			isDerived = false;
			xmlTag = "PdgTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingTotalNetAmount";
			definition = "Difference between the ordered and the accepted total net amount.";
			previousVersion_lazy = () -> LineItem8.mmPendingTotalNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem14.mmLineItemDetails, com.tools20022.repository.msg.LineItem14.mmOrderedLineItemsTotalAmount,
						com.tools20022.repository.msg.LineItem14.mmAcceptedLineItemsTotalAmount, com.tools20022.repository.msg.LineItem14.mmOutstandingLineItemsTotalAmount,
						com.tools20022.repository.msg.LineItem14.mmPendingLineItemsTotalAmount, com.tools20022.repository.msg.LineItem14.mmOrderedTotalNetAmount, com.tools20022.repository.msg.LineItem14.mmAcceptedTotalNetAmount,
						com.tools20022.repository.msg.LineItem14.mmOutstandingTotalNetAmount, com.tools20022.repository.msg.LineItem14.mmPendingTotalNetAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(BaselineReportV04.mmReportedLineItem);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem14";
				definition = "Calculation of the current situation of a baseline as a result of the submission of a commercial data set.";
				previousVersion_lazy = () -> LineItem8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<LineItemDetails12> getLineItemDetails() {
		return lineItemDetails == null ? lineItemDetails = new ArrayList<>() : lineItemDetails;
	}

	public LineItem14 setLineItemDetails(List<com.tools20022.repository.msg.LineItemDetails12> lineItemDetails) {
		this.lineItemDetails = Objects.requireNonNull(lineItemDetails);
		return this;
	}

	public CurrencyAndAmount getOrderedLineItemsTotalAmount() {
		return orderedLineItemsTotalAmount;
	}

	public LineItem14 setOrderedLineItemsTotalAmount(CurrencyAndAmount orderedLineItemsTotalAmount) {
		this.orderedLineItemsTotalAmount = Objects.requireNonNull(orderedLineItemsTotalAmount);
		return this;
	}

	public CurrencyAndAmount getAcceptedLineItemsTotalAmount() {
		return acceptedLineItemsTotalAmount;
	}

	public LineItem14 setAcceptedLineItemsTotalAmount(CurrencyAndAmount acceptedLineItemsTotalAmount) {
		this.acceptedLineItemsTotalAmount = Objects.requireNonNull(acceptedLineItemsTotalAmount);
		return this;
	}

	public CurrencyAndAmount getOutstandingLineItemsTotalAmount() {
		return outstandingLineItemsTotalAmount;
	}

	public LineItem14 setOutstandingLineItemsTotalAmount(CurrencyAndAmount outstandingLineItemsTotalAmount) {
		this.outstandingLineItemsTotalAmount = Objects.requireNonNull(outstandingLineItemsTotalAmount);
		return this;
	}

	public CurrencyAndAmount getPendingLineItemsTotalAmount() {
		return pendingLineItemsTotalAmount;
	}

	public LineItem14 setPendingLineItemsTotalAmount(CurrencyAndAmount pendingLineItemsTotalAmount) {
		this.pendingLineItemsTotalAmount = Objects.requireNonNull(pendingLineItemsTotalAmount);
		return this;
	}

	public CurrencyAndAmount getOrderedTotalNetAmount() {
		return orderedTotalNetAmount;
	}

	public LineItem14 setOrderedTotalNetAmount(CurrencyAndAmount orderedTotalNetAmount) {
		this.orderedTotalNetAmount = Objects.requireNonNull(orderedTotalNetAmount);
		return this;
	}

	public CurrencyAndAmount getAcceptedTotalNetAmount() {
		return acceptedTotalNetAmount;
	}

	public LineItem14 setAcceptedTotalNetAmount(CurrencyAndAmount acceptedTotalNetAmount) {
		this.acceptedTotalNetAmount = Objects.requireNonNull(acceptedTotalNetAmount);
		return this;
	}

	public CurrencyAndAmount getOutstandingTotalNetAmount() {
		return outstandingTotalNetAmount;
	}

	public LineItem14 setOutstandingTotalNetAmount(CurrencyAndAmount outstandingTotalNetAmount) {
		this.outstandingTotalNetAmount = Objects.requireNonNull(outstandingTotalNetAmount);
		return this;
	}

	public CurrencyAndAmount getPendingTotalNetAmount() {
		return pendingTotalNetAmount;
	}

	public LineItem14 setPendingTotalNetAmount(CurrencyAndAmount pendingTotalNetAmount) {
		this.pendingTotalNetAmount = Objects.requireNonNull(pendingTotalNetAmount);
		return this;
	}
}