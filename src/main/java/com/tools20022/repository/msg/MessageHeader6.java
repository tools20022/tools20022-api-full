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
import com.tools20022.repository.area.camt.ReturnStandingOrderV03;
import com.tools20022.repository.choice.RequestType3Choice;
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
 * {@linkplain com.tools20022.repository.msg.MessageHeader6#mmMessageIdentification
 * MessageHeader6.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader6#mmCreationDateTime
 * MessageHeader6.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader6#mmOriginalBusinessQuery
 * MessageHeader6.mmOriginalBusinessQuery}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageHeader6#mmQueryName
 * MessageHeader6.mmQueryName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageHeader6#mmRequestType
 * MessageHeader6.mmRequestType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03#mmMessageHeader
 * ReturnStandingOrderV03.mmMessageHeader}</li>
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
 * "MessageHeader6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics, such as the identification or the creation date and time, specific to the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageHeader6", propOrder = {"messageIdentification", "creationDateTime", "originalBusinessQuery", "queryName", "requestType"})
public class MessageHeader6 {

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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader6 MessageHeader6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader6, Max35Text> mmMessageIdentification = new MMMessageAttribute<MessageHeader6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader6.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the sender, to unambiguously identify the message.\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MessageHeader6 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(MessageHeader6 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader6 MessageHeader6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader6, Optional<ISODateTime>> mmCreationDateTime = new MMMessageAttribute<MessageHeader6, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader6.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MessageHeader6 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(MessageHeader6 obj, Optional<ISODateTime> value) {
			obj.setCreationDateTime(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader6 MessageHeader6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageHeader6, Optional<OriginalBusinessQuery1>> mmOriginalBusinessQuery = new MMMessageAssociationEnd<MessageHeader6, Optional<OriginalBusinessQuery1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBizQry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBusinessQuery";
			definition = "Unique identification of the original query message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalBusinessQuery1.mmObject();
		}

		@Override
		public Optional<OriginalBusinessQuery1> getValue(MessageHeader6 obj) {
			return obj.getOriginalBusinessQuery();
		}

		@Override
		public void setValue(MessageHeader6 obj, Optional<OriginalBusinessQuery1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.MessageHeader6 MessageHeader6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader6, Optional<Max35Text>> mmQueryName = new MMMessageAttribute<MessageHeader6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader6.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MessageHeader6 obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(MessageHeader6 obj, Optional<Max35Text> value) {
			obj.setQueryName(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqTp")
	protected RequestType3Choice requestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RequestType3Choice
	 * RequestType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader6 MessageHeader6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MessageHeader6, Optional<RequestType3Choice>> mmRequestType = new MMMessageAssociationEnd<MessageHeader6, Optional<RequestType3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader6.mmObject();
			isDerived = false;
			xmlTag = "ReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestType";
			definition = "Specific actions to be executed through the request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RequestType3Choice.mmObject();
		}

		@Override
		public Optional<RequestType3Choice> getValue(MessageHeader6 obj) {
			return obj.getRequestType();
		}

		@Override
		public void setValue(MessageHeader6 obj, Optional<RequestType3Choice> value) {
			obj.setRequestType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageHeader6.mmMessageIdentification, com.tools20022.repository.msg.MessageHeader6.mmCreationDateTime,
						com.tools20022.repository.msg.MessageHeader6.mmOriginalBusinessQuery, com.tools20022.repository.msg.MessageHeader6.mmQueryName, com.tools20022.repository.msg.MessageHeader6.mmRequestType);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReturnStandingOrderV03.mmMessageHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageHeader6";
				definition = "Set of characteristics, such as the identification or the creation date and time, specific to the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public MessageHeader6 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<ISODateTime> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public MessageHeader6 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	public Optional<OriginalBusinessQuery1> getOriginalBusinessQuery() {
		return originalBusinessQuery == null ? Optional.empty() : Optional.of(originalBusinessQuery);
	}

	public MessageHeader6 setOriginalBusinessQuery(OriginalBusinessQuery1 originalBusinessQuery) {
		this.originalBusinessQuery = originalBusinessQuery;
		return this;
	}

	public Optional<Max35Text> getQueryName() {
		return queryName == null ? Optional.empty() : Optional.of(queryName);
	}

	public MessageHeader6 setQueryName(Max35Text queryName) {
		this.queryName = queryName;
		return this;
	}

	public Optional<RequestType3Choice> getRequestType() {
		return requestType == null ? Optional.empty() : Optional.of(requestType);
	}

	public MessageHeader6 setRequestType(RequestType3Choice requestType) {
		this.requestType = requestType;
		return this;
	}
}