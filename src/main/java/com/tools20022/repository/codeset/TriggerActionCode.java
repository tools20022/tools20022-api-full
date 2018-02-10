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
import com.tools20022.repository.codeset.TriggerActionCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerActionCode#Activate
 * TriggerActionCode.Activate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerActionCode#Modify
 * TriggerActionCode.Modify}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerActionCode#Cancel
 * TriggerActionCode.Cancel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerAction1Code
 * TriggerAction1Code}</li>
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
 * <li>"ACTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of action to take when the trigger hits."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TriggerActionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trigger action is activate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerActionCode
	 * TriggerActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger action is activate."</li>
	 * </ul>
	 */
	public static final TriggerActionCode Activate = new TriggerActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			definition = "Trigger action is activate.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerActionCode.mmObject();
			codeName = "ACTI";
		}
	};
	/**
	 * Trigger action is modify.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerActionCode
	 * TriggerActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger action is modify."</li>
	 * </ul>
	 */
	public static final TriggerActionCode Modify = new TriggerActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modify";
			definition = "Trigger action is modify.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerActionCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Trigger action is cancel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerActionCode
	 * TriggerActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger action is cancel."</li>
	 * </ul>
	 */
	public static final TriggerActionCode Cancel = new TriggerActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancel";
			definition = "Trigger action is cancel.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerActionCode.mmObject();
			codeName = "CANC";
		}
	};
	final static private LinkedHashMap<String, TriggerActionCode> codesByName = new LinkedHashMap<>();

	protected TriggerActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerActionCode";
				definition = "Defines the type of action to take when the trigger hits.";
				derivation_lazy = () -> Arrays.asList(TriggerAction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TriggerActionCode.Activate, com.tools20022.repository.codeset.TriggerActionCode.Modify, com.tools20022.repository.codeset.TriggerActionCode.Cancel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Activate.getCodeName().get(), Activate);
		codesByName.put(Modify.getCodeName().get(), Modify);
		codesByName.put(Cancel.getCodeName().get(), Cancel);
	}

	public static TriggerActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TriggerActionCode[] values() {
		TriggerActionCode[] values = new TriggerActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TriggerActionCode> {
		@Override
		public TriggerActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TriggerActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}