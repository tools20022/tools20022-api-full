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
import com.tools20022.repository.area.catp.ATMRejectV02;
import com.tools20022.repository.codeset.RejectReason1Code;
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the reject of a message from an ATM or an ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReject2#mmRejectInitiatorIdentification
 * ATMReject2.mmRejectInitiatorIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmRejectReason
 * ATMReject2.mmRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReject2#mmAdditionalInformation
 * ATMReject2.mmAdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmCommand
 * ATMReject2.mmCommand}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmMessageInError
 * ATMReject2.mmMessageInError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMRejectV02#mmATMReject
 * ATMRejectV02.mmATMReject}</li>
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
 * "ATMReject2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the reject of a message from an ATM or an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMReject2", propOrder = {"rejectInitiatorIdentification", "rejectReason", "additionalInformation", "command", "messageInError"})
public class ATMReject2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text rejectInitiatorIdentification;
	/**
	 * Identification of the entity sending the reject message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctInitrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectInitiatorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity sending the reject message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectInitiatorIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "RjctInitrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectInitiatorIdentification";
			definition = "Identification of the entity sending the reject message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected RejectReason1Code rejectReason;
	/**
	 * High level information allowing the sender of a request or an advice to
	 * know the types of error, and handle them accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code
	 * RejectReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level information allowing the sender of a request or an advice to know the types of error, and handle them accordingly."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "High level information allowing the sender of a request or an advice to know the types of error, and handle them accordingly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReason1Code.mmObject();
		}
	};
	protected Max500Text additionalInformation;
	/**
	 * Additional information related to the sending of a reject message in
	 * response to a request or an advice.<br>
	 * For logging purpose, in order to allow further analysis, statistics and
	 * deferred processing on the success or the failure of the request
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the sending of a reject message in response to a request or an advice.\r\nFor logging purpose, in order to allow further analysis, statistics and deferred processing on the success or the failure of the request processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the sending of a reject message in response to a request or an advice.\r\nFor logging purpose, in order to allow further analysis, statistics and deferred processing on the success or the failure of the request processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCommand7> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
		}
	};
	protected Max100KBinary messageInError;
	/**
	 * Received message that has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgInErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received message that has been rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageInError = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "MsgInErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageInError";
			definition = "Received message that has been rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMReject2.mmRejectInitiatorIdentification, ATMReject2.mmRejectReason, ATMReject2.mmAdditionalInformation, ATMReject2.mmCommand, ATMReject2.mmMessageInError);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMRejectV02.mmATMReject);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReject2";
				definition = "Information related to the reject of a message from an ATM or an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RjctInitrId")
	public Max35Text getRejectInitiatorIdentification() {
		return rejectInitiatorIdentification;
	}

	public void setRejectInitiatorIdentification(Max35Text rejectInitiatorIdentification) {
		this.rejectInitiatorIdentification = rejectInitiatorIdentification;
	}

	@XmlElement(name = "RjctRsn", required = true)
	public RejectReason1Code getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(RejectReason1Code rejectReason) {
		this.rejectReason = rejectReason;
	}

	@XmlElement(name = "AddtlInf")
	public Max500Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "Cmd")
	public List<ATMCommand7> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand7> command) {
		this.command = command;
	}

	@XmlElement(name = "MsgInErr")
	public Max100KBinary getMessageInError() {
		return messageInError;
	}

	public void setMessageInError(Max100KBinary messageInError) {
		this.messageInError = messageInError;
	}
}