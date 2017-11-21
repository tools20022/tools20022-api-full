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
import com.tools20022.repository.area.tsrv.UndertakingIssuanceV01;
import com.tools20022.repository.choice.UndertakingType1Choice;
import com.tools20022.repository.codeset.ExternalTypeOfParty1Code;
import com.tools20022.repository.codeset.IssuanceType1Code;
import com.tools20022.repository.codeset.UndertakingIssuanceName1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be honoured on the presentation
 * of documents that comply with its terms and conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmIdentification
 * Undertaking3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmName
 * Undertaking3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmType
 * Undertaking3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmIssuanceType
 * Undertaking3.mmIssuanceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmApplicant
 * Undertaking3.mmApplicant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmIssuer
 * Undertaking3.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmBeneficiary
 * Undertaking3.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmDateOfIssuance
 * Undertaking3.mmDateOfIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmPlaceOfIssue
 * Undertaking3.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmAdvisingParty
 * Undertaking3.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmSecondAdvisingParty
 * Undertaking3.mmSecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmUndertakingAmount
 * Undertaking3.mmUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmExpiryDetails
 * Undertaking3.mmExpiryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmConfirmationIndicator
 * Undertaking3.mmConfirmationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmConfirmationPartyType
 * Undertaking3.mmConfirmationPartyType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmAdditionalParty
 * Undertaking3.mmAdditionalParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmGovernanceRulesAndLaw
 * Undertaking3.mmGovernanceRulesAndLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmUnderlyingTransaction
 * Undertaking3.mmUnderlyingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPresentationDetails
 * Undertaking3.mmPresentationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmUndertakingTermsAndConditions
 * Undertaking3.mmUndertakingTermsAndConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmMultipleDemandIndicator
 * Undertaking3.mmMultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPartialDemandIndicator
 * Undertaking3.mmPartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmConfirmationChargesPayableBy
 * Undertaking3.mmConfirmationChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmTransferChargesPayableBy
 * Undertaking3.mmTransferChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmAutomaticAmountVariation
 * Undertaking3.mmAutomaticAmountVariation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmDeliveryChannel
 * Undertaking3.mmDeliveryChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmTransferIndicator
 * Undertaking3.mmTransferIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmEnclosedFile
 * Undertaking3.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmAdditionalInformation
 * Undertaking3.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmRequestedLocalUndertaking
 * Undertaking3.mmRequestedLocalUndertaking}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmUndertakingIssuanceDetails
 * UndertakingIssuanceV01.mmUndertakingIssuanceDetails}</li>
 * </ul>
 * </li>
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
 * "Undertaking3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Undertaking3", propOrder = {"identification", "name", "type", "issuanceType", "applicant", "issuer", "beneficiary", "dateOfIssuance", "placeOfIssue", "advisingParty", "secondAdvisingParty", "undertakingAmount",
		"expiryDetails", "confirmationIndicator", "confirmationPartyType", "additionalParty", "governanceRulesAndLaw", "underlyingTransaction", "presentationDetails", "undertakingTermsAndConditions", "multipleDemandIndicator",
		"partialDemandIndicator", "confirmationChargesPayableBy", "transferChargesPayableBy", "automaticAmountVariation", "deliveryChannel", "transferIndicator", "enclosedFile", "additionalInformation", "requestedLocalUndertaking"})
public class Undertaking3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identifier assigned by the issuer to the
	 * undertaking, for example the guarantee or standby number.
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
	 * Undertaking.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	 * "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmIdentification;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected UndertakingIssuanceName1Code name;
	/**
	 * Name of undertaking such as, demand guarantee, standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code
	 * UndertakingIssuanceName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingName
	 * Undertaking.mmUndertakingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	 * "Name of undertaking such as, demand guarantee, standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingIssuanceName1Code.mmObject();
		}
	};
	protected UndertakingType1Choice type;
	/**
	 * Type of undertaking, for example, performance, payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UndertakingType1Choice
	 * UndertakingType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmType
	 * Undertaking.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of undertaking, for example, performance, payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmType;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of undertaking, for example, performance, payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UndertakingType1Choice.mmObject();
		}
	};
	protected IssuanceType1Code issuanceType;
	/**
	 * Type of the undertaking issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IssuanceType1Code
	 * IssuanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the undertaking issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuanceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "IssncTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceType";
			definition = "Type of the undertaking issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IssuanceType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification43> applicant;
	/**
	 * Party named in the undertaking as the “applicant”.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingApplicant
	 * UndertakingApplicant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Applcnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Applicant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party named in the undertaking as the “applicant”."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingApplicant.mmObject();
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party named in the undertaking as the “applicant”.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 issuer;
	/**
	 * Party that issues the undertaking (or counter-undertaking).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingIssuer
	 * UndertakingIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	 * definition} =
	 * "Party that issues the undertaking (or counter-undertaking). "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingIssuer.mmObject();
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issues the undertaking (or counter-undertaking). ";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification43> beneficiary;
	/**
	 * Party in whose favour the undertaking (or counter-undertaking) is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingBeneficiary
	 * UndertakingBeneficiary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in whose favour the undertaking (or counter-undertaking) is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Party in whose favour the undertaking (or counter-undertaking) is issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected ISODate dateOfIssuance;
	/**
	 * Date on which the undertaking is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfIssnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the undertaking is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateOfIssuance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuance";
			definition = "Date on which the undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PostalAddress12 placeOfIssue;
	/**
	 * Location which is to be regarded as the place from which the undertaking
	 * is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress12
	 * PostalAddress12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
	 * Document.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location which is to be regarded as the place from which the undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfIssue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfIssue;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssue";
			definition = "Location which is to be regarded as the place from which the undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress12.mmObject();
		}
	};
	protected PartyIdentification43 advisingParty;
	/**
	 * Party asked to advise the undertaking to the beneficiary or to another
	 * advising party at the request of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party asked to advise the undertaking to the beneficiary or to another advising party at the request of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdvisingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the undertaking to the beneficiary or to another advising party at the request of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 secondAdvisingParty;
	/**
	 * Additional party asked to advise the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAdvisingParty
	 * UndertakingAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional party asked to advise the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondAdvisingParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party asked to advise the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected UndertakingAmount1 undertakingAmount;
	/**
	 * Details related to the amount of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UndertakingAmount1
	 * UndertakingAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the amount of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmount";
			definition = "Details related to the amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingAmount1.mmObject();
		}
	};
	protected ExpiryDetails1 expiryDetails;
	/**
	 * Details related to the expiry of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExpiryDetails1
	 * ExpiryDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the expiry of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpiryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpiryDetails1.mmObject();
		}
	};
	protected YesNoIndicator confirmationIndicator;
	/**
	 * Indicates whether or not the advising bank (confirmer) is requested to
	 * add its confirmation to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmConfirmationIndicator
	 * Undertaking.mmConfirmationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the advising bank (confirmer) is requested to add its confirmation to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmConfirmationIndicator;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ConfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether or not the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ExternalTypeOfParty1Code confirmationPartyType;
	/**
	 * Indicates the type of party requested to add its confirmation to the
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfParty1Code
	 * ExternalTypeOfParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingConfirmer
	 * UndertakingConfirmer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfPtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationPartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of party requested to add its confirmation to the undertaking. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationPartyType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> UndertakingConfirmer.mmObject();
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ConfPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationPartyType";
			definition = "Indicates the type of party requested to add its confirmation to the undertaking. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyAndType1> additionalParty;
	/**
	 * Party, in addition to the other parties specified in the undertaking,
	 * that is also related to the undertaking .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyAndType1
	 * PartyAndType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPartyRole
	 * Undertaking.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking . "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartyRole;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AddtlPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParty";
			definition = "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking . ";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyAndType1.mmObject();
		}
	};
	protected GovernanceRules1 governanceRulesAndLaw;
	/**
	 * Rules and laws governing the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GovernanceRules1
	 * GovernanceRules1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmGovernanceRules
	 * ModelForm.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovncRulesAndLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernanceRulesAndLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGovernanceRulesAndLaw = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmGovernanceRules;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "GovncRulesAndLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernanceRulesAndLaw";
			definition = "Rules and laws governing the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GovernanceRules1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnderlyingTradeTransaction1> underlyingTransaction;
	/**
	 * Details of the underlying transaction for which the undertaking is
	 * issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUnderlyingTransaction
	 * Undertaking.mmUnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the underlying transaction for which the undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingTransaction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUnderlyingTransaction;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Details of the underlying transaction for which the undertaking is issued.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
		}
	};
	protected Presentation1 presentationDetails;
	/**
	 * Presentation details related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Presentation1
	 * Presentation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
	 * Undertaking.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation details related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPresentationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPresentation;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PresntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationDetails";
			definition = "Presentation details related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Presentation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Narrative1> undertakingTermsAndConditions;
	/**
	 * Terms and conditions of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Narrative1 Narrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgTermsAndConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terms and conditions of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingTermsAndConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingTermsAndConditions";
			definition = "Terms and conditions of the undertaking.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Narrative1.mmObject();
		}
	};
	protected YesNoIndicator multipleDemandIndicator;
	/**
	 * Indicates that multiple demands are not permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmMultipleDemandIndicator
	 * Undertaking.mmMultipleDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplDmndInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that multiple demands are not permitted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultipleDemandIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmMultipleDemandIndicator;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "MltplDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates that multiple demands are not permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator partialDemandIndicator;
	/**
	 * Indicates that partial demands/drawings are not permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPartialDemandIndicator
	 * Undertaking.mmPartialDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlDmndInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that partial demands/drawings are not permitted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialDemandIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartialDemandIndicator;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PrtlDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates that partial demands/drawings are not permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ExternalTypeOfParty1Code confirmationChargesPayableBy;
	/**
	 * Indicates whether the applicant/obligor or beneficiary is responsible for
	 * payment of the confirmation charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfParty1Code
	 * ExternalTypeOfParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmRelatedChargesPayableBy
	 * Undertaking.mmRelatedChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfChrgsPyblBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationChargesPayableBy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ConfChrgsPyblBy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}
	};
	protected ExternalTypeOfParty1Code transferChargesPayableBy;
	/**
	 * Indicates whether the applicant/obligor or beneficiary is responsible for
	 * payment of the transfer charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfParty1Code
	 * ExternalTypeOfParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmRelatedChargesPayableBy
	 * Undertaking.mmRelatedChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfChrgsPyblBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the transfer charges. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferChargesPayableBy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "TrfChrgsPyblBy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the transfer charges. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AutomaticVariation1> automaticAmountVariation;
	/**
	 * Details related to a variation in amount that is automatically applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AutomaticVariation1
	 * AutomaticVariation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
	 * Undertaking.mmPredefinedVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcAmtVartn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticAmountVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to a variation in amount that is automatically applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAutomaticAmountVariation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPredefinedVariation;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AutomtcAmtVartn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticAmountVariation";
			definition = "Details related to a variation in amount that is automatically applied.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AutomaticVariation1.mmObject();
		}
	};
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * Details of the communication channel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the communication channel."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryChannel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details of the communication channel.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationChannel1.mmObject();
		}
	};
	protected YesNoIndicator transferIndicator;
	/**
	 * Indicates whether the undertaking is transferable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmTransferIndicator
	 * Undertaking.mmTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking is transferable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmTransferIndicator;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "TrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
	/**
	 * Document or template enclosed in the undertaking directly related to the
	 * issued undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document9 Document9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
	 * Undertaking.mmSpecifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document or template enclosed in the undertaking directly related to the issued undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the undertaking directly related to the issued undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
		}
	};
	protected List<Max2000Text> additionalInformation;
	/**
	 * Additional information related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected Undertaking4 requestedLocalUndertaking;
	/**
	 * Details of the local or ancillary undertaking requested to be issued by a
	 * local or other issuing institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking4
	 * Undertaking4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdLclUdrtkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedLocalUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the local or ancillary undertaking requested to be issued by a local or other issuing institution. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestedLocalUndertaking = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ReqdLclUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedLocalUndertaking";
			definition = "Details of the local or ancillary undertaking requested to be issued by a local or other issuing institution. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Undertaking3.mmIdentification, Undertaking3.mmName, Undertaking3.mmType, Undertaking3.mmIssuanceType, Undertaking3.mmApplicant, Undertaking3.mmIssuer, Undertaking3.mmBeneficiary,
						Undertaking3.mmDateOfIssuance, Undertaking3.mmPlaceOfIssue, Undertaking3.mmAdvisingParty, Undertaking3.mmSecondAdvisingParty, Undertaking3.mmUndertakingAmount, Undertaking3.mmExpiryDetails,
						Undertaking3.mmConfirmationIndicator, Undertaking3.mmConfirmationPartyType, Undertaking3.mmAdditionalParty, Undertaking3.mmGovernanceRulesAndLaw, Undertaking3.mmUnderlyingTransaction,
						Undertaking3.mmPresentationDetails, Undertaking3.mmUndertakingTermsAndConditions, Undertaking3.mmMultipleDemandIndicator, Undertaking3.mmPartialDemandIndicator, Undertaking3.mmConfirmationChargesPayableBy,
						Undertaking3.mmTransferChargesPayableBy, Undertaking3.mmAutomaticAmountVariation, Undertaking3.mmDeliveryChannel, Undertaking3.mmTransferIndicator, Undertaking3.mmEnclosedFile, Undertaking3.mmAdditionalInformation,
						Undertaking3.mmRequestedLocalUndertaking);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingIssuanceV01.mmUndertakingIssuanceDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking3";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Nm", required = true)
	public UndertakingIssuanceName1Code getName() {
		return name;
	}

	public void setName(UndertakingIssuanceName1Code name) {
		this.name = name;
	}

	@XmlElement(name = "Tp")
	public UndertakingType1Choice getType() {
		return type;
	}

	public void setType(UndertakingType1Choice type) {
		this.type = type;
	}

	@XmlElement(name = "IssncTp", required = true)
	public IssuanceType1Code getIssuanceType() {
		return issuanceType;
	}

	public void setIssuanceType(IssuanceType1Code issuanceType) {
		this.issuanceType = issuanceType;
	}

	@XmlElement(name = "Applcnt")
	public List<PartyIdentification43> getApplicant() {
		return applicant;
	}

	public void setApplicant(List<com.tools20022.repository.msg.PartyIdentification43> applicant) {
		this.applicant = applicant;
	}

	@XmlElement(name = "Issr", required = true)
	public PartyIdentification43 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.PartyIdentification43 issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "Bnfcry", required = true)
	public List<PartyIdentification43> getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(List<com.tools20022.repository.msg.PartyIdentification43> beneficiary) {
		this.beneficiary = beneficiary;
	}

	@XmlElement(name = "DtOfIssnc", required = true)
	public ISODate getDateOfIssuance() {
		return dateOfIssuance;
	}

	public void setDateOfIssuance(ISODate dateOfIssuance) {
		this.dateOfIssuance = dateOfIssuance;
	}

	@XmlElement(name = "PlcOfIsse")
	public PostalAddress12 getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(com.tools20022.repository.msg.PostalAddress12 placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	@XmlElement(name = "AdvsgPty")
	public PartyIdentification43 getAdvisingParty() {
		return advisingParty;
	}

	public void setAdvisingParty(com.tools20022.repository.msg.PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
	}

	@XmlElement(name = "ScndAdvsgPty")
	public PartyIdentification43 getSecondAdvisingParty() {
		return secondAdvisingParty;
	}

	public void setSecondAdvisingParty(com.tools20022.repository.msg.PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
	}

	@XmlElement(name = "UdrtkgAmt", required = true)
	public UndertakingAmount1 getUndertakingAmount() {
		return undertakingAmount;
	}

	public void setUndertakingAmount(com.tools20022.repository.msg.UndertakingAmount1 undertakingAmount) {
		this.undertakingAmount = undertakingAmount;
	}

	@XmlElement(name = "XpryDtls", required = true)
	public ExpiryDetails1 getExpiryDetails() {
		return expiryDetails;
	}

	public void setExpiryDetails(com.tools20022.repository.msg.ExpiryDetails1 expiryDetails) {
		this.expiryDetails = expiryDetails;
	}

	@XmlElement(name = "ConfInd")
	public YesNoIndicator getConfirmationIndicator() {
		return confirmationIndicator;
	}

	public void setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
	}

	@XmlElement(name = "ConfPtyTp")
	public ExternalTypeOfParty1Code getConfirmationPartyType() {
		return confirmationPartyType;
	}

	public void setConfirmationPartyType(ExternalTypeOfParty1Code confirmationPartyType) {
		this.confirmationPartyType = confirmationPartyType;
	}

	@XmlElement(name = "AddtlPty")
	public List<PartyAndType1> getAdditionalParty() {
		return additionalParty;
	}

	public void setAdditionalParty(List<com.tools20022.repository.msg.PartyAndType1> additionalParty) {
		this.additionalParty = additionalParty;
	}

	@XmlElement(name = "GovncRulesAndLaw", required = true)
	public GovernanceRules1 getGovernanceRulesAndLaw() {
		return governanceRulesAndLaw;
	}

	public void setGovernanceRulesAndLaw(com.tools20022.repository.msg.GovernanceRules1 governanceRulesAndLaw) {
		this.governanceRulesAndLaw = governanceRulesAndLaw;
	}

	@XmlElement(name = "UndrlygTx")
	public List<UnderlyingTradeTransaction1> getUnderlyingTransaction() {
		return underlyingTransaction;
	}

	public void setUnderlyingTransaction(List<com.tools20022.repository.msg.UnderlyingTradeTransaction1> underlyingTransaction) {
		this.underlyingTransaction = underlyingTransaction;
	}

	@XmlElement(name = "PresntnDtls")
	public Presentation1 getPresentationDetails() {
		return presentationDetails;
	}

	public void setPresentationDetails(com.tools20022.repository.msg.Presentation1 presentationDetails) {
		this.presentationDetails = presentationDetails;
	}

	@XmlElement(name = "UdrtkgTermsAndConds", required = true)
	public List<Narrative1> getUndertakingTermsAndConditions() {
		return undertakingTermsAndConditions;
	}

	public void setUndertakingTermsAndConditions(List<com.tools20022.repository.msg.Narrative1> undertakingTermsAndConditions) {
		this.undertakingTermsAndConditions = undertakingTermsAndConditions;
	}

	@XmlElement(name = "MltplDmndInd")
	public YesNoIndicator getMultipleDemandIndicator() {
		return multipleDemandIndicator;
	}

	public void setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = multipleDemandIndicator;
	}

	@XmlElement(name = "PrtlDmndInd")
	public YesNoIndicator getPartialDemandIndicator() {
		return partialDemandIndicator;
	}

	public void setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = partialDemandIndicator;
	}

	@XmlElement(name = "ConfChrgsPyblBy")
	public ExternalTypeOfParty1Code getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy;
	}

	public void setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
	}

	@XmlElement(name = "TrfChrgsPyblBy")
	public ExternalTypeOfParty1Code getTransferChargesPayableBy() {
		return transferChargesPayableBy;
	}

	public void setTransferChargesPayableBy(ExternalTypeOfParty1Code transferChargesPayableBy) {
		this.transferChargesPayableBy = transferChargesPayableBy;
	}

	@XmlElement(name = "AutomtcAmtVartn")
	public List<AutomaticVariation1> getAutomaticAmountVariation() {
		return automaticAmountVariation;
	}

	public void setAutomaticAmountVariation(List<com.tools20022.repository.msg.AutomaticVariation1> automaticAmountVariation) {
		this.automaticAmountVariation = automaticAmountVariation;
	}

	@XmlElement(name = "DlvryChanl")
	public CommunicationChannel1 getDeliveryChannel() {
		return deliveryChannel;
	}

	public void setDeliveryChannel(com.tools20022.repository.msg.CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
	}

	@XmlElement(name = "TrfInd")
	public YesNoIndicator getTransferIndicator() {
		return transferIndicator;
	}

	public void setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
	}

	@XmlElement(name = "NclsdFile")
	public List<Document9> getEnclosedFile() {
		return enclosedFile;
	}

	public void setEnclosedFile(List<com.tools20022.repository.msg.Document9> enclosedFile) {
		this.enclosedFile = enclosedFile;
	}

	@XmlElement(name = "AddtlInf")
	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "ReqdLclUdrtkg")
	public Undertaking4 getRequestedLocalUndertaking() {
		return requestedLocalUndertaking;
	}

	public void setRequestedLocalUndertaking(com.tools20022.repository.msg.Undertaking4 requestedLocalUndertaking) {
		this.requestedLocalUndertaking = requestedLocalUndertaking;
	}
}