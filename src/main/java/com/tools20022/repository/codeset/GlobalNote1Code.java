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
import com.tools20022.repository.codeset.GlobalNote1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies if the security will be issued in New Global Note (NGN) or
 * Classical Global Note (CGN).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNote1Code#NewGlobalNote
 * GlobalNote1Code.NewGlobalNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GlobalNote1Code#ClassicalGlobalNote
 * GlobalNote1Code.ClassicalGlobalNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode GlobalNoteCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GlobalNote1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NGNO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GlobalNote1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNote1Code
	 * GlobalNote1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewGlobalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GlobalNote1Code NewGlobalNote = new GlobalNote1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewGlobalNote";
			owner_lazy = () -> com.tools20022.repository.codeset.GlobalNote1Code.mmObject();
			codeName = GlobalNoteCode.NewGlobalNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNote1Code
	 * GlobalNote1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassicalGlobalNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GlobalNote1Code ClassicalGlobalNote = new GlobalNote1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassicalGlobalNote";
			owner_lazy = () -> com.tools20022.repository.codeset.GlobalNote1Code.mmObject();
			codeName = GlobalNoteCode.ClassicalGlobalNote.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GlobalNote1Code> codesByName = new LinkedHashMap<>();

	protected GlobalNote1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NGNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GlobalNote1Code";
				definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).";
				trace_lazy = () -> GlobalNoteCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GlobalNote1Code.NewGlobalNote, com.tools20022.repository.codeset.GlobalNote1Code.ClassicalGlobalNote);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewGlobalNote.getCodeName().get(), NewGlobalNote);
		codesByName.put(ClassicalGlobalNote.getCodeName().get(), ClassicalGlobalNote);
	}

	public static GlobalNote1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GlobalNote1Code[] values() {
		GlobalNote1Code[] values = new GlobalNote1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GlobalNote1Code> {
		@Override
		public GlobalNote1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GlobalNote1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}