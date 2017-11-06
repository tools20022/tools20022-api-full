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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of algorithm used by the cryptographic key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmDES
 * CryptographicKeyTypeCode.mmDES}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmAES
 * CryptographicKeyTypeCode.mmAES}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmRSA
 * CryptographicKeyTypeCode.mmRSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmECC
 * CryptographicKeyTypeCode.mmECC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmAES128
 * CryptographicKeyTypeCode.mmAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmDES112
 * CryptographicKeyTypeCode.mmDES112}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmDUKPT2009
 * CryptographicKeyTypeCode.mmDUKPT2009}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmAES192
 * CryptographicKeyTypeCode.mmAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmAES256
 * CryptographicKeyTypeCode.mmAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmDES168
 * CryptographicKeyTypeCode.mmDES168}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmApplication
 * CryptographicKeyTypeCode.mmApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmDynamic
 * CryptographicKeyTypeCode.mmDynamic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmData
 * CryptographicKeyTypeCode.mmData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmKeyEncryption
 * CryptographicKeyTypeCode.mmKeyEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmWorking
 * CryptographicKeyTypeCode.mmWorking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmPIN
 * CryptographicKeyTypeCode.mmPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#mmMAC
 * CryptographicKeyTypeCode.mmMAC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CryptographicKeyType1Code
 * CryptographicKeyType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code
 * CryptographicKeyType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
 * CryptographicKeyType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
 * CryptographicKeyType4Code}</li>
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
 * <li>"DESC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CryptographicKeyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of algorithm used by the cryptographic key."</li>
 * </ul>
 */
public class CryptographicKeyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data encryption standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data encryption standard."</li>
	 * </ul>
	 */
	public static final MMCode mmDES = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DES";
			definition = "Data encryption standard.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "DESC";
		}
	};
	/**
	 * Advanced encryption standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advanced encryption standard."</li>
	 * </ul>
	 */
	public static final MMCode mmAES = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AES";
			definition = "Advanced encryption standard.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "AESC";
		}
	};
	/**
	 * Rivest, Shamir and Adleman.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rivest, Shamir and Adleman."</li>
	 * </ul>
	 */
	public static final MMCode mmRSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RSA";
			definition = "Rivest, Shamir and Adleman.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "RSAC";
		}
	};
	/**
	 * Elliptic-curve cryptography.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elliptic-curve cryptography."</li>
	 * </ul>
	 */
	public static final MMCode mmECC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ECC";
			definition = "Elliptic-curve cryptography.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "ECCC";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) 128 bits cryptographic key as defined
	 * by the Federal Information Processing Standards (FIPS 197 - November 6,
	 * 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AES2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAES128 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AES128";
			definition = "AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "AES2";
		}
	};
	/**
	 * Data encryption standard key of 112 bits (without the parity bits).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDE3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data encryption standard key of 112 bits (without the parity bits)."</li>
	 * </ul>
	 */
	public static final MMCode mmDES112 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DES112";
			definition = "Data encryption standard key of 112 bits (without the parity bits).";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "EDE3";
		}
	};
	/**
	 * DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI
	 * X9.24-2009 Annex A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKP9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDUKPT2009 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DUKPT2009";
			definition = "DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "DKP9";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) encryption with a 192 bits
	 * cryptographic key as defined by the Federal Information Processing
	 * Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AES9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAES192 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192";
			definition = "AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "AES9";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) encryption with a 256 bits
	 * cryptographic key as defined by the Federal Information Processing
	 * Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AES5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAES256 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256";
			definition = "AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "AES5";
		}
	};
	/**
	 * Data encryption standard key of 168 bits (without the parity bits).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDE4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data encryption standard key of 168 bits (without the parity bits)."</li>
	 * </ul>
	 */
	public static final MMCode mmDES168 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168";
			definition = "Data encryption standard key of 168 bits (without the parity bits).";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "EDE4";
		}
	};
	/**
	 * Key used to protect application information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Application"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key used to protect application information."</li>
	 * </ul>
	 */
	public static final MMCode mmApplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Application";
			definition = "Key used to protect application information.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "APPL";
		}
	};
	/**
	 * Any cryptographic key that can be downloaded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DYNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dynamic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any cryptographic key that can be downloaded."</li>
	 * </ul>
	 */
	public static final MMCode mmDynamic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dynamic";
			definition = "Any cryptographic key that can be downloaded.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "DYNC";
		}
	};
	/**
	 * Key used to protect data in the messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DATA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Data"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key used to protect data in the messages."</li>
	 * </ul>
	 */
	public static final MMCode mmData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Data";
			definition = "Key used to protect data in the messages.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "DATA";
		}
	};
	/**
	 * Key used to encrypt other keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KENC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key used to encrypt other keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyEncryption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryption";
			definition = "Key used to encrypt other keys.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "KENC";
		}
	};
	/**
	 * Temporary key used to download keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRKG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Working"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Temporary key used to download keys."</li>
	 * </ul>
	 */
	public static final MMCode mmWorking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Working";
			definition = "Temporary key used to download keys.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "WRKG";
		}
	};
	/**
	 * Key used to encrypt a PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key used to encrypt a PIN."</li>
	 * </ul>
	 */
	public static final MMCode mmPIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PIN";
			definition = "Key used to encrypt a PIN.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "PINK";
		}
	};
	/**
	 * Key used to generate the MAC of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
	 * CryptographicKeyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key used to generate the MAC of a message."</li>
	 * </ul>
	 */
	public static final MMCode mmMAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Key used to generate the MAC of a message.";
			owner_lazy = () -> CryptographicKeyTypeCode.mmObject();
			codeName = "MACK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("DESC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CryptographicKeyTypeCode";
				definition = "Type of algorithm used by the cryptographic key.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmDES, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmAES,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmRSA, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmECC, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmAES128,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmDES112, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmDUKPT2009, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmAES192,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmAES256, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmDES168, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmApplication,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmDynamic, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmData, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmKeyEncryption,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmWorking, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmPIN, com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmMAC);
				derivation_lazy = () -> Arrays.asList(CryptographicKeyType1Code.mmObject(), CryptographicKeyType2Code.mmObject(), CryptographicKeyType3Code.mmObject(), CryptographicKeyType4Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}