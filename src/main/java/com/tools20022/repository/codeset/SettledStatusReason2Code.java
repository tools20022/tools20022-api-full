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
import com.tools20022.repository.codeset.SettledStatusReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Partial settlement status information or information about gating.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code#CashPartiallySettled
 * SettledStatusReason2Code.CashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code#GatedMultipleNAV
 * SettledStatusReason2Code.GatedMultipleNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code#GatedOneNAV
 * SettledStatusReason2Code.GatedOneNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code#UnitsCashPartiallySettled
 * SettledStatusReason2Code.UnitsCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code#UnitsPartiallySettled
 * SettledStatusReason2Code.UnitsPartiallySettled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
 * SettledStatusReasonCode}</li>
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
 * "SettledStatusReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Partial settlement status information or information about gating."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettledStatusReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason2Code CashPartiallySettled = new SettledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason2Code.mmObject();
			codeName = SettledStatusReasonCode.CashPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatedMultipleNAV"</li>
	 * </ul>
	 */
	public static final SettledStatusReason2Code GatedMultipleNAV = new SettledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatedMultipleNAV";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason2Code.mmObject();
			codeName = SettledStatusReasonCode.GatedMultipleNAV.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatedOneNAV"</li>
	 * </ul>
	 */
	public static final SettledStatusReason2Code GatedOneNAV = new SettledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatedOneNAV";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason2Code.mmObject();
			codeName = SettledStatusReasonCode.GatedOneNAV.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason2Code UnitsCashPartiallySettled = new SettledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason2Code.mmObject();
			codeName = SettledStatusReasonCode.UnitsCashPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason2Code UnitsPartiallySettled = new SettledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason2Code.mmObject();
			codeName = SettledStatusReasonCode.UnitsPartiallySettled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettledStatusReason2Code> codesByName = new LinkedHashMap<>();

	protected SettledStatusReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettledStatusReason2Code";
				definition = "Partial settlement status information or information about gating.";
				trace_lazy = () -> SettledStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettledStatusReason2Code.CashPartiallySettled, com.tools20022.repository.codeset.SettledStatusReason2Code.GatedMultipleNAV,
						com.tools20022.repository.codeset.SettledStatusReason2Code.GatedOneNAV, com.tools20022.repository.codeset.SettledStatusReason2Code.UnitsCashPartiallySettled,
						com.tools20022.repository.codeset.SettledStatusReason2Code.UnitsPartiallySettled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashPartiallySettled.getCodeName().get(), CashPartiallySettled);
		codesByName.put(GatedMultipleNAV.getCodeName().get(), GatedMultipleNAV);
		codesByName.put(GatedOneNAV.getCodeName().get(), GatedOneNAV);
		codesByName.put(UnitsCashPartiallySettled.getCodeName().get(), UnitsCashPartiallySettled);
		codesByName.put(UnitsPartiallySettled.getCodeName().get(), UnitsPartiallySettled);
	}

	public static SettledStatusReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettledStatusReason2Code[] values() {
		SettledStatusReason2Code[] values = new SettledStatusReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettledStatusReason2Code> {
		@Override
		public SettledStatusReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettledStatusReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}