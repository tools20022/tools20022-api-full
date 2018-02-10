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
import com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the counterparties eligibility as defined by article 24
 * of the EU MiFID Directive applicable to transactions executed by investment
 * firms for eligible counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code#Eligible
 * OrderOriginatorEligibility1Code.Eligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code#Retail
 * OrderOriginatorEligibility1Code.Retail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code#Professional
 * OrderOriginatorEligibility1Code.Professional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode
 * OrderOriginatorEligibilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderOriginatorEligibility1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderOriginatorEligibility1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code
	 * OrderOriginatorEligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligible"</li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibility1Code Eligible = new OrderOriginatorEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligible";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.mmObject();
			codeName = OrderOriginatorEligibilityCode.Eligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code
	 * OrderOriginatorEligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retail"</li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibility1Code Retail = new OrderOriginatorEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retail";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.mmObject();
			codeName = OrderOriginatorEligibilityCode.Retail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code
	 * OrderOriginatorEligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Professional"</li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibility1Code Professional = new OrderOriginatorEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Professional";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.mmObject();
			codeName = OrderOriginatorEligibilityCode.Professional.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderOriginatorEligibility1Code> codesByName = new LinkedHashMap<>();

	protected OrderOriginatorEligibility1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderOriginatorEligibility1Code";
				definition = "Specifies the type of the counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
				trace_lazy = () -> OrderOriginatorEligibilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.Eligible, com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.Retail,
						com.tools20022.repository.codeset.OrderOriginatorEligibility1Code.Professional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Eligible.getCodeName().get(), Eligible);
		codesByName.put(Retail.getCodeName().get(), Retail);
		codesByName.put(Professional.getCodeName().get(), Professional);
	}

	public static OrderOriginatorEligibility1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderOriginatorEligibility1Code[] values() {
		OrderOriginatorEligibility1Code[] values = new OrderOriginatorEligibility1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderOriginatorEligibility1Code> {
		@Override
		public OrderOriginatorEligibility1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderOriginatorEligibility1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}