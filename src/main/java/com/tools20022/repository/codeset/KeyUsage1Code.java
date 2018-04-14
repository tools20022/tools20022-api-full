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
import com.tools20022.repository.codeset.KeyUsage1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsage1Code#Encryption
 * KeyUsage1Code.Encryption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsage1Code#Decryption
 * KeyUsage1Code.Decryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#DataEncryption
 * KeyUsage1Code.DataEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#DataDecryption
 * KeyUsage1Code.DataDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#TranslateInput
 * KeyUsage1Code.TranslateInput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#TranslateOutput
 * KeyUsage1Code.TranslateOutput}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#MessageAuthenticationCodeGeneration
 * KeyUsage1Code.MessageAuthenticationCodeGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#MessageAuthenticationCodeVerification
 * KeyUsage1Code.MessageAuthenticationCodeVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#SignatureGeneration
 * KeyUsage1Code.SignatureGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#SignatureVerification
 * KeyUsage1Code.SignatureVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#PINEncryption
 * KeyUsage1Code.PINEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#PINDecryption
 * KeyUsage1Code.PINDecryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#PINVerification
 * KeyUsage1Code.PINVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#KeyGeneration
 * KeyUsage1Code.KeyGeneration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsage1Code#KeyImport
 * KeyUsage1Code.KeyImport}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.KeyUsage1Code#KeyExport
 * KeyUsage1Code.KeyExport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code#KeyDerivation
 * KeyUsage1Code.KeyDerivation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.KeyUsageCode KeyUsageCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "KeyUsage1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Allowed usages of the key."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class KeyUsage1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Encryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code Encryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Encryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.Encryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code Decryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.Decryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code DataEncryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataEncryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.DataEncryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataDecryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code DataDecryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataDecryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.DataDecryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TranslateInput"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code TranslateInput = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TranslateInput";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.TranslateInput.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TranslateOutput"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code TranslateOutput = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TranslateOutput";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.TranslateOutput.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageAuthenticationCodeGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code MessageAuthenticationCodeGeneration = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageAuthenticationCodeGeneration";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.MessageAuthenticationCodeGeneration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageAuthenticationCodeVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code MessageAuthenticationCodeVerification = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageAuthenticationCodeVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.MessageAuthenticationCodeVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code SignatureGeneration = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureGeneration";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.SignatureGeneration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code SignatureVerification = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.SignatureVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code PINEncryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.PINEncryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDecryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code PINDecryption = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDecryption";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.PINDecryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code PINVerification = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.PINVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code KeyGeneration = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyGeneration";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.KeyGeneration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyImport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code KeyImport = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyImport";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.KeyImport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code KeyExport = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExport";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.KeyExport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDerivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final KeyUsage1Code KeyDerivation = new KeyUsage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDerivation";
			owner_lazy = () -> com.tools20022.repository.codeset.KeyUsage1Code.mmObject();
			codeName = KeyUsageCode.KeyDerivation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, KeyUsage1Code> codesByName = new LinkedHashMap<>();

	protected KeyUsage1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ENCR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyUsage1Code";
				definition = "Allowed usages of the key.";
				trace_lazy = () -> KeyUsageCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.KeyUsage1Code.Encryption, com.tools20022.repository.codeset.KeyUsage1Code.Decryption, com.tools20022.repository.codeset.KeyUsage1Code.DataEncryption,
						com.tools20022.repository.codeset.KeyUsage1Code.DataDecryption, com.tools20022.repository.codeset.KeyUsage1Code.TranslateInput, com.tools20022.repository.codeset.KeyUsage1Code.TranslateOutput,
						com.tools20022.repository.codeset.KeyUsage1Code.MessageAuthenticationCodeGeneration, com.tools20022.repository.codeset.KeyUsage1Code.MessageAuthenticationCodeVerification,
						com.tools20022.repository.codeset.KeyUsage1Code.SignatureGeneration, com.tools20022.repository.codeset.KeyUsage1Code.SignatureVerification, com.tools20022.repository.codeset.KeyUsage1Code.PINEncryption,
						com.tools20022.repository.codeset.KeyUsage1Code.PINDecryption, com.tools20022.repository.codeset.KeyUsage1Code.PINVerification, com.tools20022.repository.codeset.KeyUsage1Code.KeyGeneration,
						com.tools20022.repository.codeset.KeyUsage1Code.KeyImport, com.tools20022.repository.codeset.KeyUsage1Code.KeyExport, com.tools20022.repository.codeset.KeyUsage1Code.KeyDerivation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Encryption.getCodeName().get(), Encryption);
		codesByName.put(Decryption.getCodeName().get(), Decryption);
		codesByName.put(DataEncryption.getCodeName().get(), DataEncryption);
		codesByName.put(DataDecryption.getCodeName().get(), DataDecryption);
		codesByName.put(TranslateInput.getCodeName().get(), TranslateInput);
		codesByName.put(TranslateOutput.getCodeName().get(), TranslateOutput);
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

	public static KeyUsage1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static KeyUsage1Code[] values() {
		KeyUsage1Code[] values = new KeyUsage1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, KeyUsage1Code> {
		@Override
		public KeyUsage1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(KeyUsage1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}