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
 * When an agenda item needs to be linked to a resolution, it is recommended to
 * have the resolution information following directly the agenda item
 * information to which the resolution is linked as illustrated in the following
 * example:
 * 
 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
 * description.&gt; ForInformationOnly = True Type =.
 * 
 * Directly followed by
 * 
 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
 * description.&gt; ForInformationOnly = False Type =. .
 */
public class ConstraintResolution1Guideline {

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
	 * name} = "Resolution1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = &lt;Item description.&gt;\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = &lt;Resolution description.&gt;\nForInformationOnly = False\nType =.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintResolution1Guideline#forMeetingNotificationV04
	 * ConstraintResolution1Guideline.forMeetingNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV05> forMeetingNotificationV05 = new MMConstraint<MeetingNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution1Guideline";
			definition = "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = <Item description.>\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = <Resolution description.>\nForInformationOnly = False\nType =.\n.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintResolution1Guideline.forMeetingNotificationV04;
			owner_lazy = () -> MeetingNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(MeetingNotificationV05 obj) throws Exception {
			checkMeetingNotificationV05(obj);
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
	 * name} = "Resolution1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = &lt;Item description.&gt;\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = &lt;Resolution description.&gt;\nForInformationOnly = False\nType =.\n."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintResolution1Guideline#forMeetingNotificationV05
	 * ConstraintResolution1Guideline.forMeetingNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV04> forMeetingNotificationV04 = new MMConstraint<MeetingNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution1Guideline";
			definition = "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = <Item description.>\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = <Resolution description.>\nForInformationOnly = False\nType =.\n.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintResolution1Guideline.forMeetingNotificationV05);
			owner_lazy = () -> MeetingNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(MeetingNotificationV04 obj) throws Exception {
			checkMeetingNotificationV04(obj);
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
	 * name} = "Resolution1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = &lt;Item description.&gt;\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = &lt;Resolution description.&gt;\nForInformationOnly = False\nType =.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingNotificationV03> forMeetingNotificationV03 = new MMConstraint<MeetingNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution1Guideline";
			definition = "When an agenda item needs to be linked to a resolution, it is recommended to have the resolution information following directly the agenda item information to which the resolution is linked as illustrated in the following example: \n\nResolution/IssuerLabel = Agenda item 1\nDescription = <Item description.>\nForInformationOnly = True\nType =.\n\nDirectly followed by\n\nResolution/IssuerLabel = Resolution 1\nDescription = <Resolution description.>\nForInformationOnly = False\nType =.\n.";
			owner_lazy = () -> MeetingNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(MeetingNotificationV03 obj) throws Exception {
			checkMeetingNotificationV03(obj);
		}
	};

	/**
	 * When an agenda item needs to be linked to a resolution, it is recommended
	 * to have the resolution information following directly the agenda item
	 * information to which the resolution is linked as illustrated in the
	 * following example:
	 * 
	 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
	 * description.&gt; ForInformationOnly = True Type =.
	 * 
	 * Directly followed by
	 * 
	 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
	 * description.&gt; ForInformationOnly = False Type =. .
	 */
	public static void checkMeetingNotificationV05(MeetingNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When an agenda item needs to be linked to a resolution, it is recommended
	 * to have the resolution information following directly the agenda item
	 * information to which the resolution is linked as illustrated in the
	 * following example:
	 * 
	 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
	 * description.&gt; ForInformationOnly = True Type =.
	 * 
	 * Directly followed by
	 * 
	 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
	 * description.&gt; ForInformationOnly = False Type =. .
	 */
	public static void checkMeetingNotificationV04(MeetingNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When an agenda item needs to be linked to a resolution, it is recommended
	 * to have the resolution information following directly the agenda item
	 * information to which the resolution is linked as illustrated in the
	 * following example:
	 * 
	 * Resolution/IssuerLabel = Agenda item 1 Description = &lt;Item
	 * description.&gt; ForInformationOnly = True Type =.
	 * 
	 * Directly followed by
	 * 
	 * Resolution/IssuerLabel = Resolution 1 Description = &lt;Resolution
	 * description.&gt; ForInformationOnly = False Type =. .
	 */
	public static void checkMeetingNotificationV03(MeetingNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}