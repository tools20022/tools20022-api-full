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
import com.tools20022.repository.codeset.HoldingsPlanType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the holdings plan of the assets to transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code#InvestmentPlan
 * HoldingsPlanType1Code.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code#SwitchPlan
 * HoldingsPlanType1Code.SwitchPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code#WithdrawalPlan
 * HoldingsPlanType1Code.WithdrawalPlan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode
 * HoldingsPlanTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INVP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldingsPlanType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the holdings plan of the assets to transfer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingsPlanType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * </ul>
	 */
	public static final HoldingsPlanType1Code InvestmentPlan = new HoldingsPlanType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanType1Code.mmObject();
			codeName = HoldingsPlanTypeCode.InvestmentPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchPlan"</li>
	 * </ul>
	 */
	public static final HoldingsPlanType1Code SwitchPlan = new HoldingsPlanType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanType1Code.mmObject();
			codeName = HoldingsPlanTypeCode.SwitchPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalPlan"</li>
	 * </ul>
	 */
	public static final HoldingsPlanType1Code WithdrawalPlan = new HoldingsPlanType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanType1Code.mmObject();
			codeName = HoldingsPlanTypeCode.WithdrawalPlan.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, HoldingsPlanType1Code> codesByName = new LinkedHashMap<>();

	protected HoldingsPlanType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INVP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingsPlanType1Code";
				definition = "Specifies the holdings plan of the assets to transfer.";
				trace_lazy = () -> HoldingsPlanTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingsPlanType1Code.InvestmentPlan, com.tools20022.repository.codeset.HoldingsPlanType1Code.SwitchPlan,
						com.tools20022.repository.codeset.HoldingsPlanType1Code.WithdrawalPlan);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvestmentPlan.getCodeName().get(), InvestmentPlan);
		codesByName.put(SwitchPlan.getCodeName().get(), SwitchPlan);
		codesByName.put(WithdrawalPlan.getCodeName().get(), WithdrawalPlan);
	}

	public static HoldingsPlanType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingsPlanType1Code[] values() {
		HoldingsPlanType1Code[] values = new HoldingsPlanType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingsPlanType1Code> {
		@Override
		public HoldingsPlanType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingsPlanType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}