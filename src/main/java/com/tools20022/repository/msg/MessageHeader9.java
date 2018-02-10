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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.choice.RequestType4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics, such as the identification or the creation date and
 * time, specific to the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader9#mmMessageIdentification
 * MessageHeader9.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader9#mmCreationDateTime
 * MessageHeader9.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageHeader9#mmRequestType
 * MessageHeader9.mmRequestType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmMessageHeader
 * CancelTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetLimitV06#mmMessageHeader
 * GetLimitV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetMemberV03#mmMessageHeader
 * GetMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetReservationV04#mmMessageHeader
 * GetReservationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04#mmMessageHeader
 * GetBusinessDayInformationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetTransactionV07#mmMessageHeader
 * GetTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReceiptV04#mmMessageHeader
 * ReceiptV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetAccountV06#mmMessageHeader
 * GetAccountV06.mmMessageHeader}</li>
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
 * "MessageHeader9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics, such as the identification or the creation date and time, specific to the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.MessageHeader2
 * MessageHeader2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageHeader9", propOrder = {"messageIdentification", "creationDateTime", "requestType"})
public class MessageHeader9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader9 MessageHeader9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the sender, to unambiguously identify the message.\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader2#mmMessageIdentification
	 * MessageHeader2.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader9.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the sender, to unambiguously identify the message.\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period.";
			previousVersion_lazy = () -> MessageHeader2.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm")
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader9 MessageHeader9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader2#mmCreationDateTime
	 * MessageHeader2.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader9.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			previousVersion_lazy = () -> MessageHeader2.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "ReqTp")
	protected RequestType4Choice requestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RequestType4Choice
	 * RequestType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader9 MessageHeader9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific actions to be executed through the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader2#mmRequestType
	 * MessageHeader2.mmRequestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader9.mmObject();
			isDerived = false;
			xmlTag = "ReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestType";
			definition = "Specific actions to be executed through the request.";
			previousVersion_lazy = () -> MessageHeader2.mmRequestType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RequestType4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageHeader9.mmMessageIdentification, com.tools20022.repository.msg.MessageHeader9.mmCreationDateTime,
						com.tools20022.repository.msg.MessageHeader9.mmRequestType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CancelTransactionV07.mmMessageHeader, GetLimitV06.mmMessageHeader, GetMemberV03.mmMessageHeader, GetReservationV04.mmMessageHeader,
						GetBusinessDayInformationV04.mmMessageHeader, GetTransactionV07.mmMessageHeader, ReceiptV04.mmMessageHeader, GetAccountV06.mmMessageHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageHeader9";
				definition = "Set of characteristics, such as the identification or the creation date and time, specific to the message.";
				previousVersion_lazy = () -> MessageHeader2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public MessageHeader9 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<ISODateTime> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public MessageHeader9 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	public Optional<RequestType4Choice> getRequestType() {
		return requestType == null ? Optional.empty() : Optional.of(requestType);
	}

	public MessageHeader9 setRequestType(RequestType4Choice requestType) {
		this.requestType = requestType;
		return this;
	}
}