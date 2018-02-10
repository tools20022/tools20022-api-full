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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesOrderParameters;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details related to the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmWorkingIndicator
 * OrderStatus1.mmWorkingIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus1#mmSide
 * OrderStatus1.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmRemainingQuantity
 * OrderStatus1.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmCumulativeQuantity
 * OrderStatus1.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmTotalNumberReports
 * OrderStatus1.mmTotalNumberReports}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmLastReportRequested
 * OrderStatus1.mmLastReportRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmOrderQuantityDetails
 * OrderStatus1.mmOrderQuantityDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details related to the order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatus1", propOrder = {"workingIndicator", "side", "remainingQuantity", "cumulativeQuantity", "totalNumberReports", "lastReportRequested", "orderQuantityDetails"})
public class OrderStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WorkgInd", required = true)
	protected YesNoIndicator workingIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmWorkingIndicator
	 * SecuritiesOrderParameters.mmWorkingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WorkgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 636</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the order is currently being worked. Applicable only for OrderStatus = New. For open outcry markets this indicates that the order is being worked in the crowd. For electronic markets it indicates that the order has transitioned from a contingent order to a market order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWorkingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmWorkingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "WorkgInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "636"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. Applicable only for OrderStatus = New. For open outcry markets this indicates that the order is being worked in the crowd. For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Sd", required = true)
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Side of order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Side of order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	@XmlElement(name = "RmngQty", required = true)
	protected FinancialInstrumentQuantityChoice remainingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
	 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity opened for further execution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmRemainingQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "RmngQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "CmltvQty", required = true)
	protected FinancialInstrumentQuantityChoice cumulativeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
	 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmltvQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 14</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity (e.g. number of shares) filled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCumulativeQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmCumulativeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "CmltvQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "14"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (e.g. number of shares) filled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "TtlNbRpts", required = true)
	protected Number totalNumberReports;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbRpts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberReports"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number or reports returned in response to a request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberReports = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbRpts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberReports";
			definition = "Total number or reports returned in response to a request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "LastRptReqd", required = true)
	protected YesNoIndicator lastReportRequested;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastRptReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastReportRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether this message is the last report message in response to a request, such as Order Mass Status Request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastReportRequested = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "LastRptReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastReportRequested";
			definition = "Indicates whether this message is the last report message in response to a request, such as Order Mass Status Request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "OrdrQtyDtls")
	protected OrderQuantity1 orderQuantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderQuantity1
	 * OrderQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrQtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderQuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details related to the ordered quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderQuantityDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus1.mmObject();
			isDerived = false;
			xmlTag = "OrdrQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderQuantityDetails";
			definition = "Provides details related to the ordered quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrderQuantity1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatus1.mmWorkingIndicator, com.tools20022.repository.msg.OrderStatus1.mmSide, com.tools20022.repository.msg.OrderStatus1.mmRemainingQuantity,
						com.tools20022.repository.msg.OrderStatus1.mmCumulativeQuantity, com.tools20022.repository.msg.OrderStatus1.mmTotalNumberReports, com.tools20022.repository.msg.OrderStatus1.mmLastReportRequested,
						com.tools20022.repository.msg.OrderStatus1.mmOrderQuantityDetails);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderStatus1";
				definition = "Provides details related to the order.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getWorkingIndicator() {
		return workingIndicator;
	}

	public OrderStatus1 setWorkingIndicator(YesNoIndicator workingIndicator) {
		this.workingIndicator = Objects.requireNonNull(workingIndicator);
		return this;
	}

	public Side1Code getSide() {
		return side;
	}

	public OrderStatus1 setSide(Side1Code side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public FinancialInstrumentQuantityChoice getRemainingQuantity() {
		return remainingQuantity;
	}

	public OrderStatus1 setRemainingQuantity(FinancialInstrumentQuantityChoice remainingQuantity) {
		this.remainingQuantity = Objects.requireNonNull(remainingQuantity);
		return this;
	}

	public FinancialInstrumentQuantityChoice getCumulativeQuantity() {
		return cumulativeQuantity;
	}

	public OrderStatus1 setCumulativeQuantity(FinancialInstrumentQuantityChoice cumulativeQuantity) {
		this.cumulativeQuantity = Objects.requireNonNull(cumulativeQuantity);
		return this;
	}

	public Number getTotalNumberReports() {
		return totalNumberReports;
	}

	public OrderStatus1 setTotalNumberReports(Number totalNumberReports) {
		this.totalNumberReports = Objects.requireNonNull(totalNumberReports);
		return this;
	}

	public YesNoIndicator getLastReportRequested() {
		return lastReportRequested;
	}

	public OrderStatus1 setLastReportRequested(YesNoIndicator lastReportRequested) {
		this.lastReportRequested = Objects.requireNonNull(lastReportRequested);
		return this;
	}

	public Optional<OrderQuantity1> getOrderQuantityDetails() {
		return orderQuantityDetails == null ? Optional.empty() : Optional.of(orderQuantityDetails);
	}

	public OrderStatus1 setOrderQuantityDetails(com.tools20022.repository.msg.OrderQuantity1 orderQuantityDetails) {
		this.orderQuantityDetails = orderQuantityDetails;
		return this;
	}
}