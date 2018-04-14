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
import com.tools20022.repository.codeset.EnergyQuantityUnit1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an energy quantity unit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#ThermPerDay
 * EnergyQuantityUnit1Code.ThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#MWhPerHour
 * EnergyQuantityUnit1Code.MWhPerHour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#MWhPerDay
 * EnergyQuantityUnit1Code.MWhPerDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#MW
 * EnergyQuantityUnit1Code.MW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#MThermPerDay
 * EnergyQuantityUnit1Code.MThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#MCMPerDay
 * EnergyQuantityUnit1Code.MCMPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#KWhPerHour
 * EnergyQuantityUnit1Code.KWhPerHour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#KWhPerDay
 * EnergyQuantityUnit1Code.KWhPerDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#KW
 * EnergyQuantityUnit1Code.KW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#KThermPerDay
 * EnergyQuantityUnit1Code.KThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#GWhPerHour
 * EnergyQuantityUnit1Code.GWhPerHour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#GWhPerDay
 * EnergyQuantityUnit1Code.GWhPerDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code#GW
 * EnergyQuantityUnit1Code.GW}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
 * EnergyQuantityUnitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyQuantityUnit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an energy quantity unit."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EnergyQuantityUnit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code ThermPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThermPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.ThermPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code MWhPerHour = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MWhPerHour";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.MWhPerHour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code MWhPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MWhPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.MWhPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code MW = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MW";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.MW.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code MThermPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MThermPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.MThermPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MCMPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code MCMPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MCMPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.MCMPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code KWhPerHour = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KWhPerHour";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.KWhPerHour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code KWhPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KWhPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.KWhPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code KW = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KW";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.KW.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code KThermPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KThermPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.KThermPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code GWhPerHour = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GWhPerHour";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.GWhPerHour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code GWhPerDay = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GWhPerDay";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.GWhPerDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
	 * EnergyQuantityUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnit1Code GW = new EnergyQuantityUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GW";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnit1Code.mmObject();
			codeName = EnergyQuantityUnitCode.GW.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EnergyQuantityUnit1Code> codesByName = new LinkedHashMap<>();

	protected EnergyQuantityUnit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergyQuantityUnit1Code";
				definition = "Specifies an energy quantity unit.";
				trace_lazy = () -> EnergyQuantityUnitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EnergyQuantityUnit1Code.ThermPerDay, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.MWhPerHour,
						com.tools20022.repository.codeset.EnergyQuantityUnit1Code.MWhPerDay, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.MW, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.MThermPerDay,
						com.tools20022.repository.codeset.EnergyQuantityUnit1Code.MCMPerDay, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.KWhPerHour, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.KWhPerDay,
						com.tools20022.repository.codeset.EnergyQuantityUnit1Code.KW, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.KThermPerDay, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.GWhPerHour,
						com.tools20022.repository.codeset.EnergyQuantityUnit1Code.GWhPerDay, com.tools20022.repository.codeset.EnergyQuantityUnit1Code.GW);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ThermPerDay.getCodeName().get(), ThermPerDay);
		codesByName.put(MWhPerHour.getCodeName().get(), MWhPerHour);
		codesByName.put(MWhPerDay.getCodeName().get(), MWhPerDay);
		codesByName.put(MW.getCodeName().get(), MW);
		codesByName.put(MThermPerDay.getCodeName().get(), MThermPerDay);
		codesByName.put(MCMPerDay.getCodeName().get(), MCMPerDay);
		codesByName.put(KWhPerHour.getCodeName().get(), KWhPerHour);
		codesByName.put(KWhPerDay.getCodeName().get(), KWhPerDay);
		codesByName.put(KW.getCodeName().get(), KW);
		codesByName.put(KThermPerDay.getCodeName().get(), KThermPerDay);
		codesByName.put(GWhPerHour.getCodeName().get(), GWhPerHour);
		codesByName.put(GWhPerDay.getCodeName().get(), GWhPerDay);
		codesByName.put(GW.getCodeName().get(), GW);
	}

	public static EnergyQuantityUnit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EnergyQuantityUnit1Code[] values() {
		EnergyQuantityUnit1Code[] values = new EnergyQuantityUnit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EnergyQuantityUnit1Code> {
		@Override
		public EnergyQuantityUnit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EnergyQuantityUnit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}