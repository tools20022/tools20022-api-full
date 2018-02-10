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
import com.tools20022.repository.codeset.StandingOrderType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of standing order, such as a user defined standing order
 * or a predefined liquidity transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderType1Code#UserDefinedStandingOrder
 * StandingOrderType1Code.UserDefinedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingOrderType1Code#PredefinedStandingOrder
 * StandingOrderType1Code.PredefinedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode
 * StandingOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"USTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of standing order, such as a user defined standing order or a predefined liquidity transfer."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingOrderType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderType1Code
	 * StandingOrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedStandingOrder"</li>
	 * </ul>
	 */
	public static final StandingOrderType1Code UserDefinedStandingOrder = new StandingOrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedStandingOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderType1Code.mmObject();
			codeName = StandingOrderTypeCode.UserDefinedStandingOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderType1Code
	 * StandingOrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PredefinedStandingOrder"</li>
	 * </ul>
	 */
	public static final StandingOrderType1Code PredefinedStandingOrder = new StandingOrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PredefinedStandingOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingOrderType1Code.mmObject();
			codeName = StandingOrderTypeCode.PredefinedStandingOrder.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StandingOrderType1Code> codesByName = new LinkedHashMap<>();

	protected StandingOrderType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("USTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrderType1Code";
				definition = "Specifies the type of standing order, such as a user defined standing order or a predefined liquidity transfer.";
				trace_lazy = () -> StandingOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderType1Code.UserDefinedStandingOrder, com.tools20022.repository.codeset.StandingOrderType1Code.PredefinedStandingOrder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UserDefinedStandingOrder.getCodeName().get(), UserDefinedStandingOrder);
		codesByName.put(PredefinedStandingOrder.getCodeName().get(), PredefinedStandingOrder);
	}

	public static StandingOrderType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingOrderType1Code[] values() {
		StandingOrderType1Code[] values = new StandingOrderType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingOrderType1Code> {
		@Override
		public StandingOrderType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingOrderType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}