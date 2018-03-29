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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages used by intermediaries, such as (I)CSD's, global custodians
 * or local custodians, involved in the corporate action processing chain
 * between the issuer (agent) and the investors. The messages support corporate
 * action events announcements and entitlements, elections, reminders, movements
 * preliminary advices, movements confirmations, movements reversals and status
 * reporting. <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05
 * CorporateActionEventProcessingStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06
 * CorporateActionInstructionCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04
 * CorporateActionNarrativeV04}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Corporate Actions - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices, movements confirmations, movements reversals and status reporting. \r\n"
 * </li>
 * </ul>
 */
public class CorporateActionsISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Corporate Actions - ISO - Previous version";
				definition = "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices, movements confirmations, movements reversals and status reporting. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV05.mmObject(), CorporateActionInstructionCancellationRequestV06.mmObject(), CorporateActionNarrativeV04.mmObject(),
						CorporateActionCancellationAdviceV07.mmObject(), CorporateActionNotificationV07.mmObject(), CorporateActionMovementConfirmationV08.mmObject(), CorporateActionInstructionStatementReportV06.mmObject(),
						CorporateActionMovementPreliminaryAdviceV08.mmObject(), CorporateActionMovementReversalAdviceV08.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmObject(),
						CorporateActionInstructionCancellationRequestStatusAdviceV07.mmObject(), CorporateActionInstructionV07.mmObject(), CorporateActionInstructionStatusAdviceV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}