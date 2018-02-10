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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.*;
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
 * Information needed to contact a physical person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3#mmBIC
 * ContactIdentification3.mmBIC}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3#mmName
 * ContactIdentification3.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmNamePrefix
 * ContactIdentification3.mmNamePrefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmGivenName
 * ContactIdentification3.mmGivenName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3#mmRole
 * ContactIdentification3.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmPhoneNumber
 * ContactIdentification3.mmPhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmFaxNumber
 * ContactIdentification3.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmEmailAddress
 * ContactIdentification3.mmEmailAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmOtherBankContactPerson
 * BaselineAmendmentRequestV03.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmOtherBankContactPerson
 * BaselineReSubmissionV03.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmOtherBankContactPerson
 * FullPushThroughReportV03.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmOtherBankContactPerson
 * InitialBaselineSubmissionV03.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmOtherBankContactPerson
 * BaselineReSubmissionV04.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmOtherBankContactPerson
 * FullPushThroughReportV04.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmOtherBankContactPerson
 * BaselineAmendmentRequestV04.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmOtherBankContactPerson
 * InitialBaselineSubmissionV04.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmOtherBankContactPerson
 * InitialBaselineSubmissionV05.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmOtherBankContactPerson
 * BaselineAmendmentRequestV05.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmOtherBankContactPerson
 * FullPushThroughReportV05.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmOtherBankContactPerson
 * BaselineReSubmissionV05.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
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
 * "ContactIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information needed to contact a physical person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContactIdentification3", propOrder = {"bIC", "name", "namePrefix", "givenName", "role", "phoneNumber", "faxNumber", "emailAddress"})
public class ContactIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BIC", required = true)
	protected BICIdentifier bIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business Identifier Code to identify the financial institution that the contact person belongs to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "BIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "Business Identifier Code to identify the financial institution that the contact person belongs to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
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
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the terms used to formally address a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	@XmlElement(name = "GvnNm")
	protected Max35Text givenName;
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGivenName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Role")
	protected Max35Text role;
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
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the party in the activity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Role of the party in the activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PhneNb")
	protected PhoneNumber phoneNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmPhoneNumber
	 * PhoneAddress.mmPhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhneNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhoneNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	@XmlElement(name = "FaxNb")
	protected PhoneNumber faxNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmFaxNumber
	 * PhoneAddress.mmFaxNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a FAX number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaxNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmFaxNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmailAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification3.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactIdentification3.mmBIC, com.tools20022.repository.msg.ContactIdentification3.mmName,
						com.tools20022.repository.msg.ContactIdentification3.mmNamePrefix, com.tools20022.repository.msg.ContactIdentification3.mmGivenName, com.tools20022.repository.msg.ContactIdentification3.mmRole,
						com.tools20022.repository.msg.ContactIdentification3.mmPhoneNumber, com.tools20022.repository.msg.ContactIdentification3.mmFaxNumber, com.tools20022.repository.msg.ContactIdentification3.mmEmailAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(BaselineAmendmentRequestV03.mmOtherBankContactPerson, BaselineReSubmissionV03.mmOtherBankContactPerson, FullPushThroughReportV03.mmOtherBankContactPerson,
						InitialBaselineSubmissionV03.mmOtherBankContactPerson, BaselineReSubmissionV04.mmOtherBankContactPerson, FullPushThroughReportV04.mmOtherBankContactPerson, BaselineAmendmentRequestV04.mmOtherBankContactPerson,
						InitialBaselineSubmissionV04.mmOtherBankContactPerson, InitialBaselineSubmissionV05.mmOtherBankContactPerson, BaselineAmendmentRequestV05.mmOtherBankContactPerson, FullPushThroughReportV05.mmOtherBankContactPerson,
						BaselineReSubmissionV05.mmOtherBankContactPerson);
				trace_lazy = () -> ContactPersonRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ContactIdentification3";
				definition = "Information needed to contact a physical person.";
			}
		});
		return mmObject_lazy.get();
	}

	public BICIdentifier getBIC() {
		return bIC;
	}

	public ContactIdentification3 setBIC(BICIdentifier bIC) {
		this.bIC = Objects.requireNonNull(bIC);
		return this;
	}

	public Max35Text getName() {
		return name;
	}

	public ContactIdentification3 setName(Max35Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<NamePrefix1Code> getNamePrefix() {
		return namePrefix == null ? Optional.empty() : Optional.of(namePrefix);
	}

	public ContactIdentification3 setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Optional<Max35Text> getGivenName() {
		return givenName == null ? Optional.empty() : Optional.of(givenName);
	}

	public ContactIdentification3 setGivenName(Max35Text givenName) {
		this.givenName = givenName;
		return this;
	}

	public Optional<Max35Text> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public ContactIdentification3 setRole(Max35Text role) {
		this.role = role;
		return this;
	}

	public Optional<PhoneNumber> getPhoneNumber() {
		return phoneNumber == null ? Optional.empty() : Optional.of(phoneNumber);
	}

	public ContactIdentification3 setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Optional<PhoneNumber> getFaxNumber() {
		return faxNumber == null ? Optional.empty() : Optional.of(faxNumber);
	}

	public ContactIdentification3 setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
		return this;
	}

	public Optional<Max256Text> getEmailAddress() {
		return emailAddress == null ? Optional.empty() : Optional.of(emailAddress);
	}

	public ContactIdentification3 setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}
}