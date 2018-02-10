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
import com.tools20022.repository.codeset.KeyUsageCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Allowed usages of the key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#Encryption
 * KeyUsageCode.Encryption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#Decryption
 * KeyUsageCode.Decryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#DataEncryption
 * KeyUsageCode.DataEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#DataDecryption
 * KeyUsageCode.DataDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#TranslateOutput
 * KeyUsageCode.TranslateOutput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#TranslateInput
 * KeyUsageCode.TranslateInput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#MessageAuthenticationCodeGeneration
 * KeyUsageCode.MessageAuthenticationCodeGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#MessageAuthenticationCodeVerification
 * KeyUsageCode.MessageAuthenticationCodeVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#SignatureGeneration
 * KeyUsageCode.SignatureGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#SignatureVerification
 * KeyUsageCode.SignatureVerification}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#PINEncryption
 * KeyUsageCode.PINEncryption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#PINDecryption
 * KeyUsageCode.PINDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode#PINVerification
 * KeyUsageCode.PINVerification}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#KeyGeneration
 * KeyUsageCode.KeyGeneration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#KeyImport
 * KeyUsageCode.KeyImport}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#KeyExport
 * KeyUsageCode.KeyExport}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsageCode#KeyDerivation
 * KeyUsageCode.KeyDerivation}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class KeyUsageCode extends MMCode {

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
	public static final KeyUsageCode Encryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Encryption";
			definition = "Key may encrypt.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode Decryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Decryption";
			definition = "Key may decrypt.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode DataEncryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataEncryption";
			definition = "Key may encrypt data.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode DataDecryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataDecryption";
			definition = "Key may decrypt data.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode TranslateOutput = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TranslateOutput";
			definition = "Key may encrypt information after translation.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode TranslateInput = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TranslateInput";
			definition = "Key may encrypt information before translation.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode MessageAuthenticationCodeGeneration = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MessageAuthenticationCodeGeneration";
			definition = "Key may generate message authentication codes (MAC).";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode MessageAuthenticationCodeVerification = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MessageAuthenticationCodeVerification";
			definition = "Key may verify message authentication codes (MAC).";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode SignatureGeneration = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureGeneration";
			definition = "Key may generate digital signatures.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode SignatureVerification = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureVerification";
			definition = "Key may verify digital signatures.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode PINEncryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINEncryption";
			definition = "Key may encrypt personal identification numbers (PIN).";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode PINDecryption = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINDecryption";
			definition = "Key may decrypt personal identification numbers (PIN).";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode PINVerification = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINVerification";
			definition = "Key may verify personal identification numbers (PIN).";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode KeyGeneration = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyGeneration";
			definition = "Key may generate keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode KeyImport = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyImport";
			definition = "Key may import keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode KeyExport = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyExport";
			definition = "Key may export keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
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
	public static final KeyUsageCode KeyDerivation = new KeyUsageCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KeyDerivation";
			definition = "Key may derive keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsageCode.mmObject();
			codeName = "KEYD";
		}
	};
	final static private LinkedHashMap<String, KeyUsageCode> codesByName = new LinkedHashMap<>();

	protected KeyUsageCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ENCR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyUsageCode";
				definition = "Allowed usages of the key.";
				derivation_lazy = () -> Arrays.asList(KeyUsage1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.KeyUsageCode.Encryption, com.tools20022.repository.codeset.KeyUsageCode.Decryption, com.tools20022.repository.codeset.KeyUsageCode.DataEncryption,
						com.tools20022.repository.codeset.KeyUsageCode.DataDecryption, com.tools20022.repository.codeset.KeyUsageCode.TranslateOutput, com.tools20022.repository.codeset.KeyUsageCode.TranslateInput,
						com.tools20022.repository.codeset.KeyUsageCode.MessageAuthenticationCodeGeneration, com.tools20022.repository.codeset.KeyUsageCode.MessageAuthenticationCodeVerification,
						com.tools20022.repository.codeset.KeyUsageCode.SignatureGeneration, com.tools20022.repository.codeset.KeyUsageCode.SignatureVerification, com.tools20022.repository.codeset.KeyUsageCode.PINEncryption,
						com.tools20022.repository.codeset.KeyUsageCode.PINDecryption, com.tools20022.repository.codeset.KeyUsageCode.PINVerification, com.tools20022.repository.codeset.KeyUsageCode.KeyGeneration,
						com.tools20022.repository.codeset.KeyUsageCode.KeyImport, com.tools20022.repository.codeset.KeyUsageCode.KeyExport, com.tools20022.repository.codeset.KeyUsageCode.KeyDerivation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Encryption.getCodeName().get(), Encryption);
		codesByName.put(Decryption.getCodeName().get(), Decryption);
		codesByName.put(DataEncryption.getCodeName().get(), DataEncryption);
		codesByName.put(DataDecryption.getCodeName().get(), DataDecryption);
		codesByName.put(TranslateOutput.getCodeName().get(), TranslateOutput);
		codesByName.put(TranslateInput.getCodeName().get(), TranslateInput);
		codesByName.put(MessageAuthenticationCodeGeneration.getCodeName().get(), MessageAuthenticationCodeGeneration);
		codesByName.put(MessageAuthenticationCodeVerification.getCodeName().get(), MessageAuthenticationCodeVerification);
		codesByName.put(SignatureGeneration.getCodeName().get(), SignatureGeneration);
		codesByName.put(SignatureVerification.getCodeName().get(), SignatureVerification);
		codesByName.put(PINEncryption.getCodeName().get(), PINEncryption);
		codesByName.put(PINDecryption.getCodeName().get(), PINDecryption);
		codesByName.put(PINVerification.getCodeName().get(), PINVerification);
		codesByName.put(KeyGeneration.getCodeName().get(), KeyGeneration);
		codesByName.put(KeyImport.getCodeName().get(), KeyImport);
		codesByName.put(KeyExport.getCodeName().get(), KeyExport);
		codesByName.put(KeyDerivation.getCodeName().get(), KeyDerivation);
	}

	public static KeyUsageCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static KeyUsageCode[] values() {
		KeyUsageCode[] values = new KeyUsageCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, KeyUsageCode> {
		@Override
		public KeyUsageCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(KeyUsageCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}