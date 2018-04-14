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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DeliveryInterconnectionPoint1Choice;
import com.tools20022.repository.codeset.EnergyLoadType1Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EnergyDeliveryAttribute3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Attributes of energy related derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4#mmDeliveryPoint
 * EnergySpecificAttribute4.mmDeliveryPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4#mmInterconnectionPoint
 * EnergySpecificAttribute4.mmInterconnectionPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4#mmLoadType
 * EnergySpecificAttribute4.mmLoadType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4#mmDeliveryAttribute
 * EnergySpecificAttribute4.mmDeliveryAttribute}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergySpecificAttribute4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Attributes of energy related derivatives."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnergySpecificAttribute4", propOrder = {"deliveryPoint", "interconnectionPoint", "loadType", "deliveryAttribute"})
public class EnergySpecificAttribute4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvryPt")
	protected List<DeliveryInterconnectionPoint1Choice> deliveryPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryInterconnectionPoint1Choice
	 * DeliveryInterconnectionPoint1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4
	 * EnergySpecificAttribute4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryPt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the delivery point(s) of market area(s) for energy derivative contracts."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergySpecificAttribute4, List<DeliveryInterconnectionPoint1Choice>> mmDeliveryPoint = new MMMessageAssociationEnd<EnergySpecificAttribute4, List<DeliveryInterconnectionPoint1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergySpecificAttribute4.mmObject();
			isDerived = false;
			xmlTag = "DlvryPt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryPoint";
			definition = "Indicates the delivery point(s) of market area(s) for energy derivative contracts.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryInterconnectionPoint1Choice.mmObject();
		}

		@Override
		public List<DeliveryInterconnectionPoint1Choice> getValue(EnergySpecificAttribute4 obj) {
			return obj.getDeliveryPoint();
		}

		@Override
		public void setValue(EnergySpecificAttribute4 obj, List<DeliveryInterconnectionPoint1Choice> value) {
			obj.setDeliveryPoint(value);
		}
	};
	@XmlElement(name = "IntrcnnctnPt")
	protected DeliveryInterconnectionPoint1Choice interconnectionPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryInterconnectionPoint1Choice
	 * DeliveryInterconnectionPoint1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4
	 * EnergySpecificAttribute4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrcnnctnPt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterconnectionPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the border(s) or border point(s) of a transportation contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergySpecificAttribute4, Optional<DeliveryInterconnectionPoint1Choice>> mmInterconnectionPoint = new MMMessageAssociationEnd<EnergySpecificAttribute4, Optional<DeliveryInterconnectionPoint1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergySpecificAttribute4.mmObject();
			isDerived = false;
			xmlTag = "IntrcnnctnPt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterconnectionPoint";
			definition = "Identification of the border(s) or border point(s) of a transportation contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryInterconnectionPoint1Choice.mmObject();
		}

		@Override
		public Optional<DeliveryInterconnectionPoint1Choice> getValue(EnergySpecificAttribute4 obj) {
			return obj.getInterconnectionPoint();
		}

		@Override
		public void setValue(EnergySpecificAttribute4 obj, Optional<DeliveryInterconnectionPoint1Choice> value) {
			obj.setInterconnectionPoint(value.orElse(null));
		}
	};
	@XmlElement(name = "LdTp")
	protected EnergyLoadType1Code loadType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EnergyLoadType1Code
	 * EnergyLoadType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4
	 * EnergySpecificAttribute4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LdTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoadType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the delivery profile."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergySpecificAttribute4, Optional<EnergyLoadType1Code>> mmLoadType = new MMMessageAttribute<EnergySpecificAttribute4, Optional<EnergyLoadType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergySpecificAttribute4.mmObject();
			isDerived = false;
			xmlTag = "LdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoadType";
			definition = "Identification of the delivery profile.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EnergyLoadType1Code.mmObject();
		}

		@Override
		public Optional<EnergyLoadType1Code> getValue(EnergySpecificAttribute4 obj) {
			return obj.getLoadType();
		}

		@Override
		public void setValue(EnergySpecificAttribute4 obj, Optional<EnergyLoadType1Code> value) {
			obj.setLoadType(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryAttr")
	protected List<EnergyDeliveryAttribute3> deliveryAttribute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergySpecificAttribute4
	 * EnergySpecificAttribute4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAttr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes related to delivery of derivative contracts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergySpecificAttribute4, List<EnergyDeliveryAttribute3>> mmDeliveryAttribute = new MMMessageAssociationEnd<EnergySpecificAttribute4, List<EnergyDeliveryAttribute3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergySpecificAttribute4.mmObject();
			isDerived = false;
			xmlTag = "DlvryAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAttribute";
			definition = "Attributes related to delivery of derivative contracts.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EnergyDeliveryAttribute3.mmObject();
		}

		@Override
		public List<EnergyDeliveryAttribute3> getValue(EnergySpecificAttribute4 obj) {
			return obj.getDeliveryAttribute();
		}

		@Override
		public void setValue(EnergySpecificAttribute4 obj, List<EnergyDeliveryAttribute3> value) {
			obj.setDeliveryAttribute(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnergySpecificAttribute4.mmDeliveryPoint, com.tools20022.repository.msg.EnergySpecificAttribute4.mmInterconnectionPoint,
						com.tools20022.repository.msg.EnergySpecificAttribute4.mmLoadType, com.tools20022.repository.msg.EnergySpecificAttribute4.mmDeliveryAttribute);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergySpecificAttribute4";
				definition = "Attributes of energy related derivatives.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<DeliveryInterconnectionPoint1Choice> getDeliveryPoint() {
		return deliveryPoint == null ? deliveryPoint = new ArrayList<>() : deliveryPoint;
	}

	public EnergySpecificAttribute4 setDeliveryPoint(List<DeliveryInterconnectionPoint1Choice> deliveryPoint) {
		this.deliveryPoint = Objects.requireNonNull(deliveryPoint);
		return this;
	}

	public Optional<DeliveryInterconnectionPoint1Choice> getInterconnectionPoint() {
		return interconnectionPoint == null ? Optional.empty() : Optional.of(interconnectionPoint);
	}

	public EnergySpecificAttribute4 setInterconnectionPoint(DeliveryInterconnectionPoint1Choice interconnectionPoint) {
		this.interconnectionPoint = interconnectionPoint;
		return this;
	}

	public Optional<EnergyLoadType1Code> getLoadType() {
		return loadType == null ? Optional.empty() : Optional.of(loadType);
	}

	public EnergySpecificAttribute4 setLoadType(EnergyLoadType1Code loadType) {
		this.loadType = loadType;
		return this;
	}

	public List<EnergyDeliveryAttribute3> getDeliveryAttribute() {
		return deliveryAttribute == null ? deliveryAttribute = new ArrayList<>() : deliveryAttribute;
	}

	public EnergySpecificAttribute4 setDeliveryAttribute(List<EnergyDeliveryAttribute3> deliveryAttribute) {
		this.deliveryAttribute = Objects.requireNonNull(deliveryAttribute);
		return this;
	}
}