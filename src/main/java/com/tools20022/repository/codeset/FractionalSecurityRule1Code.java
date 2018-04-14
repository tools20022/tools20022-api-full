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
import com.tools20022.repository.codeset.FractionalSecurityRule1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#BeneficialOwnerRoundUpXAndAbove
 * FractionalSecurityRule1Code.BeneficialOwnerRoundUpXAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#BeneficialOwnerCashInLieu
 * FractionalSecurityRule1Code.BeneficialOwnerCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code#BeneficialOwnerRoundDownXAndBelow
 * FractionalSecurityRule1Code.BeneficialOwnerRoundDownXAndBelow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRuleCode
 * FractionalSecurityRuleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionalSecurityRule1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the fractional security handling rule that does not have an ISO value."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FractionalSecurityRule1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundUpXAndAbove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FractionalSecurityRule1Code BeneficialOwnerRoundUpXAndAbove = new FractionalSecurityRule1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundUpXAndAbove";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRule1Code.mmObject();
			codeName = FractionalSecurityRuleCode.BeneficialOwnerRoundUpXAndAbove.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerCashInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FractionalSecurityRule1Code BeneficialOwnerCashInLieu = new FractionalSecurityRule1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerCashInLieu";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRule1Code.mmObject();
			codeName = FractionalSecurityRuleCode.BeneficialOwnerCashInLieu.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerRoundDownXAndBelow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FractionalSecurityRule1Code BeneficialOwnerRoundDownXAndBelow = new FractionalSecurityRule1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerRoundDownXAndBelow";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionalSecurityRule1Code.mmObject();
			codeName = FractionalSecurityRuleCode.BeneficialOwnerRoundDownXAndBelow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FractionalSecurityRule1Code> codesByName = new LinkedHashMap<>();

	protected FractionalSecurityRule1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionalSecurityRule1Code";
				definition = "Specifies the fractional security handling rule that does not have an ISO value.";
				trace_lazy = () -> FractionalSecurityRuleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionalSecurityRule1Code.BeneficialOwnerRoundUpXAndAbove, com.tools20022.repository.codeset.FractionalSecurityRule1Code.BeneficialOwnerCashInLieu,
						com.tools20022.repository.codeset.FractionalSecurityRule1Code.BeneficialOwnerRoundDownXAndBelow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BeneficialOwnerRoundUpXAndAbove.getCodeName().get(), BeneficialOwnerRoundUpXAndAbove);
		codesByName.put(BeneficialOwnerCashInLieu.getCodeName().get(), BeneficialOwnerCashInLieu);
		codesByName.put(BeneficialOwnerRoundDownXAndBelow.getCodeName().get(), BeneficialOwnerRoundDownXAndBelow);
	}

	public static FractionalSecurityRule1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FractionalSecurityRule1Code[] values() {
		FractionalSecurityRule1Code[] values = new FractionalSecurityRule1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FractionalSecurityRule1Code> {
		@Override
		public FractionalSecurityRule1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FractionalSecurityRule1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}