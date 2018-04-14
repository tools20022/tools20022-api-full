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
import com.tools20022.repository.codeset.TR34Command1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specific TR34 command that the ATM could perform.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34Command1Code#Bind
 * TR34Command1Code.Bind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code#HigherLevelRebind
 * TR34Command1Code.HigherLevelRebind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code#HigherLevelUnbind
 * TR34Command1Code.HigherLevelUnbind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34Command1Code#Rebind
 * TR34Command1Code.Rebind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34Command1Code#Unbind
 * TR34Command1Code.Unbind}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
 * TR34CommandCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TR34Command1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specific TR34 command that the ATM could perform."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TR34Command1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34Command1Code Bind = new TR34Command1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bind";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34Command1Code.mmObject();
			codeName = TR34CommandCode.Bind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HigherLevelRebind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34Command1Code HigherLevelRebind = new TR34Command1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HigherLevelRebind";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34Command1Code.mmObject();
			codeName = TR34CommandCode.HigherLevelRebind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HigherLevelUnbind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34Command1Code HigherLevelUnbind = new TR34Command1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HigherLevelUnbind";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34Command1Code.mmObject();
			codeName = TR34CommandCode.HigherLevelUnbind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34Command1Code Rebind = new TR34Command1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebind";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34Command1Code.mmObject();
			codeName = TR34CommandCode.Rebind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unbind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34Command1Code Unbind = new TR34Command1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unbind";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34Command1Code.mmObject();
			codeName = TR34CommandCode.Unbind.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TR34Command1Code> codesByName = new LinkedHashMap<>();

	protected TR34Command1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TR34Command1Code";
				definition = "Specific TR34 command that the ATM could perform.";
				trace_lazy = () -> TR34CommandCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TR34Command1Code.Bind, com.tools20022.repository.codeset.TR34Command1Code.HigherLevelRebind,
						com.tools20022.repository.codeset.TR34Command1Code.HigherLevelUnbind, com.tools20022.repository.codeset.TR34Command1Code.Rebind, com.tools20022.repository.codeset.TR34Command1Code.Unbind);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bind.getCodeName().get(), Bind);
		codesByName.put(HigherLevelRebind.getCodeName().get(), HigherLevelRebind);
		codesByName.put(HigherLevelUnbind.getCodeName().get(), HigherLevelUnbind);
		codesByName.put(Rebind.getCodeName().get(), Rebind);
		codesByName.put(Unbind.getCodeName().get(), Unbind);
	}

	public static TR34Command1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TR34Command1Code[] values() {
		TR34Command1Code[] values = new TR34Command1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TR34Command1Code> {
		@Override
		public TR34Command1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TR34Command1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}