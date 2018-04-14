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
import com.tools20022.repository.codeset.QuoteResponseType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Qualifies the nature of response to a previoulsy addressed quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#HitLift
 * QuoteResponseType1Code.HitLift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#CounterQuote
 * QuoteResponseType1Code.CounterQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#Expired
 * QuoteResponseType1Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#Cover
 * QuoteResponseType1Code.Cover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#DoneAway
 * QuoteResponseType1Code.DoneAway}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code#Pass
 * QuoteResponseType1Code.Pass}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
 * QuoteResponseTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteResponseType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Qualifies the nature of response to a previoulsy addressed quote."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"HILI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteResponseType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HitLift"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code HitLift = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HitLift";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.HitLift.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code CounterQuote = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterQuote";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.CounterQuote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code Expired = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code Cover = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cover";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.Cover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneAway"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code DoneAway = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoneAway";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.DoneAway.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
	 * QuoteResponseType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final QuoteResponseType1Code Pass = new QuoteResponseType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteResponseType1Code.mmObject();
			codeName = QuoteResponseTypeCode.Pass.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, QuoteResponseType1Code> codesByName = new LinkedHashMap<>();

	protected QuoteResponseType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HILI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteResponseType1Code";
				definition = "Qualifies the nature of response to a previoulsy addressed quote.";
				trace_lazy = () -> QuoteResponseTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteResponseType1Code.HitLift, com.tools20022.repository.codeset.QuoteResponseType1Code.CounterQuote,
						com.tools20022.repository.codeset.QuoteResponseType1Code.Expired, com.tools20022.repository.codeset.QuoteResponseType1Code.Cover, com.tools20022.repository.codeset.QuoteResponseType1Code.DoneAway,
						com.tools20022.repository.codeset.QuoteResponseType1Code.Pass);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(HitLift.getCodeName().get(), HitLift);
		codesByName.put(CounterQuote.getCodeName().get(), CounterQuote);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Cover.getCodeName().get(), Cover);
		codesByName.put(DoneAway.getCodeName().get(), DoneAway);
		codesByName.put(Pass.getCodeName().get(), Pass);
	}

	public static QuoteResponseType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteResponseType1Code[] values() {
		QuoteResponseType1Code[] values = new QuoteResponseType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteResponseType1Code> {
		@Override
		public QuoteResponseType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteResponseType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}