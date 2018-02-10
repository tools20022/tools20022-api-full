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
import com.tools20022.repository.codeset.QueryOrderStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#QueryUnconfirmedOrder
 * QueryOrderStatusCode.QueryUnconfirmedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#QueryAllOrders
 * QueryOrderStatusCode.QueryAllOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#QueryPartiallyExecutedOrder
 * QueryOrderStatusCode.QueryPartiallyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#QueryFullyExecutedOrder
 * QueryOrderStatusCode.QueryFullyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#QueryOrdersForTheParty
 * QueryOrderStatusCode.QueryOrdersForTheParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
 * QueryOrderStatus1Code}</li>
 * </ul>
 * </li>
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
 * "QueryOrderStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry status of order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryOrderStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Query for orders which are not confirmed by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryUnconfirmedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders which are not confirmed by a party."</li>
	 * </ul>
	 */
	public static final QueryOrderStatusCode QueryUnconfirmedOrder = new QueryOrderStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryUnconfirmedOrder";
			definition = "Query for orders which are not confirmed by a party.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatusCode.mmObject();
			codeName = "QUCO";
		}
	};
	/**
	 * Query for all orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryAllOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for all orders.\r\n"</li>
	 * </ul>
	 */
	public static final QueryOrderStatusCode QueryAllOrders = new QueryOrderStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllOrders";
			definition = "Query for all orders.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatusCode.mmObject();
			codeName = "QUAO";
		}
	};
	/**
	 * Query for orders have been partially executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QPEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPartiallyExecutedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders have been partially executed."</li>
	 * </ul>
	 */
	public static final QueryOrderStatusCode QueryPartiallyExecutedOrder = new QueryOrderStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPartiallyExecutedOrder";
			definition = "Query for orders have been partially executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatusCode.mmObject();
			codeName = "QPEO";
		}
	};
	/**
	 * Query for orders have been completely executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QFEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryFullyExecutedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders have been completely executed."</li>
	 * </ul>
	 */
	public static final QueryOrderStatusCode QueryFullyExecutedOrder = new QueryOrderStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryFullyExecutedOrder";
			definition = "Query for orders have been completely executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatusCode.mmObject();
			codeName = "QFEO";
		}
	};
	/**
	 * Query for all orders for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOrdersForTheParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for all orders for a party."</li>
	 * </ul>
	 */
	public static final QueryOrderStatusCode QueryOrdersForTheParty = new QueryOrderStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOrdersForTheParty";
			definition = "Query for all orders for a party.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryOrderStatusCode.mmObject();
			codeName = "QOFP";
		}
	};
	final static private LinkedHashMap<String, QueryOrderStatusCode> codesByName = new LinkedHashMap<>();

	protected QueryOrderStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryOrderStatusCode";
				definition = "Specifies the inquiry status of order.";
				derivation_lazy = () -> Arrays.asList(QueryOrderStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryOrderStatusCode.QueryUnconfirmedOrder, com.tools20022.repository.codeset.QueryOrderStatusCode.QueryAllOrders,
						com.tools20022.repository.codeset.QueryOrderStatusCode.QueryPartiallyExecutedOrder, com.tools20022.repository.codeset.QueryOrderStatusCode.QueryFullyExecutedOrder,
						com.tools20022.repository.codeset.QueryOrderStatusCode.QueryOrdersForTheParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryUnconfirmedOrder.getCodeName().get(), QueryUnconfirmedOrder);
		codesByName.put(QueryAllOrders.getCodeName().get(), QueryAllOrders);
		codesByName.put(QueryPartiallyExecutedOrder.getCodeName().get(), QueryPartiallyExecutedOrder);
		codesByName.put(QueryFullyExecutedOrder.getCodeName().get(), QueryFullyExecutedOrder);
		codesByName.put(QueryOrdersForTheParty.getCodeName().get(), QueryOrdersForTheParty);
	}

	public static QueryOrderStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryOrderStatusCode[] values() {
		QueryOrderStatusCode[] values = new QueryOrderStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryOrderStatusCode> {
		@Override
		public QueryOrderStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryOrderStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}