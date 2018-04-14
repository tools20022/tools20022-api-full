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
import com.tools20022.repository.codeset.ProductIdentifier2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of identifier of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#BuyersItemNumber
 * ProductIdentifier2Code.BuyersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#CommercialDescriptionCodeName
 * ProductIdentifier2Code.CommercialDescriptionCodeName}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#EAN
 * ProductIdentifier2Code.EAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#HarmonizedTariffCodeName
 * ProductIdentifier2Code.HarmonizedTariffCodeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#ManufacturersItemNumber
 * ProductIdentifier2Code.ManufacturersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#ModelNumber
 * ProductIdentifier2Code.ModelNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#PartNumber
 * ProductIdentifier2Code.PartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#QuotaCategory
 * ProductIdentifier2Code.QuotaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#StyleNumber
 * ProductIdentifier2Code.StyleNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#SuppliersItemNumber
 * ProductIdentifier2Code.SuppliersItemNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code#UniversalProductCode
 * ProductIdentifier2Code.UniversalProductCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
 * ProductIdentifierCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductIdentifier2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of identifier of a product."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductIdentifier2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifier2Code
	 * ProductIdentifier2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code BuyersItemNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyersItemNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.BuyersItemNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDescriptionCodeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code CommercialDescriptionCodeName = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDescriptionCodeName";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.CommercialDescriptionCodeName.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code EAN = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EAN";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.EAN.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HarmonizedTariffCodeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code HarmonizedTariffCodeName = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HarmonizedTariffCodeName";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.HarmonizedTariffCodeName.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code ManufacturersItemNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturersItemNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.ManufacturersItemNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code ModelNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModelNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.ModelNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code PartNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.PartNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code QuotaCategory = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotaCategory";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.QuotaCategory.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StyleNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code StyleNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StyleNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.StyleNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuppliersItemNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code SuppliersItemNumber = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuppliersItemNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.SuppliersItemNumber.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniversalProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProductIdentifier2Code UniversalProductCode = new ProductIdentifier2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniversalProductCode";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductIdentifier2Code.mmObject();
			codeName = ProductIdentifierCode.UniversalProductCode.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProductIdentifier2Code> codesByName = new LinkedHashMap<>();

	protected ProductIdentifier2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BINR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifier2Code";
				definition = "Specifies the type of identifier of a product.";
				trace_lazy = () -> ProductIdentifierCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductIdentifier2Code.BuyersItemNumber, com.tools20022.repository.codeset.ProductIdentifier2Code.CommercialDescriptionCodeName,
						com.tools20022.repository.codeset.ProductIdentifier2Code.EAN, com.tools20022.repository.codeset.ProductIdentifier2Code.HarmonizedTariffCodeName,
						com.tools20022.repository.codeset.ProductIdentifier2Code.ManufacturersItemNumber, com.tools20022.repository.codeset.ProductIdentifier2Code.ModelNumber,
						com.tools20022.repository.codeset.ProductIdentifier2Code.PartNumber, com.tools20022.repository.codeset.ProductIdentifier2Code.QuotaCategory, com.tools20022.repository.codeset.ProductIdentifier2Code.StyleNumber,
						com.tools20022.repository.codeset.ProductIdentifier2Code.SuppliersItemNumber, com.tools20022.repository.codeset.ProductIdentifier2Code.UniversalProductCode);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyersItemNumber.getCodeName().get(), BuyersItemNumber);
		codesByName.put(CommercialDescriptionCodeName.getCodeName().get(), CommercialDescriptionCodeName);
		codesByName.put(EAN.getCodeName().get(), EAN);
		codesByName.put(HarmonizedTariffCodeName.getCodeName().get(), HarmonizedTariffCodeName);
		codesByName.put(ManufacturersItemNumber.getCodeName().get(), ManufacturersItemNumber);
		codesByName.put(ModelNumber.getCodeName().get(), ModelNumber);
		codesByName.put(PartNumber.getCodeName().get(), PartNumber);
		codesByName.put(QuotaCategory.getCodeName().get(), QuotaCategory);
		codesByName.put(StyleNumber.getCodeName().get(), StyleNumber);
		codesByName.put(SuppliersItemNumber.getCodeName().get(), SuppliersItemNumber);
		codesByName.put(UniversalProductCode.getCodeName().get(), UniversalProductCode);
	}

	public static ProductIdentifier2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductIdentifier2Code[] values() {
		ProductIdentifier2Code[] values = new ProductIdentifier2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductIdentifier2Code> {
		@Override
		public ProductIdentifier2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductIdentifier2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}