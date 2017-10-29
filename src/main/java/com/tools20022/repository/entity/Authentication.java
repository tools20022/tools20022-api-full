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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AuthenticationEntityCode;
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.codeset.PINFormatCode;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Authentication" src="doc-files/Authentication.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#Cardholder
 * Authentication.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationMethod
 * Authentication.AuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationEntity
 * Authentication.AuthenticationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationValue
 * Authentication.AuthenticationValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#PINFormat
 * Authentication.PINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#PIN
 * Authentication.PIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationSupport
 * Authentication.AuthenticationSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#CollectionIndicator
 * Authentication.CollectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#Mandate
 * Authentication.Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#AuthenticationResult
 * Authentication.AuthenticationResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#Authentication
 * CardholderRole.Authentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#Authentication
 * Mandate.Authentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#CardholderOnLinePIN
 * CardholderAuthentication1.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#CardholderOnLinePIN
 * CardholderAuthentication3.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#CardholderOnLinePIN
 * CardholderAuthentication5.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#CardholderOnLinePIN
 * CardholderAuthentication6.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#CardholderOnLinePIN
 * CardholderAuthentication7.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#CardholderOnLinePIN
 * CardholderAuthentication8.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#CardholderOnLinePIN
 * CardholderAuthentication9.CardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#CardholderOnLinePIN
 * CardholderAuthentication10.CardholderOnLinePIN}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication2
 * CardholderAuthentication2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication4
 * CardholderAuthentication4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1 OnLinePIN1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication1
 * CardholderAuthentication1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN2 OnLinePIN2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication3
 * CardholderAuthentication3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN3 OnLinePIN3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication5
 * CardholderAuthentication5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN4 OnLinePIN4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication6
 * CardholderAuthentication6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication7
 * CardholderAuthentication7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication8
 * CardholderAuthentication8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5 OnLinePIN5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication9
 * CardholderAuthentication9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAuthentication1
 * MandateAuthentication1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication10
 * CardholderAuthentication10}</li>
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
 * "Authentication"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
public class Authentication {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cardholder for which an authentication is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole#Authentication
	 * CardholderRole.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder for which an authentication is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Cardholder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cardholder";
			definition = "Cardholder for which an authentication is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardholderRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardholderRole.Authentication;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Method used to authenticate a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#AuthenticationMethod
	 * CardholderAuthentication2.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication4#AuthenticationMethod
	 * CardholderAuthentication4.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#AuthenticationMethod
	 * CardholderAuthentication1.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#AuthenticationMethod
	 * CardholderAuthentication3.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#AuthenticationMethod
	 * CardholderAuthentication5.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#AuthenticationMethod
	 * CardholderAuthentication6.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#AuthenticationMethod
	 * CardholderAuthentication7.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#AuthenticationMethod
	 * CardholderAuthentication8.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#AuthenticationMethod
	 * CardholderAuthentication9.AuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#Channel
	 * MandateAuthentication1.Channel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#AuthenticationMethod
	 * CardholderAuthentication10.AuthenticationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to authenticate a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthenticationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication2.AuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication4.AuthenticationMethod,
					com.tools20022.repository.msg.CardholderAuthentication1.AuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication3.AuthenticationMethod,
					com.tools20022.repository.msg.CardholderAuthentication5.AuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication6.AuthenticationMethod,
					com.tools20022.repository.msg.CardholderAuthentication7.AuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication8.AuthenticationMethod,
					com.tools20022.repository.msg.CardholderAuthentication9.AuthenticationMethod, com.tools20022.repository.msg.MandateAuthentication1.Channel, com.tools20022.repository.msg.CardholderAuthentication10.AuthenticationMethod);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethodCode.mmObject();
		}
	};
	/**
	 * Entity or object in charge of verifying the person authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#AuthenticationEntity
	 * CardholderAuthentication2.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication4#AuthenticationEntity
	 * CardholderAuthentication4.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#AuthenticationEntity
	 * CardholderAuthentication1.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#AuthenticationEntity
	 * CardholderAuthentication3.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#AuthenticationEntity
	 * CardholderAuthentication5.AuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#MessageAuthenticationCode
	 * MandateAuthentication1.MessageAuthenticationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity or object in charge of verifying the person authenticity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthenticationEntity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication2.AuthenticationEntity, com.tools20022.repository.msg.CardholderAuthentication4.AuthenticationEntity,
					com.tools20022.repository.msg.CardholderAuthentication1.AuthenticationEntity, com.tools20022.repository.msg.CardholderAuthentication3.AuthenticationEntity,
					com.tools20022.repository.msg.CardholderAuthentication5.AuthenticationEntity, com.tools20022.repository.msg.MandateAuthentication1.MessageAuthenticationCode);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the person authenticity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntityCode.mmObject();
		}
	};
	/**
	 * Value used to authenticate the owner of the payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#AuthenticationValue
	 * CardholderAuthentication1.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#AuthenticationValue
	 * CardholderAuthentication3.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#AuthenticationValue
	 * CardholderAuthentication5.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#AuthenticationValue
	 * CardholderAuthentication6.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#AuthenticationValue
	 * CardholderAuthentication7.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#AuthenticationValue
	 * CardholderAuthentication8.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#AuthenticationValue
	 * CardholderAuthentication9.AuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#AuthenticationValue
	 * CardholderAuthentication10.AuthenticationValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value used to authenticate the owner of the payment card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthenticationValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication1.AuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication3.AuthenticationValue,
					com.tools20022.repository.msg.CardholderAuthentication5.AuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication6.AuthenticationValue,
					com.tools20022.repository.msg.CardholderAuthentication7.AuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication8.AuthenticationValue,
					com.tools20022.repository.msg.CardholderAuthentication9.AuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication10.AuthenticationValue);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the owner of the payment card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Encrypted personal identification number (PIN) format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1#PINFormat
	 * OnLinePIN1.PINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN2#PINFormat
	 * OnLinePIN2.PINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN3#PINFormat
	 * OnLinePIN3.PINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN4#PINFormat
	 * OnLinePIN4.PINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5#PINFormat
	 * OnLinePIN5.PINFormat}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted personal identification number (PIN) format."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PINFormat = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OnLinePIN1.PINFormat, com.tools20022.repository.msg.OnLinePIN2.PINFormat, com.tools20022.repository.msg.OnLinePIN3.PINFormat,
					com.tools20022.repository.msg.OnLinePIN4.PINFormat, com.tools20022.repository.msg.OnLinePIN5.PINFormat);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINFormat";
			definition = "Encrypted personal identification number (PIN) format.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PINFormatCode.mmObject();
		}
	};
	/**
	 * Personal Identification Number (PIN) for authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Personal Identification Number (PIN) for authentication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PIN = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PIN";
			definition = "Personal Identification Number (PIN) for authentication.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	/**
	 * This indicator identifies whether person authentication is supported and
	 * data is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This indicator identifies whether person authentication is supported and data is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthenticationSupport = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationSupport";
			definition = "This indicator identifies whether person authentication is supported and data is available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies in electronic commerce transactions whether customer
	 * authentication is supported and data is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in electronic commerce transactions whether customer authentication is supported and data is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the mandate related to the transport authentication
	 * detailsmandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#Authentication
	 * Mandate.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the mandate related to the transport authentication detailsmandate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Mandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Specifies the mandate related to the transport authentication detailsmandate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.Authentication;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the result of the authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the result of the authentication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthenticationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticationResult";
			definition = "Specifies the result of the authentication.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Authentication";
				definition = "Data related to the authentication of the cardholder.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.Authentication, com.tools20022.repository.entity.Mandate.Authentication);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication1.CardholderOnLinePIN, com.tools20022.repository.msg.CardholderAuthentication3.CardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication5.CardholderOnLinePIN, com.tools20022.repository.msg.CardholderAuthentication6.CardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication7.CardholderOnLinePIN, com.tools20022.repository.msg.CardholderAuthentication8.CardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication9.CardholderOnLinePIN, com.tools20022.repository.msg.CardholderAuthentication10.CardholderOnLinePIN);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.Cardholder, com.tools20022.repository.entity.Authentication.AuthenticationMethod,
						com.tools20022.repository.entity.Authentication.AuthenticationEntity, com.tools20022.repository.entity.Authentication.AuthenticationValue, com.tools20022.repository.entity.Authentication.PINFormat,
						com.tools20022.repository.entity.Authentication.PIN, com.tools20022.repository.entity.Authentication.AuthenticationSupport, com.tools20022.repository.entity.Authentication.CollectionIndicator,
						com.tools20022.repository.entity.Authentication.Mandate, com.tools20022.repository.entity.Authentication.AuthenticationResult);
				derivationComponent_lazy = () -> Arrays.asList(CardholderAuthentication2.mmObject(), CardholderAuthentication4.mmObject(), OnLinePIN1.mmObject(), CardholderAuthentication1.mmObject(), OnLinePIN2.mmObject(),
						CardholderAuthentication3.mmObject(), OnLinePIN3.mmObject(), CardholderAuthentication5.mmObject(), OnLinePIN4.mmObject(), CardholderAuthentication6.mmObject(), CardholderAuthentication7.mmObject(),
						CardholderAuthentication8.mmObject(), OnLinePIN5.mmObject(), CardholderAuthentication9.mmObject(), MandateAuthentication1.mmObject(), CardholderAuthentication10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}