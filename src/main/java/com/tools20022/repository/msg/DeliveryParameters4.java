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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PhysicalDelivery;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactIdentification2;
import com.tools20022.repository.msg.NameAndAddress4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters of a physical delivery.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmRegisteredAddressIndicator
 * DeliveryParameters4.mmRegisteredAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmNameAndAddress
 * DeliveryParameters4.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmContactPerson
 * DeliveryParameters4.mmContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
 * PhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNameAndAddress1Rule#forDeliveryParameters4
 * ConstraintNameAndAddress1Rule.forDeliveryParameters4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of a physical delivery."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliveryParameters4", propOrder = {"registeredAddressIndicator", "nameAndAddress", "contactPerson"})
public class DeliveryParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RegdAdrInd", required = true)
	protected YesNoIndicator registeredAddressIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRegisteredAddressIndicator
	 * PhysicalDelivery.mmRegisteredAddressIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdAdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address for the physical delivery is the registered address."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliveryParameters4, YesNoIndicator> mmRegisteredAddressIndicator = new MMMessageAttribute<DeliveryParameters4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmRegisteredAddressIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveryParameters4.mmObject();
			isDerived = false;
			xmlTag = "RegdAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredAddressIndicator";
			definition = "Indicates whether the address for the physical delivery is the registered address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(DeliveryParameters4 obj) {
			return obj.getRegisteredAddressIndicator();
		}

		@Override
		public void setValue(DeliveryParameters4 obj, YesNoIndicator value) {
			obj.setRegisteredAddressIndicator(value);
		}
	};
	@XmlElement(name = "NmAndAdr")
	protected NameAndAddress4 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name and address to/from which the physical delivery/receipt of the financial instrument must take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliveryParameters4, Optional<NameAndAddress4>> mmNameAndAddress = new MMMessageAttribute<DeliveryParameters4, Optional<NameAndAddress4>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveryParameters4.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address to/from which the physical delivery/receipt of the financial instrument must take place.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NameAndAddress4.mmObject();
		}

		@Override
		public Optional<NameAndAddress4> getValue(DeliveryParameters4 obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(DeliveryParameters4 obj, Optional<NameAndAddress4> value) {
			obj.setNameAndAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification2 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification2
	 * ContactIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact person and contact information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveryParameters4, Optional<ContactIdentification2>> mmContactPerson = new MMMessageAssociationEnd<DeliveryParameters4, Optional<ContactIdentification2>>() {
		{
			businessComponentTrace_lazy = () -> ContactPersonRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveryParameters4.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Contact person and contact information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentification2.mmObject();
		}

		@Override
		public Optional<ContactIdentification2> getValue(DeliveryParameters4 obj) {
			return obj.getContactPerson();
		}

		@Override
		public void setValue(DeliveryParameters4 obj, Optional<ContactIdentification2> value) {
			obj.setContactPerson(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveryParameters4.mmRegisteredAddressIndicator, com.tools20022.repository.msg.DeliveryParameters4.mmNameAndAddress,
						com.tools20022.repository.msg.DeliveryParameters4.mmContactPerson);
				trace_lazy = () -> PhysicalDelivery.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNameAndAddress1Rule.forDeliveryParameters4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryParameters4";
				definition = "Parameters of a physical delivery.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getRegisteredAddressIndicator() {
		return registeredAddressIndicator;
	}

	public DeliveryParameters4 setRegisteredAddressIndicator(YesNoIndicator registeredAddressIndicator) {
		this.registeredAddressIndicator = Objects.requireNonNull(registeredAddressIndicator);
		return this;
	}

	public Optional<NameAndAddress4> getNameAndAddress() {
		return nameAndAddress == null ? Optional.empty() : Optional.of(nameAndAddress);
	}

	public DeliveryParameters4 setNameAndAddress(NameAndAddress4 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
		return this;
	}

	public Optional<ContactIdentification2> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public DeliveryParameters4 setContactPerson(ContactIdentification2 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}
}