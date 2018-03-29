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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max13AlphaNumericText;
import com.tools20022.repository.datatype.Max14Text;
import com.tools20022.repository.datatype.Max6Text;
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
 * Specifies the header information for an administrative file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmActualSenderIdentification
 * IsabelAdminHeader2.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmPayloadCreationDate
 * IsabelAdminHeader2.mmPayloadCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmMessageRequestType
 * IsabelAdminHeader2.mmMessageRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmMessageIdentification
 * IsabelAdminHeader2.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmDestinationMailBoxIdentification
 * IsabelAdminHeader2.mmDestinationMailBoxIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmReferredMessage
 * IsabelAdminHeader2.mmReferredMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2#mmReferredSendTimeStamp
 * IsabelAdminHeader2.mmReferredSendTimeStamp}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelAdminHeader2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the header information for an administrative file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelAdminHeader2", propOrder = {"actualSenderIdentification", "payloadCreationDate", "messageRequestType", "messageIdentification", "destinationMailBoxIdentification", "referredMessage", "referredSendTimeStamp"})
public class IsabelAdminHeader2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActlSndrId", required = true)
	protected Max13AlphaNumericText actualSenderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max13AlphaNumericText
	 * Max13AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlSndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualSenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the actual sender of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Max13AlphaNumericText> mmActualSenderIdentification = new MMMessageAttribute<IsabelAdminHeader2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualSenderIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Max13AlphaNumericText getValue(IsabelAdminHeader2 obj) {
			return obj.getActualSenderIdentification();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Max13AlphaNumericText value) {
			obj.setActualSenderIdentification(value);
		}
	};
	@XmlElement(name = "PyldCreDt", required = true)
	protected DateAndDateTimeChoice payloadCreationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldCreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadCreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the file in the payload was actually created."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelAdminHeader2, DateAndDateTimeChoice> mmPayloadCreationDate = new MMMessageAssociationEnd<IsabelAdminHeader2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "PyldCreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadCreationDate";
			definition = "Date and time at which the file in the payload was actually created.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IsabelAdminHeader2 obj) {
			return obj.getPayloadCreationDate();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, DateAndDateTimeChoice value) {
			obj.setPayloadCreationDate(value);
		}
	};
	@XmlElement(name = "MsgReqTp", required = true)
	protected Max6Text messageRequestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgReqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the request type of the message in the payload."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Max6Text> mmMessageRequestType = new MMMessageAttribute<IsabelAdminHeader2, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRequestType";
			definition = "Unique identification of the request type of the message in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(IsabelAdminHeader2 obj) {
			return obj.getMessageRequestType();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Max6Text value) {
			obj.setMessageRequestType(value);
		}
	};
	@XmlElement(name = "MsgId", required = true)
	protected Max14Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max14Text
	 * Max14Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
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
	 * "Unique identification as assigned by the bank to identify the administrative instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Max14Text> mmMessageIdentification = new MMMessageAttribute<IsabelAdminHeader2, Max14Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification as assigned by the bank to identify the administrative instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14Text.mmObject();
		}

		@Override
		public Max14Text getValue(IsabelAdminHeader2 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Max14Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "DstnMailBxId")
	protected Max13AlphaNumericText destinationMailBoxIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max13AlphaNumericText
	 * Max13AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstnMailBxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DestinationMailBoxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the destination mailbox."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Optional<Max13AlphaNumericText>> mmDestinationMailBoxIdentification = new MMMessageAttribute<IsabelAdminHeader2, Optional<Max13AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "DstnMailBxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationMailBoxIdentification";
			definition = "Unique identification of the destination mailbox.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max13AlphaNumericText> getValue(IsabelAdminHeader2 obj) {
			return obj.getDestinationMailBoxIdentification();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Optional<Max13AlphaNumericText> value) {
			obj.setDestinationMailBoxIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrdMsg")
	protected Max14Text referredMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max14Text
	 * Max14Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the message to which the administration instruction refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Optional<Max14Text>> mmReferredMessage = new MMMessageAttribute<IsabelAdminHeader2, Optional<Max14Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredMessage";
			definition = "Unique identification of the message to which the administration instruction refers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max14Text.mmObject();
		}

		@Override
		public Optional<Max14Text> getValue(IsabelAdminHeader2 obj) {
			return obj.getReferredMessage();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Optional<Max14Text> value) {
			obj.setReferredMessage(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrdSndTmStmp")
	protected ISODateTime referredSendTimeStamp;
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
	 * {@linkplain com.tools20022.repository.msg.IsabelAdminHeader2
	 * IsabelAdminHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdSndTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredSendTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Send time stamp of the message to which the administrative instruction refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelAdminHeader2, Optional<ISODateTime>> mmReferredSendTimeStamp = new MMMessageAttribute<IsabelAdminHeader2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdSndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredSendTimeStamp";
			definition = "Send time stamp of the message to which the administrative instruction refers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IsabelAdminHeader2 obj) {
			return obj.getReferredSendTimeStamp();
		}

		@Override
		public void setValue(IsabelAdminHeader2 obj, Optional<ISODateTime> value) {
			obj.setReferredSendTimeStamp(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelAdminHeader2.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelAdminHeader2.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmMessageRequestType, com.tools20022.repository.msg.IsabelAdminHeader2.mmMessageIdentification,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmDestinationMailBoxIdentification, com.tools20022.repository.msg.IsabelAdminHeader2.mmReferredMessage,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmReferredSendTimeStamp);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelAdminHeader2";
				definition = "Specifies the header information for an administrative file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelAdminHeader2 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelAdminHeader2 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public Max6Text getMessageRequestType() {
		return messageRequestType;
	}

	public IsabelAdminHeader2 setMessageRequestType(Max6Text messageRequestType) {
		this.messageRequestType = Objects.requireNonNull(messageRequestType);
		return this;
	}

	public Max14Text getMessageIdentification() {
		return messageIdentification;
	}

	public IsabelAdminHeader2 setMessageIdentification(Max14Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<Max13AlphaNumericText> getDestinationMailBoxIdentification() {
		return destinationMailBoxIdentification == null ? Optional.empty() : Optional.of(destinationMailBoxIdentification);
	}

	public IsabelAdminHeader2 setDestinationMailBoxIdentification(Max13AlphaNumericText destinationMailBoxIdentification) {
		this.destinationMailBoxIdentification = destinationMailBoxIdentification;
		return this;
	}

	public Optional<Max14Text> getReferredMessage() {
		return referredMessage == null ? Optional.empty() : Optional.of(referredMessage);
	}

	public IsabelAdminHeader2 setReferredMessage(Max14Text referredMessage) {
		this.referredMessage = referredMessage;
		return this;
	}

	public Optional<ISODateTime> getReferredSendTimeStamp() {
		return referredSendTimeStamp == null ? Optional.empty() : Optional.of(referredSendTimeStamp);
	}

	public IsabelAdminHeader2 setReferredSendTimeStamp(ISODateTime referredSendTimeStamp) {
		this.referredSendTimeStamp = referredSendTimeStamp;
		return this;
	}
}