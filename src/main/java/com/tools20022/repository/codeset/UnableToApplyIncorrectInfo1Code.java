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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Used when the unable to apply is due to incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectRelatedReference
 * UnableToApplyIncorrectInfo1Code.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectBankOperationCode
 * UnableToApplyIncorrectInfo1Code.IncorrectBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectInstructionCode
 * UnableToApplyIncorrectInfo1Code.IncorrectInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInfo1Code.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectValueDate
 * UnableToApplyIncorrectInfo1Code.IncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectInterbankSettledAmount
 * UnableToApplyIncorrectInfo1Code.IncorrectInterbankSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectDebtor
 * UnableToApplyIncorrectInfo1Code.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectDebtorAccount
 * UnableToApplyIncorrectInfo1Code.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectReceiverCorrespondent
 * UnableToApplyIncorrectInfo1Code.IncorrectReceiverCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectThirdReimbursementInstitution
 * UnableToApplyIncorrectInfo1Code.IncorrectThirdReimbursementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectPaymentScheme
 * UnableToApplyIncorrectInfo1Code.IncorrectPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectAccountOfBeneficiaryInstitution
 * UnableToApplyIncorrectInfo1Code.IncorrectAccountOfBeneficiaryInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectCreditor
 * UnableToApplyIncorrectInfo1Code.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectCreditorAccount
 * UnableToApplyIncorrectInfo1Code.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInfo1Code.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInfo1Code.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectDetailsOfCharges
 * UnableToApplyIncorrectInfo1Code.IncorrectDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectSenderToReceiverInformation
 * UnableToApplyIncorrectInfo1Code.IncorrectSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#IncorrectInstructionForFinalAgent
 * UnableToApplyIncorrectInfo1Code.IncorrectInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInfo1Code.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInfo1Code.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code#MismatchFinalAgentNameAccount
 * UnableToApplyIncorrectInfo1Code.MismatchFinalAgentNameAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode
 * UnableToApplyIncorrectInfoCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrectInfo1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used when the unable to apply is due to incorrect information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"IN01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyIncorrectInfo1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectRelatedReference = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRelatedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRelatedReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectBankOperationCode = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectBankOperationCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectBankOperationCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectInstructionCode = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInstructionCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRequestedExecutionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectValueDate = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectValueDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectValueDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectInterbankSettledAmount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettledAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInterbankSettledAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectDebtor = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectDebtorAccount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReceiverCorrespondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectReceiverCorrespondent = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectReceiverCorrespondent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectReceiverCorrespondent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectThirdReimbursementInstitution = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectThirdReimbursementInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectThirdReimbursementInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectPaymentScheme = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentScheme";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectPaymentScheme.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountOfBeneficiaryInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectAccountOfBeneficiaryInstitution = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountOfBeneficiaryInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectAccountOfBeneficiaryInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectCreditor = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectCreditorAccount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectRemittanceInformation = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectPaymentPurpose = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDetailsOfCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectDetailsOfCharges = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDetailsOfCharges";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDetailsOfCharges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectSenderToReceiverInformation = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSenderToReceiverInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectSenderToReceiverInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code IncorrectInstructionForFinalAgent = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInstructionForFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code MismatchCreditorNameAccount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchCreditorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code MismatchDebtorNameAccount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchDebtorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchDebtorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchFinalAgentNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo1Code MismatchFinalAgentNameAccount = new UnableToApplyIncorrectInfo1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchFinalAgentNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchFinalAgentNameAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInfo1Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInfo1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInfo1Code";
				definition = "Used when the unable to apply is due to incorrect information.";
				trace_lazy = () -> UnableToApplyIncorrectInfoCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectRelatedReference, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectBankOperationCode,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectInstructionCode, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectRequestedExecutionDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectValueDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectInterbankSettledAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectDebtor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectDebtorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectReceiverCorrespondent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectThirdReimbursementInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectPaymentScheme, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectAccountOfBeneficiaryInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectCreditor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectRemittanceInformation, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectDetailsOfCharges, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectSenderToReceiverInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.IncorrectInstructionForFinalAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code.MismatchFinalAgentNameAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectRelatedReference.getCodeName().get(), IncorrectRelatedReference);
		codesByName.put(IncorrectBankOperationCode.getCodeName().get(), IncorrectBankOperationCode);
		codesByName.put(IncorrectInstructionCode.getCodeName().get(), IncorrectInstructionCode);
		codesByName.put(IncorrectRequestedExecutionDate.getCodeName().get(), IncorrectRequestedExecutionDate);
		codesByName.put(IncorrectValueDate.getCodeName().get(), IncorrectValueDate);
		codesByName.put(IncorrectInterbankSettledAmount.getCodeName().get(), IncorrectInterbankSettledAmount);
		codesByName.put(IncorrectDebtor.getCodeName().get(), IncorrectDebtor);
		codesByName.put(IncorrectDebtorAccount.getCodeName().get(), IncorrectDebtorAccount);
		codesByName.put(IncorrectReceiverCorrespondent.getCodeName().get(), IncorrectReceiverCorrespondent);
		codesByName.put(IncorrectThirdReimbursementInstitution.getCodeName().get(), IncorrectThirdReimbursementInstitution);
		codesByName.put(IncorrectPaymentScheme.getCodeName().get(), IncorrectPaymentScheme);
		codesByName.put(IncorrectAccountOfBeneficiaryInstitution.getCodeName().get(), IncorrectAccountOfBeneficiaryInstitution);
		codesByName.put(IncorrectCreditor.getCodeName().get(), IncorrectCreditor);
		codesByName.put(IncorrectCreditorAccount.getCodeName().get(), IncorrectCreditorAccount);
		codesByName.put(IncorrectRemittanceInformation.getCodeName().get(), IncorrectRemittanceInformation);
		codesByName.put(IncorrectPaymentPurpose.getCodeName().get(), IncorrectPaymentPurpose);
		codesByName.put(IncorrectDetailsOfCharges.getCodeName().get(), IncorrectDetailsOfCharges);
		codesByName.put(IncorrectSenderToReceiverInformation.getCodeName().get(), IncorrectSenderToReceiverInformation);
		codesByName.put(IncorrectInstructionForFinalAgent.getCodeName().get(), IncorrectInstructionForFinalAgent);
		codesByName.put(MismatchCreditorNameAccount.getCodeName().get(), MismatchCreditorNameAccount);
		codesByName.put(MismatchDebtorNameAccount.getCodeName().get(), MismatchDebtorNameAccount);
		codesByName.put(MismatchFinalAgentNameAccount.getCodeName().get(), MismatchFinalAgentNameAccount);
	}

	public static UnableToApplyIncorrectInfo1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInfo1Code[] values() {
		UnableToApplyIncorrectInfo1Code[] values = new UnableToApplyIncorrectInfo1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInfo1Code> {
		@Override
		public UnableToApplyIncorrectInfo1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInfo1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}