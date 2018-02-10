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
import com.tools20022.repository.codeset.CashPaymentStatus2Code;
import com.tools20022.repository.codeset.FinalStatusCode;
import com.tools20022.repository.codeset.PendingStatus4Code;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a list of pending statuses, final statuses or all statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmPendingStatus
 * PaymentStatusCodeSearch2Choice.mmPendingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmFinalStatus
 * PaymentStatusCodeSearch2Choice.mmFinalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice#mmPendingAndFinalStatus
 * PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatusCodeSearch2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a list of pending statuses, final statuses or all statuses."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusCodeSearch2Choice", propOrder = {"pendingStatus", "finalStatus", "pendingAndFinalStatus"})
public class PaymentStatusCodeSearch2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PdgSts", required = true)
	protected PendingStatus4Code pendingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice
	 * PaymentStatusCodeSearch2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the pending status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingStatus";
			definition = "Qualifies further the pending status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingStatus4Code.mmObject();
		}
	};
	@XmlElement(name = "FnlSts", required = true)
	protected FinalStatusCode finalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinalStatusCode
	 * FinalStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice
	 * PaymentStatusCodeSearch2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the final status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmObject();
			isDerived = false;
			xmlTag = "FnlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalStatus";
			definition = "Qualifies further the final status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinalStatusCode.mmObject();
		}
	};
	@XmlElement(name = "PdgAndFnlSts", required = true)
	protected CashPaymentStatus2Code pendingAndFinalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashPaymentStatus2Code
	 * CashPaymentStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCashPaymentStatus
	 * PaymentStatus.mmCashPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice
	 * PaymentStatusCodeSearch2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgAndFnlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingAndFinalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "State of a payment instruction at a specified time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingAndFinalStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCashPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgAndFnlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingAndFinalStatus";
			definition = "State of a payment instruction at a specified time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatus2Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmPendingStatus, com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmFinalStatus,
						com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice.mmPendingAndFinalStatus);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusCodeSearch2Choice";
				definition = "Choice between a list of pending statuses, final statuses or all statuses.";
			}
		});
		return mmObject_lazy.get();
	}

	public PendingStatus4Code getPendingStatus() {
		return pendingStatus;
	}

	public PaymentStatusCodeSearch2Choice setPendingStatus(PendingStatus4Code pendingStatus) {
		this.pendingStatus = Objects.requireNonNull(pendingStatus);
		return this;
	}

	public FinalStatusCode getFinalStatus() {
		return finalStatus;
	}

	public PaymentStatusCodeSearch2Choice setFinalStatus(FinalStatusCode finalStatus) {
		this.finalStatus = Objects.requireNonNull(finalStatus);
		return this;
	}

	public CashPaymentStatus2Code getPendingAndFinalStatus() {
		return pendingAndFinalStatus;
	}

	public PaymentStatusCodeSearch2Choice setPendingAndFinalStatus(CashPaymentStatus2Code pendingAndFinalStatus) {
		this.pendingAndFinalStatus = Objects.requireNonNull(pendingAndFinalStatus);
		return this;
	}
}