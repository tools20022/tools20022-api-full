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
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV02;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.OrderStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CancelledStatus1;
import com.tools20022.repository.msg.ConditionallyAcceptedStatus1;
import com.tools20022.repository.msg.RejectedStatus3;
import com.tools20022.repository.msg.SuspendedStatus1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#TypeOfStatusRule
 * OrderStatusAndReason3.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmStatus
 * OrderStatusAndReason3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmCancelled
 * OrderStatusAndReason3.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmConditionallyAccepted
 * OrderStatusAndReason3.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmRejected
 * OrderStatusAndReason3.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmSuspended
 * OrderStatusAndReason3.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmStatusInitiator
 * OrderStatusAndReason3.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmSwitchOrderLegIdentification
 * OrderStatusAndReason3.mmSwitchOrderLegIdentification}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOrderDetailsReport
 * OrderInstructionStatusReportV02.mmOrderDetailsReport}</li>
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
 * "OrderStatusAndReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of a bulk or multiple or switch order that was previously received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatusAndReason3", propOrder = {"status", "cancelled", "conditionallyAccepted", "rejected", "suspended", "statusInitiator", "switchOrderLegIdentification"})
public class OrderStatusAndReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected OrderStatus2Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus2Code
	 * OrderStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * "Status of the order is accepted or already executed or sent to next party or received. There is no reason attached."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderStatusAndReason3, OrderStatus2Code> mmStatus = new MMMessageAttribute<OrderStatusAndReason3, OrderStatus2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the order is accepted or already executed or sent to next party or received. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus2Code.mmObject();
		}

		@Override
		public OrderStatus2Code getValue(OrderStatusAndReason3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, OrderStatus2Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus1 cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CancelledStatus1
	 * CancelledStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * "Status of the order details is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason3, CancelledStatus1> mmCancelled = new MMMessageAssociationEnd<OrderStatusAndReason3, CancelledStatus1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the order details is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus1.mmObject();
		}

		@Override
		public CancelledStatus1 getValue(OrderStatusAndReason3 obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, CancelledStatus1 value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "CondlyAccptd", required = true)
	protected ConditionallyAcceptedStatus1 conditionallyAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1
	 * ConditionallyAcceptedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * definition} = "Status of the order details is conditionally accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason3, ConditionallyAcceptedStatus1> mmConditionallyAccepted = new MMMessageAssociationEnd<OrderStatusAndReason3, ConditionallyAcceptedStatus1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of the order details is conditionally accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConditionallyAcceptedStatus1.mmObject();
		}

		@Override
		public ConditionallyAcceptedStatus1 getValue(OrderStatusAndReason3 obj) {
			return obj.getConditionallyAccepted();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, ConditionallyAcceptedStatus1 value) {
			obj.setConditionallyAccepted(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus3 rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus3
	 * RejectedStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * "Status of the order details is rejected. This status is used for orders that have not been accepted or entered in an order book."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason3, RejectedStatus3> mmRejected = new MMMessageAssociationEnd<OrderStatusAndReason3, RejectedStatus3>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the order details is rejected. This status is used for orders that have not been accepted or entered in an order book.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus3.mmObject();
		}

		@Override
		public RejectedStatus3 getValue(OrderStatusAndReason3 obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, RejectedStatus3 value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatus1 suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SuspendedStatus1
	 * SuspendedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * definition} = "Status of the order details is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason3, SuspendedStatus1> mmSuspended = new MMMessageAssociationEnd<OrderStatusAndReason3, SuspendedStatus1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the order details is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SuspendedStatus1.mmObject();
		}

		@Override
		public SuspendedStatus1 getValue(OrderStatusAndReason3 obj) {
			return obj.getSuspended();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, SuspendedStatus1 value) {
			obj.setSuspended(value);
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason3, Optional<PartyIdentification2Choice>> mmStatusInitiator = new MMMessageAssociationEnd<OrderStatusAndReason3, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(OrderStatusAndReason3 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, Optional<PartyIdentification2Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "SwtchOrdrLegId")
	protected Max35Text switchOrderLegIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchOrdrLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOrderLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous technical identification of an instance of a leg within a switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderStatusAndReason3, Optional<Max35Text>> mmSwitchOrderLegIdentification = new MMMessageAttribute<OrderStatusAndReason3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "SwtchOrdrLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderLegIdentification";
			definition = "Unique and unambiguous technical identification of an instance of a leg within a switch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OrderStatusAndReason3 obj) {
			return obj.getSwitchOrderLegIdentification();
		}

		@Override
		public void setValue(OrderStatusAndReason3 obj, Optional<Max35Text> value) {
			obj.setSwitchOrderLegIdentification(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (Status, Cancelled,
	 * ConditionallyAccepted, Rejected, Suspended) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmStatus
	 * OrderStatusAndReason3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmCancelled
	 * OrderStatusAndReason3.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmConditionallyAccepted
	 * OrderStatusAndReason3.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmRejected
	 * OrderStatusAndReason3.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmSuspended
	 * OrderStatusAndReason3.mmSuspended}</li>
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
	 * "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason3.mmStatus, com.tools20022.repository.msg.OrderStatusAndReason3.mmCancelled,
					com.tools20022.repository.msg.OrderStatusAndReason3.mmConditionallyAccepted, com.tools20022.repository.msg.OrderStatusAndReason3.mmRejected, com.tools20022.repository.msg.OrderStatusAndReason3.mmSuspended);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason3.mmStatus, com.tools20022.repository.msg.OrderStatusAndReason3.mmCancelled,
						com.tools20022.repository.msg.OrderStatusAndReason3.mmConditionallyAccepted, com.tools20022.repository.msg.OrderStatusAndReason3.mmRejected, com.tools20022.repository.msg.OrderStatusAndReason3.mmSuspended,
						com.tools20022.repository.msg.OrderStatusAndReason3.mmStatusInitiator, com.tools20022.repository.msg.OrderStatusAndReason3.mmSwitchOrderLegIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmOrderDetailsReport);
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
				name = "OrderStatusAndReason3";
				definition = "Status report of a bulk or multiple or switch order that was previously received.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason3.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public OrderStatus2Code getStatus() {
		return status;
	}

	public OrderStatusAndReason3 setStatus(OrderStatus2Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public CancelledStatus1 getCancelled() {
		return cancelled;
	}

	public OrderStatusAndReason3 setCancelled(CancelledStatus1 cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ConditionallyAcceptedStatus1 getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public OrderStatusAndReason3 setConditionallyAccepted(ConditionallyAcceptedStatus1 conditionallyAccepted) {
		this.conditionallyAccepted = Objects.requireNonNull(conditionallyAccepted);
		return this;
	}

	public RejectedStatus3 getRejected() {
		return rejected;
	}

	public OrderStatusAndReason3 setRejected(RejectedStatus3 rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public SuspendedStatus1 getSuspended() {
		return suspended;
	}

	public OrderStatusAndReason3 setSuspended(SuspendedStatus1 suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public OrderStatusAndReason3 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}

	public Optional<Max35Text> getSwitchOrderLegIdentification() {
		return switchOrderLegIdentification == null ? Optional.empty() : Optional.of(switchOrderLegIdentification);
	}

	public OrderStatusAndReason3 setSwitchOrderLegIdentification(Max35Text switchOrderLegIdentification) {
		this.switchOrderLegIdentification = switchOrderLegIdentification;
		return this;
	}
}