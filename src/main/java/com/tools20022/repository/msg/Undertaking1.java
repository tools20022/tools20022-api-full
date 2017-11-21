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
import com.tools20022.repository.area.tsin.UndertakingApplicationV01;
import com.tools20022.repository.choice.UndertakingType1Choice;
import com.tools20022.repository.codeset.ExternalTypeOfParty1Code;
import com.tools20022.repository.codeset.UndertakingName1Code;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max350Text;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmApplicantReferenceNumber
 * Undertaking1.mmApplicantReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmPurpose
 * Undertaking1.mmPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmName
 * Undertaking1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmType
 * Undertaking1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmObligor
 * Undertaking1.mmObligor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmApplicant
 * Undertaking1.mmApplicant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmIssuer
 * Undertaking1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmBeneficiary
 * Undertaking1.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmAdvisingParty
 * Undertaking1.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmSecondAdvisingParty
 * Undertaking1.mmSecondAdvisingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmConfirmer
 * Undertaking1.mmConfirmer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmConfirmationIndicator
 * Undertaking1.mmConfirmationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmCounterUndertakingIndicator
 * Undertaking1.mmCounterUndertakingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmCounterUndertaking
 * Undertaking1.mmCounterUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUndertakingAmount
 * Undertaking1.mmUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmExpiryDetails
 * Undertaking1.mmExpiryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmAdditionalParty
 * Undertaking1.mmAdditionalParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmGovernanceRulesAndLaw
 * Undertaking1.mmGovernanceRulesAndLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUnderlyingTransaction
 * Undertaking1.mmUnderlyingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmPresentationDetails
 * Undertaking1.mmPresentationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUndertakingWording
 * Undertaking1.mmUndertakingWording}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmMultipleDemandIndicator
 * Undertaking1.mmMultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmPartialDemandIndicator
 * Undertaking1.mmPartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmTransferIndicator
 * Undertaking1.mmTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmTransferChargesPayableBy
 * Undertaking1.mmTransferChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmConfirmationChargesPayableBy
 * Undertaking1.mmConfirmationChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmAutomaticAmountVariation
 * Undertaking1.mmAutomaticAmountVariation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmDeliveryChannel
 * Undertaking1.mmDeliveryChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorLiabilityAccount
 * Undertaking1.mmObligorLiabilityAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorChargeAccount
 * Undertaking1.mmObligorChargeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorSettlementAccount
 * Undertaking1.mmObligorSettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmEnclosedFile
 * Undertaking1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmAdditionalApplicationInformation
 * Undertaking1.mmAdditionalApplicationInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01#mmUndertakingApplicationDetails
 * UndertakingApplicationV01.mmUndertakingApplicationDetails}</li>
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
 * "Undertaking1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Undertaking1", propOrder = {"applicantReferenceNumber", "purpose", "name", "type", "obligor", "applicant", "issuer", "beneficiary", "advisingParty", "secondAdvisingParty", "confirmer", "confirmationIndicator",
		"counterUndertakingIndicator", "counterUndertaking", "undertakingAmount", "expiryDetails", "additionalParty", "governanceRulesAndLaw", "underlyingTransaction", "presentationDetails", "undertakingWording", "multipleDemandIndicator",
		"partialDemandIndicator", "transferIndicator", "transferChargesPayableBy", "confirmationChargesPayableBy", "automaticAmountVariation", "deliveryChannel", "obligorLiabilityAccount", "obligorChargeAccount",
		"obligorSettlementAccount", "enclosedFile", "additionalApplicationInformation"})
public class Undertaking1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text applicantReferenceNumber;
	/**
	 * Unique and unambiguous identifier assigned by the applicant to the
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicantReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ApplcntRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text purpose;
	/**
	 * Brief description of the purpose of the undertaking. Provided as
	 * information for the issuer reference.
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPurpose
	 * Undertaking.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brief description of the purpose of the undertaking. Provided as information for the issuer reference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPurpose;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Brief description of the purpose of the undertaking. Provided as information for the issuer reference.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected UndertakingName1Code name;
	/**
	 * Undertaking name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingName1Code
	 * UndertakingName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingName
	 * Undertaking.mmUndertakingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} = "Undertaking name."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Undertaking name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingName1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of undertaking, for example, performance, payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingType1Choice.mmObject();
		}
	};
	protected PartyIdentification43 obligor;
	/**
	 * Party obligated to reimburse the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party obligated to reimburse the issuer. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmObligor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingUltimateObligor.mmObject();
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Oblgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligor";
			definition = "Party obligated to reimburse the issuer. ";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification43> applicant;
	/**
	 * Party to be named in the undertaking as the “applicant” when different
	 * from the obligor.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} =
	 * "Party to be named in the undertaking as the “applicant” when different from the obligor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingApplicant.mmObject();
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party to be named in the undertaking as the “applicant” when different from the obligor.";
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	 * Ultimate party in whose favour the undertaking is to be issued.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * "Ultimate party in whose favour the undertaking is to be issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party in whose favour the undertaking is to be issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 advisingParty;
	/**
	 * Party asked to advise the undertaking to the beneficiary or to another
	 * advising party.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * "Party asked to advise the undertaking to the beneficiary or to another advising party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdvisingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the undertaking to the beneficiary or to another advising party.";
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	protected PartyIdentification43 confirmer;
	/**
	 * Party that adds its confirmation to the undertaking. For further
	 * clarification, reference the applicable rules to which the undertaking is
	 * subject.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingConfirmer
	 * UndertakingConfirmer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnfrmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that adds its confirmation to the undertaking. For further clarification, reference the applicable rules to which the undertaking is subject."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConfirmer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingConfirmer.mmObject();
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Cnfrmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmer";
			definition = "Party that adds its confirmation to the undertaking. For further clarification, reference the applicable rules to which the undertaking is subject.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected YesNoIndicator confirmationIndicator;
	/**
	 * Indicates whether the advising bank (confirmer) is requested to add its
	 * confirmation to the undertaking. The absence of this element indicates
	 * that the advising bank (confirmer) is not requested to add its
	 * confirmation to the undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking. The absence of this element indicates that the advising bank (confirmer) is not requested to add its confirmation to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmConfirmationIndicator;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ConfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking. The absence of this element indicates that the advising bank (confirmer) is not requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator counterUndertakingIndicator;
	/**
	 * Indicates whether the undertaking is a local or ancillary undertaking to
	 * be issued under a counter-undertaking.
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmCounterUndertakingIndicator
	 * Undertaking.mmCounterUndertakingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrUdrtkgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the undertaking is a local or ancillary undertaking to be issued under a counter-undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterUndertakingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmCounterUndertakingIndicator;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a local or ancillary undertaking to be issued under a counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Undertaking2 counterUndertaking;
	/**
	 * Details related to the counter undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking2
	 * Undertaking2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrUdrtkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the counter undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterUndertaking = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertaking";
			definition = "Details related to the counter undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	protected ExpiryDetails2 expiryDetails;
	/**
	 * Details related to the expiry terms of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExpiryDetails2
	 * ExpiryDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} = "Details related to the expiry terms of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpiryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry terms of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpiryDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyAndType1> additionalParty;
	/**
	 * Party, in addition to the other parties specified in the undertaking,
	 * that is also related to the undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartyRole;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AddtlPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParty";
			definition = "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking. ";
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	protected Presentation4 presentationDetails;
	/**
	 * Presentation details related to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Presentation4
	 * Presentation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
	 * Undertaking.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "PresntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationDetails";
			definition = "Presentation details related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Presentation4.mmObject();
		}
	};
	protected UndertakingWording1 undertakingWording;
	/**
	 * Wording details and text for the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UndertakingWording1
	 * UndertakingWording1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmModelForm
	 * Undertaking.mmModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgWrdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingWording"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wording details and text for the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingWording = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmModelForm;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgWrdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingWording";
			definition = "Wording details and text for the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingWording1.mmObject();
		}
	};
	protected YesNoIndicator multipleDemandIndicator;
	/**
	 * Indicates whether multiple demands are permitted.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} = "Indicates whether multiple demands are permitted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultipleDemandIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmMultipleDemandIndicator;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "MltplDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator partialDemandIndicator;
	/**
	 * Indicates whether partial demands/drawings are permitted.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} = "Indicates whether partial demands/drawings are permitted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialDemandIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartialDemandIndicator;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "PrtlDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * definition} = "Indicates whether the undertaking is transferable. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmTransferIndicator;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "TrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferable. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details of the communication channel.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationChannel1.mmObject();
		}
	};
	protected CashAccount28 obligorLiabilityAccount;
	/**
	 * Account nominated by the obligor to record the liability amount of the
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount28
	 * CashAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
	 * UndertakingUltimateObligor.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrLbltyAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorLiabilityAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor to record the liability amount of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmObligorLiabilityAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrLbltyAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorLiabilityAccount";
			definition = "Account nominated by the obligor to record the liability amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount28.mmObject();
		}
	};
	protected CashAccount28 obligorChargeAccount;
	/**
	 * Account nominated by the obligor for the settlement of charges related to
	 * the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount28
	 * CashAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
	 * UndertakingUltimateObligor.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrChrgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorChargeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor for the settlement of charges related to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmObligorChargeAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrChrgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorChargeAccount";
			definition = "Account nominated by the obligor for the settlement of charges related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount28.mmObject();
		}
	};
	protected CashAccount28 obligorSettlementAccount;
	/**
	 * Account nominated by the obligor for the settlement of the amount claimed
	 * under the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount28
	 * CashAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
	 * UndertakingUltimateObligor.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrSttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor for the settlement of the amount claimed under the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmObligorSettlementAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrSttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorSettlementAccount";
			definition = "Account nominated by the obligor for the settlement of the amount claimed under the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount28.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
	/**
	 * Document or template enclosed in the undertaking directly related to the
	 * undertaking to be issued.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
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
	 * "Document or template enclosed in the undertaking directly related to the undertaking to be issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the undertaking directly related to the undertaking to be issued.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
		}
	};
	protected List<Max2000Text> additionalApplicationInformation;
	/**
	 * Additional information related to the application for an undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlApplInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalApplicationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the application for an undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalApplicationInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AddtlApplInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalApplicationInformation";
			definition = "Additional information related to the application for an undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Undertaking1.mmApplicantReferenceNumber, Undertaking1.mmPurpose, Undertaking1.mmName, Undertaking1.mmType, Undertaking1.mmObligor, Undertaking1.mmApplicant, Undertaking1.mmIssuer,
						Undertaking1.mmBeneficiary, Undertaking1.mmAdvisingParty, Undertaking1.mmSecondAdvisingParty, Undertaking1.mmConfirmer, Undertaking1.mmConfirmationIndicator, Undertaking1.mmCounterUndertakingIndicator,
						Undertaking1.mmCounterUndertaking, Undertaking1.mmUndertakingAmount, Undertaking1.mmExpiryDetails, Undertaking1.mmAdditionalParty, Undertaking1.mmGovernanceRulesAndLaw, Undertaking1.mmUnderlyingTransaction,
						Undertaking1.mmPresentationDetails, Undertaking1.mmUndertakingWording, Undertaking1.mmMultipleDemandIndicator, Undertaking1.mmPartialDemandIndicator, Undertaking1.mmTransferIndicator,
						Undertaking1.mmTransferChargesPayableBy, Undertaking1.mmConfirmationChargesPayableBy, Undertaking1.mmAutomaticAmountVariation, Undertaking1.mmDeliveryChannel, Undertaking1.mmObligorLiabilityAccount,
						Undertaking1.mmObligorChargeAccount, Undertaking1.mmObligorSettlementAccount, Undertaking1.mmEnclosedFile, Undertaking1.mmAdditionalApplicationInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingApplicationV01.mmUndertakingApplicationDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking1";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ApplcntRefNb", required = true)
	public Max35Text getApplicantReferenceNumber() {
		return applicantReferenceNumber;
	}

	public void setApplicantReferenceNumber(Max35Text applicantReferenceNumber) {
		this.applicantReferenceNumber = applicantReferenceNumber;
	}

	@XmlElement(name = "Purp", required = true)
	public Max350Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max350Text purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "Nm", required = true)
	public UndertakingName1Code getName() {
		return name;
	}

	public void setName(UndertakingName1Code name) {
		this.name = name;
	}

	@XmlElement(name = "Tp", required = true)
	public UndertakingType1Choice getType() {
		return type;
	}

	public void setType(UndertakingType1Choice type) {
		this.type = type;
	}

	@XmlElement(name = "Oblgr", required = true)
	public PartyIdentification43 getObligor() {
		return obligor;
	}

	public void setObligor(com.tools20022.repository.msg.PartyIdentification43 obligor) {
		this.obligor = obligor;
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

	@XmlElement(name = "Cnfrmr")
	public PartyIdentification43 getConfirmer() {
		return confirmer;
	}

	public void setConfirmer(com.tools20022.repository.msg.PartyIdentification43 confirmer) {
		this.confirmer = confirmer;
	}

	@XmlElement(name = "ConfInd")
	public YesNoIndicator getConfirmationIndicator() {
		return confirmationIndicator;
	}

	public void setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
	}

	@XmlElement(name = "CntrUdrtkgInd", required = true)
	public YesNoIndicator getCounterUndertakingIndicator() {
		return counterUndertakingIndicator;
	}

	public void setCounterUndertakingIndicator(YesNoIndicator counterUndertakingIndicator) {
		this.counterUndertakingIndicator = counterUndertakingIndicator;
	}

	@XmlElement(name = "CntrUdrtkg")
	public Undertaking2 getCounterUndertaking() {
		return counterUndertaking;
	}

	public void setCounterUndertaking(com.tools20022.repository.msg.Undertaking2 counterUndertaking) {
		this.counterUndertaking = counterUndertaking;
	}

	@XmlElement(name = "UdrtkgAmt", required = true)
	public UndertakingAmount1 getUndertakingAmount() {
		return undertakingAmount;
	}

	public void setUndertakingAmount(com.tools20022.repository.msg.UndertakingAmount1 undertakingAmount) {
		this.undertakingAmount = undertakingAmount;
	}

	@XmlElement(name = "XpryDtls", required = true)
	public ExpiryDetails2 getExpiryDetails() {
		return expiryDetails;
	}

	public void setExpiryDetails(com.tools20022.repository.msg.ExpiryDetails2 expiryDetails) {
		this.expiryDetails = expiryDetails;
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
	public Presentation4 getPresentationDetails() {
		return presentationDetails;
	}

	public void setPresentationDetails(com.tools20022.repository.msg.Presentation4 presentationDetails) {
		this.presentationDetails = presentationDetails;
	}

	@XmlElement(name = "UdrtkgWrdg", required = true)
	public UndertakingWording1 getUndertakingWording() {
		return undertakingWording;
	}

	public void setUndertakingWording(com.tools20022.repository.msg.UndertakingWording1 undertakingWording) {
		this.undertakingWording = undertakingWording;
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

	@XmlElement(name = "TrfInd")
	public YesNoIndicator getTransferIndicator() {
		return transferIndicator;
	}

	public void setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
	}

	@XmlElement(name = "TrfChrgsPyblBy")
	public ExternalTypeOfParty1Code getTransferChargesPayableBy() {
		return transferChargesPayableBy;
	}

	public void setTransferChargesPayableBy(ExternalTypeOfParty1Code transferChargesPayableBy) {
		this.transferChargesPayableBy = transferChargesPayableBy;
	}

	@XmlElement(name = "ConfChrgsPyblBy")
	public ExternalTypeOfParty1Code getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy;
	}

	public void setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
	}

	@XmlElement(name = "AutomtcAmtVartn")
	public List<AutomaticVariation1> getAutomaticAmountVariation() {
		return automaticAmountVariation;
	}

	public void setAutomaticAmountVariation(List<com.tools20022.repository.msg.AutomaticVariation1> automaticAmountVariation) {
		this.automaticAmountVariation = automaticAmountVariation;
	}

	@XmlElement(name = "DlvryChanl", required = true)
	public CommunicationChannel1 getDeliveryChannel() {
		return deliveryChannel;
	}

	public void setDeliveryChannel(com.tools20022.repository.msg.CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
	}

	@XmlElement(name = "OblgrLbltyAcct")
	public CashAccount28 getObligorLiabilityAccount() {
		return obligorLiabilityAccount;
	}

	public void setObligorLiabilityAccount(com.tools20022.repository.msg.CashAccount28 obligorLiabilityAccount) {
		this.obligorLiabilityAccount = obligorLiabilityAccount;
	}

	@XmlElement(name = "OblgrChrgAcct")
	public CashAccount28 getObligorChargeAccount() {
		return obligorChargeAccount;
	}

	public void setObligorChargeAccount(com.tools20022.repository.msg.CashAccount28 obligorChargeAccount) {
		this.obligorChargeAccount = obligorChargeAccount;
	}

	@XmlElement(name = "OblgrSttlmAcct")
	public CashAccount28 getObligorSettlementAccount() {
		return obligorSettlementAccount;
	}

	public void setObligorSettlementAccount(com.tools20022.repository.msg.CashAccount28 obligorSettlementAccount) {
		this.obligorSettlementAccount = obligorSettlementAccount;
	}

	@XmlElement(name = "NclsdFile")
	public List<Document9> getEnclosedFile() {
		return enclosedFile;
	}

	public void setEnclosedFile(List<com.tools20022.repository.msg.Document9> enclosedFile) {
		this.enclosedFile = enclosedFile;
	}

	@XmlElement(name = "AddtlApplInf")
	public List<Max2000Text> getAdditionalApplicationInformation() {
		return additionalApplicationInformation;
	}

	public void setAdditionalApplicationInformation(List<Max2000Text> additionalApplicationInformation) {
		this.additionalApplicationInformation = additionalApplicationInformation;
	}
}