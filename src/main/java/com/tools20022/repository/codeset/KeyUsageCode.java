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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Allowed usages of the key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmEncryption
 * KeyUsageCode.mmEncryption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmDecryption
 * KeyUsageCode.mmDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmDataEncryption
 * KeyUsageCode.mmDataEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmDataDecryption
 * KeyUsageCode.mmDataDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmTranslateOutput
 * KeyUsageCode.mmTranslateOutput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmTranslateInput
 * KeyUsageCode.mmTranslateInput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmMessageAuthenticationCodeGeneration
 * KeyUsageCode.mmMessageAuthenticationCodeGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmMessageAuthenticationCodeVerification
 * KeyUsageCode.mmMessageAuthenticationCodeVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmSignatureGeneration
 * KeyUsageCode.mmSignatureGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmSignatureVerification
 * KeyUsageCode.mmSignatureVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmPINEncryption
 * KeyUsageCode.mmPINEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmPINDecryption
 * KeyUsageCode.mmPINDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmPINVerification
 * KeyUsageCode.mmPINVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmKeyGeneration
 * KeyUsageCode.mmKeyGeneration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmKeyImport
 * KeyUsageCode.mmKeyImport}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmKeyExport
 * KeyUsageCode.mmKeyExport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#mmKeyDerivation
 * KeyUsageCode.mmKeyDerivation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsage1Code
 * KeyUsage1Code}</li>
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
 * <li>"ENCR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "KeyUsageCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Allowed usages of the key."</li>
 * </ul>
 */
public class KeyUsageCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Key may encrypt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Encryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may encrypt."</li>
	 * </ul>
	 */
	public static final MMCode mmEncryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Encryption";
			definition = "Key may encrypt.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "ENCR";
		}
	};
	/**
	 * Key may decrypt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may decrypt."</li>
	 * </ul>
	 */
	public static final MMCode mmDecryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Decryption";
			definition = "Key may decrypt.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "DCPT";
		}
	};
	/**
	 * Key may encrypt data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DENC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may encrypt data."</li>
	 * </ul>
	 */
	public static final MMCode mmDataEncryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataEncryption";
			definition = "Key may encrypt data.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "DENC";
		}
	};
	/**
	 * Key may decrypt data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataDecryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may decrypt data."</li>
	 * </ul>
	 */
	public static final MMCode mmDataDecryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataDecryption";
			definition = "Key may decrypt data.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "DDEC";
		}
	};
	/**
	 * Key may encrypt information after translation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TranslateOutput"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may encrypt information after translation."</li>
	 * </ul>
	 */
	public static final MMCode mmTranslateOutput = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TranslateOutput";
			definition = "Key may encrypt information after translation.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "TRNX";
		}
	};
	/**
	 * Key may encrypt information before translation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TranslateInput"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may encrypt information before translation."</li>
	 * </ul>
	 */
	public static final MMCode mmTranslateInput = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TranslateInput";
			definition = "Key may encrypt information before translation.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "TRNI";
		}
	};
	/**
	 * Key may generate message authentication codes (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageAuthenticationCodeGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may generate message authentication codes (MAC)."</li>
	 * </ul>
	 */
	public static final MMCode mmMessageAuthenticationCodeGeneration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MessageAuthenticationCodeGeneration";
			definition = "Key may generate message authentication codes (MAC).";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "MACG";
		}
	};
	/**
	 * Key may verify message authentication codes (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageAuthenticationCodeVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may verify message authentication codes (MAC)."</li>
	 * </ul>
	 */
	public static final MMCode mmMessageAuthenticationCodeVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MessageAuthenticationCodeVerification";
			definition = "Key may verify message authentication codes (MAC).";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "MACV";
		}
	};
	/**
	 * Key may generate digital signatures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may generate digital signatures."</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureGeneration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureGeneration";
			definition = "Key may generate digital signatures.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "SIGG";
		}
	};
	/**
	 * Key may verify digital signatures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUGV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may verify digital signatures."</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureVerification";
			definition = "Key may verify digital signatures.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "SUGV";
		}
	};
	/**
	 * Key may encrypt personal identification numbers (PIN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may encrypt personal identification numbers (PIN)."</li>
	 * </ul>
	 */
	public static final MMCode mmPINEncryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINEncryption";
			definition = "Key may encrypt personal identification numbers (PIN).";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "PINE";
		}
	};
	/**
	 * Key may decrypt personal identification numbers (PIN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDecryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may decrypt personal identification numbers (PIN)."</li>
	 * </ul>
	 */
	public static final MMCode mmPINDecryption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINDecryption";
			definition = "Key may decrypt personal identification numbers (PIN).";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "PIND";
		}
	};
	/**
	 * Key may verify personal identification numbers (PIN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may verify personal identification numbers (PIN)."</li>
	 * </ul>
	 */
	public static final MMCode mmPINVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINVerification";
			definition = "Key may verify personal identification numbers (PIN).";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "PINV";
		}
	};
	/**
	 * Key may generate keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may generate keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyGeneration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyGeneration";
			definition = "Key may generate keys.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "KEYG";
		}
	};
	/**
	 * Key may import keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyImport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may import keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyImport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyImport";
			definition = "Key may import keys.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "KEYI";
		}
	};
	/**
	 * Key may export keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may export keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyExport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyExport";
			definition = "Key may export keys.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "KEYX";
		}
	};
	/**
	 * Key may derive keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDerivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key may derive keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyDerivation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyDerivation";
			definition = "Key may derive keys.";
			owner_lazy = () -> KeyUsageCode.mmObject();
			codeName = "KEYD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ENCR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyUsageCode";
				definition = "Allowed usages of the key.";
				code_lazy = () -> Arrays.asList(KeyUsageCode.mmEncryption, KeyUsageCode.mmDecryption, KeyUsageCode.mmDataEncryption, KeyUsageCode.mmDataDecryption, KeyUsageCode.mmTranslateOutput, KeyUsageCode.mmTranslateInput,
						KeyUsageCode.mmMessageAuthenticationCodeGeneration, KeyUsageCode.mmMessageAuthenticationCodeVerification, KeyUsageCode.mmSignatureGeneration, KeyUsageCode.mmSignatureVerification, KeyUsageCode.mmPINEncryption,
						KeyUsageCode.mmPINDecryption, KeyUsageCode.mmPINVerification, KeyUsageCode.mmKeyGeneration, KeyUsageCode.mmKeyImport, KeyUsageCode.mmKeyExport, KeyUsageCode.mmKeyDerivation);
				derivation_lazy = () -> Arrays.asList(KeyUsage1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}