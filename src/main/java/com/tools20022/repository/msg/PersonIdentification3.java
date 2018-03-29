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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import com.tools20022.repository.msg.GenericIdentification4;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#PersonIdentificationRule
 * PersonIdentification3.PersonIdentificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmDriversLicenseNumber
 * PersonIdentification3.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmCustomerNumber
 * PersonIdentification3.mmCustomerNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmSocialSecurityNumber
 * PersonIdentification3.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmAlienRegistrationNumber
 * PersonIdentification3.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmPassportNumber
 * PersonIdentification3.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmTaxIdentificationNumber
 * PersonIdentification3.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmIdentityCardNumber
 * PersonIdentification3.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmEmployerIdentificationNumber
 * PersonIdentification3.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmDateAndPlaceOfBirth
 * PersonIdentification3.mmDateAndPlaceOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmOtherIdentification
 * PersonIdentification3.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification3#mmIssuer
 * PersonIdentification3.mmIssuer}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentification3", propOrder = {"driversLicenseNumber", "customerNumber", "socialSecurityNumber", "alienRegistrationNumber", "passportNumber", "taxIdentificationNumber", "identityCardNumber",
		"employerIdentificationNumber", "dateAndPlaceOfBirth", "otherIdentification", "issuer"})
public class PersonIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmDriversLicenseNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmDriversLicenseNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getDriversLicenseNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setDriversLicenseNumber(value);
		}
	};
	@XmlElement(name = "CstmrNb", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmCustomerNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
			isDerived = false;
			xmlTag = "CstmrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerNumber";
			definition = "Number assigned by an agent to identify its customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getCustomerNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setCustomerNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmSocialSecurityNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getSocialSecurityNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setSocialSecurityNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmAlienRegistrationNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmAlienRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getAlienRegistrationNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setAlienRegistrationNumber(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmPassportNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPassportNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getPassportNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmTaxIdentificationNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getTaxIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setTaxIdentificationNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmIdentityCardNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmIdentityCardNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getIdentityCardNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setIdentityCardNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAttribute<PersonIdentification3, Max35Text> mmEmployerIdentificationNumber = new MMMessageAttribute<PersonIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmEmployerIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
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
		public Max35Text getValue(PersonIdentification3 obj) {
			return obj.getEmployerIdentificationNumber();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Max35Text value) {
			obj.setEmployerIdentificationNumber(value);
		}
	};
	@XmlElement(name = "DtAndPlcOfBirth", required = true)
	protected DateAndPlaceOfBirth dateAndPlaceOfBirth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification3, DateAndPlaceOfBirth> mmDateAndPlaceOfBirth = new MMMessageAssociationEnd<PersonIdentification3, DateAndPlaceOfBirth>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPerson;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
			isDerived = false;
			xmlTag = "DtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndPlaceOfBirth";
			definition = "Date and place of birth of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndPlaceOfBirth.mmObject();
		}

		@Override
		public DateAndPlaceOfBirth getValue(PersonIdentification3 obj) {
			return obj.getDateAndPlaceOfBirth();
		}

		@Override
		public void setValue(PersonIdentification3 obj, DateAndPlaceOfBirth value) {
			obj.setDateAndPlaceOfBirth(value);
		}
	};
	@XmlElement(name = "OthrId", required = true)
	protected GenericIdentification4 otherIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
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
	public static final MMMessageAssociationEnd<PersonIdentification3, GenericIdentification4> mmOtherIdentification = new MMMessageAssociationEnd<PersonIdentification3, GenericIdentification4>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a person for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public GenericIdentification4 getValue(PersonIdentification3 obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(PersonIdentification3 obj, GenericIdentification4 value) {
			obj.setOtherIdentification(value);
		}
	};
	@XmlElement(name = "Issr")
	protected Max35Text issuer;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonIdentification3, Optional<Max35Text>> mmIssuer = new MMMessageAttribute<PersonIdentification3, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> IdentificationIssuerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity that assigns the identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonIdentification3 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(PersonIdentification3 obj, Optional<Max35Text> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	/**
	 * One and only one Message Element in the list (DateAndPlaceOfBirth,
	 * CustomerNumber, DriversLicenseNumber, SocialSecurityNumber,
	 * AlienRegistrationNumber, PassportNumber, TaxIdentificationNumber,
	 * IdentityCardNumber, EmployerIdentificationNumber, OtherIdentification,
	 * DateAndPlaceOfBirth) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3
	 * PersonIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmDriversLicenseNumber
	 * PersonIdentification3.mmDriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmCustomerNumber
	 * PersonIdentification3.mmCustomerNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmSocialSecurityNumber
	 * PersonIdentification3.mmSocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmAlienRegistrationNumber
	 * PersonIdentification3.mmAlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmPassportNumber
	 * PersonIdentification3.mmPassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmTaxIdentificationNumber
	 * PersonIdentification3.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmIdentityCardNumber
	 * PersonIdentification3.mmIdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmEmployerIdentificationNumber
	 * PersonIdentification3.mmEmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmDateAndPlaceOfBirth
	 * PersonIdentification3.mmDateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmOtherIdentification
	 * PersonIdentification3.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one Message Element in the list (DateAndPlaceOfBirth, CustomerNumber, DriversLicenseNumber, SocialSecurityNumber, AlienRegistrationNumber, PassportNumber, TaxIdentificationNumber, IdentityCardNumber, EmployerIdentificationNumber, OtherIdentification, DateAndPlaceOfBirth) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor PersonIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonIdentificationRule";
			definition = "One and only one Message Element in the list (DateAndPlaceOfBirth, CustomerNumber, DriversLicenseNumber, SocialSecurityNumber, AlienRegistrationNumber, PassportNumber, TaxIdentificationNumber, IdentityCardNumber, EmployerIdentificationNumber, OtherIdentification, DateAndPlaceOfBirth) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PersonIdentification3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.mmDriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification3.mmCustomerNumber,
					com.tools20022.repository.msg.PersonIdentification3.mmSocialSecurityNumber, com.tools20022.repository.msg.PersonIdentification3.mmAlienRegistrationNumber,
					com.tools20022.repository.msg.PersonIdentification3.mmPassportNumber, com.tools20022.repository.msg.PersonIdentification3.mmTaxIdentificationNumber,
					com.tools20022.repository.msg.PersonIdentification3.mmIdentityCardNumber, com.tools20022.repository.msg.PersonIdentification3.mmEmployerIdentificationNumber,
					com.tools20022.repository.msg.PersonIdentification3.mmDateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification3.mmOtherIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.mmDriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification3.mmCustomerNumber,
						com.tools20022.repository.msg.PersonIdentification3.mmSocialSecurityNumber, com.tools20022.repository.msg.PersonIdentification3.mmAlienRegistrationNumber,
						com.tools20022.repository.msg.PersonIdentification3.mmPassportNumber, com.tools20022.repository.msg.PersonIdentification3.mmTaxIdentificationNumber,
						com.tools20022.repository.msg.PersonIdentification3.mmIdentityCardNumber, com.tools20022.repository.msg.PersonIdentification3.mmEmployerIdentificationNumber,
						com.tools20022.repository.msg.PersonIdentification3.mmDateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification3.mmOtherIdentification, com.tools20022.repository.msg.PersonIdentification3.mmIssuer);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PersonIdentification3";
				definition = "Unique and unambiguous way to identify a person.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification3.PersonIdentificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public PersonIdentification3 setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = Objects.requireNonNull(driversLicenseNumber);
		return this;
	}

	public Max35Text getCustomerNumber() {
		return customerNumber;
	}

	public PersonIdentification3 setCustomerNumber(Max35Text customerNumber) {
		this.customerNumber = Objects.requireNonNull(customerNumber);
		return this;
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public PersonIdentification3 setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
		return this;
	}

	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public PersonIdentification3 setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = Objects.requireNonNull(alienRegistrationNumber);
		return this;
	}

	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public PersonIdentification3 setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = Objects.requireNonNull(passportNumber);
		return this;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public PersonIdentification3 setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = Objects.requireNonNull(taxIdentificationNumber);
		return this;
	}

	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public PersonIdentification3 setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = Objects.requireNonNull(identityCardNumber);
		return this;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public PersonIdentification3 setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = Objects.requireNonNull(employerIdentificationNumber);
		return this;
	}

	public DateAndPlaceOfBirth getDateAndPlaceOfBirth() {
		return dateAndPlaceOfBirth;
	}

	public PersonIdentification3 setDateAndPlaceOfBirth(DateAndPlaceOfBirth dateAndPlaceOfBirth) {
		this.dateAndPlaceOfBirth = Objects.requireNonNull(dateAndPlaceOfBirth);
		return this;
	}

	public GenericIdentification4 getOtherIdentification() {
		return otherIdentification;
	}

	public PersonIdentification3 setOtherIdentification(GenericIdentification4 otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Max35Text> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public PersonIdentification3 setIssuer(Max35Text issuer) {
		this.issuer = issuer;
		return this;
	}
}