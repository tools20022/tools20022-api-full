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
import com.tools20022.repository.codeset.CardFallback1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Information about card entry mode fallback.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code#FallbackAfterFailure
 * CardFallback1Code.FallbackAfterFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code#FallbackAfterSuccess
 * CardFallback1Code.FallbackAfterSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code#NoFallback
 * CardFallback1Code.NoFallback}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode
 * CardFallbackCode}</li>
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
 * "CardFallback1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about card entry mode fallback."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardFallback1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code
	 * CardFallback1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackAfterFailure"</li>
	 * </ul>
	 */
	public static final CardFallback1Code FallbackAfterFailure = new CardFallback1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackAfterFailure";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallback1Code.mmObject();
			codeName = CardFallbackCode.FallbackAfterFailure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code
	 * CardFallback1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackAfterSuccess"</li>
	 * </ul>
	 */
	public static final CardFallback1Code FallbackAfterSuccess = new CardFallback1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackAfterSuccess";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallback1Code.mmObject();
			codeName = CardFallbackCode.FallbackAfterSuccess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code
	 * CardFallback1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFallback"</li>
	 * </ul>
	 */
	public static final CardFallback1Code NoFallback = new CardFallback1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFallback";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallback1Code.mmObject();
			codeName = CardFallbackCode.NoFallback.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardFallback1Code> codesByName = new LinkedHashMap<>();

	protected CardFallback1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardFallback1Code";
				definition = "Information about card entry mode fallback.";
				trace_lazy = () -> CardFallbackCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardFallback1Code.FallbackAfterFailure, com.tools20022.repository.codeset.CardFallback1Code.FallbackAfterSuccess,
						com.tools20022.repository.codeset.CardFallback1Code.NoFallback);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FallbackAfterFailure.getCodeName().get(), FallbackAfterFailure);
		codesByName.put(FallbackAfterSuccess.getCodeName().get(), FallbackAfterSuccess);
		codesByName.put(NoFallback.getCodeName().get(), NoFallback);
	}

	public static CardFallback1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardFallback1Code[] values() {
		CardFallback1Code[] values = new CardFallback1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardFallback1Code> {
		@Override
		public CardFallback1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardFallback1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}