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
import com.tools20022.repository.choice.NamePrefix1Choice;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.msg.PersonalInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which a person is known and that is usually used to identify that
 * person.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonName" src="doc-files/PersonName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#BirthName
 * PersonName.BirthName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#NamePrefix
 * PersonName.NamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#GivenName
 * PersonName.GivenName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#MiddleName
 * PersonName.MiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#NameSuffix
 * PersonName.NameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#Identification
 * PersonName.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#PersonName
 * PersonIdentification.PersonName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.NamePrefix1Choice
 * NamePrefix1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonalInformation1
 * PersonalInformation1}</li>
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
 * "PersonName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a person is known and that is usually used to identify that person."
 * </li>
 * </ul>
 */
public class PersonName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name received at birth, eg, maiden name.
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
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson5#Name
	 * IndividualPerson5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson10#Name
	 * IndividualPerson10.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson20#Name
	 * IndividualPerson20.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson3#Name
	 * IndividualPerson3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#Name
	 * IndividualPerson8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson4#Name
	 * IndividualPerson4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson6#Name
	 * IndividualPerson6.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson11#Name
	 * IndividualPerson11.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson2#Name
	 * IndividualPerson2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson12#Name
	 * IndividualPerson12.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson9#Name
	 * IndividualPerson9.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#BirthName
	 * IndividualPerson7.BirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#BirthName
	 * IndividualPerson14.BirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#BirthName
	 * IndividualPerson16.BirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#BirthName
	 * IndividualPerson13.BirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#BirthName
	 * IndividualPerson17.BirthName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson15#Name
	 * IndividualPerson15.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson21#Name
	 * IndividualPerson21.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson22#Name
	 * IndividualPerson22.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson23#Name
	 * IndividualPerson23.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#Name
	 * IndividualPerson24.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#BirthName
	 * IndividualPerson25.BirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#BirthName
	 * IndividualPerson26.BirthName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#Name
	 * IndividualPerson30.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson28#Name
	 * IndividualPerson28.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#Name
	 * IndividualPerson27.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#NameOfFather
	 * PersonalInformation1.NameOfFather}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson29#Name
	 * IndividualPerson29.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson32#Name
	 * IndividualPerson32.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson31#Name
	 * IndividualPerson31.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#Name
	 * IndividualPerson33.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35#Name
	 * IndividualPerson35.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34#Name
	 * IndividualPerson34.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name received at birth, eg, maiden name."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BirthName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.Name, com.tools20022.repository.msg.IndividualPerson10.Name, com.tools20022.repository.msg.IndividualPerson20.Name,
					com.tools20022.repository.msg.IndividualPerson3.Name, com.tools20022.repository.msg.IndividualPerson8.Name, com.tools20022.repository.msg.IndividualPerson4.Name, com.tools20022.repository.msg.IndividualPerson6.Name,
					com.tools20022.repository.msg.IndividualPerson11.Name, com.tools20022.repository.msg.IndividualPerson2.Name, com.tools20022.repository.msg.IndividualPerson12.Name, com.tools20022.repository.msg.IndividualPerson9.Name,
					com.tools20022.repository.msg.IndividualPerson7.BirthName, com.tools20022.repository.msg.IndividualPerson14.BirthName, com.tools20022.repository.msg.IndividualPerson16.BirthName,
					com.tools20022.repository.msg.IndividualPerson13.BirthName, com.tools20022.repository.msg.IndividualPerson17.BirthName, com.tools20022.repository.msg.IndividualPerson15.Name,
					com.tools20022.repository.msg.IndividualPerson21.Name, com.tools20022.repository.msg.IndividualPerson22.Name, com.tools20022.repository.msg.IndividualPerson23.Name, com.tools20022.repository.msg.IndividualPerson24.Name,
					com.tools20022.repository.msg.IndividualPerson25.BirthName, com.tools20022.repository.msg.IndividualPerson26.BirthName, com.tools20022.repository.msg.IndividualPerson30.Name,
					com.tools20022.repository.msg.IndividualPerson28.Name, com.tools20022.repository.msg.IndividualPerson27.Name, com.tools20022.repository.msg.PersonalInformation1.NameOfFather,
					com.tools20022.repository.msg.IndividualPerson29.Name, com.tools20022.repository.msg.IndividualPerson32.Name, com.tools20022.repository.msg.IndividualPerson31.Name, com.tools20022.repository.msg.IndividualPerson33.Name,
					com.tools20022.repository.msg.IndividualPerson35.Name, com.tools20022.repository.msg.IndividualPerson34.Name);
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthName";
			definition = "Name received at birth, eg, maiden name.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the terms used to formally address a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#NamePrefix
	 * IndividualPerson5.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#ExtendedNamePrefix
	 * IndividualPerson5.ExtendedNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#NamePrefix
	 * IndividualPerson10.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#ExtendedNamePrefix
	 * IndividualPerson10.ExtendedNamePrefix}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.NamePrefix1Choice#Code
	 * NamePrefix1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NamePrefix1Choice#Proprietary
	 * NamePrefix1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#NamePrefix
	 * IndividualPerson20.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#NamePrefix
	 * IndividualPerson3.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#NamePrefix
	 * IndividualPerson8.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#NamePrefix
	 * IndividualPerson6.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#ExtendedNamePrefix
	 * IndividualPerson6.ExtendedNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#NamePrefix
	 * IndividualPerson11.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#ExtendedNamePrefix
	 * IndividualPerson11.ExtendedNamePrefix}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#NamePrefix
	 * ContactDetails2.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#NamePrefix
	 * ContactIdentification2.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#NamePrefix
	 * ContactIdentification1.NamePrefix}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#NamePrefix
	 * Contacts3.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#NamePrefix
	 * ContactIdentification4.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#NamePrefix
	 * ContactIdentification3.NamePrefix}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#NamePrefix
	 * ContactDetails3.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#NamePrefix
	 * IndividualPerson21.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#NamePrefix
	 * IndividualPerson22.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#NamePrefix
	 * IndividualPerson23.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#NamePrefix
	 * IndividualPerson24.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#NamePrefix
	 * IndividualPerson28.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#NamePrefix
	 * IndividualPerson27.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#NamePrefix
	 * IndividualPerson29.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#NamePrefix
	 * IndividualPerson33.NamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#NamePrefix
	 * IndividualPerson34.NamePrefix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the terms used to formally address a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NamePrefix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.NamePrefix, com.tools20022.repository.msg.IndividualPerson5.ExtendedNamePrefix, com.tools20022.repository.msg.IndividualPerson10.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson10.ExtendedNamePrefix, com.tools20022.repository.choice.NamePrefix1Choice.Code, com.tools20022.repository.choice.NamePrefix1Choice.Proprietary,
					com.tools20022.repository.msg.IndividualPerson20.NamePrefix, com.tools20022.repository.msg.IndividualPerson3.NamePrefix, com.tools20022.repository.msg.IndividualPerson8.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson6.NamePrefix, com.tools20022.repository.msg.IndividualPerson6.ExtendedNamePrefix, com.tools20022.repository.msg.IndividualPerson11.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson11.ExtendedNamePrefix, com.tools20022.repository.msg.ContactDetails2.NamePrefix, com.tools20022.repository.msg.ContactIdentification2.NamePrefix,
					com.tools20022.repository.msg.ContactIdentification1.NamePrefix, com.tools20022.repository.msg.Contacts3.NamePrefix, com.tools20022.repository.msg.ContactIdentification4.NamePrefix,
					com.tools20022.repository.msg.ContactIdentification3.NamePrefix, com.tools20022.repository.msg.ContactDetails3.NamePrefix, com.tools20022.repository.msg.IndividualPerson21.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson22.NamePrefix, com.tools20022.repository.msg.IndividualPerson23.NamePrefix, com.tools20022.repository.msg.IndividualPerson24.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson28.NamePrefix, com.tools20022.repository.msg.IndividualPerson27.NamePrefix, com.tools20022.repository.msg.IndividualPerson29.NamePrefix,
					com.tools20022.repository.msg.IndividualPerson33.NamePrefix, com.tools20022.repository.msg.IndividualPerson34.NamePrefix);
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	/**
	 * First name of a person.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#GivenName
	 * IndividualPerson5.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#GivenName
	 * IndividualPerson10.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#GivenName
	 * IndividualPerson20.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#GivenName
	 * IndividualPerson3.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#GivenName
	 * IndividualPerson8.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#GivenName
	 * IndividualPerson4.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#GivenName
	 * IndividualPerson6.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#GivenName
	 * IndividualPerson11.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#GivenName
	 * ContactIdentification2.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#GivenName
	 * ContactIdentification1.GivenName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder2#Name
	 * Cardholder2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder4#Name
	 * Cardholder4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder1#Name
	 * Cardholder1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder3#Name
	 * Cardholder3.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#GivenName
	 * IndividualPerson7.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#GivenName
	 * IndividualPerson14.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#GivenName
	 * IndividualPerson16.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#GivenName
	 * IndividualPerson13.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#GivenName
	 * IndividualPerson17.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#GivenName
	 * ContactIdentification4.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#GivenName
	 * ContactIdentification3.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#GivenName
	 * IndividualPerson21.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#GivenName
	 * IndividualPerson22.GivenName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#Name
	 * Cardholder5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder6#Name
	 * Cardholder6.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#GivenName
	 * IndividualPerson23.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#GivenName
	 * IndividualPerson24.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#GivenName
	 * IndividualPerson25.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#GivenName
	 * IndividualPerson26.GivenName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder8#Name
	 * Cardholder8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#Name
	 * Cardholder7.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9#Name
	 * Cardholder9.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#FirstName
	 * PersonIdentification10.FirstName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#GivenName
	 * IndividualPerson30.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#GivenName
	 * IndividualPerson28.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#GivenName
	 * IndividualPerson27.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#NameOfPartner
	 * PersonalInformation1.NameOfPartner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#GivenName
	 * IndividualPerson29.GivenName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11#Name
	 * Cardholder11.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#Name
	 * Cardholder10.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#GivenName
	 * IndividualPerson33.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#GivenName
	 * IndividualPerson35.GivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#GivenName
	 * IndividualPerson34.GivenName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#Name
	 * Cardholder12.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GivenName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.GivenName, com.tools20022.repository.msg.IndividualPerson10.GivenName, com.tools20022.repository.msg.IndividualPerson20.GivenName,
					com.tools20022.repository.msg.IndividualPerson3.GivenName, com.tools20022.repository.msg.IndividualPerson8.GivenName, com.tools20022.repository.msg.IndividualPerson4.GivenName,
					com.tools20022.repository.msg.IndividualPerson6.GivenName, com.tools20022.repository.msg.IndividualPerson11.GivenName, com.tools20022.repository.msg.ContactIdentification2.GivenName,
					com.tools20022.repository.msg.ContactIdentification1.GivenName, com.tools20022.repository.msg.Cardholder2.Name, com.tools20022.repository.msg.Cardholder4.Name, com.tools20022.repository.msg.Cardholder1.Name,
					com.tools20022.repository.msg.Cardholder3.Name, com.tools20022.repository.msg.IndividualPerson7.GivenName, com.tools20022.repository.msg.IndividualPerson14.GivenName,
					com.tools20022.repository.msg.IndividualPerson16.GivenName, com.tools20022.repository.msg.IndividualPerson13.GivenName, com.tools20022.repository.msg.IndividualPerson17.GivenName,
					com.tools20022.repository.msg.ContactIdentification4.GivenName, com.tools20022.repository.msg.ContactIdentification3.GivenName, com.tools20022.repository.msg.IndividualPerson21.GivenName,
					com.tools20022.repository.msg.IndividualPerson22.GivenName, com.tools20022.repository.msg.Cardholder5.Name, com.tools20022.repository.msg.Cardholder6.Name, com.tools20022.repository.msg.IndividualPerson23.GivenName,
					com.tools20022.repository.msg.IndividualPerson24.GivenName, com.tools20022.repository.msg.IndividualPerson25.GivenName, com.tools20022.repository.msg.IndividualPerson26.GivenName,
					com.tools20022.repository.msg.Cardholder8.Name, com.tools20022.repository.msg.Cardholder7.Name, com.tools20022.repository.msg.Cardholder9.Name, com.tools20022.repository.msg.PersonIdentification10.FirstName,
					com.tools20022.repository.msg.IndividualPerson30.GivenName, com.tools20022.repository.msg.IndividualPerson28.GivenName, com.tools20022.repository.msg.IndividualPerson27.GivenName,
					com.tools20022.repository.msg.PersonalInformation1.NameOfPartner, com.tools20022.repository.msg.IndividualPerson29.GivenName, com.tools20022.repository.msg.Cardholder11.Name,
					com.tools20022.repository.msg.Cardholder10.Name, com.tools20022.repository.msg.IndividualPerson33.GivenName, com.tools20022.repository.msg.IndividualPerson35.GivenName,
					com.tools20022.repository.msg.IndividualPerson34.GivenName, com.tools20022.repository.msg.Cardholder12.Name);
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Second name of a person.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#MiddleName
	 * IndividualPerson5.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#MiddleName
	 * IndividualPerson10.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#MiddleName
	 * IndividualPerson20.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#MiddleName
	 * IndividualPerson4.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#MiddleName
	 * IndividualPerson6.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#MiddleName
	 * IndividualPerson11.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#MiddleName
	 * IndividualPerson21.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#MiddleName
	 * IndividualPerson22.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#MiddleName
	 * IndividualPerson23.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#MiddleName
	 * IndividualPerson24.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#MiddleName
	 * IndividualPerson30.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#MiddleName
	 * IndividualPerson28.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#MiddleName
	 * IndividualPerson27.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#MiddleName
	 * IndividualPerson29.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#MiddleName
	 * IndividualPerson33.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#MiddleName
	 * IndividualPerson35.MiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#MiddleName
	 * IndividualPerson34.MiddleName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiddleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second name of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MiddleName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.MiddleName, com.tools20022.repository.msg.IndividualPerson10.MiddleName, com.tools20022.repository.msg.IndividualPerson20.MiddleName,
					com.tools20022.repository.msg.IndividualPerson4.MiddleName, com.tools20022.repository.msg.IndividualPerson6.MiddleName, com.tools20022.repository.msg.IndividualPerson11.MiddleName,
					com.tools20022.repository.msg.IndividualPerson21.MiddleName, com.tools20022.repository.msg.IndividualPerson22.MiddleName, com.tools20022.repository.msg.IndividualPerson23.MiddleName,
					com.tools20022.repository.msg.IndividualPerson24.MiddleName, com.tools20022.repository.msg.IndividualPerson30.MiddleName, com.tools20022.repository.msg.IndividualPerson28.MiddleName,
					com.tools20022.repository.msg.IndividualPerson27.MiddleName, com.tools20022.repository.msg.IndividualPerson29.MiddleName, com.tools20022.repository.msg.IndividualPerson33.MiddleName,
					com.tools20022.repository.msg.IndividualPerson35.MiddleName, com.tools20022.repository.msg.IndividualPerson34.MiddleName);
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiddleName";
			definition = "Second name of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Additional information about a person that follows a person's name, eg,
	 * qualification such as Doctor of Philosophy (PhD).
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#NameSuffix
	 * IndividualPerson5.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#NameSuffix
	 * IndividualPerson10.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#NameSuffix
	 * IndividualPerson20.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#NameSuffix
	 * IndividualPerson3.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#NameSuffix
	 * IndividualPerson8.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#NameSuffix
	 * IndividualPerson6.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#NameSuffix
	 * IndividualPerson11.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#NameSuffix
	 * IndividualPerson21.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#NameSuffix
	 * IndividualPerson22.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#NameSuffix
	 * IndividualPerson23.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#NameSuffix
	 * IndividualPerson24.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#NameSuffix
	 * IndividualPerson28.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#NameSuffix
	 * IndividualPerson27.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#NameSuffix
	 * IndividualPerson33.NameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#NameSuffix
	 * IndividualPerson34.NameSuffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NameSuffix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.NameSuffix, com.tools20022.repository.msg.IndividualPerson10.NameSuffix, com.tools20022.repository.msg.IndividualPerson20.NameSuffix,
					com.tools20022.repository.msg.IndividualPerson3.NameSuffix, com.tools20022.repository.msg.IndividualPerson8.NameSuffix, com.tools20022.repository.msg.IndividualPerson6.NameSuffix,
					com.tools20022.repository.msg.IndividualPerson11.NameSuffix, com.tools20022.repository.msg.IndividualPerson21.NameSuffix, com.tools20022.repository.msg.IndividualPerson22.NameSuffix,
					com.tools20022.repository.msg.IndividualPerson23.NameSuffix, com.tools20022.repository.msg.IndividualPerson24.NameSuffix, com.tools20022.repository.msg.IndividualPerson28.NameSuffix,
					com.tools20022.repository.msg.IndividualPerson27.NameSuffix, com.tools20022.repository.msg.IndividualPerson33.NameSuffix, com.tools20022.repository.msg.IndividualPerson34.NameSuffix);
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Person identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#PersonName
	 * PersonIdentification.PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PersonName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Person identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PersonIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.PersonName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonName";
				definition = "Name by which a person is known and that is usually used to identify that person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.PersonName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.BirthName, com.tools20022.repository.entity.PersonName.NamePrefix, com.tools20022.repository.entity.PersonName.GivenName,
						com.tools20022.repository.entity.PersonName.MiddleName, com.tools20022.repository.entity.PersonName.NameSuffix, com.tools20022.repository.entity.PersonName.Identification);
				derivationComponent_lazy = () -> Arrays.asList(NamePrefix1Choice.mmObject(), PersonalInformation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}