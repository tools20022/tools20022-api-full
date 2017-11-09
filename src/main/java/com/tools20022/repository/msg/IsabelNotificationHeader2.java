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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class IsabelNotificationHeader2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max13AlphaNumericText actualSenderIdentification;
	/**
	 * Unique identification of the actual sender of the file.
	 * <p>
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
	public static final MMMessageAttribute mmActualSenderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualSenderIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	protected DateAndDateTimeChoice payloadCreationDate;
	/**
	 * Date and time at which the file in the payload was actually created.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPayloadCreationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelNotificationHeader2.mmObject();
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
	};
	protected Max14AlphaNumericText referredMessage;
	/**
	 * Unique identification of the message to which the notification refers.
	 * <p>
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
	public static final MMMessageAttribute mmReferredMessage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredMessage";
			definition = "Unique identification of the message to which the notification refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14AlphaNumericText.mmObject();
		}
	};
	protected ISODateTime referredSendTimeStamp;
	/**
	 * Send time stamp of the message to which the notification refers.
	 * <p>
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
	public static final MMMessageAttribute mmReferredSendTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdSndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredSendTimeStamp";
			definition = "Send time stamp of the message to which the notification refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max14Text messageIdentification;
	/**
	 * Unique identification as assigned by the bank to identify the
	 * notification.
	 * <p>
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
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelNotificationHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification as assigned by the bank to identify the notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IsabelNotificationHeader2.mmActualSenderIdentification, IsabelNotificationHeader2.mmPayloadCreationDate, IsabelNotificationHeader2.mmReferredMessage,
						IsabelNotificationHeader2.mmReferredSendTimeStamp, IsabelNotificationHeader2.mmMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = actualSenderIdentification;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public void setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = payloadCreationDate;
	}

	public Max14AlphaNumericText getReferredMessage() {
		return referredMessage;
	}

	public void setReferredMessage(Max14AlphaNumericText referredMessage) {
		this.referredMessage = referredMessage;
	}

	public ISODateTime getReferredSendTimeStamp() {
		return referredSendTimeStamp;
	}

	public void setReferredSendTimeStamp(ISODateTime referredSendTimeStamp) {
		this.referredSendTimeStamp = referredSendTimeStamp;
	}

	public Max14Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max14Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}
}