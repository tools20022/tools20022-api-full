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
import com.tools20022.repository.codeset.CardholderVerificationCapability2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cardholder verification capabilities by the terminal. <br>
 * It correspond to the ISO 8583, field number 22-2 for the versions 87 and 93,
 * and 27-2 for the version 2003.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#AccountDigitalSignature
 * CardholderVerificationCapability2Code.AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#CardholderData
 * CardholderVerificationCapability2Code.CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#ManualSignature
 * CardholderVerificationCapability2Code.ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#ManualVerification
 * CardholderVerificationCapability2Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineBiographics
 * CardholderVerificationCapability2Code.OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineBiometrics
 * CardholderVerificationCapability2Code.OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineDigitalSignature
 * CardholderVerificationCapability2Code.OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflinePINClear
 * CardholderVerificationCapability2Code.OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflinePINEncrypted
 * CardholderVerificationCapability2Code.OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OnLinePIN
 * CardholderVerificationCapability2Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#PKISignature
 * CardholderVerificationCapability2Code.PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#SecureElectronicCommerce
 * CardholderVerificationCapability2Code.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#Unknown
 * CardholderVerificationCapability2Code.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OnLineBiometrics
 * CardholderVerificationCapability2Code.OnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#NoCapabilities
 * CardholderVerificationCapability2Code.NoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#Other
 * CardholderVerificationCapability2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
 * CardholderVerificationCapabilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderVerificationCapability2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cardholder verification capabilities by the terminal. \r\nIt correspond to the ISO 8583, field number 22-2 for the versions 87 and 93, and 27-2 for the version 2003."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
 * CardholderVerificationCapability4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapability2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#AccountDigitalSignature
	 * CardholderVerificationCapability4Code.AccountDigitalSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code AccountDigitalSignature = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.AccountDigitalSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.AccountDigitalSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#CardholderData
	 * CardholderVerificationCapability4Code.CardholderData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code CardholderData = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.CardholderData);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.CardholderData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#ManualSignature
	 * CardholderVerificationCapability4Code.ManualSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code ManualSignature = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.ManualSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#ManualVerification
	 * CardholderVerificationCapability4Code.ManualVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code ManualVerification = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.ManualVerification);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineBiographics
	 * CardholderVerificationCapability4Code.OfflineBiographics}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OfflineBiographics = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OfflineBiographics);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiographics.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineBiometrics
	 * CardholderVerificationCapability4Code.OfflineBiometrics}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OfflineBiometrics = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OfflineBiometrics);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiometrics.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineDigitalSignature
	 * CardholderVerificationCapability4Code.OfflineDigitalSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OfflineDigitalSignature = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OfflineDigitalSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineDigitalSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflinePINClear
	 * CardholderVerificationCapability4Code.OfflinePINClear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OfflinePINClear = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OfflinePINClear);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINClear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflinePINEncrypted
	 * CardholderVerificationCapability4Code.OfflinePINEncrypted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OfflinePINEncrypted = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OfflinePINEncrypted);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINEncrypted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OnLinePIN
	 * CardholderVerificationCapability4Code.OnLinePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OnLinePIN = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OnLinePIN);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#PKISignature
	 * CardholderVerificationCapability4Code.PKISignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code PKISignature = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.PKISignature);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.PKISignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#SecureElectronicCommerce
	 * CardholderVerificationCapability4Code.SecureElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code SecureElectronicCommerce = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.SecureElectronicCommerce);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code Unknown = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.Unknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineBiometrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OnLineBiometrics
	 * CardholderVerificationCapability4Code.OnLineBiometrics}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code OnLineBiometrics = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.OnLineBiometrics);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLineBiometrics.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#NoCapabilities
	 * CardholderVerificationCapability4Code.NoCapabilities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code NoCapabilities = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.NoCapabilities);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.NoCapabilities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#Other
	 * CardholderVerificationCapability4Code.Other}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability2Code Other = new CardholderVerificationCapability2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.Other);
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability2Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapability2Code> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapability2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability2Code";
				definition = "Cardholder verification capabilities by the terminal. \r\nIt correspond to the ISO 8583, field number 22-2 for the versions 87 and 93, and 27-2 for the version 2003.";
				nextVersions_lazy = () -> Arrays.asList(CardholderVerificationCapability4Code.mmObject());
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability2Code.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.CardholderData,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.ManualVerification,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OfflineBiographics, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OfflinePINClear,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OfflinePINEncrypted, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.PKISignature, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.Unknown, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.OnLineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapability2Code.NoCapabilities, com.tools20022.repository.codeset.CardholderVerificationCapability2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountDigitalSignature.getCodeName().get(), AccountDigitalSignature);
		codesByName.put(CardholderData.getCodeName().get(), CardholderData);
		codesByName.put(ManualSignature.getCodeName().get(), ManualSignature);
		codesByName.put(ManualVerification.getCodeName().get(), ManualVerification);
		codesByName.put(OfflineBiographics.getCodeName().get(), OfflineBiographics);
		codesByName.put(OfflineBiometrics.getCodeName().get(), OfflineBiometrics);
		codesByName.put(OfflineDigitalSignature.getCodeName().get(), OfflineDigitalSignature);
		codesByName.put(OfflinePINClear.getCodeName().get(), OfflinePINClear);
		codesByName.put(OfflinePINEncrypted.getCodeName().get(), OfflinePINEncrypted);
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(PKISignature.getCodeName().get(), PKISignature);
		codesByName.put(SecureElectronicCommerce.getCodeName().get(), SecureElectronicCommerce);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(OnLineBiometrics.getCodeName().get(), OnLineBiometrics);
		codesByName.put(NoCapabilities.getCodeName().get(), NoCapabilities);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static CardholderVerificationCapability2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapability2Code[] values() {
		CardholderVerificationCapability2Code[] values = new CardholderVerificationCapability2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapability2Code> {
		@Override
		public CardholderVerificationCapability2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapability2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}