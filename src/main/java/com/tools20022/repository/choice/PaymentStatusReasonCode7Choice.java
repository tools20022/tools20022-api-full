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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusJustification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for the status of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmUnmatched
 * PaymentStatusReasonCode7Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmCancelled
 * PaymentStatusReasonCode7Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmSuspended
 * PaymentStatusReasonCode7Choice.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmPendingFailingSettlement
 * PaymentStatusReasonCode7Choice.mmPendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmPendingSettlement
 * PaymentStatusReasonCode7Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmProprietaryRejection
 * PaymentStatusReasonCode7Choice.mmProprietaryRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmProprietary
 * PaymentStatusReasonCode7Choice.mmProprietary}</li>
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
 * "PaymentStatusReasonCode7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the status of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice
 * PaymentStatusReasonCode6Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusReasonCode7Choice", propOrder = {"unmatched", "cancelled", "suspended", "pendingFailingSettlement", "pendingSettlement", "proprietaryRejection", "proprietary"})
public class PaymentStatusReasonCode7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Umtchd", required = true)
	protected UnmatchedStatusReason1Code unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnmatchedStatusReason
	 * PaymentStatus.mmUnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is unmatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmUnmatched
	 * PaymentStatusReasonCode6Choice.mmUnmatched}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnmatched = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmUnmatchedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Reason why the payment status is unmatched.";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmUnmatched;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReason1Code.mmObject();
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatusReason1Code cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason1Code
	 * CancelledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
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
	 * definition} = "Reason why the payment status is cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmCancelled
	 * PaymentStatusReasonCode6Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelled = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Reason why the payment status is cancelled.";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason1Code.mmObject();
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatusReason1Code suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason1Code
	 * SuspendedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmSuspendedStatusReason
	 * PaymentStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
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
	 * definition} = "Reason why the payment status is suspended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmSuspended
	 * PaymentStatusReasonCode6Choice.mmSuspended}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSuspended = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Reason why the payment status is suspended.";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmSuspended;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReason1Code.mmObject();
		}
	};
	@XmlElement(name = "PdgFlngSttlm", required = true)
	protected PendingFailingSettlement1Code pendingFailingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlement1Code
	 * PendingFailingSettlement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingFailingSettlement
	 * PaymentStatus.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgFlngSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the payment status is pending (failing settlement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingFailingSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingFailingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingFailingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgFlngSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason why the payment status is pending (failing settlement).";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmPendingFailingSettlement;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlement1Code.mmObject();
		}
	};
	@XmlElement(name = "PdgSttlm", required = true)
	protected PendingSettlement2Code pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingSettlement
	 * PaymentStatus.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is pending (settlement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Reason why the payment status is pending (settlement).";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmPendingSettlement;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlement2Code.mmObject();
		}
	};
	@XmlElement(name = "PrtryRjctn", required = true)
	protected ProprietaryStatusJustification1 proprietaryRejection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification1
	 * ProprietaryStatusJustification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRjctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmProprietaryRejection
	 * PaymentStatusReasonCode6Choice.mmProprietaryRejection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryRejection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRjctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRejection";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction.";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmProprietaryRejection;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryStatusJustification1.mmObject();
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max35Text proprietary;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice
	 * PaymentStatusReasonCode7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a free text proprietary reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmProprietary
	 * PaymentStatusReasonCode6Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Defines a free text proprietary reason.";
			previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmUnmatched, com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmCancelled,
						com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmSuspended, com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmPendingFailingSettlement,
						com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmProprietaryRejection,
						com.tools20022.repository.choice.PaymentStatusReasonCode7Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusReasonCode7Choice";
				definition = "Reason for the status of the transaction.";
				previousVersion_lazy = () -> PaymentStatusReasonCode6Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedStatusReason1Code getUnmatched() {
		return unmatched;
	}

	public PaymentStatusReasonCode7Choice setUnmatched(UnmatchedStatusReason1Code unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public CancelledStatusReason1Code getCancelled() {
		return cancelled;
	}

	public PaymentStatusReasonCode7Choice setCancelled(CancelledStatusReason1Code cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public SuspendedStatusReason1Code getSuspended() {
		return suspended;
	}

	public PaymentStatusReasonCode7Choice setSuspended(SuspendedStatusReason1Code suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public PendingFailingSettlement1Code getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public PaymentStatusReasonCode7Choice setPendingFailingSettlement(PendingFailingSettlement1Code pendingFailingSettlement) {
		this.pendingFailingSettlement = Objects.requireNonNull(pendingFailingSettlement);
		return this;
	}

	public PendingSettlement2Code getPendingSettlement() {
		return pendingSettlement;
	}

	public PaymentStatusReasonCode7Choice setPendingSettlement(PendingSettlement2Code pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public ProprietaryStatusJustification1 getProprietaryRejection() {
		return proprietaryRejection;
	}

	public PaymentStatusReasonCode7Choice setProprietaryRejection(ProprietaryStatusJustification1 proprietaryRejection) {
		this.proprietaryRejection = Objects.requireNonNull(proprietaryRejection);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public PaymentStatusReasonCode7Choice setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}