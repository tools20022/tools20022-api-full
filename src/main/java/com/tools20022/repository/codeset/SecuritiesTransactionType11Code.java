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
import com.tools20022.repository.codeset.SecuritiesTransactionType11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies underlying information regarding the type of settlement
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType11Code#NonSyndicated
 * SecuritiesTransactionType11Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType11Code#SyndicateUnderwriters
 * SecuritiesTransactionType11Code.SyndicateUnderwriters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
 * SecuritiesTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NSYN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType11Code
	 * SecuritiesTransactionType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType11Code NonSyndicated = new SecuritiesTransactionType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType11Code.mmObject();
			codeName = SecuritiesTransactionTypeCode.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType11Code
	 * SecuritiesTransactionType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType11Code SyndicateUnderwriters = new SecuritiesTransactionType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType11Code.mmObject();
			codeName = SecuritiesTransactionTypeCode.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType11Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NSYN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType11Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				trace_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType11Code.NonSyndicated, com.tools20022.repository.codeset.SecuritiesTransactionType11Code.SyndicateUnderwriters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonSyndicated.getCodeName().get(), NonSyndicated);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
	}

	public static SecuritiesTransactionType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType11Code[] values() {
		SecuritiesTransactionType11Code[] values = new SecuritiesTransactionType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType11Code> {
		@Override
		public SecuritiesTransactionType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}