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
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateAndPlaceOfBirth1;
import com.tools20022.repository.msg.GenericIdentification4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of unique and unambiguous ways to identify a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDriverLicenseNumber
 * PersonIdentification15.mmDriverLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDriverLicenseLocation
 * PersonIdentification15.mmDriverLicenseLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDriverLicenseName
 * PersonIdentification15.mmDriverLicenseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDriverIdentification
 * PersonIdentification15.mmDriverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmCustomerNumber
 * PersonIdentification15.mmCustomerNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmSocialSecurityNumber
 * PersonIdentification15.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmAlienRegistrationNumber
 * PersonIdentification15.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmPassportNumber
 * PersonIdentification15.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmTaxIdentificationNumber
 * PersonIdentification15.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmIdentityCardNumber
 * PersonIdentification15.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmEmployerIdentificationNumber
 * PersonIdentification15.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmEmployeeIdentificationNumber
 * PersonIdentification15.mmEmployeeIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmJobNumber
 * PersonIdentification15.mmJobNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDepartment
 * PersonIdentification15.mmDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmEmailAddress
 * PersonIdentification15.mmEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmDateAndPlaceOfBirth
 * PersonIdentification15.mmDateAndPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification15#mmOther
 * PersonIdentification15.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
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
 * "PersonIdentification15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of unique and unambiguous ways to identify a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PersonIdentification11
 * PersonIdentification11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentification15", propOrder = {"driverLicenseNumber", "driverLicenseLocation", "driverLicenseName", "driverIdentification", "customerNumber", "socialSecurityNumber", "alienRegistrationNumber", "passportNumber",
		"taxIdentificationNumber", "identityCardNumber", "employerIdentificationNumber", "employeeIdentificationNumber", "jobNumber", "department", "emailAddress", "dateAndPlaceOfBirth", "other"})
public class PersonIdentification15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DrvrLicNb")
	protected Max35Text driverLicenseNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmDriversLicenseNumber
	 * PersonIdentification.mmDriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrLicNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverLicenseNumber
	 * PersonIdentification11.mmDriverLicenseNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmDriverLicenseNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmDriversLicenseNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "DrvrLicNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			previousVersion_lazy = () -> PersonIdentification11.mmDriverLicenseNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getDriverLicenseNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setDriverLicenseNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DrvrLicLctn")
	protected Max35Text driverLicenseLocation;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrLicLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverLicenseLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country, state or province, issuer of the driver license."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverLicenseLocation
	 * PersonIdentification11.mmDriverLicenseLocation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmDriverLicenseLocation = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "DrvrLicLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseLocation";
			definition = "Country, state or province, issuer of the driver license.";
			previousVersion_lazy = () -> PersonIdentification11.mmDriverLicenseLocation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getDriverLicenseLocation();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setDriverLicenseLocation(value.orElse(null));
		}
	};
	@XmlElement(name = "DrvrLicNm")
	protected Max35Text driverLicenseName;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrLicNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverLicenseName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name or title of the driver license."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverLicenseName
	 * PersonIdentification11.mmDriverLicenseName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmDriverLicenseName = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "DrvrLicNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseName";
			definition = "Name or title of the driver license.";
			previousVersion_lazy = () -> PersonIdentification11.mmDriverLicenseName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getDriverLicenseName();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setDriverLicenseName(value.orElse(null));
		}
	};
	@XmlElement(name = "DrvrId")
	protected Max35Text driverIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the driver in the fleet of vehicle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverIdentification
	 * PersonIdentification11.mmDriverIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmDriverIdentification = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "DrvrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverIdentification";
			definition = "Identification of the driver in the fleet of vehicle.";
			previousVersion_lazy = () -> PersonIdentification11.mmDriverIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getDriverIdentification();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setDriverIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrNb")
	protected Max35Text customerNumber;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by an agent to identify its customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmCustomerNumber
	 * PersonIdentification11.mmCustomerNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmCustomerNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "CstmrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerNumber";
			definition = "Number assigned by an agent to identify its customer.";
			previousVersion_lazy = () -> PersonIdentification11.mmCustomerNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getCustomerNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setCustomerNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SclSctyNb")
	protected Max35Text socialSecurityNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmSocialSecurityNumber
	 * PersonIdentification.mmSocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SclSctyNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmSocialSecurityNumber
	 * PersonIdentification11.mmSocialSecurityNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmSocialSecurityNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "SclSctyNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			previousVersion_lazy = () -> PersonIdentification11.mmSocialSecurityNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getSocialSecurityNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setSocialSecurityNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AlnRegnNb")
	protected Max35Text alienRegistrationNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmAlienRegistrationNumber
	 * PersonIdentification.mmAlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlnRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmAlienRegistrationNumber
	 * PersonIdentification11.mmAlienRegistrationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmAlienRegistrationNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmAlienRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "AlnRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			previousVersion_lazy = () -> PersonIdentification11.mmAlienRegistrationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getAlienRegistrationNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setAlienRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PsptNb")
	protected Max35Text passportNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPassportNumber
	 * PersonIdentification.mmPassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PsptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmPassportNumber
	 * PersonIdentification11.mmPassportNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmPassportNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPassportNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "PsptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			previousVersion_lazy = () -> PersonIdentification11.mmPassportNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getPassportNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setPassportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxIdNb")
	protected Max35Text taxIdentificationNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmTaxIdentificationNumber
	 * PersonIdentification11.mmTaxIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmTaxIdentificationNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			previousVersion_lazy = () -> PersonIdentification11.mmTaxIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getTaxIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setTaxIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "IdntyCardNb")
	protected Max35Text identityCardNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmIdentityCardNumber
	 * PersonIdentification.mmIdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdntyCardNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national authority to an identity card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmIdentityCardNumber
	 * PersonIdentification11.mmIdentityCardNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmIdentityCardNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmIdentityCardNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "IdntyCardNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			previousVersion_lazy = () -> PersonIdentification11.mmIdentityCardNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getIdentityCardNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setIdentityCardNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MplyrIdNb")
	protected Max35Text employerIdentificationNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmEmployerIdentificationNumber
	 * PersonIdentification.mmEmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MplyrIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an employer by a registration authority."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmployerIdentificationNumber
	 * PersonIdentification11.mmEmployerIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmEmployerIdentificationNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmEmployerIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "MplyrIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			previousVersion_lazy = () -> PersonIdentification11.mmEmployerIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getEmployerIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setEmployerIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MplyeeIdNb")
	protected Max35Text employeeIdentificationNumber;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MplyeeIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to an employee by a employer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmployeeIdentificationNumber
	 * PersonIdentification11.mmEmployeeIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmEmployeeIdentificationNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "MplyeeIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIdentificationNumber";
			definition = "Number assigned to an employee by a employer.";
			previousVersion_lazy = () -> PersonIdentification11.mmEmployeeIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getEmployeeIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setEmployeeIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "JobNb")
	protected Max35Text jobNumber;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JobNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JobNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the job."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmJobNumber
	 * PersonIdentification11.mmJobNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmJobNumber = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "JobNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JobNumber";
			definition = "Identification of the job.";
			previousVersion_lazy = () -> PersonIdentification11.mmJobNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getJobNumber();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setJobNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Dept")
	protected Max35Text department;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dept"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the department."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDepartment
	 * PersonIdentification11.mmDepartment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max35Text>> mmDepartment = new MMMessageAttribute<PersonIdentification15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "Dept";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			definition = "Identification of the department.";
			previousVersion_lazy = () -> PersonIdentification11.mmDepartment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification15 obj) {
			return obj.getDepartment();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max35Text> value) {
			obj.setDepartment(value.orElse(null));
		}
	};
	@XmlElement(name = "EmailAdr")
	protected Max256Text emailAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmEmailAddress
	 * ElectronicAddress.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmailAddress
	 * PersonIdentification11.mmEmailAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification15, Optional<Max256Text>> mmEmailAddress = new MMMessageAttribute<PersonIdentification15, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			previousVersion_lazy = () -> PersonIdentification11.mmEmailAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(PersonIdentification15 obj) {
			return obj.getEmailAddress();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<Max256Text> value) {
			obj.setEmailAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "DtAndPlcOfBirth")
	protected DateAndPlaceOfBirth1 dateAndPlaceOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
	 * PersonIdentification.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndPlcOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndPlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and place of birth of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDateAndPlaceOfBirth
	 * PersonIdentification11.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification15, Optional<DateAndPlaceOfBirth1>> mmDateAndPlaceOfBirth = new MMMessageAssociationEnd<PersonIdentification15, Optional<DateAndPlaceOfBirth1>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPerson;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "DtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndPlaceOfBirth";
			definition = "Date and place of birth of a person.";
			previousVersion_lazy = () -> PersonIdentification11.mmDateAndPlaceOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPlaceOfBirth1.mmObject();
		}

		@Override
		public Optional<DateAndPlaceOfBirth1> getValue(PersonIdentification15 obj) {
			return obj.getDateAndPlaceOfBirth();
		}

		@Override
		public void setValue(PersonIdentification15 obj, Optional<DateAndPlaceOfBirth1> value) {
			obj.setDateAndPlaceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected List<GenericIdentification4> other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
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
	 * definition} =
	 * "Unique identification of a person, as assigned by an institution, using an identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmOther
	 * PersonIdentification11.mmOther}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification15, List<GenericIdentification4>> mmOther = new MMMessageAssociationEnd<PersonIdentification15, List<GenericIdentification4>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification15.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of a person, as assigned by an institution, using an identification scheme.";
			previousVersion_lazy = () -> PersonIdentification11.mmOther;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public List<GenericIdentification4> getValue(PersonIdentification15 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(PersonIdentification15 obj, List<GenericIdentification4> value) {
			obj.setOther(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification15.mmDriverLicenseNumber, com.tools20022.repository.msg.PersonIdentification15.mmDriverLicenseLocation,
						com.tools20022.repository.msg.PersonIdentification15.mmDriverLicenseName, com.tools20022.repository.msg.PersonIdentification15.mmDriverIdentification,
						com.tools20022.repository.msg.PersonIdentification15.mmCustomerNumber, com.tools20022.repository.msg.PersonIdentification15.mmSocialSecurityNumber,
						com.tools20022.repository.msg.PersonIdentification15.mmAlienRegistrationNumber, com.tools20022.repository.msg.PersonIdentification15.mmPassportNumber,
						com.tools20022.repository.msg.PersonIdentification15.mmTaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification15.mmIdentityCardNumber,
						com.tools20022.repository.msg.PersonIdentification15.mmEmployerIdentificationNumber, com.tools20022.repository.msg.PersonIdentification15.mmEmployeeIdentificationNumber,
						com.tools20022.repository.msg.PersonIdentification15.mmJobNumber, com.tools20022.repository.msg.PersonIdentification15.mmDepartment, com.tools20022.repository.msg.PersonIdentification15.mmEmailAddress,
						com.tools20022.repository.msg.PersonIdentification15.mmDateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification15.mmOther);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification15";
				definition = "Set of unique and unambiguous ways to identify a person.";
				previousVersion_lazy = () -> PersonIdentification11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getDriverLicenseNumber() {
		return driverLicenseNumber == null ? Optional.empty() : Optional.of(driverLicenseNumber);
	}

	public PersonIdentification15 setDriverLicenseNumber(Max35Text driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
		return this;
	}

	public Optional<Max35Text> getDriverLicenseLocation() {
		return driverLicenseLocation == null ? Optional.empty() : Optional.of(driverLicenseLocation);
	}

	public PersonIdentification15 setDriverLicenseLocation(Max35Text driverLicenseLocation) {
		this.driverLicenseLocation = driverLicenseLocation;
		return this;
	}

	public Optional<Max35Text> getDriverLicenseName() {
		return driverLicenseName == null ? Optional.empty() : Optional.of(driverLicenseName);
	}

	public PersonIdentification15 setDriverLicenseName(Max35Text driverLicenseName) {
		this.driverLicenseName = driverLicenseName;
		return this;
	}

	public Optional<Max35Text> getDriverIdentification() {
		return driverIdentification == null ? Optional.empty() : Optional.of(driverIdentification);
	}

	public PersonIdentification15 setDriverIdentification(Max35Text driverIdentification) {
		this.driverIdentification = driverIdentification;
		return this;
	}

	public Optional<Max35Text> getCustomerNumber() {
		return customerNumber == null ? Optional.empty() : Optional.of(customerNumber);
	}

	public PersonIdentification15 setCustomerNumber(Max35Text customerNumber) {
		this.customerNumber = customerNumber;
		return this;
	}

	public Optional<Max35Text> getSocialSecurityNumber() {
		return socialSecurityNumber == null ? Optional.empty() : Optional.of(socialSecurityNumber);
	}

	public PersonIdentification15 setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
		return this;
	}

	public Optional<Max35Text> getAlienRegistrationNumber() {
		return alienRegistrationNumber == null ? Optional.empty() : Optional.of(alienRegistrationNumber);
	}

	public PersonIdentification15 setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = alienRegistrationNumber;
		return this;
	}

	public Optional<Max35Text> getPassportNumber() {
		return passportNumber == null ? Optional.empty() : Optional.of(passportNumber);
	}

	public PersonIdentification15 setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = passportNumber;
		return this;
	}

	public Optional<Max35Text> getTaxIdentificationNumber() {
		return taxIdentificationNumber == null ? Optional.empty() : Optional.of(taxIdentificationNumber);
	}

	public PersonIdentification15 setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
		return this;
	}

	public Optional<Max35Text> getIdentityCardNumber() {
		return identityCardNumber == null ? Optional.empty() : Optional.of(identityCardNumber);
	}

	public PersonIdentification15 setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
		return this;
	}

	public Optional<Max35Text> getEmployerIdentificationNumber() {
		return employerIdentificationNumber == null ? Optional.empty() : Optional.of(employerIdentificationNumber);
	}

	public PersonIdentification15 setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = employerIdentificationNumber;
		return this;
	}

	public Optional<Max35Text> getEmployeeIdentificationNumber() {
		return employeeIdentificationNumber == null ? Optional.empty() : Optional.of(employeeIdentificationNumber);
	}

	public PersonIdentification15 setEmployeeIdentificationNumber(Max35Text employeeIdentificationNumber) {
		this.employeeIdentificationNumber = employeeIdentificationNumber;
		return this;
	}

	public Optional<Max35Text> getJobNumber() {
		return jobNumber == null ? Optional.empty() : Optional.of(jobNumber);
	}

	public PersonIdentification15 setJobNumber(Max35Text jobNumber) {
		this.jobNumber = jobNumber;
		return this;
	}

	public Optional<Max35Text> getDepartment() {
		return department == null ? Optional.empty() : Optional.of(department);
	}

	public PersonIdentification15 setDepartment(Max35Text department) {
		this.department = department;
		return this;
	}

	public Optional<Max256Text> getEmailAddress() {
		return emailAddress == null ? Optional.empty() : Optional.of(emailAddress);
	}

	public PersonIdentification15 setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public Optional<DateAndPlaceOfBirth1> getDateAndPlaceOfBirth() {
		return dateAndPlaceOfBirth == null ? Optional.empty() : Optional.of(dateAndPlaceOfBirth);
	}

	public PersonIdentification15 setDateAndPlaceOfBirth(DateAndPlaceOfBirth1 dateAndPlaceOfBirth) {
		this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
		return this;
	}

	public List<GenericIdentification4> getOther() {
		return other == null ? other = new ArrayList<>() : other;
	}

	public PersonIdentification15 setOther(List<GenericIdentification4> other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}