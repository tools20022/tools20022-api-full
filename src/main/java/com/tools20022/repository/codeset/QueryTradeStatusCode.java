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
import com.tools20022.repository.codeset.QueryTradeStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryAllStatus
 * QueryTradeStatusCode.QueryAllStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryNewTrade
 * QueryTradeStatusCode.QueryNewTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryCanceledTrade
 * QueryTradeStatusCode.QueryCanceledTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryReplacedTrade
 * QueryTradeStatusCode.QueryReplacedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryEmergencyTrade
 * QueryTradeStatusCode.QueryEmergencyTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#QueryCancellingTrade
 * QueryTradeStatusCode.QueryCancellingTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
 * QueryTradeStatus1Code}</li>
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
 * "QueryTradeStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry status of the trade."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryTradeStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Query for all trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryAllStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for all trades."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryAllStatus = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllStatus";
			definition = "Query for all trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QAST";
		}
	};
	/**
	 * Query for new trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryNewTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for new trades."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryNewTrade = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryNewTrade";
			definition = "Query for new trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QNTR";
		}
	};
	/**
	 * Query for trades have been canceled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QCTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryCanceledTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for trades have been canceled."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryCanceledTrade = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCanceledTrade";
			definition = "Query for trades have been canceled.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QCTR";
		}
	};
	/**
	 * Query for trades have been replaced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QRTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryReplacedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for trades have been replaced."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryReplacedTrade = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReplacedTrade";
			definition = "Query for trades have been replaced.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QRTR";
		}
	};
	/**
	 * Query for emergency trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryEmergencyTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for emergency trades."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryEmergencyTrade = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryEmergencyTrade";
			definition = "Query for emergency trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QETR";
		}
	};
	/**
	 * Query for cancelling trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode
	 * QueryTradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QCIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryCancellingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for cancelling trades."</li>
	 * </ul>
	 */
	public static final QueryTradeStatusCode QueryCancellingTrade = new QueryTradeStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCancellingTrade";
			definition = "Query for cancelling trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryTradeStatusCode.mmObject();
			codeName = "QCIR";
		}
	};
	final static private LinkedHashMap<String, QueryTradeStatusCode> codesByName = new LinkedHashMap<>();

	protected QueryTradeStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryTradeStatusCode";
				definition = "Specifies the inquiry status of the trade.";
				derivation_lazy = () -> Arrays.asList(QueryTradeStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryTradeStatusCode.QueryAllStatus, com.tools20022.repository.codeset.QueryTradeStatusCode.QueryNewTrade,
						com.tools20022.repository.codeset.QueryTradeStatusCode.QueryCanceledTrade, com.tools20022.repository.codeset.QueryTradeStatusCode.QueryReplacedTrade,
						com.tools20022.repository.codeset.QueryTradeStatusCode.QueryEmergencyTrade, com.tools20022.repository.codeset.QueryTradeStatusCode.QueryCancellingTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryAllStatus.getCodeName().get(), QueryAllStatus);
		codesByName.put(QueryNewTrade.getCodeName().get(), QueryNewTrade);
		codesByName.put(QueryCanceledTrade.getCodeName().get(), QueryCanceledTrade);
		codesByName.put(QueryReplacedTrade.getCodeName().get(), QueryReplacedTrade);
		codesByName.put(QueryEmergencyTrade.getCodeName().get(), QueryEmergencyTrade);
		codesByName.put(QueryCancellingTrade.getCodeName().get(), QueryCancellingTrade);
	}

	public static QueryTradeStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryTradeStatusCode[] values() {
		QueryTradeStatusCode[] values = new QueryTradeStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryTradeStatusCode> {
		@Override
		public QueryTradeStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryTradeStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}