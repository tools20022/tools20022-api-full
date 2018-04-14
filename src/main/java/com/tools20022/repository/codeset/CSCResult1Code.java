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
import com.tools20022.repository.codeset.CSCResult1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Result of the printed CSC (Card Security Code) validation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCMatch
 * CSCResult1Code.CSCMatch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCNoMatch
 * CSCResult1Code.CSCNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCTechnical
 * CSCResult1Code.CSCTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCNotTechnical
 * CSCResult1Code.CSCNotTechnical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCMissing
 * CSCResult1Code.CSCMissing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCResult1Code#CSCNotUsed
 * CSCResult1Code.CSCNotUsed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CSCResultCode CSCResultCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CSCResult1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the printed CSC (Card Security Code) validation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CMCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCResult1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCMatch = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCNoMatch = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCNoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCNoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCTechnical = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNotTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCNotTechnical = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCNotTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCNotTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCMissing = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CSCResult1Code CSCNotUsed = new CSCResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CSCResult1Code.mmObject();
			codeName = CSCResultCode.CSCNotUsed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CSCResult1Code> codesByName = new LinkedHashMap<>();

	protected CSCResult1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CMCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCResult1Code";
				definition = "Result of the printed CSC (Card Security Code) validation.";
				trace_lazy = () -> CSCResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCResult1Code.CSCMatch, com.tools20022.repository.codeset.CSCResult1Code.CSCNoMatch, com.tools20022.repository.codeset.CSCResult1Code.CSCTechnical,
						com.tools20022.repository.codeset.CSCResult1Code.CSCNotTechnical, com.tools20022.repository.codeset.CSCResult1Code.CSCMissing, com.tools20022.repository.codeset.CSCResult1Code.CSCNotUsed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CSCMatch.getCodeName().get(), CSCMatch);
		codesByName.put(CSCNoMatch.getCodeName().get(), CSCNoMatch);
		codesByName.put(CSCTechnical.getCodeName().get(), CSCTechnical);
		codesByName.put(CSCNotTechnical.getCodeName().get(), CSCNotTechnical);
		codesByName.put(CSCMissing.getCodeName().get(), CSCMissing);
		codesByName.put(CSCNotUsed.getCodeName().get(), CSCNotUsed);
	}

	public static CSCResult1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCResult1Code[] values() {
		CSCResult1Code[] values = new CSCResult1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCResult1Code> {
		@Override
		public CSCResult1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCResult1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}