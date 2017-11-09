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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MeetingInstructionRejectionCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the possible rejection reasons.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
 * MeetingInstructionRejectionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmInvalidMeetingReference
 * MeetingInstructionRejection1Code.mmInvalidMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmInvalidAccount
 * MeetingInstructionRejection1Code.mmInvalidAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmInsufficientSecurityPosition
 * MeetingInstructionRejection1Code.mmInsufficientSecurityPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmInvalidInstructedQuantity
 * MeetingInstructionRejection1Code.mmInvalidInstructedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmInvalidDate
 * MeetingInstructionRejection1Code.mmInvalidDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmSplitVoteNotAllowed
 * MeetingInstructionRejection1Code.mmSplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmPartialVoteNotAllowed
 * MeetingInstructionRejection1Code.mmPartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmMissingOrInvalidPOA
 * MeetingInstructionRejection1Code.mmMissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmProxyCardDiscrepancy
 * MeetingInstructionRejection1Code.mmProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmRejectedByIssuer
 * MeetingInstructionRejection1Code.mmRejectedByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code#mmOther
 * MeetingInstructionRejection1Code.mmOther}</li>
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
 * <li>"INMR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionRejection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible rejection reasons."</li>
 * </ul>
 */
public class MeetingInstructionRejection1Code extends MeetingInstructionRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMeetingReference"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMeetingReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMeetingReference";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccount";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientSecurityPosition"</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientSecurityPosition = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientSecurityPosition";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInstructedQuantity"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidInstructedQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInstructedQuantity";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDate"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDate";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * </ul>
	 */
	public static final MMCode mmSplitVoteNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialVoteNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingOrInvalidPOA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * </ul>
	 */
	public static final MMCode mmProxyCardDiscrepancy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuer"</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedByIssuer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuer";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INMR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionRejection1Code";
				definition = "Identifies the possible rejection reasons.";
				code_lazy = () -> Arrays.asList(MeetingInstructionRejection1Code.mmInvalidMeetingReference, MeetingInstructionRejection1Code.mmInvalidAccount, MeetingInstructionRejection1Code.mmInsufficientSecurityPosition,
						MeetingInstructionRejection1Code.mmInvalidInstructedQuantity, MeetingInstructionRejection1Code.mmInvalidDate, MeetingInstructionRejection1Code.mmSplitVoteNotAllowed,
						MeetingInstructionRejection1Code.mmPartialVoteNotAllowed, MeetingInstructionRejection1Code.mmMissingOrInvalidPOA, MeetingInstructionRejection1Code.mmProxyCardDiscrepancy,
						MeetingInstructionRejection1Code.mmRejectedByIssuer, MeetingInstructionRejection1Code.mmOther);
				trace_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}