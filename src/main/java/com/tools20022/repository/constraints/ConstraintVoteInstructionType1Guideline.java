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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingNotificationV03;
import com.tools20022.repository.area.seev.MeetingNotificationV04;
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import java.util.Arrays;

/**
 * If all of the vote instructions types are to be the same for all resolutions,
 * it is recommended to use only the element Vote/VoteInstructionType. If the
 * vote instruction types are not going to be the same for each resolution,
 * then, it is recommended to use only the element
 * Resolution/VoteInstructionType in each occurrence of Resolution.
 */
public class ConstraintVoteInstructionType1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05
	 * MeetingNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/VoteInstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline#forMeetingNotificationV04
	 * ConstraintVoteInstructionType1Guideline.forMeetingNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV05> forMeetingNotificationV05 = new MMConstraint<MeetingNotificationV05>() {
		{
			validator = ConstraintVoteInstructionType1Guideline::checkMeetingNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType1Guideline";
			definition = "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/VoteInstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline.forMeetingNotificationV04;
			owner_lazy = () -> MeetingNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04
	 * MeetingNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/Vote InstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline#forMeetingNotificationV05
	 * ConstraintVoteInstructionType1Guideline.forMeetingNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV04> forMeetingNotificationV04 = new MMConstraint<MeetingNotificationV04>() {
		{
			validator = ConstraintVoteInstructionType1Guideline::checkMeetingNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType1Guideline";
			definition = "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/Vote InstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline.forMeetingNotificationV05);
			owner_lazy = () -> MeetingNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03
	 * MeetingNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/Vote InstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV03> forMeetingNotificationV03 = new MMConstraint<MeetingNotificationV03>() {
		{
			validator = ConstraintVoteInstructionType1Guideline::checkMeetingNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType1Guideline";
			definition = "If all of the vote instructions types are to be the same for all resolutions, it is recommended to use only the element Vote/Vote InstructionType. If the vote instruction types are not going to be the same for each resolution, then, it is recommended to use only the element Resolution/VoteInstructionType in each occurrence of Resolution.";
			owner_lazy = () -> MeetingNotificationV03.mmObject();
		}
	};

	/**
	 * If all of the vote instructions types are to be the same for all
	 * resolutions, it is recommended to use only the element
	 * Vote/VoteInstructionType. If the vote instruction types are not going to
	 * be the same for each resolution, then, it is recommended to use only the
	 * element Resolution/VoteInstructionType in each occurrence of Resolution.
	 */
	public static void checkMeetingNotificationV05(MeetingNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If all of the vote instructions types are to be the same for all
	 * resolutions, it is recommended to use only the element Vote/Vote
	 * InstructionType. If the vote instruction types are not going to be the
	 * same for each resolution, then, it is recommended to use only the element
	 * Resolution/VoteInstructionType in each occurrence of Resolution.
	 */
	public static void checkMeetingNotificationV04(MeetingNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If all of the vote instructions types are to be the same for all
	 * resolutions, it is recommended to use only the element Vote/Vote
	 * InstructionType. If the vote instruction types are not going to be the
	 * same for each resolution, then, it is recommended to use only the element
	 * Resolution/VoteInstructionType in each occurrence of Resolution.
	 */
	public static void checkMeetingNotificationV03(MeetingNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}