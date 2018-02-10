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
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusJustification;
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
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmUnmatchedStatusReason
 * PaymentStatusReasonCode4Choice.mmUnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmCancelledStatusReason
 * PaymentStatusReasonCode4Choice.mmCancelledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmSuspendedStatusReason
 * PaymentStatusReasonCode4Choice.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmPendingFailingSettlement
 * PaymentStatusReasonCode4Choice.mmPendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmPendingSettlement
 * PaymentStatusReasonCode4Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmProprietaryRejectionReason
 * PaymentStatusReasonCode4Choice.mmProprietaryRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmProprietaryReason
 * PaymentStatusReasonCode4Choice.mmProprietaryReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "PaymentStatusReasonCode4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the status of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusReasonCode4Choice", propOrder = {"unmatchedStatusReason", "cancelledStatusReason", "suspendedStatusReason", "pendingFailingSettlement", "pendingSettlement", "proprietaryRejectionReason", "proprietaryReason"})
public class PaymentStatusReasonCode4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UmtchdStsRsn", required = true)
	protected UnmatchedStatusReason1Code unmatchedStatusReason;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmtchdStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is unmatched."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnmatchedStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmUnmatchedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason why the payment status is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReason1Code.mmObject();
		}
	};
	@XmlElement(name = "CancStsRsn", required = true)
	protected CancelledStatusReason1Code cancelledStatusReason;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CancStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelledStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "CancStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledStatusReason";
			definition = "Reason why the payment status is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason1Code.mmObject();
		}
	};
	@XmlElement(name = "SspdStsRsn", required = true)
	protected SuspendedStatusReason1Code suspendedStatusReason;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SspdStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSuspendedStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "SspdStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason why the payment status is suspended.";
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingFailingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingFailingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgFlngSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason why the payment status is pending (failing settlement).";
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Reason why the payment status is pending (settlement).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlement2Code.mmObject();
		}
	};
	@XmlElement(name = "PrtryRjctnRsn", required = true)
	protected ProprietaryStatusJustification proprietaryRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification
	 * ProprietaryStatusJustification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryRejectionReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRejectionReason";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryStatusJustification.mmObject();
		}
	};
	@XmlElement(name = "PrtryRsn", required = true)
	protected Max4AlphaNumericText proprietaryReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a free text proprietary reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryReason";
			definition = "Defines a free text proprietary reason.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmUnmatchedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmCancelledStatusReason,
						com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmSuspendedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmPendingFailingSettlement,
						com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmProprietaryRejectionReason,
						com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.mmProprietaryReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusReasonCode4Choice";
				definition = "Reason for the status of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedStatusReason1Code getUnmatchedStatusReason() {
		return unmatchedStatusReason;
	}

	public PaymentStatusReasonCode4Choice setUnmatchedStatusReason(UnmatchedStatusReason1Code unmatchedStatusReason) {
		this.unmatchedStatusReason = Objects.requireNonNull(unmatchedStatusReason);
		return this;
	}

	public CancelledStatusReason1Code getCancelledStatusReason() {
		return cancelledStatusReason;
	}

	public PaymentStatusReasonCode4Choice setCancelledStatusReason(CancelledStatusReason1Code cancelledStatusReason) {
		this.cancelledStatusReason = Objects.requireNonNull(cancelledStatusReason);
		return this;
	}

	public SuspendedStatusReason1Code getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public PaymentStatusReasonCode4Choice setSuspendedStatusReason(SuspendedStatusReason1Code suspendedStatusReason) {
		this.suspendedStatusReason = Objects.requireNonNull(suspendedStatusReason);
		return this;
	}

	public PendingFailingSettlement1Code getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public PaymentStatusReasonCode4Choice setPendingFailingSettlement(PendingFailingSettlement1Code pendingFailingSettlement) {
		this.pendingFailingSettlement = Objects.requireNonNull(pendingFailingSettlement);
		return this;
	}

	public PendingSettlement2Code getPendingSettlement() {
		return pendingSettlement;
	}

	public PaymentStatusReasonCode4Choice setPendingSettlement(PendingSettlement2Code pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public ProprietaryStatusJustification getProprietaryRejectionReason() {
		return proprietaryRejectionReason;
	}

	public PaymentStatusReasonCode4Choice setProprietaryRejectionReason(ProprietaryStatusJustification proprietaryRejectionReason) {
		this.proprietaryRejectionReason = Objects.requireNonNull(proprietaryRejectionReason);
		return this;
	}

	public Max4AlphaNumericText getProprietaryReason() {
		return proprietaryReason;
	}

	public PaymentStatusReasonCode4Choice setProprietaryReason(Max4AlphaNumericText proprietaryReason) {
		this.proprietaryReason = Objects.requireNonNull(proprietaryReason);
		return this;
	}
}