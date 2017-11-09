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
 * corporate actions
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04
 * MeetingNotificationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04
 * MeetingCancellationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04
 * MeetingEntitlementNotificationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04
 * MeetingInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04
 * MeetingInstructionCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04
 * MeetingInstructionStatusV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04
 * MeetingVoteExecutionConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04
 * MeetingResultDisseminationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV03
 * CorporateActionNarrativeV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06
 * CorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
 * CorporateActionInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
 * CorporateActionMovementPreliminaryAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05
 * CorporateActionInstructionStatementReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
 * CorporateActionMovementConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
 * CorporateActionNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05
 * CorporateActionEventProcessingStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06
 * CorporateActionInstructionCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07
 * CorporateActionInstructionStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
 * CorporateActionMovementReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06
 * CorporateActionCancellationAdviceV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "seev"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Events - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support asset servicing, including proxy voting, income and corporate actions"
 * </li>
 * </ul>
 */
public class SecuritiesEventsPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Events - Previous version - master";
				definition = "Messages that support asset servicing, including proxy voting, income and corporate actions";
				messageDefinition_lazy = () -> Arrays.asList(MeetingNotificationV04.mmObject(), MeetingCancellationV04.mmObject(), MeetingEntitlementNotificationV04.mmObject(), MeetingInstructionV04.mmObject(),
						MeetingInstructionCancellationRequestV04.mmObject(), MeetingInstructionStatusV04.mmObject(), MeetingVoteExecutionConfirmationV04.mmObject(), MeetingResultDisseminationV04.mmObject(),
						CorporateActionNarrativeV03.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV06.mmObject(),
						CorporateActionInstructionV06.mmObject(), CorporateActionMovementPreliminaryAdviceV07.mmObject(), CorporateActionInstructionStatementReportV05.mmObject(), CorporateActionMovementConfirmationV07.mmObject(),
						CorporateActionNotificationV06.mmObject(), CorporateActionEventProcessingStatusAdviceV05.mmObject(), CorporateActionInstructionCancellationRequestV06.mmObject(), CorporateActionInstructionStatusAdviceV07.mmObject(),
						CorporateActionMovementReversalAdviceV07.mmObject(), CorporateActionCancellationAdviceV06.mmObject());
				code = "seev";
			}
		});
		return mmObject_lazy.get();
	}
}