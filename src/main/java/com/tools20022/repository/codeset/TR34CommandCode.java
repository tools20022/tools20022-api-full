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
import com.tools20022.repository.codeset.TR34CommandCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TR34CommandCode#Bind
 * TR34CommandCode.Bind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34CommandCode#Unbind
 * TR34CommandCode.Unbind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34CommandCode#Rebind
 * TR34CommandCode.Rebind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode#HigherLevelUnbind
 * TR34CommandCode.HigherLevelUnbind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode#HigherLevelRebind
 * TR34CommandCode.HigherLevelRebind}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TR34Command1Code
 * TR34Command1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TR34CommandCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specific TR34 command that the ATM could perform."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TR34CommandCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * TR34 bind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
	 * TR34CommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR34 bind operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34CommandCode Bind = new TR34CommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bind";
			definition = "TR34 bind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34CommandCode.mmObject();
			codeName = "BIND";
		}
	};
	/**
	 * TR34 unbind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
	 * TR34CommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UBND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unbind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR34 unbind operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34CommandCode Unbind = new TR34CommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unbind";
			definition = "TR34 unbind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34CommandCode.mmObject();
			codeName = "UBND";
		}
	};
	/**
	 * TR34 rebind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
	 * TR34CommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR34 rebind operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34CommandCode Rebind = new TR34CommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebind";
			definition = "TR34 rebind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34CommandCode.mmObject();
			codeName = "RBND";
		}
	};
	/**
	 * TR34 Higher Level unbind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
	 * TR34CommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HILU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HigherLevelUnbind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR34 Higher Level unbind operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34CommandCode HigherLevelUnbind = new TR34CommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HigherLevelUnbind";
			definition = "TR34 Higher Level unbind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34CommandCode.mmObject();
			codeName = "HILU";
		}
	};
	/**
	 * TR34 Higher Level rebind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TR34CommandCode
	 * TR34CommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HILR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HigherLevelRebind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR34 Higher Level rebind operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TR34CommandCode HigherLevelRebind = new TR34CommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HigherLevelRebind";
			definition = "TR34 Higher Level rebind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.TR34CommandCode.mmObject();
			codeName = "HILR";
		}
	};
	final static private LinkedHashMap<String, TR34CommandCode> codesByName = new LinkedHashMap<>();

	protected TR34CommandCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TR34CommandCode";
				definition = "Specific TR34 command that the ATM could perform.";
				derivation_lazy = () -> Arrays.asList(TR34Command1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TR34CommandCode.Bind, com.tools20022.repository.codeset.TR34CommandCode.Unbind, com.tools20022.repository.codeset.TR34CommandCode.Rebind,
						com.tools20022.repository.codeset.TR34CommandCode.HigherLevelUnbind, com.tools20022.repository.codeset.TR34CommandCode.HigherLevelRebind);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bind.getCodeName().get(), Bind);
		codesByName.put(Unbind.getCodeName().get(), Unbind);
		codesByName.put(Rebind.getCodeName().get(), Rebind);
		codesByName.put(HigherLevelUnbind.getCodeName().get(), HigherLevelUnbind);
		codesByName.put(HigherLevelRebind.getCodeName().get(), HigherLevelRebind);
	}

	public static TR34CommandCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TR34CommandCode[] values() {
		TR34CommandCode[] values = new TR34CommandCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TR34CommandCode> {
		@Override
		public TR34CommandCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TR34CommandCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}