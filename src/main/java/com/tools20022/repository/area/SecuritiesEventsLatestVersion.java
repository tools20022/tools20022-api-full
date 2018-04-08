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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support asset servicing, including proxy voting, income and
 * corporate actions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "seev"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01
 * AgentCANotificationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01
 * AgentCANotificationCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01
 * AgentCANotificationStatusAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01
 * AgentCAElectionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01
 * AgentCAElectionAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01
 * AgentCAElectionCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01
 * AgentCAElectionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01
 * AgentCADistributionBreakdownAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01
 * AgentCAGlobalDistributionAuthorisationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01
 * AgentCAGlobalDistributionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01
 * AgentCAMovementInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01
 * AgentCAMovementCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01
 * AgentCAMovementConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01
 * AgentCAMovementStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01
 * AgentCAInformationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01
 * AgentCAInformationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01
 * AgentCAStandingInstructionRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01
 * AgentCAStandingInstructionCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01
 * AgentCAStandingInstructionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01
 * AgentCADeactivationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01
 * AgentCADeactivationCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01
 * AgentCADeactivationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05
 * MeetingInstructionCancellationRequestV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05
 * MeetingNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05
 * MeetingInstructionStatusV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05
 * MeetingCancellationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05
 * MeetingResultDisseminationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05
 * MeetingVoteExecutionConfirmationV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingInstructionV05
 * MeetingInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05
 * MeetingEntitlementNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04
 * CorporateActionNarrativeV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06
 * CorporateActionEventProcessingStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07
 * CorporateActionInstructionCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07
 * CorporateActionInstructionStatementReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09
 * CorporateActionMovementReversalAdviceV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
 * CorporateActionNotificationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
 * CorporateActionInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
 * CorporateActionMovementConfirmationV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV08
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
 * CorporateActionMovementPreliminaryAdviceV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09
 * CorporateActionInstructionStatusAdviceV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV08
 * CorporateActionCancellationAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08
 * CorporateActionInstructionCancellationRequestStatusAdviceV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Events - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support asset servicing, including proxy voting, income and corporate actions."
 * </li>
 * </ul>
 */
public class SecuritiesEventsLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Events - Latest version - master";
				definition = "Messages that support asset servicing, including proxy voting, income and corporate actions.";
				code = "seev";
				messageDefinition_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmObject(), AgentCANotificationCancellationRequestV01.mmObject(), AgentCANotificationStatusAdviceV01.mmObject(), AgentCAElectionAdviceV01.mmObject(),
						AgentCAElectionAmendmentRequestV01.mmObject(), AgentCAElectionCancellationRequestV01.mmObject(), AgentCAElectionStatusAdviceV01.mmObject(), AgentCADistributionBreakdownAdviceV01.mmObject(),
						AgentCAGlobalDistributionAuthorisationRequestV01.mmObject(), AgentCAGlobalDistributionStatusAdviceV01.mmObject(), AgentCAMovementInstructionV01.mmObject(), AgentCAMovementCancellationRequestV01.mmObject(),
						AgentCAMovementConfirmationV01.mmObject(), AgentCAMovementStatusAdviceV01.mmObject(), AgentCAInformationAdviceV01.mmObject(), AgentCAInformationStatusAdviceV01.mmObject(),
						AgentCAStandingInstructionRequestV01.mmObject(), AgentCAStandingInstructionCancellationRequestV01.mmObject(), AgentCAStandingInstructionStatusAdviceV01.mmObject(), AgentCADeactivationInstructionV01.mmObject(),
						AgentCADeactivationCancellationRequestV01.mmObject(), AgentCADeactivationStatusAdviceV01.mmObject(), MeetingInstructionCancellationRequestV05.mmObject(), MeetingNotificationV05.mmObject(),
						MeetingInstructionStatusV05.mmObject(), MeetingCancellationV05.mmObject(), MeetingResultDisseminationV05.mmObject(), MeetingVoteExecutionConfirmationV05.mmObject(), MeetingInstructionV05.mmObject(),
						MeetingEntitlementNotificationV05.mmObject(), CorporateActionNarrativeV04.mmObject(), CorporateActionEventProcessingStatusAdviceV06.mmObject(), CorporateActionInstructionCancellationRequestV07.mmObject(),
						CorporateActionInstructionStatementReportV07.mmObject(), CorporateActionMovementReversalAdviceV09.mmObject(), CorporateActionNotificationV08.mmObject(), CorporateActionInstructionV08.mmObject(),
						CorporateActionMovementConfirmationV09.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmObject(), CorporateActionMovementPreliminaryAdviceV09.mmObject(),
						CorporateActionInstructionStatusAdviceV09.mmObject(), CorporateActionCancellationAdviceV08.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}