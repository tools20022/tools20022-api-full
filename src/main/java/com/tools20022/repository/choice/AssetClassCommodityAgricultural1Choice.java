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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines commodity attributes of a derivative where the type is agricultural.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
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
 * "AssetClassCommodityAgricultural1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is agricultural."
 * </li>
 * </ul>
 */
public class AssetClassCommodityAgricultural1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Grain oil seed agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOilSeed1
	 * AgriculturalCommodityOilSeed1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrnOilSeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrainOilSeed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Grain oil seed agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GrainOilSeed = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "GrnOilSeed";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrainOilSeed";
			definition = "Grain oil seed agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityOilSeed1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Soft agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySoft1
	 * AgriculturalCommoditySoft1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Soft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Soft agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Soft = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Soft";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soft";
			definition = "Soft agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommoditySoft1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Potato agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityPotato1
	 * AgriculturalCommodityPotato1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ptt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Potato"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potato agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Potato = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Ptt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Potato";
			definition = "Potato agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityPotato1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Olive oil agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1
	 * AgriculturalCommodityOliveOil1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OlvOil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OliveOil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Olive oil agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OliveOil = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "OlvOil";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OliveOil";
			definition = "Olive oil agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityOliveOil1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Dairy agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityDairy1
	 * AgriculturalCommodityDairy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dairy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dairy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dairy agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Dairy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Dairy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dairy";
			definition = "Dairy agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityDairy1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Forestry agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityForestry1
	 * AgriculturalCommodityForestry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frstry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forestry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Forestry agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Forestry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Frstry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forestry";
			definition = "Forestry agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityForestry1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Seafood agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommoditySeafood1
	 * AgriculturalCommoditySeafood1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seafood"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Seafood agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Seafood = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Sfd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seafood";
			definition = "Seafood agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommoditySeafood1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Livestock agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityLiveStock1
	 * AgriculturalCommodityLiveStock1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LiveStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiveStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Livestock agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LiveStock = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "LiveStock";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiveStock";
			definition = "Livestock agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityLiveStock1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Grain agricultural commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityGrain1
	 * AgriculturalCommodityGrain1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice
	 * AssetClassCommodityAgricultural1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Grain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Grain agricultural commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Grain = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Grn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grain";
			definition = "Grain agricultural commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgriculturalCommodityGrain1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.GrainOilSeed, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Soft,
						com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Potato, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.OliveOil,
						com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Dairy, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Forestry,
						com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Seafood, com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.LiveStock,
						com.tools20022.repository.choice.AssetClassCommodityAgricultural1Choice.Grain);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityAgricultural1Choice";
				definition = "Defines commodity attributes of a derivative where the type is agricultural.";
			}
		});
		return mmObject_lazy.get();
	}
}