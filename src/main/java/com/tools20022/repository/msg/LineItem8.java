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
import com.tools20022.repository.area.tsmt.BaselineReportV03;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.PurchaseOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.repository.msg.LineItem8#mmLineItemDetails
 * LineItem8.mmLineItemDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedLineItemsTotalAmount
 * LineItem8.mmOrderedLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedLineItemsTotalAmount
 * LineItem8.mmAcceptedLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOutstandingLineItemsTotalAmount
 * LineItem8.mmOutstandingLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmPendingLineItemsTotalAmount
 * LineItem8.mmPendingLineItemsTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedTotalNetAmount
 * LineItem8.mmOrderedTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedTotalNetAmount
 * LineItem8.mmAcceptedTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOutstandingTotalNetAmount
 * LineItem8.mmOutstandingTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem8#mmPendingTotalNetAmount
 * LineItem8.mmPendingTotalNetAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmReportedLineItem
 * BaselineReportV03.mmReportedLineItem}</li>
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
 * "LineItem8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the current situation of a baseline as a result of the submission of a commercial data set."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem14 LineItem14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LineItem8", propOrder = {"lineItemDetails", "orderedLineItemsTotalAmount", "acceptedLineItemsTotalAmount", "outstandingLineItemsTotalAmount", "pendingLineItemsTotalAmount", "orderedTotalNetAmount",
		"acceptedTotalNetAmount", "outstandingTotalNetAmount", "pendingTotalNetAmount"})
public class LineItem8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.LineItemDetails8> lineItemDetails;
	/**
	 * Calculated information about the goods of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails8
	 * LineItemDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmLineItemDetails
	 * LineItem14.mmLineItemDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLineItemDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "LineItmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemDetails";
			definition = "Calculated information about the goods of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmLineItemDetails);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.mmObject();
		}
	};
	protected CurrencyAndAmount orderedLineItemsTotalAmount;
	/**
	 * Line items total amount as indicated in the baseline.
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
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmTotalAmount
	 * PurchaseOrder.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedLineItemsTotalAmount
	 * LineItem14.mmOrderedLineItemsTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderedLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmTotalAmount;
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "OrdrdLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedLineItemsTotalAmount";
			definition = "Line items total amount as indicated in the baseline.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmOrderedLineItemsTotalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount acceptedLineItemsTotalAmount;
	/**
	 * Line items total amount accepted by a data set submission(s).
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
	 * CommercialTrade.mmTotalAcceptedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedLineItemsTotalAmount
	 * LineItem14.mmAcceptedLineItemsTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptedLineItemsTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmTotalAcceptedAmount;
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "AccptdLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedLineItemsTotalAmount";
			definition = "Line items total amount accepted by a data set submission(s).";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmAcceptedLineItemsTotalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount outstandingLineItemsTotalAmount;
	/**
	 * Difference between the ordered and the accepted line items total amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOutstandingLineItemsTotalAmount
	 * LineItem14.mmOutstandingLineItemsTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingLineItemsTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "OutsdngLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingLineItemsTotalAmount";
			definition = "Difference between the ordered and the accepted line items total amount.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmOutstandingLineItemsTotalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount pendingLineItemsTotalAmount;
	/**
	 * Line item total amount for which a mismatched data set has been submitted
	 * and has not yet been accepted or rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmPendingLineItemsTotalAmount
	 * LineItem14.mmPendingLineItemsTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingLineItemsTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "PdgLineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLineItemsTotalAmount";
			definition = "Line item total amount for which a mismatched data set has been submitted and has not yet been accepted or rejected.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmPendingLineItemsTotalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount orderedTotalNetAmount;
	/**
	 * Total net amount as indicated in the baseline.
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalNetAmount
	 * Invoice.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedTotalNetAmount
	 * LineItem14.mmOrderedTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderedTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalNetAmount;
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "OrdrdTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedTotalNetAmount";
			definition = "Total net amount as indicated in the baseline.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmOrderedTotalNetAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount acceptedTotalNetAmount;
	/**
	 * Total net amount accepted by a data set submission.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedTotalNetAmount
	 * LineItem14.mmAcceptedTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptedTotalNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "AccptdTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTotalNetAmount";
			definition = "Total net amount accepted by a data set submission.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmAcceptedTotalNetAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount outstandingTotalNetAmount;
	/**
	 * Total net amount for which a mismatched data set has been submitted and
	 * has not yet been accepted or rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOutstandingTotalNetAmount
	 * LineItem14.mmOutstandingTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingTotalNetAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "OutsdngTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingTotalNetAmount";
			definition = "Total net amount for which a mismatched data set has been submitted and has not yet been accepted or rejected.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmOutstandingTotalNetAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount pendingTotalNetAmount;
	/**
	 * Difference between the ordered and the accepted total net amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem8
	 * LineItem8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmPendingTotalNetAmount
	 * LineItem14.mmPendingTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingTotalNetAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItem8.mmObject();
			isDerived = false;
			xmlTag = "PdgTtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingTotalNetAmount";
			definition = "Difference between the ordered and the accepted total net amount.";
			nextVersions_lazy = () -> Arrays.asList(LineItem14.mmPendingTotalNetAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LineItem8.mmLineItemDetails, LineItem8.mmOrderedLineItemsTotalAmount, LineItem8.mmAcceptedLineItemsTotalAmount, LineItem8.mmOutstandingLineItemsTotalAmount,
						LineItem8.mmPendingLineItemsTotalAmount, LineItem8.mmOrderedTotalNetAmount, LineItem8.mmAcceptedTotalNetAmount, LineItem8.mmOutstandingTotalNetAmount, LineItem8.mmPendingTotalNetAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(BaselineReportV03.mmReportedLineItem);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem8";
				definition = "Calculation of the current situation of a baseline as a result of the submission of a commercial data set.";
				nextVersions_lazy = () -> Arrays.asList(LineItem14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LineItmDtls", required = true)
	public List<LineItemDetails8> getLineItemDetails() {
		return lineItemDetails;
	}

	public void setLineItemDetails(List<com.tools20022.repository.msg.LineItemDetails8> lineItemDetails) {
		this.lineItemDetails = lineItemDetails;
	}

	@XmlElement(name = "OrdrdLineItmsTtlAmt", required = true)
	public CurrencyAndAmount getOrderedLineItemsTotalAmount() {
		return orderedLineItemsTotalAmount;
	}

	public void setOrderedLineItemsTotalAmount(CurrencyAndAmount orderedLineItemsTotalAmount) {
		this.orderedLineItemsTotalAmount = orderedLineItemsTotalAmount;
	}

	@XmlElement(name = "AccptdLineItmsTtlAmt", required = true)
	public CurrencyAndAmount getAcceptedLineItemsTotalAmount() {
		return acceptedLineItemsTotalAmount;
	}

	public void setAcceptedLineItemsTotalAmount(CurrencyAndAmount acceptedLineItemsTotalAmount) {
		this.acceptedLineItemsTotalAmount = acceptedLineItemsTotalAmount;
	}

	@XmlElement(name = "OutsdngLineItmsTtlAmt", required = true)
	public CurrencyAndAmount getOutstandingLineItemsTotalAmount() {
		return outstandingLineItemsTotalAmount;
	}

	public void setOutstandingLineItemsTotalAmount(CurrencyAndAmount outstandingLineItemsTotalAmount) {
		this.outstandingLineItemsTotalAmount = outstandingLineItemsTotalAmount;
	}

	@XmlElement(name = "PdgLineItmsTtlAmt", required = true)
	public CurrencyAndAmount getPendingLineItemsTotalAmount() {
		return pendingLineItemsTotalAmount;
	}

	public void setPendingLineItemsTotalAmount(CurrencyAndAmount pendingLineItemsTotalAmount) {
		this.pendingLineItemsTotalAmount = pendingLineItemsTotalAmount;
	}

	@XmlElement(name = "OrdrdTtlNetAmt", required = true)
	public CurrencyAndAmount getOrderedTotalNetAmount() {
		return orderedTotalNetAmount;
	}

	public void setOrderedTotalNetAmount(CurrencyAndAmount orderedTotalNetAmount) {
		this.orderedTotalNetAmount = orderedTotalNetAmount;
	}

	@XmlElement(name = "AccptdTtlNetAmt", required = true)
	public CurrencyAndAmount getAcceptedTotalNetAmount() {
		return acceptedTotalNetAmount;
	}

	public void setAcceptedTotalNetAmount(CurrencyAndAmount acceptedTotalNetAmount) {
		this.acceptedTotalNetAmount = acceptedTotalNetAmount;
	}

	@XmlElement(name = "OutsdngTtlNetAmt", required = true)
	public CurrencyAndAmount getOutstandingTotalNetAmount() {
		return outstandingTotalNetAmount;
	}

	public void setOutstandingTotalNetAmount(CurrencyAndAmount outstandingTotalNetAmount) {
		this.outstandingTotalNetAmount = outstandingTotalNetAmount;
	}

	@XmlElement(name = "PdgTtlNetAmt", required = true)
	public CurrencyAndAmount getPendingTotalNetAmount() {
		return pendingTotalNetAmount;
	}

	public void setPendingTotalNetAmount(CurrencyAndAmount pendingTotalNetAmount) {
		this.pendingTotalNetAmount = pendingTotalNetAmount;
	}
}