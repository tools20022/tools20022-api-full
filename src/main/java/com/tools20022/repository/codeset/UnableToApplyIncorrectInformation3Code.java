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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of an unable to apply due to incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectRelatedReference
 * UnableToApplyIncorrectInformation3Code.IncorrectRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectPaymentServiceLevel
 * UnableToApplyIncorrectInformation3Code.IncorrectPaymentServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectCategoryPurpose
 * UnableToApplyIncorrectInformation3Code.IncorrectCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectRequestedExecutionDate
 * UnableToApplyIncorrectInformation3Code.IncorrectRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInterbankSettlementDate
 * UnableToApplyIncorrectInformation3Code.IncorrectInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInterbankSettlementAmount
 * UnableToApplyIncorrectInformation3Code.IncorrectInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectDebtor
 * UnableToApplyIncorrectInformation3Code.IncorrectDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectDebtorAccount
 * UnableToApplyIncorrectInformation3Code.IncorrectDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInstructedReimbursementAgent
 * UnableToApplyIncorrectInformation3Code.IncorrectInstructedReimbursementAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectThirdReimbursementAgent
 * UnableToApplyIncorrectInformation3Code.IncorrectThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectPaymentClearingChannel
 * UnableToApplyIncorrectInformation3Code.IncorrectPaymentClearingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectCreditorAgentAccount
 * UnableToApplyIncorrectInformation3Code.IncorrectCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectCreditor
 * UnableToApplyIncorrectInformation3Code.IncorrectCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectCreditorAccount
 * UnableToApplyIncorrectInformation3Code.IncorrectCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectRemittanceInformation
 * UnableToApplyIncorrectInformation3Code.IncorrectRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectPaymentPurpose
 * UnableToApplyIncorrectInformation3Code.IncorrectPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectChargeBearer
 * UnableToApplyIncorrectInformation3Code.IncorrectChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInstructionForNextAgent
 * UnableToApplyIncorrectInformation3Code.IncorrectInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInstructionForCreditorAgent
 * UnableToApplyIncorrectInformation3Code.IncorrectInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#MismatchCreditorNameAccount
 * UnableToApplyIncorrectInformation3Code.MismatchCreditorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#MismatchDebtorNameAccount
 * UnableToApplyIncorrectInformation3Code.MismatchDebtorNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#MismatchCreditorAgentNameAccount
 * UnableToApplyIncorrectInformation3Code.MismatchCreditorAgentNameAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PendingExecutionDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformation3Code.
 * PendingExecutionDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PendingExecutionDebtorNameOrAddress
 * UnableToApplyIncorrectInformation3Code.PendingExecutionDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PaymentExecutedDebtorAccountOrIdentification
 * UnableToApplyIncorrectInformation3Code.
 * PaymentExecutedDebtorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PaymentExecutedDebtorNameOrAddress
 * UnableToApplyIncorrectInformation3Code.PaymentExecutedDebtorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PendingExecutionCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformation3Code.
 * PendingExecutionCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PendingExecutionCreditorNameOrAddress
 * UnableToApplyIncorrectInformation3Code.PendingExecutionCreditorNameOrAddress}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PaymentExecutedCreditorAccountOrIdentification
 * UnableToApplyIncorrectInformation3Code.
 * PaymentExecutedCreditorAccountOrIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#PaymentExecutedCreditorNameOrAddress
 * UnableToApplyIncorrectInformation3Code.PaymentExecutedCreditorNameOrAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectReportEntryAmount
 * UnableToApplyIncorrectInformation3Code.IncorrectReportEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#InsufficientChargesDetails
 * UnableToApplyIncorrectInformation3Code.InsufficientChargesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#InsufficientPaymentPurpose
 * UnableToApplyIncorrectInformation3Code.InsufficientPaymentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectSettlementAccount
 * UnableToApplyIncorrectInformation3Code.IncorrectSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectInstructingReimbursementAgent
 * UnableToApplyIncorrectInformation3Code.IncorrectInstructingReimbursementAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectDebtorAddress
 * UnableToApplyIncorrectInformation3Code.IncorrectDebtorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code#IncorrectCreditorAddress
 * UnableToApplyIncorrectInformation3Code.IncorrectCreditorAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformationV2Code
 * UnableToApplyIncorrectInformationV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrectInformation3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to incorrect information."</li>
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
public class UnableToApplyIncorrectInformation3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectRelatedReference = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRelatedReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRelatedReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectPaymentServiceLevel = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentServiceLevel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentServiceLevel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectCategoryPurpose = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCategoryPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCategoryPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectRequestedExecutionDate = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRequestedExecutionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRequestedExecutionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInterbankSettlementDate = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInterbankSettlementAmount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInterbankSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInterbankSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectDebtor = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectDebtorAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInstructedReimbursementAgent = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructedReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructedReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectThirdReimbursementAgent = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectThirdReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectThirdReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentClearingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectPaymentClearingChannel = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentClearingChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentClearingChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectCreditorAgentAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAgentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAgentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectCreditor = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectCreditorAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectRemittanceInformation = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectPaymentPurpose = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectChargeBearer = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectChargeBearer";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectChargeBearer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInstructionForNextAgent = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForNextAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInstructionForCreditorAgent = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructionForCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructionForCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code MismatchCreditorNameAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchCreditorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchDebtorNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code MismatchDebtorNameAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchDebtorNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchDebtorNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchCreditorAgentNameAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code MismatchCreditorAgentNameAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchCreditorAgentNameAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.MismatchCreditorAgentNameAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PendingExecutionDebtorAccountOrIdentification = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionDebtorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PendingExecutionDebtorNameOrAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionDebtorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionDebtorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PaymentExecutedDebtorAccountOrIdentification = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedDebtorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PaymentExecutedDebtorNameOrAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedDebtorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedDebtorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PendingExecutionCreditorAccountOrIdentification = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingExecutionCreditorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PendingExecutionCreditorNameOrAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingExecutionCreditorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PendingExecutionCreditorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorAccountOrIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PaymentExecutedCreditorAccountOrIdentification = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorAccountOrIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorAccountOrIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecutedCreditorNameOrAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code PaymentExecutedCreditorNameOrAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentExecutedCreditorNameOrAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.PaymentExecutedCreditorNameOrAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectReportEntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectReportEntryAmount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectReportEntryAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectReportEntryAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientChargesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code InsufficientChargesDetails = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientChargesDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.InsufficientChargesDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientPaymentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code InsufficientPaymentPurpose = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientPaymentPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.InsufficientPaymentPurpose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectSettlementAccount = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectSettlementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectInstructingReimbursementAgent = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInstructingReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectInstructingReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDebtorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectDebtorAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDebtorAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectDebtorAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code
	 * UnableToApplyIncorrectInformation3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCreditorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyIncorrectInformation3Code IncorrectCreditorAddress = new UnableToApplyIncorrectInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCreditorAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.mmObject();
			codeName = UnableToApplyIncorrectInformationV2Code.IncorrectCreditorAddress.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyIncorrectInformation3Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyIncorrectInformation3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("IN01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrectInformation3Code";
				definition = "Specifies the reason of an unable to apply due to incorrect information.";
				trace_lazy = () -> UnableToApplyIncorrectInformationV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectRelatedReference,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectPaymentServiceLevel, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectCategoryPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectRequestedExecutionDate, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInterbankSettlementDate,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInterbankSettlementAmount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectDebtor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectDebtorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInstructedReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectThirdReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectPaymentClearingChannel,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectCreditorAgentAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectCreditor,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectCreditorAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectPaymentPurpose, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectChargeBearer,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInstructionForNextAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.MismatchCreditorNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.MismatchDebtorNameAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.MismatchCreditorAgentNameAccount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PendingExecutionDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PendingExecutionDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PaymentExecutedDebtorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PaymentExecutedDebtorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PendingExecutionCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PendingExecutionCreditorNameOrAddress,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PaymentExecutedCreditorAccountOrIdentification,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.PaymentExecutedCreditorNameOrAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectReportEntryAmount,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.InsufficientChargesDetails, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.InsufficientPaymentPurpose,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectSettlementAccount, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectDebtorAddress, com.tools20022.repository.codeset.UnableToApplyIncorrectInformation3Code.IncorrectCreditorAddress);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectRelatedReference.getCodeName().get(), IncorrectRelatedReference);
		codesByName.put(IncorrectPaymentServiceLevel.getCodeName().get(), IncorrectPaymentServiceLevel);
		codesByName.put(IncorrectCategoryPurpose.getCodeName().get(), IncorrectCategoryPurpose);
		codesByName.put(IncorrectRequestedExecutionDate.getCodeName().get(), IncorrectRequestedExecutionDate);
		codesByName.put(IncorrectInterbankSettlementDate.getCodeName().get(), IncorrectInterbankSettlementDate);
		codesByName.put(IncorrectInterbankSettlementAmount.getCodeName().get(), IncorrectInterbankSettlementAmount);
		codesByName.put(IncorrectDebtor.getCodeName().get(), IncorrectDebtor);
		codesByName.put(IncorrectDebtorAccount.getCodeName().get(), IncorrectDebtorAccount);
		codesByName.put(IncorrectInstructedReimbursementAgent.getCodeName().get(), IncorrectInstructedReimbursementAgent);
		codesByName.put(IncorrectThirdReimbursementAgent.getCodeName().get(), IncorrectThirdReimbursementAgent);
		codesByName.put(IncorrectPaymentClearingChannel.getCodeName().get(), IncorrectPaymentClearingChannel);
		codesByName.put(IncorrectCreditorAgentAccount.getCodeName().get(), IncorrectCreditorAgentAccount);
		codesByName.put(IncorrectCreditor.getCodeName().get(), IncorrectCreditor);
		codesByName.put(IncorrectCreditorAccount.getCodeName().get(), IncorrectCreditorAccount);
		codesByName.put(IncorrectRemittanceInformation.getCodeName().get(), IncorrectRemittanceInformation);
		codesByName.put(IncorrectPaymentPurpose.getCodeName().get(), IncorrectPaymentPurpose);
		codesByName.put(IncorrectChargeBearer.getCodeName().get(), IncorrectChargeBearer);
		codesByName.put(IncorrectInstructionForNextAgent.getCodeName().get(), IncorrectInstructionForNextAgent);
		codesByName.put(IncorrectInstructionForCreditorAgent.getCodeName().get(), IncorrectInstructionForCreditorAgent);
		codesByName.put(MismatchCreditorNameAccount.getCodeName().get(), MismatchCreditorNameAccount);
		codesByName.put(MismatchDebtorNameAccount.getCodeName().get(), MismatchDebtorNameAccount);
		codesByName.put(MismatchCreditorAgentNameAccount.getCodeName().get(), MismatchCreditorAgentNameAccount);
		codesByName.put(PendingExecutionDebtorAccountOrIdentification.getCodeName().get(), PendingExecutionDebtorAccountOrIdentification);
		codesByName.put(PendingExecutionDebtorNameOrAddress.getCodeName().get(), PendingExecutionDebtorNameOrAddress);
		codesByName.put(PaymentExecutedDebtorAccountOrIdentification.getCodeName().get(), PaymentExecutedDebtorAccountOrIdentification);
		codesByName.put(PaymentExecutedDebtorNameOrAddress.getCodeName().get(), PaymentExecutedDebtorNameOrAddress);
		codesByName.put(PendingExecutionCreditorAccountOrIdentification.getCodeName().get(), PendingExecutionCreditorAccountOrIdentification);
		codesByName.put(PendingExecutionCreditorNameOrAddress.getCodeName().get(), PendingExecutionCreditorNameOrAddress);
		codesByName.put(PaymentExecutedCreditorAccountOrIdentification.getCodeName().get(), PaymentExecutedCreditorAccountOrIdentification);
		codesByName.put(PaymentExecutedCreditorNameOrAddress.getCodeName().get(), PaymentExecutedCreditorNameOrAddress);
		codesByName.put(IncorrectReportEntryAmount.getCodeName().get(), IncorrectReportEntryAmount);
		codesByName.put(InsufficientChargesDetails.getCodeName().get(), InsufficientChargesDetails);
		codesByName.put(InsufficientPaymentPurpose.getCodeName().get(), InsufficientPaymentPurpose);
		codesByName.put(IncorrectSettlementAccount.getCodeName().get(), IncorrectSettlementAccount);
		codesByName.put(IncorrectInstructingReimbursementAgent.getCodeName().get(), IncorrectInstructingReimbursementAgent);
		codesByName.put(IncorrectDebtorAddress.getCodeName().get(), IncorrectDebtorAddress);
		codesByName.put(IncorrectCreditorAddress.getCodeName().get(), IncorrectCreditorAddress);
	}

	public static UnableToApplyIncorrectInformation3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyIncorrectInformation3Code[] values() {
		UnableToApplyIncorrectInformation3Code[] values = new UnableToApplyIncorrectInformation3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyIncorrectInformation3Code> {
		@Override
		public UnableToApplyIncorrectInformation3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyIncorrectInformation3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}