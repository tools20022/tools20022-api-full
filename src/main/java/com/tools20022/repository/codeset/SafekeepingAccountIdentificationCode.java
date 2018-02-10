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
import com.tools20022.repository.codeset.SafekeepingAccountIdentificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the account identification via a code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingAccountIdentificationCode#General
 * SafekeepingAccountIdentificationCode.General}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingAccountIdentification1Code
 * SafekeepingAccountIdentification1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GENR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingAccountIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the account identification via a code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SafekeepingAccountIdentificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Announcement applies to all safekeeping accounts that own underlying
	 * financial instrument. (Used for general or preliminary announcements.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingAccountIdentificationCode
	 * SafekeepingAccountIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "General"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement applies to all safekeeping accounts that own underlying financial instrument. (Used for general or preliminary announcements.)."
	 * </li>
	 * </ul>
	 */
	public static final SafekeepingAccountIdentificationCode General = new SafekeepingAccountIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "General";
			definition = "Announcement applies to all safekeeping accounts that own underlying financial instrument. (Used for general or preliminary announcements.).";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingAccountIdentificationCode.mmObject();
			codeName = "GENR";
		}
	};
	final static private LinkedHashMap<String, SafekeepingAccountIdentificationCode> codesByName = new LinkedHashMap<>();

	protected SafekeepingAccountIdentificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingAccountIdentificationCode";
				definition = "Specifies the account identification via a code.";
				derivation_lazy = () -> Arrays.asList(SafekeepingAccountIdentification1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SafekeepingAccountIdentificationCode.General);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(General.getCodeName().get(), General);
	}

	public static SafekeepingAccountIdentificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SafekeepingAccountIdentificationCode[] values() {
		SafekeepingAccountIdentificationCode[] values = new SafekeepingAccountIdentificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SafekeepingAccountIdentificationCode> {
		@Override
		public SafekeepingAccountIdentificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SafekeepingAccountIdentificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}