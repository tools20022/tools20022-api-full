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
 * Methods used to authenticate a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmOnLinePIN
 * AuthenticationMethod3Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPaperSignature
 * AuthenticationMethod3Code.mmPaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPassword
 * AuthenticationMethod3Code.mmPassword}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureCertificate
 * AuthenticationMethod3Code.mmSecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecuredChannel
 * AuthenticationMethod3Code.mmSecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureNoCertificate
 * AuthenticationMethod3Code.mmSecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSignatureCapture
 * AuthenticationMethod3Code.mmSignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmBillingAddressVerification
 * AuthenticationMethod3Code.mmBillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmBiometry
 * AuthenticationMethod3Code.mmBiometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCardholderIdentificationData
 * AuthenticationMethod3Code.mmCardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCryptogramVerification
 * AuthenticationMethod3Code.mmCryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCSCVerification
 * AuthenticationMethod3Code.mmCSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPassiveAuthentication
 * AuthenticationMethod3Code.mmPassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureElectronicCommerce
 * AuthenticationMethod3Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmShippingAddressVerification
 * AuthenticationMethod3Code.mmShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmTokenAuthentication
 * AuthenticationMethod3Code.mmTokenAuthentication}</li>
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
 * "AuthenticationMethod3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
 * AuthenticationMethod4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
 * AuthenticationMethod5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
 * AuthenticationMethod2Code}</li>
 * </ul>
 */
public class AuthenticationMethod3Code extends AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmOnLinePIN
	 * AuthenticationMethod4Code.mmOnLinePIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmOnLinePIN
	 * AuthenticationMethod5Code.mmOnLinePIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmOnLinePIN
	 * AuthenticationMethod2Code.mmOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmOnLinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmOnLinePIN, AuthenticationMethod5Code.mmOnLinePIN);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmOnLinePIN;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPaperSignature
	 * AuthenticationMethod4Code.mmPaperSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmPaperSignature
	 * AuthenticationMethod5Code.mmPaperSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmPaperSignature
	 * AuthenticationMethod2Code.mmPaperSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmPaperSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmPaperSignature, AuthenticationMethod5Code.mmPaperSignature);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmPaperSignature;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassword
	 * AuthenticationMethod4Code.mmPassword}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmPassword
	 * AuthenticationMethod5Code.mmPassword}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmPassword
	 * AuthenticationMethod2Code.mmPassword}</li>
	 * </ul>
	 */
	public static final MMCode mmPassword = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmPassword, AuthenticationMethod5Code.mmPassword);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmPassword;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureCertificate
	 * AuthenticationMethod4Code.mmSecureCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmSecureCertificate
	 * AuthenticationMethod5Code.mmSecureCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmSecureCertificate
	 * AuthenticationMethod2Code.mmSecureCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmSecureCertificate, AuthenticationMethod5Code.mmSecureCertificate);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmSecureCertificate;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecuredChannel
	 * AuthenticationMethod4Code.mmSecuredChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmSecuredChannel
	 * AuthenticationMethod5Code.mmSecuredChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmSecuredChannel
	 * AuthenticationMethod2Code.mmSecuredChannel}</li>
	 * </ul>
	 */
	public static final MMCode mmSecuredChannel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmSecuredChannel, AuthenticationMethod5Code.mmSecuredChannel);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmSecuredChannel;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureNoCertificate
	 * AuthenticationMethod4Code.mmSecureNoCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmSecureNoCertificate
	 * AuthenticationMethod5Code.mmSecureNoCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmSecureNoCertificate
	 * AuthenticationMethod2Code.mmSecureNoCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureNoCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmSecureNoCertificate, AuthenticationMethod5Code.mmSecureNoCertificate);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmSecureNoCertificate;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSignatureCapture
	 * AuthenticationMethod4Code.mmSignatureCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmSignatureCapture
	 * AuthenticationMethod5Code.mmSignatureCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#mmSignatureCapture
	 * AuthenticationMethod2Code.mmSignatureCapture}</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureCapture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmSignatureCapture, AuthenticationMethod5Code.mmSignatureCapture);
			previousVersion_lazy = () -> AuthenticationMethod2Code.mmSignatureCapture;
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBillingAddressVerification
	 * AuthenticationMethod4Code.mmBillingAddressVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmBillingAddressVerification
	 * AuthenticationMethod5Code.mmBillingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBillingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmBillingAddressVerification, AuthenticationMethod5Code.mmBillingAddressVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBiometry
	 * AuthenticationMethod4Code.mmBiometry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmBiometry
	 * AuthenticationMethod5Code.mmBiometry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBiometry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmBiometry, AuthenticationMethod5Code.mmBiometry);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCardholderIdentificationData
	 * AuthenticationMethod4Code.mmCardholderIdentificationData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmCardholderIdentificationData
	 * AuthenticationMethod5Code.mmCardholderIdentificationData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardholderIdentificationData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmCardholderIdentificationData, AuthenticationMethod5Code.mmCardholderIdentificationData);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCryptogramVerification
	 * AuthenticationMethod4Code.mmCryptogramVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmCryptogramVerification
	 * AuthenticationMethod5Code.mmCryptogramVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCryptogramVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmCryptogramVerification, AuthenticationMethod5Code.mmCryptogramVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCSCVerification
	 * AuthenticationMethod4Code.mmCSCVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmCSCVerification
	 * AuthenticationMethod5Code.mmCSCVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCSCVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmCSCVerification, AuthenticationMethod5Code.mmCSCVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassiveAuthentication
	 * AuthenticationMethod4Code.mmPassiveAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmPassiveAuthentication
	 * AuthenticationMethod5Code.mmPassiveAuthentication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPassiveAuthentication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmPassiveAuthentication, AuthenticationMethod5Code.mmPassiveAuthentication);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureElectronicCommerce
	 * AuthenticationMethod4Code.mmSecureElectronicCommerce}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmSecureElectronicCommerce
	 * AuthenticationMethod5Code.mmSecureElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmSecureElectronicCommerce, AuthenticationMethod5Code.mmSecureElectronicCommerce);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmShippingAddressVerification
	 * AuthenticationMethod4Code.mmShippingAddressVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#mmShippingAddressVerification
	 * AuthenticationMethod5Code.mmShippingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShippingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmShippingAddressVerification, AuthenticationMethod5Code.mmShippingAddressVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmTokenAuthentication
	 * AuthenticationMethod4Code.mmTokenAuthentication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTokenAuthentication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmTokenAuthentication);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod3Code";
				definition = "Methods used to authenticate a person.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmObject(), AuthenticationMethod5Code.mmObject());
				previousVersion_lazy = () -> AuthenticationMethod2Code.mmObject();
				code_lazy = () -> Arrays.asList(AuthenticationMethod3Code.mmOnLinePIN, AuthenticationMethod3Code.mmPaperSignature, AuthenticationMethod3Code.mmPassword, AuthenticationMethod3Code.mmSecureCertificate,
						AuthenticationMethod3Code.mmSecuredChannel, AuthenticationMethod3Code.mmSecureNoCertificate, AuthenticationMethod3Code.mmSignatureCapture, AuthenticationMethod3Code.mmBillingAddressVerification,
						AuthenticationMethod3Code.mmBiometry, AuthenticationMethod3Code.mmCardholderIdentificationData, AuthenticationMethod3Code.mmCryptogramVerification, AuthenticationMethod3Code.mmCSCVerification,
						AuthenticationMethod3Code.mmPassiveAuthentication, AuthenticationMethod3Code.mmSecureElectronicCommerce, AuthenticationMethod3Code.mmShippingAddressVerification, AuthenticationMethod3Code.mmTokenAuthentication);
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}