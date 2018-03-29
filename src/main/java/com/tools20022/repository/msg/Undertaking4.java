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
import com.tools20022.repository.codeset.ExternalTypeOfParty1Code;
import com.tools20022.repository.codeset.ExternalUndertakingType1Code;
import com.tools20022.repository.codeset.UndertakingName1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
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
 * Information about an undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmName
 * Undertaking4.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmType
 * Undertaking4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmApplicant
 * Undertaking4.mmApplicant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmBeneficiary
 * Undertaking4.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmDateOfIssuance
 * Undertaking4.mmDateOfIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmAdvisingParty
 * Undertaking4.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmSecondAdvisingParty
 * Undertaking4.mmSecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmLocalUndertakingAmount
 * Undertaking4.mmLocalUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmExpiryDetails
 * Undertaking4.mmExpiryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmConfirmationIndicator
 * Undertaking4.mmConfirmationIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmAdditionalParty
 * Undertaking4.mmAdditionalParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmGovernanceRulesAndLaw
 * Undertaking4.mmGovernanceRulesAndLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmUnderlyingTransaction
 * Undertaking4.mmUnderlyingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmPresentationDetails
 * Undertaking4.mmPresentationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmUndertakingWording
 * Undertaking4.mmUndertakingWording}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmMultipleDemandIndicator
 * Undertaking4.mmMultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmPartialDemandIndicator
 * Undertaking4.mmPartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmConfirmationChargesPayableBy
 * Undertaking4.mmConfirmationChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmTransferChargesPayableBy
 * Undertaking4.mmTransferChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmAutomaticAmountVariation
 * Undertaking4.mmAutomaticAmountVariation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmDeliveryChannel
 * Undertaking4.mmDeliveryChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmTransferIndicator
 * Undertaking4.mmTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmAdditionalInformation
 * Undertaking4.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleDemandIndicatorRule#forUndertaking4
 * ConstraintMultipleDemandIndicatorRule.forUndertaking4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Undertaking4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about an undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking4", propOrder = {"name", "type", "applicant", "beneficiary", "dateOfIssuance", "advisingParty", "secondAdvisingParty", "localUndertakingAmount", "expiryDetails", "confirmationIndicator", "additionalParty",
		"governanceRulesAndLaw", "underlyingTransaction", "presentationDetails", "undertakingWording", "multipleDemandIndicator", "partialDemandIndicator", "confirmationChargesPayableBy", "transferChargesPayableBy",
		"automaticAmountVariation", "deliveryChannel", "transferIndicator", "additionalInformation"})
public class Undertaking4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Name of the requested local undertaking such as, demand guarantee, standby letter of credit, surety."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, UndertakingName1Code> mmName = new MMMessageAttribute<Undertaking4, UndertakingName1Code>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the requested local undertaking such as, demand guarantee, standby letter of credit, surety.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingName1Code.mmObject();
		}

		@Override
		public UndertakingName1Code getValue(Undertaking4 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Undertaking4 obj, UndertakingName1Code value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected ExternalUndertakingType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingType1Code
	 * ExternalUndertakingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmType
	 * Undertaking.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Type of the requested local undertaking such as performance, payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, ExternalUndertakingType1Code> mmType = new MMMessageAttribute<Undertaking4, ExternalUndertakingType1Code>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the requested local undertaking such as performance, payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingType1Code.mmObject();
		}

		@Override
		public ExternalUndertakingType1Code getValue(Undertaking4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Undertaking4 obj, ExternalUndertakingType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Applcnt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Party requested to be named in the local undertaking as the party on whose behalf the undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, List<PartyIdentification43>> mmApplicant = new MMMessageAssociationEnd<Undertaking4, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingApplicant.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party requested to be named in the local undertaking as the party on whose behalf the undertaking is issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking4 obj) {
			return obj.getApplicant();
		}

		@Override
		public void setValue(Undertaking4 obj, List<PartyIdentification43> value) {
			obj.setApplicant(value);
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Party in whose favour the requested local undertaking is to be issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, List<PartyIdentification43>> mmBeneficiary = new MMMessageAssociationEnd<Undertaking4, List<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Party in whose favour the requested local undertaking is to be issued.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public List<PartyIdentification43> getValue(Undertaking4 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(Undertaking4 obj, List<PartyIdentification43> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "DtOfIssnc")
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Date on which the requested local undertaking is to be issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, Optional<ISODate>> mmDateOfIssuance = new MMMessageAttribute<Undertaking4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuance";
			definition = "Date on which the requested local undertaking is to be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Undertaking4 obj) {
			return obj.getDateOfIssuance();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<ISODate> value) {
			obj.setDateOfIssuance(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Party asked to advise the requested local undertaking to the beneficiary or to another advising party at the request of the local undertaking issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, Optional<PartyIdentification43>> mmAdvisingParty = new MMMessageAssociationEnd<Undertaking4, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the requested local undertaking to the beneficiary or to another advising party at the request of the local undertaking issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking4 obj) {
			return obj.getAdvisingParty();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<PartyIdentification43> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Additional party asked to advise the requested local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, Optional<PartyIdentification43>> mmSecondAdvisingParty = new MMMessageAssociationEnd<Undertaking4, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party asked to advise the requested local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking4 obj) {
			return obj.getSecondAdvisingParty();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<PartyIdentification43> value) {
			obj.setSecondAdvisingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "LclUdrtkgAmt", required = true)
	protected UndertakingAmount1 localUndertakingAmount;
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclUdrtkgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the amount of the local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, UndertakingAmount1> mmLocalUndertakingAmount = new MMMessageAssociationEnd<Undertaking4, UndertakingAmount1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "LclUdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalUndertakingAmount";
			definition = "Details related to the amount of the local undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmount1.mmObject();
		}

		@Override
		public UndertakingAmount1 getValue(Undertaking4 obj) {
			return obj.getLocalUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking4 obj, UndertakingAmount1 value) {
			obj.setLocalUndertakingAmount(value);
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Details related to the expiry of the requested local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, ExpiryDetails1> mmExpiryDetails = new MMMessageAssociationEnd<Undertaking4, ExpiryDetails1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry of the requested local undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExpiryDetails1.mmObject();
		}

		@Override
		public ExpiryDetails1 getValue(Undertaking4 obj) {
			return obj.getExpiryDetails();
		}

		@Override
		public void setValue(Undertaking4 obj, ExpiryDetails1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>> mmConfirmationIndicator = new MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmConfirmationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<YesNoIndicator> getValue(Undertaking4 obj) {
			return obj.getConfirmationIndicator();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<YesNoIndicator> value) {
			obj.setConfirmationIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Party, in addition to the other parties specified in the requested local undertaking, that is also related to the requested local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, List<PartyAndType1>> mmAdditionalParty = new MMMessageAssociationEnd<Undertaking4, List<PartyAndType1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "AddtlPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParty";
			definition = "Party, in addition to the other parties specified in the requested local undertaking, that is also related to the requested local undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyAndType1.mmObject();
		}

		@Override
		public List<PartyAndType1> getValue(Undertaking4 obj) {
			return obj.getAdditionalParty();
		}

		@Override
		public void setValue(Undertaking4 obj, List<PartyAndType1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} = "Rules and laws governing the requested local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, GovernanceRules1> mmGovernanceRulesAndLaw = new MMMessageAssociationEnd<Undertaking4, GovernanceRules1>() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "GovncRulesAndLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernanceRulesAndLaw";
			definition = "Rules and laws governing the requested local undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GovernanceRules1.mmObject();
		}

		@Override
		public GovernanceRules1 getValue(Undertaking4 obj) {
			return obj.getGovernanceRulesAndLaw();
		}

		@Override
		public void setValue(Undertaking4 obj, GovernanceRules1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAssociationEnd<Undertaking4, List<UnderlyingTradeTransaction1>> mmUnderlyingTransaction = new MMMessageAssociationEnd<Undertaking4, List<UnderlyingTradeTransaction1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUnderlyingTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public List<UnderlyingTradeTransaction1> getValue(Undertaking4 obj) {
			return obj.getUnderlyingTransaction();
		}

		@Override
		public void setValue(Undertaking4 obj, List<UnderlyingTradeTransaction1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAssociationEnd<Undertaking4, Optional<Presentation1>> mmPresentationDetails = new MMMessageAssociationEnd<Undertaking4, Optional<Presentation1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPresentation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<Presentation1> getValue(Undertaking4 obj) {
			return obj.getPresentationDetails();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<Presentation1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Wording details and text for the requested local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking4, UndertakingWording1> mmUndertakingWording = new MMMessageAssociationEnd<Undertaking4, UndertakingWording1>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmModelForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgWrdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingWording";
			definition = "Wording details and text for the requested local undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingWording1.mmObject();
		}

		@Override
		public UndertakingWording1 getValue(Undertaking4 obj) {
			return obj.getUndertakingWording();
		}

		@Override
		public void setValue(Undertaking4 obj, UndertakingWording1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>> mmMultipleDemandIndicator = new MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmMultipleDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<YesNoIndicator> getValue(Undertaking4 obj) {
			return obj.getMultipleDemandIndicator();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>> mmPartialDemandIndicator = new MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPartialDemandIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<YesNoIndicator> getValue(Undertaking4 obj) {
			return obj.getPartialDemandIndicator();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, Optional<ExternalTypeOfParty1Code>> mmConfirmationChargesPayableBy = new MMMessageAttribute<Undertaking4, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking4 obj) {
			return obj.getConfirmationChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<ExternalTypeOfParty1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the transfer charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, Optional<ExternalTypeOfParty1Code>> mmTransferChargesPayableBy = new MMMessageAttribute<Undertaking4, Optional<ExternalTypeOfParty1Code>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<ExternalTypeOfParty1Code> getValue(Undertaking4 obj) {
			return obj.getTransferChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<ExternalTypeOfParty1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAssociationEnd<Undertaking4, List<AutomaticVariation1>> mmAutomaticAmountVariation = new MMMessageAssociationEnd<Undertaking4, List<AutomaticVariation1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmPredefinedVariation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public List<AutomaticVariation1> getValue(Undertaking4 obj) {
			return obj.getAutomaticAmountVariation();
		}

		@Override
		public void setValue(Undertaking4 obj, List<AutomaticVariation1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	public static final MMMessageAssociationEnd<Undertaking4, Optional<CommunicationChannel1>> mmDeliveryChannel = new MMMessageAssociationEnd<Undertaking4, Optional<CommunicationChannel1>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
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
		public Optional<CommunicationChannel1> getValue(Undertaking4 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<CommunicationChannel1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Indicates whether the requested local undertaking is transferable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>> mmTransferIndicator = new MMMessageAttribute<Undertaking4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "TrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the requested local undertaking is transferable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Undertaking4 obj) {
			return obj.getTransferIndicator();
		}

		@Override
		public void setValue(Undertaking4 obj, Optional<YesNoIndicator> value) {
			obj.setTransferIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
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
	 * definition} =
	 * "Additional information related to the requested local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking4, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Undertaking4, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking4.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the requested local undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Undertaking4 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Undertaking4 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking4.mmName, com.tools20022.repository.msg.Undertaking4.mmType, com.tools20022.repository.msg.Undertaking4.mmApplicant,
						com.tools20022.repository.msg.Undertaking4.mmBeneficiary, com.tools20022.repository.msg.Undertaking4.mmDateOfIssuance, com.tools20022.repository.msg.Undertaking4.mmAdvisingParty,
						com.tools20022.repository.msg.Undertaking4.mmSecondAdvisingParty, com.tools20022.repository.msg.Undertaking4.mmLocalUndertakingAmount, com.tools20022.repository.msg.Undertaking4.mmExpiryDetails,
						com.tools20022.repository.msg.Undertaking4.mmConfirmationIndicator, com.tools20022.repository.msg.Undertaking4.mmAdditionalParty, com.tools20022.repository.msg.Undertaking4.mmGovernanceRulesAndLaw,
						com.tools20022.repository.msg.Undertaking4.mmUnderlyingTransaction, com.tools20022.repository.msg.Undertaking4.mmPresentationDetails, com.tools20022.repository.msg.Undertaking4.mmUndertakingWording,
						com.tools20022.repository.msg.Undertaking4.mmMultipleDemandIndicator, com.tools20022.repository.msg.Undertaking4.mmPartialDemandIndicator, com.tools20022.repository.msg.Undertaking4.mmConfirmationChargesPayableBy,
						com.tools20022.repository.msg.Undertaking4.mmTransferChargesPayableBy, com.tools20022.repository.msg.Undertaking4.mmAutomaticAmountVariation, com.tools20022.repository.msg.Undertaking4.mmDeliveryChannel,
						com.tools20022.repository.msg.Undertaking4.mmTransferIndicator, com.tools20022.repository.msg.Undertaking4.mmAdditionalInformation);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMultipleDemandIndicatorRule.forUndertaking4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking4";
				definition = "Information about an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingName1Code getName() {
		return name;
	}

	public Undertaking4 setName(UndertakingName1Code name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public ExternalUndertakingType1Code getType() {
		return type;
	}

	public Undertaking4 setType(ExternalUndertakingType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<PartyIdentification43> getApplicant() {
		return applicant == null ? applicant = new ArrayList<>() : applicant;
	}

	public Undertaking4 setApplicant(List<PartyIdentification43> applicant) {
		this.applicant = Objects.requireNonNull(applicant);
		return this;
	}

	public List<PartyIdentification43> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public Undertaking4 setBeneficiary(List<PartyIdentification43> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public Optional<ISODate> getDateOfIssuance() {
		return dateOfIssuance == null ? Optional.empty() : Optional.of(dateOfIssuance);
	}

	public Undertaking4 setDateOfIssuance(ISODate dateOfIssuance) {
		this.dateOfIssuance = dateOfIssuance;
		return this;
	}

	public Optional<PartyIdentification43> getAdvisingParty() {
		return advisingParty == null ? Optional.empty() : Optional.of(advisingParty);
	}

	public Undertaking4 setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
		return this;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return secondAdvisingParty == null ? Optional.empty() : Optional.of(secondAdvisingParty);
	}

	public Undertaking4 setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
		return this;
	}

	public UndertakingAmount1 getLocalUndertakingAmount() {
		return localUndertakingAmount;
	}

	public Undertaking4 setLocalUndertakingAmount(UndertakingAmount1 localUndertakingAmount) {
		this.localUndertakingAmount = Objects.requireNonNull(localUndertakingAmount);
		return this;
	}

	public ExpiryDetails1 getExpiryDetails() {
		return expiryDetails;
	}

	public Undertaking4 setExpiryDetails(ExpiryDetails1 expiryDetails) {
		this.expiryDetails = Objects.requireNonNull(expiryDetails);
		return this;
	}

	public Optional<YesNoIndicator> getConfirmationIndicator() {
		return confirmationIndicator == null ? Optional.empty() : Optional.of(confirmationIndicator);
	}

	public Undertaking4 setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = confirmationIndicator;
		return this;
	}

	public List<PartyAndType1> getAdditionalParty() {
		return additionalParty == null ? additionalParty = new ArrayList<>() : additionalParty;
	}

	public Undertaking4 setAdditionalParty(List<PartyAndType1> additionalParty) {
		this.additionalParty = Objects.requireNonNull(additionalParty);
		return this;
	}

	public GovernanceRules1 getGovernanceRulesAndLaw() {
		return governanceRulesAndLaw;
	}

	public Undertaking4 setGovernanceRulesAndLaw(GovernanceRules1 governanceRulesAndLaw) {
		this.governanceRulesAndLaw = Objects.requireNonNull(governanceRulesAndLaw);
		return this;
	}

	public List<UnderlyingTradeTransaction1> getUnderlyingTransaction() {
		return underlyingTransaction == null ? underlyingTransaction = new ArrayList<>() : underlyingTransaction;
	}

	public Undertaking4 setUnderlyingTransaction(List<UnderlyingTradeTransaction1> underlyingTransaction) {
		this.underlyingTransaction = Objects.requireNonNull(underlyingTransaction);
		return this;
	}

	public Optional<Presentation1> getPresentationDetails() {
		return presentationDetails == null ? Optional.empty() : Optional.of(presentationDetails);
	}

	public Undertaking4 setPresentationDetails(Presentation1 presentationDetails) {
		this.presentationDetails = presentationDetails;
		return this;
	}

	public UndertakingWording1 getUndertakingWording() {
		return undertakingWording;
	}

	public Undertaking4 setUndertakingWording(UndertakingWording1 undertakingWording) {
		this.undertakingWording = Objects.requireNonNull(undertakingWording);
		return this;
	}

	public Optional<YesNoIndicator> getMultipleDemandIndicator() {
		return multipleDemandIndicator == null ? Optional.empty() : Optional.of(multipleDemandIndicator);
	}

	public Undertaking4 setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = multipleDemandIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getPartialDemandIndicator() {
		return partialDemandIndicator == null ? Optional.empty() : Optional.of(partialDemandIndicator);
	}

	public Undertaking4 setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = partialDemandIndicator;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy == null ? Optional.empty() : Optional.of(confirmationChargesPayableBy);
	}

	public Undertaking4 setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getTransferChargesPayableBy() {
		return transferChargesPayableBy == null ? Optional.empty() : Optional.of(transferChargesPayableBy);
	}

	public Undertaking4 setTransferChargesPayableBy(ExternalTypeOfParty1Code transferChargesPayableBy) {
		this.transferChargesPayableBy = transferChargesPayableBy;
		return this;
	}

	public List<AutomaticVariation1> getAutomaticAmountVariation() {
		return automaticAmountVariation == null ? automaticAmountVariation = new ArrayList<>() : automaticAmountVariation;
	}

	public Undertaking4 setAutomaticAmountVariation(List<AutomaticVariation1> automaticAmountVariation) {
		this.automaticAmountVariation = Objects.requireNonNull(automaticAmountVariation);
		return this;
	}

	public Optional<CommunicationChannel1> getDeliveryChannel() {
		return deliveryChannel == null ? Optional.empty() : Optional.of(deliveryChannel);
	}

	public Undertaking4 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
		return this;
	}

	public Optional<YesNoIndicator> getTransferIndicator() {
		return transferIndicator == null ? Optional.empty() : Optional.of(transferIndicator);
	}

	public Undertaking4 setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Undertaking4 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}