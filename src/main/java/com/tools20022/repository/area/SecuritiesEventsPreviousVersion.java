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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05
 * CorporateActionEventProcessingStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06
 * CorporateActionInstructionCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07
 * CorporateActionCancellationAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
 * CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
 * CorporateActionMovementConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06
 * CorporateActionInstructionStatementReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08
 * CorporateActionMovementPreliminaryAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
 * CorporateActionMovementReversalAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07
 * CorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07
 * CorporateActionInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08
 * CorporateActionInstructionStatusAdviceV08}</li>
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
 * "Securities Events - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support asset servicing, including proxy voting, income and corporate actions."
 * </li>
 * </ul>
 */
public class SecuritiesEventsPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Events - Previous version - master";
				definition = "Messages that support asset servicing, including proxy voting, income and corporate actions.";
				code = "seev";
				messageDefinition_lazy = () -> Arrays.asList(MeetingNotificationV04.mmObject(), MeetingCancellationV04.mmObject(), MeetingEntitlementNotificationV04.mmObject(), MeetingInstructionV04.mmObject(),
						MeetingInstructionCancellationRequestV04.mmObject(), MeetingInstructionStatusV04.mmObject(), MeetingVoteExecutionConfirmationV04.mmObject(), MeetingResultDisseminationV04.mmObject(),
						CorporateActionNarrativeV03.mmObject(), CorporateActionEventProcessingStatusAdviceV05.mmObject(), CorporateActionInstructionCancellationRequestV06.mmObject(), CorporateActionCancellationAdviceV07.mmObject(),
						CorporateActionNotificationV07.mmObject(), CorporateActionMovementConfirmationV08.mmObject(), CorporateActionInstructionStatementReportV06.mmObject(), CorporateActionMovementPreliminaryAdviceV08.mmObject(),
						CorporateActionMovementReversalAdviceV08.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV07.mmObject(),
						CorporateActionInstructionV07.mmObject(), CorporateActionInstructionStatusAdviceV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}