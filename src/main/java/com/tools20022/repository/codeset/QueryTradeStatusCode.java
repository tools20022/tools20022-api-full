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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the inquiry status of the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryAllStatus
 * QueryTradeStatusCode.mmQueryAllStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryNewTrade
 * QueryTradeStatusCode.mmQueryNewTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryCanceledTrade
 * QueryTradeStatusCode.mmQueryCanceledTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryReplacedTrade
 * QueryTradeStatusCode.mmQueryReplacedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryEmergencyTrade
 * QueryTradeStatusCode.mmQueryEmergencyTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatusCode#mmQueryCancellingTrade
 * QueryTradeStatusCode.mmQueryCancellingTrade}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class QueryTradeStatusCode {

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
	public static final MMCode mmQueryAllStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllStatus";
			definition = "Query for all trades.";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
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
	public static final MMCode mmQueryNewTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryNewTrade";
			definition = "Query for new trades.";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
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
	 * definition} = "Query for trades have been canceled.  "</li>
	 * </ul>
	 */
	public static final MMCode mmQueryCanceledTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCanceledTrade";
			definition = "Query for trades have been canceled.  ";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
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
	 * definition} = "Query for trades have been replaced.  "</li>
	 * </ul>
	 */
	public static final MMCode mmQueryReplacedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReplacedTrade";
			definition = "Query for trades have been replaced.  ";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
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
	public static final MMCode mmQueryEmergencyTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryEmergencyTrade";
			definition = "Query for emergency trades.";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
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
	public static final MMCode mmQueryCancellingTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryCancellingTrade";
			definition = "Query for cancelling trades.";
			owner_lazy = () -> QueryTradeStatusCode.mmObject();
			codeName = "QCIR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryTradeStatusCode";
				definition = "Specifies the inquiry status of the trade.";
				code_lazy = () -> Arrays.asList(QueryTradeStatusCode.mmQueryAllStatus, QueryTradeStatusCode.mmQueryNewTrade, QueryTradeStatusCode.mmQueryCanceledTrade, QueryTradeStatusCode.mmQueryReplacedTrade,
						QueryTradeStatusCode.mmQueryEmergencyTrade, QueryTradeStatusCode.mmQueryCancellingTrade);
				derivation_lazy = () -> Arrays.asList(QueryTradeStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}