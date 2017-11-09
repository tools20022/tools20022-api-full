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
import com.tools20022.repository.codeset.TypeOfDiscretionPriceCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contains the type of price to which the discretion offset is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
 * TypeOfDiscretionPriceCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmDisplayedPrice
 * TypeOfDiscretionPrice1Code.mmDisplayedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmMarketPrice
 * TypeOfDiscretionPrice1Code.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmPrimaryPrice
 * TypeOfDiscretionPrice1Code.mmPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmLocalPrimaryPrice
 * TypeOfDiscretionPrice1Code.mmLocalPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmMidpointPrice
 * TypeOfDiscretionPrice1Code.mmMidpointPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmVolumeWeightedAveragePrice
 * TypeOfDiscretionPrice1Code.mmVolumeWeightedAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#mmAveragePriceGuarantee
 * TypeOfDiscretionPrice1Code.mmAveragePriceGuarantee}</li>
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
 * <li>"DISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfDiscretionPrice1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the type of price to which the discretion offset is related to."</li>
 * </ul>
 */
public class TypeOfDiscretionPrice1Code extends TypeOfDiscretionPriceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayedPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmDisplayedPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayedPrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmMarketPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmPrimaryPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalPrimaryPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmLocalPrimaryPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalPrimaryPrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidpointPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmMidpointPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidpointPrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightedAveragePrice"</li>
	 * </ul>
	 */
	public static final MMCode mmVolumeWeightedAveragePrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePriceGuarantee"</li>
	 * </ul>
	 */
	public static final MMCode mmAveragePriceGuarantee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePriceGuarantee";
			owner_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfDiscretionPrice1Code";
				definition = "Contains the type of price to which the discretion offset is related to.";
				code_lazy = () -> Arrays.asList(TypeOfDiscretionPrice1Code.mmDisplayedPrice, TypeOfDiscretionPrice1Code.mmMarketPrice, TypeOfDiscretionPrice1Code.mmPrimaryPrice, TypeOfDiscretionPrice1Code.mmLocalPrimaryPrice,
						TypeOfDiscretionPrice1Code.mmMidpointPrice, TypeOfDiscretionPrice1Code.mmVolumeWeightedAveragePrice, TypeOfDiscretionPrice1Code.mmAveragePriceGuarantee);
				trace_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}