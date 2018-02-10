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
import com.tools20022.repository.codeset.ProductType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Agency
 * ProductType1Code.Agency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Commodity
 * ProductType1Code.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Corporate
 * ProductType1Code.Corporate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Currency
 * ProductType1Code.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Equity
 * ProductType1Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductType1Code#Government
 * ProductType1Code.Government}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Loan
 * ProductType1Code.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductType1Code#MoneyMarket
 * ProductType1Code.MoneyMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Mortgage
 * ProductType1Code.Mortgage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Municipal
 * ProductType1Code.Municipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductType1Code#Financing
 * ProductType1Code.Financing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
 * ProductTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * </ul>
	 */
	public static final ProductType1Code Agency = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Agency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * </ul>
	 */
	public static final ProductType1Code Commodity = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Commodity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate"</li>
	 * </ul>
	 */
	public static final ProductType1Code Corporate = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Corporate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * </ul>
	 */
	public static final ProductType1Code Currency = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Currency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * </ul>
	 */
	public static final ProductType1Code Equity = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Equity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Government"</li>
	 * </ul>
	 */
	public static final ProductType1Code Government = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Government";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Government.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * </ul>
	 */
	public static final ProductType1Code Loan = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * </ul>
	 */
	public static final ProductType1Code MoneyMarket = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.MoneyMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mortgage"</li>
	 * </ul>
	 */
	public static final ProductType1Code Mortgage = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mortgage";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Mortgage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Municipal"</li>
	 * </ul>
	 */
	public static final ProductType1Code Municipal = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Municipal";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Municipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Financing"</li>
	 * </ul>
	 */
	public static final ProductType1Code Financing = new ProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financing";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductType1Code.mmObject();
			codeName = ProductTypeCode.Financing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProductType1Code> codesByName = new LinkedHashMap<>();

	protected ProductType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductType1Code";
				definition = "Specifies the type of product or financial instrument.";
				trace_lazy = () -> ProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductType1Code.Agency, com.tools20022.repository.codeset.ProductType1Code.Commodity, com.tools20022.repository.codeset.ProductType1Code.Corporate,
						com.tools20022.repository.codeset.ProductType1Code.Currency, com.tools20022.repository.codeset.ProductType1Code.Equity, com.tools20022.repository.codeset.ProductType1Code.Government,
						com.tools20022.repository.codeset.ProductType1Code.Loan, com.tools20022.repository.codeset.ProductType1Code.MoneyMarket, com.tools20022.repository.codeset.ProductType1Code.Mortgage,
						com.tools20022.repository.codeset.ProductType1Code.Municipal, com.tools20022.repository.codeset.ProductType1Code.Financing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Corporate.getCodeName().get(), Corporate);
		codesByName.put(Currency.getCodeName().get(), Currency);
		codesByName.put(Equity.getCodeName().get(), Equity);
		codesByName.put(Government.getCodeName().get(), Government);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Mortgage.getCodeName().get(), Mortgage);
		codesByName.put(Municipal.getCodeName().get(), Municipal);
		codesByName.put(Financing.getCodeName().get(), Financing);
	}

	public static ProductType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductType1Code[] values() {
		ProductType1Code[] values = new ProductType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductType1Code> {
		@Override
		public ProductType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}