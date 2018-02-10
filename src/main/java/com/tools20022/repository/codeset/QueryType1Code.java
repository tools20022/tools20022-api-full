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
import com.tools20022.repository.codeset.QueryType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifyies the nature of the query, i.e. whether the query requests that all
 * matching items be returned or only new matching items since the last similar
 * query be returned.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType1Code#All
 * QueryType1Code.All}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryType1Code#Changes
 * QueryType1Code.Changes}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ALLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QueryType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifyies the nature of the query, i.e. whether the query requests that all matching items be returned or only new matching items since the last similar query be returned."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QueryType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the query requests that all matching items be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType1Code
	 * QueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that all matching items be returned."</li>
	 * </ul>
	 */
	public static final QueryType1Code All = new QueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "Specifies that the query requests that all matching items be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryType1Code.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Specifies that the query requests that only new matching items since the
	 * last similar query be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType1Code
	 * QueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Changes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the query requests that only new matching items since the last similar query be returned."
	 * </li>
	 * </ul>
	 */
	public static final QueryType1Code Changes = new QueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Changes";
			definition = "Specifies that the query requests that only new matching items since the last similar query be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.QueryType1Code.mmObject();
			codeName = "CHNG";
		}
	};
	final static private LinkedHashMap<String, QueryType1Code> codesByName = new LinkedHashMap<>();

	protected QueryType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueryType1Code";
				definition = "Specifyies the nature of the query, i.e. whether the query requests that all matching items be returned or only new matching items since the last similar query be returned.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryType1Code.All, com.tools20022.repository.codeset.QueryType1Code.Changes);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(Changes.getCodeName().get(), Changes);
	}

	public static QueryType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QueryType1Code[] values() {
		QueryType1Code[] values = new QueryType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QueryType1Code> {
		@Override
		public QueryType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QueryType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}