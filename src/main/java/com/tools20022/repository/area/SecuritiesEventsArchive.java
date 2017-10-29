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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support asset servicing, including proxy voting, income and
 * corporate actions
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "seev"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01
 * CorporateActionCancellationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02
 * CorporateActionCancellationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03
 * CorporateActionCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04
 * CorporateActionCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01
 * CorporateActionEventProcessingStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02
 * CorporateActionEventProcessingStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03
 * CorporateActionEventProcessingStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04
 * CorporateActionEventProcessingStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
 * CorporateActionInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
 * CorporateActionInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
 * CorporateActionInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
 * CorporateActionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01
 * CorporateActionInstructionCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV02
 * CorporateActionInstructionCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV03
 * CorporateActionInstructionCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV04
 * CorporateActionInstructionCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01
 * CorporateActionInstructionCancellationRequestStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02
 * CorporateActionInstructionCancellationRequestStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03
 * CorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04
 * CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01
 * CorporateActionInstructionStatementReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02
 * CorporateActionInstructionStatementReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03
 * CorporateActionInstructionStatementReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04
 * CorporateActionInstructionStatementReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01
 * CorporateActionInstructionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02
 * CorporateActionInstructionStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03
 * CorporateActionInstructionStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04
 * CorporateActionInstructionStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
 * CorporateActionMovementConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
 * CorporateActionMovementConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
 * CorporateActionMovementConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
 * CorporateActionMovementConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01
 * CorporateActionMovementPreliminaryAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02
 * CorporateActionMovementPreliminaryAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03
 * CorporateActionMovementPreliminaryAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04
 * CorporateActionMovementPreliminaryAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
 * CorporateActionMovementReversalAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
 * CorporateActionMovementReversalAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
 * CorporateActionMovementReversalAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
 * CorporateActionMovementReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
 * CorporateActionNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
 * CorporateActionNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
 * CorporateActionNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
 * CorporateActionNotificationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02
 * MeetingNotificationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03
 * MeetingNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02
 * MeetingCancellationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03
 * MeetingCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02
 * MeetingEntitlementNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03
 * MeetingEntitlementNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingInstructionV02
 * MeetingInstructionV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingInstructionV03
 * MeetingInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02
 * MeetingInstructionCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03
 * MeetingInstructionCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02
 * MeetingInstructionStatusV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03
 * MeetingInstructionStatusV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV02
 * MeetingVoteExecutionConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03
 * MeetingVoteExecutionConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02
 * MeetingResultDisseminationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV03
 * MeetingResultDisseminationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01
 * CorporateActionNarrativeV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV02
 * CorporateActionNarrativeV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05
 * CorporateActionCancellationAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
 * CorporateActionMovementConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
 * CorporateActionNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05
 * CorporateActionInstructionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05
 * CorporateActionMovementPreliminaryAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
 * CorporateActionInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
 * CorporateActionMovementReversalAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV05
 * CorporateActionInstructionCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
 * CorporateActionMovementConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05
 * CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06
 * CorporateActionInstructionStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06
 * CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
 * CorporateActionMovementReversalAdviceV06}</li>
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
 * "Securities Events - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support asset servicing, including proxy voting, income and corporate actions"
 * </li>
 * </ul>
 */
public class SecuritiesEventsArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Events - Archive - master";
				definition = "Messages that support asset servicing, including proxy voting, income and corporate actions";
				messageDefinition_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV01.mmObject(), CorporateActionCancellationAdviceV02.mmObject(), CorporateActionCancellationAdviceV03.mmObject(),
						CorporateActionCancellationAdviceV04.mmObject(), CorporateActionEventProcessingStatusAdviceV01.mmObject(), CorporateActionEventProcessingStatusAdviceV02.mmObject(),
						CorporateActionEventProcessingStatusAdviceV03.mmObject(), CorporateActionEventProcessingStatusAdviceV04.mmObject(), CorporateActionInstructionV01.mmObject(), CorporateActionInstructionV02.mmObject(),
						CorporateActionInstructionV03.mmObject(), CorporateActionInstructionV04.mmObject(), CorporateActionInstructionCancellationRequestV01.mmObject(), CorporateActionInstructionCancellationRequestV02.mmObject(),
						CorporateActionInstructionCancellationRequestV03.mmObject(), CorporateActionInstructionCancellationRequestV04.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV01.mmObject(),
						CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV03.mmObject(),
						CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject(), CorporateActionInstructionStatementReportV01.mmObject(), CorporateActionInstructionStatementReportV02.mmObject(),
						CorporateActionInstructionStatementReportV03.mmObject(), CorporateActionInstructionStatementReportV04.mmObject(), CorporateActionInstructionStatusAdviceV01.mmObject(),
						CorporateActionInstructionStatusAdviceV02.mmObject(), CorporateActionInstructionStatusAdviceV03.mmObject(), CorporateActionInstructionStatusAdviceV04.mmObject(), CorporateActionMovementConfirmationV01.mmObject(),
						CorporateActionMovementConfirmationV02.mmObject(), CorporateActionMovementConfirmationV03.mmObject(), CorporateActionMovementConfirmationV04.mmObject(), CorporateActionMovementPreliminaryAdviceV01.mmObject(),
						CorporateActionMovementPreliminaryAdviceV02.mmObject(), CorporateActionMovementPreliminaryAdviceV03.mmObject(), CorporateActionMovementPreliminaryAdviceV04.mmObject(),
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmObject(),
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmObject(), CorporateActionMovementReversalAdviceV01.mmObject(),
						CorporateActionMovementReversalAdviceV02.mmObject(), CorporateActionMovementReversalAdviceV03.mmObject(), CorporateActionMovementReversalAdviceV04.mmObject(), CorporateActionNotificationV01.mmObject(),
						CorporateActionNotificationV02.mmObject(), CorporateActionNotificationV03.mmObject(), CorporateActionNotificationV04.mmObject(), MeetingNotificationV02.mmObject(), MeetingNotificationV03.mmObject(),
						MeetingCancellationV02.mmObject(), MeetingCancellationV03.mmObject(), MeetingEntitlementNotificationV02.mmObject(), MeetingEntitlementNotificationV03.mmObject(), MeetingInstructionV02.mmObject(),
						MeetingInstructionV03.mmObject(), MeetingInstructionCancellationRequestV02.mmObject(), MeetingInstructionCancellationRequestV03.mmObject(), MeetingInstructionStatusV02.mmObject(),
						MeetingInstructionStatusV03.mmObject(), MeetingVoteExecutionConfirmationV02.mmObject(), MeetingVoteExecutionConfirmationV03.mmObject(), MeetingResultDisseminationV02.mmObject(),
						MeetingResultDisseminationV03.mmObject(), CorporateActionNarrativeV01.mmObject(), CorporateActionNarrativeV02.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmObject(),
						CorporateActionCancellationAdviceV05.mmObject(), CorporateActionMovementConfirmationV05.mmObject(), CorporateActionNotificationV05.mmObject(), CorporateActionInstructionStatusAdviceV05.mmObject(),
						CorporateActionMovementPreliminaryAdviceV05.mmObject(), CorporateActionInstructionV05.mmObject(), CorporateActionMovementReversalAdviceV05.mmObject(), CorporateActionInstructionCancellationRequestV05.mmObject(),
						CorporateActionMovementConfirmationV06.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject(), CorporateActionInstructionStatusAdviceV06.mmObject(),
						CorporateActionMovementPreliminaryAdviceV06.mmObject(), CorporateActionMovementReversalAdviceV06.mmObject());
				code = "seev";
			}
		});
		return mmObject_lazy.get();
	}
}