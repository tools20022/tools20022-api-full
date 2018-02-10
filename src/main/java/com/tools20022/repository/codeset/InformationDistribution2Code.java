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
import com.tools20022.repository.codeset.InformationDistribution2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code#Electronic
 * InformationDistribution2Code.Electronic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code#NoDistribution
 * InformationDistribution2Code.NoDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code#Paper
 * InformationDistribution2Code.Paper}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationDistribution2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how information is to be distributed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InformationDistribution2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code
	 * InformationDistribution2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * </ul>
	 */
	public static final InformationDistribution2Code Electronic = new InformationDistribution2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			owner_lazy = () -> com.tools20022.repository.codeset.InformationDistribution2Code.mmObject();
			codeName = InformationDistributionCode.Electronic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code
	 * InformationDistribution2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoDistribution"</li>
	 * </ul>
	 */
	public static final InformationDistribution2Code NoDistribution = new InformationDistribution2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.InformationDistribution2Code.mmObject();
			codeName = InformationDistributionCode.NoDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution2Code
	 * InformationDistribution2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * </ul>
	 */
	public static final InformationDistribution2Code Paper = new InformationDistribution2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			owner_lazy = () -> com.tools20022.repository.codeset.InformationDistribution2Code.mmObject();
			codeName = InformationDistributionCode.Paper.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InformationDistribution2Code> codesByName = new LinkedHashMap<>();

	protected InformationDistribution2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationDistribution2Code";
				definition = "Specifies how information is to be distributed.";
				trace_lazy = () -> InformationDistributionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InformationDistribution2Code.Electronic, com.tools20022.repository.codeset.InformationDistribution2Code.NoDistribution,
						com.tools20022.repository.codeset.InformationDistribution2Code.Paper);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(NoDistribution.getCodeName().get(), NoDistribution);
		codesByName.put(Paper.getCodeName().get(), Paper);
	}

	public static InformationDistribution2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InformationDistribution2Code[] values() {
		InformationDistribution2Code[] values = new InformationDistribution2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InformationDistribution2Code> {
		@Override
		public InformationDistribution2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InformationDistribution2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}