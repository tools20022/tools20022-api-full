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
import com.tools20022.repository.codeset.TransactionRejectReason6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transaction to be rejected or returned by an
 * instructed agent or somebody acting on behalf of an instructed agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#IncorrectAccountNumber
 * TransactionRejectReason6Code.IncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#ClosedAccountNumber
 * TransactionRejectReason6Code.ClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#BlockedAccount
 * TransactionRejectReason6Code.BlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#TransactionForbidden
 * TransactionRejectReason6Code.TransactionForbidden}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#InvalidBankOperationCode
 * TransactionRejectReason6Code.InvalidBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#InsufficientFunds
 * TransactionRejectReason6Code.InsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#Duplication
 * TransactionRejectReason6Code.Duplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#NoMandate
 * TransactionRejectReason6Code.NoMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#MissingMandatoryInformationInMandate
 * TransactionRejectReason6Code.MissingMandatoryInformationInMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#InvalidFileFormatForOtherReasonThanGroupingIndicator
 * TransactionRejectReason6Code.
 * InvalidFileFormatForOtherReasonThanGroupingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#BankIdentifierIncorrect
 * TransactionRejectReason6Code.BankIdentifierIncorrect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#EndCustomerDeceased
 * TransactionRejectReason6Code.EndCustomerDeceased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#NotSpecifiedReasonCustomerGenerated
 * TransactionRejectReason6Code.NotSpecifiedReasonCustomerGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#NotSpecifiedReasonAgentGenerated
 * TransactionRejectReason6Code.NotSpecifiedReasonAgentGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code#CutOffTime
 * TransactionRejectReason6Code.CutOffTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
 * TransactionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * "TransactionRejectReason6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transaction to be rejected or returned by an instructed agent or somebody acting on behalf of an instructed agent."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionRejectReason6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code IncorrectAccountNumber = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.IncorrectAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code ClosedAccountNumber = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.ClosedAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code BlockedAccount = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.BlockedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionForbidden"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code TransactionForbidden = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionForbidden";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.TransactionForbidden.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBankOperationCode"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code InvalidBankOperationCode = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBankOperationCode";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.InvalidBankOperationCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code InsufficientFunds = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.InsufficientFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplication"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code Duplication = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplication";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.Duplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMandate"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code NoMandate = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMandate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.NoMandate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMandatoryInformationInMandate"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code MissingMandatoryInformationInMandate = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMandatoryInformationInMandate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.MissingMandatoryInformationInMandate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidFileFormatForOtherReasonThanGroupingIndicator"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code InvalidFileFormatForOtherReasonThanGroupingIndicator = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidFileFormatForOtherReasonThanGroupingIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.InvalidFileFormatForOtherReasonThanGroupingIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankIdentifierIncorrect"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code BankIdentifierIncorrect = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankIdentifierIncorrect";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.BankIdentifierIncorrect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerDeceased"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code EndCustomerDeceased = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerDeceased";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.EndCustomerDeceased.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonCustomerGenerated"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code NotSpecifiedReasonCustomerGenerated = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedReasonCustomerGenerated";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.NotSpecifiedReasonCustomerGenerated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedReasonAgentGenerated"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code NotSpecifiedReasonAgentGenerated = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedReasonAgentGenerated";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.NotSpecifiedReasonAgentGenerated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionRejectReason6Code
	 * TransactionRejectReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * </ul>
	 */
	public static final TransactionRejectReason6Code CutOffTime = new TransactionRejectReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionRejectReason6Code.mmObject();
			codeName = TransactionReasonCode.CutOffTime.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionRejectReason6Code> codesByName = new LinkedHashMap<>();

	protected TransactionRejectReason6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AC01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionRejectReason6Code";
				definition = "Specifies the reason for a transaction to be rejected or returned by an instructed agent or somebody acting on behalf of an instructed agent.";
				trace_lazy = () -> TransactionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionRejectReason6Code.IncorrectAccountNumber, com.tools20022.repository.codeset.TransactionRejectReason6Code.ClosedAccountNumber,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.BlockedAccount, com.tools20022.repository.codeset.TransactionRejectReason6Code.TransactionForbidden,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.InvalidBankOperationCode, com.tools20022.repository.codeset.TransactionRejectReason6Code.InsufficientFunds,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.Duplication, com.tools20022.repository.codeset.TransactionRejectReason6Code.NoMandate,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.MissingMandatoryInformationInMandate,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.InvalidFileFormatForOtherReasonThanGroupingIndicator, com.tools20022.repository.codeset.TransactionRejectReason6Code.BankIdentifierIncorrect,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.EndCustomerDeceased, com.tools20022.repository.codeset.TransactionRejectReason6Code.NotSpecifiedReasonCustomerGenerated,
						com.tools20022.repository.codeset.TransactionRejectReason6Code.NotSpecifiedReasonAgentGenerated, com.tools20022.repository.codeset.TransactionRejectReason6Code.CutOffTime);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectAccountNumber.getCodeName().get(), IncorrectAccountNumber);
		codesByName.put(ClosedAccountNumber.getCodeName().get(), ClosedAccountNumber);
		codesByName.put(BlockedAccount.getCodeName().get(), BlockedAccount);
		codesByName.put(TransactionForbidden.getCodeName().get(), TransactionForbidden);
		codesByName.put(InvalidBankOperationCode.getCodeName().get(), InvalidBankOperationCode);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(Duplication.getCodeName().get(), Duplication);
		codesByName.put(NoMandate.getCodeName().get(), NoMandate);
		codesByName.put(MissingMandatoryInformationInMandate.getCodeName().get(), MissingMandatoryInformationInMandate);
		codesByName.put(InvalidFileFormatForOtherReasonThanGroupingIndicator.getCodeName().get(), InvalidFileFormatForOtherReasonThanGroupingIndicator);
		codesByName.put(BankIdentifierIncorrect.getCodeName().get(), BankIdentifierIncorrect);
		codesByName.put(EndCustomerDeceased.getCodeName().get(), EndCustomerDeceased);
		codesByName.put(NotSpecifiedReasonCustomerGenerated.getCodeName().get(), NotSpecifiedReasonCustomerGenerated);
		codesByName.put(NotSpecifiedReasonAgentGenerated.getCodeName().get(), NotSpecifiedReasonAgentGenerated);
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
	}

	public static TransactionRejectReason6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionRejectReason6Code[] values() {
		TransactionRejectReason6Code[] values = new TransactionRejectReason6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionRejectReason6Code> {
		@Override
		public TransactionRejectReason6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionRejectReason6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}