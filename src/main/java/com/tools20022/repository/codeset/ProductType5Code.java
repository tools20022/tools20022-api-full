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
import com.tools20022.repository.codeset.ProductType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductType5Code#EmissionAllowance
 * ProductType5Code.EmissionAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductType5Code#InterestRate
 * ProductType5Code.InterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType5Code#Equity
 * ProductType5Code.Equity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType5Code#Commodity
 * ProductType5Code.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType5Code#Credit
 * ProductType5Code.Credit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType5Code#Currency
 * ProductType5Code.Currency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductTypeV2Code
 * ProductTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying type of product or financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * </ul>
	 */
	public static final ProductType5Code EmissionAllowance = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.EmissionAllowance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * </ul>
	 */
	public static final ProductType5Code InterestRate = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.InterestRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final ProductType5Code Equity = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * </ul>
	 */
	public static final ProductType5Code Commodity = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.Commodity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final ProductType5Code Credit = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * </ul>
	 */
	public static final ProductType5Code Currency = new ProductType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType5Code.mmObject();
			codeName = ProductTypeV2Code.Currency.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProductType5Code> codesByName = new LinkedHashMap<>();

	protected ProductType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductType5Code";
				definition = "Specifies the underlying type of product or financial instrument.";
				trace_lazy = () -> ProductTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductType5Code.EmissionAllowance, com.tools20022.repository.codeset.ProductType5Code.InterestRate,
						com.tools20022.repository.codeset.ProductType5Code.Equity, com.tools20022.repository.codeset.ProductType5Code.Commodity, com.tools20022.repository.codeset.ProductType5Code.Credit,
						com.tools20022.repository.codeset.ProductType5Code.Currency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EmissionAllowance.getCodeName().get(), EmissionAllowance);
		codesByName.put(InterestRate.getCodeName().get(), InterestRate);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(Currency.getCodeName().get(), Currency);
	}

	public static ProductType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductType5Code[] values() {
		ProductType5Code[] values = new ProductType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductType5Code> {
		@Override
		public ProductType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}