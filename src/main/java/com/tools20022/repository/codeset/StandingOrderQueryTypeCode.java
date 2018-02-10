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
import com.tools20022.repository.codeset.StandingOrderQueryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the query type for standing orders queries, that identifies the
 * predefined key attributes expected in the response to the query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#StandingOrderList
 * StandingOrderQueryTypeCode.StandingOrderList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#StandingOrderDetails
 * StandingOrderQueryTypeCode.StandingOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#TotalAmountPerStandingOrder
 * StandingOrderQueryTypeCode.TotalAmountPerStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#StandingOrderLinkSetList
 * StandingOrderQueryTypeCode.StandingOrderLinkSetList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode#StandingOrderDetailsWithinLinkSet
 * StandingOrderQueryTypeCode.StandingOrderDetailsWithinLinkSet}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingOrderQueryTypeCode extends MMCode {

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
	public static final StandingOrderQueryTypeCode StandingOrderList = new StandingOrderQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderList";
			definition = "Used to query the list of liquidity transfer standing orders defined in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmObject();
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
	public static final StandingOrderQueryTypeCode StandingOrderDetails = new StandingOrderQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetails";
			definition = "Used to query a specific liquidity transfer standing order based on a set of search criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmObject();
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
	public static final StandingOrderQueryTypeCode TotalAmountPerStandingOrder = new StandingOrderQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountPerStandingOrder";
			definition = "Used to query the total amounts of predefined and user defined liquidity transfer standing orders for both defined and not yet executed orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmObject();
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
	public static final StandingOrderQueryTypeCode StandingOrderLinkSetList = new StandingOrderQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderLinkSetList";
			definition = "Used to query the list of liquidity transfer standing orders defined in a specific link set of sequenced standing orders. The link set is a collection of standing order defined in a specific sequence.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmObject();
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
	public static final StandingOrderQueryTypeCode StandingOrderDetailsWithinLinkSet = new StandingOrderQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetailsWithinLinkSet";
			definition = "Used to query a specific standing order within a link set of sequenced liquidity transfer standing orders. The link set is a collection of standing order defined in a specific sequence.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryTypeCode.mmObject();
			codeName = "SWLS";
		}
	};
	final static private LinkedHashMap<String, StandingOrderQueryTypeCode> codesByName = new LinkedHashMap<>();

	protected StandingOrderQueryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SLST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderQueryTypeCode";
				definition = "Defines the query type for standing orders queries, that identifies the predefined key attributes expected in the response to the query.";
				derivation_lazy = () -> Arrays.asList(StandingOrderQueryType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderQueryTypeCode.StandingOrderList, com.tools20022.repository.codeset.StandingOrderQueryTypeCode.StandingOrderDetails,
						com.tools20022.repository.codeset.StandingOrderQueryTypeCode.TotalAmountPerStandingOrder, com.tools20022.repository.codeset.StandingOrderQueryTypeCode.StandingOrderLinkSetList,
						com.tools20022.repository.codeset.StandingOrderQueryTypeCode.StandingOrderDetailsWithinLinkSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StandingOrderList.getCodeName().get(), StandingOrderList);
		codesByName.put(StandingOrderDetails.getCodeName().get(), StandingOrderDetails);
		codesByName.put(TotalAmountPerStandingOrder.getCodeName().get(), TotalAmountPerStandingOrder);
		codesByName.put(StandingOrderLinkSetList.getCodeName().get(), StandingOrderLinkSetList);
		codesByName.put(StandingOrderDetailsWithinLinkSet.getCodeName().get(), StandingOrderDetailsWithinLinkSet);
	}

	public static StandingOrderQueryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingOrderQueryTypeCode[] values() {
		StandingOrderQueryTypeCode[] values = new StandingOrderQueryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingOrderQueryTypeCode> {
		@Override
		public StandingOrderQueryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingOrderQueryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}