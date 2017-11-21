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
import com.tools20022.repository.choice.DateFormat30Choice;
import com.tools20022.repository.choice.DateFormat31Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmAnnouncementDate
 * CorporateActionDate44.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmCertificationDeadline
 * CorporateActionDate44.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmCourtApprovalDate
 * CorporateActionDate44.mmCourtApprovalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEarlyClosingDate
 * CorporateActionDate44.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEffectiveDate
 * CorporateActionDate44.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEqualisationDate
 * CorporateActionDate44.mmEqualisationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFurtherDetailedAnnouncementDate
 * CorporateActionDate44.mmFurtherDetailedAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFixingDate
 * CorporateActionDate44.mmFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLotteryDate
 * CorporateActionDate44.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmNewMaturityDate
 * CorporateActionDate44.mmNewMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMeetingDate
 * CorporateActionDate44.mmMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMarginFixingDate
 * CorporateActionDate44.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmProrationDate
 * CorporateActionDate44.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmRecordDate
 * CorporateActionDate44.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmRegistrationDeadline
 * CorporateActionDate44.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmResultsPublicationDate
 * CorporateActionDate44.mmResultsPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmDeadlineToSplit
 * CorporateActionDate44.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDate44.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmTradingSuspendedDate
 * CorporateActionDate44.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmUnconditionalDate
 * CorporateActionDate44.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmWhollyUnconditionalDate
 * CorporateActionDate44.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmExDividendDate
 * CorporateActionDate44.mmExDividendDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmOfficialAnnouncementPublicationDate
 * CorporateActionDate44.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmSpecialExDate
 * CorporateActionDate44.mmSpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmGuaranteedParticipationDate
 * CorporateActionDate44.mmGuaranteedParticipationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmElectionToCounterpartyMarketDeadline
 * CorporateActionDate44.mmElectionToCounterpartyMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmElectionToCounterpartyResponseDeadline
 * CorporateActionDate44.mmElectionToCounterpartyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLapsedDate
 * CorporateActionDate44.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmPaymentDate
 * CorporateActionDate44.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmThirdPartyDeadline
 * CorporateActionDate44.mmThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEarlyThirdPartyDeadline
 * CorporateActionDate44.mmEarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMarketClaimTrackingEndDate
 * CorporateActionDate44.mmMarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLeadPlaintiffDeadline
 * CorporateActionDate44.mmLeadPlaintiffDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFilingDate
 * CorporateActionDate44.mmFilingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmHearingDate
 * CorporateActionDate44.mmHearingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionDate44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27
 * CorporateActionDate27}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDate44", propOrder = {"announcementDate", "certificationDeadline", "courtApprovalDate", "earlyClosingDate", "effectiveDate", "equalisationDate", "furtherDetailedAnnouncementDate", "fixingDate",
		"lotteryDate", "newMaturityDate", "meetingDate", "marginFixingDate", "prorationDate", "recordDate", "registrationDeadline", "resultsPublicationDate", "deadlineToSplit", "deadlineForTaxBreakdownInstruction", "tradingSuspendedDate",
		"unconditionalDate", "whollyUnconditionalDate", "exDividendDate", "officialAnnouncementPublicationDate", "specialExDate", "guaranteedParticipationDate", "electionToCounterpartyMarketDeadline",
		"electionToCounterpartyResponseDeadline", "lapsedDate", "paymentDate", "thirdPartyDeadline", "earlyThirdPartyDeadline", "marketClaimTrackingEndDate", "leadPlaintiffDeadline", "filingDate", "hearingDate"})
public class CorporateActionDate44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat31Choice announcementDate;
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmAnnouncementDate
	 * CorporateActionDate27.mmAnnouncementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAnnouncementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur.";
			previousVersion_lazy = () -> CorporateActionDate27.mmAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice certificationDeadline;
	/**
	 * Deadline by which the beneficial ownership of securities must be
	 * declared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
	 * CorporateActionDeadline.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmCertificationDeadline
	 * CorporateActionDate27.mmCertificationDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmCertificationDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			previousVersion_lazy = () -> CorporateActionDate27.mmCertificationDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice courtApprovalDate;
	/**
	 * Date upon which the court provided approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCourtApprovalDate
	 * ClassAction.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrtApprvlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the court provided approval."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmCourtApprovalDate
	 * CorporateActionDate27.mmCourtApprovalDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCourtApprovalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmCourtApprovalDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "CrtApprvlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the court provided approval.";
			previousVersion_lazy = () -> CorporateActionDate27.mmCourtApprovalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice earlyClosingDate;
	/**
	 * First possible early closing date of an offer if different from the
	 * expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
	 * CorporateActionDeadline.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyClsgDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEarlyClosingDate
	 * CorporateActionDate27.mmEarlyClosingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyClosingDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EarlyClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			previousVersion_lazy = () -> CorporateActionDate27.mmEarlyClosingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice effectiveDate;
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
	 * CorporateActionEvent.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEffectiveDate
	 * CorporateActionDate27.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEffectiveDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEffectiveDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			previousVersion_lazy = () -> CorporateActionDate27.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice equalisationDate;
	/**
	 * Date/Time on which all or part of any holding bought in a unit trust is
	 * subject to being treated as capital rather than income. This is normally
	 * one day after the previous distribution's ex date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmDate
	 * Equalisation.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEqualisationDate
	 * CorporateActionDate27.mmEqualisationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEqualisationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EqulstnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationDate";
			definition = "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			previousVersion_lazy = () -> CorporateActionDate27.mmEqualisationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice furtherDetailedAnnouncementDate;
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for example, exchange ratio announcement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
	 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrthrDtldAnncmntDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate27.mmFurtherDetailedAnnouncementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFurtherDetailedAnnouncementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmFurtherDetailsAnnouncementDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FrthrDtldAnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date.";
			previousVersion_lazy = () -> CorporateActionDate27.mmFurtherDetailedAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice fixingDate;
	/**
	 * Date/time at which an index / rate / price / value will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOfferPriceFixingDate
	 * ProceedsDefinition.mmOfferPriceFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFixingDate
	 * CorporateActionDate27.mmFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFixingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmOfferPriceFixingDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which an index / rate / price / value will be determined.";
			previousVersion_lazy = () -> CorporateActionDate27.mmFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice lotteryDate;
	/**
	 * Date/time on which the lottery is run and applied to the holder's
	 * positions. This is also applicable to partial calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
	 * Lottery.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLotteryDate
	 * CorporateActionDate27.mmLotteryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotteryDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDate";
			definition = "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			previousVersion_lazy = () -> CorporateActionDate27.mmLotteryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice newMaturityDate;
	/**
	 * Date/time to which the maturity date of an interest bearing security is
	 * extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmNewMaturityDate
	 * CorporateActionDate27.mmNewMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewMaturityDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "NewMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDate";
			definition = "Date/time to which the maturity date of an interest bearing security is extended.";
			previousVersion_lazy = () -> CorporateActionDate27.mmNewMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice meetingDate;
	/**
	 * Date/time on which the bondholder's or shareholder's meeting will take
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMeetingDate
	 * CorporateActionDate27.mmMeetingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMeetingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDateAndTime;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MtgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDate";
			definition = "Date/time on which the bondholder's or shareholder's meeting will take place.";
			previousVersion_lazy = () -> CorporateActionDate27.mmMeetingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice marginFixingDate;
	/**
	 * Date/time at which the margin rate will be determined .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
	 * CorporateActionEvent.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMarginFixingDate
	 * CorporateActionDate27.mmMarginFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginFixingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmMarginFixingDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MrgnFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			previousVersion_lazy = () -> CorporateActionDate27.mmMarginFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice prorationDate;
	/**
	 * Date/time (and time) at which an issuer will determine the proration
	 * amount/quantity of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
	 * BiddingConditions.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmProrationDate
	 * CorporateActionDate27.mmProrationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProrationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "PrratnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationDate";
			definition = "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			previousVersion_lazy = () -> CorporateActionDate27.mmProrationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice recordDate;
	/**
	 * Date/time at which positions are struck at the end of the day to note
	 * which parties will receive the relevant amount of entitlement, due to be
	 * distributed on payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmRecordDate
	 * CorporateActionDate27.mmRecordDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecordDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			previousVersion_lazy = () -> CorporateActionDate27.mmRecordDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice registrationDeadline;
	/**
	 * Date/time on which instructions to register or registration details will
	 * be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
	 * CorporateActionDeadline.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDdln"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmRegistrationDeadline
	 * CorporateActionDate27.mmRegistrationDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRegistrationDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RegnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date/time on which instructions to register or registration details will be accepted.";
			previousVersion_lazy = () -> CorporateActionDate27.mmRegistrationDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice resultsPublicationDate;
	/**
	 * Date/time on which results are published, for example, results of an
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltsPblctnDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmResultsPublicationDate
	 * CorporateActionDate27.mmResultsPublicationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResultsPublicationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RsltsPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date/time on which results are published, for example, results of an offer.";
			previousVersion_lazy = () -> CorporateActionDate27.mmResultsPublicationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice deadlineToSplit;
	/**
	 * Deadline by which instructions must be received to split securities, for
	 * example, of physical certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
	 * CorporateActionDeadline.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnToSplt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmDeadlineToSplit
	 * CorporateActionDate27.mmDeadlineToSplit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeadlineToSplit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineToSplit;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, for example, of physical certificates.";
			previousVersion_lazy = () -> CorporateActionDate27.mmDeadlineToSplit;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice deadlineForTaxBreakdownInstruction;
	/**
	 * Date/time on until which tax breakdown instructions will be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnForTaxBrkdwnInstr"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate27.mmDeadlineForTaxBreakdownInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeadlineForTaxBreakdownInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "DdlnForTaxBrkdwnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date/time on until which tax breakdown instructions will be accepted.";
			previousVersion_lazy = () -> CorporateActionDate27.mmDeadlineForTaxBreakdownInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice tradingSuspendedDate;
	/**
	 * Date/time at which trading of a security is suspended as the result of an
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
	 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSspdDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmTradingSuspendedDate
	 * CorporateActionDate27.mmTradingSuspendedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSuspendedDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmTradingSuspendedDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date/time at which trading of a security is suspended as the result of an event.";
			previousVersion_lazy = () -> CorporateActionDate27.mmTradingSuspendedDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice unconditionalDate;
	/**
	 * Date/time upon which the terms of the take-over become unconditional as
	 * to acceptances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
	 * CorporateActionEvent.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcondlDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmUnconditionalDate
	 * CorporateActionDate27.mmUnconditionalDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnconditionalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnconditionalDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "UcondlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalDate";
			definition = "Date/time upon which the terms of the take-over become unconditional as to acceptances.";
			previousVersion_lazy = () -> CorporateActionDate27.mmUnconditionalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice whollyUnconditionalDate;
	/**
	 * Date/time at on which all conditions, including regulatory, legal etc.
	 * pertaining to the take-over, have been met.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
	 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlyUcondlDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmWhollyUnconditionalDate
	 * CorporateActionDate27.mmWhollyUnconditionalDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWhollyUnconditionalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmWhollyUnconditionalDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "WhlyUcondlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			previousVersion_lazy = () -> CorporateActionDate27.mmWhollyUnconditionalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice exDividendDate;
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
	 * Dividend.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExDvddDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmExDividendDate
	 * CorporateActionDate27.mmExDividendDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExDividendDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Dividend.mmExDividendDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ExDvddDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			previousVersion_lazy = () -> CorporateActionDate27.mmExDividendDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice officialAnnouncementPublicationDate;
	/**
	 * Date/time at which the corporate action is legally announced by an
	 * official body, for example, publication by a governmental administration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
	 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclAnncmntPblctnDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate27.mmOfficialAnnouncementPublicationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfficialAnnouncementPublicationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "OffclAnncmntPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			previousVersion_lazy = () -> CorporateActionDate27.mmOfficialAnnouncementPublicationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice specialExDate;
	/**
	 * Date/time as from which 'special processing' can start to be used by
	 * participants for that event. Special processing is a means of marking a
	 * transaction, that would normally be traded ex or cum, as being traded cum
	 * or ex respectively, for example, a transaction dealt 'special' after the
	 * ex date would result in the buyer being eligible for the entitlement.
	 * This is typically used in the UK and Irish markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
	 * CorporateActionDeadline.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclExDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmSpecialExDate
	 * CorporateActionDate27.mmSpecialExDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecialExDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmSpecialExDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "SpclExDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			previousVersion_lazy = () -> CorporateActionDate27.mmSpecialExDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice guaranteedParticipationDate;
	/**
	 * Last date/time by which a buying counterparty to a trade can be sure that
	 * it will have the right to participate in an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
	 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedPrtcptnDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmGuaranteedParticipationDate
	 * CorporateActionDate27.mmGuaranteedParticipationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteedParticipationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmGuaranteedParticipationDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "GrntedPrtcptnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			previousVersion_lazy = () -> CorporateActionDate27.mmGuaranteedParticipationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice electionToCounterpartyMarketDeadline;
	/**
	 * Deadline by which an entitled holder needs to advise their counterparty
	 * to a transaction of their election for a corporate action event, also
	 * known as Buyer Protection Deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyMktDdln"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmElectionToCounterpartyDeadline
	 * CorporateActionDate27.mmElectionToCounterpartyDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionToCounterpartyMarketDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyMarketDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline.";
			previousVersion_lazy = () -> CorporateActionDate27.mmElectionToCounterpartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice electionToCounterpartyResponseDeadline;
	/**
	 * Date/time the account servicer has set as the deadline to respond, with
	 * instructions, prior to the election to counterparty market deadline
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
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
	 * "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionToCounterpartyResponseDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyRspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyResponseDeadline";
			definition = "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice lapsedDate;
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
	 * CorporateActionEvent.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LpsdDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLapsedDate
	 * CorporateActionDate27.mmLapsedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLapsedDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmLapsedDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LpsdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			previousVersion_lazy = () -> CorporateActionDate27.mmLapsedDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice paymentDate;
	/**
	 * Date/time at which the movement is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmPaymentDate
	 * CorporateActionDate27.mmPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			previousVersion_lazy = () -> CorporateActionDate27.mmPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice thirdPartyDeadline;
	/**
	 * Date/Time by which the account owner must instruct directly another
	 * party, for example to provide documentation to an issuer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmThirdPartyDeadline
	 * CorporateActionDeadline.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmThirdPartyDeadline
	 * CorporateActionDate27.mmThirdPartyDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmThirdPartyDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			previousVersion_lazy = () -> CorporateActionDate27.mmThirdPartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice earlyThirdPartyDeadline;
	/**
	 * Date/Time set by the issuer agent as a first early deadline by which the
	 * account owner must instruct directly another party, possibly giving the
	 * holder eligibility to incentives. For example, to provide documentation
	 * to an issuer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyThrdPtyDdln"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEarlyThirdPartyDeadline
	 * CorporateActionDate27.mmEarlyThirdPartyDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyThirdPartyDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmEarlyResponseDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EarlyThrdPtyDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			previousVersion_lazy = () -> CorporateActionDate27.mmEarlyThirdPartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice marketClaimTrackingEndDate;
	/**
	 * Date by which the depository stops monitoring activities of the event,
	 * for instance, accounting and tracking activities for due bills end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimTrackingEndDate
	 * MarketClaim.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmTrckgEndDt"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMarketClaimTrackingEndDate
	 * CorporateActionDate27.mmMarketClaimTrackingEndDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketClaimTrackingEndDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimTrackingEndDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MktClmTrckgEndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			previousVersion_lazy = () -> CorporateActionDate27.mmMarketClaimTrackingEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat31Choice leadPlaintiffDeadline;
	/**
	 * Last day an investor can become a lead plaintiff.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmLeadPlaintiffDeadline
	 * ClassAction.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLeadPlaintiffDeadline
	 * CorporateActionDate27.mmLeadPlaintiffDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLeadPlaintiffDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmLeadPlaintiffDeadline;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LeadPlntffDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			previousVersion_lazy = () -> CorporateActionDate27.mmLeadPlaintiffDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected DateFormat30Choice filingDate;
	/**
	 * Date on which the action was filed at the applicable court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat30Choice
	 * DateFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmFilingDate
	 * ClassAction.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFilingDate
	 * CorporateActionDate27.mmFilingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFilingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmFilingDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FilgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			previousVersion_lazy = () -> CorporateActionDate27.mmFilingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat30Choice.mmObject();
		}
	};
	protected DateFormat30Choice hearingDate;
	/**
	 * Date for the hearing between the plaintiff and defendant, as set by the
	 * court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat30Choice
	 * DateFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmHearingDate
	 * ClassAction.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44
	 * CorporateActionDate44}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmHearingDate
	 * CorporateActionDate27.mmHearingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHearingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ClassAction.mmHearingDate;
			componentContext_lazy = () -> CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "HrgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			previousVersion_lazy = () -> CorporateActionDate27.mmHearingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat30Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDate44.mmAnnouncementDate, CorporateActionDate44.mmCertificationDeadline, CorporateActionDate44.mmCourtApprovalDate, CorporateActionDate44.mmEarlyClosingDate,
						CorporateActionDate44.mmEffectiveDate, CorporateActionDate44.mmEqualisationDate, CorporateActionDate44.mmFurtherDetailedAnnouncementDate, CorporateActionDate44.mmFixingDate, CorporateActionDate44.mmLotteryDate,
						CorporateActionDate44.mmNewMaturityDate, CorporateActionDate44.mmMeetingDate, CorporateActionDate44.mmMarginFixingDate, CorporateActionDate44.mmProrationDate, CorporateActionDate44.mmRecordDate,
						CorporateActionDate44.mmRegistrationDeadline, CorporateActionDate44.mmResultsPublicationDate, CorporateActionDate44.mmDeadlineToSplit, CorporateActionDate44.mmDeadlineForTaxBreakdownInstruction,
						CorporateActionDate44.mmTradingSuspendedDate, CorporateActionDate44.mmUnconditionalDate, CorporateActionDate44.mmWhollyUnconditionalDate, CorporateActionDate44.mmExDividendDate,
						CorporateActionDate44.mmOfficialAnnouncementPublicationDate, CorporateActionDate44.mmSpecialExDate, CorporateActionDate44.mmGuaranteedParticipationDate, CorporateActionDate44.mmElectionToCounterpartyMarketDeadline,
						CorporateActionDate44.mmElectionToCounterpartyResponseDeadline, CorporateActionDate44.mmLapsedDate, CorporateActionDate44.mmPaymentDate, CorporateActionDate44.mmThirdPartyDeadline,
						CorporateActionDate44.mmEarlyThirdPartyDeadline, CorporateActionDate44.mmMarketClaimTrackingEndDate, CorporateActionDate44.mmLeadPlaintiffDeadline, CorporateActionDate44.mmFilingDate,
						CorporateActionDate44.mmHearingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate44";
				definition = "Specifies corporate action dates.";
				previousVersion_lazy = () -> CorporateActionDate27.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AnncmntDt")
	public DateFormat31Choice getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(DateFormat31Choice announcementDate) {
		this.announcementDate = announcementDate;
	}

	@XmlElement(name = "CertfctnDdln")
	public DateFormat31Choice getCertificationDeadline() {
		return certificationDeadline;
	}

	public void setCertificationDeadline(DateFormat31Choice certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
	}

	@XmlElement(name = "CrtApprvlDt")
	public DateFormat31Choice getCourtApprovalDate() {
		return courtApprovalDate;
	}

	public void setCourtApprovalDate(DateFormat31Choice courtApprovalDate) {
		this.courtApprovalDate = courtApprovalDate;
	}

	@XmlElement(name = "EarlyClsgDt")
	public DateFormat31Choice getEarlyClosingDate() {
		return earlyClosingDate;
	}

	public void setEarlyClosingDate(DateFormat31Choice earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
	}

	@XmlElement(name = "FctvDt")
	public DateFormat31Choice getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(DateFormat31Choice effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@XmlElement(name = "EqulstnDt")
	public DateFormat31Choice getEqualisationDate() {
		return equalisationDate;
	}

	public void setEqualisationDate(DateFormat31Choice equalisationDate) {
		this.equalisationDate = equalisationDate;
	}

	@XmlElement(name = "FrthrDtldAnncmntDt")
	public DateFormat31Choice getFurtherDetailedAnnouncementDate() {
		return furtherDetailedAnnouncementDate;
	}

	public void setFurtherDetailedAnnouncementDate(DateFormat31Choice furtherDetailedAnnouncementDate) {
		this.furtherDetailedAnnouncementDate = furtherDetailedAnnouncementDate;
	}

	@XmlElement(name = "FxgDt")
	public DateFormat31Choice getFixingDate() {
		return fixingDate;
	}

	public void setFixingDate(DateFormat31Choice fixingDate) {
		this.fixingDate = fixingDate;
	}

	@XmlElement(name = "LtryDt")
	public DateFormat31Choice getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(DateFormat31Choice lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

	@XmlElement(name = "NewMtrtyDt")
	public DateFormat31Choice getNewMaturityDate() {
		return newMaturityDate;
	}

	public void setNewMaturityDate(DateFormat31Choice newMaturityDate) {
		this.newMaturityDate = newMaturityDate;
	}

	@XmlElement(name = "MtgDt")
	public DateFormat31Choice getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(DateFormat31Choice meetingDate) {
		this.meetingDate = meetingDate;
	}

	@XmlElement(name = "MrgnFxgDt")
	public DateFormat31Choice getMarginFixingDate() {
		return marginFixingDate;
	}

	public void setMarginFixingDate(DateFormat31Choice marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
	}

	@XmlElement(name = "PrratnDt")
	public DateFormat31Choice getProrationDate() {
		return prorationDate;
	}

	public void setProrationDate(DateFormat31Choice prorationDate) {
		this.prorationDate = prorationDate;
	}

	@XmlElement(name = "RcrdDt")
	public DateFormat31Choice getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(DateFormat31Choice recordDate) {
		this.recordDate = recordDate;
	}

	@XmlElement(name = "RegnDdln")
	public DateFormat31Choice getRegistrationDeadline() {
		return registrationDeadline;
	}

	public void setRegistrationDeadline(DateFormat31Choice registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
	}

	@XmlElement(name = "RsltsPblctnDt")
	public DateFormat31Choice getResultsPublicationDate() {
		return resultsPublicationDate;
	}

	public void setResultsPublicationDate(DateFormat31Choice resultsPublicationDate) {
		this.resultsPublicationDate = resultsPublicationDate;
	}

	@XmlElement(name = "DdlnToSplt")
	public DateFormat31Choice getDeadlineToSplit() {
		return deadlineToSplit;
	}

	public void setDeadlineToSplit(DateFormat31Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
	}

	@XmlElement(name = "DdlnForTaxBrkdwnInstr")
	public DateFormat31Choice getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction;
	}

	public void setDeadlineForTaxBreakdownInstruction(DateFormat31Choice deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
	}

	@XmlElement(name = "TradgSspdDt")
	public DateFormat31Choice getTradingSuspendedDate() {
		return tradingSuspendedDate;
	}

	public void setTradingSuspendedDate(DateFormat31Choice tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
	}

	@XmlElement(name = "UcondlDt")
	public DateFormat31Choice getUnconditionalDate() {
		return unconditionalDate;
	}

	public void setUnconditionalDate(DateFormat31Choice unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
	}

	@XmlElement(name = "WhlyUcondlDt")
	public DateFormat31Choice getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public void setWhollyUnconditionalDate(DateFormat31Choice whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
	}

	@XmlElement(name = "ExDvddDt")
	public DateFormat31Choice getExDividendDate() {
		return exDividendDate;
	}

	public void setExDividendDate(DateFormat31Choice exDividendDate) {
		this.exDividendDate = exDividendDate;
	}

	@XmlElement(name = "OffclAnncmntPblctnDt")
	public DateFormat31Choice getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public void setOfficialAnnouncementPublicationDate(DateFormat31Choice officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
	}

	@XmlElement(name = "SpclExDt")
	public DateFormat31Choice getSpecialExDate() {
		return specialExDate;
	}

	public void setSpecialExDate(DateFormat31Choice specialExDate) {
		this.specialExDate = specialExDate;
	}

	@XmlElement(name = "GrntedPrtcptnDt")
	public DateFormat31Choice getGuaranteedParticipationDate() {
		return guaranteedParticipationDate;
	}

	public void setGuaranteedParticipationDate(DateFormat31Choice guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
	}

	@XmlElement(name = "ElctnToCtrPtyMktDdln")
	public DateFormat31Choice getElectionToCounterpartyMarketDeadline() {
		return electionToCounterpartyMarketDeadline;
	}

	public void setElectionToCounterpartyMarketDeadline(DateFormat31Choice electionToCounterpartyMarketDeadline) {
		this.electionToCounterpartyMarketDeadline = electionToCounterpartyMarketDeadline;
	}

	@XmlElement(name = "ElctnToCtrPtyRspnDdln")
	public DateFormat31Choice getElectionToCounterpartyResponseDeadline() {
		return electionToCounterpartyResponseDeadline;
	}

	public void setElectionToCounterpartyResponseDeadline(DateFormat31Choice electionToCounterpartyResponseDeadline) {
		this.electionToCounterpartyResponseDeadline = electionToCounterpartyResponseDeadline;
	}

	@XmlElement(name = "LpsdDt")
	public DateFormat31Choice getLapsedDate() {
		return lapsedDate;
	}

	public void setLapsedDate(DateFormat31Choice lapsedDate) {
		this.lapsedDate = lapsedDate;
	}

	@XmlElement(name = "PmtDt")
	public DateFormat31Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat31Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "ThrdPtyDdln")
	public DateFormat31Choice getThirdPartyDeadline() {
		return thirdPartyDeadline;
	}

	public void setThirdPartyDeadline(DateFormat31Choice thirdPartyDeadline) {
		this.thirdPartyDeadline = thirdPartyDeadline;
	}

	@XmlElement(name = "EarlyThrdPtyDdln")
	public DateFormat31Choice getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline;
	}

	public void setEarlyThirdPartyDeadline(DateFormat31Choice earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = earlyThirdPartyDeadline;
	}

	@XmlElement(name = "MktClmTrckgEndDt")
	public DateFormat31Choice getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate;
	}

	public void setMarketClaimTrackingEndDate(DateFormat31Choice marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
	}

	@XmlElement(name = "LeadPlntffDdln")
	public DateFormat31Choice getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline;
	}

	public void setLeadPlaintiffDeadline(DateFormat31Choice leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = leadPlaintiffDeadline;
	}

	@XmlElement(name = "FilgDt")
	public DateFormat30Choice getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(DateFormat30Choice filingDate) {
		this.filingDate = filingDate;
	}

	@XmlElement(name = "HrgDt")
	public DateFormat30Choice getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(DateFormat30Choice hearingDate) {
		this.hearingDate = hearingDate;
	}
}