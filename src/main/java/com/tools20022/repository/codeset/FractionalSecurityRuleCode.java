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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the fractional security handling rule that does not have an ISO
 * value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#mmBeneficialOwnerRoundUpXAndAbove
 * FractionalSecurityRuleCode.mmBeneficialOwnerRoundUpXAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#mmBeneficialOwnerCashInLieu
 * FractionalSecurityRuleCode.mmBeneficialOwnerCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#mmBeneficialOwnerRoundDownXAndBelow
 * FractionalSecurityRuleCode.mmBeneficialOwnerRoundDownXAndBelow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
 * FractionalSecurityRule1Code}</li>
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
 * "FractionalSecurityRuleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the fractional security handling rule that does not have an ISO value."
 * </li>
 * </ul>
 */
public class FractionalSecurityRuleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Round Up x and above on the beneficial owner fractions, where x is the
	 * rounding factor. For an example if rounding factor is 0.6 this means that
	 * fractional units greater than or equal to 6 will be rounded up and less
	 * than 6 will be rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode
	 * FractionalSecurityRuleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundUpXAndAbove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round Up x and above on the beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerRoundUpXAndAbove = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundUpXAndAbove";
			definition = "Round Up x and above on the beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			owner_lazy = () -> FractionalSecurityRuleCode.mmObject();
			codeName = "BORU";
		}
	};
	/**
	 * Cash in Lieu on the beneficial owner fractions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode
	 * FractionalSecurityRuleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerCashInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash in Lieu on the beneficial owner fractions. "</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerCashInLieu = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerCashInLieu";
			definition = "Cash in Lieu on the beneficial owner fractions. ";
			owner_lazy = () -> FractionalSecurityRuleCode.mmObject();
			codeName = "BCIL";
		}
	};
	/**
	 * Round Down x and below beneficial owner fractions, where x is the
	 * rounding factor. For an example if rounding factor is 0.6 this means that
	 * fractional units greater than or equal to 6 will be rounded up and less
	 * than 6 will be rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode
	 * FractionalSecurityRuleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundDownXAndBelow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round Down x and below beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerRoundDownXAndBelow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundDownXAndBelow";
			definition = "Round Down x and below beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			owner_lazy = () -> FractionalSecurityRuleCode.mmObject();
			codeName = "BORD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BORU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FractionalSecurityRuleCode";
				definition = "Specifies the fractional security handling rule that does not have an ISO value.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmBeneficialOwnerRoundUpXAndAbove, com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmBeneficialOwnerCashInLieu,
						com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmBeneficialOwnerRoundDownXAndBelow);
				derivation_lazy = () -> Arrays.asList(FractionalSecurityRule1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}