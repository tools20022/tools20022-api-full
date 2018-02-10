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
import com.tools20022.repository.codeset.FundOrderType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the category of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code#BedAndBreakfast
 * FundOrderType2Code.BedAndBreakfast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code#InvestmentPlan
 * FundOrderType2Code.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code#PreAdvice
 * FundOrderType2Code.PreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code#StaffOrder
 * FundOrderType2Code.StaffOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code#RegularSavingsPlan
 * FundOrderType2Code.RegularSavingsPlan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderType2Code#Other
 * FundOrderType2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
 * FundOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BedAndBreakfast"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code BedAndBreakfast = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BedAndBreakfast";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.BedAndBreakfast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code InvestmentPlan = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.InvestmentPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code PreAdvice = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.PreAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffOrder"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code StaffOrder = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.StaffOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegularSavingsPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code RegularSavingsPlan = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegularSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.RegularSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType2Code
	 * FundOrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final FundOrderType2Code Other = new FundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOrderType2Code> codesByName = new LinkedHashMap<>();

	protected FundOrderType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderType2Code";
				definition = "Specifies the category of the investment fund order.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderType2Code.BedAndBreakfast, com.tools20022.repository.codeset.FundOrderType2Code.InvestmentPlan,
						com.tools20022.repository.codeset.FundOrderType2Code.PreAdvice, com.tools20022.repository.codeset.FundOrderType2Code.StaffOrder, com.tools20022.repository.codeset.FundOrderType2Code.RegularSavingsPlan,
						com.tools20022.repository.codeset.FundOrderType2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BedAndBreakfast.getCodeName().get(), BedAndBreakfast);
		codesByName.put(InvestmentPlan.getCodeName().get(), InvestmentPlan);
		codesByName.put(PreAdvice.getCodeName().get(), PreAdvice);
		codesByName.put(StaffOrder.getCodeName().get(), StaffOrder);
		codesByName.put(RegularSavingsPlan.getCodeName().get(), RegularSavingsPlan);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static FundOrderType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderType2Code[] values() {
		FundOrderType2Code[] values = new FundOrderType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderType2Code> {
		@Override
		public FundOrderType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}