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
import com.tools20022.repository.codeset.OrderStatus8Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Cancelled
 * OrderStatus8Code.Cancelled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#New
 * OrderStatus8Code.New}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Replaced
 * OrderStatus8Code.Replaced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Stopped
 * OrderStatus8Code.Stopped}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Rejected
 * OrderStatus8Code.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Expired
 * OrderStatus8Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code#SentToNextParty
 * OrderStatus8Code.SentToNextParty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderStatus8Code#Received
 * OrderStatus8Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code#PendingCancel
 * OrderStatus8Code.PendingCancel}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatus8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies current status of order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderStatus8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Cancelled = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code New = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.New.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replaced"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Replaced = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replaced";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Replaced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stopped"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Stopped = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stopped";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Stopped.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Rejected = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Expired = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code SentToNextParty = new OrderStatus8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code Received = new OrderStatus8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 39</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancel"</li>
	 * </ul>
	 */
	public static final OrderStatus8Code PendingCancel = new OrderStatus8Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 39"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderStatus8Code.mmObject();
			codeName = OrderStatusCode.PendingCancel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderStatus8Code> codesByName = new LinkedHashMap<>();

	protected OrderStatus8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderStatus8Code";
				definition = "Identifies current status of order.";
				trace_lazy = () -> OrderStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderStatus8Code.Cancelled, com.tools20022.repository.codeset.OrderStatus8Code.New, com.tools20022.repository.codeset.OrderStatus8Code.Replaced,
						com.tools20022.repository.codeset.OrderStatus8Code.Stopped, com.tools20022.repository.codeset.OrderStatus8Code.Rejected, com.tools20022.repository.codeset.OrderStatus8Code.Expired,
						com.tools20022.repository.codeset.OrderStatus8Code.SentToNextParty, com.tools20022.repository.codeset.OrderStatus8Code.Received, com.tools20022.repository.codeset.OrderStatus8Code.PendingCancel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(New.getCodeName().get(), New);
		codesByName.put(Replaced.getCodeName().get(), Replaced);
		codesByName.put(Stopped.getCodeName().get(), Stopped);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(PendingCancel.getCodeName().get(), PendingCancel);
	}

	public static OrderStatus8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderStatus8Code[] values() {
		OrderStatus8Code[] values = new OrderStatus8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderStatus8Code> {
		@Override
		public OrderStatus8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderStatus8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}