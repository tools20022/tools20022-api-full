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
import com.tools20022.repository.area.admi.ReceiptAcknowledgementV01;
import com.tools20022.repository.area.admi.ReportQueryRequestV01;
import com.tools20022.repository.area.admi.ResendRequestV01;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.choice.RequestType4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalBusinessQuery1;
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
 * {@linkplain com.tools20022.repository.msg.MessageHeader7#mmMessageIdentification
 * MessageHeader7.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader7#mmCreationDateTime
 * MessageHeader7.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageHeader7#mmRequestType
 * MessageHeader7.mmRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader7#mmOriginalBusinessQuery
 * MessageHeader7.mmOriginalBusinessQuery}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageHeader7#mmQueryName
 * MessageHeader7.mmQueryName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnAccountV07#mmMessageHeader
 * ReturnAccountV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03#mmMessageHeader
 * ReturnCurrencyExchangeRateV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnLimitV07#mmMessageHeader
 * ReturnLimitV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnMemberV03#mmMessageHeader
 * ReturnMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnBusinessDayInformationV06#mmMessageHeader
 * ReturnBusinessDayInformationV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnGeneralBusinessInformationV05#mmMessageHeader
 * ReturnGeneralBusinessInformationV05.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnReservationV05#mmMessageHeader
 * ReturnReservationV05.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReportQueryRequestV01#mmMessageHeader
 * ReportQueryRequestV01.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ResendRequestV01#mmMessageHeader
 * ResendRequestV01.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReceiptAcknowledgementV01#mmMessageIdentification
 * ReceiptAcknowledgementV01.mmMessageIdentification}</li>
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
 * "MessageHeader7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics, such as the identification or the creation date and time, specific to the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.MessageHeader3
 * MessageHeader3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageHeader7", propOrder = {"messageIdentification", "creationDateTime", "requestType", "originalBusinessQuery", "queryName"})
public class MessageHeader7 {

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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader7 MessageHeader7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader3#mmMessageIdentification
	 * MessageHeader3.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader7, Max35Text> mmMessageIdentification = new MMMessageAttribute<MessageHeader7, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader7.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the sender, to unambiguously identify the message.\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period.";
			previousVersion_lazy = () -> MessageHeader3.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MessageHeader7 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(MessageHeader7 obj, Max35Text value) {
			obj.setMessageIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader7 MessageHeader7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader3#mmCreationDateTime
	 * MessageHeader3.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader7, Optional<ISODateTime>> mmCreationDateTime = new MMMessageAttribute<MessageHeader7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader7.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			previousVersion_lazy = () -> MessageHeader3.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MessageHeader7 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(MessageHeader7 obj, Optional<ISODateTime> value) {
			obj.setCreationDateTime(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader7 MessageHeader7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader3#mmRequestType
	 * MessageHeader3.mmRequestType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader7, Optional<RequestType4Choice>> mmRequestType = new MMMessageAttribute<MessageHeader7, Optional<RequestType4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader7.mmObject();
			isDerived = false;
			xmlTag = "ReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestType";
			definition = "Specific actions to be executed through the request.";
			previousVersion_lazy = () -> MessageHeader3.mmRequestType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RequestType4Choice.mmObject();
		}

		@Override
		public Optional<RequestType4Choice> getValue(MessageHeader7 obj) {
			return obj.getRequestType();
		}

		@Override
		public void setValue(MessageHeader7 obj, Optional<RequestType4Choice> value) {
			obj.setRequestType(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlBizQry")
	protected OriginalBusinessQuery1 originalBusinessQuery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalBusinessQuery1
	 * OriginalBusinessQuery1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader7 MessageHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBizQry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBusinessQuery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the original query message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader3#mmOriginalBusinessQuery
	 * MessageHeader3.mmOriginalBusinessQuery}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageHeader7, Optional<OriginalBusinessQuery1>> mmOriginalBusinessQuery = new MMMessageAssociationEnd<MessageHeader7, Optional<OriginalBusinessQuery1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader7.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBizQry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBusinessQuery";
			definition = "Unique identification of the original query message.";
			previousVersion_lazy = () -> MessageHeader3.mmOriginalBusinessQuery;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalBusinessQuery1.mmObject();
		}

		@Override
		public Optional<OriginalBusinessQuery1> getValue(MessageHeader7 obj) {
			return obj.getOriginalBusinessQuery();
		}

		@Override
		public void setValue(MessageHeader7 obj, Optional<OriginalBusinessQuery1> value) {
			obj.setOriginalBusinessQuery(value.orElse(null));
		}
	};
	@XmlElement(name = "QryNm")
	protected Max35Text queryName;
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader7 MessageHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recalls the criteria (search and return criteria) defined in a preceding query."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader3#mmQueryName
	 * MessageHeader3.mmQueryName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader7, Optional<Max35Text>> mmQueryName = new MMMessageAttribute<MessageHeader7, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader7.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			previousVersion_lazy = () -> MessageHeader3.mmQueryName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MessageHeader7 obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(MessageHeader7 obj, Optional<Max35Text> value) {
			obj.setQueryName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageHeader7.mmMessageIdentification, com.tools20022.repository.msg.MessageHeader7.mmCreationDateTime,
						com.tools20022.repository.msg.MessageHeader7.mmRequestType, com.tools20022.repository.msg.MessageHeader7.mmOriginalBusinessQuery, com.tools20022.repository.msg.MessageHeader7.mmQueryName);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReturnAccountV07.mmMessageHeader, ReturnCurrencyExchangeRateV03.mmMessageHeader, ReturnLimitV07.mmMessageHeader, ReturnMemberV03.mmMessageHeader,
						ReturnBusinessDayInformationV06.mmMessageHeader, ReturnGeneralBusinessInformationV05.mmMessageHeader, ReturnReservationV05.mmMessageHeader, ReportQueryRequestV01.mmMessageHeader, ResendRequestV01.mmMessageHeader,
						ReceiptAcknowledgementV01.mmMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageHeader7";
				definition = "Set of characteristics, such as the identification or the creation date and time, specific to the message.";
				previousVersion_lazy = () -> MessageHeader3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public MessageHeader7 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<ISODateTime> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public MessageHeader7 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	public Optional<RequestType4Choice> getRequestType() {
		return requestType == null ? Optional.empty() : Optional.of(requestType);
	}

	public MessageHeader7 setRequestType(RequestType4Choice requestType) {
		this.requestType = requestType;
		return this;
	}

	public Optional<OriginalBusinessQuery1> getOriginalBusinessQuery() {
		return originalBusinessQuery == null ? Optional.empty() : Optional.of(originalBusinessQuery);
	}

	public MessageHeader7 setOriginalBusinessQuery(OriginalBusinessQuery1 originalBusinessQuery) {
		this.originalBusinessQuery = originalBusinessQuery;
		return this;
	}

	public Optional<Max35Text> getQueryName() {
		return queryName == null ? Optional.empty() : Optional.of(queryName);
	}

	public MessageHeader7 setQueryName(Max35Text queryName) {
		this.queryName = queryName;
		return this;
	}
}