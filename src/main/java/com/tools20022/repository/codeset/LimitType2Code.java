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
import com.tools20022.repository.codeset.LimitType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of risk management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#Multilateral
 * LimitType2Code.Multilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType2Code#Bilateral
 * LimitType2Code.Bilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#MandatoryBilateral
 * LimitType2Code.MandatoryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#DiscretionaryBilateral
 * LimitType2Code.DiscretionaryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#NetBilateral
 * LimitType2Code.NetBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#IndirectBilateral
 * LimitType2Code.IndirectBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType2Code#Global
 * LimitType2Code.Global}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType2Code#DirectDebit
 * LimitType2Code.DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#SingleCustomerDirectDebit
 * LimitType2Code.SingleCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#SingleFinancialInstitutionDirectDebit
 * LimitType2Code.SingleFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#TotalDailyCustomerDirectDebit
 * LimitType2Code.TotalDailyCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType2Code#TotalDailyFinancialInstitutionDirectDebit
 * LimitType2Code.TotalDailyFinancialInstitutionDirectDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode LimitTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MULT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of risk management limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LimitType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code Multilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.Multilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code Bilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.Bilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryBilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code MandatoryBilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.MandatoryBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscretionaryBilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code DiscretionaryBilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.DiscretionaryBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetBilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code NetBilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.NetBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndirectBilateral"</li>
	 * </ul>
	 */
	public static final LimitType2Code IndirectBilateral = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndirectBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.IndirectBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * </ul>
	 */
	public static final LimitType2Code Global = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.Global.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * </ul>
	 */
	public static final LimitType2Code DirectDebit = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.DirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCustomerDirectDebit"</li>
	 * </ul>
	 */
	public static final LimitType2Code SingleCustomerDirectDebit = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCustomerDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.SingleCustomerDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleFinancialInstitutionDirectDebit"</li>
	 * </ul>
	 */
	public static final LimitType2Code SingleFinancialInstitutionDirectDebit = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleFinancialInstitutionDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.SingleFinancialInstitutionDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyCustomerDirectDebit"</li>
	 * </ul>
	 */
	public static final LimitType2Code TotalDailyCustomerDirectDebit = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyCustomerDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.TotalDailyCustomerDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType2Code
	 * LimitType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyFinancialInstitutionDirectDebit"</li>
	 * </ul>
	 */
	public static final LimitType2Code TotalDailyFinancialInstitutionDirectDebit = new LimitType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyFinancialInstitutionDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType2Code.mmObject();
			codeName = LimitTypeCode.TotalDailyFinancialInstitutionDirectDebit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LimitType2Code> codesByName = new LinkedHashMap<>();

	protected LimitType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitType2Code";
				definition = "Specifies the type of risk management limit.";
				trace_lazy = () -> LimitTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitType2Code.Multilateral, com.tools20022.repository.codeset.LimitType2Code.Bilateral, com.tools20022.repository.codeset.LimitType2Code.MandatoryBilateral,
						com.tools20022.repository.codeset.LimitType2Code.DiscretionaryBilateral, com.tools20022.repository.codeset.LimitType2Code.NetBilateral, com.tools20022.repository.codeset.LimitType2Code.IndirectBilateral,
						com.tools20022.repository.codeset.LimitType2Code.Global, com.tools20022.repository.codeset.LimitType2Code.DirectDebit, com.tools20022.repository.codeset.LimitType2Code.SingleCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitType2Code.SingleFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitType2Code.TotalDailyCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitType2Code.TotalDailyFinancialInstitutionDirectDebit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Multilateral.getCodeName().get(), Multilateral);
		codesByName.put(Bilateral.getCodeName().get(), Bilateral);
		codesByName.put(MandatoryBilateral.getCodeName().get(), MandatoryBilateral);
		codesByName.put(DiscretionaryBilateral.getCodeName().get(), DiscretionaryBilateral);
		codesByName.put(NetBilateral.getCodeName().get(), NetBilateral);
		codesByName.put(IndirectBilateral.getCodeName().get(), IndirectBilateral);
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(DirectDebit.getCodeName().get(), DirectDebit);
		codesByName.put(SingleCustomerDirectDebit.getCodeName().get(), SingleCustomerDirectDebit);
		codesByName.put(SingleFinancialInstitutionDirectDebit.getCodeName().get(), SingleFinancialInstitutionDirectDebit);
		codesByName.put(TotalDailyCustomerDirectDebit.getCodeName().get(), TotalDailyCustomerDirectDebit);
		codesByName.put(TotalDailyFinancialInstitutionDirectDebit.getCodeName().get(), TotalDailyFinancialInstitutionDirectDebit);
	}

	public static LimitType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LimitType2Code[] values() {
		LimitType2Code[] values = new LimitType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LimitType2Code> {
		@Override
		public LimitType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LimitType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}