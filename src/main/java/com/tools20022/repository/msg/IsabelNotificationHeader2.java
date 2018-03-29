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
import com.tools20022.repository.datatype.Max14AlphaNumericText;
import com.tools20022.repository.datatype.Max14Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the header information for an ISANot file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2#mmActualSenderIdentification
 * IsabelNotificationHeader2.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2#mmPayloadCreationDate
 * IsabelNotificationHeader2.mmPayloadCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2#mmReferredMessage
 * IsabelNotificationHeader2.mmReferredMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2#mmReferredSendTimeStamp
 * IsabelNotificationHeader2.mmReferredSendTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2#mmMessageIdentification
 * IsabelNotificationHeader2.mmMessageIdentification}</li>
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
 * "IsabelNotificationHeader2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the header information for an ISANot file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelNotificationHeader2", propOrder = {"actualSenderIdentification", "payloadCreationDate", "referredMessage", "referredSendTimeStamp", "messageIdentification"})
public class IsabelNotificationHeader2 {

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
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
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
	public static final MMMessageAttribute<IsabelNotificationHeader2, Max13AlphaNumericText> mmActualSenderIdentification = new MMMessageAttribute<IsabelNotificationHeader2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelNotificationHeader2.mmObject();
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
		public Max13AlphaNumericText getValue(IsabelNotificationHeader2 obj) {
			return obj.getActualSenderIdentification();
		}

		@Override
		public void setValue(IsabelNotificationHeader2 obj, Max13AlphaNumericText value) {
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
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
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
	public static final MMMessageAssociationEnd<IsabelNotificationHeader2, DateAndDateTimeChoice> mmPayloadCreationDate = new MMMessageAssociationEnd<IsabelNotificationHeader2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelNotificationHeader2.mmObject();
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
		public DateAndDateTimeChoice getValue(IsabelNotificationHeader2 obj) {
			return obj.getPayloadCreationDate();
		}

		@Override
		public void setValue(IsabelNotificationHeader2 obj, DateAndDateTimeChoice value) {
			obj.setPayloadCreationDate(value);
		}
	};
	@XmlElement(name = "RfrdMsg", required = true)
	protected Max14AlphaNumericText referredMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max14AlphaNumericText
	 * Max14AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
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
	 * "Unique identification of the message to which the notification refers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelNotificationHeader2, Max14AlphaNumericText> mmReferredMessage = new MMMessageAttribute<IsabelNotificationHeader2, Max14AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredMessage";
			definition = "Unique identification of the message to which the notification refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14AlphaNumericText.mmObject();
		}

		@Override
		public Max14AlphaNumericText getValue(IsabelNotificationHeader2 obj) {
			return obj.getReferredMessage();
		}

		@Override
		public void setValue(IsabelNotificationHeader2 obj, Max14AlphaNumericText value) {
			obj.setReferredMessage(value);
		}
	};
	@XmlElement(name = "RfrdSndTmStmp", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
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
	 * "Send time stamp of the message to which the notification refers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelNotificationHeader2, ISODateTime> mmReferredSendTimeStamp = new MMMessageAttribute<IsabelNotificationHeader2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdSndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredSendTimeStamp";
			definition = "Send time stamp of the message to which the notification refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IsabelNotificationHeader2 obj) {
			return obj.getReferredSendTimeStamp();
		}

		@Override
		public void setValue(IsabelNotificationHeader2 obj, ISODateTime value) {
			obj.setReferredSendTimeStamp(value);
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
	 * {@linkplain com.tools20022.repository.msg.IsabelNotificationHeader2
	 * IsabelNotificationHeader2}</li>
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
	 * "Unique identification as assigned by the bank to identify the notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelNotificationHeader2, Max14Text> mmMessageIdentification = new MMMessageAttribute<IsabelNotificationHeader2, Max14Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification as assigned by the bank to identify the notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14Text.mmObject();
		}

		@Override
		public Max14Text getValue(IsabelNotificationHeader2 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(IsabelNotificationHeader2 obj, Max14Text value) {
			obj.setMessageIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelNotificationHeader2.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelNotificationHeader2.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelNotificationHeader2.mmReferredMessage, com.tools20022.repository.msg.IsabelNotificationHeader2.mmReferredSendTimeStamp,
						com.tools20022.repository.msg.IsabelNotificationHeader2.mmMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelNotificationHeader2";
				definition = "Specifies the header information for an ISANot file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelNotificationHeader2 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelNotificationHeader2 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public Max14AlphaNumericText getReferredMessage() {
		return referredMessage;
	}

	public IsabelNotificationHeader2 setReferredMessage(Max14AlphaNumericText referredMessage) {
		this.referredMessage = Objects.requireNonNull(referredMessage);
		return this;
	}

	public ISODateTime getReferredSendTimeStamp() {
		return referredSendTimeStamp;
	}

	public IsabelNotificationHeader2 setReferredSendTimeStamp(ISODateTime referredSendTimeStamp) {
		this.referredSendTimeStamp = Objects.requireNonNull(referredSendTimeStamp);
		return this;
	}

	public Max14Text getMessageIdentification() {
		return messageIdentification;
	}

	public IsabelNotificationHeader2 setMessageIdentification(Max14Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}
}