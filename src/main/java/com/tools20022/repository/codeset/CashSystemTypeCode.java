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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of payment system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CashSystemTypeCode#mmACH
 * CashSystemTypeCode.mmACH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode#mmChequeClearing
 * CashSystemTypeCode.mmChequeClearing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashSystemTypeCode#mmRTGS
 * CashSystemTypeCode.mmRTGS}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACHS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashSystemTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of payment system."</li>
 * </ul>
 */
public class CashSystemTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Automated Clearing House. Payment system that clears cash transfers and
	 * settles the proceeds in a lump sum, usually on a multilateral netting
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode
	 * CashSystemTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACHS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmACH = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ACH";
			definition = "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "ACHS";
		}
	};
	/**
	 * Payment system that clears physical or truncated cheques and settles the
	 * proceeds in a lump sum, usually on a multilateral netting basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode
	 * CashSystemTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment system that clears physical or truncated cheques and settles the proceeds in a lump sum, usually on a multilateral netting basis."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChequeClearing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeClearing";
			definition = "Payment system that clears physical or truncated cheques and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "CHCL";
		}
	};
	/**
	 * Real Time Gross Settlement System. Payment system that simultaneously
	 * clears individual transfers and settles them in central bank money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSystemTypeCode
	 * CashSystemTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRTGS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "RTGS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACHS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSystemTypeCode";
				definition = "Specifies a type of payment system.";
				code_lazy = () -> Arrays.asList(CashSystemTypeCode.mmACH, CashSystemTypeCode.mmChequeClearing, CashSystemTypeCode.mmRTGS);
			}
		});
		return mmObject_lazy.get();
	}
}