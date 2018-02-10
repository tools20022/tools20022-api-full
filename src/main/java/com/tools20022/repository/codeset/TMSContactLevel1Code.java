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
import com.tools20022.repository.codeset.TMSContactLevel1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Level of urgency in contacting the terminal management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code#Critical
 * TMSContactLevel1Code.Critical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code#AsSoonAsPossible
 * TMSContactLevel1Code.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code#DateTime
 * TMSContactLevel1Code.DateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
 * TMSContactLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSContactLevel1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Level of urgency in contacting the terminal management system."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TMSContactLevel1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code
	 * TMSContactLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Critical"</li>
	 * </ul>
	 */
	public static final TMSContactLevel1Code Critical = new TMSContactLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Critical";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel1Code.mmObject();
			codeName = TMSContactLevelCode.Critical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code
	 * TMSContactLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * </ul>
	 */
	public static final TMSContactLevel1Code AsSoonAsPossible = new TMSContactLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsSoonAsPossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel1Code.mmObject();
			codeName = TMSContactLevelCode.AsSoonAsPossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel1Code
	 * TMSContactLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * </ul>
	 */
	public static final TMSContactLevel1Code DateTime = new TMSContactLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel1Code.mmObject();
			codeName = TMSContactLevelCode.DateTime.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TMSContactLevel1Code> codesByName = new LinkedHashMap<>();

	protected TMSContactLevel1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSContactLevel1Code";
				definition = "Level of urgency in contacting the terminal management system.";
				trace_lazy = () -> TMSContactLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TMSContactLevel1Code.Critical, com.tools20022.repository.codeset.TMSContactLevel1Code.AsSoonAsPossible,
						com.tools20022.repository.codeset.TMSContactLevel1Code.DateTime);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Critical.getCodeName().get(), Critical);
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(DateTime.getCodeName().get(), DateTime);
	}

	public static TMSContactLevel1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TMSContactLevel1Code[] values() {
		TMSContactLevel1Code[] values = new TMSContactLevel1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TMSContactLevel1Code> {
		@Override
		public TMSContactLevel1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TMSContactLevel1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}