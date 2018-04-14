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
import com.tools20022.repository.codeset.EventStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides information about the current stage in the lifecycle of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#NotConfirmed
 * EventStatusCode.NotConfirmed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#Confirmed
 * EventStatusCode.Confirmed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#Delayed
 * EventStatusCode.Delayed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#Cancelled
 * EventStatusCode.Cancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#Completed
 * EventStatusCode.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#ApprovedByBoard
 * EventStatusCode.ApprovedByBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#ApprovedByRegulator
 * EventStatusCode.ApprovedByRegulator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventStatusCode#ApprovedByBeneficialOwner
 * EventStatusCode.ApprovedByBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventStatusCode#InDefault
 * EventStatusCode.InDefault}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the current stage in the lifecycle of an event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NCON"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event information not confirmed by the issuer or other official source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCON"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event information not confirmed by the issuer or other official source."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode NotConfirmed = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "NotConfirmed";
			definition = "Event information not confirmed by the issuer or other official source.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Event information confirmed by issuer or other official source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventStatusCode
	 * EventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event information confirmed by issuer or other official source."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode Confirmed = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Confirmed";
			definition = "Event information confirmed by issuer or other official source.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delayed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event has been delayed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode Delayed = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Delayed";
			definition = "Corporate event has been delayed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event has been cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode Cancelled = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Cancelled";
			definition = "Corporate event has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing for the corporate event has been completed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode Completed = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Completed";
			definition = "Processing for the corporate event has been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by board."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode ApprovedByBoard = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByBoard";
			definition = "Event is approved by board.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by regulators, for example, anti trust."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode ApprovedByRegulator = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByRegulator";
			definition = "Event is approved by regulators, for example, anti trust.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by beneficial owner or agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode ApprovedByBeneficialOwner = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ApprovedByBeneficialOwner";
			definition = "Event is approved by beneficial owner or agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The company has not met a mandatory obligation in the terms of a security, for example, interest payment of bonds or a redemption/mandatory call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final EventStatusCode InDefault = new EventStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InDefault";
			definition = "The company has not met a mandatory obligation in the terms of a security, for example, interest payment of bonds or a redemption/mandatory call.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventStatusCode.mmObject();
			codeName = "IDEF";
		}
	};
	final static private LinkedHashMap<String, EventStatusCode> codesByName = new LinkedHashMap<>();

	protected EventStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NCON");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "EventStatusCode";
				definition = "Provides information about the current stage in the lifecycle of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventStatusCode.NotConfirmed, com.tools20022.repository.codeset.EventStatusCode.Confirmed, com.tools20022.repository.codeset.EventStatusCode.Delayed,
						com.tools20022.repository.codeset.EventStatusCode.Cancelled, com.tools20022.repository.codeset.EventStatusCode.Completed, com.tools20022.repository.codeset.EventStatusCode.ApprovedByBoard,
						com.tools20022.repository.codeset.EventStatusCode.ApprovedByRegulator, com.tools20022.repository.codeset.EventStatusCode.ApprovedByBeneficialOwner, com.tools20022.repository.codeset.EventStatusCode.InDefault);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotConfirmed.getCodeName().get(), NotConfirmed);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(Delayed.getCodeName().get(), Delayed);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(ApprovedByBoard.getCodeName().get(), ApprovedByBoard);
		codesByName.put(ApprovedByRegulator.getCodeName().get(), ApprovedByRegulator);
		codesByName.put(ApprovedByBeneficialOwner.getCodeName().get(), ApprovedByBeneficialOwner);
		codesByName.put(InDefault.getCodeName().get(), InDefault);
	}

	public static EventStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventStatusCode[] values() {
		EventStatusCode[] values = new EventStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventStatusCode> {
		@Override
		public EventStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}