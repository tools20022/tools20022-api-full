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
import com.tools20022.repository.codeset.NonFinancialPartySectorCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the sector of a party with non financial activities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#AgricultureForestryAndFishing
 * NonFinancialPartySectorCode.AgricultureForestryAndFishing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#MiningAndQuarrying
 * NonFinancialPartySectorCode.MiningAndQuarrying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#Manufacturing
 * NonFinancialPartySectorCode.Manufacturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#ElectricityGasSteamAndAirConditioningSupply
 * NonFinancialPartySectorCode.ElectricityGasSteamAndAirConditioningSupply}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#WaterSupplySewerageWasteManagementAndRemediation
 * NonFinancialPartySectorCode.WaterSupplySewerageWasteManagementAndRemediation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#Construction
 * NonFinancialPartySectorCode.Construction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#MotorVehiclesAndMotorcycles
 * NonFinancialPartySectorCode.MotorVehiclesAndMotorcycles}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#InformationAndCommunication
 * NonFinancialPartySectorCode.InformationAndCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#TransportationAndStorage
 * NonFinancialPartySectorCode.TransportationAndStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#AccomodationAndFood
 * NonFinancialPartySectorCode.AccomodationAndFood}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#FinancialAndInsuranceActivity
 * NonFinancialPartySectorCode.FinancialAndInsuranceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#RealEstateActivity
 * NonFinancialPartySectorCode.RealEstateActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#ProfessionalScientificAndTechnicalActivity
 * NonFinancialPartySectorCode.ProfessionalScientificAndTechnicalActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#AdministrativeAndSupportServiceActivity
 * NonFinancialPartySectorCode.AdministrativeAndSupportServiceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#PublicAdministrationAndDefence
 * NonFinancialPartySectorCode.PublicAdministrationAndDefence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#Education
 * NonFinancialPartySectorCode.Education}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#HumanHealthAndSocialWorkActivity
 * NonFinancialPartySectorCode.HumanHealthAndSocialWorkActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#ArtsEntertainmentAndRecreation
 * NonFinancialPartySectorCode.ArtsEntertainmentAndRecreation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#OtherServiceActivity
 * NonFinancialPartySectorCode.OtherServiceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#ActivityOfHouseholdsAsEmployer
 * NonFinancialPartySectorCode.ActivityOfHouseholdsAsEmployer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode#ActivityOfExtraterritorialOrganisationAndBody
 * NonFinancialPartySectorCode.ActivityOfExtraterritorialOrganisationAndBody}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySector1Code
 * NonFinancialPartySector1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonFinancialPartySectorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the sector of a party with non financial activities."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonFinancialPartySectorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agriculture, forestry and fishing activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgricultureForestryAndFishing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agriculture, forestry and fishing activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode AgricultureForestryAndFishing = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgricultureForestryAndFishing";
			definition = "Agriculture, forestry and fishing activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "AGRI";
		}
	};
	/**
	 * Mining and quarrying activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MING"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiningAndQuarrying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mining and quarrying activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode MiningAndQuarrying = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiningAndQuarrying";
			definition = "Mining and quarrying activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "MING";
		}
	};
	/**
	 * Manufacturing activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAFG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manufacturing activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode Manufacturing = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturing";
			definition = "Manufacturing activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "MAFG";
		}
	};
	/**
	 * Electricity, gas, steam and air conditioning supply activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectricityGasSteamAndAirConditioningSupply"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electricity, gas, steam and air conditioning supply activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode ElectricityGasSteamAndAirConditioningSupply = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectricityGasSteamAndAirConditioningSupply";
			definition = "Electricity, gas, steam and air conditioning supply activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "SPLY";
		}
	};
	/**
	 * Water supply, sewerage, waste management and remediation activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaterSupplySewerageWasteManagementAndRemediation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Water supply, sewerage, waste management and remediation activities.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode WaterSupplySewerageWasteManagementAndRemediation = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaterSupplySewerageWasteManagementAndRemediation";
			definition = "Water supply, sewerage, waste management and remediation activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "WTER";
		}
	};
	/**
	 * Construction activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Construction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Construction activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode Construction = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Construction";
			definition = "Construction activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "CSTR";
		}
	};
	/**
	 * Wholesale and retail trade, repair of motor vehicles and motorcycles.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MotorVehiclesAndMotorcycles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wholesale and retail trade, repair of motor vehicles and motorcycles."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode MotorVehiclesAndMotorcycles = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MotorVehiclesAndMotorcycles";
			definition = "Wholesale and retail trade, repair of motor vehicles and motorcycles.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "WRRM";
		}
	};
	/**
	 * Information and communication activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAndCommunication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information and communication activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode InformationAndCommunication = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAndCommunication";
			definition = "Information and communication activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "INCO";
		}
	};
	/**
	 * Transportation and storage activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportationAndStorage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transportation and storage activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode TransportationAndStorage = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportationAndStorage";
			definition = "Transportation and storage activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "TRAS";
		}
	};
	/**
	 * Accommodation and food service activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccomodationAndFood"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accommodation and food service activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode AccomodationAndFood = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccomodationAndFood";
			definition = "Accommodation and food service activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "ACAF";
		}
	};
	/**
	 * Financial and insurance activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAndInsuranceActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial and insurance activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode FinancialAndInsuranceActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAndInsuranceActivity";
			definition = "Financial and insurance activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "FINA";
		}
	};
	/**
	 * Real estate activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Real estate activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode RealEstateActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateActivity";
			definition = "Real estate activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "RESA";
		}
	};
	/**
	 * Professional, scientific and technical activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfessionalScientificAndTechnicalActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Professional, scientific and technical activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode ProfessionalScientificAndTechnicalActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfessionalScientificAndTechnicalActivity";
			definition = "Professional, scientific and technical activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "PSTA";
		}
	};
	/**
	 * Administrative and support service activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrativeAndSupportServiceActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Administrative and support service activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode AdministrativeAndSupportServiceActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdministrativeAndSupportServiceActivity";
			definition = "Administrative and support service activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "ASSA";
		}
	};
	/**
	 * Public administration and defence, compulsory social security.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PADS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicAdministrationAndDefence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Public administration and defence, compulsory social security.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode PublicAdministrationAndDefence = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicAdministrationAndDefence";
			definition = "Public administration and defence, compulsory social security.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "PADS";
		}
	};
	/**
	 * Education activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDUC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Education"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Education activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode Education = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Education";
			definition = "Education activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "EDUC";
		}
	};
	/**
	 * Human health and social work activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HHSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HumanHealthAndSocialWorkActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Human health and social work activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode HumanHealthAndSocialWorkActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HumanHealthAndSocialWorkActivity";
			definition = "Human health and social work activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "HHSW";
		}
	};
	/**
	 * Arts, entertainment and recreation activities.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArtsEntertainmentAndRecreation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Arts, entertainment and recreation activities.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode ArtsEntertainmentAndRecreation = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArtsEntertainmentAndRecreation";
			definition = "Arts, entertainment and recreation activities.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "AEAR";
		}
	};
	/**
	 * Other service activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherServiceActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other service activities."</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode OtherServiceActivity = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherServiceActivity";
			definition = "Other service activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "OTSA";
		}
	};
	/**
	 * Activities of households as employers; undifferentiated goods – and
	 * services –producing activities of households for own use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AHAE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityOfHouseholdsAsEmployer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Activities of households as employers; undifferentiated goods – and services –producing activities of households for own use."
	 * </li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode ActivityOfHouseholdsAsEmployer = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityOfHouseholdsAsEmployer";
			definition = "Activities of households as employers; undifferentiated goods – and services –producing activities of households for own use.";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "AHAE";
		}
	};
	/**
	 * Activities of extraterritorial organisations and bodies.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySectorCode
	 * NonFinancialPartySectorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AEOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityOfExtraterritorialOrganisationAndBody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Activities of extraterritorial organisations and bodies.\r\n"</li>
	 * </ul>
	 */
	public static final NonFinancialPartySectorCode ActivityOfExtraterritorialOrganisationAndBody = new NonFinancialPartySectorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityOfExtraterritorialOrganisationAndBody";
			definition = "Activities of extraterritorial organisations and bodies.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.NonFinancialPartySectorCode.mmObject();
			codeName = "AEOB";
		}
	};
	final static private LinkedHashMap<String, NonFinancialPartySectorCode> codesByName = new LinkedHashMap<>();

	protected NonFinancialPartySectorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonFinancialPartySectorCode";
				definition = "Specifies the sector of a party with non financial activities.";
				derivation_lazy = () -> Arrays.asList(NonFinancialPartySector1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonFinancialPartySectorCode.AgricultureForestryAndFishing, com.tools20022.repository.codeset.NonFinancialPartySectorCode.MiningAndQuarrying,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.Manufacturing, com.tools20022.repository.codeset.NonFinancialPartySectorCode.ElectricityGasSteamAndAirConditioningSupply,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.WaterSupplySewerageWasteManagementAndRemediation, com.tools20022.repository.codeset.NonFinancialPartySectorCode.Construction,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.MotorVehiclesAndMotorcycles, com.tools20022.repository.codeset.NonFinancialPartySectorCode.InformationAndCommunication,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.TransportationAndStorage, com.tools20022.repository.codeset.NonFinancialPartySectorCode.AccomodationAndFood,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.FinancialAndInsuranceActivity, com.tools20022.repository.codeset.NonFinancialPartySectorCode.RealEstateActivity,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.ProfessionalScientificAndTechnicalActivity, com.tools20022.repository.codeset.NonFinancialPartySectorCode.AdministrativeAndSupportServiceActivity,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.PublicAdministrationAndDefence, com.tools20022.repository.codeset.NonFinancialPartySectorCode.Education,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.HumanHealthAndSocialWorkActivity, com.tools20022.repository.codeset.NonFinancialPartySectorCode.ArtsEntertainmentAndRecreation,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.OtherServiceActivity, com.tools20022.repository.codeset.NonFinancialPartySectorCode.ActivityOfHouseholdsAsEmployer,
						com.tools20022.repository.codeset.NonFinancialPartySectorCode.ActivityOfExtraterritorialOrganisationAndBody);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgricultureForestryAndFishing.getCodeName().get(), AgricultureForestryAndFishing);
		codesByName.put(MiningAndQuarrying.getCodeName().get(), MiningAndQuarrying);
		codesByName.put(Manufacturing.getCodeName().get(), Manufacturing);
		codesByName.put(ElectricityGasSteamAndAirConditioningSupply.getCodeName().get(), ElectricityGasSteamAndAirConditioningSupply);
		codesByName.put(WaterSupplySewerageWasteManagementAndRemediation.getCodeName().get(), WaterSupplySewerageWasteManagementAndRemediation);
		codesByName.put(Construction.getCodeName().get(), Construction);
		codesByName.put(MotorVehiclesAndMotorcycles.getCodeName().get(), MotorVehiclesAndMotorcycles);
		codesByName.put(InformationAndCommunication.getCodeName().get(), InformationAndCommunication);
		codesByName.put(TransportationAndStorage.getCodeName().get(), TransportationAndStorage);
		codesByName.put(AccomodationAndFood.getCodeName().get(), AccomodationAndFood);
		codesByName.put(FinancialAndInsuranceActivity.getCodeName().get(), FinancialAndInsuranceActivity);
		codesByName.put(RealEstateActivity.getCodeName().get(), RealEstateActivity);
		codesByName.put(ProfessionalScientificAndTechnicalActivity.getCodeName().get(), ProfessionalScientificAndTechnicalActivity);
		codesByName.put(AdministrativeAndSupportServiceActivity.getCodeName().get(), AdministrativeAndSupportServiceActivity);
		codesByName.put(PublicAdministrationAndDefence.getCodeName().get(), PublicAdministrationAndDefence);
		codesByName.put(Education.getCodeName().get(), Education);
		codesByName.put(HumanHealthAndSocialWorkActivity.getCodeName().get(), HumanHealthAndSocialWorkActivity);
		codesByName.put(ArtsEntertainmentAndRecreation.getCodeName().get(), ArtsEntertainmentAndRecreation);
		codesByName.put(OtherServiceActivity.getCodeName().get(), OtherServiceActivity);
		codesByName.put(ActivityOfHouseholdsAsEmployer.getCodeName().get(), ActivityOfHouseholdsAsEmployer);
		codesByName.put(ActivityOfExtraterritorialOrganisationAndBody.getCodeName().get(), ActivityOfExtraterritorialOrganisationAndBody);
	}

	public static NonFinancialPartySectorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonFinancialPartySectorCode[] values() {
		NonFinancialPartySectorCode[] values = new NonFinancialPartySectorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonFinancialPartySectorCode> {
		@Override
		public NonFinancialPartySectorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonFinancialPartySectorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}