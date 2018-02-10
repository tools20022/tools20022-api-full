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
import com.tools20022.repository.codeset.AmountPriceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the amount price type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code#ActualAmount
 * AmountPriceType1Code.ActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code#Discount
 * AmountPriceType1Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountPriceType1Code#Lot
 * AmountPriceType1Code.Lot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code#Premium
 * AmountPriceType1Code.Premium}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
 * AmountPriceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountPriceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the amount price type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountPriceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code
	 * AmountPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * </ul>
	 */
	public static final AmountPriceType1Code ActualAmount = new AmountPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceType1Code.mmObject();
			codeName = AmountPriceTypeCode.ActualAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code
	 * AmountPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final AmountPriceType1Code Discount = new AmountPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceType1Code.mmObject();
			codeName = AmountPriceTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code
	 * AmountPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * </ul>
	 */
	public static final AmountPriceType1Code Lot = new AmountPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lot";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceType1Code.mmObject();
			codeName = AmountPriceTypeCode.Lot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code
	 * AmountPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final AmountPriceType1Code Premium = new AmountPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceType1Code.mmObject();
			codeName = AmountPriceTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AmountPriceType1Code> codesByName = new LinkedHashMap<>();

	protected AmountPriceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountPriceType1Code";
				definition = "Specifies the amount price type.";
				trace_lazy = () -> AmountPriceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountPriceType1Code.ActualAmount, com.tools20022.repository.codeset.AmountPriceType1Code.Discount,
						com.tools20022.repository.codeset.AmountPriceType1Code.Lot, com.tools20022.repository.codeset.AmountPriceType1Code.Premium);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActualAmount.getCodeName().get(), ActualAmount);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Lot.getCodeName().get(), Lot);
		codesByName.put(Premium.getCodeName().get(), Premium);
	}

	public static AmountPriceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountPriceType1Code[] values() {
		AmountPriceType1Code[] values = new AmountPriceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountPriceType1Code> {
		@Override
		public AmountPriceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountPriceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}