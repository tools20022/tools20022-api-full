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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages used by parties involved in the organisation of a
 * shareholders meeting. It covers the complete end to end flow of messages
 * between the issuer and its agent and the parties holding the right to vote,
 * through a certain number of intermediaries.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
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
 * </ul>
 * </li>
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
 * "Proxy Voting - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used by parties involved in the organisation of a shareholders meeting. It covers the complete end to end flow of messages between the issuer and its agent and the parties holding the right to vote, through a certain number of intermediaries.\r\n"
 * </li>
 * </ul>
 */
public class ProxyVotingISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Proxy Voting - ISO - Latest version";
				definition = "Set of messages used by parties involved in the organisation of a shareholders meeting. It covers the complete end to end flow of messages between the issuer and its agent and the parties holding the right to vote, through a certain number of intermediaries.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmObject(), MeetingNotificationV05.mmObject(), MeetingInstructionStatusV05.mmObject(), MeetingCancellationV05.mmObject(),
						MeetingResultDisseminationV05.mmObject(), MeetingVoteExecutionConfirmationV05.mmObject(), MeetingInstructionV05.mmObject(), MeetingEntitlementNotificationV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}