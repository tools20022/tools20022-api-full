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
import com.tools20022.repository.codeset.AutomaticBorrowing1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the condition under which automatic borrowing is allowed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code#LastResort
 * AutomaticBorrowing1Code.LastResort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code#NoAutomatic
 * AutomaticBorrowing1Code.NoAutomatic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code#Automatic
 * AutomaticBorrowing1Code.Automatic}</li>
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
 * <li>"LAST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutomaticBorrowing1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the condition under which automatic borrowing is allowed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AutomaticBorrowing1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Automatic borrowing may be considered as a last resort to make a
	 * settlement occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code
	 * AutomaticBorrowing1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastResort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automatic borrowing may be considered as a last resort to make a settlement occur."
	 * </li>
	 * </ul>
	 */
	public static final AutomaticBorrowing1Code LastResort = new AutomaticBorrowing1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "LastResort";
			definition = "Automatic borrowing may be considered as a last resort to make a settlement occur.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutomaticBorrowing1Code.mmObject();
			codeName = "LAST";
		}
	};
	/**
	 * No automatic borrowing may take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code
	 * AutomaticBorrowing1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomatic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No automatic borrowing may take place."</li>
	 * </ul>
	 */
	public static final AutomaticBorrowing1Code NoAutomatic = new AutomaticBorrowing1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "NoAutomatic";
			definition = "No automatic borrowing may take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutomaticBorrowing1Code.mmObject();
			codeName = "NOAT";
		}
	};
	/**
	 * Automatic borrowing may take place to effect settlement in case of
	 * insufficient securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutomaticBorrowing1Code
	 * AutomaticBorrowing1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Automatic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automatic borrowing may take place to effect settlement in case of insufficient securities."
	 * </li>
	 * </ul>
	 */
	public static final AutomaticBorrowing1Code Automatic = new AutomaticBorrowing1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Automatic";
			definition = "Automatic borrowing may take place to effect settlement in case of insufficient securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.AutomaticBorrowing1Code.mmObject();
			codeName = "AUTO";
		}
	};
	final static private LinkedHashMap<String, AutomaticBorrowing1Code> codesByName = new LinkedHashMap<>();

	protected AutomaticBorrowing1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LAST");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "AutomaticBorrowing1Code";
				definition = "Specifies the condition under which automatic borrowing is allowed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutomaticBorrowing1Code.LastResort, com.tools20022.repository.codeset.AutomaticBorrowing1Code.NoAutomatic,
						com.tools20022.repository.codeset.AutomaticBorrowing1Code.Automatic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LastResort.getCodeName().get(), LastResort);
		codesByName.put(NoAutomatic.getCodeName().get(), NoAutomatic);
		codesByName.put(Automatic.getCodeName().get(), Automatic);
	}

	public static AutomaticBorrowing1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AutomaticBorrowing1Code[] values() {
		AutomaticBorrowing1Code[] values = new AutomaticBorrowing1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AutomaticBorrowing1Code> {
		@Override
		public AutomaticBorrowing1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AutomaticBorrowing1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}