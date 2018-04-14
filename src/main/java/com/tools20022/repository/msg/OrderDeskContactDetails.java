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
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount14;
import com.tools20022.repository.msg.Forms;
import com.tools20022.repository.msg.PostalAddress1;
import com.tools20022.repository.msg.ProcessingCharacteristics1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Communication device number or electronic address used for communication.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmName
 * OrderDeskContactDetails.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmPostalAddress
 * OrderDeskContactDetails.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmPhoneNumber
 * OrderDeskContactDetails.mmPhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmFaxNumber
 * OrderDeskContactDetails.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmEmailAddress
 * OrderDeskContactDetails.mmEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmIdentification
 * OrderDeskContactDetails.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmApplicationForms
 * OrderDeskContactDetails.mmApplicationForms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSignatureRequiredInitialSubscription
 * OrderDeskContactDetails.mmSignatureRequiredInitialSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSignatureRequiredSubsequentSubscription
 * OrderDeskContactDetails.mmSignatureRequiredSubsequentSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSignatureRequiredRedemption
 * OrderDeskContactDetails.mmSignatureRequiredRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSubscriptionProcessingCharacteristics
 * OrderDeskContactDetails.mmSubscriptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmRedemptionProcessingCharacteristics
 * OrderDeskContactDetails.mmRedemptionProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSettlementDetails
 * OrderDeskContactDetails.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderDeskContactDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Communication device number or electronic address used for communication."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderDeskContactDetails", propOrder = {"name", "postalAddress", "phoneNumber", "faxNumber", "emailAddress", "identification", "applicationForms", "signatureRequiredInitialSubscription",
		"signatureRequiredSubsequentSubscription", "signatureRequiredRedemption", "subscriptionProcessingCharacteristics", "redemptionProcessingCharacteristics", "settlementDetails"})
public class OrderDeskContactDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm", required = true)
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderDeskContactDetails, Max350Text> mmName = new MMMessageAttribute<OrderDeskContactDetails, Max350Text>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(OrderDeskContactDetails obj) {
			return obj.getName();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Max350Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "PstlAdr", required = true)
	protected PostalAddress1 postalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, PostalAddress1> mmPostalAddress = new MMMessageAssociationEnd<OrderDeskContactDetails, PostalAddress1>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PostalAddress1.mmObject();
		}

		@Override
		public PostalAddress1 getValue(OrderDeskContactDetails obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, PostalAddress1 value) {
			obj.setPostalAddress(value);
		}
	};
	@XmlElement(name = "PhneNb", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhneNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderDeskContactDetails, PhoneNumber> mmPhoneNumber = new MMMessageAttribute<OrderDeskContactDetails, PhoneNumber>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public PhoneNumber getValue(OrderDeskContactDetails obj) {
			return obj.getPhoneNumber();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, PhoneNumber value) {
			obj.setPhoneNumber(value);
		}
	};
	@XmlElement(name = "FaxNb", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaxNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a FAX number, as defined by telecom services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderDeskContactDetails, PhoneNumber> mmFaxNumber = new MMMessageAttribute<OrderDeskContactDetails, PhoneNumber>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmFaxNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public PhoneNumber getValue(OrderDeskContactDetails obj) {
			return obj.getFaxNumber();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, PhoneNumber value) {
			obj.setFaxNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmailAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderDeskContactDetails, Optional<Max256Text>> mmEmailAddress = new MMMessageAttribute<OrderDeskContactDetails, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(OrderDeskContactDetails obj) {
			return obj.getEmailAddress();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Optional<Max256Text> value) {
			obj.setEmailAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Id", required = true)
	protected BICIdentifier identification;
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
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a financial institution, as assigned under a globally recognised or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderDeskContactDetails, BICIdentifier> mmIdentification = new MMMessageAttribute<OrderDeskContactDetails, BICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under a globally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public BICIdentifier getValue(OrderDeskContactDetails obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, BICIdentifier value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "ApplFrms", required = true)
	protected Forms applicationForms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplFrms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationForms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application forms or original signature required by fund order desk."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, Forms> mmApplicationForms = new MMMessageAssociationEnd<OrderDeskContactDetails, Forms>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "ApplFrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationForms";
			definition = "Application forms or original signature required by fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Forms.mmObject();
		}

		@Override
		public Forms getValue(OrderDeskContactDetails obj) {
			return obj.getApplicationForms();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Forms value) {
			obj.setApplicationForms(value);
		}
	};
	@XmlElement(name = "SgntrReqrdInitlSbcpt", required = true)
	protected Forms signatureRequiredInitialSubscription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrReqrdInitlSbcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredInitialSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An original signature is required when completing an initial subscription."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, Forms> mmSignatureRequiredInitialSubscription = new MMMessageAssociationEnd<OrderDeskContactDetails, Forms>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdInitlSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredInitialSubscription";
			definition = "An original signature is required when completing an initial subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Forms.mmObject();
		}

		@Override
		public Forms getValue(OrderDeskContactDetails obj) {
			return obj.getSignatureRequiredInitialSubscription();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Forms value) {
			obj.setSignatureRequiredInitialSubscription(value);
		}
	};
	@XmlElement(name = "SgntrReqrdSbsqntSbcpt", required = true)
	protected Forms signatureRequiredSubsequentSubscription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrReqrdSbsqntSbcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredSubsequentSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate if original signature is required when completing an subsequent subscription."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, Forms> mmSignatureRequiredSubsequentSubscription = new MMMessageAssociationEnd<OrderDeskContactDetails, Forms>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdSbsqntSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredSubsequentSubscription";
			definition = "Indicate if original signature is required when completing an subsequent subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Forms.mmObject();
		}

		@Override
		public Forms getValue(OrderDeskContactDetails obj) {
			return obj.getSignatureRequiredSubsequentSubscription();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Forms value) {
			obj.setSignatureRequiredSubsequentSubscription(value);
		}
	};
	@XmlElement(name = "SgntrReqrdRed", required = true)
	protected Forms signatureRequiredRedemption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Forms Forms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrReqrdRed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An original signature is required when completing redemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, Forms> mmSignatureRequiredRedemption = new MMMessageAssociationEnd<OrderDeskContactDetails, Forms>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdRed";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredRedemption";
			definition = "An original signature is required when completing redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Forms.mmObject();
		}

		@Override
		public Forms getValue(OrderDeskContactDetails obj) {
			return obj.getSignatureRequiredRedemption();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, Forms value) {
			obj.setSignatureRequiredRedemption(value);
		}
	};
	@XmlElement(name = "SbcptPrcgChrtcs", required = true)
	protected ProcessingCharacteristics1 subscriptionProcessingCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPrcgChrtcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subscription processing information applicable to the main fund order desk."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, ProcessingCharacteristics1> mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd<OrderDeskContactDetails, ProcessingCharacteristics1>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Subscription processing information applicable to the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics1.mmObject();
		}

		@Override
		public ProcessingCharacteristics1 getValue(OrderDeskContactDetails obj) {
			return obj.getSubscriptionProcessingCharacteristics();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, ProcessingCharacteristics1 value) {
			obj.setSubscriptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "RedPrcgChrtcs", required = true)
	protected ProcessingCharacteristics1 redemptionProcessingCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1
	 * ProcessingCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrcgChrtcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption processing information applicable to the main fund order desk."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, ProcessingCharacteristics1> mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd<OrderDeskContactDetails, ProcessingCharacteristics1>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Redemption processing information applicable to the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProcessingCharacteristics1.mmObject();
		}

		@Override
		public ProcessingCharacteristics1 getValue(OrderDeskContactDetails obj) {
			return obj.getRedemptionProcessingCharacteristics();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, ProcessingCharacteristics1 value) {
			obj.setRedemptionProcessingCharacteristics(value);
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected List<CashAccount14> settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount14
	 * CashAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement information for the main fund order desk."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderDeskContactDetails, List<CashAccount14>> mmSettlementDetails = new MMMessageAssociationEnd<OrderDeskContactDetails, List<CashAccount14>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Cash settlement information for the main fund order desk.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount14.mmObject();
		}

		@Override
		public List<CashAccount14> getValue(OrderDeskContactDetails obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(OrderDeskContactDetails obj, List<CashAccount14> value) {
			obj.setSettlementDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderDeskContactDetails.mmName, com.tools20022.repository.msg.OrderDeskContactDetails.mmPostalAddress,
						com.tools20022.repository.msg.OrderDeskContactDetails.mmPhoneNumber, com.tools20022.repository.msg.OrderDeskContactDetails.mmFaxNumber, com.tools20022.repository.msg.OrderDeskContactDetails.mmEmailAddress,
						com.tools20022.repository.msg.OrderDeskContactDetails.mmIdentification, com.tools20022.repository.msg.OrderDeskContactDetails.mmApplicationForms,
						com.tools20022.repository.msg.OrderDeskContactDetails.mmSignatureRequiredInitialSubscription, com.tools20022.repository.msg.OrderDeskContactDetails.mmSignatureRequiredSubsequentSubscription,
						com.tools20022.repository.msg.OrderDeskContactDetails.mmSignatureRequiredRedemption, com.tools20022.repository.msg.OrderDeskContactDetails.mmSubscriptionProcessingCharacteristics,
						com.tools20022.repository.msg.OrderDeskContactDetails.mmRedemptionProcessingCharacteristics, com.tools20022.repository.msg.OrderDeskContactDetails.mmSettlementDetails);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderDeskContactDetails";
				definition = "Communication device number or electronic address used for communication.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getName() {
		return name;
	}

	public OrderDeskContactDetails setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public PostalAddress1 getPostalAddress() {
		return postalAddress;
	}

	public OrderDeskContactDetails setPostalAddress(PostalAddress1 postalAddress) {
		this.postalAddress = Objects.requireNonNull(postalAddress);
		return this;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public OrderDeskContactDetails setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = Objects.requireNonNull(phoneNumber);
		return this;
	}

	public PhoneNumber getFaxNumber() {
		return faxNumber;
	}

	public OrderDeskContactDetails setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = Objects.requireNonNull(faxNumber);
		return this;
	}

	public Optional<Max256Text> getEmailAddress() {
		return emailAddress == null ? Optional.empty() : Optional.of(emailAddress);
	}

	public OrderDeskContactDetails setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public BICIdentifier getIdentification() {
		return identification;
	}

	public OrderDeskContactDetails setIdentification(BICIdentifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Forms getApplicationForms() {
		return applicationForms;
	}

	public OrderDeskContactDetails setApplicationForms(Forms applicationForms) {
		this.applicationForms = Objects.requireNonNull(applicationForms);
		return this;
	}

	public Forms getSignatureRequiredInitialSubscription() {
		return signatureRequiredInitialSubscription;
	}

	public OrderDeskContactDetails setSignatureRequiredInitialSubscription(Forms signatureRequiredInitialSubscription) {
		this.signatureRequiredInitialSubscription = Objects.requireNonNull(signatureRequiredInitialSubscription);
		return this;
	}

	public Forms getSignatureRequiredSubsequentSubscription() {
		return signatureRequiredSubsequentSubscription;
	}

	public OrderDeskContactDetails setSignatureRequiredSubsequentSubscription(Forms signatureRequiredSubsequentSubscription) {
		this.signatureRequiredSubsequentSubscription = Objects.requireNonNull(signatureRequiredSubsequentSubscription);
		return this;
	}

	public Forms getSignatureRequiredRedemption() {
		return signatureRequiredRedemption;
	}

	public OrderDeskContactDetails setSignatureRequiredRedemption(Forms signatureRequiredRedemption) {
		this.signatureRequiredRedemption = Objects.requireNonNull(signatureRequiredRedemption);
		return this;
	}

	public ProcessingCharacteristics1 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public OrderDeskContactDetails setSubscriptionProcessingCharacteristics(ProcessingCharacteristics1 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = Objects.requireNonNull(subscriptionProcessingCharacteristics);
		return this;
	}

	public ProcessingCharacteristics1 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public OrderDeskContactDetails setRedemptionProcessingCharacteristics(ProcessingCharacteristics1 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = Objects.requireNonNull(redemptionProcessingCharacteristics);
		return this;
	}

	public List<CashAccount14> getSettlementDetails() {
		return settlementDetails == null ? settlementDetails = new ArrayList<>() : settlementDetails;
	}

	public OrderDeskContactDetails setSettlementDetails(List<CashAccount14> settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}
}