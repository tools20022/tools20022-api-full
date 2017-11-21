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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the business flow, in order to determine the role of the parties
 * in the business process. This indicator is very important when there are
 * multiple intermediaries in the exchange of information process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode#mmAssetstoBeDelivered
 * BusinessFlowDirectionTypeCode.mmAssetstoBeDelivered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode#mmAssetsToBeReceived
 * BusinessFlowDirectionTypeCode.mmAssetsToBeReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionType1Code
 * BusinessFlowDirectionType1Code}</li>
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
 * <li>"ADLV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessFlowDirectionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the business flow, in order to determine the role of the parties in the business process. This indicator is very important when there are multiple intermediaries in the exchange of information process."
 * </li>
 * </ul>
 */
public class BusinessFlowDirectionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Assets to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode
	 * BusinessFlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetstoBeDelivered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assets to be delivered."</li>
	 * </ul>
	 */
	public static final MMCode mmAssetstoBeDelivered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetstoBeDelivered";
			definition = "Assets to be delivered.";
			owner_lazy = () -> BusinessFlowDirectionTypeCode.mmObject();
			codeName = "ADLV";
		}
	};
	/**
	 * Assets to be received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode
	 * BusinessFlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsToBeReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assets to be received."</li>
	 * </ul>
	 */
	public static final MMCode mmAssetsToBeReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsToBeReceived";
			definition = "Assets to be received.";
			owner_lazy = () -> BusinessFlowDirectionTypeCode.mmObject();
			codeName = "ARCV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADLV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessFlowDirectionTypeCode";
				definition = "Identifies the business flow, in order to determine the role of the parties in the business process. This indicator is very important when there are multiple intermediaries in the exchange of information process.";
				code_lazy = () -> Arrays.asList(BusinessFlowDirectionTypeCode.mmAssetstoBeDelivered, BusinessFlowDirectionTypeCode.mmAssetsToBeReceived);
				derivation_lazy = () -> Arrays.asList(BusinessFlowDirectionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}