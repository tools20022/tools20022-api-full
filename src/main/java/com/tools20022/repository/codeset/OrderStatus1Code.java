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
import com.tools20022.repository.codeset.OrderStatus1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#New
 * OrderStatus1Code.New}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#PartialFill
 * OrderStatus1Code.PartialFill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Filled
 * OrderStatus1Code.Filled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#DoneForDay
 * OrderStatus1Code.DoneForDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Cancelled
 * OrderStatus1Code.Cancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Replaced
 * OrderStatus1Code.Replaced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#PendingCancel
 * OrderStatus1Code.PendingCancel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Stopped
 * OrderStatus1Code.Stopped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Rejected
 * OrderStatus1Code.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Suspended
 * OrderStatus1Code.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#PendingNew
 * OrderStatus1Code.PendingNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Calculated
 * OrderStatus1Code.Calculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus1Code#Expired
 * OrderStatus1Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#AcceptedForBidding
 * OrderStatus1Code.AcceptedForBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code#PendingReplace
 * OrderStatus1Code.PendingReplace}</li>
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
 * <li>"NEWW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies current status of order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code New = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.New.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFill"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code PartialFill = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFill";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.PartialFill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Filled"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Filled = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Filled";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Filled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneForDay"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code DoneForDay = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoneForDay";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.DoneForDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Cancelled = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replaced"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Replaced = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replaced";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Replaced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancel"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code PendingCancel = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.PendingCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stopped"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Stopped = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stopped";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Stopped.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Rejected = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Suspended = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNew"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code PendingNew = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNew";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.PendingNew.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Calculated = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Calculated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code Expired = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForBidding"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code AcceptedForBidding = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForBidding";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.AcceptedForBidding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus1Code
	 * OrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReplace"</li>
	 * </ul>
	 */
	public static final OrderStatus1Code PendingReplace = new OrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReplace";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus1Code.mmObject();
			codeName = OrderStatusCode.PendingReplace.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderStatus1Code> codesByName = new LinkedHashMap<>();

	protected OrderStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus1Code";
				definition = "Identifies current status of order.";
				trace_lazy = () -> OrderStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderStatus1Code.New, com.tools20022.repository.codeset.OrderStatus1Code.PartialFill, com.tools20022.repository.codeset.OrderStatus1Code.Filled,
						com.tools20022.repository.codeset.OrderStatus1Code.DoneForDay, com.tools20022.repository.codeset.OrderStatus1Code.Cancelled, com.tools20022.repository.codeset.OrderStatus1Code.Replaced,
						com.tools20022.repository.codeset.OrderStatus1Code.PendingCancel, com.tools20022.repository.codeset.OrderStatus1Code.Stopped, com.tools20022.repository.codeset.OrderStatus1Code.Rejected,
						com.tools20022.repository.codeset.OrderStatus1Code.Suspended, com.tools20022.repository.codeset.OrderStatus1Code.PendingNew, com.tools20022.repository.codeset.OrderStatus1Code.Calculated,
						com.tools20022.repository.codeset.OrderStatus1Code.Expired, com.tools20022.repository.codeset.OrderStatus1Code.AcceptedForBidding, com.tools20022.repository.codeset.OrderStatus1Code.PendingReplace);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(New.getCodeName().get(), New);
		codesByName.put(PartialFill.getCodeName().get(), PartialFill);
		codesByName.put(Filled.getCodeName().get(), Filled);
		codesByName.put(DoneForDay.getCodeName().get(), DoneForDay);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Replaced.getCodeName().get(), Replaced);
		codesByName.put(PendingCancel.getCodeName().get(), PendingCancel);
		codesByName.put(Stopped.getCodeName().get(), Stopped);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(PendingNew.getCodeName().get(), PendingNew);
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(AcceptedForBidding.getCodeName().get(), AcceptedForBidding);
		codesByName.put(PendingReplace.getCodeName().get(), PendingReplace);
	}

	public static OrderStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderStatus1Code[] values() {
		OrderStatus1Code[] values = new OrderStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderStatus1Code> {
		@Override
		public OrderStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}