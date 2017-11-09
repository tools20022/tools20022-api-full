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
import com.tools20022.repository.codeset.FractionalSecurityRuleCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the fractional security handling rule that does not have an ISO
 * value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode
 * FractionalSecurityRuleCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#mmBeneficialOwnerRoundUpXAndAbove
 * FractionalSecurityRule1Code.mmBeneficialOwnerRoundUpXAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#mmBeneficialOwnerCashInLieu
 * FractionalSecurityRule1Code.mmBeneficialOwnerCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#mmBeneficialOwnerRoundDownXAndBelow
 * FractionalSecurityRule1Code.mmBeneficialOwnerRoundDownXAndBelow}</li>
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
 * <li>"BORU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionalSecurityRule1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the fractional security handling rule that does not have an ISO value."
 * </li>
 * </ul>
 */
public class FractionalSecurityRule1Code extends FractionalSecurityRuleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundUpXAndAbove"</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerRoundUpXAndAbove = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundUpXAndAbove";
			owner_lazy = () -> FractionalSecurityRule1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerCashInLieu"</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerCashInLieu = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerCashInLieu";
			owner_lazy = () -> FractionalSecurityRule1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundDownXAndBelow"</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerRoundDownXAndBelow = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundDownXAndBelow";
			owner_lazy = () -> FractionalSecurityRule1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionalSecurityRule1Code";
				definition = "Specifies the fractional security handling rule that does not have an ISO value.";
				code_lazy = () -> Arrays.asList(FractionalSecurityRule1Code.mmBeneficialOwnerRoundUpXAndAbove, FractionalSecurityRule1Code.mmBeneficialOwnerCashInLieu, FractionalSecurityRule1Code.mmBeneficialOwnerRoundDownXAndBelow);
				trace_lazy = () -> FractionalSecurityRuleCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}