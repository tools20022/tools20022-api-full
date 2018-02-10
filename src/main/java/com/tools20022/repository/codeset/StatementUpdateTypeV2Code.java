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
import com.tools20022.repository.codeset.StatementUpdateTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of a statement update, eg, it is a complete statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeV2Code#Complete
 * StatementUpdateTypeV2Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeV2Code#Delta
 * StatementUpdateTypeV2Code.Delta}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatementUpdateType1Code
 * StatementUpdateType1Code}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementUpdateTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of a statement update, eg, it is a complete statement."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatementUpdateTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Statement is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeV2Code
	 * StatementUpdateTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement is complete."</li>
	 * </ul>
	 */
	public static final StatementUpdateTypeV2Code Complete = new StatementUpdateTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Statement is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementUpdateTypeV2Code.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Statement contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeV2Code
	 * StatementUpdateTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement contains changes only."</li>
	 * </ul>
	 */
	public static final StatementUpdateTypeV2Code Delta = new StatementUpdateTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delta";
			definition = "Statement contains changes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementUpdateTypeV2Code.mmObject();
			codeName = "DELT";
		}
	};
	final static private LinkedHashMap<String, StatementUpdateTypeV2Code> codesByName = new LinkedHashMap<>();

	protected StatementUpdateTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementUpdateTypeV2Code";
				definition = "Specifies the nature of a statement update, eg, it is a complete statement.";
				derivation_lazy = () -> Arrays.asList(StatementUpdateType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatementUpdateTypeV2Code.Complete, com.tools20022.repository.codeset.StatementUpdateTypeV2Code.Delta);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Delta.getCodeName().get(), Delta);
	}

	public static StatementUpdateTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatementUpdateTypeV2Code[] values() {
		StatementUpdateTypeV2Code[] values = new StatementUpdateTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatementUpdateTypeV2Code> {
		@Override
		public StatementUpdateTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatementUpdateTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}