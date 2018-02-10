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
import com.tools20022.repository.codeset.StatementUpdateType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of a statement update, for example, it is a complete
 * statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code#Complete
 * StatementUpdateType1Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code#Delta
 * StatementUpdateType1Code.Delta}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeV2Code
 * StatementUpdateTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementUpdateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of a statement update, for example, it is a complete statement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatementUpdateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code
	 * StatementUpdateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final StatementUpdateType1Code Complete = new StatementUpdateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementUpdateType1Code.mmObject();
			codeName = StatementUpdateTypeV2Code.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code
	 * StatementUpdateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delta"</li>
	 * </ul>
	 */
	public static final StatementUpdateType1Code Delta = new StatementUpdateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delta";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementUpdateType1Code.mmObject();
			codeName = StatementUpdateTypeV2Code.Delta.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StatementUpdateType1Code> codesByName = new LinkedHashMap<>();

	protected StatementUpdateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementUpdateType1Code";
				definition = "Specifies the nature of a statement update, for example, it is a complete statement.";
				trace_lazy = () -> StatementUpdateTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatementUpdateType1Code.Complete, com.tools20022.repository.codeset.StatementUpdateType1Code.Delta);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Delta.getCodeName().get(), Delta);
	}

	public static StatementUpdateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatementUpdateType1Code[] values() {
		StatementUpdateType1Code[] values = new StatementUpdateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatementUpdateType1Code> {
		@Override
		public StatementUpdateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatementUpdateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}