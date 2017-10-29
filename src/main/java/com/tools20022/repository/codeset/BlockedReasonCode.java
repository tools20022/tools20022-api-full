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
 * Specifies the reason an account is blocked.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Commitment
 * BlockedReasonCode.Commitment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Pledged
 * BlockedReasonCode.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Confiscation
 * BlockedReasonCode.Confiscation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Bankruptcy
 * BlockedReasonCode.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#MortisCausa
 * BlockedReasonCode.MortisCausa}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Transfer
 * BlockedReasonCode.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Reregistration
 * BlockedReasonCode.Reregistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Sanctions
 * BlockedReasonCode.Sanctions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#PendingComplianceVerification
 * BlockedReasonCode.PendingComplianceVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode#AccountClosingInProcess
 * BlockedReasonCode.AccountClosingInProcess}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReasonCode#Rejected
 * BlockedReasonCode.Rejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReason1Code
 * BlockedReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReason2Code
 * BlockedReason2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DisabledReason2Code
 * DisabledReason2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CMMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BlockedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason an account is blocked."</li>
 * </ul>
 */
public class BlockedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commitment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commitment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commitment."</li>
	 * </ul>
	 */
	public static final MMCode Commitment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			definition = "Commitment.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CMMT";
		}
	};
	/**
	 * Pledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledged."</li>
	 * </ul>
	 */
	public static final MMCode Pledged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Pledged.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "PLDG";
		}
	};
	/**
	 * Confiscation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confiscation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confiscation."</li>
	 * </ul>
	 */
	public static final MMCode Confiscation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			definition = "Confiscation.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CNFS";
		}
	};
	/**
	 * Bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bankruptcy."</li>
	 * </ul>
	 */
	public static final MMCode Bankruptcy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			definition = "Bankruptcy.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "BKRP";
		}
	};
	/**
	 * Reserved in contemplation of death.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortisCausa"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reserved in contemplation of death."</li>
	 * </ul>
	 */
	public static final MMCode MortisCausa = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			definition = "Reserved in contemplation of death.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer."</li>
	 * </ul>
	 */
	public static final MMCode Transfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Transfer.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Reregistration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reregistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reregistration."</li>
	 * </ul>
	 */
	public static final MMCode Reregistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			definition = "Reregistration.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Sanctions are in place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sanctions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sanctions are in place."</li>
	 * </ul>
	 */
	public static final MMCode Sanctions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sanctions";
			definition = "Sanctions are in place.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "SANC";
		}
	};
	/**
	 * Pending compliance verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingComplianceVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending compliance verification."</li>
	 * </ul>
	 */
	public static final MMCode PendingComplianceVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingComplianceVerification";
			definition = "Pending compliance verification.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "PCOM";
		}
	};
	/**
	 * Account closing is in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosingInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account closing is in process."</li>
	 * </ul>
	 */
	public static final MMCode AccountClosingInProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosingInProcess";
			definition = "Account closing is in process.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Account was pending opening but is now rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account was pending opening but is now rejected."</li>
	 * </ul>
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Account was pending opening but is now rejected.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "REJT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CMMT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BlockedReasonCode";
				definition = "Specifies the reason an account is blocked.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockedReasonCode.Commitment, com.tools20022.repository.codeset.BlockedReasonCode.Pledged, com.tools20022.repository.codeset.BlockedReasonCode.Confiscation,
						com.tools20022.repository.codeset.BlockedReasonCode.Bankruptcy, com.tools20022.repository.codeset.BlockedReasonCode.MortisCausa, com.tools20022.repository.codeset.BlockedReasonCode.Transfer,
						com.tools20022.repository.codeset.BlockedReasonCode.Reregistration, com.tools20022.repository.codeset.BlockedReasonCode.Sanctions, com.tools20022.repository.codeset.BlockedReasonCode.PendingComplianceVerification,
						com.tools20022.repository.codeset.BlockedReasonCode.AccountClosingInProcess, com.tools20022.repository.codeset.BlockedReasonCode.Rejected);
				derivation_lazy = () -> Arrays.asList(BlockedReason1Code.mmObject(), BlockedReason2Code.mmObject(), DisabledReason2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}