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
import com.tools20022.repository.codeset.TEFRARules1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by
 * the IRS under which the security is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TEFRARules1Code#C
 * TEFRARules1Code.C}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TEFRARules1Code#D
 * TEFRARules1Code.D}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode TEFRARulesCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RULC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TEFRARules1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by the IRS under which the security is issued."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TEFRARules1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARules1Code
	 * TEFRARules1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "C"</li>
	 * </ul>
	 */
	public static final TEFRARules1Code C = new TEFRARules1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "C";
			owner_lazy = () -> com.tools20022.repository.codeset.TEFRARules1Code.mmObject();
			codeName = TEFRARulesCode.C.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARules1Code
	 * TEFRARules1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "D"</li>
	 * </ul>
	 */
	public static final TEFRARules1Code D = new TEFRARules1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "D";
			owner_lazy = () -> com.tools20022.repository.codeset.TEFRARules1Code.mmObject();
			codeName = TEFRARulesCode.D.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TEFRARules1Code> codesByName = new LinkedHashMap<>();

	protected TEFRARules1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RULC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TEFRARules1Code";
				definition = "Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by the IRS under which the security is issued.";
				trace_lazy = () -> TEFRARulesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TEFRARules1Code.C, com.tools20022.repository.codeset.TEFRARules1Code.D);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(C.getCodeName().get(), C);
		codesByName.put(D.getCodeName().get(), D);
	}

	public static TEFRARules1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TEFRARules1Code[] values() {
		TEFRARules1Code[] values = new TEFRARules1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TEFRARules1Code> {
		@Override
		public TEFRARules1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TEFRARules1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}