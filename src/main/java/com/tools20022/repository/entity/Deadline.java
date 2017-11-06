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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Deadline" src="doc-files/Deadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
 * Deadline.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
 * Deadline.mmIntermediaryDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
 * Deadline.mmSTPDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline
 * SecuritiesBlockingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegistrationDeadline
 * SecuritiesRegistrationDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingDeadline
 * MeetingDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionDeadline
 * CorporateActionDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmBorrowerStockLendingDeadline
 * CorporateActionDate48.mmBorrowerStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmBorrowerStockLendingDeadline
 * CorporateActionDate55.mmBorrowerStockLendingDeadline}</li>
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
 * "Deadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different deadlines available for the different processes related to corporate action processes."
 * </li>
 * </ul>
 */
public class Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * Related corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmDeadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected ISODateTime marketDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmMarketDeadline
	 * CorporateActionDate6.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmMarketDeadline
	 * CorporateActionDate10.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmMarketDeadline
	 * CorporateActionDate18.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmMarketDeadline
	 * CorporateActionDate19.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmMarketDeadline
	 * CorporateActionDate8.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmMarketDeadline
	 * CorporateActionDate11.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmMarketDeadline
	 * CorporateActionDate15.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmMarketDeadline
	 * CorporateActionDate16.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentMarketDeadline
	 * ProxyParameters.mmProxyAppointmentMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice1.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalMarketDeadline
	 * MeetingNotice1.mmResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteMarketDeadline
	 * VoteParameters.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumMarketDeadline
	 * VoteParameters.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationMarketDeadline
	 * EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmMarketDeadline
	 * ProxyAppointmentInformation1.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice2.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalMarketDeadline
	 * MeetingNotice2.mmResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteMarketDeadline
	 * VoteParameters1.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityMarketDeadline
	 * VoteParameters1.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumMarketDeadline
	 * VoteParameters1.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightMarketDeadline
	 * AdditionalRights1.mmAdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmMarketDeadline
	 * ProxyAppointmentInformation2.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice3.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteMarketDeadline
	 * VoteParameters2.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityMarketDeadline
	 * VoteParameters2.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumMarketDeadline
	 * VoteParameters2.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteMarketDeadline
	 * VoteParameters3.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityMarketDeadline
	 * VoteParameters3.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumMarketDeadline
	 * VoteParameters3.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmMarketDeadline
	 * CorporateActionDate4.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#mmMarketDeadline
	 * CorporateActionOption11.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmMarketDeadline
	 * CorporateActionDate29.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmMarketDeadline
	 * CorporateActionDate33.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMarketDeadline
	 * VoteParameters4.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityMarketDeadline
	 * VoteParameters4.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumMarketDeadline
	 * VoteParameters4.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice4.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmMarketDeadline
	 * ProxyAppointmentInformation3.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightMarketDeadline
	 * AdditionalRights2.mmAdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmMarketDeadline
	 * CorporateActionDate46.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmMarketDeadline
	 * CorporateActionDate48.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmMarketDeadline
	 * CorporateActionDate52.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmMarketDeadline
	 * CorporateActionDate55.mmMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed.  This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate10.mmMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate18.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate19.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate8.mmMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate11.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate15.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate16.mmMarketDeadline,
					com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentMarketDeadline, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalMarketDeadline, com.tools20022.repository.msg.VoteParameters.mmVoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters.mmVoteWithPremiumMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation1.mmMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalMarketDeadline,
					com.tools20022.repository.msg.VoteParameters1.mmVoteMarketDeadline, com.tools20022.repository.msg.VoteParameters1.mmRevocabilityMarketDeadline,
					com.tools20022.repository.msg.VoteParameters1.mmVoteWithPremiumMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationMarketDeadline,
					com.tools20022.repository.msg.AdditionalRights1.mmAdditionalRightMarketDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation2.mmMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice3.mmAttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters2.mmRevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationParticipationMarketDeadline, com.tools20022.repository.msg.VoteParameters3.mmVoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters3.mmRevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters3.mmVoteWithPremiumMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate4.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionOption11.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate29.mmMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate33.mmMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationParticipationMarketDeadline,
					com.tools20022.repository.msg.VoteParameters4.mmVoteMarketDeadline, com.tools20022.repository.msg.VoteParameters4.mmRevocabilityMarketDeadline,
					com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumMarketDeadline, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationMarketDeadline,
					com.tools20022.repository.msg.ProxyAppointmentInformation3.mmMarketDeadline, com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate46.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate48.mmMarketDeadline, com.tools20022.repository.msg.CorporateActionDate52.mmMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate55.mmMarketDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed.  This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime intermediaryDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentDeadline
	 * ProxyParameters.mmProxyAppointmentDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationDeadline
	 * MeetingNotice1.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalDeadline
	 * MeetingNotice1.mmResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteDeadline
	 * VoteParameters.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumDeadline
	 * VoteParameters.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationDeadline
	 * EntitlementAssessment.mmSecuritiesReregistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationDeadline
	 * MeetingNotice2.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalDeadline
	 * MeetingNotice2.mmResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteDeadline
	 * VoteParameters1.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityDeadline
	 * VoteParameters1.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumDeadline
	 * VoteParameters1.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationDeadline
	 * MeetingNotice3.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteDeadline
	 * VoteParameters2.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityDeadline
	 * VoteParameters2.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumDeadline
	 * VoteParameters2.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteDeadline
	 * VoteParameters3.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityDeadline
	 * VoteParameters3.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumDeadline
	 * VoteParameters3.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteDeadline
	 * VoteParameters4.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityDeadline
	 * VoteParameters4.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyVoteWithPremiumDeadline
	 * VoteParameters4.mmEarlyVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumDeadline
	 * VoteParameters4.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationDeadline
	 * MeetingNotice4.mmAttendanceConfirmationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntermediaryDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentDeadline, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationDeadline,
					com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalDeadline, com.tools20022.repository.msg.VoteParameters.mmVoteDeadline, com.tools20022.repository.msg.VoteParameters.mmVoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesReregistrationDeadline,
					com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationDeadline, com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalDeadline, com.tools20022.repository.msg.VoteParameters1.mmVoteDeadline,
					com.tools20022.repository.msg.VoteParameters1.mmRevocabilityDeadline, com.tools20022.repository.msg.VoteParameters1.mmVoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationDeadline, com.tools20022.repository.msg.MeetingNotice3.mmAttendanceConfirmationDeadline,
					com.tools20022.repository.msg.VoteParameters2.mmVoteDeadline, com.tools20022.repository.msg.VoteParameters2.mmRevocabilityDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationSecuritiesDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationParticipationDeadline, com.tools20022.repository.msg.VoteParameters3.mmVoteDeadline,
					com.tools20022.repository.msg.VoteParameters3.mmRevocabilityDeadline, com.tools20022.repository.msg.VoteParameters3.mmVoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.mmSecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationSecuritiesDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationParticipationDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteDeadline,
					com.tools20022.repository.msg.VoteParameters4.mmRevocabilityDeadline, com.tools20022.repository.msg.VoteParameters4.mmEarlyVoteWithPremiumDeadline,
					com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumDeadline, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime sTPDeadline;
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer. (STP or Electronic mode)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentElectronicDeadline
	 * ProxyParameters.mmProxyAppointmentElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationElectronicDeadline
	 * MeetingNotice1.mmAttendanceConfirmationElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteElectronicDeadline
	 * VoteParameters.mmVoteElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumElectronicDeadline
	 * VoteParameters.mmVoteWithPremiumElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice2.mmAttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteSTPDeadline
	 * VoteParameters1.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilitySTPDeadline
	 * VoteParameters1.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumSTPDeadline
	 * VoteParameters1.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice3.mmAttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteSTPDeadline
	 * VoteParameters2.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilitySTPDeadline
	 * VoteParameters2.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumSTPDeadline
	 * VoteParameters2.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteSTPDeadline
	 * VoteParameters3.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilitySTPDeadline
	 * VoteParameters3.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumSTPDeadline
	 * VoteParameters3.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteSTPDeadline
	 * VoteParameters4.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilitySTPDeadline
	 * VoteParameters4.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumSTPDeadline
	 * VoteParameters4.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice4.mmAttendanceConfirmationSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSTPDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentElectronicDeadline, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationElectronicDeadline,
					com.tools20022.repository.msg.VoteParameters.mmVoteElectronicDeadline, com.tools20022.repository.msg.VoteParameters.mmVoteWithPremiumElectronicDeadline,
					com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationSTPDeadline, com.tools20022.repository.msg.VoteParameters1.mmVoteSTPDeadline, com.tools20022.repository.msg.VoteParameters1.mmRevocabilitySTPDeadline,
					com.tools20022.repository.msg.VoteParameters1.mmVoteWithPremiumSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment1.mmRegistrationParticipationSTPDeadline,
					com.tools20022.repository.msg.MeetingNotice3.mmAttendanceConfirmationSTPDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteSTPDeadline, com.tools20022.repository.msg.VoteParameters2.mmRevocabilitySTPDeadline,
					com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment2.mmRegistrationParticipationSTPDeadline,
					com.tools20022.repository.msg.VoteParameters3.mmVoteSTPDeadline, com.tools20022.repository.msg.VoteParameters3.mmRevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters3.mmVoteWithPremiumSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.mmRegistrationParticipationSTPDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteSTPDeadline,
					com.tools20022.repository.msg.VoteParameters4.mmRevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumSTPDeadline,
					com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationSTPDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Meeting relatedMeeting;
	/**
	 * Meeting for which deadlines are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which deadlines are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmDeadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmDeadline, com.tools20022.repository.entity.Meeting.mmDeadline);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate48.mmBorrowerStockLendingDeadline, com.tools20022.repository.msg.CorporateActionDate55.mmBorrowerStockLendingDeadline);
				subType_lazy = () -> Arrays.asList(SecuritiesBlockingDeadline.mmObject(), SecuritiesRegistrationDeadline.mmObject(), MeetingDeadline.mmObject(), CorporateActionDeadline.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.mmMarketDeadline,
						com.tools20022.repository.entity.Deadline.mmIntermediaryDeadline, com.tools20022.repository.entity.Deadline.mmSTPDeadline, com.tools20022.repository.entity.Deadline.mmRelatedMeeting);
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
	}

	public ISODateTime getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(ISODateTime marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	public ISODateTime getIntermediaryDeadline() {
		return intermediaryDeadline;
	}

	public void setIntermediaryDeadline(ISODateTime intermediaryDeadline) {
		this.intermediaryDeadline = intermediaryDeadline;
	}

	public ISODateTime getSTPDeadline() {
		return sTPDeadline;
	}

	public void setSTPDeadline(ISODateTime sTPDeadline) {
		this.sTPDeadline = sTPDeadline;
	}

	public Meeting getRelatedMeeting() {
		return relatedMeeting;
	}

	public void setRelatedMeeting(com.tools20022.repository.entity.Meeting relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
	}
}