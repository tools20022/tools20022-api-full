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
import com.tools20022.repository.codeset.ProductIdentifierCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of identifier of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
 * ProductIdentifierCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmBuyersItemNumber
 * ProductIdentifier2Code.mmBuyersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmCommercialDescriptionCodeName
 * ProductIdentifier2Code.mmCommercialDescriptionCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmEAN
 * ProductIdentifier2Code.mmEAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmHarmonizedTariffCodeName
 * ProductIdentifier2Code.mmHarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmManufacturersItemNumber
 * ProductIdentifier2Code.mmManufacturersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmModelNumber
 * ProductIdentifier2Code.mmModelNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmPartNumber
 * ProductIdentifier2Code.mmPartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmQuotaCategory
 * ProductIdentifier2Code.mmQuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmStyleNumber
 * ProductIdentifier2Code.mmStyleNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmSuppliersItemNumber
 * ProductIdentifier2Code.mmSuppliersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#mmUniversalProductCode
 * ProductIdentifier2Code.mmUniversalProductCode}</li>
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
 * <li>"BINR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductIdentifier2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of identifier of a product."</li>
 * </ul>
 */
public class ProductIdentifier2Code extends ProductIdentifierCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersItemNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmBuyersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyersItemNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDescriptionCodeName"</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialDescriptionCodeName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDescriptionCodeName";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EAN"</li>
	 * </ul>
	 */
	public static final MMCode mmEAN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EAN";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HarmonizedTariffCodeName"</li>
	 * </ul>
	 */
	public static final MMCode mmHarmonizedTariffCodeName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HarmonizedTariffCodeName";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturersItemNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmManufacturersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturersItemNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmModelNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModelNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmPartNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotaCategory"</li>
	 * </ul>
	 */
	public static final MMCode mmQuotaCategory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotaCategory";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StyleNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmStyleNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StyleNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuppliersItemNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmSuppliersItemNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuppliersItemNumber";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniversalProductCode"</li>
	 * </ul>
	 */
	public static final MMCode mmUniversalProductCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniversalProductCode";
			owner_lazy = () -> ProductIdentifier2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BINR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifier2Code";
				definition = "Specifies the type of identifier of a product.";
				code_lazy = () -> Arrays.asList(ProductIdentifier2Code.mmBuyersItemNumber, ProductIdentifier2Code.mmCommercialDescriptionCodeName, ProductIdentifier2Code.mmEAN, ProductIdentifier2Code.mmHarmonizedTariffCodeName,
						ProductIdentifier2Code.mmManufacturersItemNumber, ProductIdentifier2Code.mmModelNumber, ProductIdentifier2Code.mmPartNumber, ProductIdentifier2Code.mmQuotaCategory, ProductIdentifier2Code.mmStyleNumber,
						ProductIdentifier2Code.mmSuppliersItemNumber, ProductIdentifier2Code.mmUniversalProductCode);
				trace_lazy = () -> ProductIdentifierCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}