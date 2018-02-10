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
import com.tools20022.repository.codeset.SourceOfCash1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the origin of cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Alimony
 * SourceOfCash1Code.Alimony}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#CashProceeds
 * SourceOfCash1Code.CashProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Compensation
 * SourceOfCash1Code.Compensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#EmployeeIncome
 * SourceOfCash1Code.EmployeeIncome}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Gift
 * SourceOfCash1Code.Gift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Inheritance
 * SourceOfCash1Code.Inheritance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#InsurancePremiumLiquidation
 * SourceOfCash1Code.InsurancePremiumLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#RealEstateSale
 * SourceOfCash1Code.RealEstateSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Redemption
 * SourceOfCash1Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#RetirementPolicy
 * SourceOfCash1Code.RetirementPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#SaleAquisitionCorporation
 * SourceOfCash1Code.SaleAquisitionCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#SaleOfGoods
 * SourceOfCash1Code.SaleOfGoods}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Savings
 * SourceOfCash1Code.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#SelfEmploymentIncome
 * SourceOfCash1Code.SelfEmploymentIncome}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#Winnings
 * SourceOfCash1Code.Winnings}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
 * SourceOfCashCode}</li>
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
 * "SourceOfCash1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the origin of cash."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SourceOfCash1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alimony"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Alimony = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alimony";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Alimony.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceeds"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code CashProceeds = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.CashProceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compensation"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Compensation = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Compensation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeIncome"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code EmployeeIncome = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.EmployeeIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gift"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Gift = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Gift.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inheritance"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Inheritance = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inheritance";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Inheritance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremiumLiquidation"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code InsurancePremiumLiquidation = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremiumLiquidation";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.InsurancePremiumLiquidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstateSale"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code RealEstateSale = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.RealEstateSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Redemption = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementPolicy"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code RetirementPolicy = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementPolicy";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.RetirementPolicy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleAquisitionCorporation"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code SaleAquisitionCorporation = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleAquisitionCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.SaleAquisitionCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfGoods"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code SaleOfGoods = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfGoods";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.SaleOfGoods.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Savings = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Savings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfEmploymentIncome"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code SelfEmploymentIncome = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfEmploymentIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.SelfEmploymentIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code
	 * SourceOfCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Winnings"</li>
	 * </ul>
	 */
	public static final SourceOfCash1Code Winnings = new SourceOfCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Winnings";
			owner_lazy = () -> com.tools20022.repository.codeset.SourceOfCash1Code.mmObject();
			codeName = SourceOfCashCode.Winnings.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SourceOfCash1Code> codesByName = new LinkedHashMap<>();

	protected SourceOfCash1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SourceOfCash1Code";
				definition = "Specifies the origin of cash.";
				trace_lazy = () -> SourceOfCashCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SourceOfCash1Code.Alimony, com.tools20022.repository.codeset.SourceOfCash1Code.CashProceeds,
						com.tools20022.repository.codeset.SourceOfCash1Code.Compensation, com.tools20022.repository.codeset.SourceOfCash1Code.EmployeeIncome, com.tools20022.repository.codeset.SourceOfCash1Code.Gift,
						com.tools20022.repository.codeset.SourceOfCash1Code.Inheritance, com.tools20022.repository.codeset.SourceOfCash1Code.InsurancePremiumLiquidation, com.tools20022.repository.codeset.SourceOfCash1Code.RealEstateSale,
						com.tools20022.repository.codeset.SourceOfCash1Code.Redemption, com.tools20022.repository.codeset.SourceOfCash1Code.RetirementPolicy, com.tools20022.repository.codeset.SourceOfCash1Code.SaleAquisitionCorporation,
						com.tools20022.repository.codeset.SourceOfCash1Code.SaleOfGoods, com.tools20022.repository.codeset.SourceOfCash1Code.Savings, com.tools20022.repository.codeset.SourceOfCash1Code.SelfEmploymentIncome,
						com.tools20022.repository.codeset.SourceOfCash1Code.Winnings);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Alimony.getCodeName().get(), Alimony);
		codesByName.put(CashProceeds.getCodeName().get(), CashProceeds);
		codesByName.put(Compensation.getCodeName().get(), Compensation);
		codesByName.put(EmployeeIncome.getCodeName().get(), EmployeeIncome);
		codesByName.put(Gift.getCodeName().get(), Gift);
		codesByName.put(Inheritance.getCodeName().get(), Inheritance);
		codesByName.put(InsurancePremiumLiquidation.getCodeName().get(), InsurancePremiumLiquidation);
		codesByName.put(RealEstateSale.getCodeName().get(), RealEstateSale);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(RetirementPolicy.getCodeName().get(), RetirementPolicy);
		codesByName.put(SaleAquisitionCorporation.getCodeName().get(), SaleAquisitionCorporation);
		codesByName.put(SaleOfGoods.getCodeName().get(), SaleOfGoods);
		codesByName.put(Savings.getCodeName().get(), Savings);
		codesByName.put(SelfEmploymentIncome.getCodeName().get(), SelfEmploymentIncome);
		codesByName.put(Winnings.getCodeName().get(), Winnings);
	}

	public static SourceOfCash1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SourceOfCash1Code[] values() {
		SourceOfCash1Code[] values = new SourceOfCash1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SourceOfCash1Code> {
		@Override
		public SourceOfCash1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SourceOfCash1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}