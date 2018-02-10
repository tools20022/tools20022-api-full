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
import com.tools20022.repository.choice.RejectionReason3Choice;
import com.tools20022.repository.codeset.ListStatusType1Code;
import com.tools20022.repository.codeset.OrderStatus6Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status and reason of an instructed order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmListIdentification
 * OrderStatus2.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus2#mmListStatusType
 * OrderStatus2.mmListStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus2#mmListOrderStatus
 * OrderStatus2.mmListOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmTotalNumberOfReports
 * OrderStatus2.mmTotalNumberOfReports}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmReportSequenceNumber
 * OrderStatus2.mmReportSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmTotalNumberOfOrders
 * OrderStatus2.mmTotalNumberOfOrders}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus2#mmRejectionReason
 * OrderStatus2.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmSingleOrderDetails
 * OrderStatus2.mmSingleOrderDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRejectionReason#forOrderStatus2
 * ConstraintRejectionReason.forOrderStatus2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status and reason of an instructed order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatus2", propOrder = {"listIdentification", "listStatusType", "listOrderStatus", "totalNumberOfReports", "reportSequenceNumber", "totalNumberOfOrders", "rejectionReason", "singleOrderDetails"})
public class OrderStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ListId", required = true)
	protected Max35Text listIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 66</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "66"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ListStsTp", required = true)
	protected ListStatusType1Code listStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusType1Code
	 * ListStatusType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmListOrderStatus
	 * SecuritiesOrderStatus.mmListOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListStsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 429</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an instructed order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListStatusType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmListOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "ListStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "429"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListStatusType";
			definition = "Status of an instructed order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ListStatusType1Code.mmObject();
		}
	};
	@XmlElement(name = "ListOrdrSts", required = true)
	protected OrderStatus6Code listOrderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListOrdrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 431</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of a list order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListOrderStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "ListOrdrSts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "431"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListOrderStatus";
			definition = "Indicates the status of a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus6Code.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfRpts", required = true)
	protected Number totalNumberOfReports;
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfRpts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfReports"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of messages required to get a complete status list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfReports = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfRpts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfReports";
			definition = "Total number of messages required to get a complete status list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RptSeqNb", required = true)
	protected Number reportSequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 83</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number of this report message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "RptSeqNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "83"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSequenceNumber";
			definition = "Sequence number of this report message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfOrdrs", required = true)
	protected Number totalNumberOfOrders;
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 68</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the total number of orders across all ListOrder messages with the same ListIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfOrders = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfOrdrs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "68"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfOrders";
			definition = "Identifies the total number of orders across all ListOrder messages with the same ListIdentification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason3Choice rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason3Choice
	 * RejectionReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 103</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which an order is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "103"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason for which an order is rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RejectionReason3Choice.mmObject();
		}
	};
	@XmlElement(name = "SnglOrdrDtls")
	protected List<com.tools20022.repository.msg.OrderStatus3> singleOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderStatus3
	 * OrderStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status details specific to each order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleOrderDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus2.mmObject();
			isDerived = false;
			xmlTag = "SnglOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOrderDetails";
			definition = "Status details specific to each order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatus2.mmListIdentification, com.tools20022.repository.msg.OrderStatus2.mmListStatusType,
						com.tools20022.repository.msg.OrderStatus2.mmListOrderStatus, com.tools20022.repository.msg.OrderStatus2.mmTotalNumberOfReports, com.tools20022.repository.msg.OrderStatus2.mmReportSequenceNumber,
						com.tools20022.repository.msg.OrderStatus2.mmTotalNumberOfOrders, com.tools20022.repository.msg.OrderStatus2.mmRejectionReason, com.tools20022.repository.msg.OrderStatus2.mmSingleOrderDetails);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRejectionReason.forOrderStatus2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderStatus2";
				definition = "Status and reason of an instructed order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public OrderStatus2 setListIdentification(Max35Text listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public ListStatusType1Code getListStatusType() {
		return listStatusType;
	}

	public OrderStatus2 setListStatusType(ListStatusType1Code listStatusType) {
		this.listStatusType = Objects.requireNonNull(listStatusType);
		return this;
	}

	public OrderStatus6Code getListOrderStatus() {
		return listOrderStatus;
	}

	public OrderStatus2 setListOrderStatus(OrderStatus6Code listOrderStatus) {
		this.listOrderStatus = Objects.requireNonNull(listOrderStatus);
		return this;
	}

	public Number getTotalNumberOfReports() {
		return totalNumberOfReports;
	}

	public OrderStatus2 setTotalNumberOfReports(Number totalNumberOfReports) {
		this.totalNumberOfReports = Objects.requireNonNull(totalNumberOfReports);
		return this;
	}

	public Number getReportSequenceNumber() {
		return reportSequenceNumber;
	}

	public OrderStatus2 setReportSequenceNumber(Number reportSequenceNumber) {
		this.reportSequenceNumber = Objects.requireNonNull(reportSequenceNumber);
		return this;
	}

	public Number getTotalNumberOfOrders() {
		return totalNumberOfOrders;
	}

	public OrderStatus2 setTotalNumberOfOrders(Number totalNumberOfOrders) {
		this.totalNumberOfOrders = Objects.requireNonNull(totalNumberOfOrders);
		return this;
	}

	public Optional<RejectionReason3Choice> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public OrderStatus2 setRejectionReason(RejectionReason3Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public List<OrderStatus3> getSingleOrderDetails() {
		return singleOrderDetails == null ? singleOrderDetails = new ArrayList<>() : singleOrderDetails;
	}

	public OrderStatus2 setSingleOrderDetails(List<com.tools20022.repository.msg.OrderStatus3> singleOrderDetails) {
		this.singleOrderDetails = Objects.requireNonNull(singleOrderDetails);
		return this;
	}
}