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
import com.tools20022.repository.codeset.GateHoldBackCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.GateHoldBackCode#HoldBack
 * GateHoldBackCode.HoldBack}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GateHoldBackCode#Gating
 * GateHoldBackCode.Gating}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.GateHoldBack1Code
 * GateHoldBack1Code}</li>
 * </ul>
 * </li>
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
 * "GateHoldBackCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of hold back on redemption proceeds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GateHoldBackCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Hold back of redemption proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBackCode
	 * GateHoldBackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hold back of redemption proceeds."</li>
	 * </ul>
	 */
	public static final GateHoldBackCode HoldBack = new GateHoldBackCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBack";
			definition = "Hold back of redemption proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.GateHoldBackCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Gating of redemption proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBackCode
	 * GateHoldBackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gating of redemption proceeds."</li>
	 * </ul>
	 */
	public static final GateHoldBackCode Gating = new GateHoldBackCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gating";
			definition = "Gating of redemption proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.GateHoldBackCode.mmObject();
			codeName = "GATE";
		}
	};
	final static private LinkedHashMap<String, GateHoldBackCode> codesByName = new LinkedHashMap<>();

	protected GateHoldBackCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GateHoldBackCode";
				definition = "Specifies the type of hold back on redemption proceeds.";
				derivation_lazy = () -> Arrays.asList(GateHoldBack1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GateHoldBackCode.HoldBack, com.tools20022.repository.codeset.GateHoldBackCode.Gating);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(HoldBack.getCodeName().get(), HoldBack);
		codesByName.put(Gating.getCodeName().get(), Gating);
	}

	public static GateHoldBackCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GateHoldBackCode[] values() {
		GateHoldBackCode[] values = new GateHoldBackCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GateHoldBackCode> {
		@Override
		public GateHoldBackCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GateHoldBackCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}