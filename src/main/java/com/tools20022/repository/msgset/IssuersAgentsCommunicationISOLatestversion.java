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
 * Set of messages exchanged between the issuer or its agent and the CSD
 * involved in a corporate action to cover the announcement of the corporate
 * action, the instruction, the resource movement, the deactivation and standing
 * instruction.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
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
 * "Issuers' Agents Communication - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages exchanged between the issuer or its agent and the CSD involved in a corporate action to cover the announcement of the corporate action, the instruction, the resource movement, the deactivation and standing instruction.\r\n"
 * </li>
 * </ul>
 */
public class IssuersAgentsCommunicationISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Issuers' Agents Communication - ISO - Latest version";
				definition = "Set of messages exchanged between the issuer or its agent and the CSD involved in a corporate action to cover the announcement of the corporate action, the instruction, the resource movement, the deactivation and standing instruction.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmObject(), AgentCANotificationCancellationRequestV01.mmObject(), AgentCANotificationStatusAdviceV01.mmObject(), AgentCAElectionAdviceV01.mmObject(),
						AgentCAElectionAmendmentRequestV01.mmObject(), AgentCAElectionCancellationRequestV01.mmObject(), AgentCAElectionStatusAdviceV01.mmObject(), AgentCADistributionBreakdownAdviceV01.mmObject(),
						AgentCAGlobalDistributionAuthorisationRequestV01.mmObject(), AgentCAGlobalDistributionStatusAdviceV01.mmObject(), AgentCAMovementInstructionV01.mmObject(), AgentCAMovementCancellationRequestV01.mmObject(),
						AgentCAMovementConfirmationV01.mmObject(), AgentCAMovementStatusAdviceV01.mmObject(), AgentCAInformationAdviceV01.mmObject(), AgentCAInformationStatusAdviceV01.mmObject(),
						AgentCAStandingInstructionRequestV01.mmObject(), AgentCAStandingInstructionCancellationRequestV01.mmObject(), AgentCAStandingInstructionStatusAdviceV01.mmObject(), AgentCADeactivationInstructionV01.mmObject(),
						AgentCADeactivationCancellationRequestV01.mmObject(), AgentCADeactivationStatusAdviceV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}