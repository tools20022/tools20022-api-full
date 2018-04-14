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
import com.tools20022.repository.codeset.SpecialCollateralCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the collateral type against which all repurchase agreements are
 * conducted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#GeneralCollateral
 * SpecialCollateralCode.GeneralCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#SpecialCollateral
 * SpecialCollateralCode.SpecialCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode#MatchedAndReverseRepurchaseAgreement
 * SpecialCollateralCode.MatchedAndReverseRepurchaseAgreement}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SpecialCollateralCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the collateral type against which all repurchase agreements are conducted."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SpecialCollateralCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that all repurchase agreements are conducted against general collateral."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialCollateralCode GeneralCollateral = new SpecialCollateralCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralCollateral";
			definition = "Identifies that all repurchase agreements are conducted against general collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialCollateralCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that all repurchase agreements are conducted against special collateral."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialCollateralCode SpecialCollateral = new SpecialCollateralCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCollateral";
			definition = "Identifies that all repurchase agreements are conducted against special collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialCollateralCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedAndReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that this is a securities lending transaction, made of repurchase agreements and reverse repurchase agreements versus cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialCollateralCode MatchedAndReverseRepurchaseAgreement = new SpecialCollateralCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedAndReverseRepurchaseAgreement";
			definition = "Identifies that this is a securities lending transaction, made of repurchase agreements and reverse repurchase agreements versus cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialCollateralCode.mmObject();
			codeName = "MRRP";
		}
	};
	final static private LinkedHashMap<String, SpecialCollateralCode> codesByName = new LinkedHashMap<>();

	protected SpecialCollateralCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecialCollateralCode";
				definition = "Specifies the collateral type against which all repurchase agreements are conducted.";
				derivation_lazy = () -> Arrays.asList(SpecialCollateral1Code.mmObject(), SpecialCollateral2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SpecialCollateralCode.GeneralCollateral, com.tools20022.repository.codeset.SpecialCollateralCode.SpecialCollateral,
						com.tools20022.repository.codeset.SpecialCollateralCode.MatchedAndReverseRepurchaseAgreement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GeneralCollateral.getCodeName().get(), GeneralCollateral);
		codesByName.put(SpecialCollateral.getCodeName().get(), SpecialCollateral);
		codesByName.put(MatchedAndReverseRepurchaseAgreement.getCodeName().get(), MatchedAndReverseRepurchaseAgreement);
	}

	public static SpecialCollateralCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SpecialCollateralCode[] values() {
		SpecialCollateralCode[] values = new SpecialCollateralCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SpecialCollateralCode> {
		@Override
		public SpecialCollateralCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SpecialCollateralCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}