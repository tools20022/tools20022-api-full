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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different deadlines available for the different processes
 * related to meeting attendance, proxy voting and entitlement assessment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingDeadline" src="doc-files/MeetingDeadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipationRegistrationDeadline
 * MeetingParticipationRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AttendanceConfirmationDeadline
 * AttendanceConfirmationDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteRegistrationDeadline
 * VoteRegistrationDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRightDeadline
 * AdditionalRightDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteRevocabilityDeadline
 * VoteRevocabilityDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProxyAppointmentDeadline
 * ProxyAppointmentDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ResolutionProposalDeadline
 * ResolutionProposalDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteDeadline VoteDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteWithPremiumDeadline
 * VoteWithPremiumDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingDeadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment."
 * </li>
 * </ul>
 */
public class MeetingDeadline extends Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingDeadline";
				definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
				subType_lazy = () -> Arrays.asList(MeetingParticipationRegistrationDeadline.mmObject(), AttendanceConfirmationDeadline.mmObject(), VoteRegistrationDeadline.mmObject(), AdditionalRightDeadline.mmObject(),
						VoteRevocabilityDeadline.mmObject(), ProxyAppointmentDeadline.mmObject(), ResolutionProposalDeadline.mmObject(), VoteDeadline.mmObject(), VoteWithPremiumDeadline.mmObject());
				superType_lazy = () -> Deadline.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingDeadline.class;
			}
		});
		return mmObject_lazy.get();
	}
}