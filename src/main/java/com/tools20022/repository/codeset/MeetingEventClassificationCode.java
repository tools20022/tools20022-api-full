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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information about the originator of the meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmCourtDecision
 * MeetingEventClassificationCode.mmCourtDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmIssuerInitiated
 * MeetingEventClassificationCode.mmIssuerInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmVotingRightHolderInitiated
 * MeetingEventClassificationCode.mmVotingRightHolderInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmAnnual
 * MeetingEventClassificationCode.mmAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmOrdinary
 * MeetingEventClassificationCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#mmClass_
 * MeetingEventClassificationCode.mmClass_}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRTD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingEventClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies information about the originator of the meeting."</li>
 * </ul>
 */
public class MeetingEventClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of a legal proceeding."</li>
	 * </ul>
	 */
	public static final MMCode mmCourtDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CourtDecision";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "CRTD";
		}
	};
	/**
	 * Specifies that the meeting is the result of an obligation or a decision
	 * made by the issuer as opposed to voting rights holder initiated, for
	 * example, contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, for example, contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "IssuerInitiated";
			definition = "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, for example, contested meeting.";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "IINT";
		}
	};
	/**
	 * Specifies that the meeting is the result if a request or an action of a
	 * voting right holder(s), for example, contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightHolderInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result if a request or an action of a voting right holder(s), for example, contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVotingRightHolderInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "VotingRightHolderInitiated";
			definition = "Specifies that the meeting is the result if a request or an action of a voting right holder(s), for example, contested meeting.";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "VRHI";
		}
	};
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and to elect the board members and the auditors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAnnual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Annual";
			definition = "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors.";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "ANNU";
		}
	};
	/**
	 * Specifies a meeting which is planned in the by-laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a meeting which is planned in the by-laws."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Ordinary";
			definition = "Specifies a meeting which is planned in the by-laws.";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Meeting for holders of a specific type of assets, for example, preferred
	 * shares, bonds, 
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting for holders of a specific type of assets, for example, preferred shares, bonds, "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClass_ = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Class";
			definition = "Meeting for holders of a specific type of assets, for example, preferred shares, bonds, ";
			owner_lazy = () -> MeetingEventClassificationCode.mmObject();
			codeName = "CLAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CRTD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "MeetingEventClassificationCode";
				definition = "Specifies information about the originator of the meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingEventClassificationCode.mmCourtDecision, com.tools20022.repository.codeset.MeetingEventClassificationCode.mmIssuerInitiated,
						com.tools20022.repository.codeset.MeetingEventClassificationCode.mmVotingRightHolderInitiated, com.tools20022.repository.codeset.MeetingEventClassificationCode.mmAnnual,
						com.tools20022.repository.codeset.MeetingEventClassificationCode.mmOrdinary, com.tools20022.repository.codeset.MeetingEventClassificationCode.mmClass_);
			}
		});
		return mmObject_lazy.get();
	}
}