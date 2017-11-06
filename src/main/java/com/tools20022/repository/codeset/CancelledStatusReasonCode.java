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
 * Specifies the underlying reason for the cancellation of the associated
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByYourself
 * CancelledStatusReasonCode.mmCancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledBySystem
 * CancelledStatusReasonCode.mmCancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByAgent
 * CancelledStatusReasonCode.mmCancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmOther
 * CancelledStatusReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByHub
 * CancelledStatusReasonCode.mmCancelledByHub}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByInstructingParty
 * CancelledStatusReasonCode.mmCancelledByInstructingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmEndOfLife
 * CancelledStatusReasonCode.mmEndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByOther
 * CancelledStatusReasonCode.mmCancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByTransferAgent
 * CancelledStatusReasonCode.mmCancelledByTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByClient
 * CancelledStatusReasonCode.mmCancelledByClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode#mmCancelledByIntermediary
 * CancelledStatusReasonCode.mmCancelledByIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason1Code
 * CancelledStatusReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
 * CancelledStatusReason2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationCompleteStatusReason1Code
 * CancellationCompleteStatusReason1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code
 * CancelledStatusReason3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CancelledStatusReason8Code
 * CancelledStatusReason8Code}</li>
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
 * <li>"CANI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelledStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * </ul>
 */
public class CancelledStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is cancelled by yourself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by yourself."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByYourself = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByYourself";
			definition = "Transaction is cancelled by yourself.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CANI";
		}
	};
	/**
	 * Transaction is cancelled by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the system."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledBySystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledBySystem";
			definition = "Transaction is cancelled by the system.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CANS";
		}
	};
	/**
	 * Transaction is cancelled by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSUB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the agent."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByAgent";
			definition = "Transaction is cancelled by the agent.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CSUB";
		}
	};
	/**
	 * Other (see additional information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other (see additional information)."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Other (see additional information).";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is cancelled by the hub.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByHub"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the hub."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByHub = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByHub";
			definition = "Transaction is cancelled by the hub.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CANH";
		}
	};
	/**
	 * Transaction is cancelled by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByInstructingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the instructing party."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByInstructingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByInstructingParty";
			definition = "Transaction is cancelled by the instructing party.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transaction is rejected by the executing party, the rejection is final
	 * therefore the order is cancelled in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CXLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEndOfLife = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			definition = "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CXLR";
		}
	};
	/**
	 * Transaction is cancelled by a party other than the instructing party, eg,
	 * a market infrastructure such as a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByOther";
			definition = "Transaction is cancelled by a party other than the instructing party, eg, a market infrastructure such as a stock exchange.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Transaction is cancelled by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByTransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the transfer agent."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByTransferAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByTransferAgent";
			definition = "Transaction is cancelled by the transfer agent.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CNTA";
		}
	};
	/**
	 * Transaction is cancelled by the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByClient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the client."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByClient = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByClient";
			definition = "Transaction is cancelled by the client.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Transaction is cancelled by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
	 * CancelledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the intermediary."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelledByIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIntermediary";
			definition = "Transaction is cancelled by the intermediary.";
			owner_lazy = () -> CancelledStatusReasonCode.mmObject();
			codeName = "CNIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CANI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReasonCode";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReasonCode.mmOther,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByHub, com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByInstructingParty,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.mmEndOfLife, com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByOther,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByTransferAgent, com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByClient,
						com.tools20022.repository.codeset.CancelledStatusReasonCode.mmCancelledByIntermediary);
				derivation_lazy = () -> Arrays.asList(CancelledStatusReason1Code.mmObject(), CancelledStatusReason2Code.mmObject(), CancellationCompleteStatusReason1Code.mmObject(), CancelledStatusReason3Code.mmObject(),
						CancelledStatusReason8Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}