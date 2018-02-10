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
import com.tools20022.repository.codeset.CommissionType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of investment fund commission.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code#FrontEndLoad
 * CommissionType6Code.FrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code#BackEndLoad
 * CommissionType6Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code#CommissionDePlacement
 * CommissionType6Code.CommissionDePlacement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
 * CommissionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of investment fund commission."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommissionType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code
	 * CommissionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final CommissionType6Code FrontEndLoad = new CommissionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType6Code.mmObject();
			codeName = CommissionTypeV2Code.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code
	 * CommissionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final CommissionType6Code BackEndLoad = new CommissionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType6Code.mmObject();
			codeName = CommissionTypeV2Code.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code
	 * CommissionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * </ul>
	 */
	public static final CommissionType6Code CommissionDePlacement = new CommissionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDePlacement";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType6Code.mmObject();
			codeName = CommissionTypeV2Code.CommissionDePlacement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommissionType6Code> codesByName = new LinkedHashMap<>();

	protected CommissionType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionType6Code";
				definition = "Specifies the type of investment fund commission.";
				trace_lazy = () -> CommissionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionType6Code.FrontEndLoad, com.tools20022.repository.codeset.CommissionType6Code.BackEndLoad,
						com.tools20022.repository.codeset.CommissionType6Code.CommissionDePlacement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(CommissionDePlacement.getCodeName().get(), CommissionDePlacement);
	}

	public static CommissionType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommissionType6Code[] values() {
		CommissionType6Code[] values = new CommissionType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommissionType6Code> {
		@Override
		public CommissionType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommissionType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}