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
import com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
 * FinancialInstrumentProductTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmCertificateOfDeposit
 * FinancialInstrumentProductType1Code.mmCertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmCommercialPaper
 * FinancialInstrumentProductType1Code.mmCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmOtherShortTermDebtSecurities
 * FinancialInstrumentProductType1Code.mmOtherShortTermDebtSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmAssetBackedCommercialPaper
 * FinancialInstrumentProductType1Code.mmAssetBackedCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmFloatingRateNote
 * FinancialInstrumentProductType1Code.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmCallAccountCallMoney
 * FinancialInstrumentProductType1Code.mmCallAccountCallMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code#mmDeposit
 * FinancialInstrumentProductType1Code.mmDeposit}</li>
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
 * "FinancialInstrumentProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
public class FinancialInstrumentProductType1Code extends FinancialInstrumentProductTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialPaper";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherShortTermDebtSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmOtherShortTermDebtSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherShortTermDebtSecurities";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedCommercialPaper"</li>
	 * </ul>
	 */
	public static final MMCode mmAssetBackedCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedCommercialPaper";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * </ul>
	 */
	public static final MMCode mmFloatingRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAccountCallMoney"</li>
	 * </ul>
	 */
	public static final MMCode mmCallAccountCallMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAccountCallMoney";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * </ul>
	 */
	public static final MMCode mmDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			owner_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentProductType1Code";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(FinancialInstrumentProductType1Code.mmCertificateOfDeposit, FinancialInstrumentProductType1Code.mmCommercialPaper, FinancialInstrumentProductType1Code.mmOtherShortTermDebtSecurities,
						FinancialInstrumentProductType1Code.mmAssetBackedCommercialPaper, FinancialInstrumentProductType1Code.mmFloatingRateNote, FinancialInstrumentProductType1Code.mmCallAccountCallMoney,
						FinancialInstrumentProductType1Code.mmDeposit);
				trace_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}