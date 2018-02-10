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
import com.tools20022.repository.codeset.CardholderVerificationCapability3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Customer authentication capabilities available on an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OnLinePIN
 * CardholderVerificationCapability3Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OfflinePINClear
 * CardholderVerificationCapability3Code.OfflinePINClear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OfflinePINEncrypted
 * CardholderVerificationCapability3Code.OfflinePINEncrypted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OfflineDigitalSignature
 * CardholderVerificationCapability3Code.OfflineDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OfflineBiometrics
 * CardholderVerificationCapability3Code.OfflineBiometrics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#OfflineBiographics
 * CardholderVerificationCapability3Code.OfflineBiographics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#PKISignature
 * CardholderVerificationCapability3Code.PKISignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code#PersonalCode
 * CardholderVerificationCapability3Code.PersonalCode}</li>
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
 * "CardholderVerificationCapability3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer authentication capabilities available on an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderVerificationCapability3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OnLinePIN = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINClear"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OfflinePINClear = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINClear";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINClear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePINEncrypted"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OfflinePINEncrypted = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePINEncrypted";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflinePINEncrypted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDigitalSignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OfflineDigitalSignature = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDigitalSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineDigitalSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiometrics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OfflineBiometrics = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiometrics";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiometrics.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineBiographics"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code OfflineBiographics = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineBiographics";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.OfflineBiographics.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKISignature"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code PKISignature = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKISignature";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.PKISignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonalCode"</li>
	 * </ul>
	 */
	public static final CardholderVerificationCapability3Code PersonalCode = new CardholderVerificationCapability3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalCode";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderVerificationCapability3Code.mmObject();
			codeName = CardholderVerificationCapabilityCode.PersonalCode.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderVerificationCapability3Code> codesByName = new LinkedHashMap<>();

	protected CardholderVerificationCapability3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapability3Code";
				definition = "Customer authentication capabilities available on an ATM.";
				trace_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OnLinePIN, com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OfflinePINClear,
						com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OfflinePINEncrypted, com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OfflineDigitalSignature,
						com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OfflineBiometrics, com.tools20022.repository.codeset.CardholderVerificationCapability3Code.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapability3Code.PKISignature, com.tools20022.repository.codeset.CardholderVerificationCapability3Code.PersonalCode);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(OfflinePINClear.getCodeName().get(), OfflinePINClear);
		codesByName.put(OfflinePINEncrypted.getCodeName().get(), OfflinePINEncrypted);
		codesByName.put(OfflineDigitalSignature.getCodeName().get(), OfflineDigitalSignature);
		codesByName.put(OfflineBiometrics.getCodeName().get(), OfflineBiometrics);
		codesByName.put(OfflineBiographics.getCodeName().get(), OfflineBiographics);
		codesByName.put(PKISignature.getCodeName().get(), PKISignature);
		codesByName.put(PersonalCode.getCodeName().get(), PersonalCode);
	}

	public static CardholderVerificationCapability3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderVerificationCapability3Code[] values() {
		CardholderVerificationCapability3Code[] values = new CardholderVerificationCapability3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderVerificationCapability3Code> {
		@Override
		public CardholderVerificationCapability3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderVerificationCapability3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}