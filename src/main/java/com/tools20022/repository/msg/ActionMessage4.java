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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ATMDevice1Code;
import com.tools20022.repository.codeset.OutputFormat2Code;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information to display, print or log.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmFormat
 * ActionMessage4.mmFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmMessage
 * ActionMessage4.mmMessage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmReference
 * ActionMessage4.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmDevice
 * ActionMessage4.mmDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage4#mmMessageContentSignature
 * ActionMessage4.mmMessageContentSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "ActionMessage4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to display, print or log."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ActionMessage3
 * ActionMessage3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ActionMessage4", propOrder = {"format", "message", "reference", "device", "messageContentSignature"})
public class ActionMessage4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OutputFormat2Code format;
	/**
	 * Information format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code
	 * OutputFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information format."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage3#mmFormat
	 * ActionMessage3.mmFormat}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ActionMessage4.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Information format.";
			previousVersion_lazy = () -> ActionMessage3.mmFormat;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OutputFormat2Code.mmObject();
		}
	};
	protected Max20000Text message;
	/**
	 * Content of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
	 * CardPaymentAcquiring.mmActionMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Msg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Message"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage3#mmContent
	 * ActionMessage3.mmContent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionMessage;
			componentContext_lazy = () -> ActionMessage4.mmObject();
			isDerived = false;
			xmlTag = "Msg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Message";
			definition = "Content of the message.";
			previousVersion_lazy = () -> ActionMessage3.mmContent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}
	};
	protected Max35Text reference;
	/**
	 * Message content if this is a message reference or screen reference.
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
	 * {@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message content if this is a message reference or screen reference."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ActionMessage4.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Message content if this is a message reference or screen reference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMDevice1Code device;
	/**
	 * Device to be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice1Code
	 * ATMDevice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Device"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Device to be used."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDevice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ActionMessage4.mmObject();
			isDerived = false;
			xmlTag = "Dvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Device";
			definition = "Device to be used.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMDevice1Code.mmObject();
		}
	};
	protected Max35Binary messageContentSignature;
	/**
	 * Electronic signature of the message to display or print.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCnttSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContentSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic signature of the message to display or print."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageContentSignature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ActionMessage4.mmObject();
			isDerived = false;
			xmlTag = "MsgCnttSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContentSignature";
			definition = "Electronic signature of the message to display or print.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ActionMessage4.mmFormat, ActionMessage4.mmMessage, ActionMessage4.mmReference, ActionMessage4.mmDevice, ActionMessage4.mmMessageContentSignature);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionMessage4";
				definition = "Information to display, print or log.";
				previousVersion_lazy = () -> ActionMessage3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Frmt")
	public OutputFormat2Code getFormat() {
		return format;
	}

	public void setFormat(OutputFormat2Code format) {
		this.format = format;
	}

	@XmlElement(name = "Msg")
	public Max20000Text getMessage() {
		return message;
	}

	public void setMessage(Max20000Text message) {
		this.message = message;
	}

	@XmlElement(name = "Ref")
	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	@XmlElement(name = "Dvc")
	public ATMDevice1Code getDevice() {
		return device;
	}

	public void setDevice(ATMDevice1Code device) {
		this.device = device;
	}

	@XmlElement(name = "MsgCnttSgntr")
	public Max35Binary getMessageContentSignature() {
		return messageContentSignature;
	}

	public void setMessageContentSignature(Max35Binary messageContentSignature) {
		this.messageContentSignature = messageContentSignature;
	}
}