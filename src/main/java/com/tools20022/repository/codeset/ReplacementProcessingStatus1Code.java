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
import com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status of the replacement request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#Denied
 * ReplacementProcessingStatus1Code.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#ReceivedAtStockExchange
 * ReplacementProcessingStatus1Code.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#ReceivedAtIntermediary
 * ReplacementProcessingStatus1Code.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#Accepted
 * ReplacementProcessingStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#PartialReplacementAccepted
 * ReplacementProcessingStatus1Code.PartialReplacementAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#Pending
 * ReplacementProcessingStatus1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#Rejected
 * ReplacementProcessingStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#Completed
 * ReplacementProcessingStatus1Code.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code#InRepair
 * ReplacementProcessingStatus1Code.InRepair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
 * ReplacementProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReplacementProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing status of the replacement request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReplacementProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code Denied = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.Denied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code ReceivedAtStockExchange = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.ReceivedAtStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code ReceivedAtIntermediary = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.ReceivedAtIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code Accepted = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReplacementAccepted"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code PartialReplacementAccepted = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReplacementAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.PartialReplacementAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code Pending = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code Rejected = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code Completed = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.Completed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatus1Code
	 * ReplacementProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * </ul>
	 */
	public static final ReplacementProcessingStatus1Code InRepair = new ReplacementProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.mmObject();
			codeName = ReplacementProcessingStatusCode.InRepair.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReplacementProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected ReplacementProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReplacementProcessingStatus1Code";
				definition = "Specifies the processing status of the replacement request.";
				trace_lazy = () -> ReplacementProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.Denied, com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.ReceivedAtIntermediary, com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.Accepted,
						com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.PartialReplacementAccepted, com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.Pending,
						com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.Rejected, com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.Completed,
						com.tools20022.repository.codeset.ReplacementProcessingStatus1Code.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(ReceivedAtStockExchange.getCodeName().get(), ReceivedAtStockExchange);
		codesByName.put(ReceivedAtIntermediary.getCodeName().get(), ReceivedAtIntermediary);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(PartialReplacementAccepted.getCodeName().get(), PartialReplacementAccepted);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static ReplacementProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReplacementProcessingStatus1Code[] values() {
		ReplacementProcessingStatus1Code[] values = new ReplacementProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReplacementProcessingStatus1Code> {
		@Override
		public ReplacementProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReplacementProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}