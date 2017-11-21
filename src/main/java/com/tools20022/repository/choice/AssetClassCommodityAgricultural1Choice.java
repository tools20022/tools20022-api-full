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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * "AssetClassCommodityAgricultural1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is agricultural."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityAgricultural1Choice", propOrder = {"grainOilSeed", "soft", "potato", "oliveOil", "dairy", "forestry", "seafood", "liveStock", "grain"})
public class AssetClassCommodityAgricultural1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AgriculturalCommodityOilSeed1 grainOilSeed;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmGrainOilSeed = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "GrnOilSeed";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrainOilSeed";
			definition = "Grain oil seed agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityOilSeed1.mmObject();
		}
	};
	protected AgriculturalCommoditySoft1 soft;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmSoft = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Soft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soft";
			definition = "Soft agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommoditySoft1.mmObject();
		}
	};
	protected AgriculturalCommodityPotato1 potato;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmPotato = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ptt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Potato";
			definition = "Potato agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityPotato1.mmObject();
		}
	};
	protected AgriculturalCommodityOliveOil1 oliveOil;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmOliveOil = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "OlvOil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OliveOil";
			definition = "Olive oil agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityOliveOil1.mmObject();
		}
	};
	protected AgriculturalCommodityDairy1 dairy;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmDairy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dairy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dairy";
			definition = "Dairy agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityDairy1.mmObject();
		}
	};
	protected AgriculturalCommodityForestry1 forestry;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmForestry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Frstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forestry";
			definition = "Forestry agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityForestry1.mmObject();
		}
	};
	protected AgriculturalCommoditySeafood1 seafood;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmSeafood = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Sfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seafood";
			definition = "Seafood agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommoditySeafood1.mmObject();
		}
	};
	protected AgriculturalCommodityLiveStock1 liveStock;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmLiveStock = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "LiveStock";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiveStock";
			definition = "Livestock agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityLiveStock1.mmObject();
		}
	};
	protected AgriculturalCommodityGrain1 grain;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmGrain = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityAgricultural1Choice.mmObject();
			isDerived = false;
			xmlTag = "Grn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Grain";
			definition = "Grain agricultural commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgriculturalCommodityGrain1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityAgricultural1Choice.mmGrainOilSeed, AssetClassCommodityAgricultural1Choice.mmSoft, AssetClassCommodityAgricultural1Choice.mmPotato,
						AssetClassCommodityAgricultural1Choice.mmOliveOil, AssetClassCommodityAgricultural1Choice.mmDairy, AssetClassCommodityAgricultural1Choice.mmForestry, AssetClassCommodityAgricultural1Choice.mmSeafood,
						AssetClassCommodityAgricultural1Choice.mmLiveStock, AssetClassCommodityAgricultural1Choice.mmGrain);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityAgricultural1Choice";
				definition = "Defines commodity attributes of a derivative where the type is agricultural.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrnOilSeed", required = true)
	public AgriculturalCommodityOilSeed1 getGrainOilSeed() {
		return grainOilSeed;
	}

	public void setGrainOilSeed(AgriculturalCommodityOilSeed1 grainOilSeed) {
		this.grainOilSeed = grainOilSeed;
	}

	@XmlElement(name = "Soft", required = true)
	public AgriculturalCommoditySoft1 getSoft() {
		return soft;
	}

	public void setSoft(AgriculturalCommoditySoft1 soft) {
		this.soft = soft;
	}

	@XmlElement(name = "Ptt", required = true)
	public AgriculturalCommodityPotato1 getPotato() {
		return potato;
	}

	public void setPotato(AgriculturalCommodityPotato1 potato) {
		this.potato = potato;
	}

	@XmlElement(name = "OlvOil", required = true)
	public AgriculturalCommodityOliveOil1 getOliveOil() {
		return oliveOil;
	}

	public void setOliveOil(AgriculturalCommodityOliveOil1 oliveOil) {
		this.oliveOil = oliveOil;
	}

	@XmlElement(name = "Dairy", required = true)
	public AgriculturalCommodityDairy1 getDairy() {
		return dairy;
	}

	public void setDairy(AgriculturalCommodityDairy1 dairy) {
		this.dairy = dairy;
	}

	@XmlElement(name = "Frstry", required = true)
	public AgriculturalCommodityForestry1 getForestry() {
		return forestry;
	}

	public void setForestry(AgriculturalCommodityForestry1 forestry) {
		this.forestry = forestry;
	}

	@XmlElement(name = "Sfd", required = true)
	public AgriculturalCommoditySeafood1 getSeafood() {
		return seafood;
	}

	public void setSeafood(AgriculturalCommoditySeafood1 seafood) {
		this.seafood = seafood;
	}

	@XmlElement(name = "LiveStock", required = true)
	public AgriculturalCommodityLiveStock1 getLiveStock() {
		return liveStock;
	}

	public void setLiveStock(AgriculturalCommodityLiveStock1 liveStock) {
		this.liveStock = liveStock;
	}

	@XmlElement(name = "Grn", required = true)
	public AgriculturalCommodityGrain1 getGrain() {
		return grain;
	}

	public void setGrain(AgriculturalCommodityGrain1 grain) {
		this.grain = grain;
	}
}