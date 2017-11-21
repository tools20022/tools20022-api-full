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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.ClearingChannel2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide further details of the type of payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmInstructionPriority
 * PaymentTypeInformation23.mmInstructionPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmClearingChannel
 * PaymentTypeInformation23.mmClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmServiceLevel
 * PaymentTypeInformation23.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23#mmLocalInstrument
 * PaymentTypeInformation23.mmLocalInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
 * PaymentProcessing}</li>
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
 * "PaymentTypeInformation23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide further details of the type of payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTypeInformation23", propOrder = {"instructionPriority", "clearingChannel", "serviceLevel", "localInstrument"})
public class PaymentTypeInformation23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Priority2Code instructionPriority;
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23
	 * PaymentTypeInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> PaymentTypeInformation23.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	protected ClearingChannel2Code clearingChannel;
	/**
	 * Specifies the clearing channel to be used to process the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
	 * ClearingChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmClearingChannel
	 * PaymentProcessing.mmClearingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23
	 * PaymentTypeInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing channel to be used to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmClearingChannel;
			componentContext_lazy = () -> PaymentTypeInformation23.mmObject();
			isDerived = false;
			xmlTag = "ClrChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	protected ServiceLevel8Choice serviceLevel;
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
	 * ServiceLevel8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23
	 * PaymentTypeInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceLevel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmServiceLevel;
			componentContext_lazy = () -> PaymentTypeInformation23.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
		}
	};
	protected LocalInstrument2Choice localInstrument;
	/**
	 * User community specific instrument. Usage: This element is used to
	 * specify a local instrument, local clearing option and/or further qualify
	 * the service or service level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
	 * PaymentProcessing.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation23
	 * PaymentTypeInformation23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmLocalInstrument;
			componentContext_lazy = () -> PaymentTypeInformation23.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTypeInformation23.mmInstructionPriority, PaymentTypeInformation23.mmClearingChannel, PaymentTypeInformation23.mmServiceLevel, PaymentTypeInformation23.mmLocalInstrument);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeInformation23";
				definition = "Set of elements used to provide further details of the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrPrty")
	public Priority2Code getInstructionPriority() {
		return instructionPriority;
	}

	public void setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
	}

	@XmlElement(name = "ClrChanl")
	public ClearingChannel2Code getClearingChannel() {
		return clearingChannel;
	}

	public void setClearingChannel(ClearingChannel2Code clearingChannel) {
		this.clearingChannel = clearingChannel;
	}

	@XmlElement(name = "SvcLvl")
	public ServiceLevel8Choice getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(ServiceLevel8Choice serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	@XmlElement(name = "LclInstrm")
	public LocalInstrument2Choice getLocalInstrument() {
		return localInstrument;
	}

	public void setLocalInstrument(LocalInstrument2Choice localInstrument) {
		this.localInstrument = localInstrument;
	}
}