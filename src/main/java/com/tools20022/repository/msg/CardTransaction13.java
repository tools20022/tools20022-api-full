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
import com.tools20022.repository.codeset.CardServiceType3Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CryptographicKey6;
import com.tools20022.repository.msg.KEKIdentifier3;
import com.tools20022.repository.msg.ResponseType2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Key exchange transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction13#mmKeyExchangeType
 * CardTransaction13.mmKeyExchangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction13#mmInitiatorDateTime
 * CardTransaction13.mmInitiatorDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction13#mmRequestedKey
 * CardTransaction13.mmRequestedKey}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction13#mmKey
 * CardTransaction13.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction13#mmTransactionResponse
 * CardTransaction13.mmTransactionResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransaction13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Key exchange transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction14
 * CardTransaction14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransaction12
 * CardTransaction12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction13", propOrder = {"keyExchangeType", "initiatorDateTime", "requestedKey", "key", "transactionResponse"})
public class CardTransaction13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "KeyXchgTp", required = true)
	protected CardServiceType3Code keyExchangeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType3Code
	 * CardServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyXchgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of key exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardTransaction13, CardServiceType3Code> mmKeyExchangeType = new MMMessageAttribute<CardTransaction13, CardServiceType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "KeyXchgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeType";
			definition = "Type of key exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardServiceType3Code.mmObject();
		}

		@Override
		public CardServiceType3Code getValue(CardTransaction13 obj) {
			return obj.getKeyExchangeType();
		}

		@Override
		public void setValue(CardTransaction13 obj, CardServiceType3Code value) {
			obj.setKeyExchangeType(value);
		}
	};
	@XmlElement(name = "InitrDtTm", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
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
	public static final MMMessageAttribute<CardTransaction13, ISODateTime> mmInitiatorDateTime = new MMMessageAttribute<CardTransaction13, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "InitrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorDateTime";
			definition = "Date and time of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CardTransaction13 obj) {
			return obj.getInitiatorDateTime();
		}

		@Override
		public void setValue(CardTransaction13 obj, ISODateTime value) {
			obj.setInitiatorDateTime(value);
		}
	};
	@XmlElement(name = "ReqdKey")
	protected List<KEKIdentifier3> requestedKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier3
	 * KEKIdentifier3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key that must be created and sent in the response, or that must be verified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction13, List<KEKIdentifier3>> mmRequestedKey = new MMMessageAssociationEnd<CardTransaction13, List<KEKIdentifier3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "ReqdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedKey";
			definition = "Key that must be created and sent in the response, or that must be verified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEKIdentifier3.mmObject();
		}

		@Override
		public List<KEKIdentifier3> getValue(CardTransaction13 obj) {
			return obj.getRequestedKey();
		}

		@Override
		public void setValue(CardTransaction13 obj, List<KEKIdentifier3> value) {
			obj.setRequestedKey(value);
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey6> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey6
	 * CryptographicKey6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Created key to be stored."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction14#mmKey
	 * CardTransaction14.mmKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction13, List<CryptographicKey6>> mmKey = new MMMessageAssociationEnd<CardTransaction13, List<CryptographicKey6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Created key to be stored.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction14.mmKey);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey6.mmObject();
		}

		@Override
		public List<CryptographicKey6> getValue(CardTransaction13 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(CardTransaction13 obj, List<CryptographicKey6> value) {
			obj.setKey(value);
		}
	};
	@XmlElement(name = "TxRspn")
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the key exchange request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransaction13, Optional<ResponseType2>> mmTransactionResponse = new MMMessageAssociationEnd<CardTransaction13, Optional<ResponseType2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response to the key exchange request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ResponseType2.mmObject();
		}

		@Override
		public Optional<ResponseType2> getValue(CardTransaction13 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(CardTransaction13 obj, Optional<ResponseType2> value) {
			obj.setTransactionResponse(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction13.mmKeyExchangeType, com.tools20022.repository.msg.CardTransaction13.mmInitiatorDateTime,
						com.tools20022.repository.msg.CardTransaction13.mmRequestedKey, com.tools20022.repository.msg.CardTransaction13.mmKey, com.tools20022.repository.msg.CardTransaction13.mmTransactionResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction13";
				definition = "Key exchange transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction14.mmObject());
				previousVersion_lazy = () -> CardTransaction12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardServiceType3Code getKeyExchangeType() {
		return keyExchangeType;
	}

	public CardTransaction13 setKeyExchangeType(CardServiceType3Code keyExchangeType) {
		this.keyExchangeType = Objects.requireNonNull(keyExchangeType);
		return this;
	}

	public ISODateTime getInitiatorDateTime() {
		return initiatorDateTime;
	}

	public CardTransaction13 setInitiatorDateTime(ISODateTime initiatorDateTime) {
		this.initiatorDateTime = Objects.requireNonNull(initiatorDateTime);
		return this;
	}

	public List<KEKIdentifier3> getRequestedKey() {
		return requestedKey == null ? requestedKey = new ArrayList<>() : requestedKey;
	}

	public CardTransaction13 setRequestedKey(List<KEKIdentifier3> requestedKey) {
		this.requestedKey = Objects.requireNonNull(requestedKey);
		return this;
	}

	public List<CryptographicKey6> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public CardTransaction13 setKey(List<CryptographicKey6> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<ResponseType2> getTransactionResponse() {
		return transactionResponse == null ? Optional.empty() : Optional.of(transactionResponse);
	}

	public CardTransaction13 setTransactionResponse(ResponseType2 transactionResponse) {
		this.transactionResponse = transactionResponse;
		return this;
	}
}