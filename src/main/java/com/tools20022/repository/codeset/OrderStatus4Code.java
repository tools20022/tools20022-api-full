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
import com.tools20022.repository.codeset.OrderStatus4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus4Code#Accepted
 * OrderStatus4Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#AlreadyExecuted
 * OrderStatus4Code.AlreadyExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#SentToNextParty
 * OrderStatus4Code.SentToNextParty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus4Code#Received
 * OrderStatus4Code.Received}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus4Code#Settled
 * OrderStatus4Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#CommunicationProblemNextParty
 * OrderStatus4Code.CommunicationProblemNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#ConfirmationAmendment
 * OrderStatus4Code.ConfirmationAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#DoneForDay
 * OrderStatus4Code.DoneForDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#PartiallyDone
 * OrderStatus4Code.PartiallyDone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus4Code#Open
 * OrderStatus4Code.Open}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code#InvalidAgentConfirmation
 * OrderStatus4Code.InvalidAgentConfirmation}</li>
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
 * <li>"PACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current status of the order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderStatus4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code Accepted = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyExecuted"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code AlreadyExecuted = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyExecuted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.AlreadyExecuted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code SentToNextParty = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code Received = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code Settled = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationProblemNextParty"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code CommunicationProblemNextParty = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationProblemNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.CommunicationProblemNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationAmendment"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code ConfirmationAmendment = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationAmendment";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.ConfirmationAmendment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneForDay"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code DoneForDay = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoneForDay";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.DoneForDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyDone"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code PartiallyDone = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyDone";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.PartiallyDone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code Open = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.Open.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus4Code
	 * OrderStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgentConfirmation"</li>
	 * </ul>
	 */
	public static final OrderStatus4Code InvalidAgentConfirmation = new OrderStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgentConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus4Code.mmObject();
			codeName = OrderStatusCode.InvalidAgentConfirmation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderStatus4Code> codesByName = new LinkedHashMap<>();

	protected OrderStatus4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus4Code";
				definition = "Specifies the current status of the order.";
				trace_lazy = () -> OrderStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderStatus4Code.Accepted, com.tools20022.repository.codeset.OrderStatus4Code.AlreadyExecuted,
						com.tools20022.repository.codeset.OrderStatus4Code.SentToNextParty, com.tools20022.repository.codeset.OrderStatus4Code.Received, com.tools20022.repository.codeset.OrderStatus4Code.Settled,
						com.tools20022.repository.codeset.OrderStatus4Code.CommunicationProblemNextParty, com.tools20022.repository.codeset.OrderStatus4Code.ConfirmationAmendment,
						com.tools20022.repository.codeset.OrderStatus4Code.DoneForDay, com.tools20022.repository.codeset.OrderStatus4Code.PartiallyDone, com.tools20022.repository.codeset.OrderStatus4Code.Open,
						com.tools20022.repository.codeset.OrderStatus4Code.InvalidAgentConfirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AlreadyExecuted.getCodeName().get(), AlreadyExecuted);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(CommunicationProblemNextParty.getCodeName().get(), CommunicationProblemNextParty);
		codesByName.put(ConfirmationAmendment.getCodeName().get(), ConfirmationAmendment);
		codesByName.put(DoneForDay.getCodeName().get(), DoneForDay);
		codesByName.put(PartiallyDone.getCodeName().get(), PartiallyDone);
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(InvalidAgentConfirmation.getCodeName().get(), InvalidAgentConfirmation);
	}

	public static OrderStatus4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderStatus4Code[] values() {
		OrderStatus4Code[] values = new OrderStatus4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderStatus4Code> {
		@Override
		public OrderStatus4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderStatus4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}