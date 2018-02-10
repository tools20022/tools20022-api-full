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
import com.tools20022.repository.codeset.ATMStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Required status of the ATM, parameters of the status update command.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatusCode#InService
 * ATMStatusCode.InService}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatusCode#OutOfService
 * ATMStatusCode.OutOfService}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatusCode#InOperation
 * ATMStatusCode.InOperation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatusCode#Stopped
 * ATMStatusCode.Stopped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode#WaitingActivation
 * ATMStatusCode.WaitingActivation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatus1Code
 * ATMStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatus2Code
 * ATMStatus2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMStatus3Code
 * ATMStatus3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Required status of the ATM, parameters of the status update command."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Component is in service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode
	 * ATMStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component is in service."</li>
	 * </ul>
	 */
	public static final ATMStatusCode InService = new ATMStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InService";
			definition = "Component is in service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMStatusCode.mmObject();
			codeName = "INSV";
		}
	};
	/**
	 * ATM out of service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode
	 * ATMStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM out of service."</li>
	 * </ul>
	 */
	public static final ATMStatusCode OutOfService = new ATMStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfService";
			definition = "ATM out of service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMStatusCode.mmObject();
			codeName = "OUTS";
		}
	};
	/**
	 * Component is activated and in operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode
	 * ATMStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component is activated and in operation."</li>
	 * </ul>
	 */
	public static final ATMStatusCode InOperation = new ATMStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InOperation";
			definition = "Component is activated and in operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMStatusCode.mmObject();
			codeName = "OPER";
		}
	};
	/**
	 * Component has been stopped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode
	 * ATMStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stopped"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component has been stopped."</li>
	 * </ul>
	 */
	public static final ATMStatusCode Stopped = new ATMStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stopped";
			definition = "Component has been stopped.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMStatusCode.mmObject();
			codeName = "STOP";
		}
	};
	/**
	 * Component has been loaded, but not yet activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatusCode
	 * ATMStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component has been loaded, but not yet activated."</li>
	 * </ul>
	 */
	public static final ATMStatusCode WaitingActivation = new ATMStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingActivation";
			definition = "Component has been loaded, but not yet activated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMStatusCode.mmObject();
			codeName = "WACT";
		}
	};
	final static private LinkedHashMap<String, ATMStatusCode> codesByName = new LinkedHashMap<>();

	protected ATMStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMStatusCode";
				definition = "Required status of the ATM, parameters of the status update command.";
				derivation_lazy = () -> Arrays.asList(ATMStatus1Code.mmObject(), ATMStatus2Code.mmObject(), ATMStatus3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMStatusCode.InService, com.tools20022.repository.codeset.ATMStatusCode.OutOfService, com.tools20022.repository.codeset.ATMStatusCode.InOperation,
						com.tools20022.repository.codeset.ATMStatusCode.Stopped, com.tools20022.repository.codeset.ATMStatusCode.WaitingActivation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InService.getCodeName().get(), InService);
		codesByName.put(OutOfService.getCodeName().get(), OutOfService);
		codesByName.put(InOperation.getCodeName().get(), InOperation);
		codesByName.put(Stopped.getCodeName().get(), Stopped);
		codesByName.put(WaitingActivation.getCodeName().get(), WaitingActivation);
	}

	public static ATMStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMStatusCode[] values() {
		ATMStatusCode[] values = new ATMStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMStatusCode> {
		@Override
		public ATMStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}