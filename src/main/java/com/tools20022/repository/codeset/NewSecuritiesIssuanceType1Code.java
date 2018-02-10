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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities proceeds; whether they are newly issued or
 * not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code#ExistingIssue
 * NewSecuritiesIssuanceType1Code.ExistingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code#NewIssue
 * NewSecuritiesIssuanceType1Code.NewIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code#Unknown
 * NewSecuritiesIssuanceType1Code.Unknown}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewSecuritiesIssuanceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are newly issued or not."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NewSecuritiesIssuanceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code
	 * NewSecuritiesIssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingIssue"</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType1Code ExistingIssue = new NewSecuritiesIssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.ExistingIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code
	 * NewSecuritiesIssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssue"</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType1Code NewIssue = new NewSecuritiesIssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NewIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code
	 * NewSecuritiesIssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType1Code Unknown = new NewSecuritiesIssuanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NewSecuritiesIssuanceType1Code> codesByName = new LinkedHashMap<>();

	protected NewSecuritiesIssuanceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType1Code";
				definition = "Specifies the type of securities proceeds; whether they are newly issued or not.";
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.ExistingIssue, com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.NewIssue,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType1Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExistingIssue.getCodeName().get(), ExistingIssue);
		codesByName.put(NewIssue.getCodeName().get(), NewIssue);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static NewSecuritiesIssuanceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NewSecuritiesIssuanceType1Code[] values() {
		NewSecuritiesIssuanceType1Code[] values = new NewSecuritiesIssuanceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NewSecuritiesIssuanceType1Code> {
		@Override
		public NewSecuritiesIssuanceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NewSecuritiesIssuanceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}