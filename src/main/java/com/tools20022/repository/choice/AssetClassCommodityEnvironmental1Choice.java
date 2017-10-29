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
import com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1;
import com.tools20022.repository.msg.EnvironmentalCommodityEmission1;
import com.tools20022.repository.msg.EnvironmentalCommodityWeather1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines commodity attributes of a derivative where the type is environmental.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
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
 * "AssetClassCommodityEnvironmental1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is environmental."
 * </li>
 * </ul>
 */
public class AssetClassCommodityEnvironmental1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Emissions environmental commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityEmission1
	 * EnvironmentalCommodityEmission1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice
	 * AssetClassCommodityEnvironmental1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Emssns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Emissions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Emissions environmental commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Emissions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Emssns";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Emissions";
			definition = "Emissions environmental commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnvironmentalCommodityEmission1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Weather environmental commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityWeather1
	 * EnvironmentalCommodityWeather1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice
	 * AssetClassCommodityEnvironmental1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wthr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weather"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weather environmental commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Weather = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Wthr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weather";
			definition = "Weather environmental commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnvironmentalCommodityWeather1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Carbon related environmental commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1
	 * EnvironmentalCommodityCarbonRelated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice
	 * AssetClassCommodityEnvironmental1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrbnRltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarbonRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Carbon related environmental commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CarbonRelated = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "CrbnRltd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarbonRelated";
			definition = "Carbon related environmental commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnvironmentalCommodityCarbonRelated1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.Emissions, com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.Weather,
						com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.CarbonRelated);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityEnvironmental1Choice";
				definition = "Defines commodity attributes of a derivative where the type is environmental.";
			}
		});
		return mmObject_lazy.get();
	}
}