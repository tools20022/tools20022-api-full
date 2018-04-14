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
 * reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Corporate Actions - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices, movements confirmations, movements reversals and status reporting."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CorporateActionsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Corporate Actions - ISO - Latest version";
				definition = "Set of messages used by intermediaries, such as (I)CSD's, global custodians or local custodians, involved in the corporate action processing chain between the issuer (agent) and the investors. The messages support corporate action events announcements and entitlements, elections, reminders, movements preliminary advices, movements confirmations, movements reversals and status reporting.";
				messageDefinition_lazy = () -> Arrays.asList(CorporateActionNarrativeV04.mmObject(), CorporateActionEventProcessingStatusAdviceV06.mmObject(), CorporateActionInstructionCancellationRequestV07.mmObject(),
						CorporateActionInstructionStatementReportV07.mmObject(), CorporateActionMovementReversalAdviceV09.mmObject(), CorporateActionNotificationV08.mmObject(), CorporateActionInstructionV08.mmObject(),
						CorporateActionMovementConfirmationV09.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmObject(), CorporateActionMovementPreliminaryAdviceV09.mmObject(),
						CorporateActionInstructionStatusAdviceV09.mmObject(), CorporateActionCancellationAdviceV08.mmObject(), CorporateActionInstructionCancellationRequestStatusAdviceV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}