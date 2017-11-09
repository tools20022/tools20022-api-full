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
import com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the seniority type of a specific debt instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
 * DebtInstrumentSeniorityTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code#mmSubordinatedDebt
 * DebtInstrumentSeniorityType1Code.mmSubordinatedDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code#mmSeniorDebt
 * DebtInstrumentSeniorityType1Code.mmSeniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code#mmMezzanineDebt
 * DebtInstrumentSeniorityType1Code.mmMezzanineDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code#mmJuniorDebt
 * DebtInstrumentSeniorityType1Code.mmJuniorDebt}</li>
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
 * "DebtInstrumentSeniorityType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the seniority type of a specific debt instrument."</li>
 * </ul>
 */
public class DebtInstrumentSeniorityType1Code extends DebtInstrumentSeniorityTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code
	 * DebtInstrumentSeniorityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedDebt"</li>
	 * </ul>
	 */
	public static final MMCode mmSubordinatedDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedDebt";
			owner_lazy = () -> DebtInstrumentSeniorityType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code
	 * DebtInstrumentSeniorityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeniorDebt"</li>
	 * </ul>
	 */
	public static final MMCode mmSeniorDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorDebt";
			owner_lazy = () -> DebtInstrumentSeniorityType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code
	 * DebtInstrumentSeniorityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MezzanineDebt"</li>
	 * </ul>
	 */
	public static final MMCode mmMezzanineDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MezzanineDebt";
			owner_lazy = () -> DebtInstrumentSeniorityType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code
	 * DebtInstrumentSeniorityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JuniorDebt"</li>
	 * </ul>
	 */
	public static final MMCode mmJuniorDebt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JuniorDebt";
			owner_lazy = () -> DebtInstrumentSeniorityType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebtInstrumentSeniorityType1Code";
				definition = "Specifies the seniority type of a specific debt instrument.";
				code_lazy = () -> Arrays.asList(DebtInstrumentSeniorityType1Code.mmSubordinatedDebt, DebtInstrumentSeniorityType1Code.mmSeniorDebt, DebtInstrumentSeniorityType1Code.mmMezzanineDebt,
						DebtInstrumentSeniorityType1Code.mmJuniorDebt);
				trace_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}