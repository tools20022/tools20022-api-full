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
 * Defines the query type for standing orders queries, that identifies the
 * predefined key attributes expected in the response to the query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#mmStandingOrderList
 * StandingOrderQueryTypeCode.mmStandingOrderList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#mmStandingOrderDetails
 * StandingOrderQueryTypeCode.mmStandingOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#mmTotalAmountPerStandingOrder
 * StandingOrderQueryTypeCode.mmTotalAmountPerStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#mmStandingOrderLinkSetList
 * StandingOrderQueryTypeCode.mmStandingOrderLinkSetList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#mmStandingOrderDetailsWithinLinkSet
 * StandingOrderQueryTypeCode.mmStandingOrderDetailsWithinLinkSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
 * StandingOrderQueryType1Code}</li>
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
 * <li>"SLST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderQueryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the query type for standing orders queries, that identifies the predefined key attributes expected in the response to the query."
 * </li>
 * </ul>
 */
public class StandingOrderQueryTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Used to query the list of liquidity transfer standing orders defined in
	 * the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
	 * StandingOrderQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to query the list of liquidity transfer standing orders defined in the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStandingOrderList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderList";
			definition = "Used to query the list of liquidity transfer standing orders defined in the system.";
			owner_lazy = () -> StandingOrderQueryTypeCode.mmObject();
			codeName = "SLST";
		}
	};
	/**
	 * Used to query a specific liquidity transfer standing order based on a set
	 * of search criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
	 * StandingOrderQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to query a specific liquidity transfer standing order based on a set of search criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStandingOrderDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetails";
			definition = "Used to query a specific liquidity transfer standing order based on a set of search criteria.";
			owner_lazy = () -> StandingOrderQueryTypeCode.mmObject();
			codeName = "SDTL";
		}
	};
	/**
	 * Used to query the total amounts of predefined and user defined liquidity
	 * transfer standing orders for both defined and not yet executed orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
	 * StandingOrderQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountPerStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to query the total amounts of predefined and user defined liquidity transfer standing orders for both defined and not yet executed orders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalAmountPerStandingOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountPerStandingOrder";
			definition = "Used to query the total amounts of predefined and user defined liquidity transfer standing orders for both defined and not yet executed orders.";
			owner_lazy = () -> StandingOrderQueryTypeCode.mmObject();
			codeName = "TAPS";
		}
	};
	/**
	 * Used to query the list of liquidity transfer standing orders defined in a
	 * specific link set of sequenced standing orders. The link set is a
	 * collection of standing order defined in a specific sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
	 * StandingOrderQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderLinkSetList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to query the list of liquidity transfer standing orders defined in a specific link set of sequenced standing orders. The link set is a collection of standing order defined in a specific sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStandingOrderLinkSetList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderLinkSetList";
			definition = "Used to query the list of liquidity transfer standing orders defined in a specific link set of sequenced standing orders. The link set is a collection of standing order defined in a specific sequence.";
			owner_lazy = () -> StandingOrderQueryTypeCode.mmObject();
			codeName = "SLSL";
		}
	};
	/**
	 * Used to query a specific standing order within a link set of sequenced
	 * liquidity transfer standing orders. The link set is a collection of
	 * standing order defined in a specific sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
	 * StandingOrderQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderDetailsWithinLinkSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to query a specific standing order within a link set of sequenced liquidity transfer standing orders. The link set is a collection of standing order defined in a specific sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStandingOrderDetailsWithinLinkSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetailsWithinLinkSet";
			definition = "Used to query a specific standing order within a link set of sequenced liquidity transfer standing orders. The link set is a collection of standing order defined in a specific sequence.";
			owner_lazy = () -> StandingOrderQueryTypeCode.mmObject();
			codeName = "SWLS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("SLST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingOrderQueryTypeCode";
				definition = "Defines the query type for standing orders queries, that identifies the predefined key attributes expected in the response to the query.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmStandingOrderList, com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmStandingOrderDetails,
						com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmTotalAmountPerStandingOrder, com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmStandingOrderLinkSetList,
						com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmStandingOrderDetailsWithinLinkSet);
				derivation_lazy = () -> Arrays.asList(StandingOrderQueryType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}