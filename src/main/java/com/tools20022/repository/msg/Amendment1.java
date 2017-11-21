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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Amendment1", propOrder = {"sequenceNumber", "dateOfIssuance", "undertakingIdentification", "advisingParty", "secondAdvisingParty", "terminationDetails", "undertakingAmountAdjustment", "newExpiryDetails", "newBeneficiary",
		"newUndertakingTermsAndConditions", "localUndertaking", "beneficiaryConsentRequestIndicator", "deliveryChannel", "enclosedFile", "additionalInformation"})
public class Amendment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4AlphaNumericText sequenceNumber;
	/**
	 * Sequence number assigned by the issuer to each proposed amendment of the
	 * undertaking.
	 * <p>
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
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequence number assigned by the issuer to each proposed amendment of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected ISODate dateOfIssuance;
	/**
	 * Date on which the proposed amendment is issued.
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
	public static final MMMessageAttribute mmDateOfIssuance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmDateOfIssuance;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "DtOfIssnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfIssuance";
			definition = "Date on which the proposed amendment is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Undertaking7 undertakingIdentification;
	/**
	 * Identification of the undertaking.
	 * <p>
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
	public static final MMMessageAssociationEnd mmUndertakingIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmIdentification;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking7.mmObject();
		}
	};
	protected PartyIdentification43 advisingParty;
	/**
	 * Party asked to advise the proposed amendment to the beneficiary or to
	 * another advising party at the request of the issuer.
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
	public static final MMMessageAssociationEnd mmAdvisingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party asked to advise the proposed amendment to the beneficiary or to another advising party at the request of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 secondAdvisingParty;
	/**
	 * Additional party asked to advise the proposed amendment.
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
	public static final MMMessageAssociationEnd mmSecondAdvisingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party asked to advise the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected UndertakingTermination3 terminationDetails;
	/**
	 * Details concerning the requested termination of the undertaking.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTerminationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingStatus;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "TermntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDetails";
			definition = "Details concerning the requested termination of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingTermination3.mmObject();
		}
	};
	protected UndertakingAmount2 undertakingAmountAdjustment;
	/**
	 * Requested increase or decrease to the amount of for the undertaking.
	 * <p>
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
	public static final MMMessageAssociationEnd mmUndertakingAmountAdjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmtAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmountAdjustment";
			definition = "Requested increase or decrease to the amount of for the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingAmount2.mmObject();
		}
	};
	protected ExpiryDetails1 newExpiryDetails;
	/**
	 * Requested new expiry terms for the undertaking.
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
	 * definition} = "Requested new expiry terms for the undertaking. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewExpiryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Requested new expiry terms for the undertaking. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpiryDetails1.mmObject();
		}
	};
	protected PartyIdentification43 newBeneficiary;
	/**
	 * Requested new beneficiary of the undertaking.
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
	public static final MMMessageAssociationEnd mmNewBeneficiary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Requested new beneficiary of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Narrative1> newUndertakingTermsAndConditions;
	/**
	 * Requested new terms and conditions of the undertaking.
	 * <p>
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
	public static final MMMessageAssociationEnd mmNewUndertakingTermsAndConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingTermsAndConditions";
			definition = "Requested new terms and conditions of the undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Narrative1.mmObject();
		}
	};
	protected Undertaking11 localUndertaking;
	/**
	 * Amendment details related to the local undertaking.
	 * <p>
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
	public static final MMMessageAttribute mmLocalUndertaking = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "LclUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalUndertaking";
			definition = "Amendment details related to the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
		}
	};
	protected YesNoIndicator beneficiaryConsentRequestIndicator;
	/**
	 * Indicates whether or not consent is requested from the beneficiary.
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
	public static final MMMessageAttribute mmBeneficiaryConsentRequestIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmBeneficiaryConsentRequestIndicator;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCnsntReqInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryConsentRequestIndicator";
			definition = "Indicates whether or not consent is requested from the beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * Communication channel for delivery of the proposed amendment.
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
	public static final MMMessageAssociationEnd mmDeliveryChannel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Communication channel for delivery of the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationChannel1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
	/**
	 * Document or template enclosed in the proposed amendment.
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
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the proposed amendment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
		}
	};
	protected List<Max2000Text> additionalInformation;
	/**
	 * Additional information related to the proposed amendment.
	 * <p>
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
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the proposed amendment.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Amendment1.mmSequenceNumber, Amendment1.mmDateOfIssuance, Amendment1.mmUndertakingIdentification, Amendment1.mmAdvisingParty, Amendment1.mmSecondAdvisingParty,
						Amendment1.mmTerminationDetails, Amendment1.mmUndertakingAmountAdjustment, Amendment1.mmNewExpiryDetails, Amendment1.mmNewBeneficiary, Amendment1.mmNewUndertakingTermsAndConditions, Amendment1.mmLocalUndertaking,
						Amendment1.mmBeneficiaryConsentRequestIndicator, Amendment1.mmDeliveryChannel, Amendment1.mmEnclosedFile, Amendment1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentV01.mmUndertakingAmendmentDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment1";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SeqNb", required = true)
	public Max4AlphaNumericText getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Max4AlphaNumericText sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@XmlElement(name = "DtOfIssnc", required = true)
	public ISODate getDateOfIssuance() {
		return dateOfIssuance;
	}

	public void setDateOfIssuance(ISODate dateOfIssuance) {
		this.dateOfIssuance = dateOfIssuance;
	}

	@XmlElement(name = "UdrtkgId", required = true)
	public Undertaking7 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public void setUndertakingIdentification(com.tools20022.repository.msg.Undertaking7 undertakingIdentification) {
		this.undertakingIdentification = undertakingIdentification;
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

	@XmlElement(name = "TermntnDtls")
	public UndertakingTermination3 getTerminationDetails() {
		return terminationDetails;
	}

	public void setTerminationDetails(com.tools20022.repository.msg.UndertakingTermination3 terminationDetails) {
		this.terminationDetails = terminationDetails;
	}

	@XmlElement(name = "UdrtkgAmtAdjstmnt")
	public UndertakingAmount2 getUndertakingAmountAdjustment() {
		return undertakingAmountAdjustment;
	}

	public void setUndertakingAmountAdjustment(com.tools20022.repository.msg.UndertakingAmount2 undertakingAmountAdjustment) {
		this.undertakingAmountAdjustment = undertakingAmountAdjustment;
	}

	@XmlElement(name = "NewXpryDtls")
	public ExpiryDetails1 getNewExpiryDetails() {
		return newExpiryDetails;
	}

	public void setNewExpiryDetails(com.tools20022.repository.msg.ExpiryDetails1 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
	}

	@XmlElement(name = "NewBnfcry")
	public PartyIdentification43 getNewBeneficiary() {
		return newBeneficiary;
	}

	public void setNewBeneficiary(com.tools20022.repository.msg.PartyIdentification43 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
	}

	@XmlElement(name = "NewUdrtkgTermsAndConds")
	public List<Narrative1> getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions;
	}

	public void setNewUndertakingTermsAndConditions(List<com.tools20022.repository.msg.Narrative1> newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = newUndertakingTermsAndConditions;
	}

	@XmlElement(name = "LclUdrtkg")
	public Undertaking11 getLocalUndertaking() {
		return localUndertaking;
	}

	public void setLocalUndertaking(com.tools20022.repository.msg.Undertaking11 localUndertaking) {
		this.localUndertaking = localUndertaking;
	}

	@XmlElement(name = "BnfcryCnsntReqInd")
	public YesNoIndicator getBeneficiaryConsentRequestIndicator() {
		return beneficiaryConsentRequestIndicator;
	}

	public void setBeneficiaryConsentRequestIndicator(YesNoIndicator beneficiaryConsentRequestIndicator) {
		this.beneficiaryConsentRequestIndicator = beneficiaryConsentRequestIndicator;
	}

	@XmlElement(name = "DlvryChanl")
	public CommunicationChannel1 getDeliveryChannel() {
		return deliveryChannel;
	}

	public void setDeliveryChannel(com.tools20022.repository.msg.CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
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
}