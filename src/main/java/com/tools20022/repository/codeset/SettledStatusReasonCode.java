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
import com.tools20022.repository.codeset.SettledStatusReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode#UnitsPartiallySettled
 * SettledStatusReasonCode.UnitsPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode#CashPartiallySettled
 * SettledStatusReasonCode.CashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode#UnitsCashPartiallySettled
 * SettledStatusReasonCode.UnitsCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode#GatedOneNAV
 * SettledStatusReasonCode.GatedOneNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode#GatedMultipleNAV
 * SettledStatusReasonCode.GatedMultipleNAV}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettledStatusReason1Code
 * SettledStatusReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
 * SettledStatusReason2Code}</li>
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
 * <li>"UPST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettledStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a partially settled status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettledStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Units are partially settled
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
	 * SettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Units are partially settled"</li>
	 * </ul>
	 */
	public static final SettledStatusReasonCode UnitsPartiallySettled = new SettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			definition = "Units are partially settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReasonCode.mmObject();
			codeName = "UPST";
		}
	};
	/**
	 * Cash is partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
	 * SettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash is partially settled."</li>
	 * </ul>
	 */
	public static final SettledStatusReasonCode CashPartiallySettled = new SettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			definition = "Cash is partially settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReasonCode.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Units and cash are both partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
	 * SettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Units and cash are both partially settled."</li>
	 * </ul>
	 */
	public static final SettledStatusReasonCode UnitsCashPartiallySettled = new SettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			definition = "Units and cash are both partially settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReasonCode.mmObject();
			codeName = "UCPS";
		}
	};
	/**
	 * Redemption has been gated, all settlement will be done at the same price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
	 * SettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GAT1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatedOneNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption has been gated, all settlement will be done at the same price. "
	 * </li>
	 * </ul>
	 */
	public static final SettledStatusReasonCode GatedOneNAV = new SettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatedOneNAV";
			definition = "Redemption has been gated, all settlement will be done at the same price. ";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReasonCode.mmObject();
			codeName = "GAT1";
		}
	};
	/**
	 * Redemption has been gated. Multiple redemptions and multiple prices will
	 * be required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReasonCode
	 * SettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatedMultipleNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption has been gated. Multiple redemptions and multiple prices will be required."
	 * </li>
	 * </ul>
	 */
	public static final SettledStatusReasonCode GatedMultipleNAV = new SettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatedMultipleNAV";
			definition = "Redemption has been gated. Multiple redemptions and multiple prices will be required.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettledStatusReasonCode.mmObject();
			codeName = "GATM";
		}
	};
	final static private LinkedHashMap<String, SettledStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected SettledStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UPST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettledStatusReasonCode";
				definition = "Specifies the reason for a partially settled status.";
				derivation_lazy = () -> Arrays.asList(SettledStatusReason1Code.mmObject(), SettledStatusReason2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettledStatusReasonCode.UnitsPartiallySettled, com.tools20022.repository.codeset.SettledStatusReasonCode.CashPartiallySettled,
						com.tools20022.repository.codeset.SettledStatusReasonCode.UnitsCashPartiallySettled, com.tools20022.repository.codeset.SettledStatusReasonCode.GatedOneNAV,
						com.tools20022.repository.codeset.SettledStatusReasonCode.GatedMultipleNAV);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnitsPartiallySettled.getCodeName().get(), UnitsPartiallySettled);
		codesByName.put(CashPartiallySettled.getCodeName().get(), CashPartiallySettled);
		codesByName.put(UnitsCashPartiallySettled.getCodeName().get(), UnitsCashPartiallySettled);
		codesByName.put(GatedOneNAV.getCodeName().get(), GatedOneNAV);
		codesByName.put(GatedMultipleNAV.getCodeName().get(), GatedMultipleNAV);
	}

	public static SettledStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettledStatusReasonCode[] values() {
		SettledStatusReasonCode[] values = new SettledStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettledStatusReasonCode> {
		@Override
		public SettledStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettledStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}