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
import com.tools20022.repository.codeset.StandingOrderQueryType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code#StandingOrderList
 * StandingOrderQueryType1Code.StandingOrderList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code#StandingOrderDetails
 * StandingOrderQueryType1Code.StandingOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code#TotalAmountPerStandingOrder
 * StandingOrderQueryType1Code.TotalAmountPerStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code#StandingOrderLinkSetList
 * StandingOrderQueryType1Code.StandingOrderLinkSetList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code#StandingOrderDetailsWithinLinkSet
 * StandingOrderQueryType1Code.StandingOrderDetailsWithinLinkSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryTypeCode
 * StandingOrderQueryTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderQueryType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the query type for standing orders queries, that identifies the predefined key attributes expected in the response to the query."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingOrderQueryType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
	 * StandingOrderQueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StandingOrderQueryType1Code StandingOrderList = new StandingOrderQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderList";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryType1Code.mmObject();
			codeName = StandingOrderQueryTypeCode.StandingOrderList.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
	 * StandingOrderQueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StandingOrderQueryType1Code StandingOrderDetails = new StandingOrderQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryType1Code.mmObject();
			codeName = StandingOrderQueryTypeCode.StandingOrderDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
	 * StandingOrderQueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountPerStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StandingOrderQueryType1Code TotalAmountPerStandingOrder = new StandingOrderQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountPerStandingOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryType1Code.mmObject();
			codeName = StandingOrderQueryTypeCode.TotalAmountPerStandingOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
	 * StandingOrderQueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderLinkSetList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StandingOrderQueryType1Code StandingOrderLinkSetList = new StandingOrderQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderLinkSetList";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryType1Code.mmObject();
			codeName = StandingOrderQueryTypeCode.StandingOrderLinkSetList.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderQueryType1Code
	 * StandingOrderQueryType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderDetailsWithinLinkSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StandingOrderQueryType1Code StandingOrderDetailsWithinLinkSet = new StandingOrderQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderDetailsWithinLinkSet";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderQueryType1Code.mmObject();
			codeName = StandingOrderQueryTypeCode.StandingOrderDetailsWithinLinkSet.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StandingOrderQueryType1Code> codesByName = new LinkedHashMap<>();

	protected StandingOrderQueryType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SLST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderQueryType1Code";
				definition = "Defines the query type for standing orders queries, that identifies the predefined key attributes expected in the response to the query.";
				trace_lazy = () -> StandingOrderQueryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderQueryType1Code.StandingOrderList, com.tools20022.repository.codeset.StandingOrderQueryType1Code.StandingOrderDetails,
						com.tools20022.repository.codeset.StandingOrderQueryType1Code.TotalAmountPerStandingOrder, com.tools20022.repository.codeset.StandingOrderQueryType1Code.StandingOrderLinkSetList,
						com.tools20022.repository.codeset.StandingOrderQueryType1Code.StandingOrderDetailsWithinLinkSet);
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

	public static StandingOrderQueryType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingOrderQueryType1Code[] values() {
		StandingOrderQueryType1Code[] values = new StandingOrderQueryType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingOrderQueryType1Code> {
		@Override
		public StandingOrderQueryType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingOrderQueryType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}