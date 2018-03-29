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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of personal identification type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmPassportNumber
 * PersonIdentificationType1Choice.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmTaxIdentificationNumber
 * PersonIdentificationType1Choice.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmSocialSecurityNumber
 * PersonIdentificationType1Choice.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmEmployerIdentificationNumber
 * PersonIdentificationType1Choice.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmDriversLicenseNumber
 * PersonIdentificationType1Choice.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmAlienRegistrationNumber
 * PersonIdentificationType1Choice.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmIdentityCardNumber
 * PersonIdentificationType1Choice.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmOtherIdentification
 * PersonIdentificationType1Choice.mmOtherIdentification}</li>
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
 * "PersonIdentificationType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of personal identification type."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentificationType1Choice", propOrder = {"passportNumber", "taxIdentificationNumber", "socialSecurityNumber", "employerIdentificationNumber", "driversLicenseNumber", "alienRegistrationNumber", "identityCardNumber",
		"otherIdentification"})
public class PersonIdentificationType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PsptNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PsptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//CCPT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmPassportNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPassportNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "PsptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//CCPT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getPassportNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setPassportNumber(value);
		}
	};
	@XmlElement(name = "TaxIdNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//TXID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmTaxIdentificationNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//TXID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getTaxIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setTaxIdentificationNumber(value);
		}
	};
	@XmlElement(name = "SclSctyNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SclSctyNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//SSNX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmSocialSecurityNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "SclSctyNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//SSNX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getSocialSecurityNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setSocialSecurityNumber(value);
		}
	};
	@XmlElement(name = "MplyrIdNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MplyrIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//EINX</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmEmployerIdentificationNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmEmployerIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "MplyrIdNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//EINX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getEmployerIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setEmployerIdentificationNumber(value);
		}
	};
	@XmlElement(name = "DrvrsLicNb", required = true)
	protected Max35Text driversLicenseNumber;
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrvrsLicNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//DRLC</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmDriversLicenseNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmDriversLicenseNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "DrvrsLicNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//DRLC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getDriversLicenseNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setDriversLicenseNumber(value);
		}
	};
	@XmlElement(name = "AlnRegnNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlnRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//ARNU</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmAlienRegistrationNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmAlienRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "AlnRegnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//ARNU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getAlienRegistrationNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setAlienRegistrationNumber(value);
		}
	};
	@XmlElement(name = "IdntyCardNb", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, Max35Text> mmIdentityCardNumber = new MMMessageAttribute<PersonIdentificationType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmIdentityCardNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "IdntyCardNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentificationType1Choice obj) {
			return obj.getIdentityCardNumber();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, Max35Text value) {
			obj.setIdentityCardNumber(value);
		}
	};
	@XmlElement(name = "OthrId", required = true)
	protected GenericIdentification4 otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice
	 * PersonIdentificationType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a person for which no specific identifier has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentificationType1Choice, GenericIdentification4> mmOtherIdentification = new MMMessageAttribute<PersonIdentificationType1Choice, GenericIdentification4>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonIdentificationType1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a person for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public GenericIdentification4 getValue(PersonIdentificationType1Choice obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(PersonIdentificationType1Choice obj, GenericIdentification4 value) {
			obj.setOtherIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PersonIdentificationType1Choice.mmPassportNumber, com.tools20022.repository.choice.PersonIdentificationType1Choice.mmTaxIdentificationNumber,
						com.tools20022.repository.choice.PersonIdentificationType1Choice.mmSocialSecurityNumber, com.tools20022.repository.choice.PersonIdentificationType1Choice.mmEmployerIdentificationNumber,
						com.tools20022.repository.choice.PersonIdentificationType1Choice.mmDriversLicenseNumber, com.tools20022.repository.choice.PersonIdentificationType1Choice.mmAlienRegistrationNumber,
						com.tools20022.repository.choice.PersonIdentificationType1Choice.mmIdentityCardNumber, com.tools20022.repository.choice.PersonIdentificationType1Choice.mmOtherIdentification);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationType1Choice";
				definition = "Choice of personal identification type.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public PersonIdentificationType1Choice setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = Objects.requireNonNull(passportNumber);
		return this;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public PersonIdentificationType1Choice setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = Objects.requireNonNull(taxIdentificationNumber);
		return this;
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public PersonIdentificationType1Choice setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
		return this;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public PersonIdentificationType1Choice setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = Objects.requireNonNull(employerIdentificationNumber);
		return this;
	}

	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public PersonIdentificationType1Choice setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = Objects.requireNonNull(driversLicenseNumber);
		return this;
	}

	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public PersonIdentificationType1Choice setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = Objects.requireNonNull(alienRegistrationNumber);
		return this;
	}

	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public PersonIdentificationType1Choice setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = Objects.requireNonNull(identityCardNumber);
		return this;
	}

	public GenericIdentification4 getOtherIdentification() {
		return otherIdentification;
	}

	public PersonIdentificationType1Choice setOtherIdentification(GenericIdentification4 otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}
}