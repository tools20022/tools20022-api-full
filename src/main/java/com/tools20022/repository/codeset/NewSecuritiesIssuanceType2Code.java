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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities proceeds; whether they are newly issued or
 * not, defeased or non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#DefeasedSecurityIndicator
 * NewSecuritiesIssuanceType2Code.DefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#ExistingIssue
 * NewSecuritiesIssuanceType2Code.ExistingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#NewIssue
 * NewSecuritiesIssuanceType2Code.NewIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#NonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType2Code.NonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#Unknown
 * NewSecuritiesIssuanceType2Code.Unknown}</li>
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
 * "NewSecuritiesIssuanceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
 * NewSecuritiesIssuanceType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NewSecuritiesIssuanceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#DefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType5Code.DefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType2Code DefeasedSecurityIndicator = new NewSecuritiesIssuanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.DefeasedSecurityIndicator);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#ExistingIssue
	 * NewSecuritiesIssuanceType5Code.ExistingIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType2Code ExistingIssue = new NewSecuritiesIssuanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingIssue";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.ExistingIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.ExistingIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#NewIssue
	 * NewSecuritiesIssuanceType5Code.NewIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType2Code NewIssue = new NewSecuritiesIssuanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssue";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.NewIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NewIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#NonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType5Code.NonDefeasedSecurityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType2Code NonDefeasedSecurityIndicator = new NewSecuritiesIssuanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.NonDefeasedSecurityIndicator);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
	 * NewSecuritiesIssuanceType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#Unknown
	 * NewSecuritiesIssuanceType5Code.Unknown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType2Code Unknown = new NewSecuritiesIssuanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.Unknown);
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NewSecuritiesIssuanceType2Code> codesByName = new LinkedHashMap<>();

	protected NewSecuritiesIssuanceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType2Code";
				definition = "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased.";
				nextVersions_lazy = () -> Arrays.asList(NewSecuritiesIssuanceType5Code.mmObject());
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.DefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.ExistingIssue,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.NewIssue, com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.NonDefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefeasedSecurityIndicator.getCodeName().get(), DefeasedSecurityIndicator);
		codesByName.put(ExistingIssue.getCodeName().get(), ExistingIssue);
		codesByName.put(NewIssue.getCodeName().get(), NewIssue);
		codesByName.put(NonDefeasedSecurityIndicator.getCodeName().get(), NonDefeasedSecurityIndicator);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static NewSecuritiesIssuanceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NewSecuritiesIssuanceType2Code[] values() {
		NewSecuritiesIssuanceType2Code[] values = new NewSecuritiesIssuanceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NewSecuritiesIssuanceType2Code> {
		@Override
		public NewSecuritiesIssuanceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NewSecuritiesIssuanceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}