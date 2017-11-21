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
 * Defines commodity attributes of a derivative where the type is energy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmElectricity
 * AssetClassCommodityEnergy1Choice.mmElectricity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityEnergy1Choice#mmNaturalGas
 * AssetClassCommodityEnergy1Choice.mmNaturalGas}</li>
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
 * "AssetClassCommodityEnergy1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is energy."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityEnergy1Choice", propOrder = {"electricity", "naturalGas", "oil", "coal", "interEnergy", "renewableEnergy", "lightEnd", "distillates"})
public class AssetClassCommodityEnergy1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected EnergyCommodityElectricity1 electricity;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmElectricity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "Elctrcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electricity";
			definition = "Definition of Electricity energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityElectricity1.mmObject();
		}
	};
	protected EnergyCommodityNaturalGas1 naturalGas;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
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
	public static final MMMessageAssociationEnd mmNaturalGas = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "NtrlGas";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalGas";
			definition = "Definition of Natural Gas energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityNaturalGas1.mmObject();
		}
	};
	protected EnergyCommodityOil1 oil;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmOil = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "Oil";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oil";
			definition = "Definition of Oil energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityOil1.mmObject();
		}
	};
	protected EnergyCommodityCoal1 coal;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmCoal = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "Coal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coal";
			definition = "Definition of Coal energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityCoal1.mmObject();
		}
	};
	protected EnergyCommodityInterEnergy1 interEnergy;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmInterEnergy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrNrgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterEnergy";
			definition = "Inter energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityInterEnergy1.mmObject();
		}
	};
	protected EnergyCommodityRenewableEnergy1 renewableEnergy;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmRenewableEnergy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "RnwblNrgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewableEnergy";
			definition = "Renewable energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityRenewableEnergy1.mmObject();
		}
	};
	protected EnergyCommodityLightEnd1 lightEnd;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmLightEnd = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "LghtEnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LightEnd";
			definition = "Light end energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityLightEnd1.mmObject();
		}
	};
	protected EnergyCommodityDistillates1 distillates;
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
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
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
	public static final MMMessageAssociationEnd mmDistillates = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityEnergy1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dstllts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distillates";
			definition = "Distillates energy commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EnergyCommodityDistillates1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityEnergy1Choice.mmElectricity, AssetClassCommodityEnergy1Choice.mmNaturalGas, AssetClassCommodityEnergy1Choice.mmOil, AssetClassCommodityEnergy1Choice.mmCoal,
						AssetClassCommodityEnergy1Choice.mmInterEnergy, AssetClassCommodityEnergy1Choice.mmRenewableEnergy, AssetClassCommodityEnergy1Choice.mmLightEnd, AssetClassCommodityEnergy1Choice.mmDistillates);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityEnergy1Choice";
				definition = "Defines commodity attributes of a derivative where the type is energy.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Elctrcty", required = true)
	public EnergyCommodityElectricity1 getElectricity() {
		return electricity;
	}

	public void setElectricity(EnergyCommodityElectricity1 electricity) {
		this.electricity = electricity;
	}

	@XmlElement(name = "NtrlGas", required = true)
	public EnergyCommodityNaturalGas1 getNaturalGas() {
		return naturalGas;
	}

	public void setNaturalGas(EnergyCommodityNaturalGas1 naturalGas) {
		this.naturalGas = naturalGas;
	}

	@XmlElement(name = "Oil", required = true)
	public EnergyCommodityOil1 getOil() {
		return oil;
	}

	public void setOil(EnergyCommodityOil1 oil) {
		this.oil = oil;
	}

	@XmlElement(name = "Coal", required = true)
	public EnergyCommodityCoal1 getCoal() {
		return coal;
	}

	public void setCoal(EnergyCommodityCoal1 coal) {
		this.coal = coal;
	}

	@XmlElement(name = "IntrNrgy", required = true)
	public EnergyCommodityInterEnergy1 getInterEnergy() {
		return interEnergy;
	}

	public void setInterEnergy(EnergyCommodityInterEnergy1 interEnergy) {
		this.interEnergy = interEnergy;
	}

	@XmlElement(name = "RnwblNrgy", required = true)
	public EnergyCommodityRenewableEnergy1 getRenewableEnergy() {
		return renewableEnergy;
	}

	public void setRenewableEnergy(EnergyCommodityRenewableEnergy1 renewableEnergy) {
		this.renewableEnergy = renewableEnergy;
	}

	@XmlElement(name = "LghtEnd", required = true)
	public EnergyCommodityLightEnd1 getLightEnd() {
		return lightEnd;
	}

	public void setLightEnd(EnergyCommodityLightEnd1 lightEnd) {
		this.lightEnd = lightEnd;
	}

	@XmlElement(name = "Dstllts", required = true)
	public EnergyCommodityDistillates1 getDistillates() {
		return distillates;
	}

	public void setDistillates(EnergyCommodityDistillates1 distillates) {
		this.distillates = distillates;
	}
}