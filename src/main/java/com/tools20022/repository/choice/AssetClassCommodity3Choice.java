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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AssetClassCommodityInflation1;
import com.tools20022.repository.msg.AssetClassCommodityMultiCommodityExotic1;
import com.tools20022.repository.msg.AssetClassCommodityOfficialEconomicStatistics1;
import com.tools20022.repository.msg.AssetClassCommodityOther1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodity3Choice", propOrder = {"agricultural", "energy", "environmental", "fertilizer", "freight", "industrialProduct", "metal", "otherC10", "paper", "polypropylene", "inflation", "multiCommodityExotic",
		"officialEconomicStatistics", "other"})
public class AssetClassCommodity3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Agrcltrl", required = true)
	protected AssetClassCommodityAgricultural1Choice agricultural;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityAgricultural1Choice> mmAgricultural = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityAgricultural1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Agrcltrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agricultural";
			definition = "Agricultural commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityAgricultural1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getAgricultural();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityAgricultural1Choice value) {
			obj.setAgricultural(value);
		}
	};
	@XmlElement(name = "Nrgy", required = true)
	protected AssetClassCommodityEnergy1Choice energy;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityEnergy1Choice> mmEnergy = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityEnergy1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Nrgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Energy";
			definition = "Energy commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityEnergy1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getEnergy();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityEnergy1Choice value) {
			obj.setEnergy(value);
		}
	};
	@XmlElement(name = "Envttl", required = true)
	protected AssetClassCommodityEnvironmental1Choice environmental;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityEnvironmental1Choice> mmEnvironmental = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityEnvironmental1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Envttl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environmental";
			definition = "Environmental commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityEnvironmental1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getEnvironmental();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityEnvironmental1Choice value) {
			obj.setEnvironmental(value);
		}
	};
	@XmlElement(name = "Frtlzr", required = true)
	protected AssetClassCommodityFertilizer1Choice fertilizer;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityFertilizer1Choice> mmFertilizer = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityFertilizer1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Frtlzr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fertilizer";
			definition = "Fertilizer commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityFertilizer1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getFertilizer();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityFertilizer1Choice value) {
			obj.setFertilizer(value);
		}
	};
	@XmlElement(name = "Frght", required = true)
	protected AssetClassCommodityFreight1Choice freight;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityFreight1Choice> mmFreight = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityFreight1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Frght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Freight commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityFreight1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityFreight1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getFreight();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityFreight1Choice value) {
			obj.setFreight(value);
		}
	};
	@XmlElement(name = "IndstrlPdct", required = true)
	protected AssetClassCommodityIndustrialProduct1Choice industrialProduct;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityIndustrialProduct1Choice> mmIndustrialProduct = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityIndustrialProduct1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "IndstrlPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialProduct";
			definition = "Industrial Product commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityIndustrialProduct1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityIndustrialProduct1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getIndustrialProduct();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityIndustrialProduct1Choice value) {
			obj.setIndustrialProduct(value);
		}
	};
	@XmlElement(name = "Metl", required = true)
	protected AssetClassCommodityMetal1Choice metal;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityMetal1Choice> mmMetal = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityMetal1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Metl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metal";
			definition = "Metal commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityMetal1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityMetal1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getMetal();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityMetal1Choice value) {
			obj.setMetal(value);
		}
	};
	@XmlElement(name = "OthrC10", required = true)
	protected AssetClassCommodityOtherC102Choice otherC10;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOtherC102Choice> mmOtherC10 = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOtherC102Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrC10";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherC10";
			definition = "Other C10 commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityOtherC102Choice.mmObject();
		}

		@Override
		public AssetClassCommodityOtherC102Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getOtherC10();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityOtherC102Choice value) {
			obj.setOtherC10(value);
		}
	};
	@XmlElement(name = "Ppr", required = true)
	protected AssetClassCommodityPaper1Choice paper;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityPaper1Choice> mmPaper = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityPaper1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Ppr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Paper commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityPaper1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getPaper();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityPaper1Choice value) {
			obj.setPaper(value);
		}
	};
	@XmlElement(name = "Plprpln", required = true)
	protected AssetClassCommodityPolypropylene1Choice polypropylene;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityPolypropylene1Choice> mmPolypropylene = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityPolypropylene1Choice>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Plprpln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Polypropylene";
			definition = "Polypropylene commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityPolypropylene1Choice.mmObject();
		}

		@Override
		public AssetClassCommodityPolypropylene1Choice getValue(AssetClassCommodity3Choice obj) {
			return obj.getPolypropylene();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityPolypropylene1Choice value) {
			obj.setPolypropylene(value);
		}
	};
	@XmlElement(name = "Infltn", required = true)
	protected AssetClassCommodityInflation1 inflation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityInflation1> mmInflation = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityInflation1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
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

		@Override
		public AssetClassCommodityInflation1 getValue(AssetClassCommodity3Choice obj) {
			return obj.getInflation();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityInflation1 value) {
			obj.setInflation(value);
		}
	};
	@XmlElement(name = "MultiCmmdtyExtc", required = true)
	protected AssetClassCommodityMultiCommodityExotic1 multiCommodityExotic;
	/**
	 * 
	 <p>
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
	 * definition} = "Multi Commodity Exotic."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityMultiCommodityExotic1> mmMultiCommodityExotic = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityMultiCommodityExotic1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
			isDerived = false;
			xmlTag = "MultiCmmdtyExtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCommodityExotic";
			definition = "Multi Commodity Exotic.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodityMultiCommodityExotic1.mmObject();
		}

		@Override
		public AssetClassCommodityMultiCommodityExotic1 getValue(AssetClassCommodity3Choice obj) {
			return obj.getMultiCommodityExotic();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityMultiCommodityExotic1 value) {
			obj.setMultiCommodityExotic(value);
		}
	};
	@XmlElement(name = "OffclEcnmcSttstcs", required = true)
	protected AssetClassCommodityOfficialEconomicStatistics1 officialEconomicStatistics;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOfficialEconomicStatistics1> mmOfficialEconomicStatistics = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOfficialEconomicStatistics1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
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

		@Override
		public AssetClassCommodityOfficialEconomicStatistics1 getValue(AssetClassCommodity3Choice obj) {
			return obj.getOfficialEconomicStatistics();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityOfficialEconomicStatistics1 value) {
			obj.setOfficialEconomicStatistics(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected AssetClassCommodityOther1 other;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOther1> mmOther = new MMMessageAssociationEnd<AssetClassCommodity3Choice, AssetClassCommodityOther1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity3Choice.mmObject();
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

		@Override
		public AssetClassCommodityOther1 getValue(AssetClassCommodity3Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(AssetClassCommodity3Choice obj, AssetClassCommodityOther1 value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodity3Choice.mmAgricultural, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmEnergy,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmEnvironmental, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmFertilizer,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmFreight, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmIndustrialProduct,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmMetal, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmOtherC10, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmPaper,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmPolypropylene, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmInflation,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmMultiCommodityExotic, com.tools20022.repository.choice.AssetClassCommodity3Choice.mmOfficialEconomicStatistics,
						com.tools20022.repository.choice.AssetClassCommodity3Choice.mmOther);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodity3Choice";
				definition = "Choice to define commodity specific attributes of a derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassCommodityAgricultural1Choice getAgricultural() {
		return agricultural;
	}

	public AssetClassCommodity3Choice setAgricultural(AssetClassCommodityAgricultural1Choice agricultural) {
		this.agricultural = Objects.requireNonNull(agricultural);
		return this;
	}

	public AssetClassCommodityEnergy1Choice getEnergy() {
		return energy;
	}

	public AssetClassCommodity3Choice setEnergy(AssetClassCommodityEnergy1Choice energy) {
		this.energy = Objects.requireNonNull(energy);
		return this;
	}

	public AssetClassCommodityEnvironmental1Choice getEnvironmental() {
		return environmental;
	}

	public AssetClassCommodity3Choice setEnvironmental(AssetClassCommodityEnvironmental1Choice environmental) {
		this.environmental = Objects.requireNonNull(environmental);
		return this;
	}

	public AssetClassCommodityFertilizer1Choice getFertilizer() {
		return fertilizer;
	}

	public AssetClassCommodity3Choice setFertilizer(AssetClassCommodityFertilizer1Choice fertilizer) {
		this.fertilizer = Objects.requireNonNull(fertilizer);
		return this;
	}

	public AssetClassCommodityFreight1Choice getFreight() {
		return freight;
	}

	public AssetClassCommodity3Choice setFreight(AssetClassCommodityFreight1Choice freight) {
		this.freight = Objects.requireNonNull(freight);
		return this;
	}

	public AssetClassCommodityIndustrialProduct1Choice getIndustrialProduct() {
		return industrialProduct;
	}

	public AssetClassCommodity3Choice setIndustrialProduct(AssetClassCommodityIndustrialProduct1Choice industrialProduct) {
		this.industrialProduct = Objects.requireNonNull(industrialProduct);
		return this;
	}

	public AssetClassCommodityMetal1Choice getMetal() {
		return metal;
	}

	public AssetClassCommodity3Choice setMetal(AssetClassCommodityMetal1Choice metal) {
		this.metal = Objects.requireNonNull(metal);
		return this;
	}

	public AssetClassCommodityOtherC102Choice getOtherC10() {
		return otherC10;
	}

	public AssetClassCommodity3Choice setOtherC10(AssetClassCommodityOtherC102Choice otherC10) {
		this.otherC10 = Objects.requireNonNull(otherC10);
		return this;
	}

	public AssetClassCommodityPaper1Choice getPaper() {
		return paper;
	}

	public AssetClassCommodity3Choice setPaper(AssetClassCommodityPaper1Choice paper) {
		this.paper = Objects.requireNonNull(paper);
		return this;
	}

	public AssetClassCommodityPolypropylene1Choice getPolypropylene() {
		return polypropylene;
	}

	public AssetClassCommodity3Choice setPolypropylene(AssetClassCommodityPolypropylene1Choice polypropylene) {
		this.polypropylene = Objects.requireNonNull(polypropylene);
		return this;
	}

	public AssetClassCommodityInflation1 getInflation() {
		return inflation;
	}

	public AssetClassCommodity3Choice setInflation(AssetClassCommodityInflation1 inflation) {
		this.inflation = Objects.requireNonNull(inflation);
		return this;
	}

	public AssetClassCommodityMultiCommodityExotic1 getMultiCommodityExotic() {
		return multiCommodityExotic;
	}

	public AssetClassCommodity3Choice setMultiCommodityExotic(AssetClassCommodityMultiCommodityExotic1 multiCommodityExotic) {
		this.multiCommodityExotic = Objects.requireNonNull(multiCommodityExotic);
		return this;
	}

	public AssetClassCommodityOfficialEconomicStatistics1 getOfficialEconomicStatistics() {
		return officialEconomicStatistics;
	}

	public AssetClassCommodity3Choice setOfficialEconomicStatistics(AssetClassCommodityOfficialEconomicStatistics1 officialEconomicStatistics) {
		this.officialEconomicStatistics = Objects.requireNonNull(officialEconomicStatistics);
		return this;
	}

	public AssetClassCommodityOther1 getOther() {
		return other;
	}

	public AssetClassCommodity3Choice setOther(AssetClassCommodityOther1 other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}