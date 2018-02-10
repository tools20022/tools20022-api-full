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
import com.tools20022.repository.codeset.DistributionPolicy1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if income is to be paid out (distributed) or retained
 * (accumulated).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code#Distribution
 * DistributionPolicy1Code.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code#Accumulation
 * DistributionPolicy1Code.Accumulation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DistributionPolicyCode
 * DistributionPolicyCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DIST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionPolicy1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if income is to be paid out (distributed) or retained (accumulated)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionPolicy1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * </ul>
	 */
	public static final DistributionPolicy1Code Distribution = new DistributionPolicy1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distribution";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionPolicy1Code.mmObject();
			codeName = DistributionPolicyCode.Distribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * </ul>
	 */
	public static final DistributionPolicy1Code Accumulation = new DistributionPolicy1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionPolicy1Code.mmObject();
			codeName = DistributionPolicyCode.Accumulation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DistributionPolicy1Code> codesByName = new LinkedHashMap<>();

	protected DistributionPolicy1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DIST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionPolicy1Code";
				definition = "Specifies if income is to be paid out (distributed) or retained (accumulated).";
				trace_lazy = () -> DistributionPolicyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionPolicy1Code.Distribution, com.tools20022.repository.codeset.DistributionPolicy1Code.Accumulation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Distribution.getCodeName().get(), Distribution);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
	}

	public static DistributionPolicy1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionPolicy1Code[] values() {
		DistributionPolicy1Code[] values = new DistributionPolicy1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionPolicy1Code> {
		@Override
		public DistributionPolicy1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionPolicy1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}