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
 * Indicates the sub status of the trade notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode#NoFlagsSet
 * StatusSubTypeCode.NoFlagsSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode#OnlySameDayFlagTrue
 * StatusSubTypeCode.OnlySameDayFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode#OnlyPendingFlagTrue
 * StatusSubTypeCode.OnlyPendingFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode#SameDayAndPendingFlagsTrue
 * StatusSubTypeCode.SameDayAndPendingFlagsTrue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusSubType1Code
 * StatusSubType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusSubType2Code
 * StatusSubType2Code}</li>
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
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusSubTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the sub status of the trade notification."</li>
 * </ul>
 */
public class StatusSubTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No flag has been set for the sub status of the trade notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
	 * StatusSubTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFlagsSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No flag has been set for the sub status of the trade notification."</li>
	 * </ul>
	 */
	public static final MMCode NoFlagsSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFlagsSet";
			definition = "No flag has been set for the sub status of the trade notification.";
			owner_lazy = () -> StatusSubTypeCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Same day flag has been set to true for the sub status of the trade
	 * notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
	 * StatusSubTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlySameDayFlagTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Same day flag has been set to true for the sub status of the trade notification."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OnlySameDayFlagTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlySameDayFlagTrue";
			definition = "Same day flag has been set to true for the sub status of the trade notification.";
			owner_lazy = () -> StatusSubTypeCode.mmObject();
			codeName = "SMDY";
		}
	};
	/**
	 * Pending flag has been set to true for the sub status of the trade
	 * notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
	 * StatusSubTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlyPendingFlagTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pending flag has been set to true for the sub status of the trade notification."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OnlyPendingFlagTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlyPendingFlagTrue";
			definition = "Pending flag has been set to true for the sub status of the trade notification.";
			owner_lazy = () -> StatusSubTypeCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Both the same day and pending flags have been set to true for the sub
	 * status of the trade notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
	 * StatusSubTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayAndPendingFlagsTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Both the same day and pending flags have been set to true for the sub status of the trade notification."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SameDayAndPendingFlagsTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayAndPendingFlagsTrue";
			definition = "Both the same day and pending flags have been set to true for the sub status of the trade notification.";
			owner_lazy = () -> StatusSubTypeCode.mmObject();
			codeName = "SDPG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusSubTypeCode";
				definition = "Indicates the sub status of the trade notification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusSubTypeCode.NoFlagsSet, com.tools20022.repository.codeset.StatusSubTypeCode.OnlySameDayFlagTrue,
						com.tools20022.repository.codeset.StatusSubTypeCode.OnlyPendingFlagTrue, com.tools20022.repository.codeset.StatusSubTypeCode.SameDayAndPendingFlagsTrue);
				derivation_lazy = () -> Arrays.asList(StatusSubType1Code.mmObject(), StatusSubType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}