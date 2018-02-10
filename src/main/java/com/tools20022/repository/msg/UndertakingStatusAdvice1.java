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
import com.tools20022.repository.area.tsrv.UndertakingStatusReportV01;
import com.tools20022.repository.codeset.ExternalUndertakingStatusCategory1Code;
import com.tools20022.repository.codeset.UndertakingStatus3Code;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Undertaking status information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmInitiatingParty
 * UndertakingStatusAdvice1.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmUndertakingIdentification
 * UndertakingStatusAdvice1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmAmendmentSequenceNumber
 * UndertakingStatusAdvice1.mmAmendmentSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmAdvisingPartyReferenceNumber
 * UndertakingStatusAdvice1.mmAdvisingPartyReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmConfirmerReferenceNumber
 * UndertakingStatusAdvice1.mmConfirmerReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatusCategory
 * UndertakingStatusAdvice1.mmStatusCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatus
 * UndertakingStatusAdvice1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatusReason
 * UndertakingStatusAdvice1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmReportedAmount
 * UndertakingStatusAdvice1.mmReportedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmOriginalMessageDetails
 * UndertakingStatusAdvice1.mmOriginalMessageDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmEnclosedFile
 * UndertakingStatusAdvice1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmAdditionalInformation
 * UndertakingStatusAdvice1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingStatusReportV01#mmUndertakingStatusReportDetails
 * UndertakingStatusReportV01.mmUndertakingStatusReportDetails}</li>
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
 * "UndertakingStatusAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Undertaking status information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingStatusAdvice1", propOrder = {"initiatingParty", "undertakingIdentification", "amendmentSequenceNumber", "advisingPartyReferenceNumber", "confirmerReferenceNumber", "statusCategory", "status", "statusReason",
		"reportedAmount", "originalMessageDetails", "enclosedFile", "additionalInformation"})
public class UndertakingStatusAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitgPty", required = true)
	protected PartyIdentification43 initiatingParty;
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the party that initiated the report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Details related to the party that initiated the report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "UdrtkgId")
	protected Undertaking8 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking8
	 * Undertaking8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
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
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Undertaking8.mmObject();
		}
	};
	@XmlElement(name = "AmdmntSeqNb")
	protected Number amendmentSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence number assigned by the issuer to each amendment of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentSequenceNumber";
			definition = "Sequence number assigned by the issuer to each amendment of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "AdvsgPtyRefNb")
	protected Max35Text advisingPartyReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPtyRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingPartyReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the advising party to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdvisingPartyReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "AdvsgPtyRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingPartyReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the advising party to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CnfrmrRefNb")
	protected Max35Text confirmerReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfrmrRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmerReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the confirmer to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmerReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "CnfrmrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmerReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the confirmer to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "StsCtgy", required = true)
	protected ExternalUndertakingStatusCategory1Code statusCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingStatusCategory1Code
	 * ExternalUndertakingStatusCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatusCategory
	 * UndertakingStatus.mmStatusCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmStatusCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "StsCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusCategory";
			definition = "Specifies the category of the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingStatusCategory1Code.mmObject();
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected UndertakingStatus3Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus3Code
	 * UndertakingStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatus
	 * UndertakingStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reported status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the reported status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatus3Code.mmObject();
		}
	};
	@XmlElement(name = "StsRsn")
	protected List<com.tools20022.repository.msg.StatusReasonInformation8> statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation8
	 * StatusReasonInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertakingStatusReason
	 * UndertakingStatus.mmUndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the status reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertakingStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Set of elements used to provide detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReasonInformation8.mmObject();
		}
	};
	@XmlElement(name = "RptdAmt")
	protected List<com.tools20022.repository.msg.ReportedAmount1> reportedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportedAmount1
	 * ReportedAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount reported."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "RptdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAmount";
			definition = "Amount reported.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ReportedAmount1.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMsgDtls")
	protected OriginalMessage1 originalMessageDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original message to which the status report may be sent in response."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageDetails";
			definition = "Information concerning the original message to which the status report may be sent in response.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalMessage1.mmObject();
		}
	};
	@XmlElement(name = "NclsdFile")
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
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
	 * definition} = "Document or template enclosed in the report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the report.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
	 * UndertakingStatusAdvice1}</li>
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
	 * definition} = "Additional information related to the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the report.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingStatusAdvice1.mmInitiatingParty, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmUndertakingIdentification,
						com.tools20022.repository.msg.UndertakingStatusAdvice1.mmAmendmentSequenceNumber, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmAdvisingPartyReferenceNumber,
						com.tools20022.repository.msg.UndertakingStatusAdvice1.mmConfirmerReferenceNumber, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatusCategory,
						com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatus, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatusReason, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmReportedAmount,
						com.tools20022.repository.msg.UndertakingStatusAdvice1.mmOriginalMessageDetails, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmEnclosedFile,
						com.tools20022.repository.msg.UndertakingStatusAdvice1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingStatusReportV01.mmUndertakingStatusReportDetails);
				trace_lazy = () -> UndertakingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatusAdvice1";
				definition = "Undertaking status information.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification43 getInitiatingParty() {
		return initiatingParty;
	}

	public UndertakingStatusAdvice1 setInitiatingParty(com.tools20022.repository.msg.PartyIdentification43 initiatingParty) {
		this.initiatingParty = Objects.requireNonNull(initiatingParty);
		return this;
	}

	public Optional<Undertaking8> getUndertakingIdentification() {
		return undertakingIdentification == null ? Optional.empty() : Optional.of(undertakingIdentification);
	}

	public UndertakingStatusAdvice1 setUndertakingIdentification(com.tools20022.repository.msg.Undertaking8 undertakingIdentification) {
		this.undertakingIdentification = undertakingIdentification;
		return this;
	}

	public Optional<Number> getAmendmentSequenceNumber() {
		return amendmentSequenceNumber == null ? Optional.empty() : Optional.of(amendmentSequenceNumber);
	}

	public UndertakingStatusAdvice1 setAmendmentSequenceNumber(Number amendmentSequenceNumber) {
		this.amendmentSequenceNumber = amendmentSequenceNumber;
		return this;
	}

	public Optional<Max35Text> getAdvisingPartyReferenceNumber() {
		return advisingPartyReferenceNumber == null ? Optional.empty() : Optional.of(advisingPartyReferenceNumber);
	}

	public UndertakingStatusAdvice1 setAdvisingPartyReferenceNumber(Max35Text advisingPartyReferenceNumber) {
		this.advisingPartyReferenceNumber = advisingPartyReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getConfirmerReferenceNumber() {
		return confirmerReferenceNumber == null ? Optional.empty() : Optional.of(confirmerReferenceNumber);
	}

	public UndertakingStatusAdvice1 setConfirmerReferenceNumber(Max35Text confirmerReferenceNumber) {
		this.confirmerReferenceNumber = confirmerReferenceNumber;
		return this;
	}

	public ExternalUndertakingStatusCategory1Code getStatusCategory() {
		return statusCategory;
	}

	public UndertakingStatusAdvice1 setStatusCategory(ExternalUndertakingStatusCategory1Code statusCategory) {
		this.statusCategory = Objects.requireNonNull(statusCategory);
		return this;
	}

	public UndertakingStatus3Code getStatus() {
		return status;
	}

	public UndertakingStatusAdvice1 setStatus(UndertakingStatus3Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<StatusReasonInformation8> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public UndertakingStatusAdvice1 setStatusReason(List<com.tools20022.repository.msg.StatusReasonInformation8> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public List<ReportedAmount1> getReportedAmount() {
		return reportedAmount == null ? reportedAmount = new ArrayList<>() : reportedAmount;
	}

	public UndertakingStatusAdvice1 setReportedAmount(List<com.tools20022.repository.msg.ReportedAmount1> reportedAmount) {
		this.reportedAmount = Objects.requireNonNull(reportedAmount);
		return this;
	}

	public Optional<OriginalMessage1> getOriginalMessageDetails() {
		return originalMessageDetails == null ? Optional.empty() : Optional.of(originalMessageDetails);
	}

	public UndertakingStatusAdvice1 setOriginalMessageDetails(com.tools20022.repository.msg.OriginalMessage1 originalMessageDetails) {
		this.originalMessageDetails = originalMessageDetails;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public UndertakingStatusAdvice1 setEnclosedFile(List<com.tools20022.repository.msg.Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public UndertakingStatusAdvice1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}