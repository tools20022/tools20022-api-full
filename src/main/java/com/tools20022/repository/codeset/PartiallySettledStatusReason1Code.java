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
import com.tools20022.repository.codeset.PartiallySettledStatusReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a partially settled status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
 * PartiallySettledStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#mmUnitsPartiallySettled
 * PartiallySettledStatusReason1Code.mmUnitsPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#mmCashPartiallySettled
 * PartiallySettledStatusReason1Code.mmCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#mmUnitsCashPartiallySettled
 * PartiallySettledStatusReason1Code.mmUnitsCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#mmHoldBackPendingAudit
 * PartiallySettledStatusReason1Code.mmHoldBackPendingAudit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code#mmHoldBackLiquidation
 * PartiallySettledStatusReason1Code.mmHoldBackLiquidation}</li>
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
 * <li>"UPST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartiallySettledStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a partially settled status."</li>
 * </ul>
 */
public class PartiallySettledStatusReason1Code extends PartiallySettledStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * </ul>
	 */
	public static final MMCode mmUnitsPartiallySettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			owner_lazy = () -> PartiallySettledStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * </ul>
	 */
	public static final MMCode mmCashPartiallySettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			owner_lazy = () -> PartiallySettledStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * </ul>
	 */
	public static final MMCode mmUnitsCashPartiallySettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			owner_lazy = () -> PartiallySettledStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackPendingAudit"</li>
	 * </ul>
	 */
	public static final MMCode mmHoldBackPendingAudit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackPendingAudit";
			owner_lazy = () -> PartiallySettledStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReason1Code
	 * PartiallySettledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackLiquidation"</li>
	 * </ul>
	 */
	public static final MMCode mmHoldBackLiquidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackLiquidation";
			owner_lazy = () -> PartiallySettledStatusReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UPST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartiallySettledStatusReason1Code";
				definition = "Specifies the reason for a partially settled status.";
				code_lazy = () -> Arrays.asList(PartiallySettledStatusReason1Code.mmUnitsPartiallySettled, PartiallySettledStatusReason1Code.mmCashPartiallySettled, PartiallySettledStatusReason1Code.mmUnitsCashPartiallySettled,
						PartiallySettledStatusReason1Code.mmHoldBackPendingAudit, PartiallySettledStatusReason1Code.mmHoldBackLiquidation);
				trace_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}