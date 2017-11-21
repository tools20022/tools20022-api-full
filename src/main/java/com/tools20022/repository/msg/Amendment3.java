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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Amendment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendent request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Amendment3", propOrder = {"applicantRequestNumber", "undertakingIdentification", "applicant", "terminationDetails", "increaseDecreaseAmount", "newExpiryDetails", "newBeneficiary", "newUndertakingTermsAndConditions",
		"counterUndertaking", "deliveryChannel", "enclosedFile", "additionalInformation"})
public class Amendment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text applicantRequestNumber;
	/**
	 * Unique and unambiguous identifier assigned by the applicant to the
	 * undertaking amendment request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantRequestNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking amendment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicantRequestNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "ApplcntReqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantRequestNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking amendment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Undertaking9 undertakingIdentification;
	/**
	 * Identification of the undertaking.
	 * <p>
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
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking9.mmObject();
		}
	};
	protected PartyIdentification43 applicant;
	/**
	 * Party requesting the issuance of the amendment.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
	 * definition} = "Party requesting the issuance of the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicant = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "Applcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicant";
			definition = "Party requesting the issuance of the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
			componentContext_lazy = () -> Amendment3.mmObject();
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
	protected UndertakingAmount2 increaseDecreaseAmount;
	/**
	 * Indication of the amount of increase or decrease to the undertaking
	 * amount.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrDcrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseDecreaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of the amount of increase or decrease to the undertaking amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncreaseDecreaseAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "IncrDcrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseDecreaseAmount";
			definition = "Indication of the amount of increase or decrease to the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingAmount2.mmObject();
		}
	};
	protected ExpiryDetails2 newExpiryDetails;
	/**
	 * Requested new expiry terms for the undertaking.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
	public static final MMMessageAssociationEnd mmNewExpiryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Requested new expiry terms for the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpiryDetails2.mmObject();
		}
	};
	protected Beneficiary1 newBeneficiary;
	/**
	 * Requested new beneficiary of the undertaking.
	 * <p>
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
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Requested new beneficiary of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Beneficiary1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
			componentContext_lazy = () -> Amendment3.mmObject();
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
	protected Undertaking10 counterUndertaking;
	/**
	 * Amendment details related to the counter-undertaking.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment details related to the counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterUndertaking = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertaking";
			definition = "Amendment details related to the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Undertaking10.mmObject();
		}
	};
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * Communication channel for delivery of the amendment.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
	 * definition} = "Communication channel for delivery of the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryChannel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Communication channel for delivery of the amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationChannel1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
	/**
	 * Document or template enclosed in the request.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
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
	 * definition} = "Document or template enclosed in the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
		}
	};
	protected List<Max2000Text> additionalInformation;
	/**
	 * Additional information related to the request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Amendment3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the request.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Amendment3.mmApplicantRequestNumber, Amendment3.mmUndertakingIdentification, Amendment3.mmApplicant, Amendment3.mmTerminationDetails, Amendment3.mmIncreaseDecreaseAmount,
						Amendment3.mmNewExpiryDetails, Amendment3.mmNewBeneficiary, Amendment3.mmNewUndertakingTermsAndConditions, Amendment3.mmCounterUndertaking, Amendment3.mmDeliveryChannel, Amendment3.mmEnclosedFile,
						Amendment3.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentRequestV01.mmUndertakingAmendmentRequestDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment3";
				definition = "Details of the amendent request.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ApplcntReqNb", required = true)
	public Max35Text getApplicantRequestNumber() {
		return applicantRequestNumber;
	}

	public void setApplicantRequestNumber(Max35Text applicantRequestNumber) {
		this.applicantRequestNumber = applicantRequestNumber;
	}

	@XmlElement(name = "UdrtkgId", required = true)
	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public void setUndertakingIdentification(com.tools20022.repository.msg.Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = undertakingIdentification;
	}

	@XmlElement(name = "Applcnt", required = true)
	public PartyIdentification43 getApplicant() {
		return applicant;
	}

	public void setApplicant(com.tools20022.repository.msg.PartyIdentification43 applicant) {
		this.applicant = applicant;
	}

	@XmlElement(name = "TermntnDtls")
	public UndertakingTermination3 getTerminationDetails() {
		return terminationDetails;
	}

	public void setTerminationDetails(com.tools20022.repository.msg.UndertakingTermination3 terminationDetails) {
		this.terminationDetails = terminationDetails;
	}

	@XmlElement(name = "IncrDcrAmt")
	public UndertakingAmount2 getIncreaseDecreaseAmount() {
		return increaseDecreaseAmount;
	}

	public void setIncreaseDecreaseAmount(com.tools20022.repository.msg.UndertakingAmount2 increaseDecreaseAmount) {
		this.increaseDecreaseAmount = increaseDecreaseAmount;
	}

	@XmlElement(name = "NewXpryDtls")
	public ExpiryDetails2 getNewExpiryDetails() {
		return newExpiryDetails;
	}

	public void setNewExpiryDetails(com.tools20022.repository.msg.ExpiryDetails2 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
	}

	@XmlElement(name = "NewBnfcry")
	public Beneficiary1 getNewBeneficiary() {
		return newBeneficiary;
	}

	public void setNewBeneficiary(com.tools20022.repository.msg.Beneficiary1 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
	}

	@XmlElement(name = "NewUdrtkgTermsAndConds")
	public List<Narrative1> getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions;
	}

	public void setNewUndertakingTermsAndConditions(List<com.tools20022.repository.msg.Narrative1> newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = newUndertakingTermsAndConditions;
	}

	@XmlElement(name = "CntrUdrtkg")
	public Undertaking10 getCounterUndertaking() {
		return counterUndertaking;
	}

	public void setCounterUndertaking(com.tools20022.repository.msg.Undertaking10 counterUndertaking) {
		this.counterUndertaking = counterUndertaking;
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