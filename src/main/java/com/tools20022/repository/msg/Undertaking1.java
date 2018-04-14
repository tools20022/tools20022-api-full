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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Undertaking1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondAdvisingPartyRule#forUndertaking1
 * ConstraintSecondAdvisingPartyRule.forUndertaking1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterUndertakingYesRule#forUndertaking1
 * ConstraintCounterUndertakingYesRule.forUndertaking1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterUndertakingNoRule#forUndertaking1
 * ConstraintCounterUndertakingNoRule.forUndertaking1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking1", propOrder = {"applicantReferenceNumber", "purpose", "name", "type", "obligor", "applicant", "issuer", "beneficiary", "advisingParty", "secondAdvisingParty", "confirmer", "confirmationIndicator",
		"counterUndertakingIndicator", "counterUndertaking", "undertakingAmount", "expiryDetails", "additionalParty", "governanceRulesAndLaw", "underlyingTransaction", "presentationDetails", "undertakingWording", "multipleDemandIndicator",
		"partialDemandIndicator", "transferIndicator", "transferChargesPayableBy", "confirmationChargesPayableBy", "automaticAmountVariation", "deliveryChannel", "obligorLiabilityAccount", "obligorChargeAccount",
		"obligorSettlementAccount", "enclosedFile", "additionalApplicationInformation"})
public class Undertaking1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ApplcntRefNb", required = true)
	protected Max35Text applicantReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntRefNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Max35Text> mmApplicantReferenceNumber = new MMMessageAttribute<Undertaking1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ApplcntRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Undertaking1 obj) {
			return obj.getApplicantReferenceNumber();
		}

		@Override
		public void setValue(Undertaking1 obj, Max35Text value) {
			obj.setApplicantReferenceNumber(value);
		}
	};
	@XmlElement(name = "Purp", required = true)
	protected Max350Text purpose;
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPurpose
	 * Undertaking.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brief description of the purpose of the undertaking. Provided as information for the issuer reference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Max350Text> mmPurpose = new MMMessageAttribute<Undertaking1, Max350Text>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Brief description of the purpose of the undertaking. Provided as information for the issuer reference.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Undertaking1 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Undertaking1 obj, Max350Text value) {
			obj.setPurpose(value);
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected UndertakingName1Code name;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking name."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, UndertakingName1Code> mmName = new MMMessageAttribute<Undertaking1, UndertakingName1Code>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Undertaking name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingName1Code.mmObject();
		}

		@Override
		public UndertakingName1Code getValue(Undertaking1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Undertaking1 obj, UndertakingName1Code value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected UndertakingType1Choice type;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of undertaking, for example, performance, payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, UndertakingType1Choice> mmType = new MMMessageAttribute<Undertaking1, UndertakingType1Choice>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of undertaking, for example, performance, payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingType1Choice.mmObject();
		}

		@Override
		public UndertakingType1Choice getValue(Undertaking1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Undertaking1 obj, UndertakingType1Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Oblgr", required = true)
	protected PartyIdentification43 obligor;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party obligated to reimburse the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, PartyIdentification43> mmObligor = new MMMessageAssociationEnd<Undertaking1, PartyIdentification43>() {
		{
			businessComponentTrace_lazy = () -> UndertakingUltimateObligor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Oblgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligor";
			definition = "Party obligated to reimburse the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(Undertaking1 obj) {
			return obj.getObligor();
		}

		@Override
		public void setValue(Undertaking1 obj, PartyIdentification43 value) {
			obj.setObligor(value);
		}
	};
	@XmlElement(name = "Applcnt")
	protected List<PartyIdentification43> applicant;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Applicant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to be named in the undertaking as the “applicant” when different from the obligor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<PartyIdentification43>> mmApplicant = new MMMessageAssociationEnd<Undertaking1, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingApplicant.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party to be named in the undertaking as the “applicant” when different from the obligor.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking1 obj) {
			return obj.getApplicant();
		}

		@Override
		public void setValue(Undertaking1 obj, List<PartyIdentification43> value) {
			obj.setApplicant(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected PartyIdentification43 issuer;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues the undertaking (or counter-undertaking)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, PartyIdentification43> mmIssuer = new MMMessageAssociationEnd<Undertaking1, PartyIdentification43>() {
		{
			businessComponentTrace_lazy = () -> UndertakingIssuer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issues the undertaking (or counter-undertaking).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(Undertaking1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(Undertaking1 obj, PartyIdentification43 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "Bnfcry", required = true)
	protected List<PartyIdentification43> beneficiary;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party in whose favour the undertaking is to be issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<PartyIdentification43>> mmBeneficiary = new MMMessageAssociationEnd<Undertaking1, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party in whose favour the undertaking is to be issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking1 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(Undertaking1 obj, List<PartyIdentification43> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "AdvsgPty")
	protected PartyIdentification43 advisingParty;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party asked to advise the undertaking to the beneficiary or to another advising party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>> mmAdvisingParty = new MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the undertaking to the beneficiary or to another advising party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking1 obj) {
			return obj.getAdvisingParty();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<PartyIdentification43> value) {
			obj.setAdvisingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndAdvsgPty")
	protected PartyIdentification43 secondAdvisingParty;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional party asked to advise the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>> mmSecondAdvisingParty = new MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party asked to advise the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking1 obj) {
			return obj.getSecondAdvisingParty();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<PartyIdentification43> value) {
			obj.setSecondAdvisingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Cnfrmr")
	protected PartyIdentification43 confirmer;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that adds its confirmation to the undertaking. For further clarification, reference the applicable rules to which the undertaking is subject."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>> mmConfirmer = new MMMessageAssociationEnd<Undertaking1, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingConfirmer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "Cnfrmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmer";
			definition = "Party that adds its confirmation to the undertaking. For further clarification, reference the applicable rules to which the undertaking is subject.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking1 obj) {
			return obj.getConfirmer();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<PartyIdentification43> value) {
			obj.setConfirmer(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfInd")
	protected YesNoIndicator confirmationIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking. The absence of this element indicates that the advising bank (confirmer) is not requested to add its confirmation to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>> mmConfirmationIndicator = new MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmConfirmationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ConfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking. The absence of this element indicates that the advising bank (confirmer) is not requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking1 obj) {
			return obj.getConfirmationIndicator();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<YesNoIndicator> value) {
			obj.setConfirmationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CntrUdrtkgInd", required = true)
	protected YesNoIndicator counterUndertakingIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the undertaking is a local or ancillary undertaking to be issued under a counter-undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, YesNoIndicator> mmCounterUndertakingIndicator = new MMMessageAttribute<Undertaking1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmCounterUndertakingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a local or ancillary undertaking to be issued under a counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking1 obj) {
			return obj.getCounterUndertakingIndicator();
		}

		@Override
		public void setValue(Undertaking1 obj, YesNoIndicator value) {
			obj.setCounterUndertakingIndicator(value);
		}
	};
	@XmlElement(name = "CntrUdrtkg")
	protected Undertaking2 counterUndertaking;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the counter undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<Undertaking2>> mmCounterUndertaking = new MMMessageAssociationEnd<Undertaking1, Optional<Undertaking2>>() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertaking";
			definition = "Details related to the counter undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Undertaking2.mmObject();
		}

		@Override
		public Optional<Undertaking2> getValue(Undertaking1 obj) {
			return obj.getCounterUndertaking();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<Undertaking2> value) {
			obj.setCounterUndertaking(value.orElse(null));
		}
	};
	@XmlElement(name = "UdrtkgAmt", required = true)
	protected UndertakingAmount1 undertakingAmount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the amount of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, UndertakingAmount1> mmUndertakingAmount = new MMMessageAssociationEnd<Undertaking1, UndertakingAmount1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmount";
			definition = "Details related to the amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmount1.mmObject();
		}

		@Override
		public UndertakingAmount1 getValue(Undertaking1 obj) {
			return obj.getUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking1 obj, UndertakingAmount1 value) {
			obj.setUndertakingAmount(value);
		}
	};
	@XmlElement(name = "XpryDtls", required = true)
	protected ExpiryDetails2 expiryDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the expiry terms of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, ExpiryDetails2> mmExpiryDetails = new MMMessageAssociationEnd<Undertaking1, ExpiryDetails2>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry terms of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExpiryDetails2.mmObject();
		}

		@Override
		public ExpiryDetails2 getValue(Undertaking1 obj) {
			return obj.getExpiryDetails();
		}

		@Override
		public void setValue(Undertaking1 obj, ExpiryDetails2 value) {
			obj.setExpiryDetails(value);
		}
	};
	@XmlElement(name = "AddtlPty")
	protected List<PartyAndType1> additionalParty;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<PartyAndType1>> mmAdditionalParty = new MMMessageAssociationEnd<Undertaking1, List<PartyAndType1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AddtlPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParty";
			definition = "Party, in addition to the other parties specified in the undertaking, that is also related to the undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyAndType1.mmObject();
		}

		@Override
		public List<PartyAndType1> getValue(Undertaking1 obj) {
			return obj.getAdditionalParty();
		}

		@Override
		public void setValue(Undertaking1 obj, List<PartyAndType1> value) {
			obj.setAdditionalParty(value);
		}
	};
	@XmlElement(name = "GovncRulesAndLaw", required = true)
	protected GovernanceRules1 governanceRulesAndLaw;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernanceRulesAndLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, GovernanceRules1> mmGovernanceRulesAndLaw = new MMMessageAssociationEnd<Undertaking1, GovernanceRules1>() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "GovncRulesAndLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernanceRulesAndLaw";
			definition = "Rules and laws governing the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GovernanceRules1.mmObject();
		}

		@Override
		public GovernanceRules1 getValue(Undertaking1 obj) {
			return obj.getGovernanceRulesAndLaw();
		}

		@Override
		public void setValue(Undertaking1 obj, GovernanceRules1 value) {
			obj.setGovernanceRulesAndLaw(value);
		}
	};
	@XmlElement(name = "UndrlygTx")
	protected List<UnderlyingTradeTransaction1> underlyingTransaction;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the underlying transaction for which the undertaking is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<UnderlyingTradeTransaction1>> mmUnderlyingTransaction = new MMMessageAssociationEnd<Undertaking1, List<UnderlyingTradeTransaction1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUnderlyingTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Details of the underlying transaction for which the undertaking is issued.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnderlyingTradeTransaction1.mmObject();
		}

		@Override
		public List<UnderlyingTradeTransaction1> getValue(Undertaking1 obj) {
			return obj.getUnderlyingTransaction();
		}

		@Override
		public void setValue(Undertaking1 obj, List<UnderlyingTradeTransaction1> value) {
			obj.setUnderlyingTransaction(value);
		}
	};
	@XmlElement(name = "PresntnDtls")
	protected Presentation4 presentationDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation details related to the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<Presentation4>> mmPresentationDetails = new MMMessageAssociationEnd<Undertaking1, Optional<Presentation4>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPresentation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "PresntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationDetails";
			definition = "Presentation details related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Presentation4.mmObject();
		}

		@Override
		public Optional<Presentation4> getValue(Undertaking1 obj) {
			return obj.getPresentationDetails();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<Presentation4> value) {
			obj.setPresentationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UdrtkgWrdg", required = true)
	protected UndertakingWording1 undertakingWording;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingWording"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wording details and text for the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, UndertakingWording1> mmUndertakingWording = new MMMessageAssociationEnd<Undertaking1, UndertakingWording1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmModelForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgWrdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingWording";
			definition = "Wording details and text for the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingWording1.mmObject();
		}

		@Override
		public UndertakingWording1 getValue(Undertaking1 obj) {
			return obj.getUndertakingWording();
		}

		@Override
		public void setValue(Undertaking1 obj, UndertakingWording1 value) {
			obj.setUndertakingWording(value);
		}
	};
	@XmlElement(name = "MltplDmndInd")
	protected YesNoIndicator multipleDemandIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether multiple demands are permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>> mmMultipleDemandIndicator = new MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmMultipleDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "MltplDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking1 obj) {
			return obj.getMultipleDemandIndicator();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<YesNoIndicator> value) {
			obj.setMultipleDemandIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlDmndInd")
	protected YesNoIndicator partialDemandIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether partial demands/drawings are permitted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>> mmPartialDemandIndicator = new MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartialDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "PrtlDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking1 obj) {
			return obj.getPartialDemandIndicator();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<YesNoIndicator> value) {
			obj.setPartialDemandIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfInd")
	protected YesNoIndicator transferIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking is transferable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>> mmTransferIndicator = new MMMessageAttribute<Undertaking1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "TrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking1 obj) {
			return obj.getTransferIndicator();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<YesNoIndicator> value) {
			obj.setTransferIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfChrgsPyblBy")
	protected ExternalTypeOfParty1Code transferChargesPayableBy;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the transfer charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<ExternalTypeOfParty1Code>> mmTransferChargesPayableBy = new MMMessageAttribute<Undertaking1, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "TrfChrgsPyblBy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the transfer charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}

		@Override
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking1 obj) {
			return obj.getTransferChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<ExternalTypeOfParty1Code> value) {
			obj.setTransferChargesPayableBy(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfChrgsPyblBy")
	protected ExternalTypeOfParty1Code confirmationChargesPayableBy;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, Optional<ExternalTypeOfParty1Code>> mmConfirmationChargesPayableBy = new MMMessageAttribute<Undertaking1, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "ConfChrgsPyblBy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}

		@Override
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking1 obj) {
			return obj.getConfirmationChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<ExternalTypeOfParty1Code> value) {
			obj.setConfirmationChargesPayableBy(value.orElse(null));
		}
	};
	@XmlElement(name = "AutomtcAmtVartn")
	protected List<AutomaticVariation1> automaticAmountVariation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticAmountVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to a variation in amount that is automatically applied."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<AutomaticVariation1>> mmAutomaticAmountVariation = new MMMessageAssociationEnd<Undertaking1, List<AutomaticVariation1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPredefinedVariation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AutomtcAmtVartn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticAmountVariation";
			definition = "Details related to a variation in amount that is automatically applied.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticVariation1.mmObject();
		}

		@Override
		public List<AutomaticVariation1> getValue(Undertaking1 obj) {
			return obj.getAutomaticAmountVariation();
		}

		@Override
		public void setValue(Undertaking1 obj, List<AutomaticVariation1> value) {
			obj.setAutomaticAmountVariation(value);
		}
	};
	@XmlElement(name = "DlvryChanl", required = true)
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the communication channel."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, CommunicationChannel1> mmDeliveryChannel = new MMMessageAssociationEnd<Undertaking1, CommunicationChannel1>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details of the communication channel.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommunicationChannel1.mmObject();
		}

		@Override
		public CommunicationChannel1 getValue(Undertaking1 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Undertaking1 obj, CommunicationChannel1 value) {
			obj.setDeliveryChannel(value);
		}
	};
	@XmlElement(name = "OblgrLbltyAcct")
	protected CashAccount28 obligorLiabilityAccount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorLiabilityAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor to record the liability amount of the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>> mmObligorLiabilityAccount = new MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>>() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrLbltyAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorLiabilityAccount";
			definition = "Account nominated by the obligor to record the liability amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount28.mmObject();
		}

		@Override
		public Optional<CashAccount28> getValue(Undertaking1 obj) {
			return obj.getObligorLiabilityAccount();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<CashAccount28> value) {
			obj.setObligorLiabilityAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgrChrgAcct")
	protected CashAccount28 obligorChargeAccount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorChargeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor for the settlement of charges related to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>> mmObligorChargeAccount = new MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>>() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrChrgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorChargeAccount";
			definition = "Account nominated by the obligor for the settlement of charges related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount28.mmObject();
		}

		@Override
		public Optional<CashAccount28> getValue(Undertaking1 obj) {
			return obj.getObligorChargeAccount();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<CashAccount28> value) {
			obj.setObligorChargeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgrSttlmAcct")
	protected CashAccount28 obligorSettlementAccount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account nominated by the obligor for the settlement of the amount claimed under the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>> mmObligorSettlementAccount = new MMMessageAssociationEnd<Undertaking1, Optional<CashAccount28>>() {
		{
			businessElementTrace_lazy = () -> UndertakingUltimateObligor.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "OblgrSttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorSettlementAccount";
			definition = "Account nominated by the obligor for the settlement of the amount claimed under the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount28.mmObject();
		}

		@Override
		public Optional<CashAccount28> getValue(Undertaking1 obj) {
			return obj.getObligorSettlementAccount();
		}

		@Override
		public void setValue(Undertaking1 obj, Optional<CashAccount28> value) {
			obj.setObligorSettlementAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "NclsdFile")
	protected List<Document9> enclosedFile;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document or template enclosed in the undertaking directly related to the undertaking to be issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking1, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<Undertaking1, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the undertaking directly related to the undertaking to be issued.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(Undertaking1 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(Undertaking1 obj, List<Document9> value) {
			obj.setEnclosedFile(value);
		}
	};
	@XmlElement(name = "AddtlApplInf")
	protected List<Max2000Text> additionalApplicationInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalApplicationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the application for an undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking1, List<Max2000Text>> mmAdditionalApplicationInformation = new MMMessageAttribute<Undertaking1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking1.mmObject();
			isDerived = false;
			xmlTag = "AddtlApplInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalApplicationInformation";
			definition = "Additional information related to the application for an undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Undertaking1 obj) {
			return obj.getAdditionalApplicationInformation();
		}

		@Override
		public void setValue(Undertaking1 obj, List<Max2000Text> value) {
			obj.setAdditionalApplicationInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking1.mmApplicantReferenceNumber, com.tools20022.repository.msg.Undertaking1.mmPurpose, com.tools20022.repository.msg.Undertaking1.mmName,
						com.tools20022.repository.msg.Undertaking1.mmType, com.tools20022.repository.msg.Undertaking1.mmObligor, com.tools20022.repository.msg.Undertaking1.mmApplicant, com.tools20022.repository.msg.Undertaking1.mmIssuer,
						com.tools20022.repository.msg.Undertaking1.mmBeneficiary, com.tools20022.repository.msg.Undertaking1.mmAdvisingParty, com.tools20022.repository.msg.Undertaking1.mmSecondAdvisingParty,
						com.tools20022.repository.msg.Undertaking1.mmConfirmer, com.tools20022.repository.msg.Undertaking1.mmConfirmationIndicator, com.tools20022.repository.msg.Undertaking1.mmCounterUndertakingIndicator,
						com.tools20022.repository.msg.Undertaking1.mmCounterUndertaking, com.tools20022.repository.msg.Undertaking1.mmUndertakingAmount, com.tools20022.repository.msg.Undertaking1.mmExpiryDetails,
						com.tools20022.repository.msg.Undertaking1.mmAdditionalParty, com.tools20022.repository.msg.Undertaking1.mmGovernanceRulesAndLaw, com.tools20022.repository.msg.Undertaking1.mmUnderlyingTransaction,
						com.tools20022.repository.msg.Undertaking1.mmPresentationDetails, com.tools20022.repository.msg.Undertaking1.mmUndertakingWording, com.tools20022.repository.msg.Undertaking1.mmMultipleDemandIndicator,
						com.tools20022.repository.msg.Undertaking1.mmPartialDemandIndicator, com.tools20022.repository.msg.Undertaking1.mmTransferIndicator, com.tools20022.repository.msg.Undertaking1.mmTransferChargesPayableBy,
						com.tools20022.repository.msg.Undertaking1.mmConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking1.mmAutomaticAmountVariation, com.tools20022.repository.msg.Undertaking1.mmDeliveryChannel,
						com.tools20022.repository.msg.Undertaking1.mmObligorLiabilityAccount, com.tools20022.repository.msg.Undertaking1.mmObligorChargeAccount, com.tools20022.repository.msg.Undertaking1.mmObligorSettlementAccount,
						com.tools20022.repository.msg.Undertaking1.mmEnclosedFile, com.tools20022.repository.msg.Undertaking1.mmAdditionalApplicationInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingApplicationV01.mmUndertakingApplicationDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondAdvisingPartyRule.forUndertaking1, com.tools20022.repository.constraints.ConstraintCounterUndertakingYesRule.forUndertaking1,
						com.tools20022.repository.constraints.ConstraintCounterUndertakingNoRule.forUndertaking1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking1";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicantReferenceNumber() {
		return applicantReferenceNumber;
	}

	public Undertaking1 setApplicantReferenceNumber(Max35Text applicantReferenceNumber) {
		this.applicantReferenceNumber = Objects.requireNonNull(applicantReferenceNumber);
		return this;
	}

	public Max350Text getPurpose() {
		return purpose;
	}

	public Undertaking1 setPurpose(Max350Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public UndertakingName1Code getName() {
		return name;
	}

	public Undertaking1 setName(UndertakingName1Code name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public UndertakingType1Choice getType() {
		return type;
	}

	public Undertaking1 setType(UndertakingType1Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PartyIdentification43 getObligor() {
		return obligor;
	}

	public Undertaking1 setObligor(PartyIdentification43 obligor) {
		this.obligor = Objects.requireNonNull(obligor);
		return this;
	}

	public List<PartyIdentification43> getApplicant() {
		return applicant == null ? applicant = new ArrayList<>() : applicant;
	}

	public Undertaking1 setApplicant(List<PartyIdentification43> applicant) {
		this.applicant = Objects.requireNonNull(applicant);
		return this;
	}

	public PartyIdentification43 getIssuer() {
		return issuer;
	}

	public Undertaking1 setIssuer(PartyIdentification43 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<PartyIdentification43> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public Undertaking1 setBeneficiary(List<PartyIdentification43> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public Optional<PartyIdentification43> getAdvisingParty() {
		return advisingParty == null ? Optional.empty() : Optional.of(advisingParty);
	}

	public Undertaking1 setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
		return this;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return secondAdvisingParty == null ? Optional.empty() : Optional.of(secondAdvisingParty);
	}

	public Undertaking1 setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
		return this;
	}

	public Optional<PartyIdentification43> getConfirmer() {
		return confirmer == null ? Optional.empty() : Optional.of(confirmer);
	}

	public Undertaking1 setConfirmer(PartyIdentification43 confirmer) {
		this.confirmer = confirmer;
		return this;
	}

	public Optional<YesNoIndicator> getConfirmationIndicator() {
		return confirmationIndicator == null ? Optional.empty() : Optional.of(confirmationIndicator);
	}

	public Undertaking1 setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
		return this;
	}

	public YesNoIndicator getCounterUndertakingIndicator() {
		return counterUndertakingIndicator;
	}

	public Undertaking1 setCounterUndertakingIndicator(YesNoIndicator counterUndertakingIndicator) {
		this.counterUndertakingIndicator = Objects.requireNonNull(counterUndertakingIndicator);
		return this;
	}

	public Optional<Undertaking2> getCounterUndertaking() {
		return counterUndertaking == null ? Optional.empty() : Optional.of(counterUndertaking);
	}

	public Undertaking1 setCounterUndertaking(Undertaking2 counterUndertaking) {
		this.counterUndertaking = counterUndertaking;
		return this;
	}

	public UndertakingAmount1 getUndertakingAmount() {
		return undertakingAmount;
	}

	public Undertaking1 setUndertakingAmount(UndertakingAmount1 undertakingAmount) {
		this.undertakingAmount = Objects.requireNonNull(undertakingAmount);
		return this;
	}

	public ExpiryDetails2 getExpiryDetails() {
		return expiryDetails;
	}

	public Undertaking1 setExpiryDetails(ExpiryDetails2 expiryDetails) {
		this.expiryDetails = Objects.requireNonNull(expiryDetails);
		return this;
	}

	public List<PartyAndType1> getAdditionalParty() {
		return additionalParty == null ? additionalParty = new ArrayList<>() : additionalParty;
	}

	public Undertaking1 setAdditionalParty(List<PartyAndType1> additionalParty) {
		this.additionalParty = Objects.requireNonNull(additionalParty);
		return this;
	}

	public GovernanceRules1 getGovernanceRulesAndLaw() {
		return governanceRulesAndLaw;
	}

	public Undertaking1 setGovernanceRulesAndLaw(GovernanceRules1 governanceRulesAndLaw) {
		this.governanceRulesAndLaw = Objects.requireNonNull(governanceRulesAndLaw);
		return this;
	}

	public List<UnderlyingTradeTransaction1> getUnderlyingTransaction() {
		return underlyingTransaction == null ? underlyingTransaction = new ArrayList<>() : underlyingTransaction;
	}

	public Undertaking1 setUnderlyingTransaction(List<UnderlyingTradeTransaction1> underlyingTransaction) {
		this.underlyingTransaction = Objects.requireNonNull(underlyingTransaction);
		return this;
	}

	public Optional<Presentation4> getPresentationDetails() {
		return presentationDetails == null ? Optional.empty() : Optional.of(presentationDetails);
	}

	public Undertaking1 setPresentationDetails(Presentation4 presentationDetails) {
		this.presentationDetails = presentationDetails;
		return this;
	}

	public UndertakingWording1 getUndertakingWording() {
		return undertakingWording;
	}

	public Undertaking1 setUndertakingWording(UndertakingWording1 undertakingWording) {
		this.undertakingWording = Objects.requireNonNull(undertakingWording);
		return this;
	}

	public Optional<YesNoIndicator> getMultipleDemandIndicator() {
		return multipleDemandIndicator == null ? Optional.empty() : Optional.of(multipleDemandIndicator);
	}

	public Undertaking1 setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = multipleDemandIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPartialDemandIndicator() {
		return partialDemandIndicator == null ? Optional.empty() : Optional.of(partialDemandIndicator);
	}

	public Undertaking1 setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = partialDemandIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getTransferIndicator() {
		return transferIndicator == null ? Optional.empty() : Optional.of(transferIndicator);
	}

	public Undertaking1 setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getTransferChargesPayableBy() {
		return transferChargesPayableBy == null ? Optional.empty() : Optional.of(transferChargesPayableBy);
	}

	public Undertaking1 setTransferChargesPayableBy(ExternalTypeOfParty1Code transferChargesPayableBy) {
		this.transferChargesPayableBy = transferChargesPayableBy;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy == null ? Optional.empty() : Optional.of(confirmationChargesPayableBy);
	}

	public Undertaking1 setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
		return this;
	}

	public List<AutomaticVariation1> getAutomaticAmountVariation() {
		return automaticAmountVariation == null ? automaticAmountVariation = new ArrayList<>() : automaticAmountVariation;
	}

	public Undertaking1 setAutomaticAmountVariation(List<AutomaticVariation1> automaticAmountVariation) {
		this.automaticAmountVariation = Objects.requireNonNull(automaticAmountVariation);
		return this;
	}

	public CommunicationChannel1 getDeliveryChannel() {
		return deliveryChannel;
	}

	public Undertaking1 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = Objects.requireNonNull(deliveryChannel);
		return this;
	}

	public Optional<CashAccount28> getObligorLiabilityAccount() {
		return obligorLiabilityAccount == null ? Optional.empty() : Optional.of(obligorLiabilityAccount);
	}

	public Undertaking1 setObligorLiabilityAccount(CashAccount28 obligorLiabilityAccount) {
		this.obligorLiabilityAccount = obligorLiabilityAccount;
		return this;
	}

	public Optional<CashAccount28> getObligorChargeAccount() {
		return obligorChargeAccount == null ? Optional.empty() : Optional.of(obligorChargeAccount);
	}

	public Undertaking1 setObligorChargeAccount(CashAccount28 obligorChargeAccount) {
		this.obligorChargeAccount = obligorChargeAccount;
		return this;
	}

	public Optional<CashAccount28> getObligorSettlementAccount() {
		return obligorSettlementAccount == null ? Optional.empty() : Optional.of(obligorSettlementAccount);
	}

	public Undertaking1 setObligorSettlementAccount(CashAccount28 obligorSettlementAccount) {
		this.obligorSettlementAccount = obligorSettlementAccount;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public Undertaking1 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalApplicationInformation() {
		return additionalApplicationInformation == null ? additionalApplicationInformation = new ArrayList<>() : additionalApplicationInformation;
	}

	public Undertaking1 setAdditionalApplicationInformation(List<Max2000Text> additionalApplicationInformation) {
		this.additionalApplicationInformation = Objects.requireNonNull(additionalApplicationInformation);
		return this;
	}
}