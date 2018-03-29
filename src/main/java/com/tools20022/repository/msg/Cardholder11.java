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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max45Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PersonIdentification11;
import com.tools20022.repository.msg.PostalAddress18;
import com.tools20022.repository.msg.Vehicle1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmIdentification
 * Cardholder11.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmName
 * Cardholder11.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmLanguage
 * Cardholder11.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmBillingAddress
 * Cardholder11.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmShippingAddress
 * Cardholder11.mmShippingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmTripNumber
 * Cardholder11.mmTripNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmVehicle
 * Cardholder11.mmVehicle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#mmPersonalData
 * Cardholder11.mmPersonalData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardholderRole
 * CardholderRole}</li>
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
 * "Cardholder11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Cardholder8
 * Cardholder8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cardholder11", propOrder = {"identification", "name", "language", "billingAddress", "shippingAddress", "tripNumber", "vehicle", "personalData"})
public class Cardholder11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected PersonIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification11
	 * PersonIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cardholder involved in a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder8#mmIdentification
	 * Cardholder8.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder11, Optional<PersonIdentification11>> mmIdentification = new MMMessageAssociationEnd<Cardholder11, Optional<PersonIdentification11>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the cardholder involved in a transaction.";
			previousVersion_lazy = () -> Cardholder8.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PersonIdentification11.mmObject();
		}

		@Override
		public Optional<PersonIdentification11> getValue(Cardholder11 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<PersonIdentification11> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max45Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max45Text
	 * Max45Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder name associated with the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder8#mmName
	 * Cardholder8.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder11, Optional<Max45Text>> mmName = new MMMessageAttribute<Cardholder11, Optional<Max45Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Cardholder name associated with the card.";
			previousVersion_lazy = () -> Cardholder8.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max45Text.mmObject();
		}

		@Override
		public Optional<Max45Text> getValue(Cardholder11 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<Max45Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Lang")
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Language selected for the cardholder interface during the transaction.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder11, Optional<LanguageCode>> mmLanguage = new MMMessageAttribute<Cardholder11, Optional<LanguageCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language selected for the cardholder interface during the transaction.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(Cardholder11 obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<LanguageCode> value) {
			obj.setLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "BllgAdr")
	protected PostalAddress18 billingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of the owner of the payment card."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder11, Optional<PostalAddress18>> mmBillingAddress = new MMMessageAssociationEnd<Cardholder11, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "BllgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddress";
			definition = "Postal address of the owner of the payment card.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(Cardholder11 obj) {
			return obj.getBillingAddress();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<PostalAddress18> value) {
			obj.setBillingAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgAdr")
	protected PostalAddress18 shippingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for delivery of goods or services."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder11, Optional<PostalAddress18>> mmShippingAddress = new MMMessageAssociationEnd<Cardholder11, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "ShppgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddress";
			definition = "Postal address for delivery of goods or services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(Cardholder11 obj) {
			return obj.getShippingAddress();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<PostalAddress18> value) {
			obj.setShippingAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "TripNb")
	protected Max35Text tripNumber;
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
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TripNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the trip."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder11, Optional<Max35Text>> mmTripNumber = new MMMessageAttribute<Cardholder11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "TripNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripNumber";
			definition = "Identification of the trip.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cardholder11 obj) {
			return obj.getTripNumber();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<Max35Text> value) {
			obj.setTripNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Vhcl")
	protected Vehicle1 vehicle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vehicle1 Vehicle1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vhcl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vehicle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the vehicle used for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder11, Optional<Vehicle1>> mmVehicle = new MMMessageAssociationEnd<Cardholder11, Optional<Vehicle1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "Vhcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vehicle";
			definition = "Information related to the vehicle used for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Vehicle1.mmObject();
		}

		@Override
		public Optional<Vehicle1> getValue(Cardholder11 obj) {
			return obj.getVehicle();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<Vehicle1> value) {
			obj.setVehicle(value.orElse(null));
		}
	};
	@XmlElement(name = "PrsnlData")
	protected Max70Text personalData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrsnlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonalData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies personal data related to the cardholder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder8#mmPersonalData
	 * Cardholder8.mmPersonalData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder11, Optional<Max70Text>> mmPersonalData = new MMMessageAttribute<Cardholder11, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder11.mmObject();
			isDerived = false;
			xmlTag = "PrsnlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalData";
			definition = "Identifies personal data related to the cardholder.";
			previousVersion_lazy = () -> Cardholder8.mmPersonalData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Cardholder11 obj) {
			return obj.getPersonalData();
		}

		@Override
		public void setValue(Cardholder11 obj, Optional<Max70Text> value) {
			obj.setPersonalData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cardholder11.mmIdentification, com.tools20022.repository.msg.Cardholder11.mmName, com.tools20022.repository.msg.Cardholder11.mmLanguage,
						com.tools20022.repository.msg.Cardholder11.mmBillingAddress, com.tools20022.repository.msg.Cardholder11.mmShippingAddress, com.tools20022.repository.msg.Cardholder11.mmTripNumber,
						com.tools20022.repository.msg.Cardholder11.mmVehicle, com.tools20022.repository.msg.Cardholder11.mmPersonalData);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cardholder11";
				definition = "Data related to the cardholder.";
				previousVersion_lazy = () -> Cardholder8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PersonIdentification11> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Cardholder11 setIdentification(PersonIdentification11 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max45Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public Cardholder11 setName(Max45Text name) {
		this.name = name;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public Cardholder11 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<PostalAddress18> getBillingAddress() {
		return billingAddress == null ? Optional.empty() : Optional.of(billingAddress);
	}

	public Cardholder11 setBillingAddress(PostalAddress18 billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	public Optional<PostalAddress18> getShippingAddress() {
		return shippingAddress == null ? Optional.empty() : Optional.of(shippingAddress);
	}

	public Cardholder11 setShippingAddress(PostalAddress18 shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	public Optional<Max35Text> getTripNumber() {
		return tripNumber == null ? Optional.empty() : Optional.of(tripNumber);
	}

	public Cardholder11 setTripNumber(Max35Text tripNumber) {
		this.tripNumber = tripNumber;
		return this;
	}

	public Optional<Vehicle1> getVehicle() {
		return vehicle == null ? Optional.empty() : Optional.of(vehicle);
	}

	public Cardholder11 setVehicle(Vehicle1 vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	public Optional<Max70Text> getPersonalData() {
		return personalData == null ? Optional.empty() : Optional.of(personalData);
	}

	public Cardholder11 setPersonalData(Max70Text personalData) {
		this.personalData = personalData;
		return this;
	}
}