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
import com.tools20022.repository.codeset.PaymentModificationRejection1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the reason for rejecting a modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyRelatedReference
 * PaymentModificationRejection1Code.UnableToModifyRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyBankOperationCode
 * PaymentModificationRejection1Code.UnableToModifyBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyInstructionCode
 * PaymentModificationRejection1Code.UnableToModifyInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyRequestedExecutionDate
 * PaymentModificationRejection1Code.UnableToModifyRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyValueDate
 * PaymentModificationRejection1Code.UnableToModifyValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyInterbankSettlementAccount
 * PaymentModificationRejection1Code.UnableToModifyInterbankSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyDebtor
 * PaymentModificationRejection1Code.UnableToModifyDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyDebtorAccount
 * PaymentModificationRejection1Code.UnableToModifyDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyReceiverCorrespondent
 * PaymentModificationRejection1Code.UnableToModifyReceiverCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyThirdReimbursementInstitution
 * PaymentModificationRejection1Code.UnableToModifyThirdReimbursementInstitution
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyPaymentScheme
 * PaymentModificationRejection1Code.UnableToModifyPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyAccountofBeneficiaryInstitution
 * PaymentModificationRejection1Code.
 * UnableToModifyAccountofBeneficiaryInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyCreditor
 * PaymentModificationRejection1Code.UnableToModifyCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyCreditorAccount
 * PaymentModificationRejection1Code.UnableToModifyCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyRemittanceInformation
 * PaymentModificationRejection1Code.UnableToModifyRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyPaymentPurpose
 * PaymentModificationRejection1Code.UnableToModifyPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyDetailsOfCharges
 * PaymentModificationRejection1Code.UnableToModifyDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifySenderToReceiverInformation
 * PaymentModificationRejection1Code.UnableToModifySenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifyInstructionForFinalAgent
 * PaymentModificationRejection1Code.UnableToModifyInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#InstructionCancelledSubmitNewInstruction
 * PaymentModificationRejection1Code.InstructionCancelledSubmitNewInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentModificationRejection1Code#UnableToModifySubmitCancellation
 * PaymentModificationRejection1Code.UnableToModifySubmitCancellation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentModificationRejection1Code extends MMCode {

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
	public static final PaymentModificationRejection1Code UnableToModifyRelatedReference = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			definition = "RelatedReference cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyBankOperationCode = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyBankOperationCode";
			definition = "BankOperationCode cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyInstructionCode = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionCode";
			definition = "InstructionCode  cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyRequestedExecutionDate = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			definition = "RequestedExecutionDate  cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyValueDate = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyValueDate";
			definition = "ValueDate  cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyInterbankSettlementAccount = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			definition = "InterbankSettlementAccount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyDebtor = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			definition = "Debtor cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyDebtorAccount = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			definition = "DebtorAccount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyReceiverCorrespondent = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyReceiverCorrespondent";
			definition = "ReceiverCorrespondent cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyThirdReimbursementInstitution = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementInstitution";
			definition = "ThirdReimbursementInstitution cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyPaymentScheme = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentScheme";
			definition = "PaymentScheme cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyAccountofBeneficiaryInstitution = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyAccountofBeneficiaryInstitution";
			definition = "AccountOfBeneficiaryInstitution cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyCreditor = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			definition = "Creditor cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyCreditorAccount = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			definition = "CreditorAccount cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyRemittanceInformation = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			definition = "RemittanceInformation cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyPaymentPurpose = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			definition = "PaymentPurpose cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyDetailsOfCharges = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDetailsOfCharges";
			definition = "DetailsOfCharges cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifySenderToReceiverInformation = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySenderToReceiverInformation";
			definition = "SenderToReceiver cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifyInstructionForFinalAgent = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForFinalAgent";
			definition = "InstructionForFinalAgent cannot be modified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code InstructionCancelledSubmitNewInstruction = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			definition = "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
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
	public static final PaymentModificationRejection1Code UnableToModifySubmitCancellation = new PaymentModificationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			definition = "Modification is not possible and the cancellation is requested.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentModificationRejection1Code.mmObject();
			codeName = "UM21";
		}
	};
	final static private LinkedHashMap<String, PaymentModificationRejection1Code> codesByName = new LinkedHashMap<>();

	protected PaymentModificationRejection1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UM01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentModificationRejection1Code";
				definition = "Indicates the reason for rejecting a modification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyRelatedReference,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyBankOperationCode, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyInstructionCode,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyRequestedExecutionDate, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyValueDate,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyInterbankSettlementAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyDebtor,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyDebtorAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyReceiverCorrespondent,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyThirdReimbursementInstitution, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyPaymentScheme,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyAccountofBeneficiaryInstitution, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyCreditor,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyCreditorAccount, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyRemittanceInformation,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyPaymentPurpose, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyDetailsOfCharges,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifySenderToReceiverInformation,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifyInstructionForFinalAgent,
						com.tools20022.repository.codeset.PaymentModificationRejection1Code.InstructionCancelledSubmitNewInstruction, com.tools20022.repository.codeset.PaymentModificationRejection1Code.UnableToModifySubmitCancellation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnableToModifyRelatedReference.getCodeName().get(), UnableToModifyRelatedReference);
		codesByName.put(UnableToModifyBankOperationCode.getCodeName().get(), UnableToModifyBankOperationCode);
		codesByName.put(UnableToModifyInstructionCode.getCodeName().get(), UnableToModifyInstructionCode);
		codesByName.put(UnableToModifyRequestedExecutionDate.getCodeName().get(), UnableToModifyRequestedExecutionDate);
		codesByName.put(UnableToModifyValueDate.getCodeName().get(), UnableToModifyValueDate);
		codesByName.put(UnableToModifyInterbankSettlementAccount.getCodeName().get(), UnableToModifyInterbankSettlementAccount);
		codesByName.put(UnableToModifyDebtor.getCodeName().get(), UnableToModifyDebtor);
		codesByName.put(UnableToModifyDebtorAccount.getCodeName().get(), UnableToModifyDebtorAccount);
		codesByName.put(UnableToModifyReceiverCorrespondent.getCodeName().get(), UnableToModifyReceiverCorrespondent);
		codesByName.put(UnableToModifyThirdReimbursementInstitution.getCodeName().get(), UnableToModifyThirdReimbursementInstitution);
		codesByName.put(UnableToModifyPaymentScheme.getCodeName().get(), UnableToModifyPaymentScheme);
		codesByName.put(UnableToModifyAccountofBeneficiaryInstitution.getCodeName().get(), UnableToModifyAccountofBeneficiaryInstitution);
		codesByName.put(UnableToModifyCreditor.getCodeName().get(), UnableToModifyCreditor);
		codesByName.put(UnableToModifyCreditorAccount.getCodeName().get(), UnableToModifyCreditorAccount);
		codesByName.put(UnableToModifyRemittanceInformation.getCodeName().get(), UnableToModifyRemittanceInformation);
		codesByName.put(UnableToModifyPaymentPurpose.getCodeName().get(), UnableToModifyPaymentPurpose);
		codesByName.put(UnableToModifyDetailsOfCharges.getCodeName().get(), UnableToModifyDetailsOfCharges);
		codesByName.put(UnableToModifySenderToReceiverInformation.getCodeName().get(), UnableToModifySenderToReceiverInformation);
		codesByName.put(UnableToModifyInstructionForFinalAgent.getCodeName().get(), UnableToModifyInstructionForFinalAgent);
		codesByName.put(InstructionCancelledSubmitNewInstruction.getCodeName().get(), InstructionCancelledSubmitNewInstruction);
		codesByName.put(UnableToModifySubmitCancellation.getCodeName().get(), UnableToModifySubmitCancellation);
	}

	public static PaymentModificationRejection1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentModificationRejection1Code[] values() {
		PaymentModificationRejection1Code[] values = new PaymentModificationRejection1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentModificationRejection1Code> {
		@Override
		public PaymentModificationRejection1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentModificationRejection1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}