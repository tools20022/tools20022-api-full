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
 * Indicates the reason for rejecting a modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyRelatedReference
 * PaymentModificationRejection1Code.mmUnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyBankOperationCode
 * PaymentModificationRejection1Code.mmUnableToModifyBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyInstructionCode
 * PaymentModificationRejection1Code.mmUnableToModifyInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyRequestedExecutionDate
 * PaymentModificationRejection1Code.mmUnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyValueDate
 * PaymentModificationRejection1Code.mmUnableToModifyValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyInterbankSettlementAccount
 * PaymentModificationRejection1Code.mmUnableToModifyInterbankSettlementAccount}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyDebtor
 * PaymentModificationRejection1Code.mmUnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyDebtorAccount
 * PaymentModificationRejection1Code.mmUnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyReceiverCorrespondent
 * PaymentModificationRejection1Code.mmUnableToModifyReceiverCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyThirdReimbursementInstitution
 * PaymentModificationRejection1Code.
 * mmUnableToModifyThirdReimbursementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyPaymentScheme
 * PaymentModificationRejection1Code.mmUnableToModifyPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyAccountofBeneficiaryInstitution
 * PaymentModificationRejection1Code.
 * mmUnableToModifyAccountofBeneficiaryInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyCreditor
 * PaymentModificationRejection1Code.mmUnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyCreditorAccount
 * PaymentModificationRejection1Code.mmUnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyRemittanceInformation
 * PaymentModificationRejection1Code.mmUnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyPaymentPurpose
 * PaymentModificationRejection1Code.mmUnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyDetailsOfCharges
 * PaymentModificationRejection1Code.mmUnableToModifyDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifySenderToReceiverInformation
 * PaymentModificationRejection1Code.mmUnableToModifySenderToReceiverInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifyInstructionForFinalAgent
 * PaymentModificationRejection1Code.mmUnableToModifyInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmInstructionCancelledSubmitNewInstruction
 * PaymentModificationRejection1Code.mmInstructionCancelledSubmitNewInstruction}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#mmUnableToModifySubmitCancellation
 * PaymentModificationRejection1Code.mmUnableToModifySubmitCancellation}</li>
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
 * <li>"UM01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentModificationRejection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the reason for rejecting a modification."</li>
 * </ul>
 */
public class PaymentModificationRejection1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * RelatedReference cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RelatedReference cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRelatedReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			definition = "RelatedReference cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM01";
		}
	};
	/**
	 * BankOperationCode cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyBankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BankOperationCode cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyBankOperationCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyBankOperationCode";
			definition = "BankOperationCode cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM02";
		}
	};
	/**
	 * InstructionCode cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InstructionCode  cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionCode";
			definition = "InstructionCode  cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM03";
		}
	};
	/**
	 * RequestedExecutionDate cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RequestedExecutionDate  cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRequestedExecutionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			definition = "RequestedExecutionDate  cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM04";
		}
	};
	/**
	 * ValueDate cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ValueDate  cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyValueDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyValueDate";
			definition = "ValueDate  cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM05";
		}
	};
	/**
	 * InterbankSettlementAccount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInterbankSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InterbankSettlementAccount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInterbankSettlementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			definition = "InterbankSettlementAccount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM06";
		}
	};
	/**
	 * Debtor cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM07"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			definition = "Debtor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM07";
		}
	};
	/**
	 * DebtorAccount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM08"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DebtorAccount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDebtorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			definition = "DebtorAccount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM08";
		}
	};
	/**
	 * ReceiverCorrespondent cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM09"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyReceiverCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ReceiverCorrespondent cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyReceiverCorrespondent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyReceiverCorrespondent";
			definition = "ReceiverCorrespondent cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM09";
		}
	};
	/**
	 * ThirdReimbursementInstitution cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM10"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyThirdReimbursementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ThirdReimbursementInstitution cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyThirdReimbursementInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementInstitution";
			definition = "ThirdReimbursementInstitution cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM10";
		}
	};
	/**
	 * PaymentScheme cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PaymentScheme cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentScheme";
			definition = "PaymentScheme cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM11";
		}
	};
	/**
	 * AccountOfBeneficiaryInstitution cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyAccountofBeneficiaryInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "AccountOfBeneficiaryInstitution cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyAccountofBeneficiaryInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyAccountofBeneficiaryInstitution";
			definition = "AccountOfBeneficiaryInstitution cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM12";
		}
	};
	/**
	 * Creditor cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			definition = "Creditor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM13";
		}
	};
	/**
	 * CreditorAccount cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CreditorAccount cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyCreditorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			definition = "CreditorAccount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM14";
		}
	};
	/**
	 * RemittanceInformation cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RemittanceInformation cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyRemittanceInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			definition = "RemittanceInformation cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM15";
		}
	};
	/**
	 * PaymentPurpose cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM16"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PaymentPurpose cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyPaymentPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			definition = "PaymentPurpose cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM16";
		}
	};
	/**
	 * DetailsOfCharges cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM17"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyDetailsOfCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DetailsOfCharges cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyDetailsOfCharges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDetailsOfCharges";
			definition = "DetailsOfCharges cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM17";
		}
	};
	/**
	 * SenderToReceiver cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM18"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifySenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SenderToReceiver cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifySenderToReceiverInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySenderToReceiverInformation";
			definition = "SenderToReceiver cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM18";
		}
	};
	/**
	 * InstructionForFinalAgent cannot be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM19"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifyInstructionForFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "InstructionForFinalAgent cannot be modified."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifyInstructionForFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForFinalAgent";
			definition = "InstructionForFinalAgent cannot be modified.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM19";
		}
	};
	/**
	 * Used to inform of cancellation and request a new payment instruction.
	 * This should only be used if an agent does not want to modify a pending
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM20"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancelledSubmitNewInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstructionCancelledSubmitNewInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			definition = "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM20";
		}
	};
	/**
	 * Modification is not possible and the cancellation is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code
	 * PaymentModificationRejection1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UM21"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToModifySubmitCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification is not possible and the cancellation is requested."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToModifySubmitCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			definition = "Modification is not possible and the cancellation is requested.";
			owner_lazy = () -> PaymentModificationRejection1Code.mmObject();
			codeName = "UM21";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("UM01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentModificationRejection1Code";
				definition = "Indicates the reason for rejecting a modification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyRelatedReference,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyBankOperationCode, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyInstructionCode,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyRequestedExecutionDate, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyValueDate,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyInterbankSettlementAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyDebtor,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyDebtorAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyReceiverCorrespondent,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyThirdReimbursementInstitution, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyPaymentScheme,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyAccountofBeneficiaryInstitution, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyCreditor,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyCreditorAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyRemittanceInformation,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyPaymentPurpose, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyDetailsOfCharges,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifySenderToReceiverInformation,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifyInstructionForFinalAgent,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmInstructionCancelledSubmitNewInstruction, com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmUnableToModifySubmitCancellation);
			}
		});
		return mmObject_lazy.get();
	}
}