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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Undertaking3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondAdvisingPartyRule#forUndertaking3
 * ConstraintSecondAdvisingPartyRule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintConfirmationPartyType1Rule#forUndertaking3
 * ConstraintConfirmationPartyType1Rule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintConfirmationPartyType2Rule#forUndertaking3
 * ConstraintConfirmationPartyType2Rule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdvisingPartyRule#forUndertaking3
 * ConstraintAdvisingPartyRule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfPresentation1Rule#forUndertaking3
 * ConstraintPlaceOfPresentation1Rule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintType1Rule#forUndertaking3
 * ConstraintType1Rule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleDemandIndicatorRule#forUndertaking3
 * ConstraintMultipleDemandIndicatorRule.forUndertaking3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfIssue1Rule#forUndertaking3
 * ConstraintPlaceOfIssue1Rule.forUndertaking3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking3", propOrder = {"identification", "name", "type", "issuanceType", "applicant", "issuer", "beneficiary", "dateOfIssuance", "placeOfIssue", "advisingParty", "secondAdvisingParty", "undertakingAmount",
		"expiryDetails", "confirmationIndicator", "confirmationPartyType", "additionalParty", "governanceRulesAndLaw", "underlyingTransaction", "presentationDetails", "undertakingTermsAndConditions", "multipleDemandIndicator",
		"partialDemandIndicator", "confirmationChargesPayableBy", "transferChargesPayableBy", "automaticAmountVariation", "deliveryChannel", "transferIndicator", "enclosedFile", "additionalInformation", "requestedLocalUndertaking"})
public class Undertaking3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
	 * Undertaking.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Max35Text> mmIdentification = new MMMessageAttribute<Undertaking3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Undertaking3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Undertaking3 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected UndertakingIssuanceName1Code name;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of undertaking such as, demand guarantee, standby letter of credit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, UndertakingIssuanceName1Code> mmName = new MMMessageAttribute<Undertaking3, UndertakingIssuanceName1Code>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingIssuanceName1Code.mmObject();
		}

		@Override
		public UndertakingIssuanceName1Code getValue(Undertaking3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Undertaking3 obj, UndertakingIssuanceName1Code value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Tp")
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAttribute<Undertaking3, Optional<UndertakingType1Choice>> mmType = new MMMessageAttribute<Undertaking3, Optional<UndertakingType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of undertaking, for example, performance, payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UndertakingType1Choice.mmObject();
		}

		@Override
		public Optional<UndertakingType1Choice> getValue(Undertaking3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<UndertakingType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "IssncTp", required = true)
	protected IssuanceType1Code issuanceType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the undertaking issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, IssuanceType1Code> mmIssuanceType = new MMMessageAttribute<Undertaking3, IssuanceType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "IssncTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceType";
			definition = "Type of the undertaking issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IssuanceType1Code.mmObject();
		}

		@Override
		public IssuanceType1Code getValue(Undertaking3 obj) {
			return obj.getIssuanceType();
		}

		@Override
		public void setValue(Undertaking3 obj, IssuanceType1Code value) {
			obj.setIssuanceType(value);
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Applcnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Applicant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party named in the undertaking as the “applicant”."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, List<PartyIdentification43>> mmApplicant = new MMMessageAssociationEnd<Undertaking3, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingApplicant.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party named in the undertaking as the “applicant”.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking3 obj) {
			return obj.getApplicant();
		}

		@Override
		public void setValue(Undertaking3 obj, List<PartyIdentification43> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, PartyIdentification43> mmIssuer = new MMMessageAssociationEnd<Undertaking3, PartyIdentification43>() {
		{
			businessComponentTrace_lazy = () -> UndertakingIssuer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public PartyIdentification43 getValue(Undertaking3 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(Undertaking3 obj, PartyIdentification43 value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party in whose favour the undertaking (or counter-undertaking) is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, List<PartyIdentification43>> mmBeneficiary = new MMMessageAssociationEnd<Undertaking3, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Party in whose favour the undertaking (or counter-undertaking) is issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking3 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(Undertaking3 obj, List<PartyIdentification43> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "DtOfIssnc", required = true)
	protected ISODate dateOfIssuance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the undertaking is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, ISODate> mmDateOfIssuance = new MMMessageAttribute<Undertaking3, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuance";
			definition = "Date on which the undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Undertaking3 obj) {
			return obj.getDateOfIssuance();
		}

		@Override
		public void setValue(Undertaking3 obj, ISODate value) {
			obj.setDateOfIssuance(value);
		}
	};
	@XmlElement(name = "PlcOfIsse")
	protected PostalAddress12 placeOfIssue;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location which is to be regarded as the place from which the undertaking is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Optional<PostalAddress12>> mmPlaceOfIssue = new MMMessageAttribute<Undertaking3, Optional<PostalAddress12>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfIssue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssue";
			definition = "Location which is to be regarded as the place from which the undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PostalAddress12.mmObject();
		}

		@Override
		public Optional<PostalAddress12> getValue(Undertaking3 obj) {
			return obj.getPlaceOfIssue();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<PostalAddress12> value) {
			obj.setPlaceOfIssue(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party asked to advise the undertaking to the beneficiary or to another advising party at the request of the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, Optional<PartyIdentification43>> mmAdvisingParty = new MMMessageAssociationEnd<Undertaking3, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the undertaking to the beneficiary or to another advising party at the request of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking3 obj) {
			return obj.getAdvisingParty();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<PartyIdentification43> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, Optional<PartyIdentification43>> mmSecondAdvisingParty = new MMMessageAssociationEnd<Undertaking3, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public Optional<PartyIdentification43> getValue(Undertaking3 obj) {
			return obj.getSecondAdvisingParty();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<PartyIdentification43> value) {
			obj.setSecondAdvisingParty(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, UndertakingAmount1> mmUndertakingAmount = new MMMessageAssociationEnd<Undertaking3, UndertakingAmount1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public UndertakingAmount1 getValue(Undertaking3 obj) {
			return obj.getUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking3 obj, UndertakingAmount1 value) {
			obj.setUndertakingAmount(value);
		}
	};
	@XmlElement(name = "XpryDtls", required = true)
	protected ExpiryDetails1 expiryDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the expiry of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, ExpiryDetails1> mmExpiryDetails = new MMMessageAssociationEnd<Undertaking3, ExpiryDetails1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExpiryDetails1.mmObject();
		}

		@Override
		public ExpiryDetails1 getValue(Undertaking3 obj) {
			return obj.getExpiryDetails();
		}

		@Override
		public void setValue(Undertaking3 obj, ExpiryDetails1 value) {
			obj.setExpiryDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the advising bank (confirmer) is requested to add its confirmation to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>> mmConfirmationIndicator = new MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmConfirmationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ConfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether or not the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking3 obj) {
			return obj.getConfirmationIndicator();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<YesNoIndicator> value) {
			obj.setConfirmationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfPtyTp")
	protected ExternalTypeOfParty1Code confirmationPartyType;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationPartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of party requested to add its confirmation to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>> mmConfirmationPartyType = new MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingConfirmer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ConfPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationPartyType";
			definition = "Indicates the type of party requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}

		@Override
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking3 obj) {
			return obj.getConfirmationPartyType();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<ExternalTypeOfParty1Code> value) {
			obj.setConfirmationPartyType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, List<PartyAndType1>> mmAdditionalParty = new MMMessageAssociationEnd<Undertaking3, List<PartyAndType1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public List<PartyAndType1> getValue(Undertaking3 obj) {
			return obj.getAdditionalParty();
		}

		@Override
		public void setValue(Undertaking3 obj, List<PartyAndType1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, GovernanceRules1> mmGovernanceRulesAndLaw = new MMMessageAssociationEnd<Undertaking3, GovernanceRules1>() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public GovernanceRules1 getValue(Undertaking3 obj) {
			return obj.getGovernanceRulesAndLaw();
		}

		@Override
		public void setValue(Undertaking3 obj, GovernanceRules1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, List<UnderlyingTradeTransaction1>> mmUnderlyingTransaction = new MMMessageAssociationEnd<Undertaking3, List<UnderlyingTradeTransaction1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUnderlyingTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public List<UnderlyingTradeTransaction1> getValue(Undertaking3 obj) {
			return obj.getUnderlyingTransaction();
		}

		@Override
		public void setValue(Undertaking3 obj, List<UnderlyingTradeTransaction1> value) {
			obj.setUnderlyingTransaction(value);
		}
	};
	@XmlElement(name = "PresntnDtls")
	protected Presentation1 presentationDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Undertaking3, Optional<Presentation1>> mmPresentationDetails = new MMMessageAssociationEnd<Undertaking3, Optional<Presentation1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPresentation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PresntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationDetails";
			definition = "Presentation details related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Presentation1.mmObject();
		}

		@Override
		public Optional<Presentation1> getValue(Undertaking3 obj) {
			return obj.getPresentationDetails();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<Presentation1> value) {
			obj.setPresentationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UdrtkgTermsAndConds", required = true)
	protected List<Narrative1> undertakingTermsAndConditions;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terms and conditions of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, List<Narrative1>> mmUndertakingTermsAndConditions = new MMMessageAssociationEnd<Undertaking3, List<Narrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingTermsAndConditions";
			definition = "Terms and conditions of the undertaking.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Narrative1.mmObject();
		}

		@Override
		public List<Narrative1> getValue(Undertaking3 obj) {
			return obj.getUndertakingTermsAndConditions();
		}

		@Override
		public void setValue(Undertaking3 obj, List<Narrative1> value) {
			obj.setUndertakingTermsAndConditions(value);
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplDmndInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that multiple demands are not permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>> mmMultipleDemandIndicator = new MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmMultipleDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "MltplDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates that multiple demands are not permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking3 obj) {
			return obj.getMultipleDemandIndicator();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlDmndInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that partial demands/drawings are not permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>> mmPartialDemandIndicator = new MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartialDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "PrtlDmndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates that partial demands/drawings are not permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking3 obj) {
			return obj.getPartialDemandIndicator();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<YesNoIndicator> value) {
			obj.setPartialDemandIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>> mmConfirmationChargesPayableBy = new MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking3 obj) {
			return obj.getConfirmationChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<ExternalTypeOfParty1Code> value) {
			obj.setConfirmationChargesPayableBy(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>> mmTransferChargesPayableBy = new MMMessageAttribute<Undertaking3, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking3 obj) {
			return obj.getTransferChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<ExternalTypeOfParty1Code> value) {
			obj.setTransferChargesPayableBy(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, List<AutomaticVariation1>> mmAutomaticAmountVariation = new MMMessageAssociationEnd<Undertaking3, List<AutomaticVariation1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPredefinedVariation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public List<AutomaticVariation1> getValue(Undertaking3 obj) {
			return obj.getAutomaticAmountVariation();
		}

		@Override
		public void setValue(Undertaking3 obj, List<AutomaticVariation1> value) {
			obj.setAutomaticAmountVariation(value);
		}
	};
	@XmlElement(name = "DlvryChanl")
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAssociationEnd<Undertaking3, Optional<CommunicationChannel1>> mmDeliveryChannel = new MMMessageAssociationEnd<Undertaking3, Optional<CommunicationChannel1>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details of the communication channel.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationChannel1.mmObject();
		}

		@Override
		public Optional<CommunicationChannel1> getValue(Undertaking3 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<CommunicationChannel1> value) {
			obj.setDeliveryChannel(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
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
	public static final MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>> mmTransferIndicator = new MMMessageAttribute<Undertaking3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
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
		public Optional<YesNoIndicator> getValue(Undertaking3 obj) {
			return obj.getTransferIndicator();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<YesNoIndicator> value) {
			obj.setTransferIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document or template enclosed in the undertaking directly related to the issued undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<Undertaking3, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the undertaking directly related to the issued undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(Undertaking3 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(Undertaking3 obj, List<Document9> value) {
			obj.setEnclosedFile(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking3, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Undertaking3, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Undertaking3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Undertaking3 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "ReqdLclUdrtkg")
	protected Undertaking4 requestedLocalUndertaking;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedLocalUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the local or ancillary undertaking requested to be issued by a local or other issuing institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking3, Optional<Undertaking4>> mmRequestedLocalUndertaking = new MMMessageAssociationEnd<Undertaking3, Optional<Undertaking4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking3.mmObject();
			isDerived = false;
			xmlTag = "ReqdLclUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedLocalUndertaking";
			definition = "Details of the local or ancillary undertaking requested to be issued by a local or other issuing institution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Undertaking4.mmObject();
		}

		@Override
		public Optional<Undertaking4> getValue(Undertaking3 obj) {
			return obj.getRequestedLocalUndertaking();
		}

		@Override
		public void setValue(Undertaking3 obj, Optional<Undertaking4> value) {
			obj.setRequestedLocalUndertaking(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking3.mmIdentification, com.tools20022.repository.msg.Undertaking3.mmName, com.tools20022.repository.msg.Undertaking3.mmType,
						com.tools20022.repository.msg.Undertaking3.mmIssuanceType, com.tools20022.repository.msg.Undertaking3.mmApplicant, com.tools20022.repository.msg.Undertaking3.mmIssuer,
						com.tools20022.repository.msg.Undertaking3.mmBeneficiary, com.tools20022.repository.msg.Undertaking3.mmDateOfIssuance, com.tools20022.repository.msg.Undertaking3.mmPlaceOfIssue,
						com.tools20022.repository.msg.Undertaking3.mmAdvisingParty, com.tools20022.repository.msg.Undertaking3.mmSecondAdvisingParty, com.tools20022.repository.msg.Undertaking3.mmUndertakingAmount,
						com.tools20022.repository.msg.Undertaking3.mmExpiryDetails, com.tools20022.repository.msg.Undertaking3.mmConfirmationIndicator, com.tools20022.repository.msg.Undertaking3.mmConfirmationPartyType,
						com.tools20022.repository.msg.Undertaking3.mmAdditionalParty, com.tools20022.repository.msg.Undertaking3.mmGovernanceRulesAndLaw, com.tools20022.repository.msg.Undertaking3.mmUnderlyingTransaction,
						com.tools20022.repository.msg.Undertaking3.mmPresentationDetails, com.tools20022.repository.msg.Undertaking3.mmUndertakingTermsAndConditions, com.tools20022.repository.msg.Undertaking3.mmMultipleDemandIndicator,
						com.tools20022.repository.msg.Undertaking3.mmPartialDemandIndicator, com.tools20022.repository.msg.Undertaking3.mmConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking3.mmTransferChargesPayableBy,
						com.tools20022.repository.msg.Undertaking3.mmAutomaticAmountVariation, com.tools20022.repository.msg.Undertaking3.mmDeliveryChannel, com.tools20022.repository.msg.Undertaking3.mmTransferIndicator,
						com.tools20022.repository.msg.Undertaking3.mmEnclosedFile, com.tools20022.repository.msg.Undertaking3.mmAdditionalInformation, com.tools20022.repository.msg.Undertaking3.mmRequestedLocalUndertaking);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingIssuanceV01.mmUndertakingIssuanceDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecondAdvisingPartyRule.forUndertaking3, com.tools20022.repository.constraints.ConstraintConfirmationPartyType1Rule.forUndertaking3,
						com.tools20022.repository.constraints.ConstraintConfirmationPartyType2Rule.forUndertaking3, com.tools20022.repository.constraints.ConstraintAdvisingPartyRule.forUndertaking3,
						com.tools20022.repository.constraints.ConstraintPlaceOfPresentation1Rule.forUndertaking3, com.tools20022.repository.constraints.ConstraintType1Rule.forUndertaking3,
						com.tools20022.repository.constraints.ConstraintMultipleDemandIndicatorRule.forUndertaking3, com.tools20022.repository.constraints.ConstraintPlaceOfIssue1Rule.forUndertaking3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking3";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Undertaking3 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public UndertakingIssuanceName1Code getName() {
		return name;
	}

	public Undertaking3 setName(UndertakingIssuanceName1Code name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<UndertakingType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Undertaking3 setType(UndertakingType1Choice type) {
		this.type = type;
		return this;
	}

	public IssuanceType1Code getIssuanceType() {
		return issuanceType;
	}

	public Undertaking3 setIssuanceType(IssuanceType1Code issuanceType) {
		this.issuanceType = Objects.requireNonNull(issuanceType);
		return this;
	}

	public List<PartyIdentification43> getApplicant() {
		return applicant == null ? applicant = new ArrayList<>() : applicant;
	}

	public Undertaking3 setApplicant(List<PartyIdentification43> applicant) {
		this.applicant = Objects.requireNonNull(applicant);
		return this;
	}

	public PartyIdentification43 getIssuer() {
		return issuer;
	}

	public Undertaking3 setIssuer(PartyIdentification43 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<PartyIdentification43> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public Undertaking3 setBeneficiary(List<PartyIdentification43> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public ISODate getDateOfIssuance() {
		return dateOfIssuance;
	}

	public Undertaking3 setDateOfIssuance(ISODate dateOfIssuance) {
		this.dateOfIssuance = Objects.requireNonNull(dateOfIssuance);
		return this;
	}

	public Optional<PostalAddress12> getPlaceOfIssue() {
		return placeOfIssue == null ? Optional.empty() : Optional.of(placeOfIssue);
	}

	public Undertaking3 setPlaceOfIssue(PostalAddress12 placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
		return this;
	}

	public Optional<PartyIdentification43> getAdvisingParty() {
		return advisingParty == null ? Optional.empty() : Optional.of(advisingParty);
	}

	public Undertaking3 setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
		return this;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return secondAdvisingParty == null ? Optional.empty() : Optional.of(secondAdvisingParty);
	}

	public Undertaking3 setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
		return this;
	}

	public UndertakingAmount1 getUndertakingAmount() {
		return undertakingAmount;
	}

	public Undertaking3 setUndertakingAmount(UndertakingAmount1 undertakingAmount) {
		this.undertakingAmount = Objects.requireNonNull(undertakingAmount);
		return this;
	}

	public ExpiryDetails1 getExpiryDetails() {
		return expiryDetails;
	}

	public Undertaking3 setExpiryDetails(ExpiryDetails1 expiryDetails) {
		this.expiryDetails = Objects.requireNonNull(expiryDetails);
		return this;
	}

	public Optional<YesNoIndicator> getConfirmationIndicator() {
		return confirmationIndicator == null ? Optional.empty() : Optional.of(confirmationIndicator);
	}

	public Undertaking3 setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getConfirmationPartyType() {
		return confirmationPartyType == null ? Optional.empty() : Optional.of(confirmationPartyType);
	}

	public Undertaking3 setConfirmationPartyType(ExternalTypeOfParty1Code confirmationPartyType) {
		this.confirmationPartyType = confirmationPartyType;
		return this;
	}

	public List<PartyAndType1> getAdditionalParty() {
		return additionalParty == null ? additionalParty = new ArrayList<>() : additionalParty;
	}

	public Undertaking3 setAdditionalParty(List<PartyAndType1> additionalParty) {
		this.additionalParty = Objects.requireNonNull(additionalParty);
		return this;
	}

	public GovernanceRules1 getGovernanceRulesAndLaw() {
		return governanceRulesAndLaw;
	}

	public Undertaking3 setGovernanceRulesAndLaw(GovernanceRules1 governanceRulesAndLaw) {
		this.governanceRulesAndLaw = Objects.requireNonNull(governanceRulesAndLaw);
		return this;
	}

	public List<UnderlyingTradeTransaction1> getUnderlyingTransaction() {
		return underlyingTransaction == null ? underlyingTransaction = new ArrayList<>() : underlyingTransaction;
	}

	public Undertaking3 setUnderlyingTransaction(List<UnderlyingTradeTransaction1> underlyingTransaction) {
		this.underlyingTransaction = Objects.requireNonNull(underlyingTransaction);
		return this;
	}

	public Optional<Presentation1> getPresentationDetails() {
		return presentationDetails == null ? Optional.empty() : Optional.of(presentationDetails);
	}

	public Undertaking3 setPresentationDetails(Presentation1 presentationDetails) {
		this.presentationDetails = presentationDetails;
		return this;
	}

	public List<Narrative1> getUndertakingTermsAndConditions() {
		return undertakingTermsAndConditions == null ? undertakingTermsAndConditions = new ArrayList<>() : undertakingTermsAndConditions;
	}

	public Undertaking3 setUndertakingTermsAndConditions(List<Narrative1> undertakingTermsAndConditions) {
		this.undertakingTermsAndConditions = Objects.requireNonNull(undertakingTermsAndConditions);
		return this;
	}

	public Optional<YesNoIndicator> getMultipleDemandIndicator() {
		return multipleDemandIndicator == null ? Optional.empty() : Optional.of(multipleDemandIndicator);
	}

	public Undertaking3 setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = multipleDemandIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPartialDemandIndicator() {
		return partialDemandIndicator == null ? Optional.empty() : Optional.of(partialDemandIndicator);
	}

	public Undertaking3 setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = partialDemandIndicator;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy == null ? Optional.empty() : Optional.of(confirmationChargesPayableBy);
	}

	public Undertaking3 setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getTransferChargesPayableBy() {
		return transferChargesPayableBy == null ? Optional.empty() : Optional.of(transferChargesPayableBy);
	}

	public Undertaking3 setTransferChargesPayableBy(ExternalTypeOfParty1Code transferChargesPayableBy) {
		this.transferChargesPayableBy = transferChargesPayableBy;
		return this;
	}

	public List<AutomaticVariation1> getAutomaticAmountVariation() {
		return automaticAmountVariation == null ? automaticAmountVariation = new ArrayList<>() : automaticAmountVariation;
	}

	public Undertaking3 setAutomaticAmountVariation(List<AutomaticVariation1> automaticAmountVariation) {
		this.automaticAmountVariation = Objects.requireNonNull(automaticAmountVariation);
		return this;
	}

	public Optional<CommunicationChannel1> getDeliveryChannel() {
		return deliveryChannel == null ? Optional.empty() : Optional.of(deliveryChannel);
	}

	public Undertaking3 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
		return this;
	}

	public Optional<YesNoIndicator> getTransferIndicator() {
		return transferIndicator == null ? Optional.empty() : Optional.of(transferIndicator);
	}

	public Undertaking3 setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public Undertaking3 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Undertaking3 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<Undertaking4> getRequestedLocalUndertaking() {
		return requestedLocalUndertaking == null ? Optional.empty() : Optional.of(requestedLocalUndertaking);
	}

	public Undertaking3 setRequestedLocalUndertaking(Undertaking4 requestedLocalUndertaking) {
		this.requestedLocalUndertaking = requestedLocalUndertaking;
		return this;
	}
}