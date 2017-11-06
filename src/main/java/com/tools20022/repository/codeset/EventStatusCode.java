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
 * Provides information about the current stage in the lifecycle of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmNotConfirmed
 * EventStatusCode.mmNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmConfirmed
 * EventStatusCode.mmConfirmed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#mmDelayed
 * EventStatusCode.mmDelayed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmCancelled
 * EventStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmCompleted
 * EventStatusCode.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmApprovedByBoard
 * EventStatusCode.mmApprovedByBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmApprovedByRegulator
 * EventStatusCode.mmApprovedByRegulator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmApprovedByBeneficialOwner
 * EventStatusCode.mmApprovedByBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#mmInDefault
 * EventStatusCode.mmInDefault}</li>
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
 * <li>"NCON"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the current stage in the lifecycle of an event."</li>
 * </ul>
 */
public class EventStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event information not confirmed by the issuer or other official source
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event information not confirmed by the issuer or other official source"</li>
	 * </ul>
	 */
	public static final MMCode mmNotConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "NotConfirmed";
			definition = "Event information not confirmed by the issuer or other official source";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Event information confirmed by issuer or other official source
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event information confirmed by issuer or other official source"</li>
	 * </ul>
	 */
	public static final MMCode mmConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Confirmed";
			definition = "Event information confirmed by issuer or other official source";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Corporate event has been delayed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delayed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event has been delayed."</li>
	 * </ul>
	 */
	public static final MMCode mmDelayed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Delayed";
			definition = "Corporate event has been delayed.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "DELA";
		}
	};
	/**
	 * Corporate event has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event has been cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Cancelled";
			definition = "Corporate event has been cancelled.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Processing for the corporate event has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing for the corporate event has been completed."</li>
	 * </ul>
	 */
	public static final MMCode mmCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Completed";
			definition = "Processing for the corporate event has been completed.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Event is approved by board.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by board."</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByBoard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByBoard";
			definition = "Event is approved by board.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "APBD";
		}
	};
	/**
	 * Event is approved by regulators, for example, anti trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by regulators, for example, anti trust."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByRegulator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByRegulator";
			definition = "Event is approved by regulators, for example, anti trust.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "APRE";
		}
	};
	/**
	 * Event is approved by beneficial owner or agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by beneficial owner or agent."</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByBeneficialOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByBeneficialOwner";
			definition = "Event is approved by beneficial owner or agent.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "APBO";
		}
	};
	/**
	 * The company has not met a mandatory obligation in the terms of a
	 * security, for example, interest payment of bonds or a
	 * redemption/mandatory call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The company has not met a mandatory obligation in the terms of a security, for example, interest payment of bonds or a redemption/mandatory call."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InDefault";
			definition = "The company has not met a mandatory obligation in the terms of a security, for example, interest payment of bonds or a redemption/mandatory call.";
			owner_lazy = () -> EventStatusCode.mmObject();
			codeName = "IDEF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("NCON");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "EventStatusCode";
				definition = "Provides information about the current stage in the lifecycle of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventStatusCode.mmNotConfirmed, com.tools20022.repository.codeset.EventStatusCode.mmConfirmed, com.tools20022.repository.codeset.EventStatusCode.mmDelayed,
						com.tools20022.repository.codeset.EventStatusCode.mmCancelled, com.tools20022.repository.codeset.EventStatusCode.mmCompleted, com.tools20022.repository.codeset.EventStatusCode.mmApprovedByBoard,
						com.tools20022.repository.codeset.EventStatusCode.mmApprovedByRegulator, com.tools20022.repository.codeset.EventStatusCode.mmApprovedByBeneficialOwner, com.tools20022.repository.codeset.EventStatusCode.mmInDefault);
			}
		});
		return mmObject_lazy.get();
	}
}