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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.msg.AssetClassCommodityInflation1;
import com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1;
import com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1;
import com.tools20022.repository.msg.AssetClassCommodityOther1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice to define commodity specific attributes of a derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
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
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "AssetClassCommodity3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to define commodity specific attributes of a derivative."</li>
 * </ul>
 */
public class AssetClassCommodity3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agricultural commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrcltrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agricultural"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agricultural commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Agricultural = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Agrcltrl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agricultural";
			definition = "Agricultural commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Energy commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nrgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Energy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Energy commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Energy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Nrgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Energy";
			definition = "Energy commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Environmental commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice
	 * AssetClassCommodityEnvironmental1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envttl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environmental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environmental commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Environmental = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Envttl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environmental";
			definition = "Environmental commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Fertilizer commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frtlzr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fertilizer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fertilizer commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Fertilizer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Frtlzr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fertilizer";
			definition = "Fertilizer commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Freight commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Freight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Freight commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Freight = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Frght";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Freight commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityFreight1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Industrial Product commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice
	 * AssetClassCommodityIndustrialProduct1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndstrlPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustrialProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Industrial Product commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IndustrialProduct = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "IndstrlPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialProduct";
			definition = "Industrial Product commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityIndustrialProduct1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Metal commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice
	 * AssetClassCommodityMetal1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Metl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Metal commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Metal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Metl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metal";
			definition = "Metal commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityMetal1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Other C10 commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice
	 * AssetClassCommodityOtherC102Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrC10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherC10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other C10 commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OtherC10 = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "OthrC10";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherC10";
			definition = "Other C10 commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityOtherC102Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Paper commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ppr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paper commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Paper = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Ppr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Paper commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Polypropylene commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice
	 * AssetClassCommodityPolypropylene1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plprpln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Polypropylene"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Polypropylene commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Polypropylene = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Plprpln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Polypropylene";
			definition = "Polypropylene commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityPolypropylene1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Inflation commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityInflation1
	 * AssetClassCommodityInflation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Infltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inflation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Inflation commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Inflation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Infltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inflation";
			definition = "Inflation commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityInflation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Multi Commodity Exotic
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1
	 * AssetClassCommodityMultiCommodityExotic1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MultiCmmdtyExtc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCommodityExotic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multi Commodity Exotic"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MultiCommodityExotic = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "MultiCmmdtyExtc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCommodityExotic";
			definition = "Multi Commodity Exotic";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityMultiCommodityExotic1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Official Economic Statistics commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1
	 * AssetClassCommodityOfficialEconomicStatistics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclEcnmcSttstcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialEconomicStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official Economic Statistics commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OfficialEconomicStatistics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "OffclEcnmcSttstcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialEconomicStatistics";
			definition = "Official Economic Statistics commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityOfficialEconomicStatistics1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Other commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AssetClassCommodityOther1
	 * AssetClassCommodityOther1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Other = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other commodities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssetClassCommodityOther1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodity3Choice.Agricultural, com.tools20022.repository.choice.AssetClassCommodity3Choice.Energy,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.Environmental, com.tools20022.repository.choice.AssetClassCommodity3Choice.Fertilizer, com.tools20022.repository.choice.AssetClassCommodity3Choice.Freight,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.IndustrialProduct, com.tools20022.repository.choice.AssetClassCommodity3Choice.Metal, com.tools20022.repository.choice.AssetClassCommodity3Choice.OtherC10,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.Paper, com.tools20022.repository.choice.AssetClassCommodity3Choice.Polypropylene, com.tools20022.repository.choice.AssetClassCommodity3Choice.Inflation,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.MultiCommodityExotic, com.tools20022.repository.choice.AssetClassCommodity3Choice.OfficialEconomicStatistics,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.Other);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodity3Choice";
				definition = "Choice to define commodity specific attributes of a derivative.";
			}
		});
		return mmObject_lazy.get();
	}
}