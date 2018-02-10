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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderCancellationStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of the order cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code#SentToNextParty
 * OrderCancellationStatus2Code.SentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code#Received
 * OrderCancellationStatus2Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code#CancellationPending
 * OrderCancellationStatus2Code.CancellationPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code#CancellationCompleted
 * OrderCancellationStatus2Code.CancellationCompleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatusCode
 * OrderCancellationStatusCode}</li>
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
 * "OrderCancellationStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the current status of the order cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderCancellationStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code
	 * OrderCancellationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final OrderCancellationStatus2Code SentToNextParty = new OrderCancellationStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatus2Code.mmObject();
			codeName = OrderCancellationStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code
	 * OrderCancellationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final OrderCancellationStatus2Code Received = new OrderCancellationStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatus2Code.mmObject();
			codeName = OrderCancellationStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code
	 * OrderCancellationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationPending"</li>
	 * </ul>
	 */
	public static final OrderCancellationStatus2Code CancellationPending = new OrderCancellationStatus2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatus2Code.mmObject();
			codeName = OrderCancellationStatusCode.CancellationPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus2Code
	 * OrderCancellationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * </ul>
	 */
	public static final OrderCancellationStatus2Code CancellationCompleted = new OrderCancellationStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderCancellationStatus2Code.mmObject();
			codeName = OrderCancellationStatusCode.CancellationCompleted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderCancellationStatus2Code> codesByName = new LinkedHashMap<>();

	protected OrderCancellationStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatus2Code";
				definition = "Specifies the current status of the order cancellation request.";
				trace_lazy = () -> OrderCancellationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderCancellationStatus2Code.SentToNextParty, com.tools20022.repository.codeset.OrderCancellationStatus2Code.Received,
						com.tools20022.repository.codeset.OrderCancellationStatus2Code.CancellationPending, com.tools20022.repository.codeset.OrderCancellationStatus2Code.CancellationCompleted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(CancellationPending.getCodeName().get(), CancellationPending);
		codesByName.put(CancellationCompleted.getCodeName().get(), CancellationCompleted);
	}

	public static OrderCancellationStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderCancellationStatus2Code[] values() {
		OrderCancellationStatus2Code[] values = new OrderCancellationStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderCancellationStatus2Code> {
		@Override
		public OrderCancellationStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderCancellationStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}