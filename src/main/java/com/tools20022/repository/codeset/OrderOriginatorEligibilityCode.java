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
import com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode#Eligible
 * OrderOriginatorEligibilityCode.Eligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode#Retail
 * OrderOriginatorEligibilityCode.Retail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode#Professional
 * OrderOriginatorEligibilityCode.Professional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code
 * OrderOriginatorEligibility1Code}</li>
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
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderOriginatorEligibilityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderOriginatorEligibilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Eligible counterparty - MiFID classification of counterparty. Eligible
	 * customers are the most sophisticated level of investor, able to opt out
	 * of some the protections afforded by conduct of business rules defined
	 * under MiFID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode
	 * OrderOriginatorEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligible counterparty - MiFID classification of counterparty. Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules defined under MiFID."
	 * </li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibilityCode Eligible = new OrderOriginatorEligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Eligible";
			definition = "Eligible counterparty - MiFID classification of counterparty. Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules defined under MiFID.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Retail client - MiFID classification of counterparty. Retail customers
	 * are the least sophisticated level of investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode
	 * OrderOriginatorEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Retail client - MiFID classification of counterparty. Retail customers are the least sophisticated level of investor."
	 * </li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibilityCode Retail = new OrderOriginatorEligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Retail";
			definition = "Retail client - MiFID classification of counterparty. Retail customers are the least sophisticated level of investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.mmObject();
			codeName = "RETL";
		}
	};
	/**
	 * Professional client - MiFID classification of counterparty. Professional
	 * customers are, for example, investment firms, credit institutions,
	 * insurance companies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibilityCode
	 * OrderOriginatorEligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Professional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Professional client - MiFID classification of counterparty. Professional customers are, for example, investment firms, credit institutions, insurance companies."
	 * </li>
	 * </ul>
	 */
	public static final OrderOriginatorEligibilityCode Professional = new OrderOriginatorEligibilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Professional";
			definition = "Professional client - MiFID classification of counterparty. Professional customers are, for example, investment firms, credit institutions, insurance companies.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.mmObject();
			codeName = "PROF";
		}
	};
	final static private LinkedHashMap<String, OrderOriginatorEligibilityCode> codesByName = new LinkedHashMap<>();

	protected OrderOriginatorEligibilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderOriginatorEligibilityCode";
				definition = "Specifies the type of the counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
				derivation_lazy = () -> Arrays.asList(OrderOriginatorEligibility1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.Eligible, com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.Retail,
						com.tools20022.repository.codeset.OrderOriginatorEligibilityCode.Professional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Eligible.getCodeName().get(), Eligible);
		codesByName.put(Retail.getCodeName().get(), Retail);
		codesByName.put(Professional.getCodeName().get(), Professional);
	}

	public static OrderOriginatorEligibilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderOriginatorEligibilityCode[] values() {
		OrderOriginatorEligibilityCode[] values = new OrderOriginatorEligibilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderOriginatorEligibilityCode> {
		@Override
		public OrderOriginatorEligibilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderOriginatorEligibilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}