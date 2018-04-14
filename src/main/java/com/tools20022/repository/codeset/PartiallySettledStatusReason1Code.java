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
import com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#UnitsPartiallySettled
 * PartiallySettledStatusReason1Code.UnitsPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#CashPartiallySettled
 * PartiallySettledStatusReason1Code.CashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#UnitsCashPartiallySettled
 * PartiallySettledStatusReason1Code.UnitsCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#HoldBackPendingAudit
 * PartiallySettledStatusReason1Code.HoldBackPendingAudit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#HoldBackLiquidation
 * PartiallySettledStatusReason1Code.HoldBackLiquidation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
 * PartiallySettledStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartiallySettledStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a partially settled status."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartiallySettledStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReason1Code UnitsPartiallySettled = new PartiallySettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.mmObject();
			codeName = PartiallySettledStatusReasonCode.UnitsPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReason1Code CashPartiallySettled = new PartiallySettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.mmObject();
			codeName = PartiallySettledStatusReasonCode.CashPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReason1Code UnitsCashPartiallySettled = new PartiallySettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.mmObject();
			codeName = PartiallySettledStatusReasonCode.UnitsCashPartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackPendingAudit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReason1Code HoldBackPendingAudit = new PartiallySettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackPendingAudit";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.mmObject();
			codeName = PartiallySettledStatusReasonCode.HoldBackPendingAudit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackLiquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReason1Code HoldBackLiquidation = new PartiallySettledStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackLiquidation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.mmObject();
			codeName = PartiallySettledStatusReasonCode.HoldBackLiquidation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartiallySettledStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected PartiallySettledStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UPST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartiallySettledStatusReason1Code";
				definition = "Specifies the reason for a partially settled status.";
				trace_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.UnitsPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.CashPartiallySettled,
						com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.UnitsCashPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.HoldBackPendingAudit,
						com.tools20022.repository.codeset.PartiallySettledStatusReason1Code.HoldBackLiquidation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnitsPartiallySettled.getCodeName().get(), UnitsPartiallySettled);
		codesByName.put(CashPartiallySettled.getCodeName().get(), CashPartiallySettled);
		codesByName.put(UnitsCashPartiallySettled.getCodeName().get(), UnitsCashPartiallySettled);
		codesByName.put(HoldBackPendingAudit.getCodeName().get(), HoldBackPendingAudit);
		codesByName.put(HoldBackLiquidation.getCodeName().get(), HoldBackLiquidation);
	}

	public static PartiallySettledStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartiallySettledStatusReason1Code[] values() {
		PartiallySettledStatusReason1Code[] values = new PartiallySettledStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartiallySettledStatusReason1Code> {
		@Override
		public PartiallySettledStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartiallySettledStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}