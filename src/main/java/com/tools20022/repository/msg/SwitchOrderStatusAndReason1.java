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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Status report of the individual orders of a bulk or multiple order that was
 * previously received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmTypeOfStatusRule
 * SwitchOrderStatusAndReason1.mmTypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmMasterReference
 * SwitchOrderStatusAndReason1.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderReference
 * SwitchOrderStatusAndReason1.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmClientReference
 * SwitchOrderStatusAndReason1.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmDealReference
 * SwitchOrderStatusAndReason1.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmCancellationReference
 * SwitchOrderStatusAndReason1.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmStatus
 * SwitchOrderStatusAndReason1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmCancelled
 * SwitchOrderStatusAndReason1.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmConditionallyAccepted
 * SwitchOrderStatusAndReason1.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmRejected
 * SwitchOrderStatusAndReason1.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmSuspended
 * SwitchOrderStatusAndReason1.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmInRepair
 * SwitchOrderStatusAndReason1.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmPartiallySettled
 * SwitchOrderStatusAndReason1.mmPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmLegInformation
 * SwitchOrderStatusAndReason1.mmLegInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmStatusInitiator
 * SwitchOrderStatusAndReason1.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderData
 * SwitchOrderStatusAndReason1.mmOrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmNewDetails
 * SwitchOrderStatusAndReason1.mmNewDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchOrder
 * SwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmSwitchOrderDetailsReport
 * OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport}</li>
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
 * "SwitchOrderStatusAndReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders of a bulk or multiple order that was previously received."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
 * SwitchOrderStatusAndReason2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SwitchOrderStatusAndReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text masterReference;
	/**
	 * Reference assigned to a set of orders or trades in order to link them
	 * together.
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmMasterReference
	 * SwitchOrderStatusAndReason2.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderReference
	 * SwitchOrderStatusAndReason2.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of an order. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the order as assigned by the underlying client.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmClientReference
	 * SwitchOrderStatusAndReason2.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text dealReference;
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmDealReference
	 * SwitchOrderStatusAndReason2.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmDealReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cancellationReference;
	/**
	 * Unique and unambiguous identifier for an order cancellation, as assigned
	 * by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmCancellationReference
	 * SwitchOrderStatusAndReason2.mmCancellationReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmCancellationReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected OrderStatus4Code status;
	/**
	 * Status of the switch order is accepted or already executed or sent to
	 * next party or received. There is no reason attached.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * "Status of the switch order is accepted or already executed or sent to next party or received. There is no reason attached."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the switch order is accepted or already executed or sent to next party or received. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus4Code.mmObject();
		}
	};
	protected CancelledStatus2 cancelled;
	/**
	 * Status of the switch order is cancelled. This status is used for an order
	 * that has been accepted or that has been entered in an order book but that
	 * can not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CancelledStatus2
	 * CancelledStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCancellationStatus
	 * SecuritiesOrderStatus.mmCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * "Status of the switch order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that can not be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmCancellationStatus;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the switch order is cancelled. This status is used for an order that has been accepted or that has been entered in an order book but that can not be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CancelledStatus2.mmObject();
		}
	};
	protected ConditionallyAcceptedStatus2 conditionallyAccepted;
	/**
	 * Status of the switch order is conditionally accepted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the switch order is conditionally accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of the switch order is conditionally accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionallyAcceptedStatus2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RejectedStatus6> rejected;
	/**
	 * Status of the switch order is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus6
	 * RejectedStatus6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the switch order is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderStatus;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the switch order is rejected.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RejectedStatus6.mmObject();
		}
	};
	protected SuspendedStatus2 suspended;
	/**
	 * Status of the switch order is suspended.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the switch order is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuspended = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the switch order is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SuspendedStatus2.mmObject();
		}
	};
	protected InRepairStatus2 inRepair;
	/**
	 * Status of the switch order is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InRepairStatus2
	 * InRepairStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the switch order is in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderStatus;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the switch order is in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InRepairStatus2.mmObject();
		}
	};
	protected PartiallySettledStatus1 partiallySettled;
	/**
	 * Status of the switch order is partially settled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * definition} = "Status of the switch order is partially settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartiallySettled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of the switch order is partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartiallySettledStatus1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SwitchLegReferences1> legInformation;
	/**
	 * Information about a switch leg that is rejected or repaired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about a switch leg that is rejected or repaired."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmLegInformation
	 * SwitchOrderStatusAndReason2.mmLegInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "LegInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegInformation";
			definition = "Information about a switch leg that is rejected or repaired.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmLegInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmStatusInitiator
	 * SwitchOrderStatusAndReason2.mmStatusInitiator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusInitiator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmStatusInitiator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected FundOrderData2 orderData;
	/**
	 * Order data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderData2
	 * FundOrderData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderData
	 * SwitchOrderStatusAndReason2.mmOrderData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderData = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SwitchOrder.mmObject();
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "OrdrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderData";
			definition = "Order data.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmOrderData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundOrderData2.mmObject();
		}
	};
	protected ExpectedExecutionDetails2 newDetails;
	/**
	 * Information that has been added to the original order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
	 * ExpectedExecutionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmNewDetails
	 * SwitchOrderStatusAndReason2.mmNewDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "NewDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDetails";
			definition = "Information that has been added to the original order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmNewDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails2.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Status, Cancelled,
	 * ConditionallyAccepted, Rejected, Suspended, InRepair, PartiallySettled)
	 * must be present. This message element may be repeated more than once if
	 * allowed by its multiplicity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmStatus
	 * SwitchOrderStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmCancelled
	 * SwitchOrderStatusAndReason1.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmConditionallyAccepted
	 * SwitchOrderStatusAndReason1.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmRejected
	 * SwitchOrderStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmSuspended
	 * SwitchOrderStatusAndReason1.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmInRepair
	 * SwitchOrderStatusAndReason1.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmPartiallySettled
	 * SwitchOrderStatusAndReason1.mmPartiallySettled}</li>
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
	 * "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended, InRepair, PartiallySettled) must be present. This message element may be repeated more than once if allowed by its multiplicity."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmTypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, Cancelled, ConditionallyAccepted, Rejected, Suspended, InRepair, PartiallySettled) must be present. This message element may be repeated more than once if allowed by its multiplicity.";
			messageComponent_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason1.mmStatus, SwitchOrderStatusAndReason1.mmCancelled, SwitchOrderStatusAndReason1.mmConditionallyAccepted, SwitchOrderStatusAndReason1.mmRejected,
					SwitchOrderStatusAndReason1.mmSuspended, SwitchOrderStatusAndReason1.mmInRepair, SwitchOrderStatusAndReason1.mmPartiallySettled);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason1.mmMasterReference, SwitchOrderStatusAndReason1.mmOrderReference, SwitchOrderStatusAndReason1.mmClientReference,
						SwitchOrderStatusAndReason1.mmDealReference, SwitchOrderStatusAndReason1.mmCancellationReference, SwitchOrderStatusAndReason1.mmStatus, SwitchOrderStatusAndReason1.mmCancelled,
						SwitchOrderStatusAndReason1.mmConditionallyAccepted, SwitchOrderStatusAndReason1.mmRejected, SwitchOrderStatusAndReason1.mmSuspended, SwitchOrderStatusAndReason1.mmInRepair,
						SwitchOrderStatusAndReason1.mmPartiallySettled, SwitchOrderStatusAndReason1.mmLegInformation, SwitchOrderStatusAndReason1.mmStatusInitiator, SwitchOrderStatusAndReason1.mmOrderData,
						SwitchOrderStatusAndReason1.mmNewDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport);
				trace_lazy = () -> SwitchOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SwitchOrderStatusAndReason1";
				definition = "Status report of the individual orders of a bulk or multiple order that was previously received.";
				nextVersions_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason2.mmObject());
				xors_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason1.mmTypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	public Max35Text getDealReference() {
		return dealReference;
	}

	public void setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
	}

	public Max35Text getCancellationReference() {
		return cancellationReference;
	}

	public void setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
	}

	public OrderStatus4Code getStatus() {
		return status;
	}

	public void setStatus(OrderStatus4Code status) {
		this.status = status;
	}

	public CancelledStatus2 getCancelled() {
		return cancelled;
	}

	public void setCancelled(com.tools20022.repository.msg.CancelledStatus2 cancelled) {
		this.cancelled = cancelled;
	}

	public ConditionallyAcceptedStatus2 getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public void setConditionallyAccepted(com.tools20022.repository.msg.ConditionallyAcceptedStatus2 conditionallyAccepted) {
		this.conditionallyAccepted = conditionallyAccepted;
	}

	public List<RejectedStatus6> getRejected() {
		return rejected;
	}

	public void setRejected(List<com.tools20022.repository.msg.RejectedStatus6> rejected) {
		this.rejected = rejected;
	}

	public SuspendedStatus2 getSuspended() {
		return suspended;
	}

	public void setSuspended(com.tools20022.repository.msg.SuspendedStatus2 suspended) {
		this.suspended = suspended;
	}

	public InRepairStatus2 getInRepair() {
		return inRepair;
	}

	public void setInRepair(com.tools20022.repository.msg.InRepairStatus2 inRepair) {
		this.inRepair = inRepair;
	}

	public PartiallySettledStatus1 getPartiallySettled() {
		return partiallySettled;
	}

	public void setPartiallySettled(com.tools20022.repository.msg.PartiallySettledStatus1 partiallySettled) {
		this.partiallySettled = partiallySettled;
	}

	public List<SwitchLegReferences1> getLegInformation() {
		return legInformation;
	}

	public void setLegInformation(List<com.tools20022.repository.msg.SwitchLegReferences1> legInformation) {
		this.legInformation = legInformation;
	}

	public PartyIdentification2Choice getStatusInitiator() {
		return statusInitiator;
	}

	public void setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
	}

	public FundOrderData2 getOrderData() {
		return orderData;
	}

	public void setOrderData(com.tools20022.repository.msg.FundOrderData2 orderData) {
		this.orderData = orderData;
	}

	public ExpectedExecutionDetails2 getNewDetails() {
		return newDetails;
	}

	public void setNewDetails(com.tools20022.repository.msg.ExpectedExecutionDetails2 newDetails) {
		this.newDetails = newDetails;
	}
}