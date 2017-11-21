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
import com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.OrderStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of the individual orders of a bulk or multiple order that was
 * previously received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmTypeOfStatusRule
 * IndividualOrderStatusAndReason1.mmTypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmStatus
 * IndividualOrderStatusAndReason1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmCancelled
 * IndividualOrderStatusAndReason1.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmConditionallyAccepted
 * IndividualOrderStatusAndReason1.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmInRepair
 * IndividualOrderStatusAndReason1.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRejected
 * IndividualOrderStatusAndReason1.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmSuspended
 * IndividualOrderStatusAndReason1.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRepairedConditions
 * IndividualOrderStatusAndReason1.mmRepairedConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmOrderReference
 * IndividualOrderStatusAndReason1.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmStatusInitiator
 * IndividualOrderStatusAndReason1.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmInvestmentAccountOrFinancialInstrument
 * IndividualOrderStatusAndReason1.mmInvestmentAccountOrFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmNewDetails
 * IndividualOrderStatusAndReason1.mmNewDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmIndividualOrderDetailsReport
 * OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualOrderStatusAndReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders of a bulk or multiple order that was previously received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IndividualOrderStatusAndReason1", propOrder = {"status", "cancelled", "conditionallyAccepted", "inRepair", "rejected", "suspended", "repairedConditions", "orderReference", "statusInitiator",
		"investmentAccountOrFinancialInstrument", "newDetails"})
public class IndividualOrderStatusAndReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OrderStatus2Code status;
	/**
	 * Status of the order is accepted or already executed or sent to next party
	 * or received. There is no reason attached.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the order is accepted or already executed or sent to next party or received. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus2Code.mmObject();
		}
	};
	protected CancelledStatus1 cancelled;
	/**
	 * Status of the individual order details is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CancelledStatus1
	 * CancelledStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the individual order details is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the individual order details is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancelledStatus1.mmObject();
		}
	};
	protected ConditionallyAcceptedStatus1 conditionallyAccepted;
	/**
	 * Status of the individual order details is conditionally accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1
	 * ConditionallyAcceptedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	 * "Status of the individual order details is conditionally accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of the individual order details is conditionally accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionallyAcceptedStatus1.mmObject();
		}
	};
	protected InRepairStatus1 inRepair;
	/**
	 * Status of the individual order details is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InRepairStatus1
	 * InRepairStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InRpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the individual order details is in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInRepair = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the individual order details is in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InRepairStatus1.mmObject();
		}
	};
	protected RejectedStatus3 rejected;
	/**
	 * Status of the individual order details is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus3
	 * RejectedStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the individual order details is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the individual order details is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RejectedStatus3.mmObject();
		}
	};
	protected SuspendedStatus1 suspended;
	/**
	 * Status of the individual order details is suspended.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the individual order details is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuspended = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the individual order details is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SuspendedStatus1.mmObject();
		}
	};
	protected RepairedConditions2 repairedConditions;
	/**
	 * Elements from the original individual order details that have been
	 * repaired so that the order can be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RepairedConditions2
	 * RepairedConditions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements from the original individual order details that have been repaired so that the order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairedConditions = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "RprdConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedConditions";
			definition = "Elements from the original individual order details that have been repaired so that the order can be accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RepairedConditions2.mmObject();
		}
	};
	protected Max35Text orderReference;
	/**
	 * Unique and unambiguous identifier for an order, as assigned by the
	 * instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * Party that initiates the status of the order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	public static final MMMessageAssociationEnd mmStatusInitiator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
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
	};
	protected InvestmentAccountOrFinancialInstrument1Choice investmentAccountOrFinancialInstrument;
	/**
	 * Choice between the investment account and the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice
	 * InvestmentAccountOrFinancialInstrument1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
	 * InvestmentFundOrder.mmRelatedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctOrFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountOrFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between the investment account and the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountOrFinancialInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRelatedTransaction;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctOrFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountOrFinancialInstrument";
			definition = "Choice between the investment account and the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOrFinancialInstrument1Choice.mmObject();
		}
	};
	protected ExpectedExecutionDetails1 newDetails;
	/**
	 * Information that has been added to the original order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1
	 * ExpectedExecutionDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information that has been added to the original order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "NewDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDetails";
			definition = "Information that has been added to the original order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails1.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Status, Cancelled,
	 * ConditionallyAccepted, InRepair, Rejected, Suspended, RepairedConditions)
	 * must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmStatus
	 * IndividualOrderStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmCancelled
	 * IndividualOrderStatusAndReason1.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmConditionallyAccepted
	 * IndividualOrderStatusAndReason1.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmInRepair
	 * IndividualOrderStatusAndReason1.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRejected
	 * IndividualOrderStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmSuspended
	 * IndividualOrderStatusAndReason1.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRepairedConditions
	 * IndividualOrderStatusAndReason1.mmRepairedConditions}</li>
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
	 * "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, InRepair, Rejected, Suspended, RepairedConditions) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmTypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, InRepair, Rejected, Suspended, RepairedConditions) must be present.";
			messageComponent_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason1.mmStatus, IndividualOrderStatusAndReason1.mmCancelled, IndividualOrderStatusAndReason1.mmConditionallyAccepted,
					IndividualOrderStatusAndReason1.mmInRepair, IndividualOrderStatusAndReason1.mmRejected, IndividualOrderStatusAndReason1.mmSuspended, IndividualOrderStatusAndReason1.mmRepairedConditions);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason1.mmStatus, IndividualOrderStatusAndReason1.mmCancelled, IndividualOrderStatusAndReason1.mmConditionallyAccepted,
						IndividualOrderStatusAndReason1.mmInRepair, IndividualOrderStatusAndReason1.mmRejected, IndividualOrderStatusAndReason1.mmSuspended, IndividualOrderStatusAndReason1.mmRepairedConditions,
						IndividualOrderStatusAndReason1.mmOrderReference, IndividualOrderStatusAndReason1.mmStatusInitiator, IndividualOrderStatusAndReason1.mmInvestmentAccountOrFinancialInstrument,
						IndividualOrderStatusAndReason1.mmNewDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IndividualOrderStatusAndReason1";
				definition = "Status report of the individual orders of a bulk or multiple order that was previously received.";
				xors_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason1.mmTypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sts", required = true)
	public OrderStatus2Code getStatus() {
		return status;
	}

	public void setStatus(OrderStatus2Code status) {
		this.status = status;
	}

	@XmlElement(name = "Canc", required = true)
	public CancelledStatus1 getCancelled() {
		return cancelled;
	}

	public void setCancelled(com.tools20022.repository.msg.CancelledStatus1 cancelled) {
		this.cancelled = cancelled;
	}

	@XmlElement(name = "CondlyAccptd", required = true)
	public ConditionallyAcceptedStatus1 getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public void setConditionallyAccepted(com.tools20022.repository.msg.ConditionallyAcceptedStatus1 conditionallyAccepted) {
		this.conditionallyAccepted = conditionallyAccepted;
	}

	@XmlElement(name = "InRpr", required = true)
	public InRepairStatus1 getInRepair() {
		return inRepair;
	}

	public void setInRepair(com.tools20022.repository.msg.InRepairStatus1 inRepair) {
		this.inRepair = inRepair;
	}

	@XmlElement(name = "Rjctd", required = true)
	public RejectedStatus3 getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.msg.RejectedStatus3 rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "Sspd", required = true)
	public SuspendedStatus1 getSuspended() {
		return suspended;
	}

	public void setSuspended(com.tools20022.repository.msg.SuspendedStatus1 suspended) {
		this.suspended = suspended;
	}

	@XmlElement(name = "RprdConds", required = true)
	public RepairedConditions2 getRepairedConditions() {
		return repairedConditions;
	}

	public void setRepairedConditions(com.tools20022.repository.msg.RepairedConditions2 repairedConditions) {
		this.repairedConditions = repairedConditions;
	}

	@XmlElement(name = "OrdrRef", required = true)
	public Max35Text getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
	}

	@XmlElement(name = "StsInitr")
	public PartyIdentification2Choice getStatusInitiator() {
		return statusInitiator;
	}

	public void setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
	}

	@XmlElement(name = "InvstmtAcctOrFinInstrm")
	public InvestmentAccountOrFinancialInstrument1Choice getInvestmentAccountOrFinancialInstrument() {
		return investmentAccountOrFinancialInstrument;
	}

	public void setInvestmentAccountOrFinancialInstrument(InvestmentAccountOrFinancialInstrument1Choice investmentAccountOrFinancialInstrument) {
		this.investmentAccountOrFinancialInstrument = investmentAccountOrFinancialInstrument;
	}

	@XmlElement(name = "NewDtls")
	public ExpectedExecutionDetails1 getNewDetails() {
		return newDetails;
	}

	public void setNewDetails(com.tools20022.repository.msg.ExpectedExecutionDetails1 newDetails) {
		this.newDetails = newDetails;
	}
}