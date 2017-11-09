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
import com.tools20022.repository.codeset.CardholderVerificationCapabilityCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cardholder verification capabilities by the terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
 * CardholderVerificationCapabilityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmAccountDigitalSignature
 * CardholderVerificationCapability4Code.mmAccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmCardholderData
 * CardholderVerificationCapability4Code.mmCardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmManualSignature
 * CardholderVerificationCapability4Code.mmManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmManualVerification
 * CardholderVerificationCapability4Code.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOfflineBiographics
 * CardholderVerificationCapability4Code.mmOfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOfflineBiometrics
 * CardholderVerificationCapability4Code.mmOfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOfflineDigitalSignature
 * CardholderVerificationCapability4Code.mmOfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOfflinePINClear
 * CardholderVerificationCapability4Code.mmOfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOfflinePINEncrypted
 * CardholderVerificationCapability4Code.mmOfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOnLinePIN
 * CardholderVerificationCapability4Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmPKISignature
 * CardholderVerificationCapability4Code.mmPKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmSecureElectronicCommerce
 * CardholderVerificationCapability4Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOnLineBiometrics
 * CardholderVerificationCapability4Code.mmOnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmNoCapabilities
 * CardholderVerificationCapability4Code.mmNoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#mmOther
 * CardholderVerificationCapability4Code.mmOther}</li>
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
 * "CardholderVerificationCapability4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cardholder verification capabilities by the terminal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
 * CardholderVerificationCapability2Code}</li>
 * </ul>
 */
public class CardholderVerificationCapability4Code extends CardholderVerificationCapabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmAccountDigitalSignature
	 * CardholderVerificationCapability2Code.mmAccountDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmAccountDigitalSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmAccountDigitalSignature;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmCardholderData
	 * CardholderVerificationCapability2Code.mmCardholderData}</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmCardholderData;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmManualSignature
	 * CardholderVerificationCapability2Code.mmManualSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmManualSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmManualSignature;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmManualVerification
	 * CardholderVerificationCapability2Code.mmManualVerification}</li>
	 * </ul>
	 */
	public static final MMCode mmManualVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmManualVerification;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOfflineBiographics
	 * CardholderVerificationCapability2Code.mmOfflineBiographics}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineBiographics = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOfflineBiographics;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOfflineBiometrics
	 * CardholderVerificationCapability2Code.mmOfflineBiometrics}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineBiometrics = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOfflineBiometrics;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOfflineDigitalSignature
	 * CardholderVerificationCapability2Code.mmOfflineDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineDigitalSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOfflineDigitalSignature;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOfflinePINClear
	 * CardholderVerificationCapability2Code.mmOfflinePINClear}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflinePINClear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOfflinePINClear;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOfflinePINEncrypted
	 * CardholderVerificationCapability2Code.mmOfflinePINEncrypted}</li>
	 * </ul>
	 */
	public static final MMCode mmOfflinePINEncrypted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOfflinePINEncrypted;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOnLinePIN
	 * CardholderVerificationCapability2Code.mmOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmOnLinePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOnLinePIN;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmPKISignature
	 * CardholderVerificationCapability2Code.mmPKISignature}</li>
	 * </ul>
	 */
	public static final MMCode mmPKISignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmPKISignature;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmSecureElectronicCommerce
	 * CardholderVerificationCapability2Code.mmSecureElectronicCommerce}</li>
	 * </ul>
	 */
	public static final MMCode mmSecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmSecureElectronicCommerce;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOnLineBiometrics
	 * CardholderVerificationCapability2Code.mmOnLineBiometrics}</li>
	 * </ul>
	 */
	public static final MMCode mmOnLineBiometrics = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOnLineBiometrics;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmNoCapabilities
	 * CardholderVerificationCapability2Code.mmNoCapabilities}</li>
	 * </ul>
	 */
	public static final MMCode mmNoCapabilities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmNoCapabilities;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#mmOther
	 * CardholderVerificationCapability2Code.mmOther}</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmOther;
			owner_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability4Code";
				definition = "Cardholder verification capabilities by the terminal.";
				previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmObject();
				code_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.mmAccountDigitalSignature, CardholderVerificationCapability4Code.mmCardholderData, CardholderVerificationCapability4Code.mmManualSignature,
						CardholderVerificationCapability4Code.mmManualVerification, CardholderVerificationCapability4Code.mmOfflineBiographics, CardholderVerificationCapability4Code.mmOfflineBiometrics,
						CardholderVerificationCapability4Code.mmOfflineDigitalSignature, CardholderVerificationCapability4Code.mmOfflinePINClear, CardholderVerificationCapability4Code.mmOfflinePINEncrypted,
						CardholderVerificationCapability4Code.mmOnLinePIN, CardholderVerificationCapability4Code.mmPKISignature, CardholderVerificationCapability4Code.mmSecureElectronicCommerce,
						CardholderVerificationCapability4Code.mmOnLineBiometrics, CardholderVerificationCapability4Code.mmNoCapabilities, CardholderVerificationCapability4Code.mmOther);
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}