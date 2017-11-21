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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardholderAuthentication1", propOrder = {"authenticationMethod", "authenticationEntity", "authenticationValue", "cardholderOnLinePIN", "authenticationCollectionIndicator"})
public class CardholderAuthentication1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuthenticationMethod1Code authenticationMethod;
	/**
	 * Method used to authenticate a cardholder.
	 * <p>
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
	public static final MMMessageAttribute mmAuthenticationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a cardholder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod1Code.mmObject();
		}
	};
	protected AuthenticationEntity1Code authenticationEntity;
	/**
	 * Entity or object in charge of verifying the cardholder authenticity.
	 * <p>
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
	public static final MMMessageAttribute mmAuthenticationEntity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationEntity;
			componentContext_lazy = () -> CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the cardholder authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntity1Code.mmObject();
		}
	};
	protected Max40Text authenticationValue;
	/**
	 * Value used to authenticate the cardholder.
	 * <p>
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
	public static final MMMessageAttribute mmAuthenticationValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected OnLinePIN1 cardholderOnLinePIN;
	/**
	 * Encrypted personal identification number (PIN) and related information.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCardholderOnLinePIN = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OnLinePIN1.mmObject();
		}
	};
	protected Max35Text authenticationCollectionIndicator;
	/**
	 * Identifies in electronic commerce transactions whether customer
	 * authentication is supported and data is available.
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
	public static final MMMessageAttribute mmAuthenticationCollectionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnColltnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationCollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardholderAuthentication1.mmAuthenticationMethod, CardholderAuthentication1.mmAuthenticationEntity, CardholderAuthentication1.mmAuthenticationValue,
						CardholderAuthentication1.mmCardholderOnLinePIN, CardholderAuthentication1.mmAuthenticationCollectionIndicator);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication1";
				definition = "Data related to the authentication of the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(CardholderAuthentication3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AuthntcnMtd", required = true)
	public AuthenticationMethod1Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public void setAuthenticationMethod(AuthenticationMethod1Code authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}

	@XmlElement(name = "AuthntcnNtty", required = true)
	public AuthenticationEntity1Code getAuthenticationEntity() {
		return authenticationEntity;
	}

	public void setAuthenticationEntity(AuthenticationEntity1Code authenticationEntity) {
		this.authenticationEntity = authenticationEntity;
	}

	@XmlElement(name = "AuthntcnVal")
	public Max40Text getAuthenticationValue() {
		return authenticationValue;
	}

	public void setAuthenticationValue(Max40Text authenticationValue) {
		this.authenticationValue = authenticationValue;
	}

	@XmlElement(name = "CrdhldrOnLinePIN")
	public OnLinePIN1 getCardholderOnLinePIN() {
		return cardholderOnLinePIN;
	}

	public void setCardholderOnLinePIN(com.tools20022.repository.msg.OnLinePIN1 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
	}

	@XmlElement(name = "AuthntcnColltnInd")
	public Max35Text getAuthenticationCollectionIndicator() {
		return authenticationCollectionIndicator;
	}

	public void setAuthenticationCollectionIndicator(Max35Text authenticationCollectionIndicator) {
		this.authenticationCollectionIndicator = authenticationCollectionIndicator;
	}
}