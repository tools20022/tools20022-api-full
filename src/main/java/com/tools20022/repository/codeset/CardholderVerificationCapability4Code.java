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
import com.tools20022.repository.codeset.CardholderVerificationCapability4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cardholder verification capabilities by the terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#AccountDigitalSignature
 * CardholderVerificationCapability4Code.AccountDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#CardholderData
 * CardholderVerificationCapability4Code.CardholderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#ManualSignature
 * CardholderVerificationCapability4Code.ManualSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#ManualVerification
 * CardholderVerificationCapability4Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineBiographics
 * CardholderVerificationCapability4Code.OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineBiometrics
 * CardholderVerificationCapability4Code.OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflineDigitalSignature
 * CardholderVerificationCapability4Code.OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflinePINClear
 * CardholderVerificationCapability4Code.OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OfflinePINEncrypted
 * CardholderVerificationCapability4Code.OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OnLinePIN
 * CardholderVerificationCapability4Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#PKISignature
 * CardholderVerificationCapability4Code.PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#SecureElectronicCommerce
 * CardholderVerificationCapability4Code.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#OnLineBiometrics
 * CardholderVerificationCapability4Code.OnLineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#NoCapabilities
 * CardholderVerificationCapability4Code.NoCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code#Other
 * CardholderVerificationCapability4Code.Other}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapability4Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#AccountDigitalSignature
	 * CardholderVerificationCapability2Code.AccountDigitalSignature}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code AccountDigitalSignature = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDigitalSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.AccountDigitalSignature;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.AccountDigitalSignature.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#CardholderData
	 * CardholderVerificationCapability2Code.CardholderData}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code CardholderData = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderData";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.CardholderData;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.CardholderData.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#ManualSignature
	 * CardholderVerificationCapability2Code.ManualSignature}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code ManualSignature = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.ManualSignature;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualSignature.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#ManualVerification
	 * CardholderVerificationCapability2Code.ManualVerification}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code ManualVerification = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.ManualVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.ManualVerification.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineBiographics
	 * CardholderVerificationCapability2Code.OfflineBiographics}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OfflineBiographics = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OfflineBiographics;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiographics.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineBiometrics
	 * CardholderVerificationCapability2Code.OfflineBiometrics}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OfflineBiometrics = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OfflineBiometrics;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiometrics.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflineDigitalSignature
	 * CardholderVerificationCapability2Code.OfflineDigitalSignature}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OfflineDigitalSignature = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OfflineDigitalSignature;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineDigitalSignature.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflinePINClear
	 * CardholderVerificationCapability2Code.OfflinePINClear}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OfflinePINClear = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OfflinePINClear;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINClear.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OfflinePINEncrypted
	 * CardholderVerificationCapability2Code.OfflinePINEncrypted}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OfflinePINEncrypted = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OfflinePINEncrypted;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINEncrypted.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OnLinePIN
	 * CardholderVerificationCapability2Code.OnLinePIN}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OnLinePIN = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OnLinePIN;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLinePIN.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#PKISignature
	 * CardholderVerificationCapability2Code.PKISignature}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code PKISignature = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.PKISignature;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.PKISignature.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#SecureElectronicCommerce
	 * CardholderVerificationCapability2Code.SecureElectronicCommerce}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code SecureElectronicCommerce = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.SecureElectronicCommerce;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.SecureElectronicCommerce.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#OnLineBiometrics
	 * CardholderVerificationCapability2Code.OnLineBiometrics}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code OnLineBiometrics = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.OnLineBiometrics;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLineBiometrics.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#NoCapabilities
	 * CardholderVerificationCapability2Code.NoCapabilities}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code NoCapabilities = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.NoCapabilities;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.NoCapabilities.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code#Other
	 * CardholderVerificationCapability2Code.Other}</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability4Code Other = new CardholderVerificationCapability4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> CardholderVerificationCapability2Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability4Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapability4Code> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapability4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability4Code";
				definition = "Cardholder verification capabilities by the terminal.";
				previousVersion_lazy = () -> CardholderVerificationCapability2Code.mmObject();
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability4Code.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.CardholderData,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.ManualVerification,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OfflineBiographics, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OfflinePINClear,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OfflinePINEncrypted, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.PKISignature, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.OnLineBiometrics, com.tools20022.repository.codeset.CardholderVerificationCapability4Code.NoCapabilities,
						com.tools20022.repository.codeset.CardholderVerificationCapability4Code.Other);
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
		codesByName.put(OnLineBiometrics.getCodeName().get(), OnLineBiometrics);
		codesByName.put(NoCapabilities.getCodeName().get(), NoCapabilities);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static CardholderVerificationCapability4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapability4Code[] values() {
		CardholderVerificationCapability4Code[] values = new CardholderVerificationCapability4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapability4Code> {
		@Override
		public CardholderVerificationCapability4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapability4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}