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
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmOnLinePIN
 * AuthenticationMethod4Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPaperSignature
 * AuthenticationMethod4Code.mmPaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassword
 * AuthenticationMethod4Code.mmPassword}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureCertificate
 * AuthenticationMethod4Code.mmSecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecuredChannel
 * AuthenticationMethod4Code.mmSecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureNoCertificate
 * AuthenticationMethod4Code.mmSecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSignatureCapture
 * AuthenticationMethod4Code.mmSignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBillingAddressVerification
 * AuthenticationMethod4Code.mmBillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmBiometry
 * AuthenticationMethod4Code.mmBiometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCardholderIdentificationData
 * AuthenticationMethod4Code.mmCardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCryptogramVerification
 * AuthenticationMethod4Code.mmCryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmCSCVerification
 * AuthenticationMethod4Code.mmCSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmPassiveAuthentication
 * AuthenticationMethod4Code.mmPassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmSecureElectronicCommerce
 * AuthenticationMethod4Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmShippingAddressVerification
 * AuthenticationMethod4Code.mmShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmTokenAuthentication
 * AuthenticationMethod4Code.mmTokenAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmManualVerification
 * AuthenticationMethod4Code.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#mmOfflinePIN
 * AuthenticationMethod4Code.mmOfflinePIN}</li>
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
 * "AuthenticationMethod4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
 * AuthenticationMethod6Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
 * AuthenticationMethod3Code}</li>
 * </ul>
 */
public class AuthenticationMethod4Code extends AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmOnLinePIN
	 * AuthenticationMethod6Code.mmOnLinePIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmOnLinePIN
	 * AuthenticationMethod3Code.mmOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmOnLinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmOnLinePIN);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmOnLinePIN;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPaperSignature
	 * AuthenticationMethod6Code.mmPaperSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPaperSignature
	 * AuthenticationMethod3Code.mmPaperSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmPaperSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmPaperSignature);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmPaperSignature;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPassword
	 * AuthenticationMethod6Code.mmPassword}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPassword
	 * AuthenticationMethod3Code.mmPassword}</li>
	 * </ul>
	 */
	public static final MMCode mmPassword = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmPassword);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmPassword;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureCertificate
	 * AuthenticationMethod6Code.mmSecureCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureCertificate
	 * AuthenticationMethod3Code.mmSecureCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmSecureCertificate);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmSecureCertificate;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecuredChannel
	 * AuthenticationMethod6Code.mmSecuredChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecuredChannel
	 * AuthenticationMethod3Code.mmSecuredChannel}</li>
	 * </ul>
	 */
	public static final MMCode mmSecuredChannel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmSecuredChannel);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmSecuredChannel;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureNoCertificate
	 * AuthenticationMethod6Code.mmSecureNoCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureNoCertificate
	 * AuthenticationMethod3Code.mmSecureNoCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureNoCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmSecureNoCertificate);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmSecureNoCertificate;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSignatureCapture
	 * AuthenticationMethod6Code.mmSignatureCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSignatureCapture
	 * AuthenticationMethod3Code.mmSignatureCapture}</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureCapture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmSignatureCapture);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmSignatureCapture;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmBillingAddressVerification
	 * AuthenticationMethod6Code.mmBillingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmBillingAddressVerification
	 * AuthenticationMethod3Code.mmBillingAddressVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmBillingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmBillingAddressVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmBillingAddressVerification;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmBiometry
	 * AuthenticationMethod6Code.mmBiometry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmBiometry
	 * AuthenticationMethod3Code.mmBiometry}</li>
	 * </ul>
	 */
	public static final MMCode mmBiometry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmBiometry);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmBiometry;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCardholderIdentificationData
	 * AuthenticationMethod6Code.mmCardholderIdentificationData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCardholderIdentificationData
	 * AuthenticationMethod3Code.mmCardholderIdentificationData}</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderIdentificationData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmCardholderIdentificationData);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmCardholderIdentificationData;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCryptogramVerification
	 * AuthenticationMethod6Code.mmCryptogramVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCryptogramVerification
	 * AuthenticationMethod3Code.mmCryptogramVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmCryptogramVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmCryptogramVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmCryptogramVerification;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmCSCVerification
	 * AuthenticationMethod6Code.mmCSCVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmCSCVerification
	 * AuthenticationMethod3Code.mmCSCVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmCSCVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmCSCVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmCSCVerification;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmPassiveAuthentication
	 * AuthenticationMethod6Code.mmPassiveAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmPassiveAuthentication
	 * AuthenticationMethod3Code.mmPassiveAuthentication}</li>
	 * </ul>
	 */
	public static final MMCode mmPassiveAuthentication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmPassiveAuthentication);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmPassiveAuthentication;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmSecureElectronicCommerce
	 * AuthenticationMethod6Code.mmSecureElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmSecureElectronicCommerce
	 * AuthenticationMethod3Code.mmSecureElectronicCommerce}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmSecureElectronicCommerce);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmSecureElectronicCommerce;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmShippingAddressVerification
	 * AuthenticationMethod6Code.mmShippingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmShippingAddressVerification
	 * AuthenticationMethod3Code.mmShippingAddressVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmShippingAddressVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmShippingAddressVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmShippingAddressVerification;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#mmTokenAuthentication
	 * AuthenticationMethod3Code.mmTokenAuthentication}</li>
	 * </ul>
	 */
	public static final MMCode mmTokenAuthentication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			previousVersion_lazy = () -> AuthenticationMethod3Code.mmTokenAuthentication;
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmManualVerification
	 * AuthenticationMethod6Code.mmManualVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmManualVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmManualVerification);
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#mmOfflinePIN
	 * AuthenticationMethod6Code.mmOfflinePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOfflinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmOfflinePIN);
			owner_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod4Code";
				definition = "Methods used to authenticate a person.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmObject());
				previousVersion_lazy = () -> AuthenticationMethod3Code.mmObject();
				code_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmOnLinePIN, AuthenticationMethod4Code.mmPaperSignature, AuthenticationMethod4Code.mmPassword, AuthenticationMethod4Code.mmSecureCertificate,
						AuthenticationMethod4Code.mmSecuredChannel, AuthenticationMethod4Code.mmSecureNoCertificate, AuthenticationMethod4Code.mmSignatureCapture, AuthenticationMethod4Code.mmBillingAddressVerification,
						AuthenticationMethod4Code.mmBiometry, AuthenticationMethod4Code.mmCardholderIdentificationData, AuthenticationMethod4Code.mmCryptogramVerification, AuthenticationMethod4Code.mmCSCVerification,
						AuthenticationMethod4Code.mmPassiveAuthentication, AuthenticationMethod4Code.mmSecureElectronicCommerce, AuthenticationMethod4Code.mmShippingAddressVerification, AuthenticationMethod4Code.mmTokenAuthentication,
						AuthenticationMethod4Code.mmManualVerification, AuthenticationMethod4Code.mmOfflinePIN);
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}