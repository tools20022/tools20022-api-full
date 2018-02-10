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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.Max45Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmIdentification
 * Cardholder5.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmName
 * Cardholder5.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmLanguage
 * Cardholder5.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmBillingAddress
 * Cardholder5.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmShippingAddress
 * Cardholder5.mmShippingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmAuthentication
 * Cardholder5.mmAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Cardholder5#mmAddressVerification
 * Cardholder5.mmAddressVerification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmPersonalData
 * Cardholder5.mmPersonalData}</li>
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
 * "Cardholder5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7 Cardholder7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Cardholder3
 * Cardholder3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cardholder5", propOrder = {"identification", "name", "language", "billingAddress", "shippingAddress", "authentication", "addressVerification", "personalData"})
public class Cardholder5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected PersonIdentification7 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification7
	 * PersonIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder7#mmIdentification
	 * Cardholder7.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmIdentification
	 * Cardholder3.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the cardholder involved in a transaction.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmIdentification);
			previousVersion_lazy = () -> Cardholder3.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PersonIdentification7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#mmName
	 * Cardholder7.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmName
	 * Cardholder3.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Cardholder name associated with the card.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmName);
			previousVersion_lazy = () -> Cardholder3.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max45Text.mmObject();
		}
	};
	@XmlElement(name = "Lang")
	protected ISO2ALanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmLanguage
	 * Person.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * "Language selected for the cardholder interface during the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#mmLanguage
	 * Cardholder7.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmLanguage
	 * Cardholder3.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language selected for the cardholder interface during the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmLanguage);
			previousVersion_lazy = () -> Cardholder3.mmLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	@XmlElement(name = "BllgAdr")
	protected PostalAddress13 billingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress13
	 * PostalAddress13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder7#mmBillingAddress
	 * Cardholder7.mmBillingAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillingAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "BllgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddress";
			definition = "Postal address of the owner of the payment card.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmBillingAddress);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress13.mmObject();
		}
	};
	@XmlElement(name = "ShppgAdr")
	protected PostalAddress13 shippingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress13
	 * PostalAddress13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder7#mmShippingAddress
	 * Cardholder7.mmShippingAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShippingAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "ShppgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddress";
			definition = "Postal address for delivery of goods or services.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmShippingAddress);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress13.mmObject();
		}
	};
	@XmlElement(name = "Authntcn")
	protected List<com.tools20022.repository.msg.CardholderAuthentication5> authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication5
	 * CardholderAuthentication5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
	 * CardholderRole.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authntcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the authentication of the cardholder."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder7#mmAuthentication
	 * Cardholder7.mmAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmAuthentication
	 * Cardholder3.mmAuthentication}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthentication = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardholderRole.mmAuthentication;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Data related to the authentication of the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmAuthentication);
			previousVersion_lazy = () -> Cardholder3.mmAuthentication;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication5.mmObject();
		}
	};
	@XmlElement(name = "AdrVrfctn")
	protected AddressVerification1 addressVerification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressVerification1
	 * AddressVerification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numeric characters of the cardholder's address for verification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmAddressVerification
	 * Cardholder3.mmAddressVerification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddressVerification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "AdrVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressVerification";
			definition = "Numeric characters of the cardholder's address for verification.";
			previousVersion_lazy = () -> Cardholder3.mmAddressVerification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressVerification1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#mmPersonalData
	 * Cardholder7.mmPersonalData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmPersonalData
	 * Cardholder3.mmPersonalData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPersonalData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder5.mmObject();
			isDerived = false;
			xmlTag = "PrsnlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalData";
			definition = "Identifies personal data related to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmPersonalData);
			previousVersion_lazy = () -> Cardholder3.mmPersonalData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cardholder5.mmIdentification, com.tools20022.repository.msg.Cardholder5.mmName, com.tools20022.repository.msg.Cardholder5.mmLanguage,
						com.tools20022.repository.msg.Cardholder5.mmBillingAddress, com.tools20022.repository.msg.Cardholder5.mmShippingAddress, com.tools20022.repository.msg.Cardholder5.mmAuthentication,
						com.tools20022.repository.msg.Cardholder5.mmAddressVerification, com.tools20022.repository.msg.Cardholder5.mmPersonalData);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cardholder5";
				definition = "Data related to the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(Cardholder7.mmObject());
				previousVersion_lazy = () -> Cardholder3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PersonIdentification7> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Cardholder5 setIdentification(com.tools20022.repository.msg.PersonIdentification7 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max45Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public Cardholder5 setName(Max45Text name) {
		this.name = name;
		return this;
	}

	public Optional<ISO2ALanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public Cardholder5 setLanguage(ISO2ALanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<PostalAddress13> getBillingAddress() {
		return billingAddress == null ? Optional.empty() : Optional.of(billingAddress);
	}

	public Cardholder5 setBillingAddress(com.tools20022.repository.msg.PostalAddress13 billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	public Optional<PostalAddress13> getShippingAddress() {
		return shippingAddress == null ? Optional.empty() : Optional.of(shippingAddress);
	}

	public Cardholder5 setShippingAddress(com.tools20022.repository.msg.PostalAddress13 shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	public List<CardholderAuthentication5> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public Cardholder5 setAuthentication(List<com.tools20022.repository.msg.CardholderAuthentication5> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}

	public Optional<AddressVerification1> getAddressVerification() {
		return addressVerification == null ? Optional.empty() : Optional.of(addressVerification);
	}

	public Cardholder5 setAddressVerification(com.tools20022.repository.msg.AddressVerification1 addressVerification) {
		this.addressVerification = addressVerification;
		return this;
	}

	public Optional<Max70Text> getPersonalData() {
		return personalData == null ? Optional.empty() : Optional.of(personalData);
	}

	public Cardholder5 setPersonalData(Max70Text personalData) {
		this.personalData = personalData;
		return this;
	}
}