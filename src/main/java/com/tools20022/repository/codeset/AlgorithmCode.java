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
 * Identification of the MAC algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#RetailCBCMAC
 * AlgorithmCode.RetailCBCMAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#RetailSHA256MAC
 * AlgorithmCode.RetailSHA256MAC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#UKPT
 * AlgorithmCode.UKPT}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DUKPT
 * AlgorithmCode.DUKPT}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DES112CBC
 * AlgorithmCode.DES112CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA256
 * AlgorithmCode.SHA256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA256WithRSA
 * AlgorithmCode.SHA256WithRSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#RSAEncryption
 * AlgorithmCode.RSAEncryption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES128CBC
 * AlgorithmCode.AES128CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DUKPT2009
 * AlgorithmCode.DUKPT2009}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#UKPTwithAES128
 * AlgorithmCode.UKPTwithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA256CMACwithAES128
 * AlgorithmCode.SHA256CMACwithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA256CMACwithDES112
 * AlgorithmCode.SHA256CMACwithDES112}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA384
 * AlgorithmCode.SHA384}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA512
 * AlgorithmCode.SHA512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#RSAESOAEP
 * AlgorithmCode.RSAESOAEP}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#MGF1
 * AlgorithmCode.MGF1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA1
 * AlgorithmCode.SHA1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#RetailSHA1MAC
 * AlgorithmCode.RetailSHA1MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA384CMACwithAES192
 * AlgorithmCode.SHA384CMACwithAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA512CMACwithAES256
 * AlgorithmCode.SHA512CMACwithAES256}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES256CBC
 * AlgorithmCode.AES256CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES192CBC
 * AlgorithmCode.AES192CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA1WithRSA
 * AlgorithmCode.SHA1WithRSA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#RSASSAPSS
 * AlgorithmCode.RSASSAPSS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm1Code
 * Algorithm1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm7Code
 * Algorithm7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm5Code
 * Algorithm5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm8Code
 * Algorithm8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code
 * Algorithm2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm3Code
 * Algorithm3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm4Code
 * Algorithm4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm6Code
 * Algorithm6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm9Code
 * Algorithm9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm10Code
 * Algorithm10Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm11Code
 * Algorithm11Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm14Code
 * Algorithm14Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm12Code
 * Algorithm12Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm15Code
 * Algorithm15Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm13Code
 * Algorithm13Code}</li>
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
 * <li>"MACC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlgorithmCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the MAC algorithm."</li>
 * </ul>
 */
public class AlgorithmCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf.
	 * ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailCBCMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RetailCBCMAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailCBCMAC";
			definition = "Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "MACC";
		}
	};
	/**
	 * Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object
	 * Identifier: id-retail-cbc-mac-sha-256).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA256MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail-CBC-MAC with SHA-256 (Secure HAsh standard)  - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RetailSHA256MAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailSHA256MAC";
			definition = "Retail-CBC-MAC with SHA-256 (Secure HAsh standard)  - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "MCCS";
		}
	};
	/**
	 * UKPT (Unique Key Per Transaction) or Master Session Key key encryption -
	 * (ASN.1 Object Identifier: id-ukpt-wrap).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UKPT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UKPT";
			definition = "UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "UKPT";
		}
	};
	/**
	 * DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in
	 * ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006. - (ASN.1 Object
	 * Identifier: id-dukpt-wrap).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006.  - (ASN.1 Object Identifier: id-dukpt-wrap)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DUKPT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DUKPT";
			definition = "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006.  - (ASN.1 Object Identifier: id-dukpt-wrap).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "DKPT";
		}
	};
	/**
	 * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher)
	 * encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 -
	 * (ASN.1 Object Identifier: des-ede3-cbc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "E3DC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DES112CBC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DES112CBC";
			definition = "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "E3DC";
		}
	};
	/**
	 * Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1
	 * Object Identifier: id-sha256).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HS25"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA256 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA256";
			definition = "Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "HS25";
		}
	};
	/**
	 * Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1
	 * Object Identifier: sha256WithRSAEncryption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA256WithRSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA256WithRSA";
			definition = "Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "ERS2";
		}
	};
	/**
	 * RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSAEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption)."</li>
	 * </ul>
	 */
	public static final MMCode RSAEncryption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RSAEncryption";
			definition = "RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "ERSA";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption
	 * with a 128 bits cryptographic key as defined by the Federal Information
	 * Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption
	 * Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA2C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AES128CBC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AES128CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "EA2C";
		}
	};
	/**
	 * DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in
	 * ANSI X9.24-2009 Annex A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
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
	 * "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DUKPT2009 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DUKPT2009";
			definition = "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "DKP9";
		}
	};
	/**
	 * UKPT (Unique Key Per Transaction) or Master Session Key key encryption,
	 * using Advanced Encryption Standard with a 128 bits cryptographic key,
	 * approved by the Federal Information Processing Standards (FIPS 197 -
	 * November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKA1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPTwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UKPTwithAES128 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UKPTwithAES128";
			definition = "UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "UKA1";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 128 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA-256 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMA1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA256CMACwithAES128 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA256CMACwithAES128";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "CMA1";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Triple DES with a double length key (112 Bit) as defined
	 * in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMD1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithDES112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Triple DES with a double length key (112 Bit) as defined in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA256CMACwithDES112 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA256CMACwithDES112";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Triple DES with a double length key (112 Bit) as defined in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of the message.";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "CMD1";
		}
	};
	/**
	 * Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1
	 * Object Identifier: id-sha384).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HS38"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA384 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA384";
			definition = "Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "HS38";
		}
	};
	/**
	 * Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1
	 * Object Identifier: id-sha512).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HS51"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA512 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SHA512";
			definition = "Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "HS51";
		}
	};
	/**
	 * RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS
	 * #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSAES-OAEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RSAESOAEP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RSAES-OAEP";
			definition = "RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "RSAO";
		}
	};
	/**
	 * Generator Function, used for RSA encryption and RSA igital signature
	 * (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-mgf1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGF1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MGF1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generator Function, used for RSA encryption and RSA igital signature (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-mgf1)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MGF1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MGF1";
			definition = "Generator Function, used for RSA encryption and RSA igital signature (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-mgf1).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "MGF1";
		}
	};
	/**
	 * Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object
	 * Identifier: id-sha1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HS01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object Identifier: id-sha1)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1";
			definition = "Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object Identifier: id-sha1).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "HS01";
		}
	};
	/**
	 * Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object
	 * Identifier: id-retail-cbc-mac-sha-1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCC1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA1MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RetailSHA1MAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA1MAC";
			definition = "Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "MCC1";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 192 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA-384 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMA9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384CMACwithAES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA384CMACwithAES192 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384CMACwithAES192";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message.";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "CMA9";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 256 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA-512 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMA5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512CMACwithAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA512CMACwithAES256 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512CMACwithAES256";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message.";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "CMA5";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption
	 * with a 256 bits cryptographic key as defined by the Federal Information
	 * Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption
	 * Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA5C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AES256CBC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "EA5C";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption
	 * with a 192 bits cryptographic key as defined by the Federal Information
	 * Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption
	 * Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA9C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AES192CBC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "EA9C";
		}
	};
	/**
	 * Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest
	 * algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERS1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SHA1WithRSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1WithRSA";
			definition = "Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "ERS1";
		}
	};
	/**
	 * Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS
	 * #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSASSA-PSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RSASSAPSS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RSASSA-PSS";
			definition = "Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS).";
			owner_lazy = () -> AlgorithmCode.mmObject();
			codeName = "RPSS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MACC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AlgorithmCode";
				definition = "Identification of the MAC algorithm.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AlgorithmCode.RetailCBCMAC, com.tools20022.repository.codeset.AlgorithmCode.RetailSHA256MAC, com.tools20022.repository.codeset.AlgorithmCode.UKPT,
						com.tools20022.repository.codeset.AlgorithmCode.DUKPT, com.tools20022.repository.codeset.AlgorithmCode.DES112CBC, com.tools20022.repository.codeset.AlgorithmCode.SHA256,
						com.tools20022.repository.codeset.AlgorithmCode.SHA256WithRSA, com.tools20022.repository.codeset.AlgorithmCode.RSAEncryption, com.tools20022.repository.codeset.AlgorithmCode.AES128CBC,
						com.tools20022.repository.codeset.AlgorithmCode.DUKPT2009, com.tools20022.repository.codeset.AlgorithmCode.UKPTwithAES128, com.tools20022.repository.codeset.AlgorithmCode.SHA256CMACwithAES128,
						com.tools20022.repository.codeset.AlgorithmCode.SHA256CMACwithDES112, com.tools20022.repository.codeset.AlgorithmCode.SHA384, com.tools20022.repository.codeset.AlgorithmCode.SHA512,
						com.tools20022.repository.codeset.AlgorithmCode.RSAESOAEP, com.tools20022.repository.codeset.AlgorithmCode.MGF1, com.tools20022.repository.codeset.AlgorithmCode.SHA1,
						com.tools20022.repository.codeset.AlgorithmCode.RetailSHA1MAC, com.tools20022.repository.codeset.AlgorithmCode.SHA384CMACwithAES192, com.tools20022.repository.codeset.AlgorithmCode.SHA512CMACwithAES256,
						com.tools20022.repository.codeset.AlgorithmCode.AES256CBC, com.tools20022.repository.codeset.AlgorithmCode.AES192CBC, com.tools20022.repository.codeset.AlgorithmCode.SHA1WithRSA,
						com.tools20022.repository.codeset.AlgorithmCode.RSASSAPSS);
				derivation_lazy = () -> Arrays.asList(Algorithm1Code.mmObject(), Algorithm7Code.mmObject(), Algorithm5Code.mmObject(), Algorithm8Code.mmObject(), Algorithm2Code.mmObject(), Algorithm3Code.mmObject(),
						Algorithm4Code.mmObject(), Algorithm6Code.mmObject(), Algorithm9Code.mmObject(), Algorithm10Code.mmObject(), Algorithm11Code.mmObject(), Algorithm14Code.mmObject(), Algorithm12Code.mmObject(),
						Algorithm15Code.mmObject(), Algorithm13Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}