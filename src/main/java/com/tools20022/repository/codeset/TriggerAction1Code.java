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
import com.tools20022.repository.codeset.TriggerAction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of action to take when the trigger hits.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerAction1Code#Activate
 * TriggerAction1Code.Activate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerAction1Code#Modify
 * TriggerAction1Code.Modify}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerAction1Code#Cancel
 * TriggerAction1Code.Cancel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TriggerActionCode
 * TriggerActionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerAction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of action to take when the trigger hits."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TriggerAction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerAction1Code
	 * TriggerAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * </ul>
	 */
	public static final TriggerAction1Code Activate = new TriggerAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerAction1Code.mmObject();
			codeName = TriggerActionCode.Activate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerAction1Code
	 * TriggerAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modify"</li>
	 * </ul>
	 */
	public static final TriggerAction1Code Modify = new TriggerAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modify";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerAction1Code.mmObject();
			codeName = TriggerActionCode.Modify.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerAction1Code
	 * TriggerAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancel"</li>
	 * </ul>
	 */
	public static final TriggerAction1Code Cancel = new TriggerAction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancel";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerAction1Code.mmObject();
			codeName = TriggerActionCode.Cancel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TriggerAction1Code> codesByName = new LinkedHashMap<>();

	protected TriggerAction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerAction1Code";
				definition = "Defines the type of action to take when the trigger hits.";
				trace_lazy = () -> TriggerActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TriggerAction1Code.Activate, com.tools20022.repository.codeset.TriggerAction1Code.Modify, com.tools20022.repository.codeset.TriggerAction1Code.Cancel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Activate.getCodeName().get(), Activate);
		codesByName.put(Modify.getCodeName().get(), Modify);
		codesByName.put(Cancel.getCodeName().get(), Cancel);
	}

	public static TriggerAction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TriggerAction1Code[] values() {
		TriggerAction1Code[] values = new TriggerAction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TriggerAction1Code> {
		@Override
		public TriggerAction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TriggerAction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}