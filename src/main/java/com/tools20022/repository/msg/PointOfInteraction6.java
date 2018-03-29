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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a point of interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction6#mmManufacturerIdentifier
 * PointOfInteraction6.mmManufacturerIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction6#mmModel
 * PointOfInteraction6.mmModel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction6#mmSerialNumber
 * PointOfInteraction6.mmSerialNumber}</li>
 * </ul>
 * </li>
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
 * "PointOfInteraction6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a point of interaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteraction6", propOrder = {"manufacturerIdentifier", "model", "serialNumber"})
public class PointOfInteraction6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ManfctrIdr", required = true)
	protected Max35Text manufacturerIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction6
	 * PointOfInteraction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturerIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the terminal manufacturer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction6, Max35Text> mmManufacturerIdentifier = new MMMessageAttribute<PointOfInteraction6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction6.mmObject();
			isDerived = false;
			xmlTag = "ManfctrIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturerIdentifier";
			definition = "Identifier of the terminal manufacturer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteraction6 obj) {
			return obj.getManufacturerIdentifier();
		}

		@Override
		public void setValue(PointOfInteraction6 obj, Max35Text value) {
			obj.setManufacturerIdentifier(value);
		}
	};
	@XmlElement(name = "Mdl", required = true)
	protected Max35Text model;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction6
	 * PointOfInteraction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the terminal model."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction6, Max35Text> mmModel = new MMMessageAttribute<PointOfInteraction6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction6.mmObject();
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Identifier of the terminal model.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteraction6 obj) {
			return obj.getModel();
		}

		@Override
		public void setValue(PointOfInteraction6 obj, Max35Text value) {
			obj.setModel(value);
		}
	};
	@XmlElement(name = "SrlNb", required = true)
	protected Max35Text serialNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction6
	 * PointOfInteraction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the terminal manufacturer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction6, Max35Text> mmSerialNumber = new MMMessageAttribute<PointOfInteraction6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction6.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the terminal manufacturer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteraction6 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(PointOfInteraction6 obj, Max35Text value) {
			obj.setSerialNumber(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction6.mmManufacturerIdentifier, com.tools20022.repository.msg.PointOfInteraction6.mmModel,
						com.tools20022.repository.msg.PointOfInteraction6.mmSerialNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction6";
				definition = "Identification of a point of interaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getManufacturerIdentifier() {
		return manufacturerIdentifier;
	}

	public PointOfInteraction6 setManufacturerIdentifier(Max35Text manufacturerIdentifier) {
		this.manufacturerIdentifier = Objects.requireNonNull(manufacturerIdentifier);
		return this;
	}

	public Max35Text getModel() {
		return model;
	}

	public PointOfInteraction6 setModel(Max35Text model) {
		this.model = Objects.requireNonNull(model);
		return this;
	}

	public Max35Text getSerialNumber() {
		return serialNumber;
	}

	public PointOfInteraction6 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = Objects.requireNonNull(serialNumber);
		return this;
	}
}