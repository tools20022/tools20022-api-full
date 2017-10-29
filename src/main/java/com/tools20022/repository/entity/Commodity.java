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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode;
import com.tools20022.repository.codeset.AssetClassProductTypeCode;
import com.tools20022.repository.codeset.AssetClassSubProductTypeCode;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Basic good used in commerce that is interchangeable with other commodities of
 * the same type. Commodities are most often used as inputs in the production of
 * other goods or services. The quality of a given commodity may differ
 * slightly, but it is essentially uniform across producers. When they are
 * traded on an exchange, commodities must also meet specified minimum
 * standards, also known as a basis grade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Commodity" src="doc-files/Commodity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
 * Commodity.BaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commodity#DetailedSubProduct
 * Commodity.DetailedSubProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity#SubProduct
 * Commodity.SubProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#EmissionAllowanceType
 * TransparencyDataReport10.EmissionAllowanceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2#Product
 * DerivativeCommodity2.Product}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#ClassSpecific
 * CommodityDerivate4.ClassSpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice#Freight
 * CommodityDerivate2Choice.Freight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice#Energy
 * CommodityDerivate2Choice.Energy}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice
 * AssetClassCommodityEnvironmental1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1
 * MetalCommodityPrecious1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1
 * AgriculturalCommodityOliveOil1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice
 * AssetClassCommodityMetal1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1
 * MetalCommodityNonPrecious1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1
 * AgriculturalCommodityGrain1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityOil1
 * EnergyCommodityOil1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
 * AssetClassCommodityEnergy1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
 * AssetClassCommodityAgricultural1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1
 * EnergyCommodityNaturalGas1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1
 * EnergyCommodityElectricity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1
 * AgriculturalCommoditySoft1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1
 * AgriculturalCommodityOilSeed1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1
 * EnergyCommodityDistillates1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1
 * EnergyCommodityInterEnergy1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PolypropyleneCommodityPlastic1
 * PolypropyleneCommodityPlastic1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1
 * PaperCommodityNewsprint1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1
 * AgriculturalCommodityDairy1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
 * AssetClassCommodityFreight1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FreightCommodityDry1
 * FreightCommodityDry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1
 * FreightCommodityContainerShip1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FreightCommodityWet1
 * FreightCommodityWet1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
 * AssetClassCommodityPaper1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaperCommodityPulp1
 * PaperCommodityPulp1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1
 * PaperCommodityContainerBoard1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1
 * PaperCommodityRecoveredPaper1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1
 * AgriculturalCommoditySeafood1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1
 * AgriculturalCommodityForestry1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1
 * FertilizerCommodityUreaAndAmmoniumNitrate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassCommodityInflation1
 * AssetClassCommodityInflation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1
 * AgriculturalCommodityPotato1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1
 * AgriculturalCommodityLiveStock1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1
 * FertilizerCommodityDiammoniumPhosphate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1
 * FertilizerCommodityAmmonia1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassCommodityOther1
 * AssetClassCommodityOther1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1
 * EnergyCommodityRenewableEnergy1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1
 * FertilizerCommoditySulphur1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1
 * EnergyCommodityLightEnd1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1
 * EnergyCommodityCoal1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
 * AssetClassCommodityFertilizer1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1
 * AssetClassCommodityMultiCommodityExotic1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice
 * AssetClassCommodityIndustrialProduct1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1
 * AssetClassCommodityOfficialEconomicStatistics1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice
 * AssetClassCommodityPolypropylene1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1
 * FertilizerCommodityPotash1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1
 * FertilizerCommodityUrea1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommodityDerivate6
 * CommodityDerivate6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2
 * OtherC10CommodityDeliverable2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
 * AssetClassCommodity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice
 * AssetClassCommodityOtherC102Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2
 * OtherC10CommodityNonDeliverable2}</li>
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
 * "Commodity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Basic good used in commerce that is interchangeable with other commodities of the same type. Commodities are most often used as inputs in the production of other goods or services. The quality of a given commodity may differ slightly, but it is essentially uniform across producers. When they are traded on an exchange, commodities must also meet specified minimum standards, also known as a basis grade."
 * </li>
 * </ul>
 */
public class Commodity extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Basic category of the commodity, such as agricultural or metal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
	 * AssetClassProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#BaseProduct
	 * MetalCommodityPrecious1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#BaseProduct
	 * AgriculturalCommodityOliveOil1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1#BaseProduct
	 * MetalCommodityNonPrecious1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1#BaseProduct
	 * AgriculturalCommodityGrain1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#BaseProduct
	 * EnergyCommodityOil1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#NaturalGas
	 * AssetClassCommodityEnergy1Choice.NaturalGas}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1#BaseProduct
	 * EnergyCommodityNaturalGas1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1#BaseProduct
	 * EnergyCommodityElectricity1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#BaseProduct
	 * AgriculturalCommoditySoft1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1#BaseProduct
	 * AgriculturalCommodityOilSeed1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1#BaseProduct
	 * EnergyCommodityDistillates1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1#BaseProduct
	 * EnergyCommodityInterEnergy1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PolypropyleneCommodityPlastic1#BaseProduct
	 * PolypropyleneCommodityPlastic1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1#BaseProduct
	 * PaperCommodityNewsprint1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1#BaseProduct
	 * AgriculturalCommodityDairy1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityDry1#BaseProduct
	 * FreightCommodityDry1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1#BaseProduct
	 * FreightCommodityContainerShip1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityWet1#BaseProduct
	 * FreightCommodityWet1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1#BaseProduct
	 * PaperCommodityPulp1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1#BaseProduct
	 * PaperCommodityContainerBoard1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1#BaseProduct
	 * PaperCommodityRecoveredPaper1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1#BaseProduct
	 * AgriculturalCommoditySeafood1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1#BaseProduct
	 * AgriculturalCommodityForestry1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#BaseProduct
	 * FertilizerCommodityUreaAndAmmoniumNitrate1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityInflation1#BaseProduct
	 * AssetClassCommodityInflation1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1#BaseProduct
	 * AgriculturalCommodityPotato1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1#BaseProduct
	 * AgriculturalCommodityLiveStock1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1#BaseProduct
	 * FertilizerCommodityDiammoniumPhosphate1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1#BaseProduct
	 * FertilizerCommodityAmmonia1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOther1#BaseProduct
	 * AssetClassCommodityOther1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1#BaseProduct
	 * EnergyCommodityRenewableEnergy1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1#BaseProduct
	 * FertilizerCommoditySulphur1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1#BaseProduct
	 * EnergyCommodityLightEnd1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1#BaseProduct
	 * EnergyCommodityCoal1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#Ammonia
	 * AssetClassCommodityFertilizer1Choice.Ammonia}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1#BaseProduct
	 * AssetClassCommodityMultiCommodityExotic1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1#BaseProduct
	 * AssetClassCommodityOfficialEconomicStatistics1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1#BaseProduct
	 * FertilizerCommodityPotash1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1#BaseProduct
	 * FertilizerCommodityUrea1.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#BaseProduct
	 * OtherC10CommodityDeliverable2.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Agricultural
	 * AssetClassCommodity3Choice.Agricultural}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Energy
	 * AssetClassCommodity3Choice.Energy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Environmental
	 * AssetClassCommodity3Choice.Environmental}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Fertilizer
	 * AssetClassCommodity3Choice.Fertilizer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Freight
	 * AssetClassCommodity3Choice.Freight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#IndustrialProduct
	 * AssetClassCommodity3Choice.IndustrialProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Metal
	 * AssetClassCommodity3Choice.Metal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#OtherC10
	 * AssetClassCommodity3Choice.OtherC10}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Paper
	 * AssetClassCommodity3Choice.Paper}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Polypropylene
	 * AssetClassCommodity3Choice.Polypropylene}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Inflation
	 * AssetClassCommodity3Choice.Inflation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#MultiCommodityExotic
	 * AssetClassCommodity3Choice.MultiCommodityExotic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#OfficialEconomicStatistics
	 * AssetClassCommodity3Choice.OfficialEconomicStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#Other
	 * AssetClassCommodity3Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2#BaseProduct
	 * OtherC10CommodityNonDeliverable2.BaseProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic category of the commodity, such as agricultural or metal.  "</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BaseProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MetalCommodityPrecious1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommodityOliveOil1.BaseProduct,
					com.tools20022.repository.msg.MetalCommodityNonPrecious1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommodityGrain1.BaseProduct, com.tools20022.repository.msg.EnergyCommodityOil1.BaseProduct,
					com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.NaturalGas, com.tools20022.repository.msg.EnergyCommodityNaturalGas1.BaseProduct, com.tools20022.repository.msg.EnergyCommodityElectricity1.BaseProduct,
					com.tools20022.repository.msg.AgriculturalCommoditySoft1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommodityOilSeed1.BaseProduct, com.tools20022.repository.msg.EnergyCommodityDistillates1.BaseProduct,
					com.tools20022.repository.msg.EnergyCommodityInterEnergy1.BaseProduct, com.tools20022.repository.msg.PolypropyleneCommodityPlastic1.BaseProduct, com.tools20022.repository.msg.PaperCommodityNewsprint1.BaseProduct,
					com.tools20022.repository.msg.AgriculturalCommodityDairy1.BaseProduct, com.tools20022.repository.msg.FreightCommodityDry1.BaseProduct, com.tools20022.repository.msg.FreightCommodityContainerShip1.BaseProduct,
					com.tools20022.repository.msg.FreightCommodityWet1.BaseProduct, com.tools20022.repository.msg.PaperCommodityPulp1.BaseProduct, com.tools20022.repository.msg.PaperCommodityContainerBoard1.BaseProduct,
					com.tools20022.repository.msg.PaperCommodityRecoveredPaper1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommoditySeafood1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommodityForestry1.BaseProduct,
					com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.BaseProduct, com.tools20022.repository.msg.AssetClassCommodityInflation1.BaseProduct,
					com.tools20022.repository.msg.AgriculturalCommodityPotato1.BaseProduct, com.tools20022.repository.msg.AgriculturalCommodityLiveStock1.BaseProduct,
					com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1.BaseProduct, com.tools20022.repository.msg.FertilizerCommodityAmmonia1.BaseProduct,
					com.tools20022.repository.msg.AssetClassCommodityOther1.BaseProduct, com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1.BaseProduct, com.tools20022.repository.msg.FertilizerCommoditySulphur1.BaseProduct,
					com.tools20022.repository.msg.EnergyCommodityLightEnd1.BaseProduct, com.tools20022.repository.msg.EnergyCommodityCoal1.BaseProduct, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.Ammonia,
					com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1.BaseProduct, com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1.BaseProduct,
					com.tools20022.repository.msg.FertilizerCommodityPotash1.BaseProduct, com.tools20022.repository.msg.FertilizerCommodityUrea1.BaseProduct, com.tools20022.repository.msg.OtherC10CommodityDeliverable2.BaseProduct,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.Agricultural, com.tools20022.repository.choice.AssetClassCommodity3Choice.Energy, com.tools20022.repository.choice.AssetClassCommodity3Choice.Environmental,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.Fertilizer, com.tools20022.repository.choice.AssetClassCommodity3Choice.Freight, com.tools20022.repository.choice.AssetClassCommodity3Choice.IndustrialProduct,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.Metal, com.tools20022.repository.choice.AssetClassCommodity3Choice.OtherC10, com.tools20022.repository.choice.AssetClassCommodity3Choice.Paper,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.Polypropylene, com.tools20022.repository.choice.AssetClassCommodity3Choice.Inflation,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.MultiCommodityExotic, com.tools20022.repository.choice.AssetClassCommodity3Choice.OfficialEconomicStatistics,
					com.tools20022.repository.choice.AssetClassCommodity3Choice.Other, com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2.BaseProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseProduct";
			definition = "Basic category of the commodity, such as agricultural or metal.  ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AssetClassProductTypeCode.mmObject();
		}
	};
	/**
	 * Further detailed description of the basic resources, such as aluminium,
	 * iron ore or wheat
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode
	 * AssetClassDetailedSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#AdditionalSubProduct
	 * AgriculturalCommoditySoft1.AdditionalSubProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedSubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further detailed description of the basic resources, such as aluminium,  iron ore or wheat"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DetailedSubProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AgriculturalCommoditySoft1.AdditionalSubProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedSubProduct";
			definition = "Further detailed description of the basic resources, such as aluminium,  iron ore or wheat";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
		}
	};
	/**
	 * Basic resources and agricultural products such as non-precious metal or
	 * grain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
	 * AssetClassSubProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#Emissions
	 * AssetClassCommodityEnvironmental1Choice.Emissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#Weather
	 * AssetClassCommodityEnvironmental1Choice.Weather}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#CarbonRelated
	 * AssetClassCommodityEnvironmental1Choice.CarbonRelated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#SubProduct
	 * MetalCommodityPrecious1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#SubProduct
	 * AgriculturalCommodityOliveOil1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#NonPrecious
	 * AssetClassCommodityMetal1Choice.NonPrecious}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#Precious
	 * AssetClassCommodityMetal1Choice.Precious}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1#SubProduct
	 * MetalCommodityNonPrecious1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1#SubProduct
	 * AgriculturalCommodityGrain1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#SubProduct
	 * EnergyCommodityOil1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#Electricity
	 * AssetClassCommodityEnergy1Choice.Electricity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#Oil
	 * AssetClassCommodityEnergy1Choice.Oil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#Coal
	 * AssetClassCommodityEnergy1Choice.Coal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#InterEnergy
	 * AssetClassCommodityEnergy1Choice.InterEnergy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#RenewableEnergy
	 * AssetClassCommodityEnergy1Choice.RenewableEnergy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#LightEnd
	 * AssetClassCommodityEnergy1Choice.LightEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#Distillates
	 * AssetClassCommodityEnergy1Choice.Distillates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#GrainOilSeed
	 * AssetClassCommodityAgricultural1Choice.GrainOilSeed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Soft
	 * AssetClassCommodityAgricultural1Choice.Soft}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Potato
	 * AssetClassCommodityAgricultural1Choice.Potato}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#OliveOil
	 * AssetClassCommodityAgricultural1Choice.OliveOil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Dairy
	 * AssetClassCommodityAgricultural1Choice.Dairy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Forestry
	 * AssetClassCommodityAgricultural1Choice.Forestry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Seafood
	 * AssetClassCommodityAgricultural1Choice.Seafood}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#LiveStock
	 * AssetClassCommodityAgricultural1Choice.LiveStock}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#Grain
	 * AssetClassCommodityAgricultural1Choice.Grain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1#SubProduct
	 * EnergyCommodityNaturalGas1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1#SubProduct
	 * EnergyCommodityElectricity1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#SubProduct
	 * AgriculturalCommoditySoft1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1#SubProduct
	 * AgriculturalCommodityOilSeed1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1#SubProduct
	 * EnergyCommodityDistillates1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1#SubProduct
	 * EnergyCommodityInterEnergy1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PolypropyleneCommodityPlastic1#SubProduct
	 * PolypropyleneCommodityPlastic1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1#SubProduct
	 * PaperCommodityNewsprint1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1#SubProduct
	 * AgriculturalCommodityDairy1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#Dry
	 * AssetClassCommodityFreight1Choice.Dry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#Wet
	 * AssetClassCommodityFreight1Choice.Wet}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#ContainerShip
	 * AssetClassCommodityFreight1Choice.ContainerShip}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityDry1#SubProduct
	 * FreightCommodityDry1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1#SubProduct
	 * FreightCommodityContainerShip1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityWet1#SubProduct
	 * FreightCommodityWet1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#ContainerBoard
	 * AssetClassCommodityPaper1Choice.ContainerBoard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#Newsprint
	 * AssetClassCommodityPaper1Choice.Newsprint}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#Pulp
	 * AssetClassCommodityPaper1Choice.Pulp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#RecoveredPaper
	 * AssetClassCommodityPaper1Choice.RecoveredPaper}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1#SubProduct
	 * PaperCommodityPulp1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1#SubProduct
	 * PaperCommodityContainerBoard1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1#SubProduct
	 * PaperCommodityRecoveredPaper1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1#SubProduct
	 * AgriculturalCommoditySeafood1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1#SubProduct
	 * AgriculturalCommodityForestry1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#SubProduct
	 * FertilizerCommodityUreaAndAmmoniumNitrate1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1#SubProduct
	 * AgriculturalCommodityPotato1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1#SubProduct
	 * AgriculturalCommodityLiveStock1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1#SubProduct
	 * FertilizerCommodityDiammoniumPhosphate1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1#SubProduct
	 * FertilizerCommodityAmmonia1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1#SubProduct
	 * EnergyCommodityRenewableEnergy1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1#SubProduct
	 * FertilizerCommoditySulphur1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1#SubProduct
	 * EnergyCommodityLightEnd1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1#SubProduct
	 * EnergyCommodityCoal1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#DiammoniumPhosphate
	 * AssetClassCommodityFertilizer1Choice.DiammoniumPhosphate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#Potash
	 * AssetClassCommodityFertilizer1Choice.Potash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#Sulphur
	 * AssetClassCommodityFertilizer1Choice.Sulphur}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#Urea
	 * AssetClassCommodityFertilizer1Choice.Urea}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#UreaAndAmmoniumNitrate
	 * AssetClassCommodityFertilizer1Choice.UreaAndAmmoniumNitrate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#Construction
	 * AssetClassCommodityIndustrialProduct1Choice.Construction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#Manufacturing
	 * AssetClassCommodityIndustrialProduct1Choice.Manufacturing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice#Plastic
	 * AssetClassCommodityPolypropylene1Choice.Plastic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1#SubProduct
	 * FertilizerCommodityPotash1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1#SubProduct
	 * FertilizerCommodityUrea1.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2#ContractSubType
	 * ForeignExchangeDerivative2.ContractSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#SubProduct
	 * OtherC10CommodityDeliverable2.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#Deliverable
	 * AssetClassCommodityOtherC102Choice.Deliverable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#NonDeliverable
	 * AssetClassCommodityOtherC102Choice.NonDeliverable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2#SubProduct
	 * OtherC10CommodityNonDeliverable2.SubProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic resources and agricultural products such as non-precious metal or grain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.Emissions, com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.Weather,
					com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.CarbonRelated, com.tools20022.repository.msg.MetalCommodityPrecious1.SubProduct,
					com.tools20022.repository.msg.AgriculturalCommodityOliveOil1.SubProduct, com.tools20022.repository.choice.AssetClassCommodityMetal1Choice.NonPrecious,
					com.tools20022.repository.choice.AssetClassCommodityMetal1Choice.Precious, com.tools20022.repository.msg.MetalCommodityNonPrecious1.SubProduct, com.tools20022.repository.msg.AgriculturalCommodityGrain1.SubProduct,
					com.tools20022.repository.msg.EnergyCommodityOil1.SubProduct, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Electricity, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Oil,
					com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Coal, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.InterEnergy,
					com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.RenewableEnergy, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.LightEnd,
					com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Distillates, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.GrainOilSeed,
					com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Soft, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Potato,
					com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.OliveOil, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Dairy,
					com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Forestry, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Seafood,
					com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.LiveStock, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Grain,
					com.tools20022.repository.msg.EnergyCommodityNaturalGas1.SubProduct, com.tools20022.repository.msg.EnergyCommodityElectricity1.SubProduct, com.tools20022.repository.msg.AgriculturalCommoditySoft1.SubProduct,
					com.tools20022.repository.msg.AgriculturalCommodityOilSeed1.SubProduct, com.tools20022.repository.msg.EnergyCommodityDistillates1.SubProduct, com.tools20022.repository.msg.EnergyCommodityInterEnergy1.SubProduct,
					com.tools20022.repository.msg.PolypropyleneCommodityPlastic1.SubProduct, com.tools20022.repository.msg.PaperCommodityNewsprint1.SubProduct, com.tools20022.repository.msg.AgriculturalCommodityDairy1.SubProduct,
					com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.Dry, com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.Wet,
					com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.ContainerShip, com.tools20022.repository.msg.FreightCommodityDry1.SubProduct, com.tools20022.repository.msg.FreightCommodityContainerShip1.SubProduct,
					com.tools20022.repository.msg.FreightCommodityWet1.SubProduct, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.ContainerBoard, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.Newsprint,
					com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.Pulp, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.RecoveredPaper, com.tools20022.repository.msg.PaperCommodityPulp1.SubProduct,
					com.tools20022.repository.msg.PaperCommodityContainerBoard1.SubProduct, com.tools20022.repository.msg.PaperCommodityRecoveredPaper1.SubProduct, com.tools20022.repository.msg.AgriculturalCommoditySeafood1.SubProduct,
					com.tools20022.repository.msg.AgriculturalCommodityForestry1.SubProduct, com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.SubProduct,
					com.tools20022.repository.msg.AgriculturalCommodityPotato1.SubProduct, com.tools20022.repository.msg.AgriculturalCommodityLiveStock1.SubProduct,
					com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1.SubProduct, com.tools20022.repository.msg.FertilizerCommodityAmmonia1.SubProduct,
					com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1.SubProduct, com.tools20022.repository.msg.FertilizerCommoditySulphur1.SubProduct, com.tools20022.repository.msg.EnergyCommodityLightEnd1.SubProduct,
					com.tools20022.repository.msg.EnergyCommodityCoal1.SubProduct, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.DiammoniumPhosphate,
					com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.Potash, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.Sulphur,
					com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.Urea, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.UreaAndAmmoniumNitrate,
					com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.Construction, com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.Manufacturing,
					com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice.Plastic, com.tools20022.repository.msg.FertilizerCommodityPotash1.SubProduct, com.tools20022.repository.msg.FertilizerCommodityUrea1.SubProduct,
					com.tools20022.repository.msg.ForeignExchangeDerivative2.ContractSubType, com.tools20022.repository.msg.OtherC10CommodityDeliverable2.SubProduct,
					com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice.Deliverable, com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice.NonDeliverable,
					com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2.SubProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubProduct";
			definition = "Basic resources and agricultural products such as non-precious metal or grain.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Commodity";
				definition = "Basic good used in commerce that is interchangeable with other commodities of the same type. Commodities are most often used as inputs in the production of other goods or services. The quality of a given commodity may differ slightly, but it is essentially uniform across producers. When they are traded on an exchange, commodities must also meet specified minimum standards, also known as a basis grade.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport10.EmissionAllowanceType, com.tools20022.repository.msg.DerivativeCommodity2.Product,
						com.tools20022.repository.msg.CommodityDerivate4.ClassSpecific, com.tools20022.repository.choice.CommodityDerivate2Choice.Freight, com.tools20022.repository.choice.CommodityDerivate2Choice.Energy);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commodity.BaseProduct, com.tools20022.repository.entity.Commodity.DetailedSubProduct, com.tools20022.repository.entity.Commodity.SubProduct);
				derivationComponent_lazy = () -> Arrays.asList(AssetClassCommodityEnvironmental1Choice.mmObject(), MetalCommodityPrecious1.mmObject(), AgriculturalCommodityOliveOil1.mmObject(), AssetClassCommodityMetal1Choice.mmObject(),
						MetalCommodityNonPrecious1.mmObject(), AgriculturalCommodityGrain1.mmObject(), EnergyCommodityOil1.mmObject(), AssetClassCommodityEnergy1Choice.mmObject(), AssetClassCommodityAgricultural1Choice.mmObject(),
						EnergyCommodityNaturalGas1.mmObject(), EnergyCommodityElectricity1.mmObject(), AgriculturalCommoditySoft1.mmObject(), AgriculturalCommodityOilSeed1.mmObject(), EnergyCommodityDistillates1.mmObject(),
						EnergyCommodityInterEnergy1.mmObject(), PolypropyleneCommodityPlastic1.mmObject(), PaperCommodityNewsprint1.mmObject(), AgriculturalCommodityDairy1.mmObject(), AssetClassCommodityFreight1Choice.mmObject(),
						FreightCommodityDry1.mmObject(), FreightCommodityContainerShip1.mmObject(), FreightCommodityWet1.mmObject(), AssetClassCommodityPaper1Choice.mmObject(), PaperCommodityPulp1.mmObject(),
						PaperCommodityContainerBoard1.mmObject(), PaperCommodityRecoveredPaper1.mmObject(), AgriculturalCommoditySeafood1.mmObject(), AgriculturalCommodityForestry1.mmObject(),
						FertilizerCommodityUreaAndAmmoniumNitrate1.mmObject(), AssetClassCommodityInflation1.mmObject(), AgriculturalCommodityPotato1.mmObject(), AgriculturalCommodityLiveStock1.mmObject(),
						FertilizerCommodityDiammoniumPhosphate1.mmObject(), FertilizerCommodityAmmonia1.mmObject(), AssetClassCommodityOther1.mmObject(), EnergyCommodityRenewableEnergy1.mmObject(), FertilizerCommoditySulphur1.mmObject(),
						EnergyCommodityLightEnd1.mmObject(), EnergyCommodityCoal1.mmObject(), AssetClassCommodityFertilizer1Choice.mmObject(), AssetClassCommodityMultiCommodityExotic1.mmObject(),
						AssetClassCommodityIndustrialProduct1Choice.mmObject(), AssetClassCommodityOfficialEconomicStatistics1.mmObject(), AssetClassCommodityPolypropylene1Choice.mmObject(), FertilizerCommodityPotash1.mmObject(),
						FertilizerCommodityUrea1.mmObject(), CommodityDerivate6.mmObject(), OtherC10CommodityDeliverable2.mmObject(), AssetClassCommodity3Choice.mmObject(), AssetClassCommodityOtherC102Choice.mmObject(),
						OtherC10CommodityNonDeliverable2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}