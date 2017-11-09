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
import com.tools20022.repository.codeset.TransactionReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a transaction to be rejected or returned by an
 * instructed agent or somebody acting on behalf of an instructed agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
 * TransactionReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmIncorrectAccountNumber
 * TransactionReturnReason1Code.mmIncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmClosedAccountNumber
 * TransactionReturnReason1Code.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmBlockedAccount
 * TransactionReturnReason1Code.mmBlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmTransactionForbidden
 * TransactionReturnReason1Code.mmTransactionForbidden}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmInvalidBankOperationCode
 * TransactionReturnReason1Code.mmInvalidBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmInsufficientFunds
 * TransactionReturnReason1Code.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmDuplication
 * TransactionReturnReason1Code.mmDuplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmNoMandate
 * TransactionReturnReason1Code.mmNoMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmMissingCreditorAddress
 * TransactionReturnReason1Code.mmMissingCreditorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmInvalidFileFormatForOtherReasonThanGroupingIndicator
 * TransactionReturnReason1Code.
 * mmInvalidFileFormatForOtherReasonThanGroupingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmBankIdentifierIncorrect
 * TransactionReturnReason1Code.mmBankIdentifierIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmRefundRequestByEndCustomer
 * TransactionReturnReason1Code.mmRefundRequestByEndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmEndCustomerDeceased
 * TransactionReturnReason1Code.mmEndCustomerDeceased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmNotSpecifiedReasonCustomerGenerated
 * TransactionReturnReason1Code.mmNotSpecifiedReasonCustomerGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmNotSpecifiedReasonAgentGenerated
 * TransactionReturnReason1Code.mmNotSpecifiedReasonAgentGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code#mmCutOffTime
 * TransactionReturnReason1Code.mmCutOffTime}</li>
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
 * <li>"AC01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReturnReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transaction to be rejected or returned by an instructed agent or somebody acting on behalf of an instructed agent."
 * </li>
 * </ul>
 */
public class TransactionReturnReason1Code extends TransactionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionForbidden"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionForbidden = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionForbidden";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBankOperationCode"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidBankOperationCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBankOperationCode";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplication"</li>
	 * </ul>
	 */
	public static final MMCode mmDuplication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplication";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMandate"</li>
	 * </ul>
	 */
	public static final MMCode mmNoMandate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMandate";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAddress"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingCreditorAddress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAddress";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidFileFormatForOtherReasonThanGroupingIndicator"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidFileFormatForOtherReasonThanGroupingIndicator = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidFileFormatForOtherReasonThanGroupingIndicator";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankIdentifierIncorrect"</li>
	 * </ul>
	 */
	public static final MMCode mmBankIdentifierIncorrect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankIdentifierIncorrect";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundRequestByEndCustomer"</li>
	 * </ul>
	 */
	public static final MMCode mmRefundRequestByEndCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundRequestByEndCustomer";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerDeceased"</li>
	 * </ul>
	 */
	public static final MMCode mmEndCustomerDeceased = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerDeceased";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonCustomerGenerated"</li>
	 * </ul>
	 */
	public static final MMCode mmNotSpecifiedReasonCustomerGenerated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedReasonCustomerGenerated";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonAgentGenerated"</li>
	 * </ul>
	 */
	public static final MMCode mmNotSpecifiedReasonAgentGenerated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedReasonAgentGenerated";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReturnReason1Code
	 * TransactionReturnReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * </ul>
	 */
	public static final MMCode mmCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> TransactionReturnReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AC01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReturnReason1Code";
				definition = "Specifies the reason for a transaction to be rejected or returned by an instructed agent or somebody acting on behalf of an instructed agent.";
				code_lazy = () -> Arrays.asList(TransactionReturnReason1Code.mmIncorrectAccountNumber, TransactionReturnReason1Code.mmClosedAccountNumber, TransactionReturnReason1Code.mmBlockedAccount,
						TransactionReturnReason1Code.mmTransactionForbidden, TransactionReturnReason1Code.mmInvalidBankOperationCode, TransactionReturnReason1Code.mmInsufficientFunds, TransactionReturnReason1Code.mmDuplication,
						TransactionReturnReason1Code.mmNoMandate, TransactionReturnReason1Code.mmMissingCreditorAddress, TransactionReturnReason1Code.mmInvalidFileFormatForOtherReasonThanGroupingIndicator,
						TransactionReturnReason1Code.mmBankIdentifierIncorrect, TransactionReturnReason1Code.mmRefundRequestByEndCustomer, TransactionReturnReason1Code.mmEndCustomerDeceased,
						TransactionReturnReason1Code.mmNotSpecifiedReasonCustomerGenerated, TransactionReturnReason1Code.mmNotSpecifiedReasonAgentGenerated, TransactionReturnReason1Code.mmCutOffTime);
				trace_lazy = () -> TransactionReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}