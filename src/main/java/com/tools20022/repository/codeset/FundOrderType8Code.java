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
import com.tools20022.repository.codeset.FundOrderType8Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#BedAndBreakfast
 * FundOrderType8Code.BedAndBreakfast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#InvestmentPlan
 * FundOrderType8Code.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#PreAdvice
 * FundOrderType8Code.PreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#RegularSavingsPlan
 * FundOrderType8Code.RegularSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#RegularSavingsPlanUpdate
 * FundOrderType8Code.RegularSavingsPlanUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#ReinvestmentOfDividend
 * FundOrderType8Code.ReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#StaffOrder
 * FundOrderType8Code.StaffOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code#Withdrawal
 * FundOrderType8Code.Withdrawal}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BedAndBreakfast"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code BedAndBreakfast = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BedAndBreakfast";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.BedAndBreakfast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code InvestmentPlan = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.InvestmentPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code PreAdvice = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.PreAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegularSavingsPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code RegularSavingsPlan = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegularSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.RegularSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegularSavingsPlanUpdate"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code RegularSavingsPlanUpdate = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegularSavingsPlanUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.RegularSavingsPlanUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code ReinvestmentOfDividend = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.ReinvestmentOfDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffOrder"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code StaffOrder = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.StaffOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType8Code
	 * FundOrderType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final FundOrderType8Code Withdrawal = new FundOrderType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType8Code.mmObject();
			codeName = FundOrderTypeCode.Withdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOrderType8Code> codesByName = new LinkedHashMap<>();

	protected FundOrderType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderType8Code";
				definition = "Specifies the category of the investment fund order.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderType8Code.BedAndBreakfast, com.tools20022.repository.codeset.FundOrderType8Code.InvestmentPlan,
						com.tools20022.repository.codeset.FundOrderType8Code.PreAdvice, com.tools20022.repository.codeset.FundOrderType8Code.RegularSavingsPlan, com.tools20022.repository.codeset.FundOrderType8Code.RegularSavingsPlanUpdate,
						com.tools20022.repository.codeset.FundOrderType8Code.ReinvestmentOfDividend, com.tools20022.repository.codeset.FundOrderType8Code.StaffOrder, com.tools20022.repository.codeset.FundOrderType8Code.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BedAndBreakfast.getCodeName().get(), BedAndBreakfast);
		codesByName.put(InvestmentPlan.getCodeName().get(), InvestmentPlan);
		codesByName.put(PreAdvice.getCodeName().get(), PreAdvice);
		codesByName.put(RegularSavingsPlan.getCodeName().get(), RegularSavingsPlan);
		codesByName.put(RegularSavingsPlanUpdate.getCodeName().get(), RegularSavingsPlanUpdate);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
		codesByName.put(StaffOrder.getCodeName().get(), StaffOrder);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
	}

	public static FundOrderType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderType8Code[] values() {
		FundOrderType8Code[] values = new FundOrderType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderType8Code> {
		@Override
		public FundOrderType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}