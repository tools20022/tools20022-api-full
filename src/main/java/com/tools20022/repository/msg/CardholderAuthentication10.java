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
import com.tools20022.repository.codeset.AuthenticationMethod5Code;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.entity.Authentication;
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
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationMethod
 * CardholderAuthentication10.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationValue
 * CardholderAuthentication10.mmAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmProtectedAuthenticationValue
 * CardholderAuthentication10.mmProtectedAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmCardholderOnLinePIN
 * CardholderAuthentication10.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmCardholderIdentification
 * CardholderAuthentication10.mmCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAddressVerification
 * CardholderAuthentication10.mmAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationType
 * CardholderAuthentication10.mmAuthenticationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationLevel
 * CardholderAuthentication10.mmAuthenticationLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationResult
 * CardholderAuthentication10.mmAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationAdditionalInformation
 * CardholderAuthentication10.mmAuthenticationAdditionalInformation}</li>
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
 * "CardholderAuthentication10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9
 * CardholderAuthentication9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardholderAuthentication10", propOrder = {"authenticationMethod", "authenticationValue", "protectedAuthenticationValue", "cardholderOnLinePIN", "cardholderIdentification", "addressVerification", "authenticationType",
		"authenticationLevel", "authenticationResult", "authenticationAdditionalInformation"})
public class CardholderAuthentication10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthntcnMtd", required = true)
	protected AuthenticationMethod5Code authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
	 * Authentication.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
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
	 * definition} =
	 * "Method and data intended to be used for this transaction to authenticate the cardholder or its card."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmAuthenticationMethod
	 * CardholderAuthentication9.mmAuthenticationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method and data intended to be used for this transaction to authenticate the cardholder or its card.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmAuthenticationMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod5Code.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnVal")
	protected Max5000Binary authenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
	 * Authentication.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmAuthenticationValue
	 * CardholderAuthentication9.mmAuthenticationValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the cardholder.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmAuthenticationValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	@XmlElement(name = "PrtctdAuthntcnVal")
	protected ContentInformationType10 protectedAuthenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protection of the authentication value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmProtectedAuthenticationValue
	 * CardholderAuthentication9.mmProtectedAuthenticationValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAuthenticationValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAuthenticationValue";
			definition = "Protection of the authentication value.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmProtectedAuthenticationValue;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	@XmlElement(name = "CrdhldrOnLinePIN")
	protected OnLinePIN4 cardholderOnLinePIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OnLinePIN4 OnLinePIN4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmCardholderOnLinePIN
	 * CardholderAuthentication9.mmCardholderOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholderOnLinePIN = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmCardholderOnLinePIN;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OnLinePIN4.mmObject();
		}
	};
	@XmlElement(name = "CrdhldrId")
	protected PersonIdentification11 cardholderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification11
	 * PersonIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cardholder to verify."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmCardholderIdentification
	 * CardholderAuthentication9.mmCardholderIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholderIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentification";
			definition = "Identification of the cardholder to verify.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmCardholderIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PersonIdentification11.mmObject();
		}
	};
	@XmlElement(name = "AdrVrfctn")
	protected AddressVerification1 addressVerification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressVerification1
	 * AddressVerification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numeric characters of the cardholder's billing or shipping address for verification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmAddressVerification
	 * CardholderAuthentication9.mmAddressVerification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddressVerification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AdrVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressVerification";
			definition = "Numeric characters of the cardholder's billing or shipping address for verification.";
			previousVersion_lazy = () -> CardholderAuthentication9.mmAddressVerification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressVerification1.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnTp")
	protected Max35Text authenticationType;
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
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationType";
			definition = "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnLvl")
	protected Max35Text authenticationLevel;
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
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationLevel";
			definition = "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnRslt")
	protected AuthenticationResultCode authenticationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of authentication"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationResult";
			definition = "Result of authentication";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnAddtlInf")
	protected Max35Text authenticationAdditionalInformation;
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
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the result of the authentication"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationAdditionalInformation";
			definition = "Additional information related to the result of the authentication";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationValue,
						com.tools20022.repository.msg.CardholderAuthentication10.mmProtectedAuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication10.mmCardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication10.mmCardholderIdentification, com.tools20022.repository.msg.CardholderAuthentication10.mmAddressVerification,
						com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationType, com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationLevel,
						com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationResult, com.tools20022.repository.msg.CardholderAuthentication10.mmAuthenticationAdditionalInformation);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication10";
				definition = "Data related to the authentication of the cardholder.";
				previousVersion_lazy = () -> CardholderAuthentication9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod5Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public CardholderAuthentication10 setAuthenticationMethod(AuthenticationMethod5Code authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public Optional<Max5000Binary> getAuthenticationValue() {
		return authenticationValue == null ? Optional.empty() : Optional.of(authenticationValue);
	}

	public CardholderAuthentication10 setAuthenticationValue(Max5000Binary authenticationValue) {
		this.authenticationValue = authenticationValue;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAuthenticationValue() {
		return protectedAuthenticationValue == null ? Optional.empty() : Optional.of(protectedAuthenticationValue);
	}

	public CardholderAuthentication10 setProtectedAuthenticationValue(com.tools20022.repository.msg.ContentInformationType10 protectedAuthenticationValue) {
		this.protectedAuthenticationValue = protectedAuthenticationValue;
		return this;
	}

	public Optional<OnLinePIN4> getCardholderOnLinePIN() {
		return cardholderOnLinePIN == null ? Optional.empty() : Optional.of(cardholderOnLinePIN);
	}

	public CardholderAuthentication10 setCardholderOnLinePIN(com.tools20022.repository.msg.OnLinePIN4 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
		return this;
	}

	public Optional<PersonIdentification11> getCardholderIdentification() {
		return cardholderIdentification == null ? Optional.empty() : Optional.of(cardholderIdentification);
	}

	public CardholderAuthentication10 setCardholderIdentification(com.tools20022.repository.msg.PersonIdentification11 cardholderIdentification) {
		this.cardholderIdentification = cardholderIdentification;
		return this;
	}

	public Optional<AddressVerification1> getAddressVerification() {
		return addressVerification == null ? Optional.empty() : Optional.of(addressVerification);
	}

	public CardholderAuthentication10 setAddressVerification(com.tools20022.repository.msg.AddressVerification1 addressVerification) {
		this.addressVerification = addressVerification;
		return this;
	}

	public Optional<Max35Text> getAuthenticationType() {
		return authenticationType == null ? Optional.empty() : Optional.of(authenticationType);
	}

	public CardholderAuthentication10 setAuthenticationType(Max35Text authenticationType) {
		this.authenticationType = authenticationType;
		return this;
	}

	public Optional<Max35Text> getAuthenticationLevel() {
		return authenticationLevel == null ? Optional.empty() : Optional.of(authenticationLevel);
	}

	public CardholderAuthentication10 setAuthenticationLevel(Max35Text authenticationLevel) {
		this.authenticationLevel = authenticationLevel;
		return this;
	}

	public Optional<AuthenticationResultCode> getAuthenticationResult() {
		return authenticationResult == null ? Optional.empty() : Optional.of(authenticationResult);
	}

	public CardholderAuthentication10 setAuthenticationResult(AuthenticationResultCode authenticationResult) {
		this.authenticationResult = authenticationResult;
		return this;
	}

	public Optional<Max35Text> getAuthenticationAdditionalInformation() {
		return authenticationAdditionalInformation == null ? Optional.empty() : Optional.of(authenticationAdditionalInformation);
	}

	public CardholderAuthentication10 setAuthenticationAdditionalInformation(Max35Text authenticationAdditionalInformation) {
		this.authenticationAdditionalInformation = authenticationAdditionalInformation;
		return this;
	}
}