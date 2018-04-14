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
import com.tools20022.repository.codeset.OrderQuantityType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the order is placed, for example by quantity of units or by
 * amount of money.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code#Unit
 * OrderQuantityType3Code.Unit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code#Amount
 * OrderQuantityType3Code.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code#UnitsOfMeasurePerTimeUnit
 * OrderQuantityType3Code.UnitsOfMeasurePerTimeUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
 * OrderQuantityTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderQuantityType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the order is placed, for example by quantity of units or by amount of money."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderQuantityType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code
	 * OrderQuantityType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OrderQuantityType3Code Unit = new OrderQuantityType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderQuantityType3Code.mmObject();
			codeName = OrderQuantityTypeCode.Unit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code
	 * OrderQuantityType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OrderQuantityType3Code Amount = new OrderQuantityType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderQuantityType3Code.mmObject();
			codeName = OrderQuantityTypeCode.Amount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType3Code
	 * OrderQuantityType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsOfMeasurePerTimeUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OrderQuantityType3Code UnitsOfMeasurePerTimeUnit = new OrderQuantityType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsOfMeasurePerTimeUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderQuantityType3Code.mmObject();
			codeName = OrderQuantityTypeCode.UnitsOfMeasurePerTimeUnit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderQuantityType3Code> codesByName = new LinkedHashMap<>();

	protected OrderQuantityType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderQuantityType3Code";
				definition = "Specifies how the order is placed, for example by quantity of units or by amount of money.";
				trace_lazy = () -> OrderQuantityTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderQuantityType3Code.Unit, com.tools20022.repository.codeset.OrderQuantityType3Code.Amount,
						com.tools20022.repository.codeset.OrderQuantityType3Code.UnitsOfMeasurePerTimeUnit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Unit.getCodeName().get(), Unit);
		codesByName.put(Amount.getCodeName().get(), Amount);
		codesByName.put(UnitsOfMeasurePerTimeUnit.getCodeName().get(), UnitsOfMeasurePerTimeUnit);
	}

	public static OrderQuantityType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderQuantityType3Code[] values() {
		OrderQuantityType3Code[] values = new OrderQuantityType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderQuantityType3Code> {
		@Override
		public OrderQuantityType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderQuantityType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}