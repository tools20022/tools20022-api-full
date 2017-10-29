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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonIdentification" src="doc-files/PersonIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#SocialSecurityNumber
 * PersonIdentification.SocialSecurityNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification#Person
 * PersonIdentification.Person}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#PersonName
 * PersonIdentification.PersonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#DriversLicenseNumber
 * PersonIdentification.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#AlienRegistrationNumber
 * PersonIdentification.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#PassportNumber
 * PersonIdentification.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#IdentityCardNumber
 * PersonIdentification.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#EmployerIdentificationNumber
 * PersonIdentification.EmployerIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#Identification
 * PersonName.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonIdentification
 * Person.PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationType1#Structured
 * IdentificationType1.Structured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#IdentificationType
 * GenericIdentification9.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#ExtendedIdentificationType
 * GenericIdentification9.ExtendedIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification1Choice#Code
 * OtherIdentification1Choice.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification44#Type
 * GenericIdentification44.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification10#IdentificationType
 * GenericIdentification10.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification10#ExtendedIdentificationType
 * GenericIdentification10.ExtendedIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party2Choice#PrivateIdentification
 * Party2Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party6Choice#PrivateIdentification
 * Party6Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party11Choice#PrivateIdentification
 * Party11Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party8Choice#PrivateIdentification
 * Party8Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#PrivateIdentification
 * Party10Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderIdentification1#CardholderIdentificationType
 * CardholderIdentification1.CardholderIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification11#IdentificationType
 * GenericIdentification11.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification11#ExtendedIdentificationType
 * GenericIdentification11.ExtendedIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party1Choice#PrivateIdentification
 * Party1Choice.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification6#PersonIdentificationType
 * PersonIdentification6.PersonIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#IdentificationType
 * GenericIdentification16.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationType1Choice#IdentificationType
 * IdentificationType1Choice.IdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification12#OtherIdentificationType
 * GenericIdentification12.OtherIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyPrivate1#PrivateIdentification
 * PartyPrivate1.PrivateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party5Choice#PrivateIdentification
 * Party5Choice.PrivateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification55#Type
 * GenericIdentification55.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification2Choice#Code
 * OtherIdentification2Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#Person
 * PersonOrOrganisation1Choice.Person}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#Person
 * PersonOrOrganisation2Choice.Person}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification4#Type
 * AlternateIdentification4.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification4Choice#Code
 * OtherIdentification4Choice.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification82#Type
 * GenericIdentification82.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OtherIdentification3Choice#Code
 * OtherIdentification3Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1#ContactDetails
 * TaxOrganisationIdentification1.ContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#IdentificationType
 * GenericIdentification164.IdentificationType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationType1
 * IdentificationType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice
 * IndividualPersonIdentificationChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification3
 * PersonIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
 * PersonIdentificationSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericPersonIdentification1
 * GenericPersonIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification5
 * PersonIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2
 * ContactDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderIdentification1
 * CardholderIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification2
 * PersonIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
 * PersonIdentificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification6
 * PersonIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType3Choice
 * PersonIdentificationType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3
 * ContactDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType1Choice
 * IdentificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification4
 * PersonIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification7
 * PersonIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification10
 * PersonIdentification10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice
 * IndividualPersonIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice
 * IndividualPersonIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification11
 * PersonIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification12
 * PersonIdentification12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice
 * IndividualPersonIdentification3Choice}</li>
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
 * "PersonIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * </ul>
 */
public class PersonIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a social security agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#SocialSecurityNumber
	 * IndividualPerson3.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#SocialSecurityNumber
	 * IndividualPerson8.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#SocialSecurityNumber
	 * PersonIdentification3.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#SocialSecurityNumber
	 * PersonIdentification2.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#SocialSecurityNumber
	 * PersonIdentificationType1Choice.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#SocialSecurityNumber
	 * PersonIdentification7.SocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#SocialSecurityNumber
	 * PersonIdentification11.SocialSecurityNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SocialSecurityNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson3.SocialSecurityNumber, com.tools20022.repository.msg.IndividualPerson8.SocialSecurityNumber,
					com.tools20022.repository.msg.PersonIdentification3.SocialSecurityNumber, com.tools20022.repository.msg.PersonIdentification2.SocialSecurityNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.SocialSecurityNumber, com.tools20022.repository.msg.PersonIdentification7.SocialSecurityNumber,
					com.tools20022.repository.msg.PersonIdentification11.SocialSecurityNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Person for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#PersonIdentification
	 * Person.PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#DateAndPlaceOfBirth
	 * PersonIdentification3.DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#DateAndPlaceOfBirth
	 * PersonIdentification5.DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#DateAndPlaceOfBirth
	 * PersonIdentification7.DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#DateAndPlaceOfBirth
	 * PersonIdentification11.DateAndPlaceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.DateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification5.DateAndPlaceOfBirth,
					com.tools20022.repository.msg.PersonIdentification7.DateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification11.DateAndPlaceOfBirth);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which an identification is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PersonIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name by which a person is known and which is usually used to identify
	 * that person. It is derived from PartyName (association between
	 * PartyIdentificationInformation and PartyName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#Identification
	 * PersonName.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonName
	 * PersonName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#PersonName
	 * IndividualPersonIdentificationChoice.PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#PersonName
	 * IndividualPersonIdentification1Choice.PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#PersonName
	 * IndividualPersonIdentification2Choice.PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#PersonName
	 * IndividualPersonIdentification3Choice.PersonName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PersonName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentificationChoice.PersonName, com.tools20022.repository.choice.IndividualPersonIdentification1Choice.PersonName,
					com.tools20022.repository.choice.IndividualPersonIdentification2Choice.PersonName, com.tools20022.repository.choice.IndividualPersonIdentification3Choice.PersonName);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonName";
			definition = "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName).";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonName.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number assigned by a license authority to a driver's license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#DriversLicenseNumber
	 * PersonIdentification3.DriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#DriversLicenseNumber
	 * PersonIdentification2.DriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#DriversLicenseNumber
	 * PersonIdentificationType1Choice.DriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#DriversLicenseNumber
	 * PersonIdentification7.DriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#DriverLicenseNumber
	 * PersonIdentification11.DriverLicenseNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DriversLicenseNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.DriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification2.DriversLicenseNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.DriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification7.DriversLicenseNumber,
					com.tools20022.repository.msg.PersonIdentification11.DriverLicenseNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#AlienRegistrationNumber
	 * PersonIdentification3.AlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#AlienRegistrationNumber
	 * PersonIdentification2.AlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#AlienRegistrationNumber
	 * PersonIdentificationType1Choice.AlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#AlienRegistrationNumber
	 * PersonIdentification7.AlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#AlienRegistrationNumber
	 * PersonIdentification11.AlienRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AlienRegistrationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.AlienRegistrationNumber, com.tools20022.repository.msg.PersonIdentification2.AlienRegistrationNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.AlienRegistrationNumber, com.tools20022.repository.msg.PersonIdentification7.AlienRegistrationNumber,
					com.tools20022.repository.msg.PersonIdentification11.AlienRegistrationNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a passport authority to a passport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#PassportNumber
	 * PersonIdentification3.PassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#PassportNumber
	 * PersonIdentification2.PassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#PassportNumber
	 * PersonIdentificationType1Choice.PassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#PassportNumber
	 * PersonIdentification7.PassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#PassportNumber
	 * PersonIdentification11.PassportNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PassportNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.PassportNumber, com.tools20022.repository.msg.PersonIdentification2.PassportNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.PassportNumber, com.tools20022.repository.msg.PersonIdentification7.PassportNumber, com.tools20022.repository.msg.PersonIdentification11.PassportNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a national authority to an identity card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#IdentityCardNumber
	 * PersonIdentification3.IdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#IdentityCardNumber
	 * PersonIdentification2.IdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#IdentityCardNumber
	 * PersonIdentificationType1Choice.IdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#IdentityCardNumber
	 * PersonIdentification7.IdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#IdentityCardNumber
	 * PersonIdentification11.IdentityCardNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national authority to an identity card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IdentityCardNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.IdentityCardNumber, com.tools20022.repository.msg.PersonIdentification2.IdentityCardNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.IdentityCardNumber, com.tools20022.repository.msg.PersonIdentification7.IdentityCardNumber,
					com.tools20022.repository.msg.PersonIdentification11.IdentityCardNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned to an employer by a registration authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#EmployerIdentificationNumber
	 * PersonIdentification3.EmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#EmployerIdentificationNumber
	 * PersonIdentification2.EmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#EmployerIdentificationNumber
	 * PersonIdentificationType1Choice.EmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#EmployerIdentificationNumber
	 * PersonIdentification7.EmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#EmployerIdentificationNumber
	 * PersonIdentification11.EmployerIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an employer by a registration authority."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EmployerIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.EmployerIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.EmployerIdentificationNumber,
					com.tools20022.repository.choice.PersonIdentificationType1Choice.EmployerIdentificationNumber, com.tools20022.repository.msg.PersonIdentification7.EmployerIdentificationNumber,
					com.tools20022.repository.msg.PersonIdentification11.EmployerIdentificationNumber);
			elementContext_lazy = () -> PersonIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification";
				definition = "Unique and unambiguous way to identify a person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.Identification, com.tools20022.repository.entity.Person.PersonIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IdentificationType1.Structured, com.tools20022.repository.msg.GenericIdentification9.IdentificationType,
						com.tools20022.repository.msg.GenericIdentification9.ExtendedIdentificationType, com.tools20022.repository.choice.OtherIdentification1Choice.Code, com.tools20022.repository.msg.GenericIdentification44.Type,
						com.tools20022.repository.msg.GenericIdentification10.IdentificationType, com.tools20022.repository.msg.GenericIdentification10.ExtendedIdentificationType,
						com.tools20022.repository.choice.Party2Choice.PrivateIdentification, com.tools20022.repository.choice.Party6Choice.PrivateIdentification, com.tools20022.repository.choice.Party11Choice.PrivateIdentification,
						com.tools20022.repository.choice.Party8Choice.PrivateIdentification, com.tools20022.repository.choice.Party10Choice.PrivateIdentification,
						com.tools20022.repository.msg.CardholderIdentification1.CardholderIdentificationType, com.tools20022.repository.msg.GenericIdentification11.IdentificationType,
						com.tools20022.repository.msg.GenericIdentification11.ExtendedIdentificationType, com.tools20022.repository.choice.Party1Choice.PrivateIdentification,
						com.tools20022.repository.msg.PersonIdentification6.PersonIdentificationType, com.tools20022.repository.msg.GenericIdentification16.IdentificationType,
						com.tools20022.repository.choice.IdentificationType1Choice.IdentificationType, com.tools20022.repository.msg.GenericIdentification12.OtherIdentificationType,
						com.tools20022.repository.choice.PartyPrivate1.PrivateIdentification, com.tools20022.repository.choice.Party5Choice.PrivateIdentification, com.tools20022.repository.msg.GenericIdentification55.Type,
						com.tools20022.repository.choice.OtherIdentification2Choice.Code, com.tools20022.repository.choice.PersonOrOrganisation1Choice.Person, com.tools20022.repository.choice.PersonOrOrganisation2Choice.Person,
						com.tools20022.repository.msg.AlternateIdentification4.Type, com.tools20022.repository.choice.OtherIdentification4Choice.Code, com.tools20022.repository.msg.GenericIdentification82.Type,
						com.tools20022.repository.choice.OtherIdentification3Choice.Code, com.tools20022.repository.msg.TaxOrganisationIdentification1.ContactDetails,
						com.tools20022.repository.msg.GenericIdentification164.IdentificationType);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.SocialSecurityNumber, com.tools20022.repository.entity.PersonIdentification.Person,
						com.tools20022.repository.entity.PersonIdentification.PersonName, com.tools20022.repository.entity.PersonIdentification.DriversLicenseNumber,
						com.tools20022.repository.entity.PersonIdentification.AlienRegistrationNumber, com.tools20022.repository.entity.PersonIdentification.PassportNumber,
						com.tools20022.repository.entity.PersonIdentification.IdentityCardNumber, com.tools20022.repository.entity.PersonIdentification.EmployerIdentificationNumber);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationType1.mmObject(), IndividualPersonIdentificationChoice.mmObject(), PersonIdentification3.mmObject(), PersonIdentificationSchemeName1Choice.mmObject(),
						GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject(), CardholderIdentification1.mmObject(), PersonIdentification2.mmObject(),
						PersonIdentificationType1Choice.mmObject(), PersonIdentification6.mmObject(), PersonIdentificationType3Choice.mmObject(), ContactDetails3.mmObject(), IdentificationType1Choice.mmObject(),
						PersonIdentification4.mmObject(), PersonIdentification7.mmObject(), PersonIdentification10.mmObject(), IndividualPersonIdentification1Choice.mmObject(), IndividualPersonIdentification2Choice.mmObject(),
						PersonIdentification11.mmObject(), PersonIdentification12.mmObject(), IndividualPersonIdentification3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}