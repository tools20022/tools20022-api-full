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
import com.tools20022.repository.codeset.SettledStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a partially settled status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code#UnitsPartiallySettled
 * SettledStatusReason1Code.UnitsPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code#CashPartiallySettled
 * SettledStatusReason1Code.CashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code#UnitsCashPartiallySettled
 * SettledStatusReason1Code.UnitsCashPartiallySettled}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UPST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettledStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a partially settled status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettledStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code
	 * SettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason1Code UnitsPartiallySettled = new SettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason1Code.mmObject();
			codeName = SettledStatusReasonCode.UnitsPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code
	 * SettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason1Code CashPartiallySettled = new SettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason1Code.mmObject();
			codeName = SettledStatusReasonCode.CashPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code
	 * SettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * </ul>
	 */
	public static final SettledStatusReason1Code UnitsCashPartiallySettled = new SettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReason1Code.mmObject();
			codeName = SettledStatusReasonCode.UnitsCashPartiallySettled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettledStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected SettledStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UPST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettledStatusReason1Code";
				definition = "Specifies the reason for a partially settled status.";
				trace_lazy = () -> SettledStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettledStatusReason1Code.UnitsPartiallySettled, com.tools20022.repository.codeset.SettledStatusReason1Code.CashPartiallySettled,
						com.tools20022.repository.codeset.SettledStatusReason1Code.UnitsCashPartiallySettled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnitsPartiallySettled.getCodeName().get(), UnitsPartiallySettled);
		codesByName.put(CashPartiallySettled.getCodeName().get(), CashPartiallySettled);
		codesByName.put(UnitsCashPartiallySettled.getCodeName().get(), UnitsCashPartiallySettled);
	}

	public static SettledStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettledStatusReason1Code[] values() {
		SettledStatusReason1Code[] values = new SettledStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettledStatusReason1Code> {
		@Override
		public SettledStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettledStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}