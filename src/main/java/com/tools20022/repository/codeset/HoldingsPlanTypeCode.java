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
import com.tools20022.repository.codeset.HoldingsPlanTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode#InvestmentPlan
 * HoldingsPlanTypeCode.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode#SwitchPlan
 * HoldingsPlanTypeCode.SwitchPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode#WithdrawalPlan
 * HoldingsPlanTypeCode.WithdrawalPlan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
 * HoldingsPlanType1Code}</li>
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
 * <li>"INVP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldingsPlanTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the holdings plan of the assets to transfer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingsPlanTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Holding to be transferred belongs to an investment plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode
	 * HoldingsPlanTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding to be transferred belongs to an investment plan."</li>
	 * </ul>
	 */
	public static final HoldingsPlanTypeCode InvestmentPlan = new HoldingsPlanTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			definition = "Holding to be transferred belongs to an investment plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanTypeCode.mmObject();
			codeName = "INVP";
		}
	};
	/**
	 * Holding to be transferred belongs to a switch plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode
	 * HoldingsPlanTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding to be transferred belongs to a switch plan."</li>
	 * </ul>
	 */
	public static final HoldingsPlanTypeCode SwitchPlan = new HoldingsPlanTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchPlan";
			definition = "Holding to be transferred belongs to a switch plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanTypeCode.mmObject();
			codeName = "SWIP";
		}
	};
	/**
	 * Holding to be transferred belongs to a withdrawal plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanTypeCode
	 * HoldingsPlanTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding to be transferred belongs to a withdrawal plan."</li>
	 * </ul>
	 */
	public static final HoldingsPlanTypeCode WithdrawalPlan = new HoldingsPlanTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalPlan";
			definition = "Holding to be transferred belongs to a withdrawal plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingsPlanTypeCode.mmObject();
			codeName = "PLAR";
		}
	};
	final static private LinkedHashMap<String, HoldingsPlanTypeCode> codesByName = new LinkedHashMap<>();

	protected HoldingsPlanTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INVP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingsPlanTypeCode";
				definition = "Specifies the holdings plan of the assets to transfer.";
				derivation_lazy = () -> Arrays.asList(HoldingsPlanType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingsPlanTypeCode.InvestmentPlan, com.tools20022.repository.codeset.HoldingsPlanTypeCode.SwitchPlan,
						com.tools20022.repository.codeset.HoldingsPlanTypeCode.WithdrawalPlan);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvestmentPlan.getCodeName().get(), InvestmentPlan);
		codesByName.put(SwitchPlan.getCodeName().get(), SwitchPlan);
		codesByName.put(WithdrawalPlan.getCodeName().get(), WithdrawalPlan);
	}

	public static HoldingsPlanTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingsPlanTypeCode[] values() {
		HoldingsPlanTypeCode[] values = new HoldingsPlanTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingsPlanTypeCode> {
		@Override
		public HoldingsPlanTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingsPlanTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}