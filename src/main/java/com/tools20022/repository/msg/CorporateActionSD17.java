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
import com.tools20022.repository.msg.CorporateActionSD15;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmPlaceAndName
 * CorporateActionSD17.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmNoticeType
 * CorporateActionSD17.mmNoticeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmEventCashValue
 * CorporateActionSD17.mmEventCashValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmNumberOfSharesToBeIssued
 * CorporateActionSD17.mmNumberOfSharesToBeIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmTotalNumberOfSharesOffered
 * CorporateActionSD17.mmTotalNumberOfSharesOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmCutOffDays
 * CorporateActionSD17.mmCutOffDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmDTCAutomatedOfferProgram
 * CorporateActionSD17.mmDTCAutomatedOfferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmDTCRecycleCutOffIndicator
 * CorporateActionSD17.mmDTCRecycleCutOffIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmLongShortPaymentIndicator
 * CorporateActionSD17.mmLongShortPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmOversubscriptionType
 * CorporateActionSD17.mmOversubscriptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmConditionalPaymentApplicableFlag
 * CorporateActionSD17.mmConditionalPaymentApplicableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmSolicitationDealerFeeFlag
 * CorporateActionSD17.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmDTCCustodyEligibleFlag
 * CorporateActionSD17.mmDTCCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmDTCReorganisationCustodyEligibleFlag
 * CorporateActionSD17.mmDTCReorganisationCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmDTCReorganisationDepositEligibleFlag
 * CorporateActionSD17.mmDTCReorganisationDepositEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmSurrenderSharesToAgentFlag
 * CorporateActionSD17.mmSurrenderSharesToAgentFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmStepUpPrivilegeFlag
 * CorporateActionSD17.mmStepUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmRightsOversubscriptionFlag
 * CorporateActionSD17.mmRightsOversubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmRightsRoundUpPrivilegeFlag
 * CorporateActionSD17.mmRightsRoundUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmRightsTransferableFlag
 * CorporateActionSD17.mmRightsTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmNonExemptAllowedIndicator
 * CorporateActionSD17.mmNonExemptAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmCertificateDetails
 * CorporateActionSD17.mmCertificateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmEDSMessagingCountryCode
 * CorporateActionSD17.mmEDSMessagingCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17#mmRDPReferenceNumber
 * CorporateActionSD17.mmRDPReferenceNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD17
 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionSD17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14
 * CorporateActionSD14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionSD17", propOrder = {"placeAndName", "noticeType", "eventCashValue", "numberOfSharesToBeIssued", "totalNumberOfSharesOffered", "cutOffDays", "dTCAutomatedOfferProgram", "dTCRecycleCutOffIndicator",
		"longShortPaymentIndicator", "oversubscriptionType", "conditionalPaymentApplicableFlag", "solicitationDealerFeeFlag", "dTCCustodyEligibleFlag", "dTCReorganisationCustodyEligibleFlag", "dTCReorganisationDepositEligibleFlag",
		"surrenderSharesToAgentFlag", "stepUpPrivilegeFlag", "rightsOversubscriptionFlag", "rightsRoundUpPrivilegeFlag", "rightsTransferableFlag", "nonExemptAllowedIndicator", "certificateDetails", "eDSMessagingCountryCode",
		"rDPReferenceNumber"})
public class CorporateActionSD17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmPlaceAndName
	 * CorporateActionSD14.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionSD17, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionSD14.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionSD17 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmNoticeType
	 * CorporateActionSD14.mmNoticeType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<NoticeType1Code>> mmNoticeType = new MMMessageAttribute<CorporateActionSD17, Optional<NoticeType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "NtceTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Notice Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticeType";
			definition = "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name.";
			previousVersion_lazy = () -> CorporateActionSD14.mmNoticeType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NoticeType1Code.mmObject();
		}

		@Override
		public Optional<NoticeType1Code> getValue(CorporateActionSD17 obj) {
			return obj.getNoticeType();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<NoticeType1Code> value) {
			obj.setNoticeType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmEventCashValue
	 * CorporateActionSD14.mmEventCashValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmEventCashValue = new MMMessageAttribute<CorporateActionSD17, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "EvtCshVal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Cash Value"), new DTCCSynonym(this, "Currency (Event Cash Value)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCashValue";
			definition = "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer.";
			previousVersion_lazy = () -> CorporateActionSD14.mmEventCashValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(CorporateActionSD17 obj) {
			return obj.getEventCashValue();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setEventCashValue(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmNumberOfSharesToBeIssued
	 * CorporateActionSD14.mmNumberOfSharesToBeIssued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<DecimalNumber>> mmNumberOfSharesToBeIssued = new MMMessageAttribute<CorporateActionSD17, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "NbOfShrsToBeIssd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Number of Shares to be Issued"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfSharesToBeIssued";
			definition = "Number of shares the issuer is creating as part of the event.";
			previousVersion_lazy = () -> CorporateActionSD14.mmNumberOfSharesToBeIssued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionSD17 obj) {
			return obj.getNumberOfSharesToBeIssued();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<DecimalNumber> value) {
			obj.setNumberOfSharesToBeIssued(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmTotalNumberOfSharesOffered
	 * CorporateActionSD14.mmTotalNumberOfSharesOffered}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<DecimalNumber>> mmTotalNumberOfSharesOffered = new MMMessageAttribute<CorporateActionSD17, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfShrsOfferd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Total Number of Shares Offered"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSharesOffered";
			definition = "Total number of shares that are part of the offer for example subscription offer.";
			previousVersion_lazy = () -> CorporateActionSD14.mmTotalNumberOfSharesOffered;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionSD17 obj) {
			return obj.getTotalNumberOfSharesOffered();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<DecimalNumber> value) {
			obj.setTotalNumberOfSharesOffered(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmCutOffDays
	 * CorporateActionSD14.mmCutOffDays}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<Max3Number>> mmCutOffDays = new MMMessageAttribute<CorporateActionSD17, Optional<Max3Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "CutOffDays";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Cut Off Days"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDays";
			definition = "Number of additional days used to establish a DTC processing cut-off date. For example, DTC typically adds a cut-off off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities.";
			previousVersion_lazy = () -> CorporateActionSD14.mmCutOffDays;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(CorporateActionSD17 obj) {
			return obj.getCutOffDays();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<Max3Number> value) {
			obj.setCutOffDays(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmDTCAutomatedOfferProgram
	 * CorporateActionSD14.mmDTCAutomatedOfferProgram}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<DTCAutoOfferProgram1Code>> mmDTCAutomatedOfferProgram = new MMMessageAttribute<CorporateActionSD17, Optional<DTCAutoOfferProgram1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "DTCAutomtdOfferPrgm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Automated Offer Program"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAutomatedOfferProgram";
			definition = "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal.";
			previousVersion_lazy = () -> CorporateActionSD14.mmDTCAutomatedOfferProgram;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAutoOfferProgram1Code.mmObject();
		}

		@Override
		public Optional<DTCAutoOfferProgram1Code> getValue(CorporateActionSD17 obj) {
			return obj.getDTCAutomatedOfferProgram();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<DTCAutoOfferProgram1Code> value) {
			obj.setDTCAutomatedOfferProgram(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmDTCRecycleCutOffIndicator
	 * CorporateActionSD14.mmDTCRecycleCutOffIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<CutOff1Code>> mmDTCRecycleCutOffIndicator = new MMMessageAttribute<CorporateActionSD17, Optional<CutOff1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "DTCRcyclCutOffInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Recycle Cutoff Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCRecycleCutOffIndicator";
			definition = "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> CorporateActionSD14.mmDTCRecycleCutOffIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CutOff1Code.mmObject();
		}

		@Override
		public Optional<CutOff1Code> getValue(CorporateActionSD17 obj) {
			return obj.getDTCRecycleCutOffIndicator();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<CutOff1Code> value) {
			obj.setDTCRecycleCutOffIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmLongShortPaymentIndicator
	 * CorporateActionSD14.mmLongShortPaymentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<AccrualPeriodType1Code>> mmLongShortPaymentIndicator = new MMMessageAttribute<CorporateActionSD17, Optional<AccrualPeriodType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "LngShrtPmtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Long/ Short Payment Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongShortPaymentIndicator";
			definition = "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security.";
			previousVersion_lazy = () -> CorporateActionSD14.mmLongShortPaymentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccrualPeriodType1Code.mmObject();
		}

		@Override
		public Optional<AccrualPeriodType1Code> getValue(CorporateActionSD17 obj) {
			return obj.getLongShortPaymentIndicator();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<AccrualPeriodType1Code> value) {
			obj.setLongShortPaymentIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmOversubscriptionType
	 * CorporateActionSD14.mmOversubscriptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<OversubscriptionType1Code>> mmOversubscriptionType = new MMMessageAttribute<CorporateActionSD17, Optional<OversubscriptionType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Oversubscription Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionType";
			definition = "Type of oversubscription on the event.";
			previousVersion_lazy = () -> CorporateActionSD14.mmOversubscriptionType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OversubscriptionType1Code.mmObject();
		}

		@Override
		public Optional<OversubscriptionType1Code> getValue(CorporateActionSD17 obj) {
			return obj.getOversubscriptionType();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<OversubscriptionType1Code> value) {
			obj.setOversubscriptionType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmConditionalPaymentApplicableFlag
	 * CorporateActionSD14.mmConditionalPaymentApplicableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmConditionalPaymentApplicableFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "CondlPmtAplblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditional Payment Applicable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPaymentApplicableFlag";
			definition = "Indicates whether the payment made by the issuer is based on a stated condition.";
			previousVersion_lazy = () -> CorporateActionSD14.mmConditionalPaymentApplicableFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getConditionalPaymentApplicableFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setConditionalPaymentApplicableFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmSolicitationDealerFeeFlag
	 * CorporateActionSD14.mmSolicitationDealerFeeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmSolicitationDealerFeeFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Solicitation Dealer Fee Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			previousVersion_lazy = () -> CorporateActionSD14.mmSolicitationDealerFeeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getSolicitationDealerFeeFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setSolicitationDealerFeeFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Indicates whether positions held in custody program are eligible for instruction processing at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmDTCCustodyEligibleFlag
	 * CorporateActionSD14.mmDTCCustodyEligibleFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmDTCCustodyEligibleFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "DTCCtdyElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Custody Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCustodyEligibleFlag";
			definition = "Indicates whether positions held in custody program are eligible for instruction processing at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> CorporateActionSD14.mmDTCCustodyEligibleFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getDTCCustodyEligibleFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setDTCCustodyEligibleFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Indicates whether the event is eligible for custody reorganisation service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmDTCReorganisationCustodyEligibleFlag
	 * CorporateActionSD14.mmDTCReorganisationCustodyEligibleFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmDTCReorganisationCustodyEligibleFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgCtdyElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Reorg Custody Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationCustodyEligibleFlag";
			definition = "Indicates whether the event is eligible for custody reorganisation service at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> CorporateActionSD14.mmDTCReorganisationCustodyEligibleFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getDTCReorganisationCustodyEligibleFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setDTCReorganisationCustodyEligibleFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Indicates whether the event is eligible for reorganisation deposit service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmDTCReorganisationDepositEligibleFlag
	 * CorporateActionSD14.mmDTCReorganisationDepositEligibleFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmDTCReorganisationDepositEligibleFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstElgblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Reorg Deposit Eligible Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositEligibleFlag";
			definition = "Indicates whether the event is eligible for reorganisation deposit service at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> CorporateActionSD14.mmDTCReorganisationDepositEligibleFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getDTCReorganisationDepositEligibleFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setDTCReorganisationDepositEligibleFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmSurrenderSharesToAgentFlag
	 * CorporateActionSD14.mmSurrenderSharesToAgentFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmSurrenderSharesToAgentFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "SrrndrShrsToAgtFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Surrender Shares to Agent Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurrenderSharesToAgentFlag";
			definition = "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement.";
			previousVersion_lazy = () -> CorporateActionSD14.mmSurrenderSharesToAgentFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getSurrenderSharesToAgentFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setSurrenderSharesToAgentFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmStepUpPrivilegeFlag
	 * CorporateActionSD14.mmStepUpPrivilegeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmStepUpPrivilegeFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "StepUpPrvlgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Step-Up Privilege Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepUpPrivilegeFlag";
			definition = "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled.";
			previousVersion_lazy = () -> CorporateActionSD14.mmStepUpPrivilegeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getStepUpPrivilegeFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setStepUpPrivilegeFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmRightsOversubscriptionFlag
	 * CorporateActionSD14.mmRightsOversubscriptionFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmRightsOversubscriptionFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "RghtsOvrsbcptFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Oversubscription Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsOversubscriptionFlag";
			definition = "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders.";
			previousVersion_lazy = () -> CorporateActionSD14.mmRightsOversubscriptionFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getRightsOversubscriptionFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setRightsOversubscriptionFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmRightsRoundUpPrivilegeFlag
	 * CorporateActionSD14.mmRightsRoundUpPrivilegeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmRightsRoundUpPrivilegeFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "RghtsRndUpPrvlgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Round-up Privilege Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRoundUpPrivilegeFlag";
			definition = "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement.";
			previousVersion_lazy = () -> CorporateActionSD14.mmRightsRoundUpPrivilegeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getRightsRoundUpPrivilegeFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setRightsRoundUpPrivilegeFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmRightsTransferableFlag
	 * CorporateActionSD14.mmRightsTransferableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmRightsTransferableFlag = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "RghtsTrfblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rights Transferable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsTransferableFlag";
			definition = "Indicates whether rights can be transferred.";
			previousVersion_lazy = () -> CorporateActionSD14.mmRightsTransferableFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getRightsTransferableFlag();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setRightsTransferableFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "NonXmptAllwdInd")
	protected YesNoIndicator nonExemptAllowedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonXmptAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExemptAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate of deposit early redemption event is exempt from the presentation of the required legal documentation. When presentation is exempt, the instructing client agrees to maintain such documentation for at least 30 months following payment of the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>> mmNonExemptAllowedIndicator = new MMMessageAttribute<CorporateActionSD17, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "NonXmptAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExemptAllowedIndicator";
			definition = "Indicates whether the certificate of deposit early redemption event is exempt from the presentation of the required legal documentation. When presentation is exempt, the instructing client agrees to maintain such documentation for at least 30 months following payment of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD17 obj) {
			return obj.getNonExemptAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<YesNoIndicator> value) {
			obj.setNonExemptAllowedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertDtls")
	protected List<CorporateActionSD15> certificateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD15
	 * CorporateActionSD15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
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
	 * "Provides details of certificates that have been called for redemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmCertificateDetails
	 * CorporateActionSD14.mmCertificateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionSD17, List<CorporateActionSD15>> mmCertificateDetails = new MMMessageAssociationEnd<CorporateActionSD17, List<CorporateActionSD15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "CertDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Certificate Details"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDetails";
			definition = "Provides details of certificates that have been called for redemption.";
			previousVersion_lazy = () -> CorporateActionSD14.mmCertificateDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionSD15.mmObject();
		}

		@Override
		public List<CorporateActionSD15> getValue(CorporateActionSD17 obj) {
			return obj.getCertificateDetails();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, List<CorporateActionSD15> value) {
			obj.setCertificateDetails(value);
		}
	};
	@XmlElement(name = "EDSMsggCtryCd")
	protected CountryCode eDSMessagingCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EDSMsggCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of issue used to determine whether the electable option requires tax Exempt or wire information when sending EDS elections via the CAIN message type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmEDSMessagingCountryCode
	 * CorporateActionSD14.mmEDSMessagingCountryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<CountryCode>> mmEDSMessagingCountryCode = new MMMessageAttribute<CorporateActionSD17, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCode";
			definition = "Country of issue used to determine whether the electable option requires tax Exempt or wire information when sending EDS elections via the CAIN message type.";
			previousVersion_lazy = () -> CorporateActionSD14.mmEDSMessagingCountryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(CorporateActionSD17 obj) {
			return obj.getEDSMessagingCountryCode();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<CountryCode> value) {
			obj.setEDSMessagingCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "RDPRefNb")
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (event details, options, movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related activity types 74, and 54. If event details and cash option are sourced from the activity type 74, then activity type 74 will be in RDP reference number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP reference number based on DTCC event group (reorganization, distribution, or redemption)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14#mmRDPReferenceNumber
	 * CorporateActionSD14.mmRDPReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD17, Optional<Exact32AlphaNumericText>> mmRDPReferenceNumber = new MMMessageAttribute<CorporateActionSD17, Optional<Exact32AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD17.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (event details, options, movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related activity types 74, and 54. If event details and cash option are sourced from the activity type 74, then activity type 74 will be in RDP reference number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP reference number based on DTCC event group (reorganization, distribution, or redemption).";
			previousVersion_lazy = () -> CorporateActionSD14.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact32AlphaNumericText> getValue(CorporateActionSD17 obj) {
			return obj.getRDPReferenceNumber();
		}

		@Override
		public void setValue(CorporateActionSD17 obj, Optional<Exact32AlphaNumericText> value) {
			obj.setRDPReferenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD17.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionSD17.mmNoticeType,
						com.tools20022.repository.msg.CorporateActionSD17.mmEventCashValue, com.tools20022.repository.msg.CorporateActionSD17.mmNumberOfSharesToBeIssued,
						com.tools20022.repository.msg.CorporateActionSD17.mmTotalNumberOfSharesOffered, com.tools20022.repository.msg.CorporateActionSD17.mmCutOffDays,
						com.tools20022.repository.msg.CorporateActionSD17.mmDTCAutomatedOfferProgram, com.tools20022.repository.msg.CorporateActionSD17.mmDTCRecycleCutOffIndicator,
						com.tools20022.repository.msg.CorporateActionSD17.mmLongShortPaymentIndicator, com.tools20022.repository.msg.CorporateActionSD17.mmOversubscriptionType,
						com.tools20022.repository.msg.CorporateActionSD17.mmConditionalPaymentApplicableFlag, com.tools20022.repository.msg.CorporateActionSD17.mmSolicitationDealerFeeFlag,
						com.tools20022.repository.msg.CorporateActionSD17.mmDTCCustodyEligibleFlag, com.tools20022.repository.msg.CorporateActionSD17.mmDTCReorganisationCustodyEligibleFlag,
						com.tools20022.repository.msg.CorporateActionSD17.mmDTCReorganisationDepositEligibleFlag, com.tools20022.repository.msg.CorporateActionSD17.mmSurrenderSharesToAgentFlag,
						com.tools20022.repository.msg.CorporateActionSD17.mmStepUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD17.mmRightsOversubscriptionFlag,
						com.tools20022.repository.msg.CorporateActionSD17.mmRightsRoundUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD17.mmRightsTransferableFlag,
						com.tools20022.repository.msg.CorporateActionSD17.mmNonExemptAllowedIndicator, com.tools20022.repository.msg.CorporateActionSD17.mmCertificateDetails,
						com.tools20022.repository.msg.CorporateActionSD17.mmEDSMessagingCountryCode, com.tools20022.repository.msg.CorporateActionSD17.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionSD17";
				definition = "Provides additional information regarding corporate action details.";
				previousVersion_lazy = () -> CorporateActionSD14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionSD17 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<NoticeType1Code> getNoticeType() {
		return noticeType == null ? Optional.empty() : Optional.of(noticeType);
	}

	public CorporateActionSD17 setNoticeType(NoticeType1Code noticeType) {
		this.noticeType = noticeType;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getEventCashValue() {
		return eventCashValue == null ? Optional.empty() : Optional.of(eventCashValue);
	}

	public CorporateActionSD17 setEventCashValue(RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue) {
		this.eventCashValue = eventCashValue;
		return this;
	}

	public Optional<DecimalNumber> getNumberOfSharesToBeIssued() {
		return numberOfSharesToBeIssued == null ? Optional.empty() : Optional.of(numberOfSharesToBeIssued);
	}

	public CorporateActionSD17 setNumberOfSharesToBeIssued(DecimalNumber numberOfSharesToBeIssued) {
		this.numberOfSharesToBeIssued = numberOfSharesToBeIssued;
		return this;
	}

	public Optional<DecimalNumber> getTotalNumberOfSharesOffered() {
		return totalNumberOfSharesOffered == null ? Optional.empty() : Optional.of(totalNumberOfSharesOffered);
	}

	public CorporateActionSD17 setTotalNumberOfSharesOffered(DecimalNumber totalNumberOfSharesOffered) {
		this.totalNumberOfSharesOffered = totalNumberOfSharesOffered;
		return this;
	}

	public Optional<Max3Number> getCutOffDays() {
		return cutOffDays == null ? Optional.empty() : Optional.of(cutOffDays);
	}

	public CorporateActionSD17 setCutOffDays(Max3Number cutOffDays) {
		this.cutOffDays = cutOffDays;
		return this;
	}

	public Optional<DTCAutoOfferProgram1Code> getDTCAutomatedOfferProgram() {
		return dTCAutomatedOfferProgram == null ? Optional.empty() : Optional.of(dTCAutomatedOfferProgram);
	}

	public CorporateActionSD17 setDTCAutomatedOfferProgram(DTCAutoOfferProgram1Code dTCAutomatedOfferProgram) {
		this.dTCAutomatedOfferProgram = dTCAutomatedOfferProgram;
		return this;
	}

	public Optional<CutOff1Code> getDTCRecycleCutOffIndicator() {
		return dTCRecycleCutOffIndicator == null ? Optional.empty() : Optional.of(dTCRecycleCutOffIndicator);
	}

	public CorporateActionSD17 setDTCRecycleCutOffIndicator(CutOff1Code dTCRecycleCutOffIndicator) {
		this.dTCRecycleCutOffIndicator = dTCRecycleCutOffIndicator;
		return this;
	}

	public Optional<AccrualPeriodType1Code> getLongShortPaymentIndicator() {
		return longShortPaymentIndicator == null ? Optional.empty() : Optional.of(longShortPaymentIndicator);
	}

	public CorporateActionSD17 setLongShortPaymentIndicator(AccrualPeriodType1Code longShortPaymentIndicator) {
		this.longShortPaymentIndicator = longShortPaymentIndicator;
		return this;
	}

	public Optional<OversubscriptionType1Code> getOversubscriptionType() {
		return oversubscriptionType == null ? Optional.empty() : Optional.of(oversubscriptionType);
	}

	public CorporateActionSD17 setOversubscriptionType(OversubscriptionType1Code oversubscriptionType) {
		this.oversubscriptionType = oversubscriptionType;
		return this;
	}

	public Optional<YesNoIndicator> getConditionalPaymentApplicableFlag() {
		return conditionalPaymentApplicableFlag == null ? Optional.empty() : Optional.of(conditionalPaymentApplicableFlag);
	}

	public CorporateActionSD17 setConditionalPaymentApplicableFlag(YesNoIndicator conditionalPaymentApplicableFlag) {
		this.conditionalPaymentApplicableFlag = conditionalPaymentApplicableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag == null ? Optional.empty() : Optional.of(solicitationDealerFeeFlag);
	}

	public CorporateActionSD17 setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCCustodyEligibleFlag() {
		return dTCCustodyEligibleFlag == null ? Optional.empty() : Optional.of(dTCCustodyEligibleFlag);
	}

	public CorporateActionSD17 setDTCCustodyEligibleFlag(YesNoIndicator dTCCustodyEligibleFlag) {
		this.dTCCustodyEligibleFlag = dTCCustodyEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCReorganisationCustodyEligibleFlag() {
		return dTCReorganisationCustodyEligibleFlag == null ? Optional.empty() : Optional.of(dTCReorganisationCustodyEligibleFlag);
	}

	public CorporateActionSD17 setDTCReorganisationCustodyEligibleFlag(YesNoIndicator dTCReorganisationCustodyEligibleFlag) {
		this.dTCReorganisationCustodyEligibleFlag = dTCReorganisationCustodyEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getDTCReorganisationDepositEligibleFlag() {
		return dTCReorganisationDepositEligibleFlag == null ? Optional.empty() : Optional.of(dTCReorganisationDepositEligibleFlag);
	}

	public CorporateActionSD17 setDTCReorganisationDepositEligibleFlag(YesNoIndicator dTCReorganisationDepositEligibleFlag) {
		this.dTCReorganisationDepositEligibleFlag = dTCReorganisationDepositEligibleFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSurrenderSharesToAgentFlag() {
		return surrenderSharesToAgentFlag == null ? Optional.empty() : Optional.of(surrenderSharesToAgentFlag);
	}

	public CorporateActionSD17 setSurrenderSharesToAgentFlag(YesNoIndicator surrenderSharesToAgentFlag) {
		this.surrenderSharesToAgentFlag = surrenderSharesToAgentFlag;
		return this;
	}

	public Optional<YesNoIndicator> getStepUpPrivilegeFlag() {
		return stepUpPrivilegeFlag == null ? Optional.empty() : Optional.of(stepUpPrivilegeFlag);
	}

	public CorporateActionSD17 setStepUpPrivilegeFlag(YesNoIndicator stepUpPrivilegeFlag) {
		this.stepUpPrivilegeFlag = stepUpPrivilegeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsOversubscriptionFlag() {
		return rightsOversubscriptionFlag == null ? Optional.empty() : Optional.of(rightsOversubscriptionFlag);
	}

	public CorporateActionSD17 setRightsOversubscriptionFlag(YesNoIndicator rightsOversubscriptionFlag) {
		this.rightsOversubscriptionFlag = rightsOversubscriptionFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsRoundUpPrivilegeFlag() {
		return rightsRoundUpPrivilegeFlag == null ? Optional.empty() : Optional.of(rightsRoundUpPrivilegeFlag);
	}

	public CorporateActionSD17 setRightsRoundUpPrivilegeFlag(YesNoIndicator rightsRoundUpPrivilegeFlag) {
		this.rightsRoundUpPrivilegeFlag = rightsRoundUpPrivilegeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRightsTransferableFlag() {
		return rightsTransferableFlag == null ? Optional.empty() : Optional.of(rightsTransferableFlag);
	}

	public CorporateActionSD17 setRightsTransferableFlag(YesNoIndicator rightsTransferableFlag) {
		this.rightsTransferableFlag = rightsTransferableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getNonExemptAllowedIndicator() {
		return nonExemptAllowedIndicator == null ? Optional.empty() : Optional.of(nonExemptAllowedIndicator);
	}

	public CorporateActionSD17 setNonExemptAllowedIndicator(YesNoIndicator nonExemptAllowedIndicator) {
		this.nonExemptAllowedIndicator = nonExemptAllowedIndicator;
		return this;
	}

	public List<CorporateActionSD15> getCertificateDetails() {
		return certificateDetails == null ? certificateDetails = new ArrayList<>() : certificateDetails;
	}

	public CorporateActionSD17 setCertificateDetails(List<CorporateActionSD15> certificateDetails) {
		this.certificateDetails = Objects.requireNonNull(certificateDetails);
		return this;
	}

	public Optional<CountryCode> getEDSMessagingCountryCode() {
		return eDSMessagingCountryCode == null ? Optional.empty() : Optional.of(eDSMessagingCountryCode);
	}

	public CorporateActionSD17 setEDSMessagingCountryCode(CountryCode eDSMessagingCountryCode) {
		this.eDSMessagingCountryCode = eDSMessagingCountryCode;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CorporateActionSD17 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}
}