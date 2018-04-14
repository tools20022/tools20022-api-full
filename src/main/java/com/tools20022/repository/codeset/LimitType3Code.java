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
import com.tools20022.repository.codeset.LimitType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#Multilateral
 * LimitType3Code.Multilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType3Code#Bilateral
 * LimitType3Code.Bilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#MandatoryBilateral
 * LimitType3Code.MandatoryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#DiscretionaryBilateral
 * LimitType3Code.DiscretionaryBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#NetBilateral
 * LimitType3Code.NetBilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#IndirectBilateral
 * LimitType3Code.IndirectBilateral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType3Code#Global
 * LimitType3Code.Global}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LimitType3Code#DirectDebit
 * LimitType3Code.DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#SingleCustomerDirectDebit
 * LimitType3Code.SingleCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#SingleFinancialInstitutionDirectDebit
 * LimitType3Code.SingleFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#TotalDailyCustomerDirectDebit
 * LimitType3Code.TotalDailyCustomerDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#TotalDailyFinancialInstitutionDirectDebit
 * LimitType3Code.TotalDailyFinancialInstitutionDirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#UnsecuredCredit
 * LimitType3Code.UnsecuredCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#AutoCollateralisation
 * LimitType3Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType3Code#ExternalGuarantee
 * LimitType3Code.ExternalGuarantee}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode LimitTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of risk management limit."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LimitType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code Multilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.Multilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code Bilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.Bilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code MandatoryBilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.MandatoryBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscretionaryBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code DiscretionaryBilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.DiscretionaryBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code NetBilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.NetBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndirectBilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code IndirectBilateral = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndirectBilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.IndirectBilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code Global = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.Global.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code DirectDebit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.DirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCustomerDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code SingleCustomerDirectDebit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCustomerDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.SingleCustomerDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleFinancialInstitutionDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code SingleFinancialInstitutionDirectDebit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleFinancialInstitutionDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.SingleFinancialInstitutionDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyCustomerDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code TotalDailyCustomerDirectDebit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyCustomerDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.TotalDailyCustomerDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDailyFinancialInstitutionDirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code TotalDailyFinancialInstitutionDirectDebit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyFinancialInstitutionDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.TotalDailyFinancialInstitutionDirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code UnsecuredCredit = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.UnsecuredCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code AutoCollateralisation = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType3Code
	 * LimitType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LimitType3Code ExternalGuarantee = new LimitType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType3Code.mmObject();
			codeName = LimitTypeCode.ExternalGuarantee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LimitType3Code> codesByName = new LinkedHashMap<>();

	protected LimitType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitType3Code";
				definition = "Specifies the type of risk management limit.";
				trace_lazy = () -> LimitTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitType3Code.Multilateral, com.tools20022.repository.codeset.LimitType3Code.Bilateral, com.tools20022.repository.codeset.LimitType3Code.MandatoryBilateral,
						com.tools20022.repository.codeset.LimitType3Code.DiscretionaryBilateral, com.tools20022.repository.codeset.LimitType3Code.NetBilateral, com.tools20022.repository.codeset.LimitType3Code.IndirectBilateral,
						com.tools20022.repository.codeset.LimitType3Code.Global, com.tools20022.repository.codeset.LimitType3Code.DirectDebit, com.tools20022.repository.codeset.LimitType3Code.SingleCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitType3Code.SingleFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitType3Code.TotalDailyCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitType3Code.TotalDailyFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitType3Code.UnsecuredCredit,
						com.tools20022.repository.codeset.LimitType3Code.AutoCollateralisation, com.tools20022.repository.codeset.LimitType3Code.ExternalGuarantee);
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
		codesByName.put(UnsecuredCredit.getCodeName().get(), UnsecuredCredit);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(ExternalGuarantee.getCodeName().get(), ExternalGuarantee);
	}

	public static LimitType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LimitType3Code[] values() {
		LimitType3Code[] values = new LimitType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LimitType3Code> {
		@Override
		public LimitType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LimitType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}