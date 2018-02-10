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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmPlaceAndName
 * CorporateActionSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmNoticeType
 * CorporateActionSD1.mmNoticeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmEventCashValue
 * CorporateActionSD1.mmEventCashValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmNumberOfSharesToBeIssued
 * CorporateActionSD1.mmNumberOfSharesToBeIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmTotalNumberOfSharesOffered
 * CorporateActionSD1.mmTotalNumberOfSharesOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmCutOffDays
 * CorporateActionSD1.mmCutOffDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmDTCAutomatedOfferProgram
 * CorporateActionSD1.mmDTCAutomatedOfferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmDTCRecycleCutOffIndicator
 * CorporateActionSD1.mmDTCRecycleCutOffIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmLongShortPaymentIndicator
 * CorporateActionSD1.mmLongShortPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmOversubscriptionType
 * CorporateActionSD1.mmOversubscriptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmConditionalPaymentApplicableFlag
 * CorporateActionSD1.mmConditionalPaymentApplicableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmSolicitationDealerFeeFlag
 * CorporateActionSD1.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmDTCCustodyEligibleFlag
 * CorporateActionSD1.mmDTCCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmDTCReorganisationCustodyEligibleFlag
 * CorporateActionSD1.mmDTCReorganisationCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmDTCReorganisationDepositEligibleFlag
 * CorporateActionSD1.mmDTCReorganisationDepositEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmSurrenderSharesToAgentFlag
 * CorporateActionSD1.mmSurrenderSharesToAgentFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmStepUpPrivilegeFlag
 * CorporateActionSD1.mmStepUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmRightsOversubscriptionFlag
 * CorporateActionSD1.mmRightsOversubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmRightsRoundUpPrivilegeFlag
 * CorporateActionSD1.mmRightsRoundUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmRightsTransferableFlag
 * CorporateActionSD1.mmRightsTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1#mmCertificateDetails
 * CorporateActionSD1.mmCertificateDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionSD7
 * CorporateActionSD7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionSD1", propOrder = {"placeAndName", "noticeType", "eventCashValue", "numberOfSharesToBeIssued", "totalNumberOfSharesOffered", "cutOffDays", "dTCAutomatedOfferProgram", "dTCRecycleCutOffIndicator",
		"longShortPaymentIndicator", "oversubscriptionType", "conditionalPaymentApplicableFlag", "solicitationDealerFeeFlag", "dTCCustodyEligibleFlag", "dTCReorganisationCustodyEligibleFlag", "dTCReorganisationDepositEligibleFlag",
		"surrenderSharesToAgentFlag", "stepUpPrivilegeFlag", "rightsOversubscriptionFlag", "rightsRoundUpPrivilegeFlag", "rightsTransferableFlag", "certificateDetails"})
public class CorporateActionSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "NtceTp")
	protected NoticeType1Code noticeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeType1Code
	 * NoticeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtceTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Notice Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoticeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "NtceTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Notice Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticeType";
			definition = "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NoticeType1Code.mmObject();
		}
	};
	@XmlElement(name = "EvtCshVal")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCshVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Cash Value, DTCCSynonym: Currency
	 * (Event Cash Value)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCashValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventCashValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "EvtCshVal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Cash Value"), new DTCCSynonym(this, "Currency (Event Cash Value)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCashValue";
			definition = "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "NbOfShrsToBeIssd")
	protected DecimalNumber numberOfSharesToBeIssued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfShrsToBeIssd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Number of Shares to be Issued</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSharesToBeIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares the issuer is creating as part of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfSharesToBeIssued = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "NbOfShrsToBeIssd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Number of Shares to be Issued"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfSharesToBeIssued";
			definition = "Number of shares the issuer is creating as part of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfShrsOfferd")
	protected DecimalNumber totalNumberOfSharesOffered;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfShrsOfferd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Total Number of Shares Offered</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSharesOffered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of shares that are part of the offer for example subscription offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfSharesOffered = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfShrsOfferd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Total Number of Shares Offered"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSharesOffered";
			definition = "Total number of shares that are part of the offer for example subscription offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "CutOffDays")
	protected Max3Number cutOffDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Cut Off Days</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of additional days used to establish a DTC processing cut-off date. For example, DTC typically adds a cut-off off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCutOffDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "CutOffDays";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Cut Off Days"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDays";
			definition = "Number of additional days used to establish a DTC processing cut-off date. For example, DTC typically adds a cut-off off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	@XmlElement(name = "DTCAutomtdOfferPrgm")
	protected DTCAutoOfferProgram1Code dTCAutomatedOfferProgram;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgram1Code
	 * DTCAutoOfferProgram1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAutomtdOfferPrgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Automated Offer Program</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAutomatedOfferProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAutomatedOfferProgram = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCAutomtdOfferPrgm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Automated Offer Program"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAutomatedOfferProgram";
			definition = "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAutoOfferProgram1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCRcyclCutOffInd")
	protected CutOff1Code dTCRecycleCutOffIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CutOff1Code
	 * CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCRcyclCutOffInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Recycle Cutoff Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCRecycleCutOffIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCRecycleCutOffIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCRcyclCutOffInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Recycle Cutoff Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCRecycleCutOffIndicator";
			definition = "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CutOff1Code.mmObject();
		}
	};
	@XmlElement(name = "LngShrtPmtInd")
	protected AccrualPeriodType1Code longShortPaymentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngShrtPmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Long/ Short Payment Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongShortPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongShortPaymentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "LngShrtPmtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Long/ Short Payment Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongShortPaymentIndicator";
			definition = "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccrualPeriodType1Code.mmObject();
		}
	};
	@XmlElement(name = "OvrsbcptTp")
	protected OversubscriptionType1Code oversubscriptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OversubscriptionType1Code
	 * OversubscriptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Oversubscription Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of oversubscription on the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOversubscriptionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Oversubscription Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionType";
			definition = "Type of oversubscription on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OversubscriptionType1Code.mmObject();
		}
	};
	@XmlElement(name = "CondlPmtAplblFlg")
	protected YesNoIndicator conditionalPaymentApplicableFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlPmtAplblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Conditional Payment Applicable Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPaymentApplicableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment made by the issuer is based on a stated condition."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConditionalPaymentApplicableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "CondlPmtAplblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditional Payment Applicable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPaymentApplicableFlag";
			definition = "Indicates whether the payment made by the issuer is based on a stated condition.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SlctnDealrFeeFlg")
	protected YesNoIndicator solicitationDealerFeeFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnDealrFeeFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Solicitation Dealer Fee Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationDealerFeeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationDealerFeeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Solicitation Dealer Fee Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCCtdyElgblFlg")
	protected YesNoIndicator dTCCustodyEligibleFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCtdyElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Custody Eligible Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCustodyEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether positions held in Custody program are eligible for instruction processing at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCustodyEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCCtdyElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Custody Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCustodyEligibleFlag";
			definition = "Indicates whether positions held in Custody program are eligible for instruction processing at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCReorgCtdyElgblFlg")
	protected YesNoIndicator dTCReorganisationCustodyEligibleFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgCtdyElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Reorg Custody Eligible Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReorganisationCustodyEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for Custody Reorganisation service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReorganisationCustodyEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgCtdyElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Reorg Custody Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationCustodyEligibleFlag";
			definition = "Indicates whether the event is eligible for Custody Reorganisation service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DTCReorgDpstElgblFlg")
	protected YesNoIndicator dTCReorganisationDepositEligibleFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgDpstElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Reorg Deposit Eligible Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReorganisationDepositEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for Reorganisation Deposit Service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReorganisationDepositEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Reorg Deposit Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositEligibleFlag";
			definition = "Indicates whether the event is eligible for Reorganisation Deposit Service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SrrndrShrsToAgtFlg")
	protected YesNoIndicator surrenderSharesToAgentFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrrndrShrsToAgtFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Surrender Shares to Agent Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurrenderSharesToAgentFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSurrenderSharesToAgentFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "SrrndrShrsToAgtFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Surrender Shares to Agent Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurrenderSharesToAgentFlag";
			definition = "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "StepUpPrvlgFlg")
	protected YesNoIndicator stepUpPrivilegeFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StepUpPrvlgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Step-Up Privilege Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepUpPrivilegeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStepUpPrivilegeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "StepUpPrvlgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Step-Up Privilege Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepUpPrivilegeFlag";
			definition = "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RghtsOvrsbcptFlg")
	protected YesNoIndicator rightsOversubscriptionFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsOvrsbcptFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Rights Oversubscription Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsOversubscriptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsOversubscriptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "RghtsOvrsbcptFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Oversubscription Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsOversubscriptionFlag";
			definition = "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RghtsRndUpPrvlgFlg")
	protected YesNoIndicator rightsRoundUpPrivilegeFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsRndUpPrvlgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Rights Round-up Privilege Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsRoundUpPrivilegeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsRoundUpPrivilegeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "RghtsRndUpPrvlgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Round-up Privilege Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRoundUpPrivilegeFlag";
			definition = "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RghtsTrfblFlg")
	protected YesNoIndicator rightsTransferableFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsTrfblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Rights Transferable Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsTransferableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether rights can be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsTransferableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "RghtsTrfblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Transferable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsTransferableFlag";
			definition = "Indicates whether rights can be transferred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CertDtls")
	protected List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD5
	 * CorporateActionSD5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
	 * CorporateActionSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Certificate Details</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of certificates that have been  called  for redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificateDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD1.mmObject();
			isDerived = false;
			xmlTag = "CertDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Certificate Details"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDetails";
			definition = "Provides details of certificates that have been  called  for redemption.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionSD5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionSD1.mmNoticeType,
						com.tools20022.repository.msg.CorporateActionSD1.mmEventCashValue, com.tools20022.repository.msg.CorporateActionSD1.mmNumberOfSharesToBeIssued,
						com.tools20022.repository.msg.CorporateActionSD1.mmTotalNumberOfSharesOffered, com.tools20022.repository.msg.CorporateActionSD1.mmCutOffDays,
						com.tools20022.repository.msg.CorporateActionSD1.mmDTCAutomatedOfferProgram, com.tools20022.repository.msg.CorporateActionSD1.mmDTCRecycleCutOffIndicator,
						com.tools20022.repository.msg.CorporateActionSD1.mmLongShortPaymentIndicator, com.tools20022.repository.msg.CorporateActionSD1.mmOversubscriptionType,
						com.tools20022.repository.msg.CorporateActionSD1.mmConditionalPaymentApplicableFlag, com.tools20022.repository.msg.CorporateActionSD1.mmSolicitationDealerFeeFlag,
						com.tools20022.repository.msg.CorporateActionSD1.mmDTCCustodyEligibleFlag, com.tools20022.repository.msg.CorporateActionSD1.mmDTCReorganisationCustodyEligibleFlag,
						com.tools20022.repository.msg.CorporateActionSD1.mmDTCReorganisationDepositEligibleFlag, com.tools20022.repository.msg.CorporateActionSD1.mmSurrenderSharesToAgentFlag,
						com.tools20022.repository.msg.CorporateActionSD1.mmStepUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD1.mmRightsOversubscriptionFlag,
						com.tools20022.repository.msg.CorporateActionSD1.mmRightsRoundUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD1.mmRightsTransferableFlag,
						com.tools20022.repository.msg.CorporateActionSD1.mmCertificateDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionSD1";
				definition = "Provides additional information regarding corporate action details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionSD7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<NoticeType1Code> getNoticeType() {
		return noticeType == null ? Optional.empty() : Optional.of(noticeType);
	}

	public CorporateActionSD1 setNoticeType(NoticeType1Code noticeType) {
		this.noticeType = noticeType;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getEventCashValue() {
		return eventCashValue == null ? Optional.empty() : Optional.of(eventCashValue);
	}

	public CorporateActionSD1 setEventCashValue(RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue) {
		this.eventCashValue = eventCashValue;
		return this;
	}

	public Optional<DecimalNumber> getNumberOfSharesToBeIssued() {
		return numberOfSharesToBeIssued == null ? Optional.empty() : Optional.of(numberOfSharesToBeIssued);
	}

	public CorporateActionSD1 setNumberOfSharesToBeIssued(DecimalNumber numberOfSharesToBeIssued) {
		this.numberOfSharesToBeIssued = numberOfSharesToBeIssued;
		return this;
	}

	public Optional<DecimalNumber> getTotalNumberOfSharesOffered() {
		return totalNumberOfSharesOffered == null ? Optional.empty() : Optional.of(totalNumberOfSharesOffered);
	}

	public CorporateActionSD1 setTotalNumberOfSharesOffered(DecimalNumber totalNumberOfSharesOffered) {
		this.totalNumberOfSharesOffered = totalNumberOfSharesOffered;
		return this;
	}

	public Optional<Max3Number> getCutOffDays() {
		return cutOffDays == null ? Optional.empty() : Optional.of(cutOffDays);
	}

	public CorporateActionSD1 setCutOffDays(Max3Number cutOffDays) {
		this.cutOffDays = cutOffDays;
		return this;
	}

	public Optional<DTCAutoOfferProgram1Code> getDTCAutomatedOfferProgram() {
		return dTCAutomatedOfferProgram == null ? Optional.empty() : Optional.of(dTCAutomatedOfferProgram);
	}

	public CorporateActionSD1 setDTCAutomatedOfferProgram(DTCAutoOfferProgram1Code dTCAutomatedOfferProgram) {
		this.dTCAutomatedOfferProgram = dTCAutomatedOfferProgram;
		return this;
	}

	public Optional<CutOff1Code> getDTCRecycleCutOffIndicator() {
		return dTCRecycleCutOffIndicator == null ? Optional.empty() : Optional.of(dTCRecycleCutOffIndicator);
	}

	public CorporateActionSD1 setDTCRecycleCutOffIndicator(CutOff1Code dTCRecycleCutOffIndicator) {
		this.dTCRecycleCutOffIndicator = dTCRecycleCutOffIndicator;
		return this;
	}

	public Optional<AccrualPeriodType1Code> getLongShortPaymentIndicator() {
		return longShortPaymentIndicator == null ? Optional.empty() : Optional.of(longShortPaymentIndicator);
	}

	public CorporateActionSD1 setLongShortPaymentIndicator(AccrualPeriodType1Code longShortPaymentIndicator) {
		this.longShortPaymentIndicator = longShortPaymentIndicator;
		return this;
	}

	public Optional<OversubscriptionType1Code> getOversubscriptionType() {
		return oversubscriptionType == null ? Optional.empty() : Optional.of(oversubscriptionType);
	}

	public CorporateActionSD1 setOversubscriptionType(OversubscriptionType1Code oversubscriptionType) {
		this.oversubscriptionType = oversubscriptionType;
		return this;
	}

	public Optional<YesNoIndicator> getConditionalPaymentApplicableFlag() {
		return conditionalPaymentApplicableFlag == null ? Optional.empty() : Optional.of(conditionalPaymentApplicableFlag);
	}

	public CorporateActionSD1 setConditionalPaymentApplicableFlag(YesNoIndicator conditionalPaymentApplicableFlag) {
		this.conditionalPaymentApplicableFlag = conditionalPaymentApplicableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag == null ? Optional.empty() : Optional.of(solicitationDealerFeeFlag);
	}

	public CorporateActionSD1 setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCCustodyEligibleFlag() {
		return dTCCustodyEligibleFlag == null ? Optional.empty() : Optional.of(dTCCustodyEligibleFlag);
	}

	public CorporateActionSD1 setDTCCustodyEligibleFlag(YesNoIndicator dTCCustodyEligibleFlag) {
		this.dTCCustodyEligibleFlag = dTCCustodyEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCReorganisationCustodyEligibleFlag() {
		return dTCReorganisationCustodyEligibleFlag == null ? Optional.empty() : Optional.of(dTCReorganisationCustodyEligibleFlag);
	}

	public CorporateActionSD1 setDTCReorganisationCustodyEligibleFlag(YesNoIndicator dTCReorganisationCustodyEligibleFlag) {
		this.dTCReorganisationCustodyEligibleFlag = dTCReorganisationCustodyEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCReorganisationDepositEligibleFlag() {
		return dTCReorganisationDepositEligibleFlag == null ? Optional.empty() : Optional.of(dTCReorganisationDepositEligibleFlag);
	}

	public CorporateActionSD1 setDTCReorganisationDepositEligibleFlag(YesNoIndicator dTCReorganisationDepositEligibleFlag) {
		this.dTCReorganisationDepositEligibleFlag = dTCReorganisationDepositEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSurrenderSharesToAgentFlag() {
		return surrenderSharesToAgentFlag == null ? Optional.empty() : Optional.of(surrenderSharesToAgentFlag);
	}

	public CorporateActionSD1 setSurrenderSharesToAgentFlag(YesNoIndicator surrenderSharesToAgentFlag) {
		this.surrenderSharesToAgentFlag = surrenderSharesToAgentFlag;
		return this;
	}

	public Optional<YesNoIndicator> getStepUpPrivilegeFlag() {
		return stepUpPrivilegeFlag == null ? Optional.empty() : Optional.of(stepUpPrivilegeFlag);
	}

	public CorporateActionSD1 setStepUpPrivilegeFlag(YesNoIndicator stepUpPrivilegeFlag) {
		this.stepUpPrivilegeFlag = stepUpPrivilegeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsOversubscriptionFlag() {
		return rightsOversubscriptionFlag == null ? Optional.empty() : Optional.of(rightsOversubscriptionFlag);
	}

	public CorporateActionSD1 setRightsOversubscriptionFlag(YesNoIndicator rightsOversubscriptionFlag) {
		this.rightsOversubscriptionFlag = rightsOversubscriptionFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsRoundUpPrivilegeFlag() {
		return rightsRoundUpPrivilegeFlag == null ? Optional.empty() : Optional.of(rightsRoundUpPrivilegeFlag);
	}

	public CorporateActionSD1 setRightsRoundUpPrivilegeFlag(YesNoIndicator rightsRoundUpPrivilegeFlag) {
		this.rightsRoundUpPrivilegeFlag = rightsRoundUpPrivilegeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsTransferableFlag() {
		return rightsTransferableFlag == null ? Optional.empty() : Optional.of(rightsTransferableFlag);
	}

	public CorporateActionSD1 setRightsTransferableFlag(YesNoIndicator rightsTransferableFlag) {
		this.rightsTransferableFlag = rightsTransferableFlag;
		return this;
	}

	public List<CorporateActionSD5> getCertificateDetails() {
		return certificateDetails == null ? certificateDetails = new ArrayList<>() : certificateDetails;
	}

	public CorporateActionSD1 setCertificateDetails(List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails) {
		this.certificateDetails = Objects.requireNonNull(certificateDetails);
		return this;
	}
}