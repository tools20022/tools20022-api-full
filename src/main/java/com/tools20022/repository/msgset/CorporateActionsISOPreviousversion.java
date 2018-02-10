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
 * preliminary advices , movements confirmations , movements reversals and
 * status reporting. <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04
 * CorporateActionNarrativeV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06
 * CorporateActionCancellationAdviceV06}</li>
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
 * "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices , movements confirmations , movements reversals and status reporting. \r\n"
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
				definition = "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices , movements confirmations , movements reversals and status reporting. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV06.mmObject(),
						CorporateActionInstructionV06.mmObject(), CorporateActionMovementPreliminaryAdviceV07.mmObject(), CorporateActionInstructionStatementReportV05.mmObject(), CorporateActionMovementConfirmationV07.mmObject(),
						CorporateActionNotificationV06.mmObject(), CorporateActionEventProcessingStatusAdviceV05.mmObject(), CorporateActionInstructionCancellationRequestV06.mmObject(), CorporateActionInstructionStatusAdviceV07.mmObject(),
						CorporateActionMovementReversalAdviceV07.mmObject(), CorporateActionNarrativeV04.mmObject(), CorporateActionCancellationAdviceV06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}