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
import com.tools20022.repository.codeset.AuthenticationEntity1Code;
import com.tools20022.repository.codeset.AuthenticationMethod1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OnLinePIN1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationMethod
 * CardholderAuthentication1.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationEntity
 * CardholderAuthentication1.mmAuthenticationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationValue
 * CardholderAuthentication1.mmAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmCardholderOnLinePIN
 * CardholderAuthentication1.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationCollectionIndicator
 * CardholderAuthentication1.mmAuthenticationCollectionIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "CardholderAuthentication1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication3
 * CardholderAuthentication3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardholderAuthentication1", propOrder = {"authenticationMethod", "authenticationEntity", "authenticationValue", "cardholderOnLinePIN", "authenticationCollectionIndicator"})
public class CardholderAuthentication1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthntcnMtd", required = true)
	protected AuthenticationMethod1Code authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod1Code
	 * AuthenticationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
	 * Authentication.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1
	 * CardholderAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to authenticate a cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication1, AuthenticationMethod1Code> mmAuthenticationMethod = new MMMessageAttribute<CardholderAuthentication1, AuthenticationMethod1Code>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a cardholder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod1Code.mmObject();
		}

		@Override
		public AuthenticationMethod1Code getValue(CardholderAuthentication1 obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(CardholderAuthentication1 obj, AuthenticationMethod1Code value) {
			obj.setAuthenticationMethod(value);
		}
	};
	@XmlElement(name = "AuthntcnNtty", required = true)
	protected AuthenticationEntity1Code authenticationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationEntity
	 * Authentication.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1
	 * CardholderAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity or object in charge of verifying the cardholder authenticity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication1, AuthenticationEntity1Code> mmAuthenticationEntity = new MMMessageAttribute<CardholderAuthentication1, AuthenticationEntity1Code>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationEntity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the cardholder authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntity1Code.mmObject();
		}

		@Override
		public AuthenticationEntity1Code getValue(CardholderAuthentication1 obj) {
			return obj.getAuthenticationEntity();
		}

		@Override
		public void setValue(CardholderAuthentication1 obj, AuthenticationEntity1Code value) {
			obj.setAuthenticationEntity(value);
		}
	};
	@XmlElement(name = "AuthntcnVal")
	protected Max40Text authenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
	 * Authentication.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1
	 * CardholderAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value used to authenticate the cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication1, Optional<Max40Text>> mmAuthenticationValue = new MMMessageAttribute<CardholderAuthentication1, Optional<Max40Text>>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}

		@Override
		public Optional<Max40Text> getValue(CardholderAuthentication1 obj) {
			return obj.getAuthenticationValue();
		}

		@Override
		public void setValue(CardholderAuthentication1 obj, Optional<Max40Text> value) {
			obj.setAuthenticationValue(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrOnLinePIN")
	protected OnLinePIN1 cardholderOnLinePIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OnLinePIN1 OnLinePIN1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1
	 * CardholderAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted personal identification number (PIN) and related information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication1, Optional<OnLinePIN1>> mmCardholderOnLinePIN = new MMMessageAssociationEnd<CardholderAuthentication1, Optional<OnLinePIN1>>() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OnLinePIN1.mmObject();
		}

		@Override
		public Optional<OnLinePIN1> getValue(CardholderAuthentication1 obj) {
			return obj.getCardholderOnLinePIN();
		}

		@Override
		public void setValue(CardholderAuthentication1 obj, Optional<OnLinePIN1> value) {
			obj.setCardholderOnLinePIN(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnColltnInd")
	protected Max35Text authenticationCollectionIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1
	 * CardholderAuthentication1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnColltnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationCollectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in electronic commerce transactions whether customer authentication is supported and data is available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication1, Optional<Max35Text>> mmAuthenticationCollectionIndicator = new MMMessageAttribute<CardholderAuthentication1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnColltnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationCollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardholderAuthentication1 obj) {
			return obj.getAuthenticationCollectionIndicator();
		}

		@Override
		public void setValue(CardholderAuthentication1 obj, Optional<Max35Text> value) {
			obj.setAuthenticationCollectionIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication1.mmAuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication1.mmAuthenticationEntity,
						com.tools20022.repository.msg.CardholderAuthentication1.mmAuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication1.mmCardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication1.mmAuthenticationCollectionIndicator);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication1";
				definition = "Data related to the authentication of the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(CardholderAuthentication3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod1Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public CardholderAuthentication1 setAuthenticationMethod(AuthenticationMethod1Code authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public AuthenticationEntity1Code getAuthenticationEntity() {
		return authenticationEntity;
	}

	public CardholderAuthentication1 setAuthenticationEntity(AuthenticationEntity1Code authenticationEntity) {
		this.authenticationEntity = Objects.requireNonNull(authenticationEntity);
		return this;
	}

	public Optional<Max40Text> getAuthenticationValue() {
		return authenticationValue == null ? Optional.empty() : Optional.of(authenticationValue);
	}

	public CardholderAuthentication1 setAuthenticationValue(Max40Text authenticationValue) {
		this.authenticationValue = authenticationValue;
		return this;
	}

	public Optional<OnLinePIN1> getCardholderOnLinePIN() {
		return cardholderOnLinePIN == null ? Optional.empty() : Optional.of(cardholderOnLinePIN);
	}

	public CardholderAuthentication1 setCardholderOnLinePIN(OnLinePIN1 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
		return this;
	}

	public Optional<Max35Text> getAuthenticationCollectionIndicator() {
		return authenticationCollectionIndicator == null ? Optional.empty() : Optional.of(authenticationCollectionIndicator);
	}

	public CardholderAuthentication1 setAuthenticationCollectionIndicator(Max35Text authenticationCollectionIndicator) {
		this.authenticationCollectionIndicator = authenticationCollectionIndicator;
		return this;
	}
}