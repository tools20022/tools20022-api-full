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
import com.tools20022.repository.codeset.CardServiceType2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ResponseType2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Network management transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction12#mmNetworkManagementType
 * CardTransaction12.mmNetworkManagementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction12#mmInitiatorDateTime
 * CardTransaction12.mmInitiatorDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction12#mmNumberOfMessages
 * CardTransaction12.mmNumberOfMessages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction12#mmMaximumNumberOfMessages
 * CardTransaction12.mmMaximumNumberOfMessages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction12#mmTransactionResponse
 * CardTransaction12.mmTransactionResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransaction12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Network management transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction13
 * CardTransaction13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransaction11
 * CardTransaction11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction12", propOrder = {"networkManagementType", "initiatorDateTime", "numberOfMessages", "maximumNumberOfMessages", "transactionResponse"})
public class CardTransaction12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtwkMgmtTp", required = true)
	protected CardServiceType2Code networkManagementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkMgmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of network management service (correspond to the ISO 8583 field 24)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction11#mmNetworkManagementType
	 * CardTransaction11.mmNetworkManagementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction12, CardServiceType2Code> mmNetworkManagementType = new MMMessageAttribute<CardTransaction12, CardServiceType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction12.mmObject();
			isDerived = false;
			xmlTag = "NtwkMgmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementType";
			definition = "Type of network management service (correspond to the ISO 8583 field 24).";
			previousVersion_lazy = () -> CardTransaction11.mmNetworkManagementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardServiceType2Code.mmObject();
		}

		@Override
		public CardServiceType2Code getValue(CardTransaction12 obj) {
			return obj.getNetworkManagementType();
		}

		@Override
		public void setValue(CardTransaction12 obj, CardServiceType2Code value) {
			obj.setNetworkManagementType(value);
		}
	};
	@XmlElement(name = "InitrDtTm")
	protected ISODateTime initiatorDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction12, Optional<ISODateTime>> mmInitiatorDateTime = new MMMessageAttribute<CardTransaction12, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction12.mmObject();
			isDerived = false;
			xmlTag = "InitrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorDateTime";
			definition = "Date and time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CardTransaction12 obj) {
			return obj.getInitiatorDateTime();
		}

		@Override
		public void setValue(CardTransaction12 obj, Optional<ISODateTime> value) {
			obj.setInitiatorDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "NbOfMsgs")
	protected Number numberOfMessages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfMsgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfMessages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of messages in the store and forward queue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction11#mmNumberOfMessages
	 * CardTransaction11.mmNumberOfMessages}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction12, Optional<Number>> mmNumberOfMessages = new MMMessageAttribute<CardTransaction12, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction12.mmObject();
			isDerived = false;
			xmlTag = "NbOfMsgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfMessages";
			definition = "Number of messages in the store and forward queue.";
			previousVersion_lazy = () -> CardTransaction11.mmNumberOfMessages;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction12 obj) {
			return obj.getNumberOfMessages();
		}

		@Override
		public void setValue(CardTransaction12 obj, Optional<Number> value) {
			obj.setNumberOfMessages(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxNbOfMsgs")
	protected Number maximumNumberOfMessages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNbOfMsgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumberOfMessages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of messages in the store and forward queue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction11#mmMaximumNumberOfMessages
	 * CardTransaction11.mmMaximumNumberOfMessages}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction12, Optional<Number>> mmMaximumNumberOfMessages = new MMMessageAttribute<CardTransaction12, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction12.mmObject();
			isDerived = false;
			xmlTag = "MaxNbOfMsgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumberOfMessages";
			definition = "Maximum number of messages in the store and forward queue.";
			previousVersion_lazy = () -> CardTransaction11.mmMaximumNumberOfMessages;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardTransaction12 obj) {
			return obj.getMaximumNumberOfMessages();
		}

		@Override
		public void setValue(CardTransaction12 obj, Optional<Number> value) {
			obj.setMaximumNumberOfMessages(value.orElse(null));
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected ResponseType2 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType2
	 * ResponseType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the network management request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction12, ResponseType2> mmTransactionResponse = new MMMessageAssociationEnd<CardTransaction12, ResponseType2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction12.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response to the network management request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType2.mmObject();
		}

		@Override
		public ResponseType2 getValue(CardTransaction12 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(CardTransaction12 obj, ResponseType2 value) {
			obj.setTransactionResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction12.mmNetworkManagementType, com.tools20022.repository.msg.CardTransaction12.mmInitiatorDateTime,
						com.tools20022.repository.msg.CardTransaction12.mmNumberOfMessages, com.tools20022.repository.msg.CardTransaction12.mmMaximumNumberOfMessages, com.tools20022.repository.msg.CardTransaction12.mmTransactionResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction12";
				definition = "Network management transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction13.mmObject());
				previousVersion_lazy = () -> CardTransaction11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardServiceType2Code getNetworkManagementType() {
		return networkManagementType;
	}

	public CardTransaction12 setNetworkManagementType(CardServiceType2Code networkManagementType) {
		this.networkManagementType = Objects.requireNonNull(networkManagementType);
		return this;
	}

	public Optional<ISODateTime> getInitiatorDateTime() {
		return initiatorDateTime == null ? Optional.empty() : Optional.of(initiatorDateTime);
	}

	public CardTransaction12 setInitiatorDateTime(ISODateTime initiatorDateTime) {
		this.initiatorDateTime = initiatorDateTime;
		return this;
	}

	public Optional<Number> getNumberOfMessages() {
		return numberOfMessages == null ? Optional.empty() : Optional.of(numberOfMessages);
	}

	public CardTransaction12 setNumberOfMessages(Number numberOfMessages) {
		this.numberOfMessages = numberOfMessages;
		return this;
	}

	public Optional<Number> getMaximumNumberOfMessages() {
		return maximumNumberOfMessages == null ? Optional.empty() : Optional.of(maximumNumberOfMessages);
	}

	public CardTransaction12 setMaximumNumberOfMessages(Number maximumNumberOfMessages) {
		this.maximumNumberOfMessages = maximumNumberOfMessages;
		return this;
	}

	public ResponseType2 getTransactionResponse() {
		return transactionResponse;
	}

	public CardTransaction12 setTransactionResponse(ResponseType2 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}
}