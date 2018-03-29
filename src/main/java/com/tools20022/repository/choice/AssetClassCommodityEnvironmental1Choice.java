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
import java.util.Objects;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodityEnvironmental1Choice", propOrder = {"emissions", "weather", "carbonRelated"})
public class AssetClassCommodityEnvironmental1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Emssns", required = true)
	protected EnvironmentalCommodityEmission1 emissions;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityEmission1> mmEmissions = new MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityEmission1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmObject();
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

		@Override
		public EnvironmentalCommodityEmission1 getValue(AssetClassCommodityEnvironmental1Choice obj) {
			return obj.getEmissions();
		}

		@Override
		public void setValue(AssetClassCommodityEnvironmental1Choice obj, EnvironmentalCommodityEmission1 value) {
			obj.setEmissions(value);
		}
	};
	@XmlElement(name = "Wthr", required = true)
	protected EnvironmentalCommodityWeather1 weather;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityWeather1> mmWeather = new MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityWeather1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmObject();
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

		@Override
		public EnvironmentalCommodityWeather1 getValue(AssetClassCommodityEnvironmental1Choice obj) {
			return obj.getWeather();
		}

		@Override
		public void setValue(AssetClassCommodityEnvironmental1Choice obj, EnvironmentalCommodityWeather1 value) {
			obj.setWeather(value);
		}
	};
	@XmlElement(name = "CrbnRltd", required = true)
	protected EnvironmentalCommodityCarbonRelated1 carbonRelated;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityCarbonRelated1> mmCarbonRelated = new MMMessageAssociationEnd<AssetClassCommodityEnvironmental1Choice, EnvironmentalCommodityCarbonRelated1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmObject();
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

		@Override
		public EnvironmentalCommodityCarbonRelated1 getValue(AssetClassCommodityEnvironmental1Choice obj) {
			return obj.getCarbonRelated();
		}

		@Override
		public void setValue(AssetClassCommodityEnvironmental1Choice obj, EnvironmentalCommodityCarbonRelated1 value) {
			obj.setCarbonRelated(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmEmissions, com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmWeather,
						com.tools20022.repository.choice.AssetClassCommodityEnvironmental1Choice.mmCarbonRelated);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityEnvironmental1Choice";
				definition = "Defines commodity attributes of a derivative where the type is environmental.";
			}
		});
		return mmObject_lazy.get();
	}

	public EnvironmentalCommodityEmission1 getEmissions() {
		return emissions;
	}

	public AssetClassCommodityEnvironmental1Choice setEmissions(EnvironmentalCommodityEmission1 emissions) {
		this.emissions = Objects.requireNonNull(emissions);
		return this;
	}

	public EnvironmentalCommodityWeather1 getWeather() {
		return weather;
	}

	public AssetClassCommodityEnvironmental1Choice setWeather(EnvironmentalCommodityWeather1 weather) {
		this.weather = Objects.requireNonNull(weather);
		return this;
	}

	public EnvironmentalCommodityCarbonRelated1 getCarbonRelated() {
		return carbonRelated;
	}

	public AssetClassCommodityEnvironmental1Choice setCarbonRelated(EnvironmentalCommodityCarbonRelated1 carbonRelated) {
		this.carbonRelated = Objects.requireNonNull(carbonRelated);
		return this;
	}
}