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
import com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the possible rejection reasons.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#InvalidMeetingReference
 * MeetingInstructionRejectionCode.InvalidMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#InvalidAccount
 * MeetingInstructionRejectionCode.InvalidAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#InsufficientSecurityPosition
 * MeetingInstructionRejectionCode.InsufficientSecurityPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#InvalidInstructedQuantity
 * MeetingInstructionRejectionCode.InvalidInstructedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#InvalidDate
 * MeetingInstructionRejectionCode.InvalidDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#SplitVoteNotAllowed
 * MeetingInstructionRejectionCode.SplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#PartialVoteNotAllowed
 * MeetingInstructionRejectionCode.PartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#MissingOrInvalidPOA
 * MeetingInstructionRejectionCode.MissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#ProxyCardDiscrepancy
 * MeetingInstructionRejectionCode.ProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#ReRegistrationDiscrepancy
 * MeetingInstructionRejectionCode.ReRegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#RejectedByIssuer
 * MeetingInstructionRejectionCode.RejectedByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejectionCode#Other
 * MeetingInstructionRejectionCode.Other}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible rejection reasons."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingInstructionRejectionCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction contains an invalid meeting reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode InvalidMeetingReference = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMeetingReference";
			definition = "Instruction contains an invalid meeting reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction contains an invalid account identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode InvalidAccount = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccount";
			definition = "Instruction contains an invalid account identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientSecurityPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position is less than required threshold to be allowed to vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode InsufficientSecurityPosition = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientSecurityPosition";
			definition = "Position is less than required threshold to be allowed to vote.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInstructedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode InvalidInstructedQuantity = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInstructedQuantity";
			definition = "Instruction contains an invalid instructed quantity (eg the instructed quantity is greater than the entitlement).";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction received after the specified deadline."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode InvalidDate = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDate";
			definition = "Instruction received after the specified deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Split voting is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode SplitVoteNotAllowed = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial voting is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode PartialVoteNotAllowed = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing or invalid power of attorney."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode MissingOrInvalidPOA = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid proxy information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode ProxyCardDiscrepancy = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReRegistrationDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid re-registration information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode ReRegistrationDiscrepancy = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReRegistrationDiscrepancy";
			definition = "Invalid re-registration information.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer has rejected the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode RejectedByIssuer = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuer";
			definition = "Issuer has rejected the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other errors."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MeetingInstructionRejectionCode Other = new MeetingInstructionRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other errors.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingInstructionRejectionCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, MeetingInstructionRejectionCode> codesByName = new LinkedHashMap<>();

	protected MeetingInstructionRejectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INMR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionRejectionCode";
				definition = "Identifies the possible rejection reasons.";
				derivation_lazy = () -> Arrays.asList(MeetingInstructionRejection1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InvalidMeetingReference, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InvalidAccount,
						com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InsufficientSecurityPosition, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InvalidInstructedQuantity,
						com.tools20022.repository.codeset.MeetingInstructionRejectionCode.InvalidDate, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.SplitVoteNotAllowed,
						com.tools20022.repository.codeset.MeetingInstructionRejectionCode.PartialVoteNotAllowed, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.MissingOrInvalidPOA,
						com.tools20022.repository.codeset.MeetingInstructionRejectionCode.ProxyCardDiscrepancy, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.ReRegistrationDiscrepancy,
						com.tools20022.repository.codeset.MeetingInstructionRejectionCode.RejectedByIssuer, com.tools20022.repository.codeset.MeetingInstructionRejectionCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvalidMeetingReference.getCodeName().get(), InvalidMeetingReference);
		codesByName.put(InvalidAccount.getCodeName().get(), InvalidAccount);
		codesByName.put(InsufficientSecurityPosition.getCodeName().get(), InsufficientSecurityPosition);
		codesByName.put(InvalidInstructedQuantity.getCodeName().get(), InvalidInstructedQuantity);
		codesByName.put(InvalidDate.getCodeName().get(), InvalidDate);
		codesByName.put(SplitVoteNotAllowed.getCodeName().get(), SplitVoteNotAllowed);
		codesByName.put(PartialVoteNotAllowed.getCodeName().get(), PartialVoteNotAllowed);
		codesByName.put(MissingOrInvalidPOA.getCodeName().get(), MissingOrInvalidPOA);
		codesByName.put(ProxyCardDiscrepancy.getCodeName().get(), ProxyCardDiscrepancy);
		codesByName.put(ReRegistrationDiscrepancy.getCodeName().get(), ReRegistrationDiscrepancy);
		codesByName.put(RejectedByIssuer.getCodeName().get(), RejectedByIssuer);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static MeetingInstructionRejectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingInstructionRejectionCode[] values() {
		MeetingInstructionRejectionCode[] values = new MeetingInstructionRejectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingInstructionRejectionCode> {
		@Override
		public MeetingInstructionRejectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingInstructionRejectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}