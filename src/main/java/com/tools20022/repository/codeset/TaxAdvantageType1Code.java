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
import com.tools20022.repository.codeset.TaxAdvantageTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code for the form of tax advantage on the dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
 * TaxAdvantageTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code#ConcessionalGST
 * TaxAdvantageType1Code.ConcessionalGST}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code#NotApplicable
 * TaxAdvantageType1Code.NotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code#NotAvailable
 * TaxAdvantageType1Code.NotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code#Other
 * TaxAdvantageType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code#PooledDevelopmentFundRebta
 * TaxAdvantageType1Code.PooledDevelopmentFundRebta}</li>
 * </ul>
 * </li>
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
 * "TaxAdvantageType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code for the form of tax advantage on the dividend."</li>
 * </ul>
 */
public class TaxAdvantageType1Code extends TaxAdvantageTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcessionalGST"</li>
	 * </ul>
	 */
	public static final MMCode ConcessionalGST = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcessionalGST";
			owner_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * </ul>
	 */
	public static final MMCode NotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			owner_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * </ul>
	 */
	public static final MMCode NotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			owner_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PooledDevelopmentFundRebta"</li>
	 * </ul>
	 */
	public static final MMCode PooledDevelopmentFundRebta = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PooledDevelopmentFundRebta";
			owner_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxAdvantageType1Code";
				definition = "Code for the form of tax advantage on the dividend.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.TaxAdvantageType1Code.ConcessionalGST, com.tools20022.repository.codeset.TaxAdvantageType1Code.NotApplicable,
								com.tools20022.repository.codeset.TaxAdvantageType1Code.NotAvailable, com.tools20022.repository.codeset.TaxAdvantageType1Code.Other,
								com.tools20022.repository.codeset.TaxAdvantageType1Code.PooledDevelopmentFundRebta);
				trace_lazy = () -> TaxAdvantageTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}