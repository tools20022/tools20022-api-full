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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderDeskContactDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Communication device number or electronic address used for communication."</li>
 * </ul>
 */
public class OrderDeskContactDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
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
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PostalAddress1 postalAddress;
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	protected PhoneNumber phoneNumber;
	/**
	 * Collection of information that identifies a phone number, as defined by
	 * telecom services.
	 * <p>
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
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected PhoneNumber faxNumber;
	/**
	 * Collection of information that identifies a FAX number, as defined by
	 * telecom services.
	 * <p>
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
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhoneNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails
	 * OrderDeskContactDetails}</li>
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
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
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
	protected BICIdentifier identification;
	/**
	 * Unique and unambiguous identification of a financial institution, as
	 * assigned under a globally recognised or proprietary identification
	 * scheme.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a financial institution, as assigned under a globally recognised or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under a globally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected Forms applicationForms;
	/**
	 * Application forms or original signature required by fund order desk.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationForms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application forms or original signature required by fund order desk."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicationForms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "ApplFrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationForms";
			definition = "Application forms or original signature required by fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	protected Forms signatureRequiredInitialSubscription;
	/**
	 * An original signature is required when completing an initial
	 * subscription.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredInitialSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An original signature is required when completing an initial subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignatureRequiredInitialSubscription = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdInitlSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredInitialSubscription";
			definition = "An original signature is required when completing an initial subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	protected Forms signatureRequiredSubsequentSubscription;
	/**
	 * Indicate if original signature is required when completing an subsequent
	 * subscription.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredSubsequentSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate if original signature is required when completing an subsequent subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignatureRequiredSubsequentSubscription = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdSbsqntSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredSubsequentSubscription";
			definition = "Indicate if original signature is required when completing an subsequent subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	protected Forms signatureRequiredRedemption;
	/**
	 * An original signature is required when completing redemption.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequiredRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An original signature is required when completing redemption."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignatureRequiredRedemption = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SgntrReqrdRed";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRequiredRedemption";
			definition = "An original signature is required when completing redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Forms.mmObject();
		}
	};
	protected ProcessingCharacteristics1 subscriptionProcessingCharacteristics;
	/**
	 * Subscription processing information applicable to the main fund order
	 * desk.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subscription processing information applicable to the main fund order desk."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SbcptPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionProcessingCharacteristics";
			definition = "Subscription processing information applicable to the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics1.mmObject();
		}
	};
	protected ProcessingCharacteristics1 redemptionProcessingCharacteristics;
	/**
	 * Redemption processing information applicable to the main fund order desk.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption processing information applicable to the main fund order desk."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionProcessingCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmInvestmentFundClassProcessing;
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "RedPrcgChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionProcessingCharacteristics";
			definition = "Redemption processing information applicable to the main fund order desk.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessingCharacteristics1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashAccount14> settlementDetails;
	/**
	 * Cash settlement information for the main fund order desk.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement information for the main fund order desk."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> OrderDeskContactDetails.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Cash settlement information for the main fund order desk.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OrderDeskContactDetails.mmName, OrderDeskContactDetails.mmPostalAddress, OrderDeskContactDetails.mmPhoneNumber, OrderDeskContactDetails.mmFaxNumber,
						OrderDeskContactDetails.mmEmailAddress, OrderDeskContactDetails.mmIdentification, OrderDeskContactDetails.mmApplicationForms, OrderDeskContactDetails.mmSignatureRequiredInitialSubscription,
						OrderDeskContactDetails.mmSignatureRequiredSubsequentSubscription, OrderDeskContactDetails.mmSignatureRequiredRedemption, OrderDeskContactDetails.mmSubscriptionProcessingCharacteristics,
						OrderDeskContactDetails.mmRedemptionProcessingCharacteristics, OrderDeskContactDetails.mmSettlementDetails);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setName(Max350Text name) {
		this.name = name;
	}

	public PostalAddress1 getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(com.tools20022.repository.msg.PostalAddress1 postalAddress) {
		this.postalAddress = postalAddress;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
	}

	public BICIdentifier getIdentification() {
		return identification;
	}

	public void setIdentification(BICIdentifier identification) {
		this.identification = identification;
	}

	public Forms getApplicationForms() {
		return applicationForms;
	}

	public void setApplicationForms(com.tools20022.repository.msg.Forms applicationForms) {
		this.applicationForms = applicationForms;
	}

	public Forms getSignatureRequiredInitialSubscription() {
		return signatureRequiredInitialSubscription;
	}

	public void setSignatureRequiredInitialSubscription(com.tools20022.repository.msg.Forms signatureRequiredInitialSubscription) {
		this.signatureRequiredInitialSubscription = signatureRequiredInitialSubscription;
	}

	public Forms getSignatureRequiredSubsequentSubscription() {
		return signatureRequiredSubsequentSubscription;
	}

	public void setSignatureRequiredSubsequentSubscription(com.tools20022.repository.msg.Forms signatureRequiredSubsequentSubscription) {
		this.signatureRequiredSubsequentSubscription = signatureRequiredSubsequentSubscription;
	}

	public Forms getSignatureRequiredRedemption() {
		return signatureRequiredRedemption;
	}

	public void setSignatureRequiredRedemption(com.tools20022.repository.msg.Forms signatureRequiredRedemption) {
		this.signatureRequiredRedemption = signatureRequiredRedemption;
	}

	public ProcessingCharacteristics1 getSubscriptionProcessingCharacteristics() {
		return subscriptionProcessingCharacteristics;
	}

	public void setSubscriptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics1 subscriptionProcessingCharacteristics) {
		this.subscriptionProcessingCharacteristics = subscriptionProcessingCharacteristics;
	}

	public ProcessingCharacteristics1 getRedemptionProcessingCharacteristics() {
		return redemptionProcessingCharacteristics;
	}

	public void setRedemptionProcessingCharacteristics(com.tools20022.repository.msg.ProcessingCharacteristics1 redemptionProcessingCharacteristics) {
		this.redemptionProcessingCharacteristics = redemptionProcessingCharacteristics;
	}

	public List<CashAccount14> getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(List<com.tools20022.repository.msg.CashAccount14> settlementDetails) {
		this.settlementDetails = settlementDetails;
	}
}