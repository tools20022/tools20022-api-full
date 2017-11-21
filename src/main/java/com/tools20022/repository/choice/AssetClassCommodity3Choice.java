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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AssetClassCommodityInflation1;
import com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1;
import com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1;
import com.tools20022.repository.msg.AssetClassCommodityOther1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "AssetClassCommodity3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to define commodity specific attributes of a derivative."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodity3Choice", propOrder = {"agricultural", "energy", "environmental", "fertilizer", "freight", "industrialProduct", "metal", "otherC10", "paper", "polypropylene", "inflation", "multiCommodityExotic",
		"officialEconomicStatistics", "other"})
public class AssetClassCommodity3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetClassCommodityAgricultural1Choice agricultural;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmAgricultural = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Agrcltrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agricultural";
			definition = "Agricultural commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.mmObject();
		}
	};
	protected AssetClassCommodityEnergy1Choice energy;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmEnergy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Nrgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Energy";
			definition = "Energy commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.mmObject();
		}
	};
	protected AssetClassCommodityEnvironmental1Choice environmental;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmEnvironmental = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Envttl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environmental";
			definition = "Environmental commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmObject();
		}
	};
	protected AssetClassCommodityFertilizer1Choice fertilizer;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmFertilizer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Frtlzr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fertilizer";
			definition = "Fertilizer commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
		}
	};
	protected AssetClassCommodityFreight1Choice freight;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmFreight = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Frght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Freight commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.mmObject();
		}
	};
	protected AssetClassCommodityIndustrialProduct1Choice industrialProduct;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmIndustrialProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "IndstrlPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialProduct";
			definition = "Industrial Product commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.mmObject();
		}
	};
	protected AssetClassCommodityMetal1Choice metal;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmMetal = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Metl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metal";
			definition = "Metal commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityMetal1Choice.mmObject();
		}
	};
	protected AssetClassCommodityOtherC102Choice otherC10;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmOtherC10 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrC10";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherC10";
			definition = "Other C10 commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice.mmObject();
		}
	};
	protected AssetClassCommodityPaper1Choice paper;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmPaper = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Ppr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Paper commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmObject();
		}
	};
	protected AssetClassCommodityPolypropylene1Choice polypropylene;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmPolypropylene = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Plprpln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Polypropylene";
			definition = "Polypropylene commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice.mmObject();
		}
	};
	protected AssetClassCommodityInflation1 inflation;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmInflation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Infltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inflation";
			definition = "Inflation commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityInflation1.mmObject();
		}
	};
	protected AssetClassCommodityMultiCommodityExotic1 multiCommodityExotic;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmMultiCommodityExotic = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "MultiCmmdtyExtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCommodityExotic";
			definition = "Multi Commodity Exotic";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityMultiCommodityExotic1.mmObject();
		}
	};
	protected AssetClassCommodityOfficialEconomicStatistics1 officialEconomicStatistics;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmOfficialEconomicStatistics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "OffclEcnmcSttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialEconomicStatistics";
			definition = "Official Economic Statistics commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityOfficialEconomicStatistics1.mmObject();
		}
	};
	protected AssetClassCommodityOther1 other;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityOther1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodity3Choice.mmAgricultural, AssetClassCommodity3Choice.mmEnergy, AssetClassCommodity3Choice.mmEnvironmental, AssetClassCommodity3Choice.mmFertilizer,
						AssetClassCommodity3Choice.mmFreight, AssetClassCommodity3Choice.mmIndustrialProduct, AssetClassCommodity3Choice.mmMetal, AssetClassCommodity3Choice.mmOtherC10, AssetClassCommodity3Choice.mmPaper,
						AssetClassCommodity3Choice.mmPolypropylene, AssetClassCommodity3Choice.mmInflation, AssetClassCommodity3Choice.mmMultiCommodityExotic, AssetClassCommodity3Choice.mmOfficialEconomicStatistics,
						AssetClassCommodity3Choice.mmOther);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodity3Choice";
				definition = "Choice to define commodity specific attributes of a derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Agrcltrl", required = true)
	public AssetClassCommodityAgricultural1Choice getAgricultural() {
		return agricultural;
	}

	public void setAgricultural(com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice agricultural) {
		this.agricultural = agricultural;
	}

	@XmlElement(name = "Nrgy", required = true)
	public AssetClassCommodityEnergy1Choice getEnergy() {
		return energy;
	}

	public void setEnergy(com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice energy) {
		this.energy = energy;
	}

	@XmlElement(name = "Envttl", required = true)
	public AssetClassCommodityEnvironmental1Choice getEnvironmental() {
		return environmental;
	}

	public void setEnvironmental(com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice environmental) {
		this.environmental = environmental;
	}

	@XmlElement(name = "Frtlzr", required = true)
	public AssetClassCommodityFertilizer1Choice getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice fertilizer) {
		this.fertilizer = fertilizer;
	}

	@XmlElement(name = "Frght", required = true)
	public AssetClassCommodityFreight1Choice getFreight() {
		return freight;
	}

	public void setFreight(com.tools20022.repository.choice.AssetClassCommodityFreight1Choice freight) {
		this.freight = freight;
	}

	@XmlElement(name = "IndstrlPdct", required = true)
	public AssetClassCommodityIndustrialProduct1Choice getIndustrialProduct() {
		return industrialProduct;
	}

	public void setIndustrialProduct(com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice industrialProduct) {
		this.industrialProduct = industrialProduct;
	}

	@XmlElement(name = "Metl", required = true)
	public AssetClassCommodityMetal1Choice getMetal() {
		return metal;
	}

	public void setMetal(com.tools20022.repository.choice.AssetClassCommodityMetal1Choice metal) {
		this.metal = metal;
	}

	@XmlElement(name = "OthrC10", required = true)
	public AssetClassCommodityOtherC102Choice getOtherC10() {
		return otherC10;
	}

	public void setOtherC10(com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice otherC10) {
		this.otherC10 = otherC10;
	}

	@XmlElement(name = "Ppr", required = true)
	public AssetClassCommodityPaper1Choice getPaper() {
		return paper;
	}

	public void setPaper(com.tools20022.repository.choice.AssetClassCommodityPaper1Choice paper) {
		this.paper = paper;
	}

	@XmlElement(name = "Plprpln", required = true)
	public AssetClassCommodityPolypropylene1Choice getPolypropylene() {
		return polypropylene;
	}

	public void setPolypropylene(com.tools20022.repository.choice.AssetClassCommodityPolypropylene1Choice polypropylene) {
		this.polypropylene = polypropylene;
	}

	@XmlElement(name = "Infltn", required = true)
	public AssetClassCommodityInflation1 getInflation() {
		return inflation;
	}

	public void setInflation(AssetClassCommodityInflation1 inflation) {
		this.inflation = inflation;
	}

	@XmlElement(name = "MultiCmmdtyExtc", required = true)
	public AssetClassCommodityMultiCommodityExotic1 getMultiCommodityExotic() {
		return multiCommodityExotic;
	}

	public void setMultiCommodityExotic(AssetClassCommodityMultiCommodityExotic1 multiCommodityExotic) {
		this.multiCommodityExotic = multiCommodityExotic;
	}

	@XmlElement(name = "OffclEcnmcSttstcs", required = true)
	public AssetClassCommodityOfficialEconomicStatistics1 getOfficialEconomicStatistics() {
		return officialEconomicStatistics;
	}

	public void setOfficialEconomicStatistics(AssetClassCommodityOfficialEconomicStatistics1 officialEconomicStatistics) {
		this.officialEconomicStatistics = officialEconomicStatistics;
	}

	@XmlElement(name = "Othr", required = true)
	public AssetClassCommodityOther1 getOther() {
		return other;
	}

	public void setOther(AssetClassCommodityOther1 other) {
		this.other = other;
	}
}