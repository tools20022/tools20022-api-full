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
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max4Text;
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
 * Contains the meta data for a netting cut off update request: message
 * identification, request servicer and a request type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestData1#mmMessageIdentification
 * RequestData1.mmMessageIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestData1#mmRequestType
 * RequestData1.mmRequestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestData1#mmRequestedActivationDate
 * RequestData1.mmRequestedActivationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestData1#mmRequestServicer
 * RequestData1.mmRequestServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestData1#mmNetServiceParticipantIdentification
 * RequestData1.mmNetServiceParticipantIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestData1#mmNetServiceType
 * RequestData1.mmNetServiceType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01#mmRequestData
 * NettingCutOffReferenceDataUpdateRequestV01.mmRequestData}</li>
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
 * "RequestData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the meta data for a netting cut off update request: message identification, request servicer and a request type."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestData1", propOrder = {"messageIdentification", "requestType", "requestedActivationDate", "requestServicer", "netServiceParticipantIdentification", "netServiceType"})
public class RequestData1 {

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
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
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
	 * definition} = "Unique identification of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestData1, Max35Text> mmMessageIdentification = new MMMessageAttribute<RequestData1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RequestData1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(RequestData1 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "ReqTp", required = true)
	protected Max4Text requestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
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
	 * definition} = "Description of the type of request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestData1, Max4Text> mmRequestType = new MMMessageAttribute<RequestData1, Max4Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "ReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestType";
			definition = "Description of the type of request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Max4Text getValue(RequestData1 obj) {
			return obj.getRequestType();
		}

		@Override
		public void setValue(RequestData1 obj, Max4Text value) {
			obj.setRequestType(value);
		}
	};
	@XmlElement(name = "ReqdActvtnDt", required = true)
	protected ISODate requestedActivationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business date on which the new netting cut off(s) is (are) to be activated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestData1, ISODate> mmRequestedActivationDate = new MMMessageAttribute<RequestData1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "ReqdActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedActivationDate";
			definition = "Specifies the business date on which the new netting cut off(s) is (are) to be activated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RequestData1 obj) {
			return obj.getRequestedActivationDate();
		}

		@Override
		public void setValue(RequestData1 obj, ISODate value) {
			obj.setRequestedActivationDate(value);
		}
	};
	@XmlElement(name = "ReqSvcr")
	protected PartyIdentification73Choice requestServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the central system servicing the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestData1, Optional<PartyIdentification73Choice>> mmRequestServicer = new MMMessageAssociationEnd<RequestData1, Optional<PartyIdentification73Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "ReqSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestServicer";
			definition = "Describes the central system servicing the request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(RequestData1 obj) {
			return obj.getRequestServicer();
		}

		@Override
		public void setValue(RequestData1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setRequestServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "NetSvcPtcptId", required = true)
	protected PartyIdentification73Choice netServiceParticipantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcPtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the participant issuing the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestData1, PartyIdentification73Choice> mmNetServiceParticipantIdentification = new MMMessageAssociationEnd<RequestData1, PartyIdentification73Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcPtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceParticipantIdentification";
			definition = "Describes the participant issuing the request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public PartyIdentification73Choice getValue(RequestData1 obj) {
			return obj.getNetServiceParticipantIdentification();
		}

		@Override
		public void setValue(RequestData1 obj, PartyIdentification73Choice value) {
			obj.setNetServiceParticipantIdentification(value);
		}
	};
	@XmlElement(name = "NetSvcTp")
	protected Max35Text netServiceType;
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
	 * {@linkplain com.tools20022.repository.msg.RequestData1 RequestData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of netting service supporting the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestData1, Optional<Max35Text>> mmNetServiceType = new MMMessageAttribute<RequestData1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceType";
			definition = "Describes the type of netting service supporting the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RequestData1 obj) {
			return obj.getNetServiceType();
		}

		@Override
		public void setValue(RequestData1 obj, Optional<Max35Text> value) {
			obj.setNetServiceType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestData1.mmMessageIdentification, com.tools20022.repository.msg.RequestData1.mmRequestType,
						com.tools20022.repository.msg.RequestData1.mmRequestedActivationDate, com.tools20022.repository.msg.RequestData1.mmRequestServicer, com.tools20022.repository.msg.RequestData1.mmNetServiceParticipantIdentification,
						com.tools20022.repository.msg.RequestData1.mmNetServiceType);
				messageBuildingBlock_lazy = () -> Arrays.asList(NettingCutOffReferenceDataUpdateRequestV01.mmRequestData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestData1";
				definition = "Contains the meta data for a netting cut off update request: message identification, request servicer and a request type.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public RequestData1 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Max4Text getRequestType() {
		return requestType;
	}

	public RequestData1 setRequestType(Max4Text requestType) {
		this.requestType = Objects.requireNonNull(requestType);
		return this;
	}

	public ISODate getRequestedActivationDate() {
		return requestedActivationDate;
	}

	public RequestData1 setRequestedActivationDate(ISODate requestedActivationDate) {
		this.requestedActivationDate = Objects.requireNonNull(requestedActivationDate);
		return this;
	}

	public Optional<PartyIdentification73Choice> getRequestServicer() {
		return requestServicer == null ? Optional.empty() : Optional.of(requestServicer);
	}

	public RequestData1 setRequestServicer(PartyIdentification73Choice requestServicer) {
		this.requestServicer = requestServicer;
		return this;
	}

	public PartyIdentification73Choice getNetServiceParticipantIdentification() {
		return netServiceParticipantIdentification;
	}

	public RequestData1 setNetServiceParticipantIdentification(PartyIdentification73Choice netServiceParticipantIdentification) {
		this.netServiceParticipantIdentification = Objects.requireNonNull(netServiceParticipantIdentification);
		return this;
	}

	public Optional<Max35Text> getNetServiceType() {
		return netServiceType == null ? Optional.empty() : Optional.of(netServiceType);
	}

	public RequestData1 setNetServiceType(Max35Text netServiceType) {
		this.netServiceType = netServiceType;
		return this;
	}
}