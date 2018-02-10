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
import com.tools20022.repository.codeset.CryptographicKeyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of algorithm used by the cryptographic key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#DES
 * CryptographicKeyTypeCode.DES}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#AES
 * CryptographicKeyTypeCode.AES}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#RSA
 * CryptographicKeyTypeCode.RSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#ECC
 * CryptographicKeyTypeCode.ECC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#AES128
 * CryptographicKeyTypeCode.AES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#DES112
 * CryptographicKeyTypeCode.DES112}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#DUKPT2009
 * CryptographicKeyTypeCode.DUKPT2009}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#AES192
 * CryptographicKeyTypeCode.AES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#AES256
 * CryptographicKeyTypeCode.AES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#DES168
 * CryptographicKeyTypeCode.DES168}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#Application
 * CryptographicKeyTypeCode.Application}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#Dynamic
 * CryptographicKeyTypeCode.Dynamic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#Data
 * CryptographicKeyTypeCode.Data}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#KeyEncryption
 * CryptographicKeyTypeCode.KeyEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#Working
 * CryptographicKeyTypeCode.Working}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#PIN
 * CryptographicKeyTypeCode.PIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode#MAC
 * CryptographicKeyTypeCode.MAC}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CryptographicKeyTypeCode extends MMCode {

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
	public static final CryptographicKeyTypeCode DES = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DES";
			definition = "Data encryption standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode AES = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AES";
			definition = "Advanced encryption standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode RSA = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RSA";
			definition = "Rivest, Shamir and Adleman.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode ECC = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ECC";
			definition = "Elliptic-curve cryptography.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode AES128 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AES128";
			definition = "AES (Advanced Encryption Standard) 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode DES112 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DES112";
			definition = "Data encryption standard key of 112 bits (without the parity bits).";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode DUKPT2009 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUKPT2009";
			definition = "DUKPT (Derived Unique Key Per Transaction) key, as specified in ANSI X9.24-2009 Annex A.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode AES192 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192";
			definition = "AES (Advanced Encryption Standard) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode AES256 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256";
			definition = "AES (Advanced Encryption Standard) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode DES168 = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168";
			definition = "Data encryption standard key of 168 bits (without the parity bits).";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode Application = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Application";
			definition = "Key used to protect application information.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode Dynamic = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dynamic";
			definition = "Any cryptographic key that can be downloaded.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode Data = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Data";
			definition = "Key used to protect data in the messages.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode KeyEncryption = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryption";
			definition = "Key used to encrypt other keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode Working = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Working";
			definition = "Temporary key used to download keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode PIN = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PIN";
			definition = "Key used to encrypt a PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
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
	public static final CryptographicKeyTypeCode MAC = new CryptographicKeyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Key used to generate the MAC of a message.";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyTypeCode.mmObject();
			codeName = "MACK";
		}
	};
	final static private LinkedHashMap<String, CryptographicKeyTypeCode> codesByName = new LinkedHashMap<>();

	protected CryptographicKeyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DESC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKeyTypeCode";
				definition = "Type of algorithm used by the cryptographic key.";
				derivation_lazy = () -> Arrays.asList(CryptographicKeyType1Code.mmObject(), CryptographicKeyType2Code.mmObject(), CryptographicKeyType3Code.mmObject(), CryptographicKeyType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CryptographicKeyTypeCode.DES, com.tools20022.repository.codeset.CryptographicKeyTypeCode.AES, com.tools20022.repository.codeset.CryptographicKeyTypeCode.RSA,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.ECC, com.tools20022.repository.codeset.CryptographicKeyTypeCode.AES128, com.tools20022.repository.codeset.CryptographicKeyTypeCode.DES112,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.DUKPT2009, com.tools20022.repository.codeset.CryptographicKeyTypeCode.AES192, com.tools20022.repository.codeset.CryptographicKeyTypeCode.AES256,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.DES168, com.tools20022.repository.codeset.CryptographicKeyTypeCode.Application, com.tools20022.repository.codeset.CryptographicKeyTypeCode.Dynamic,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.Data, com.tools20022.repository.codeset.CryptographicKeyTypeCode.KeyEncryption, com.tools20022.repository.codeset.CryptographicKeyTypeCode.Working,
						com.tools20022.repository.codeset.CryptographicKeyTypeCode.PIN, com.tools20022.repository.codeset.CryptographicKeyTypeCode.MAC);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DES.getCodeName().get(), DES);
		codesByName.put(AES.getCodeName().get(), AES);
		codesByName.put(RSA.getCodeName().get(), RSA);
		codesByName.put(ECC.getCodeName().get(), ECC);
		codesByName.put(AES128.getCodeName().get(), AES128);
		codesByName.put(DES112.getCodeName().get(), DES112);
		codesByName.put(DUKPT2009.getCodeName().get(), DUKPT2009);
		codesByName.put(AES192.getCodeName().get(), AES192);
		codesByName.put(AES256.getCodeName().get(), AES256);
		codesByName.put(DES168.getCodeName().get(), DES168);
		codesByName.put(Application.getCodeName().get(), Application);
		codesByName.put(Dynamic.getCodeName().get(), Dynamic);
		codesByName.put(Data.getCodeName().get(), Data);
		codesByName.put(KeyEncryption.getCodeName().get(), KeyEncryption);
		codesByName.put(Working.getCodeName().get(), Working);
		codesByName.put(PIN.getCodeName().get(), PIN);
		codesByName.put(MAC.getCodeName().get(), MAC);
	}

	public static CryptographicKeyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CryptographicKeyTypeCode[] values() {
		CryptographicKeyTypeCode[] values = new CryptographicKeyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CryptographicKeyTypeCode> {
		@Override
		public CryptographicKeyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CryptographicKeyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}