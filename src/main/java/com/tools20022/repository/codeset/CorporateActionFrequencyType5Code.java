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
import com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Automatic Reinvestment of Cash distributed by accumulating funds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
 * CorporateActionFrequencyTypeV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmFinal
 * CorporateActionFrequencyType5Code.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmInterim
 * CorporateActionFrequencyType5Code.mmInterim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmReinvestment
 * CorporateActionFrequencyType5Code.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmRegular
 * CorporateActionFrequencyType5Code.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmSpecial
 * CorporateActionFrequencyType5Code.mmSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code#mmSpecialDividendWithReinvestment
 * CorporateActionFrequencyType5Code.mmSpecialDividendWithReinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionFrequencyType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Automatic Reinvestment of Cash distributed by accumulating funds."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code
 * CorporateActionFrequencyType3Code}</li>
 * </ul>
 */
public class CorporateActionFrequencyType5Code extends CorporateActionFrequencyTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#mmFinal
	 * CorporateActionFrequencyType3Code.mmFinal}</li>
	 * </ul>
	 */
	public static final MMCode mmFinal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmFinal;
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#mmInterim
	 * CorporateActionFrequencyType3Code.mmInterim}</li>
	 * </ul>
	 */
	public static final MMCode mmInterim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmInterim;
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#mmReinvestment
	 * CorporateActionFrequencyType3Code.mmReinvestment}</li>
	 * </ul>
	 */
	public static final MMCode mmReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmReinvestment;
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#mmRegular
	 * CorporateActionFrequencyType3Code.mmRegular}</li>
	 * </ul>
	 */
	public static final MMCode mmRegular = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmRegular;
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code#mmSpecial
	 * CorporateActionFrequencyType3Code.mmSpecial}</li>
	 * </ul>
	 */
	public static final MMCode mmSpecial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmSpecial;
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
	 * CorporateActionFrequencyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendWithReinvestment"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDividendWithReinvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendWithReinvestment";
			owner_lazy = () -> CorporateActionFrequencyType5Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyType5Code";
				definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
				previousVersion_lazy = () -> CorporateActionFrequencyType3Code.mmObject();
				code_lazy = () -> Arrays.asList(CorporateActionFrequencyType5Code.mmFinal, CorporateActionFrequencyType5Code.mmInterim, CorporateActionFrequencyType5Code.mmReinvestment, CorporateActionFrequencyType5Code.mmRegular,
						CorporateActionFrequencyType5Code.mmSpecial, CorporateActionFrequencyType5Code.mmSpecialDividendWithReinvestment);
				trace_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}