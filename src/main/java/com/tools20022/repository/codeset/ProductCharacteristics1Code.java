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
import com.tools20022.repository.codeset.ProductCharacteristics1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the charateristics of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#BuyersItemSpecification
 * ProductCharacteristics1Code.BuyersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#ChassisNumber
 * ProductCharacteristics1Code.ChassisNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#Colour
 * ProductCharacteristics1Code.Colour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#EngineDisplacement
 * ProductCharacteristics1Code.EngineDisplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#EngineNumber
 * ProductCharacteristics1Code.EngineNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#Option
 * ProductCharacteristics1Code.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#OriginCriterion
 * ProductCharacteristics1Code.OriginCriterion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#PercentageByVolume
 * ProductCharacteristics1Code.PercentageByVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#SellersItemSpecification
 * ProductCharacteristics1Code.SellersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#Size
 * ProductCharacteristics1Code.Size}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#SizeRange
 * ProductCharacteristics1Code.SizeRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#SpecialRemarks
 * ProductCharacteristics1Code.SpecialRemarks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#StorageCode
 * ProductCharacteristics1Code.StorageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#VehicleIdentificationNumber
 * ProductCharacteristics1Code.VehicleIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
 * ProductCharacteristicsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCharacteristics1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the charateristics of a product."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProductCharacteristics1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyersItemSpecification"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code BuyersItemSpecification = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyersItemSpecification";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.BuyersItemSpecification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChassisNumber"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code ChassisNumber = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChassisNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.ChassisNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Colour"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code Colour = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Colour";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.Colour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EngineDisplacement"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code EngineDisplacement = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EngineDisplacement";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.EngineDisplacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EngineNumber"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code EngineNumber = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EngineNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.EngineNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code Option = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.Option.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginCriterion"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code OriginCriterion = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginCriterion";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.OriginCriterion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageByVolume"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code PercentageByVolume = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageByVolume";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.PercentageByVolume.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersItemSpecification"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code SellersItemSpecification = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellersItemSpecification";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.SellersItemSpecification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Size"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code Size = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Size";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.Size.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SizeRange"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code SizeRange = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SizeRange";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.SizeRange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialRemarks"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code SpecialRemarks = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialRemarks";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.SpecialRemarks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageCode"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code StorageCode = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StorageCode";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.StorageCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code
	 * ProductCharacteristics1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VehicleIdentificationNumber"</li>
	 * </ul>
	 */
	public static final ProductCharacteristics1Code VehicleIdentificationNumber = new ProductCharacteristics1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VehicleIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ProductCharacteristics1Code.mmObject();
			codeName = ProductCharacteristicsCode.VehicleIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProductCharacteristics1Code> codesByName = new LinkedHashMap<>();

	protected ProductCharacteristics1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristics1Code";
				definition = "Specifies the charateristics of a product.";
				trace_lazy = () -> ProductCharacteristicsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCharacteristics1Code.BuyersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristics1Code.ChassisNumber,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.Colour, com.tools20022.repository.codeset.ProductCharacteristics1Code.EngineDisplacement,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.EngineNumber, com.tools20022.repository.codeset.ProductCharacteristics1Code.Option,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.OriginCriterion, com.tools20022.repository.codeset.ProductCharacteristics1Code.PercentageByVolume,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.SellersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristics1Code.Size,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.SizeRange, com.tools20022.repository.codeset.ProductCharacteristics1Code.SpecialRemarks,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.StorageCode, com.tools20022.repository.codeset.ProductCharacteristics1Code.VehicleIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyersItemSpecification.getCodeName().get(), BuyersItemSpecification);
		codesByName.put(ChassisNumber.getCodeName().get(), ChassisNumber);
		codesByName.put(Colour.getCodeName().get(), Colour);
		codesByName.put(EngineDisplacement.getCodeName().get(), EngineDisplacement);
		codesByName.put(EngineNumber.getCodeName().get(), EngineNumber);
		codesByName.put(Option.getCodeName().get(), Option);
		codesByName.put(OriginCriterion.getCodeName().get(), OriginCriterion);
		codesByName.put(PercentageByVolume.getCodeName().get(), PercentageByVolume);
		codesByName.put(SellersItemSpecification.getCodeName().get(), SellersItemSpecification);
		codesByName.put(Size.getCodeName().get(), Size);
		codesByName.put(SizeRange.getCodeName().get(), SizeRange);
		codesByName.put(SpecialRemarks.getCodeName().get(), SpecialRemarks);
		codesByName.put(StorageCode.getCodeName().get(), StorageCode);
		codesByName.put(VehicleIdentificationNumber.getCodeName().get(), VehicleIdentificationNumber);
	}

	public static ProductCharacteristics1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProductCharacteristics1Code[] values() {
		ProductCharacteristics1Code[] values = new ProductCharacteristics1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProductCharacteristics1Code> {
		@Override
		public ProductCharacteristics1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProductCharacteristics1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}