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
import com.tools20022.repository.codeset.CategoryPurpose1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the high level purpose of the instruction based on a set of
 * pre-defined categories.<br>
 * Usage: This is used by the initiating party to provide information concerning
 * the processing of the payment. It is likely to trigger special processing by
 * any of the agents involved in the payment chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CategoryPurpose1Code#IntraCompanyPayment
 * CategoryPurpose1Code.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CategoryPurpose1Code#TradeSettlementPayment
 * CategoryPurpose1Code.TradeSettlementPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CategoryPurpose1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\r\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CategoryPurpose1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CategoryPurpose1Code
	 * CategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CategoryPurpose1Code IntraCompanyPayment = new CategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CategoryPurpose1Code
	 * CategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CategoryPurpose1Code TradeSettlementPayment = new CategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlementPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CategoryPurpose1Code.mmObject();
		}
	};
	final static private LinkedHashMap<String, CategoryPurpose1Code> codesByName = new LinkedHashMap<>();

	protected CategoryPurpose1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CategoryPurpose1Code";
				definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\r\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CategoryPurpose1Code.IntraCompanyPayment, com.tools20022.repository.codeset.CategoryPurpose1Code.TradeSettlementPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(TradeSettlementPayment.getCodeName().get(), TradeSettlementPayment);
	}

	public static CategoryPurpose1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CategoryPurpose1Code[] values() {
		CategoryPurpose1Code[] values = new CategoryPurpose1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CategoryPurpose1Code> {
		@Override
		public CategoryPurpose1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CategoryPurpose1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}