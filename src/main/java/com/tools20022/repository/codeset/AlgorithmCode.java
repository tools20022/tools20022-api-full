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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AlgorithmCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#EllipticCryptographicCurveFirstAlgorithm
 * AlgorithmCode.EllipticCryptographicCurveFirstAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#EllipticCryptographicCurveSecondAlgorithm
 * AlgorithmCode.EllipticCryptographicCurveSecondAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#EllipticCryptographicCurveThirdAlgorithm
 * AlgorithmCode.EllipticCryptographicCurveThirdAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#EllipticCryptographicCurveFourthAlgorithm
 * AlgorithmCode.EllipticCryptographicCurveFourthAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#EllipticCryptographicCurveFifthAlgortihm
 * AlgorithmCode.EllipticCryptographicCurveFifthAlgortihm}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3224
 * AlgorithmCode.SHA3224}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3256
 * AlgorithmCode.SHA3256}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3384
 * AlgorithmCode.SHA3384}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3512
 * AlgorithmCode.SHA3512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHAKE128
 * AlgorithmCode.SHAKE128}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHAKE256
 * AlgorithmCode.SHAKE256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA256CMACWithAES256
 * AlgorithmCode.SHA256CMACWithAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3256CMACWithAES128
 * AlgorithmCode.SHA3256CMACWithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3384CMACWithAES192
 * AlgorithmCode.SHA3384CMACWithAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3512CMACWithAES256
 * AlgorithmCode.SHA3512CMACWithAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA3256WithRSA
 * AlgorithmCode.SHA3256WithRSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SHA32563DESMAC
 * AlgorithmCode.SHA32563DESMAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#AESDUKPT128ECB
 * AlgorithmCode.AESDUKPT128ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#AESDUKPT256ECB
 * AlgorithmCode.AESDUKPT256ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#AESDUKPT192ECB
 * AlgorithmCode.AESDUKPT192ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#Nist800108KeyDerivation
 * AlgorithmCode.Nist800108KeyDerivation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES128CTR
 * AlgorithmCode.AES128CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES192CTR
 * AlgorithmCode.AES192CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#AES256CTR
 * AlgorithmCode.AES256CTR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SignatureWithEllipticCurveP256
 * AlgorithmCode.SignatureWithEllipticCurveP256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SignatureWithEllipticCurveP384
 * AlgorithmCode.SignatureWithEllipticCurveP384}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode#SignatureWithEllipticCurveP512
 * AlgorithmCode.SignatureWithEllipticCurveP512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DES112CTR
 * AlgorithmCode.DES112CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DES168CBC
 * AlgorithmCode.DES168CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#DES168CTR
 * AlgorithmCode.DES168CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#SDE056CBC
 * AlgorithmCode.SDE056CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#CMACAES128
 * AlgorithmCode.CMACAES128}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#CMACAES192
 * AlgorithmCode.CMACAES192}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AlgorithmCode#CMACAES256
 * AlgorithmCode.CMACAES256}</li>
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
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code
 * Algorithm16Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm17Code
 * Algorithm17Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code
 * Algorithm18Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm19Code
 * Algorithm19Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlgorithmCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the MAC algorithm."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AlgorithmCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailCBCMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=id-retail-cbc-mac</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RetailCBCMAC = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "id-retail-cbc-mac"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailCBCMAC";
			definition = "Retail CBC (Chaining Block Cypher) MAC (Message Authentication Code) (cf. ISO 9807, ANSI X9.19) - (ASN.1 Object Identifier: id-retail-cbc-mac).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA256MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1,
	 * value=id-retail-cbc-mac-sha-256</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RetailSHA256MAC = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "id-retail-cbc-mac-sha-256"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailSHA256MAC";
			definition = "Retail-CBC-MAC with SHA-256 (Secure HAsh standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-256).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=id-ukpt-wrap</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode UKPT = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "id-ukpt-wrap "}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UKPT";
			definition = "UKPT (Unique Key Per Transaction) or Master Session Key key encryption - (ASN.1 Object Identifier: id-ukpt-wrap).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006. - (ASN.1 Object Identifier: id-dukpt-wrap)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=id-dukpt-wrap</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DUKPT = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "id-dukpt-wrap"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUKPT";
			definition = "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2004, Annex A, and ISO/DIS 13492-2006. - (ASN.1 Object Identifier: id-dukpt-wrap).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=des-ede3-cbc</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DES112CBC = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "des-ede3-cbc"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DES112CBC";
			definition = "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=id-sha256</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA256 = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "id-sha256"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA256";
			definition = "Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1,
	 * value=sha256WithRSAEncryption</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA256WithRSA = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "sha256WithRSAEncryption"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA256WithRSA";
			definition = "Signature algorithms with RSA, using SHA-256 digest algorithm - (ASN.1 Object Identifier: sha256WithRSAEncryption).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSAEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ASN.1, value=rsaEncryption</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RSAEncryption = new AlgorithmCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ASN.1"}, new String[]{"value", "rsaEncryption"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RSAEncryption";
			definition = "RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES128CBC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AES128CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DUKPT2009 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUKPT2009";
			definition = "DUKPT (Derived Unique Key Per Transaction) algorithm, as specified in ANSI X9.24-2009 Annex A.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPTwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode UKPTwithAES128 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UKPTwithAES128";
			definition = "UKPT (Unique Key Per Transaction) or Master Session Key key encryption, using Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA256CMACwithAES128 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA256CMACwithAES128";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithDES112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Triple DES with a double length key (112 Bit) as defined in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA256CMACwithDES112 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA256CMACwithDES112";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Triple DES with a double length key (112 Bit) as defined in FIPS PUB 46-3. The CMAC algorithm is computed on the SHA-256 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA384 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA384";
			definition = "Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA512 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SHA512";
			definition = "Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSAES-OAEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RSAESOAEP = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RSAES-OAEP";
			definition = "RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MGF1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generator Function, used for RSA encryption and RSA igital signature (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-mgf1)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode MGF1 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MGF1";
			definition = "Generator Function, used for RSA encryption and RSA igital signature (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-mgf1).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "MGF1";
		}
	};
	/**
	 * The DEPRECATED Message digest algorithm SHA-1 as defined in FIPS 180-1 -
	 * (ASN.1 Object Identifier: id-sha1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HS01"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DEPRECATED Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object Identifier: id-sha1)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA1 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1";
			definition = "The DEPRECATED Message digest algorithm SHA-1 as defined in FIPS 180-1 - (ASN.1 Object Identifier: id-sha1).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "HS01";
		}
	};
	/**
	 * The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1
	 * Object Identifier: id-retail-cbc-mac-sha-1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCC1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA1MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RetailSHA1MAC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA1MAC";
			definition = "The DEPRECATED Retail-CBC-MAC with SHA-1 (Secure Hash standard) - (ASN.1 Object Identifier: id-retail-cbc-mac-sha-1).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384CMACwithAES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA384CMACwithAES192 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384CMACwithAES192";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-384 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512CMACwithAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA512CMACwithAES256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512CMACwithAES256";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-512 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES256CBC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES192CBC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192CBC";
			definition = "AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "EA9C";
		}
	};
	/**
	 * The DEPRECATED Signature algorithms with RSA (PKCS #1 version 2.1), using
	 * SHA-1 digest algorithm - (ASN.1 Object Identifier:
	 * sha1WithRSAEncryption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERS1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DEPRECATED Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA1WithRSA = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1WithRSA";
			definition = "The DEPRECATED Signature algorithms with RSA (PKCS #1 version 2.1), using SHA-1 digest algorithm - (ASN.1 Object Identifier: sha1WithRSAEncryption).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSASSA-PSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode RSASSAPSS = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RSASSA-PSS";
			definition = "Signature algorithm with Appendix, Probabilistic Signature Scheme (PKCS #1 version 2.1), - (ASN.1 Object Identifier: id-RSASSA-PSS).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "RPSS";
		}
	};
	/**
	 * First Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECC1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFirstAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode EllipticCryptographicCurveFirstAlgorithm = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFirstAlgorithm";
			definition = "First Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECC1";
		}
	};
	/**
	 * Second Elliptic Cryptographic Curve Algorithm identified by EMVCo
	 * Nextgen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECC2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveSecondAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Second Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode EllipticCryptographicCurveSecondAlgorithm = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveSecondAlgorithm";
			definition = "Second Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECC2";
		}
	};
	/**
	 * Third Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECC3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveThirdAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Third Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode EllipticCryptographicCurveThirdAlgorithm = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveThirdAlgorithm";
			definition = "Third Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECC3";
		}
	};
	/**
	 * Fourth Elliptic Cryptographic Curve Algorithm identified by EMVCo
	 * Nextgen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECC4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFourthAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fourth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode EllipticCryptographicCurveFourthAlgorithm = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFourthAlgorithm";
			definition = "Fourth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECC4";
		}
	};
	/**
	 * Fifth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECC5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFifthAlgortihm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fifth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode EllipticCryptographicCurveFifthAlgortihm = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFifthAlgortihm";
			definition = "Fifth Elliptic Cryptographic Curve Algorithm identified by EMVCo Nextgen.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECC5";
		}
	};
	/**
	 * Message digest algorithm SHA3-224 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-sha3-224).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SH31"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-224"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA3-224 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-224)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3224 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-224";
			definition = "Message digest algorithm SHA3-224 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-224).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SH31";
		}
	};
	/**
	 * Message digest algorithm SHA3-256 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-sha3-256).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SH32"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA3-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-256)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256";
			definition = "Message digest algorithm SHA3-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-256).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SH32";
		}
	};
	/**
	 * Message digest algorithm SHA3-384 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-sha3-384).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SH33"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA3-384 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-384)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3384 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-384";
			definition = "Message digest algorithm SHA3-384 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-384).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SH33";
		}
	};
	/**
	 * Message digest algorithm SHA3-512 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-sha3-512).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SH35"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHA3-512 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-512)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3512 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-512";
			definition = "Message digest algorithm SHA3-512 as defined in FIPS 202 - (ASN.1 Object Identifier: id-sha3-512).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SH35";
		}
	};
	/**
	 * Message digest algorithm SHAKE-128 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-shake128).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHK1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHAKE128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHAKE-128 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake128)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHAKE128 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHAKE128";
			definition = "Message digest algorithm SHAKE-128 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake128).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SHK1";
		}
	};
	/**
	 * Message digest algorithm SHAKE-256 as defined in FIPS 202 - (ASN.1 Object
	 * Identifier: id-shake256).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHK2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHAKE256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest algorithm SHAKE-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake256)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHAKE256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHAKE256";
			definition = "Message digest algorithm SHAKE-256 as defined in FIPS 202 - (ASN.1 Object Identifier: id-shake256).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SHK2";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 256 bits
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
	 * "CMA2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACWithAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA256CMACWithAES256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256CMACWithAES256";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA-256 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CMA2";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 128 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA3-256 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CM31"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256CMACWithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-256 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3256CMACWithAES128 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256CMACWithAES128";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-256 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CM31";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 192 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA3-384 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CM32"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-384CMACWithAES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-384 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3384CMACWithAES192 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-384CMACWithAES192";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-384 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CM32";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 256 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * The CMAC algorithm is computed on the SHA3-512 digest of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CM33"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-512CMACWithAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-512 digest of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3512CMACWithAES256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-512CMACWithAES256";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard). The CMAC algorithm is computed on the SHA3-512 digest of the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CM33";
		}
	};
	/**
	 * Signature algorithms with RSA, using SHA3-256 digest algorithm. (ASN.1
	 * Object Identifier: id-rsassa-pkcs1-v1-5-with-sha3-256).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERS3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature algorithms with RSA, using SHA3-256 digest algorithm. (ASN.1 Object Identifier: id-rsassa-pkcs1-v1-5-with-sha3-256)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA3256WithRSA = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256WithRSA";
			definition = "Signature algorithms with RSA, using SHA3-256 digest algorithm. (ASN.1 Object Identifier: id-rsassa-pkcs1-v1-5-with-sha3-256).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ERS3";
		}
	};
	/**
	 * 3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method
	 * 2 padding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCS3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256-3DESMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method 2 padding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SHA32563DESMAC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256-3DESMAC";
			definition = "3DES CBC-MAC with SHA3-256 (SecureHAsh standard) and ISO/IEC9797-1 method 2 padding.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "MCS3";
		}
	};
	/**
	 * AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as
	 * specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DA12"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT128ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AESDUKPT128ECB = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT128ECB";
			definition = "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A, With key length of 128 bits.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "DA12";
		}
	};
	/**
	 * AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as
	 * specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DA25"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT256ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AESDUKPT256ECB = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT256ECB";
			definition = "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 256 bits.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "DA25";
		}
	};
	/**
	 * AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as
	 * specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DA19"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT192ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AESDUKPT192ECB = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT192ECB";
			definition = "AES DUKPT (Derived Unique Key Per Transaction) ECB algorithm, as specified in ANSI X9.24-3-2017 Annex A.With key length of 192 bits.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "DA19";
		}
	};
	/**
	 * Key Derivation according to the Special Publication from the NIST
	 * entitled 800-108.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "N108"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nist800-108KeyDerivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key Derivation according to the Special Publication from the NIST entitled 800-108."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode Nist800108KeyDerivation = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nist800-108KeyDerivation";
			definition = "Key Derivation according to the Special Publication from the NIST entitled 800-108.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "N108";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128
	 * bits cryptographic key as defined by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA2R"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES128CTR = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CTR";
			definition = "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "EA2R";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192
	 * bits cryptographic key as defined by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA9R"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES192CTR = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192CTR";
			definition = "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "EA9R";
		}
	};
	/**
	 * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256
	 * bits cryptographic key as defined by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EA5R"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode AES256CTR = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256CTR";
			definition = "AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "EA5R";
		}
	};
	/**
	 * Elliptic Curve Signature with the Curve P-256 as defined by the Federal
	 * Information Processing Standards (FIPS 186-4 - July, 2013 - Digital
	 * Signature Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECP2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elliptic Curve Signature with the Curve P-256 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SignatureWithEllipticCurveP256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-256";
			definition = "Elliptic Curve Signature with the Curve P-256 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECP2";
		}
	};
	/**
	 * Elliptic Curve Signature with the Curve P-384 as defined by the Federal
	 * Information Processing Standards (FIPS 186-4 - July, 2013 - Digital
	 * Signature Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECP3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elliptic Curve Signature with the Curve P-384 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SignatureWithEllipticCurveP384 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-384";
			definition = "Elliptic Curve Signature with the Curve P-384 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECP3";
		}
	};
	/**
	 * Elliptic Curve Signature with the Curve P-512 as defined by the Federal
	 * Information Processing Standards (FIPS 186-4 - July, 2013 - Digital
	 * Signature Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECP5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elliptic Curve Signature with the Curve P-512 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SignatureWithEllipticCurveP512 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-512";
			definition = "Elliptic Curve Signature with the Curve P-512 as defined by the Federal Information Processing Standards (FIPS 186-4 - July, 2013 - Digital Signature Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "ECP5";
		}
	};
	/**
	 * Triple DES (Data Encryption Standard) CTR (Counter) encryption with
	 * double length key (112 Bit) as defined in FIPS SP 800-38a.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "E3DR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DES112CTR = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CTR";
			definition = "Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "E3DR";
		}
	};
	/**
	 * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher)
	 * encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 -
	 * (ASN.1 Object Identifier: des-ede3-cbc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "E36C"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DES168CBC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168CBC";
			definition = "Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "E36C";
		}
	};
	/**
	 * Triple DES (Data Encryption Standard) CTR (Counter) encryption with
	 * triple length key (168 Bit) as defined in FIPS SP 800-38a.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "E36R"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode DES168CTR = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168CTR";
			definition = "Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "E36R";
		}
	};
	/**
	 * The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block
	 * Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB
	 * 81 - (ASN.1 Object Identifier: des-cbc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SD5C"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SDE056CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode SDE056CBC = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SDE056CBC";
			definition = "The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "SD5C";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 128 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCA1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode CMACAES128 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES128";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 128 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CCA1";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 192 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCA2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode CMACAES192 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES192";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 192 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CCA2";
		}
	};
	/**
	 * CMAC (Cipher based Message Authentication Code) defined by the National
	 * Institute of Standards and Technology (NIST 800-38B - May 2005), using
	 * the block cipher Advanced Encryption Standard with a 256 bits
	 * cryptographic key, approved by the Federal Information Processing
	 * Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode
	 * AlgorithmCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCA3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AlgorithmCode CMACAES256 = new AlgorithmCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES256";
			definition = "CMAC (Cipher based Message Authentication Code) defined by the National Institute of Standards and Technology (NIST 800-38B - May 2005), using the block cipher Advanced Encryption Standard with a 256 bits cryptographic key, approved by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).";
			owner_lazy = () -> com.tools20022.repository.codeset.AlgorithmCode.mmObject();
			codeName = "CCA3";
		}
	};
	final static private LinkedHashMap<String, AlgorithmCode> codesByName = new LinkedHashMap<>();

	protected AlgorithmCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MACC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmCode";
				definition = "Identification of the MAC algorithm.";
				derivation_lazy = () -> Arrays.asList(Algorithm1Code.mmObject(), Algorithm7Code.mmObject(), Algorithm5Code.mmObject(), Algorithm8Code.mmObject(), Algorithm2Code.mmObject(), Algorithm3Code.mmObject(),
						Algorithm4Code.mmObject(), Algorithm6Code.mmObject(), Algorithm9Code.mmObject(), Algorithm10Code.mmObject(), Algorithm11Code.mmObject(), Algorithm14Code.mmObject(), Algorithm12Code.mmObject(),
						Algorithm15Code.mmObject(), Algorithm13Code.mmObject(), Algorithm16Code.mmObject(), Algorithm17Code.mmObject(), Algorithm18Code.mmObject(), Algorithm19Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AlgorithmCode.RetailCBCMAC, com.tools20022.repository.codeset.AlgorithmCode.RetailSHA256MAC, com.tools20022.repository.codeset.AlgorithmCode.UKPT,
						com.tools20022.repository.codeset.AlgorithmCode.DUKPT, com.tools20022.repository.codeset.AlgorithmCode.DES112CBC, com.tools20022.repository.codeset.AlgorithmCode.SHA256,
						com.tools20022.repository.codeset.AlgorithmCode.SHA256WithRSA, com.tools20022.repository.codeset.AlgorithmCode.RSAEncryption, com.tools20022.repository.codeset.AlgorithmCode.AES128CBC,
						com.tools20022.repository.codeset.AlgorithmCode.DUKPT2009, com.tools20022.repository.codeset.AlgorithmCode.UKPTwithAES128, com.tools20022.repository.codeset.AlgorithmCode.SHA256CMACwithAES128,
						com.tools20022.repository.codeset.AlgorithmCode.SHA256CMACwithDES112, com.tools20022.repository.codeset.AlgorithmCode.SHA384, com.tools20022.repository.codeset.AlgorithmCode.SHA512,
						com.tools20022.repository.codeset.AlgorithmCode.RSAESOAEP, com.tools20022.repository.codeset.AlgorithmCode.MGF1, com.tools20022.repository.codeset.AlgorithmCode.SHA1,
						com.tools20022.repository.codeset.AlgorithmCode.RetailSHA1MAC, com.tools20022.repository.codeset.AlgorithmCode.SHA384CMACwithAES192, com.tools20022.repository.codeset.AlgorithmCode.SHA512CMACwithAES256,
						com.tools20022.repository.codeset.AlgorithmCode.AES256CBC, com.tools20022.repository.codeset.AlgorithmCode.AES192CBC, com.tools20022.repository.codeset.AlgorithmCode.SHA1WithRSA,
						com.tools20022.repository.codeset.AlgorithmCode.RSASSAPSS, com.tools20022.repository.codeset.AlgorithmCode.EllipticCryptographicCurveFirstAlgorithm,
						com.tools20022.repository.codeset.AlgorithmCode.EllipticCryptographicCurveSecondAlgorithm, com.tools20022.repository.codeset.AlgorithmCode.EllipticCryptographicCurveThirdAlgorithm,
						com.tools20022.repository.codeset.AlgorithmCode.EllipticCryptographicCurveFourthAlgorithm, com.tools20022.repository.codeset.AlgorithmCode.EllipticCryptographicCurveFifthAlgortihm,
						com.tools20022.repository.codeset.AlgorithmCode.SHA3224, com.tools20022.repository.codeset.AlgorithmCode.SHA3256, com.tools20022.repository.codeset.AlgorithmCode.SHA3384,
						com.tools20022.repository.codeset.AlgorithmCode.SHA3512, com.tools20022.repository.codeset.AlgorithmCode.SHAKE128, com.tools20022.repository.codeset.AlgorithmCode.SHAKE256,
						com.tools20022.repository.codeset.AlgorithmCode.SHA256CMACWithAES256, com.tools20022.repository.codeset.AlgorithmCode.SHA3256CMACWithAES128, com.tools20022.repository.codeset.AlgorithmCode.SHA3384CMACWithAES192,
						com.tools20022.repository.codeset.AlgorithmCode.SHA3512CMACWithAES256, com.tools20022.repository.codeset.AlgorithmCode.SHA3256WithRSA, com.tools20022.repository.codeset.AlgorithmCode.SHA32563DESMAC,
						com.tools20022.repository.codeset.AlgorithmCode.AESDUKPT128ECB, com.tools20022.repository.codeset.AlgorithmCode.AESDUKPT256ECB, com.tools20022.repository.codeset.AlgorithmCode.AESDUKPT192ECB,
						com.tools20022.repository.codeset.AlgorithmCode.Nist800108KeyDerivation, com.tools20022.repository.codeset.AlgorithmCode.AES128CTR, com.tools20022.repository.codeset.AlgorithmCode.AES192CTR,
						com.tools20022.repository.codeset.AlgorithmCode.AES256CTR, com.tools20022.repository.codeset.AlgorithmCode.SignatureWithEllipticCurveP256,
						com.tools20022.repository.codeset.AlgorithmCode.SignatureWithEllipticCurveP384, com.tools20022.repository.codeset.AlgorithmCode.SignatureWithEllipticCurveP512,
						com.tools20022.repository.codeset.AlgorithmCode.DES112CTR, com.tools20022.repository.codeset.AlgorithmCode.DES168CBC, com.tools20022.repository.codeset.AlgorithmCode.DES168CTR,
						com.tools20022.repository.codeset.AlgorithmCode.SDE056CBC, com.tools20022.repository.codeset.AlgorithmCode.CMACAES128, com.tools20022.repository.codeset.AlgorithmCode.CMACAES192,
						com.tools20022.repository.codeset.AlgorithmCode.CMACAES256);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RetailCBCMAC.getCodeName().get(), RetailCBCMAC);
		codesByName.put(RetailSHA256MAC.getCodeName().get(), RetailSHA256MAC);
		codesByName.put(UKPT.getCodeName().get(), UKPT);
		codesByName.put(DUKPT.getCodeName().get(), DUKPT);
		codesByName.put(DES112CBC.getCodeName().get(), DES112CBC);
		codesByName.put(SHA256.getCodeName().get(), SHA256);
		codesByName.put(SHA256WithRSA.getCodeName().get(), SHA256WithRSA);
		codesByName.put(RSAEncryption.getCodeName().get(), RSAEncryption);
		codesByName.put(AES128CBC.getCodeName().get(), AES128CBC);
		codesByName.put(DUKPT2009.getCodeName().get(), DUKPT2009);
		codesByName.put(UKPTwithAES128.getCodeName().get(), UKPTwithAES128);
		codesByName.put(SHA256CMACwithAES128.getCodeName().get(), SHA256CMACwithAES128);
		codesByName.put(SHA256CMACwithDES112.getCodeName().get(), SHA256CMACwithDES112);
		codesByName.put(SHA384.getCodeName().get(), SHA384);
		codesByName.put(SHA512.getCodeName().get(), SHA512);
		codesByName.put(RSAESOAEP.getCodeName().get(), RSAESOAEP);
		codesByName.put(MGF1.getCodeName().get(), MGF1);
		codesByName.put(SHA1.getCodeName().get(), SHA1);
		codesByName.put(RetailSHA1MAC.getCodeName().get(), RetailSHA1MAC);
		codesByName.put(SHA384CMACwithAES192.getCodeName().get(), SHA384CMACwithAES192);
		codesByName.put(SHA512CMACwithAES256.getCodeName().get(), SHA512CMACwithAES256);
		codesByName.put(AES256CBC.getCodeName().get(), AES256CBC);
		codesByName.put(AES192CBC.getCodeName().get(), AES192CBC);
		codesByName.put(SHA1WithRSA.getCodeName().get(), SHA1WithRSA);
		codesByName.put(RSASSAPSS.getCodeName().get(), RSASSAPSS);
		codesByName.put(EllipticCryptographicCurveFirstAlgorithm.getCodeName().get(), EllipticCryptographicCurveFirstAlgorithm);
		codesByName.put(EllipticCryptographicCurveSecondAlgorithm.getCodeName().get(), EllipticCryptographicCurveSecondAlgorithm);
		codesByName.put(EllipticCryptographicCurveThirdAlgorithm.getCodeName().get(), EllipticCryptographicCurveThirdAlgorithm);
		codesByName.put(EllipticCryptographicCurveFourthAlgorithm.getCodeName().get(), EllipticCryptographicCurveFourthAlgorithm);
		codesByName.put(EllipticCryptographicCurveFifthAlgortihm.getCodeName().get(), EllipticCryptographicCurveFifthAlgortihm);
		codesByName.put(SHA3224.getCodeName().get(), SHA3224);
		codesByName.put(SHA3256.getCodeName().get(), SHA3256);
		codesByName.put(SHA3384.getCodeName().get(), SHA3384);
		codesByName.put(SHA3512.getCodeName().get(), SHA3512);
		codesByName.put(SHAKE128.getCodeName().get(), SHAKE128);
		codesByName.put(SHAKE256.getCodeName().get(), SHAKE256);
		codesByName.put(SHA256CMACWithAES256.getCodeName().get(), SHA256CMACWithAES256);
		codesByName.put(SHA3256CMACWithAES128.getCodeName().get(), SHA3256CMACWithAES128);
		codesByName.put(SHA3384CMACWithAES192.getCodeName().get(), SHA3384CMACWithAES192);
		codesByName.put(SHA3512CMACWithAES256.getCodeName().get(), SHA3512CMACWithAES256);
		codesByName.put(SHA3256WithRSA.getCodeName().get(), SHA3256WithRSA);
		codesByName.put(SHA32563DESMAC.getCodeName().get(), SHA32563DESMAC);
		codesByName.put(AESDUKPT128ECB.getCodeName().get(), AESDUKPT128ECB);
		codesByName.put(AESDUKPT256ECB.getCodeName().get(), AESDUKPT256ECB);
		codesByName.put(AESDUKPT192ECB.getCodeName().get(), AESDUKPT192ECB);
		codesByName.put(Nist800108KeyDerivation.getCodeName().get(), Nist800108KeyDerivation);
		codesByName.put(AES128CTR.getCodeName().get(), AES128CTR);
		codesByName.put(AES192CTR.getCodeName().get(), AES192CTR);
		codesByName.put(AES256CTR.getCodeName().get(), AES256CTR);
		codesByName.put(SignatureWithEllipticCurveP256.getCodeName().get(), SignatureWithEllipticCurveP256);
		codesByName.put(SignatureWithEllipticCurveP384.getCodeName().get(), SignatureWithEllipticCurveP384);
		codesByName.put(SignatureWithEllipticCurveP512.getCodeName().get(), SignatureWithEllipticCurveP512);
		codesByName.put(DES112CTR.getCodeName().get(), DES112CTR);
		codesByName.put(DES168CBC.getCodeName().get(), DES168CBC);
		codesByName.put(DES168CTR.getCodeName().get(), DES168CTR);
		codesByName.put(SDE056CBC.getCodeName().get(), SDE056CBC);
		codesByName.put(CMACAES128.getCodeName().get(), CMACAES128);
		codesByName.put(CMACAES192.getCodeName().get(), CMACAES192);
		codesByName.put(CMACAES256.getCodeName().get(), CMACAES256);
	}

	public static AlgorithmCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AlgorithmCode[] values() {
		AlgorithmCode[] values = new AlgorithmCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AlgorithmCode> {
		@Override
		public AlgorithmCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AlgorithmCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}