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
import com.tools20022.repository.codeset.ReportingRecordStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the processing of an individual record within a
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#Accepted
 * ReportingRecordStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#AcceptedAfterPending
 * ReportingRecordStatus1Code.AcceptedAfterPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#Pending
 * ReportingRecordStatus1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#Received
 * ReportingRecordStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#Rejected
 * ReportingRecordStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#RejectedAfterPending
 * ReportingRecordStatus1Code.RejectedAfterPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code#Warning
 * ReportingRecordStatus1Code.Warning}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
 * RecordStatusCode}</li>
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
 * "ReportingRecordStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the processing of an individual record within a message."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportingRecordStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code Accepted = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAfterPending"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code AcceptedAfterPending = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAfterPending";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.AcceptedAfterPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code Pending = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code Received = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code Rejected = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAfterPending"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code RejectedAfterPending = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAfterPending";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.RejectedAfterPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * </ul>
	 */
	public static final ReportingRecordStatus1Code Warning = new ReportingRecordStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingRecordStatus1Code.mmObject();
			codeName = RecordStatusCode.Warning.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportingRecordStatus1Code> codesByName = new LinkedHashMap<>();

	protected ReportingRecordStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingRecordStatus1Code";
				definition = "Specifies the status of the processing of an individual record within a message.";
				trace_lazy = () -> RecordStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingRecordStatus1Code.Accepted, com.tools20022.repository.codeset.ReportingRecordStatus1Code.AcceptedAfterPending,
						com.tools20022.repository.codeset.ReportingRecordStatus1Code.Pending, com.tools20022.repository.codeset.ReportingRecordStatus1Code.Received, com.tools20022.repository.codeset.ReportingRecordStatus1Code.Rejected,
						com.tools20022.repository.codeset.ReportingRecordStatus1Code.RejectedAfterPending, com.tools20022.repository.codeset.ReportingRecordStatus1Code.Warning);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AcceptedAfterPending.getCodeName().get(), AcceptedAfterPending);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(RejectedAfterPending.getCodeName().get(), RejectedAfterPending);
		codesByName.put(Warning.getCodeName().get(), Warning);
	}

	public static ReportingRecordStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportingRecordStatus1Code[] values() {
		ReportingRecordStatus1Code[] values = new ReportingRecordStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportingRecordStatus1Code> {
		@Override
		public ReportingRecordStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportingRecordStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}