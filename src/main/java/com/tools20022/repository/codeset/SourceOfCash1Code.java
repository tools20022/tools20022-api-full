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
import com.tools20022.repository.codeset.SourceOfCashCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the origin of cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
 * SourceOfCashCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmAlimony
 * SourceOfCash1Code.mmAlimony}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmCashProceeds
 * SourceOfCash1Code.mmCashProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmCompensation
 * SourceOfCash1Code.mmCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmEmployeeIncome
 * SourceOfCash1Code.mmEmployeeIncome}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmGift
 * SourceOfCash1Code.mmGift}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmInheritance
 * SourceOfCash1Code.mmInheritance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmInsurancePremiumLiquidation
 * SourceOfCash1Code.mmInsurancePremiumLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmRealEstateSale
 * SourceOfCash1Code.mmRealEstateSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmRedemption
 * SourceOfCash1Code.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmRetirementPolicy
 * SourceOfCash1Code.mmRetirementPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmSaleAquisitionCorporation
 * SourceOfCash1Code.mmSaleAquisitionCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmSaleOfGoods
 * SourceOfCash1Code.mmSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmSavings
 * SourceOfCash1Code.mmSavings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmSelfEmploymentIncome
 * SourceOfCash1Code.mmSelfEmploymentIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SourceOfCash1Code#mmWinnings
 * SourceOfCash1Code.mmWinnings}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class SourceOfCash1Code extends SourceOfCashCode {

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
	public static final MMCode mmAlimony = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alimony";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmCashProceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceeds";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmCompensation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compensation";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmEmployeeIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeIncome";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmGift = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gift";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmInheritance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inheritance";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmInsurancePremiumLiquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremiumLiquidation";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmRealEstateSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstateSale";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmRedemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmRetirementPolicy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementPolicy";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmSaleAquisitionCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleAquisitionCorporation";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmSaleOfGoods = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfGoods";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmSavings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmSelfEmploymentIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfEmploymentIncome";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
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
	public static final MMCode mmWinnings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Winnings";
			owner_lazy = () -> SourceOfCash1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SourceOfCash1Code";
				definition = "Specifies the origin of cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SourceOfCash1Code.mmAlimony, com.tools20022.repository.codeset.SourceOfCash1Code.mmCashProceeds,
						com.tools20022.repository.codeset.SourceOfCash1Code.mmCompensation, com.tools20022.repository.codeset.SourceOfCash1Code.mmEmployeeIncome, com.tools20022.repository.codeset.SourceOfCash1Code.mmGift,
						com.tools20022.repository.codeset.SourceOfCash1Code.mmInheritance, com.tools20022.repository.codeset.SourceOfCash1Code.mmInsurancePremiumLiquidation,
						com.tools20022.repository.codeset.SourceOfCash1Code.mmRealEstateSale, com.tools20022.repository.codeset.SourceOfCash1Code.mmRedemption, com.tools20022.repository.codeset.SourceOfCash1Code.mmRetirementPolicy,
						com.tools20022.repository.codeset.SourceOfCash1Code.mmSaleAquisitionCorporation, com.tools20022.repository.codeset.SourceOfCash1Code.mmSaleOfGoods, com.tools20022.repository.codeset.SourceOfCash1Code.mmSavings,
						com.tools20022.repository.codeset.SourceOfCash1Code.mmSelfEmploymentIncome, com.tools20022.repository.codeset.SourceOfCash1Code.mmWinnings);
				trace_lazy = () -> SourceOfCashCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}