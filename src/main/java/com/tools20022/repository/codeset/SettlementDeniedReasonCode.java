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
import com.tools20022.repository.codeset.SettlementDeniedReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the denied reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#AccountServicerDeadlineMissed
 * SettlementDeniedReasonCode.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#CallDeniedSinceAlreadyApplied
 * SettlementDeniedReasonCode.CallDeniedSinceAlreadyApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#DeniedSinceCancelled
 * SettlementDeniedReasonCode.DeniedSinceCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#DeniedSinceNotAllowed
 * SettlementDeniedReasonCode.DeniedSinceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#DeniedSinceInProgress
 * SettlementDeniedReasonCode.DeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#DeniedSinceRepoEnded
 * SettlementDeniedReasonCode.DeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#DeniedSinceSettled
 * SettlementDeniedReasonCode.DeniedSinceSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#InstructionProcessed
 * SettlementDeniedReasonCode.InstructionProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#MarketDeadlineMissed
 * SettlementDeniedReasonCode.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#Other
 * SettlementDeniedReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#ConditionalCurrency
 * SettlementDeniedReasonCode.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#ConditionalRealignement
 * SettlementDeniedReasonCode.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode#ConditionalRegistrar
 * SettlementDeniedReasonCode.ConditionalRegistrar}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason7Code
 * DeniedReason7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason6Code
 * DeniedReason6Code}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDeniedReasonCode extends MMCode {

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
	public static final SettlementDeniedReasonCode AccountServicerDeadlineMissed = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode CallDeniedSinceAlreadyApplied = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			definition = "Repo call request was denied since another call already applies.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode DeniedSinceCancelled = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceCancelled";
			definition = "Request was denied since the instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode DeniedSinceNotAllowed = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			definition = "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode DeniedSinceInProgress = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			definition = "Request was denied because the process of settlement is in progress.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode DeniedSinceRepoEnded = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			definition = "Request was denied because the repo was cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode DeniedSinceSettled = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceSettled";
			definition = "Request was denied because the instruction was settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode InstructionProcessed = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode MarketDeadlineMissed = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode Other = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode ConditionalCurrency = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is denied due to a process linked to the currency of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode ConditionalRealignement = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is denied due to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
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
	public static final SettlementDeniedReasonCode ConditionalRegistrar = new SettlementDeniedReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is denied due to the execution of a process at the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDeniedReasonCode.mmObject();
			codeName = "CDRG";
		}
	};
	final static private LinkedHashMap<String, SettlementDeniedReasonCode> codesByName = new LinkedHashMap<>();

	protected SettlementDeniedReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDeniedReasonCode";
				definition = "Specifies the denied reason.";
				derivation_lazy = () -> Arrays.asList(DeniedReason7Code.mmObject(), DeniedReason6Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDeniedReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.SettlementDeniedReasonCode.CallDeniedSinceAlreadyApplied,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.DeniedSinceCancelled, com.tools20022.repository.codeset.SettlementDeniedReasonCode.DeniedSinceNotAllowed,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.DeniedSinceInProgress, com.tools20022.repository.codeset.SettlementDeniedReasonCode.DeniedSinceRepoEnded,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.DeniedSinceSettled, com.tools20022.repository.codeset.SettlementDeniedReasonCode.InstructionProcessed,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.SettlementDeniedReasonCode.Other,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.ConditionalCurrency, com.tools20022.repository.codeset.SettlementDeniedReasonCode.ConditionalRealignement,
						com.tools20022.repository.codeset.SettlementDeniedReasonCode.ConditionalRegistrar);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CallDeniedSinceAlreadyApplied.getCodeName().get(), CallDeniedSinceAlreadyApplied);
		codesByName.put(DeniedSinceCancelled.getCodeName().get(), DeniedSinceCancelled);
		codesByName.put(DeniedSinceNotAllowed.getCodeName().get(), DeniedSinceNotAllowed);
		codesByName.put(DeniedSinceInProgress.getCodeName().get(), DeniedSinceInProgress);
		codesByName.put(DeniedSinceRepoEnded.getCodeName().get(), DeniedSinceRepoEnded);
		codesByName.put(DeniedSinceSettled.getCodeName().get(), DeniedSinceSettled);
		codesByName.put(InstructionProcessed.getCodeName().get(), InstructionProcessed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
	}

	public static SettlementDeniedReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDeniedReasonCode[] values() {
		SettlementDeniedReasonCode[] values = new SettlementDeniedReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDeniedReasonCode> {
		@Override
		public SettlementDeniedReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDeniedReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}