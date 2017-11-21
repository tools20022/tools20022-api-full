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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransaction13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Key exchange transaction."</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardTransaction13", propOrder = {"keyExchangeType", "initiatorDateTime", "requestedKey", "key", "transactionResponse"})
public class CardTransaction13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardServiceType3Code keyExchangeType;
	/**
	 * Type of key exchange.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of key exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyExchangeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "KeyXchgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeType";
			definition = "Type of key exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardServiceType3Code.mmObject();
		}
	};
	protected ISODateTime initiatorDateTime;
	/**
	 * Date and time of the transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction13
	 * CardTransaction13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatorDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "InitrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorDateTime";
			definition = "Date and time of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.KEKIdentifier3> requestedKey;
	/**
	 * Key that must be created and sent in the response, or that must be
	 * verified..
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key that must be created and sent in the response, or that must be verified.."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestedKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "ReqdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedKey";
			definition = "Key that must be created and sent in the response, or that must be verified..";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CryptographicKey6> key;
	/**
	 * Created key to be stored.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Created key to be stored."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction14#mmKey
	 * CardTransaction14.mmKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Created key to be stored.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction14.mmKey);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CryptographicKey6.mmObject();
		}
	};
	protected ResponseType2 transactionResponse;
	/**
	 * Response to the key exchange request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the key exchange request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransaction13.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response to the key exchange request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardTransaction13.mmKeyExchangeType, CardTransaction13.mmInitiatorDateTime, CardTransaction13.mmRequestedKey, CardTransaction13.mmKey, CardTransaction13.mmTransactionResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction13";
				definition = "Key exchange transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction14.mmObject());
				previousVersion_lazy = () -> CardTransaction12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "KeyXchgTp", required = true)
	public CardServiceType3Code getKeyExchangeType() {
		return keyExchangeType;
	}

	public void setKeyExchangeType(CardServiceType3Code keyExchangeType) {
		this.keyExchangeType = keyExchangeType;
	}

	@XmlElement(name = "InitrDtTm", required = true)
	public ISODateTime getInitiatorDateTime() {
		return initiatorDateTime;
	}

	public void setInitiatorDateTime(ISODateTime initiatorDateTime) {
		this.initiatorDateTime = initiatorDateTime;
	}

	@XmlElement(name = "ReqdKey")
	public List<KEKIdentifier3> getRequestedKey() {
		return requestedKey;
	}

	public void setRequestedKey(List<com.tools20022.repository.msg.KEKIdentifier3> requestedKey) {
		this.requestedKey = requestedKey;
	}

	@XmlElement(name = "Key")
	public List<CryptographicKey6> getKey() {
		return key;
	}

	public void setKey(List<com.tools20022.repository.msg.CryptographicKey6> key) {
		this.key = key;
	}

	@XmlElement(name = "TxRspn")
	public ResponseType2 getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(com.tools20022.repository.msg.ResponseType2 transactionResponse) {
		this.transactionResponse = transactionResponse;
	}
}