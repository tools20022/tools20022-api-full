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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the possible rejection reasons.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmInvalidMeetingReference
 * MeetingInstructionRejectionCode.mmInvalidMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmInvalidAccount
 * MeetingInstructionRejectionCode.mmInvalidAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmInsufficientSecurityPosition
 * MeetingInstructionRejectionCode.mmInsufficientSecurityPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmInvalidInstructedQuantity
 * MeetingInstructionRejectionCode.mmInvalidInstructedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmInvalidDate
 * MeetingInstructionRejectionCode.mmInvalidDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmSplitVoteNotAllowed
 * MeetingInstructionRejectionCode.mmSplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmPartialVoteNotAllowed
 * MeetingInstructionRejectionCode.mmPartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmMissingOrInvalidPOA
 * MeetingInstructionRejectionCode.mmMissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmProxyCardDiscrepancy
 * MeetingInstructionRejectionCode.mmProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmReRegistrationDiscrepancy
 * MeetingInstructionRejectionCode.mmReRegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmRejectedByIssuer
 * MeetingInstructionRejectionCode.mmRejectedByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#mmOther
 * MeetingInstructionRejectionCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
 * MeetingInstructionRejection1Code}</li>
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
 * "MeetingInstructionRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible rejection reasons."</li>
 * </ul>
 */
public class MeetingInstructionRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction contains an invalid meeting reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction contains an invalid meeting reference."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMeetingReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMeetingReference";
			definition = "Instruction contains an invalid meeting reference.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "INMR";
		}
	};
	/**
	 * Instruction contains an invalid account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction contains an invalid account identification."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccount";
			definition = "Instruction contains an invalid account identification.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * Position is less than required threshold to be allowed to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientSecurityPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position is less than required threshold to be allowed to vote."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientSecurityPosition = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientSecurityPosition";
			definition = "Position is less than required threshold to be allowed to vote.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Instruction contains an invalid instructed quantity (eg the instructed
	 * quantity is greater than the entitlement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInstructedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidInstructedQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInstructedQuantity";
			definition = "Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement).";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "INQY";
		}
	};
	/**
	 * Instruction received after the specified deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction received after the specified deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDate";
			definition = "Instruction received after the specified deadline.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "INDT";
		}
	};
	/**
	 * Split voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Split voting is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmSplitVoteNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Partial voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial voting is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmPartialVoteNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Missing or invalid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing or invalid power of attorney."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingOrInvalidPOA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "IPOA";
		}
	};
	/**
	 * Invalid proxy information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRXY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid proxy information."</li>
	 * </ul>
	 */
	public static final MMCode mmProxyCardDiscrepancy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "PRXY";
		}
	};
	/**
	 * Invalid re-registration information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReRegistrationDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid re-registration information."</li>
	 * </ul>
	 */
	public static final MMCode mmReRegistrationDiscrepancy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReRegistrationDiscrepancy";
			definition = "Invalid re-registration information.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "IREG";
		}
	};
	/**
	 * Issuer has rejected the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer has rejected the instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedByIssuer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuer";
			definition = "Issuer has rejected the instruction.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "RBIS";
		}
	};
	/**
	 * Other errors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode
	 * MeetingInstructionRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other errors."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other errors.";
			owner_lazy = () -> MeetingInstructionRejectionCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INMR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionRejectionCode";
				definition = "Identifies the possible rejection reasons.";
				code_lazy = () -> Arrays.asList(MeetingInstructionRejectionCode.mmInvalidMeetingReference, MeetingInstructionRejectionCode.mmInvalidAccount, MeetingInstructionRejectionCode.mmInsufficientSecurityPosition,
						MeetingInstructionRejectionCode.mmInvalidInstructedQuantity, MeetingInstructionRejectionCode.mmInvalidDate, MeetingInstructionRejectionCode.mmSplitVoteNotAllowed,
						MeetingInstructionRejectionCode.mmPartialVoteNotAllowed, MeetingInstructionRejectionCode.mmMissingOrInvalidPOA, MeetingInstructionRejectionCode.mmProxyCardDiscrepancy,
						MeetingInstructionRejectionCode.mmReRegistrationDiscrepancy, MeetingInstructionRejectionCode.mmRejectedByIssuer, MeetingInstructionRejectionCode.mmOther);
				derivation_lazy = () -> Arrays.asList(MeetingInstructionRejection1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}