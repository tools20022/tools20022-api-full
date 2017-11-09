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
 * Specifies the denied reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason7Code
 * DeniedReason7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason6Code
 * DeniedReason6Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmAccountServicerDeadlineMissed
 * SettlementDeniedReasonCode.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmCallDeniedSinceAlreadyApplied
 * SettlementDeniedReasonCode.mmCallDeniedSinceAlreadyApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmDeniedSinceCancelled
 * SettlementDeniedReasonCode.mmDeniedSinceCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmDeniedSinceNotAllowed
 * SettlementDeniedReasonCode.mmDeniedSinceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmDeniedSinceInProgress
 * SettlementDeniedReasonCode.mmDeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmDeniedSinceRepoEnded
 * SettlementDeniedReasonCode.mmDeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmDeniedSinceSettled
 * SettlementDeniedReasonCode.mmDeniedSinceSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmInstructionProcessed
 * SettlementDeniedReasonCode.mmInstructionProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmMarketDeadlineMissed
 * SettlementDeniedReasonCode.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmOther
 * SettlementDeniedReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmConditionalCurrency
 * SettlementDeniedReasonCode.mmConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmConditionalRealignement
 * SettlementDeniedReasonCode.mmConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#mmConditionalRegistrar
 * SettlementDeniedReasonCode.mmConditionalRegistrar}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDeniedReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the denied reason."</li>
 * </ul>
 */
public class SettlementDeniedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after the account servicer's deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Repo call request was denied since another call already applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallDeniedSinceAlreadyApplied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repo call request was denied since another call already applies."</li>
	 * </ul>
	 */
	public static final MMCode mmCallDeniedSinceAlreadyApplied = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			definition = "Repo call request was denied since another call already applies.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DCAL";
		}
	};
	/**
	 * Request was denied since the instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request was denied since the instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmDeniedSinceCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceCancelled";
			definition = "Request was denied since the instruction has been cancelled.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Repo call request was denied. Call not allowed on the concerned repo, for
	 * example, out of delay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeniedSinceNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			definition = "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Request was denied because the process of settlement is in progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request was denied because the process of settlement is in progress."</li>
	 * </ul>
	 */
	public static final MMCode mmDeniedSinceInProgress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			definition = "Request was denied because the process of settlement is in progress.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Request was denied because the repo was cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DREP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceRepoEnded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request was denied because the repo was cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmDeniedSinceRepoEnded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			definition = "Request was denied because the repo was cancelled.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DREP";
		}
	};
	/**
	 * Request was denied because the instruction was settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceSettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request was denied because the instruction was settled."</li>
	 * </ul>
	 */
	public static final MMCode mmDeniedSinceSettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceSettled";
			definition = "Request was denied because the instruction was settled.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Instruction has been processed and cannot be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been processed and cannot be cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmInstructionProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "IPNC";
		}
	};
	/**
	 * Received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after market deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmMarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
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
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Execution is denied due to a process linked to the currency of the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to a process linked to the currency of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditionalCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is denied due to a process linked to the currency of the transaction.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is denied due to the execution of a process of realignment at
	 * the issuer CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to the execution of a process of realignment at the issuer CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditionalRealignement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is denied due to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * Execution is denied due to the execution of a process at the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
	 * SettlementDeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is denied due to the execution of a process at the registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditionalRegistrar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is denied due to the execution of a process at the registrar.";
			owner_lazy = () -> SettlementDeniedReasonCode.mmObject();
			codeName = "CDRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDeniedReasonCode";
				definition = "Specifies the denied reason.";
				code_lazy = () -> Arrays.asList(SettlementDeniedReasonCode.mmAccountServicerDeadlineMissed, SettlementDeniedReasonCode.mmCallDeniedSinceAlreadyApplied, SettlementDeniedReasonCode.mmDeniedSinceCancelled,
						SettlementDeniedReasonCode.mmDeniedSinceNotAllowed, SettlementDeniedReasonCode.mmDeniedSinceInProgress, SettlementDeniedReasonCode.mmDeniedSinceRepoEnded, SettlementDeniedReasonCode.mmDeniedSinceSettled,
						SettlementDeniedReasonCode.mmInstructionProcessed, SettlementDeniedReasonCode.mmMarketDeadlineMissed, SettlementDeniedReasonCode.mmOther, SettlementDeniedReasonCode.mmConditionalCurrency,
						SettlementDeniedReasonCode.mmConditionalRealignement, SettlementDeniedReasonCode.mmConditionalRegistrar);
				derivation_lazy = () -> Arrays.asList(DeniedReason7Code.mmObject(), DeniedReason6Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}