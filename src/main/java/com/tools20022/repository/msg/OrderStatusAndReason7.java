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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV03;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.OrderStatus4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of a bulk or multiple or switch order that was previously
 * received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#TypeOfStatusRule
 * OrderStatusAndReason7.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmMasterReference
 * OrderStatusAndReason7.mmMasterReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmStatus
 * OrderStatusAndReason7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmCancelled
 * OrderStatusAndReason7.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmConditionallyAccepted
 * OrderStatusAndReason7.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmRejected
 * OrderStatusAndReason7.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmSuspended
 * OrderStatusAndReason7.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmPartiallySettled
 * OrderStatusAndReason7.mmPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmStatusInitiator
 * OrderStatusAndReason7.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOrderDetailsReport
 * OrderInstructionStatusReportV03.mmOrderDetailsReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatusAndReason7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of a bulk or multiple or switch order that was previously received."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason10
 * OrderStatusAndReason10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatusAndReason7", propOrder = {"masterReference", "status", "cancelled", "conditionallyAccepted", "rejected", "suspended", "partiallySettled", "statusInitiator"})
public class OrderStatusAndReason7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmMasterReference
	 * OrderStatusAndReason10.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason10.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected OrderStatus4Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message. There is no reason attached."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of all the orders in the order message. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus4Code.mmObject();
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus2 cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of all the orders in the order message is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
		}
	};
	@XmlElement(name = "CondlyAccptd", required = true)
	protected ConditionallyAcceptedStatus2 conditionallyAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2
	 * ConditionallyAcceptedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlyAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is conditionally accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of all the orders in the order message is conditionally accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionallyAcceptedStatus2.mmObject();
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected List<com.tools20022.repository.msg.RejectedStatus6> rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus6
	 * RejectedStatus6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is rejected. This status is used for orders that have not been accepted or entered in an order book."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of all the orders in the order message is rejected. This status is used for orders that have not been accepted or entered in an order book.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RejectedStatus6.mmObject();
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatus2 suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SuspendedStatus2
	 * SuspendedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuspended = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of all the orders in the order message is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SuspendedStatus2.mmObject();
		}
	};
	@XmlElement(name = "PrtlySttld", required = true)
	protected PartiallySettledStatus1 partiallySettled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
	 * PartiallySettledStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
	 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlySttld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of all the orders in the order message is partially settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartiallySettled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of all the orders in the order message is partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartiallySettledStatus1.mmObject();
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the status of the order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmStatusInitiator
	 * OrderStatusAndReason10.mmStatusInitiator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusInitiator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason10.mmStatusInitiator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Status, Cancelled,
	 * ConditionallyAccepted, Rejected, Suspended, PartiallySettled) must be
	 * present. This message element may be repeated more than once if allowed
	 * by its multiplicity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmStatus
	 * OrderStatusAndReason7.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmCancelled
	 * OrderStatusAndReason7.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmConditionallyAccepted
	 * OrderStatusAndReason7.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmRejected
	 * OrderStatusAndReason7.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmSuspended
	 * OrderStatusAndReason7.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmPartiallySettled
	 * OrderStatusAndReason7.mmPartiallySettled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended, PartiallySettled) must be present. This message element may be repeated more than once if allowed by its multiplicity."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended, PartiallySettled) must be present. This message element may be repeated more than once if allowed by its multiplicity.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason7.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason7.mmStatus, com.tools20022.repository.msg.OrderStatusAndReason7.mmCancelled,
					com.tools20022.repository.msg.OrderStatusAndReason7.mmConditionallyAccepted, com.tools20022.repository.msg.OrderStatusAndReason7.mmRejected, com.tools20022.repository.msg.OrderStatusAndReason7.mmSuspended,
					com.tools20022.repository.msg.OrderStatusAndReason7.mmPartiallySettled);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason7.mmMasterReference, com.tools20022.repository.msg.OrderStatusAndReason7.mmStatus,
						com.tools20022.repository.msg.OrderStatusAndReason7.mmCancelled, com.tools20022.repository.msg.OrderStatusAndReason7.mmConditionallyAccepted, com.tools20022.repository.msg.OrderStatusAndReason7.mmRejected,
						com.tools20022.repository.msg.OrderStatusAndReason7.mmSuspended, com.tools20022.repository.msg.OrderStatusAndReason7.mmPartiallySettled, com.tools20022.repository.msg.OrderStatusAndReason7.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV03.mmOrderDetailsReport);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OrderStatusAndReason7";
				definition = "Status report of a bulk or multiple or switch order that was previously received.";
				nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason10.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason7.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public OrderStatusAndReason7 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public OrderStatus4Code getStatus() {
		return status;
	}

	public OrderStatusAndReason7 setStatus(OrderStatus4Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CancelledStatus2 getCancelled() {
		return cancelled;
	}

	public OrderStatusAndReason7 setCancelled(com.tools20022.repository.msg.CancelledStatus2 cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ConditionallyAcceptedStatus2 getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public OrderStatusAndReason7 setConditionallyAccepted(com.tools20022.repository.msg.ConditionallyAcceptedStatus2 conditionallyAccepted) {
		this.conditionallyAccepted = Objects.requireNonNull(conditionallyAccepted);
		return this;
	}

	public List<RejectedStatus6> getRejected() {
		return rejected == null ? rejected = new ArrayList<>() : rejected;
	}

	public OrderStatusAndReason7 setRejected(List<com.tools20022.repository.msg.RejectedStatus6> rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public SuspendedStatus2 getSuspended() {
		return suspended;
	}

	public OrderStatusAndReason7 setSuspended(com.tools20022.repository.msg.SuspendedStatus2 suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public PartiallySettledStatus1 getPartiallySettled() {
		return partiallySettled;
	}

	public OrderStatusAndReason7 setPartiallySettled(com.tools20022.repository.msg.PartiallySettledStatus1 partiallySettled) {
		this.partiallySettled = Objects.requireNonNull(partiallySettled);
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public OrderStatusAndReason7 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}