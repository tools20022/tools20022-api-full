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
import com.tools20022.repository.codeset.Algorithm19Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for digital signatures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SHA256WithRSA
 * Algorithm19Code.SHA256WithRSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SHA1WithRSA
 * Algorithm19Code.SHA1WithRSA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm19Code#RSASSAPSS
 * Algorithm19Code.RSASSAPSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#EllipticCryptographicCurveFifthAlgortihm
 * Algorithm19Code.EllipticCryptographicCurveFifthAlgortihm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#EllipticCryptographicCurveFirstAlgorithm
 * Algorithm19Code.EllipticCryptographicCurveFirstAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#EllipticCryptographicCurveFourthAlgorithm
 * Algorithm19Code.EllipticCryptographicCurveFourthAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#EllipticCryptographicCurveSecondAlgorithm
 * Algorithm19Code.EllipticCryptographicCurveSecondAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#EllipticCryptographicCurveThirdAlgorithm
 * Algorithm19Code.EllipticCryptographicCurveThirdAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SHA3256WithRSA
 * Algorithm19Code.SHA3256WithRSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SignatureWithEllipticCurveP256
 * Algorithm19Code.SignatureWithEllipticCurveP256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SignatureWithEllipticCurveP384
 * Algorithm19Code.SignatureWithEllipticCurveP384}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code#SignatureWithEllipticCurveP512
 * Algorithm19Code.SignatureWithEllipticCurveP512}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ERS2"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm19Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic algorithms for digital signatures."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code
 * Algorithm14Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm19Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code#SHA256WithRSA
	 * Algorithm14Code.SHA256WithRSA}</li>
	 * </ul>
	 */
	public static final Algorithm19Code SHA256WithRSA = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256WithRSA";
			previousVersion_lazy = () -> Algorithm14Code.SHA256WithRSA;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SHA256WithRSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1WithRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code#SHA1WithRSA
	 * Algorithm14Code.SHA1WithRSA}</li>
	 * </ul>
	 */
	public static final Algorithm19Code SHA1WithRSA = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1WithRSA";
			previousVersion_lazy = () -> Algorithm14Code.SHA1WithRSA;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SHA1WithRSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RSASSA-PSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code#RSASSAPSS
	 * Algorithm14Code.RSASSAPSS}</li>
	 * </ul>
	 */
	public static final Algorithm19Code RSASSAPSS = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RSASSA-PSS";
			previousVersion_lazy = () -> Algorithm14Code.RSASSAPSS;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.RSASSAPSS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFifthAlgortihm"</li>
	 * </ul>
	 */
	public static final Algorithm19Code EllipticCryptographicCurveFifthAlgortihm = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFifthAlgortihm";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.EllipticCryptographicCurveFifthAlgortihm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFirstAlgorithm"</li>
	 * </ul>
	 */
	public static final Algorithm19Code EllipticCryptographicCurveFirstAlgorithm = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFirstAlgorithm";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.EllipticCryptographicCurveFirstAlgorithm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveFourthAlgorithm"</li>
	 * </ul>
	 */
	public static final Algorithm19Code EllipticCryptographicCurveFourthAlgorithm = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveFourthAlgorithm";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.EllipticCryptographicCurveFourthAlgorithm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveSecondAlgorithm"</li>
	 * </ul>
	 */
	public static final Algorithm19Code EllipticCryptographicCurveSecondAlgorithm = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveSecondAlgorithm";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.EllipticCryptographicCurveSecondAlgorithm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EllipticCryptographicCurveThirdAlgorithm"</li>
	 * </ul>
	 */
	public static final Algorithm19Code EllipticCryptographicCurveThirdAlgorithm = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EllipticCryptographicCurveThirdAlgorithm";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.EllipticCryptographicCurveThirdAlgorithm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256WithRSA"</li>
	 * </ul>
	 */
	public static final Algorithm19Code SHA3256WithRSA = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256WithRSA";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SHA3256WithRSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-256"</li>
	 * </ul>
	 */
	public static final Algorithm19Code SignatureWithEllipticCurveP256 = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SignatureWithEllipticCurveP256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-384"</li>
	 * </ul>
	 */
	public static final Algorithm19Code SignatureWithEllipticCurveP384 = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-384";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SignatureWithEllipticCurveP384.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm19Code
	 * Algorithm19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureWithEllipticCurveP-512"</li>
	 * </ul>
	 */
	public static final Algorithm19Code SignatureWithEllipticCurveP512 = new Algorithm19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureWithEllipticCurveP-512";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm19Code.mmObject();
			codeName = AlgorithmCode.SignatureWithEllipticCurveP512.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm19Code> codesByName = new LinkedHashMap<>();

	protected Algorithm19Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ERS2");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm19Code";
				definition = "Cryptographic algorithms for digital signatures.";
				previousVersion_lazy = () -> Algorithm14Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm19Code.SHA256WithRSA, com.tools20022.repository.codeset.Algorithm19Code.SHA1WithRSA, com.tools20022.repository.codeset.Algorithm19Code.RSASSAPSS,
						com.tools20022.repository.codeset.Algorithm19Code.EllipticCryptographicCurveFifthAlgortihm, com.tools20022.repository.codeset.Algorithm19Code.EllipticCryptographicCurveFirstAlgorithm,
						com.tools20022.repository.codeset.Algorithm19Code.EllipticCryptographicCurveFourthAlgorithm, com.tools20022.repository.codeset.Algorithm19Code.EllipticCryptographicCurveSecondAlgorithm,
						com.tools20022.repository.codeset.Algorithm19Code.EllipticCryptographicCurveThirdAlgorithm, com.tools20022.repository.codeset.Algorithm19Code.SHA3256WithRSA,
						com.tools20022.repository.codeset.Algorithm19Code.SignatureWithEllipticCurveP256, com.tools20022.repository.codeset.Algorithm19Code.SignatureWithEllipticCurveP384,
						com.tools20022.repository.codeset.Algorithm19Code.SignatureWithEllipticCurveP512);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SHA256WithRSA.getCodeName().get(), SHA256WithRSA);
		codesByName.put(SHA1WithRSA.getCodeName().get(), SHA1WithRSA);
		codesByName.put(RSASSAPSS.getCodeName().get(), RSASSAPSS);
		codesByName.put(EllipticCryptographicCurveFifthAlgortihm.getCodeName().get(), EllipticCryptographicCurveFifthAlgortihm);
		codesByName.put(EllipticCryptographicCurveFirstAlgorithm.getCodeName().get(), EllipticCryptographicCurveFirstAlgorithm);
		codesByName.put(EllipticCryptographicCurveFourthAlgorithm.getCodeName().get(), EllipticCryptographicCurveFourthAlgorithm);
		codesByName.put(EllipticCryptographicCurveSecondAlgorithm.getCodeName().get(), EllipticCryptographicCurveSecondAlgorithm);
		codesByName.put(EllipticCryptographicCurveThirdAlgorithm.getCodeName().get(), EllipticCryptographicCurveThirdAlgorithm);
		codesByName.put(SHA3256WithRSA.getCodeName().get(), SHA3256WithRSA);
		codesByName.put(SignatureWithEllipticCurveP256.getCodeName().get(), SignatureWithEllipticCurveP256);
		codesByName.put(SignatureWithEllipticCurveP384.getCodeName().get(), SignatureWithEllipticCurveP384);
		codesByName.put(SignatureWithEllipticCurveP512.getCodeName().get(), SignatureWithEllipticCurveP512);
	}

	public static Algorithm19Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm19Code[] values() {
		Algorithm19Code[] values = new Algorithm19Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm19Code> {
		@Override
		public Algorithm19Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm19Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}