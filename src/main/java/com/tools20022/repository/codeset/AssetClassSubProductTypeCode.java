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
import com.tools20022.repository.codeset.AssetClassSubProductTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the sub-product types for specific asset classes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Dairy
 * AssetClassSubProductTypeCode.Dairy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Forestry
 * AssetClassSubProductTypeCode.Forestry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#GrainOilSeeds
 * AssetClassSubProductTypeCode.GrainOilSeeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Livestock
 * AssetClassSubProductTypeCode.Livestock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#OliveOil
 * AssetClassSubProductTypeCode.OliveOil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Softs
 * AssetClassSubProductTypeCode.Softs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Coal
 * AssetClassSubProductTypeCode.Coal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Electricity
 * AssetClassSubProductTypeCode.Electricity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#InterEnergy
 * AssetClassSubProductTypeCode.InterEnergy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#NaturalGas
 * AssetClassSubProductTypeCode.NaturalGas}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Oil
 * AssetClassSubProductTypeCode.Oil}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Precious
 * AssetClassSubProductTypeCode.Precious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#NonPrecious
 * AssetClassSubProductTypeCode.NonPrecious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Emission
 * AssetClassSubProductTypeCode.Emission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Weather
 * AssetClassSubProductTypeCode.Weather}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Freight
 * AssetClassSubProductTypeCode.Freight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#MultiCommodityExotic
 * AssetClassSubProductTypeCode.MultiCommodityExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#RenewableEnergy
 * AssetClassSubProductTypeCode.RenewableEnergy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#LightEnds
 * AssetClassSubProductTypeCode.LightEnds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Distillates
 * AssetClassSubProductTypeCode.Distillates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Carbon
 * AssetClassSubProductTypeCode.Carbon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Ammonia
 * AssetClassSubProductTypeCode.Ammonia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#DiammoniumPhosphate
 * AssetClassSubProductTypeCode.DiammoniumPhosphate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Potash
 * AssetClassSubProductTypeCode.Potash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Sulphur
 * AssetClassSubProductTypeCode.Sulphur}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Urea
 * AssetClassSubProductTypeCode.Urea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#UreaAndAmmoniumNitrite
 * AssetClassSubProductTypeCode.UreaAndAmmoniumNitrite}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Construction
 * AssetClassSubProductTypeCode.Construction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Manufacturing
 * AssetClassSubProductTypeCode.Manufacturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Containerboard
 * AssetClassSubProductTypeCode.Containerboard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Newsprint
 * AssetClassSubProductTypeCode.Newsprint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Pulp
 * AssetClassSubProductTypeCode.Pulp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#RecoveredPaper
 * AssetClassSubProductTypeCode.RecoveredPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Plastic
 * AssetClassSubProductTypeCode.Plastic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#CarbonRelated
 * AssetClassSubProductTypeCode.CarbonRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Wet
 * AssetClassSubProductTypeCode.Wet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Dry
 * AssetClassSubProductTypeCode.Dry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Seafood
 * AssetClassSubProductTypeCode.Seafood}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Grain
 * AssetClassSubProductTypeCode.Grain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Deliverable
 * AssetClassSubProductTypeCode.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#NonDeliverable
 * AssetClassSubProductTypeCode.NonDeliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Other
 * AssetClassSubProductTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#Potato
 * AssetClassSubProductTypeCode.Potato}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode#ContainerShip
 * AssetClassSubProductTypeCode.ContainerShip}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType1Code
 * AssetClassSubProductType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType2Code
 * AssetClassSubProductType2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType3Code
 * AssetClassSubProductType3Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType5Code
 * AssetClassSubProductType5Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType6Code
 * AssetClassSubProductType6Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType7Code
 * AssetClassSubProductType7Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType8Code
 * AssetClassSubProductType8Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType10Code
 * AssetClassSubProductType10Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType15Code
 * AssetClassSubProductType15Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType16Code
 * AssetClassSubProductType16Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType18Code
 * AssetClassSubProductType18Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType19Code
 * AssetClassSubProductType19Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType28Code
 * AssetClassSubProductType28Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType33Code
 * AssetClassSubProductType33Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType25Code
 * AssetClassSubProductType25Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType27Code
 * AssetClassSubProductType27Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType26Code
 * AssetClassSubProductType26Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType32Code
 * AssetClassSubProductType32Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType41Code
 * AssetClassSubProductType41Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType45Code
 * AssetClassSubProductType45Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType21Code
 * AssetClassSubProductType21Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType40Code
 * AssetClassSubProductType40Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType48Code
 * AssetClassSubProductType48Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType23Code
 * AssetClassSubProductType23Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType39Code
 * AssetClassSubProductType39Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType29Code
 * AssetClassSubProductType29Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType22Code
 * AssetClassSubProductType22Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType42Code
 * AssetClassSubProductType42Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType35Code
 * AssetClassSubProductType35Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType44Code
 * AssetClassSubProductType44Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType20Code
 * AssetClassSubProductType20Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType24Code
 * AssetClassSubProductType24Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType30Code
 * AssetClassSubProductType30Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType31Code
 * AssetClassSubProductType31Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType34Code
 * AssetClassSubProductType34Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType36Code
 * AssetClassSubProductType36Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType37Code
 * AssetClassSubProductType37Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType38Code
 * AssetClassSubProductType38Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType43Code
 * AssetClassSubProductType43Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType46Code
 * AssetClassSubProductType46Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType47Code
 * AssetClassSubProductType47Code}</li>
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
 * "AssetClassSubProductTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the sub-product types for specific asset classes."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commodity of type dairy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dairy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type dairy."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Dairy = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dairy";
			definition = "Commodity of type dairy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "DIRY";
		}
	};
	/**
	 * Commodity of type forestry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forestry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type forestry."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Forestry = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forestry";
			definition = "Commodity of type forestry.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "FRST";
		}
	};
	/**
	 * Commodity of type grain oil seeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrainOilSeeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type grain oil seeds."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode GrainOilSeeds = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrainOilSeeds";
			definition = "Commodity of type grain oil seeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Commodity of type livestock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSTK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Livestock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type livestock."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Livestock = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Livestock";
			definition = "Commodity of type livestock.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "LSTK";
		}
	};
	/**
	 * Commodity of type olive oil.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OliveOil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type olive oil."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode OliveOil = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OliveOil";
			definition = "Commodity of type olive oil.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "OOLI";
		}
	};
	/**
	 * Commodity of type softs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Softs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type softs."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Softs = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Softs";
			definition = "Commodity of type softs.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * Commodity of type coal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type coal."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Coal = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coal";
			definition = "Commodity of type coal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "COAL";
		}
	};
	/**
	 * Commodity of type electricity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electricity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type electricity."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Electricity = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electricity";
			definition = "Commodity of type electricity.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Commodity of type inter energy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterEnergy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type inter energy."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode InterEnergy = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterEnergy";
			definition = "Commodity of type inter energy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "INRG";
		}
	};
	/**
	 * Commodity of type natural gas.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NGAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalGas"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type natural gas."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode NaturalGas = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalGas";
			definition = "Commodity of type natural gas.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "NGAS";
		}
	};
	/**
	 * Commodity of type oil.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OILP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type oil."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Oil = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oil";
			definition = "Commodity of type oil.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "OILP";
		}
	};
	/**
	 * Commodity of type precious metals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Precious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type precious metals."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Precious = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Precious";
			definition = "Commodity of type precious metals.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "PRME";
		}
	};
	/**
	 * Commodity of type non precious metals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPrecious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type non precious metals."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode NonPrecious = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPrecious";
			definition = "Commodity of type non precious metals.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "NPRM";
		}
	};
	/**
	 * Commodity of type emission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Emission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type emission."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Emission = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Emission";
			definition = "Commodity of type emission.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "EMIS";
		}
	};
	/**
	 * Commodity of type weather.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weather"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type weather."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Weather = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weather";
			definition = "Commodity of type weather.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "WTHR";
		}
	};
	/**
	 * Commodity of type freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Freight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type freight."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Freight = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Commodity of type freight.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "FRGT";
		}
	};
	/**
	 * Commodity of type multi commodity exotic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCommodityExotic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type multi commodity exotic."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode MultiCommodityExotic = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCommodityExotic";
			definition = "Commodity of type multi commodity exotic.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "MCEX";
		}
	};
	/**
	 * Commodity of type renewable energy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenewableEnergy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type renewable energy."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode RenewableEnergy = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewableEnergy";
			definition = "Commodity of type renewable energy.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "RNNG";
		}
	};
	/**
	 * Commodity of type light ends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LGHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LightEnds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type light ends."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode LightEnds = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LightEnds";
			definition = "Commodity of type light ends.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "LGHT";
		}
	};
	/**
	 * Commodity of type distillates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distillates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type distillates."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Distillates = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distillates";
			definition = "Commodity of type distillates.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Commodity of type carbon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRBN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carbon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type carbon."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Carbon = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carbon";
			definition = "Commodity of type carbon.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "CRBN";
		}
	};
	/**
	 * Commodity of type ammonia.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ammonia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type ammonia."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Ammonia = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ammonia";
			definition = "Commodity of type ammonia.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "AMMO";
		}
	};
	/**
	 * Commodity of type diammonium phosphate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiammoniumPhosphate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type diammonium phosphate."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode DiammoniumPhosphate = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiammoniumPhosphate";
			definition = "Commodity of type diammonium phosphate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "DAPH";
		}
	};
	/**
	 * Commodity of type potash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Potash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type potash."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Potash = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Potash";
			definition = "Commodity of type potash.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "PTSH";
		}
	};
	/**
	 * Commodity of type sulphur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sulphur"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type sulphur."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Sulphur = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sulphur";
			definition = "Commodity of type sulphur.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "SLPH";
		}
	};
	/**
	 * Commodity of type urea.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type urea."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Urea = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urea";
			definition = "Commodity of type urea.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "UREA";
		}
	};
	/**
	 * Commodity of type urea and ammonium nitrite.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UAAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UreaAndAmmoniumNitrite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type urea and ammonium nitrite."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode UreaAndAmmoniumNitrite = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UreaAndAmmoniumNitrite";
			definition = "Commodity of type urea and ammonium nitrite.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "UAAN";
		}
	};
	/**
	 * Commodity of type construction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
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
	 * definition} = "Commodity of type construction."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Construction = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Construction";
			definition = "Commodity of type construction.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "CSTR";
		}
	};
	/**
	 * Commodity of type manufacturing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MFTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type manufacturing."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Manufacturing = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturing";
			definition = "Commodity of type manufacturing.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "MFTG";
		}
	};
	/**
	 * Commodity of type containerboard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Containerboard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type containerboard."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Containerboard = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Containerboard";
			definition = "Commodity of type containerboard.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "CBRD";
		}
	};
	/**
	 * Commodity of type newsprint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Newsprint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type newsprint."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Newsprint = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Newsprint";
			definition = "Commodity of type newsprint.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "NSPT";
		}
	};
	/**
	 * Commodity of type pulp.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PULP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pulp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type pulp."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Pulp = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pulp";
			definition = "Commodity of type pulp.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "PULP";
		}
	};
	/**
	 * Commodity of type recovered paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecoveredPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type recovered paper."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode RecoveredPaper = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecoveredPaper";
			definition = "Commodity of type recovered paper.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "RCVP";
		}
	};
	/**
	 * Commodity of type plastic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Plastic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type plastic."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Plastic = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Plastic";
			definition = "Commodity of type plastic.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "PLST";
		}
	};
	/**
	 * Commodity of type carbon related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarbonRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type carbon related."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode CarbonRelated = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarbonRelated";
			definition = "Commodity of type carbon related.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "CRBR";
		}
	};
	/**
	 * Commodity of type wet freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WETF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type wet freight."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Wet = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wet";
			definition = "Commodity of type wet freight.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "WETF";
		}
	};
	/**
	 * Commodity of type dry freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRYF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type dry freight."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Dry = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dry";
			definition = "Commodity of type dry freight.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "DRYF";
		}
	};
	/**
	 * Commodity of type seafood.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seafood"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type seafood."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Seafood = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seafood";
			definition = "Commodity of type seafood.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "SEAF";
		}
	};
	/**
	 * Commodity of type grain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type grain."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Grain = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grain";
			definition = "Commodity of type grain.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "GRIN";
		}
	};
	/**
	 * Commodity of type deliverable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type deliverable."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Deliverable = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			definition = "Commodity of type deliverable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "DLVR";
		}
	};
	/**
	 * Commodity of type non deliverable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type non deliverable."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode NonDeliverable = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverable";
			definition = "Commodity of type non deliverable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "NDLV";
		}
	};
	/**
	 * Commodity of other type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of other type."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Other = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Commodity of other type.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Commodity of type potato.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Potato"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type potato."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode Potato = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Potato";
			definition = "Commodity of type potato.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "POTA";
		}
	};
	/**
	 * Commodity of type container ships.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainerShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity of type container ships."</li>
	 * </ul>
	 */
	public static final AssetClassSubProductTypeCode ContainerShip = new AssetClassSubProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainerShip";
			definition = "Commodity of type container ships.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductTypeCode.mmObject();
			codeName = "CSHP";
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductTypeCode> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassSubProductTypeCode";
				definition = "Defines the sub-product types for specific asset classes.";
				derivation_lazy = () -> Arrays.asList(AssetClassSubProductType1Code.mmObject(), AssetClassSubProductType2Code.mmObject(), AssetClassSubProductType3Code.mmObject(), AssetClassSubProductType5Code.mmObject(),
						AssetClassSubProductType6Code.mmObject(), AssetClassSubProductType7Code.mmObject(), AssetClassSubProductType8Code.mmObject(), AssetClassSubProductType10Code.mmObject(), AssetClassSubProductType15Code.mmObject(),
						AssetClassSubProductType16Code.mmObject(), AssetClassSubProductType18Code.mmObject(), AssetClassSubProductType19Code.mmObject(), AssetClassSubProductType28Code.mmObject(), AssetClassSubProductType33Code.mmObject(),
						AssetClassSubProductType25Code.mmObject(), AssetClassSubProductType27Code.mmObject(), AssetClassSubProductType26Code.mmObject(), AssetClassSubProductType32Code.mmObject(), AssetClassSubProductType41Code.mmObject(),
						AssetClassSubProductType45Code.mmObject(), AssetClassSubProductType21Code.mmObject(), AssetClassSubProductType40Code.mmObject(), AssetClassSubProductType48Code.mmObject(), AssetClassSubProductType23Code.mmObject(),
						AssetClassSubProductType39Code.mmObject(), AssetClassSubProductType29Code.mmObject(), AssetClassSubProductType22Code.mmObject(), AssetClassSubProductType42Code.mmObject(), AssetClassSubProductType35Code.mmObject(),
						AssetClassSubProductType44Code.mmObject(), AssetClassSubProductType20Code.mmObject(), AssetClassSubProductType24Code.mmObject(), AssetClassSubProductType30Code.mmObject(), AssetClassSubProductType31Code.mmObject(),
						AssetClassSubProductType34Code.mmObject(), AssetClassSubProductType36Code.mmObject(), AssetClassSubProductType37Code.mmObject(), AssetClassSubProductType38Code.mmObject(), AssetClassSubProductType43Code.mmObject(),
						AssetClassSubProductType46Code.mmObject(), AssetClassSubProductType47Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Dairy, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Forestry,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.GrainOilSeeds, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Livestock,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.OliveOil, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Softs, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Coal,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Electricity, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.InterEnergy,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.NaturalGas, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Oil, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Precious,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.NonPrecious, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Emission,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Weather, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Freight,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.MultiCommodityExotic, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.RenewableEnergy,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.LightEnds, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Distillates,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Carbon, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Ammonia,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.DiammoniumPhosphate, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Potash,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Sulphur, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Urea,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.UreaAndAmmoniumNitrite, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Construction,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Manufacturing, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Containerboard,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Newsprint, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Pulp,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.RecoveredPaper, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Plastic,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.CarbonRelated, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Wet, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Dry,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Seafood, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Grain,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Deliverable, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.NonDeliverable,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Other, com.tools20022.repository.codeset.AssetClassSubProductTypeCode.Potato,
						com.tools20022.repository.codeset.AssetClassSubProductTypeCode.ContainerShip);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Dairy.getCodeName().get(), Dairy);
		codesByName.put(Forestry.getCodeName().get(), Forestry);
		codesByName.put(GrainOilSeeds.getCodeName().get(), GrainOilSeeds);
		codesByName.put(Livestock.getCodeName().get(), Livestock);
		codesByName.put(OliveOil.getCodeName().get(), OliveOil);
		codesByName.put(Softs.getCodeName().get(), Softs);
		codesByName.put(Coal.getCodeName().get(), Coal);
		codesByName.put(Electricity.getCodeName().get(), Electricity);
		codesByName.put(InterEnergy.getCodeName().get(), InterEnergy);
		codesByName.put(NaturalGas.getCodeName().get(), NaturalGas);
		codesByName.put(Oil.getCodeName().get(), Oil);
		codesByName.put(Precious.getCodeName().get(), Precious);
		codesByName.put(NonPrecious.getCodeName().get(), NonPrecious);
		codesByName.put(Emission.getCodeName().get(), Emission);
		codesByName.put(Weather.getCodeName().get(), Weather);
		codesByName.put(Freight.getCodeName().get(), Freight);
		codesByName.put(MultiCommodityExotic.getCodeName().get(), MultiCommodityExotic);
		codesByName.put(RenewableEnergy.getCodeName().get(), RenewableEnergy);
		codesByName.put(LightEnds.getCodeName().get(), LightEnds);
		codesByName.put(Distillates.getCodeName().get(), Distillates);
		codesByName.put(Carbon.getCodeName().get(), Carbon);
		codesByName.put(Ammonia.getCodeName().get(), Ammonia);
		codesByName.put(DiammoniumPhosphate.getCodeName().get(), DiammoniumPhosphate);
		codesByName.put(Potash.getCodeName().get(), Potash);
		codesByName.put(Sulphur.getCodeName().get(), Sulphur);
		codesByName.put(Urea.getCodeName().get(), Urea);
		codesByName.put(UreaAndAmmoniumNitrite.getCodeName().get(), UreaAndAmmoniumNitrite);
		codesByName.put(Construction.getCodeName().get(), Construction);
		codesByName.put(Manufacturing.getCodeName().get(), Manufacturing);
		codesByName.put(Containerboard.getCodeName().get(), Containerboard);
		codesByName.put(Newsprint.getCodeName().get(), Newsprint);
		codesByName.put(Pulp.getCodeName().get(), Pulp);
		codesByName.put(RecoveredPaper.getCodeName().get(), RecoveredPaper);
		codesByName.put(Plastic.getCodeName().get(), Plastic);
		codesByName.put(CarbonRelated.getCodeName().get(), CarbonRelated);
		codesByName.put(Wet.getCodeName().get(), Wet);
		codesByName.put(Dry.getCodeName().get(), Dry);
		codesByName.put(Seafood.getCodeName().get(), Seafood);
		codesByName.put(Grain.getCodeName().get(), Grain);
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(NonDeliverable.getCodeName().get(), NonDeliverable);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Potato.getCodeName().get(), Potato);
		codesByName.put(ContainerShip.getCodeName().get(), ContainerShip);
	}

	public static AssetClassSubProductTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductTypeCode[] values() {
		AssetClassSubProductTypeCode[] values = new AssetClassSubProductTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductTypeCode> {
		@Override
		public AssetClassSubProductTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}