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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the collateral type against which all repurchase agreements are
 * conducted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#mmGeneralCollateral
 * SpecialCollateralCode.mmGeneralCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#mmSpecialCollateral
 * SpecialCollateralCode.mmSpecialCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#mmMatchedAndReverseRepurchaseAgreement
 * SpecialCollateralCode.mmMatchedAndReverseRepurchaseAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SpecialCollateral1Code
 * SpecialCollateral1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SpecialCollateral2Code
 * SpecialCollateral2Code}</li>
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
 * "SpecialCollateralCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the collateral type against which all repurchase agreements are conducted."
 * </li>
 * </ul>
 */
public class SpecialCollateralCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies that all repurchase agreements are conducted against general
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode
	 * SpecialCollateralCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that all repurchase agreements are conducted against general collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGeneralCollateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralCollateral";
			definition = "Identifies that all repurchase agreements are conducted against general collateral.";
			owner_lazy = () -> SpecialCollateralCode.mmObject();
			codeName = "GENE";
		}
	};
	/**
	 * Identifies that all repurchase agreements are conducted against special
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode
	 * SpecialCollateralCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that all repurchase agreements are conducted against special collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCollateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCollateral";
			definition = "Identifies that all repurchase agreements are conducted against special collateral.";
			owner_lazy = () -> SpecialCollateralCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Identifies that this is a securities lending transaction, made of
	 * repurchase agreements and reverse repurchase agreements versus cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode
	 * SpecialCollateralCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedAndReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that this is a securities lending transaction, made of repurchase agreements and reverse repurchase agreements versus cash."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMatchedAndReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedAndReverseRepurchaseAgreement";
			definition = "Identifies that this is a securities lending transaction, made of repurchase agreements and reverse repurchase agreements versus cash.";
			owner_lazy = () -> SpecialCollateralCode.mmObject();
			codeName = "MRRP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecialCollateralCode";
				definition = "Specifies the collateral type against which all repurchase agreements are conducted.";
				code_lazy = () -> Arrays.asList(SpecialCollateralCode.mmGeneralCollateral, SpecialCollateralCode.mmSpecialCollateral, SpecialCollateralCode.mmMatchedAndReverseRepurchaseAgreement);
				derivation_lazy = () -> Arrays.asList(SpecialCollateral1Code.mmObject(), SpecialCollateral2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}