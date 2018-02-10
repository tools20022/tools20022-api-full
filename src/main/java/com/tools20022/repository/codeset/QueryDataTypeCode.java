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
import com.tools20022.repository.codeset.QueryDataTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the inquiry type of the data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryDataTypeCode#QueryForeignExchangeTradingData
 * QueryDataTypeCode.QueryForeignExchangeTradingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryDataTypeCode#QueryOptionTradingData
 * QueryDataTypeCode.QueryOptionTradingData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryDataType1Code
 * QueryDataType1Code}</li>
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
 * "QueryDataTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry type of the data."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryDataTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Query for tading data of foreign exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryDataTypeCode
	 * QueryDataTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QFXT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryForeignExchangeTradingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for tading data of foreign exchange."</li>
	 * </ul>
	 */
	public static final QueryDataTypeCode QueryForeignExchangeTradingData = new QueryDataTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryForeignExchangeTradingData";
			definition = "Query for tading data of foreign exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryDataTypeCode.mmObject();
			codeName = "QFXT";
		}
	};
	/**
	 * Query for tading data of option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryDataTypeCode
	 * QueryDataTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOptionTradingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for tading data of option."</li>
	 * </ul>
	 */
	public static final QueryDataTypeCode QueryOptionTradingData = new QueryDataTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOptionTradingData";
			definition = "Query for tading data of option.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryDataTypeCode.mmObject();
			codeName = "QOTD";
		}
	};
	final static private LinkedHashMap<String, QueryDataTypeCode> codesByName = new LinkedHashMap<>();

	protected QueryDataTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryDataTypeCode";
				definition = "Specifies the inquiry type of the data.";
				derivation_lazy = () -> Arrays.asList(QueryDataType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryDataTypeCode.QueryForeignExchangeTradingData, com.tools20022.repository.codeset.QueryDataTypeCode.QueryOptionTradingData);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryForeignExchangeTradingData.getCodeName().get(), QueryForeignExchangeTradingData);
		codesByName.put(QueryOptionTradingData.getCodeName().get(), QueryOptionTradingData);
	}

	public static QueryDataTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryDataTypeCode[] values() {
		QueryDataTypeCode[] values = new QueryDataTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryDataTypeCode> {
		@Override
		public QueryDataTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryDataTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}