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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max13AlphaNumericText;
import com.tools20022.repository.datatype.Max14Text;
import com.tools20022.repository.datatype.Max6Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class IsabelAdminHeader2 {

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
	public static final MMMessageAttribute mmActualSenderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMMessageAssociationEnd mmPayloadCreationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "PyldCreDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadCreationDate";
			definition = "Date and time at which the file in the payload was actually created.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Max6Text messageRequestType;
	/**
	 * Unique identification of the request type of the message in the payload.
	 * <p>
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
	public static final MMMessageAttribute mmMessageRequestType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgReqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRequestType";
			definition = "Unique identification of the request type of the message in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected Max14Text messageIdentification;
	/**
	 * Unique identification as assigned by the bank to identify the
	 * administrative instruction.
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
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification as assigned by the bank to identify the administrative instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14Text.mmObject();
		}
	};
	protected Max13AlphaNumericText destinationMailBoxIdentification;
	/**
	 * Unique identification of the destination mailbox.
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
	public static final MMMessageAttribute mmDestinationMailBoxIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "DstnMailBxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationMailBoxIdentification";
			definition = "Unique identification of the destination mailbox.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	protected Max14Text referredMessage;
	/**
	 * Unique identification of the message to which the administration
	 * instruction refers.
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
	public static final MMMessageAttribute mmReferredMessage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdMsg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredMessage";
			definition = "Unique identification of the message to which the administration instruction refers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max14Text.mmObject();
		}
	};
	protected ISODateTime referredSendTimeStamp;
	/**
	 * Send time stamp of the message to which the administrative instruction
	 * refers.
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
	public static final MMMessageAttribute mmReferredSendTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelAdminHeader2.mmObject();
			isDerived = false;
			xmlTag = "RfrdSndTmStmp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredSendTimeStamp";
			definition = "Send time stamp of the message to which the administrative instruction refers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelAdminHeader2.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelAdminHeader2.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmMessageRequestType, com.tools20022.repository.msg.IsabelAdminHeader2.mmMessageIdentification,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmDestinationMailBoxIdentification, com.tools20022.repository.msg.IsabelAdminHeader2.mmReferredMessage,
						com.tools20022.repository.msg.IsabelAdminHeader2.mmReferredSendTimeStamp);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelAdminHeader2";
				definition = "Specifies the header information for an administrative file.";
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

	public Max6Text getMessageRequestType() {
		return messageRequestType;
	}

	public void setMessageRequestType(Max6Text messageRequestType) {
		this.messageRequestType = messageRequestType;
	}

	public Max14Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max14Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public Max13AlphaNumericText getDestinationMailBoxIdentification() {
		return destinationMailBoxIdentification;
	}

	public void setDestinationMailBoxIdentification(Max13AlphaNumericText destinationMailBoxIdentification) {
		this.destinationMailBoxIdentification = destinationMailBoxIdentification;
	}

	public Max14Text getReferredMessage() {
		return referredMessage;
	}

	public void setReferredMessage(Max14Text referredMessage) {
		this.referredMessage = referredMessage;
	}

	public ISODateTime getReferredSendTimeStamp() {
		return referredSendTimeStamp;
	}

	public void setReferredSendTimeStamp(ISODateTime referredSendTimeStamp) {
		this.referredSendTimeStamp = referredSendTimeStamp;
	}
}