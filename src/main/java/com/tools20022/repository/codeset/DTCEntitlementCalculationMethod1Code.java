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
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of calculation of entitlements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethodCode
 * DTCEntitlementCalculationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmStockRateFC15
 * DTCEntitlementCalculationMethod1Code.mmStockRateFC15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmCashRateFC17
 * DTCEntitlementCalculationMethod1Code.mmCashRateFC17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmStockRateFC18
 * DTCEntitlementCalculationMethod1Code.mmStockRateFC18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmStockRateXCashRateFC19
 * DTCEntitlementCalculationMethod1Code.mmStockRateXCashRateFC19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmStockRateEnableBuyUpToNextWholeShareFC20
 * DTCEntitlementCalculationMethod1Code.
 * mmStockRateEnableBuyUpToNextWholeShareFC20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code#mmSharesXStock
 * DTCEntitlementCalculationMethod1Code.mmSharesXStock}</li>
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
 * <li>"SR15"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCEntitlementCalculationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of calculation of entitlements."</li>
 * </ul>
 */
public class DTCEntitlementCalculationMethod1Code extends DTCEntitlementCalculationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC15"</li>
	 * </ul>
	 */
	public static final MMCode mmStockRateFC15 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC15";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateFC17"</li>
	 * </ul>
	 */
	public static final MMCode mmCashRateFC17 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateFC17";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateFC18"</li>
	 * </ul>
	 */
	public static final MMCode mmStockRateFC18 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateFC18";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateXCashRateFC19"</li>
	 * </ul>
	 */
	public static final MMCode mmStockRateXCashRateFC19 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateXCashRateFC19";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockRateEnableBuyUpToNextWholeShareFC20"</li>
	 * </ul>
	 */
	public static final MMCode mmStockRateEnableBuyUpToNextWholeShareFC20 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockRateEnableBuyUpToNextWholeShareFC20";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesXStock"</li>
	 * </ul>
	 */
	public static final MMCode mmSharesXStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesXStock";
			owner_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("SR15");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCEntitlementCalculationMethod1Code";
				definition = "Specifies the type of calculation of entitlements.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmStockRateFC15, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmCashRateFC17,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmStockRateFC18, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmStockRateXCashRateFC19,
						com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmStockRateEnableBuyUpToNextWholeShareFC20, com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code.mmSharesXStock);
				trace_lazy = () -> DTCEntitlementCalculationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}