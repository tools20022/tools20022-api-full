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
import com.tools20022.repository.codeset.ExecutionTimeLimitCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates from/until when an order must be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
 * ExecutionTimeLimitCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmAtTheOpening
 * ExecutionTimeLimit1Code.mmAtTheOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmAtTheClosing
 * ExecutionTimeLimit1Code.mmAtTheClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodForTheDay
 * ExecutionTimeLimit1Code.mmGoodForTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodUntilCancelled
 * ExecutionTimeLimit1Code.mmGoodUntilCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodThroughDate
 * ExecutionTimeLimit1Code.mmGoodThroughDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodForTheMonth
 * ExecutionTimeLimit1Code.mmGoodForTheMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmFillOrKill
 * ExecutionTimeLimit1Code.mmFillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodUntilTheEndOfNextMonth
 * ExecutionTimeLimit1Code.mmGoodUntilTheEndOfNextMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmGoodTillCrossed
 * ExecutionTimeLimit1Code.mmGoodTillCrossed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#mmImmediateOrCancel
 * ExecutionTimeLimit1Code.mmImmediateOrCancel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExecutionTimeLimit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates from/until when an order must be executed."</li>
 * </ul>
 */
public class ExecutionTimeLimit1Code extends ExecutionTimeLimitCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheOpening"</li>
	 * </ul>
	 */
	public static final MMCode mmAtTheOpening = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheOpening";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheClosing"</li>
	 * </ul>
	 */
	public static final MMCode mmAtTheClosing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheClosing";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheDay"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodForTheDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheDay";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilCancelled"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodUntilCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilCancelled";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodThroughDate"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodThroughDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodThroughDate";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheMonth"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodForTheMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheMonth";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * </ul>
	 */
	public static final MMCode mmFillOrKill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilTheEndOfNextMonth"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodUntilTheEndOfNextMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilTheEndOfNextMonth";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillCrossed"</li>
	 * </ul>
	 */
	public static final MMCode mmGoodTillCrossed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillCrossed";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * </ul>
	 */
	public static final MMCode mmImmediateOrCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			owner_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutionTimeLimit1Code";
				definition = "Indicates from/until when an order must be executed.";
				code_lazy = () -> Arrays.asList(ExecutionTimeLimit1Code.mmAtTheOpening, ExecutionTimeLimit1Code.mmAtTheClosing, ExecutionTimeLimit1Code.mmGoodForTheDay, ExecutionTimeLimit1Code.mmGoodUntilCancelled,
						ExecutionTimeLimit1Code.mmGoodThroughDate, ExecutionTimeLimit1Code.mmGoodForTheMonth, ExecutionTimeLimit1Code.mmFillOrKill, ExecutionTimeLimit1Code.mmGoodUntilTheEndOfNextMonth,
						ExecutionTimeLimit1Code.mmGoodTillCrossed, ExecutionTimeLimit1Code.mmImmediateOrCancel);
				trace_lazy = () -> ExecutionTimeLimitCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}