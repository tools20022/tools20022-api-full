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
import com.tools20022.repository.choice.DateFormat30Choice;
import com.tools20022.repository.choice.DateFormat31Choice;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveDateRule#forCorporateActionDate44
 * ConstraintEffectiveDateRule.forCorporateActionDate44}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDate44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDate61
 * CorporateActionDate61}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27
 * CorporateActionDate27}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDate44", propOrder = {"announcementDate", "certificationDeadline", "courtApprovalDate", "earlyClosingDate", "effectiveDate", "equalisationDate", "furtherDetailedAnnouncementDate", "fixingDate",
		"lotteryDate", "newMaturityDate", "meetingDate", "marginFixingDate", "prorationDate", "recordDate", "registrationDeadline", "resultsPublicationDate", "deadlineToSplit", "deadlineForTaxBreakdownInstruction", "tradingSuspendedDate",
		"unconditionalDate", "whollyUnconditionalDate", "exDividendDate", "officialAnnouncementPublicationDate", "specialExDate", "guaranteedParticipationDate", "electionToCounterpartyMarketDeadline",
		"electionToCounterpartyResponseDeadline", "lapsedDate", "paymentDate", "thirdPartyDeadline", "earlyThirdPartyDeadline", "marketClaimTrackingEndDate", "leadPlaintiffDeadline", "filingDate", "hearingDate"})
public class CorporateActionDate44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnncmntDt")
	protected DateFormat31Choice announcementDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmAnnouncementDate
	 * CorporateActionDate61.mmAnnouncementDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ANOU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmAnnouncementDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "CertfctnDdln")
	protected DateFormat31Choice certificationDeadline;
	/**
	 * 
	 <p>
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
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmCertificationDeadline
	 * CorporateActionDate61.mmCertificationDeadline}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::CERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmCertificationDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmCertificationDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "CrtApprvlDt")
	protected DateFormat31Choice courtApprovalDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmCourtApprovalDate
	 * CorporateActionDate61.mmCourtApprovalDate}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "CrtApprvlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::COAP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the court provided approval.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmCourtApprovalDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmCourtApprovalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "EarlyClsgDt")
	protected DateFormat31Choice earlyClosingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEarlyClosingDate
	 * CorporateActionDate61.mmEarlyClosingDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EarlyClsgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ECDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmEarlyClosingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmEarlyClosingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "FctvDt")
	protected DateFormat31Choice effectiveDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEffectiveDate
	 * CorporateActionDate61.mmEffectiveDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EFFD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmEffectiveDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "EqulstnDt")
	protected DateFormat31Choice equalisationDate;
	/**
	 * 
	 <p>
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
	 * "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEqualisationDate
	 * CorporateActionDate61.mmEqualisationDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EqulstnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EQUL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationDate";
			definition = "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmEqualisationDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmEqualisationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "FrthrDtldAnncmntDt")
	protected DateFormat31Choice furtherDetailedAnnouncementDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate61.mmFurtherDetailedAnnouncementDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FrthrDtldAnncmntDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::FDAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmFurtherDetailedAnnouncementDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmFurtherDetailedAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "FxgDt")
	protected DateFormat31Choice fixingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFixingDate
	 * CorporateActionDate61.mmFixingDate}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::IFIX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which an index / rate / price / value will be determined.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmFixingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "LtryDt")
	protected DateFormat31Choice lotteryDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLotteryDate
	 * CorporateActionDate61.mmLotteryDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LtryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDate";
			definition = "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmLotteryDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmLotteryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "NewMtrtyDt")
	protected DateFormat31Choice newMaturityDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmNewMaturityDate
	 * CorporateActionDate61.mmNewMaturityDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "NewMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDate";
			definition = "Date/time to which the maturity date of an interest bearing security is extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmNewMaturityDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmNewMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "MtgDt")
	protected DateFormat31Choice meetingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMeetingDate
	 * CorporateActionDate61.mmMeetingDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MtgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MEET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDate";
			definition = "Date/time on which the bondholder's or shareholder's meeting will take place.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmMeetingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmMeetingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "MrgnFxgDt")
	protected DateFormat31Choice marginFixingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMarginFixingDate
	 * CorporateActionDate61.mmMarginFixingDate}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MrgnFxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MFIX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmMarginFixingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmMarginFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "PrratnDt")
	protected DateFormat31Choice prorationDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmProrationDate
	 * CorporateActionDate61.mmProrationDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "PrratnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PROD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationDate";
			definition = "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmProrationDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmProrationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "RcrdDt")
	protected DateFormat31Choice recordDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmRecordDate
	 * CorporateActionDate61.mmRecordDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmRecordDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmRecordDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnDdln")
	protected DateFormat31Choice registrationDeadline;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmRegistrationDeadline
	 * CorporateActionDate61.mmRegistrationDeadline}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RegnDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date/time on which instructions to register or registration details will be accepted.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmRegistrationDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmRegistrationDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "RsltsPblctnDt")
	protected DateFormat31Choice resultsPublicationDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmResultsPublicationDate
	 * CorporateActionDate61.mmResultsPublicationDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "RsltsPblctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RESU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date/time on which results are published, for example, results of an offer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmResultsPublicationDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmResultsPublicationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "DdlnToSplt")
	protected DateFormat31Choice deadlineToSplit;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmDeadlineToSplit
	 * CorporateActionDate61.mmDeadlineToSplit}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SPLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, for example, of physical certificates.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmDeadlineToSplit);
			previousVersion_lazy = () -> CorporateActionDate27.mmDeadlineToSplit;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "DdlnForTaxBrkdwnInstr")
	protected DateFormat31Choice deadlineForTaxBreakdownInstruction;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate61.mmDeadlineForTaxBreakdownInstruction}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "DdlnForTaxBrkdwnInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TAXB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date/time on until which tax breakdown instructions will be accepted.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmDeadlineForTaxBreakdownInstruction);
			previousVersion_lazy = () -> CorporateActionDate27.mmDeadlineForTaxBreakdownInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "TradgSspdDt")
	protected DateFormat31Choice tradingSuspendedDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmTradingSuspendedDate
	 * CorporateActionDate61.mmTradingSuspendedDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TSDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date/time at which trading of a security is suspended as the result of an event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmTradingSuspendedDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmTradingSuspendedDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "UcondlDt")
	protected DateFormat31Choice unconditionalDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmUnconditionalDate
	 * CorporateActionDate61.mmUnconditionalDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "UcondlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalDate";
			definition = "Date/time upon which the terms of the take-over become unconditional as to acceptances.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmUnconditionalDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmUnconditionalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "WhlyUcondlDt")
	protected DateFormat31Choice whollyUnconditionalDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmWhollyUnconditionalDate
	 * CorporateActionDate61.mmWhollyUnconditionalDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "WhlyUcondlDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::WUCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmWhollyUnconditionalDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmWhollyUnconditionalDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "ExDvddDt")
	protected DateFormat31Choice exDividendDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmExDividendDate
	 * CorporateActionDate61.mmExDividendDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ExDvddDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::XDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmExDividendDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmExDividendDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "OffclAnncmntPblctnDt")
	protected DateFormat31Choice officialAnnouncementPublicationDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate61.mmOfficialAnnouncementPublicationDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "OffclAnncmntPblctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::OAPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmOfficialAnnouncementPublicationDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmOfficialAnnouncementPublicationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "SpclExDt")
	protected DateFormat31Choice specialExDate;
	/**
	 * 
	 <p>
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
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmSpecialExDate
	 * CorporateActionDate61.mmSpecialExDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "SpclExDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SXDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively, for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmSpecialExDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmSpecialExDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "GrntedPrtcptnDt")
	protected DateFormat31Choice guaranteedParticipationDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmGuaranteedParticipationDate
	 * CorporateActionDate61.mmGuaranteedParticipationDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "GrntedPrtcptnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::GUPA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmGuaranteedParticipationDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmGuaranteedParticipationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "ElctnToCtrPtyMktDdln")
	protected DateFormat31Choice electionToCounterpartyMarketDeadline;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmElectionToCounterpartyMarketDeadline
	 * CorporateActionDate61.mmElectionToCounterpartyMarketDeadline}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyMktDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ECPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyMarketDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmElectionToCounterpartyMarketDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmElectionToCounterpartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "ElctnToCtrPtyRspnDdln")
	protected DateFormat31Choice electionToCounterpartyResponseDeadline;
	/**
	 * 
	 <p>
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
	 * "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmElectionToCounterpartyResponseDeadline
	 * CorporateActionDate61.mmElectionToCounterpartyResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionToCounterpartyResponseDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyRspnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyResponseDeadline";
			definition = "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmElectionToCounterpartyResponseDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "LpsdDt")
	protected DateFormat31Choice lapsedDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLapsedDate
	 * CorporateActionDate61.mmLapsedDate}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LpsdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::LAPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmLapsedDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmLapsedDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "PmtDt")
	protected DateFormat31Choice paymentDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmPaymentDate
	 * CorporateActionDate61.mmPaymentDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PAYD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmPaymentDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "ThrdPtyDdln")
	protected DateFormat31Choice thirdPartyDeadline;
	/**
	 * 
	 <p>
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
	 * "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmThirdPartyDeadline
	 * CorporateActionDate61.mmThirdPartyDeadline}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TPDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmThirdPartyDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmThirdPartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "EarlyThrdPtyDdln")
	protected DateFormat31Choice earlyThirdPartyDeadline;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEarlyThirdPartyDeadline
	 * CorporateActionDate61.mmEarlyThirdPartyDeadline}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "EarlyThrdPtyDdln";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ETPD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmEarlyThirdPartyDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmEarlyThirdPartyDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "MktClmTrckgEndDt")
	protected DateFormat31Choice marketClaimTrackingEndDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMarketClaimTrackingEndDate
	 * CorporateActionDate61.mmMarketClaimTrackingEndDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "MktClmTrckgEndDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::MCTD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmMarketClaimTrackingEndDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmMarketClaimTrackingEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "LeadPlntffDdln")
	protected DateFormat31Choice leadPlaintiffDeadline;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLeadPlaintiffDeadline
	 * CorporateActionDate61.mmLeadPlaintiffDeadline}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "LeadPlntffDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmLeadPlaintiffDeadline);
			previousVersion_lazy = () -> CorporateActionDate27.mmLeadPlaintiffDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	@XmlElement(name = "FilgDt")
	protected DateFormat30Choice filingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFilingDate
	 * CorporateActionDate61.mmFilingDate}</li>
	 * </ul>
	 * </li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "FilgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmFilingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmFilingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat30Choice.mmObject();
		}
	};
	@XmlElement(name = "HrgDt")
	protected DateFormat30Choice hearingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmHearingDate
	 * CorporateActionDate61.mmHearingDate}</li>
	 * </ul>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDate44.mmObject();
			isDerived = false;
			xmlTag = "HrgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmHearingDate);
			previousVersion_lazy = () -> CorporateActionDate27.mmHearingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat30Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate44.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate44.mmCertificationDeadline,
						com.tools20022.repository.msg.CorporateActionDate44.mmCourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate44.mmEarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate44.mmEffectiveDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmEqualisationDate, com.tools20022.repository.msg.CorporateActionDate44.mmFurtherDetailedAnnouncementDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate44.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate44.mmNewMaturityDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate44.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate44.mmProrationDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmRecordDate, com.tools20022.repository.msg.CorporateActionDate44.mmRegistrationDeadline,
						com.tools20022.repository.msg.CorporateActionDate44.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate44.mmDeadlineToSplit,
						com.tools20022.repository.msg.CorporateActionDate44.mmDeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate44.mmTradingSuspendedDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate44.mmWhollyUnconditionalDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmExDividendDate, com.tools20022.repository.msg.CorporateActionDate44.mmOfficialAnnouncementPublicationDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmSpecialExDate, com.tools20022.repository.msg.CorporateActionDate44.mmGuaranteedParticipationDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmElectionToCounterpartyMarketDeadline, com.tools20022.repository.msg.CorporateActionDate44.mmElectionToCounterpartyResponseDeadline,
						com.tools20022.repository.msg.CorporateActionDate44.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate44.mmPaymentDate, com.tools20022.repository.msg.CorporateActionDate44.mmThirdPartyDeadline,
						com.tools20022.repository.msg.CorporateActionDate44.mmEarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate44.mmMarketClaimTrackingEndDate,
						com.tools20022.repository.msg.CorporateActionDate44.mmLeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate44.mmFilingDate, com.tools20022.repository.msg.CorporateActionDate44.mmHearingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveDateRule.forCorporateActionDate44);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate44";
				definition = "Specifies corporate action dates.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionDate61.mmObject());
				previousVersion_lazy = () -> CorporateActionDate27.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateFormat31Choice> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public CorporateActionDate44 setAnnouncementDate(DateFormat31Choice announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<DateFormat31Choice> getCertificationDeadline() {
		return certificationDeadline == null ? Optional.empty() : Optional.of(certificationDeadline);
	}

	public CorporateActionDate44 setCertificationDeadline(DateFormat31Choice certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getCourtApprovalDate() {
		return courtApprovalDate == null ? Optional.empty() : Optional.of(courtApprovalDate);
	}

	public CorporateActionDate44 setCourtApprovalDate(DateFormat31Choice courtApprovalDate) {
		this.courtApprovalDate = courtApprovalDate;
		return this;
	}

	public Optional<DateFormat31Choice> getEarlyClosingDate() {
		return earlyClosingDate == null ? Optional.empty() : Optional.of(earlyClosingDate);
	}

	public CorporateActionDate44 setEarlyClosingDate(DateFormat31Choice earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
		return this;
	}

	public Optional<DateFormat31Choice> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public CorporateActionDate44 setEffectiveDate(DateFormat31Choice effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<DateFormat31Choice> getEqualisationDate() {
		return equalisationDate == null ? Optional.empty() : Optional.of(equalisationDate);
	}

	public CorporateActionDate44 setEqualisationDate(DateFormat31Choice equalisationDate) {
		this.equalisationDate = equalisationDate;
		return this;
	}

	public Optional<DateFormat31Choice> getFurtherDetailedAnnouncementDate() {
		return furtherDetailedAnnouncementDate == null ? Optional.empty() : Optional.of(furtherDetailedAnnouncementDate);
	}

	public CorporateActionDate44 setFurtherDetailedAnnouncementDate(DateFormat31Choice furtherDetailedAnnouncementDate) {
		this.furtherDetailedAnnouncementDate = furtherDetailedAnnouncementDate;
		return this;
	}

	public Optional<DateFormat31Choice> getFixingDate() {
		return fixingDate == null ? Optional.empty() : Optional.of(fixingDate);
	}

	public CorporateActionDate44 setFixingDate(DateFormat31Choice fixingDate) {
		this.fixingDate = fixingDate;
		return this;
	}

	public Optional<DateFormat31Choice> getLotteryDate() {
		return lotteryDate == null ? Optional.empty() : Optional.of(lotteryDate);
	}

	public CorporateActionDate44 setLotteryDate(DateFormat31Choice lotteryDate) {
		this.lotteryDate = lotteryDate;
		return this;
	}

	public Optional<DateFormat31Choice> getNewMaturityDate() {
		return newMaturityDate == null ? Optional.empty() : Optional.of(newMaturityDate);
	}

	public CorporateActionDate44 setNewMaturityDate(DateFormat31Choice newMaturityDate) {
		this.newMaturityDate = newMaturityDate;
		return this;
	}

	public Optional<DateFormat31Choice> getMeetingDate() {
		return meetingDate == null ? Optional.empty() : Optional.of(meetingDate);
	}

	public CorporateActionDate44 setMeetingDate(DateFormat31Choice meetingDate) {
		this.meetingDate = meetingDate;
		return this;
	}

	public Optional<DateFormat31Choice> getMarginFixingDate() {
		return marginFixingDate == null ? Optional.empty() : Optional.of(marginFixingDate);
	}

	public CorporateActionDate44 setMarginFixingDate(DateFormat31Choice marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
		return this;
	}

	public Optional<DateFormat31Choice> getProrationDate() {
		return prorationDate == null ? Optional.empty() : Optional.of(prorationDate);
	}

	public CorporateActionDate44 setProrationDate(DateFormat31Choice prorationDate) {
		this.prorationDate = prorationDate;
		return this;
	}

	public Optional<DateFormat31Choice> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CorporateActionDate44 setRecordDate(DateFormat31Choice recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<DateFormat31Choice> getRegistrationDeadline() {
		return registrationDeadline == null ? Optional.empty() : Optional.of(registrationDeadline);
	}

	public CorporateActionDate44 setRegistrationDeadline(DateFormat31Choice registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getResultsPublicationDate() {
		return resultsPublicationDate == null ? Optional.empty() : Optional.of(resultsPublicationDate);
	}

	public CorporateActionDate44 setResultsPublicationDate(DateFormat31Choice resultsPublicationDate) {
		this.resultsPublicationDate = resultsPublicationDate;
		return this;
	}

	public Optional<DateFormat31Choice> getDeadlineToSplit() {
		return deadlineToSplit == null ? Optional.empty() : Optional.of(deadlineToSplit);
	}

	public CorporateActionDate44 setDeadlineToSplit(DateFormat31Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
		return this;
	}

	public Optional<DateFormat31Choice> getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction == null ? Optional.empty() : Optional.of(deadlineForTaxBreakdownInstruction);
	}

	public CorporateActionDate44 setDeadlineForTaxBreakdownInstruction(DateFormat31Choice deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
		return this;
	}

	public Optional<DateFormat31Choice> getTradingSuspendedDate() {
		return tradingSuspendedDate == null ? Optional.empty() : Optional.of(tradingSuspendedDate);
	}

	public CorporateActionDate44 setTradingSuspendedDate(DateFormat31Choice tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
		return this;
	}

	public Optional<DateFormat31Choice> getUnconditionalDate() {
		return unconditionalDate == null ? Optional.empty() : Optional.of(unconditionalDate);
	}

	public CorporateActionDate44 setUnconditionalDate(DateFormat31Choice unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
		return this;
	}

	public Optional<DateFormat31Choice> getWhollyUnconditionalDate() {
		return whollyUnconditionalDate == null ? Optional.empty() : Optional.of(whollyUnconditionalDate);
	}

	public CorporateActionDate44 setWhollyUnconditionalDate(DateFormat31Choice whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
		return this;
	}

	public Optional<DateFormat31Choice> getExDividendDate() {
		return exDividendDate == null ? Optional.empty() : Optional.of(exDividendDate);
	}

	public CorporateActionDate44 setExDividendDate(DateFormat31Choice exDividendDate) {
		this.exDividendDate = exDividendDate;
		return this;
	}

	public Optional<DateFormat31Choice> getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate == null ? Optional.empty() : Optional.of(officialAnnouncementPublicationDate);
	}

	public CorporateActionDate44 setOfficialAnnouncementPublicationDate(DateFormat31Choice officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
		return this;
	}

	public Optional<DateFormat31Choice> getSpecialExDate() {
		return specialExDate == null ? Optional.empty() : Optional.of(specialExDate);
	}

	public CorporateActionDate44 setSpecialExDate(DateFormat31Choice specialExDate) {
		this.specialExDate = specialExDate;
		return this;
	}

	public Optional<DateFormat31Choice> getGuaranteedParticipationDate() {
		return guaranteedParticipationDate == null ? Optional.empty() : Optional.of(guaranteedParticipationDate);
	}

	public CorporateActionDate44 setGuaranteedParticipationDate(DateFormat31Choice guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
		return this;
	}

	public Optional<DateFormat31Choice> getElectionToCounterpartyMarketDeadline() {
		return electionToCounterpartyMarketDeadline == null ? Optional.empty() : Optional.of(electionToCounterpartyMarketDeadline);
	}

	public CorporateActionDate44 setElectionToCounterpartyMarketDeadline(DateFormat31Choice electionToCounterpartyMarketDeadline) {
		this.electionToCounterpartyMarketDeadline = electionToCounterpartyMarketDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getElectionToCounterpartyResponseDeadline() {
		return electionToCounterpartyResponseDeadline == null ? Optional.empty() : Optional.of(electionToCounterpartyResponseDeadline);
	}

	public CorporateActionDate44 setElectionToCounterpartyResponseDeadline(DateFormat31Choice electionToCounterpartyResponseDeadline) {
		this.electionToCounterpartyResponseDeadline = electionToCounterpartyResponseDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getLapsedDate() {
		return lapsedDate == null ? Optional.empty() : Optional.of(lapsedDate);
	}

	public CorporateActionDate44 setLapsedDate(DateFormat31Choice lapsedDate) {
		this.lapsedDate = lapsedDate;
		return this;
	}

	public Optional<DateFormat31Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public CorporateActionDate44 setPaymentDate(DateFormat31Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	public Optional<DateFormat31Choice> getThirdPartyDeadline() {
		return thirdPartyDeadline == null ? Optional.empty() : Optional.of(thirdPartyDeadline);
	}

	public CorporateActionDate44 setThirdPartyDeadline(DateFormat31Choice thirdPartyDeadline) {
		this.thirdPartyDeadline = thirdPartyDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline == null ? Optional.empty() : Optional.of(earlyThirdPartyDeadline);
	}

	public CorporateActionDate44 setEarlyThirdPartyDeadline(DateFormat31Choice earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = earlyThirdPartyDeadline;
		return this;
	}

	public Optional<DateFormat31Choice> getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate == null ? Optional.empty() : Optional.of(marketClaimTrackingEndDate);
	}

	public CorporateActionDate44 setMarketClaimTrackingEndDate(DateFormat31Choice marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
		return this;
	}

	public Optional<DateFormat31Choice> getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline == null ? Optional.empty() : Optional.of(leadPlaintiffDeadline);
	}

	public CorporateActionDate44 setLeadPlaintiffDeadline(DateFormat31Choice leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = leadPlaintiffDeadline;
		return this;
	}

	public Optional<DateFormat30Choice> getFilingDate() {
		return filingDate == null ? Optional.empty() : Optional.of(filingDate);
	}

	public CorporateActionDate44 setFilingDate(DateFormat30Choice filingDate) {
		this.filingDate = filingDate;
		return this;
	}

	public Optional<DateFormat30Choice> getHearingDate() {
		return hearingDate == null ? Optional.empty() : Optional.of(hearingDate);
	}

	public CorporateActionDate44 setHearingDate(DateFormat30Choice hearingDate) {
		this.hearingDate = hearingDate;
		return this;
	}
}