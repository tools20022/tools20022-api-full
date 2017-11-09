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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode;
import com.tools20022.repository.codeset.AssetClassProductTypeCode;
import com.tools20022.repository.codeset.AssetClassSubProductTypeCode;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmEmissionAllowanceType
 * TransparencyDataReport10.mmEmissionAllowanceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmProduct
 * DerivativeCommodity2.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#mmClassSpecific
 * CommodityDerivate4.mmClassSpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice#mmFreight
 * CommodityDerivate2Choice.mmFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice#mmEnergy
 * CommodityDerivate2Choice.mmEnergy}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
 * Commodity.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commodity#mmDetailedSubProduct
 * Commodity.mmDetailedSubProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
 * Commodity.mmSubProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected AssetClassProductTypeCode baseProduct;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#mmBaseProduct
	 * MetalCommodityPrecious1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#mmBaseProduct
	 * AgriculturalCommodityOliveOil1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1#mmBaseProduct
	 * MetalCommodityNonPrecious1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1#mmBaseProduct
	 * AgriculturalCommodityGrain1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#mmBaseProduct
	 * EnergyCommodityOil1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmNaturalGas
	 * AssetClassCommodityEnergy1Choice.mmNaturalGas}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1#mmBaseProduct
	 * EnergyCommodityNaturalGas1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1#mmBaseProduct
	 * EnergyCommodityElectricity1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#mmBaseProduct
	 * AgriculturalCommoditySoft1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1#mmBaseProduct
	 * AgriculturalCommodityOilSeed1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1#mmBaseProduct
	 * EnergyCommodityDistillates1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1#mmBaseProduct
	 * EnergyCommodityInterEnergy1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PolypropyleneCommodityPlastic1#mmBaseProduct
	 * PolypropyleneCommodityPlastic1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1#mmBaseProduct
	 * PaperCommodityNewsprint1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1#mmBaseProduct
	 * AgriculturalCommodityDairy1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityDry1#mmBaseProduct
	 * FreightCommodityDry1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1#mmBaseProduct
	 * FreightCommodityContainerShip1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityWet1#mmBaseProduct
	 * FreightCommodityWet1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1#mmBaseProduct
	 * PaperCommodityPulp1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1#mmBaseProduct
	 * PaperCommodityContainerBoard1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1#mmBaseProduct
	 * PaperCommodityRecoveredPaper1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1#mmBaseProduct
	 * AgriculturalCommoditySeafood1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1#mmBaseProduct
	 * AgriculturalCommodityForestry1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#mmBaseProduct
	 * FertilizerCommodityUreaAndAmmoniumNitrate1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityInflation1#mmBaseProduct
	 * AssetClassCommodityInflation1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1#mmBaseProduct
	 * AgriculturalCommodityPotato1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1#mmBaseProduct
	 * AgriculturalCommodityLiveStock1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1#mmBaseProduct
	 * FertilizerCommodityDiammoniumPhosphate1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1#mmBaseProduct
	 * FertilizerCommodityAmmonia1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOther1#mmBaseProduct
	 * AssetClassCommodityOther1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1#mmBaseProduct
	 * EnergyCommodityRenewableEnergy1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1#mmBaseProduct
	 * FertilizerCommoditySulphur1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1#mmBaseProduct
	 * EnergyCommodityLightEnd1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1#mmBaseProduct
	 * EnergyCommodityCoal1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmAmmonia
	 * AssetClassCommodityFertilizer1Choice.mmAmmonia}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1#mmBaseProduct
	 * AssetClassCommodityMultiCommodityExotic1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1#mmBaseProduct
	 * AssetClassCommodityOfficialEconomicStatistics1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1#mmBaseProduct
	 * FertilizerCommodityPotash1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1#mmBaseProduct
	 * FertilizerCommodityUrea1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#mmBaseProduct
	 * OtherC10CommodityDeliverable2.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmAgricultural
	 * AssetClassCommodity3Choice.mmAgricultural}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmEnergy
	 * AssetClassCommodity3Choice.mmEnergy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmEnvironmental
	 * AssetClassCommodity3Choice.mmEnvironmental}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmFertilizer
	 * AssetClassCommodity3Choice.mmFertilizer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmFreight
	 * AssetClassCommodity3Choice.mmFreight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmIndustrialProduct
	 * AssetClassCommodity3Choice.mmIndustrialProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmMetal
	 * AssetClassCommodity3Choice.mmMetal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmOtherC10
	 * AssetClassCommodity3Choice.mmOtherC10}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmPaper
	 * AssetClassCommodity3Choice.mmPaper}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmPolypropylene
	 * AssetClassCommodity3Choice.mmPolypropylene}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmInflation
	 * AssetClassCommodity3Choice.mmInflation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmMultiCommodityExotic
	 * AssetClassCommodity3Choice.mmMultiCommodityExotic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmOfficialEconomicStatistics
	 * AssetClassCommodity3Choice.mmOfficialEconomicStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice#mmOther
	 * AssetClassCommodity3Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2#mmBaseProduct
	 * OtherC10CommodityNonDeliverable2.mmBaseProduct}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBaseProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MetalCommodityPrecious1.mmBaseProduct, AgriculturalCommodityOliveOil1.mmBaseProduct, MetalCommodityNonPrecious1.mmBaseProduct, AgriculturalCommodityGrain1.mmBaseProduct,
					EnergyCommodityOil1.mmBaseProduct, AssetClassCommodityEnergy1Choice.mmNaturalGas, EnergyCommodityNaturalGas1.mmBaseProduct, EnergyCommodityElectricity1.mmBaseProduct, AgriculturalCommoditySoft1.mmBaseProduct,
					AgriculturalCommodityOilSeed1.mmBaseProduct, EnergyCommodityDistillates1.mmBaseProduct, EnergyCommodityInterEnergy1.mmBaseProduct, PolypropyleneCommodityPlastic1.mmBaseProduct, PaperCommodityNewsprint1.mmBaseProduct,
					AgriculturalCommodityDairy1.mmBaseProduct, FreightCommodityDry1.mmBaseProduct, FreightCommodityContainerShip1.mmBaseProduct, FreightCommodityWet1.mmBaseProduct, PaperCommodityPulp1.mmBaseProduct,
					PaperCommodityContainerBoard1.mmBaseProduct, PaperCommodityRecoveredPaper1.mmBaseProduct, AgriculturalCommoditySeafood1.mmBaseProduct, AgriculturalCommodityForestry1.mmBaseProduct,
					FertilizerCommodityUreaAndAmmoniumNitrate1.mmBaseProduct, AssetClassCommodityInflation1.mmBaseProduct, AgriculturalCommodityPotato1.mmBaseProduct, AgriculturalCommodityLiveStock1.mmBaseProduct,
					FertilizerCommodityDiammoniumPhosphate1.mmBaseProduct, FertilizerCommodityAmmonia1.mmBaseProduct, AssetClassCommodityOther1.mmBaseProduct, EnergyCommodityRenewableEnergy1.mmBaseProduct,
					FertilizerCommoditySulphur1.mmBaseProduct, EnergyCommodityLightEnd1.mmBaseProduct, EnergyCommodityCoal1.mmBaseProduct, AssetClassCommodityFertilizer1Choice.mmAmmonia,
					AssetClassCommodityMultiCommodityExotic1.mmBaseProduct, AssetClassCommodityOfficialEconomicStatistics1.mmBaseProduct, FertilizerCommodityPotash1.mmBaseProduct, FertilizerCommodityUrea1.mmBaseProduct,
					OtherC10CommodityDeliverable2.mmBaseProduct, AssetClassCommodity3Choice.mmAgricultural, AssetClassCommodity3Choice.mmEnergy, AssetClassCommodity3Choice.mmEnvironmental, AssetClassCommodity3Choice.mmFertilizer,
					AssetClassCommodity3Choice.mmFreight, AssetClassCommodity3Choice.mmIndustrialProduct, AssetClassCommodity3Choice.mmMetal, AssetClassCommodity3Choice.mmOtherC10, AssetClassCommodity3Choice.mmPaper,
					AssetClassCommodity3Choice.mmPolypropylene, AssetClassCommodity3Choice.mmInflation, AssetClassCommodity3Choice.mmMultiCommodityExotic, AssetClassCommodity3Choice.mmOfficialEconomicStatistics,
					AssetClassCommodity3Choice.mmOther, OtherC10CommodityNonDeliverable2.mmBaseProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseProduct";
			definition = "Basic category of the commodity, such as agricultural or metal.  ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductTypeCode.mmObject();
		}
	};
	protected AssetClassDetailedSubProductTypeCode detailedSubProduct;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#mmAdditionalSubProduct
	 * AgriculturalCommoditySoft1.mmAdditionalSubProduct}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDetailedSubProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AgriculturalCommoditySoft1.mmAdditionalSubProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedSubProduct";
			definition = "Further detailed description of the basic resources, such as aluminium,  iron ore or wheat";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
		}
	};
	protected AssetClassSubProductTypeCode subProduct;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Commodity
	 * Commodity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmEmissions
	 * AssetClassCommodityEnvironmental1Choice.mmEmissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmWeather
	 * AssetClassCommodityEnvironmental1Choice.mmWeather}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmCarbonRelated
	 * AssetClassCommodityEnvironmental1Choice.mmCarbonRelated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#mmSubProduct
	 * MetalCommodityPrecious1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#mmSubProduct
	 * AgriculturalCommodityOliveOil1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#mmNonPrecious
	 * AssetClassCommodityMetal1Choice.mmNonPrecious}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#mmPrecious
	 * AssetClassCommodityMetal1Choice.mmPrecious}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1#mmSubProduct
	 * MetalCommodityNonPrecious1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1#mmSubProduct
	 * AgriculturalCommodityGrain1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#mmSubProduct
	 * EnergyCommodityOil1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmElectricity
	 * AssetClassCommodityEnergy1Choice.mmElectricity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmOil
	 * AssetClassCommodityEnergy1Choice.mmOil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmCoal
	 * AssetClassCommodityEnergy1Choice.mmCoal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmInterEnergy
	 * AssetClassCommodityEnergy1Choice.mmInterEnergy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmRenewableEnergy
	 * AssetClassCommodityEnergy1Choice.mmRenewableEnergy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmLightEnd
	 * AssetClassCommodityEnergy1Choice.mmLightEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmDistillates
	 * AssetClassCommodityEnergy1Choice.mmDistillates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmGrainOilSeed
	 * AssetClassCommodityAgricultural1Choice.mmGrainOilSeed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmSoft
	 * AssetClassCommodityAgricultural1Choice.mmSoft}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmPotato
	 * AssetClassCommodityAgricultural1Choice.mmPotato}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmOliveOil
	 * AssetClassCommodityAgricultural1Choice.mmOliveOil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmDairy
	 * AssetClassCommodityAgricultural1Choice.mmDairy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmForestry
	 * AssetClassCommodityAgricultural1Choice.mmForestry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmSeafood
	 * AssetClassCommodityAgricultural1Choice.mmSeafood}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmLiveStock
	 * AssetClassCommodityAgricultural1Choice.mmLiveStock}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice#mmGrain
	 * AssetClassCommodityAgricultural1Choice.mmGrain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1#mmSubProduct
	 * EnergyCommodityNaturalGas1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1#mmSubProduct
	 * EnergyCommodityElectricity1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1#mmSubProduct
	 * AgriculturalCommoditySoft1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1#mmSubProduct
	 * AgriculturalCommodityOilSeed1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1#mmSubProduct
	 * EnergyCommodityDistillates1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1#mmSubProduct
	 * EnergyCommodityInterEnergy1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PolypropyleneCommodityPlastic1#mmSubProduct
	 * PolypropyleneCommodityPlastic1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1#mmSubProduct
	 * PaperCommodityNewsprint1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1#mmSubProduct
	 * AgriculturalCommodityDairy1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmDry
	 * AssetClassCommodityFreight1Choice.mmDry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmWet
	 * AssetClassCommodityFreight1Choice.mmWet}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#mmContainerShip
	 * AssetClassCommodityFreight1Choice.mmContainerShip}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityDry1#mmSubProduct
	 * FreightCommodityDry1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1#mmSubProduct
	 * FreightCommodityContainerShip1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityWet1#mmSubProduct
	 * FreightCommodityWet1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmContainerBoard
	 * AssetClassCommodityPaper1Choice.mmContainerBoard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmNewsprint
	 * AssetClassCommodityPaper1Choice.mmNewsprint}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmPulp
	 * AssetClassCommodityPaper1Choice.mmPulp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmRecoveredPaper
	 * AssetClassCommodityPaper1Choice.mmRecoveredPaper}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1#mmSubProduct
	 * PaperCommodityPulp1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1#mmSubProduct
	 * PaperCommodityContainerBoard1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1#mmSubProduct
	 * PaperCommodityRecoveredPaper1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1#mmSubProduct
	 * AgriculturalCommoditySeafood1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1#mmSubProduct
	 * AgriculturalCommodityForestry1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#mmSubProduct
	 * FertilizerCommodityUreaAndAmmoniumNitrate1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1#mmSubProduct
	 * AgriculturalCommodityPotato1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1#mmSubProduct
	 * AgriculturalCommodityLiveStock1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1#mmSubProduct
	 * FertilizerCommodityDiammoniumPhosphate1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1#mmSubProduct
	 * FertilizerCommodityAmmonia1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1#mmSubProduct
	 * EnergyCommodityRenewableEnergy1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1#mmSubProduct
	 * FertilizerCommoditySulphur1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1#mmSubProduct
	 * EnergyCommodityLightEnd1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1#mmSubProduct
	 * EnergyCommodityCoal1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmDiammoniumPhosphate
	 * AssetClassCommodityFertilizer1Choice.mmDiammoniumPhosphate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmPotash
	 * AssetClassCommodityFertilizer1Choice.mmPotash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmSulphur
	 * AssetClassCommodityFertilizer1Choice.mmSulphur}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmUrea
	 * AssetClassCommodityFertilizer1Choice.mmUrea}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmUreaAndAmmoniumNitrate
	 * AssetClassCommodityFertilizer1Choice.mmUreaAndAmmoniumNitrate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#mmConstruction
	 * AssetClassCommodityIndustrialProduct1Choice.mmConstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#mmManufacturing
	 * AssetClassCommodityIndustrialProduct1Choice.mmManufacturing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice#mmPlastic
	 * AssetClassCommodityPolypropylene1Choice.mmPlastic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1#mmSubProduct
	 * FertilizerCommodityPotash1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1#mmSubProduct
	 * FertilizerCommodityUrea1.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2#mmContractSubType
	 * ForeignExchangeDerivative2.mmContractSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#mmSubProduct
	 * OtherC10CommodityDeliverable2.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#mmDeliverable
	 * AssetClassCommodityOtherC102Choice.mmDeliverable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#mmNonDeliverable
	 * AssetClassCommodityOtherC102Choice.mmNonDeliverable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2#mmSubProduct
	 * OtherC10CommodityNonDeliverable2.mmSubProduct}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSubProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AssetClassCommodityEnvironmental1Choice.mmEmissions, AssetClassCommodityEnvironmental1Choice.mmWeather, AssetClassCommodityEnvironmental1Choice.mmCarbonRelated,
					MetalCommodityPrecious1.mmSubProduct, AgriculturalCommodityOliveOil1.mmSubProduct, AssetClassCommodityMetal1Choice.mmNonPrecious, AssetClassCommodityMetal1Choice.mmPrecious, MetalCommodityNonPrecious1.mmSubProduct,
					AgriculturalCommodityGrain1.mmSubProduct, EnergyCommodityOil1.mmSubProduct, AssetClassCommodityEnergy1Choice.mmElectricity, AssetClassCommodityEnergy1Choice.mmOil, AssetClassCommodityEnergy1Choice.mmCoal,
					AssetClassCommodityEnergy1Choice.mmInterEnergy, AssetClassCommodityEnergy1Choice.mmRenewableEnergy, AssetClassCommodityEnergy1Choice.mmLightEnd, AssetClassCommodityEnergy1Choice.mmDistillates,
					AssetClassCommodityAgricultural1Choice.mmGrainOilSeed, AssetClassCommodityAgricultural1Choice.mmSoft, AssetClassCommodityAgricultural1Choice.mmPotato, AssetClassCommodityAgricultural1Choice.mmOliveOil,
					AssetClassCommodityAgricultural1Choice.mmDairy, AssetClassCommodityAgricultural1Choice.mmForestry, AssetClassCommodityAgricultural1Choice.mmSeafood, AssetClassCommodityAgricultural1Choice.mmLiveStock,
					AssetClassCommodityAgricultural1Choice.mmGrain, EnergyCommodityNaturalGas1.mmSubProduct, EnergyCommodityElectricity1.mmSubProduct, AgriculturalCommoditySoft1.mmSubProduct, AgriculturalCommodityOilSeed1.mmSubProduct,
					EnergyCommodityDistillates1.mmSubProduct, EnergyCommodityInterEnergy1.mmSubProduct, PolypropyleneCommodityPlastic1.mmSubProduct, PaperCommodityNewsprint1.mmSubProduct, AgriculturalCommodityDairy1.mmSubProduct,
					AssetClassCommodityFreight1Choice.mmDry, AssetClassCommodityFreight1Choice.mmWet, AssetClassCommodityFreight1Choice.mmContainerShip, FreightCommodityDry1.mmSubProduct, FreightCommodityContainerShip1.mmSubProduct,
					FreightCommodityWet1.mmSubProduct, AssetClassCommodityPaper1Choice.mmContainerBoard, AssetClassCommodityPaper1Choice.mmNewsprint, AssetClassCommodityPaper1Choice.mmPulp, AssetClassCommodityPaper1Choice.mmRecoveredPaper,
					PaperCommodityPulp1.mmSubProduct, PaperCommodityContainerBoard1.mmSubProduct, PaperCommodityRecoveredPaper1.mmSubProduct, AgriculturalCommoditySeafood1.mmSubProduct, AgriculturalCommodityForestry1.mmSubProduct,
					FertilizerCommodityUreaAndAmmoniumNitrate1.mmSubProduct, AgriculturalCommodityPotato1.mmSubProduct, AgriculturalCommodityLiveStock1.mmSubProduct, FertilizerCommodityDiammoniumPhosphate1.mmSubProduct,
					FertilizerCommodityAmmonia1.mmSubProduct, EnergyCommodityRenewableEnergy1.mmSubProduct, FertilizerCommoditySulphur1.mmSubProduct, EnergyCommodityLightEnd1.mmSubProduct, EnergyCommodityCoal1.mmSubProduct,
					AssetClassCommodityFertilizer1Choice.mmDiammoniumPhosphate, AssetClassCommodityFertilizer1Choice.mmPotash, AssetClassCommodityFertilizer1Choice.mmSulphur, AssetClassCommodityFertilizer1Choice.mmUrea,
					AssetClassCommodityFertilizer1Choice.mmUreaAndAmmoniumNitrate, AssetClassCommodityIndustrialProduct1Choice.mmConstruction, AssetClassCommodityIndustrialProduct1Choice.mmManufacturing,
					AssetClassCommodityPolypropylene1Choice.mmPlastic, FertilizerCommodityPotash1.mmSubProduct, FertilizerCommodityUrea1.mmSubProduct, ForeignExchangeDerivative2.mmContractSubType,
					OtherC10CommodityDeliverable2.mmSubProduct, AssetClassCommodityOtherC102Choice.mmDeliverable, AssetClassCommodityOtherC102Choice.mmNonDeliverable, OtherC10CommodityNonDeliverable2.mmSubProduct);
			elementContext_lazy = () -> Commodity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubProduct";
			definition = "Basic resources and agricultural products such as non-precious metal or grain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassSubProductTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Commodity";
				definition = "Basic good used in commerce that is interchangeable with other commodities of the same type. Commodities are most often used as inputs in the production of other goods or services. The quality of a given commodity may differ slightly, but it is essentially uniform across producers. When they are traded on an exchange, commodities must also meet specified minimum standards, also known as a basis grade.";
				derivationElement_lazy = () -> Arrays.asList(TransparencyDataReport10.mmEmissionAllowanceType, DerivativeCommodity2.mmProduct, CommodityDerivate4.mmClassSpecific, CommodityDerivate2Choice.mmFreight,
						CommodityDerivate2Choice.mmEnergy);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(Commodity.mmBaseProduct, Commodity.mmDetailedSubProduct, Commodity.mmSubProduct);
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

	public AssetClassProductTypeCode getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(AssetClassProductTypeCode baseProduct) {
		this.baseProduct = baseProduct;
	}

	public AssetClassDetailedSubProductTypeCode getDetailedSubProduct() {
		return detailedSubProduct;
	}

	public void setDetailedSubProduct(AssetClassDetailedSubProductTypeCode detailedSubProduct) {
		this.detailedSubProduct = detailedSubProduct;
	}

	public AssetClassSubProductTypeCode getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(AssetClassSubProductTypeCode subProduct) {
		this.subProduct = subProduct;
	}
}