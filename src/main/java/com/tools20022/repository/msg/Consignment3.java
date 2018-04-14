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
import com.tools20022.repository.msg.Quantity10;
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
 * <li>{@linkplain com.tools20022.repository.msg.Consignment3#mmTotalQuantity
 * Consignment3.mmTotalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment3#mmTotalVolume
 * Consignment3.mmTotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment3#mmTotalWeight
 * Consignment3.mmTotalWeight}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Consignment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical packaging of goods for transport."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Consignment1
 * Consignment1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Consignment3", propOrder = {"totalQuantity", "totalVolume", "totalWeight"})
public class Consignment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlQty")
	protected Quantity10 totalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity10
	 * Quantity10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
	 * Packaging.mmTotalConsignmentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment3 Consignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of packaging units, eg number of boxes, containers, pallets, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1#mmTotalQuantity
	 * Consignment1.mmTotalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment3, Optional<Quantity10>> mmTotalQuantity = new MMMessageAttribute<Consignment3, Optional<Quantity10>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalConsignmentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment3.mmObject();
			isDerived = false;
			xmlTag = "TtlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalQuantity";
			definition = "Total quantity of packaging units, eg number of boxes, containers, pallets, etc.";
			previousVersion_lazy = () -> Consignment1.mmTotalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity10.mmObject();
		}

		@Override
		public Optional<Quantity10> getValue(Consignment3 obj) {
			return obj.getTotalQuantity();
		}

		@Override
		public void setValue(Consignment3 obj, Optional<Quantity10> value) {
			obj.setTotalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlVol")
	protected Quantity10 totalVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity10
	 * Quantity10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
	 * Packaging.mmTotalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment3 Consignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVol"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total volume of goods shipped, eg number of cubic meters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1#mmTotalVolume
	 * Consignment1.mmTotalVolume}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment3, Optional<Quantity10>> mmTotalVolume = new MMMessageAttribute<Consignment3, Optional<Quantity10>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalVolume;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment3.mmObject();
			isDerived = false;
			xmlTag = "TtlVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolume";
			definition = "Total volume of goods shipped, eg number of cubic meters.";
			previousVersion_lazy = () -> Consignment1.mmTotalVolume;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity10.mmObject();
		}

		@Override
		public Optional<Quantity10> getValue(Consignment3 obj) {
			return obj.getTotalVolume();
		}

		@Override
		public void setValue(Consignment3 obj, Optional<Quantity10> value) {
			obj.setTotalVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlWght")
	protected Quantity10 totalWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity10
	 * Quantity10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
	 * Packaging.mmTotalWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment3 Consignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlWght"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total weight of goods shipped, eg number of kg, tons."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment1#mmTotalWeight
	 * Consignment1.mmTotalWeight}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Consignment3, Optional<Quantity10>> mmTotalWeight = new MMMessageAttribute<Consignment3, Optional<Quantity10>>() {
		{
			businessElementTrace_lazy = () -> Packaging.mmTotalWeight;
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment3.mmObject();
			isDerived = false;
			xmlTag = "TtlWght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalWeight";
			definition = "Total weight of goods shipped, eg number of kg, tons.";
			previousVersion_lazy = () -> Consignment1.mmTotalWeight;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity10.mmObject();
		}

		@Override
		public Optional<Quantity10> getValue(Consignment3 obj) {
			return obj.getTotalWeight();
		}

		@Override
		public void setValue(Consignment3 obj, Optional<Quantity10> value) {
			obj.setTotalWeight(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Consignment3.mmTotalQuantity, com.tools20022.repository.msg.Consignment3.mmTotalVolume, com.tools20022.repository.msg.Consignment3.mmTotalWeight);
				trace_lazy = () -> Packaging.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Consignment3";
				definition = "Physical packaging of goods for transport.";
				previousVersion_lazy = () -> Consignment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Quantity10> getTotalQuantity() {
		return totalQuantity == null ? Optional.empty() : Optional.of(totalQuantity);
	}

	public Consignment3 setTotalQuantity(Quantity10 totalQuantity) {
		this.totalQuantity = totalQuantity;
		return this;
	}

	public Optional<Quantity10> getTotalVolume() {
		return totalVolume == null ? Optional.empty() : Optional.of(totalVolume);
	}

	public Consignment3 setTotalVolume(Quantity10 totalVolume) {
		this.totalVolume = totalVolume;
		return this;
	}

	public Optional<Quantity10> getTotalWeight() {
		return totalWeight == null ? Optional.empty() : Optional.of(totalWeight);
	}

	public Consignment3 setTotalWeight(Quantity10 totalWeight) {
		this.totalWeight = totalWeight;
		return this;
	}
}