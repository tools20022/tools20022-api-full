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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
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
 * Details of the amendent request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmApplicantRequestNumber
 * Amendment3.mmApplicantRequestNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmUndertakingIdentification
 * Amendment3.mmUndertakingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmApplicant
 * Amendment3.mmApplicant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmTerminationDetails
 * Amendment3.mmTerminationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmIncreaseDecreaseAmount
 * Amendment3.mmIncreaseDecreaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmNewExpiryDetails
 * Amendment3.mmNewExpiryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmNewBeneficiary
 * Amendment3.mmNewBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmNewUndertakingTermsAndConditions
 * Amendment3.mmNewUndertakingTermsAndConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmCounterUndertaking
 * Amendment3.mmCounterUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmDeliveryChannel
 * Amendment3.mmDeliveryChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmEnclosedFile
 * Amendment3.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment3#mmAdditionalInformation
 * Amendment3.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01#mmUndertakingAmendmentRequestDetails
 * UndertakingAmendmentRequestV01.mmUndertakingAmendmentRequestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Amendment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendent request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amendment3", propOrder = {"applicantRequestNumber", "undertakingIdentification", "applicant", "terminationDetails", "increaseDecreaseAmount", "newExpiryDetails", "newBeneficiary", "newUndertakingTermsAndConditions",
		"counterUndertaking", "deliveryChannel", "enclosedFile", "additionalInformation"})
public class Amendment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ApplcntReqNb", required = true)
	protected Max35Text applicantRequestNumber;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntReqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantRequestNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking amendment request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment3, Max35Text> mmApplicantRequestNumber = new MMMessageAttribute<Amendment3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "ApplcntReqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantRequestNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking amendment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Amendment3 obj) {
			return obj.getApplicantRequestNumber();
		}

		@Override
		public void setValue(Amendment3 obj, Max35Text value) {
			obj.setApplicantRequestNumber(value);
		}
	};
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking9 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking9
	 * Undertaking9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Undertaking9> mmUndertakingIdentification = new MMMessageAssociationEnd<Amendment3, Undertaking9>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking9.mmObject();
		}

		@Override
		public Undertaking9 getValue(Amendment3 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(Amendment3 obj, Undertaking9 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "Applcnt", required = true)
	protected PartyIdentification43 applicant;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Applcnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Applicant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party requesting the issuance of the amendment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, PartyIdentification43> mmApplicant = new MMMessageAssociationEnd<Amendment3, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party requesting the issuance of the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(Amendment3 obj) {
			return obj.getApplicant();
		}

		@Override
		public void setValue(Amendment3 obj, PartyIdentification43 value) {
			obj.setApplicant(value);
		}
	};
	@XmlElement(name = "TermntnDtls")
	protected UndertakingTermination3 terminationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3
	 * UndertakingTermination3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
	 * Undertaking.mmUndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details concerning the requested termination of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Optional<UndertakingTermination3>> mmTerminationDetails = new MMMessageAssociationEnd<Amendment3, Optional<UndertakingTermination3>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "TermntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDetails";
			definition = "Details concerning the requested termination of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UndertakingTermination3.mmObject();
		}

		@Override
		public Optional<UndertakingTermination3> getValue(Amendment3 obj) {
			return obj.getTerminationDetails();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<UndertakingTermination3> value) {
			obj.setTerminationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "IncrDcrAmt")
	protected UndertakingAmount2 increaseDecreaseAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UndertakingAmount2
	 * UndertakingAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrDcrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseDecreaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of the amount of increase or decrease to the undertaking amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Optional<UndertakingAmount2>> mmIncreaseDecreaseAmount = new MMMessageAssociationEnd<Amendment3, Optional<UndertakingAmount2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "IncrDcrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseDecreaseAmount";
			definition = "Indication of the amount of increase or decrease to the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UndertakingAmount2.mmObject();
		}

		@Override
		public Optional<UndertakingAmount2> getValue(Amendment3 obj) {
			return obj.getIncreaseDecreaseAmount();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<UndertakingAmount2> value) {
			obj.setIncreaseDecreaseAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NewXpryDtls")
	protected ExpiryDetails2 newExpiryDetails;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewXpryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new expiry terms for the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Optional<ExpiryDetails2>> mmNewExpiryDetails = new MMMessageAssociationEnd<Amendment3, Optional<ExpiryDetails2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Requested new expiry terms for the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpiryDetails2.mmObject();
		}

		@Override
		public Optional<ExpiryDetails2> getValue(Amendment3 obj) {
			return obj.getNewExpiryDetails();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<ExpiryDetails2> value) {
			obj.setNewExpiryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBnfcry")
	protected Beneficiary1 newBeneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Beneficiary1
	 * Beneficiary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingBeneficiary
	 * UndertakingBeneficiary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new beneficiary of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Optional<Beneficiary1>> mmNewBeneficiary = new MMMessageAssociationEnd<Amendment3, Optional<Beneficiary1>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Requested new beneficiary of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Beneficiary1.mmObject();
		}

		@Override
		public Optional<Beneficiary1> getValue(Amendment3 obj) {
			return obj.getNewBeneficiary();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<Beneficiary1> value) {
			obj.setNewBeneficiary(value.orElse(null));
		}
	};
	@XmlElement(name = "NewUdrtkgTermsAndConds")
	protected List<Narrative1> newUndertakingTermsAndConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Narrative1 Narrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgTermsAndConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new terms and conditions of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, List<Narrative1>> mmNewUndertakingTermsAndConditions = new MMMessageAssociationEnd<Amendment3, List<Narrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingTermsAndConditions";
			definition = "Requested new terms and conditions of the undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Narrative1.mmObject();
		}

		@Override
		public List<Narrative1> getValue(Amendment3 obj) {
			return obj.getNewUndertakingTermsAndConditions();
		}

		@Override
		public void setValue(Amendment3 obj, List<Narrative1> value) {
			obj.setNewUndertakingTermsAndConditions(value);
		}
	};
	@XmlElement(name = "CntrUdrtkg")
	protected Undertaking10 counterUndertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Undertaking10
	 * Undertaking10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrUdrtkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment details related to the counter-undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment3, Optional<Undertaking10>> mmCounterUndertaking = new MMMessageAttribute<Amendment3, Optional<Undertaking10>>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertaking";
			definition = "Amendment details related to the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Undertaking10.mmObject();
		}

		@Override
		public Optional<Undertaking10> getValue(Amendment3 obj) {
			return obj.getCounterUndertaking();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<Undertaking10> value) {
			obj.setCounterUndertaking(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryChanl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication channel for delivery of the amendment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, Optional<CommunicationChannel1>> mmDeliveryChannel = new MMMessageAssociationEnd<Amendment3, Optional<CommunicationChannel1>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Communication channel for delivery of the amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationChannel1.mmObject();
		}

		@Override
		public Optional<CommunicationChannel1> getValue(Amendment3 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Amendment3 obj, Optional<CommunicationChannel1> value) {
			obj.setDeliveryChannel(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document or template enclosed in the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment3, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<Amendment3, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(Amendment3 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(Amendment3 obj, List<Document9> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment3, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Amendment3, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the request.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Amendment3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Amendment3 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment3.mmApplicantRequestNumber, com.tools20022.repository.msg.Amendment3.mmUndertakingIdentification,
						com.tools20022.repository.msg.Amendment3.mmApplicant, com.tools20022.repository.msg.Amendment3.mmTerminationDetails, com.tools20022.repository.msg.Amendment3.mmIncreaseDecreaseAmount,
						com.tools20022.repository.msg.Amendment3.mmNewExpiryDetails, com.tools20022.repository.msg.Amendment3.mmNewBeneficiary, com.tools20022.repository.msg.Amendment3.mmNewUndertakingTermsAndConditions,
						com.tools20022.repository.msg.Amendment3.mmCounterUndertaking, com.tools20022.repository.msg.Amendment3.mmDeliveryChannel, com.tools20022.repository.msg.Amendment3.mmEnclosedFile,
						com.tools20022.repository.msg.Amendment3.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentRequestV01.mmUndertakingAmendmentRequestDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment3";
				definition = "Details of the amendent request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicantRequestNumber() {
		return applicantRequestNumber;
	}

	public Amendment3 setApplicantRequestNumber(Max35Text applicantRequestNumber) {
		this.applicantRequestNumber = Objects.requireNonNull(applicantRequestNumber);
		return this;
	}

	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public Amendment3 setUndertakingIdentification(Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public PartyIdentification43 getApplicant() {
		return applicant;
	}

	public Amendment3 setApplicant(PartyIdentification43 applicant) {
		this.applicant = Objects.requireNonNull(applicant);
		return this;
	}

	public Optional<UndertakingTermination3> getTerminationDetails() {
		return terminationDetails == null ? Optional.empty() : Optional.of(terminationDetails);
	}

	public Amendment3 setTerminationDetails(UndertakingTermination3 terminationDetails) {
		this.terminationDetails = terminationDetails;
		return this;
	}

	public Optional<UndertakingAmount2> getIncreaseDecreaseAmount() {
		return increaseDecreaseAmount == null ? Optional.empty() : Optional.of(increaseDecreaseAmount);
	}

	public Amendment3 setIncreaseDecreaseAmount(UndertakingAmount2 increaseDecreaseAmount) {
		this.increaseDecreaseAmount = increaseDecreaseAmount;
		return this;
	}

	public Optional<ExpiryDetails2> getNewExpiryDetails() {
		return newExpiryDetails == null ? Optional.empty() : Optional.of(newExpiryDetails);
	}

	public Amendment3 setNewExpiryDetails(ExpiryDetails2 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
		return this;
	}

	public Optional<Beneficiary1> getNewBeneficiary() {
		return newBeneficiary == null ? Optional.empty() : Optional.of(newBeneficiary);
	}

	public Amendment3 setNewBeneficiary(Beneficiary1 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
		return this;
	}

	public List<Narrative1> getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions == null ? newUndertakingTermsAndConditions = new ArrayList<>() : newUndertakingTermsAndConditions;
	}

	public Amendment3 setNewUndertakingTermsAndConditions(List<Narrative1> newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = Objects.requireNonNull(newUndertakingTermsAndConditions);
		return this;
	}

	public Optional<Undertaking10> getCounterUndertaking() {
		return counterUndertaking == null ? Optional.empty() : Optional.of(counterUndertaking);
	}

	public Amendment3 setCounterUndertaking(Undertaking10 counterUndertaking) {
		this.counterUndertaking = counterUndertaking;
		return this;
	}

	public Optional<CommunicationChannel1> getDeliveryChannel() {
		return deliveryChannel == null ? Optional.empty() : Optional.of(deliveryChannel);
	}

	public Amendment3 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public Amendment3 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Amendment3 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}