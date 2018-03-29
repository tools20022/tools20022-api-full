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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Packaging;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quantity3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Physical packaging of goods for transport.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment1#mmTotalQuantity
 * Consignment1.mmTotalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment1#mmTotalVolume
 * Consignment1.mmTotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment1#mmTotalWeight
 * Consignment1.mmTotalWeight}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}</li>
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
 * "Consignment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical packaging of goods for transport."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment3 Consignment3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Consignment1", propOrder = {"totalQuantity", "totalVolume", "totalWeight"})
public class Consignment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlQty")
	protected Quantity3 totalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
	 * Packaging.mmTotalConsignmentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1 Consignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of packaging units, eg number of boxes, containers, pallets, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Consignment3#mmTotalQuantity
	 * Consignment3.mmTotalQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment1, Optional<Quantity3>> mmTotalQuantity = new MMMessageAttribute<Consignment1, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalConsignmentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment1.mmObject();
			isDerived = false;
			xmlTag = "TtlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalQuantity";
			definition = "Total quantity of packaging units, eg number of boxes, containers, pallets, etc.";
			nextVersions_lazy = () -> Arrays.asList(Consignment3.mmTotalQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(Consignment1 obj) {
			return obj.getTotalQuantity();
		}

		@Override
		public void setValue(Consignment1 obj, Optional<Quantity3> value) {
			obj.setTotalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlVol")
	protected Quantity3 totalVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
	 * Packaging.mmTotalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1 Consignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total volume of goods shipped, eg number of cubic meters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Consignment3#mmTotalVolume
	 * Consignment3.mmTotalVolume}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment1, Optional<Quantity3>> mmTotalVolume = new MMMessageAttribute<Consignment1, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalVolume;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment1.mmObject();
			isDerived = false;
			xmlTag = "TtlVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolume";
			definition = "Total volume of goods shipped, eg number of cubic meters.";
			nextVersions_lazy = () -> Arrays.asList(Consignment3.mmTotalVolume);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(Consignment1 obj) {
			return obj.getTotalVolume();
		}

		@Override
		public void setValue(Consignment1 obj, Optional<Quantity3> value) {
			obj.setTotalVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlWght")
	protected Quantity3 totalWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
	 * Packaging.mmTotalWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1 Consignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlWght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total weight of goods shipped, eg number of kg, tons."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Consignment3#mmTotalWeight
	 * Consignment3.mmTotalWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment1, Optional<Quantity3>> mmTotalWeight = new MMMessageAttribute<Consignment1, Optional<Quantity3>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalWeight;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment1.mmObject();
			isDerived = false;
			xmlTag = "TtlWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalWeight";
			definition = "Total weight of goods shipped, eg number of kg, tons.";
			nextVersions_lazy = () -> Arrays.asList(Consignment3.mmTotalWeight);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(Consignment1 obj) {
			return obj.getTotalWeight();
		}

		@Override
		public void setValue(Consignment1 obj, Optional<Quantity3> value) {
			obj.setTotalWeight(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Consignment1.mmTotalQuantity, com.tools20022.repository.msg.Consignment1.mmTotalVolume, com.tools20022.repository.msg.Consignment1.mmTotalWeight);
				trace_lazy = () -> Packaging.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Consignment1";
				definition = "Physical packaging of goods for transport.";
				nextVersions_lazy = () -> Arrays.asList(Consignment3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Quantity3> getTotalQuantity() {
		return totalQuantity == null ? Optional.empty() : Optional.of(totalQuantity);
	}

	public Consignment1 setTotalQuantity(Quantity3 totalQuantity) {
		this.totalQuantity = totalQuantity;
		return this;
	}

	public Optional<Quantity3> getTotalVolume() {
		return totalVolume == null ? Optional.empty() : Optional.of(totalVolume);
	}

	public Consignment1 setTotalVolume(Quantity3 totalVolume) {
		this.totalVolume = totalVolume;
		return this;
	}

	public Optional<Quantity3> getTotalWeight() {
		return totalWeight == null ? Optional.empty() : Optional.of(totalWeight);
	}

	public Consignment1 setTotalWeight(Quantity3 totalWeight) {
		this.totalWeight = totalWeight;
		return this;
	}
}