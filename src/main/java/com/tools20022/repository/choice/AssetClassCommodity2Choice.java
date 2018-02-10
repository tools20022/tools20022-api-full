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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AssetClassCommodity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity specific attributes of a derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmAgricultural
 * AssetClassCommodity2Choice.mmAgricultural}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmEnergy
 * AssetClassCommodity2Choice.mmEnergy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmEnvironmental
 * AssetClassCommodity2Choice.mmEnvironmental}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmFreight
 * AssetClassCommodity2Choice.mmFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmIndex
 * AssetClassCommodity2Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmMetal
 * AssetClassCommodity2Choice.mmMetal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmExotic
 * AssetClassCommodity2Choice.mmExotic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice#mmOther
 * AssetClassCommodity2Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetClassification
 * AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassCommodity2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines commodity specific attributes of a derivative."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassCommodity1
 * AssetClassCommodity1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodity2Choice", propOrder = {"agricultural", "energy", "environmental", "freight", "index", "metal", "exotic", "other"})
public class AssetClassCommodity2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Agrcltrl", required = true)
	protected AssetClassSubProductAgriculturalType1Code agricultural;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Code list for agricultural type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgricultural = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Agrcltrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agricultural";
			definition = "Code list for agricultural type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductAgriculturalType1Code.mmObject();
		}
	};
	@XmlElement(name = "Nrgy", required = true)
	protected AssetClassSubProductEnergyType1Code energy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnergyType1Code
	 * AssetClassSubProductEnergyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Code list for energy type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEnergy = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Nrgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Energy";
			definition = "Code list for energy type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductEnergyType1Code.mmObject();
		}
	};
	@XmlElement(name = "Envttl", required = true)
	protected AssetClassSubProductEnvironmentalType1Code environmental;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code
	 * AssetClassSubProductEnvironmentalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Code list for environmental type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEnvironmental = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Envttl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environmental";
			definition = "Code list for environmental type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductEnvironmentalType1Code.mmObject();
		}
	};
	@XmlElement(name = "Frght", required = true)
	protected AssetClassSubProductFreight1Code freight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductFreight1Code
	 * AssetClassSubProductFreight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Code list for freight type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFreight = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Frght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Freight";
			definition = "Code list for freight type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductFreight1Code.mmObject();
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected NoReasonCode index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the index type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndex = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Indicates the index type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	@XmlElement(name = "Metl", required = true)
	protected AssetClassSubProductMetal1Code metal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductMetal1Code
	 * AssetClassSubProductMetal1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Code list for metal type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMetal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Metl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metal";
			definition = "Code list for metal type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductMetal1Code.mmObject();
		}
	};
	@XmlElement(name = "Extc", required = true)
	protected NoReasonCode exotic;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Extc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exotic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the exotic type of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExotic = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Extc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exotic";
			definition = "Indicates the exotic type of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected NoReasonCode other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
	 * AssetClassCommodity2Choice}</li>
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
	 * definition} = "Indicates other types of commodities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Indicates other types of commodities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodity2Choice.mmAgricultural, com.tools20022.repository.choice.AssetClassCommodity2Choice.mmEnergy,
						com.tools20022.repository.choice.AssetClassCommodity2Choice.mmEnvironmental, com.tools20022.repository.choice.AssetClassCommodity2Choice.mmFreight,
						com.tools20022.repository.choice.AssetClassCommodity2Choice.mmIndex, com.tools20022.repository.choice.AssetClassCommodity2Choice.mmMetal, com.tools20022.repository.choice.AssetClassCommodity2Choice.mmExotic,
						com.tools20022.repository.choice.AssetClassCommodity2Choice.mmOther);
				trace_lazy = () -> AssetClassification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AssetClassCommodity2Choice";
				definition = "Defines commodity specific attributes of a derivative.";
				nextVersions_lazy = () -> Arrays.asList(AssetClassCommodity1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassSubProductAgriculturalType1Code getAgricultural() {
		return agricultural;
	}

	public AssetClassCommodity2Choice setAgricultural(AssetClassSubProductAgriculturalType1Code agricultural) {
		this.agricultural = Objects.requireNonNull(agricultural);
		return this;
	}

	public AssetClassSubProductEnergyType1Code getEnergy() {
		return energy;
	}

	public AssetClassCommodity2Choice setEnergy(AssetClassSubProductEnergyType1Code energy) {
		this.energy = Objects.requireNonNull(energy);
		return this;
	}

	public AssetClassSubProductEnvironmentalType1Code getEnvironmental() {
		return environmental;
	}

	public AssetClassCommodity2Choice setEnvironmental(AssetClassSubProductEnvironmentalType1Code environmental) {
		this.environmental = Objects.requireNonNull(environmental);
		return this;
	}

	public AssetClassSubProductFreight1Code getFreight() {
		return freight;
	}

	public AssetClassCommodity2Choice setFreight(AssetClassSubProductFreight1Code freight) {
		this.freight = Objects.requireNonNull(freight);
		return this;
	}

	public NoReasonCode getIndex() {
		return index;
	}

	public AssetClassCommodity2Choice setIndex(NoReasonCode index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public AssetClassSubProductMetal1Code getMetal() {
		return metal;
	}

	public AssetClassCommodity2Choice setMetal(AssetClassSubProductMetal1Code metal) {
		this.metal = Objects.requireNonNull(metal);
		return this;
	}

	public NoReasonCode getExotic() {
		return exotic;
	}

	public AssetClassCommodity2Choice setExotic(NoReasonCode exotic) {
		this.exotic = Objects.requireNonNull(exotic);
		return this;
	}

	public NoReasonCode getOther() {
		return other;
	}

	public AssetClassCommodity2Choice setOther(NoReasonCode other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}