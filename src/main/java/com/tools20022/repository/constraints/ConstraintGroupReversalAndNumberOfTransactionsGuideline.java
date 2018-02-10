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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV05;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV06;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV07;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If GroupHeader/GroupReversal is false and
 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false,
 * then NumberOfTransactions must equal the number of occurrences of
 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
 */
public class ConstraintGroupReversalAndNumberOfTransactionsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
	 * CustomerPaymentReversalV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV07
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
	 * forCustomerPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV05
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
	 * forCustomerPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV06> forCustomerPaymentReversalV06 = new MMConstraint<CustomerPaymentReversalV06>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkCustomerPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV05;
			owner_lazy = () -> CustomerPaymentReversalV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV06
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
	 * forCustomerPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV07> forCustomerPaymentReversalV07 = new MMConstraint<CustomerPaymentReversalV07>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkCustomerPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV06;
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05
	 * CustomerPaymentReversalV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV06
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
	 * forCustomerPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forCustomerPaymentReversalV04
	 * ConstraintGroupReversalAndNumberOfTransactionsRule.
	 * forCustomerPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV05> forCustomerPaymentReversalV05 = new MMConstraint<CustomerPaymentReversalV05>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkCustomerPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupHeader/GroupReversal is false and OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is false, then NumberOfTransactions must equal the number of occurrences of OriginalPaymentInformationAndReversal[*]/TransactionInformation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forCustomerPaymentReversalV04;
			owner_lazy = () -> CustomerPaymentReversalV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8 GroupHeader8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader8> forGroupHeader8 = new MMConstraint<GroupHeader8>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40 GroupHeader40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader40> forGroupHeader40 = new MMConstraint<GroupHeader40>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56 GroupHeader56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader56> forGroupHeader56 = new MMConstraint<GroupHeader56>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9 GroupHeader9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader9> forGroupHeader9 = new MMConstraint<GroupHeader9>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41 GroupHeader41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader41> forGroupHeader41 = new MMConstraint<GroupHeader41>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57 GroupHeader57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forGroupHeader71
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader71}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader57> forGroupHeader57 = new MMConstraint<GroupHeader57>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader71);
			owner_lazy = () -> GroupHeader57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22 GroupHeader22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader22> forGroupHeader22 = new MMConstraint<GroupHeader22>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader28> forGroupHeader28 = new MMConstraint<GroupHeader28>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18 GroupHeader18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nIf GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader18> forGroupHeader18 = new MMConstraint<GroupHeader18>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "ISO20022 Rule:\nIf GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30 GroupHeader30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule:\nIf GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader30> forGroupHeader30 = new MMConstraint<GroupHeader30>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "ISO20022 Rule:\nIf GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			owner_lazy = () -> GroupHeader30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71 GroupHeader71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversalAndNumberOfTransactionsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forGroupHeader57
	 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader57}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader71> forGroupHeader71 = new MMConstraint<GroupHeader71>() {
		{
			validator = ConstraintGroupReversalAndNumberOfTransactionsGuideline::checkGroupHeader71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversalAndNumberOfTransactionsGuideline";
			definition = "If GroupReversal is true, then NumberOfTransactions equals the number of transactions in the original message.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader57;
			owner_lazy = () -> GroupHeader71.mmObject();
		}
	};

	/**
	 * If GroupHeader/GroupReversal is false and
	 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is
	 * false, then NumberOfTransactions must equal the number of occurrences of
	 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV06(CustomerPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false and
	 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is
	 * false, then NumberOfTransactions must equal the number of occurrences of
	 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/GroupReversal is false and
	 * OriginalPaymentInformationAndReversal[*]/PaymentInformationReversal is
	 * false, then NumberOfTransactions must equal the number of occurrences of
	 * OriginalPaymentInformationAndReversal[*]/TransactionInformation.
	 */
	public static void checkCustomerPaymentReversalV05(CustomerPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader8(GroupHeader8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader40(GroupHeader40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader56(GroupHeader56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader9(GroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader41(GroupHeader41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader57(GroupHeader57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader22(GroupHeader22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader28(GroupHeader28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If GroupReversal is true, then NumberOfTransactions equals
	 * the number of transactions in the original message.
	 */
	public static void checkGroupHeader18(GroupHeader18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: If GroupReversal is true, then NumberOfTransactions equals
	 * the number of transactions in the original message.
	 */
	public static void checkGroupHeader30(GroupHeader30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupReversal is true, then NumberOfTransactions equals the number of
	 * transactions in the original message.
	 */
	public static void checkGroupHeader71(GroupHeader71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}