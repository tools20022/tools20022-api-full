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
import com.tools20022.repository.codeset.ProductCharacteristicsCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the charateristics of a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristicsCode
 * ProductCharacteristicsCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmBuyersItemSpecification
 * ProductCharacteristics1Code.mmBuyersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmChassisNumber
 * ProductCharacteristics1Code.mmChassisNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmColour
 * ProductCharacteristics1Code.mmColour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmEngineDisplacement
 * ProductCharacteristics1Code.mmEngineDisplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmEngineNumber
 * ProductCharacteristics1Code.mmEngineNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmOption
 * ProductCharacteristics1Code.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmOriginCriterion
 * ProductCharacteristics1Code.mmOriginCriterion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmPercentageByVolume
 * ProductCharacteristics1Code.mmPercentageByVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmSellersItemSpecification
 * ProductCharacteristics1Code.mmSellersItemSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmSize
 * ProductCharacteristics1Code.mmSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmSizeRange
 * ProductCharacteristics1Code.mmSizeRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmSpecialRemarks
 * ProductCharacteristics1Code.mmSpecialRemarks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmStorageCode
 * ProductCharacteristics1Code.mmStorageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProductCharacteristics1Code#mmVehicleIdentificationNumber
 * ProductCharacteristics1Code.mmVehicleIdentificationNumber}</li>
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
public class ProductCharacteristics1Code extends ProductCharacteristicsCode {

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
	public static final MMCode mmBuyersItemSpecification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyersItemSpecification";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmChassisNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChassisNumber";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmColour = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Colour";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmEngineDisplacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EngineDisplacement";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmEngineNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EngineNumber";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmOriginCriterion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginCriterion";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmPercentageByVolume = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageByVolume";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmSellersItemSpecification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellersItemSpecification";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmSize = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Size";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmSizeRange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SizeRange";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmSpecialRemarks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialRemarks";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmStorageCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StorageCode";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
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
	public static final MMCode mmVehicleIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VehicleIdentificationNumber";
			owner_lazy = () -> ProductCharacteristics1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BISP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristics1Code";
				definition = "Specifies the charateristics of a product.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductCharacteristics1Code.mmBuyersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmChassisNumber,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmColour, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmEngineDisplacement,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmEngineNumber, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmOption,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmOriginCriterion, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmPercentageByVolume,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmSellersItemSpecification, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmSize,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmSizeRange, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmSpecialRemarks,
						com.tools20022.repository.codeset.ProductCharacteristics1Code.mmStorageCode, com.tools20022.repository.codeset.ProductCharacteristics1Code.mmVehicleIdentificationNumber);
				trace_lazy = () -> ProductCharacteristicsCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}