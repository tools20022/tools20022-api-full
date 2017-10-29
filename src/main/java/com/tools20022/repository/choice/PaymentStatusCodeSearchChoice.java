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
import com.tools20022.repository.codeset.CashPaymentStatus2Code;
import com.tools20022.repository.codeset.FinalStatusCode;
import com.tools20022.repository.codeset.PendingStatus1Code;
import com.tools20022.repository.entity.PaymentStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#PendingStatus
 * PaymentStatusCodeSearchChoice.PendingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#FinalStatus
 * PaymentStatusCodeSearchChoice.FinalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice#PendingAndFinalStatus
 * PaymentStatusCodeSearchChoice.PendingAndFinalStatus}</li>
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
 * "PaymentStatusCodeSearchChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a list of pending statuses, final statuses or all statuses. "
 * </li>
 * </ul>
 */
public class PaymentStatusCodeSearchChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Qualifies further the pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#InstructionStatus
	 * PaymentStatus.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice
	 * PaymentStatusCodeSearchChoice}</li>
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
	public static final MMMessageAttribute PendingStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentStatusCodeSearchChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.InstructionStatus;
			isDerived = false;
			xmlTag = "PdgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingStatus";
			definition = "Qualifies further the pending status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingStatus1Code.mmObject();
		}
	};
	/**
	 * Qualifies further the final status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#InstructionStatus
	 * PaymentStatus.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice
	 * PaymentStatusCodeSearchChoice}</li>
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
	public static final MMMessageAttribute FinalStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentStatusCodeSearchChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.InstructionStatus;
			isDerived = false;
			xmlTag = "FnlSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalStatus";
			definition = "Qualifies further the final status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinalStatusCode.mmObject();
		}
	};
	/**
	 * State of a payment instruction at a specified time.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#CashPaymentStatus
	 * PaymentStatus.CashPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice
	 * PaymentStatusCodeSearchChoice}</li>
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
	public static final MMMessageAttribute PendingAndFinalStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentStatusCodeSearchChoice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.CashPaymentStatus;
			isDerived = false;
			xmlTag = "PdgAndFnlSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingAndFinalStatus";
			definition = "State of a payment instruction at a specified time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatus2Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.PendingStatus, com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.FinalStatus,
						com.tools20022.repository.choice.PaymentStatusCodeSearchChoice.PendingAndFinalStatus);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusCodeSearchChoice";
				definition = "Choice between a list of pending statuses, final statuses or all statuses. ";
			}
		});
		return mmObject_lazy.get();
	}
}