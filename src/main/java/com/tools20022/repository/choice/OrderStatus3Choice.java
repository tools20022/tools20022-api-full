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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderStatus4Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CancelledStatusReason16;
import com.tools20022.repository.msg.PartiallySettledStatus10;
import com.tools20022.repository.msg.RejectedStatus9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status for an order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmStatus
 * OrderStatus3Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmCancelled
 * OrderStatus3Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmConditionallyAccepted
 * OrderStatus3Choice.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmRejected
 * OrderStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmSuspended
 * OrderStatus3Choice.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmPartiallySettled
 * OrderStatus3Choice.mmPartiallySettled}</li>
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
 * "OrderStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for an order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OrderStatus3Choice", propOrder = {"status", "cancelled", "conditionallyAccepted", "rejected", "suspended", "partiallySettled"})
public class OrderStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected OrderStatus4Code status;
	/**
	 * Status of all the orders in the order message. There is no reason
	 * attached.
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
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmStatus
	 * OrderStatus5Choice.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of all the orders in the order message. There is no reason attached.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus4Code.mmObject();
		}
	};
	protected CancelledStatusReason16 cancelled;
	/**
	 * Status of all the orders in the order message is cancelled. This status
	 * is used for orders that have been accepted or that have been entered in
	 * an order book but that can not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16
	 * CancelledStatusReason16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmCancelled
	 * OrderStatus5Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of all the orders in the order message is cancelled. This status is used for orders that have been accepted or that have been entered in an order book but that can not be executed.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatusReason16.mmObject();
		}
	};
	protected ConditionallyAcceptedStatus3Choice conditionallyAccepted;
	/**
	 * Status of all the orders in the order message is conditionally accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
	 * ConditionallyAcceptedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmConditionallyAccepted
	 * OrderStatus5Choice.mmConditionallyAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionallyAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "CondlyAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyAccepted";
			definition = "Status of all the orders in the order message is conditionally accepted.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmConditionallyAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmObject();
		}
	};
	protected List<RejectedStatus9> rejected;
	/**
	 * Status of all the orders in the order message is rejected. This status is
	 * used for orders that have not been accepted or entered in an order book.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus9
	 * RejectedStatus9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmRejected
	 * OrderStatus5Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of all the orders in the order message is rejected. This status is used for orders that have not been accepted or entered in an order book.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmRejected;
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus9.mmObject();
		}
	};
	protected SuspendedStatusReason4Choice suspended;
	/**
	 * Status of all the orders in the order message is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice
	 * SuspendedStatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmSuspended
	 * OrderStatus5Choice.mmSuspended}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuspended = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of all the orders in the order message is suspended.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmSuspended;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SuspendedStatusReason4Choice.mmObject();
		}
	};
	protected PartiallySettledStatus10 partiallySettled;
	/**
	 * Status of all the orders in the order message is partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
	 * PartiallySettledStatus10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
	 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice
	 * OrderStatus3Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmPartiallySettled
	 * OrderStatus5Choice.mmPartiallySettled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartiallySettled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> OrderStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtlySttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Status of all the orders in the order message is partially settled.";
			previousVersion_lazy = () -> OrderStatus5Choice.mmPartiallySettled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartiallySettledStatus10.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OrderStatus3Choice.mmStatus, OrderStatus3Choice.mmCancelled, OrderStatus3Choice.mmConditionallyAccepted, OrderStatus3Choice.mmRejected, OrderStatus3Choice.mmSuspended,
						OrderStatus3Choice.mmPartiallySettled);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus3Choice";
				definition = "Choice of status for an order.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sts", required = true)
	public OrderStatus4Code getStatus() {
		return status;
	}

	public void setStatus(OrderStatus4Code status) {
		this.status = status;
	}

	@XmlElement(name = "Canc", required = true)
	public CancelledStatusReason16 getCancelled() {
		return cancelled;
	}

	public void setCancelled(CancelledStatusReason16 cancelled) {
		this.cancelled = cancelled;
	}

	@XmlElement(name = "CondlyAccptd", required = true)
	public ConditionallyAcceptedStatus3Choice getConditionallyAccepted() {
		return conditionallyAccepted;
	}

	public void setConditionallyAccepted(com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice conditionallyAccepted) {
		this.conditionallyAccepted = conditionallyAccepted;
	}

	@XmlElement(name = "Rjctd", required = true)
	public List<RejectedStatus9> getRejected() {
		return rejected;
	}

	public void setRejected(List<RejectedStatus9> rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "Sspd", required = true)
	public SuspendedStatusReason4Choice getSuspended() {
		return suspended;
	}

	public void setSuspended(com.tools20022.repository.choice.SuspendedStatusReason4Choice suspended) {
		this.suspended = suspended;
	}

	@XmlElement(name = "PrtlySttld", required = true)
	public PartiallySettledStatus10 getPartiallySettled() {
		return partiallySettled;
	}

	public void setPartiallySettled(PartiallySettledStatus10 partiallySettled) {
		this.partiallySettled = partiallySettled;
	}
}