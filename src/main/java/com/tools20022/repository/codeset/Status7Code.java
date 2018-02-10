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
import com.tools20022.repository.codeset.Status7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an instruction/vote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Status7Code#CancelledBySubcustodian
 * Status7Code.CancelledBySubcustodian}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Status7Code#Accepted
 * Status7Code.Accepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Status7Code#Cancelled
 * Status7Code.Cancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Status7Code#Completed
 * Status7Code.Completed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Status7Code#NotReceived
 * Status7Code.NotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Status7Code#ReceivedByIssuerOrRegistrar
 * Status7Code.ReceivedByIssuerOrRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Status7Code#StandingInstruction
 * Status7Code.StandingInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatusCode StatusCode}</li>
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
 * "Status7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an instruction/vote."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Status7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySubcustodian"</li>
	 * </ul>
	 */
	public static final Status7Code CancelledBySubcustodian = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySubcustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.CancelledBySubcustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final Status7Code Accepted = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final Status7Code Cancelled = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * </ul>
	 */
	public static final Status7Code Completed = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.Completed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReceived"</li>
	 * </ul>
	 */
	public static final Status7Code NotReceived = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.NotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedByIssuerOrRegistrar"</li>
	 * </ul>
	 */
	public static final Status7Code ReceivedByIssuerOrRegistrar = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedByIssuerOrRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.ReceivedByIssuerOrRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Status7Code Status7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * </ul>
	 */
	public static final Status7Code StandingInstruction = new Status7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.Status7Code.mmObject();
			codeName = StatusCode.StandingInstruction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Status7Code> codesByName = new LinkedHashMap<>();

	protected Status7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status7Code";
				definition = "Specifies the status of an instruction/vote.";
				trace_lazy = () -> StatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Status7Code.CancelledBySubcustodian, com.tools20022.repository.codeset.Status7Code.Accepted, com.tools20022.repository.codeset.Status7Code.Cancelled,
						com.tools20022.repository.codeset.Status7Code.Completed, com.tools20022.repository.codeset.Status7Code.NotReceived, com.tools20022.repository.codeset.Status7Code.ReceivedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.Status7Code.StandingInstruction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledBySubcustodian.getCodeName().get(), CancelledBySubcustodian);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(NotReceived.getCodeName().get(), NotReceived);
		codesByName.put(ReceivedByIssuerOrRegistrar.getCodeName().get(), ReceivedByIssuerOrRegistrar);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
	}

	public static Status7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Status7Code[] values() {
		Status7Code[] values = new Status7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Status7Code> {
		@Override
		public Status7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Status7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}