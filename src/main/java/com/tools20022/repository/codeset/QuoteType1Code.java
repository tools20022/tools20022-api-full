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
import com.tools20022.repository.codeset.QuoteType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of quote. Can be either an indicative, a tradeable or a
 * restricted tradeable quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteType1Code#Indicative
 * QuoteType1Code.Indicative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteType1Code#Tradeable
 * QuoteType1Code.Tradeable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code#RestrictedTradeable
 * QuoteType1Code.RestrictedTradeable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteType1Code#Counter
 * QuoteType1Code.Counter}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuoteTypeCode QuoteTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of quote. Can be either an indicative, a tradeable or a restricted tradeable quote."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteType1Code Indicative = new QuoteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicative";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteType1Code.mmObject();
			codeName = QuoteTypeCode.Indicative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tradeable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteType1Code Tradeable = new QuoteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tradeable";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteType1Code.mmObject();
			codeName = QuoteTypeCode.Tradeable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedTradeable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteType1Code RestrictedTradeable = new QuoteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedTradeable";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteType1Code.mmObject();
			codeName = QuoteTypeCode.RestrictedTradeable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteType1Code Counter = new QuoteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteType1Code.mmObject();
			codeName = QuoteTypeCode.Counter.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QuoteType1Code> codesByName = new LinkedHashMap<>();

	protected QuoteType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteType1Code";
				definition = "Identifies the type of quote. Can be either an indicative, a tradeable or a restricted tradeable quote.";
				trace_lazy = () -> QuoteTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteType1Code.Indicative, com.tools20022.repository.codeset.QuoteType1Code.Tradeable, com.tools20022.repository.codeset.QuoteType1Code.RestrictedTradeable,
						com.tools20022.repository.codeset.QuoteType1Code.Counter);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Indicative.getCodeName().get(), Indicative);
		codesByName.put(Tradeable.getCodeName().get(), Tradeable);
		codesByName.put(RestrictedTradeable.getCodeName().get(), RestrictedTradeable);
		codesByName.put(Counter.getCodeName().get(), Counter);
	}

	public static QuoteType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteType1Code[] values() {
		QuoteType1Code[] values = new QuoteType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteType1Code> {
		@Override
		public QuoteType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}