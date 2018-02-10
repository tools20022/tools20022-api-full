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
import com.tools20022.repository.codeset.CardFallbackCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode#NoFallback
 * CardFallbackCode.NoFallback}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode#FallbackAfterSuccess
 * CardFallbackCode.FallbackAfterSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode#FallbackAfterFailure
 * CardFallbackCode.FallbackAfterFailure}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardFallback1Code
 * CardFallback1Code}</li>
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
 * "CardFallbackCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about card entry mode fallback."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardFallbackCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No card fall-back during the transaction in progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode
	 * CardFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFallback"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No card fall-back during the transaction in progress."</li>
	 * </ul>
	 */
	public static final CardFallbackCode NoFallback = new CardFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFallback";
			definition = "No card fall-back during the transaction in progress.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallbackCode.mmObject();
			codeName = "NFLB";
		}
	};
	/**
	 * Card fall-back occurred during the transaction in progress. The previous
	 * transaction on the terminal was successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode
	 * CardFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackAfterSuccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful."
	 * </li>
	 * </ul>
	 */
	public static final CardFallbackCode FallbackAfterSuccess = new CardFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackAfterSuccess";
			definition = "Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallbackCode.mmObject();
			codeName = "SFLB";
		}
	};
	/**
	 * Card fall-back occurred during the transaction in progress. The previous
	 * transaction on the terminal failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallbackCode
	 * CardFallbackCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackAfterFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed."
	 * </li>
	 * </ul>
	 */
	public static final CardFallbackCode FallbackAfterFailure = new CardFallbackCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackAfterFailure";
			definition = "Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardFallbackCode.mmObject();
			codeName = "FFLB";
		}
	};
	final static private LinkedHashMap<String, CardFallbackCode> codesByName = new LinkedHashMap<>();

	protected CardFallbackCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardFallbackCode";
				definition = "Information about card entry mode fallback.";
				derivation_lazy = () -> Arrays.asList(CardFallback1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardFallbackCode.NoFallback, com.tools20022.repository.codeset.CardFallbackCode.FallbackAfterSuccess,
						com.tools20022.repository.codeset.CardFallbackCode.FallbackAfterFailure);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoFallback.getCodeName().get(), NoFallback);
		codesByName.put(FallbackAfterSuccess.getCodeName().get(), FallbackAfterSuccess);
		codesByName.put(FallbackAfterFailure.getCodeName().get(), FallbackAfterFailure);
	}

	public static CardFallbackCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardFallbackCode[] values() {
		CardFallbackCode[] values = new CardFallbackCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardFallbackCode> {
		@Override
		public CardFallbackCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardFallbackCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}