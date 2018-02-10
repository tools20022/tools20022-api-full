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
import com.tools20022.repository.codeset.OrderStatus6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies current status of order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code#DoneForDay
 * OrderStatus6Code.DoneForDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus6Code#Rejected
 * OrderStatus6Code.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus6Code#Executing
 * OrderStatus6Code.Executing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code#Cancelling
 * OrderStatus6Code.Cancelling}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus6Code#Alert
 * OrderStatus6Code.Alert}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus6Code#Accepted
 * OrderStatus6Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code#AcceptedForBidding
 * OrderStatus6Code.AcceptedForBidding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderStatusCode
 * OrderStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies current status of order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderStatus6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneForDay"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code DoneForDay = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoneForDay";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.DoneForDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code Rejected = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Executing"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code Executing = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Executing";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.Executing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelling"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code Cancelling = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelling";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.Cancelling.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alert"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code Alert = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alert";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.Alert.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code Accepted = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus6Code
	 * OrderStatus6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForBidding"</li>
	 * </ul>
	 */
	public static final OrderStatus6Code AcceptedForBidding = new OrderStatus6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForBidding";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus6Code.mmObject();
			codeName = OrderStatusCode.AcceptedForBidding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderStatus6Code> codesByName = new LinkedHashMap<>();

	protected OrderStatus6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus6Code";
				definition = "Identifies current status of order.";
				trace_lazy = () -> OrderStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderStatus6Code.DoneForDay, com.tools20022.repository.codeset.OrderStatus6Code.Rejected, com.tools20022.repository.codeset.OrderStatus6Code.Executing,
						com.tools20022.repository.codeset.OrderStatus6Code.Cancelling, com.tools20022.repository.codeset.OrderStatus6Code.Alert, com.tools20022.repository.codeset.OrderStatus6Code.Accepted,
						com.tools20022.repository.codeset.OrderStatus6Code.AcceptedForBidding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DoneForDay.getCodeName().get(), DoneForDay);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Executing.getCodeName().get(), Executing);
		codesByName.put(Cancelling.getCodeName().get(), Cancelling);
		codesByName.put(Alert.getCodeName().get(), Alert);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AcceptedForBidding.getCodeName().get(), AcceptedForBidding);
	}

	public static OrderStatus6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderStatus6Code[] values() {
		OrderStatus6Code[] values = new OrderStatus6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderStatus6Code> {
		@Override
		public OrderStatus6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderStatus6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}