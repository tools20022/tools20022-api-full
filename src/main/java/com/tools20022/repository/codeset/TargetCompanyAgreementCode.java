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
import com.tools20022.repository.codeset.TargetCompanyAgreementCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * TSE/JASDEC extension codes for the agreement of the target company.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode#No
 * TargetCompanyAgreementCode.No}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode#Yes
 * TargetCompanyAgreementCode.Yes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode#NotDecided
 * TargetCompanyAgreementCode.NotDecided}</li>
 * </ul>
 * </li>
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
 * "TargetCompanyAgreementCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TSE/JASDEC extension codes for the agreement of the target company."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TargetCompanyAgreementCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No agreement of the target company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode
	 * TargetCompanyAgreementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "No"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No agreement of the target company."</li>
	 * </ul>
	 */
	public static final TargetCompanyAgreementCode No = new TargetCompanyAgreementCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			definition = "No agreement of the target company.";
			owner_lazy = () -> com.tools20022.repository.codeset.TargetCompanyAgreementCode.mmObject();
			codeName = "AGNO";
		}
	};
	/**
	 * Agreement of the target company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode
	 * TargetCompanyAgreementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement of the target company."</li>
	 * </ul>
	 */
	public static final TargetCompanyAgreementCode Yes = new TargetCompanyAgreementCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yes";
			definition = "Agreement of the target company.";
			owner_lazy = () -> com.tools20022.repository.codeset.TargetCompanyAgreementCode.mmObject();
			codeName = "AGYS";
		}
	};
	/**
	 * Agreement of the target company is not decided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TargetCompanyAgreementCode
	 * TargetCompanyAgreementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDecided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement of the target company is not decided."</li>
	 * </ul>
	 */
	public static final TargetCompanyAgreementCode NotDecided = new TargetCompanyAgreementCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDecided";
			definition = "Agreement of the target company is not decided.";
			owner_lazy = () -> com.tools20022.repository.codeset.TargetCompanyAgreementCode.mmObject();
			codeName = "AGND";
		}
	};
	final static private LinkedHashMap<String, TargetCompanyAgreementCode> codesByName = new LinkedHashMap<>();

	protected TargetCompanyAgreementCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TargetCompanyAgreementCode";
				definition = "TSE/JASDEC extension codes for the agreement of the target company.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TargetCompanyAgreementCode.No, com.tools20022.repository.codeset.TargetCompanyAgreementCode.Yes,
						com.tools20022.repository.codeset.TargetCompanyAgreementCode.NotDecided);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(No.getCodeName().get(), No);
		codesByName.put(Yes.getCodeName().get(), Yes);
		codesByName.put(NotDecided.getCodeName().get(), NotDecided);
	}

	public static TargetCompanyAgreementCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TargetCompanyAgreementCode[] values() {
		TargetCompanyAgreementCode[] values = new TargetCompanyAgreementCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TargetCompanyAgreementCode> {
		@Override
		public TargetCompanyAgreementCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TargetCompanyAgreementCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}