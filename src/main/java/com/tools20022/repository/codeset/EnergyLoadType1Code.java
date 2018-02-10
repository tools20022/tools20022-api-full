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
import com.tools20022.repository.codeset.EnergyLoadType1Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#BaseLoad
 * EnergyLoadType1Code.BaseLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#GasDay
 * EnergyLoadType1Code.GasDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#HourAndBlockHours
 * EnergyLoadType1Code.HourAndBlockHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#OffPeak
 * EnergyLoadType1Code.OffPeak}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#Other
 * EnergyLoadType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#PeakLoad
 * EnergyLoadType1Code.PeakLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code#Shaped
 * EnergyLoadType1Code.Shaped}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EnergyLoadTypeCode
 * EnergyLoadTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyLoadType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the energy delivery profile."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EnergyLoadType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseLoad"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code BaseLoad = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.BaseLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasDay"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code GasDay = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GasDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.GasDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HourAndBlockHours"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code HourAndBlockHours = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HourAndBlockHours";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.HourAndBlockHours.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Off-Peak"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code OffPeak = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Off-Peak";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.OffPeak.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code Other = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakLoad"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code PeakLoad = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.PeakLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shaped"</li>
	 * </ul>
	 */
	public static final EnergyLoadType1Code Shaped = new EnergyLoadType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shaped";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyLoadType1Code.mmObject();
			codeName = EnergyLoadTypeCode.Shaped.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EnergyLoadType1Code> codesByName = new LinkedHashMap<>();

	protected EnergyLoadType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergyLoadType1Code";
				definition = "Specifies the energy delivery profile.";
				trace_lazy = () -> EnergyLoadTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EnergyLoadType1Code.BaseLoad, com.tools20022.repository.codeset.EnergyLoadType1Code.GasDay,
						com.tools20022.repository.codeset.EnergyLoadType1Code.HourAndBlockHours, com.tools20022.repository.codeset.EnergyLoadType1Code.OffPeak, com.tools20022.repository.codeset.EnergyLoadType1Code.Other,
						com.tools20022.repository.codeset.EnergyLoadType1Code.PeakLoad, com.tools20022.repository.codeset.EnergyLoadType1Code.Shaped);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BaseLoad.getCodeName().get(), BaseLoad);
		codesByName.put(GasDay.getCodeName().get(), GasDay);
		codesByName.put(HourAndBlockHours.getCodeName().get(), HourAndBlockHours);
		codesByName.put(OffPeak.getCodeName().get(), OffPeak);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PeakLoad.getCodeName().get(), PeakLoad);
		codesByName.put(Shaped.getCodeName().get(), Shaped);
	}

	public static EnergyLoadType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EnergyLoadType1Code[] values() {
		EnergyLoadType1Code[] values = new EnergyLoadType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EnergyLoadType1Code> {
		@Override
		public EnergyLoadType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EnergyLoadType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}