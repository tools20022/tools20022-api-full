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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.AuthenticationEntityCode;
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.codeset.PINFormatCode;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
 * CardholderRole.mmAuthentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
 * Mandate.mmAuthentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmCardholderOnLinePIN
 * CardholderAuthentication1.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#mmCardholderOnLinePIN
 * CardholderAuthentication3.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#mmCardholderOnLinePIN
 * CardholderAuthentication5.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#mmCardholderOnLinePIN
 * CardholderAuthentication6.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmCardholderOnLinePIN
 * CardholderAuthentication7.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmCardholderOnLinePIN
 * CardholderAuthentication8.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmCardholderOnLinePIN
 * CardholderAuthentication9.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmCardholderOnLinePIN
 * CardholderAuthentication10.mmCardholderOnLinePIN}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
 * Authentication.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
 * Authentication.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationEntity
 * Authentication.mmAuthenticationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
 * Authentication.mmAuthenticationValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmPINFormat
 * Authentication.mmPINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmPIN
 * Authentication.mmPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationSupport
 * Authentication.mmAuthenticationSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmCollectionIndicator
 * Authentication.mmCollectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmMandate
 * Authentication.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationResult
 * Authentication.mmAuthenticationResult}</li>
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
 * "Authentication"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
public class Authentication {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardholderRole cardholder;
	/**
	 * Cardholder for which an authentication is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
	 * CardholderRole.mmAuthentication}</li>
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
	public static final MMBusinessAssociationEnd mmCardholder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cardholder";
			definition = "Cardholder for which an authentication is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardholderRole.mmAuthentication;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardholderRole.mmObject();
		}
	};
	protected AuthenticationMethodCode authenticationMethod;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#mmAuthenticationMethod
	 * CardholderAuthentication2.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication4#mmAuthenticationMethod
	 * CardholderAuthentication4.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationMethod
	 * CardholderAuthentication1.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#mmAuthenticationMethod
	 * CardholderAuthentication3.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#mmAuthenticationMethod
	 * CardholderAuthentication5.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#mmAuthenticationMethod
	 * CardholderAuthentication6.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmAuthenticationMethod
	 * CardholderAuthentication7.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmAuthenticationMethod
	 * CardholderAuthentication8.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmAuthenticationMethod
	 * CardholderAuthentication9.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmChannel
	 * MandateAuthentication1.mmChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationMethod
	 * CardholderAuthentication10.mmAuthenticationMethod}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAuthenticationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardholderAuthentication2.mmAuthenticationMethod, CardholderAuthentication4.mmAuthenticationMethod, CardholderAuthentication1.mmAuthenticationMethod,
					CardholderAuthentication3.mmAuthenticationMethod, CardholderAuthentication5.mmAuthenticationMethod, CardholderAuthentication6.mmAuthenticationMethod, CardholderAuthentication7.mmAuthenticationMethod,
					CardholderAuthentication8.mmAuthenticationMethod, CardholderAuthentication9.mmAuthenticationMethod, MandateAuthentication1.mmChannel, CardholderAuthentication10.mmAuthenticationMethod);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethodCode.mmObject();
		}
	};
	protected AuthenticationEntityCode authenticationEntity;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#mmAuthenticationEntity
	 * CardholderAuthentication2.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication4#mmAuthenticationEntity
	 * CardholderAuthentication4.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationEntity
	 * CardholderAuthentication1.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#mmAuthenticationEntity
	 * CardholderAuthentication3.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#mmAuthenticationEntity
	 * CardholderAuthentication5.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmMessageAuthenticationCode
	 * MandateAuthentication1.mmMessageAuthenticationCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAuthenticationEntity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardholderAuthentication2.mmAuthenticationEntity, CardholderAuthentication4.mmAuthenticationEntity, CardholderAuthentication1.mmAuthenticationEntity,
					CardholderAuthentication3.mmAuthenticationEntity, CardholderAuthentication5.mmAuthenticationEntity, MandateAuthentication1.mmMessageAuthenticationCode);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the person authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntityCode.mmObject();
		}
	};
	protected Max70Text authenticationValue;
	/**
	 * Value used to authenticate the owner of the payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication1#mmAuthenticationValue
	 * CardholderAuthentication1.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication3#mmAuthenticationValue
	 * CardholderAuthentication3.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5#mmAuthenticationValue
	 * CardholderAuthentication5.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication6#mmAuthenticationValue
	 * CardholderAuthentication6.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmAuthenticationValue
	 * CardholderAuthentication7.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmAuthenticationValue
	 * CardholderAuthentication8.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9#mmAuthenticationValue
	 * CardholderAuthentication9.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationValue
	 * CardholderAuthentication10.mmAuthenticationValue}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAuthenticationValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardholderAuthentication1.mmAuthenticationValue, CardholderAuthentication3.mmAuthenticationValue, CardholderAuthentication5.mmAuthenticationValue,
					CardholderAuthentication6.mmAuthenticationValue, CardholderAuthentication7.mmAuthenticationValue, CardholderAuthentication8.mmAuthenticationValue, CardholderAuthentication9.mmAuthenticationValue,
					CardholderAuthentication10.mmAuthenticationValue);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the owner of the payment card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected PINFormatCode pINFormat;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1#mmPINFormat
	 * OnLinePIN1.mmPINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN2#mmPINFormat
	 * OnLinePIN2.mmPINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN3#mmPINFormat
	 * OnLinePIN3.mmPINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN4#mmPINFormat
	 * OnLinePIN4.mmPINFormat}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5#mmPINFormat
	 * OnLinePIN5.mmPINFormat}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPINFormat = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OnLinePIN1.mmPINFormat, OnLinePIN2.mmPINFormat, OnLinePIN3.mmPINFormat, OnLinePIN4.mmPINFormat, OnLinePIN5.mmPINFormat);
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINFormat";
			definition = "Encrypted personal identification number (PIN) format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormatCode.mmObject();
		}
	};
	protected Max140Binary pIN;
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
	public static final MMBusinessAttribute mmPIN = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PIN";
			definition = "Personal Identification Number (PIN) for authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected Max35Text authenticationSupport;
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
	public static final MMBusinessAttribute mmAuthenticationSupport = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationSupport";
			definition = "This indicator identifies whether person authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collectionIndicator;
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
	public static final MMBusinessAttribute mmCollectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Mandate mandate;
	/**
	 * Specifies the mandate related to the transport authentication
	 * detailsmandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
	 * Mandate.mmAuthentication}</li>
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
	public static final MMBusinessAssociationEnd mmMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Specifies the mandate related to the transport authentication detailsmandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmAuthentication;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected AuthenticationResultCode authenticationResult;
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
	public static final MMBusinessAttribute mmAuthenticationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Authentication.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationResult";
			definition = "Specifies the result of the authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authentication";
				definition = "Data related to the authentication of the cardholder.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.mmAuthentication, com.tools20022.repository.entity.Mandate.mmAuthentication);
				derivationElement_lazy = () -> Arrays.asList(CardholderAuthentication1.mmCardholderOnLinePIN, CardholderAuthentication3.mmCardholderOnLinePIN, CardholderAuthentication5.mmCardholderOnLinePIN,
						CardholderAuthentication6.mmCardholderOnLinePIN, CardholderAuthentication7.mmCardholderOnLinePIN, CardholderAuthentication8.mmCardholderOnLinePIN, CardholderAuthentication9.mmCardholderOnLinePIN,
						CardholderAuthentication10.mmCardholderOnLinePIN);
				element_lazy = () -> Arrays.asList(Authentication.mmCardholder, Authentication.mmAuthenticationMethod, Authentication.mmAuthenticationEntity, Authentication.mmAuthenticationValue, Authentication.mmPINFormat,
						Authentication.mmPIN, Authentication.mmAuthenticationSupport, Authentication.mmCollectionIndicator, Authentication.mmMandate, Authentication.mmAuthenticationResult);
				derivationComponent_lazy = () -> Arrays.asList(CardholderAuthentication2.mmObject(), CardholderAuthentication4.mmObject(), OnLinePIN1.mmObject(), CardholderAuthentication1.mmObject(), OnLinePIN2.mmObject(),
						CardholderAuthentication3.mmObject(), OnLinePIN3.mmObject(), CardholderAuthentication5.mmObject(), OnLinePIN4.mmObject(), CardholderAuthentication6.mmObject(), CardholderAuthentication7.mmObject(),
						CardholderAuthentication8.mmObject(), OnLinePIN5.mmObject(), CardholderAuthentication9.mmObject(), MandateAuthentication1.mmObject(), CardholderAuthentication10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardholderRole getCardholder() {
		return cardholder;
	}

	public void setCardholder(com.tools20022.repository.entity.CardholderRole cardholder) {
		this.cardholder = cardholder;
	}

	public AuthenticationMethodCode getAuthenticationMethod() {
		return authenticationMethod;
	}

	public void setAuthenticationMethod(AuthenticationMethodCode authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}

	public AuthenticationEntityCode getAuthenticationEntity() {
		return authenticationEntity;
	}

	public void setAuthenticationEntity(AuthenticationEntityCode authenticationEntity) {
		this.authenticationEntity = authenticationEntity;
	}

	public Max70Text getAuthenticationValue() {
		return authenticationValue;
	}

	public void setAuthenticationValue(Max70Text authenticationValue) {
		this.authenticationValue = authenticationValue;
	}

	public PINFormatCode getPINFormat() {
		return pINFormat;
	}

	public void setPINFormat(PINFormatCode pINFormat) {
		this.pINFormat = pINFormat;
	}

	public Max140Binary getPIN() {
		return pIN;
	}

	public void setPIN(Max140Binary pIN) {
		this.pIN = pIN;
	}

	public Max35Text getAuthenticationSupport() {
		return authenticationSupport;
	}

	public void setAuthenticationSupport(Max35Text authenticationSupport) {
		this.authenticationSupport = authenticationSupport;
	}

	public Max35Text getCollectionIndicator() {
		return collectionIndicator;
	}

	public void setCollectionIndicator(Max35Text collectionIndicator) {
		this.collectionIndicator = collectionIndicator;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public void setMandate(com.tools20022.repository.entity.Mandate mandate) {
		this.mandate = mandate;
	}

	public AuthenticationResultCode getAuthenticationResult() {
		return authenticationResult;
	}

	public void setAuthenticationResult(AuthenticationResultCode authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
}