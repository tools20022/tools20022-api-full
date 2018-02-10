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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCancellationStatus
 * SecuritiesOrderStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmListOrderStatus
 * SecuritiesOrderStatus.mmListOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
 * SecuritiesOrderStatus.mmOrderStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
 * SecuritiesOrder.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmRejected
 * IndividualOrderStatusAndReason4.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatus1#mmReason
 * SuspendedStatus1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmInRepair
 * IndividualOrderStatusAndReason1.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRepairedConditions
 * IndividualOrderStatusAndReason1.mmRepairedConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmRejected
 * IndividualOrderStatusAndReason2.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmRepairedConditions
 * IndividualOrderStatusAndReason2.mmRepairedConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmRejected
 * OrderStatus1Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmStatusDetails
 * IndividualOrderStatusAndReason3.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmRejected
 * IndividualOrderStatusAndReason5.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmOrderStatusDetails
 * OrderStatusAndReason5.mmOrderStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmSingleOrderStatusDetails
 * OrderStatus3.mmSingleOrderStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmSingleOrderDetails
 * OrderStatus2.mmSingleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmRejected
 * OrderStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmAmendmentRejected
 * ConfirmationStatus1Choice.mmAmendmentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmRejected
 * OrderStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmRejected
 * OrderStatus4Choice.mmRejected}</li>
 * </ul>
 * </li>
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
	protected RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmReason
	 * ConfirmationRejectedStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmConfirmationRejected
	 * ConfirmationStatus1Choice.mmConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#mmReason
	 * ConfirmationRejectedStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice#mmCode
	 * ConfirmationRejectedReason1Choice.mmCode}</li>
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
	public static final MMBusinessAttribute mmConfirmationRejectedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ConfirmationRejectedStatus1.mmReason, ConfirmationStatus1Choice.mmConfirmationRejected, ConfirmationRejectedStatus2.mmReason, ConfirmationRejectedReason1Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationRejectedStatusReason";
			definition = "Specifies the reason for a confirmation rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConfirmationRejectedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderConfirmationStatusCode confirmationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmStatus
	 * IndividualOrderConfirmationStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmStatus
	 * ConfirmationStatus1Choice.mmStatus}</li>
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
	public static final MMBusinessAttribute mmConfirmationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason1.mmStatus, ConfirmationStatus1Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationStatus";
			definition = "Status of the confirmation of a status order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConfirmationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderCancellationStatusCode cancellationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmStatus
	 * OrderStatusAndReason8.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmStatus
	 * IndividualOrderStatusAndReason4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmCancelled
	 * SwitchOrderStatusAndReason1.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#mmStatus
	 * CancellationStatus22Choice.mmStatus}</li>
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
	public static final MMBusinessAttribute mmCancellationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatusAndReason8.mmStatus, IndividualOrderStatusAndReason4.mmStatus, SwitchOrderStatusAndReason1.mmCancelled, CancellationStatus22Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartiallySettledStatusReasonCode partiallySettledStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#mmReason
	 * PartiallySettledStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmPartiallySettled
	 * OrderStatusAndReason7.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmPartiallySettled
	 * IndividualOrderStatusAndReason2.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmPartiallySettled
	 * SwitchOrderStatusAndReason1.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartiallySettledStatus2#mmReason
	 * PartiallySettledStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartiallySettledStatus2#mmProprietary
	 * PartiallySettledStatus2.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmPartiallySettled
	 * OrderStatus1Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmPartiallySettled
	 * OrderStatus5Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmReason
	 * PartiallySettledStatus10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmPartiallySettled
	 * OrderStatus3Choice.mmPartiallySettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmPartiallySettled
	 * OrderStatus4Choice.mmPartiallySettled}</li>
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
	public static final MMBusinessAttribute mmPartiallySettledStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PartiallySettledStatus1.mmReason, OrderStatusAndReason7.mmPartiallySettled, IndividualOrderStatusAndReason2.mmPartiallySettled, SwitchOrderStatusAndReason1.mmPartiallySettled,
					PartiallySettledStatus2.mmReason, PartiallySettledStatus2.mmProprietary, OrderStatus1Choice.mmPartiallySettled, OrderStatus5Choice.mmPartiallySettled, PartiallySettledStatus10.mmReason,
					OrderStatus3Choice.mmPartiallySettled, OrderStatus4Choice.mmPartiallySettled);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallySettledStatusReason";
			definition = "Reason for the partially settled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getPartiallySettledStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SuspendedStatusReasonCode suspendedStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason1#mmStructured
	 * SuspendedStatusReason1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmSuspended
	 * OrderStatusAndReason3.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmSuspended
	 * IndividualOrderStatusAndReason1.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmReason
	 * SuspendedStatusReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus2#mmReasonDetails
	 * SuspendedStatus2.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmSuspended
	 * OrderStatusAndReason7.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmSuspended
	 * IndividualOrderStatusAndReason2.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmSuspended
	 * SwitchOrderStatusAndReason1.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#mmReason
	 * SuspendedStatusReasonChoice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#mmProprietary
	 * SuspendedStatusReasonChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmSuspended
	 * OrderStatus1Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmSuspended
	 * OrderStatus5Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmSuspended
	 * OrderStatus3Choice.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmSuspended
	 * OrderStatus4Choice.mmSuspended}</li>
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
	public static final MMBusinessAttribute mmSuspendedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SuspendedStatusReason1.mmStructured, OrderStatusAndReason3.mmSuspended, IndividualOrderStatusAndReason1.mmSuspended, SuspendedStatusReason2.mmReason, SuspendedStatus2.mmReasonDetails,
					OrderStatusAndReason7.mmSuspended, IndividualOrderStatusAndReason2.mmSuspended, SwitchOrderStatusAndReason1.mmSuspended, SuspendedStatusReasonChoice.mmReason, SuspendedStatusReasonChoice.mmProprietary,
					OrderStatus1Choice.mmSuspended, OrderStatus5Choice.mmSuspended, OrderStatus3Choice.mmSuspended, OrderStatus4Choice.mmSuspended);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getSuspendedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ListStatusTypeCode listOrderStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmListStatusType
	 * OrderStatus2.mmListStatusType}</li>
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
	public static final MMBusinessAttribute mmListOrderStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus2.mmListStatusType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListOrderStatus";
			definition = "Specifies the status of a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ListStatusTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getListOrderStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
	 * SecuritiesOrder.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected InvestmentFundOrder investmentFundOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmOrderData
	 * IndividualOrderStatusAndReason2.mmOrderData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmOrderData
	 * IndividualOrderStatusAndReason3.mmOrderData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderData
	 * IndividualOrderStatusAndReason7.mmOrderData}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason2.mmOrderData, IndividualOrderStatusAndReason3.mmOrderData, IndividualOrderStatusAndReason7.mmOrderData);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "Investment fund order for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected SecuritiesQuantity cumulativeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
	 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmCumulativeQuantity
	 * OrderStatus1.mmCumulativeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmCumulativeQuantity
	 * OrderStatus3.mmCumulativeQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmCumulativeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatus1.mmCumulativeQuantity, OrderStatus3.mmCumulativeQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (for instance number of shares) filled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity remainingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
	 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmRemainingQuantity
	 * PartialFill1.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmRemainingQuantity
	 * OrderStatus1.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmRemainingQuantity
	 * OrderStatus3.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmRemainingQuantity
	 * PartialFill2.mmRemainingQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRemainingQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PartialFill1.mmRemainingQuantity, OrderStatus1.mmRemainingQuantity, OrderStatus3.mmRemainingQuantity, PartialFill2.mmRemainingQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#mmStructured
	 * ConditionallyAcceptedStatusReason1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1#mmAdditionalInformation
	 * ConditionallyAcceptedStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#mmReason
	 * ConditionallyAcceptedStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmConditionallyAccepted
	 * OrderStatusAndReason3.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#mmReason
	 * ConditionallyAcceptedStatusReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#mmAdditionalInformation
	 * ConditionallyAcceptedStatusReason2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmReasonDetails
	 * ConditionallyAcceptedStatus2.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmConditionallyAccepted
	 * OrderStatusAndReason7.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmConditionallyAccepted
	 * IndividualOrderStatusAndReason2.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmConditionallyAccepted
	 * SwitchOrderStatusAndReason1.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#mmReason
	 * ConditionallyAcceptedStatusReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#mmProprietary
	 * ConditionallyAcceptedStatusReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmConditionallyAccepted
	 * OrderStatus1Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmConditionallyAccepted
	 * OrderStatus5Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmReasonDetails
	 * SuspendedStatusReason4Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmReasonDetails
	 * ConditionallyAcceptedStatus3Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmReasonDetails
	 * InRepairStatusReason4Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmConditionallyAccepted
	 * OrderStatus3Choice.mmConditionallyAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmConditionallyAccepted
	 * OrderStatus4Choice.mmConditionallyAccepted}</li>
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
	public static final MMBusinessAttribute mmConditionallyAcceptedStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ConditionallyAcceptedStatusReason1.mmStructured, ConditionallyAcceptedStatusReason1.mmAdditionalInformation, ConditionallyAcceptedStatus1.mmReason,
					OrderStatusAndReason3.mmConditionallyAccepted, ConditionallyAcceptedStatusReason2.mmReason, ConditionallyAcceptedStatusReason2.mmAdditionalInformation, ConditionallyAcceptedStatus2.mmReasonDetails,
					OrderStatusAndReason7.mmConditionallyAccepted, IndividualOrderStatusAndReason2.mmConditionallyAccepted, SwitchOrderStatusAndReason1.mmConditionallyAccepted, ConditionallyAcceptedStatusReason1Choice.mmReason,
					ConditionallyAcceptedStatusReason1Choice.mmProprietary, OrderStatus1Choice.mmConditionallyAccepted, OrderStatus5Choice.mmConditionallyAccepted, SuspendedStatusReason4Choice.mmReasonDetails,
					ConditionallyAcceptedStatus3Choice.mmReasonDetails, InRepairStatusReason4Choice.mmReasonDetails, OrderStatus3Choice.mmConditionallyAccepted, OrderStatus4Choice.mmConditionallyAccepted);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConditionallyAcceptedStatus";
			definition = "Reason for the conditionally accepted status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getConditionallyAcceptedStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderStatusCode orderStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason4#mmStatus
	 * OrderStatusAndReason4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmStatus
	 * OrderStatusAndReason3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmStatus
	 * IndividualOrderStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmStatus
	 * OrderStatusAndReason7.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmStatus
	 * IndividualOrderStatusAndReason2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmStatus
	 * SwitchOrderStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmStatus
	 * OrderStatus1Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmStatus
	 * IndividualOrderStatusAndReason5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmStatus
	 * OrderStatusAndReason5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmListOrderStatus
	 * OrderStatus2.mmListOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmStatus
	 * OrderStatus5Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderStatus
	 * IndividualOrderStatusAndReason7.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderStatus
	 * SwitchOrderStatusAndReason2.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmOrderStatus
	 * OrderStatusAndReason10.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmStatus
	 * OrderStatus3Choice.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmStatus
	 * OrderStatus4Choice.mmStatus}</li>
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
	public static final MMBusinessAttribute mmOrderStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderStatusAndReason4.mmStatus, OrderStatusAndReason3.mmStatus, IndividualOrderStatusAndReason1.mmStatus, OrderStatusAndReason7.mmStatus, IndividualOrderStatusAndReason2.mmStatus,
					SwitchOrderStatusAndReason1.mmStatus, OrderStatus1Choice.mmStatus, IndividualOrderStatusAndReason5.mmStatus, OrderStatusAndReason5.mmStatus, OrderStatus2.mmListOrderStatus, OrderStatus5Choice.mmStatus,
					IndividualOrderStatusAndReason7.mmOrderStatus, SwitchOrderStatusAndReason2.mmOrderStatus, OrderStatusAndReason10.mmOrderStatus, OrderStatus3Choice.mmStatus, OrderStatus4Choice.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Indicates the status of an order at a specific point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrderStatus.class.getMethod("getOrderStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderStatus";
				definition = "Status of a securities order or of the processing of a securities order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesOrder.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason4.mmRejected, SuspendedStatus1.mmReason, IndividualOrderStatusAndReason1.mmInRepair, IndividualOrderStatusAndReason1.mmRepairedConditions,
						IndividualOrderStatusAndReason2.mmRejected, IndividualOrderStatusAndReason2.mmRepairedConditions, OrderStatus1Choice.mmRejected, IndividualOrderStatusAndReason3.mmStatusDetails,
						IndividualOrderStatusAndReason5.mmRejected, OrderStatusAndReason5.mmOrderStatusDetails, OrderStatus3.mmSingleOrderStatusDetails, OrderStatus2.mmSingleOrderDetails, OrderStatus5Choice.mmRejected,
						ConfirmationStatus1Choice.mmAmendmentRejected, OrderStatus3Choice.mmRejected, OrderStatus4Choice.mmRejected);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationRejectedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCancellationStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmPartiallySettledStatusReason,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSuspendedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.mmListOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmConditionallyAcceptedStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.mmOrderStatus);
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

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrderStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RejectedConfirmationStatusReasonCode getConfirmationRejectedStatusReason() {
		return confirmationRejectedStatusReason;
	}

	public SecuritiesOrderStatus setConfirmationRejectedStatusReason(RejectedConfirmationStatusReasonCode confirmationRejectedStatusReason) {
		this.confirmationRejectedStatusReason = Objects.requireNonNull(confirmationRejectedStatusReason);
		return this;
	}

	public OrderConfirmationStatusCode getConfirmationStatus() {
		return confirmationStatus;
	}

	public SecuritiesOrderStatus setConfirmationStatus(OrderConfirmationStatusCode confirmationStatus) {
		this.confirmationStatus = Objects.requireNonNull(confirmationStatus);
		return this;
	}

	public OrderCancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public SecuritiesOrderStatus setCancellationStatus(OrderCancellationStatusCode cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public PartiallySettledStatusReasonCode getPartiallySettledStatusReason() {
		return partiallySettledStatusReason;
	}

	public SecuritiesOrderStatus setPartiallySettledStatusReason(PartiallySettledStatusReasonCode partiallySettledStatusReason) {
		this.partiallySettledStatusReason = Objects.requireNonNull(partiallySettledStatusReason);
		return this;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public SecuritiesOrderStatus setSuspendedStatusReason(SuspendedStatusReasonCode suspendedStatusReason) {
		this.suspendedStatusReason = Objects.requireNonNull(suspendedStatusReason);
		return this;
	}

	public ListStatusTypeCode getListOrderStatus() {
		return listOrderStatus;
	}

	public SecuritiesOrderStatus setListOrderStatus(ListStatusTypeCode listOrderStatus) {
		this.listOrderStatus = Objects.requireNonNull(listOrderStatus);
		return this;
	}

	public Optional<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder == null ? Optional.empty() : Optional.of(securitiesOrder);
	}

	public SecuritiesOrderStatus setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
		return this;
	}

	public Optional<InvestmentFundOrder> getInvestmentFundOrder() {
		return investmentFundOrder == null ? Optional.empty() : Optional.of(investmentFundOrder);
	}

	public SecuritiesOrderStatus setInvestmentFundOrder(com.tools20022.repository.entity.InvestmentFundOrder investmentFundOrder) {
		this.investmentFundOrder = investmentFundOrder;
		return this;
	}

	public SecuritiesQuantity getCumulativeQuantity() {
		return cumulativeQuantity;
	}

	public SecuritiesOrderStatus setCumulativeQuantity(com.tools20022.repository.entity.SecuritiesQuantity cumulativeQuantity) {
		this.cumulativeQuantity = Objects.requireNonNull(cumulativeQuantity);
		return this;
	}

	public SecuritiesQuantity getRemainingQuantity() {
		return remainingQuantity;
	}

	public SecuritiesOrderStatus setRemainingQuantity(com.tools20022.repository.entity.SecuritiesQuantity remainingQuantity) {
		this.remainingQuantity = Objects.requireNonNull(remainingQuantity);
		return this;
	}

	public ConditionallyAcceptedStatusReasonCode getConditionallyAcceptedStatus() {
		return conditionallyAcceptedStatus;
	}

	public SecuritiesOrderStatus setConditionallyAcceptedStatus(ConditionallyAcceptedStatusReasonCode conditionallyAcceptedStatus) {
		this.conditionallyAcceptedStatus = Objects.requireNonNull(conditionallyAcceptedStatus);
		return this;
	}

	public OrderStatusCode getOrderStatus() {
		return orderStatus;
	}

	public SecuritiesOrderStatus setOrderStatus(OrderStatusCode orderStatus) {
		this.orderStatus = Objects.requireNonNull(orderStatus);
		return this;
	}
}