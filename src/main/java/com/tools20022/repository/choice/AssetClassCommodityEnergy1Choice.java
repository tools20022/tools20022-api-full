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
 * Defines commodity attributes of a derivative where the type is energy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#Electricity
 * AssetClassCommodityEnergy1Choice.Electricity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#NaturalGas
 * AssetClassCommodityEnergy1Choice.NaturalGas}</li>
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
 * "AssetClassCommodityEnergy1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is energy."</li>
 * </ul>
 */
public class AssetClassCommodityEnergy1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Definition of Electricity energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityElectricity1
	 * EnergyCommodityElectricity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Elctrcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electricity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of Electricity energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Electricity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Elctrcty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electricity";
			definition = "Definition of Electricity energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityElectricity1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Definition of Natural Gas energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityNaturalGas1
	 * EnergyCommodityNaturalGas1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#BaseProduct
	 * Commodity.BaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrlGas"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalGas"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of Natural Gas energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NaturalGas = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.BaseProduct;
			isDerived = false;
			xmlTag = "NtrlGas";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalGas";
			definition = "Definition of Natural Gas energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityNaturalGas1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Definition of Oil energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1
	 * EnergyCommodityOil1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oil"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of Oil energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Oil = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Oil";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oil";
			definition = "Definition of Oil energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityOil1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Definition of Coal energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnergyCommodityCoal1
	 * EnergyCommodityCoal1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of Coal energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Coal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Coal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coal";
			definition = "Definition of Coal energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityCoal1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Inter energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityInterEnergy1
	 * EnergyCommodityInterEnergy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrNrgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterEnergy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Inter energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InterEnergy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "IntrNrgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterEnergy";
			definition = "Inter energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityInterEnergy1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Renewable energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityRenewableEnergy1
	 * EnergyCommodityRenewableEnergy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnwblNrgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenewableEnergy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Renewable energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RenewableEnergy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "RnwblNrgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewableEnergy";
			definition = "Renewable energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityRenewableEnergy1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Light end energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityLightEnd1
	 * EnergyCommodityLightEnd1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LghtEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LightEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Light end energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LightEnd = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "LghtEnd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LightEnd";
			definition = "Light end energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityLightEnd1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Distillates energy commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityDistillates1
	 * EnergyCommodityDistillates1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice
	 * AssetClassCommodityEnergy1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dstllts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distillates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distillates energy commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Distillates = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Dstllts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distillates";
			definition = "Distillates energy commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnergyCommodityDistillates1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Electricity, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.NaturalGas,
						com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Oil, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Coal,
						com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.InterEnergy, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.RenewableEnergy,
						com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.LightEnd, com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice.Distillates);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityEnergy1Choice";
				definition = "Defines commodity attributes of a derivative where the type is energy.";
			}
		});
		return mmObject_lazy.get();
	}
}