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
import com.tools20022.repository.codeset.InformationDistribution1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how information is to be distributed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code#Electronic
 * InformationDistribution1Code.Electronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code#Paper
 * InformationDistribution1Code.Paper}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InformationDistributionCode
 * InformationDistributionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ELEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationDistribution1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how information is to be distributed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InformationDistribution1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code
	 * InformationDistribution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * </ul>
	 */
	public static final InformationDistribution1Code Electronic = new InformationDistribution1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			owner_lazy = () -> com.tools20022.repository.codeset.InformationDistribution1Code.mmObject();
			codeName = InformationDistributionCode.Electronic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code
	 * InformationDistribution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * </ul>
	 */
	public static final InformationDistribution1Code Paper = new InformationDistribution1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			owner_lazy = () -> com.tools20022.repository.codeset.InformationDistribution1Code.mmObject();
			codeName = InformationDistributionCode.Paper.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InformationDistribution1Code> codesByName = new LinkedHashMap<>();

	protected InformationDistribution1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationDistribution1Code";
				definition = "Specifies how information is to be distributed.";
				trace_lazy = () -> InformationDistributionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InformationDistribution1Code.Electronic, com.tools20022.repository.codeset.InformationDistribution1Code.Paper);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(Paper.getCodeName().get(), Paper);
	}

	public static InformationDistribution1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InformationDistribution1Code[] values() {
		InformationDistribution1Code[] values = new InformationDistribution1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InformationDistribution1Code> {
		@Override
		public InformationDistribution1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InformationDistribution1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}