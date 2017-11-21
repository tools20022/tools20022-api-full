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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmPlaceAndName
 * CorporateActionSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmNoticeType
 * CorporateActionSD3.mmNoticeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmEventCashValue
 * CorporateActionSD3.mmEventCashValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmNumberOfSharesToBeIssued
 * CorporateActionSD3.mmNumberOfSharesToBeIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmTotalNumberOfSharesOffered
 * CorporateActionSD3.mmTotalNumberOfSharesOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmSurvivingCompany
 * CorporateActionSD3.mmSurvivingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmCutOffDays
 * CorporateActionSD3.mmCutOffDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCAutomatedOfferProgram
 * CorporateActionSD3.mmDTCAutomatedOfferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCRecycleCutOffIndicator
 * CorporateActionSD3.mmDTCRecycleCutOffIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCInstructionLockoutIndicator
 * CorporateActionSD3.mmDTCInstructionLockoutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmLongShortPaymentIndicator
 * CorporateActionSD3.mmLongShortPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmInterimFinalIndicator
 * CorporateActionSD3.mmInterimFinalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmOversubscriptionType
 * CorporateActionSD3.mmOversubscriptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmConditionalPaymentApplicableFlag
 * CorporateActionSD3.mmConditionalPaymentApplicableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmSolicitationDealerFeeFlag
 * CorporateActionSD3.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCCustodyEligibleFlag
 * CorporateActionSD3.mmDTCCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCReorganisationCustodyEligibleFlag
 * CorporateActionSD3.mmDTCReorganisationCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmDTCReorganisationDepositEligibleFlag
 * CorporateActionSD3.mmDTCReorganisationDepositEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmSurrenderSharesToAgentFlag
 * CorporateActionSD3.mmSurrenderSharesToAgentFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmStepUpPrivilegeFlag
 * CorporateActionSD3.mmStepUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmRightsOversubscriptionFlag
 * CorporateActionSD3.mmRightsOversubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmRightsRoundUpPrivilegeFlag
 * CorporateActionSD3.mmRightsRoundUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmRightsTransferableFlag
 * CorporateActionSD3.mmRightsTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3#mmCertificateDetails
 * CorporateActionSD3.mmCertificateDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionSD3", propOrder = {"placeAndName", "noticeType", "eventCashValue", "numberOfSharesToBeIssued", "totalNumberOfSharesOffered", "survivingCompany", "cutOffDays", "DTCAutomatedOfferProgram",
		"DTCRecycleCutOffIndicator", "DTCInstructionLockoutIndicator", "longShortPaymentIndicator", "interimFinalIndicator", "oversubscriptionType", "conditionalPaymentApplicableFlag", "solicitationDealerFeeFlag", "DTCCustodyEligibleFlag",
		"DTCReorganisationCustodyEligibleFlag", "DTCReorganisationDepositEligibleFlag", "surrenderSharesToAgentFlag", "stepUpPrivilegeFlag", "rightsOversubscriptionFlag", "rightsRoundUpPrivilegeFlag", "rightsTransferableFlag",
		"certificateDetails"})
public class CorporateActionSD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
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
	protected NoticeType1Code noticeType;
	/**
	 * Indicates whether the notice received was universal or specific to
	 * securities registered in DTC's nominee name.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtceTp"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "NtceTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticeType";
			definition = "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NoticeType1Code.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue;
	/**
	 * Amount of cash set aside by the offeror. This is the maximum amount that
	 * the offeror is willing to pay out to the holders who elect to take part
	 * in the offer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCshVal"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "EvtCshVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCashValue";
			definition = "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected DecimalNumber numberOfSharesToBeIssued;
	/**
	 * Number of shares the issuer is creating as part of the event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfShrsToBeIssd"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "NbOfShrsToBeIssd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfSharesToBeIssued";
			definition = "Number of shares the issuer is creating as part of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber totalNumberOfSharesOffered;
	/**
	 * Total number of shares that are part of the offer for example
	 * subscription offer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfShrsOfferd"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfShrsOfferd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSharesOffered";
			definition = "Total number of shares that are part of the offer for example subscription offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max70Text survivingCompany;
	/**
	 * Name of the company that will remain (possibly a new name), usually
	 * designated after a merger.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrvvgCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company that will remain (possibly a new name), usually designated after a merger."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSurvivingCompany = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "SrvvgCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivingCompany";
			definition = "Name of the company that will remain (possibly a new name), usually designated after a merger.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max3Number cutOffDays;
	/**
	 * Number of additional days used to establish a DTC processing cutoff date.
	 * For example, DTC typically adds a cutoff off day (making it one business
	 * day prior) to the record date for issues with agents outside NYC. This
	 * allows time for DTC to deliver the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of additional days used to establish a DTC processing cutoff date. For example, DTC typically adds a cutoff off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCutOffDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "CutOffDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDays";
			definition = "Number of additional days used to establish a DTC processing cutoff date. For example, DTC typically adds a cutoff off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected DTCAutoOfferProgram1Code dTCAutomatedOfferProgram;
	/**
	 * Indicator that identifies the type of interface an event agent has with
	 * DTC (The Depository Trust Corporation). It defines how time sensitive
	 * instruction and withdrawal process is. Offline (non automated) agent will
	 * have earlier deadlines which will be reflected in response deadlines but
	 * importantly withdrawal procedures for manual agent require hard copy sign
	 * off from the agent that has to be delivered to DTC to proceed with
	 * withdrawal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAutomtdOfferPrgm"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCAutomtdOfferPrgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAutomatedOfferProgram";
			definition = "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAutoOfferProgram1Code.mmObject();
		}
	};
	protected CutOff1Code dTCRecycleCutOffIndicator;
	/**
	 * Indicates whether the recycling of instructions for eligible positions is
	 * set to end early or late at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CutOff1Code
	 * CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCRcyclCutOffInd"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCRcyclCutOffInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCRecycleCutOffIndicator";
			definition = "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CutOff1Code.mmObject();
		}
	};
	protected InstructionLockout1Code dTCInstructionLockoutIndicator;
	/**
	 * Indicates whether instructions processing is temporarily suspended for
	 * this event at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionLockout1Code
	 * InstructionLockout1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCInstrLckoutInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCInstructionLockoutIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether instructions processing is temporarily suspended for this event at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCInstructionLockoutIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCInstrLckoutInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCInstructionLockoutIndicator";
			definition = "Indicates whether instructions processing is temporarily suspended for this event at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InstructionLockout1Code.mmObject();
		}
	};
	protected AccrualPeriodType1Code longShortPaymentIndicator;
	/**
	 * Denotes whether the first accrual period for debt instruments is either
	 * long or short, compared to the normal accrual period of the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngShrtPmtInd"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "LngShrtPmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongShortPaymentIndicator";
			definition = "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccrualPeriodType1Code.mmObject();
		}
	};
	protected InterimFinalPayment1Code interimFinalIndicator;
	/**
	 * Indicates whether or not the payment for a liquidation event is interim
	 * or final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterimFinalPayment1Code
	 * InterimFinalPayment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmFnlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimFinalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the payment for a liquidation event is interim or final."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterimFinalIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "IntrmFnlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimFinalIndicator";
			definition = "Indicates whether or not the payment for a liquidation event is interim or final.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterimFinalPayment1Code.mmObject();
		}
	};
	protected OversubscriptionType1Code oversubscriptionType;
	/**
	 * Type of oversubscription on the event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptTp"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionType";
			definition = "Type of oversubscription on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OversubscriptionType1Code.mmObject();
		}
	};
	protected YesNoIndicator conditionalPaymentApplicableFlag;
	/**
	 * Indicates whether the payment made by the issuer is based on a stated
	 * condition.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlPmtAplblFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "CondlPmtAplblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPaymentApplicableFlag";
			definition = "Indicates whether the payment made by the issuer is based on a stated condition.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator solicitationDealerFeeFlag;
	/**
	 * Indicates whether there is a solicitation fee on the event. This fee is
	 * paid by the soliciting dealer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnDealrFeeFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCCustodyEligibleFlag;
	/**
	 * Indicates whether positions held in Custody program are eligible for
	 * instruction processing at DTC (The Depository Trust Corporation).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCtdyElgblFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCCtdyElgblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCustodyEligibleFlag";
			definition = "Indicates whether positions held in Custody program are eligible for instruction processing at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCReorganisationCustodyEligibleFlag;
	/**
	 * Indicates whether the event is eligible for Custody Reorganisation
	 * service at DTC (The Depository Trust Corporation).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgCtdyElgblFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgCtdyElgblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationCustodyEligibleFlag";
			definition = "Indicates whether the event is eligible for Custody Reorganisation service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCReorganisationDepositEligibleFlag;
	/**
	 * Indicates whether the event is eligible for Reorganisation Deposit
	 * Service at DTC (The Depository Trust Corporation).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgDpstElgblFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstElgblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositEligibleFlag";
			definition = "Indicates whether the event is eligible for Reorganisation Deposit Service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator surrenderSharesToAgentFlag;
	/**
	 * Indicates whether shares outside of DTC need to be delivered to the agent
	 * in order to receive entitlement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrrndrShrsToAgtFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "SrrndrShrsToAgtFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurrenderSharesToAgentFlag";
			definition = "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator stepUpPrivilegeFlag;
	/**
	 * Indicates that the holder has the privilege to buy additional rights.
	 * Upon exercising this privilege, the holder may subscribe to one
	 * additional share of the new security in lieu of fractional shares to
	 * which the holder might otherwise be entitled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StepUpPrvlgFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "StepUpPrvlgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepUpPrivilegeFlag";
			definition = "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsOversubscriptionFlag;
	/**
	 * Indicates whether holders of rights will be afforded the opportunity to
	 * subscribe to purchase extra shares that are not picked up by the
	 * remaining holders.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsOvrsbcptFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "RghtsOvrsbcptFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsOversubscriptionFlag";
			definition = "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsRoundUpPrivilegeFlag;
	/**
	 * Indicates whether the shareholder will be able to round up his/her
	 * subscription in the event his/her rights are less than the requirement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsRndUpPrvlgFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "RghtsRndUpPrvlgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRoundUpPrivilegeFlag";
			definition = "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsTransferableFlag;
	/**
	 * Indicates whether rights can be transferred.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsTrfblFlg"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "RghtsTrfblFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsTransferableFlag";
			definition = "Indicates whether rights can be transferred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails;
	/**
	 * Provides details of certificates that have been called for redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD5
	 * CorporateActionSD5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD3
	 * CorporateActionSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDtls"</li>
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
			componentContext_lazy = () -> CorporateActionSD3.mmObject();
			isDerived = false;
			xmlTag = "CertDtls";
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
				messageElement_lazy = () -> Arrays.asList(CorporateActionSD3.mmPlaceAndName, CorporateActionSD3.mmNoticeType, CorporateActionSD3.mmEventCashValue, CorporateActionSD3.mmNumberOfSharesToBeIssued,
						CorporateActionSD3.mmTotalNumberOfSharesOffered, CorporateActionSD3.mmSurvivingCompany, CorporateActionSD3.mmCutOffDays, CorporateActionSD3.mmDTCAutomatedOfferProgram, CorporateActionSD3.mmDTCRecycleCutOffIndicator,
						CorporateActionSD3.mmDTCInstructionLockoutIndicator, CorporateActionSD3.mmLongShortPaymentIndicator, CorporateActionSD3.mmInterimFinalIndicator, CorporateActionSD3.mmOversubscriptionType,
						CorporateActionSD3.mmConditionalPaymentApplicableFlag, CorporateActionSD3.mmSolicitationDealerFeeFlag, CorporateActionSD3.mmDTCCustodyEligibleFlag, CorporateActionSD3.mmDTCReorganisationCustodyEligibleFlag,
						CorporateActionSD3.mmDTCReorganisationDepositEligibleFlag, CorporateActionSD3.mmSurrenderSharesToAgentFlag, CorporateActionSD3.mmStepUpPrivilegeFlag, CorporateActionSD3.mmRightsOversubscriptionFlag,
						CorporateActionSD3.mmRightsRoundUpPrivilegeFlag, CorporateActionSD3.mmRightsTransferableFlag, CorporateActionSD3.mmCertificateDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionSD3";
				definition = "Provides additional information regarding corporate action details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "NtceTp")
	public NoticeType1Code getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(NoticeType1Code noticeType) {
		this.noticeType = noticeType;
	}

	@XmlElement(name = "EvtCshVal")
	public RestrictedFINActiveCurrencyAnd13DecimalAmount getEventCashValue() {
		return eventCashValue;
	}

	public void setEventCashValue(RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue) {
		this.eventCashValue = eventCashValue;
	}

	@XmlElement(name = "NbOfShrsToBeIssd")
	public DecimalNumber getNumberOfSharesToBeIssued() {
		return numberOfSharesToBeIssued;
	}

	public void setNumberOfSharesToBeIssued(DecimalNumber numberOfSharesToBeIssued) {
		this.numberOfSharesToBeIssued = numberOfSharesToBeIssued;
	}

	@XmlElement(name = "TtlNbOfShrsOfferd")
	public DecimalNumber getTotalNumberOfSharesOffered() {
		return totalNumberOfSharesOffered;
	}

	public void setTotalNumberOfSharesOffered(DecimalNumber totalNumberOfSharesOffered) {
		this.totalNumberOfSharesOffered = totalNumberOfSharesOffered;
	}

	@XmlElement(name = "SrvvgCpny")
	public Max70Text getSurvivingCompany() {
		return survivingCompany;
	}

	public void setSurvivingCompany(Max70Text survivingCompany) {
		this.survivingCompany = survivingCompany;
	}

	@XmlElement(name = "CutOffDays")
	public Max3Number getCutOffDays() {
		return cutOffDays;
	}

	public void setCutOffDays(Max3Number cutOffDays) {
		this.cutOffDays = cutOffDays;
	}

	@XmlElement(name = "DTCAutomtdOfferPrgm")
	public DTCAutoOfferProgram1Code getDTCAutomatedOfferProgram() {
		return dTCAutomatedOfferProgram;
	}

	public void setDTCAutomatedOfferProgram(DTCAutoOfferProgram1Code dTCAutomatedOfferProgram) {
		this.dTCAutomatedOfferProgram = dTCAutomatedOfferProgram;
	}

	@XmlElement(name = "DTCRcyclCutOffInd")
	public CutOff1Code getDTCRecycleCutOffIndicator() {
		return dTCRecycleCutOffIndicator;
	}

	public void setDTCRecycleCutOffIndicator(CutOff1Code dTCRecycleCutOffIndicator) {
		this.dTCRecycleCutOffIndicator = dTCRecycleCutOffIndicator;
	}

	@XmlElement(name = "DTCInstrLckoutInd")
	public InstructionLockout1Code getDTCInstructionLockoutIndicator() {
		return dTCInstructionLockoutIndicator;
	}

	public void setDTCInstructionLockoutIndicator(InstructionLockout1Code dTCInstructionLockoutIndicator) {
		this.dTCInstructionLockoutIndicator = dTCInstructionLockoutIndicator;
	}

	@XmlElement(name = "LngShrtPmtInd")
	public AccrualPeriodType1Code getLongShortPaymentIndicator() {
		return longShortPaymentIndicator;
	}

	public void setLongShortPaymentIndicator(AccrualPeriodType1Code longShortPaymentIndicator) {
		this.longShortPaymentIndicator = longShortPaymentIndicator;
	}

	@XmlElement(name = "IntrmFnlInd")
	public InterimFinalPayment1Code getInterimFinalIndicator() {
		return interimFinalIndicator;
	}

	public void setInterimFinalIndicator(InterimFinalPayment1Code interimFinalIndicator) {
		this.interimFinalIndicator = interimFinalIndicator;
	}

	@XmlElement(name = "OvrsbcptTp")
	public OversubscriptionType1Code getOversubscriptionType() {
		return oversubscriptionType;
	}

	public void setOversubscriptionType(OversubscriptionType1Code oversubscriptionType) {
		this.oversubscriptionType = oversubscriptionType;
	}

	@XmlElement(name = "CondlPmtAplblFlg")
	public YesNoIndicator getConditionalPaymentApplicableFlag() {
		return conditionalPaymentApplicableFlag;
	}

	public void setConditionalPaymentApplicableFlag(YesNoIndicator conditionalPaymentApplicableFlag) {
		this.conditionalPaymentApplicableFlag = conditionalPaymentApplicableFlag;
	}

	@XmlElement(name = "SlctnDealrFeeFlg")
	public YesNoIndicator getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag;
	}

	public void setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
	}

	@XmlElement(name = "DTCCtdyElgblFlg")
	public YesNoIndicator getDTCCustodyEligibleFlag() {
		return dTCCustodyEligibleFlag;
	}

	public void setDTCCustodyEligibleFlag(YesNoIndicator dTCCustodyEligibleFlag) {
		this.dTCCustodyEligibleFlag = dTCCustodyEligibleFlag;
	}

	@XmlElement(name = "DTCReorgCtdyElgblFlg")
	public YesNoIndicator getDTCReorganisationCustodyEligibleFlag() {
		return dTCReorganisationCustodyEligibleFlag;
	}

	public void setDTCReorganisationCustodyEligibleFlag(YesNoIndicator dTCReorganisationCustodyEligibleFlag) {
		this.dTCReorganisationCustodyEligibleFlag = dTCReorganisationCustodyEligibleFlag;
	}

	@XmlElement(name = "DTCReorgDpstElgblFlg")
	public YesNoIndicator getDTCReorganisationDepositEligibleFlag() {
		return dTCReorganisationDepositEligibleFlag;
	}

	public void setDTCReorganisationDepositEligibleFlag(YesNoIndicator dTCReorganisationDepositEligibleFlag) {
		this.dTCReorganisationDepositEligibleFlag = dTCReorganisationDepositEligibleFlag;
	}

	@XmlElement(name = "SrrndrShrsToAgtFlg")
	public YesNoIndicator getSurrenderSharesToAgentFlag() {
		return surrenderSharesToAgentFlag;
	}

	public void setSurrenderSharesToAgentFlag(YesNoIndicator surrenderSharesToAgentFlag) {
		this.surrenderSharesToAgentFlag = surrenderSharesToAgentFlag;
	}

	@XmlElement(name = "StepUpPrvlgFlg")
	public YesNoIndicator getStepUpPrivilegeFlag() {
		return stepUpPrivilegeFlag;
	}

	public void setStepUpPrivilegeFlag(YesNoIndicator stepUpPrivilegeFlag) {
		this.stepUpPrivilegeFlag = stepUpPrivilegeFlag;
	}

	@XmlElement(name = "RghtsOvrsbcptFlg")
	public YesNoIndicator getRightsOversubscriptionFlag() {
		return rightsOversubscriptionFlag;
	}

	public void setRightsOversubscriptionFlag(YesNoIndicator rightsOversubscriptionFlag) {
		this.rightsOversubscriptionFlag = rightsOversubscriptionFlag;
	}

	@XmlElement(name = "RghtsRndUpPrvlgFlg")
	public YesNoIndicator getRightsRoundUpPrivilegeFlag() {
		return rightsRoundUpPrivilegeFlag;
	}

	public void setRightsRoundUpPrivilegeFlag(YesNoIndicator rightsRoundUpPrivilegeFlag) {
		this.rightsRoundUpPrivilegeFlag = rightsRoundUpPrivilegeFlag;
	}

	@XmlElement(name = "RghtsTrfblFlg")
	public YesNoIndicator getRightsTransferableFlag() {
		return rightsTransferableFlag;
	}

	public void setRightsTransferableFlag(YesNoIndicator rightsTransferableFlag) {
		this.rightsTransferableFlag = rightsTransferableFlag;
	}

	@XmlElement(name = "CertDtls")
	public List<CorporateActionSD5> getCertificateDetails() {
		return certificateDetails;
	}

	public void setCertificateDetails(List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails) {
		this.certificateDetails = certificateDetails;
	}
}