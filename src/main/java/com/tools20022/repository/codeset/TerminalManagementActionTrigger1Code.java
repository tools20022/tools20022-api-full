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
import com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Event to start a terminal management action by the point of interaction
 * (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code#DateTime
 * TerminalManagementActionTrigger1Code.DateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code#HostEvent
 * TerminalManagementActionTrigger1Code.HostEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code#Manual
 * TerminalManagementActionTrigger1Code.Manual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code#SaleEvent
 * TerminalManagementActionTrigger1Code.SaleEvent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTriggerCode
 * TerminalManagementActionTriggerCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DATE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionTrigger1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Event to start a terminal management action by the point of interaction (POI)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionTrigger1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTrigger1Code DateTime = new TerminalManagementActionTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.mmObject();
			codeName = TerminalManagementActionTriggerCode.DateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostEvent"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTrigger1Code HostEvent = new TerminalManagementActionTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.mmObject();
			codeName = TerminalManagementActionTriggerCode.HostEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTrigger1Code Manual = new TerminalManagementActionTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.mmObject();
			codeName = TerminalManagementActionTriggerCode.Manual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleEvent"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionTrigger1Code SaleEvent = new TerminalManagementActionTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.mmObject();
			codeName = TerminalManagementActionTriggerCode.SaleEvent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionTrigger1Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionTrigger1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DATE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionTrigger1Code";
				definition = "Event to start a terminal management action by the point of interaction (POI).";
				trace_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.DateTime, com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.HostEvent,
						com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.Manual, com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code.SaleEvent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(HostEvent.getCodeName().get(), HostEvent);
		codesByName.put(Manual.getCodeName().get(), Manual);
		codesByName.put(SaleEvent.getCodeName().get(), SaleEvent);
	}

	public static TerminalManagementActionTrigger1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionTrigger1Code[] values() {
		TerminalManagementActionTrigger1Code[] values = new TerminalManagementActionTrigger1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionTrigger1Code> {
		@Override
		public TerminalManagementActionTrigger1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionTrigger1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}