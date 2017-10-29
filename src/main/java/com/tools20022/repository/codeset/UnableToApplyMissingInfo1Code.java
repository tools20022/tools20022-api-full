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
 * Used when the unable to apply is due to missing information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingRemittanceInformation
 * UnableToApplyMissingInfo1Code.MissingRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingSenderToReceiverInformation
 * UnableToApplyMissingInfo1Code.MissingSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingDebtor
 * UnableToApplyMissingInfo1Code.MissingDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingDebtorAccount
 * UnableToApplyMissingInfo1Code.MissingDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingFirstAgent
 * UnableToApplyMissingInfo1Code.MissingFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingAmount
 * UnableToApplyMissingInfo1Code.MissingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingNostroVostroAccount
 * UnableToApplyMissingInfo1Code.MissingNostroVostroAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingIntermediary
 * UnableToApplyMissingInfo1Code.MissingIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingReimbursementAgent1
 * UnableToApplyMissingInfo1Code.MissingReimbursementAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingReimbursementAgent2
 * UnableToApplyMissingInfo1Code.MissingReimbursementAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingReimbursementAgent
 * UnableToApplyMissingInfo1Code.MissingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingCreditor
 * UnableToApplyMissingInfo1Code.MissingCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingCreditorAccount
 * UnableToApplyMissingInfo1Code.MissingCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code#MissingInstruction
 * UnableToApplyMissingInfo1Code.MissingInstruction}</li>
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
 * <li>"MS01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyMissingInfo1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Used when the unable to apply is due to missing information."</li>
 * </ul>
 */
public class UnableToApplyMissingInfo1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * RemittanceInformation is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RemittanceInformation is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingRemittanceInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRemittanceInformation";
			definition = "RemittanceInformation is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS01";
		}
	};
	/**
	 * SenderToReceiverInformation is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingSenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SenderToReceiverInformation is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingSenderToReceiverInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingSenderToReceiverInformation";
			definition = "SenderToReceiverInformation is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS02";
		}
	};
	/**
	 * Debtor is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtor";
			definition = "Debtor is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS03";
		}
	};
	/**
	 * DebtorAccount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingDebtorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtorAccount";
			definition = "DebtorAccount is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS04";
		}
	};
	/**
	 * FirstAgent is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingFirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FirstAgent is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingFirstAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFirstAgent";
			definition = "FirstAgent is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS05";
		}
	};
	/**
	 * Amount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingAmount";
			definition = "Amount is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS06";
		}
	};
	/**
	 * Nostro_VostroAccount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingNostroVostroAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nostro_VostroAccount is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingNostroVostroAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingNostroVostroAccount";
			definition = "Nostro_VostroAccount is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS07";
		}
	};
	/**
	 * Intermediary is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingIntermediary";
			definition = "Intermediary is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS08";
		}
	};
	/**
	 * ReimbursementAgent (53) is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingReimbursementAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ReimbursementAgent (53) is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingReimbursementAgent1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingReimbursementAgent1";
			definition = "ReimbursementAgent (53) is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS09";
		}
	};
	/**
	 * ReimbursementAgent (54) is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingReimbursementAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ReimbursementAgent (54) is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingReimbursementAgent2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingReimbursementAgent2";
			definition = "ReimbursementAgent (54) is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS10";
		}
	};
	/**
	 * ReimbursementAgent (55) is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ReimbursementAgent (55) is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingReimbursementAgent";
			definition = "ReimbursementAgent (55) is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS11";
		}
	};
	/**
	 * Creditor is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditor";
			definition = "Creditor is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS12";
		}
	};
	/**
	 * CreditorAccount is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CreditorAccount is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingCreditorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAccount";
			definition = "CreditorAccount is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS13";
		}
	};
	/**
	 * Indicates the payment instruction (MT103) is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MS14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the payment instruction (MT103) is missing."</li>
	 * </ul>
	 */
	public static final MMCode MissingInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstruction";
			definition = "Indicates the payment instruction (MT103) is missing.";
			owner_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
			codeName = "MS14";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MS01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyMissingInfo1Code";
				definition = "Used when the unable to apply is due to missing information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingSenderToReceiverInformation, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingDebtor,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingDebtorAccount, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingFirstAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingAmount, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingNostroVostroAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingIntermediary, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingReimbursementAgent1,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingReimbursementAgent2, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingCreditor, com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code.MissingInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}