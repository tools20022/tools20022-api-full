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
import com.tools20022.repository.codeset.FractionalSecurityRuleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the fractional security handling rule that does not have an ISO
 * value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#BeneficialOwnerRoundUpXAndAbove
 * FractionalSecurityRuleCode.BeneficialOwnerRoundUpXAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#BeneficialOwnerCashInLieu
 * FractionalSecurityRuleCode.BeneficialOwnerCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode#BeneficialOwnerRoundDownXAndBelow
 * FractionalSecurityRuleCode.BeneficialOwnerRoundDownXAndBelow}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FractionalSecurityRuleCode extends MMCode {

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
	public static final FractionalSecurityRuleCode BeneficialOwnerRoundUpXAndAbove = new FractionalSecurityRuleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundUpXAndAbove";
			definition = "Round Up x and above on the beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmObject();
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
	public static final FractionalSecurityRuleCode BeneficialOwnerCashInLieu = new FractionalSecurityRuleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerCashInLieu";
			definition = "Cash in Lieu on the beneficial owner fractions. ";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmObject();
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
	public static final FractionalSecurityRuleCode BeneficialOwnerRoundDownXAndBelow = new FractionalSecurityRuleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundDownXAndBelow";
			definition = "Round Down x and below beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRuleCode.mmObject();
			codeName = "BORD";
		}
	};
	final static private LinkedHashMap<String, FractionalSecurityRuleCode> codesByName = new LinkedHashMap<>();

	protected FractionalSecurityRuleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionalSecurityRuleCode";
				definition = "Specifies the fractional security handling rule that does not have an ISO value.";
				derivation_lazy = () -> Arrays.asList(FractionalSecurityRule1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionalSecurityRuleCode.BeneficialOwnerRoundUpXAndAbove, com.tools20022.repository.codeset.FractionalSecurityRuleCode.BeneficialOwnerCashInLieu,
						com.tools20022.repository.codeset.FractionalSecurityRuleCode.BeneficialOwnerRoundDownXAndBelow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BeneficialOwnerRoundUpXAndAbove.getCodeName().get(), BeneficialOwnerRoundUpXAndAbove);
		codesByName.put(BeneficialOwnerCashInLieu.getCodeName().get(), BeneficialOwnerCashInLieu);
		codesByName.put(BeneficialOwnerRoundDownXAndBelow.getCodeName().get(), BeneficialOwnerRoundDownXAndBelow);
	}

	public static FractionalSecurityRuleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FractionalSecurityRuleCode[] values() {
		FractionalSecurityRuleCode[] values = new FractionalSecurityRuleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FractionalSecurityRuleCode> {
		@Override
		public FractionalSecurityRuleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FractionalSecurityRuleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}