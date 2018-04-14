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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities proceeds; whether they are defeased or
 * non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#DefeasedSecurityIndicator
 * NewSecuritiesIssuanceType3Code.DefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#NonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType3Code.NonDefeasedSecurityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
 * NewSecuritiesIssuanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewSecuritiesIssuanceType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are defeased or non-defeased."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
 * NewSecuritiesIssuanceType6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NewSecuritiesIssuanceType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code
	 * NewSecuritiesIssuanceType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#DefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType6Code.DefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType3Code DefeasedSecurityIndicator = new NewSecuritiesIssuanceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType6Code.DefeasedSecurityIndicator);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code
	 * NewSecuritiesIssuanceType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#NonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType6Code.NonDefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType3Code NonDefeasedSecurityIndicator = new NewSecuritiesIssuanceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType6Code.NonDefeasedSecurityIndicator);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NewSecuritiesIssuanceType3Code> codesByName = new LinkedHashMap<>();

	protected NewSecuritiesIssuanceType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType3Code";
				definition = "Specifies the type of securities proceeds; whether they are defeased or non-defeased.";
				nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType6Code.mmObject());
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.DefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code.NonDefeasedSecurityIndicator);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefeasedSecurityIndicator.getCodeName().get(), DefeasedSecurityIndicator);
		codesByName.put(NonDefeasedSecurityIndicator.getCodeName().get(), NonDefeasedSecurityIndicator);
	}

	public static NewSecuritiesIssuanceType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NewSecuritiesIssuanceType3Code[] values() {
		NewSecuritiesIssuanceType3Code[] values = new NewSecuritiesIssuanceType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NewSecuritiesIssuanceType3Code> {
		@Override
		public NewSecuritiesIssuanceType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NewSecuritiesIssuanceType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}