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
import com.tools20022.repository.codeset.QueryOrderStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the inquiry status of order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code#QueryUnconfirmedOrder
 * QueryOrderStatus1Code.QueryUnconfirmedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code#QueryOrdersForTheParty
 * QueryOrderStatus1Code.QueryOrdersForTheParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code#QueryFullyExecutedOrder
 * QueryOrderStatus1Code.QueryFullyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code#QueryPartiallyExecutedOrder
 * QueryOrderStatus1Code.QueryPartiallyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code#QueryAllOrders
 * QueryOrderStatus1Code.QueryAllOrders}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
 * QueryOrderStatusCode}</li>
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
 * "QueryOrderStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry status of order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryOrderStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryUnconfirmedOrder"</li>
	 * </ul>
	 */
	public static final QueryOrderStatus1Code QueryUnconfirmedOrder = new QueryOrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryUnconfirmedOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatus1Code.mmObject();
			codeName = QueryOrderStatusCode.QueryUnconfirmedOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOrdersForTheParty"</li>
	 * </ul>
	 */
	public static final QueryOrderStatus1Code QueryOrdersForTheParty = new QueryOrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOrdersForTheParty";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatus1Code.mmObject();
			codeName = QueryOrderStatusCode.QueryOrdersForTheParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryFullyExecutedOrder"</li>
	 * </ul>
	 */
	public static final QueryOrderStatus1Code QueryFullyExecutedOrder = new QueryOrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryFullyExecutedOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatus1Code.mmObject();
			codeName = QueryOrderStatusCode.QueryFullyExecutedOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPartiallyExecutedOrder"</li>
	 * </ul>
	 */
	public static final QueryOrderStatus1Code QueryPartiallyExecutedOrder = new QueryOrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPartiallyExecutedOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatus1Code.mmObject();
			codeName = QueryOrderStatusCode.QueryPartiallyExecutedOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryAllOrders"</li>
	 * </ul>
	 */
	public static final QueryOrderStatus1Code QueryAllOrders = new QueryOrderStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllOrders";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatus1Code.mmObject();
			codeName = QueryOrderStatusCode.QueryAllOrders.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QueryOrderStatus1Code> codesByName = new LinkedHashMap<>();

	protected QueryOrderStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryOrderStatus1Code";
				definition = "Specifies the inquiry status of order.";
				trace_lazy = () -> QueryOrderStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryOrderStatus1Code.QueryUnconfirmedOrder, com.tools20022.repository.codeset.QueryOrderStatus1Code.QueryOrdersForTheParty,
						com.tools20022.repository.codeset.QueryOrderStatus1Code.QueryFullyExecutedOrder, com.tools20022.repository.codeset.QueryOrderStatus1Code.QueryPartiallyExecutedOrder,
						com.tools20022.repository.codeset.QueryOrderStatus1Code.QueryAllOrders);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryUnconfirmedOrder.getCodeName().get(), QueryUnconfirmedOrder);
		codesByName.put(QueryOrdersForTheParty.getCodeName().get(), QueryOrdersForTheParty);
		codesByName.put(QueryFullyExecutedOrder.getCodeName().get(), QueryFullyExecutedOrder);
		codesByName.put(QueryPartiallyExecutedOrder.getCodeName().get(), QueryPartiallyExecutedOrder);
		codesByName.put(QueryAllOrders.getCodeName().get(), QueryAllOrders);
	}

	public static QueryOrderStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryOrderStatus1Code[] values() {
		QueryOrderStatus1Code[] values = new QueryOrderStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryOrderStatus1Code> {
		@Override
		public QueryOrderStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryOrderStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}