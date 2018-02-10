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
import com.tools20022.repository.codeset.Grouping1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the grouping options of the payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Grouping1Code#Single
 * Grouping1Code.Single}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Grouping1Code#Grouped
 * Grouping1Code.Grouped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Grouping1Code#Mixed
 * Grouping1Code.Mixed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GroupingCode GroupingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SNGL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Grouping1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the grouping options of the payment transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Grouping1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Grouping1Code
	 * Grouping1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Single"</li>
	 * </ul>
	 */
	public static final Grouping1Code Single = new Grouping1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Single";
			owner_lazy = () -> com.tools20022.repository.codeset.Grouping1Code.mmObject();
			codeName = GroupingCode.Single.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Grouping1Code
	 * Grouping1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grouped"</li>
	 * </ul>
	 */
	public static final Grouping1Code Grouped = new Grouping1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grouped";
			owner_lazy = () -> com.tools20022.repository.codeset.Grouping1Code.mmObject();
			codeName = GroupingCode.Grouped.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Grouping1Code
	 * Grouping1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mixed"</li>
	 * </ul>
	 */
	public static final Grouping1Code Mixed = new Grouping1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mixed";
			owner_lazy = () -> com.tools20022.repository.codeset.Grouping1Code.mmObject();
			codeName = GroupingCode.Mixed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Grouping1Code> codesByName = new LinkedHashMap<>();

	protected Grouping1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SNGL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Grouping1Code";
				definition = "Specifies the grouping options of the payment transaction.";
				trace_lazy = () -> GroupingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Grouping1Code.Single, com.tools20022.repository.codeset.Grouping1Code.Grouped, com.tools20022.repository.codeset.Grouping1Code.Mixed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Single.getCodeName().get(), Single);
		codesByName.put(Grouped.getCodeName().get(), Grouped);
		codesByName.put(Mixed.getCodeName().get(), Mixed);
	}

	public static Grouping1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Grouping1Code[] values() {
		Grouping1Code[] values = new Grouping1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Grouping1Code> {
		@Override
		public Grouping1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Grouping1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}