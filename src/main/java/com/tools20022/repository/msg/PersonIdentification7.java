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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmDriversLicenseNumber
 * PersonIdentification7.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmCustomerNumber
 * PersonIdentification7.mmCustomerNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmSocialSecurityNumber
 * PersonIdentification7.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmAlienRegistrationNumber
 * PersonIdentification7.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmPassportNumber
 * PersonIdentification7.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmTaxIdentificationNumber
 * PersonIdentification7.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmIdentityCardNumber
 * PersonIdentification7.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmEmployerIdentificationNumber
 * PersonIdentification7.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmEmployeeIdentificationNumber
 * PersonIdentification7.mmEmployeeIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmEmailAddress
 * PersonIdentification7.mmEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmDateAndPlaceOfBirth
 * PersonIdentification7.mmDateAndPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification7#mmOther
 * PersonIdentification7.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
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
 * "PersonIdentification7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of unique and unambiguous ways to identify a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification11
 * PersonIdentification11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PersonIdentification5
 * PersonIdentification5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PersonIdentification7", propOrder = {"driversLicenseNumber", "customerNumber", "socialSecurityNumber", "alienRegistrationNumber", "passportNumber", "taxIdentificationNumber", "identityCardNumber",
		"employerIdentificationNumber", "employeeIdentificationNumber", "emailAddress", "dateAndPlaceOfBirth", "other"})
public class PersonIdentification7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text driversLicenseNumber;
	/**
	 * Number assigned by a license authority to a driver's license.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrsLicNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverLicenseNumber
	 * PersonIdentification11.mmDriverLicenseNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDriversLicenseNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmDriversLicenseNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "DrvrsLicNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmDriverLicenseNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text customerNumber;
	/**
	 * Number assigned by an agent to identify its customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmCustomerNumber
	 * PersonIdentification11.mmCustomerNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "CstmrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerNumber";
			definition = "Number assigned by an agent to identify its customer.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmCustomerNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text socialSecurityNumber;
	/**
	 * Number assigned by a social security agency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmSocialSecurityNumber
	 * PersonIdentification11.mmSocialSecurityNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSocialSecurityNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "SclSctyNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmSocialSecurityNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text alienRegistrationNumber;
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmAlienRegistrationNumber
	 * PersonIdentification11.mmAlienRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlienRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmAlienRegistrationNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "AlnRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmAlienRegistrationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text passportNumber;
	/**
	 * Number assigned by a passport authority to a passport.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmPassportNumber
	 * PersonIdentification11.mmPassportNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPassportNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPassportNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "PsptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmPassportNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmTaxIdentificationNumber
	 * PersonIdentification11.mmTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmTaxIdentificationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text identityCardNumber;
	/**
	 * Number assigned by a national authority to an identity card.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmIdentityCardNumber
	 * PersonIdentification11.mmIdentityCardNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentityCardNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmIdentityCardNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "IdntyCardNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmIdentityCardNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text employerIdentificationNumber;
	/**
	 * Number assigned to an employer by a registration authority.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmployerIdentificationNumber
	 * PersonIdentification11.mmEmployerIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmployerIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmEmployerIdentificationNumber;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "MplyrIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmEmployerIdentificationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text employeeIdentificationNumber;
	/**
	 * Number assigned to an employee by a employer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmployeeIdentificationNumber
	 * PersonIdentification11.mmEmployeeIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmployeeIdentificationNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "MplyeeIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIdentificationNumber";
			definition = "Number assigned to an employee by a employer.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmEmployeeIdentificationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max256Text emailAddress;
	/**
	 * Address for electronic mail (e-mail).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmailAddress
	 * PersonIdentification11.mmEmailAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmailAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmEmailAddress);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected DateAndPlaceOfBirth dateAndPlaceOfBirth;
	/**
	 * Date and place of birth of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
	 * DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
	 * PersonIdentification.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDateAndPlaceOfBirth
	 * PersonIdentification11.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmDateAndPlaceOfBirth
	 * PersonIdentification5.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateAndPlaceOfBirth = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPerson;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "DtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndPlaceOfBirth";
			definition = "Date and place of birth of a person.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmDateAndPlaceOfBirth);
			previousVersion_lazy = () -> PersonIdentification5.mmDateAndPlaceOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndPlaceOfBirth.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification4> other;
	/**
	 * Unique identification of a person, as assigned by an institution, using
	 * an identification scheme.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmOther
	 * PersonIdentification11.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
	 * PersonIdentification5.mmOther}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PersonIdentification7.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of a person, as assigned by an institution, using an identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmOther);
			previousVersion_lazy = () -> PersonIdentification5.mmOther;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PersonIdentification7.mmDriversLicenseNumber, PersonIdentification7.mmCustomerNumber, PersonIdentification7.mmSocialSecurityNumber, PersonIdentification7.mmAlienRegistrationNumber,
						PersonIdentification7.mmPassportNumber, PersonIdentification7.mmTaxIdentificationNumber, PersonIdentification7.mmIdentityCardNumber, PersonIdentification7.mmEmployerIdentificationNumber,
						PersonIdentification7.mmEmployeeIdentificationNumber, PersonIdentification7.mmEmailAddress, PersonIdentification7.mmDateAndPlaceOfBirth, PersonIdentification7.mmOther);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification7";
				definition = "Set of unique and unambiguous ways to identify a person.";
				nextVersions_lazy = () -> Arrays.asList(PersonIdentification11.mmObject());
				previousVersion_lazy = () -> PersonIdentification5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DrvrsLicNb")
	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public void setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = driversLicenseNumber;
	}

	@XmlElement(name = "CstmrNb")
	public Max35Text getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Max35Text customerNumber) {
		this.customerNumber = customerNumber;
	}

	@XmlElement(name = "SclSctyNb")
	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@XmlElement(name = "AlnRegnNb")
	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public void setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = alienRegistrationNumber;
	}

	@XmlElement(name = "PsptNb")
	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = passportNumber;
	}

	@XmlElement(name = "TaxIdNb")
	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	@XmlElement(name = "IdntyCardNb")
	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	@XmlElement(name = "MplyrIdNb")
	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public void setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = employerIdentificationNumber;
	}

	@XmlElement(name = "MplyeeIdNb")
	public Max35Text getEmployeeIdentificationNumber() {
		return employeeIdentificationNumber;
	}

	public void setEmployeeIdentificationNumber(Max35Text employeeIdentificationNumber) {
		this.employeeIdentificationNumber = employeeIdentificationNumber;
	}

	@XmlElement(name = "EmailAdr")
	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
	}

	@XmlElement(name = "DtAndPlcOfBirth")
	public DateAndPlaceOfBirth getDateAndPlaceOfBirth() {
		return dateAndPlaceOfBirth;
	}

	public void setDateAndPlaceOfBirth(com.tools20022.repository.msg.DateAndPlaceOfBirth dateAndPlaceOfBirth) {
		this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
	}

	@XmlElement(name = "Othr")
	public List<GenericIdentification4> getOther() {
		return other;
	}

	public void setOther(List<com.tools20022.repository.msg.GenericIdentification4> other) {
		this.other = other;
	}
}