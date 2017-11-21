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
 * Status of an ATM transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmSuccess
 * ATMTransactionStatusCode.mmSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmDoubt
 * ATMTransactionStatusCode.mmDoubt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmFailure
 * ATMTransactionStatusCode.mmFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmFull
 * ATMTransactionStatusCode.mmFull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmPartial
 * ATMTransactionStatusCode.mmPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#mmNone
 * ATMTransactionStatusCode.mmNone}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMTransactionStatus1Code
 * ATMTransactionStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMTransactionStatus2Code
 * ATMTransactionStatus2Code}</li>
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
 * "ATMTransactionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of an ATM transaction."</li>
 * </ul>
 */
public class ATMTransactionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction was successfully completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was successfully completed."</li>
	 * </ul>
	 */
	public static final MMCode mmSuccess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			definition = "Transaction was successfully completed.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "SCSS";
		}
	};
	/**
	 * Undetermined status, for instance possibly forgotten notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Doubt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undetermined status, for instance possibly forgotten notes."</li>
	 * </ul>
	 */
	public static final MMCode mmDoubt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Doubt";
			definition = "Undetermined status, for instance possibly forgotten notes.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "DOBT";
		}
	};
	/**
	 * Transaction failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction failed."</li>
	 * </ul>
	 */
	public static final MMCode mmFailure = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failure";
			definition = "Transaction failed.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Total presented amount is equal to the amount to dispense.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total presented amount is equal to the amount to dispense."</li>
	 * </ul>
	 */
	public static final MMCode mmFull = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Full";
			definition = "Total presented amount is equal to the amount to dispense.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Total presented amount is lower than the amount to dispense.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total presented amount is lower than the amount to dispense."</li>
	 * </ul>
	 */
	public static final MMCode mmPartial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			definition = "Total presented amount is lower than the amount to dispense.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Total presented amount is equal to zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total presented amount is equal to zero."</li>
	 * </ul>
	 */
	public static final MMCode mmNone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Total presented amount is equal to zero.";
			owner_lazy = () -> ATMTransactionStatusCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionStatusCode";
				definition = "Status of an ATM transaction.";
				code_lazy = () -> Arrays.asList(ATMTransactionStatusCode.mmSuccess, ATMTransactionStatusCode.mmDoubt, ATMTransactionStatusCode.mmFailure, ATMTransactionStatusCode.mmFull, ATMTransactionStatusCode.mmPartial,
						ATMTransactionStatusCode.mmNone);
				derivation_lazy = () -> Arrays.asList(ATMTransactionStatus1Code.mmObject(), ATMTransactionStatus2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}