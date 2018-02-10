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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectRelatedReference
 * UnableToApplyIncorrectInfo2Code.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectBankOperationCode
 * UnableToApplyIncorrectInfo2Code.IncorrectBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectInstructionCode
 * UnableToApplyIncorrectInfo2Code.IncorrectInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInfo2Code.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectValueDate
 * UnableToApplyIncorrectInfo2Code.IncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectInterbankSettledAmount
 * UnableToApplyIncorrectInfo2Code.IncorrectInterbankSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectDebtor
 * UnableToApplyIncorrectInfo2Code.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectDebtorAccount
 * UnableToApplyIncorrectInfo2Code.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectReceiverCorrespondent
 * UnableToApplyIncorrectInfo2Code.IncorrectReceiverCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectThirdReimbursementInstitution
 * UnableToApplyIncorrectInfo2Code.IncorrectThirdReimbursementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectPaymentScheme
 * UnableToApplyIncorrectInfo2Code.IncorrectPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectAccountOfBeneficiaryInstitution
 * UnableToApplyIncorrectInfo2Code.IncorrectAccountOfBeneficiaryInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectCreditor
 * UnableToApplyIncorrectInfo2Code.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectCreditorAccount
 * UnableToApplyIncorrectInfo2Code.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInfo2Code.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInfo2Code.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectDetailsOfCharges
 * UnableToApplyIncorrectInfo2Code.IncorrectDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectSenderToReceiverInformation
 * UnableToApplyIncorrectInfo2Code.IncorrectSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#IncorrectInstructionForFinalAgent
 * UnableToApplyIncorrectInfo2Code.IncorrectInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInfo2Code.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInfo2Code.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#MismatchFinalAgentNameAccount
 * UnableToApplyIncorrectInfo2Code.MismatchFinalAgentNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#InsufficientDebtorDetails
 * UnableToApplyIncorrectInfo2Code.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code#InsufficientCreditorDetails
 * UnableToApplyIncorrectInfo2Code.InsufficientCreditorDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrectInfo2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Used when the unable to apply is due to incorrect information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyIncorrectInfo2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectRelatedReference = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRelatedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRelatedReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBankOperationCode"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectBankOperationCode = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectBankOperationCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectBankOperationCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionCode"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectInstructionCode = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInstructionCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRequestedExecutionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectValueDate = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectValueDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectValueDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettledAmount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectInterbankSettledAmount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettledAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInterbankSettledAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectDebtor = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectDebtorAccount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReceiverCorrespondent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectReceiverCorrespondent = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectReceiverCorrespondent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectReceiverCorrespondent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementInstitution"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectThirdReimbursementInstitution = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectThirdReimbursementInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectThirdReimbursementInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentScheme"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectPaymentScheme = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentScheme";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectPaymentScheme.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountOfBeneficiaryInstitution"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectAccountOfBeneficiaryInstitution = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountOfBeneficiaryInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectAccountOfBeneficiaryInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectCreditor = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectCreditorAccount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectRemittanceInformation = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectPaymentPurpose = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDetailsOfCharges"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectDetailsOfCharges = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDetailsOfCharges";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectDetailsOfCharges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSenderToReceiverInformation"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectSenderToReceiverInformation = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSenderToReceiverInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectSenderToReceiverInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForFinalAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code IncorrectInstructionForFinalAgent = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.IncorrectInstructionForFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code MismatchCreditorNameAccount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchCreditorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code MismatchDebtorNameAccount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchDebtorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchDebtorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchFinalAgentNameAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code MismatchFinalAgentNameAccount = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchFinalAgentNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.MismatchFinalAgentNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code InsufficientDebtorDetails = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.InsufficientDebtorDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code
	 * UnableToApplyIncorrectInfo2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInfo2Code InsufficientCreditorDetails = new UnableToApplyIncorrectInfo2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.mmObject();
			codeName = UnableToApplyIncorrectInfoCode.InsufficientCreditorDetails.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInfo2Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInfo2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInfo2Code";
				definition = "Used when the unable to apply is due to incorrect information.";
				trace_lazy = () -> UnableToApplyIncorrectInfoCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectRelatedReference, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectBankOperationCode,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectInstructionCode, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectRequestedExecutionDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectValueDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectInterbankSettledAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectDebtor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectDebtorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectReceiverCorrespondent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectThirdReimbursementInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectPaymentScheme, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectAccountOfBeneficiaryInstitution,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectCreditor, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectRemittanceInformation, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectDetailsOfCharges, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectSenderToReceiverInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.IncorrectInstructionForFinalAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.MismatchFinalAgentNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.InsufficientDebtorDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInfo2Code.InsufficientCreditorDetails);
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
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
	}

	public static UnableToApplyIncorrectInfo2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInfo2Code[] values() {
		UnableToApplyIncorrectInfo2Code[] values = new UnableToApplyIncorrectInfo2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInfo2Code> {
		@Override
		public UnableToApplyIncorrectInfo2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInfo2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}