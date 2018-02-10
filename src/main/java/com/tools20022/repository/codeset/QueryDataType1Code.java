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
import com.tools20022.repository.codeset.QueryDataType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.QueryDataType1Code#QueryForeignExchangeTradingData
 * QueryDataType1Code.QueryForeignExchangeTradingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryDataType1Code#QueryOptionTradingData
 * QueryDataType1Code.QueryOptionTradingData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QueryDataTypeCode
 * QueryDataTypeCode}</li>
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
 * "QueryDataType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry type of the data."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryDataType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryDataType1Code
	 * QueryDataType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryForeignExchangeTradingData"</li>
	 * </ul>
	 */
	public static final QueryDataType1Code QueryForeignExchangeTradingData = new QueryDataType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryForeignExchangeTradingData";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryDataType1Code.mmObject();
			codeName = QueryDataTypeCode.QueryForeignExchangeTradingData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryDataType1Code
	 * QueryDataType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOptionTradingData"</li>
	 * </ul>
	 */
	public static final QueryDataType1Code QueryOptionTradingData = new QueryDataType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOptionTradingData";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryDataType1Code.mmObject();
			codeName = QueryDataTypeCode.QueryOptionTradingData.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QueryDataType1Code> codesByName = new LinkedHashMap<>();

	protected QueryDataType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryDataType1Code";
				definition = "Specifies the inquiry type of the data.";
				trace_lazy = () -> QueryDataTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryDataType1Code.QueryForeignExchangeTradingData, com.tools20022.repository.codeset.QueryDataType1Code.QueryOptionTradingData);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QueryForeignExchangeTradingData.getCodeName().get(), QueryForeignExchangeTradingData);
		codesByName.put(QueryOptionTradingData.getCodeName().get(), QueryOptionTradingData);
	}

	public static QueryDataType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryDataType1Code[] values() {
		QueryDataType1Code[] values = new QueryDataType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryDataType1Code> {
		@Override
		public QueryDataType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryDataType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}