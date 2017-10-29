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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Qualifies the nature of response to a previoulsy addressed quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#HitLift
 * QuoteResponseTypeCode.HitLift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#CounterQuote
 * QuoteResponseTypeCode.CounterQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#Expired
 * QuoteResponseTypeCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#Cover
 * QuoteResponseTypeCode.Cover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#DoneAway
 * QuoteResponseTypeCode.DoneAway}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode#Pass
 * QuoteResponseTypeCode.Pass}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteResponseType1Code
 * QuoteResponseType1Code}</li>
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
 * <li>"HILI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteResponseTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Qualifies the nature of response to a previoulsy addressed quote."</li>
 * </ul>
 */
public class QuoteResponseTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acceptance by a party of the conditions of a quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HILI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HitLift"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptance by a party of the conditions of a quote."</li>
	 * </ul>
	 */
	public static final MMCode HitLift = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HitLift";
			definition = "Acceptance by a party of the conditions of a quote.";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "HILI";
		}
	};
	/**
	 * Rejection of the conditions of a quote and proposition of new quote
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejection of the conditions of a quote and proposition of new quote details."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CounterQuote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterQuote";
			definition = "Rejection of the conditions of a quote and proposition of new quote details.";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	/**
	 * Rejection of the conditions of a quote due to its expiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejection of the conditions of a quote due to its expiry."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Rejection of the conditions of a quote due to its expiry.";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Purchase of a contract to offset a previously established short position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase of a contract to offset a previously established short position."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Cover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cover";
			definition = "Purchase of a contract to offset a previously established short position.";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "COVE";
		}
	};
	/**
	 * Trade completed with a third party, counter-party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoneAway"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade completed with a third party, counter-party."</li>
	 * </ul>
	 */
	public static final MMCode DoneAway = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoneAway";
			definition = "Trade completed with a third party, counter-party.";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "DONE";
		}
	};
	/**
	 * Rejection of the conditions of a quote because the offer is being
	 * declined
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteResponseTypeCode
	 * QuoteResponseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejection of the conditions of a quote because the offer is being declined"
	 * </li>
	 * </ul>
	 */
	public static final MMCode Pass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Rejection of the conditions of a quote because the offer is being declined";
			owner_lazy = () -> QuoteResponseTypeCode.mmObject();
			codeName = "PASS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HILI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuoteResponseTypeCode";
				definition = "Qualifies the nature of response to a previoulsy addressed quote.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteResponseTypeCode.HitLift, com.tools20022.repository.codeset.QuoteResponseTypeCode.CounterQuote,
						com.tools20022.repository.codeset.QuoteResponseTypeCode.Expired, com.tools20022.repository.codeset.QuoteResponseTypeCode.Cover, com.tools20022.repository.codeset.QuoteResponseTypeCode.DoneAway,
						com.tools20022.repository.codeset.QuoteResponseTypeCode.Pass);
				derivation_lazy = () -> Arrays.asList(QuoteResponseType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}