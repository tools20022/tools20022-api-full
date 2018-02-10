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
import com.tools20022.repository.codeset.RiskLevel1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the risk level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RiskLevel1Code#High
 * RiskLevel1Code.High}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RiskLevel1Code#Low
 * RiskLevel1Code.Low}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RiskLevel1Code#Medium
 * RiskLevel1Code.Medium}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RiskLevelCode RiskLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"HIGH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RiskLevel1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the risk level."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RiskLevel1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RiskLevel1Code
	 * RiskLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "High"</li>
	 * </ul>
	 */
	public static final RiskLevel1Code High = new RiskLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			owner_lazy = () -> com.tools20022.repository.codeset.RiskLevel1Code.mmObject();
			codeName = RiskLevelCode.High.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RiskLevel1Code
	 * RiskLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Low"</li>
	 * </ul>
	 */
	public static final RiskLevel1Code Low = new RiskLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Low";
			owner_lazy = () -> com.tools20022.repository.codeset.RiskLevel1Code.mmObject();
			codeName = RiskLevelCode.Low.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RiskLevel1Code
	 * RiskLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * </ul>
	 */
	public static final RiskLevel1Code Medium = new RiskLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			owner_lazy = () -> com.tools20022.repository.codeset.RiskLevel1Code.mmObject();
			codeName = RiskLevelCode.Medium.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RiskLevel1Code> codesByName = new LinkedHashMap<>();

	protected RiskLevel1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HIGH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RiskLevel1Code";
				definition = "Specifies the risk level.";
				trace_lazy = () -> RiskLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RiskLevel1Code.High, com.tools20022.repository.codeset.RiskLevel1Code.Low, com.tools20022.repository.codeset.RiskLevel1Code.Medium);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(High.getCodeName().get(), High);
		codesByName.put(Low.getCodeName().get(), Low);
		codesByName.put(Medium.getCodeName().get(), Medium);
	}

	public static RiskLevel1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RiskLevel1Code[] values() {
		RiskLevel1Code[] values = new RiskLevel1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RiskLevel1Code> {
		@Override
		public RiskLevel1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RiskLevel1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}