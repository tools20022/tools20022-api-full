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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
 * DTCAdjustmentPaymentTypeV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmFailSettlement
 * DTCAdjustmentPaymentType3Code.mmFailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmMiscellaneousSettlement
 * DTCAdjustmentPaymentType3Code.mmMiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmRepoSettlement
 * DTCAdjustmentPaymentType3Code.mmRepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmStockLoanSettlement
 * DTCAdjustmentPaymentType3Code.mmStockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentType3Code.mmReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmReorgDepositPhaseTwo
 * DTCAdjustmentPaymentType3Code.mmReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmCustodyReorganizationDeposit
 * DTCAdjustmentPaymentType3Code.mmCustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#mmDynamicRateChange
 * DTCAdjustmentPaymentType3Code.mmDynamicRateChange}</li>
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
 * "DTCAdjustmentPaymentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * </ul>
 */
public class DTCAdjustmentPaymentType3Code extends DTCAdjustmentPaymentTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailSettlement"</li>
	 * </ul>
	 */
	public static final MMCode mmFailSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailSettlement";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousSettlement"</li>
	 * </ul>
	 */
	public static final MMCode mmMiscellaneousSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousSettlement";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoSettlement"</li>
	 * </ul>
	 */
	public static final MMCode mmRepoSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoSettlement";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanSettlement"</li>
	 * </ul>
	 */
	public static final MMCode mmStockLoanSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanSettlement";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseOne"</li>
	 * </ul>
	 */
	public static final MMCode mmReorganisationDepositPhaseOne = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorgDepositPhaseTwo"</li>
	 * </ul>
	 */
	public static final MMCode mmReorgDepositPhaseTwo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorgDepositPhaseTwo";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyReorganizationDeposit"</li>
	 * </ul>
	 */
	public static final MMCode mmCustodyReorganizationDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganizationDeposit";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicRateChange"</li>
	 * </ul>
	 */
	public static final MMCode mmDynamicRateChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			owner_lazy = () -> DTCAdjustmentPaymentType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentType3Code";
				definition = "Specifies the type of the payment adjustment.";
				code_lazy = () -> Arrays.asList(DTCAdjustmentPaymentType3Code.mmFailSettlement, DTCAdjustmentPaymentType3Code.mmMiscellaneousSettlement, DTCAdjustmentPaymentType3Code.mmRepoSettlement,
						DTCAdjustmentPaymentType3Code.mmStockLoanSettlement, DTCAdjustmentPaymentType3Code.mmReorganisationDepositPhaseOne, DTCAdjustmentPaymentType3Code.mmReorgDepositPhaseTwo,
						DTCAdjustmentPaymentType3Code.mmCustodyReorganizationDeposit, DTCAdjustmentPaymentType3Code.mmDynamicRateChange);
				trace_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}