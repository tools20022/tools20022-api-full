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
import com.tools20022.repository.msg.IndustrialProductCommodityConstruction1;
import com.tools20022.repository.msg.IndustrialProductCommodityManufacturing1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is industrial
 * product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#mmConstruction
 * AssetClassCommodityIndustrialProduct1Choice.mmConstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice#mmManufacturing
 * AssetClassCommodityIndustrialProduct1Choice.mmManufacturing}</li>
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
 * "AssetClassCommodityIndustrialProduct1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is industrial product."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodityIndustrialProduct1Choice", propOrder = {"construction", "manufacturing"})
public class AssetClassCommodityIndustrialProduct1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cnstrctn", required = true)
	protected IndustrialProductCommodityConstruction1 construction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityConstruction1
	 * IndustrialProductCommodityConstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice
	 * AssetClassCommodityIndustrialProduct1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Construction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Construction related industrial product commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityIndustrialProduct1Choice, IndustrialProductCommodityConstruction1> mmConstruction = new MMMessageAssociationEnd<AssetClassCommodityIndustrialProduct1Choice, IndustrialProductCommodityConstruction1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cnstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Construction";
			definition = "Construction related industrial product commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndustrialProductCommodityConstruction1.mmObject();
		}

		@Override
		public IndustrialProductCommodityConstruction1 getValue(AssetClassCommodityIndustrialProduct1Choice obj) {
			return obj.getConstruction();
		}

		@Override
		public void setValue(AssetClassCommodityIndustrialProduct1Choice obj, IndustrialProductCommodityConstruction1 value) {
			obj.setConstruction(value);
		}
	};
	@XmlElement(name = "Manfctg", required = true)
	protected IndustrialProductCommodityManufacturing1 manufacturing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityManufacturing1
	 * IndustrialProductCommodityManufacturing1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice
	 * AssetClassCommodityIndustrialProduct1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Manfctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturing related industrial product commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityIndustrialProduct1Choice, IndustrialProductCommodityManufacturing1> mmManufacturing = new MMMessageAssociationEnd<AssetClassCommodityIndustrialProduct1Choice, IndustrialProductCommodityManufacturing1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.mmObject();
			isDerived = false;
			xmlTag = "Manfctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturing";
			definition = "Manufacturing related industrial product commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndustrialProductCommodityManufacturing1.mmObject();
		}

		@Override
		public IndustrialProductCommodityManufacturing1 getValue(AssetClassCommodityIndustrialProduct1Choice obj) {
			return obj.getManufacturing();
		}

		@Override
		public void setValue(AssetClassCommodityIndustrialProduct1Choice obj, IndustrialProductCommodityManufacturing1 value) {
			obj.setManufacturing(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.mmConstruction,
						com.tools20022.repository.choice.AssetClassCommodityIndustrialProduct1Choice.mmManufacturing);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityIndustrialProduct1Choice";
				definition = "Defines commodity attributes of a derivative where the type is industrial product.";
			}
		});
		return mmObject_lazy.get();
	}

	public IndustrialProductCommodityConstruction1 getConstruction() {
		return construction;
	}

	public AssetClassCommodityIndustrialProduct1Choice setConstruction(IndustrialProductCommodityConstruction1 construction) {
		this.construction = Objects.requireNonNull(construction);
		return this;
	}

	public IndustrialProductCommodityManufacturing1 getManufacturing() {
		return manufacturing;
	}

	public AssetClassCommodityIndustrialProduct1Choice setManufacturing(IndustrialProductCommodityManufacturing1 manufacturing) {
		this.manufacturing = Objects.requireNonNull(manufacturing);
		return this;
	}
}