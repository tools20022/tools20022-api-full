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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentToken4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment token information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3
 * CardPaymentToken3}</li>
 * </ul>
 */
public class CardPaymentToken4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Min8Max28NumericText token;
	/**
	 * Surrogate value for the PAN.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Token"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Surrogate value for the PAN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmToken = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "Tkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Token";
			definition = "Surrogate value for the PAN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}
	};
	protected Min2Max3NumericText cardSequenceNumber;
	/**
	 * Identify a payment token inside a set of cards with the same PAN.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify a payment token inside a set of cards with the same PAN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a payment token inside a set of cards with the same PAN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}
	};
	protected Max10Text tokenExpiryDate;
	/**
	 * Expiration date of the payment token that is generated by and maintained
	 * in the token vault.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expiration date of the payment token that is generated by and maintained in the token vault."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTokenExpiryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknXpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenExpiryDate";
			definition = "Expiration date of the payment token that is generated by and maintained in the token vault.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected List<Max35Text> tokenCharacteristic;
	/**
	 * Additional payment token information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenCharacteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional payment token information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenCharacteristic
	 * CardPaymentToken3.mmTokenCharacteristic}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTokenCharacteristic = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknChrtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenCharacteristic";
			definition = "Additional payment token information.";
			previousVersion_lazy = () -> CardPaymentToken3.mmTokenCharacteristic;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PaymentTokenIdentifiers1 tokenRequestor;
	/**
	 * Identifier of a token provider requestor.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a token provider requestor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenRequestor
	 * CardPaymentToken3.mmTokenRequestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTokenRequestor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenRequestor";
			definition = "Identifier of a token provider requestor.";
			previousVersion_lazy = () -> CardPaymentToken3.mmTokenRequestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTokenIdentifiers1.mmObject();
		}
	};
	protected Number tokenAssuranceLevel;
	/**
	 * Level of confidence resulting of the identification and authentication of
	 * the cardholder performed and the entity that performed it.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAssuranceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of confidence resulting of the identification and authentication of the cardholder performed and the entity that performed it."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenAssuranceLevel
	 * CardPaymentToken3.mmTokenAssuranceLevel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTokenAssuranceLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
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
	};
	protected Max500Binary tokenAssuranceData;
	/**
	 * Information about the identification and verification of the cardholder.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAssuranceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the identification and verification of the cardholder."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTokenAssuranceData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentToken4.mmObject();
			isDerived = false;
			xmlTag = "TknAssrncData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAssuranceData";
			definition = "Information about the identification and verification of the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentToken4.mmToken, CardPaymentToken4.mmCardSequenceNumber, CardPaymentToken4.mmTokenExpiryDate, CardPaymentToken4.mmTokenCharacteristic, CardPaymentToken4.mmTokenRequestor,
						CardPaymentToken4.mmTokenAssuranceLevel, CardPaymentToken4.mmTokenAssuranceData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentToken4";
				definition = "Payment token information.";
				previousVersion_lazy = () -> CardPaymentToken3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getToken() {
		return token;
	}

	public void setToken(Min8Max28NumericText token) {
		this.token = token;
	}

	public Min2Max3NumericText getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public Max10Text getTokenExpiryDate() {
		return tokenExpiryDate;
	}

	public void setTokenExpiryDate(Max10Text tokenExpiryDate) {
		this.tokenExpiryDate = tokenExpiryDate;
	}

	public List<Max35Text> getTokenCharacteristic() {
		return tokenCharacteristic;
	}

	public void setTokenCharacteristic(List<Max35Text> tokenCharacteristic) {
		this.tokenCharacteristic = tokenCharacteristic;
	}

	public PaymentTokenIdentifiers1 getTokenRequestor() {
		return tokenRequestor;
	}

	public void setTokenRequestor(com.tools20022.repository.msg.PaymentTokenIdentifiers1 tokenRequestor) {
		this.tokenRequestor = tokenRequestor;
	}

	public Number getTokenAssuranceLevel() {
		return tokenAssuranceLevel;
	}

	public void setTokenAssuranceLevel(Number tokenAssuranceLevel) {
		this.tokenAssuranceLevel = tokenAssuranceLevel;
	}

	public Max500Binary getTokenAssuranceData() {
		return tokenAssuranceData;
	}

	public void setTokenAssuranceData(Max500Binary tokenAssuranceData) {
		this.tokenAssuranceData = tokenAssuranceData;
	}
}