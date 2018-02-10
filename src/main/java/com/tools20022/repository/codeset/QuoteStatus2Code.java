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
import com.tools20022.repository.codeset.QuoteStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the status of a quote acknowledgement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code#CancelSymbol
 * QuoteStatus2Code.CancelSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code#CancelSecurity
 * QuoteStatus2Code.CancelSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code#CancelUnderlying
 * QuoteStatus2Code.CancelUnderlying}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatus2Code#CancelAll
 * QuoteStatus2Code.CancelAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code#QuoteNotFound
 * QuoteStatus2Code.QuoteNotFound}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
 * QuoteStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SYMB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of a quote acknowledgement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code
	 * QuoteStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSymbol"</li>
	 * </ul>
	 */
	public static final QuoteStatus2Code CancelSymbol = new QuoteStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus2Code.mmObject();
			codeName = QuoteStatusCode.CancelSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code
	 * QuoteStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSecurity"</li>
	 * </ul>
	 */
	public static final QuoteStatus2Code CancelSecurity = new QuoteStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus2Code.mmObject();
			codeName = QuoteStatusCode.CancelSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code
	 * QuoteStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlying"</li>
	 * </ul>
	 */
	public static final QuoteStatus2Code CancelUnderlying = new QuoteStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlying";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus2Code.mmObject();
			codeName = QuoteStatusCode.CancelUnderlying.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code
	 * QuoteStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelAll"</li>
	 * </ul>
	 */
	public static final QuoteStatus2Code CancelAll = new QuoteStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelAll";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus2Code.mmObject();
			codeName = QuoteStatusCode.CancelAll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus2Code
	 * QuoteStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteNotFound"</li>
	 * </ul>
	 */
	public static final QuoteStatus2Code QuoteNotFound = new QuoteStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatus2Code.mmObject();
			codeName = QuoteStatusCode.QuoteNotFound.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QuoteStatus2Code> codesByName = new LinkedHashMap<>();

	protected QuoteStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SYMB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteStatus2Code";
				definition = "Identifies the status of a quote acknowledgement.";
				trace_lazy = () -> QuoteStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteStatus2Code.CancelSymbol, com.tools20022.repository.codeset.QuoteStatus2Code.CancelSecurity,
						com.tools20022.repository.codeset.QuoteStatus2Code.CancelUnderlying, com.tools20022.repository.codeset.QuoteStatus2Code.CancelAll, com.tools20022.repository.codeset.QuoteStatus2Code.QuoteNotFound);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelSymbol.getCodeName().get(), CancelSymbol);
		codesByName.put(CancelSecurity.getCodeName().get(), CancelSecurity);
		codesByName.put(CancelUnderlying.getCodeName().get(), CancelUnderlying);
		codesByName.put(CancelAll.getCodeName().get(), CancelAll);
		codesByName.put(QuoteNotFound.getCodeName().get(), QuoteNotFound);
	}

	public static QuoteStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteStatus2Code[] values() {
		QuoteStatus2Code[] values = new QuoteStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteStatus2Code> {
		@Override
		public QuoteStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}