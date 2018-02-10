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
import com.tools20022.repository.codeset.SecuritiesLendingType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of securities lending contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code#NewRegistration
 * SecuritiesLendingType1Code.NewRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code#RollOverRenewal
 * SecuritiesLendingType1Code.RollOverRenewal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code#CallBack
 * SecuritiesLendingType1Code.CallBack}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
 * SecuritiesLendingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NWRG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesLendingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of securities lending contract."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesLendingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code
	 * SecuritiesLendingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesLendingType1Code NewRegistration = new SecuritiesLendingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingType1Code.mmObject();
			codeName = SecuritiesLendingTypeCode.NewRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code
	 * SecuritiesLendingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollOverRenewal"</li>
	 * </ul>
	 */
	public static final SecuritiesLendingType1Code RollOverRenewal = new SecuritiesLendingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollOverRenewal";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingType1Code.mmObject();
			codeName = SecuritiesLendingTypeCode.RollOverRenewal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingType1Code
	 * SecuritiesLendingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallBack"</li>
	 * </ul>
	 */
	public static final SecuritiesLendingType1Code CallBack = new SecuritiesLendingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesLendingType1Code.mmObject();
			codeName = SecuritiesLendingTypeCode.CallBack.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesLendingType1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesLendingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NWRG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLendingType1Code";
				definition = "Type of securities lending contract.";
				trace_lazy = () -> SecuritiesLendingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesLendingType1Code.NewRegistration, com.tools20022.repository.codeset.SecuritiesLendingType1Code.RollOverRenewal,
						com.tools20022.repository.codeset.SecuritiesLendingType1Code.CallBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewRegistration.getCodeName().get(), NewRegistration);
		codesByName.put(RollOverRenewal.getCodeName().get(), RollOverRenewal);
		codesByName.put(CallBack.getCodeName().get(), CallBack);
	}

	public static SecuritiesLendingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesLendingType1Code[] values() {
		SecuritiesLendingType1Code[] values = new SecuritiesLendingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesLendingType1Code> {
		@Override
		public SecuritiesLendingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesLendingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}