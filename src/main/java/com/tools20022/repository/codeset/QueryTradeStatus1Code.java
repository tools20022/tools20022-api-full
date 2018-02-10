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
import com.tools20022.repository.codeset.QueryTradeStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the inquiry status of the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryAllStatus
 * QueryTradeStatus1Code.QueryAllStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryCanceledTrade
 * QueryTradeStatus1Code.QueryCanceledTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryCancellingTrade
 * QueryTradeStatus1Code.QueryCancellingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryEmergencyTrade
 * QueryTradeStatus1Code.QueryEmergencyTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryNewTrade
 * QueryTradeStatus1Code.QueryNewTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code#QueryReplacedTrade
 * QueryTradeStatus1Code.QueryReplacedTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
 * QueryTradeStatusCode}</li>
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
 * "QueryTradeStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry status of the trade."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryTradeStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryAllStatus"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryAllStatus = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryAllStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryCanceledTrade"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryCanceledTrade = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCanceledTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryCanceledTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryCancellingTrade"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryCancellingTrade = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCancellingTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryCancellingTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryEmergencyTrade"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryEmergencyTrade = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryEmergencyTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryEmergencyTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryNewTrade"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryNewTrade = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryNewTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryNewTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryReplacedTrade"</li>
	 * </ul>
	 */
	public static final QueryTradeStatus1Code QueryReplacedTrade = new QueryTradeStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReplacedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatus1Code.mmObject();
			codeName = QueryTradeStatusCode.QueryReplacedTrade.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QueryTradeStatus1Code> codesByName = new LinkedHashMap<>();

	protected QueryTradeStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryTradeStatus1Code";
				definition = "Specifies the inquiry status of the trade.";
				trace_lazy = () -> QueryTradeStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryAllStatus, com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryCanceledTrade,
						com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryCancellingTrade, com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryEmergencyTrade,
						com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryNewTrade, com.tools20022.repository.codeset.QueryTradeStatus1Code.QueryReplacedTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryAllStatus.getCodeName().get(), QueryAllStatus);
		codesByName.put(QueryCanceledTrade.getCodeName().get(), QueryCanceledTrade);
		codesByName.put(QueryCancellingTrade.getCodeName().get(), QueryCancellingTrade);
		codesByName.put(QueryEmergencyTrade.getCodeName().get(), QueryEmergencyTrade);
		codesByName.put(QueryNewTrade.getCodeName().get(), QueryNewTrade);
		codesByName.put(QueryReplacedTrade.getCodeName().get(), QueryReplacedTrade);
	}

	public static QueryTradeStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryTradeStatus1Code[] values() {
		QueryTradeStatus1Code[] values = new QueryTradeStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryTradeStatus1Code> {
		@Override
		public QueryTradeStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryTradeStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}