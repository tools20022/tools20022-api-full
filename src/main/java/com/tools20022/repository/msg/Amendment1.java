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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentV01;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmSequenceNumber
 * Amendment1.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmDateOfIssuance
 * Amendment1.mmDateOfIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmUndertakingIdentification
 * Amendment1.mmUndertakingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmAdvisingParty
 * Amendment1.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmSecondAdvisingParty
 * Amendment1.mmSecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmTerminationDetails
 * Amendment1.mmTerminationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmUndertakingAmountAdjustment
 * Amendment1.mmUndertakingAmountAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmNewExpiryDetails
 * Amendment1.mmNewExpiryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmNewBeneficiary
 * Amendment1.mmNewBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmNewUndertakingTermsAndConditions
 * Amendment1.mmNewUndertakingTermsAndConditions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmLocalUndertaking
 * Amendment1.mmLocalUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmBeneficiaryConsentRequestIndicator
 * Amendment1.mmBeneficiaryConsentRequestIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmDeliveryChannel
 * Amendment1.mmDeliveryChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmEnclosedFile
 * Amendment1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment1#mmAdditionalInformation
 * Amendment1.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentV01#mmUndertakingAmendmentDetails
 * UndertakingAmendmentV01.mmUndertakingAmendmentDetails}</li>
 * </ul>
 * </li>
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
 * "Amendment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amendment1", propOrder = {"sequenceNumber", "dateOfIssuance", "undertakingIdentification", "advisingParty", "secondAdvisingParty", "terminationDetails", "undertakingAmountAdjustment", "newExpiryDetails", "newBeneficiary",
		"newUndertakingTermsAndConditions", "localUndertaking", "beneficiaryConsentRequestIndicator", "deliveryChannel", "enclosedFile", "additionalInformation"})
public class Amendment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SeqNb", required = true)
	protected Max4AlphaNumericText sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence number assigned by the issuer to each proposed amendment of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment1, Max4AlphaNumericText> mmSequenceNumber = new MMMessageAttribute<Amendment1, Max4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequence number assigned by the issuer to each proposed amendment of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Amendment1 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(Amendment1 obj, Max4AlphaNumericText value) {
			obj.setSequenceNumber(value);
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
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmDateOfIssuance
	 * AmendmentOfUndertaking.mmDateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * definition} = "Date on which the proposed amendment is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment1, ISODate> mmDateOfIssuance = new MMMessageAttribute<Amendment1, ISODate>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmDateOfIssuance;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuance";
			definition = "Date on which the proposed amendment is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Amendment1 obj) {
			return obj.getDateOfIssuance();
		}

		@Override
		public void setValue(Amendment1 obj, ISODate value) {
			obj.setDateOfIssuance(value);
		}
	};
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking7 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking7
	 * Undertaking7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
	 * Undertaking.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Undertaking7> mmUndertakingIdentification = new MMMessageAssociationEnd<Amendment1, Undertaking7>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking7.mmObject();
		}

		@Override
		public Undertaking7 getValue(Amendment1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(Amendment1 obj, Undertaking7 value) {
			obj.setUndertakingIdentification(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * "Party asked to advise the proposed amendment to the beneficiary or to another advising party at the request of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>> mmAdvisingParty = new MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the proposed amendment to the beneficiary or to another advising party at the request of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Amendment1 obj) {
			return obj.getAdvisingParty();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<PartyIdentification43> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * definition} = "Additional party asked to advise the proposed amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>> mmSecondAdvisingParty = new MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party asked to advise the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Amendment1 obj) {
			return obj.getSecondAdvisingParty();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<PartyIdentification43> value) {
			obj.setSecondAdvisingParty(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details concerning the requested termination of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<UndertakingTermination3>> mmTerminationDetails = new MMMessageAssociationEnd<Amendment1, Optional<UndertakingTermination3>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
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
		public Optional<UndertakingTermination3> getValue(Amendment1 obj) {
			return obj.getTerminationDetails();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<UndertakingTermination3> value) {
			obj.setTerminationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UdrtkgAmtAdjstmnt")
	protected UndertakingAmount2 undertakingAmountAdjustment;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmtAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmountAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested increase or decrease to the amount of for the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<UndertakingAmount2>> mmUndertakingAmountAdjustment = new MMMessageAssociationEnd<Amendment1, Optional<UndertakingAmount2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmtAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmountAdjustment";
			definition = "Requested increase or decrease to the amount of for the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UndertakingAmount2.mmObject();
		}

		@Override
		public Optional<UndertakingAmount2> getValue(Amendment1 obj) {
			return obj.getUndertakingAmountAdjustment();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<UndertakingAmount2> value) {
			obj.setUndertakingAmountAdjustment(value.orElse(null));
		}
	};
	@XmlElement(name = "NewXpryDtls")
	protected ExpiryDetails1 newExpiryDetails;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewXpryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new expiry terms for the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<ExpiryDetails1>> mmNewExpiryDetails = new MMMessageAssociationEnd<Amendment1, Optional<ExpiryDetails1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Requested new expiry terms for the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpiryDetails1.mmObject();
		}

		@Override
		public Optional<ExpiryDetails1> getValue(Amendment1 obj) {
			return obj.getNewExpiryDetails();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<ExpiryDetails1> value) {
			obj.setNewExpiryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBnfcry")
	protected PartyIdentification43 newBeneficiary;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new beneficiary of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>> mmNewBeneficiary = new MMMessageAssociationEnd<Amendment1, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Requested new beneficiary of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Amendment1 obj) {
			return obj.getNewBeneficiary();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<PartyIdentification43> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgTermsAndConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested new terms and conditions of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, List<Narrative1>> mmNewUndertakingTermsAndConditions = new MMMessageAssociationEnd<Amendment1, List<Narrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
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
		public List<Narrative1> getValue(Amendment1 obj) {
			return obj.getNewUndertakingTermsAndConditions();
		}

		@Override
		public void setValue(Amendment1 obj, List<Narrative1> value) {
			obj.setNewUndertakingTermsAndConditions(value);
		}
	};
	@XmlElement(name = "LclUdrtkg")
	protected Undertaking11 localUndertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Undertaking11
	 * Undertaking11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclUdrtkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment details related to the local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment1, Optional<Undertaking11>> mmLocalUndertaking = new MMMessageAttribute<Amendment1, Optional<Undertaking11>>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "LclUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalUndertaking";
			definition = "Amendment details related to the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Undertaking11.mmObject();
		}

		@Override
		public Optional<Undertaking11> getValue(Amendment1 obj) {
			return obj.getLocalUndertaking();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<Undertaking11> value) {
			obj.setLocalUndertaking(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryCnsntReqInd")
	protected YesNoIndicator beneficiaryConsentRequestIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmBeneficiaryConsentRequestIndicator
	 * AmendmentOfUndertaking.mmBeneficiaryConsentRequestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryCnsntReqInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryConsentRequestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not consent is requested from the beneficiary."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment1, Optional<YesNoIndicator>> mmBeneficiaryConsentRequestIndicator = new MMMessageAttribute<Amendment1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmBeneficiaryConsentRequestIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCnsntReqInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryConsentRequestIndicator";
			definition = "Indicates whether or not consent is requested from the beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Amendment1 obj) {
			return obj.getBeneficiaryConsentRequestIndicator();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<YesNoIndicator> value) {
			obj.setBeneficiaryConsentRequestIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * definition} =
	 * "Communication channel for delivery of the proposed amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, Optional<CommunicationChannel1>> mmDeliveryChannel = new MMMessageAssociationEnd<Amendment1, Optional<CommunicationChannel1>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Communication channel for delivery of the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationChannel1.mmObject();
		}

		@Override
		public Optional<CommunicationChannel1> getValue(Amendment1 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Amendment1 obj, Optional<CommunicationChannel1> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * definition} = "Document or template enclosed in the proposed amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment1, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<Amendment1, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the proposed amendment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(Amendment1 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(Amendment1 obj, List<Document9> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment1
	 * Amendment1}</li>
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
	 * definition} = "Additional information related to the proposed amendment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Amendment1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the proposed amendment.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Amendment1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Amendment1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment1.mmSequenceNumber, com.tools20022.repository.msg.Amendment1.mmDateOfIssuance,
						com.tools20022.repository.msg.Amendment1.mmUndertakingIdentification, com.tools20022.repository.msg.Amendment1.mmAdvisingParty, com.tools20022.repository.msg.Amendment1.mmSecondAdvisingParty,
						com.tools20022.repository.msg.Amendment1.mmTerminationDetails, com.tools20022.repository.msg.Amendment1.mmUndertakingAmountAdjustment, com.tools20022.repository.msg.Amendment1.mmNewExpiryDetails,
						com.tools20022.repository.msg.Amendment1.mmNewBeneficiary, com.tools20022.repository.msg.Amendment1.mmNewUndertakingTermsAndConditions, com.tools20022.repository.msg.Amendment1.mmLocalUndertaking,
						com.tools20022.repository.msg.Amendment1.mmBeneficiaryConsentRequestIndicator, com.tools20022.repository.msg.Amendment1.mmDeliveryChannel, com.tools20022.repository.msg.Amendment1.mmEnclosedFile,
						com.tools20022.repository.msg.Amendment1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentV01.mmUndertakingAmendmentDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment1";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max4AlphaNumericText getSequenceNumber() {
		return sequenceNumber;
	}

	public Amendment1 setSequenceNumber(Max4AlphaNumericText sequenceNumber) {
		this.sequenceNumber = Objects.requireNonNull(sequenceNumber);
		return this;
	}

	public ISODate getDateOfIssuance() {
		return dateOfIssuance;
	}

	public Amendment1 setDateOfIssuance(ISODate dateOfIssuance) {
		this.dateOfIssuance = Objects.requireNonNull(dateOfIssuance);
		return this;
	}

	public Undertaking7 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public Amendment1 setUndertakingIdentification(Undertaking7 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public Optional<PartyIdentification43> getAdvisingParty() {
		return advisingParty == null ? Optional.empty() : Optional.of(advisingParty);
	}

	public Amendment1 setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
		return this;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return secondAdvisingParty == null ? Optional.empty() : Optional.of(secondAdvisingParty);
	}

	public Amendment1 setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
		return this;
	}

	public Optional<UndertakingTermination3> getTerminationDetails() {
		return terminationDetails == null ? Optional.empty() : Optional.of(terminationDetails);
	}

	public Amendment1 setTerminationDetails(UndertakingTermination3 terminationDetails) {
		this.terminationDetails = terminationDetails;
		return this;
	}

	public Optional<UndertakingAmount2> getUndertakingAmountAdjustment() {
		return undertakingAmountAdjustment == null ? Optional.empty() : Optional.of(undertakingAmountAdjustment);
	}

	public Amendment1 setUndertakingAmountAdjustment(UndertakingAmount2 undertakingAmountAdjustment) {
		this.undertakingAmountAdjustment = undertakingAmountAdjustment;
		return this;
	}

	public Optional<ExpiryDetails1> getNewExpiryDetails() {
		return newExpiryDetails == null ? Optional.empty() : Optional.of(newExpiryDetails);
	}

	public Amendment1 setNewExpiryDetails(ExpiryDetails1 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
		return this;
	}

	public Optional<PartyIdentification43> getNewBeneficiary() {
		return newBeneficiary == null ? Optional.empty() : Optional.of(newBeneficiary);
	}

	public Amendment1 setNewBeneficiary(PartyIdentification43 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
		return this;
	}

	public List<Narrative1> getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions == null ? newUndertakingTermsAndConditions = new ArrayList<>() : newUndertakingTermsAndConditions;
	}

	public Amendment1 setNewUndertakingTermsAndConditions(List<Narrative1> newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = Objects.requireNonNull(newUndertakingTermsAndConditions);
		return this;
	}

	public Optional<Undertaking11> getLocalUndertaking() {
		return localUndertaking == null ? Optional.empty() : Optional.of(localUndertaking);
	}

	public Amendment1 setLocalUndertaking(Undertaking11 localUndertaking) {
		this.localUndertaking = localUndertaking;
		return this;
	}

	public Optional<YesNoIndicator> getBeneficiaryConsentRequestIndicator() {
		return beneficiaryConsentRequestIndicator == null ? Optional.empty() : Optional.of(beneficiaryConsentRequestIndicator);
	}

	public Amendment1 setBeneficiaryConsentRequestIndicator(YesNoIndicator beneficiaryConsentRequestIndicator) {
		this.beneficiaryConsentRequestIndicator = beneficiaryConsentRequestIndicator;
		return this;
	}

	public Optional<CommunicationChannel1> getDeliveryChannel() {
		return deliveryChannel == null ? Optional.empty() : Optional.of(deliveryChannel);
	}

	public Amendment1 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public Amendment1 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Amendment1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}