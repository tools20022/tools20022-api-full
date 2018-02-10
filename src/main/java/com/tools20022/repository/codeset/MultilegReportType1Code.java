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
import com.tools20022.repository.codeset.MultilegReportType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the method of execution reporting requested by issuer of the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code#BySecurity
 * MultilegReportType1Code.BySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code#BySecurityAndLeg
 * MultilegReportType1Code.BySecurityAndLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code#ByInstrumentLeg
 * MultilegReportType1Code.ByInstrumentLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MultilegReportTypeCode
 * MultilegReportTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BYSE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MultilegReportType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the method of execution reporting requested by issuer of the order."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MultilegReportType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code
	 * MultilegReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BySecurity"</li>
	 * </ul>
	 */
	public static final MultilegReportType1Code BySecurity = new MultilegReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BySecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.MultilegReportType1Code.mmObject();
			codeName = MultilegReportTypeCode.BySecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code
	 * MultilegReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BySecurityAndLeg"</li>
	 * </ul>
	 */
	public static final MultilegReportType1Code BySecurityAndLeg = new MultilegReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BySecurityAndLeg";
			owner_lazy = () -> com.tools20022.repository.codeset.MultilegReportType1Code.mmObject();
			codeName = MultilegReportTypeCode.BySecurityAndLeg.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MultilegReportType1Code
	 * MultilegReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByInstrumentLeg"</li>
	 * </ul>
	 */
	public static final MultilegReportType1Code ByInstrumentLeg = new MultilegReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByInstrumentLeg";
			owner_lazy = () -> com.tools20022.repository.codeset.MultilegReportType1Code.mmObject();
			codeName = MultilegReportTypeCode.ByInstrumentLeg.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MultilegReportType1Code> codesByName = new LinkedHashMap<>();

	protected MultilegReportType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BYSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MultilegReportType1Code";
				definition = "Indicates the method of execution reporting requested by issuer of the order.";
				trace_lazy = () -> MultilegReportTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MultilegReportType1Code.BySecurity, com.tools20022.repository.codeset.MultilegReportType1Code.BySecurityAndLeg,
						com.tools20022.repository.codeset.MultilegReportType1Code.ByInstrumentLeg);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BySecurity.getCodeName().get(), BySecurity);
		codesByName.put(BySecurityAndLeg.getCodeName().get(), BySecurityAndLeg);
		codesByName.put(ByInstrumentLeg.getCodeName().get(), ByInstrumentLeg);
	}

	public static MultilegReportType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MultilegReportType1Code[] values() {
		MultilegReportType1Code[] values = new MultilegReportType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MultilegReportType1Code> {
		@Override
		public MultilegReportType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MultilegReportType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}