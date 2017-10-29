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
 * Indicates the status of a baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#Proposed
 * BaselineStatusCode.Proposed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatusCode#Closed
 * BaselineStatusCode.Closed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#PartiallyMatched
 * BaselineStatusCode.PartiallyMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#Established
 * BaselineStatusCode.Established}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatusCode#Active
 * BaselineStatusCode.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#Complete
 * BaselineStatusCode.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#AmendmentRequested
 * BaselineStatusCode.AmendmentRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#ReActivateRequested
 * BaselineStatusCode.ReActivateRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#CloseRequested
 * BaselineStatusCode.CloseRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#CompleteRequested
 * BaselineStatusCode.CompleteRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#StatusExtensionRequested
 * BaselineStatusCode.StatusExtensionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode#DataSetAcceptanceRequested
 * BaselineStatusCode.DataSetAcceptanceRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
 * BaselineStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
 * BaselineStatus3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus2Code
 * BaselineStatus2Code}</li>
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
 * <li>"PROP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the status of a baseline."</li>
 * </ul>
 */
public class BaselineStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Initial state of a baseline in the push-through model.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial state of a baseline in the push-through model."</li>
	 * </ul>
	 */
	public static final MMCode Proposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proposed";
			definition = "Initial state of a baseline in the push-through model.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Final state of a baseline, in which only reporting is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final state of a baseline, in which only reporting is allowed."</li>
	 * </ul>
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			definition = "Final state of a baseline, in which only reporting is allowed.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * State of the baseline when an initial and at least one twin baselines
	 * have been submitted but it has not yet been agreed by all parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the baseline when an initial and at least one twin baselines have been  submitted but it has not yet been agreed by all parties."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartiallyMatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyMatched";
			definition = "State of the baseline when an initial and at least one twin baselines have been  submitted but it has not yet been agreed by all parties.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "PMTC";
		}
	};
	/**
	 * State of the baseline when it has been agreed by all parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Established"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the baseline when it has been agreed by all parties."</li>
	 * </ul>
	 */
	public static final MMCode Established = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Established";
			definition = "State of the baseline when it has been agreed by all parties.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "ESTD";
		}
	};
	/**
	 * State of a baseline, after establishment, when one or more instructions
	 * (eg, amendment request, data set submission) have been processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when one or more instructions (eg, amendment request, data set submission) have been processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			definition = "State of a baseline, after establishment, when one or more instructions (eg, amendment request, data set submission) have been processed.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * State of a baseline, after establishment, when all match instructions
	 * have been processed, and no such instruction is allowed anymore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when all match instructions have been processed, and no such instruction is allowed anymore."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "State of a baseline, after establishment, when all match instructions have been processed, and no such instruction is allowed anymore.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * State of a baseline, after establishment, when an amendment has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when an amendment has been requested by one party and has not yet been accepted or rejected by the counterparty(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AmendmentRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRequested";
			definition = "State of a baseline, after establishment, when an amendment has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "AMRQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when an reactivation has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RARQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReActivateRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when an reactivation has been requested by one party and has not yet been accepted or rejected by the counterparty(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReActivateRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReActivateRequested";
			definition = "State of a baseline, after establishment, when an reactivation has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "RARQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when a closure has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when a closure has been requested by one party and has not yet been accepted or rejected by the counterparty(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CloseRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseRequested";
			definition = "State of a baseline, after establishment, when a closure has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "CLRQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when a completion has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when a completion has been requested by one party and has not yet been accepted or rejected by the counterparty(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CompleteRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteRequested";
			definition = "State of a baseline, after establishment, when a completion has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "SCRQ";
		}
	};
	/**
	 * State of a baseline when a status extension has been requested by one
	 * party and has not yet been accepted or rejected by the counterparty(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SERQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusExtensionRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline when a status extension has been requested by one party and has not yet been accepted or rejected by the counterparty(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode StatusExtensionRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusExtensionRequested";
			definition = "State of a baseline when a status extension has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "SERQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when data set acceptance has
	 * been requested by the matching engine and not all responses have been
	 * received from the relevant party(ies).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
	 * BaselineStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DARQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetAcceptanceRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of a baseline, after establishment, when data set acceptance has been requested by the matching engine and not all responses have been received from the relevant party(ies)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DataSetAcceptanceRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAcceptanceRequested";
			definition = "State of a baseline, after establishment, when data set acceptance has been requested by the matching engine and not all responses have been received from the relevant party(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "DARQ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaselineStatusCode";
				definition = "Indicates the status of a baseline.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BaselineStatusCode.Proposed, com.tools20022.repository.codeset.BaselineStatusCode.Closed,
						com.tools20022.repository.codeset.BaselineStatusCode.PartiallyMatched, com.tools20022.repository.codeset.BaselineStatusCode.Established, com.tools20022.repository.codeset.BaselineStatusCode.Active,
						com.tools20022.repository.codeset.BaselineStatusCode.Complete, com.tools20022.repository.codeset.BaselineStatusCode.AmendmentRequested, com.tools20022.repository.codeset.BaselineStatusCode.ReActivateRequested,
						com.tools20022.repository.codeset.BaselineStatusCode.CloseRequested, com.tools20022.repository.codeset.BaselineStatusCode.CompleteRequested,
						com.tools20022.repository.codeset.BaselineStatusCode.StatusExtensionRequested, com.tools20022.repository.codeset.BaselineStatusCode.DataSetAcceptanceRequested);
				derivation_lazy = () -> Arrays.asList(BaselineStatus1Code.mmObject(), BaselineStatus3Code.mmObject(), BaselineStatus2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}