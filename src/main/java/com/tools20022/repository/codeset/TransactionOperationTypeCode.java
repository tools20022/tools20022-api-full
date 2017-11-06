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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of process related to a specific transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmNewTransaction
 * TransactionOperationTypeCode.mmNewTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmCancellation
 * TransactionOperationTypeCode.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmAmendment
 * TransactionOperationTypeCode.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmCorrection
 * TransactionOperationTypeCode.mmCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmEarlyTermination
 * TransactionOperationTypeCode.mmEarlyTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmError
 * TransactionOperationTypeCode.mmError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmModification
 * TransactionOperationTypeCode.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmCompression
 * TransactionOperationTypeCode.mmCompression}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmValuationUpdate
 * TransactionOperationTypeCode.mmValuationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmPositionComponent
 * TransactionOperationTypeCode.mmPositionComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode#mmOther
 * TransactionOperationTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
 * TransactionOperationType1Code}</li>
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
 * "TransactionOperationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of process related to a specific transaction."</li>
 * </ul>
 */
public class TransactionOperationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a new transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a new transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmNewTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewTransaction";
			definition = "Transaction is a new transaction.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "NEWT";
		}
	};
	/**
	 * Transaction requests the deletion/cancellation of a previously sent
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction requests the deletion/cancellation of a previously sent transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Transaction requests the deletion/cancellation of a previously sent transaction.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Transaction amends a previously sent transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction amends a previously sent transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmAmendment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Transaction amends a previously sent transaction.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "AMND";
		}
	};
	/**
	 * Transaction corrects errors in a previously sent transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction corrects errors in a previously sent transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmCorrection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correction";
			definition = "Transaction corrects errors in a previously sent transaction.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Transaction is an early termination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyTermination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an early termination."</li>
	 * </ul>
	 */
	public static final MMCode mmEarlyTermination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyTermination";
			definition = "Transaction is an early termination.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "ETRM";
		}
	};
	/**
	 * Cancellation of a wrongly submitted entire report in case the contract
	 * never came into existence or was not subject to regulatory reporting
	 * requirements but was reported to a regulatory authority by mistake, in
	 * which case, it will be identified as ‘error’.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Error"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake, in which case, it will be identified as ‘error’."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Error";
			definition = "Cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to regulatory reporting requirements but was reported to a regulatory authority by mistake, in which case, it will be identified as ‘error’.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "EROR";
		}
	};
	/**
	 * Transaction modifies in a previously sent transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction modifies in a previously sent transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmModification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Transaction modifies in a previously sent transaction.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Transaction is a compression.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compression"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a compression."</li>
	 * </ul>
	 */
	public static final MMCode mmCompression = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compression";
			definition = "Transaction is a compression.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Update of a contract valuation or collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update of a contract valuation or collateral."</li>
	 * </ul>
	 */
	public static final MMCode mmValuationUpdate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationUpdate";
			definition = "Update of a contract valuation or collateral.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Contract to be reported as a new trade and included in a separate
	 * position report on the same day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract to be reported as a new trade and included in a separate position report on the same day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPositionComponent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionComponent";
			definition = "Contract to be reported as a new trade and included in a separate position report on the same day.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "POSC";
		}
	};
	/**
	 * Other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
	 * TransactionOperationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other.";
			owner_lazy = () -> TransactionOperationTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionOperationTypeCode";
				definition = "Specifies the type of process related to a specific transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionOperationTypeCode.mmNewTransaction, com.tools20022.repository.codeset.TransactionOperationTypeCode.mmCancellation,
						com.tools20022.repository.codeset.TransactionOperationTypeCode.mmAmendment, com.tools20022.repository.codeset.TransactionOperationTypeCode.mmCorrection,
						com.tools20022.repository.codeset.TransactionOperationTypeCode.mmEarlyTermination, com.tools20022.repository.codeset.TransactionOperationTypeCode.mmError,
						com.tools20022.repository.codeset.TransactionOperationTypeCode.mmModification, com.tools20022.repository.codeset.TransactionOperationTypeCode.mmCompression,
						com.tools20022.repository.codeset.TransactionOperationTypeCode.mmValuationUpdate, com.tools20022.repository.codeset.TransactionOperationTypeCode.mmPositionComponent,
						com.tools20022.repository.codeset.TransactionOperationTypeCode.mmOther);
				derivation_lazy = () -> Arrays.asList(TransactionOperationType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}