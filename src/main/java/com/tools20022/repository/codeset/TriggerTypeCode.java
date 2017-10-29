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
 * Defines when the trigger will hit, i.e. the action specified by the trigger
 * instructions will come into effect.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode#PartialExecution
 * TriggerTypeCode.PartialExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode#SpecifiedTradingSession
 * TriggerTypeCode.SpecifiedTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode#NextAuction
 * TriggerTypeCode.NextAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode#PriceMovement
 * TriggerTypeCode.PriceMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerType1Code
 * TriggerType1Code}</li>
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
 * <li>"PAEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect."
 * </li>
 * </ul>
 */
public class TriggerTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trigger Instructions come into effect in case of partial execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode
	 * TriggerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trigger Instructions come into effect in case of partial execution."</li>
	 * </ul>
	 */
	public static final MMCode PartialExecution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialExecution";
			definition = "Trigger Instructions come into effect in case of partial execution.";
			owner_lazy = () -> TriggerTypeCode.mmObject();
			codeName = "PAEX";
		}
	};
	/**
	 * Trigger Instructions come into effect at specified trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode
	 * TriggerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecifiedTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trigger Instructions come into effect at specified trading session."</li>
	 * </ul>
	 */
	public static final MMCode SpecifiedTradingSession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecifiedTradingSession";
			definition = "Trigger Instructions come into effect at specified trading session.";
			owner_lazy = () -> TriggerTypeCode.mmObject();
			codeName = "SPTS";
		}
	};
	/**
	 * Trigger Instructions come into effect at next auction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode
	 * TriggerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger Instructions come into effect at next auction."</li>
	 * </ul>
	 */
	public static final MMCode NextAuction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextAuction";
			definition = "Trigger Instructions come into effect at next auction.";
			owner_lazy = () -> TriggerTypeCode.mmObject();
			codeName = "NEAU";
		}
	};
	/**
	 * Trigger Instructions come into effect in case of price movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerTypeCode
	 * TriggerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trigger Instructions come into effect in case of price movement."</li>
	 * </ul>
	 */
	public static final MMCode PriceMovement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMovement";
			definition = "Trigger Instructions come into effect in case of price movement.";
			owner_lazy = () -> TriggerTypeCode.mmObject();
			codeName = "PRMO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PAEX");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TriggerTypeCode";
				definition = "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TriggerTypeCode.PartialExecution, com.tools20022.repository.codeset.TriggerTypeCode.SpecifiedTradingSession,
						com.tools20022.repository.codeset.TriggerTypeCode.NextAuction, com.tools20022.repository.codeset.TriggerTypeCode.PriceMovement);
				derivation_lazy = () -> Arrays.asList(TriggerType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}