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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the category of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductCategory1Code
 * ProductCategory1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#mmHarmonizedTariffCodeName
 * ProductCategoryCode.mmHarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#mmQuotaCategory
 * ProductCategoryCode.mmQuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#mmProductGroup
 * ProductCategoryCode.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#mmLineOfBusiness
 * ProductCategoryCode.mmLineOfBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode#mmGender
 * ProductCategoryCode.mmGender}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"HRTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of a product."</li>
 * </ul>
 */
public class ProductCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification of goods as developed by the Customs Cooperation council.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HarmonizedTariffCodeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of goods as developed by the Customs Cooperation council."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmHarmonizedTariffCodeName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HarmonizedTariffCodeName";
			definition = "Classification of goods as developed by the Customs Cooperation council.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "HRTR";
		}
	};
	/**
	 * Product identifier used by the retail industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product identifier used by the retail industry."</li>
	 * </ul>
	 */
	public static final MMCode mmQuotaCategory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotaCategory";
			definition = "Product identifier used by the retail industry.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "QOTA";
		}
	};
	/**
	 * Product Group Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product Group Code."</li>
	 * </ul>
	 */
	public static final MMCode mmProductGroup = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Product Group Code.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "PRGP";
		}
	};
	/**
	 * Line of business code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOBU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfBusiness"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line of business code."</li>
	 * </ul>
	 */
	public static final MMCode mmLineOfBusiness = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineOfBusiness";
			definition = "Line of business code.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "LOBU";
		}
	};
	/**
	 * Code for gender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GNDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for gender."</li>
	 * </ul>
	 */
	public static final MMCode mmGender = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Code for gender.";
			owner_lazy = () -> ProductCategoryCode.mmObject();
			codeName = "GNDR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("HRTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCategoryCode";
				definition = "Specifies the category of a product.";
				code_lazy = () -> Arrays.asList(ProductCategoryCode.mmHarmonizedTariffCodeName, ProductCategoryCode.mmQuotaCategory, ProductCategoryCode.mmProductGroup, ProductCategoryCode.mmLineOfBusiness, ProductCategoryCode.mmGender);
				derivation_lazy = () -> Arrays.asList(ProductCategory1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}