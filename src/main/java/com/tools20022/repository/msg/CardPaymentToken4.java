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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentTokenIdentifiers1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment token information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmToken
 * CardPaymentToken4.mmToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmCardSequenceNumber
 * CardPaymentToken4.mmCardSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenExpiryDate
 * CardPaymentToken4.mmTokenExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenCharacteristic
 * CardPaymentToken4.mmTokenCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenRequestor
 * CardPaymentToken4.mmTokenRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenAssuranceLevel
 * CardPaymentToken4.mmTokenAssuranceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenAssuranceData
 * CardPaymentToken4.mmTokenAssuranceData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentToken4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment token information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3
 * CardPaymentToken3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentToken4", propOrder = {"token", "cardSequenceNumber", "tokenExpiryDate", "tokenCharacteristic", "tokenRequestor", "tokenAssuranceLevel", "tokenAssuranceData"})
public class CardPaymentToken4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tkn")
	protected Min8Max28NumericText token;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tkn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Token"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Surrogate value for the PAN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, Optional<Min8Max28NumericText>> mmToken = new MMMessageAttribute<CardPaymentToken4, Optional<Min8Max28NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "Tkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Token";
			definition = "Surrogate value for the PAN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}

		@Override
		public Optional<Min8Max28NumericText> getValue(CardPaymentToken4 obj) {
			return obj.getToken();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<Min8Max28NumericText> value) {
			obj.setToken(value.orElse(null));
		}
	};
	@XmlElement(name = "CardSeqNb")
	protected Min2Max3NumericText cardSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3NumericText
	 * Min2Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify a payment token inside a set of cards with the same PAN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, Optional<Min2Max3NumericText>> mmCardSequenceNumber = new MMMessageAttribute<CardPaymentToken4, Optional<Min2Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a payment token inside a set of cards with the same PAN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}

		@Override
		public Optional<Min2Max3NumericText> getValue(CardPaymentToken4 obj) {
			return obj.getCardSequenceNumber();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<Min2Max3NumericText> value) {
			obj.setCardSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TknXpryDt")
	protected Max10Text tokenExpiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknXpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expiration date of the payment token that is generated by and maintained in the token vault."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, Optional<Max10Text>> mmTokenExpiryDate = new MMMessageAttribute<CardPaymentToken4, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknXpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenExpiryDate";
			definition = "Expiration date of the payment token that is generated by and maintained in the token vault.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(CardPaymentToken4 obj) {
			return obj.getTokenExpiryDate();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<Max10Text> value) {
			obj.setTokenExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TknChrtc")
	protected List<Max35Text> tokenCharacteristic;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknChrtc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenCharacteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional payment token information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenCharacteristic
	 * CardPaymentToken3.mmTokenCharacteristic}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, List<Max35Text>> mmTokenCharacteristic = new MMMessageAttribute<CardPaymentToken4, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknChrtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenCharacteristic";
			definition = "Additional payment token information.";
			previousVersion_lazy = () -> CardPaymentToken3.mmTokenCharacteristic;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(CardPaymentToken4 obj) {
			return obj.getTokenCharacteristic();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, List<Max35Text> value) {
			obj.setTokenCharacteristic(value);
		}
	};
	@XmlElement(name = "TknRqstr")
	protected PaymentTokenIdentifiers1 tokenRequestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1
	 * PaymentTokenIdentifiers1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknRqstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a token provider requestor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenRequestor
	 * CardPaymentToken3.mmTokenRequestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentToken4, Optional<PaymentTokenIdentifiers1>> mmTokenRequestor = new MMMessageAssociationEnd<CardPaymentToken4, Optional<PaymentTokenIdentifiers1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenRequestor";
			definition = "Identifier of a token provider requestor.";
			previousVersion_lazy = () -> CardPaymentToken3.mmTokenRequestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTokenIdentifiers1.mmObject();
		}

		@Override
		public Optional<PaymentTokenIdentifiers1> getValue(CardPaymentToken4 obj) {
			return obj.getTokenRequestor();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<PaymentTokenIdentifiers1> value) {
			obj.setTokenRequestor(value.orElse(null));
		}
	};
	@XmlElement(name = "TknAssrncLvl")
	protected Number tokenAssuranceLevel;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknAssrncLvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAssuranceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of confidence resulting of the identification and authentication of the cardholder performed and the entity that performed it."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenAssuranceLevel
	 * CardPaymentToken3.mmTokenAssuranceLevel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, Optional<Number>> mmTokenAssuranceLevel = new MMMessageAttribute<CardPaymentToken4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknAssrncLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAssuranceLevel";
			definition = "Level of confidence resulting of the identification and authentication of the cardholder performed and the entity that performed it.";
			previousVersion_lazy = () -> CardPaymentToken3.mmTokenAssuranceLevel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardPaymentToken4 obj) {
			return obj.getTokenAssuranceLevel();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<Number> value) {
			obj.setTokenAssuranceLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "TknAssrncData")
	protected Max500Binary tokenAssuranceData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max500Binary Max500Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4
	 * CardPaymentToken4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknAssrncData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAssuranceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the identification and verification of the cardholder."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken4, Optional<Max500Binary>> mmTokenAssuranceData = new MMMessageAttribute<CardPaymentToken4, Optional<Max500Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknAssrncData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAssuranceData";
			definition = "Information about the identification and verification of the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}

		@Override
		public Optional<Max500Binary> getValue(CardPaymentToken4 obj) {
			return obj.getTokenAssuranceData();
		}

		@Override
		public void setValue(CardPaymentToken4 obj, Optional<Max500Binary> value) {
			obj.setTokenAssuranceData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentToken4.mmToken, com.tools20022.repository.msg.CardPaymentToken4.mmCardSequenceNumber,
						com.tools20022.repository.msg.CardPaymentToken4.mmTokenExpiryDate, com.tools20022.repository.msg.CardPaymentToken4.mmTokenCharacteristic, com.tools20022.repository.msg.CardPaymentToken4.mmTokenRequestor,
						com.tools20022.repository.msg.CardPaymentToken4.mmTokenAssuranceLevel, com.tools20022.repository.msg.CardPaymentToken4.mmTokenAssuranceData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentToken4";
				definition = "Payment token information.";
				previousVersion_lazy = () -> CardPaymentToken3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Min8Max28NumericText> getToken() {
		return token == null ? Optional.empty() : Optional.of(token);
	}

	public CardPaymentToken4 setToken(Min8Max28NumericText token) {
		this.token = token;
		return this;
	}

	public Optional<Min2Max3NumericText> getCardSequenceNumber() {
		return cardSequenceNumber == null ? Optional.empty() : Optional.of(cardSequenceNumber);
	}

	public CardPaymentToken4 setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
		return this;
	}

	public Optional<Max10Text> getTokenExpiryDate() {
		return tokenExpiryDate == null ? Optional.empty() : Optional.of(tokenExpiryDate);
	}

	public CardPaymentToken4 setTokenExpiryDate(Max10Text tokenExpiryDate) {
		this.tokenExpiryDate = tokenExpiryDate;
		return this;
	}

	public List<Max35Text> getTokenCharacteristic() {
		return tokenCharacteristic == null ? tokenCharacteristic = new ArrayList<>() : tokenCharacteristic;
	}

	public CardPaymentToken4 setTokenCharacteristic(List<Max35Text> tokenCharacteristic) {
		this.tokenCharacteristic = Objects.requireNonNull(tokenCharacteristic);
		return this;
	}

	public Optional<PaymentTokenIdentifiers1> getTokenRequestor() {
		return tokenRequestor == null ? Optional.empty() : Optional.of(tokenRequestor);
	}

	public CardPaymentToken4 setTokenRequestor(PaymentTokenIdentifiers1 tokenRequestor) {
		this.tokenRequestor = tokenRequestor;
		return this;
	}

	public Optional<Number> getTokenAssuranceLevel() {
		return tokenAssuranceLevel == null ? Optional.empty() : Optional.of(tokenAssuranceLevel);
	}

	public CardPaymentToken4 setTokenAssuranceLevel(Number tokenAssuranceLevel) {
		this.tokenAssuranceLevel = tokenAssuranceLevel;
		return this;
	}

	public Optional<Max500Binary> getTokenAssuranceData() {
		return tokenAssuranceData == null ? Optional.empty() : Optional.of(tokenAssuranceData);
	}

	public CardPaymentToken4 setTokenAssuranceData(Max500Binary tokenAssuranceData) {
		this.tokenAssuranceData = tokenAssuranceData;
		return this;
	}
}