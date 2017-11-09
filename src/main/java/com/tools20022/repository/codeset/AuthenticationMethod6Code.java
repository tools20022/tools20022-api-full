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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Methods used to authenticate a person or a card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmOnLinePIN
 * AuthenticationMethod6Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPaperSignature
 * AuthenticationMethod6Code.mmPaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPassword
 * AuthenticationMethod6Code.mmPassword}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureCertificate
 * AuthenticationMethod6Code.mmSecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecuredChannel
 * AuthenticationMethod6Code.mmSecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureNoCertificate
 * AuthenticationMethod6Code.mmSecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSignatureCapture
 * AuthenticationMethod6Code.mmSignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmBillingAddressVerification
 * AuthenticationMethod6Code.mmBillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmBiometry
 * AuthenticationMethod6Code.mmBiometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCardholderIdentificationData
 * AuthenticationMethod6Code.mmCardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCryptogramVerification
 * AuthenticationMethod6Code.mmCryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCSCVerification
 * AuthenticationMethod6Code.mmCSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPassiveAuthentication
 * AuthenticationMethod6Code.mmPassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureElectronicCommerce
 * AuthenticationMethod6Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmShippingAddressVerification
 * AuthenticationMethod6Code.mmShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmManualVerification
 * AuthenticationMethod6Code.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmOfflinePIN
 * AuthenticationMethod6Code.mmOfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPaymentToken
 * AuthenticationMethod6Code.mmPaymentToken}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person or a card."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
 * AuthenticationMethod4Code}</li>
 * </ul>
 */
public class AuthenticationMethod6Code extends AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmOnLinePIN
	 * AuthenticationMethod4Code.mmOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmOnLinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmOnLinePIN;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPaperSignature
	 * AuthenticationMethod4Code.mmPaperSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmPaperSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmPaperSignature;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassword
	 * AuthenticationMethod4Code.mmPassword}</li>
	 * </ul>
	 */
	public static final MMCode mmPassword = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmPassword;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureCertificate
	 * AuthenticationMethod4Code.mmSecureCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmSecureCertificate;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecuredChannel
	 * AuthenticationMethod4Code.mmSecuredChannel}</li>
	 * </ul>
	 */
	public static final MMCode mmSecuredChannel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmSecuredChannel;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureNoCertificate
	 * AuthenticationMethod4Code.mmSecureNoCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureNoCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmSecureNoCertificate;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSignatureCapture
	 * AuthenticationMethod4Code.mmSignatureCapture}</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureCapture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmSignatureCapture;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBillingAddressVerification
	 * AuthenticationMethod4Code.mmBillingAddressVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmBillingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmBillingAddressVerification;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBiometry
	 * AuthenticationMethod4Code.mmBiometry}</li>
	 * </ul>
	 */
	public static final MMCode mmBiometry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmBiometry;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCardholderIdentificationData
	 * AuthenticationMethod4Code.mmCardholderIdentificationData}</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderIdentificationData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmCardholderIdentificationData;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCryptogramVerification
	 * AuthenticationMethod4Code.mmCryptogramVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmCryptogramVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmCryptogramVerification;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCSCVerification
	 * AuthenticationMethod4Code.mmCSCVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmCSCVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmCSCVerification;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassiveAuthentication
	 * AuthenticationMethod4Code.mmPassiveAuthentication}</li>
	 * </ul>
	 */
	public static final MMCode mmPassiveAuthentication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmPassiveAuthentication;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureElectronicCommerce
	 * AuthenticationMethod4Code.mmSecureElectronicCommerce}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmSecureElectronicCommerce;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmShippingAddressVerification
	 * AuthenticationMethod4Code.mmShippingAddressVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmShippingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmShippingAddressVerification;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmManualVerification
	 * AuthenticationMethod4Code.mmManualVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmManualVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmManualVerification;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmOfflinePIN
	 * AuthenticationMethod4Code.mmOfflinePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			previousVersion_lazy = () -> AuthenticationMethod4Code.mmOfflinePIN;
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentToken = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			owner_lazy = () -> AuthenticationMethod6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod6Code";
				definition = "Methods used to authenticate a person or a card.";
				previousVersion_lazy = () -> AuthenticationMethod4Code.mmObject();
				code_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmOnLinePIN, AuthenticationMethod6Code.mmPaperSignature, AuthenticationMethod6Code.mmPassword, AuthenticationMethod6Code.mmSecureCertificate,
						AuthenticationMethod6Code.mmSecuredChannel, AuthenticationMethod6Code.mmSecureNoCertificate, AuthenticationMethod6Code.mmSignatureCapture, AuthenticationMethod6Code.mmBillingAddressVerification,
						AuthenticationMethod6Code.mmBiometry, AuthenticationMethod6Code.mmCardholderIdentificationData, AuthenticationMethod6Code.mmCryptogramVerification, AuthenticationMethod6Code.mmCSCVerification,
						AuthenticationMethod6Code.mmPassiveAuthentication, AuthenticationMethod6Code.mmSecureElectronicCommerce, AuthenticationMethod6Code.mmShippingAddressVerification, AuthenticationMethod6Code.mmManualVerification,
						AuthenticationMethod6Code.mmOfflinePIN, AuthenticationMethod6Code.mmPaymentToken);
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}