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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat41Choice;
import com.tools20022.repository.choice.DateFormat49Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmAnnouncementDate
 * CorporateActionDate74.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmCertificationDeadline
 * CorporateActionDate74.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmCourtApprovalDate
 * CorporateActionDate74.mmCourtApprovalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEarlyClosingDate
 * CorporateActionDate74.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEffectiveDate
 * CorporateActionDate74.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEqualisationDate
 * CorporateActionDate74.mmEqualisationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmFurtherDetailedAnnouncementDate
 * CorporateActionDate74.mmFurtherDetailedAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmFixingDate
 * CorporateActionDate74.mmFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLotteryDate
 * CorporateActionDate74.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmNewMaturityDate
 * CorporateActionDate74.mmNewMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmMeetingDate
 * CorporateActionDate74.mmMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmMarginFixingDate
 * CorporateActionDate74.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmProrationDate
 * CorporateActionDate74.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmRecordDate
 * CorporateActionDate74.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmRegistrationDeadline
 * CorporateActionDate74.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmResultsPublicationDate
 * CorporateActionDate74.mmResultsPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmDeadlineToSplit
 * CorporateActionDate74.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDate74.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmTradingSuspendedDate
 * CorporateActionDate74.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmUnconditionalDate
 * CorporateActionDate74.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmWhollyUnconditionalDate
 * CorporateActionDate74.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmExDividendDate
 * CorporateActionDate74.mmExDividendDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmOfficialAnnouncementPublicationDate
 * CorporateActionDate74.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmSpecialExDate
 * CorporateActionDate74.mmSpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmGuaranteedParticipationDate
 * CorporateActionDate74.mmGuaranteedParticipationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmElectionToCounterpartyMarketDeadline
 * CorporateActionDate74.mmElectionToCounterpartyMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmElectionToCounterpartyResponseDeadline
 * CorporateActionDate74.mmElectionToCounterpartyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLapsedDate
 * CorporateActionDate74.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmPaymentDate
 * CorporateActionDate74.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmThirdPartyDeadline
 * CorporateActionDate74.mmThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEarlyThirdPartyDeadline
 * CorporateActionDate74.mmEarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmMarketClaimTrackingEndDate
 * CorporateActionDate74.mmMarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLeadPlaintiffDeadline
 * CorporateActionDate74.mmLeadPlaintiffDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmFilingDate
 * CorporateActionDate74.mmFilingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmHearingDate
 * CorporateActionDate74.mmHearingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate74
 * ConstraintEffectiveDateRule.forCorporateActionDate74}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDate74"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate74", propOrder = {"announcementDate", "certificationDeadline", "courtApprovalDate", "earlyClosingDate", "effectiveDate", "equalisationDate", "furtherDetailedAnnouncementDate", "fixingDate",
		"lotteryDate", "newMaturityDate", "meetingDate", "marginFixingDate", "prorationDate", "recordDate", "registrationDeadline", "resultsPublicationDate", "deadlineToSplit", "deadlineForTaxBreakdownInstruction", "tradingSuspendedDate",
		"unconditionalDate", "whollyUnconditionalDate", "exDividendDate", "officialAnnouncementPublicationDate", "specialExDate", "guaranteedParticipationDate", "electionToCounterpartyMarketDeadline",
		"electionToCounterpartyResponseDeadline", "lapsedDate", "paymentDate", "thirdPartyDeadline", "earlyThirdPartyDeadline", "marketClaimTrackingEndDate", "leadPlaintiffDeadline", "filingDate", "hearingDate"})
public class CorporateActionDate74 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnncmntDt")
	protected DateFormat49Choice announcementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ANOU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmAnnouncementDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ANOU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnDdln")
	protected DateFormat49Choice certificationDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
	 * CorporateActionDeadline.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::CERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deadline by which the certification must be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmCertificationDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCertificationDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::CERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the certification must be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getCertificationDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setCertificationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "CrtApprvlDt")
	protected DateFormat49Choice courtApprovalDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCourtApprovalDate
	 * ClassAction.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrtApprvlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::COAP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the court provided approval."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmCourtApprovalDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmCourtApprovalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "CrtApprvlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::COAP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the court provided approval.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getCourtApprovalDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setCourtApprovalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlyClsgDt")
	protected DateFormat49Choice earlyClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
	 * CorporateActionDeadline.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ECDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First possible early closing date of an offer if different from the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmEarlyClosingDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "EarlyClsgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ECDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getEarlyClosingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setEarlyClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDt")
	protected DateFormat49Choice effectiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
	 * CorporateActionEvent.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EFFD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmEffectiveDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEffectiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EFFD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EqulstnDt")
	protected DateFormat49Choice equalisationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmDate
	 * Equalisation.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EQUL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmEqualisationDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "EqulstnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EQUL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationDate";
			definition = "Date/time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getEqualisationDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setEqualisationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FrthrDtldAnncmntDt")
	protected DateFormat49Choice furtherDetailedAnnouncementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
	 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrthrDtldAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::FDAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailedAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmFurtherDetailedAnnouncementDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmFurtherDetailsAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "FrthrDtldAnncmntDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::FDAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getFurtherDetailedAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setFurtherDetailedAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FxgDt")
	protected DateFormat49Choice fixingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOfferPriceFixingDate
	 * ProceedsDefinition.mmOfferPriceFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::IFIX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an index / rate / price / value will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmFixingDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmOfferPriceFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::IFIX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which an index / rate / price / value will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getFixingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryDt")
	protected DateFormat49Choice lotteryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
	 * Lottery.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmLotteryDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "LtryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDate";
			definition = "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getLotteryDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setLotteryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NewMtrtyDt")
	protected DateFormat49Choice newMaturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewMtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewMaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time to which the maturity date of an interest bearing security is extended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmNewMaturityDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "NewMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDate";
			definition = "Date/time to which the maturity date of an interest bearing security is extended.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getNewMaturityDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setNewMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgDt")
	protected DateFormat49Choice meetingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::MEET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the bondholder's or shareholder's meeting will take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmMeetingDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDateAndTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "MtgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MEET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDate";
			definition = "Date/time on which the bondholder's or shareholder's meeting will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getMeetingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setMeetingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnFxgDt")
	protected DateFormat49Choice marginFixingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
	 * CorporateActionEvent.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::MFIX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmMarginFixingDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmMarginFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "MrgnFxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MFIX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getMarginFixingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setMarginFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrratnDt")
	protected DateFormat49Choice prorationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
	 * BiddingConditions.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PROD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmProrationDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "PrratnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PROD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationDate";
			definition = "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getProrationDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setProrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrdDt")
	protected DateFormat49Choice recordDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RDTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmRecordDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setRecordDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDdln")
	protected DateFormat49Choice registrationDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
	 * CorporateActionDeadline.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmRegistrationDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRegistrationDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "RegnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date/time on which instructions to register or registration details will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getRegistrationDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setRegistrationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltsPblctnDt")
	protected DateFormat49Choice resultsPublicationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltsPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RESU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultsPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which results are published, for example, results of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmResultsPublicationDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "RsltsPblctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RESU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date/time on which results are published, for example, results of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getResultsPublicationDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setResultsPublicationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DdlnToSplt")
	protected DateFormat49Choice deadlineToSplit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
	 * CorporateActionDeadline.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnToSplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SPLT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineToSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, for example, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmDeadlineToSplit = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineToSplit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SPLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, for example, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getDeadlineToSplit();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setDeadlineToSplit(value.orElse(null));
		}
	};
	@XmlElement(name = "DdlnForTaxBrkdwnInstr")
	protected DateFormat49Choice deadlineForTaxBreakdownInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnForTaxBrkdwnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TAXB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmDeadlineForTaxBreakdownInstruction = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "DdlnForTaxBrkdwnInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TAXB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date/time on until which tax breakdown instructions will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getDeadlineForTaxBreakdownInstruction();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setDeadlineForTaxBreakdownInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSspdDt")
	protected DateFormat49Choice tradingSuspendedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
	 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSspdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TSDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmTradingSuspendedDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmTradingSuspendedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TSDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date/time at which trading of a security is suspended as the result of an event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getTradingSuspendedDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setTradingSuspendedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "UcondlDt")
	protected DateFormat49Choice unconditionalDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
	 * CorporateActionEvent.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmUnconditionalDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnconditionalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "UcondlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalDate";
			definition = "Date/time upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setUnconditionalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "WhlyUcondlDt")
	protected DateFormat49Choice whollyUnconditionalDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
	 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlyUcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::WUCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmWhollyUnconditionalDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmWhollyUnconditionalDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "WhlyUcondlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::WUCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getWhollyUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setWhollyUnconditionalDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ExDvddDt")
	protected DateFormat49Choice exDividendDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
	 * Dividend.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExDvddDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::XDTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmExDividendDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmExDividendDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "ExDvddDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::XDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getExDividendDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setExDividendDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OffclAnncmntPblctnDt")
	protected DateFormat49Choice officialAnnouncementPublicationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
	 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclAnncmntPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::OAPD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmOfficialAnnouncementPublicationDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "OffclAnncmntPblctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::OAPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getOfficialAnnouncementPublicationDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setOfficialAnnouncementPublicationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SpclExDt")
	protected DateFormat49Choice specialExDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
	 * CorporateActionDeadline.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclExDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SXDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmSpecialExDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmSpecialExDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "SpclExDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SXDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getSpecialExDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setSpecialExDate(value.orElse(null));
		}
	};
	@XmlElement(name = "GrntedPrtcptnDt")
	protected DateFormat49Choice guaranteedParticipationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
	 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedPrtcptnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::GUPA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmGuaranteedParticipationDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmGuaranteedParticipationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "GrntedPrtcptnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::GUPA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getGuaranteedParticipationDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setGuaranteedParticipationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnToCtrPtyMktDdln")
	protected DateFormat49Choice electionToCounterpartyMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ECPD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmElectionToCounterpartyMarketDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyMktDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ECPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyMarketDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getElectionToCounterpartyMarketDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setElectionToCounterpartyMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnToCtrPtyRspnDdln")
	protected DateFormat49Choice electionToCounterpartyResponseDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyRspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmElectionToCounterpartyResponseDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyRspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyResponseDeadline";
			definition = "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getElectionToCounterpartyResponseDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setElectionToCounterpartyResponseDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "LpsdDt")
	protected DateFormat49Choice lapsedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
	 * CorporateActionEvent.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LpsdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::LAPD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmLapsedDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmLapsedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "LpsdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::LAPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getLapsedDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setLapsedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtDt")
	protected DateFormat49Choice paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PAYD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmPaymentDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PAYD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdPtyDdln")
	protected DateFormat49Choice thirdPartyDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmThirdPartyDeadline
	 * CorporateActionDeadline.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TPDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time by which the account owner must instruct directly another party, for example, to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmThirdPartyDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmThirdPartyDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TPDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/time by which the account owner must instruct directly another party, for example, to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getThirdPartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setThirdPartyDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlyThrdPtyDdln")
	protected DateFormat49Choice earlyThirdPartyDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyThrdPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ETPD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmEarlyThirdPartyDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyResponseDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "EarlyThrdPtyDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ETPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getEarlyThirdPartyDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setEarlyThirdPartyDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClmTrckgEndDt")
	protected DateFormat49Choice marketClaimTrackingEndDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimTrackingEndDate
	 * MarketClaim.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmTrckgEndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::MCTD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimTrackingEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmMarketClaimTrackingEndDate = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimTrackingEndDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "MktClmTrckgEndDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MCTD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getMarketClaimTrackingEndDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setMarketClaimTrackingEndDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LeadPlntffDdln")
	protected DateFormat49Choice leadPlaintiffDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmLeadPlaintiffDeadline
	 * ClassAction.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LeadPlntffDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadPlaintiffDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day an investor can become a lead plaintiff."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>> mmLeadPlaintiffDeadline = new MMMessageAssociationEnd<CorporateActionDate74, Optional<DateFormat49Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmLeadPlaintiffDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "LeadPlntffDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}

		@Override
		public Optional<DateFormat49Choice> getValue(CorporateActionDate74 obj) {
			return obj.getLeadPlaintiffDeadline();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat49Choice> value) {
			obj.setLeadPlaintiffDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "FilgDt")
	protected DateFormat41Choice filingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat41Choice
	 * DateFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmFilingDate
	 * ClassAction.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FilgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the action was filed at the applicable court."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate74, Optional<DateFormat41Choice>> mmFilingDate = new MMMessageAttribute<CorporateActionDate74, Optional<DateFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmFilingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "FilgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat41Choice.mmObject();
		}

		@Override
		public Optional<DateFormat41Choice> getValue(CorporateActionDate74 obj) {
			return obj.getFilingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat41Choice> value) {
			obj.setFilingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "HrgDt")
	protected DateFormat41Choice hearingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat41Choice
	 * DateFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmHearingDate
	 * ClassAction.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HrgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HearingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date for the hearing between the plaintiff and defendant, as set by the court."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDate74, Optional<DateFormat41Choice>> mmHearingDate = new MMMessageAttribute<CorporateActionDate74, Optional<DateFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmHearingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate74.mmObject();
			isDerived = false;
			xmlTag = "HrgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat41Choice.mmObject();
		}

		@Override
		public Optional<DateFormat41Choice> getValue(CorporateActionDate74 obj) {
			return obj.getHearingDate();
		}

		@Override
		public void setValue(CorporateActionDate74 obj, Optional<DateFormat41Choice> value) {
			obj.setHearingDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate74.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate74.mmCertificationDeadline,
						com.tools20022.repository.msg.CorporateActionDate74.mmCourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate74.mmEarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate74.mmEffectiveDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmEqualisationDate, com.tools20022.repository.msg.CorporateActionDate74.mmFurtherDetailedAnnouncementDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate74.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate74.mmNewMaturityDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate74.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate74.mmProrationDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmRecordDate, com.tools20022.repository.msg.CorporateActionDate74.mmRegistrationDeadline,
						com.tools20022.repository.msg.CorporateActionDate74.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate74.mmDeadlineToSplit,
						com.tools20022.repository.msg.CorporateActionDate74.mmDeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate74.mmTradingSuspendedDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate74.mmWhollyUnconditionalDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmExDividendDate, com.tools20022.repository.msg.CorporateActionDate74.mmOfficialAnnouncementPublicationDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmSpecialExDate, com.tools20022.repository.msg.CorporateActionDate74.mmGuaranteedParticipationDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmElectionToCounterpartyMarketDeadline, com.tools20022.repository.msg.CorporateActionDate74.mmElectionToCounterpartyResponseDeadline,
						com.tools20022.repository.msg.CorporateActionDate74.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate74.mmPaymentDate, com.tools20022.repository.msg.CorporateActionDate74.mmThirdPartyDeadline,
						com.tools20022.repository.msg.CorporateActionDate74.mmEarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate74.mmMarketClaimTrackingEndDate,
						com.tools20022.repository.msg.CorporateActionDate74.mmLeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate74.mmFilingDate, com.tools20022.repository.msg.CorporateActionDate74.mmHearingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate74);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate74";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat49Choice> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public CorporateActionDate74 setAnnouncementDate(DateFormat49Choice announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<DateFormat49Choice> getCertificationDeadline() {
		return certificationDeadline == null ? Optional.empty() : Optional.of(certificationDeadline);
	}

	public CorporateActionDate74 setCertificationDeadline(DateFormat49Choice certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getCourtApprovalDate() {
		return courtApprovalDate == null ? Optional.empty() : Optional.of(courtApprovalDate);
	}

	public CorporateActionDate74 setCourtApprovalDate(DateFormat49Choice courtApprovalDate) {
		this.courtApprovalDate = courtApprovalDate;
		return this;
	}

	public Optional<DateFormat49Choice> getEarlyClosingDate() {
		return earlyClosingDate == null ? Optional.empty() : Optional.of(earlyClosingDate);
	}

	public CorporateActionDate74 setEarlyClosingDate(DateFormat49Choice earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
		return this;
	}

	public Optional<DateFormat49Choice> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public CorporateActionDate74 setEffectiveDate(DateFormat49Choice effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<DateFormat49Choice> getEqualisationDate() {
		return equalisationDate == null ? Optional.empty() : Optional.of(equalisationDate);
	}

	public CorporateActionDate74 setEqualisationDate(DateFormat49Choice equalisationDate) {
		this.equalisationDate = equalisationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getFurtherDetailedAnnouncementDate() {
		return furtherDetailedAnnouncementDate == null ? Optional.empty() : Optional.of(furtherDetailedAnnouncementDate);
	}

	public CorporateActionDate74 setFurtherDetailedAnnouncementDate(DateFormat49Choice furtherDetailedAnnouncementDate) {
		this.furtherDetailedAnnouncementDate = furtherDetailedAnnouncementDate;
		return this;
	}

	public Optional<DateFormat49Choice> getFixingDate() {
		return fixingDate == null ? Optional.empty() : Optional.of(fixingDate);
	}

	public CorporateActionDate74 setFixingDate(DateFormat49Choice fixingDate) {
		this.fixingDate = fixingDate;
		return this;
	}

	public Optional<DateFormat49Choice> getLotteryDate() {
		return lotteryDate == null ? Optional.empty() : Optional.of(lotteryDate);
	}

	public CorporateActionDate74 setLotteryDate(DateFormat49Choice lotteryDate) {
		this.lotteryDate = lotteryDate;
		return this;
	}

	public Optional<DateFormat49Choice> getNewMaturityDate() {
		return newMaturityDate == null ? Optional.empty() : Optional.of(newMaturityDate);
	}

	public CorporateActionDate74 setNewMaturityDate(DateFormat49Choice newMaturityDate) {
		this.newMaturityDate = newMaturityDate;
		return this;
	}

	public Optional<DateFormat49Choice> getMeetingDate() {
		return meetingDate == null ? Optional.empty() : Optional.of(meetingDate);
	}

	public CorporateActionDate74 setMeetingDate(DateFormat49Choice meetingDate) {
		this.meetingDate = meetingDate;
		return this;
	}

	public Optional<DateFormat49Choice> getMarginFixingDate() {
		return marginFixingDate == null ? Optional.empty() : Optional.of(marginFixingDate);
	}

	public CorporateActionDate74 setMarginFixingDate(DateFormat49Choice marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
		return this;
	}

	public Optional<DateFormat49Choice> getProrationDate() {
		return prorationDate == null ? Optional.empty() : Optional.of(prorationDate);
	}

	public CorporateActionDate74 setProrationDate(DateFormat49Choice prorationDate) {
		this.prorationDate = prorationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CorporateActionDate74 setRecordDate(DateFormat49Choice recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<DateFormat49Choice> getRegistrationDeadline() {
		return registrationDeadline == null ? Optional.empty() : Optional.of(registrationDeadline);
	}

	public CorporateActionDate74 setRegistrationDeadline(DateFormat49Choice registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getResultsPublicationDate() {
		return resultsPublicationDate == null ? Optional.empty() : Optional.of(resultsPublicationDate);
	}

	public CorporateActionDate74 setResultsPublicationDate(DateFormat49Choice resultsPublicationDate) {
		this.resultsPublicationDate = resultsPublicationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getDeadlineToSplit() {
		return deadlineToSplit == null ? Optional.empty() : Optional.of(deadlineToSplit);
	}

	public CorporateActionDate74 setDeadlineToSplit(DateFormat49Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
		return this;
	}

	public Optional<DateFormat49Choice> getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction == null ? Optional.empty() : Optional.of(deadlineForTaxBreakdownInstruction);
	}

	public CorporateActionDate74 setDeadlineForTaxBreakdownInstruction(DateFormat49Choice deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
		return this;
	}

	public Optional<DateFormat49Choice> getTradingSuspendedDate() {
		return tradingSuspendedDate == null ? Optional.empty() : Optional.of(tradingSuspendedDate);
	}

	public CorporateActionDate74 setTradingSuspendedDate(DateFormat49Choice tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
		return this;
	}

	public Optional<DateFormat49Choice> getUnconditionalDate() {
		return unconditionalDate == null ? Optional.empty() : Optional.of(unconditionalDate);
	}

	public CorporateActionDate74 setUnconditionalDate(DateFormat49Choice unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
		return this;
	}

	public Optional<DateFormat49Choice> getWhollyUnconditionalDate() {
		return whollyUnconditionalDate == null ? Optional.empty() : Optional.of(whollyUnconditionalDate);
	}

	public CorporateActionDate74 setWhollyUnconditionalDate(DateFormat49Choice whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
		return this;
	}

	public Optional<DateFormat49Choice> getExDividendDate() {
		return exDividendDate == null ? Optional.empty() : Optional.of(exDividendDate);
	}

	public CorporateActionDate74 setExDividendDate(DateFormat49Choice exDividendDate) {
		this.exDividendDate = exDividendDate;
		return this;
	}

	public Optional<DateFormat49Choice> getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate == null ? Optional.empty() : Optional.of(officialAnnouncementPublicationDate);
	}

	public CorporateActionDate74 setOfficialAnnouncementPublicationDate(DateFormat49Choice officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getSpecialExDate() {
		return specialExDate == null ? Optional.empty() : Optional.of(specialExDate);
	}

	public CorporateActionDate74 setSpecialExDate(DateFormat49Choice specialExDate) {
		this.specialExDate = specialExDate;
		return this;
	}

	public Optional<DateFormat49Choice> getGuaranteedParticipationDate() {
		return guaranteedParticipationDate == null ? Optional.empty() : Optional.of(guaranteedParticipationDate);
	}

	public CorporateActionDate74 setGuaranteedParticipationDate(DateFormat49Choice guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getElectionToCounterpartyMarketDeadline() {
		return electionToCounterpartyMarketDeadline == null ? Optional.empty() : Optional.of(electionToCounterpartyMarketDeadline);
	}

	public CorporateActionDate74 setElectionToCounterpartyMarketDeadline(DateFormat49Choice electionToCounterpartyMarketDeadline) {
		this.electionToCounterpartyMarketDeadline = electionToCounterpartyMarketDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getElectionToCounterpartyResponseDeadline() {
		return electionToCounterpartyResponseDeadline == null ? Optional.empty() : Optional.of(electionToCounterpartyResponseDeadline);
	}

	public CorporateActionDate74 setElectionToCounterpartyResponseDeadline(DateFormat49Choice electionToCounterpartyResponseDeadline) {
		this.electionToCounterpartyResponseDeadline = electionToCounterpartyResponseDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getLapsedDate() {
		return lapsedDate == null ? Optional.empty() : Optional.of(lapsedDate);
	}

	public CorporateActionDate74 setLapsedDate(DateFormat49Choice lapsedDate) {
		this.lapsedDate = lapsedDate;
		return this;
	}

	public Optional<DateFormat49Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public CorporateActionDate74 setPaymentDate(DateFormat49Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	public Optional<DateFormat49Choice> getThirdPartyDeadline() {
		return thirdPartyDeadline == null ? Optional.empty() : Optional.of(thirdPartyDeadline);
	}

	public CorporateActionDate74 setThirdPartyDeadline(DateFormat49Choice thirdPartyDeadline) {
		this.thirdPartyDeadline = thirdPartyDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline == null ? Optional.empty() : Optional.of(earlyThirdPartyDeadline);
	}

	public CorporateActionDate74 setEarlyThirdPartyDeadline(DateFormat49Choice earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = earlyThirdPartyDeadline;
		return this;
	}

	public Optional<DateFormat49Choice> getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate == null ? Optional.empty() : Optional.of(marketClaimTrackingEndDate);
	}

	public CorporateActionDate74 setMarketClaimTrackingEndDate(DateFormat49Choice marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
		return this;
	}

	public Optional<DateFormat49Choice> getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline == null ? Optional.empty() : Optional.of(leadPlaintiffDeadline);
	}

	public CorporateActionDate74 setLeadPlaintiffDeadline(DateFormat49Choice leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = leadPlaintiffDeadline;
		return this;
	}

	public Optional<DateFormat41Choice> getFilingDate() {
		return filingDate == null ? Optional.empty() : Optional.of(filingDate);
	}

	public CorporateActionDate74 setFilingDate(DateFormat41Choice filingDate) {
		this.filingDate = filingDate;
		return this;
	}

	public Optional<DateFormat41Choice> getHearingDate() {
		return hearingDate == null ? Optional.empty() : Optional.of(hearingDate);
	}

	public CorporateActionDate74 setHearingDate(DateFormat41Choice hearingDate) {
		this.hearingDate = hearingDate;
		return this;
	}
}