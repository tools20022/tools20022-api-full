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
import com.tools20022.repository.codeset.CorporateActionReversalReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The reason why a reversal of payment is taking place in corporate action
 * processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
 * CorporateActionReversalReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmDayCountBasisDifference
 * CorporateActionReversalReason1Code.mmDayCountBasisDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmIncorrectValueDate
 * CorporateActionReversalReason1Code.mmIncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmIncorrectRecordDate
 * CorporateActionReversalReason1Code.mmIncorrectRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmIncorrectPrice
 * CorporateActionReversalReason1Code.mmIncorrectPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmUnduePayment
 * CorporateActionReversalReason1Code.mmUnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmIncorrectEventLevelTaxRate
 * CorporateActionReversalReason1Code.mmIncorrectEventLevelTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmFundsNotReceived
 * CorporateActionReversalReason1Code.mmFundsNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmPaymentOutsideClearingSystem
 * CorporateActionReversalReason1Code.mmPaymentOutsideClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#mmIncorrectPaymentCurrency
 * CorporateActionReversalReason1Code.mmIncorrectPaymentCurrency}</li>
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
 * <li>"DCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionReversalReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The reason why a reversal of payment is taking place in corporate action processing."
 * </li>
 * </ul>
 */
public class CorporateActionReversalReason1Code extends CorporateActionReversalReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasisDifference"</li>
	 * </ul>
	 */
	public static final MMCode mmDayCountBasisDifference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasisDifference";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectValueDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectValueDate";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRecordDate"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectRecordDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRecordDate";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPrice";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * </ul>
	 */
	public static final MMCode mmUnduePayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectEventLevelTaxRate"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectEventLevelTaxRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectEventLevelTaxRate";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceived"</li>
	 * </ul>
	 */
	public static final MMCode mmFundsNotReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceived";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOutsideClearingSystem"</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOutsideClearingSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOutsideClearingSystem";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentCurrency"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectPaymentCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentCurrency";
			owner_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DCBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReason1Code";
				definition = "The reason why a reversal of payment is taking place in corporate action processing.";
				code_lazy = () -> Arrays.asList(CorporateActionReversalReason1Code.mmDayCountBasisDifference, CorporateActionReversalReason1Code.mmIncorrectValueDate, CorporateActionReversalReason1Code.mmIncorrectRecordDate,
						CorporateActionReversalReason1Code.mmIncorrectPrice, CorporateActionReversalReason1Code.mmUnduePayment, CorporateActionReversalReason1Code.mmIncorrectEventLevelTaxRate,
						CorporateActionReversalReason1Code.mmFundsNotReceived, CorporateActionReversalReason1Code.mmPaymentOutsideClearingSystem, CorporateActionReversalReason1Code.mmIncorrectPaymentCurrency);
				trace_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}