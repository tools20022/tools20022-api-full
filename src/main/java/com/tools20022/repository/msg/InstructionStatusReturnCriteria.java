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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria which are used to report on the payment status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria#mmPaymentInstructionStatusIndicator
 * InstructionStatusReturnCriteria.mmPaymentInstructionStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria#mmPaymentInstructionStatusDateTimeIndicator
 * InstructionStatusReturnCriteria.mmPaymentInstructionStatusDateTimeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria#mmPaymentInstructionStatusReasonIndicator
 * InstructionStatusReturnCriteria.mmPaymentInstructionStatusReasonIndicator}</li>
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
 * "InstructionStatusReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to report on the payment status."</li>
 * </ul>
 */
public class InstructionStatusReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator paymentInstructionStatusIndicator;
	/**
	 * Indicates if the instruction status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria
	 * InstructionStatusReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrStsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the instruction status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionStatusReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusIndicator";
			definition = "Indicates if the instruction status is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentInstructionStatusDateTimeIndicator;
	/**
	 * Indicates if the status date and time are requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria
	 * InstructionStatusReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrStsDtTmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatusDateTimeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the status date and time are requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusDateTimeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionStatusReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsDtTmInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusDateTimeIndicator";
			definition = "Indicates if the status date and time are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentInstructionStatusReasonIndicator;
	/**
	 * Indicates if the status reason is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria
	 * InstructionStatusReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrStsRsnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatusReasonIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the status reason is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusReasonIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionStatusReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsRsnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusReasonIndicator";
			definition = "Indicates if the status reason is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionStatusReturnCriteria.mmPaymentInstructionStatusIndicator,
						com.tools20022.repository.msg.InstructionStatusReturnCriteria.mmPaymentInstructionStatusDateTimeIndicator, com.tools20022.repository.msg.InstructionStatusReturnCriteria.mmPaymentInstructionStatusReasonIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionStatusReturnCriteria";
				definition = "Defines the criteria which are used to report on the payment status.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getPaymentInstructionStatusIndicator() {
		return paymentInstructionStatusIndicator;
	}

	public void setPaymentInstructionStatusIndicator(RequestedIndicator paymentInstructionStatusIndicator) {
		this.paymentInstructionStatusIndicator = paymentInstructionStatusIndicator;
	}

	public RequestedIndicator getPaymentInstructionStatusDateTimeIndicator() {
		return paymentInstructionStatusDateTimeIndicator;
	}

	public void setPaymentInstructionStatusDateTimeIndicator(RequestedIndicator paymentInstructionStatusDateTimeIndicator) {
		this.paymentInstructionStatusDateTimeIndicator = paymentInstructionStatusDateTimeIndicator;
	}

	public RequestedIndicator getPaymentInstructionStatusReasonIndicator() {
		return paymentInstructionStatusReasonIndicator;
	}

	public void setPaymentInstructionStatusReasonIndicator(RequestedIndicator paymentInstructionStatusReasonIndicator) {
		this.paymentInstructionStatusReasonIndicator = paymentInstructionStatusReasonIndicator;
	}
}