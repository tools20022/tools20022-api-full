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
import com.tools20022.repository.codeset.EnergyQuantityUnitCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#KWhPerHour
 * EnergyQuantityUnitCode.KWhPerHour}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#KW
 * EnergyQuantityUnitCode.KW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#KWhPerDay
 * EnergyQuantityUnitCode.KWhPerDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#MW
 * EnergyQuantityUnitCode.MW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#MWhPerDay
 * EnergyQuantityUnitCode.MWhPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#MWhPerHour
 * EnergyQuantityUnitCode.MWhPerHour}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#GW
 * EnergyQuantityUnitCode.GW}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#GWhPerDay
 * EnergyQuantityUnitCode.GWhPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#GWhPerHour
 * EnergyQuantityUnitCode.GWhPerHour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#ThermPerDay
 * EnergyQuantityUnitCode.ThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#MThermPerDay
 * EnergyQuantityUnitCode.MThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#KThermPerDay
 * EnergyQuantityUnitCode.KThermPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#CMPerDay
 * EnergyQuantityUnitCode.CMPerDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode#MCMPerDay
 * EnergyQuantityUnitCode.MCMPerDay}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EnergyQuantityUnit1Code
 * EnergyQuantityUnit1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyQuantityUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an energy quantity unit."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EnergyQuantityUnitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Kilo Watt hour per hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Kilo Watt hour per hour."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode KWhPerHour = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KWhPerHour";
			definition = "Kilo Watt hour per hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "KWHH";
		}
	};
	/**
	 * Kilo Watt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Kilo Watt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode KW = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KW";
			definition = "Kilo Watt.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "KWAT";
		}
	};
	/**
	 * Kilo Watt hour per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KWHD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Kilo Watt hour per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode KWhPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KWhPerDay";
			definition = "Kilo Watt hour per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "KWHD";
		}
	};
	/**
	 * Mega Watt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mega Watt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode MW = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MW";
			definition = "Mega Watt.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "MWAT";
		}
	};
	/**
	 * Mega Watt hour per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mega Watt hour per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode MWhPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MWhPerDay";
			definition = "Mega Watt hour per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "MWHD";
		}
	};
	/**
	 * Mega Watt hour per hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MWHH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mega Watt hour per hour."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode MWhPerHour = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MWhPerHour";
			definition = "Mega Watt hour per hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "MWHH";
		}
	};
	/**
	 * Giga Watt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GWAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Giga Watt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode GW = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GW";
			definition = "Giga Watt.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "GWAT";
		}
	};
	/**
	 * Giga Watt hour per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GWHD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GWhPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Giga Watt hour per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode GWhPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GWhPerDay";
			definition = "Giga Watt hour per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "GWHD";
		}
	};
	/**
	 * Giga Watt hour per hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GWHH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GWhPerHour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Giga Watt hour per hour."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode GWhPerHour = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GWhPerHour";
			definition = "Giga Watt hour per hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "GWHH";
		}
	};
	/**
	 * Therm per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THMD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Therm per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode ThermPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThermPerDay";
			definition = "Therm per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "THMD";
		}
	};
	/**
	 * MTherm per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTMD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MTherm per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode MThermPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MThermPerDay";
			definition = "MTherm per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "MTMD";
		}
	};
	/**
	 * KTherm per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KTMD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KThermPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "KTherm per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode KThermPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KThermPerDay";
			definition = "KTherm per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "KTMD";
		}
	};
	/**
	 * Cm per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cm per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode CMPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMPerDay";
			definition = "Cm per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "CMPD";
		}
	};
	/**
	 * Mcm per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyQuantityUnitCode
	 * EnergyQuantityUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCMD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MCMPerDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mcm per day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EnergyQuantityUnitCode MCMPerDay = new EnergyQuantityUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MCMPerDay";
			definition = "Mcm per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EnergyQuantityUnitCode.mmObject();
			codeName = "MCMD";
		}
	};
	final static private LinkedHashMap<String, EnergyQuantityUnitCode> codesByName = new LinkedHashMap<>();

	protected EnergyQuantityUnitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergyQuantityUnitCode";
				definition = "Specifies an energy quantity unit.";
				derivation_lazy = () -> Arrays.asList(EnergyQuantityUnit1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EnergyQuantityUnitCode.KWhPerHour, com.tools20022.repository.codeset.EnergyQuantityUnitCode.KW,
						com.tools20022.repository.codeset.EnergyQuantityUnitCode.KWhPerDay, com.tools20022.repository.codeset.EnergyQuantityUnitCode.MW, com.tools20022.repository.codeset.EnergyQuantityUnitCode.MWhPerDay,
						com.tools20022.repository.codeset.EnergyQuantityUnitCode.MWhPerHour, com.tools20022.repository.codeset.EnergyQuantityUnitCode.GW, com.tools20022.repository.codeset.EnergyQuantityUnitCode.GWhPerDay,
						com.tools20022.repository.codeset.EnergyQuantityUnitCode.GWhPerHour, com.tools20022.repository.codeset.EnergyQuantityUnitCode.ThermPerDay, com.tools20022.repository.codeset.EnergyQuantityUnitCode.MThermPerDay,
						com.tools20022.repository.codeset.EnergyQuantityUnitCode.KThermPerDay, com.tools20022.repository.codeset.EnergyQuantityUnitCode.CMPerDay, com.tools20022.repository.codeset.EnergyQuantityUnitCode.MCMPerDay);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(KWhPerHour.getCodeName().get(), KWhPerHour);
		codesByName.put(KW.getCodeName().get(), KW);
		codesByName.put(KWhPerDay.getCodeName().get(), KWhPerDay);
		codesByName.put(MW.getCodeName().get(), MW);
		codesByName.put(MWhPerDay.getCodeName().get(), MWhPerDay);
		codesByName.put(MWhPerHour.getCodeName().get(), MWhPerHour);
		codesByName.put(GW.getCodeName().get(), GW);
		codesByName.put(GWhPerDay.getCodeName().get(), GWhPerDay);
		codesByName.put(GWhPerHour.getCodeName().get(), GWhPerHour);
		codesByName.put(ThermPerDay.getCodeName().get(), ThermPerDay);
		codesByName.put(MThermPerDay.getCodeName().get(), MThermPerDay);
		codesByName.put(KThermPerDay.getCodeName().get(), KThermPerDay);
		codesByName.put(CMPerDay.getCodeName().get(), CMPerDay);
		codesByName.put(MCMPerDay.getCodeName().get(), MCMPerDay);
	}

	public static EnergyQuantityUnitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EnergyQuantityUnitCode[] values() {
		EnergyQuantityUnitCode[] values = new EnergyQuantityUnitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EnergyQuantityUnitCode> {
		@Override
		public EnergyQuantityUnitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EnergyQuantityUnitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}