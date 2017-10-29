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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a securities order or of the processing of a securities order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderStatus"
 * src="doc-files/SecuritiesOrderStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#ConfirmationRejectedStatusReason
 * SecuritiesOrderStatus.ConfirmationRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#ConfirmationStatus
 * SecuritiesOrderStatus.ConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CancellationStatus
 * SecuritiesOrderStatus.CancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#PartiallySettledStatusReason
 * SecuritiesOrderStatus.PartiallySettledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SuspendedStatusReason
 * SecuritiesOrderStatus.SuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#ListOrderStatus
 * SecuritiesOrderStatus.ListOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SecuritiesOrder
 * SecuritiesOrderStatus.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#InvestmentFundOrder
 * SecuritiesOrderStatus.InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CumulativeQuantity
 * SecuritiesOrderStatus.CumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#RemainingQuantity
 * SecuritiesOrderStatus.RemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#ConditionallyAcceptedStatus
 * SecuritiesOrderStatus.ConditionallyAcceptedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#OrderStatus
 * SecuritiesOrderStatus.OrderStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderStatus
 * InvestmentFundOrder.OrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderStatus
 * SecuritiesQuantity.RelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesOrderStatus
 * SecuritiesQuantity.SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Status
 * SecuritiesOrder.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#Rejected
 * IndividualOrderStatusAndReason4.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatus1#Reason
 * SuspendedStatus1.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#InRepair
 * IndividualOrderStatusAndReason1.InRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#RepairedConditions
 * IndividualOrderStatusAndReason1.RepairedConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#Rejected
 * IndividualOrderStatusAndReason2.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#RepairedConditions
 * IndividualOrderStatusAndReason2.RepairedConditions}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus1Choice#Rejected
 * OrderStatus1Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#StatusDetails
 * IndividualOrderStatusAndReason3.StatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#Rejected
 * IndividualOrderStatusAndReason5.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#OrderStatusDetails
 * OrderStatusAndReason5.OrderStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#SingleOrderStatusDetails
 * OrderStatus3.SingleOrderStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#SingleOrderDetails
 * OrderStatus2.SingleOrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Rejected
 * OrderStatus5Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#AmendmentRejected
 * ConfirmationStatus1Choice.AmendmentRejected}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Rejected
 * OrderStatus3Choice.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus4Choice#Rejected
 * OrderStatus4Choice.Rejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason4
 * RejectedStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus4
 * RejectedStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason4
 * OrderStatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus7
 * RejectedStatus7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
 * OrderStatusAndReason8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4
 * IndividualOrderStatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
 * ConfirmationRejectedStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1
 * ConditionallyAcceptedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1
 * ConditionallyAcceptedStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason6
 * RejectedStatusReason6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus3
 * RejectedStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason1
 * SuspendedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatus1
 * SuspendedStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
 * OrderStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1
 * InRepairStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairedConditions2
 * RepairedConditions2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
 * IndividualOrderStatusAndReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2
 * ConditionallyAcceptedStatusReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2
 * ConditionallyAcceptedStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus6
 * RejectedStatus6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
 * SuspendedStatusReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatus2
 * SuspendedStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
 * PartiallySettledStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
 * OrderStatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus2
 * InRepairStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RepairedConditions3
 * RepairedConditions3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2
 * IndividualOrderStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus3
 * InRepairStatus3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice
 * ConditionallyAcceptedStatusReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice
 * RejectedStatusReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice
 * SuspendedStatusReasonChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartiallySettledStatus2
 * PartiallySettledStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus1Choice
 * OrderStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
 * IndividualOrderStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus8
 * RejectedStatus8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5
 * IndividualOrderStatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus1 OrderStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason5
 * OrderStatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus2 OrderStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InRepairStatus4Choice
 * InRepairStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice
 * SuspendedStatusReason4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
 * ConditionallyAcceptedStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus9
 * RejectedStatus9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
 * PartiallySettledStatus10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice
 * InRepairStatusReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
 * ConfirmationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
 * ConfirmationRejectedStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
 * IndividualOrderStatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason10
 * OrderStatusAndReason10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason9
 * OrderStatusAndReason9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8
 * IndividualOrderStatusAndReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus10
 * RejectedStatus10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice
 * ConfirmationRejectedReason1Choice}</li>
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
 * "SecuritiesOrderStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a securities order or of the processing of a securities order."</li>
 * </ul>
 */
public class SecuritiesOrderStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason for a confirmation rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
	 * RejectedConfirmationStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#Reason
	 * ConfirmationRejectedStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#ConfirmationRejected
	 * ConfirmationStatus1Choice.ConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#Reason
	 * ConfirmationRejectedStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice#Code
	 * ConfirmationRejectedReason1Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for a confirmation rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConfirmationRejectedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationRejectedStatus1.Reason, com.tools20022.repository.choice.ConfirmationStatus1Choice.ConfirmationRejected,
					com.tools20022.repository.msg.ConfirmationRejectedStatus2.Reason, com.tools20022.repository.choice.ConfirmationRejectedReason1Choice.Code);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationRejectedStatusReason";
			definition = "Specifies the reason for a confirmation rejected status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
		}
	};
	/**
	 * Status of the confirmation of a status order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
	 * OrderConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#Status
	 * IndividualOrderConfirmationStatusAndReason1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#Status
	 * ConfirmationStatus1Choice.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the confirmation of a status order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConfirmationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.Status, com.tools20022.repository.choice.ConfirmationStatus1Choice.Status);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationStatus";
			definition = "Status of the confirmation of a status order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatusCode.mmObject();
		}
	};
	/**
	 * Status of the cancellation of a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
	 * OrderCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#Status
	 * OrderStatusAndReason8.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#Status
	 * IndividualOrderStatusAndReason4.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#Cancelled
	 * SwitchOrderStatusAndReason1.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#Status
	 * CancellationStatus22Choice.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason8.Status, com.tools20022.repository.msg.IndividualOrderStatusAndReason4.Status,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason1.Cancelled, com.tools20022.repository.choice.CancellationStatus22Choice.Status);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a securities order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatusCode.mmObject();
		}
	};
	/**
	 * Reason for the partially settled status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#Reason
	 * PartiallySettledStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#PartiallySettled
	 * OrderStatusAndReason7.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#PartiallySettled
	 * IndividualOrderStatusAndReason2.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#PartiallySettled
	 * SwitchOrderStatusAndReason1.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartiallySettledStatus2#Reason
	 * PartiallySettledStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartiallySettledStatus2#Proprietary
	 * PartiallySettledStatus2.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#PartiallySettled
	 * OrderStatus1Choice.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#PartiallySettled
	 * OrderStatus5Choice.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#Reason
	 * PartiallySettledStatus10.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#PartiallySettled
	 * OrderStatus3Choice.PartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#PartiallySettled
	 * OrderStatus4Choice.PartiallySettled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettledStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartiallySettledStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartiallySettledStatus1.Reason, com.tools20022.repository.msg.OrderStatusAndReason7.PartiallySettled,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason2.PartiallySettled, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.PartiallySettled,
					com.tools20022.repository.choice.PartiallySettledStatus2.Reason, com.tools20022.repository.choice.PartiallySettledStatus2.Proprietary, com.tools20022.repository.choice.OrderStatus1Choice.PartiallySettled,
					com.tools20022.repository.choice.OrderStatus5Choice.PartiallySettled, com.tools20022.repository.msg.PartiallySettledStatus10.Reason, com.tools20022.repository.choice.OrderStatus3Choice.PartiallySettled,
					com.tools20022.repository.choice.OrderStatus4Choice.PartiallySettled);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallySettledStatusReason";
			definition = "Reason for the partially settled status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the suspended status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
	 * SuspendedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason1#Structured
	 * SuspendedStatusReason1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#Suspended
	 * OrderStatusAndReason3.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#Suspended
	 * IndividualOrderStatusAndReason1.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#Reason
	 * SuspendedStatusReason2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus2#ReasonDetails
	 * SuspendedStatus2.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#Suspended
	 * OrderStatusAndReason7.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#Suspended
	 * IndividualOrderStatusAndReason2.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#Suspended
	 * SwitchOrderStatusAndReason1.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#Reason
	 * SuspendedStatusReasonChoice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#Proprietary
	 * SuspendedStatusReasonChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#Suspended
	 * OrderStatus1Choice.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Suspended
	 * OrderStatus5Choice.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Suspended
	 * OrderStatus3Choice.Suspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#Suspended
	 * OrderStatus4Choice.Suspended}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuspendedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SuspendedStatusReason1.Structured, com.tools20022.repository.msg.OrderStatusAndReason3.Suspended,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason1.Suspended, com.tools20022.repository.msg.SuspendedStatusReason2.Reason, com.tools20022.repository.msg.SuspendedStatus2.ReasonDetails,
					com.tools20022.repository.msg.OrderStatusAndReason7.Suspended, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.Suspended, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.Suspended,
					com.tools20022.repository.choice.SuspendedStatusReasonChoice.Reason, com.tools20022.repository.choice.SuspendedStatusReasonChoice.Proprietary, com.tools20022.repository.choice.OrderStatus1Choice.Suspended,
					com.tools20022.repository.choice.OrderStatus5Choice.Suspended, com.tools20022.repository.choice.OrderStatus3Choice.Suspended, com.tools20022.repository.choice.OrderStatus4Choice.Suspended);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason for the suspended status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a list order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ListStatusTypeCode
	 * ListStatusTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#ListStatusType
	 * OrderStatus2.ListStatusType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a list order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ListOrderStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatus2.ListStatusType);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListOrderStatus";
			definition = "Specifies the status of a list order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ListStatusTypeCode.mmObject();
		}
	};
	/**
	 * Order for which a status is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Status
	 * SecuritiesOrder.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a status is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund order for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderStatus
	 * InvestmentFundOrder.OrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#OrderData
	 * IndividualOrderStatusAndReason2.OrderData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#OrderData
	 * IndividualOrderStatusAndReason3.OrderData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#OrderData
	 * IndividualOrderStatusAndReason7.OrderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason2.OrderData, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.OrderData,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason7.OrderData);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "Investment fund order for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total quantity (for instance number of shares) filled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesOrderStatus
	 * SecuritiesQuantity.SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#CumulativeQuantity
	 * OrderStatus1.CumulativeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#CumulativeQuantity
	 * OrderStatus3.CumulativeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity (for instance number of shares) filled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CumulativeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatus1.CumulativeQuantity, com.tools20022.repository.msg.OrderStatus3.CumulativeQuantity);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (for instance number of shares) filled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity opened for further execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderStatus
	 * SecuritiesQuantity.RelatedOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#RemainingQuantity
	 * PartialFill1.RemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#RemainingQuantity
	 * OrderStatus1.RemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#RemainingQuantity
	 * OrderStatus3.RemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#RemainingQuantity
	 * PartialFill2.RemainingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity opened for further execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RemainingQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartialFill1.RemainingQuantity, com.tools20022.repository.msg.OrderStatus1.RemainingQuantity, com.tools20022.repository.msg.OrderStatus3.RemainingQuantity,
					com.tools20022.repository.msg.PartialFill2.RemainingQuantity);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for the conditionally accepted status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
	 * ConditionallyAcceptedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#Structured
	 * ConditionallyAcceptedStatusReason1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#AdditionalInformation
	 * ConditionallyAcceptedStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#Reason
	 * ConditionallyAcceptedStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#ConditionallyAccepted
	 * OrderStatusAndReason3.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#Reason
	 * ConditionallyAcceptedStatusReason2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#AdditionalInformation
	 * ConditionallyAcceptedStatusReason2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#ReasonDetails
	 * ConditionallyAcceptedStatus2.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#ConditionallyAccepted
	 * OrderStatusAndReason7.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#ConditionallyAccepted
	 * IndividualOrderStatusAndReason2.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#ConditionallyAccepted
	 * SwitchOrderStatusAndReason1.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#Reason
	 * ConditionallyAcceptedStatusReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#Proprietary
	 * ConditionallyAcceptedStatusReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#ConditionallyAccepted
	 * OrderStatus1Choice.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#ConditionallyAccepted
	 * OrderStatus5Choice.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#ReasonDetails
	 * SuspendedStatusReason4Choice.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#ReasonDetails
	 * ConditionallyAcceptedStatus3Choice.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#ReasonDetails
	 * InRepairStatusReason4Choice.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#ConditionallyAccepted
	 * OrderStatus3Choice.ConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#ConditionallyAccepted
	 * OrderStatus4Choice.ConditionallyAccepted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyAcceptedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the conditionally accepted status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConditionallyAcceptedStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1.Structured, com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.ConditionallyAcceptedStatus1.Reason, com.tools20022.repository.msg.OrderStatusAndReason3.ConditionallyAccepted, com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2.Reason,
					com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2.AdditionalInformation, com.tools20022.repository.msg.ConditionallyAcceptedStatus2.ReasonDetails,
					com.tools20022.repository.msg.OrderStatusAndReason7.ConditionallyAccepted, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.ConditionallyAccepted,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason1.ConditionallyAccepted, com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice.Reason,
					com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice.Proprietary, com.tools20022.repository.choice.OrderStatus1Choice.ConditionallyAccepted,
					com.tools20022.repository.choice.OrderStatus5Choice.ConditionallyAccepted, com.tools20022.repository.choice.SuspendedStatusReason4Choice.ReasonDetails,
					com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.ReasonDetails, com.tools20022.repository.choice.InRepairStatusReason4Choice.ReasonDetails,
					com.tools20022.repository.choice.OrderStatus3Choice.ConditionallyAccepted, com.tools20022.repository.choice.OrderStatus4Choice.ConditionallyAccepted);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionallyAcceptedStatus";
			definition = "Reason for the conditionally accepted status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Indicates the status of an order at a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
	 * OrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason4#Status
	 * OrderStatusAndReason4.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#Status
	 * OrderStatusAndReason3.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#Status
	 * IndividualOrderStatusAndReason1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#Status
	 * OrderStatusAndReason7.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#Status
	 * IndividualOrderStatusAndReason2.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#Status
	 * SwitchOrderStatusAndReason1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#Status
	 * OrderStatus1Choice.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#Status
	 * IndividualOrderStatusAndReason5.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#Status
	 * OrderStatusAndReason5.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#ListOrderStatus
	 * OrderStatus2.ListOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Status
	 * OrderStatus5Choice.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#OrderStatus
	 * IndividualOrderStatusAndReason7.OrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#OrderStatus
	 * SwitchOrderStatusAndReason2.OrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#OrderStatus
	 * OrderStatusAndReason10.OrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Status
	 * OrderStatus3Choice.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#Status
	 * OrderStatus4Choice.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an order at a specific point in time."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason4.Status, com.tools20022.repository.msg.OrderStatusAndReason3.Status, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.Status,
					com.tools20022.repository.msg.OrderStatusAndReason7.Status, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.Status, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.Status,
					com.tools20022.repository.choice.OrderStatus1Choice.Status, com.tools20022.repository.msg.IndividualOrderStatusAndReason5.Status, com.tools20022.repository.msg.OrderStatusAndReason5.Status,
					com.tools20022.repository.msg.OrderStatus2.ListOrderStatus, com.tools20022.repository.choice.OrderStatus5Choice.Status, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.OrderStatus,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason2.OrderStatus, com.tools20022.repository.msg.OrderStatusAndReason10.OrderStatus, com.tools20022.repository.choice.OrderStatus3Choice.Status,
					com.tools20022.repository.choice.OrderStatus4Choice.Status);
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderStatus";
				definition = "Status of a securities order or of the processing of a securities order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesOrder.Status);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason4.Rejected, com.tools20022.repository.msg.SuspendedStatus1.Reason,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason1.InRepair, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.RepairedConditions,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason2.Rejected, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.RepairedConditions, com.tools20022.repository.choice.OrderStatus1Choice.Rejected,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason3.StatusDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason5.Rejected,
						com.tools20022.repository.msg.OrderStatusAndReason5.OrderStatusDetails, com.tools20022.repository.msg.OrderStatus3.SingleOrderStatusDetails, com.tools20022.repository.msg.OrderStatus2.SingleOrderDetails,
						com.tools20022.repository.choice.OrderStatus5Choice.Rejected, com.tools20022.repository.choice.ConfirmationStatus1Choice.AmendmentRejected, com.tools20022.repository.choice.OrderStatus3Choice.Rejected,
						com.tools20022.repository.choice.OrderStatus4Choice.Rejected);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderStatus.ConfirmationRejectedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.ConfirmationStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.CancellationStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.PartiallySettledStatusReason,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SuspendedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.ListOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.ConditionallyAcceptedStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.OrderStatus);
				derivationComponent_lazy = () -> Arrays.asList(RejectedStatusReason4.mmObject(), RejectedStatus4.mmObject(), OrderStatusAndReason4.mmObject(), RejectedStatus7.mmObject(), OrderStatusAndReason8.mmObject(),
						IndividualOrderStatusAndReason4.mmObject(), ConfirmationRejectedStatus1.mmObject(), ConditionallyAcceptedStatusReason1.mmObject(), ConditionallyAcceptedStatus1.mmObject(), RejectedStatusReason6.mmObject(),
						RejectedStatus3.mmObject(), SuspendedStatusReason1.mmObject(), SuspendedStatus1.mmObject(), OrderStatusAndReason3.mmObject(), InRepairStatus1.mmObject(), RepairedConditions2.mmObject(),
						IndividualOrderStatusAndReason1.mmObject(), ConditionallyAcceptedStatusReason2.mmObject(), ConditionallyAcceptedStatus2.mmObject(), RejectedStatus6.mmObject(), SuspendedStatusReason2.mmObject(),
						SuspendedStatus2.mmObject(), PartiallySettledStatus1.mmObject(), OrderStatusAndReason7.mmObject(), InRepairStatus2.mmObject(), RepairedConditions3.mmObject(), IndividualOrderStatusAndReason2.mmObject(),
						InRepairStatus3.mmObject(), ConditionallyAcceptedStatusReason1Choice.mmObject(), RejectedStatusReason1Choice.mmObject(), SuspendedStatusReasonChoice.mmObject(), PartiallySettledStatus2.mmObject(),
						OrderStatus1Choice.mmObject(), IndividualOrderStatusAndReason3.mmObject(), RejectedStatus8.mmObject(), IndividualOrderStatusAndReason5.mmObject(), OrderStatus1.mmObject(), OrderStatusAndReason5.mmObject(),
						OrderStatus3.mmObject(), OrderStatus2.mmObject(), InRepairStatus4Choice.mmObject(), SuspendedStatusReason4Choice.mmObject(), ConditionallyAcceptedStatus3Choice.mmObject(), RejectedStatus9.mmObject(),
						PartiallySettledStatus10.mmObject(), InRepairStatusReason4Choice.mmObject(), ConfirmationStatus1Choice.mmObject(), ConfirmationRejectedStatus2.mmObject(), IndividualOrderStatusAndReason7.mmObject(),
						OrderStatusAndReason10.mmObject(), OrderStatusAndReason9.mmObject(), IndividualOrderStatusAndReason8.mmObject(), RejectedStatus10.mmObject(), ConfirmationRejectedReason1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}