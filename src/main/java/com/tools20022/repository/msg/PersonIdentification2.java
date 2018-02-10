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
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#PersonIdentificationRule
 * PersonIdentification2.PersonIdentificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmDriversLicenseNumber
 * PersonIdentification2.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmSocialSecurityNumber
 * PersonIdentification2.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmAlienRegistrationNumber
 * PersonIdentification2.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmPassportNumber
 * PersonIdentification2.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmTaxIdentificationNumber
 * PersonIdentification2.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmIdentityCardNumber
 * PersonIdentification2.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmEmployerIdentificationNumber
 * PersonIdentification2.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmOtherIdentification
 * PersonIdentification2.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification2#mmIssuer
 * PersonIdentification2.mmIssuer}</li>
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
 * "PersonIdentification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentification2", propOrder = {"driversLicenseNumber", "socialSecurityNumber", "alienRegistrationNumber", "passportNumber", "taxIdentificationNumber", "identityCardNumber", "employerIdentificationNumber",
		"otherIdentification", "issuer"})
public class PersonIdentification2 {

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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmDriversLicenseNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmDriversLicenseNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmSocialSecurityNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmAlienRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmAlienRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmPassportNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPassportNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmIdentityCardNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmIdentityCardNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
			isDerived = false;
			xmlTag = "IdntyCardNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmEmployerIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmEmployerIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a person for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
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
	public static final MMMessageAttribute mmIssuer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IdentificationIssuerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity that assigns the identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * One and only one Message Element in the list (DriversLicenseNumber,
	 * SocialSecurityNumber, AlienRegistrationNumber, PassportNumber,
	 * TaxIdentificationNumber, IdentityCardNumber,
	 * EmployerIdentificationNumber, OtherIdentification) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2
	 * PersonIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmDriversLicenseNumber
	 * PersonIdentification2.mmDriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmSocialSecurityNumber
	 * PersonIdentification2.mmSocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmAlienRegistrationNumber
	 * PersonIdentification2.mmAlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmPassportNumber
	 * PersonIdentification2.mmPassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmTaxIdentificationNumber
	 * PersonIdentification2.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmIdentityCardNumber
	 * PersonIdentification2.mmIdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmEmployerIdentificationNumber
	 * PersonIdentification2.mmEmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmOtherIdentification
	 * PersonIdentification2.mmOtherIdentification}</li>
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
	 * "One and only one Message Element in the list (DriversLicenseNumber, SocialSecurityNumber, AlienRegistrationNumber, PassportNumber, TaxIdentificationNumber, IdentityCardNumber, EmployerIdentificationNumber, OtherIdentification) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor PersonIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonIdentificationRule";
			definition = "One and only one Message Element in the list (DriversLicenseNumber, SocialSecurityNumber, AlienRegistrationNumber, PassportNumber, TaxIdentificationNumber, IdentityCardNumber, EmployerIdentificationNumber, OtherIdentification) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PersonIdentification2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification2.mmDriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification2.mmSocialSecurityNumber,
					com.tools20022.repository.msg.PersonIdentification2.mmAlienRegistrationNumber, com.tools20022.repository.msg.PersonIdentification2.mmPassportNumber,
					com.tools20022.repository.msg.PersonIdentification2.mmTaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.mmIdentityCardNumber,
					com.tools20022.repository.msg.PersonIdentification2.mmEmployerIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.mmOtherIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification2.mmDriversLicenseNumber, com.tools20022.repository.msg.PersonIdentification2.mmSocialSecurityNumber,
						com.tools20022.repository.msg.PersonIdentification2.mmAlienRegistrationNumber, com.tools20022.repository.msg.PersonIdentification2.mmPassportNumber,
						com.tools20022.repository.msg.PersonIdentification2.mmTaxIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.mmIdentityCardNumber,
						com.tools20022.repository.msg.PersonIdentification2.mmEmployerIdentificationNumber, com.tools20022.repository.msg.PersonIdentification2.mmOtherIdentification,
						com.tools20022.repository.msg.PersonIdentification2.mmIssuer);
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
				name = "PersonIdentification2";
				definition = "Unique and unambiguous way to identify a person.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification2.PersonIdentificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public PersonIdentification2 setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = Objects.requireNonNull(driversLicenseNumber);
		return this;
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public PersonIdentification2 setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
		return this;
	}

	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public PersonIdentification2 setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = Objects.requireNonNull(alienRegistrationNumber);
		return this;
	}

	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public PersonIdentification2 setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = Objects.requireNonNull(passportNumber);
		return this;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public PersonIdentification2 setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = Objects.requireNonNull(taxIdentificationNumber);
		return this;
	}

	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public PersonIdentification2 setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = Objects.requireNonNull(identityCardNumber);
		return this;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public PersonIdentification2 setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = Objects.requireNonNull(employerIdentificationNumber);
		return this;
	}

	public GenericIdentification4 getOtherIdentification() {
		return otherIdentification;
	}

	public PersonIdentification2 setOtherIdentification(com.tools20022.repository.msg.GenericIdentification4 otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Max35Text> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public PersonIdentification2 setIssuer(Max35Text issuer) {
		this.issuer = issuer;
		return this;
	}
}