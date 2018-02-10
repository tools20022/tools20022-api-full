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
import com.tools20022.repository.codeset.GateHoldBack1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of hold back on redemption proceeds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.GateHoldBack1Code#Gating
 * GateHoldBack1Code.Gating}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GateHoldBack1Code#HoldBack
 * GateHoldBack1Code.HoldBack}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GateHoldBackCode
 * GateHoldBackCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GateHoldBack1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of hold back on redemption proceeds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GateHoldBack1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBack1Code
	 * GateHoldBack1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gating"</li>
	 * </ul>
	 */
	public static final GateHoldBack1Code Gating = new GateHoldBack1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gating";
			owner_lazy = () -> com.tools20022.repository.codeset.GateHoldBack1Code.mmObject();
			codeName = GateHoldBackCode.Gating.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBack1Code
	 * GateHoldBack1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBack"</li>
	 * </ul>
	 */
	public static final GateHoldBack1Code HoldBack = new GateHoldBack1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBack";
			owner_lazy = () -> com.tools20022.repository.codeset.GateHoldBack1Code.mmObject();
			codeName = GateHoldBackCode.HoldBack.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GateHoldBack1Code> codesByName = new LinkedHashMap<>();

	protected GateHoldBack1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GateHoldBack1Code";
				definition = "Specifies the type of hold back on redemption proceeds.";
				trace_lazy = () -> GateHoldBackCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GateHoldBack1Code.Gating, com.tools20022.repository.codeset.GateHoldBack1Code.HoldBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gating.getCodeName().get(), Gating);
		codesByName.put(HoldBack.getCodeName().get(), HoldBack);
	}

	public static GateHoldBack1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GateHoldBack1Code[] values() {
		GateHoldBack1Code[] values = new GateHoldBack1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GateHoldBack1Code> {
		@Override
		public GateHoldBack1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GateHoldBack1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}