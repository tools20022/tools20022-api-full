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
import com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1;
import com.tools20022.repository.msg.EnvironmentalCommodityEmission1;
import com.tools20022.repository.msg.EnvironmentalCommodityWeather1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmEmissions
 * AssetClassCommodityEnvironmental1Choice.mmEmissions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmWeather
 * AssetClassCommodityEnvironmental1Choice.mmWeather}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice#mmCarbonRelated
 * AssetClassCommodityEnvironmental1Choice.mmCarbonRelated}</li>
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
 * "AssetClassCommodityEnvironmental1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is environmental."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityEnvironmental1Choice", propOrder = {"emissions", "weather", "carbonRelated"})
public class AssetClassCommodityEnvironmental1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected EnvironmentalCommodityEmission1 emissions;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmEmissions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			isDerived = false;
			xmlTag = "Emssns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Emissions";
			definition = "Emissions environmental commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnvironmentalCommodityEmission1.mmObject();
		}
	};
	protected EnvironmentalCommodityWeather1 weather;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmWeather = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			isDerived = false;
			xmlTag = "Wthr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weather";
			definition = "Weather environmental commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnvironmentalCommodityWeather1.mmObject();
		}
	};
	protected EnvironmentalCommodityCarbonRelated1 carbonRelated;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmCarbonRelated = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnvironmental1Choice.mmObject();
			isDerived = false;
			xmlTag = "CrbnRltd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarbonRelated";
			definition = "Carbon related environmental commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnvironmentalCommodityCarbonRelated1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityEnvironmental1Choice.mmEmissions, AssetClassCommodityEnvironmental1Choice.mmWeather, AssetClassCommodityEnvironmental1Choice.mmCarbonRelated);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityEnvironmental1Choice";
				definition = "Defines commodity attributes of a derivative where the type is environmental.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Emssns", required = true)
	public EnvironmentalCommodityEmission1 getEmissions() {
		return emissions;
	}

	public void setEmissions(EnvironmentalCommodityEmission1 emissions) {
		this.emissions = emissions;
	}

	@XmlElement(name = "Wthr", required = true)
	public EnvironmentalCommodityWeather1 getWeather() {
		return weather;
	}

	public void setWeather(EnvironmentalCommodityWeather1 weather) {
		this.weather = weather;
	}

	@XmlElement(name = "CrbnRltd", required = true)
	public EnvironmentalCommodityCarbonRelated1 getCarbonRelated() {
		return carbonRelated;
	}

	public void setCarbonRelated(EnvironmentalCommodityCarbonRelated1 carbonRelated) {
		this.carbonRelated = carbonRelated;
	}
}