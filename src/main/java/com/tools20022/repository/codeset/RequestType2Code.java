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
import com.tools20022.repository.codeset.RequestType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the request used to further detail the type of information that
 * will be queried.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestType2Code#BankPositionEnquiry
 * RequestType2Code.BankPositionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestType2Code#SpecificTransactionEnquiry
 * RequestType2Code.SpecificTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestType2Code#QueuedTransactionEnquiry
 * RequestType2Code.QueuedTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestType2Code#SuspiciousTransactionEnquiry
 * RequestType2Code.SuspiciousTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestType2Code#PendingInwardCreditsEnquiry
 * RequestType2Code.PendingInwardCreditsEnquiry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
 * RequestTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RT11"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the request used to further detail the type of information that will be queried."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RequestType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPositionEnquiry"</li>
	 * </ul>
	 */
	public static final RequestType2Code BankPositionEnquiry = new RequestType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankPositionEnquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestType2Code.mmObject();
			codeName = RequestTypeCode.BankPositionEnquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificTransactionEnquiry"</li>
	 * </ul>
	 */
	public static final RequestType2Code SpecificTransactionEnquiry = new RequestType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificTransactionEnquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestType2Code.mmObject();
			codeName = RequestTypeCode.SpecificTransactionEnquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueuedTransactionEnquiry"</li>
	 * </ul>
	 */
	public static final RequestType2Code QueuedTransactionEnquiry = new RequestType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueuedTransactionEnquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestType2Code.mmObject();
			codeName = RequestTypeCode.QueuedTransactionEnquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousTransactionEnquiry"</li>
	 * </ul>
	 */
	public static final RequestType2Code SuspiciousTransactionEnquiry = new RequestType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousTransactionEnquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestType2Code.mmObject();
			codeName = RequestTypeCode.SuspiciousTransactionEnquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingInwardCreditsEnquiry"</li>
	 * </ul>
	 */
	public static final RequestType2Code PendingInwardCreditsEnquiry = new RequestType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingInwardCreditsEnquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestType2Code.mmObject();
			codeName = RequestTypeCode.PendingInwardCreditsEnquiry.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RequestType2Code> codesByName = new LinkedHashMap<>();

	protected RequestType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RT11");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestType2Code";
				definition = "Specifies the request used to further detail the type of information that will be queried.";
				trace_lazy = () -> RequestTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestType2Code.BankPositionEnquiry, com.tools20022.repository.codeset.RequestType2Code.SpecificTransactionEnquiry,
						com.tools20022.repository.codeset.RequestType2Code.QueuedTransactionEnquiry, com.tools20022.repository.codeset.RequestType2Code.SuspiciousTransactionEnquiry,
						com.tools20022.repository.codeset.RequestType2Code.PendingInwardCreditsEnquiry);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankPositionEnquiry.getCodeName().get(), BankPositionEnquiry);
		codesByName.put(SpecificTransactionEnquiry.getCodeName().get(), SpecificTransactionEnquiry);
		codesByName.put(QueuedTransactionEnquiry.getCodeName().get(), QueuedTransactionEnquiry);
		codesByName.put(SuspiciousTransactionEnquiry.getCodeName().get(), SuspiciousTransactionEnquiry);
		codesByName.put(PendingInwardCreditsEnquiry.getCodeName().get(), PendingInwardCreditsEnquiry);
	}

	public static RequestType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RequestType2Code[] values() {
		RequestType2Code[] values = new RequestType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RequestType2Code> {
		@Override
		public RequestType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RequestType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}