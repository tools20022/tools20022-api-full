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
import com.tools20022.repository.codeset.EnergyLoadTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the energy delivery profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#OffPeak
 * EnergyLoadTypeCode.OffPeak}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#HourAndBlockHours
 * EnergyLoadTypeCode.HourAndBlockHours}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#Shaped
 * EnergyLoadTypeCode.Shaped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#GasDay
 * EnergyLoadTypeCode.GasDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#BaseLoad
 * EnergyLoadTypeCode.BaseLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#PeakLoad
 * EnergyLoadTypeCode.PeakLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode#Other
 * EnergyLoadTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
 * EnergyLoadType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyLoadTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the energy delivery profile."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EnergyLoadTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Off-Peak.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Off-Peak"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Off-Peak.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode OffPeak = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Off-Peak";
			definition = "Off-Peak.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "OFFP";
		}
	};
	/**
	 * Hour and block hours.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HABH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HourAndBlockHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hour and block hours."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode HourAndBlockHours = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HourAndBlockHours";
			definition = "Hour and block hours.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "HABH";
		}
	};
	/**
	 * Shaped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHPD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shaped"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shaped."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode Shaped = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shaped";
			definition = "Shaped.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "SHPD";
		}
	};
	/**
	 * Gas day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GASD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gas day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode GasDay = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GasDay";
			definition = "Gas day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "GASD";
		}
	};
	/**
	 * Base load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Base load."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode BaseLoad = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseLoad";
			definition = "Base load.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "BSLD";
		}
	};
	/**
	 * Peak load.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Peak load."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode PeakLoad = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakLoad";
			definition = "Peak load.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "PKLD";
		}
	};
	/**
	 * Other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
	 * EnergyLoadTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyLoadTypeCode Other = new EnergyLoadTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, EnergyLoadTypeCode> codesByName = new LinkedHashMap<>();

	protected EnergyLoadTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergyLoadTypeCode";
				definition = "Specifies the energy delivery profile.";
				derivation_lazy = () -> Arrays.asList(EnergyLoadType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EnergyLoadTypeCode.OffPeak, com.tools20022.repository.codeset.EnergyLoadTypeCode.HourAndBlockHours,
						com.tools20022.repository.codeset.EnergyLoadTypeCode.Shaped, com.tools20022.repository.codeset.EnergyLoadTypeCode.GasDay, com.tools20022.repository.codeset.EnergyLoadTypeCode.BaseLoad,
						com.tools20022.repository.codeset.EnergyLoadTypeCode.PeakLoad, com.tools20022.repository.codeset.EnergyLoadTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OffPeak.getCodeName().get(), OffPeak);
		codesByName.put(HourAndBlockHours.getCodeName().get(), HourAndBlockHours);
		codesByName.put(Shaped.getCodeName().get(), Shaped);
		codesByName.put(GasDay.getCodeName().get(), GasDay);
		codesByName.put(BaseLoad.getCodeName().get(), BaseLoad);
		codesByName.put(PeakLoad.getCodeName().get(), PeakLoad);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static EnergyLoadTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EnergyLoadTypeCode[] values() {
		EnergyLoadTypeCode[] values = new EnergyLoadTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EnergyLoadTypeCode> {
		@Override
		public EnergyLoadTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EnergyLoadTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}