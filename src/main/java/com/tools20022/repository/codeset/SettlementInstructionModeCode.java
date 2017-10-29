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
 * Specifies the mode used for settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#Default
 * SettlementInstructionModeCode.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#StandingInstruction
 * SettlementInstructionModeCode.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#AllocationAccountOverriding
 * SettlementInstructionModeCode.AllocationAccountOverriding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#AllocationAccountStanding
 * SettlementInstructionModeCode.AllocationAccountStanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#CIVSingleAccount
 * SettlementInstructionModeCode.CIVSingleAccount}</li>
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
 * <li>"DFLT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionModeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the mode used for settlement."</li>
 * </ul>
 */
public class SettlementInstructionModeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement takes place according to the standard market rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standard market rules."</li>
	 * </ul>
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Default";
			definition = "Settlement takes place according to the standard market rules.";
			owner_lazy = () -> SettlementInstructionModeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Settlement takes place according to the standing instructions provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standing instructions provided."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StandingInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "StandingInstruction";
			definition = "Settlement takes place according to the standing instructions provided.";
			owner_lazy = () -> SettlementInstructionModeCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Settlement takes place according to the allocation account details
	 * provided, and is therefore overriding the standing allocation account
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccountOverriding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the allocation account details provided, and is therefore overriding the standing allocation account details."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AllocationAccountOverriding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "AllocationAccountOverriding";
			definition = "Settlement takes place according to the allocation account details provided, and is therefore overriding the standing allocation account details.";
			owner_lazy = () -> SettlementInstructionModeCode.mmObject();
			codeName = "ALOO";
		}
	};
	/**
	 * Settlement takes place according to the standing allocation account
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccountStanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standing allocation account details."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AllocationAccountStanding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "AllocationAccountStanding";
			definition = "Settlement takes place according to the standing allocation account details.";
			owner_lazy = () -> SettlementInstructionModeCode.mmObject();
			codeName = "ALOS";
		}
	};
	/**
	 * Settlement takes place using the single account of the collective
	 * investment vehicle (CIV).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CIVSingleAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place using the single account of the collective investment vehicle (CIV)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CIVSingleAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CIVSingleAccount";
			definition = "Settlement takes place using the single account of the collective investment vehicle (CIV).";
			owner_lazy = () -> SettlementInstructionModeCode.mmObject();
			codeName = "CIVS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DFLT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "SettlementInstructionModeCode";
				definition = "Specifies the mode used for settlement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionModeCode.Default, com.tools20022.repository.codeset.SettlementInstructionModeCode.StandingInstruction,
						com.tools20022.repository.codeset.SettlementInstructionModeCode.AllocationAccountOverriding, com.tools20022.repository.codeset.SettlementInstructionModeCode.AllocationAccountStanding,
						com.tools20022.repository.codeset.SettlementInstructionModeCode.CIVSingleAccount);
			}
		});
		return mmObject_lazy.get();
	}
}