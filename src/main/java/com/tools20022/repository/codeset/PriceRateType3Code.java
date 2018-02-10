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
import com.tools20022.repository.codeset.PriceRateType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code#Discount
 * PriceRateType3Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceRateType3Code#Premium
 * PriceRateType3Code.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code#Percentage
 * PriceRateType3Code.Percentage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceRateType3Code#Yield
 * PriceRateType3Code.Yield}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
 * PriceValueTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DISC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceRateType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceRateType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code
	 * PriceRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final PriceRateType3Code Discount = new PriceRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceRateType3Code.mmObject();
			codeName = PriceValueTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code
	 * PriceRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final PriceRateType3Code Premium = new PriceRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceRateType3Code.mmObject();
			codeName = PriceValueTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code
	 * PriceRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * </ul>
	 */
	public static final PriceRateType3Code Percentage = new PriceRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceRateType3Code.mmObject();
			codeName = PriceValueTypeCode.Percentage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceRateType3Code
	 * PriceRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * </ul>
	 */
	public static final PriceRateType3Code Yield = new PriceRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceRateType3Code.mmObject();
			codeName = PriceValueTypeCode.Yield.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceRateType3Code> codesByName = new LinkedHashMap<>();

	protected PriceRateType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceRateType3Code";
				definition = "Specifies the type of price rate.";
				trace_lazy = () -> PriceValueTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceRateType3Code.Discount, com.tools20022.repository.codeset.PriceRateType3Code.Premium, com.tools20022.repository.codeset.PriceRateType3Code.Percentage,
						com.tools20022.repository.codeset.PriceRateType3Code.Yield);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Percentage.getCodeName().get(), Percentage);
		codesByName.put(Yield.getCodeName().get(), Yield);
	}

	public static PriceRateType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceRateType3Code[] values() {
		PriceRateType3Code[] values = new PriceRateType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceRateType3Code> {
		@Override
		public PriceRateType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceRateType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}