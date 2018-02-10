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
import com.tools20022.repository.codeset.CancellationProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#CancellationCompleted
 * CancellationProcessingStatus1Code.CancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#PendingCancellation
 * CancellationProcessingStatus1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#Denied
 * CancellationProcessingStatus1Code.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#ReceivedAtStockExchange
 * CancellationProcessingStatus1Code.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#ReceivedAtIntermediary
 * CancellationProcessingStatus1Code.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#Accepted
 * CancellationProcessingStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#PartiallyFilled
 * CancellationProcessingStatus1Code.PartiallyFilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#Rejected
 * CancellationProcessingStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code#InRepair
 * CancellationProcessingStatus1Code.InRepair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
 * CancellationProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code CancellationCompleted = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.CancellationCompleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code PendingCancellation = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code Denied = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.Denied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code ReceivedAtStockExchange = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.ReceivedAtStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code ReceivedAtIntermediary = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.ReceivedAtIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code Accepted = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyFilled"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code PartiallyFilled = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilled";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.PartiallyFilled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code Rejected = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatus1Code
	 * CancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * </ul>
	 */
	public static final CancellationProcessingStatus1Code InRepair = new CancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationProcessingStatus1Code.mmObject();
			codeName = CancellationProcessingStatusCode.InRepair.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancellationProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected CancellationProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationProcessingStatus1Code";
				definition = "Specifies the status of a cancellation request.";
				trace_lazy = () -> CancellationProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationProcessingStatus1Code.CancellationCompleted, com.tools20022.repository.codeset.CancellationProcessingStatus1Code.PendingCancellation,
						com.tools20022.repository.codeset.CancellationProcessingStatus1Code.Denied, com.tools20022.repository.codeset.CancellationProcessingStatus1Code.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.CancellationProcessingStatus1Code.ReceivedAtIntermediary, com.tools20022.repository.codeset.CancellationProcessingStatus1Code.Accepted,
						com.tools20022.repository.codeset.CancellationProcessingStatus1Code.PartiallyFilled, com.tools20022.repository.codeset.CancellationProcessingStatus1Code.Rejected,
						com.tools20022.repository.codeset.CancellationProcessingStatus1Code.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancellationCompleted.getCodeName().get(), CancellationCompleted);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(ReceivedAtStockExchange.getCodeName().get(), ReceivedAtStockExchange);
		codesByName.put(ReceivedAtIntermediary.getCodeName().get(), ReceivedAtIntermediary);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(PartiallyFilled.getCodeName().get(), PartiallyFilled);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static CancellationProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationProcessingStatus1Code[] values() {
		CancellationProcessingStatus1Code[] values = new CancellationProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationProcessingStatus1Code> {
		@Override
		public CancellationProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}